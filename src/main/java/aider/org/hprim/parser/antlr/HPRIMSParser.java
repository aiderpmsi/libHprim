// $ANTLR 3.4 C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g 2013-03-29 18:47:01

package aider.org.hprim.parser.antlr;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import aider.org.hprim.parser.ContentHandler;
import aider.org.hprim.parser.MatchRegexTokenException;
import aider.org.hprim.parser.ContentHandlerException;



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
          contentHandler.startElement(typeElement, nameElement);
         } catch (ContentHandlerException e) {
           e.setIntStream(input);
           e.setStartToken(input.LT(1));
           throw e;
         }
      }

      /**
       * Encadre l'appel du contentHandler
       */
      public void endElement() throws ContentHandlerException {
        try {
          contentHandler.endElement();
         } catch (ContentHandlerException e) {
           e.setIntStream(input);
           e.setStartToken(input.LT(1));
           throw e;
         }
      }

      /**
       * Encadre l'appel du contentHandler
       */
      public void content(String content) throws ContentHandlerException {
        try {
          contentHandler.content(content);
         } catch (ContentHandlerException e) {
           e.setIntStream(input);
           e.setStartToken(input.LT(1));
           throw e;
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:147:1: hprim : ( hprim_oru_2_2 | hprim_oru_2_1 );
    public final void hprim() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:147:6: ( hprim_oru_2_2 | hprim_oru_2_1 )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:148:3: hprim_oru_2_2
                    {
                    pushFollow(FOLLOW_hprim_oru_2_2_in_hprim60);
                    hprim_oru_2_2();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:148:19: hprim_oru_2_1
                    {
                    pushFollow(FOLLOW_hprim_oru_2_1_in_hprim64);
                    hprim_oru_2_1();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "hprim"



    // $ANTLR start "hprim_oru_2_2"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:153:1: hprim_oru_2_2 : line_h2_2 ( body_p2_1 )* line_l2_1 ( CR )? EOF ;
    public final void hprim_oru_2_2() throws RecognitionException {
        startElement("message", "hprim_oru_2_2");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:155:22: ( line_h2_2 ( body_p2_1 )* line_l2_1 ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:156:3: line_h2_2 ( body_p2_1 )* line_l2_1 ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_2_in_hprim_oru_2_284);
            line_h2_2();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:157:3: ( body_p2_1 )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:157:3: body_p2_1
            	    {
            	    pushFollow(FOLLOW_body_p2_1_in_hprim_oru_2_288);
            	    body_p2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            pushFollow(FOLLOW_line_l2_1_in_hprim_oru_2_293);
            line_l2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:159:3: ( CR )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CR) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:159:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_oru_2_297); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_oru_2_2102); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:162:1: hprim_oru_2_1 : line_h2_1 ( body_p2_1 )* line_l2_1 ( CR )? EOF ;
    public final void hprim_oru_2_1() throws RecognitionException {
        startElement("message", "hprim_oru_2_1");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:164:22: ( line_h2_1 ( body_p2_1 )* line_l2_1 ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:165:3: line_h2_1 ( body_p2_1 )* line_l2_1 ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_1_in_hprim_oru_2_1119);
            line_h2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:166:3: ( body_p2_1 )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:166:3: body_p2_1
            	    {
            	    pushFollow(FOLLOW_body_p2_1_in_hprim_oru_2_1123);
            	    body_p2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            pushFollow(FOLLOW_line_l2_1_in_hprim_oru_2_1128);
            line_l2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:168:3: ( CR )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CR) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:168:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_oru_2_1132); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_oru_2_1137); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:171:1: body_p2_1 : line_p2_1 ( line_c2_1 )* ( body_obr2_1 )+ ;
    public final void body_p2_1() throws RecognitionException {
        startElement("body", "P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:173:22: ( line_p2_1 ( line_c2_1 )* ( body_obr2_1 )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:174:3: line_p2_1 ( line_c2_1 )* ( body_obr2_1 )+
            {
            pushFollow(FOLLOW_line_p2_1_in_body_p2_1154);
            line_p2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:174:13: ( line_c2_1 )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:174:14: line_c2_1
            	    {
            	    pushFollow(FOLLOW_line_c2_1_in_body_p2_1157);
            	    line_c2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:175:4: ( body_obr2_1 )+
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:175:4: body_obr2_1
            	    {
            	    pushFollow(FOLLOW_body_obr2_1_in_body_p2_1164);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:177:1: body_obr2_1 : line_obr2_1 ( line_c2_1 )* ( body_obx2_1 )+ ;
    public final void body_obr2_1() throws RecognitionException {
        startElement("body", "OBR");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:179:22: ( line_obr2_1 ( line_c2_1 )* ( body_obx2_1 )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:180:4: line_obr2_1 ( line_c2_1 )* ( body_obx2_1 )+
            {
            pushFollow(FOLLOW_line_obr2_1_in_body_obr2_1183);
            line_obr2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:180:16: ( line_c2_1 )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:180:17: line_c2_1
            	    {
            	    pushFollow(FOLLOW_line_c2_1_in_body_obr2_1186);
            	    line_c2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:181:5: ( body_obx2_1 )+
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:181:5: body_obx2_1
            	    {
            	    pushFollow(FOLLOW_body_obx2_1_in_body_obr2_1194);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:183:1: body_obx2_1 : line_obx2_1 ( line_c2_1 )* ;
    public final void body_obx2_1() throws RecognitionException {
        startElement("body", "OBX");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:185:22: ( line_obx2_1 ( line_c2_1 )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:186:4: line_obx2_1 ( line_c2_1 )*
            {
            pushFollow(FOLLOW_line_obx2_1_in_body_obx2_1213);
            line_obx2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:186:16: ( line_c2_1 )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:186:17: line_c2_1
            	    {
            	    pushFollow(FOLLOW_line_c2_1_in_body_obx2_1216);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:192:1: line_h2_2 : delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 spec_const_7_13_version_2_2[\"H_7.13\"] DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_2() throws RecognitionException {
        startElement("ligne", "H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:194:22: ( delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 spec_const_7_13_version_2_2[\"H_7.13\"] DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:195:3: delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 spec_const_7_13_version_2_2[\"H_7.13\"] DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_delimiters_in_line_h2_2239);
            delimiters();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2243); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_2245);
            st_sized_optionnal("H_7.3", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2250); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_2252);
            st_sized_optionnal("H_7.4", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2257); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_2259);
            spec_sized_mult_lvl1_st_mandatory_2("H_7.5", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2264); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_2266);
            spec_sized_mult_lvl1_st_optionnal_6("H_7.6", 100);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2271); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_in_line_h2_2273);
            spec_const_7_7_contexte("H_7.7");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2278); 

            pushFollow(FOLLOW_spec_sized_tn_in_line_h2_2280);
            spec_sized_tn("H_7.8", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2285); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_2287);
            st_sized_optionnal("H_7.9", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2292); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_2294);
            spec_sized_mult_lvl1_st_mandatory_2("H_7.10", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2299); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_2301);
            st_sized_optionnal("H_7.11", 80);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2306); 

            pushFollow(FOLLOW_spec_const_7_12_in_line_h2_2308);
            spec_const_7_12("H_7.12");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2313); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2315);
            spec_const_7_13_version_2_2("H_7.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2320); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_2322);
            ts_sized_mandatory("H_7.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:208:3: ( DELIMITER1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==DELIMITER1) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:208:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2327); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:212:1: line_h2_1 : delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 ( spec_const_7_13_version_2_0[\"H_7.13\"] | spec_const_7_13_version_2_1[\"H_7.13\"] ) DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_1() throws RecognitionException {
        startElement("ligne", "H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:214:22: ( delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 ( spec_const_7_13_version_2_0[\"H_7.13\"] | spec_const_7_13_version_2_1[\"H_7.13\"] ) DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:215:3: delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 ( spec_const_7_13_version_2_0[\"H_7.13\"] | spec_const_7_13_version_2_1[\"H_7.13\"] ) DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_delimiters_in_line_h2_1347);
            delimiters();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1351); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_1353);
            st_sized_optionnal("H_7.3", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1358); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_1360);
            st_sized_optionnal("H_7.4", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1365); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_1367);
            spec_sized_mult_lvl1_st_mandatory_2("H_7.5", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1372); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_1374);
            spec_sized_mult_lvl1_st_optionnal_6("H_7.6", 100);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1379); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_in_line_h2_1381);
            spec_const_7_7_contexte("H_7.7");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1386); 

            pushFollow(FOLLOW_spec_sized_tn_in_line_h2_1388);
            spec_sized_tn("H_7.8", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1393); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_1395);
            st_sized_optionnal("H_7.9", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1400); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_1402);
            spec_sized_mult_lvl1_st_mandatory_2("H_7.10", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1407); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_1409);
            st_sized_optionnal("H_7.11", 80);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1414); 

            pushFollow(FOLLOW_spec_const_7_12_in_line_h2_1416);
            spec_const_7_12("H_7.12");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1424); 

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:227:14: ( spec_const_7_13_version_2_0[\"H_7.13\"] | spec_const_7_13_version_2_1[\"H_7.13\"] )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:227:15: spec_const_7_13_version_2_0[\"H_7.13\"]
                    {
                    pushFollow(FOLLOW_spec_const_7_13_version_2_0_in_line_h2_1427);
                    spec_const_7_13_version_2_0("H_7.13");

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:227:55: spec_const_7_13_version_2_1[\"H_7.13\"]
                    {
                    pushFollow(FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1432);
                    spec_const_7_13_version_2_1("H_7.13");

                    state._fsp--;


                    }
                    break;

            }


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1438); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_1440);
            ts_sized_mandatory("H_7.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:229:3: ( DELIMITER1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==DELIMITER1) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:229:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1445); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:232:1: line_p2_2 : line_p2_1 ;
    public final void line_p2_2() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:232:10: ( line_p2_1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:233:3: line_p2_1
            {
            pushFollow(FOLLOW_line_p2_1_in_line_p2_2456);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:235:1: line_p2_1 : CR CHARP DELIMITER1 nm_integer_sized_optionnal[\"P_8.2\", 4] DELIMITER1 spec_sized_8_3[\"P_8.3\", 36] DELIMITER1 st_sized_optionnal[\"P_8.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_p2_1() throws RecognitionException {
        startElement("ligne", "P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:237:22: ( CR CHARP DELIMITER1 nm_integer_sized_optionnal[\"P_8.2\", 4] DELIMITER1 spec_sized_8_3[\"P_8.3\", 36] DELIMITER1 st_sized_optionnal[\"P_8.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:238:3: CR CHARP DELIMITER1 nm_integer_sized_optionnal[\"P_8.2\", 4] DELIMITER1 spec_sized_8_3[\"P_8.3\", 36] DELIMITER1 st_sized_optionnal[\"P_8.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_p2_1473); 

            match(input,CHARP,FOLLOW_CHARP_in_line_p2_1475); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1479); 

            pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_p2_1481);
            nm_integer_sized_optionnal("P_8.2", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1486); 

            pushFollow(FOLLOW_spec_sized_8_3_in_line_p2_1488);
            spec_sized_8_3("P_8.3", 36);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1493); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1495);
            st_sized_optionnal("P_8.4", 16);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:242:3: ( DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==DELIMITER1) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:242:4: DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1501); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1503);
                    st_sized_optionnal("P_8.5", 16);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:243:4: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==DELIMITER1) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:243:5: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1510); 

                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1512);
                            spec_sized_mult_lvl1_st_optionnal_6("P_8.6", 48);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:244:5: ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==DELIMITER1) ) {
                                alt46=1;
                            }
                            switch (alt46) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:244:6: DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1520); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1522);
                                    st_sized_optionnal("P_8.7", 24);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:245:6: ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt45=2;
                                    int LA45_0 = input.LA(1);

                                    if ( (LA45_0==DELIMITER1) ) {
                                        alt45=1;
                                    }
                                    switch (alt45) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:245:7: DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1531); 

                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_1533);
                                            ts_sized_optionnal("P_8.8", 26);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:246:7: ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt44=2;
                                            int LA44_0 = input.LA(1);

                                            if ( (LA44_0==DELIMITER1) ) {
                                                alt44=1;
                                            }
                                            switch (alt44) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:246:8: DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1543); 

                                                    pushFollow(FOLLOW_spec_const_sexe_in_line_p2_1545);
                                                    spec_const_sexe("P_8.9");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:247:8: ( DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt43=2;
                                                    int LA43_0 = input.LA(1);

                                                    if ( (LA43_0==DELIMITER1) ) {
                                                        alt43=1;
                                                    }
                                                    switch (alt43) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:247:9: DELIMITER1 spec_const_race[\"P_8.10\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1556); 

                                                            pushFollow(FOLLOW_spec_const_race_in_line_p2_1558);
                                                            spec_const_race("P_8.10");

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:248:9: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt42=2;
                                                            int LA42_0 = input.LA(1);

                                                            if ( (LA42_0==DELIMITER1) ) {
                                                                alt42=1;
                                                            }
                                                            switch (alt42) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:248:10: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1570); 

                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1572);
                                                                    spec_sized_mult_lvl1_st_optionnal_6("P_8.11", 200);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:249:10: ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt41=2;
                                                                    int LA41_0 = input.LA(1);

                                                                    if ( (LA41_0==DELIMITER1) ) {
                                                                        alt41=1;
                                                                    }
                                                                    switch (alt41) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:249:11: DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1585); 

                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1587);
                                                                            st_sized_optionnal("P_8.12", 120);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:250:11: ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt40=2;
                                                                            int LA40_0 = input.LA(1);

                                                                            if ( (LA40_0==DELIMITER1) ) {
                                                                                alt40=1;
                                                                            }
                                                                            switch (alt40) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:250:12: DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1601); 

                                                                                    pushFollow(FOLLOW_spec_sized_tn_in_line_p2_1603);
                                                                                    spec_sized_tn("P_8.13", 40);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:253:12: ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt39=2;
                                                                                    int LA39_0 = input.LA(1);

                                                                                    if ( (LA39_0==DELIMITER1) ) {
                                                                                        alt39=1;
                                                                                    }
                                                                                    switch (alt39) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:253:13: DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1642); 

                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_p2_1644);
                                                                                            spec_sized_cna("P_8.14", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:253:53: ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )*
                                                                                            loop14:
                                                                                            do {
                                                                                                int alt14=2;
                                                                                                int LA14_0 = input.LA(1);

                                                                                                if ( (LA14_0==REPETITEUR) ) {
                                                                                                    alt14=1;
                                                                                                }


                                                                                                switch (alt14) {
                                                                                            	case 1 :
                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:253:54: REPETITEUR spec_sized_cna[\"P_8.14\", 60]
                                                                                            	    {
                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1648); 

                                                                                            	    pushFollow(FOLLOW_spec_sized_cna_in_line_p2_1650);
                                                                                            	    spec_sized_cna("P_8.14", 60);

                                                                                            	    state._fsp--;


                                                                                            	    }
                                                                                            	    break;

                                                                                            	default :
                                                                                            	    break loop14;
                                                                                                }
                                                                                            } while (true);


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:254:13: ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt38=2;
                                                                                            int LA38_0 = input.LA(1);

                                                                                            if ( (LA38_0==DELIMITER1) ) {
                                                                                                alt38=1;
                                                                                            }
                                                                                            switch (alt38) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:254:14: DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1668); 

                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1670);
                                                                                                    st_sized_optionnal("P_8.15", 60);

                                                                                                    state._fsp--;


                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:255:14: ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt37=2;
                                                                                                    int LA37_0 = input.LA(1);

                                                                                                    if ( (LA37_0==DELIMITER1) ) {
                                                                                                        alt37=1;
                                                                                                    }
                                                                                                    switch (alt37) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:255:15: DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1687); 

                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1689);
                                                                                                            st_sized_optionnal("P_8.16", 60);

                                                                                                            state._fsp--;


                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:257:15: ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt36=2;
                                                                                                            int LA36_0 = input.LA(1);

                                                                                                            if ( (LA36_0==DELIMITER1) ) {
                                                                                                                alt36=1;
                                                                                                            }
                                                                                                            switch (alt36) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:257:16: DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1722); 

                                                                                                                    pushFollow(FOLLOW_nm_sized_optionnal_in_line_p2_1724);
                                                                                                                    nm_sized_optionnal("P_8.17", 10);

                                                                                                                    state._fsp--;


                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:259:16: ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt35=2;
                                                                                                                    int LA35_0 = input.LA(1);

                                                                                                                    if ( (LA35_0==DELIMITER1) ) {
                                                                                                                        alt35=1;
                                                                                                                    }
                                                                                                                    switch (alt35) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:259:17: DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1759); 

                                                                                                                            pushFollow(FOLLOW_nm_sized_optionnal_in_line_p2_1761);
                                                                                                                            nm_sized_optionnal("P_8.18", 10);

                                                                                                                            state._fsp--;


                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:260:17: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt34=2;
                                                                                                                            int LA34_0 = input.LA(1);

                                                                                                                            if ( (LA34_0==DELIMITER1) ) {
                                                                                                                                alt34=1;
                                                                                                                            }
                                                                                                                            switch (alt34) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:260:18: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1781); 

                                                                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1783);
                                                                                                                                    spec_sized_mult_lvl1_st_optionnal_6("P_8.19", 200);

                                                                                                                                    state._fsp--;


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:260:80: ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )*
                                                                                                                                    loop15:
                                                                                                                                    do {
                                                                                                                                        int alt15=2;
                                                                                                                                        int LA15_0 = input.LA(1);

                                                                                                                                        if ( (LA15_0==REPETITEUR) ) {
                                                                                                                                            alt15=1;
                                                                                                                                        }


                                                                                                                                        switch (alt15) {
                                                                                                                                    	case 1 :
                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:260:81: REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200]
                                                                                                                                    	    {
                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1787); 

                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1789);
                                                                                                                                    	    spec_sized_mult_lvl1_st_optionnal_6("P_8.19", 200);

                                                                                                                                    	    state._fsp--;


                                                                                                                                    	    }
                                                                                                                                    	    break;

                                                                                                                                    	default :
                                                                                                                                    	    break loop15;
                                                                                                                                        }
                                                                                                                                    } while (true);


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:261:18: ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt33=2;
                                                                                                                                    int LA33_0 = input.LA(1);

                                                                                                                                    if ( (LA33_0==DELIMITER1) ) {
                                                                                                                                        alt33=1;
                                                                                                                                    }
                                                                                                                                    switch (alt33) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:261:19: DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1812); 

                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1814);
                                                                                                                                            st_sized_optionnal("P_8.20", 200);

                                                                                                                                            state._fsp--;


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:261:64: ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )*
                                                                                                                                            loop16:
                                                                                                                                            do {
                                                                                                                                                int alt16=2;
                                                                                                                                                int LA16_0 = input.LA(1);

                                                                                                                                                if ( (LA16_0==REPETITEUR) ) {
                                                                                                                                                    alt16=1;
                                                                                                                                                }


                                                                                                                                                switch (alt16) {
                                                                                                                                            	case 1 :
                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:261:65: REPETITEUR st_sized_optionnal[\"P_8.20\", 200]
                                                                                                                                            	    {
                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1818); 

                                                                                                                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1820);
                                                                                                                                            	    st_sized_optionnal("P_8.20", 200);

                                                                                                                                            	    state._fsp--;


                                                                                                                                            	    }
                                                                                                                                            	    break;

                                                                                                                                            	default :
                                                                                                                                            	    break loop16;
                                                                                                                                                }
                                                                                                                                            } while (true);


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:262:19: ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt32=2;
                                                                                                                                            int LA32_0 = input.LA(1);

                                                                                                                                            if ( (LA32_0==DELIMITER1) ) {
                                                                                                                                                alt32=1;
                                                                                                                                            }
                                                                                                                                            switch (alt32) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:262:20: DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1844); 

                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1846);
                                                                                                                                                    st_sized_optionnal("P_8.21", 200);

                                                                                                                                                    state._fsp--;


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:263:20: ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt31=2;
                                                                                                                                                    int LA31_0 = input.LA(1);

                                                                                                                                                    if ( (LA31_0==DELIMITER1) ) {
                                                                                                                                                        alt31=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt31) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:263:21: DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1869); 

                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1871);
                                                                                                                                                            st_sized_optionnal("P_8.22", 60);

                                                                                                                                                            state._fsp--;


                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:264:21: ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt30=2;
                                                                                                                                                            int LA30_0 = input.LA(1);

                                                                                                                                                            if ( (LA30_0==DELIMITER1) ) {
                                                                                                                                                                alt30=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt30) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:264:22: DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1895); 

                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1897);
                                                                                                                                                                    st_sized_optionnal("P_8.23", 60);

                                                                                                                                                                    state._fsp--;


                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:265:22: ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    int alt29=2;
                                                                                                                                                                    int LA29_0 = input.LA(1);

                                                                                                                                                                    if ( (LA29_0==DELIMITER1) ) {
                                                                                                                                                                        alt29=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt29) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:265:23: DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1922); 

                                                                                                                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_1924);
                                                                                                                                                                            ts_sized_optionnal("P_8.24", 26);

                                                                                                                                                                            state._fsp--;


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:265:67: ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )?
                                                                                                                                                                            int alt17=2;
                                                                                                                                                                            int LA17_0 = input.LA(1);

                                                                                                                                                                            if ( (LA17_0==REPETITEUR) ) {
                                                                                                                                                                                alt17=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt17) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:265:68: REPETITEUR ts_sized_optionnal[\"P_8.24\", 26]
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1928); 

                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_1930);
                                                                                                                                                                                    ts_sized_optionnal("P_8.24", 26);

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:266:23: ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            int alt28=2;
                                                                                                                                                                            int LA28_0 = input.LA(1);

                                                                                                                                                                            if ( (LA28_0==DELIMITER1) ) {
                                                                                                                                                                                alt28=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt28) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:266:24: DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1958); 

                                                                                                                                                                                    pushFollow(FOLLOW_spec_const_8_25_in_line_p2_1960);
                                                                                                                                                                                    spec_const_8_25("P_8.25");

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:267:24: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    int alt27=2;
                                                                                                                                                                                    int LA27_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA27_0==DELIMITER1) ) {
                                                                                                                                                                                        alt27=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt27) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:267:25: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1987); 

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_8_in_line_p2_1989);
                                                                                                                                                                                            spec_sized_mult_lvl1_st_optionnal_8("P_8.26", 100);

                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:269:25: ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            int alt26=2;
                                                                                                                                                                                            int LA26_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA26_0==DELIMITER1) ) {
                                                                                                                                                                                                alt26=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt26) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:269:26: DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11042); 

                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11044);
                                                                                                                                                                                                    st_sized_optionnal("P_8.27", 100);

                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:270:26: ( DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    int alt25=2;
                                                                                                                                                                                                    int LA25_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA25_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt25=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt25) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:270:27: DELIMITER1 spec_const_race[\"P_8.28\"] ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11073); 

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_const_race_in_line_p2_11075);
                                                                                                                                                                                                            spec_const_race("P_8.28");

                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:272:27: ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            int alt24=2;
                                                                                                                                                                                                            int LA24_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA24_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt24=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt24) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:272:28: DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11132); 

                                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11134);
                                                                                                                                                                                                                    st_sized_optionnal("P_8.29", 2);

                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:274:28: ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    int alt23=2;
                                                                                                                                                                                                                    int LA23_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA23_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt23=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt23) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:274:29: DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11193); 

                                                                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11195);
                                                                                                                                                                                                                            st_sized_optionnal("P_8.30", 20);

                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:275:29: ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            int alt22=2;
                                                                                                                                                                                                                            int LA22_0 = input.LA(1);

                                                                                                                                                                                                                            if ( (LA22_0==DELIMITER1) ) {
                                                                                                                                                                                                                                alt22=1;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            switch (alt22) {
                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:275:30: DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11227); 

                                                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11229);
                                                                                                                                                                                                                                    st_sized_optionnal("P_8.31", 20);

                                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:277:30: ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    int alt21=2;
                                                                                                                                                                                                                                    int LA21_0 = input.LA(1);

                                                                                                                                                                                                                                    if ( (LA21_0==DELIMITER1) ) {
                                                                                                                                                                                                                                        alt21=1;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    switch (alt21) {
                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:277:31: DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11292); 

                                                                                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11294);
                                                                                                                                                                                                                                            st_sized_optionnal("P_8.32", 20);

                                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:278:31: ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            int alt20=2;
                                                                                                                                                                                                                                            int LA20_0 = input.LA(1);

                                                                                                                                                                                                                                            if ( (LA20_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                alt20=1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            switch (alt20) {
                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:278:32: DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11328); 

                                                                                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_11330);
                                                                                                                                                                                                                                                    ts_sized_optionnal("P_8.33", 26);

                                                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:279:32: ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    int alt19=2;
                                                                                                                                                                                                                                                    int LA19_0 = input.LA(1);

                                                                                                                                                                                                                                                    if ( (LA19_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                        alt19=1;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    switch (alt19) {
                                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:279:33: DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )?
                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11365); 

                                                                                                                                                                                                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_11367);
                                                                                                                                                                                                                                                            ts_sized_optionnal("P_8.34", 26);

                                                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:280:33: ( DELIMITER1 )?
                                                                                                                                                                                                                                                            int alt18=2;
                                                                                                                                                                                                                                                            int LA18_0 = input.LA(1);

                                                                                                                                                                                                                                                            if ( (LA18_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                                alt18=1;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            switch (alt18) {
                                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:280:33: DELIMITER1
                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11402); 

                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                            }


                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:283:1: line_obr2_2 : line_obr2_1 ;
    public final void line_obr2_2() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:283:12: ( line_obr2_1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:284:3: line_obr2_1
            {
            pushFollow(FOLLOW_line_obr2_1_in_line_obr2_21473);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:286:1: line_obr2_1 : CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR_9.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR_9.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR_9.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR_9.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR_9.8\"] DELIMITER1 ts_sized_optionnal[\"OBR_9.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR_9.10\", 20] DELIMITER1 spec_sized_cna[\"OBR_9.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR_9.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_obr2_1() throws RecognitionException {
        startElement("ligne", "OBR");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:288:22: ( CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR_9.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR_9.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR_9.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR_9.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR_9.8\"] DELIMITER1 ts_sized_optionnal[\"OBR_9.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR_9.10\", 20] DELIMITER1 spec_sized_cna[\"OBR_9.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR_9.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:289:3: CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR_9.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR_9.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR_9.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR_9.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR_9.8\"] DELIMITER1 ts_sized_optionnal[\"OBR_9.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR_9.10\", 20] DELIMITER1 spec_sized_cna[\"OBR_9.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR_9.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_obr2_11490); 

            match(input,CHARO,FOLLOW_CHARO_in_line_obr2_11492); 

            match(input,CHARB,FOLLOW_CHARB_in_line_obr2_11494); 

            match(input,CHARR,FOLLOW_CHARR_in_line_obr2_11496); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11500); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_obr2_11502);
            nm_integer_sized_mandatory("OBR_9.2", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11507); 

            pushFollow(FOLLOW_spec_sized_9_3_in_line_obr2_11509);
            spec_sized_9_3("OBR_9.3", 23);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11514); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11516);
            spec_sized_mult_lvl1_st_optionnal_2("OBR_9.4", 23);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11521); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11523);
            spec_sized_mult_lvl1_st_optionnal_6("OBR_9.5", 640000);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:293:69: ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000] )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==REPETITEUR) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:293:70: REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11527); 

            	    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11529);
            	    spec_sized_mult_lvl1_st_optionnal_6("OBR_9.5", 64000);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11539); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11541);
            st_sized_optionnal("OBR_9.6", 2);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:295:47: ( REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2] )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==REPETITEUR) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:295:48: REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11545); 

            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11547);
            	    st_sized_optionnal("OBR_9.6", 2);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11554); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11556);
            ts_sized_optionnal("OBR_9.7", 26);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11561); 

            pushFollow(FOLLOW_spec_non_sized_9_8_in_line_obr2_11563);
            spec_non_sized_9_8("OBR_9.8");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11568); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11570);
            ts_sized_optionnal("OBR_9.9", 26);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11578); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11580);
            st_sized_optionnal("OBR_9.10", 20);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11585); 

            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_11587);
            spec_sized_cna("OBR_9.11", 60);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11595); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11597);
            st_sized_optionnal("OBR_9.12", 1);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:305:3: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==DELIMITER1) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:305:4: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11606); 

                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11608);
                    spec_sized_mult_lvl1_st_optionnal_2("OBR_9.13", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:306:4: ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==DELIMITER1) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:306:5: DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11615); 

                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11617);
                            st_sized_optionnal("OBR_9.14", 300);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:307:5: ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt76=2;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==DELIMITER1) ) {
                                alt76=1;
                            }
                            switch (alt76) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:307:6: DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11625); 

                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11627);
                                    ts_sized_optionnal("OBR_9.15", 26);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:308:6: ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt75=2;
                                    int LA75_0 = input.LA(1);

                                    if ( (LA75_0==DELIMITER1) ) {
                                        alt75=1;
                                    }
                                    switch (alt75) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:308:7: DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11636); 

                                            pushFollow(FOLLOW_spec_sized_9_16_in_line_obr2_11638);
                                            spec_sized_9_16("OBR_9_16", 300);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:309:7: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt74=2;
                                            int LA74_0 = input.LA(1);

                                            if ( (LA74_0==DELIMITER1) ) {
                                                alt74=1;
                                            }
                                            switch (alt74) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:309:8: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11648); 

                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11650);
                                                    spec_sized_mult_lvl1_st_optionnal_6("OBR_9.17", 60);

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:310:8: ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt73=2;
                                                    int LA73_0 = input.LA(1);

                                                    if ( (LA73_0==DELIMITER1) ) {
                                                        alt73=1;
                                                    }
                                                    switch (alt73) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:310:9: DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11661); 

                                                            pushFollow(FOLLOW_spec_sized_tn_in_line_obr2_11663);
                                                            spec_sized_tn("OBR_9.18", 40);

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:311:9: ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt72=2;
                                                            int LA72_0 = input.LA(1);

                                                            if ( (LA72_0==DELIMITER1) ) {
                                                                alt72=1;
                                                            }
                                                            switch (alt72) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:311:10: DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11675); 

                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11677);
                                                                    st_sized_optionnal("OBR_9.19", 60);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:312:10: ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt71=2;
                                                                    int LA71_0 = input.LA(1);

                                                                    if ( (LA71_0==DELIMITER1) ) {
                                                                        alt71=1;
                                                                    }
                                                                    switch (alt71) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:312:11: DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11690); 

                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11692);
                                                                            st_sized_optionnal("OBR_9.20", 60);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:313:11: ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt70=2;
                                                                            int LA70_0 = input.LA(1);

                                                                            if ( (LA70_0==DELIMITER1) ) {
                                                                                alt70=1;
                                                                            }
                                                                            switch (alt70) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:313:12: DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11706); 

                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11708);
                                                                                    st_sized_optionnal("OBR_9.21", 60);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:314:12: ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt69=2;
                                                                                    int LA69_0 = input.LA(1);

                                                                                    if ( (LA69_0==DELIMITER1) ) {
                                                                                        alt69=1;
                                                                                    }
                                                                                    switch (alt69) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:314:13: DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11723); 

                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11725);
                                                                                            st_sized_optionnal("OBR_9.22", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:315:13: ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt68=2;
                                                                                            int LA68_0 = input.LA(1);

                                                                                            if ( (LA68_0==DELIMITER1) ) {
                                                                                                alt68=1;
                                                                                            }
                                                                                            switch (alt68) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:315:14: DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11741); 

                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11743);
                                                                                                    ts_sized_optionnal("OBR_9.23", 26);

                                                                                                    state._fsp--;


                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:316:14: ( DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt67=2;
                                                                                                    int LA67_0 = input.LA(1);

                                                                                                    if ( (LA67_0==DELIMITER1) ) {
                                                                                                        alt67=1;
                                                                                                    }
                                                                                                    switch (alt67) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:316:15: DELIMITER1 spec_const_race[\"OBR_9.24\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11760); 

                                                                                                            pushFollow(FOLLOW_spec_const_race_in_line_obr2_11762);
                                                                                                            spec_const_race("OBR_9.24");

                                                                                                            state._fsp--;


                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:317:15: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt66=2;
                                                                                                            int LA66_0 = input.LA(1);

                                                                                                            if ( (LA66_0==DELIMITER1) ) {
                                                                                                                alt66=1;
                                                                                                            }
                                                                                                            switch (alt66) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:317:16: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11780); 

                                                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11782);
                                                                                                                    spec_sized_mult_lvl1_st_optionnal_2("OBR_9.25", 10);

                                                                                                                    state._fsp--;


                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:318:16: ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt65=2;
                                                                                                                    int LA65_0 = input.LA(1);

                                                                                                                    if ( (LA65_0==DELIMITER1) ) {
                                                                                                                        alt65=1;
                                                                                                                    }
                                                                                                                    switch (alt65) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:318:17: DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11801); 

                                                                                                                            pushFollow(FOLLOW_spec_const_9_26_in_line_obr2_11803);
                                                                                                                            spec_const_9_26("OBR_9.26");

                                                                                                                            state._fsp--;


                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:319:17: ( DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt64=2;
                                                                                                                            int LA64_0 = input.LA(1);

                                                                                                                            if ( (LA64_0==DELIMITER1) ) {
                                                                                                                                alt64=1;
                                                                                                                            }
                                                                                                                            switch (alt64) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:319:18: DELIMITER1 spec_const_race[\"OBR_9.27\"] ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11823); 

                                                                                                                                    pushFollow(FOLLOW_spec_const_race_in_line_obr2_11825);
                                                                                                                                    spec_const_race("OBR_9.27");

                                                                                                                                    state._fsp--;


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:320:18: ( DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt63=2;
                                                                                                                                    int LA63_0 = input.LA(1);

                                                                                                                                    if ( (LA63_0==DELIMITER1) ) {
                                                                                                                                        alt63=1;
                                                                                                                                    }
                                                                                                                                    switch (alt63) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:320:19: DELIMITER1 spec_const_race[\"OBR_9.28\"] ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11846); 

                                                                                                                                            pushFollow(FOLLOW_spec_const_race_in_line_obr2_11848);
                                                                                                                                            spec_const_race("OBR_9.28");

                                                                                                                                            state._fsp--;


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:321:19: ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt62=2;
                                                                                                                                            int LA62_0 = input.LA(1);

                                                                                                                                            if ( (LA62_0==DELIMITER1) ) {
                                                                                                                                                alt62=1;
                                                                                                                                            }
                                                                                                                                            switch (alt62) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:321:20: DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11870); 

                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_11872);
                                                                                                                                                    spec_sized_cna("OBR_9.29", 150);

                                                                                                                                                    state._fsp--;


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:321:63: ( REPETITEUR spec_sized_cna[\"OBR_9.29\", 150] )*
                                                                                                                                                    loop51:
                                                                                                                                                    do {
                                                                                                                                                        int alt51=2;
                                                                                                                                                        int LA51_0 = input.LA(1);

                                                                                                                                                        if ( (LA51_0==REPETITEUR) ) {
                                                                                                                                                            alt51=1;
                                                                                                                                                        }


                                                                                                                                                        switch (alt51) {
                                                                                                                                                    	case 1 :
                                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:321:64: REPETITEUR spec_sized_cna[\"OBR_9.29\", 150]
                                                                                                                                                    	    {
                                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11876); 

                                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_11878);
                                                                                                                                                    	    spec_sized_cna("OBR_9.29", 150);

                                                                                                                                                    	    state._fsp--;


                                                                                                                                                    	    }
                                                                                                                                                    	    break;

                                                                                                                                                    	default :
                                                                                                                                                    	    break loop51;
                                                                                                                                                        }
                                                                                                                                                    } while (true);


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:322:20: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt61=2;
                                                                                                                                                    int LA61_0 = input.LA(1);

                                                                                                                                                    if ( (LA61_0==DELIMITER1) ) {
                                                                                                                                                        alt61=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt61) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:322:21: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11903); 

                                                                                                                                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_4_in_line_obr2_11905);
                                                                                                                                                            spec_sized_mult_lvl1_st_optionnal_4("OBR_9.30", 150);

                                                                                                                                                            state._fsp--;


                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:323:21: ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt60=2;
                                                                                                                                                            int LA60_0 = input.LA(1);

                                                                                                                                                            if ( (LA60_0==DELIMITER1) ) {
                                                                                                                                                                alt60=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt60) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:323:22: DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11929); 

                                                                                                                                                                    pushFollow(FOLLOW_spec_const_9_31_in_line_obr2_11931);
                                                                                                                                                                    spec_const_9_31("OBR_9.31");

                                                                                                                                                                    state._fsp--;


                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:325:22: ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                    int alt59=2;
                                                                                                                                                                    int LA59_0 = input.LA(1);

                                                                                                                                                                    if ( (LA59_0==DELIMITER1) ) {
                                                                                                                                                                        alt59=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt59) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:325:23: DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11978); 

                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11980);
                                                                                                                                                                            st_sized_optionnal("OBR_9.32", 300);

                                                                                                                                                                            state._fsp--;


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:325:70: ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )*
                                                                                                                                                                            loop52:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt52=2;
                                                                                                                                                                                int LA52_0 = input.LA(1);

                                                                                                                                                                                if ( (LA52_0==REPETITEUR) ) {
                                                                                                                                                                                    alt52=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt52) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:325:71: REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11984); 

                                                                                                                                                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11986);
                                                                                                                                                                            	    st_sized_optionnal("OBR_9.32", 300);

                                                                                                                                                                            	    state._fsp--;


                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop52;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:326:23: ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                            int alt58=2;
                                                                                                                                                                            int LA58_0 = input.LA(1);

                                                                                                                                                                            if ( (LA58_0==DELIMITER1) ) {
                                                                                                                                                                                alt58=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt58) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:326:24: DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12014); 

                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12016);
                                                                                                                                                                                    spec_sized_cna("OBR_9.33", 60);

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:327:24: ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                    int alt57=2;
                                                                                                                                                                                    int LA57_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA57_0==DELIMITER1) ) {
                                                                                                                                                                                        alt57=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt57) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:327:25: DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12043); 

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12045);
                                                                                                                                                                                            spec_sized_cna("OBR_9.34", 60);

                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:328:25: ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                            int alt56=2;
                                                                                                                                                                                            int LA56_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA56_0==DELIMITER1) ) {
                                                                                                                                                                                                alt56=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt56) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:328:26: DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12073); 

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12075);
                                                                                                                                                                                                    spec_sized_cna("OBR_9.35", 60);

                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:329:26: ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                    int alt55=2;
                                                                                                                                                                                                    int LA55_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA55_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt55=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt55) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:329:27: DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12104); 

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12106);
                                                                                                                                                                                                            spec_sized_cna("OBR_9.36", 60);

                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:330:27: ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                            int alt54=2;
                                                                                                                                                                                                            int LA54_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA54_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt54=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt54) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:330:28: DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12136); 

                                                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_12138);
                                                                                                                                                                                                                    ts_sized_optionnal("OBR_9.37", 26);

                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:331:29: ( DELIMITER1 )?
                                                                                                                                                                                                                    int alt53=2;
                                                                                                                                                                                                                    int LA53_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA53_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt53=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt53) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:331:29: DELIMITER1
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12169); 

                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:333:1: line_obx2_1 : CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX_10.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) ) ;
    public final void line_obx2_1() throws RecognitionException {
        startElement("ligne", "OBX");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:335:22: ( CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX_10.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:336:3: CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX_10.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) )
            {
            match(input,CR,FOLLOW_CR_in_line_obx2_12237); 

            match(input,CHARO,FOLLOW_CHARO_in_line_obx2_12239); 

            match(input,CHARB,FOLLOW_CHARB_in_line_obx2_12241); 

            match(input,CHARX,FOLLOW_CHARX_in_line_obx2_12243); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12247); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_obx2_12249);
            nm_integer_sized_mandatory("OBX_10.2", 10);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12254); 

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:339:5: ( ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:339:6: ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:339:6: ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:339:7: spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_nm_in_line_obx2_12262);
                    spec_const_10_3_nm("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:340:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==DELIMITER1) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:340:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12271); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12273);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:341:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==DELIMITER1) ) {
                                alt82=1;
                            }
                            switch (alt82) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:341:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12283); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12285);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:342:8: ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt81=2;
                                    int LA81_0 = input.LA(1);

                                    if ( (LA81_0==DELIMITER1) ) {
                                        alt81=1;
                                    }
                                    switch (alt81) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:342:9: DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12296); 

                                            pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2_12298);
                                            nm_sized_optionnal("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:342:58: ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )*
                                            loop79:
                                            do {
                                                int alt79=2;
                                                int LA79_0 = input.LA(1);

                                                if ( (LA79_0==REPETITEUR) ) {
                                                    alt79=1;
                                                }


                                                switch (alt79) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:342:59: REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12302); 

                                            	    pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2_12304);
                                            	    nm_sized_optionnal("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop79;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:343:9: ( line_obx2_1_post10_6 )?
                                            int alt80=2;
                                            int LA80_0 = input.LA(1);

                                            if ( (LA80_0==DELIMITER1) ) {
                                                alt80=1;
                                            }
                                            switch (alt80) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:343:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12317);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:344:7: ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:344:7: ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:344:8: spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_ce_in_line_obx2_12334);
                    spec_const_10_3_ce("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:345:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==DELIMITER1) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:345:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12343); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12345);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:346:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==DELIMITER1) ) {
                                alt87=1;
                            }
                            switch (alt87) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:346:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12355); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12357);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:347:8: ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt86=2;
                                    int LA86_0 = input.LA(1);

                                    if ( (LA86_0==DELIMITER1) ) {
                                        alt86=1;
                                    }
                                    switch (alt86) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:347:9: DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12368); 

                                            pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12370);
                                            spec_sized_10_6("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:347:55: ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )*
                                            loop84:
                                            do {
                                                int alt84=2;
                                                int LA84_0 = input.LA(1);

                                                if ( (LA84_0==REPETITEUR) ) {
                                                    alt84=1;
                                                }


                                                switch (alt84) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:347:56: REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12374); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12376);
                                            	    spec_sized_10_6("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop84;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:348:9: ( line_obx2_1_post10_6 )?
                                            int alt85=2;
                                            int LA85_0 = input.LA(1);

                                            if ( (LA85_0==DELIMITER1) ) {
                                                alt85=1;
                                            }
                                            switch (alt85) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:348:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12389);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:349:7: ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:349:7: ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:349:8: spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_fic_in_line_obx2_12406);
                    spec_const_10_3_fic("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:350:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==DELIMITER1) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:350:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12415); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12417);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:351:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt92=2;
                            int LA92_0 = input.LA(1);

                            if ( (LA92_0==DELIMITER1) ) {
                                alt92=1;
                            }
                            switch (alt92) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:351:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12427); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12429);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:352:8: ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt91=2;
                                    int LA91_0 = input.LA(1);

                                    if ( (LA91_0==DELIMITER1) ) {
                                        alt91=1;
                                    }
                                    switch (alt91) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:352:9: DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12440); 

                                            pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12442);
                                            spec_sized_10_6("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:352:55: ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )*
                                            loop89:
                                            do {
                                                int alt89=2;
                                                int LA89_0 = input.LA(1);

                                                if ( (LA89_0==REPETITEUR) ) {
                                                    alt89=1;
                                                }


                                                switch (alt89) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:352:56: REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12446); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12448);
                                            	    spec_sized_10_6("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop89;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:353:9: ( line_obx2_1_post10_6 )?
                                            int alt90=2;
                                            int LA90_0 = input.LA(1);

                                            if ( (LA90_0==DELIMITER1) ) {
                                                alt90=1;
                                            }
                                            switch (alt90) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:353:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12461);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:354:7: ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:354:7: ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:354:8: spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_st_in_line_obx2_12478);
                    spec_const_10_3_st("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:355:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==DELIMITER1) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:355:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12487); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12489);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:356:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt97=2;
                            int LA97_0 = input.LA(1);

                            if ( (LA97_0==DELIMITER1) ) {
                                alt97=1;
                            }
                            switch (alt97) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:356:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12499); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12501);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:357:8: ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt96=2;
                                    int LA96_0 = input.LA(1);

                                    if ( (LA96_0==DELIMITER1) ) {
                                        alt96=1;
                                    }
                                    switch (alt96) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:357:9: DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12512); 

                                            pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12514);
                                            spec_sized_10_6_tx("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:357:58: ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )*
                                            loop94:
                                            do {
                                                int alt94=2;
                                                int LA94_0 = input.LA(1);

                                                if ( (LA94_0==REPETITEUR) ) {
                                                    alt94=1;
                                                }


                                                switch (alt94) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:357:59: REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12518); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12520);
                                            	    spec_sized_10_6_tx("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop94;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:358:9: ( line_obx2_1_post10_6 )?
                                            int alt95=2;
                                            int LA95_0 = input.LA(1);

                                            if ( (LA95_0==DELIMITER1) ) {
                                                alt95=1;
                                            }
                                            switch (alt95) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:358:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12533);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:359:7: ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:359:7: ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:359:8: spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_gc_in_line_obx2_12550);
                    spec_const_10_3_gc("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:360:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==DELIMITER1) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:360:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12559); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12561);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:361:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt102=2;
                            int LA102_0 = input.LA(1);

                            if ( (LA102_0==DELIMITER1) ) {
                                alt102=1;
                            }
                            switch (alt102) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:361:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12571); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12573);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:362:8: ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt101=2;
                                    int LA101_0 = input.LA(1);

                                    if ( (LA101_0==DELIMITER1) ) {
                                        alt101=1;
                                    }
                                    switch (alt101) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:362:9: DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12584); 

                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12586);
                                            spec_sized_mult_lvl1_nm_optionnal_2("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:362:75: ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )*
                                            loop99:
                                            do {
                                                int alt99=2;
                                                int LA99_0 = input.LA(1);

                                                if ( (LA99_0==REPETITEUR) ) {
                                                    alt99=1;
                                                }


                                                switch (alt99) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:362:76: REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12590); 

                                            	    pushFollow(FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12592);
                                            	    spec_sized_mult_lvl1_nm_optionnal_2("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop99;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:363:9: ( line_obx2_1_post10_6 )?
                                            int alt100=2;
                                            int LA100_0 = input.LA(1);

                                            if ( (LA100_0==DELIMITER1) ) {
                                                alt100=1;
                                            }
                                            switch (alt100) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:363:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12605);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:364:7: ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:364:7: ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:364:8: spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_tx_in_line_obx2_12622);
                    spec_const_10_3_tx("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:365:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==DELIMITER1) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:365:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12631); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12633);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:366:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt107=2;
                            int LA107_0 = input.LA(1);

                            if ( (LA107_0==DELIMITER1) ) {
                                alt107=1;
                            }
                            switch (alt107) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:366:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12643); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12645);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:367:8: ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt106=2;
                                    int LA106_0 = input.LA(1);

                                    if ( (LA106_0==DELIMITER1) ) {
                                        alt106=1;
                                    }
                                    switch (alt106) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:367:9: DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12656); 

                                            pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12658);
                                            spec_sized_10_6_tx("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:367:58: ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )*
                                            loop104:
                                            do {
                                                int alt104=2;
                                                int LA104_0 = input.LA(1);

                                                if ( (LA104_0==REPETITEUR) ) {
                                                    alt104=1;
                                                }


                                                switch (alt104) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:367:59: REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12662); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12664);
                                            	    spec_sized_10_6_tx("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop104;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:368:9: ( line_obx2_1_post10_6 )?
                                            int alt105=2;
                                            int LA105_0 = input.LA(1);

                                            if ( (LA105_0==DELIMITER1) ) {
                                                alt105=1;
                                            }
                                            switch (alt105) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:368:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12677);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:369:7: ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:369:7: ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:369:8: spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_std_in_line_obx2_12694);
                    spec_const_10_3_std("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:370:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==DELIMITER1) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:370:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12703); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12705);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:371:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt112=2;
                            int LA112_0 = input.LA(1);

                            if ( (LA112_0==DELIMITER1) ) {
                                alt112=1;
                            }
                            switch (alt112) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:371:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12715); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12717);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:372:8: ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt111=2;
                                    int LA111_0 = input.LA(1);

                                    if ( (LA111_0==DELIMITER1) ) {
                                        alt111=1;
                                    }
                                    switch (alt111) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:372:9: DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12728); 

                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12730);
                                            st_sized_optionnal("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:372:58: ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )*
                                            loop109:
                                            do {
                                                int alt109=2;
                                                int LA109_0 = input.LA(1);

                                                if ( (LA109_0==REPETITEUR) ) {
                                                    alt109=1;
                                                }


                                                switch (alt109) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:372:59: REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12734); 

                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12736);
                                            	    st_sized_optionnal("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop109;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:373:9: ( line_obx2_1_post10_6 )?
                                            int alt110=2;
                                            int LA110_0 = input.LA(1);

                                            if ( (LA110_0==DELIMITER1) ) {
                                                alt110=1;
                                            }
                                            switch (alt110) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:373:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12749);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:375:1: line_obx2_1_post10_6 : ( DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? ) ;
    public final void line_obx2_1_post10_6() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:375:21: ( ( DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:376:5: ( DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:376:5: ( DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:376:6: DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62770); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62772);
            st_sized_optionnal("OBX_10.7", 20);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:377:6: ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==DELIMITER1) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:377:7: DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62781); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62783);
                    st_sized_optionnal("OBX_10.8", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:377:53: ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==REPETITEUR) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:377:54: REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60]
                    	    {
                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_62787); 

                    	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62789);
                    	    st_sized_optionnal("OBX_10.8", 60);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:378:7: ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==DELIMITER1) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:378:8: DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62801); 

                            pushFollow(FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62803);
                            spec_const_10_9("OBX_10.9");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:378:47: ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )*
                            loop116:
                            do {
                                int alt116=2;
                                int LA116_0 = input.LA(1);

                                if ( (LA116_0==REPETITEUR) ) {
                                    alt116=1;
                                }


                                switch (alt116) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:378:48: REPETITEUR spec_const_10_9[\"OBX_10.9\"]
                            	    {
                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_62807); 

                            	    pushFollow(FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62809);
                            	    spec_const_10_9("OBX_10.9");

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop116;
                                }
                            } while (true);


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:379:8: ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                            int alt126=2;
                            int LA126_0 = input.LA(1);

                            if ( (LA126_0==DELIMITER1) ) {
                                alt126=1;
                            }
                            switch (alt126) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:379:9: DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62822); 

                                    pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2_1_post10_62824);
                                    nm_sized_optionnal("OBX_10.10", 5);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:380:9: ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                    int alt125=2;
                                    int LA125_0 = input.LA(1);

                                    if ( (LA125_0==DELIMITER1) ) {
                                        alt125=1;
                                    }
                                    switch (alt125) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:380:10: DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62836); 

                                            pushFollow(FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62838);
                                            spec_const_10_11("OBX_10.11");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:380:51: ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )*
                                            loop117:
                                            do {
                                                int alt117=2;
                                                int LA117_0 = input.LA(1);

                                                if ( (LA117_0==REPETITEUR) ) {
                                                    alt117=1;
                                                }


                                                switch (alt117) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:380:52: REPETITEUR spec_const_10_11[\"OBX_10.11\"]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_62842); 

                                            	    pushFollow(FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62844);
                                            	    spec_const_10_11("OBX_10.11");

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop117;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:381:10: ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )?
                                            int alt124=2;
                                            int LA124_0 = input.LA(1);

                                            if ( (LA124_0==DELIMITER1) ) {
                                                alt124=1;
                                            }
                                            switch (alt124) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:381:11: DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62859); 

                                                    pushFollow(FOLLOW_spec_const_10_12_in_line_obx2_1_post10_62861);
                                                    spec_const_10_12("OBX_10.12");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:382:11: ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )?
                                                    int alt123=2;
                                                    int LA123_0 = input.LA(1);

                                                    if ( (LA123_0==DELIMITER1) ) {
                                                        alt123=1;
                                                    }
                                                    switch (alt123) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:382:12: DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62876); 

                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62878);
                                                            ts_sized_optionnal("OBX_10.13", 26);

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:383:12: ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )?
                                                            int alt122=2;
                                                            int LA122_0 = input.LA(1);

                                                            if ( (LA122_0==DELIMITER1) ) {
                                                                alt122=1;
                                                            }
                                                            switch (alt122) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:383:13: DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62894); 

                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62896);
                                                                    st_sized_optionnal("OBX_10.14", 20);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:384:13: ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )?
                                                                    int alt121=2;
                                                                    int LA121_0 = input.LA(1);

                                                                    if ( (LA121_0==DELIMITER1) ) {
                                                                        alt121=1;
                                                                    }
                                                                    switch (alt121) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:384:14: DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62912); 

                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62914);
                                                                            ts_sized_optionnal("OBX_10.15", 26);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:385:14: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )?
                                                                            int alt120=2;
                                                                            int LA120_0 = input.LA(1);

                                                                            if ( (LA120_0==DELIMITER1) ) {
                                                                                alt120=1;
                                                                            }
                                                                            switch (alt120) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:385:15: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62931); 

                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obx2_1_post10_62933);
                                                                                    spec_sized_mult_lvl1_st_optionnal_6("OBX_10.16", 60);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:386:15: ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )?
                                                                                    int alt119=2;
                                                                                    int LA119_0 = input.LA(1);

                                                                                    if ( (LA119_0==DELIMITER1) ) {
                                                                                        alt119=1;
                                                                                    }
                                                                                    switch (alt119) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:386:16: DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62951); 

                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62953);
                                                                                            st_sized_optionnal("OBX_10.17", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:386:63: ( DELIMITER1 )?
                                                                                            int alt118=2;
                                                                                            int LA118_0 = input.LA(1);

                                                                                            if ( (LA118_0==DELIMITER1) ) {
                                                                                                alt118=1;
                                                                                            }
                                                                                            switch (alt118) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:386:63: DELIMITER1
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62956); 

                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:388:1: line_c2_1 : CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C_12.2\", 10] DELIMITER1 spec_const_12_3[\"C_12.3\"] DELIMITER1 st_sized_optionnal[\"C_12.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C_12.4\", 64000] )* ( DELIMITER1 )? ;
    public final void line_c2_1() throws RecognitionException {
        startElement("ligne", "C");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:390:22: ( CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C_12.2\", 10] DELIMITER1 spec_const_12_3[\"C_12.3\"] DELIMITER1 st_sized_optionnal[\"C_12.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C_12.4\", 64000] )* ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:391:3: CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C_12.2\", 10] DELIMITER1 spec_const_12_3[\"C_12.3\"] DELIMITER1 st_sized_optionnal[\"C_12.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C_12.4\", 64000] )* ( DELIMITER1 )?
            {
            match(input,CR,FOLLOW_CR_in_line_c2_12995); 

            match(input,CHARC,FOLLOW_CHARC_in_line_c2_12997); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_13001); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_c2_13003);
            nm_integer_sized_mandatory("C_12.2", 10);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_13008); 

            pushFollow(FOLLOW_spec_const_12_3_in_line_c2_13010);
            spec_const_12_3("C_12.3");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_13015); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_c2_13017);
            st_sized_optionnal("C_12.4", 64000);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:394:50: ( REPETITEUR st_sized_optionnal[\"C_12.4\", 64000] )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==REPETITEUR) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:394:51: REPETITEUR st_sized_optionnal[\"C_12.4\", 64000]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_c2_13021); 

            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_c2_13023);
            	    st_sized_optionnal("C_12.4", 64000);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:395:3: ( DELIMITER1 )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==DELIMITER1) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:395:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_13032); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:397:1: line_l2_1 : CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )? )? ;
    public final void line_l2_1() throws RecognitionException {
        startElement("ligne", "L");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:399:22: ( CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:400:3: CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_l2_13050); 

            match(input,CHARL,FOLLOW_CHARL_in_line_l2_13052); 

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:401:3: ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )? )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==DELIMITER1) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:401:4: DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13057); 

                    pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l2_13059);
                    nm_integer_sized_optionnal("L_14.2", 1);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:402:4: ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==DELIMITER1) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:402:5: DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13066); 

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:403:5: ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )?
                            int alt134=2;
                            int LA134_0 = input.LA(1);

                            if ( (LA134_0==DELIMITER1) ) {
                                alt134=1;
                            }
                            switch (alt134) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:403:6: DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13073); 

                                    pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l2_13075);
                                    nm_integer_sized_optionnal("L_14.4", 4);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:404:6: ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )?
                                    int alt133=2;
                                    int LA133_0 = input.LA(1);

                                    if ( (LA133_0==DELIMITER1) ) {
                                        alt133=1;
                                    }
                                    switch (alt133) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:404:7: DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13084); 

                                            pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l2_13086);
                                            nm_integer_sized_optionnal("L_14.5", 10);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:405:7: ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )?
                                            int alt132=2;
                                            int LA132_0 = input.LA(1);

                                            if ( (LA132_0==DELIMITER1) ) {
                                                alt132=1;
                                            }
                                            switch (alt132) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:405:8: DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13096); 

                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_l2_13098);
                                                    st_sized_optionnal("L_14.6", 12);

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:405:52: ( DELIMITER1 )?
                                                    int alt131=2;
                                                    int LA131_0 = input.LA(1);

                                                    if ( (LA131_0==DELIMITER1) ) {
                                                        alt131=1;
                                                    }
                                                    switch (alt131) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:405:52: DELIMITER1
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13101); 

                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:415:1: spec_const_sexe[String nameElement] : ( final_charM | final_charF | final_charU )? ;
    public final void spec_const_sexe(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:417:22: ( ( final_charM | final_charF | final_charU )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:418:3: ( final_charM | final_charF | final_charU )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:418:3: ( final_charM | final_charF | final_charU )?
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:418:4: final_charM
                    {
                    pushFollow(FOLLOW_final_charM_in_spec_const_sexe3139);
                    final_charM();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:418:18: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_sexe3143);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:418:32: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_sexe3147);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:1: spec_const_race[String nameElement] :;
    public final void spec_const_race(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:422:22: ()
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:423:3: 
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:425:1: spec_const_7_13_version_2_0[String nameElement] : spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_0(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:427:22: ( spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:428:3: spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_0_in_spec_const_7_13_version_2_03184);
            spec_const_7_13_1_version_2_0(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_03187); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_03189);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:1: spec_const_7_13_version_2_1[String nameElement] : spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_1(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:432:22: ( spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:433:3: spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_1_in_spec_const_7_13_version_2_13210);
            spec_const_7_13_1_version_2_1(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_13213); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_13215);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:435:1: spec_const_7_13_version_2_2[String nameElement] : spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_2(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:437:22: ( spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:438:3: spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_2_in_spec_const_7_13_version_2_23234);
            spec_const_7_13_1_version_2_2(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_23237); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_23239);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:440:1: spec_const_7_13_2[String nameElement] : ( final_charC | final_charL | final_charR );
    public final void spec_const_7_13_2(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:442:22: ( final_charC | final_charL | final_charR )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:443:3: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_7_13_23258);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:443:17: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_7_13_23262);
                    final_charL();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:443:31: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_7_13_23266);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:1: spec_const_7_7_contexte[String nameElement] : final_ORU ;
    public final void spec_const_7_7_contexte(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:447:22: ( final_ORU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:448:3: final_ORU
            {
            pushFollow(FOLLOW_final_ORU_in_spec_const_7_7_contexte3284);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:450:1: spec_const_7_12[String nameElement] : ( final_charP | final_charD | final_charT ) ;
    public final void spec_const_7_12(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:452:22: ( ( final_charP | final_charD | final_charT ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:453:3: ( final_charP | final_charD | final_charT )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:453:3: ( final_charP | final_charD | final_charT )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:453:4: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_7_123303);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:453:18: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_7_123307);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:453:32: final_charT
                    {
                    pushFollow(FOLLOW_final_charT_in_spec_const_7_123311);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:455:1: spec_const_9_31[String nameElement] : ( final_PORT | final_CART | final_WHLC | final_WALK )? ;
    public final void spec_const_9_31(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:457:22: ( ( final_PORT | final_CART | final_WHLC | final_WALK )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:3: ( final_PORT | final_CART | final_WHLC | final_WALK )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:3: ( final_PORT | final_CART | final_WHLC | final_WALK )?
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:4: final_PORT
                    {
                    pushFollow(FOLLOW_final_PORT_in_spec_const_9_313331);
                    final_PORT();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:17: final_CART
                    {
                    pushFollow(FOLLOW_final_CART_in_spec_const_9_313335);
                    final_CART();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:30: final_WHLC
                    {
                    pushFollow(FOLLOW_final_WHLC_in_spec_const_9_313339);
                    final_WHLC();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:43: final_WALK
                    {
                    pushFollow(FOLLOW_final_WALK_in_spec_const_9_313343);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:460:1: spec_const_8_25[String nameElement] : ( final_OP | final_IP | final_ER | final_PA | final_MP )? ;
    public final void spec_const_8_25(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:462:22: ( ( final_OP | final_IP | final_ER | final_PA | final_MP )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:463:3: ( final_OP | final_IP | final_ER | final_PA | final_MP )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:463:3: ( final_OP | final_IP | final_ER | final_PA | final_MP )?
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:463:4: final_OP
                    {
                    pushFollow(FOLLOW_final_OP_in_spec_const_8_253364);
                    final_OP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:463:15: final_IP
                    {
                    pushFollow(FOLLOW_final_IP_in_spec_const_8_253368);
                    final_IP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:463:26: final_ER
                    {
                    pushFollow(FOLLOW_final_ER_in_spec_const_8_253372);
                    final_ER();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:463:37: final_PA
                    {
                    pushFollow(FOLLOW_final_PA_in_spec_const_8_253376);
                    final_PA();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:463:48: final_MP
                    {
                    pushFollow(FOLLOW_final_MP_in_spec_const_8_253380);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:465:1: spec_const_9_26[String nameElement] : ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )? ;
    public final void spec_const_9_26(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:467:22: ( ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:468:3: ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:468:3: ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )?
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:468:4: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_9_263401);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:468:18: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_9_263405);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:468:32: final_charM
                    {
                    pushFollow(FOLLOW_final_charM_in_spec_const_9_263409);
                    final_charM();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:468:46: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_9_263413);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:468:60: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_9_263417);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:468:74: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_9_263421);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:468:88: final_charO
                    {
                    pushFollow(FOLLOW_final_charO_in_spec_const_9_263425);
                    final_charO();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:469:3: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_9_263431);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:469:17: final_charX
                    {
                    pushFollow(FOLLOW_final_charX_in_spec_const_9_263435);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:471:1: spec_const_10_3_nm[String nameElement] : CHARN CHARM ;
    public final HPRIMSParser.spec_const_10_3_nm_return spec_const_10_3_nm(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_nm_return retval = new HPRIMSParser.spec_const_10_3_nm_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:473:22: ( CHARN CHARM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:474:3: CHARN CHARM
            {
            match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_nm3456); 

            match(input,CHARM,FOLLOW_CHARM_in_spec_const_10_3_nm3458); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:476:1: spec_const_10_3_ce[String nameElement] : CHARC CHARE ;
    public final HPRIMSParser.spec_const_10_3_ce_return spec_const_10_3_ce(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_ce_return retval = new HPRIMSParser.spec_const_10_3_ce_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:478:22: ( CHARC CHARE )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:479:3: CHARC CHARE
            {
            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_ce3479); 

            match(input,CHARE,FOLLOW_CHARE_in_spec_const_10_3_ce3481); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:1: spec_const_10_3_st[String nameElement] : CHARS CHART ;
    public final HPRIMSParser.spec_const_10_3_st_return spec_const_10_3_st(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_st_return retval = new HPRIMSParser.spec_const_10_3_st_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:483:22: ( CHARS CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:484:3: CHARS CHART
            {
            match(input,CHARS,FOLLOW_CHARS_in_spec_const_10_3_st3502); 

            match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_st3504); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:486:1: spec_const_10_3_gc[String nameElement] : CHARG CHARC ;
    public final HPRIMSParser.spec_const_10_3_gc_return spec_const_10_3_gc(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_gc_return retval = new HPRIMSParser.spec_const_10_3_gc_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:488:22: ( CHARG CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:489:3: CHARG CHARC
            {
            match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_gc3525); 

            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_gc3527); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:491:1: spec_const_10_3_tx[String nameElement] : CHART CHARX ;
    public final HPRIMSParser.spec_const_10_3_tx_return spec_const_10_3_tx(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_tx_return retval = new HPRIMSParser.spec_const_10_3_tx_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:493:22: ( CHART CHARX )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:494:3: CHART CHARX
            {
            match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_tx3549); 

            match(input,CHARX,FOLLOW_CHARX_in_spec_const_10_3_tx3551); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:496:1: spec_const_10_3_fic[String nameElement] : ( CHARF CHARI CHARC ) ;
    public final HPRIMSParser.spec_const_10_3_fic_return spec_const_10_3_fic(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_fic_return retval = new HPRIMSParser.spec_const_10_3_fic_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:498:22: ( ( CHARF CHARI CHARC ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:3: ( CHARF CHARI CHARC )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:3: ( CHARF CHARI CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:4: CHARF CHARI CHARC
            {
            match(input,CHARF,FOLLOW_CHARF_in_spec_const_10_3_fic3572); 

            match(input,CHARI,FOLLOW_CHARI_in_spec_const_10_3_fic3574); 

            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_fic3576); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:501:1: spec_const_10_3_std[String nameElement] : ( ( CHARA CHARD ) | ( CHARC CHARK ) | ( CHARC CHARN CHARA ) | ( CHARD CHART ) | ( CHARP CHARN ) | ( CHART CHARN ) | ( CHARG CHARB ) | ( CHARG CHARN ) );
    public final HPRIMSParser.spec_const_10_3_std_return spec_const_10_3_std(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_std_return retval = new HPRIMSParser.spec_const_10_3_std_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:503:22: ( ( CHARA CHARD ) | ( CHARC CHARK ) | ( CHARC CHARN CHARA ) | ( CHARD CHART ) | ( CHARP CHARN ) | ( CHART CHARN ) | ( CHARG CHARB ) | ( CHARG CHARN ) )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:3: ( CHARA CHARD )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:3: ( CHARA CHARD )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:4: CHARA CHARD
                    {
                    match(input,CHARA,FOLLOW_CHARA_in_spec_const_10_3_std3598); 

                    match(input,CHARD,FOLLOW_CHARD_in_spec_const_10_3_std3600); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:19: ( CHARC CHARK )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:19: ( CHARC CHARK )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:20: CHARC CHARK
                    {
                    match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_std3606); 

                    match(input,CHARK,FOLLOW_CHARK_in_spec_const_10_3_std3608); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:35: ( CHARC CHARN CHARA )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:35: ( CHARC CHARN CHARA )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:36: CHARC CHARN CHARA
                    {
                    match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_std3614); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3616); 

                    match(input,CHARA,FOLLOW_CHARA_in_spec_const_10_3_std3618); 

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:57: ( CHARD CHART )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:57: ( CHARD CHART )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:58: CHARD CHART
                    {
                    match(input,CHARD,FOLLOW_CHARD_in_spec_const_10_3_std3624); 

                    match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_std3626); 

                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:3: ( CHARP CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:3: ( CHARP CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:4: CHARP CHARN
                    {
                    match(input,CHARP,FOLLOW_CHARP_in_spec_const_10_3_std3634); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3636); 

                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:19: ( CHART CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:19: ( CHART CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:20: CHART CHARN
                    {
                    match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_std3642); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3644); 

                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:506:3: ( CHARG CHARB )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:506:3: ( CHARG CHARB )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:506:4: CHARG CHARB
                    {
                    match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_std3652); 

                    match(input,CHARB,FOLLOW_CHARB_in_spec_const_10_3_std3654); 

                    }


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:506:19: ( CHARG CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:506:19: ( CHARG CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:506:20: CHARG CHARN
                    {
                    match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_std3660); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3662); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:510:1: spec_sized_10_6[String nameElement, int maxSize] : st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )? ;
    public final HPRIMSParser.spec_sized_10_6_return spec_sized_10_6(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_10_6_return retval = new HPRIMSParser.spec_sized_10_6_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:512:22: ( st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:513:3: st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )?
            {
            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_63685);
            st_sized_optionnal(nameElement + ".1", 10);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:514:3: ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==DELIMITER2) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:514:4: DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_63691); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_63693);
                    st_sized_optionnal(nameElement + ".2", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:515:4: ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==DELIMITER2) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:515:5: DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_63700); 

                            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_63702);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:518:1: spec_const_10_9[String nameElement] : ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )? ;
    public final void spec_const_10_9(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:520:22: ( ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:3: ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:3: ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )?
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:4: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_10_93730);
                    final_charL();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:18: final_charH
                    {
                    pushFollow(FOLLOW_final_charH_in_spec_const_10_93734);
                    final_charH();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:32: final_LL
                    {
                    pushFollow(FOLLOW_final_LL_in_spec_const_10_93738);
                    final_LL();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:43: final_HH
                    {
                    pushFollow(FOLLOW_final_HH_in_spec_const_10_93742);
                    final_HH();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:54: final_symbol_inf
                    {
                    pushFollow(FOLLOW_final_symbol_inf_in_spec_const_10_93746);
                    final_symbol_inf();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:73: final_symbol_sup
                    {
                    pushFollow(FOLLOW_final_symbol_sup_in_spec_const_10_93750);
                    final_symbol_sup();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:522:3: final_charN
                    {
                    pushFollow(FOLLOW_final_charN_in_spec_const_10_93756);
                    final_charN();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:522:17: final_charA
                    {
                    pushFollow(FOLLOW_final_charA_in_spec_const_10_93760);
                    final_charA();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:522:31: final_AA
                    {
                    pushFollow(FOLLOW_final_AA_in_spec_const_10_93764);
                    final_AA();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:522:42: final_Null
                    {
                    pushFollow(FOLLOW_final_Null_in_spec_const_10_93768);
                    final_Null();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:522:55: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_10_93772);
                    final_charU();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:522:69: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_10_93776);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:522:83: final_charB
                    {
                    pushFollow(FOLLOW_final_charB_in_spec_const_10_93780);
                    final_charB();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:523:3: final_charW
                    {
                    pushFollow(FOLLOW_final_charW_in_spec_const_10_93786);
                    final_charW();

                    state._fsp--;


                    }
                    break;
                case 15 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:523:17: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_93790);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 16 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:523:31: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_10_93794);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 17 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:523:45: final_charS
                    {
                    pushFollow(FOLLOW_final_charS_in_spec_const_10_93798);
                    final_charS();

                    state._fsp--;


                    }
                    break;
                case 18 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:523:59: final_MS
                    {
                    pushFollow(FOLLOW_final_MS_in_spec_const_10_93802);
                    final_MS();

                    state._fsp--;


                    }
                    break;
                case 19 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:523:70: final_VS
                    {
                    pushFollow(FOLLOW_final_VS_in_spec_const_10_93806);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:525:1: spec_const_10_11[String nameElement] : ( final_charA | final_charS | final_charR | final_charN )? ;
    public final void spec_const_10_11(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:527:22: ( ( final_charA | final_charS | final_charR | final_charN )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:528:3: ( final_charA | final_charS | final_charR | final_charN )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:528:3: ( final_charA | final_charS | final_charR | final_charN )?
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:528:4: final_charA
                    {
                    pushFollow(FOLLOW_final_charA_in_spec_const_10_113827);
                    final_charA();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:528:18: final_charS
                    {
                    pushFollow(FOLLOW_final_charS_in_spec_const_10_113831);
                    final_charS();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:528:32: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_113835);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:528:46: final_charN
                    {
                    pushFollow(FOLLOW_final_charN_in_spec_const_10_113839);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:530:1: spec_const_10_12[String nameElement] : ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )? ;
    public final void spec_const_10_12(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:532:22: ( ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:533:3: ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:533:3: ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )?
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:533:4: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_123860);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:533:18: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_10_123864);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:533:32: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_10_123868);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:533:46: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_10_123872);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:533:60: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_10_123876);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:533:74: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_10_123880);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:534:4: final_charX
                    {
                    pushFollow(FOLLOW_final_charX_in_spec_const_10_123887);
                    final_charX();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:534:18: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_10_123891);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:536:1: spec_const_12_3[String nameElement] : ( final_charP | final_charL )? ;
    public final void spec_const_12_3(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:538:22: ( ( final_charP | final_charL )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:3: ( final_charP | final_charL )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:3: ( final_charP | final_charL )?
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:4: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_12_33912);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:18: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_12_33916);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:541:1: spec_sized_mult_lvl1_st_mandatory_2[String nameElement, int maxSize] : st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return spec_sized_mult_lvl1_st_mandatory_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:543:22: ( st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:544:3: st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_23936);
            st_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_23942); 

            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_23944);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:548:1: spec_sized_mult_lvl1_st_optionnal_2[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return spec_sized_mult_lvl1_st_optionnal_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:550:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:551:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_23967);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:552:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==DELIMITER2) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:552:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"]
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_23973); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_23975);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:556:1: spec_sized_mult_lvl1_st_optionnal_4[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return spec_sized_mult_lvl1_st_optionnal_4(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:558:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:559:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44000);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:560:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==DELIMITER2) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:560:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44006); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44008);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:561:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )?
                    int alt152=2;
                    int LA152_0 = input.LA(1);

                    if ( (LA152_0==DELIMITER2) ) {
                        alt152=1;
                    }
                    switch (alt152) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:561:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44015); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44017);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:562:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
                            int alt151=2;
                            int LA151_0 = input.LA(1);

                            if ( (LA151_0==DELIMITER2) ) {
                                alt151=1;
                            }
                            switch (alt151) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:562:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"]
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44025); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44027);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:566:1: spec_sized_mult_lvl1_st_optionnal_6[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return spec_sized_mult_lvl1_st_optionnal_6(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:568:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:569:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64056);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:570:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==DELIMITER2) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:570:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64063); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64065);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:571:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    int alt157=2;
                    int LA157_0 = input.LA(1);

                    if ( (LA157_0==DELIMITER2) ) {
                        alt157=1;
                    }
                    switch (alt157) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:571:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64073); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64075);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:572:6: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            int alt156=2;
                            int LA156_0 = input.LA(1);

                            if ( (LA156_0==DELIMITER2) ) {
                                alt156=1;
                            }
                            switch (alt156) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:572:7: DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64084); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64086);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:573:7: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    int alt155=2;
                                    int LA155_0 = input.LA(1);

                                    if ( (LA155_0==DELIMITER2) ) {
                                        alt155=1;
                                    }
                                    switch (alt155) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:573:8: DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64096); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64098);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:574:8: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            int alt154=2;
                                            int LA154_0 = input.LA(1);

                                            if ( (LA154_0==DELIMITER2) ) {
                                                alt154=1;
                                            }
                                            switch (alt154) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:574:9: DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64109); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64111);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:578:1: spec_sized_mult_lvl1_st_optionnal_8[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return spec_sized_mult_lvl1_st_optionnal_8(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:580:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:581:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84144);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:582:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==DELIMITER2) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:582:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84150); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84152);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:583:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )?
                    int alt164=2;
                    int LA164_0 = input.LA(1);

                    if ( (LA164_0==DELIMITER2) ) {
                        alt164=1;
                    }
                    switch (alt164) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:583:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84159); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84161);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:584:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )?
                            int alt163=2;
                            int LA163_0 = input.LA(1);

                            if ( (LA163_0==DELIMITER2) ) {
                                alt163=1;
                            }
                            switch (alt163) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:584:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84169); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84171);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:6: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )?
                                    int alt162=2;
                                    int LA162_0 = input.LA(1);

                                    if ( (LA162_0==DELIMITER2) ) {
                                        alt162=1;
                                    }
                                    switch (alt162) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:585:7: DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84180); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84182);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:7: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )?
                                            int alt161=2;
                                            int LA161_0 = input.LA(1);

                                            if ( (LA161_0==DELIMITER2) ) {
                                                alt161=1;
                                            }
                                            switch (alt161) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:8: DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )?
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84192); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84194);
                                                    st_non_sized_optionnal(nameElement + ".6");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:587:8: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )?
                                                    int alt160=2;
                                                    int LA160_0 = input.LA(1);

                                                    if ( (LA160_0==DELIMITER2) ) {
                                                        alt160=1;
                                                    }
                                                    switch (alt160) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:587:9: DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )?
                                                            {
                                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84205); 

                                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84207);
                                                            st_non_sized_optionnal(nameElement + ".7");

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:588:9: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )?
                                                            int alt159=2;
                                                            int LA159_0 = input.LA(1);

                                                            if ( (LA159_0==DELIMITER2) ) {
                                                                alt159=1;
                                                            }
                                                            switch (alt159) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:588:10: DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"]
                                                                    {
                                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84219); 

                                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84221);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:592:1: spec_sized_mult_lvl2_st_optionnal_3[String nameElement] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final void spec_sized_mult_lvl2_st_optionnal_3(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:594:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:595:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34258);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:596:3: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==DELIMITER3) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:596:4: DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34264); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34266);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:597:4: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==DELIMITER3) ) {
                        alt166=1;
                    }
                    switch (alt166) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:597:5: DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34273); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34275);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:599:1: spec_sized_mult_lvl2_st_optionnal_6[String nameElement] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? ;
    public final void spec_sized_mult_lvl2_st_optionnal_6(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:601:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:602:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64298);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:603:3: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==DELIMITER3) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:603:4: DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64304); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64306);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:604:4: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    int alt171=2;
                    int LA171_0 = input.LA(1);

                    if ( (LA171_0==DELIMITER3) ) {
                        alt171=1;
                    }
                    switch (alt171) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:604:5: DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64313); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64315);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:605:5: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            int alt170=2;
                            int LA170_0 = input.LA(1);

                            if ( (LA170_0==DELIMITER3) ) {
                                alt170=1;
                            }
                            switch (alt170) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:605:6: DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64323); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64325);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:606:6: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    int alt169=2;
                                    int LA169_0 = input.LA(1);

                                    if ( (LA169_0==DELIMITER3) ) {
                                        alt169=1;
                                    }
                                    switch (alt169) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:606:7: DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64334); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64336);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:607:7: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            int alt168=2;
                                            int LA168_0 = input.LA(1);

                                            if ( (LA168_0==DELIMITER3) ) {
                                                alt168=1;
                                            }
                                            switch (alt168) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:607:8: DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64346); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64348);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:609:1: spec_sized_mult_lvl1_nm_optionnal_2[String nameElement, int maxSize] : nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return spec_sized_mult_lvl1_nm_optionnal_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:611:22: ( nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:612:3: nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24377);
            nm_nonsized_optionnal(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_optionnal_24382); 

            pushFollow(FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24384);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:616:1: spec_sized_mult_lvl1_nm_mandatory_2[String nameElement, int maxSize] : nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return spec_sized_mult_lvl1_nm_mandatory_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:618:22: ( nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:619:3: nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24409);
            nm_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_mandatory_24414); 

            pushFollow(FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24416);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:623:1: spec_sized_cna[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_cna_return spec_sized_cna(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_cna_return retval = new HPRIMSParser.spec_sized_cna_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:625:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:626:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4439);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:627:4: ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==DELIMITER2) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:627:5: DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna4446); 

                    pushFollow(FOLLOW_spec_sized_mult_lvl2_st_optionnal_6_in_spec_sized_cna4448);
                    spec_sized_mult_lvl2_st_optionnal_6(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:628:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==DELIMITER2) ) {
                        alt173=1;
                    }
                    switch (alt173) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:628:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna4456); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4458);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:636:1: spec_sized_8_3[String nameElement, int maxSize] : ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_8_3_return spec_sized_8_3(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_8_3_return retval = new HPRIMSParser.spec_sized_8_3_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:638:22: ( ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:639:3: ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:639:3: ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( ((LA176_0 >= CHARA && LA176_0 <= CHIFFRE9)||(LA176_0 >= LETTRE && LA176_0 <= POINT)) ) {
                alt176=1;
            }
            switch (alt176) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:639:4: st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    pushFollow(FOLLOW_st_sized_mandatory_in_spec_sized_8_34490);
                    st_sized_mandatory(nameElement + ".1", 16);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:640:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt175=2;
                    int LA175_0 = input.LA(1);

                    if ( (LA175_0==DELIMITER2) ) {
                        alt175=1;
                    }
                    switch (alt175) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:640:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_8_34497); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34499);
                            st_non_sized_optionnal(nameElement + ".2");

                            state._fsp--;


                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_8_34507); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34509);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:652:1: spec_sized_9_3[String nameElement, int maxSize] : st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )? ;
    public final HPRIMSParser.spec_sized_9_3_return spec_sized_9_3(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_9_3_return retval = new HPRIMSParser.spec_sized_9_3_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:654:22: ( st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:656:3: st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )?
            {
            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_9_34549);
            st_sized_optionnal(nameElement + ".1", 12);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:657:3: ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==DELIMITER2) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:657:4: DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10]
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_34555); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_9_34557);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:660:1: spec_non_sized_9_8[String nameElement] : ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )? ;
    public final void spec_non_sized_9_8(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:662:22: ( ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:663:3: ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )?
            {
            pushFollow(FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84582);
            ts_sized_optionnal(nameElement + ".1", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:664:4: ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==REPETITEUR) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:664:5: REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_spec_non_sized_9_84589); 

                    pushFollow(FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84591);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:666:1: spec_sized_9_16[String nameElement, int maxSize] : spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_9_16_return spec_sized_9_16(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_9_16_return retval = new HPRIMSParser.spec_sized_9_16_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:668:22: ( spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:669:3: spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_spec_sized_mult_lvl2_st_optionnal_3_in_spec_sized_9_164612);
            spec_sized_mult_lvl2_st_optionnal_3(nameElement + ".2");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:670:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==DELIMITER2) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:670:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_164618); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164620);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:671:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt179=2;
                    int LA179_0 = input.LA(1);

                    if ( (LA179_0==DELIMITER2) ) {
                        alt179=1;
                    }
                    switch (alt179) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:671:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_164627); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164629);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:674:1: spec_sized_10_4[String my_NameElement, int my_maxsize] : st_nonsized_mandatory[$my_NameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_10_4_return spec_sized_10_4(String my_NameElement, int my_maxsize) throws RecognitionException {
        HPRIMSParser.spec_sized_10_4_return retval = new HPRIMSParser.spec_sized_10_4_return();
        retval.start = input.LT(1);


        startElement("champ", my_NameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:676:22: ( st_nonsized_mandatory[$my_NameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:3: st_nonsized_mandatory[$my_NameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_10_44656);
            st_nonsized_mandatory(my_NameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:678:3: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )? )?
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==DELIMITER2) ) {
                alt185=1;
            }
            switch (alt185) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:678:4: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44662); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44664);
                    st_non_sized_optionnal(my_NameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:679:4: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )?
                    int alt184=2;
                    int LA184_0 = input.LA(1);

                    if ( (LA184_0==DELIMITER2) ) {
                        alt184=1;
                    }
                    switch (alt184) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:679:5: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44671); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44673);
                            st_non_sized_optionnal(my_NameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:680:5: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )?
                            int alt183=2;
                            int LA183_0 = input.LA(1);

                            if ( (LA183_0==DELIMITER2) ) {
                                alt183=1;
                            }
                            switch (alt183) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:680:6: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44681); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44683);
                                    st_non_sized_optionnal(my_NameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:681:6: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )?
                                    int alt182=2;
                                    int LA182_0 = input.LA(1);

                                    if ( (LA182_0==DELIMITER2) ) {
                                        alt182=1;
                                    }
                                    switch (alt182) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:681:7: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44692); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44694);
                                            st_non_sized_optionnal(my_NameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:682:7: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )?
                                            int alt181=2;
                                            int LA181_0 = input.LA(1);

                                            if ( (LA181_0==DELIMITER2) ) {
                                                alt181=1;
                                            }
                                            switch (alt181) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:682:8: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44704); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44706);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:685:1: spec_sized_10_6_tx[String nameElement, int maxSize] : (g= final_spec_10_6_tx )? ;
    public final void spec_sized_10_6_tx(String nameElement, int maxSize) throws RecognitionException {
        String g =null;



          ParserRuleReturnScope retval = new ParserRuleReturnScope();
          retval.start = input.LT(1);
          startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:690:22: ( (g= final_spec_10_6_tx )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:691:3: (g= final_spec_10_6_tx )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:691:4: (g= final_spec_10_6_tx )?
            int alt186=2;
            int LA186_0 = input.LA(1);

            if ( ((LA186_0 >= CHARA && LA186_0 <= CHIFFRE9)||LA186_0==DELIMITER2||(LA186_0 >= LETTRE && LA186_0 <= POINT)) ) {
                alt186=1;
            }
            switch (alt186) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:691:4: g= final_spec_10_6_tx
                    {
                    pushFollow(FOLLOW_final_spec_10_6_tx_in_spec_sized_10_6_tx4741);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:695:1: spec_sized_tn[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )? ;
    public final HPRIMSParser.spec_sized_tn_return spec_sized_tn(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_tn_return retval = new HPRIMSParser.spec_sized_tn_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:697:22: ( st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:698:2: st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4763);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:699:3: ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )?
            int alt187=2;
            int LA187_0 = input.LA(1);

            if ( (LA187_0==REPETITEUR) ) {
                alt187=1;
            }
            switch (alt187) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:699:4: REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_spec_sized_tn4769); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4771);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:705:1: st_sized_optionnal[String nameElement, int maxSize] : ( final_st )? ;
    public final HPRIMSParser.st_sized_optionnal_return st_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.st_sized_optionnal_return retval = new HPRIMSParser.st_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:707:22: ( ( final_st )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:708:3: ( final_st )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:708:3: ( final_st )?
            int alt188=2;
            int LA188_0 = input.LA(1);

            if ( ((LA188_0 >= CHARA && LA188_0 <= CHIFFRE9)||(LA188_0 >= LETTRE && LA188_0 <= POINT)) ) {
                alt188=1;
            }
            switch (alt188) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:708:3: final_st
                    {
                    pushFollow(FOLLOW_final_st_in_st_sized_optionnal4799);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:712:1: st_sized_mandatory[String nameElement, int maxSize] : final_st ;
    public final HPRIMSParser.st_sized_mandatory_return st_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.st_sized_mandatory_return retval = new HPRIMSParser.st_sized_mandatory_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:714:22: ( final_st )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:715:3: final_st
            {
            pushFollow(FOLLOW_final_st_in_st_sized_mandatory4822);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:718:1: st_non_sized_optionnal[String nameElement] : ( final_st )? ;
    public final void st_non_sized_optionnal(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:720:22: ( ( final_st )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:721:3: ( final_st )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:721:3: ( final_st )?
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( ((LA189_0 >= CHARA && LA189_0 <= CHIFFRE9)||(LA189_0 >= LETTRE && LA189_0 <= POINT)) ) {
                alt189=1;
            }
            switch (alt189) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:721:3: final_st
                    {
                    pushFollow(FOLLOW_final_st_in_st_non_sized_optionnal4844);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:723:1: st_nonsized_mandatory[String nameElement] : final_st ;
    public final void st_nonsized_mandatory(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:725:22: ( final_st )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:726:3: final_st
            {
            pushFollow(FOLLOW_final_st_in_st_nonsized_mandatory4863);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:728:1: nm_sized_optionnal[String nameElement, int maxSize] : ( final_nm )? ;
    public final HPRIMSParser.nm_sized_optionnal_return nm_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_sized_optionnal_return retval = new HPRIMSParser.nm_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:730:22: ( ( final_nm )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:731:3: ( final_nm )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:731:3: ( final_nm )?
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( ((LA190_0 >= CHIFFRE0 && LA190_0 <= CHIFFRE9)||(LA190_0 >= MOINS && LA190_0 <= POINT)) ) {
                alt190=1;
            }
            switch (alt190) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:731:3: final_nm
                    {
                    pushFollow(FOLLOW_final_nm_in_nm_sized_optionnal4881);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:735:1: nm_integer_sized_optionnal[String nameElement, int maxSize] : ( final_nm_integer )? ;
    public final HPRIMSParser.nm_integer_sized_optionnal_return nm_integer_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_integer_sized_optionnal_return retval = new HPRIMSParser.nm_integer_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:737:22: ( ( final_nm_integer )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:738:3: ( final_nm_integer )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:738:3: ( final_nm_integer )?
            int alt191=2;
            int LA191_0 = input.LA(1);

            if ( ((LA191_0 >= CHIFFRE0 && LA191_0 <= CHIFFRE9)) ) {
                alt191=1;
            }
            switch (alt191) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:738:3: final_nm_integer
                    {
                    pushFollow(FOLLOW_final_nm_integer_in_nm_integer_sized_optionnal4904);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:742:1: nm_integer_sized_mandatory[String nameElement, int maxSize] : final_nm_integer ;
    public final HPRIMSParser.nm_integer_sized_mandatory_return nm_integer_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_integer_sized_mandatory_return retval = new HPRIMSParser.nm_integer_sized_mandatory_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:744:22: ( final_nm_integer )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:745:3: final_nm_integer
            {
            pushFollow(FOLLOW_final_nm_integer_in_nm_integer_sized_mandatory4932);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:749:1: ts_sized_optionnal[String nameElement, int maxSize] : ( final_ts )? ;
    public final HPRIMSParser.ts_sized_optionnal_return ts_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.ts_sized_optionnal_return retval = new HPRIMSParser.ts_sized_optionnal_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:751:22: ( ( final_ts )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:752:3: ( final_ts )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:752:3: ( final_ts )?
            int alt192=2;
            int LA192_0 = input.LA(1);

            if ( ((LA192_0 >= CHIFFRE0 && LA192_0 <= CHIFFRE9)) ) {
                alt192=1;
            }
            switch (alt192) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:752:3: final_ts
                    {
                    pushFollow(FOLLOW_final_ts_in_ts_sized_optionnal4955);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:756:1: ts_sized_mandatory[String nameElement, int maxSize] : final_ts ;
    public final HPRIMSParser.ts_sized_mandatory_return ts_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.ts_sized_mandatory_return retval = new HPRIMSParser.ts_sized_mandatory_return();
        retval.start = input.LT(1);


        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:758:22: ( final_ts )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:759:3: final_ts
            {
            pushFollow(FOLLOW_final_ts_in_ts_sized_mandatory4978);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:762:1: nm_nonsized_mandatory[String nameElement] : final_nm ;
    public final void nm_nonsized_mandatory(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:764:22: ( final_nm )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:765:3: final_nm
            {
            pushFollow(FOLLOW_final_nm_in_nm_nonsized_mandatory5000);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:767:1: nm_nonsized_optionnal[String nameElement] : ( final_nm )? ;
    public final void nm_nonsized_optionnal(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:769:22: ( ( final_nm )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:770:3: ( final_nm )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:770:3: ( final_nm )?
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( ((LA193_0 >= CHIFFRE0 && LA193_0 <= CHIFFRE9)||(LA193_0 >= MOINS && LA193_0 <= POINT)) ) {
                alt193=1;
            }
            switch (alt193) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:770:3: final_nm
                    {
                    pushFollow(FOLLOW_final_nm_in_nm_nonsized_optionnal5018);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:772:1: spec_const_7_13_1_version_2_0[String nameElement] : final_version_2_0 ;
    public final void spec_const_7_13_1_version_2_0(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:774:22: ( final_version_2_0 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:775:3: final_version_2_0
            {
            pushFollow(FOLLOW_final_version_2_0_in_spec_const_7_13_1_version_2_05037);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:777:1: spec_const_7_13_1_version_2_1[String nameElement] : final_version_2_1 ;
    public final void spec_const_7_13_1_version_2_1(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:779:22: ( final_version_2_1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:780:3: final_version_2_1
            {
            pushFollow(FOLLOW_final_version_2_1_in_spec_const_7_13_1_version_2_15055);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:782:1: spec_const_7_13_1_version_2_2[String nameElement] : final_version_2_2 ;
    public final void spec_const_7_13_1_version_2_2(String nameElement) throws RecognitionException {
        startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:784:22: ( final_version_2_2 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:785:3: final_version_2_2
            {
            pushFollow(FOLLOW_final_version_2_2_in_spec_const_7_13_1_version_2_25075);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:789:1: final_spec_10_6_tx returns [String consoText] : g= content_spec_10_6 ;
    public final String final_spec_10_6_tx() throws RecognitionException {
        String consoText = null;


        String g =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:789:46: (g= content_spec_10_6 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:790:3: g= content_spec_10_6
            {
            pushFollow(FOLLOW_content_spec_10_6_in_final_spec_10_6_tx5092);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:794:1: content_spec_10_6 returns [String consoText] : (r= character | DELIMITER2 ) (p= content_spec_10_6 )? ;
    public final String content_spec_10_6() throws RecognitionException {
        String consoText = null;


        HPRIMSParser.character_return r =null;

        String p =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:794:45: ( (r= character | DELIMITER2 ) (p= content_spec_10_6 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:795:3: (r= character | DELIMITER2 ) (p= content_spec_10_6 )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:795:3: (r= character | DELIMITER2 )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:795:4: r= character
                    {
                    pushFollow(FOLLOW_character_in_content_spec_10_65114);
                    r=character();

                    state._fsp--;


                    consoText = (r!=null?input.toString(r.start,r.stop):null);

                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:795:42: DELIMITER2
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_content_spec_10_65120); 

                    consoText = "\n";

                    }
                    break;

            }


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:796:6: (p= content_spec_10_6 )?
            int alt195=2;
            int LA195_0 = input.LA(1);

            if ( ((LA195_0 >= CHARA && LA195_0 <= CHIFFRE9)||LA195_0==DELIMITER2||(LA195_0 >= LETTRE && LA195_0 <= POINT)) ) {
                alt195=1;
            }
            switch (alt195) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:796:6: p= content_spec_10_6
                    {
                    pushFollow(FOLLOW_content_spec_10_6_in_content_spec_10_65131);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:798:1: final_ts : chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )? ;
    public final HPRIMSParser.final_ts_return final_ts() throws RecognitionException {
        HPRIMSParser.final_ts_return retval = new HPRIMSParser.final_ts_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:798:9: ( chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:799:3: chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )?
            {
            pushFollow(FOLLOW_chiffre_in_final_ts5143);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5145);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5149);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5151);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5153);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5157);
            chiffre();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:801:11: ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )?
            int alt198=2;
            int LA198_0 = input.LA(1);

            if ( ((LA198_0 >= CHIFFRE0 && LA198_0 <= CHIFFRE9)) ) {
                alt198=1;
            }
            switch (alt198) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:801:12: chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )?
                    {
                    pushFollow(FOLLOW_chiffre_in_final_ts5160);
                    chiffre();

                    state._fsp--;


                    pushFollow(FOLLOW_chiffre_in_final_ts5162);
                    chiffre();

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:802:3: ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )?
                    int alt197=2;
                    int LA197_0 = input.LA(1);

                    if ( ((LA197_0 >= CHIFFRE0 && LA197_0 <= CHIFFRE9)) ) {
                        alt197=1;
                    }
                    switch (alt197) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:802:4: chiffre chiffre chiffre chiffre ( chiffre chiffre )?
                            {
                            pushFollow(FOLLOW_chiffre_in_final_ts5167);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5169);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5171);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5175);
                            chiffre();

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:803:11: ( chiffre chiffre )?
                            int alt196=2;
                            int LA196_0 = input.LA(1);

                            if ( ((LA196_0 >= CHIFFRE0 && LA196_0 <= CHIFFRE9)) ) {
                                alt196=1;
                            }
                            switch (alt196) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:803:12: chiffre chiffre
                                    {
                                    pushFollow(FOLLOW_chiffre_in_final_ts5178);
                                    chiffre();

                                    state._fsp--;


                                    pushFollow(FOLLOW_chiffre_in_final_ts5180);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:806:1: final_st : ( character )+ ;
    public final HPRIMSParser.final_st_return final_st() throws RecognitionException {
        HPRIMSParser.final_st_return retval = new HPRIMSParser.final_st_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:806:9: ( ( character )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:807:3: ( character )+
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:807:3: ( character )+
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:807:3: character
            	    {
            	    pushFollow(FOLLOW_character_in_final_st5199);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:810:1: final_nm : ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) ) ;
    public final HPRIMSParser.final_nm_return final_nm() throws RecognitionException {
        HPRIMSParser.final_nm_return retval = new HPRIMSParser.final_nm_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:810:9: ( ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:811:3: ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:811:3: ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:811:4: ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:811:4: ( PLUS | MOINS )?
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:3: ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:4: ( ( chiffre )+ ( POINT ( chiffre )* )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:4: ( ( chiffre )+ ( POINT ( chiffre )* )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:5: ( chiffre )+ ( POINT ( chiffre )* )?
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:5: ( chiffre )+
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
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:5: chiffre
                    	    {
                    	    pushFollow(FOLLOW_chiffre_in_final_nm5228);
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


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:14: ( POINT ( chiffre )* )?
                    int alt203=2;
                    int LA203_0 = input.LA(1);

                    if ( (LA203_0==POINT) ) {
                        alt203=1;
                    }
                    switch (alt203) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:15: POINT ( chiffre )*
                            {
                            match(input,POINT,FOLLOW_POINT_in_final_nm5232); 

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:21: ( chiffre )*
                            loop202:
                            do {
                                int alt202=2;
                                int LA202_0 = input.LA(1);

                                if ( ((LA202_0 >= CHIFFRE0 && LA202_0 <= CHIFFRE9)) ) {
                                    alt202=1;
                                }


                                switch (alt202) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:21: chiffre
                            	    {
                            	    pushFollow(FOLLOW_chiffre_in_final_nm5234);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:813:4: ( POINT ( chiffre )+ )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:813:4: ( POINT ( chiffre )+ )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:813:5: POINT ( chiffre )+
                    {
                    match(input,POINT,FOLLOW_POINT_in_final_nm5244); 

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:813:11: ( chiffre )+
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
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:813:11: chiffre
                    	    {
                    	    pushFollow(FOLLOW_chiffre_in_final_nm5246);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:816:1: final_nm_integer : ( chiffre )+ ;
    public final HPRIMSParser.final_nm_integer_return final_nm_integer() throws RecognitionException {
        HPRIMSParser.final_nm_integer_return retval = new HPRIMSParser.final_nm_integer_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:816:17: ( ( chiffre )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:817:3: ( chiffre )+
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:817:3: ( chiffre )+
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:817:3: chiffre
            	    {
            	    pushFollow(FOLLOW_chiffre_in_final_nm_integer5263);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:820:1: final_ORU : CHARO CHARR CHARU ;
    public final HPRIMSParser.final_ORU_return final_ORU() throws RecognitionException {
        HPRIMSParser.final_ORU_return retval = new HPRIMSParser.final_ORU_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:820:10: ( CHARO CHARR CHARU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:820:12: CHARO CHARR CHARU
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_ORU5275); 

            match(input,CHARR,FOLLOW_CHARR_in_final_ORU5277); 

            match(input,CHARU,FOLLOW_CHARU_in_final_ORU5279); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:822:1: final_CART : CHARC CHARA CHARR CHART ;
    public final HPRIMSParser.final_CART_return final_CART() throws RecognitionException {
        HPRIMSParser.final_CART_return retval = new HPRIMSParser.final_CART_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:822:11: ( CHARC CHARA CHARR CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:822:13: CHARC CHARA CHARR CHART
            {
            match(input,CHARC,FOLLOW_CHARC_in_final_CART5288); 

            match(input,CHARA,FOLLOW_CHARA_in_final_CART5290); 

            match(input,CHARR,FOLLOW_CHARR_in_final_CART5292); 

            match(input,CHART,FOLLOW_CHART_in_final_CART5294); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:823:1: final_PORT : CHARP CHARO CHARR CHART ;
    public final HPRIMSParser.final_PORT_return final_PORT() throws RecognitionException {
        HPRIMSParser.final_PORT_return retval = new HPRIMSParser.final_PORT_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:823:11: ( CHARP CHARO CHARR CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:823:13: CHARP CHARO CHARR CHART
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_PORT5302); 

            match(input,CHARO,FOLLOW_CHARO_in_final_PORT5304); 

            match(input,CHARR,FOLLOW_CHARR_in_final_PORT5306); 

            match(input,CHART,FOLLOW_CHART_in_final_PORT5308); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:824:1: final_WHLC : CHARW CHARH CHARL CHARC ;
    public final HPRIMSParser.final_WHLC_return final_WHLC() throws RecognitionException {
        HPRIMSParser.final_WHLC_return retval = new HPRIMSParser.final_WHLC_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:824:11: ( CHARW CHARH CHARL CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:824:13: CHARW CHARH CHARL CHARC
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_WHLC5316); 

            match(input,CHARH,FOLLOW_CHARH_in_final_WHLC5318); 

            match(input,CHARL,FOLLOW_CHARL_in_final_WHLC5320); 

            match(input,CHARC,FOLLOW_CHARC_in_final_WHLC5322); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:825:1: final_WALK : CHARW CHARA CHARL CHARK ;
    public final HPRIMSParser.final_WALK_return final_WALK() throws RecognitionException {
        HPRIMSParser.final_WALK_return retval = new HPRIMSParser.final_WALK_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:825:11: ( CHARW CHARA CHARL CHARK )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:825:13: CHARW CHARA CHARL CHARK
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_WALK5330); 

            match(input,CHARA,FOLLOW_CHARA_in_final_WALK5332); 

            match(input,CHARL,FOLLOW_CHARL_in_final_WALK5334); 

            match(input,CHARK,FOLLOW_CHARK_in_final_WALK5336); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:827:1: final_LL : CHARL CHARL ;
    public final HPRIMSParser.final_LL_return final_LL() throws RecognitionException {
        HPRIMSParser.final_LL_return retval = new HPRIMSParser.final_LL_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:827:9: ( CHARL CHARL )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:827:11: CHARL CHARL
            {
            match(input,CHARL,FOLLOW_CHARL_in_final_LL5345); 

            match(input,CHARL,FOLLOW_CHARL_in_final_LL5347); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:828:1: final_AA : CHARA CHARA ;
    public final HPRIMSParser.final_AA_return final_AA() throws RecognitionException {
        HPRIMSParser.final_AA_return retval = new HPRIMSParser.final_AA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:828:9: ( CHARA CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:828:11: CHARA CHARA
            {
            match(input,CHARA,FOLLOW_CHARA_in_final_AA5355); 

            match(input,CHARA,FOLLOW_CHARA_in_final_AA5357); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:829:1: final_HH : CHARH CHARH ;
    public final HPRIMSParser.final_HH_return final_HH() throws RecognitionException {
        HPRIMSParser.final_HH_return retval = new HPRIMSParser.final_HH_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:829:9: ( CHARH CHARH )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:829:11: CHARH CHARH
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_HH5365); 

            match(input,CHARH,FOLLOW_CHARH_in_final_HH5367); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:830:1: final_MS : CHARM CHARS ;
    public final HPRIMSParser.final_MS_return final_MS() throws RecognitionException {
        HPRIMSParser.final_MS_return retval = new HPRIMSParser.final_MS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:830:9: ( CHARM CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:830:11: CHARM CHARS
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_MS5375); 

            match(input,CHARS,FOLLOW_CHARS_in_final_MS5377); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:831:1: final_VS : CHARV CHARS ;
    public final HPRIMSParser.final_VS_return final_VS() throws RecognitionException {
        HPRIMSParser.final_VS_return retval = new HPRIMSParser.final_VS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:831:9: ( CHARV CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:831:11: CHARV CHARS
            {
            match(input,CHARV,FOLLOW_CHARV_in_final_VS5385); 

            match(input,CHARS,FOLLOW_CHARS_in_final_VS5387); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:832:1: final_Null : CHARN CHARu CHARl CHARl ;
    public final HPRIMSParser.final_Null_return final_Null() throws RecognitionException {
        HPRIMSParser.final_Null_return retval = new HPRIMSParser.final_Null_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:832:11: ( CHARN CHARu CHARl CHARl )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:832:13: CHARN CHARu CHARl CHARl
            {
            match(input,CHARN,FOLLOW_CHARN_in_final_Null5395); 

            match(input,CHARu,FOLLOW_CHARu_in_final_Null5397); 

            match(input,CHARl,FOLLOW_CHARl_in_final_Null5399); 

            match(input,CHARl,FOLLOW_CHARl_in_final_Null5401); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:833:1: final_symbol_inf : CHAR_SYMBOL_INF ;
    public final HPRIMSParser.final_symbol_inf_return final_symbol_inf() throws RecognitionException {
        HPRIMSParser.final_symbol_inf_return retval = new HPRIMSParser.final_symbol_inf_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:833:17: ( CHAR_SYMBOL_INF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:833:19: CHAR_SYMBOL_INF
            {
            match(input,CHAR_SYMBOL_INF,FOLLOW_CHAR_SYMBOL_INF_in_final_symbol_inf5409); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:834:1: final_symbol_sup : CHAR_SYMBOL_SUP ;
    public final HPRIMSParser.final_symbol_sup_return final_symbol_sup() throws RecognitionException {
        HPRIMSParser.final_symbol_sup_return retval = new HPRIMSParser.final_symbol_sup_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:834:17: ( CHAR_SYMBOL_SUP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:834:19: CHAR_SYMBOL_SUP
            {
            match(input,CHAR_SYMBOL_SUP,FOLLOW_CHAR_SYMBOL_SUP_in_final_symbol_sup5417); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:836:1: final_version_2_0 : CHARH CHIFFRE2 POINT CHIFFRE0 ;
    public final HPRIMSParser.final_version_2_0_return final_version_2_0() throws RecognitionException {
        HPRIMSParser.final_version_2_0_return retval = new HPRIMSParser.final_version_2_0_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:836:18: ( CHARH CHIFFRE2 POINT CHIFFRE0 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:836:20: CHARH CHIFFRE2 POINT CHIFFRE0
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_05426); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_05428); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_05430); 

            match(input,CHIFFRE0,FOLLOW_CHIFFRE0_in_final_version_2_05432); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:837:1: final_version_2_1 : CHARH CHIFFRE2 POINT CHIFFRE1 ;
    public final HPRIMSParser.final_version_2_1_return final_version_2_1() throws RecognitionException {
        HPRIMSParser.final_version_2_1_return retval = new HPRIMSParser.final_version_2_1_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:837:18: ( CHARH CHIFFRE2 POINT CHIFFRE1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:837:20: CHARH CHIFFRE2 POINT CHIFFRE1
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_15440); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_15442); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_15444); 

            match(input,CHIFFRE1,FOLLOW_CHIFFRE1_in_final_version_2_15446); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:838:1: final_version_2_2 : CHARH CHIFFRE2 POINT CHIFFRE2 ;
    public final HPRIMSParser.final_version_2_2_return final_version_2_2() throws RecognitionException {
        HPRIMSParser.final_version_2_2_return retval = new HPRIMSParser.final_version_2_2_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:838:18: ( CHARH CHIFFRE2 POINT CHIFFRE2 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:838:20: CHARH CHIFFRE2 POINT CHIFFRE2
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_25454); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_25456); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_25458); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_25460); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:840:1: final_OP : CHARO CHARP ;
    public final HPRIMSParser.final_OP_return final_OP() throws RecognitionException {
        HPRIMSParser.final_OP_return retval = new HPRIMSParser.final_OP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:840:9: ( CHARO CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:840:11: CHARO CHARP
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_OP5469); 

            match(input,CHARP,FOLLOW_CHARP_in_final_OP5471); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:841:1: final_IP : CHARI CHARP ;
    public final HPRIMSParser.final_IP_return final_IP() throws RecognitionException {
        HPRIMSParser.final_IP_return retval = new HPRIMSParser.final_IP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:841:9: ( CHARI CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:841:11: CHARI CHARP
            {
            match(input,CHARI,FOLLOW_CHARI_in_final_IP5479); 

            match(input,CHARP,FOLLOW_CHARP_in_final_IP5481); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:842:1: final_ER : CHARE CHARR ;
    public final HPRIMSParser.final_ER_return final_ER() throws RecognitionException {
        HPRIMSParser.final_ER_return retval = new HPRIMSParser.final_ER_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:842:9: ( CHARE CHARR )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:842:11: CHARE CHARR
            {
            match(input,CHARE,FOLLOW_CHARE_in_final_ER5489); 

            match(input,CHARR,FOLLOW_CHARR_in_final_ER5491); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:843:1: final_PA : CHARP CHARA ;
    public final HPRIMSParser.final_PA_return final_PA() throws RecognitionException {
        HPRIMSParser.final_PA_return retval = new HPRIMSParser.final_PA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:843:9: ( CHARP CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:843:11: CHARP CHARA
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_PA5499); 

            match(input,CHARA,FOLLOW_CHARA_in_final_PA5501); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:844:1: final_MP : CHARM CHARP ;
    public final HPRIMSParser.final_MP_return final_MP() throws RecognitionException {
        HPRIMSParser.final_MP_return retval = new HPRIMSParser.final_MP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:844:9: ( CHARM CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:844:11: CHARM CHARP
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_MP5509); 

            match(input,CHARP,FOLLOW_CHARP_in_final_MP5511); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:846:1: final_charA : CHARA ;
    public final HPRIMSParser.final_charA_return final_charA() throws RecognitionException {
        HPRIMSParser.final_charA_return retval = new HPRIMSParser.final_charA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:846:12: ( CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:846:14: CHARA
            {
            match(input,CHARA,FOLLOW_CHARA_in_final_charA5522); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:847:1: final_charB : CHARB ;
    public final HPRIMSParser.final_charB_return final_charB() throws RecognitionException {
        HPRIMSParser.final_charB_return retval = new HPRIMSParser.final_charB_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:847:12: ( CHARB )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:847:14: CHARB
            {
            match(input,CHARB,FOLLOW_CHARB_in_final_charB5530); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:848:1: final_charC : CHARC ;
    public final HPRIMSParser.final_charC_return final_charC() throws RecognitionException {
        HPRIMSParser.final_charC_return retval = new HPRIMSParser.final_charC_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:848:12: ( CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:848:14: CHARC
            {
            match(input,CHARC,FOLLOW_CHARC_in_final_charC5538); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:849:1: final_charD : CHARD ;
    public final HPRIMSParser.final_charD_return final_charD() throws RecognitionException {
        HPRIMSParser.final_charD_return retval = new HPRIMSParser.final_charD_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:849:12: ( CHARD )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:849:14: CHARD
            {
            match(input,CHARD,FOLLOW_CHARD_in_final_charD5546); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:850:1: final_charF : CHARF ;
    public final HPRIMSParser.final_charF_return final_charF() throws RecognitionException {
        HPRIMSParser.final_charF_return retval = new HPRIMSParser.final_charF_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:850:12: ( CHARF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:850:14: CHARF
            {
            match(input,CHARF,FOLLOW_CHARF_in_final_charF5554); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:1: final_charH : CHARH ;
    public final HPRIMSParser.final_charH_return final_charH() throws RecognitionException {
        HPRIMSParser.final_charH_return retval = new HPRIMSParser.final_charH_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:12: ( CHARH )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:851:14: CHARH
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_charH5562); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:852:1: final_charI : CHARI ;
    public final HPRIMSParser.final_charI_return final_charI() throws RecognitionException {
        HPRIMSParser.final_charI_return retval = new HPRIMSParser.final_charI_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:852:12: ( CHARI )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:852:14: CHARI
            {
            match(input,CHARI,FOLLOW_CHARI_in_final_charI5570); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:853:1: final_charL : CHARL ;
    public final HPRIMSParser.final_charL_return final_charL() throws RecognitionException {
        HPRIMSParser.final_charL_return retval = new HPRIMSParser.final_charL_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:853:12: ( CHARL )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:853:14: CHARL
            {
            match(input,CHARL,FOLLOW_CHARL_in_final_charL5578); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:854:1: final_charM : CHARM ;
    public final HPRIMSParser.final_charM_return final_charM() throws RecognitionException {
        HPRIMSParser.final_charM_return retval = new HPRIMSParser.final_charM_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:854:12: ( CHARM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:854:14: CHARM
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_charM5586); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:855:1: final_charN : CHARN ;
    public final HPRIMSParser.final_charN_return final_charN() throws RecognitionException {
        HPRIMSParser.final_charN_return retval = new HPRIMSParser.final_charN_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:855:12: ( CHARN )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:855:14: CHARN
            {
            match(input,CHARN,FOLLOW_CHARN_in_final_charN5594); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:856:1: final_charO : CHARO ;
    public final HPRIMSParser.final_charO_return final_charO() throws RecognitionException {
        HPRIMSParser.final_charO_return retval = new HPRIMSParser.final_charO_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:856:12: ( CHARO )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:856:14: CHARO
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_charO5602); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:857:1: final_charP : CHARP ;
    public final HPRIMSParser.final_charP_return final_charP() throws RecognitionException {
        HPRIMSParser.final_charP_return retval = new HPRIMSParser.final_charP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:857:12: ( CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:857:14: CHARP
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_charP5610); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:858:1: final_charR : CHARR ;
    public final HPRIMSParser.final_charR_return final_charR() throws RecognitionException {
        HPRIMSParser.final_charR_return retval = new HPRIMSParser.final_charR_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:858:12: ( CHARR )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:858:14: CHARR
            {
            match(input,CHARR,FOLLOW_CHARR_in_final_charR5618); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:859:1: final_charS : CHARS ;
    public final HPRIMSParser.final_charS_return final_charS() throws RecognitionException {
        HPRIMSParser.final_charS_return retval = new HPRIMSParser.final_charS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:859:12: ( CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:859:14: CHARS
            {
            match(input,CHARS,FOLLOW_CHARS_in_final_charS5626); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:860:1: final_charT : CHART ;
    public final HPRIMSParser.final_charT_return final_charT() throws RecognitionException {
        HPRIMSParser.final_charT_return retval = new HPRIMSParser.final_charT_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:860:12: ( CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:860:14: CHART
            {
            match(input,CHART,FOLLOW_CHART_in_final_charT5634); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:861:1: final_charU : CHARU ;
    public final HPRIMSParser.final_charU_return final_charU() throws RecognitionException {
        HPRIMSParser.final_charU_return retval = new HPRIMSParser.final_charU_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:861:12: ( CHARU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:861:14: CHARU
            {
            match(input,CHARU,FOLLOW_CHARU_in_final_charU5642); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:862:1: final_charW : CHARW ;
    public final HPRIMSParser.final_charW_return final_charW() throws RecognitionException {
        HPRIMSParser.final_charW_return retval = new HPRIMSParser.final_charW_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:862:12: ( CHARW )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:862:14: CHARW
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_charW5650); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:863:1: final_charX : CHARX ;
    public final HPRIMSParser.final_charX_return final_charX() throws RecognitionException {
        HPRIMSParser.final_charX_return retval = new HPRIMSParser.final_charX_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:863:12: ( CHARX )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:863:14: CHARX
            {
            match(input,CHARX,FOLLOW_CHARX_in_final_charX5658); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:866:1: delimiters : DELIMITERS ;
    public final HPRIMSParser.delimiters_return delimiters() throws RecognitionException {
        HPRIMSParser.delimiters_return retval = new HPRIMSParser.delimiters_return();
        retval.start = input.LT(1);


        startElement("champ", "delimiteurs");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:868:22: ( DELIMITERS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:869:3: DELIMITERS
            {
            match(input,DELIMITERS,FOLLOW_DELIMITERS_in_delimiters5679); 

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:874:1: character : ( lettre | chiffre ) ;
    public final HPRIMSParser.character_return character() throws RecognitionException {
        HPRIMSParser.character_return retval = new HPRIMSParser.character_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:874:10: ( ( lettre | chiffre ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:3: ( lettre | chiffre )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:3: ( lettre | chiffre )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:4: lettre
                    {
                    pushFollow(FOLLOW_lettre_in_character5695);
                    lettre();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:875:13: chiffre
                    {
                    pushFollow(FOLLOW_chiffre_in_character5699);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:877:1: chiffre : ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 ) ;
    public final void chiffre() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:877:8: ( ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 ) )
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:881:1: lettre : ~ ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 | CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR ) ;
    public final void lettre() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:881:7: (~ ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 | CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR ) )
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
            return "147:1: hprim : ( hprim_oru_2_2 | hprim_oru_2_1 );";
        }
    }
 

    public static final BitSet FOLLOW_hprim_oru_2_2_in_hprim60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hprim_oru_2_1_in_hprim64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_2_in_hprim_oru_2_284 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p2_1_in_hprim_oru_2_288 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l2_1_in_hprim_oru_2_293 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_oru_2_297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_oru_2_2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_in_hprim_oru_2_1119 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p2_1_in_hprim_oru_2_1123 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l2_1_in_hprim_oru_2_1128 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_oru_2_1132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_oru_2_1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_p2_1_in_body_p2_1154 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_c2_1_in_body_p2_1157 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_obr2_1_in_body_p2_1164 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_obr2_1_in_body_obr2_1183 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_c2_1_in_body_obr2_1186 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_obx2_1_in_body_obr2_1194 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_obx2_1_in_body_obx2_1213 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_c2_1_in_body_obx2_1216 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_delimiters_in_line_h2_2239 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2243 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_2245 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2250 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_2252 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2257 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_2259 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2264 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_2266 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2271 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_in_line_h2_2273 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2278 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_h2_2280 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2285 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_2287 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2292 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_2294 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2299 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_2301 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2306 = new BitSet(new long[]{0x0000000000240080L});
    public static final BitSet FOLLOW_spec_const_7_12_in_line_h2_2308 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2313 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2315 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2320 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_2322 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delimiters_in_line_h2_1347 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1351 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_1353 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1358 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_1360 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1365 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_1367 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1372 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_1374 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1379 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_in_line_h2_1381 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1386 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_h2_1388 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1393 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_1395 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1400 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_1402 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1407 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_1409 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1414 = new BitSet(new long[]{0x0000000000240080L});
    public static final BitSet FOLLOW_spec_const_7_12_in_line_h2_1416 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1424 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_0_in_line_h2_1427 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1432 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1438 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_1440 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_p2_1_in_line_p2_2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_p2_1473 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_line_p2_1475 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1479 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_p2_1481 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1486 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_8_3_in_line_p2_1488 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1493 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1495 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1501 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1503 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1510 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1512 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1520 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1522 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1531 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_1533 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1543 = new BitSet(new long[]{0x0000020000408200L});
    public static final BitSet FOLLOW_spec_const_sexe_in_line_p2_1545 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1556 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_p2_1558 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1570 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1572 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1585 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1587 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1601 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_p2_1603 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1642 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p2_1644 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1648 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p2_1650 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1668 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1670 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1687 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1689 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1722 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_p2_1724 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1759 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_p2_1761 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1781 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1783 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1787 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1789 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1812 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1814 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1818 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1820 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1844 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1846 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1869 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1871 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1895 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1897 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1922 = new BitSet(new long[]{0x000202FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_1924 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1928 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_1930 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1958 = new BitSet(new long[]{0x0000020000069100L});
    public static final BitSet FOLLOW_spec_const_8_25_in_line_p2_1960 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1987 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_8_in_line_p2_1989 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11042 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11044 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11073 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_p2_11075 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11132 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11134 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11193 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11195 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11227 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11229 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11292 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11294 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11328 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_11330 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11365 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_11367 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_obr2_1_in_line_obr2_21473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obr2_11490 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_line_obr2_11492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_line_obr2_11494 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_line_obr2_11496 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11500 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_obr2_11502 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11507 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_9_3_in_line_obr2_11509 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11514 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11516 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11521 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11523 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11527 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11529 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11539 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11541 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11545 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11547 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11554 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11556 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11561 = new BitSet(new long[]{0x000200FFC0000000L});
    public static final BitSet FOLLOW_spec_non_sized_9_8_in_line_obr2_11563 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11568 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11570 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11578 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11580 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11585 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_11587 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11595 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11597 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11606 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11608 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11615 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11617 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11625 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11627 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11636 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_9_16_in_line_obr2_11638 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11648 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11650 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11661 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_obr2_11663 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11675 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11677 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11690 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11692 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11706 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11708 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11723 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11725 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11741 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11743 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11760 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_obr2_11762 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11780 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11782 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11801 = new BitSet(new long[]{0x00000200020E92C0L});
    public static final BitSet FOLLOW_spec_const_9_26_in_line_obr2_11803 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11823 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_obr2_11825 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11846 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_race_in_line_obr2_11848 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11870 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_11872 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11876 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_11878 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11903 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_4_in_line_obr2_11905 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11929 = new BitSet(new long[]{0x0000020001040040L});
    public static final BitSet FOLLOW_spec_const_9_31_in_line_obr2_11931 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11978 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11980 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11984 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11986 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12014 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12016 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12043 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12045 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12073 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12075 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12104 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12106 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12136 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_12138 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obx2_12237 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_line_obx2_12239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_line_obx2_12241 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CHARX_in_line_obx2_12243 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12247 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_obx2_12249 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12254 = new BitSet(new long[]{0x00000000003506D0L});
    public static final BitSet FOLLOW_spec_const_10_3_nm_in_line_obx2_12262 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12271 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12273 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12283 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12285 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12296 = new BitSet(new long[]{0x0003C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2_12298 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12302 = new BitSet(new long[]{0x0003C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2_12304 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_ce_in_line_obx2_12334 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12343 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12345 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12355 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12357 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12368 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12370 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12374 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12376 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_fic_in_line_obx2_12406 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12415 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12417 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12427 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12429 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12440 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12442 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12446 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12448 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_st_in_line_obx2_12478 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12487 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12489 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12499 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12501 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12512 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12514 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12518 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12520 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_gc_in_line_obx2_12550 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12559 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12561 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12571 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12573 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12584 = new BitSet(new long[]{0x0001C4FFC0000000L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12586 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12590 = new BitSet(new long[]{0x0001C4FFC0000000L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12592 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_tx_in_line_obx2_12622 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12631 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12633 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12643 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12645 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12656 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12658 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12662 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12664 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_std_in_line_obx2_12694 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12703 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12705 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12715 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12717 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12728 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12730 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12734 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12736 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62770 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62772 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62781 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62783 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_62787 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62789 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62801 = new BitSet(new long[]{0x000202000DD9D8B0L});
    public static final BitSet FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62803 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_62807 = new BitSet(new long[]{0x000202000DD9D8B0L});
    public static final BitSet FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62809 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62822 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2_1_post10_62824 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62836 = new BitSet(new long[]{0x0002020000190010L});
    public static final BitSet FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62838 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_62842 = new BitSet(new long[]{0x0002020000190010L});
    public static final BitSet FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62844 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62859 = new BitSet(new long[]{0x00000200024C12C0L});
    public static final BitSet FOLLOW_spec_const_10_12_in_line_obx2_1_post10_62861 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62876 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62878 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62894 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62896 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62912 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62914 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62931 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obx2_1_post10_62933 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62951 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62953 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_c2_12995 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_line_c2_12997 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_13001 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_c2_13003 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_13008 = new BitSet(new long[]{0x0000020000044000L});
    public static final BitSet FOLLOW_spec_const_12_3_in_line_c2_13010 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_13015 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_c2_13017 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_c2_13021 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_c2_13023 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_13032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_l2_13050 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_line_l2_13052 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13057 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l2_13059 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13066 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13073 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l2_13075 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13084 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l2_13086 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13096 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_l2_13098 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charM_in_spec_const_sexe3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_sexe3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_sexe3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_0_in_spec_const_7_13_version_2_03184 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_03187 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_03189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_1_in_spec_const_7_13_version_2_13210 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_13213 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_13215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_2_in_spec_const_7_13_version_2_23234 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_23237 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_23239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_7_13_23258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_7_13_23262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_7_13_23266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ORU_in_spec_const_7_7_contexte3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_7_123303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_7_123307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charT_in_spec_const_7_123311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_PORT_in_spec_const_9_313331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_CART_in_spec_const_9_313335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_WHLC_in_spec_const_9_313339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_WALK_in_spec_const_9_313343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_OP_in_spec_const_8_253364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_IP_in_spec_const_8_253368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ER_in_spec_const_8_253372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_PA_in_spec_const_8_253376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_MP_in_spec_const_8_253380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_9_263401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_9_263405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charM_in_spec_const_9_263409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_9_263413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_9_263417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_9_263421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charO_in_spec_const_9_263425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_9_263431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charX_in_spec_const_9_263435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_nm3456 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CHARM_in_spec_const_10_3_nm3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_ce3479 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CHARE_in_spec_const_10_3_ce3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARS_in_spec_const_10_3_st3502 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_st3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_gc3525 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_gc3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_tx3549 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CHARX_in_spec_const_10_3_tx3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARF_in_spec_const_10_3_fic3572 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CHARI_in_spec_const_10_3_fic3574 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_fic3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_spec_const_10_3_std3598 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CHARD_in_spec_const_10_3_std3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_std3606 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CHARK_in_spec_const_10_3_std3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_std3614 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_spec_const_10_3_std3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARD_in_spec_const_10_3_std3624 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_std3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_spec_const_10_3_std3634 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_std3642 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_std3652 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_spec_const_10_3_std3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_std3660 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_63685 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_63691 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_63693 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_63700 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_63702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_10_93730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charH_in_spec_const_10_93734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_LL_in_spec_const_10_93738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_HH_in_spec_const_10_93742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_symbol_inf_in_spec_const_10_93746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_symbol_sup_in_spec_const_10_93750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charN_in_spec_const_10_93756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charA_in_spec_const_10_93760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_AA_in_spec_const_10_93764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_Null_in_spec_const_10_93768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_10_93772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_10_93776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charB_in_spec_const_10_93780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charW_in_spec_const_10_93786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_93790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_10_93794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charS_in_spec_const_10_93798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_MS_in_spec_const_10_93802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_VS_in_spec_const_10_93806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charA_in_spec_const_10_113827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charS_in_spec_const_10_113831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_113835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charN_in_spec_const_10_113839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_123860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_10_123864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_10_123868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_10_123872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_10_123876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_10_123880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charX_in_spec_const_10_123887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_10_123891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_12_33912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_12_33916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_23936 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_23942 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_23944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_23967 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_23973 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_23975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44000 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44006 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44008 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44015 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44017 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_44025 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_44027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64056 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64063 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64065 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64073 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64075 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64084 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64086 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64096 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64098 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64109 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84144 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84150 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84152 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84159 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84161 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84169 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84171 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84180 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84182 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84192 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84194 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84205 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84207 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84219 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34258 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34264 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34266 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34273 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64298 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64304 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64306 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64313 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64315 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64323 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64325 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64334 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64336 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64346 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24377 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_optionnal_24382 = new BitSet(new long[]{0x0001C0FFC0000000L});
    public static final BitSet FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24409 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_mandatory_24414 = new BitSet(new long[]{0x0001C0FFC0000000L});
    public static final BitSet FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4439 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna4446 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl2_st_optionnal_6_in_spec_sized_cna4448 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna4456 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_mandatory_in_spec_sized_8_34490 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_8_34497 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34499 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_8_34507 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_9_34549 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_34555 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_9_34557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84582 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_spec_non_sized_9_84589 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl2_st_optionnal_3_in_spec_sized_9_164612 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_164618 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164620 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_164627 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_10_44656 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44662 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44664 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44671 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44673 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44681 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44683 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44692 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44694 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44704 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_spec_10_6_tx_in_spec_sized_10_6_tx4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4763 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_spec_sized_tn4769 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_sized_optionnal4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_sized_mandatory4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_non_sized_optionnal4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_nonsized_mandatory4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_sized_optionnal4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_integer_in_nm_integer_sized_optionnal4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_integer_in_nm_integer_sized_mandatory4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ts_in_ts_sized_optionnal4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ts_in_ts_sized_mandatory4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_nonsized_mandatory5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_nonsized_optionnal5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_0_in_spec_const_7_13_1_version_2_05037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_1_in_spec_const_7_13_1_version_2_15055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_2_in_spec_const_7_13_1_version_2_25075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_content_spec_10_6_in_final_spec_10_6_tx5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_in_content_spec_10_65114 = new BitSet(new long[]{0x0001E4FFFFFFFFF2L});
    public static final BitSet FOLLOW_DELIMITER2_in_content_spec_10_65120 = new BitSet(new long[]{0x0001E4FFFFFFFFF2L});
    public static final BitSet FOLLOW_content_spec_10_6_in_content_spec_10_65131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5143 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5145 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5149 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5151 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5153 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5157 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5160 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5162 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5167 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5169 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5171 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5175 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5178 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_in_final_st5199 = new BitSet(new long[]{0x0001E0FFFFFFFFF2L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5228 = new BitSet(new long[]{0x000100FFC0000002L});
    public static final BitSet FOLLOW_POINT_in_final_nm5232 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5234 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_POINT_in_final_nm5244 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5246 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_nm_integer5263 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_CHARO_in_final_ORU5275 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_ORU5277 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CHARU_in_final_ORU5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_final_CART5288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_CART5290 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_CART5292 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_final_CART5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_PORT5302 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_final_PORT5304 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_PORT5306 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_final_PORT5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_WHLC5316 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CHARH_in_final_WHLC5318 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_WHLC5320 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_final_WHLC5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_WALK5330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_WALK5332 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_WALK5334 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CHARK_in_final_WALK5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARL_in_final_LL5345 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_LL5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_final_AA5355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_AA5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_HH5365 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CHARH_in_final_HH5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_MS5375 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CHARS_in_final_MS5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARV_in_final_VS5385 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CHARS_in_final_VS5387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_final_Null5395 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CHARu_in_final_Null5397 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CHARl_in_final_Null5399 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CHARl_in_final_Null5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_SYMBOL_INF_in_final_symbol_inf5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_SYMBOL_SUP_in_final_symbol_sup5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_05426 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_05428 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_05430 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_CHIFFRE0_in_final_version_2_05432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_15440 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_15442 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_15444 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_CHIFFRE1_in_final_version_2_15446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_25454 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_25456 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_25458 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_25460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_OP5469 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_OP5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARI_in_final_IP5479 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_IP5481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARE_in_final_ER5489 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_ER5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_PA5499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_PA5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_MP5509 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_MP5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_final_charA5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARB_in_final_charB5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_final_charC5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARD_in_final_charD5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARF_in_final_charF5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_charH5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARI_in_final_charI5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARL_in_final_charL5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_charM5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_final_charN5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_charO5602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_charP5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARR_in_final_charR5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARS_in_final_charS5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_final_charT5634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARU_in_final_charU5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_charW5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARX_in_final_charX5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITERS_in_delimiters5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lettre_in_character5695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chiffre_in_character5699 = new BitSet(new long[]{0x0000000000000002L});

}