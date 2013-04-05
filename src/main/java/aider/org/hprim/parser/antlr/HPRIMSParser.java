// $ANTLR 3.4 C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g 2013-04-06 01:30:18

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:205:1: hprim : ( hprim_oru_2_2 | hprim_oru_2_1 | hprim_oru_2_0 );
    public final void hprim() throws RecognitionException {
        startDocument();
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:207:23: ( hprim_oru_2_2 | hprim_oru_2_1 | hprim_oru_2_0 )
            int alt1=3;
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:211:1: hprim_oru_2_2 : line_h2_2_oru ( body_p_oru )+ line_l ( CR )? EOF ;
    public final void hprim_oru_2_2() throws RecognitionException {
        startElement("HPRIM.ORU.2.2");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:213:22: ( line_h2_2_oru ( body_p_oru )+ line_l ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:214:3: line_h2_2_oru ( body_p_oru )+ line_l ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_2_oru_in_hprim_oru_2_294);
            line_h2_2_oru();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:215:3: ( body_p_oru )+
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:215:3: body_p_oru
            	    {
            	    pushFollow(FOLLOW_body_p_oru_in_hprim_oru_2_298);
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


            pushFollow(FOLLOW_line_l_in_hprim_oru_2_2103);
            line_l();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:217:3: ( CR )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CR) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:217:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_oru_2_2107); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_oru_2_2112); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:220:1: hprim_oru_2_1 : line_h2_1_oru ( body_p_oru )+ line_l ( CR )? EOF ;
    public final void hprim_oru_2_1() throws RecognitionException {
        startElement("HPRIM.ORU.2.1");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:222:22: ( line_h2_1_oru ( body_p_oru )+ line_l ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:223:3: line_h2_1_oru ( body_p_oru )+ line_l ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_1_oru_in_hprim_oru_2_1129);
            line_h2_1_oru();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:224:3: ( body_p_oru )+
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:224:3: body_p_oru
            	    {
            	    pushFollow(FOLLOW_body_p_oru_in_hprim_oru_2_1133);
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


            pushFollow(FOLLOW_line_l_in_hprim_oru_2_1138);
            line_l();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:226:3: ( CR )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CR) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:226:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_oru_2_1142); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_oru_2_1147); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:229:1: hprim_oru_2_0 : line_h2_0_oru ( body_p_oru )+ line_l ( CR )? EOF ;
    public final void hprim_oru_2_0() throws RecognitionException {
        startElement("HPRIM.ORU.2.0");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:231:22: ( line_h2_0_oru ( body_p_oru )+ line_l ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:232:3: line_h2_0_oru ( body_p_oru )+ line_l ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_0_oru_in_hprim_oru_2_0164);
            line_h2_0_oru();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:233:3: ( body_p_oru )+
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:233:3: body_p_oru
            	    {
            	    pushFollow(FOLLOW_body_p_oru_in_hprim_oru_2_0168);
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


            pushFollow(FOLLOW_line_l_in_hprim_oru_2_0173);
            line_l();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:235:3: ( CR )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CR) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:235:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_oru_2_0177); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_oru_2_0182); 

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



    // $ANTLR start "hprim_orm_2_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:239:1: hprim_orm_2_2 : line_h2_2_orm ( body_p_orm )+ line_l ( CR )? EOF ;
    public final void hprim_orm_2_2() throws RecognitionException {
        startElement("HPRIM.ORM.2.2");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:241:22: ( line_h2_2_orm ( body_p_orm )+ line_l ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:242:3: line_h2_2_orm ( body_p_orm )+ line_l ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_2_orm_in_hprim_orm_2_2200);
            line_h2_2_orm();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:243:3: ( body_p_orm )+
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:243:3: body_p_orm
            	    {
            	    pushFollow(FOLLOW_body_p_orm_in_hprim_orm_2_2204);
            	    body_p_orm();

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


            pushFollow(FOLLOW_line_l_in_hprim_orm_2_2209);
            line_l();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:245:3: ( CR )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==CR) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:245:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_orm_2_2213); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_orm_2_2218); 

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
    // $ANTLR end "hprim_orm_2_2"



    // $ANTLR start "hprim_orm_2_1"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:248:1: hprim_orm_2_1 : line_h2_1_orm ( body_p_orm )+ line_l ( CR )? EOF ;
    public final void hprim_orm_2_1() throws RecognitionException {
        startElement("HPRIM.ORM.2.1");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:250:22: ( line_h2_1_orm ( body_p_orm )+ line_l ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:251:3: line_h2_1_orm ( body_p_orm )+ line_l ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_1_orm_in_hprim_orm_2_1235);
            line_h2_1_orm();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:252:3: ( body_p_orm )+
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:252:3: body_p_orm
            	    {
            	    pushFollow(FOLLOW_body_p_orm_in_hprim_orm_2_1239);
            	    body_p_orm();

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


            pushFollow(FOLLOW_line_l_in_hprim_orm_2_1244);
            line_l();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:254:3: ( CR )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==CR) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:254:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_orm_2_1248); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_orm_2_1253); 

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
    // $ANTLR end "hprim_orm_2_1"



    // $ANTLR start "hprim_orm_2_0"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:257:1: hprim_orm_2_0 : line_h2_0_orm ( body_p_orm )+ line_l ( CR )? EOF ;
    public final void hprim_orm_2_0() throws RecognitionException {
        startElement("HPRIM.ORM.2.0");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:259:22: ( line_h2_0_orm ( body_p_orm )+ line_l ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:260:3: line_h2_0_orm ( body_p_orm )+ line_l ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_0_orm_in_hprim_orm_2_0270);
            line_h2_0_orm();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:261:3: ( body_p_orm )+
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:261:3: body_p_orm
            	    {
            	    pushFollow(FOLLOW_body_p_orm_in_hprim_orm_2_0274);
            	    body_p_orm();

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


            pushFollow(FOLLOW_line_l_in_hprim_orm_2_0279);
            line_l();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:263:3: ( CR )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==CR) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:263:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_orm_2_0283); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_orm_2_0288); 

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
    // $ANTLR end "hprim_orm_2_0"



    // $ANTLR start "body_p_orm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:267:1: body_p_orm : line_p ( line_c )* ( body_obr_orm )+ ;
    public final void body_p_orm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:267:12: ( line_p ( line_c )* ( body_obr_orm )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:268:3: line_p ( line_c )* ( body_obr_orm )+
            {
            pushFollow(FOLLOW_line_p_in_body_p_orm299);
            line_p();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:268:10: ( line_c )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==CR) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==CHARC) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:268:11: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_orm302);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:269:3: ( body_obr_orm )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==CR) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==CHARO) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:269:3: body_obr_orm
            	    {
            	    pushFollow(FOLLOW_body_obr_orm_in_body_p_orm308);
            	    body_obr_orm();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // $ANTLR end "body_p_orm"



    // $ANTLR start "body_obr_orm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:271:1: body_obr_orm : line_obr ( line_c )* ( body_obx_oru )* ;
    public final void body_obr_orm() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:271:14: ( line_obr ( line_c )* ( body_obx_oru )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:272:4: line_obr ( line_c )* ( body_obx_oru )*
            {
            pushFollow(FOLLOW_line_obr_in_body_obr_orm320);
            line_obr();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:272:13: ( line_c )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==CR) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==CHARC) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:272:14: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_obr_orm323);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:273:4: ( body_obx_oru )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==CR) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==CHARO) ) {
                        int LA17_3 = input.LA(3);

                        if ( (LA17_3==CHARB) ) {
                            int LA17_4 = input.LA(4);

                            if ( (LA17_4==CHARX) ) {
                                alt17=1;
                            }


                        }


                    }


                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:273:4: body_obx_oru
            	    {
            	    pushFollow(FOLLOW_body_obx_oru_in_body_obr_orm330);
            	    body_obx_oru();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "body_obr_orm"



    // $ANTLR start "body_p_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:276:1: body_p_oru : line_p ( line_c )* ( body_obr_oru )+ ;
    public final void body_p_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:276:12: ( line_p ( line_c )* ( body_obr_oru )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:277:3: line_p ( line_c )* ( body_obr_oru )+
            {
            pushFollow(FOLLOW_line_p_in_body_p_oru342);
            line_p();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:277:10: ( line_c )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==CR) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==CHARC) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:277:11: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_p_oru345);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:278:3: ( body_obr_oru )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==CR) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==CHARO) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:278:3: body_obr_oru
            	    {
            	    pushFollow(FOLLOW_body_obr_oru_in_body_p_oru351);
            	    body_obr_oru();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // $ANTLR end "body_p_oru"



    // $ANTLR start "body_obr_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:280:1: body_obr_oru : line_obr ( line_c )* ( body_obx_oru )+ ;
    public final void body_obr_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:280:14: ( line_obr ( line_c )* ( body_obx_oru )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:281:4: line_obr ( line_c )* ( body_obx_oru )+
            {
            pushFollow(FOLLOW_line_obr_in_body_obr_oru363);
            line_obr();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:281:13: ( line_c )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:281:14: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_obr_oru366);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:282:4: ( body_obx_oru )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==CR) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==CHARO) ) {
                        int LA21_3 = input.LA(3);

                        if ( (LA21_3==CHARB) ) {
                            int LA21_4 = input.LA(4);

                            if ( (LA21_4==CHARX) ) {
                                alt21=1;
                            }


                        }


                    }


                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:282:4: body_obx_oru
            	    {
            	    pushFollow(FOLLOW_body_obx_oru_in_body_obr_oru373);
            	    body_obx_oru();

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

        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:284:1: body_obx_oru : line_obx ( line_c )* ;
    public final void body_obx_oru() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:284:14: ( line_obx ( line_c )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:285:4: line_obx ( line_c )*
            {
            pushFollow(FOLLOW_line_obx_in_body_obx_oru385);
            line_obx();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:285:13: ( line_c )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:285:14: line_c
            	    {
            	    pushFollow(FOLLOW_line_c_in_body_obx_oru388);
            	    line_c();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "body_obx_oru"



    // $ANTLR start "start_line_h"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:290:1: start_line_h : delimiters DELIMITER1 st_sized_optionnal[\"H.3\", 12] DELIMITER1 st_sized_optionnal[\"H.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H.6\", 100] ;
    public final void start_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:290:14: ( delimiters DELIMITER1 st_sized_optionnal[\"H.3\", 12] DELIMITER1 st_sized_optionnal[\"H.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H.6\", 100] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:291:3: delimiters DELIMITER1 st_sized_optionnal[\"H.3\", 12] DELIMITER1 st_sized_optionnal[\"H.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H.6\", 100]
            {
            pushFollow(FOLLOW_delimiters_in_start_line_h403);
            delimiters();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h407); 

            pushFollow(FOLLOW_st_sized_optionnal_in_start_line_h409);
            st_sized_optionnal("H.3", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h414); 

            pushFollow(FOLLOW_st_sized_optionnal_in_start_line_h416);
            st_sized_optionnal("H.4", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h421); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_start_line_h423);
            spec_sized_mult_lvl1_st_mandatory_2("H.5", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h428); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_start_line_h430);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:298:1: midd_line_h : DELIMITER1 spec_sized_tn[\"H.8\", 40] DELIMITER1 st_sized_optionnal[\"H.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.10\", 40] DELIMITER1 st_sized_optionnal[\"H.11\", 80] DELIMITER1 spec_const_7_12[\"H.12\"] ;
    public final void midd_line_h() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:298:13: ( DELIMITER1 spec_sized_tn[\"H.8\", 40] DELIMITER1 st_sized_optionnal[\"H.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.10\", 40] DELIMITER1 st_sized_optionnal[\"H.11\", 80] DELIMITER1 spec_const_7_12[\"H.12\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:299:3: DELIMITER1 spec_sized_tn[\"H.8\", 40] DELIMITER1 st_sized_optionnal[\"H.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H.10\", 40] DELIMITER1 st_sized_optionnal[\"H.11\", 80] DELIMITER1 spec_const_7_12[\"H.12\"]
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h442); 

            pushFollow(FOLLOW_spec_sized_tn_in_midd_line_h444);
            spec_sized_tn("H.8", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h449); 

            pushFollow(FOLLOW_st_sized_optionnal_in_midd_line_h451);
            st_sized_optionnal("H.9", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h456); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_midd_line_h458);
            spec_sized_mult_lvl1_st_mandatory_2("H.10", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h463); 

            pushFollow(FOLLOW_st_sized_optionnal_in_midd_line_h465);
            st_sized_optionnal("H.11", 80);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_midd_line_h470); 

            pushFollow(FOLLOW_spec_const_7_12_in_midd_line_h472);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:307:1: line_h2_2_oru : start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_2_oru() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:309:22: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:310:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_2_oru492);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_oru496); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ORU_in_line_h2_2_oru498);
            spec_const_7_7_contexte_ORU("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_2_oru503);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_oru507); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2_oru509);
            spec_const_7_13_version_2_2("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_oru514); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_2_oru516);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:315:3: ( DELIMITER1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==DELIMITER1) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:315:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_oru521); 

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
    // $ANTLR end "line_h2_2_oru"



    // $ANTLR start "line_h2_1_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:319:1: line_h2_1_oru : start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_1_oru() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:321:22: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:322:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_1_oru541);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_oru545); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ORU_in_line_h2_1_oru547);
            spec_const_7_7_contexte_ORU("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_1_oru552);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_oru556); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1_oru558);
            spec_const_7_13_version_2_1("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_oru563); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_1_oru565);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:327:3: ( DELIMITER1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==DELIMITER1) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:327:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_oru570); 

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
    // $ANTLR end "line_h2_1_oru"



    // $ANTLR start "line_h2_0_oru"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:330:1: line_h2_0_oru : start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_0_oru() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:332:22: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:333:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ORU[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_0_oru589);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_oru593); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ORU_in_line_h2_0_oru595);
            spec_const_7_7_contexte_ORU("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_0_oru600);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_oru604); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_0_in_line_h2_0_oru606);
            spec_const_7_13_version_2_0("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_oru611); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_0_oru613);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:338:3: ( DELIMITER1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==DELIMITER1) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:338:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_oru618); 

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
    // $ANTLR end "line_h2_0_oru"



    // $ANTLR start "line_h2_2_orm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:341:1: line_h2_2_orm : start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_2_orm() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:343:22: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:344:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_2[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_2_orm637);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_orm641); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ORM_in_line_h2_2_orm643);
            spec_const_7_7_contexte_ORM("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_2_orm648);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_orm652); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2_orm654);
            spec_const_7_13_version_2_2("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_orm659); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_2_orm661);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:349:3: ( DELIMITER1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==DELIMITER1) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:349:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2_orm666); 

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
    // $ANTLR end "line_h2_2_orm"



    // $ANTLR start "line_h2_1_orm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:351:1: line_h2_1_orm : start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_1_orm() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:353:22: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:354:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_1[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_1_orm684);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_orm688); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ORM_in_line_h2_1_orm690);
            spec_const_7_7_contexte_ORM("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_1_orm695);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_orm699); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1_orm701);
            spec_const_7_13_version_2_1("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_orm706); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_1_orm708);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:359:3: ( DELIMITER1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==DELIMITER1) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:359:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1_orm713); 

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
    // $ANTLR end "line_h2_1_orm"



    // $ANTLR start "line_h2_0_orm"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:361:1: line_h2_0_orm : start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_0_orm() throws RecognitionException {
        startElement("H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:363:22: ( start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:364:3: start_line_h DELIMITER1 spec_const_7_7_contexte_ORM[\"H.7\"] midd_line_h DELIMITER1 spec_const_7_13_version_2_0[\"H.13\"] DELIMITER1 ts_sized_mandatory[\"H.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_start_line_h_in_line_h2_0_orm731);
            start_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_orm735); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_ORM_in_line_h2_0_orm737);
            spec_const_7_7_contexte_ORM("H.7");

            state._fsp--;


            pushFollow(FOLLOW_midd_line_h_in_line_h2_0_orm742);
            midd_line_h();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_orm746); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_0_in_line_h2_0_orm748);
            spec_const_7_13_version_2_0("H.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_orm753); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_0_orm755);
            ts_sized_mandatory("H.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:369:3: ( DELIMITER1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==DELIMITER1) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:369:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_0_orm760); 

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
    // $ANTLR end "line_h2_0_orm"



    // $ANTLR start "line_ap"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:372:1: line_ap : CR CHARA CHARP DELIMITER1 nm_integer_sized_mandatory[\"AP.2\", 4] DELIMITER1 st_sized_mandatory[\"AP.3\", 2] DELIMITER1 ts_sized_optionnal[\"AP.4\", 8] DELIMITER1 ts_sized_optionnal[\"AP.5\", 8] DELIMITER1 nm_integer_sized_mandatory[\"AP.6\", 15] DELIMITER1 st_sized_mandatory[\"AP.7\", 3] DELIMITER1 nm_integer_sized_mandatory[\"AP.8\", 2] DELIMITER1 nm_integer_sized_mandatory[\"AP.9\", 2] DELIMITER1 nm_integer_sized_mandatory[\"AP.10\", 3] DELIMITER1 nm_integer_sized_mandatory[\"AP.11\", 4] DELIMITER1 nm_integer_sized_mandatory[\"AP.11\", 4] DELIMITER1 st_sized_mandatory[\"AP.12\", 1] DELIMITER1 st_sized_mandatory[\"AP.13\", 2] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_6[\"AP.14\", 48] DELIMITER1 st_sized_optionnal[\"AP.15\", 24] DELIMITER1 nm_integer_sized_mandatory[\"AP.16\", 6] ( DELIMITER1 nm_sized_optionnal[\"AP.17\", 9] ( DELIMITER1 spec_on_optionnal[\"AP.18\"] ( DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )? )? )? )? ;
    public final void line_ap() throws RecognitionException {
        startElement("AP");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:374:22: ( CR CHARA CHARP DELIMITER1 nm_integer_sized_mandatory[\"AP.2\", 4] DELIMITER1 st_sized_mandatory[\"AP.3\", 2] DELIMITER1 ts_sized_optionnal[\"AP.4\", 8] DELIMITER1 ts_sized_optionnal[\"AP.5\", 8] DELIMITER1 nm_integer_sized_mandatory[\"AP.6\", 15] DELIMITER1 st_sized_mandatory[\"AP.7\", 3] DELIMITER1 nm_integer_sized_mandatory[\"AP.8\", 2] DELIMITER1 nm_integer_sized_mandatory[\"AP.9\", 2] DELIMITER1 nm_integer_sized_mandatory[\"AP.10\", 3] DELIMITER1 nm_integer_sized_mandatory[\"AP.11\", 4] DELIMITER1 nm_integer_sized_mandatory[\"AP.11\", 4] DELIMITER1 st_sized_mandatory[\"AP.12\", 1] DELIMITER1 st_sized_mandatory[\"AP.13\", 2] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_6[\"AP.14\", 48] DELIMITER1 st_sized_optionnal[\"AP.15\", 24] DELIMITER1 nm_integer_sized_mandatory[\"AP.16\", 6] ( DELIMITER1 nm_sized_optionnal[\"AP.17\", 9] ( DELIMITER1 spec_on_optionnal[\"AP.18\"] ( DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:375:3: CR CHARA CHARP DELIMITER1 nm_integer_sized_mandatory[\"AP.2\", 4] DELIMITER1 st_sized_mandatory[\"AP.3\", 2] DELIMITER1 ts_sized_optionnal[\"AP.4\", 8] DELIMITER1 ts_sized_optionnal[\"AP.5\", 8] DELIMITER1 nm_integer_sized_mandatory[\"AP.6\", 15] DELIMITER1 st_sized_mandatory[\"AP.7\", 3] DELIMITER1 nm_integer_sized_mandatory[\"AP.8\", 2] DELIMITER1 nm_integer_sized_mandatory[\"AP.9\", 2] DELIMITER1 nm_integer_sized_mandatory[\"AP.10\", 3] DELIMITER1 nm_integer_sized_mandatory[\"AP.11\", 4] DELIMITER1 nm_integer_sized_mandatory[\"AP.11\", 4] DELIMITER1 st_sized_mandatory[\"AP.12\", 1] DELIMITER1 st_sized_mandatory[\"AP.13\", 2] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_6[\"AP.14\", 48] DELIMITER1 st_sized_optionnal[\"AP.15\", 24] DELIMITER1 nm_integer_sized_mandatory[\"AP.16\", 6] ( DELIMITER1 nm_sized_optionnal[\"AP.17\", 9] ( DELIMITER1 spec_on_optionnal[\"AP.18\"] ( DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_ap779); 

            match(input,CHARA,FOLLOW_CHARA_in_line_ap781); 

            match(input,CHARP,FOLLOW_CHARP_in_line_ap783); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap787); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_ap789);
            nm_integer_sized_mandatory("AP.2", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap794); 

            pushFollow(FOLLOW_st_sized_mandatory_in_line_ap796);
            st_sized_mandatory("AP.3", 2);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap801); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_ap803);
            ts_sized_optionnal("AP.4", 8);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap808); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_ap810);
            ts_sized_optionnal("AP.5", 8);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap815); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_ap817);
            nm_integer_sized_mandatory("AP.6", 15);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap822); 

            pushFollow(FOLLOW_st_sized_mandatory_in_line_ap824);
            st_sized_mandatory("AP.7", 3);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap829); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_ap831);
            nm_integer_sized_mandatory("AP.8", 2);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap836); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_ap838);
            nm_integer_sized_mandatory("AP.9", 2);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap843); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_ap845);
            nm_integer_sized_mandatory("AP.10", 3);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap850); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_ap852);
            nm_integer_sized_mandatory("AP.11", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap857); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_ap859);
            nm_integer_sized_mandatory("AP.11", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap864); 

            pushFollow(FOLLOW_st_sized_mandatory_in_line_ap866);
            st_sized_mandatory("AP.12", 1);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap871); 

            pushFollow(FOLLOW_st_sized_mandatory_in_line_ap873);
            st_sized_mandatory("AP.13", 2);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap878); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_6_in_line_ap880);
            spec_sized_mult_lvl1_st_mandatory_6("AP.14", 48);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap885); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_ap887);
            st_sized_optionnal("AP.15", 24);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap892); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_ap894);
            nm_integer_sized_mandatory("AP.16", 6);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:392:3: ( DELIMITER1 nm_sized_optionnal[\"AP.17\", 9] ( DELIMITER1 spec_on_optionnal[\"AP.18\"] ( DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )? )? )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==DELIMITER1) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:392:4: DELIMITER1 nm_sized_optionnal[\"AP.17\", 9] ( DELIMITER1 spec_on_optionnal[\"AP.18\"] ( DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap900); 

                    pushFollow(FOLLOW_nm_sized_optionnal_in_line_ap902);
                    nm_sized_optionnal("AP.17", 9);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:393:4: ( DELIMITER1 spec_on_optionnal[\"AP.18\"] ( DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )? )? )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==DELIMITER1) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:393:5: DELIMITER1 spec_on_optionnal[\"AP.18\"] ( DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap909); 

                            pushFollow(FOLLOW_spec_on_optionnal_in_line_ap911);
                            spec_on_optionnal("AP.18");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:394:5: ( DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )? )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==DELIMITER1) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:394:6: DELIMITER1 ts_sized_optionnal[\"AP.19\", 8] ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap919); 

                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_ap921);
                                    ts_sized_optionnal("AP.19", 8);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:395:6: ( DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )? )?
                                    int alt33=2;
                                    int LA33_0 = input.LA(1);

                                    if ( (LA33_0==DELIMITER1) ) {
                                        alt33=1;
                                    }
                                    switch (alt33) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:395:7: DELIMITER1 ts_sized_optionnal[\"AP.20\", 8] ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap930); 

                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_ap932);
                                            ts_sized_optionnal("AP.20", 8);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:396:7: ( DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )? )?
                                            int alt32=2;
                                            int LA32_0 = input.LA(1);

                                            if ( (LA32_0==DELIMITER1) ) {
                                                alt32=1;
                                            }
                                            switch (alt32) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:396:8: DELIMITER1 st_sized_optionnal[\"AP.21\", 30] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap942); 

                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_ap944);
                                                    st_sized_optionnal("AP.21", 30);

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:397:8: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )? )?
                                                    int alt31=2;
                                                    int LA31_0 = input.LA(1);

                                                    if ( (LA31_0==DELIMITER1) ) {
                                                        alt31=1;
                                                    }
                                                    switch (alt31) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:397:9: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"AP.22\", 200] ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap955); 

                                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_ap957);
                                                            spec_sized_mult_lvl1_st_optionnal_6("AP.22", 200);

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:398:9: ( DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )? )?
                                                            int alt30=2;
                                                            int LA30_0 = input.LA(1);

                                                            if ( (LA30_0==DELIMITER1) ) {
                                                                alt30=1;
                                                            }
                                                            switch (alt30) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:398:10: DELIMITER1 ts_sized_optionnal[\"AP.23\", 15] ( DELIMITER1 )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap969); 

                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_ap971);
                                                                    ts_sized_optionnal("AP.23", 15);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:399:10: ( DELIMITER1 )?
                                                                    int alt29=2;
                                                                    int LA29_0 = input.LA(1);

                                                                    if ( (LA29_0==DELIMITER1) ) {
                                                                        alt29=1;
                                                                    }
                                                                    switch (alt29) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:399:10: DELIMITER1
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_ap983); 

                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // $ANTLR end "line_ap"



    // $ANTLR start "line_p"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:402:1: line_p : CR CHARP DELIMITER1 nm_integer_sized_mandatory[\"P.2\", 4] DELIMITER1 spec_sized_8_3[\"P.3\", 36] DELIMITER1 st_sized_optionnal[\"P.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_p() throws RecognitionException {
        startElement("P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:404:22: ( CR CHARP DELIMITER1 nm_integer_sized_mandatory[\"P.2\", 4] DELIMITER1 spec_sized_8_3[\"P.3\", 36] DELIMITER1 st_sized_optionnal[\"P.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:405:3: CR CHARP DELIMITER1 nm_integer_sized_mandatory[\"P.2\", 4] DELIMITER1 spec_sized_8_3[\"P.3\", 36] DELIMITER1 st_sized_optionnal[\"P.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_p1016); 

            match(input,CHARP,FOLLOW_CHARP_in_line_p1018); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1022); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_p1024);
            nm_integer_sized_mandatory("P.2", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1029); 

            pushFollow(FOLLOW_spec_sized_8_3_in_line_p1031);
            spec_sized_8_3("P.3", 36);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1036); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_p1038);
            st_sized_optionnal("P.4", 16);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:409:3: ( DELIMITER1 st_sized_optionnal[\"P.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==DELIMITER1) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:409:4: DELIMITER1 st_sized_optionnal[\"P.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1044); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p1046);
                    st_sized_optionnal("P.5", 16);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:410:4: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==DELIMITER1) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:410:5: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1053); 

                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p1055);
                            spec_sized_mult_lvl1_st_optionnal_6("P.6", 48);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:411:5: ( DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt69=2;
                            int LA69_0 = input.LA(1);

                            if ( (LA69_0==DELIMITER1) ) {
                                alt69=1;
                            }
                            switch (alt69) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:411:6: DELIMITER1 st_sized_optionnal[\"P.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1063); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p1065);
                                    st_sized_optionnal("P.7", 24);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:412:6: ( DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt68=2;
                                    int LA68_0 = input.LA(1);

                                    if ( (LA68_0==DELIMITER1) ) {
                                        alt68=1;
                                    }
                                    switch (alt68) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:412:7: DELIMITER1 ts_sized_optionnal[\"P.8\", 26] ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1074); 

                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p1076);
                                            ts_sized_optionnal("P.8", 26);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:413:7: ( DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt67=2;
                                            int LA67_0 = input.LA(1);

                                            if ( (LA67_0==DELIMITER1) ) {
                                                alt67=1;
                                            }
                                            switch (alt67) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:413:8: DELIMITER1 spec_const_sexe[\"P.9\"] ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1086); 

                                                    pushFollow(FOLLOW_spec_const_sexe_in_line_p1088);
                                                    spec_const_sexe("P.9");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:414:8: ( DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt66=2;
                                                    int LA66_0 = input.LA(1);

                                                    if ( (LA66_0==DELIMITER1) ) {
                                                        alt66=1;
                                                    }
                                                    switch (alt66) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:414:9: DELIMITER1 spec_const_race[\"P.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1099); 

                                                            pushFollow(FOLLOW_spec_const_race_in_line_p1101);
                                                            spec_const_race("P.10");

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:415:9: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt65=2;
                                                            int LA65_0 = input.LA(1);

                                                            if ( (LA65_0==DELIMITER1) ) {
                                                                alt65=1;
                                                            }
                                                            switch (alt65) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:415:10: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1113); 

                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p1115);
                                                                    spec_sized_mult_lvl1_st_optionnal_6("P.11", 200);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:416:10: ( DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt64=2;
                                                                    int LA64_0 = input.LA(1);

                                                                    if ( (LA64_0==DELIMITER1) ) {
                                                                        alt64=1;
                                                                    }
                                                                    switch (alt64) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:416:11: DELIMITER1 st_sized_optionnal[\"P.12\", 120] ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1128); 

                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p1130);
                                                                            st_sized_optionnal("P.12", 120);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:417:11: ( DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt63=2;
                                                                            int LA63_0 = input.LA(1);

                                                                            if ( (LA63_0==DELIMITER1) ) {
                                                                                alt63=1;
                                                                            }
                                                                            switch (alt63) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:417:12: DELIMITER1 spec_sized_tn[\"P.13\", 40] ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1144); 

                                                                                    pushFollow(FOLLOW_spec_sized_tn_in_line_p1146);
                                                                                    spec_sized_tn("P.13", 40);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:12: ( DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt62=2;
                                                                                    int LA62_0 = input.LA(1);

                                                                                    if ( (LA62_0==DELIMITER1) ) {
                                                                                        alt62=1;
                                                                                    }
                                                                                    switch (alt62) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:13: DELIMITER1 spec_sized_cna[\"P.14\", 60] ( REPETITEUR spec_sized_cna[\"P.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1185); 

                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_p1187);
                                                                                            spec_sized_cna("P.14", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:51: ( REPETITEUR spec_sized_cna[\"P.14\", 60] )*
                                                                                            loop37:
                                                                                            do {
                                                                                                int alt37=2;
                                                                                                int LA37_0 = input.LA(1);

                                                                                                if ( (LA37_0==REPETITEUR) ) {
                                                                                                    alt37=1;
                                                                                                }


                                                                                                switch (alt37) {
                                                                                            	case 1 :
                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:52: REPETITEUR spec_sized_cna[\"P.14\", 60]
                                                                                            	    {
                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p1191); 

                                                                                            	    pushFollow(FOLLOW_spec_sized_cna_in_line_p1193);
                                                                                            	    spec_sized_cna("P.14", 60);

                                                                                            	    state._fsp--;


                                                                                            	    }
                                                                                            	    break;

                                                                                            	default :
                                                                                            	    break loop37;
                                                                                                }
                                                                                            } while (true);


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:421:13: ( DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt61=2;
                                                                                            int LA61_0 = input.LA(1);

                                                                                            if ( (LA61_0==DELIMITER1) ) {
                                                                                                alt61=1;
                                                                                            }
                                                                                            switch (alt61) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:421:14: DELIMITER1 st_sized_optionnal[\"P.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1211); 

                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p1213);
                                                                                                    st_sized_optionnal("P.15", 60);

                                                                                                    state._fsp--;


                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:422:14: ( DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt60=2;
                                                                                                    int LA60_0 = input.LA(1);

                                                                                                    if ( (LA60_0==DELIMITER1) ) {
                                                                                                        alt60=1;
                                                                                                    }
                                                                                                    switch (alt60) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:422:15: DELIMITER1 st_sized_optionnal[\"P.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1230); 

                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p1232);
                                                                                                            st_sized_optionnal("P.16", 60);

                                                                                                            state._fsp--;


                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:424:15: ( DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt59=2;
                                                                                                            int LA59_0 = input.LA(1);

                                                                                                            if ( (LA59_0==DELIMITER1) ) {
                                                                                                                alt59=1;
                                                                                                            }
                                                                                                            switch (alt59) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:424:16: DELIMITER1 nm_sized_optionnal[\"P.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1265); 

                                                                                                                    pushFollow(FOLLOW_nm_sized_optionnal_in_line_p1267);
                                                                                                                    nm_sized_optionnal("P.17", 10);

                                                                                                                    state._fsp--;


                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:426:16: ( DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt58=2;
                                                                                                                    int LA58_0 = input.LA(1);

                                                                                                                    if ( (LA58_0==DELIMITER1) ) {
                                                                                                                        alt58=1;
                                                                                                                    }
                                                                                                                    switch (alt58) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:426:17: DELIMITER1 nm_sized_optionnal[\"P.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1302); 

                                                                                                                            pushFollow(FOLLOW_nm_sized_optionnal_in_line_p1304);
                                                                                                                            nm_sized_optionnal("P.18", 10);

                                                                                                                            state._fsp--;


                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:427:17: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt57=2;
                                                                                                                            int LA57_0 = input.LA(1);

                                                                                                                            if ( (LA57_0==DELIMITER1) ) {
                                                                                                                                alt57=1;
                                                                                                                            }
                                                                                                                            switch (alt57) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:427:18: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1324); 

                                                                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p1326);
                                                                                                                                    spec_sized_mult_lvl1_st_optionnal_6("P.19", 200);

                                                                                                                                    state._fsp--;


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:427:78: ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200] )*
                                                                                                                                    loop38:
                                                                                                                                    do {
                                                                                                                                        int alt38=2;
                                                                                                                                        int LA38_0 = input.LA(1);

                                                                                                                                        if ( (LA38_0==REPETITEUR) ) {
                                                                                                                                            alt38=1;
                                                                                                                                        }


                                                                                                                                        switch (alt38) {
                                                                                                                                    	case 1 :
                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:427:79: REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P.19\", 200]
                                                                                                                                    	    {
                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p1330); 

                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p1332);
                                                                                                                                    	    spec_sized_mult_lvl1_st_optionnal_6("P.19", 200);

                                                                                                                                    	    state._fsp--;


                                                                                                                                    	    }
                                                                                                                                    	    break;

                                                                                                                                    	default :
                                                                                                                                    	    break loop38;
                                                                                                                                        }
                                                                                                                                    } while (true);


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:428:18: ( DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt56=2;
                                                                                                                                    int LA56_0 = input.LA(1);

                                                                                                                                    if ( (LA56_0==DELIMITER1) ) {
                                                                                                                                        alt56=1;
                                                                                                                                    }
                                                                                                                                    switch (alt56) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:428:19: DELIMITER1 st_sized_optionnal[\"P.20\", 200] ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1355); 

                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p1357);
                                                                                                                                            st_sized_optionnal("P.20", 200);

                                                                                                                                            state._fsp--;


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:428:62: ( REPETITEUR st_sized_optionnal[\"P.20\", 200] )*
                                                                                                                                            loop39:
                                                                                                                                            do {
                                                                                                                                                int alt39=2;
                                                                                                                                                int LA39_0 = input.LA(1);

                                                                                                                                                if ( (LA39_0==REPETITEUR) ) {
                                                                                                                                                    alt39=1;
                                                                                                                                                }


                                                                                                                                                switch (alt39) {
                                                                                                                                            	case 1 :
                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:428:63: REPETITEUR st_sized_optionnal[\"P.20\", 200]
                                                                                                                                            	    {
                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p1361); 

                                                                                                                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_p1363);
                                                                                                                                            	    st_sized_optionnal("P.20", 200);

                                                                                                                                            	    state._fsp--;


                                                                                                                                            	    }
                                                                                                                                            	    break;

                                                                                                                                            	default :
                                                                                                                                            	    break loop39;
                                                                                                                                                }
                                                                                                                                            } while (true);


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:429:19: ( DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt55=2;
                                                                                                                                            int LA55_0 = input.LA(1);

                                                                                                                                            if ( (LA55_0==DELIMITER1) ) {
                                                                                                                                                alt55=1;
                                                                                                                                            }
                                                                                                                                            switch (alt55) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:429:20: DELIMITER1 st_sized_optionnal[\"P.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1387); 

                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p1389);
                                                                                                                                                    st_sized_optionnal("P.21", 200);

                                                                                                                                                    state._fsp--;


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:20: ( DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt54=2;
                                                                                                                                                    int LA54_0 = input.LA(1);

                                                                                                                                                    if ( (LA54_0==DELIMITER1) ) {
                                                                                                                                                        alt54=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt54) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:21: DELIMITER1 st_sized_optionnal[\"P.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1412); 

                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p1414);
                                                                                                                                                            st_sized_optionnal("P.22", 60);

                                                                                                                                                            state._fsp--;


                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:431:21: ( DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt53=2;
                                                                                                                                                            int LA53_0 = input.LA(1);

                                                                                                                                                            if ( (LA53_0==DELIMITER1) ) {
                                                                                                                                                                alt53=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt53) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:431:22: DELIMITER1 st_sized_optionnal[\"P.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1438); 

                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p1440);
                                                                                                                                                                    st_sized_optionnal("P.23", 60);

                                                                                                                                                                    state._fsp--;


                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:432:22: ( DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    int alt52=2;
                                                                                                                                                                    int LA52_0 = input.LA(1);

                                                                                                                                                                    if ( (LA52_0==DELIMITER1) ) {
                                                                                                                                                                        alt52=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt52) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:432:23: DELIMITER1 ts_sized_optionnal[\"P.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1465); 

                                                                                                                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p1467);
                                                                                                                                                                            ts_sized_optionnal("P.24", 26);

                                                                                                                                                                            state._fsp--;


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:432:65: ( REPETITEUR ts_sized_optionnal[\"P.24\", 26] )?
                                                                                                                                                                            int alt40=2;
                                                                                                                                                                            int LA40_0 = input.LA(1);

                                                                                                                                                                            if ( (LA40_0==REPETITEUR) ) {
                                                                                                                                                                                alt40=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt40) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:432:66: REPETITEUR ts_sized_optionnal[\"P.24\", 26]
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p1471); 

                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_p1473);
                                                                                                                                                                                    ts_sized_optionnal("P.24", 26);

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:433:23: ( DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            int alt51=2;
                                                                                                                                                                            int LA51_0 = input.LA(1);

                                                                                                                                                                            if ( (LA51_0==DELIMITER1) ) {
                                                                                                                                                                                alt51=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt51) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:433:24: DELIMITER1 spec_const_8_25[\"P.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1501); 

                                                                                                                                                                                    pushFollow(FOLLOW_spec_const_8_25_in_line_p1503);
                                                                                                                                                                                    spec_const_8_25("P.25");

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:434:24: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    int alt50=2;
                                                                                                                                                                                    int LA50_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA50_0==DELIMITER1) ) {
                                                                                                                                                                                        alt50=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt50) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:434:25: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1530); 

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_8_in_line_p1532);
                                                                                                                                                                                            spec_sized_mult_lvl1_st_optionnal_8("P.26", 100);

                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:436:25: ( DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            int alt49=2;
                                                                                                                                                                                            int LA49_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA49_0==DELIMITER1) ) {
                                                                                                                                                                                                alt49=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt49) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:436:26: DELIMITER1 st_sized_optionnal[\"P.27\", 100] ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1585); 

                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p1587);
                                                                                                                                                                                                    st_sized_optionnal("P.27", 100);

                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:437:26: ( DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    int alt48=2;
                                                                                                                                                                                                    int LA48_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA48_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt48=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt48) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:437:27: DELIMITER1 spec_const_race[\"P.28\"] ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1616); 

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_const_race_in_line_p1618);
                                                                                                                                                                                                            spec_const_race("P.28");

                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:439:27: ( DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            int alt47=2;
                                                                                                                                                                                                            int LA47_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA47_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt47=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt47) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:439:28: DELIMITER1 st_sized_optionnal[\"P.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1675); 

                                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p1677);
                                                                                                                                                                                                                    st_sized_optionnal("P.29", 2);

                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:441:28: ( DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    int alt46=2;
                                                                                                                                                                                                                    int LA46_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA46_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt46=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt46) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:441:29: DELIMITER1 st_sized_optionnal[\"P.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1736); 

                                                                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p1738);
                                                                                                                                                                                                                            st_sized_optionnal("P.30", 20);

                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:442:29: ( DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            int alt45=2;
                                                                                                                                                                                                                            int LA45_0 = input.LA(1);

                                                                                                                                                                                                                            if ( (LA45_0==DELIMITER1) ) {
                                                                                                                                                                                                                                alt45=1;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            switch (alt45) {
                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:442:30: DELIMITER1 st_sized_optionnal[\"P.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1770); 

                                                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p1772);
                                                                                                                                                                                                                                    st_sized_optionnal("P.31", 20);

                                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:444:30: ( DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    int alt44=2;
                                                                                                                                                                                                                                    int LA44_0 = input.LA(1);

                                                                                                                                                                                                                                    if ( (LA44_0==DELIMITER1) ) {
                                                                                                                                                                                                                                        alt44=1;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    switch (alt44) {
                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:444:31: DELIMITER1 st_sized_optionnal[\"P.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1835); 

                                                                                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p1837);
                                                                                                                                                                                                                                            st_sized_optionnal("P.32", 20);

                                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:31: ( DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            int alt43=2;
                                                                                                                                                                                                                                            int LA43_0 = input.LA(1);

                                                                                                                                                                                                                                            if ( (LA43_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                alt43=1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            switch (alt43) {
                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:32: DELIMITER1 ts_sized_optionnal[\"P.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1871); 

                                                                                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_p1873);
                                                                                                                                                                                                                                                    ts_sized_optionnal("P.33", 26);

                                                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:446:32: ( DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    int alt42=2;
                                                                                                                                                                                                                                                    int LA42_0 = input.LA(1);

                                                                                                                                                                                                                                                    if ( (LA42_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                        alt42=1;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    switch (alt42) {
                                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:446:33: DELIMITER1 ts_sized_optionnal[\"P.34\", 26] ( DELIMITER1 )?
                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1908); 

                                                                                                                                                                                                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p1910);
                                                                                                                                                                                                                                                            ts_sized_optionnal("P.34", 26);

                                                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:447:33: ( DELIMITER1 )?
                                                                                                                                                                                                                                                            int alt41=2;
                                                                                                                                                                                                                                                            int LA41_0 = input.LA(1);

                                                                                                                                                                                                                                                            if ( (LA41_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                                alt41=1;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            switch (alt41) {
                                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:447:33: DELIMITER1
                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p1945); 

                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                            }


                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // $ANTLR end "line_p"



    // $ANTLR start "line_obr"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:449:1: line_obr : CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR.8\"] DELIMITER1 ts_sized_optionnal[\"OBR.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR.10\", 20] DELIMITER1 spec_sized_cna[\"OBR.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_obr() throws RecognitionException {
        startElement("OBR");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:451:22: ( CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR.8\"] DELIMITER1 ts_sized_optionnal[\"OBR.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR.10\", 20] DELIMITER1 spec_sized_cna[\"OBR.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:452:3: CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR.8\"] DELIMITER1 ts_sized_optionnal[\"OBR.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR.10\", 20] DELIMITER1 spec_sized_cna[\"OBR.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_obr2023); 

            match(input,CHARO,FOLLOW_CHARO_in_line_obr2025); 

            match(input,CHARB,FOLLOW_CHARB_in_line_obr2027); 

            match(input,CHARR,FOLLOW_CHARR_in_line_obr2029); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2033); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_obr2035);
            nm_integer_sized_mandatory("OBR.2", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2040); 

            pushFollow(FOLLOW_spec_sized_9_3_in_line_obr2042);
            spec_sized_9_3("OBR.3", 23);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2047); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2049);
            spec_sized_mult_lvl1_st_optionnal_2("OBR.4", 23);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2054); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2056);
            spec_sized_mult_lvl1_st_optionnal_6("OBR.5", 640000);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:456:67: ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 64000] )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==REPETITEUR) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:456:68: REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR.5\", 64000]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2060); 

            	    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2062);
            	    spec_sized_mult_lvl1_st_optionnal_6("OBR.5", 64000);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2072); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2074);
            st_sized_optionnal("OBR.6", 2);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:45: ( REPETITEUR st_sized_optionnal[\"OBR.6\", 2] )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==REPETITEUR) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:46: REPETITEUR st_sized_optionnal[\"OBR.6\", 2]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2078); 

            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2080);
            	    st_sized_optionnal("OBR.6", 2);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2087); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2089);
            ts_sized_optionnal("OBR.7", 26);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2094); 

            pushFollow(FOLLOW_spec_non_sized_9_8_in_line_obr2096);
            spec_non_sized_9_8("OBR.8");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2101); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2103);
            ts_sized_optionnal("OBR.9", 26);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2111); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2113);
            st_sized_optionnal("OBR.10", 20);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2118); 

            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2120);
            spec_sized_cna("OBR.11", 60);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2128); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2130);
            st_sized_optionnal("OBR.12", 1);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:468:3: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==DELIMITER1) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:468:4: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2139); 

                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2141);
                    spec_sized_mult_lvl1_st_optionnal_2("OBR.13", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:469:4: ( DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==DELIMITER1) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:469:5: DELIMITER1 st_sized_optionnal[\"OBR.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2148); 

                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2150);
                            st_sized_optionnal("OBR.14", 300);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:470:5: ( DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt99=2;
                            int LA99_0 = input.LA(1);

                            if ( (LA99_0==DELIMITER1) ) {
                                alt99=1;
                            }
                            switch (alt99) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:470:6: DELIMITER1 ts_sized_optionnal[\"OBR.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2158); 

                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2160);
                                    ts_sized_optionnal("OBR.15", 26);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:471:6: ( DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt98=2;
                                    int LA98_0 = input.LA(1);

                                    if ( (LA98_0==DELIMITER1) ) {
                                        alt98=1;
                                    }
                                    switch (alt98) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:471:7: DELIMITER1 spec_sized_9_16[\"OBR.16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2169); 

                                            pushFollow(FOLLOW_spec_sized_9_16_in_line_obr2171);
                                            spec_sized_9_16("OBR.16", 300);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:472:7: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt97=2;
                                            int LA97_0 = input.LA(1);

                                            if ( (LA97_0==DELIMITER1) ) {
                                                alt97=1;
                                            }
                                            switch (alt97) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:472:8: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2181); 

                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2183);
                                                    spec_sized_mult_lvl1_st_optionnal_6("OBR.17", 60);

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:473:8: ( DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt96=2;
                                                    int LA96_0 = input.LA(1);

                                                    if ( (LA96_0==DELIMITER1) ) {
                                                        alt96=1;
                                                    }
                                                    switch (alt96) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:473:9: DELIMITER1 spec_sized_tn[\"OBR.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2194); 

                                                            pushFollow(FOLLOW_spec_sized_tn_in_line_obr2196);
                                                            spec_sized_tn("OBR.18", 40);

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:474:9: ( DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt95=2;
                                                            int LA95_0 = input.LA(1);

                                                            if ( (LA95_0==DELIMITER1) ) {
                                                                alt95=1;
                                                            }
                                                            switch (alt95) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:474:10: DELIMITER1 st_sized_optionnal[\"OBR.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2208); 

                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2210);
                                                                    st_sized_optionnal("OBR.19", 60);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:475:10: ( DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt94=2;
                                                                    int LA94_0 = input.LA(1);

                                                                    if ( (LA94_0==DELIMITER1) ) {
                                                                        alt94=1;
                                                                    }
                                                                    switch (alt94) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:475:11: DELIMITER1 st_sized_optionnal[\"OBR.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2223); 

                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2225);
                                                                            st_sized_optionnal("OBR.20", 60);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:476:11: ( DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt93=2;
                                                                            int LA93_0 = input.LA(1);

                                                                            if ( (LA93_0==DELIMITER1) ) {
                                                                                alt93=1;
                                                                            }
                                                                            switch (alt93) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:476:12: DELIMITER1 st_sized_optionnal[\"OBR.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2239); 

                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2241);
                                                                                    st_sized_optionnal("OBR.21", 60);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:477:12: ( DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt92=2;
                                                                                    int LA92_0 = input.LA(1);

                                                                                    if ( (LA92_0==DELIMITER1) ) {
                                                                                        alt92=1;
                                                                                    }
                                                                                    switch (alt92) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:477:13: DELIMITER1 st_sized_optionnal[\"OBR.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2256); 

                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2258);
                                                                                            st_sized_optionnal("OBR.22", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:478:13: ( DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt91=2;
                                                                                            int LA91_0 = input.LA(1);

                                                                                            if ( (LA91_0==DELIMITER1) ) {
                                                                                                alt91=1;
                                                                                            }
                                                                                            switch (alt91) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:478:14: DELIMITER1 ts_sized_optionnal[\"OBR.23\", 26] ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2274); 

                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2276);
                                                                                                    ts_sized_optionnal("OBR.23", 26);

                                                                                                    state._fsp--;


                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:479:14: ( DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt90=2;
                                                                                                    int LA90_0 = input.LA(1);

                                                                                                    if ( (LA90_0==DELIMITER1) ) {
                                                                                                        alt90=1;
                                                                                                    }
                                                                                                    switch (alt90) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:479:15: DELIMITER1 spec_const_race[\"OBR.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2293); 

                                                                                                            pushFollow(FOLLOW_spec_const_race_in_line_obr2295);
                                                                                                            spec_const_race("OBR.24");

                                                                                                            state._fsp--;


                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:480:15: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt89=2;
                                                                                                            int LA89_0 = input.LA(1);

                                                                                                            if ( (LA89_0==DELIMITER1) ) {
                                                                                                                alt89=1;
                                                                                                            }
                                                                                                            switch (alt89) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:480:16: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2313); 

                                                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2315);
                                                                                                                    spec_sized_mult_lvl1_st_optionnal_2("OBR.25", 10);

                                                                                                                    state._fsp--;


                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:16: ( DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt88=2;
                                                                                                                    int LA88_0 = input.LA(1);

                                                                                                                    if ( (LA88_0==DELIMITER1) ) {
                                                                                                                        alt88=1;
                                                                                                                    }
                                                                                                                    switch (alt88) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:17: DELIMITER1 spec_const_9_26[\"OBR.26\"] ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2334); 

                                                                                                                            pushFollow(FOLLOW_spec_const_9_26_in_line_obr2336);
                                                                                                                            spec_const_9_26("OBR.26");

                                                                                                                            state._fsp--;


                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:482:17: ( DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt87=2;
                                                                                                                            int LA87_0 = input.LA(1);

                                                                                                                            if ( (LA87_0==DELIMITER1) ) {
                                                                                                                                alt87=1;
                                                                                                                            }
                                                                                                                            switch (alt87) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:482:18: DELIMITER1 spec_const_race[\"OBR.27\"] ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2356); 

                                                                                                                                    pushFollow(FOLLOW_spec_const_race_in_line_obr2358);
                                                                                                                                    spec_const_race("OBR.27");

                                                                                                                                    state._fsp--;


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:483:18: ( DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt86=2;
                                                                                                                                    int LA86_0 = input.LA(1);

                                                                                                                                    if ( (LA86_0==DELIMITER1) ) {
                                                                                                                                        alt86=1;
                                                                                                                                    }
                                                                                                                                    switch (alt86) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:483:19: DELIMITER1 spec_const_race[\"OBR.28\"] ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2379); 

                                                                                                                                            pushFollow(FOLLOW_spec_const_race_in_line_obr2381);
                                                                                                                                            spec_const_race("OBR.28");

                                                                                                                                            state._fsp--;


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:484:19: ( DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt85=2;
                                                                                                                                            int LA85_0 = input.LA(1);

                                                                                                                                            if ( (LA85_0==DELIMITER1) ) {
                                                                                                                                                alt85=1;
                                                                                                                                            }
                                                                                                                                            switch (alt85) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:484:20: DELIMITER1 spec_sized_cna[\"OBR.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2403); 

                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2405);
                                                                                                                                                    spec_sized_cna("OBR.29", 150);

                                                                                                                                                    state._fsp--;


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:484:61: ( REPETITEUR spec_sized_cna[\"OBR.29\", 150] )*
                                                                                                                                                    loop74:
                                                                                                                                                    do {
                                                                                                                                                        int alt74=2;
                                                                                                                                                        int LA74_0 = input.LA(1);

                                                                                                                                                        if ( (LA74_0==REPETITEUR) ) {
                                                                                                                                                            alt74=1;
                                                                                                                                                        }


                                                                                                                                                        switch (alt74) {
                                                                                                                                                    	case 1 :
                                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:484:62: REPETITEUR spec_sized_cna[\"OBR.29\", 150]
                                                                                                                                                    	    {
                                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2409); 

                                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2411);
                                                                                                                                                    	    spec_sized_cna("OBR.29", 150);

                                                                                                                                                    	    state._fsp--;


                                                                                                                                                    	    }
                                                                                                                                                    	    break;

                                                                                                                                                    	default :
                                                                                                                                                    	    break loop74;
                                                                                                                                                        }
                                                                                                                                                    } while (true);


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:485:20: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt84=2;
                                                                                                                                                    int LA84_0 = input.LA(1);

                                                                                                                                                    if ( (LA84_0==DELIMITER1) ) {
                                                                                                                                                        alt84=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt84) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:485:21: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2436); 

                                                                                                                                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_4_in_line_obr2438);
                                                                                                                                                            spec_sized_mult_lvl1_st_optionnal_4("OBR.30", 150);

                                                                                                                                                            state._fsp--;


                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:486:21: ( DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt83=2;
                                                                                                                                                            int LA83_0 = input.LA(1);

                                                                                                                                                            if ( (LA83_0==DELIMITER1) ) {
                                                                                                                                                                alt83=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt83) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:486:22: DELIMITER1 spec_const_9_31[\"OBR.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2462); 

                                                                                                                                                                    pushFollow(FOLLOW_spec_const_9_31_in_line_obr2464);
                                                                                                                                                                    spec_const_9_31("OBR.31");

                                                                                                                                                                    state._fsp--;


                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:488:22: ( DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                    int alt82=2;
                                                                                                                                                                    int LA82_0 = input.LA(1);

                                                                                                                                                                    if ( (LA82_0==DELIMITER1) ) {
                                                                                                                                                                        alt82=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt82) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:488:23: DELIMITER1 st_sized_optionnal[\"OBR.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2511); 

                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2513);
                                                                                                                                                                            st_sized_optionnal("OBR.32", 300);

                                                                                                                                                                            state._fsp--;


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:488:68: ( REPETITEUR st_sized_optionnal[\"OBR.32\", 300] )*
                                                                                                                                                                            loop75:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt75=2;
                                                                                                                                                                                int LA75_0 = input.LA(1);

                                                                                                                                                                                if ( (LA75_0==REPETITEUR) ) {
                                                                                                                                                                                    alt75=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt75) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:488:69: REPETITEUR st_sized_optionnal[\"OBR.32\", 300]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2517); 

                                                                                                                                                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2519);
                                                                                                                                                                            	    st_sized_optionnal("OBR.32", 300);

                                                                                                                                                                            	    state._fsp--;


                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop75;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:489:23: ( DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                            int alt81=2;
                                                                                                                                                                            int LA81_0 = input.LA(1);

                                                                                                                                                                            if ( (LA81_0==DELIMITER1) ) {
                                                                                                                                                                                alt81=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt81) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:489:24: DELIMITER1 spec_sized_cna[\"OBR.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2547); 

                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2549);
                                                                                                                                                                                    spec_sized_cna("OBR.33", 60);

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:490:24: ( DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                    int alt80=2;
                                                                                                                                                                                    int LA80_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA80_0==DELIMITER1) ) {
                                                                                                                                                                                        alt80=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt80) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:490:25: DELIMITER1 spec_sized_cna[\"OBR.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2576); 

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2578);
                                                                                                                                                                                            spec_sized_cna("OBR.34", 60);

                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:491:25: ( DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                            int alt79=2;
                                                                                                                                                                                            int LA79_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA79_0==DELIMITER1) ) {
                                                                                                                                                                                                alt79=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt79) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:491:26: DELIMITER1 spec_sized_cna[\"OBR.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2606); 

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2608);
                                                                                                                                                                                                    spec_sized_cna("OBR.35", 60);

                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:492:26: ( DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                    int alt78=2;
                                                                                                                                                                                                    int LA78_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA78_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt78=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt78) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:492:27: DELIMITER1 spec_sized_cna[\"OBR.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2637); 

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2639);
                                                                                                                                                                                                            spec_sized_cna("OBR.36", 60);

                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:493:27: ( DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                            int alt77=2;
                                                                                                                                                                                                            int LA77_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA77_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt77=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt77) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:493:28: DELIMITER1 ts_sized_optionnal[\"OBR.37\", 26] ( DELIMITER1 )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2669); 

                                                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2671);
                                                                                                                                                                                                                    ts_sized_optionnal("OBR.37", 26);

                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:494:29: ( DELIMITER1 )?
                                                                                                                                                                                                                    int alt76=2;
                                                                                                                                                                                                                    int LA76_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA76_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt76=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt76) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:494:29: DELIMITER1
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2702); 

                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // $ANTLR end "line_obr"



    // $ANTLR start "line_obx"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:496:1: line_obx : CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) ) ;
    public final void line_obx() throws RecognitionException {
        startElement("OBX");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:498:22: ( CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:3: CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) )
            {
            match(input,CR,FOLLOW_CR_in_line_obx2770); 

            match(input,CHARO,FOLLOW_CHARO_in_line_obx2772); 

            match(input,CHARB,FOLLOW_CHARB_in_line_obx2774); 

            match(input,CHARX,FOLLOW_CHARX_in_line_obx2776); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2780); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_obx2782);
            nm_integer_sized_mandatory("OBX.2", 10);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2787); 

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:502:5: ( ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) )
            int alt137=7;
            switch ( input.LA(1) ) {
            case CHARN:
                {
                alt137=1;
                }
                break;
            case CHARC:
                {
                int LA137_2 = input.LA(2);

                if ( (LA137_2==CHARE) ) {
                    alt137=2;
                }
                else if ( (LA137_2==CHARK||LA137_2==CHARN) ) {
                    alt137=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 137, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHARF:
                {
                alt137=3;
                }
                break;
            case CHARS:
                {
                alt137=4;
                }
                break;
            case CHARG:
                {
                int LA137_5 = input.LA(2);

                if ( (LA137_5==CHARC) ) {
                    alt137=5;
                }
                else if ( (LA137_5==CHARB||LA137_5==CHARN) ) {
                    alt137=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 137, 5, input);

                    throw nvae;

                }
                }
                break;
            case CHART:
                {
                int LA137_6 = input.LA(2);

                if ( (LA137_6==CHARX) ) {
                    alt137=6;
                }
                else if ( (LA137_6==CHARN) ) {
                    alt137=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 137, 6, input);

                    throw nvae;

                }
                }
                break;
            case CHARA:
            case CHARD:
            case CHARP:
                {
                alt137=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;

            }

            switch (alt137) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:502:6: ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:502:6: ( spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:502:7: spec_const_10_3_nm[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_nm_in_line_obx2795);
                    spec_const_10_3_nm("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:503:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==DELIMITER1) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:503:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2804); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2806);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt105=2;
                            int LA105_0 = input.LA(1);

                            if ( (LA105_0==DELIMITER1) ) {
                                alt105=1;
                            }
                            switch (alt105) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2816); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2818);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:8: ( DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt104=2;
                                    int LA104_0 = input.LA(1);

                                    if ( (LA104_0==DELIMITER1) ) {
                                        alt104=1;
                                    }
                                    switch (alt104) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:9: DELIMITER1 nm_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2829); 

                                            pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2831);
                                            nm_sized_optionnal("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:55: ( REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000] )*
                                            loop102:
                                            do {
                                                int alt102=2;
                                                int LA102_0 = input.LA(1);

                                                if ( (LA102_0==REPETITEUR) ) {
                                                    alt102=1;
                                                }


                                                switch (alt102) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:56: REPETITEUR nm_sized_optionnal[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2835); 

                                            	    pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2837);
                                            	    nm_sized_optionnal("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop102;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:506:9: ( line_obx2_1_post10_6 )?
                                            int alt103=2;
                                            int LA103_0 = input.LA(1);

                                            if ( (LA103_0==DELIMITER1) ) {
                                                alt103=1;
                                            }
                                            switch (alt103) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:506:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2850);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:507:7: ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:507:7: ( spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:507:8: spec_const_10_3_ce[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_ce_in_line_obx2867);
                    spec_const_10_3_ce("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:508:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==DELIMITER1) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:508:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2876); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2878);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:509:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt110=2;
                            int LA110_0 = input.LA(1);

                            if ( (LA110_0==DELIMITER1) ) {
                                alt110=1;
                            }
                            switch (alt110) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:509:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2888); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2890);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:510:8: ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt109=2;
                                    int LA109_0 = input.LA(1);

                                    if ( (LA109_0==DELIMITER1) ) {
                                        alt109=1;
                                    }
                                    switch (alt109) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:510:9: DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2901); 

                                            pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2903);
                                            spec_sized_10_6("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:510:52: ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )*
                                            loop107:
                                            do {
                                                int alt107=2;
                                                int LA107_0 = input.LA(1);

                                                if ( (LA107_0==REPETITEUR) ) {
                                                    alt107=1;
                                                }


                                                switch (alt107) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:510:53: REPETITEUR spec_sized_10_6[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2907); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2909);
                                            	    spec_sized_10_6("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop107;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:511:9: ( line_obx2_1_post10_6 )?
                                            int alt108=2;
                                            int LA108_0 = input.LA(1);

                                            if ( (LA108_0==DELIMITER1) ) {
                                                alt108=1;
                                            }
                                            switch (alt108) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:511:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2922);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:512:7: ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:512:7: ( spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:512:8: spec_const_10_3_fic[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_fic_in_line_obx2939);
                    spec_const_10_3_fic("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:513:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==DELIMITER1) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:513:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2948); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2950);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:514:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt115=2;
                            int LA115_0 = input.LA(1);

                            if ( (LA115_0==DELIMITER1) ) {
                                alt115=1;
                            }
                            switch (alt115) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:514:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2960); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2962);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:515:8: ( DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt114=2;
                                    int LA114_0 = input.LA(1);

                                    if ( (LA114_0==DELIMITER1) ) {
                                        alt114=1;
                                    }
                                    switch (alt114) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:515:9: DELIMITER1 spec_sized_10_6[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2973); 

                                            pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2975);
                                            spec_sized_10_6("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:515:52: ( REPETITEUR spec_sized_10_6[\"OBX.6\", 64000] )*
                                            loop112:
                                            do {
                                                int alt112=2;
                                                int LA112_0 = input.LA(1);

                                                if ( (LA112_0==REPETITEUR) ) {
                                                    alt112=1;
                                                }


                                                switch (alt112) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:515:53: REPETITEUR spec_sized_10_6[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2979); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2981);
                                            	    spec_sized_10_6("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop112;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:516:9: ( line_obx2_1_post10_6 )?
                                            int alt113=2;
                                            int LA113_0 = input.LA(1);

                                            if ( (LA113_0==DELIMITER1) ) {
                                                alt113=1;
                                            }
                                            switch (alt113) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:516:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2994);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:517:7: ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:517:7: ( spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:517:8: spec_const_10_3_st[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_st_in_line_obx3011);
                    spec_const_10_3_st("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:518:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==DELIMITER1) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:518:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3020); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx3022);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:519:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt120=2;
                            int LA120_0 = input.LA(1);

                            if ( (LA120_0==DELIMITER1) ) {
                                alt120=1;
                            }
                            switch (alt120) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:519:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3032); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx3034);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:520:8: ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt119=2;
                                    int LA119_0 = input.LA(1);

                                    if ( (LA119_0==DELIMITER1) ) {
                                        alt119=1;
                                    }
                                    switch (alt119) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:520:9: DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3045); 

                                            pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx3047);
                                            spec_sized_10_6_tx("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:520:55: ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )*
                                            loop117:
                                            do {
                                                int alt117=2;
                                                int LA117_0 = input.LA(1);

                                                if ( (LA117_0==REPETITEUR) ) {
                                                    alt117=1;
                                                }


                                                switch (alt117) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:520:56: REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx3051); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx3053);
                                            	    spec_sized_10_6_tx("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop117;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:9: ( line_obx2_1_post10_6 )?
                                            int alt118=2;
                                            int LA118_0 = input.LA(1);

                                            if ( (LA118_0==DELIMITER1) ) {
                                                alt118=1;
                                            }
                                            switch (alt118) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx3066);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:522:7: ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:522:7: ( spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:522:8: spec_const_10_3_gc[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_gc_in_line_obx3083);
                    spec_const_10_3_gc("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:523:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==DELIMITER1) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:523:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3092); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx3094);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:524:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt125=2;
                            int LA125_0 = input.LA(1);

                            if ( (LA125_0==DELIMITER1) ) {
                                alt125=1;
                            }
                            switch (alt125) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:524:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3104); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx3106);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:525:8: ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt124=2;
                                    int LA124_0 = input.LA(1);

                                    if ( (LA124_0==DELIMITER1) ) {
                                        alt124=1;
                                    }
                                    switch (alt124) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:525:9: DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3117); 

                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx3119);
                                            spec_sized_mult_lvl1_nm_optionnal_2("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:525:72: ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000] )*
                                            loop122:
                                            do {
                                                int alt122=2;
                                                int LA122_0 = input.LA(1);

                                                if ( (LA122_0==REPETITEUR) ) {
                                                    alt122=1;
                                                }


                                                switch (alt122) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:525:73: REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx3123); 

                                            	    pushFollow(FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx3125);
                                            	    spec_sized_mult_lvl1_nm_optionnal_2("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop122;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:526:9: ( line_obx2_1_post10_6 )?
                                            int alt123=2;
                                            int LA123_0 = input.LA(1);

                                            if ( (LA123_0==DELIMITER1) ) {
                                                alt123=1;
                                            }
                                            switch (alt123) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:526:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx3138);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:527:7: ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:527:7: ( spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:527:8: spec_const_10_3_tx[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_tx_in_line_obx3155);
                    spec_const_10_3_tx("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:528:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==DELIMITER1) ) {
                        alt131=1;
                    }
                    switch (alt131) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:528:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3164); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx3166);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:529:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt130=2;
                            int LA130_0 = input.LA(1);

                            if ( (LA130_0==DELIMITER1) ) {
                                alt130=1;
                            }
                            switch (alt130) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:529:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3176); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx3178);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:530:8: ( DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt129=2;
                                    int LA129_0 = input.LA(1);

                                    if ( (LA129_0==DELIMITER1) ) {
                                        alt129=1;
                                    }
                                    switch (alt129) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:530:9: DELIMITER1 spec_sized_10_6_tx[\"OBX.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3189); 

                                            pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx3191);
                                            spec_sized_10_6_tx("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:530:55: ( REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000] )*
                                            loop127:
                                            do {
                                                int alt127=2;
                                                int LA127_0 = input.LA(1);

                                                if ( (LA127_0==REPETITEUR) ) {
                                                    alt127=1;
                                                }


                                                switch (alt127) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:530:56: REPETITEUR spec_sized_10_6_tx[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx3195); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx3197);
                                            	    spec_sized_10_6_tx("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop127;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:531:9: ( line_obx2_1_post10_6 )?
                                            int alt128=2;
                                            int LA128_0 = input.LA(1);

                                            if ( (LA128_0==DELIMITER1) ) {
                                                alt128=1;
                                            }
                                            switch (alt128) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:531:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx3210);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:532:7: ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:532:7: ( spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:532:8: spec_const_10_3_std[\"OBX.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_std_in_line_obx3227);
                    spec_const_10_3_std("OBX.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:533:6: ( DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==DELIMITER1) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:533:7: DELIMITER1 spec_sized_10_4[\"OBX.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3236); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx3238);
                            spec_sized_10_4("OBX.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:534:7: ( DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt135=2;
                            int LA135_0 = input.LA(1);

                            if ( (LA135_0==DELIMITER1) ) {
                                alt135=1;
                            }
                            switch (alt135) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:534:8: DELIMITER1 st_sized_optionnal[\"OBX.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3248); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx3250);
                                    st_sized_optionnal("OBX.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:535:8: ( DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt134=2;
                                    int LA134_0 = input.LA(1);

                                    if ( (LA134_0==DELIMITER1) ) {
                                        alt134=1;
                                    }
                                    switch (alt134) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:535:9: DELIMITER1 st_sized_optionnal[\"OBX.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx3261); 

                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx3263);
                                            st_sized_optionnal("OBX.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:535:55: ( REPETITEUR st_sized_optionnal[\"OBX.6\", 64000] )*
                                            loop132:
                                            do {
                                                int alt132=2;
                                                int LA132_0 = input.LA(1);

                                                if ( (LA132_0==REPETITEUR) ) {
                                                    alt132=1;
                                                }


                                                switch (alt132) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:535:56: REPETITEUR st_sized_optionnal[\"OBX.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx3267); 

                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx3269);
                                            	    st_sized_optionnal("OBX.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop132;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:536:9: ( line_obx2_1_post10_6 )?
                                            int alt133=2;
                                            int LA133_0 = input.LA(1);

                                            if ( (LA133_0==DELIMITER1) ) {
                                                alt133=1;
                                            }
                                            switch (alt133) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:536:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx3282);
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
    // $ANTLR end "line_obx"



    // $ANTLR start "line_obx2_1_post10_6"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:538:1: line_obx2_1_post10_6 : ( DELIMITER1 st_sized_optionnal[\"OBX.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? ) ;
    public final void line_obx2_1_post10_6() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:538:21: ( ( DELIMITER1 st_sized_optionnal[\"OBX.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:5: ( DELIMITER1 st_sized_optionnal[\"OBX.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:5: ( DELIMITER1 st_sized_optionnal[\"OBX.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:6: DELIMITER1 st_sized_optionnal[\"OBX.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_63303); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_63305);
            st_sized_optionnal("OBX.7", 20);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:540:6: ( DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==DELIMITER1) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:540:7: DELIMITER1 st_sized_optionnal[\"OBX.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_63314); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_63316);
                    st_sized_optionnal("OBX.8", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:540:50: ( REPETITEUR st_sized_optionnal[\"OBX.8\", 60] )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==REPETITEUR) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:540:51: REPETITEUR st_sized_optionnal[\"OBX.8\", 60]
                    	    {
                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_63320); 

                    	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_63322);
                    	    st_sized_optionnal("OBX.8", 60);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:541:7: ( DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                    int alt150=2;
                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==DELIMITER1) ) {
                        alt150=1;
                    }
                    switch (alt150) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:541:8: DELIMITER1 spec_const_10_9[\"OBX.9\"] ( REPETITEUR spec_const_10_9[\"OBX.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_63334); 

                            pushFollow(FOLLOW_spec_const_10_9_in_line_obx2_1_post10_63336);
                            spec_const_10_9("OBX.9");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:541:44: ( REPETITEUR spec_const_10_9[\"OBX.9\"] )*
                            loop139:
                            do {
                                int alt139=2;
                                int LA139_0 = input.LA(1);

                                if ( (LA139_0==REPETITEUR) ) {
                                    alt139=1;
                                }


                                switch (alt139) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:541:45: REPETITEUR spec_const_10_9[\"OBX.9\"]
                            	    {
                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_63340); 

                            	    pushFollow(FOLLOW_spec_const_10_9_in_line_obx2_1_post10_63342);
                            	    spec_const_10_9("OBX.9");

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop139;
                                }
                            } while (true);


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:542:8: ( DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                            int alt149=2;
                            int LA149_0 = input.LA(1);

                            if ( (LA149_0==DELIMITER1) ) {
                                alt149=1;
                            }
                            switch (alt149) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:542:9: DELIMITER1 nm_sized_optionnal[\"OBX.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_63355); 

                                    pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2_1_post10_63357);
                                    nm_sized_optionnal("OBX.10", 5);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:543:9: ( DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                    int alt148=2;
                                    int LA148_0 = input.LA(1);

                                    if ( (LA148_0==DELIMITER1) ) {
                                        alt148=1;
                                    }
                                    switch (alt148) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:543:10: DELIMITER1 spec_const_10_11[\"OBX.11\"] ( REPETITEUR spec_const_10_11[\"OBX.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_63369); 

                                            pushFollow(FOLLOW_spec_const_10_11_in_line_obx2_1_post10_63371);
                                            spec_const_10_11("OBX.11");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:543:48: ( REPETITEUR spec_const_10_11[\"OBX.11\"] )*
                                            loop140:
                                            do {
                                                int alt140=2;
                                                int LA140_0 = input.LA(1);

                                                if ( (LA140_0==REPETITEUR) ) {
                                                    alt140=1;
                                                }


                                                switch (alt140) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:543:49: REPETITEUR spec_const_10_11[\"OBX.11\"]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_63375); 

                                            	    pushFollow(FOLLOW_spec_const_10_11_in_line_obx2_1_post10_63377);
                                            	    spec_const_10_11("OBX.11");

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop140;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:544:10: ( DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )?
                                            int alt147=2;
                                            int LA147_0 = input.LA(1);

                                            if ( (LA147_0==DELIMITER1) ) {
                                                alt147=1;
                                            }
                                            switch (alt147) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:544:11: DELIMITER1 spec_const_10_12[\"OBX.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_63392); 

                                                    pushFollow(FOLLOW_spec_const_10_12_in_line_obx2_1_post10_63394);
                                                    spec_const_10_12("OBX.12");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:545:11: ( DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )? )?
                                                    int alt146=2;
                                                    int LA146_0 = input.LA(1);

                                                    if ( (LA146_0==DELIMITER1) ) {
                                                        alt146=1;
                                                    }
                                                    switch (alt146) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:545:12: DELIMITER1 ts_sized_optionnal[\"OBX.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_63409); 

                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_63411);
                                                            ts_sized_optionnal("OBX.13", 26);

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:546:12: ( DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )? )?
                                                            int alt145=2;
                                                            int LA145_0 = input.LA(1);

                                                            if ( (LA145_0==DELIMITER1) ) {
                                                                alt145=1;
                                                            }
                                                            switch (alt145) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:546:13: DELIMITER1 st_sized_optionnal[\"OBX.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_63427); 

                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_63429);
                                                                    st_sized_optionnal("OBX.14", 20);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:547:13: ( DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )? )?
                                                                    int alt144=2;
                                                                    int LA144_0 = input.LA(1);

                                                                    if ( (LA144_0==DELIMITER1) ) {
                                                                        alt144=1;
                                                                    }
                                                                    switch (alt144) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:547:14: DELIMITER1 ts_sized_optionnal[\"OBX.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_63445); 

                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_63447);
                                                                            ts_sized_optionnal("OBX.15", 26);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:548:14: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )? )?
                                                                            int alt143=2;
                                                                            int LA143_0 = input.LA(1);

                                                                            if ( (LA143_0==DELIMITER1) ) {
                                                                                alt143=1;
                                                                            }
                                                                            switch (alt143) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:548:15: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_63464); 

                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obx2_1_post10_63466);
                                                                                    spec_sized_mult_lvl1_st_optionnal_6("OBX.16", 60);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:15: ( DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )? )?
                                                                                    int alt142=2;
                                                                                    int LA142_0 = input.LA(1);

                                                                                    if ( (LA142_0==DELIMITER1) ) {
                                                                                        alt142=1;
                                                                                    }
                                                                                    switch (alt142) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:16: DELIMITER1 st_sized_optionnal[\"OBX.17\", 60] ( DELIMITER1 )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_63484); 

                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_63486);
                                                                                            st_sized_optionnal("OBX.17", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:60: ( DELIMITER1 )?
                                                                                            int alt141=2;
                                                                                            int LA141_0 = input.LA(1);

                                                                                            if ( (LA141_0==DELIMITER1) ) {
                                                                                                alt141=1;
                                                                                            }
                                                                                            switch (alt141) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:60: DELIMITER1
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_63489); 

                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:551:1: line_c : CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C.2\", 10] DELIMITER1 spec_const_12_3[\"C.3\"] DELIMITER1 st_sized_optionnal[\"C.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C.4\", 64000] )* ( DELIMITER1 )? ;
    public final void line_c() throws RecognitionException {
        startElement("C");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:553:22: ( CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C.2\", 10] DELIMITER1 spec_const_12_3[\"C.3\"] DELIMITER1 st_sized_optionnal[\"C.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C.4\", 64000] )* ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:554:3: CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C.2\", 10] DELIMITER1 spec_const_12_3[\"C.3\"] DELIMITER1 st_sized_optionnal[\"C.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C.4\", 64000] )* ( DELIMITER1 )?
            {
            match(input,CR,FOLLOW_CR_in_line_c3528); 

            match(input,CHARC,FOLLOW_CHARC_in_line_c3530); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c3534); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_c3536);
            nm_integer_sized_mandatory("C.2", 10);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c3541); 

            pushFollow(FOLLOW_spec_const_12_3_in_line_c3543);
            spec_const_12_3("C.3");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c3548); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_c3550);
            st_sized_optionnal("C.4", 64000);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:557:47: ( REPETITEUR st_sized_optionnal[\"C.4\", 64000] )*
            loop152:
            do {
                int alt152=2;
                int LA152_0 = input.LA(1);

                if ( (LA152_0==REPETITEUR) ) {
                    alt152=1;
                }


                switch (alt152) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:557:48: REPETITEUR st_sized_optionnal[\"C.4\", 64000]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_c3554); 

            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_c3556);
            	    st_sized_optionnal("C.4", 64000);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop152;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:558:3: ( DELIMITER1 )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==DELIMITER1) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:558:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c3565); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:560:1: line_l : CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L.2\", 1] ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )? )? ;
    public final void line_l() throws RecognitionException {
        startElement("L");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:562:22: ( CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L.2\", 1] ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:563:3: CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L.2\", 1] ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_l3583); 

            match(input,CHARL,FOLLOW_CHARL_in_line_l3585); 

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:564:3: ( DELIMITER1 nm_integer_sized_optionnal[\"L.2\", 1] ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )? )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==DELIMITER1) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:564:4: DELIMITER1 nm_integer_sized_optionnal[\"L.2\", 1] ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l3590); 

                    pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l3592);
                    nm_integer_sized_optionnal("L.2", 1);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:565:4: ( DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )? )?
                    int alt158=2;
                    int LA158_0 = input.LA(1);

                    if ( (LA158_0==DELIMITER1) ) {
                        alt158=1;
                    }
                    switch (alt158) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:565:5: DELIMITER1 spec_const_race[\"L.3\"] ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l3599); 

                            pushFollow(FOLLOW_spec_const_race_in_line_l3601);
                            spec_const_race("L.3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:566:5: ( DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )? )?
                            int alt157=2;
                            int LA157_0 = input.LA(1);

                            if ( (LA157_0==DELIMITER1) ) {
                                alt157=1;
                            }
                            switch (alt157) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:566:6: DELIMITER1 nm_integer_sized_optionnal[\"L.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l3609); 

                                    pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l3611);
                                    nm_integer_sized_optionnal("L.4", 4);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:567:6: ( DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )? )?
                                    int alt156=2;
                                    int LA156_0 = input.LA(1);

                                    if ( (LA156_0==DELIMITER1) ) {
                                        alt156=1;
                                    }
                                    switch (alt156) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:567:7: DELIMITER1 nm_integer_sized_optionnal[\"L.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l3620); 

                                            pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l3622);
                                            nm_integer_sized_optionnal("L.5", 10);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:568:7: ( DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )? )?
                                            int alt155=2;
                                            int LA155_0 = input.LA(1);

                                            if ( (LA155_0==DELIMITER1) ) {
                                                alt155=1;
                                            }
                                            switch (alt155) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:568:8: DELIMITER1 st_sized_optionnal[\"L.6\", 12] ( DELIMITER1 )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l3632); 

                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_l3634);
                                                    st_sized_optionnal("L.6", 12);

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:568:49: ( DELIMITER1 )?
                                                    int alt154=2;
                                                    int LA154_0 = input.LA(1);

                                                    if ( (LA154_0==DELIMITER1) ) {
                                                        alt154=1;
                                                    }
                                                    switch (alt154) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:568:49: DELIMITER1
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l3637); 

                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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



    // $ANTLR start "spec_on_optionnal"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:578:1: spec_on_optionnal[String nameElement] : ( final_charO | final_charN )? ;
    public final void spec_on_optionnal(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:580:22: ( ( final_charO | final_charN )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:581:3: ( final_charO | final_charN )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:581:3: ( final_charO | final_charN )?
            int alt160=3;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==CHARO) ) {
                alt160=1;
            }
            else if ( (LA160_0==CHARN) ) {
                alt160=2;
            }
            switch (alt160) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:581:4: final_charO
                    {
                    pushFollow(FOLLOW_final_charO_in_spec_on_optionnal3675);
                    final_charO();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:581:18: final_charN
                    {
                    pushFollow(FOLLOW_final_charN_in_spec_on_optionnal3679);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:583:1: spec_const_sexe[String nameElement] : ( final_charM | final_charF | final_charU )? ;
    public final void spec_const_sexe(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:22: ( ( final_charM | final_charF | final_charU )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:3: ( final_charM | final_charF | final_charU )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:3: ( final_charM | final_charF | final_charU )?
            int alt161=4;
            switch ( input.LA(1) ) {
                case CHARM:
                    {
                    alt161=1;
                    }
                    break;
                case CHARF:
                    {
                    alt161=2;
                    }
                    break;
                case CHARU:
                    {
                    alt161=3;
                    }
                    break;
            }

            switch (alt161) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:4: final_charM
                    {
                    pushFollow(FOLLOW_final_charM_in_spec_const_sexe3700);
                    final_charM();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:18: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_sexe3704);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:32: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_sexe3708);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:588:1: spec_const_race[String nameElement] :;
    public final void spec_const_race(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:590:22: ()
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:591:3: 
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:593:1: spec_const_7_13_version_2_0[String nameElement] : spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_0(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:595:22: ( spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:596:3: spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_0_in_spec_const_7_13_version_2_03745);
            spec_const_7_13_1_version_2_0(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_03748); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_03750);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:598:1: spec_const_7_13_version_2_1[String nameElement] : spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_1(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:600:22: ( spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:601:3: spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_1_in_spec_const_7_13_version_2_13771);
            spec_const_7_13_1_version_2_1(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_13774); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_13776);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:603:1: spec_const_7_13_version_2_2[String nameElement] : spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_2(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:605:22: ( spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:606:3: spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_2_in_spec_const_7_13_version_2_23795);
            spec_const_7_13_1_version_2_2(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_23798); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_23800);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:608:1: spec_const_7_13_2[String nameElement] : ( final_charC | final_charL | final_charR );
    public final void spec_const_7_13_2(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:610:22: ( final_charC | final_charL | final_charR )
            int alt162=3;
            switch ( input.LA(1) ) {
            case CHARC:
                {
                alt162=1;
                }
                break;
            case CHARL:
                {
                alt162=2;
                }
                break;
            case CHARR:
                {
                alt162=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 162, 0, input);

                throw nvae;

            }

            switch (alt162) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:611:3: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_7_13_23819);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:611:17: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_7_13_23823);
                    final_charL();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:611:31: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_7_13_23827);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:613:1: spec_const_7_7_contexte_ORU[String nameElement] : final_ORU ;
    public final void spec_const_7_7_contexte_ORU(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:615:22: ( final_ORU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:616:3: final_ORU
            {
            pushFollow(FOLLOW_final_ORU_in_spec_const_7_7_contexte_ORU3845);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:618:1: spec_const_7_7_contexte_ORM[String nameElement] : final_ORM ;
    public final void spec_const_7_7_contexte_ORM(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:620:22: ( final_ORM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:621:3: final_ORM
            {
            pushFollow(FOLLOW_final_ORM_in_spec_const_7_7_contexte_ORM3863);
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



    // $ANTLR start "spec_const_7_12"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:623:1: spec_const_7_12[String nameElement] : ( final_charP | final_charD | final_charT ) ;
    public final void spec_const_7_12(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:625:22: ( ( final_charP | final_charD | final_charT ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:626:3: ( final_charP | final_charD | final_charT )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:626:3: ( final_charP | final_charD | final_charT )
            int alt163=3;
            switch ( input.LA(1) ) {
            case CHARP:
                {
                alt163=1;
                }
                break;
            case CHARD:
                {
                alt163=2;
                }
                break;
            case CHART:
                {
                alt163=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 163, 0, input);

                throw nvae;

            }

            switch (alt163) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:626:4: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_7_123882);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:626:18: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_7_123886);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:626:32: final_charT
                    {
                    pushFollow(FOLLOW_final_charT_in_spec_const_7_123890);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:628:1: spec_const_9_31[String nameElement] : ( final_PORT | final_CART | final_WHLC | final_WALK )? ;
    public final void spec_const_9_31(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:630:22: ( ( final_PORT | final_CART | final_WHLC | final_WALK )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:631:3: ( final_PORT | final_CART | final_WHLC | final_WALK )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:631:3: ( final_PORT | final_CART | final_WHLC | final_WALK )?
            int alt164=5;
            switch ( input.LA(1) ) {
                case CHARP:
                    {
                    alt164=1;
                    }
                    break;
                case CHARC:
                    {
                    alt164=2;
                    }
                    break;
                case CHARW:
                    {
                    int LA164_3 = input.LA(2);

                    if ( (LA164_3==CHARH) ) {
                        alt164=3;
                    }
                    else if ( (LA164_3==CHARA) ) {
                        alt164=4;
                    }
                    }
                    break;
            }

            switch (alt164) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:631:4: final_PORT
                    {
                    pushFollow(FOLLOW_final_PORT_in_spec_const_9_313910);
                    final_PORT();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:631:17: final_CART
                    {
                    pushFollow(FOLLOW_final_CART_in_spec_const_9_313914);
                    final_CART();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:631:30: final_WHLC
                    {
                    pushFollow(FOLLOW_final_WHLC_in_spec_const_9_313918);
                    final_WHLC();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:631:43: final_WALK
                    {
                    pushFollow(FOLLOW_final_WALK_in_spec_const_9_313922);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:633:1: spec_const_8_25[String nameElement] : ( final_OP | final_IP | final_ER | final_PA | final_MP )? ;
    public final void spec_const_8_25(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:635:22: ( ( final_OP | final_IP | final_ER | final_PA | final_MP )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:636:3: ( final_OP | final_IP | final_ER | final_PA | final_MP )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:636:3: ( final_OP | final_IP | final_ER | final_PA | final_MP )?
            int alt165=6;
            switch ( input.LA(1) ) {
                case CHARO:
                    {
                    alt165=1;
                    }
                    break;
                case CHARI:
                    {
                    alt165=2;
                    }
                    break;
                case CHARE:
                    {
                    alt165=3;
                    }
                    break;
                case CHARP:
                    {
                    alt165=4;
                    }
                    break;
                case CHARM:
                    {
                    alt165=5;
                    }
                    break;
            }

            switch (alt165) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:636:4: final_OP
                    {
                    pushFollow(FOLLOW_final_OP_in_spec_const_8_253943);
                    final_OP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:636:15: final_IP
                    {
                    pushFollow(FOLLOW_final_IP_in_spec_const_8_253947);
                    final_IP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:636:26: final_ER
                    {
                    pushFollow(FOLLOW_final_ER_in_spec_const_8_253951);
                    final_ER();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:636:37: final_PA
                    {
                    pushFollow(FOLLOW_final_PA_in_spec_const_8_253955);
                    final_PA();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:636:48: final_MP
                    {
                    pushFollow(FOLLOW_final_MP_in_spec_const_8_253959);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:638:1: spec_const_9_26[String nameElement] : ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )? ;
    public final void spec_const_9_26(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:640:22: ( ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:641:3: ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:641:3: ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )?
            int alt166=10;
            switch ( input.LA(1) ) {
                case CHARF:
                    {
                    alt166=1;
                    }
                    break;
                case CHARP:
                    {
                    alt166=2;
                    }
                    break;
                case CHARM:
                    {
                    alt166=3;
                    }
                    break;
                case CHARI:
                    {
                    alt166=4;
                    }
                    break;
                case CHARR:
                    {
                    alt166=5;
                    }
                    break;
                case CHARC:
                    {
                    alt166=6;
                    }
                    break;
                case CHARO:
                    {
                    alt166=7;
                    }
                    break;
                case CHARD:
                    {
                    alt166=8;
                    }
                    break;
                case CHARX:
                    {
                    alt166=9;
                    }
                    break;
            }

            switch (alt166) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:641:4: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_9_263980);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:641:18: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_9_263984);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:641:32: final_charM
                    {
                    pushFollow(FOLLOW_final_charM_in_spec_const_9_263988);
                    final_charM();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:641:46: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_9_263992);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:641:60: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_9_263996);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:641:74: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_9_264000);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:641:88: final_charO
                    {
                    pushFollow(FOLLOW_final_charO_in_spec_const_9_264004);
                    final_charO();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:642:3: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_9_264010);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:642:17: final_charX
                    {
                    pushFollow(FOLLOW_final_charX_in_spec_const_9_264014);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:644:1: spec_const_10_3_nm[String nameElement] : CHARN CHARM ;
    public final HPRIMSParser.spec_const_10_3_nm_return spec_const_10_3_nm(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_nm_return retval = new HPRIMSParser.spec_const_10_3_nm_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:646:22: ( CHARN CHARM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:647:3: CHARN CHARM
            {
            match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_nm4035); 

            match(input,CHARM,FOLLOW_CHARM_in_spec_const_10_3_nm4037); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:649:1: spec_const_10_3_ce[String nameElement] : CHARC CHARE ;
    public final HPRIMSParser.spec_const_10_3_ce_return spec_const_10_3_ce(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_ce_return retval = new HPRIMSParser.spec_const_10_3_ce_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:651:22: ( CHARC CHARE )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:652:3: CHARC CHARE
            {
            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_ce4058); 

            match(input,CHARE,FOLLOW_CHARE_in_spec_const_10_3_ce4060); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:654:1: spec_const_10_3_st[String nameElement] : CHARS CHART ;
    public final HPRIMSParser.spec_const_10_3_st_return spec_const_10_3_st(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_st_return retval = new HPRIMSParser.spec_const_10_3_st_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:656:22: ( CHARS CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:657:3: CHARS CHART
            {
            match(input,CHARS,FOLLOW_CHARS_in_spec_const_10_3_st4081); 

            match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_st4083); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:659:1: spec_const_10_3_gc[String nameElement] : CHARG CHARC ;
    public final HPRIMSParser.spec_const_10_3_gc_return spec_const_10_3_gc(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_gc_return retval = new HPRIMSParser.spec_const_10_3_gc_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:661:22: ( CHARG CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:662:3: CHARG CHARC
            {
            match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_gc4104); 

            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_gc4106); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:664:1: spec_const_10_3_tx[String nameElement] : CHART CHARX ;
    public final HPRIMSParser.spec_const_10_3_tx_return spec_const_10_3_tx(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_tx_return retval = new HPRIMSParser.spec_const_10_3_tx_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:666:22: ( CHART CHARX )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:667:3: CHART CHARX
            {
            match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_tx4128); 

            match(input,CHARX,FOLLOW_CHARX_in_spec_const_10_3_tx4130); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:669:1: spec_const_10_3_fic[String nameElement] : ( CHARF CHARI CHARC ) ;
    public final HPRIMSParser.spec_const_10_3_fic_return spec_const_10_3_fic(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_fic_return retval = new HPRIMSParser.spec_const_10_3_fic_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:671:22: ( ( CHARF CHARI CHARC ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:672:3: ( CHARF CHARI CHARC )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:672:3: ( CHARF CHARI CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:672:4: CHARF CHARI CHARC
            {
            match(input,CHARF,FOLLOW_CHARF_in_spec_const_10_3_fic4151); 

            match(input,CHARI,FOLLOW_CHARI_in_spec_const_10_3_fic4153); 

            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_fic4155); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:674:1: spec_const_10_3_std[String nameElement] : ( ( CHARA CHARD ) | ( CHARC CHARK ) | ( CHARC CHARN CHARA ) | ( CHARD CHART ) | ( CHARP CHARN ) | ( CHART CHARN ) | ( CHARG CHARB ) | ( CHARG CHARN ) );
    public final HPRIMSParser.spec_const_10_3_std_return spec_const_10_3_std(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_std_return retval = new HPRIMSParser.spec_const_10_3_std_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:676:22: ( ( CHARA CHARD ) | ( CHARC CHARK ) | ( CHARC CHARN CHARA ) | ( CHARD CHART ) | ( CHARP CHARN ) | ( CHART CHARN ) | ( CHARG CHARB ) | ( CHARG CHARN ) )
            int alt167=8;
            switch ( input.LA(1) ) {
            case CHARA:
                {
                alt167=1;
                }
                break;
            case CHARC:
                {
                int LA167_2 = input.LA(2);

                if ( (LA167_2==CHARK) ) {
                    alt167=2;
                }
                else if ( (LA167_2==CHARN) ) {
                    alt167=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 167, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHARD:
                {
                alt167=4;
                }
                break;
            case CHARP:
                {
                alt167=5;
                }
                break;
            case CHART:
                {
                alt167=6;
                }
                break;
            case CHARG:
                {
                int LA167_6 = input.LA(2);

                if ( (LA167_6==CHARB) ) {
                    alt167=7;
                }
                else if ( (LA167_6==CHARN) ) {
                    alt167=8;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 167, 6, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 167, 0, input);

                throw nvae;

            }

            switch (alt167) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:3: ( CHARA CHARD )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:3: ( CHARA CHARD )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:4: CHARA CHARD
                    {
                    match(input,CHARA,FOLLOW_CHARA_in_spec_const_10_3_std4177); 

                    match(input,CHARD,FOLLOW_CHARD_in_spec_const_10_3_std4179); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:19: ( CHARC CHARK )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:19: ( CHARC CHARK )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:20: CHARC CHARK
                    {
                    match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_std4185); 

                    match(input,CHARK,FOLLOW_CHARK_in_spec_const_10_3_std4187); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:35: ( CHARC CHARN CHARA )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:35: ( CHARC CHARN CHARA )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:36: CHARC CHARN CHARA
                    {
                    match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_std4193); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std4195); 

                    match(input,CHARA,FOLLOW_CHARA_in_spec_const_10_3_std4197); 

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:57: ( CHARD CHART )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:57: ( CHARD CHART )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:58: CHARD CHART
                    {
                    match(input,CHARD,FOLLOW_CHARD_in_spec_const_10_3_std4203); 

                    match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_std4205); 

                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:678:3: ( CHARP CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:678:3: ( CHARP CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:678:4: CHARP CHARN
                    {
                    match(input,CHARP,FOLLOW_CHARP_in_spec_const_10_3_std4213); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std4215); 

                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:678:19: ( CHART CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:678:19: ( CHART CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:678:20: CHART CHARN
                    {
                    match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_std4221); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std4223); 

                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:679:3: ( CHARG CHARB )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:679:3: ( CHARG CHARB )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:679:4: CHARG CHARB
                    {
                    match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_std4231); 

                    match(input,CHARB,FOLLOW_CHARB_in_spec_const_10_3_std4233); 

                    }


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:679:19: ( CHARG CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:679:19: ( CHARG CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:679:20: CHARG CHARN
                    {
                    match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_std4239); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std4241); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:683:1: spec_sized_10_6[String nameElement, int maxSize] : st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )? ;
    public final HPRIMSParser.spec_sized_10_6_return spec_sized_10_6(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_10_6_return retval = new HPRIMSParser.spec_sized_10_6_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:685:22: ( st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:686:3: st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )?
            {
            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_64264);
            st_sized_optionnal(nameElement + ".1", 10);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:687:3: ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==DELIMITER2) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:687:4: DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_64270); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_64272);
                    st_sized_optionnal(nameElement + ".2", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:688:4: ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==DELIMITER2) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:688:5: DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_64279); 

                            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_64281);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:691:1: spec_const_10_9[String nameElement] : ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )? ;
    public final void spec_const_10_9(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:693:22: ( ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:694:3: ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:694:3: ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )?
            int alt170=20;
            switch ( input.LA(1) ) {
                case CHARL:
                    {
                    int LA170_1 = input.LA(2);

                    if ( (LA170_1==CHARL) ) {
                        alt170=3;
                    }
                    else if ( ((LA170_1 >= CR && LA170_1 <= DELIMITER1)||LA170_1==REPETITEUR) ) {
                        alt170=1;
                    }
                    }
                    break;
                case CHARH:
                    {
                    int LA170_2 = input.LA(2);

                    if ( (LA170_2==CHARH) ) {
                        alt170=4;
                    }
                    else if ( ((LA170_2 >= CR && LA170_2 <= DELIMITER1)||LA170_2==REPETITEUR) ) {
                        alt170=2;
                    }
                    }
                    break;
                case CHAR_SYMBOL_INF:
                    {
                    alt170=5;
                    }
                    break;
                case CHAR_SYMBOL_SUP:
                    {
                    alt170=6;
                    }
                    break;
                case CHARN:
                    {
                    int LA170_5 = input.LA(2);

                    if ( (LA170_5==CHARu) ) {
                        alt170=10;
                    }
                    else if ( ((LA170_5 >= CR && LA170_5 <= DELIMITER1)||LA170_5==REPETITEUR) ) {
                        alt170=7;
                    }
                    }
                    break;
                case CHARA:
                    {
                    int LA170_6 = input.LA(2);

                    if ( (LA170_6==CHARA) ) {
                        alt170=9;
                    }
                    else if ( ((LA170_6 >= CR && LA170_6 <= DELIMITER1)||LA170_6==REPETITEUR) ) {
                        alt170=8;
                    }
                    }
                    break;
                case CHARU:
                    {
                    alt170=11;
                    }
                    break;
                case CHARD:
                    {
                    alt170=12;
                    }
                    break;
                case CHARB:
                    {
                    alt170=13;
                    }
                    break;
                case CHARW:
                    {
                    alt170=14;
                    }
                    break;
                case CHARR:
                    {
                    alt170=15;
                    }
                    break;
                case CHARI:
                    {
                    alt170=16;
                    }
                    break;
                case CHARS:
                    {
                    alt170=17;
                    }
                    break;
                case CHARM:
                    {
                    alt170=18;
                    }
                    break;
                case CHARV:
                    {
                    alt170=19;
                    }
                    break;
            }

            switch (alt170) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:694:4: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_10_94309);
                    final_charL();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:694:18: final_charH
                    {
                    pushFollow(FOLLOW_final_charH_in_spec_const_10_94313);
                    final_charH();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:694:32: final_LL
                    {
                    pushFollow(FOLLOW_final_LL_in_spec_const_10_94317);
                    final_LL();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:694:43: final_HH
                    {
                    pushFollow(FOLLOW_final_HH_in_spec_const_10_94321);
                    final_HH();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:694:54: final_symbol_inf
                    {
                    pushFollow(FOLLOW_final_symbol_inf_in_spec_const_10_94325);
                    final_symbol_inf();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:694:73: final_symbol_sup
                    {
                    pushFollow(FOLLOW_final_symbol_sup_in_spec_const_10_94329);
                    final_symbol_sup();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:695:3: final_charN
                    {
                    pushFollow(FOLLOW_final_charN_in_spec_const_10_94335);
                    final_charN();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:695:17: final_charA
                    {
                    pushFollow(FOLLOW_final_charA_in_spec_const_10_94339);
                    final_charA();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:695:31: final_AA
                    {
                    pushFollow(FOLLOW_final_AA_in_spec_const_10_94343);
                    final_AA();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:695:42: final_Null
                    {
                    pushFollow(FOLLOW_final_Null_in_spec_const_10_94347);
                    final_Null();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:695:55: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_10_94351);
                    final_charU();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:695:69: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_10_94355);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:695:83: final_charB
                    {
                    pushFollow(FOLLOW_final_charB_in_spec_const_10_94359);
                    final_charB();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:696:3: final_charW
                    {
                    pushFollow(FOLLOW_final_charW_in_spec_const_10_94365);
                    final_charW();

                    state._fsp--;


                    }
                    break;
                case 15 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:696:17: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_94369);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 16 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:696:31: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_10_94373);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 17 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:696:45: final_charS
                    {
                    pushFollow(FOLLOW_final_charS_in_spec_const_10_94377);
                    final_charS();

                    state._fsp--;


                    }
                    break;
                case 18 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:696:59: final_MS
                    {
                    pushFollow(FOLLOW_final_MS_in_spec_const_10_94381);
                    final_MS();

                    state._fsp--;


                    }
                    break;
                case 19 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:696:70: final_VS
                    {
                    pushFollow(FOLLOW_final_VS_in_spec_const_10_94385);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:698:1: spec_const_10_11[String nameElement] : ( final_charA | final_charS | final_charR | final_charN )? ;
    public final void spec_const_10_11(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:700:22: ( ( final_charA | final_charS | final_charR | final_charN )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:701:3: ( final_charA | final_charS | final_charR | final_charN )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:701:3: ( final_charA | final_charS | final_charR | final_charN )?
            int alt171=5;
            switch ( input.LA(1) ) {
                case CHARA:
                    {
                    alt171=1;
                    }
                    break;
                case CHARS:
                    {
                    alt171=2;
                    }
                    break;
                case CHARR:
                    {
                    alt171=3;
                    }
                    break;
                case CHARN:
                    {
                    alt171=4;
                    }
                    break;
            }

            switch (alt171) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:701:4: final_charA
                    {
                    pushFollow(FOLLOW_final_charA_in_spec_const_10_114406);
                    final_charA();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:701:18: final_charS
                    {
                    pushFollow(FOLLOW_final_charS_in_spec_const_10_114410);
                    final_charS();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:701:32: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_114414);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:701:46: final_charN
                    {
                    pushFollow(FOLLOW_final_charN_in_spec_const_10_114418);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:703:1: spec_const_10_12[String nameElement] : ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )? ;
    public final void spec_const_10_12(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:705:22: ( ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:706:3: ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:706:3: ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )?
            int alt172=9;
            switch ( input.LA(1) ) {
                case CHARR:
                    {
                    alt172=1;
                    }
                    break;
                case CHARP:
                    {
                    alt172=2;
                    }
                    break;
                case CHARF:
                    {
                    alt172=3;
                    }
                    break;
                case CHARC:
                    {
                    alt172=4;
                    }
                    break;
                case CHARI:
                    {
                    alt172=5;
                    }
                    break;
                case CHARD:
                    {
                    alt172=6;
                    }
                    break;
                case CHARX:
                    {
                    alt172=7;
                    }
                    break;
                case CHARU:
                    {
                    alt172=8;
                    }
                    break;
            }

            switch (alt172) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:706:4: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_124439);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:706:18: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_10_124443);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:706:32: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_10_124447);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:706:46: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_10_124451);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:706:60: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_10_124455);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:706:74: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_10_124459);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:707:4: final_charX
                    {
                    pushFollow(FOLLOW_final_charX_in_spec_const_10_124466);
                    final_charX();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:707:18: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_10_124470);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:709:1: spec_const_12_3[String nameElement] : ( final_charP | final_charL )? ;
    public final void spec_const_12_3(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:711:22: ( ( final_charP | final_charL )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:712:3: ( final_charP | final_charL )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:712:3: ( final_charP | final_charL )?
            int alt173=3;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==CHARP) ) {
                alt173=1;
            }
            else if ( (LA173_0==CHARL) ) {
                alt173=2;
            }
            switch (alt173) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:712:4: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_12_34491);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:712:18: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_12_34495);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:714:1: spec_sized_mult_lvl1_st_mandatory_2[String nameElement, int maxSize] : st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return spec_sized_mult_lvl1_st_mandatory_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:716:22: ( st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:717:3: st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_24515);
            st_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_24521); 

            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_24523);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:721:1: spec_sized_mult_lvl1_st_optionnal_2[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return spec_sized_mult_lvl1_st_optionnal_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:723:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:724:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_24546);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:725:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==DELIMITER2) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:725:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"]
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_24552); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_24554);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:729:1: spec_sized_mult_lvl1_st_optionnal_4[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return spec_sized_mult_lvl1_st_optionnal_4(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:731:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:732:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44579);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:733:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==DELIMITER2) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:733:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44585); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44587);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:734:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )?
                    int alt176=2;
                    int LA176_0 = input.LA(1);

                    if ( (LA176_0==DELIMITER2) ) {
                        alt176=1;
                    }
                    switch (alt176) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:734:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44594); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44596);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:735:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
                            int alt175=2;
                            int LA175_0 = input.LA(1);

                            if ( (LA175_0==DELIMITER2) ) {
                                alt175=1;
                            }
                            switch (alt175) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:735:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"]
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44604); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44606);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:739:1: spec_sized_mult_lvl1_st_mandatory_6[String nameElement, int maxSize] : st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".3\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".4\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".5\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".6\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_6_return spec_sized_mult_lvl1_st_mandatory_6(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_6_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_6_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:741:22: ( st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".3\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".4\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".5\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".6\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:742:3: st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".3\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".4\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".5\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".6\"]
            {
            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_64635);
            st_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_64641); 

            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_64643);
            st_nonsized_mandatory(nameElement + ".2");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_64650); 

            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_64652);
            st_nonsized_mandatory(nameElement + ".3");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_64660); 

            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_64662);
            st_nonsized_mandatory(nameElement + ".4");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_64671); 

            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_64673);
            st_nonsized_mandatory(nameElement + ".5");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_64683); 

            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_64685);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:750:1: spec_sized_mult_lvl1_st_optionnal_6[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return spec_sized_mult_lvl1_st_optionnal_6(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:752:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:753:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64708);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:754:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==DELIMITER2) ) {
                alt182=1;
            }
            switch (alt182) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:754:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64715); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64717);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:755:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    int alt181=2;
                    int LA181_0 = input.LA(1);

                    if ( (LA181_0==DELIMITER2) ) {
                        alt181=1;
                    }
                    switch (alt181) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:755:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64725); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64727);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:756:6: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            int alt180=2;
                            int LA180_0 = input.LA(1);

                            if ( (LA180_0==DELIMITER2) ) {
                                alt180=1;
                            }
                            switch (alt180) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:756:7: DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64736); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64738);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:757:7: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    int alt179=2;
                                    int LA179_0 = input.LA(1);

                                    if ( (LA179_0==DELIMITER2) ) {
                                        alt179=1;
                                    }
                                    switch (alt179) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:757:8: DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64748); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64750);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:758:8: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            int alt178=2;
                                            int LA178_0 = input.LA(1);

                                            if ( (LA178_0==DELIMITER2) ) {
                                                alt178=1;
                                            }
                                            switch (alt178) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:758:9: DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64761); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64763);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:762:1: spec_sized_mult_lvl1_st_optionnal_8[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return spec_sized_mult_lvl1_st_optionnal_8(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:764:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:765:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84796);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:766:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )?
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( (LA189_0==DELIMITER2) ) {
                alt189=1;
            }
            switch (alt189) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:766:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84802); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84804);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:767:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )?
                    int alt188=2;
                    int LA188_0 = input.LA(1);

                    if ( (LA188_0==DELIMITER2) ) {
                        alt188=1;
                    }
                    switch (alt188) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:767:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84811); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84813);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:768:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )?
                            int alt187=2;
                            int LA187_0 = input.LA(1);

                            if ( (LA187_0==DELIMITER2) ) {
                                alt187=1;
                            }
                            switch (alt187) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:768:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84821); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84823);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:769:6: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )?
                                    int alt186=2;
                                    int LA186_0 = input.LA(1);

                                    if ( (LA186_0==DELIMITER2) ) {
                                        alt186=1;
                                    }
                                    switch (alt186) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:769:7: DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84832); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84834);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:770:7: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )?
                                            int alt185=2;
                                            int LA185_0 = input.LA(1);

                                            if ( (LA185_0==DELIMITER2) ) {
                                                alt185=1;
                                            }
                                            switch (alt185) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:770:8: DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )?
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84844); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84846);
                                                    st_non_sized_optionnal(nameElement + ".6");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:771:8: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )?
                                                    int alt184=2;
                                                    int LA184_0 = input.LA(1);

                                                    if ( (LA184_0==DELIMITER2) ) {
                                                        alt184=1;
                                                    }
                                                    switch (alt184) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:771:9: DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )?
                                                            {
                                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84857); 

                                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84859);
                                                            st_non_sized_optionnal(nameElement + ".7");

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:772:9: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )?
                                                            int alt183=2;
                                                            int LA183_0 = input.LA(1);

                                                            if ( (LA183_0==DELIMITER2) ) {
                                                                alt183=1;
                                                            }
                                                            switch (alt183) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:772:10: DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"]
                                                                    {
                                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84871); 

                                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84873);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:776:1: spec_sized_mult_lvl2_st_optionnal_3[String nameElement] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final void spec_sized_mult_lvl2_st_optionnal_3(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:778:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:779:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34910);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:780:3: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt191=2;
            int LA191_0 = input.LA(1);

            if ( (LA191_0==DELIMITER3) ) {
                alt191=1;
            }
            switch (alt191) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:780:4: DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34916); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34918);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:781:4: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt190=2;
                    int LA190_0 = input.LA(1);

                    if ( (LA190_0==DELIMITER3) ) {
                        alt190=1;
                    }
                    switch (alt190) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:781:5: DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34925); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34927);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:783:1: spec_sized_mult_lvl2_st_optionnal_6[String nameElement] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? ;
    public final void spec_sized_mult_lvl2_st_optionnal_6(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:785:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:786:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64950);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:787:3: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            int alt196=2;
            int LA196_0 = input.LA(1);

            if ( (LA196_0==DELIMITER3) ) {
                alt196=1;
            }
            switch (alt196) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:787:4: DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64956); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64958);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:788:4: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    int alt195=2;
                    int LA195_0 = input.LA(1);

                    if ( (LA195_0==DELIMITER3) ) {
                        alt195=1;
                    }
                    switch (alt195) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:788:5: DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64965); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64967);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:789:5: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            int alt194=2;
                            int LA194_0 = input.LA(1);

                            if ( (LA194_0==DELIMITER3) ) {
                                alt194=1;
                            }
                            switch (alt194) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:789:6: DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64975); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64977);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:790:6: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    int alt193=2;
                                    int LA193_0 = input.LA(1);

                                    if ( (LA193_0==DELIMITER3) ) {
                                        alt193=1;
                                    }
                                    switch (alt193) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:790:7: DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64986); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64988);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:791:7: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            int alt192=2;
                                            int LA192_0 = input.LA(1);

                                            if ( (LA192_0==DELIMITER3) ) {
                                                alt192=1;
                                            }
                                            switch (alt192) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:791:8: DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64998); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_65000);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:793:1: spec_sized_mult_lvl1_nm_optionnal_2[String nameElement, int maxSize] : nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return spec_sized_mult_lvl1_nm_optionnal_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:795:22: ( nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:796:3: nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_25029);
            nm_nonsized_optionnal(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_optionnal_25034); 

            pushFollow(FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_25036);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:800:1: spec_sized_mult_lvl1_nm_mandatory_2[String nameElement, int maxSize] : nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return spec_sized_mult_lvl1_nm_mandatory_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:802:22: ( nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:803:3: nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_25061);
            nm_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_mandatory_25066); 

            pushFollow(FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_25068);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:807:1: spec_sized_cna[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_cna_return spec_sized_cna(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_cna_return retval = new HPRIMSParser.spec_sized_cna_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:809:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:810:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_cna5091);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:811:4: ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt198=2;
            int LA198_0 = input.LA(1);

            if ( (LA198_0==DELIMITER2) ) {
                alt198=1;
            }
            switch (alt198) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:811:5: DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna5098); 

                    pushFollow(FOLLOW_spec_sized_mult_lvl2_st_optionnal_6_in_spec_sized_cna5100);
                    spec_sized_mult_lvl2_st_optionnal_6(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt197=2;
                    int LA197_0 = input.LA(1);

                    if ( (LA197_0==DELIMITER2) ) {
                        alt197=1;
                    }
                    switch (alt197) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna5108); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_cna5110);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:820:1: spec_sized_8_3[String nameElement, int maxSize] : ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_8_3_return spec_sized_8_3(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_8_3_return retval = new HPRIMSParser.spec_sized_8_3_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:822:22: ( ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:823:3: ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:823:3: ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt200=2;
            int LA200_0 = input.LA(1);

            if ( ((LA200_0 >= CHARA && LA200_0 <= CHIFFRE9)||(LA200_0 >= LETTRE && LA200_0 <= POINT)) ) {
                alt200=1;
            }
            switch (alt200) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:823:4: st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    pushFollow(FOLLOW_st_sized_mandatory_in_spec_sized_8_35142);
                    st_sized_mandatory(nameElement + ".1", 16);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:824:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt199=2;
                    int LA199_0 = input.LA(1);

                    if ( (LA199_0==DELIMITER2) ) {
                        alt199=1;
                    }
                    switch (alt199) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:824:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_8_35149); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_8_35151);
                            st_non_sized_optionnal(nameElement + ".2");

                            state._fsp--;


                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_8_35159); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_8_35161);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:836:1: spec_sized_9_3[String nameElement, int maxSize] : st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )? ;
    public final HPRIMSParser.spec_sized_9_3_return spec_sized_9_3(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_9_3_return retval = new HPRIMSParser.spec_sized_9_3_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:838:22: ( st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:840:3: st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )?
            {
            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_9_35201);
            st_sized_optionnal(nameElement + ".1", 12);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:841:3: ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )?
            int alt201=2;
            int LA201_0 = input.LA(1);

            if ( (LA201_0==DELIMITER2) ) {
                alt201=1;
            }
            switch (alt201) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:841:4: DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10]
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_35207); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_9_35209);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:844:1: spec_non_sized_9_8[String nameElement] : ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )? ;
    public final void spec_non_sized_9_8(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:846:22: ( ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:847:3: ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )?
            {
            pushFollow(FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_85234);
            ts_sized_optionnal(nameElement + ".1", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:848:4: ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )?
            int alt202=2;
            int LA202_0 = input.LA(1);

            if ( (LA202_0==REPETITEUR) ) {
                alt202=1;
            }
            switch (alt202) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:848:5: REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_spec_non_sized_9_85241); 

                    pushFollow(FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_85243);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:850:1: spec_sized_9_16[String nameElement, int maxSize] : spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_9_16_return spec_sized_9_16(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_9_16_return retval = new HPRIMSParser.spec_sized_9_16_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:852:22: ( spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:853:3: spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_spec_sized_mult_lvl2_st_optionnal_3_in_spec_sized_9_165264);
            spec_sized_mult_lvl2_st_optionnal_3(nameElement + ".2");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:854:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt204=2;
            int LA204_0 = input.LA(1);

            if ( (LA204_0==DELIMITER2) ) {
                alt204=1;
            }
            switch (alt204) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:854:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_165270); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_9_165272);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:855:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt203=2;
                    int LA203_0 = input.LA(1);

                    if ( (LA203_0==DELIMITER2) ) {
                        alt203=1;
                    }
                    switch (alt203) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:855:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_165279); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_9_165281);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:858:1: spec_sized_10_4[String nameElement, int maxsize] : st_nonsized_mandatory[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_10_4_return spec_sized_10_4(String nameElement, int maxsize) throws RecognitionException {
        HPRIMSParser.spec_sized_10_4_return retval = new HPRIMSParser.spec_sized_10_4_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:860:22: ( st_nonsized_mandatory[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:861:3: st_nonsized_mandatory[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_10_45308);
            st_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:862:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            int alt209=2;
            int LA209_0 = input.LA(1);

            if ( (LA209_0==DELIMITER2) ) {
                alt209=1;
            }
            switch (alt209) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:862:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_45314); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_45316);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:863:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    int alt208=2;
                    int LA208_0 = input.LA(1);

                    if ( (LA208_0==DELIMITER2) ) {
                        alt208=1;
                    }
                    switch (alt208) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:863:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_45323); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_45325);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:864:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            int alt207=2;
                            int LA207_0 = input.LA(1);

                            if ( (LA207_0==DELIMITER2) ) {
                                alt207=1;
                            }
                            switch (alt207) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:864:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_45333); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_45335);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:865:6: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    int alt206=2;
                                    int LA206_0 = input.LA(1);

                                    if ( (LA206_0==DELIMITER2) ) {
                                        alt206=1;
                                    }
                                    switch (alt206) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:865:7: DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_45344); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_45346);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:866:7: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            int alt205=2;
                                            int LA205_0 = input.LA(1);

                                            if ( (LA205_0==DELIMITER2) ) {
                                                alt205=1;
                                            }
                                            switch (alt205) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:866:8: DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_45356); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_45358);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:869:1: spec_sized_10_6_tx[String nameElement, int maxSize] : (g= final_spec_10_6_tx )? ;
    public final void spec_sized_10_6_tx(String nameElement, int maxSize) throws RecognitionException {
        String g =null;



          ParserRuleReturnScope retval = new ParserRuleReturnScope();
          retval.start = input.LT(1);
          startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:874:22: ( (g= final_spec_10_6_tx )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:3: (g= final_spec_10_6_tx )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:4: (g= final_spec_10_6_tx )?
            int alt210=2;
            int LA210_0 = input.LA(1);

            if ( ((LA210_0 >= CHARA && LA210_0 <= CHIFFRE9)||LA210_0==DELIMITER2||(LA210_0 >= LETTRE && LA210_0 <= POINT)) ) {
                alt210=1;
            }
            switch (alt210) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:4: g= final_spec_10_6_tx
                    {
                    pushFollow(FOLLOW_final_spec_10_6_tx_in_spec_sized_10_6_tx5393);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:879:1: spec_sized_tn[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )? ;
    public final HPRIMSParser.spec_sized_tn_return spec_sized_tn(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_tn_return retval = new HPRIMSParser.spec_sized_tn_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:881:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:882:2: st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_tn5415);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:883:3: ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )?
            int alt211=2;
            int LA211_0 = input.LA(1);

            if ( (LA211_0==REPETITEUR) ) {
                alt211=1;
            }
            switch (alt211) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:883:4: REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_spec_sized_tn5421); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_tn5423);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:889:1: st_sized_optionnal[String nameElement, int maxSize] : ( final_st )? ;
    public final HPRIMSParser.st_sized_optionnal_return st_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.st_sized_optionnal_return retval = new HPRIMSParser.st_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:891:22: ( ( final_st )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:892:3: ( final_st )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:892:3: ( final_st )?
            int alt212=2;
            int LA212_0 = input.LA(1);

            if ( ((LA212_0 >= CHARA && LA212_0 <= CHIFFRE9)||(LA212_0 >= LETTRE && LA212_0 <= POINT)) ) {
                alt212=1;
            }
            switch (alt212) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:892:3: final_st
                    {
                    pushFollow(FOLLOW_final_st_in_st_sized_optionnal5451);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:896:1: st_sized_mandatory[String nameElement, int maxSize] : final_st ;
    public final HPRIMSParser.st_sized_mandatory_return st_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.st_sized_mandatory_return retval = new HPRIMSParser.st_sized_mandatory_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:898:22: ( final_st )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:899:3: final_st
            {
            pushFollow(FOLLOW_final_st_in_st_sized_mandatory5474);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:902:1: st_non_sized_optionnal[String nameElement] : ( final_st )? ;
    public final void st_non_sized_optionnal(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:904:22: ( ( final_st )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:905:3: ( final_st )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:905:3: ( final_st )?
            int alt213=2;
            int LA213_0 = input.LA(1);

            if ( ((LA213_0 >= CHARA && LA213_0 <= CHIFFRE9)||(LA213_0 >= LETTRE && LA213_0 <= POINT)) ) {
                alt213=1;
            }
            switch (alt213) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:905:3: final_st
                    {
                    pushFollow(FOLLOW_final_st_in_st_non_sized_optionnal5496);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:907:1: st_nonsized_mandatory[String nameElement] : final_st ;
    public final void st_nonsized_mandatory(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:909:22: ( final_st )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:910:3: final_st
            {
            pushFollow(FOLLOW_final_st_in_st_nonsized_mandatory5515);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:912:1: nm_sized_optionnal[String nameElement, int maxSize] : ( final_nm )? ;
    public final HPRIMSParser.nm_sized_optionnal_return nm_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_sized_optionnal_return retval = new HPRIMSParser.nm_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:914:22: ( ( final_nm )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:915:3: ( final_nm )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:915:3: ( final_nm )?
            int alt214=2;
            int LA214_0 = input.LA(1);

            if ( ((LA214_0 >= CHIFFRE0 && LA214_0 <= CHIFFRE9)||(LA214_0 >= MOINS && LA214_0 <= POINT)) ) {
                alt214=1;
            }
            switch (alt214) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:915:3: final_nm
                    {
                    pushFollow(FOLLOW_final_nm_in_nm_sized_optionnal5533);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:919:1: nm_integer_sized_optionnal[String nameElement, int maxSize] : ( final_nm_integer )? ;
    public final HPRIMSParser.nm_integer_sized_optionnal_return nm_integer_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_integer_sized_optionnal_return retval = new HPRIMSParser.nm_integer_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:921:22: ( ( final_nm_integer )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:922:3: ( final_nm_integer )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:922:3: ( final_nm_integer )?
            int alt215=2;
            int LA215_0 = input.LA(1);

            if ( ((LA215_0 >= CHIFFRE0 && LA215_0 <= CHIFFRE9)) ) {
                alt215=1;
            }
            switch (alt215) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:922:3: final_nm_integer
                    {
                    pushFollow(FOLLOW_final_nm_integer_in_nm_integer_sized_optionnal5556);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:926:1: nm_integer_sized_mandatory[String nameElement, int maxSize] : final_nm_integer ;
    public final HPRIMSParser.nm_integer_sized_mandatory_return nm_integer_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_integer_sized_mandatory_return retval = new HPRIMSParser.nm_integer_sized_mandatory_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:928:22: ( final_nm_integer )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:929:3: final_nm_integer
            {
            pushFollow(FOLLOW_final_nm_integer_in_nm_integer_sized_mandatory5584);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:933:1: ts_sized_optionnal[String nameElement, int maxSize] : ( final_ts )? ;
    public final HPRIMSParser.ts_sized_optionnal_return ts_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.ts_sized_optionnal_return retval = new HPRIMSParser.ts_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:935:22: ( ( final_ts )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:936:3: ( final_ts )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:936:3: ( final_ts )?
            int alt216=2;
            int LA216_0 = input.LA(1);

            if ( ((LA216_0 >= CHIFFRE0 && LA216_0 <= CHIFFRE9)) ) {
                alt216=1;
            }
            switch (alt216) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:936:3: final_ts
                    {
                    pushFollow(FOLLOW_final_ts_in_ts_sized_optionnal5607);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:940:1: ts_sized_mandatory[String nameElement, int maxSize] : final_ts ;
    public final HPRIMSParser.ts_sized_mandatory_return ts_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.ts_sized_mandatory_return retval = new HPRIMSParser.ts_sized_mandatory_return();
        retval.start = input.LT(1);


        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:942:22: ( final_ts )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:943:3: final_ts
            {
            pushFollow(FOLLOW_final_ts_in_ts_sized_mandatory5630);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:946:1: nm_nonsized_mandatory[String nameElement] : final_nm ;
    public final void nm_nonsized_mandatory(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:948:22: ( final_nm )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:949:3: final_nm
            {
            pushFollow(FOLLOW_final_nm_in_nm_nonsized_mandatory5652);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:951:1: nm_nonsized_optionnal[String nameElement] : ( final_nm )? ;
    public final void nm_nonsized_optionnal(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:953:22: ( ( final_nm )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:954:3: ( final_nm )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:954:3: ( final_nm )?
            int alt217=2;
            int LA217_0 = input.LA(1);

            if ( ((LA217_0 >= CHIFFRE0 && LA217_0 <= CHIFFRE9)||(LA217_0 >= MOINS && LA217_0 <= POINT)) ) {
                alt217=1;
            }
            switch (alt217) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:954:3: final_nm
                    {
                    pushFollow(FOLLOW_final_nm_in_nm_nonsized_optionnal5670);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:956:1: spec_const_7_13_1_version_2_0[String nameElement] : final_version_2_0 ;
    public final void spec_const_7_13_1_version_2_0(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:958:22: ( final_version_2_0 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:959:3: final_version_2_0
            {
            pushFollow(FOLLOW_final_version_2_0_in_spec_const_7_13_1_version_2_05689);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:961:1: spec_const_7_13_1_version_2_1[String nameElement] : final_version_2_1 ;
    public final void spec_const_7_13_1_version_2_1(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:963:22: ( final_version_2_1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:964:3: final_version_2_1
            {
            pushFollow(FOLLOW_final_version_2_1_in_spec_const_7_13_1_version_2_15707);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:966:1: spec_const_7_13_1_version_2_2[String nameElement] : final_version_2_2 ;
    public final void spec_const_7_13_1_version_2_2(String nameElement) throws RecognitionException {
        startElement(nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:968:22: ( final_version_2_2 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:969:3: final_version_2_2
            {
            pushFollow(FOLLOW_final_version_2_2_in_spec_const_7_13_1_version_2_25727);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:973:1: final_spec_10_6_tx returns [String consoText] : g= content_spec_10_6 ;
    public final String final_spec_10_6_tx() throws RecognitionException {
        String consoText = null;


        String g =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:973:46: (g= content_spec_10_6 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:974:3: g= content_spec_10_6
            {
            pushFollow(FOLLOW_content_spec_10_6_in_final_spec_10_6_tx5744);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:978:1: content_spec_10_6 returns [String consoText] : (r= character | DELIMITER2 ) (p= content_spec_10_6 )? ;
    public final String content_spec_10_6() throws RecognitionException {
        String consoText = null;


        HPRIMSParser.character_return r =null;

        String p =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:978:45: ( (r= character | DELIMITER2 ) (p= content_spec_10_6 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:979:3: (r= character | DELIMITER2 ) (p= content_spec_10_6 )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:979:3: (r= character | DELIMITER2 )
            int alt218=2;
            int LA218_0 = input.LA(1);

            if ( ((LA218_0 >= CHARA && LA218_0 <= CHIFFRE9)||(LA218_0 >= LETTRE && LA218_0 <= POINT)) ) {
                alt218=1;
            }
            else if ( (LA218_0==DELIMITER2) ) {
                alt218=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 218, 0, input);

                throw nvae;

            }
            switch (alt218) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:979:4: r= character
                    {
                    pushFollow(FOLLOW_character_in_content_spec_10_65766);
                    r=character();

                    state._fsp--;


                    consoText = (r!=null?input.toString(r.start,r.stop):null);

                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:979:42: DELIMITER2
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_content_spec_10_65772); 

                    consoText = "\n";

                    }
                    break;

            }


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:980:6: (p= content_spec_10_6 )?
            int alt219=2;
            int LA219_0 = input.LA(1);

            if ( ((LA219_0 >= CHARA && LA219_0 <= CHIFFRE9)||LA219_0==DELIMITER2||(LA219_0 >= LETTRE && LA219_0 <= POINT)) ) {
                alt219=1;
            }
            switch (alt219) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:980:6: p= content_spec_10_6
                    {
                    pushFollow(FOLLOW_content_spec_10_6_in_content_spec_10_65783);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:982:1: final_ts : chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )? ;
    public final HPRIMSParser.final_ts_return final_ts() throws RecognitionException {
        HPRIMSParser.final_ts_return retval = new HPRIMSParser.final_ts_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:982:9: ( chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:983:3: chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )?
            {
            pushFollow(FOLLOW_chiffre_in_final_ts5795);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5797);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5801);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5803);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5805);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5809);
            chiffre();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:985:11: ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )?
            int alt222=2;
            int LA222_0 = input.LA(1);

            if ( ((LA222_0 >= CHIFFRE0 && LA222_0 <= CHIFFRE9)) ) {
                alt222=1;
            }
            switch (alt222) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:985:12: chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )?
                    {
                    pushFollow(FOLLOW_chiffre_in_final_ts5812);
                    chiffre();

                    state._fsp--;


                    pushFollow(FOLLOW_chiffre_in_final_ts5814);
                    chiffre();

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:986:3: ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )?
                    int alt221=2;
                    int LA221_0 = input.LA(1);

                    if ( ((LA221_0 >= CHIFFRE0 && LA221_0 <= CHIFFRE9)) ) {
                        alt221=1;
                    }
                    switch (alt221) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:986:4: chiffre chiffre chiffre chiffre ( chiffre chiffre )?
                            {
                            pushFollow(FOLLOW_chiffre_in_final_ts5819);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5821);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5823);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5827);
                            chiffre();

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:987:11: ( chiffre chiffre )?
                            int alt220=2;
                            int LA220_0 = input.LA(1);

                            if ( ((LA220_0 >= CHIFFRE0 && LA220_0 <= CHIFFRE9)) ) {
                                alt220=1;
                            }
                            switch (alt220) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:987:12: chiffre chiffre
                                    {
                                    pushFollow(FOLLOW_chiffre_in_final_ts5830);
                                    chiffre();

                                    state._fsp--;


                                    pushFollow(FOLLOW_chiffre_in_final_ts5832);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:990:1: final_st : ( character )+ ;
    public final HPRIMSParser.final_st_return final_st() throws RecognitionException {
        HPRIMSParser.final_st_return retval = new HPRIMSParser.final_st_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:990:9: ( ( character )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:991:3: ( character )+
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:991:3: ( character )+
            int cnt223=0;
            loop223:
            do {
                int alt223=2;
                int LA223_0 = input.LA(1);

                if ( ((LA223_0 >= CHARA && LA223_0 <= CHIFFRE9)||(LA223_0 >= LETTRE && LA223_0 <= POINT)) ) {
                    alt223=1;
                }


                switch (alt223) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:991:3: character
            	    {
            	    pushFollow(FOLLOW_character_in_final_st5851);
            	    character();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt223 >= 1 ) break loop223;
                        EarlyExitException eee =
                            new EarlyExitException(223, input);
                        throw eee;
                }
                cnt223++;
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:994:1: final_nm : ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) ) ;
    public final HPRIMSParser.final_nm_return final_nm() throws RecognitionException {
        HPRIMSParser.final_nm_return retval = new HPRIMSParser.final_nm_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:994:9: ( ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:995:3: ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:995:3: ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:995:4: ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:995:4: ( PLUS | MOINS )?
            int alt224=2;
            int LA224_0 = input.LA(1);

            if ( ((LA224_0 >= MOINS && LA224_0 <= PLUS)) ) {
                alt224=1;
            }
            switch (alt224) {
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:996:3: ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) )
            int alt229=2;
            int LA229_0 = input.LA(1);

            if ( ((LA229_0 >= CHIFFRE0 && LA229_0 <= CHIFFRE9)) ) {
                alt229=1;
            }
            else if ( (LA229_0==POINT) ) {
                alt229=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 229, 0, input);

                throw nvae;

            }
            switch (alt229) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:996:4: ( ( chiffre )+ ( POINT ( chiffre )* )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:996:4: ( ( chiffre )+ ( POINT ( chiffre )* )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:996:5: ( chiffre )+ ( POINT ( chiffre )* )?
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:996:5: ( chiffre )+
                    int cnt225=0;
                    loop225:
                    do {
                        int alt225=2;
                        int LA225_0 = input.LA(1);

                        if ( ((LA225_0 >= CHIFFRE0 && LA225_0 <= CHIFFRE9)) ) {
                            alt225=1;
                        }


                        switch (alt225) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:996:5: chiffre
                    	    {
                    	    pushFollow(FOLLOW_chiffre_in_final_nm5880);
                    	    chiffre();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt225 >= 1 ) break loop225;
                                EarlyExitException eee =
                                    new EarlyExitException(225, input);
                                throw eee;
                        }
                        cnt225++;
                    } while (true);


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:996:14: ( POINT ( chiffre )* )?
                    int alt227=2;
                    int LA227_0 = input.LA(1);

                    if ( (LA227_0==POINT) ) {
                        alt227=1;
                    }
                    switch (alt227) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:996:15: POINT ( chiffre )*
                            {
                            match(input,POINT,FOLLOW_POINT_in_final_nm5884); 

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:996:21: ( chiffre )*
                            loop226:
                            do {
                                int alt226=2;
                                int LA226_0 = input.LA(1);

                                if ( ((LA226_0 >= CHIFFRE0 && LA226_0 <= CHIFFRE9)) ) {
                                    alt226=1;
                                }


                                switch (alt226) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:996:21: chiffre
                            	    {
                            	    pushFollow(FOLLOW_chiffre_in_final_nm5886);
                            	    chiffre();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop226;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:997:4: ( POINT ( chiffre )+ )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:997:4: ( POINT ( chiffre )+ )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:997:5: POINT ( chiffre )+
                    {
                    match(input,POINT,FOLLOW_POINT_in_final_nm5896); 

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:997:11: ( chiffre )+
                    int cnt228=0;
                    loop228:
                    do {
                        int alt228=2;
                        int LA228_0 = input.LA(1);

                        if ( ((LA228_0 >= CHIFFRE0 && LA228_0 <= CHIFFRE9)) ) {
                            alt228=1;
                        }


                        switch (alt228) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:997:11: chiffre
                    	    {
                    	    pushFollow(FOLLOW_chiffre_in_final_nm5898);
                    	    chiffre();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt228 >= 1 ) break loop228;
                                EarlyExitException eee =
                                    new EarlyExitException(228, input);
                                throw eee;
                        }
                        cnt228++;
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1000:1: final_nm_integer : ( chiffre )+ ;
    public final HPRIMSParser.final_nm_integer_return final_nm_integer() throws RecognitionException {
        HPRIMSParser.final_nm_integer_return retval = new HPRIMSParser.final_nm_integer_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1000:17: ( ( chiffre )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1001:3: ( chiffre )+
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1001:3: ( chiffre )+
            int cnt230=0;
            loop230:
            do {
                int alt230=2;
                int LA230_0 = input.LA(1);

                if ( ((LA230_0 >= CHIFFRE0 && LA230_0 <= CHIFFRE9)) ) {
                    alt230=1;
                }


                switch (alt230) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1001:3: chiffre
            	    {
            	    pushFollow(FOLLOW_chiffre_in_final_nm_integer5915);
            	    chiffre();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt230 >= 1 ) break loop230;
                        EarlyExitException eee =
                            new EarlyExitException(230, input);
                        throw eee;
                }
                cnt230++;
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1004:1: final_ORU : CHARO CHARR CHARU ;
    public final HPRIMSParser.final_ORU_return final_ORU() throws RecognitionException {
        HPRIMSParser.final_ORU_return retval = new HPRIMSParser.final_ORU_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1004:10: ( CHARO CHARR CHARU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1004:12: CHARO CHARR CHARU
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_ORU5927); 

            match(input,CHARR,FOLLOW_CHARR_in_final_ORU5929); 

            match(input,CHARU,FOLLOW_CHARU_in_final_ORU5931); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1005:1: final_ORM : CHARO CHARR CHARM ;
    public final HPRIMSParser.final_ORM_return final_ORM() throws RecognitionException {
        HPRIMSParser.final_ORM_return retval = new HPRIMSParser.final_ORM_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1005:10: ( CHARO CHARR CHARM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1005:12: CHARO CHARR CHARM
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_ORM5939); 

            match(input,CHARR,FOLLOW_CHARR_in_final_ORM5941); 

            match(input,CHARM,FOLLOW_CHARM_in_final_ORM5943); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1007:1: final_CART : CHARC CHARA CHARR CHART ;
    public final HPRIMSParser.final_CART_return final_CART() throws RecognitionException {
        HPRIMSParser.final_CART_return retval = new HPRIMSParser.final_CART_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1007:11: ( CHARC CHARA CHARR CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1007:13: CHARC CHARA CHARR CHART
            {
            match(input,CHARC,FOLLOW_CHARC_in_final_CART5952); 

            match(input,CHARA,FOLLOW_CHARA_in_final_CART5954); 

            match(input,CHARR,FOLLOW_CHARR_in_final_CART5956); 

            match(input,CHART,FOLLOW_CHART_in_final_CART5958); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1008:1: final_PORT : CHARP CHARO CHARR CHART ;
    public final HPRIMSParser.final_PORT_return final_PORT() throws RecognitionException {
        HPRIMSParser.final_PORT_return retval = new HPRIMSParser.final_PORT_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1008:11: ( CHARP CHARO CHARR CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1008:13: CHARP CHARO CHARR CHART
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_PORT5966); 

            match(input,CHARO,FOLLOW_CHARO_in_final_PORT5968); 

            match(input,CHARR,FOLLOW_CHARR_in_final_PORT5970); 

            match(input,CHART,FOLLOW_CHART_in_final_PORT5972); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1009:1: final_WHLC : CHARW CHARH CHARL CHARC ;
    public final HPRIMSParser.final_WHLC_return final_WHLC() throws RecognitionException {
        HPRIMSParser.final_WHLC_return retval = new HPRIMSParser.final_WHLC_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1009:11: ( CHARW CHARH CHARL CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1009:13: CHARW CHARH CHARL CHARC
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_WHLC5980); 

            match(input,CHARH,FOLLOW_CHARH_in_final_WHLC5982); 

            match(input,CHARL,FOLLOW_CHARL_in_final_WHLC5984); 

            match(input,CHARC,FOLLOW_CHARC_in_final_WHLC5986); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1010:1: final_WALK : CHARW CHARA CHARL CHARK ;
    public final HPRIMSParser.final_WALK_return final_WALK() throws RecognitionException {
        HPRIMSParser.final_WALK_return retval = new HPRIMSParser.final_WALK_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1010:11: ( CHARW CHARA CHARL CHARK )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1010:13: CHARW CHARA CHARL CHARK
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_WALK5994); 

            match(input,CHARA,FOLLOW_CHARA_in_final_WALK5996); 

            match(input,CHARL,FOLLOW_CHARL_in_final_WALK5998); 

            match(input,CHARK,FOLLOW_CHARK_in_final_WALK6000); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1012:1: final_LL : CHARL CHARL ;
    public final HPRIMSParser.final_LL_return final_LL() throws RecognitionException {
        HPRIMSParser.final_LL_return retval = new HPRIMSParser.final_LL_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1012:9: ( CHARL CHARL )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1012:11: CHARL CHARL
            {
            match(input,CHARL,FOLLOW_CHARL_in_final_LL6009); 

            match(input,CHARL,FOLLOW_CHARL_in_final_LL6011); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1013:1: final_AA : CHARA CHARA ;
    public final HPRIMSParser.final_AA_return final_AA() throws RecognitionException {
        HPRIMSParser.final_AA_return retval = new HPRIMSParser.final_AA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1013:9: ( CHARA CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1013:11: CHARA CHARA
            {
            match(input,CHARA,FOLLOW_CHARA_in_final_AA6019); 

            match(input,CHARA,FOLLOW_CHARA_in_final_AA6021); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1014:1: final_HH : CHARH CHARH ;
    public final HPRIMSParser.final_HH_return final_HH() throws RecognitionException {
        HPRIMSParser.final_HH_return retval = new HPRIMSParser.final_HH_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1014:9: ( CHARH CHARH )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1014:11: CHARH CHARH
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_HH6029); 

            match(input,CHARH,FOLLOW_CHARH_in_final_HH6031); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1015:1: final_MS : CHARM CHARS ;
    public final HPRIMSParser.final_MS_return final_MS() throws RecognitionException {
        HPRIMSParser.final_MS_return retval = new HPRIMSParser.final_MS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1015:9: ( CHARM CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1015:11: CHARM CHARS
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_MS6039); 

            match(input,CHARS,FOLLOW_CHARS_in_final_MS6041); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1016:1: final_VS : CHARV CHARS ;
    public final HPRIMSParser.final_VS_return final_VS() throws RecognitionException {
        HPRIMSParser.final_VS_return retval = new HPRIMSParser.final_VS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1016:9: ( CHARV CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1016:11: CHARV CHARS
            {
            match(input,CHARV,FOLLOW_CHARV_in_final_VS6049); 

            match(input,CHARS,FOLLOW_CHARS_in_final_VS6051); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1017:1: final_Null : CHARN CHARu CHARl CHARl ;
    public final HPRIMSParser.final_Null_return final_Null() throws RecognitionException {
        HPRIMSParser.final_Null_return retval = new HPRIMSParser.final_Null_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1017:11: ( CHARN CHARu CHARl CHARl )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1017:13: CHARN CHARu CHARl CHARl
            {
            match(input,CHARN,FOLLOW_CHARN_in_final_Null6059); 

            match(input,CHARu,FOLLOW_CHARu_in_final_Null6061); 

            match(input,CHARl,FOLLOW_CHARl_in_final_Null6063); 

            match(input,CHARl,FOLLOW_CHARl_in_final_Null6065); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1018:1: final_symbol_inf : CHAR_SYMBOL_INF ;
    public final HPRIMSParser.final_symbol_inf_return final_symbol_inf() throws RecognitionException {
        HPRIMSParser.final_symbol_inf_return retval = new HPRIMSParser.final_symbol_inf_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1018:17: ( CHAR_SYMBOL_INF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1018:19: CHAR_SYMBOL_INF
            {
            match(input,CHAR_SYMBOL_INF,FOLLOW_CHAR_SYMBOL_INF_in_final_symbol_inf6073); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1019:1: final_symbol_sup : CHAR_SYMBOL_SUP ;
    public final HPRIMSParser.final_symbol_sup_return final_symbol_sup() throws RecognitionException {
        HPRIMSParser.final_symbol_sup_return retval = new HPRIMSParser.final_symbol_sup_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1019:17: ( CHAR_SYMBOL_SUP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1019:19: CHAR_SYMBOL_SUP
            {
            match(input,CHAR_SYMBOL_SUP,FOLLOW_CHAR_SYMBOL_SUP_in_final_symbol_sup6081); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1021:1: final_version_2_0 : CHARH CHIFFRE2 POINT CHIFFRE0 ;
    public final HPRIMSParser.final_version_2_0_return final_version_2_0() throws RecognitionException {
        HPRIMSParser.final_version_2_0_return retval = new HPRIMSParser.final_version_2_0_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1021:18: ( CHARH CHIFFRE2 POINT CHIFFRE0 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1021:20: CHARH CHIFFRE2 POINT CHIFFRE0
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_06090); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_06092); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_06094); 

            match(input,CHIFFRE0,FOLLOW_CHIFFRE0_in_final_version_2_06096); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1022:1: final_version_2_1 : CHARH CHIFFRE2 POINT CHIFFRE1 ;
    public final HPRIMSParser.final_version_2_1_return final_version_2_1() throws RecognitionException {
        HPRIMSParser.final_version_2_1_return retval = new HPRIMSParser.final_version_2_1_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1022:18: ( CHARH CHIFFRE2 POINT CHIFFRE1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1022:20: CHARH CHIFFRE2 POINT CHIFFRE1
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_16104); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_16106); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_16108); 

            match(input,CHIFFRE1,FOLLOW_CHIFFRE1_in_final_version_2_16110); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1023:1: final_version_2_2 : CHARH CHIFFRE2 POINT CHIFFRE2 ;
    public final HPRIMSParser.final_version_2_2_return final_version_2_2() throws RecognitionException {
        HPRIMSParser.final_version_2_2_return retval = new HPRIMSParser.final_version_2_2_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1023:18: ( CHARH CHIFFRE2 POINT CHIFFRE2 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1023:20: CHARH CHIFFRE2 POINT CHIFFRE2
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_26118); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_26120); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_26122); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_26124); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1025:1: final_OP : CHARO CHARP ;
    public final HPRIMSParser.final_OP_return final_OP() throws RecognitionException {
        HPRIMSParser.final_OP_return retval = new HPRIMSParser.final_OP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1025:9: ( CHARO CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1025:11: CHARO CHARP
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_OP6133); 

            match(input,CHARP,FOLLOW_CHARP_in_final_OP6135); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1026:1: final_IP : CHARI CHARP ;
    public final HPRIMSParser.final_IP_return final_IP() throws RecognitionException {
        HPRIMSParser.final_IP_return retval = new HPRIMSParser.final_IP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1026:9: ( CHARI CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1026:11: CHARI CHARP
            {
            match(input,CHARI,FOLLOW_CHARI_in_final_IP6143); 

            match(input,CHARP,FOLLOW_CHARP_in_final_IP6145); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1027:1: final_ER : CHARE CHARR ;
    public final HPRIMSParser.final_ER_return final_ER() throws RecognitionException {
        HPRIMSParser.final_ER_return retval = new HPRIMSParser.final_ER_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1027:9: ( CHARE CHARR )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1027:11: CHARE CHARR
            {
            match(input,CHARE,FOLLOW_CHARE_in_final_ER6153); 

            match(input,CHARR,FOLLOW_CHARR_in_final_ER6155); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1028:1: final_PA : CHARP CHARA ;
    public final HPRIMSParser.final_PA_return final_PA() throws RecognitionException {
        HPRIMSParser.final_PA_return retval = new HPRIMSParser.final_PA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1028:9: ( CHARP CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1028:11: CHARP CHARA
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_PA6163); 

            match(input,CHARA,FOLLOW_CHARA_in_final_PA6165); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1029:1: final_MP : CHARM CHARP ;
    public final HPRIMSParser.final_MP_return final_MP() throws RecognitionException {
        HPRIMSParser.final_MP_return retval = new HPRIMSParser.final_MP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1029:9: ( CHARM CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1029:11: CHARM CHARP
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_MP6173); 

            match(input,CHARP,FOLLOW_CHARP_in_final_MP6175); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1031:1: final_charA : CHARA ;
    public final HPRIMSParser.final_charA_return final_charA() throws RecognitionException {
        HPRIMSParser.final_charA_return retval = new HPRIMSParser.final_charA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1031:12: ( CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1031:14: CHARA
            {
            match(input,CHARA,FOLLOW_CHARA_in_final_charA6186); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1032:1: final_charB : CHARB ;
    public final HPRIMSParser.final_charB_return final_charB() throws RecognitionException {
        HPRIMSParser.final_charB_return retval = new HPRIMSParser.final_charB_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1032:12: ( CHARB )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1032:14: CHARB
            {
            match(input,CHARB,FOLLOW_CHARB_in_final_charB6194); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1033:1: final_charC : CHARC ;
    public final HPRIMSParser.final_charC_return final_charC() throws RecognitionException {
        HPRIMSParser.final_charC_return retval = new HPRIMSParser.final_charC_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1033:12: ( CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1033:14: CHARC
            {
            match(input,CHARC,FOLLOW_CHARC_in_final_charC6202); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1034:1: final_charD : CHARD ;
    public final HPRIMSParser.final_charD_return final_charD() throws RecognitionException {
        HPRIMSParser.final_charD_return retval = new HPRIMSParser.final_charD_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1034:12: ( CHARD )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1034:14: CHARD
            {
            match(input,CHARD,FOLLOW_CHARD_in_final_charD6210); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1035:1: final_charF : CHARF ;
    public final HPRIMSParser.final_charF_return final_charF() throws RecognitionException {
        HPRIMSParser.final_charF_return retval = new HPRIMSParser.final_charF_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1035:12: ( CHARF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1035:14: CHARF
            {
            match(input,CHARF,FOLLOW_CHARF_in_final_charF6218); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1036:1: final_charH : CHARH ;
    public final HPRIMSParser.final_charH_return final_charH() throws RecognitionException {
        HPRIMSParser.final_charH_return retval = new HPRIMSParser.final_charH_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1036:12: ( CHARH )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1036:14: CHARH
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_charH6226); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1037:1: final_charI : CHARI ;
    public final HPRIMSParser.final_charI_return final_charI() throws RecognitionException {
        HPRIMSParser.final_charI_return retval = new HPRIMSParser.final_charI_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1037:12: ( CHARI )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1037:14: CHARI
            {
            match(input,CHARI,FOLLOW_CHARI_in_final_charI6234); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1038:1: final_charL : CHARL ;
    public final HPRIMSParser.final_charL_return final_charL() throws RecognitionException {
        HPRIMSParser.final_charL_return retval = new HPRIMSParser.final_charL_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1038:12: ( CHARL )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1038:14: CHARL
            {
            match(input,CHARL,FOLLOW_CHARL_in_final_charL6242); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1039:1: final_charM : CHARM ;
    public final HPRIMSParser.final_charM_return final_charM() throws RecognitionException {
        HPRIMSParser.final_charM_return retval = new HPRIMSParser.final_charM_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1039:12: ( CHARM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1039:14: CHARM
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_charM6250); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1040:1: final_charN : CHARN ;
    public final HPRIMSParser.final_charN_return final_charN() throws RecognitionException {
        HPRIMSParser.final_charN_return retval = new HPRIMSParser.final_charN_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1040:12: ( CHARN )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1040:14: CHARN
            {
            match(input,CHARN,FOLLOW_CHARN_in_final_charN6258); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1041:1: final_charO : CHARO ;
    public final HPRIMSParser.final_charO_return final_charO() throws RecognitionException {
        HPRIMSParser.final_charO_return retval = new HPRIMSParser.final_charO_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1041:12: ( CHARO )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1041:14: CHARO
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_charO6266); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1042:1: final_charP : CHARP ;
    public final HPRIMSParser.final_charP_return final_charP() throws RecognitionException {
        HPRIMSParser.final_charP_return retval = new HPRIMSParser.final_charP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1042:12: ( CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1042:14: CHARP
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_charP6274); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1043:1: final_charR : CHARR ;
    public final HPRIMSParser.final_charR_return final_charR() throws RecognitionException {
        HPRIMSParser.final_charR_return retval = new HPRIMSParser.final_charR_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1043:12: ( CHARR )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1043:14: CHARR
            {
            match(input,CHARR,FOLLOW_CHARR_in_final_charR6282); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1044:1: final_charS : CHARS ;
    public final HPRIMSParser.final_charS_return final_charS() throws RecognitionException {
        HPRIMSParser.final_charS_return retval = new HPRIMSParser.final_charS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1044:12: ( CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1044:14: CHARS
            {
            match(input,CHARS,FOLLOW_CHARS_in_final_charS6290); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1045:1: final_charT : CHART ;
    public final HPRIMSParser.final_charT_return final_charT() throws RecognitionException {
        HPRIMSParser.final_charT_return retval = new HPRIMSParser.final_charT_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1045:12: ( CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1045:14: CHART
            {
            match(input,CHART,FOLLOW_CHART_in_final_charT6298); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1046:1: final_charU : CHARU ;
    public final HPRIMSParser.final_charU_return final_charU() throws RecognitionException {
        HPRIMSParser.final_charU_return retval = new HPRIMSParser.final_charU_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1046:12: ( CHARU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1046:14: CHARU
            {
            match(input,CHARU,FOLLOW_CHARU_in_final_charU6306); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1047:1: final_charW : CHARW ;
    public final HPRIMSParser.final_charW_return final_charW() throws RecognitionException {
        HPRIMSParser.final_charW_return retval = new HPRIMSParser.final_charW_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1047:12: ( CHARW )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1047:14: CHARW
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_charW6314); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1048:1: final_charX : CHARX ;
    public final HPRIMSParser.final_charX_return final_charX() throws RecognitionException {
        HPRIMSParser.final_charX_return retval = new HPRIMSParser.final_charX_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1048:12: ( CHARX )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1048:14: CHARX
            {
            match(input,CHARX,FOLLOW_CHARX_in_final_charX6322); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1051:1: delimiters : DELIMITERS ;
    public final HPRIMSParser.delimiters_return delimiters() throws RecognitionException {
        HPRIMSParser.delimiters_return retval = new HPRIMSParser.delimiters_return();
        retval.start = input.LT(1);


        startElement("H.2");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1053:22: ( DELIMITERS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1054:3: DELIMITERS
            {
            match(input,DELIMITERS,FOLLOW_DELIMITERS_in_delimiters6343); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1059:1: character : ( lettre | chiffre ) ;
    public final HPRIMSParser.character_return character() throws RecognitionException {
        HPRIMSParser.character_return retval = new HPRIMSParser.character_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1059:10: ( ( lettre | chiffre ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1060:3: ( lettre | chiffre )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1060:3: ( lettre | chiffre )
            int alt231=2;
            int LA231_0 = input.LA(1);

            if ( ((LA231_0 >= CHARA && LA231_0 <= CHARu)||(LA231_0 >= LETTRE && LA231_0 <= POINT)) ) {
                alt231=1;
            }
            else if ( ((LA231_0 >= CHIFFRE0 && LA231_0 <= CHIFFRE9)) ) {
                alt231=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 231, 0, input);

                throw nvae;

            }
            switch (alt231) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1060:4: lettre
                    {
                    pushFollow(FOLLOW_lettre_in_character6359);
                    lettre();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1060:13: chiffre
                    {
                    pushFollow(FOLLOW_chiffre_in_character6363);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1062:1: chiffre : ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 ) ;
    public final void chiffre() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1062:8: ( ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 ) )
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1066:1: lettre : ~ ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 | CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR ) ;
    public final void lettre() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1066:7: (~ ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 | CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR ) )
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
        "\101\uffff";
    static final String DFA1_eofS =
        "\101\uffff";
    static final String DFA1_minS =
        "\1\54\1\51\20\4\1\21\3\4\1\23\3\4\1\26\3\4\1\51\27\4\1\7\3\51\1"+
        "\13\1\40\1\60\1\36\3\uffff";
    static final String DFA1_maxS =
        "\1\54\1\51\20\60\1\21\3\60\1\23\3\60\1\26\3\60\1\51\3\60\1\61\2"+
        "\60\2\61\17\60\1\25\3\51\1\13\1\40\1\60\1\40\3\uffff";
    static final String DFA1_acceptS =
        "\76\uffff\1\1\1\2\1\3";
    static final String DFA1_specialS =
        "\101\uffff}>";
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
            "\1\100\1\77\1\76",
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
            return "205:1: hprim : ( hprim_oru_2_2 | hprim_oru_2_1 | hprim_oru_2_0 );";
        }
    }
 

    public static final BitSet FOLLOW_hprim_oru_2_2_in_hprim68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hprim_oru_2_1_in_hprim72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hprim_oru_2_0_in_hprim76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_oru_in_hprim_oru_2_294 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p_oru_in_hprim_oru_2_298 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l_in_hprim_oru_2_2103 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_oru_2_2107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_oru_2_2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_oru_in_hprim_oru_2_1129 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p_oru_in_hprim_oru_2_1133 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l_in_hprim_oru_2_1138 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_oru_2_1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_oru_2_1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_oru_in_hprim_oru_2_0164 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p_oru_in_hprim_oru_2_0168 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l_in_hprim_oru_2_0173 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_oru_2_0177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_oru_2_0182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_orm_in_hprim_orm_2_2200 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p_orm_in_hprim_orm_2_2204 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l_in_hprim_orm_2_2209 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_orm_2_2213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_orm_2_2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_orm_in_hprim_orm_2_1235 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p_orm_in_hprim_orm_2_1239 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l_in_hprim_orm_2_1244 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_orm_2_1248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_orm_2_1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_0_orm_in_hprim_orm_2_0270 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p_orm_in_hprim_orm_2_0274 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l_in_hprim_orm_2_0279 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_orm_2_0283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_orm_2_0288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_p_in_body_p_orm299 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_c_in_body_p_orm302 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_obr_orm_in_body_p_orm308 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_obr_in_body_obr_orm320 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_c_in_body_obr_orm323 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_body_obx_oru_in_body_obr_orm330 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_p_in_body_p_oru342 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_c_in_body_p_oru345 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_obr_oru_in_body_p_oru351 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_obr_in_body_obr_oru363 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_c_in_body_obr_oru366 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_obx_oru_in_body_obr_oru373 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_obx_in_body_obx_oru385 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_c_in_body_obx_oru388 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_delimiters_in_start_line_h403 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h407 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_start_line_h409 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h414 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_start_line_h416 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h421 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_start_line_h423 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h428 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_start_line_h430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h442 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_midd_line_h444 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h449 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_midd_line_h451 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h456 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_midd_line_h458 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h463 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_midd_line_h465 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_midd_line_h470 = new BitSet(new long[]{0x0000000000240080L});
    public static final BitSet FOLLOW_spec_const_7_12_in_midd_line_h472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_2_oru492 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_oru496 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ORU_in_line_h2_2_oru498 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_2_oru503 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_oru507 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2_oru509 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_oru514 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_2_oru516 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_oru521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_1_oru541 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_oru545 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ORU_in_line_h2_1_oru547 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_1_oru552 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_oru556 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1_oru558 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_oru563 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_1_oru565 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_oru570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_0_oru589 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_oru593 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ORU_in_line_h2_0_oru595 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_0_oru600 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_oru604 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_0_in_line_h2_0_oru606 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_oru611 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_0_oru613 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_oru618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_2_orm637 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_orm641 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ORM_in_line_h2_2_orm643 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_2_orm648 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_orm652 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2_orm654 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_orm659 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_2_orm661 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2_orm666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_1_orm684 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_orm688 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ORM_in_line_h2_1_orm690 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_1_orm695 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_orm699 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1_orm701 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_orm706 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_1_orm708 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1_orm713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_start_line_h_in_line_h2_0_orm731 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_orm735 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_ORM_in_line_h2_0_orm737 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_midd_line_h_in_line_h2_0_orm742 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_orm746 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_0_in_line_h2_0_orm748 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_orm753 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_0_orm755 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_0_orm760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_ap779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_line_ap781 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_line_ap783 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap787 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_ap789 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap794 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_mandatory_in_line_ap796 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap801 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_ap803 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap808 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_ap810 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap815 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_ap817 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap822 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_mandatory_in_line_ap824 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap829 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_ap831 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap836 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_ap838 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap843 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_ap845 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap850 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_ap852 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap857 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_ap859 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap864 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_mandatory_in_line_ap866 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap871 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_mandatory_in_line_ap873 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap878 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_6_in_line_ap880 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap885 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_ap887 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap892 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_ap894 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap900 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_ap902 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap909 = new BitSet(new long[]{0x0000020000030000L});
    public static final BitSet FOLLOW_spec_on_optionnal_in_line_ap911 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap919 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_ap921 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap930 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_ap932 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap942 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_ap944 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap955 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_ap957 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap969 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_ap971 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_ap983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_p1016 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_line_p1018 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1022 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_p1024 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1029 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_8_3_in_line_p1031 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1036 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1038 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1044 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1046 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1053 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p1055 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1063 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1065 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1074 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p1076 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1086 = new BitSet(new long[]{0x0000020000408200L});
    public static final BitSet FOLLOW_spec_const_sexe_in_line_p1088 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1099 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_p1101 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1113 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p1115 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1128 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1130 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1144 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_p1146 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1185 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p1187 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p1191 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p1193 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1211 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1213 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1230 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1232 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1265 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_p1267 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1302 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_p1304 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1324 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p1326 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p1330 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p1332 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1355 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1357 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p1361 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1363 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1387 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1389 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1412 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1414 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1438 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1440 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1465 = new BitSet(new long[]{0x000202FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p1467 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p1471 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p1473 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1501 = new BitSet(new long[]{0x0000020000069100L});
    public static final BitSet FOLLOW_spec_const_8_25_in_line_p1503 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1530 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_8_in_line_p1532 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1585 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1587 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1616 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_p1618 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1675 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1677 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1736 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1738 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1770 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1772 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1835 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p1837 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1871 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p1873 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1908 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p1910 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obr2023 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_line_obr2025 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_line_obr2027 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_line_obr2029 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2033 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_obr2035 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2040 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_9_3_in_line_obr2042 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2047 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2049 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2054 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2056 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2060 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2062 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2072 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2074 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2078 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2080 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2087 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2089 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2094 = new BitSet(new long[]{0x000200FFC0000000L});
    public static final BitSet FOLLOW_spec_non_sized_9_8_in_line_obr2096 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2101 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2103 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2111 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2113 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2118 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2120 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2128 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2130 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2139 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2141 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2148 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2150 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2158 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2160 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2169 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_9_16_in_line_obr2171 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2181 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2183 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2194 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_obr2196 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2208 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2210 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2223 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2225 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2239 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2241 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2256 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2258 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2274 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2276 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2293 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_obr2295 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2313 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2315 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2334 = new BitSet(new long[]{0x00000200020E92C0L});
    public static final BitSet FOLLOW_spec_const_9_26_in_line_obr2336 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2356 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_obr2358 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2379 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_obr2381 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2403 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2405 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2409 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2411 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2436 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_4_in_line_obr2438 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2462 = new BitSet(new long[]{0x0000020001040040L});
    public static final BitSet FOLLOW_spec_const_9_31_in_line_obr2464 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2511 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2513 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2517 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2519 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2547 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2549 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2576 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2578 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2606 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2608 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2637 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2639 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2669 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2671 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obx2770 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_line_obx2772 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_line_obx2774 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CHARX_in_line_obx2776 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2780 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_obx2782 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2787 = new BitSet(new long[]{0x00000000003506D0L});
    public static final BitSet FOLLOW_spec_const_10_3_nm_in_line_obx2795 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2804 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2806 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2816 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2818 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2829 = new BitSet(new long[]{0x0003C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2831 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2835 = new BitSet(new long[]{0x0003C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2837 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_ce_in_line_obx2867 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2876 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2878 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2888 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2890 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2901 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2903 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2907 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2909 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_fic_in_line_obx2939 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2948 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2950 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2960 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2962 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2973 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2975 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2979 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2981 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_st_in_line_obx3011 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3020 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx3022 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3032 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx3034 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3045 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx3047 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx3051 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx3053 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_gc_in_line_obx3083 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3092 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx3094 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3104 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx3106 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3117 = new BitSet(new long[]{0x0001C4FFC0000000L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx3119 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx3123 = new BitSet(new long[]{0x0001C4FFC0000000L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx3125 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_tx_in_line_obx3155 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3164 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx3166 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3176 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx3178 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3189 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx3191 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx3195 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx3197 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_std_in_line_obx3227 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3236 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx3238 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3248 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx3250 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx3261 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx3263 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx3267 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx3269 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_63303 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_63305 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_63314 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_63316 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_63320 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_63322 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_63334 = new BitSet(new long[]{0x000202000DD9D8B0L});
    public static final BitSet FOLLOW_spec_const_10_9_in_line_obx2_1_post10_63336 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_63340 = new BitSet(new long[]{0x000202000DD9D8B0L});
    public static final BitSet FOLLOW_spec_const_10_9_in_line_obx2_1_post10_63342 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_63355 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2_1_post10_63357 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_63369 = new BitSet(new long[]{0x0002020000190010L});
    public static final BitSet FOLLOW_spec_const_10_11_in_line_obx2_1_post10_63371 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_63375 = new BitSet(new long[]{0x0002020000190010L});
    public static final BitSet FOLLOW_spec_const_10_11_in_line_obx2_1_post10_63377 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_63392 = new BitSet(new long[]{0x00000200024C12C0L});
    public static final BitSet FOLLOW_spec_const_10_12_in_line_obx2_1_post10_63394 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_63409 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_63411 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_63427 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_63429 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_63445 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_63447 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_63464 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obx2_1_post10_63466 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_63484 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_63486 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_63489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_c3528 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_line_c3530 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c3534 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_c3536 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c3541 = new BitSet(new long[]{0x0000020000044000L});
    public static final BitSet FOLLOW_spec_const_12_3_in_line_c3543 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c3548 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_c3550 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_c3554 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_c3556 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_l3583 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_line_l3585 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l3590 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l3592 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l3599 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_l3601 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l3609 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l3611 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l3620 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l3622 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l3632 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_l3634 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charO_in_spec_on_optionnal3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charN_in_spec_on_optionnal3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charM_in_spec_const_sexe3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_sexe3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_sexe3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_0_in_spec_const_7_13_version_2_03745 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_03748 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_03750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_1_in_spec_const_7_13_version_2_13771 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_13774 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_13776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_2_in_spec_const_7_13_version_2_23795 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_23798 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_23800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_7_13_23819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_7_13_23823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_7_13_23827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ORU_in_spec_const_7_7_contexte_ORU3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ORM_in_spec_const_7_7_contexte_ORM3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_7_123882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_7_123886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charT_in_spec_const_7_123890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_PORT_in_spec_const_9_313910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_CART_in_spec_const_9_313914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_WHLC_in_spec_const_9_313918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_WALK_in_spec_const_9_313922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_OP_in_spec_const_8_253943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_IP_in_spec_const_8_253947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ER_in_spec_const_8_253951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_PA_in_spec_const_8_253955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_MP_in_spec_const_8_253959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_9_263980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_9_263984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charM_in_spec_const_9_263988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_9_263992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_9_263996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_9_264000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charO_in_spec_const_9_264004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_9_264010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charX_in_spec_const_9_264014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_nm4035 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CHARM_in_spec_const_10_3_nm4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_ce4058 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CHARE_in_spec_const_10_3_ce4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARS_in_spec_const_10_3_st4081 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_st4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_gc4104 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_gc4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_tx4128 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CHARX_in_spec_const_10_3_tx4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARF_in_spec_const_10_3_fic4151 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CHARI_in_spec_const_10_3_fic4153 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_fic4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_spec_const_10_3_std4177 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CHARD_in_spec_const_10_3_std4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_std4185 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CHARK_in_spec_const_10_3_std4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_std4193 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std4195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_spec_const_10_3_std4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARD_in_spec_const_10_3_std4203 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_std4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_spec_const_10_3_std4213 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_std4221 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_std4231 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_spec_const_10_3_std4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_std4239 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_64264 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_64270 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_64272 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_64279 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_64281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_10_94309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charH_in_spec_const_10_94313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_LL_in_spec_const_10_94317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_HH_in_spec_const_10_94321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_symbol_inf_in_spec_const_10_94325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_symbol_sup_in_spec_const_10_94329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charN_in_spec_const_10_94335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charA_in_spec_const_10_94339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_AA_in_spec_const_10_94343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_Null_in_spec_const_10_94347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_10_94351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_10_94355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charB_in_spec_const_10_94359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charW_in_spec_const_10_94365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_94369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_10_94373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charS_in_spec_const_10_94377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_MS_in_spec_const_10_94381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_VS_in_spec_const_10_94385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charA_in_spec_const_10_114406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charS_in_spec_const_10_114410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_114414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charN_in_spec_const_10_114418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_124439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_10_124443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_10_124447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_10_124451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_10_124455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_10_124459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charX_in_spec_const_10_124466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_10_124470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_12_34491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_12_34495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_24515 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_24521 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_24523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_24546 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_24552 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_24554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44579 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44585 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44587 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44594 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44596 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44604 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_64635 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_64641 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_64643 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_64650 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_64652 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_64660 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_64662 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_64671 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_64673 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_64683 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_64685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64708 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64715 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64717 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64725 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64727 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64736 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64738 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64748 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64750 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64761 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84796 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84802 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84804 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84811 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84813 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84821 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84823 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84832 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84834 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84844 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84846 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84857 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84859 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84871 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34910 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34916 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34918 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34925 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64950 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64956 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64958 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64965 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64967 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64975 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64977 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64986 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64988 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64998 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_65000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_25029 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_optionnal_25034 = new BitSet(new long[]{0x0001C0FFC0000000L});
    public static final BitSet FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_25036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_25061 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_mandatory_25066 = new BitSet(new long[]{0x0001C0FFC0000000L});
    public static final BitSet FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_25068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_cna5091 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna5098 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl2_st_optionnal_6_in_spec_sized_cna5100 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna5108 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_cna5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_mandatory_in_spec_sized_8_35142 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_8_35149 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_8_35151 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_8_35159 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_8_35161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_9_35201 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_35207 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_9_35209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_85234 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_spec_non_sized_9_85241 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_85243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl2_st_optionnal_3_in_spec_sized_9_165264 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_165270 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_9_165272 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_165279 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_9_165281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_10_45308 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_45314 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_45316 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_45323 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_45325 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_45333 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_45335 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_45344 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_45346 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_45356 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_45358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_spec_10_6_tx_in_spec_sized_10_6_tx5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_tn5415 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_spec_sized_tn5421 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_tn5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_sized_optionnal5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_sized_mandatory5474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_non_sized_optionnal5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_nonsized_mandatory5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_sized_optionnal5533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_integer_in_nm_integer_sized_optionnal5556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_integer_in_nm_integer_sized_mandatory5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ts_in_ts_sized_optionnal5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ts_in_ts_sized_mandatory5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_nonsized_mandatory5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_nonsized_optionnal5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_0_in_spec_const_7_13_1_version_2_05689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_1_in_spec_const_7_13_1_version_2_15707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_2_in_spec_const_7_13_1_version_2_25727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_content_spec_10_6_in_final_spec_10_6_tx5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_in_content_spec_10_65766 = new BitSet(new long[]{0x0001E4FFFFFFFFF2L});
    public static final BitSet FOLLOW_DELIMITER2_in_content_spec_10_65772 = new BitSet(new long[]{0x0001E4FFFFFFFFF2L});
    public static final BitSet FOLLOW_content_spec_10_6_in_content_spec_10_65783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5795 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5797 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5801 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5803 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5805 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5809 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5812 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5814 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5819 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5821 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5823 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5827 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5830 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_in_final_st5851 = new BitSet(new long[]{0x0001E0FFFFFFFFF2L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5880 = new BitSet(new long[]{0x000100FFC0000002L});
    public static final BitSet FOLLOW_POINT_in_final_nm5884 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5886 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_POINT_in_final_nm5896 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5898 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_nm_integer5915 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_CHARO_in_final_ORU5927 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_ORU5929 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CHARU_in_final_ORU5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_ORM5939 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_ORM5941 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CHARM_in_final_ORM5943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_final_CART5952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_CART5954 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_CART5956 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_final_CART5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_PORT5966 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_final_PORT5968 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_PORT5970 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_final_PORT5972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_WHLC5980 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CHARH_in_final_WHLC5982 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_WHLC5984 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_final_WHLC5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_WALK5994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_WALK5996 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_WALK5998 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CHARK_in_final_WALK6000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARL_in_final_LL6009 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_LL6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_final_AA6019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_AA6021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_HH6029 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CHARH_in_final_HH6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_MS6039 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CHARS_in_final_MS6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARV_in_final_VS6049 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CHARS_in_final_VS6051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_final_Null6059 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CHARu_in_final_Null6061 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CHARl_in_final_Null6063 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CHARl_in_final_Null6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_SYMBOL_INF_in_final_symbol_inf6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_SYMBOL_SUP_in_final_symbol_sup6081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_06090 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_06092 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_06094 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_CHIFFRE0_in_final_version_2_06096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_16104 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_16106 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_16108 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_CHIFFRE1_in_final_version_2_16110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_26118 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_26120 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_26122 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_26124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_OP6133 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_OP6135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARI_in_final_IP6143 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_IP6145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARE_in_final_ER6153 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_ER6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_PA6163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_PA6165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_MP6173 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_MP6175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_final_charA6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARB_in_final_charB6194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_final_charC6202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARD_in_final_charD6210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARF_in_final_charF6218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_charH6226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARI_in_final_charI6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARL_in_final_charL6242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_charM6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_final_charN6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_charO6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_charP6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARR_in_final_charR6282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARS_in_final_charS6290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_final_charT6298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARU_in_final_charU6306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_charW6314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARX_in_final_charX6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITERS_in_delimiters6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lettre_in_character6359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chiffre_in_character6363 = new BitSet(new long[]{0x0000000000000002L});

}