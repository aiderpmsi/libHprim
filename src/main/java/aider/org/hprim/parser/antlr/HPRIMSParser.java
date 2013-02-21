// $ANTLR 3.4 C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g 2013-02-21 22:16:26

package aider.org.hprim.parser.antlr;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import aider.org.hprim.parser.ContentHandler;
import aider.org.hprim.parser.MatchRegexTokenException;



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
       * Méthode pour permettre d'envoyer un message d'erreur correct lors d'une erreur de type
       * MatchRegexTokenException
       * @param e
       * @param tokenNames
       */
      public String getErrorMessage(RecognitionException e, String[] tokenNames) {
        if (e instanceof MatchRegexTokenException) {
          MatchRegexTokenException mrte = (MatchRegexTokenException) e;
          return "malformed message : " + mrte.getText() +
            " does not match " + mrte.getRegex();
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
       public void recover(RecognitionException e) {
         throw new IllegalArgumentException(e);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:104:1: hprim : ( hprim_oru_2_2 | hprim_oru_2_1 );
    public final void hprim() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:104:6: ( hprim_oru_2_2 | hprim_oru_2_1 )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:105:3: hprim_oru_2_2
                    {
                    pushFollow(FOLLOW_hprim_oru_2_2_in_hprim60);
                    hprim_oru_2_2();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:105:19: hprim_oru_2_1
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:110:1: hprim_oru_2_2 : line_h2_2 ( body_p2_1 )* line_l2_1 ( CR )? EOF ;
    public final void hprim_oru_2_2() throws RecognitionException {
        contentHandler.startElement("message", "hprim_oru_2_2");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:112:37: ( line_h2_2 ( body_p2_1 )* line_l2_1 ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:113:3: line_h2_2 ( body_p2_1 )* line_l2_1 ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_2_in_hprim_oru_2_284);
            line_h2_2();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:114:3: ( body_p2_1 )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:114:3: body_p2_1
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:116:3: ( CR )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CR) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:116:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_oru_2_297); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_oru_2_2102); 

            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:119:1: hprim_oru_2_1 : line_h2_1 ( body_p2_1 )* line_l2_1 ( CR )? EOF ;
    public final void hprim_oru_2_1() throws RecognitionException {
        contentHandler.startElement("message", "hprim_oru_2_1");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:121:37: ( line_h2_1 ( body_p2_1 )* line_l2_1 ( CR )? EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:122:3: line_h2_1 ( body_p2_1 )* line_l2_1 ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_1_in_hprim_oru_2_1119);
            line_h2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:123:3: ( body_p2_1 )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:123:3: body_p2_1
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:125:3: ( CR )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CR) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:125:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_oru_2_1132); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_oru_2_1137); 

            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:128:1: body_p2_1 : line_p2_1 ( line_c2_1 )* ( body_obr2_1 )+ ;
    public final void body_p2_1() throws RecognitionException {
        contentHandler.startElement("body", "P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:130:37: ( line_p2_1 ( line_c2_1 )* ( body_obr2_1 )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:131:3: line_p2_1 ( line_c2_1 )* ( body_obr2_1 )+
            {
            pushFollow(FOLLOW_line_p2_1_in_body_p2_1154);
            line_p2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:131:13: ( line_c2_1 )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:131:14: line_c2_1
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:132:4: ( body_obr2_1 )+
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:132:4: body_obr2_1
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

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:134:1: body_obr2_1 : line_obr2_1 ( line_c2_1 )* ( body_obx2_1 )+ ;
    public final void body_obr2_1() throws RecognitionException {
        contentHandler.startElement("body", "OBR");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:136:37: ( line_obr2_1 ( line_c2_1 )* ( body_obx2_1 )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:137:4: line_obr2_1 ( line_c2_1 )* ( body_obx2_1 )+
            {
            pushFollow(FOLLOW_line_obr2_1_in_body_obr2_1183);
            line_obr2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:137:16: ( line_c2_1 )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:137:17: line_c2_1
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:138:5: ( body_obx2_1 )+
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:138:5: body_obx2_1
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

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:140:1: body_obx2_1 : line_obx2_1 ( line_c2_1 )* ;
    public final void body_obx2_1() throws RecognitionException {
        contentHandler.startElement("body", "OBX");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:142:37: ( line_obx2_1 ( line_c2_1 )* )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:143:4: line_obx2_1 ( line_c2_1 )*
            {
            pushFollow(FOLLOW_line_obx2_1_in_body_obx2_1213);
            line_obx2_1();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:143:16: ( line_c2_1 )*
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:143:17: line_c2_1
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

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:149:1: line_h2_2 : delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 spec_const_7_13_version_2_2[\"H_7.13\"] DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_2() throws RecognitionException {
        contentHandler.startElement("ligne", "H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:151:37: ( delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 spec_const_7_13_version_2_2[\"H_7.13\"] DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:152:3: delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 spec_const_7_13_version_2_2[\"H_7.13\"] DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )?
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:165:3: ( DELIMITER1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==DELIMITER1) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:165:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2327); 

                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:169:1: line_h2_1 : delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 ( spec_const_7_13_version_2_0[\"H_7.13\"] | spec_const_7_13_version_2_1[\"H_7.13\"] ) DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_1() throws RecognitionException {
        contentHandler.startElement("ligne", "H");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:171:37: ( delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 ( spec_const_7_13_version_2_0[\"H_7.13\"] | spec_const_7_13_version_2_1[\"H_7.13\"] ) DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:172:3: delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 ( spec_const_7_13_version_2_0[\"H_7.13\"] | spec_const_7_13_version_2_1[\"H_7.13\"] ) DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )?
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

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:184:14: ( spec_const_7_13_version_2_0[\"H_7.13\"] | spec_const_7_13_version_2_1[\"H_7.13\"] )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:184:15: spec_const_7_13_version_2_0[\"H_7.13\"]
                    {
                    pushFollow(FOLLOW_spec_const_7_13_version_2_0_in_line_h2_1427);
                    spec_const_7_13_version_2_0("H_7.13");

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:184:55: spec_const_7_13_version_2_1[\"H_7.13\"]
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:186:3: ( DELIMITER1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==DELIMITER1) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:186:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1445); 

                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:189:1: line_p2_2 : line_p2_1 ;
    public final void line_p2_2() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:189:10: ( line_p2_1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:190:3: line_p2_1
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:192:1: line_p2_1 : CR CHARP DELIMITER1 nm_integer_sized_optionnal[\"P_8.2\", 4] DELIMITER1 spec_sized_8_3[\"P_8.3\", 36] DELIMITER1 st_sized_optionnal[\"P_8.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_p2_1() throws RecognitionException {
        contentHandler.startElement("ligne", "P");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:194:37: ( CR CHARP DELIMITER1 nm_integer_sized_optionnal[\"P_8.2\", 4] DELIMITER1 spec_sized_8_3[\"P_8.3\", 36] DELIMITER1 st_sized_optionnal[\"P_8.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:195:3: CR CHARP DELIMITER1 nm_integer_sized_optionnal[\"P_8.2\", 4] DELIMITER1 spec_sized_8_3[\"P_8.3\", 36] DELIMITER1 st_sized_optionnal[\"P_8.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:199:3: ( DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==DELIMITER1) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:199:4: DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1501); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1503);
                    st_sized_optionnal("P_8.5", 16);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:200:4: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==DELIMITER1) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:200:5: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1510); 

                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1512);
                            spec_sized_mult_lvl1_st_optionnal_6("P_8.6", 48);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:201:5: ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==DELIMITER1) ) {
                                alt46=1;
                            }
                            switch (alt46) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:201:6: DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1520); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1522);
                                    st_sized_optionnal("P_8.7", 24);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:202:6: ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt45=2;
                                    int LA45_0 = input.LA(1);

                                    if ( (LA45_0==DELIMITER1) ) {
                                        alt45=1;
                                    }
                                    switch (alt45) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:202:7: DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1531); 

                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_1533);
                                            ts_sized_optionnal("P_8.8", 26);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:203:7: ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt44=2;
                                            int LA44_0 = input.LA(1);

                                            if ( (LA44_0==DELIMITER1) ) {
                                                alt44=1;
                                            }
                                            switch (alt44) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:203:8: DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1543); 

                                                    pushFollow(FOLLOW_spec_const_sexe_in_line_p2_1545);
                                                    spec_const_sexe("P_8.9");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:204:8: ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt43=2;
                                                    int LA43_0 = input.LA(1);

                                                    if ( (LA43_0==DELIMITER1) ) {
                                                        alt43=1;
                                                    }
                                                    switch (alt43) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:204:9: DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1556); 

                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:205:9: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt42=2;
                                                            int LA42_0 = input.LA(1);

                                                            if ( (LA42_0==DELIMITER1) ) {
                                                                alt42=1;
                                                            }
                                                            switch (alt42) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:205:10: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1567); 

                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1569);
                                                                    spec_sized_mult_lvl1_st_optionnal_6("P_8.11", 200);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:206:10: ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt41=2;
                                                                    int LA41_0 = input.LA(1);

                                                                    if ( (LA41_0==DELIMITER1) ) {
                                                                        alt41=1;
                                                                    }
                                                                    switch (alt41) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:206:11: DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1582); 

                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1584);
                                                                            st_sized_optionnal("P_8.12", 120);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:207:11: ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt40=2;
                                                                            int LA40_0 = input.LA(1);

                                                                            if ( (LA40_0==DELIMITER1) ) {
                                                                                alt40=1;
                                                                            }
                                                                            switch (alt40) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:207:12: DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1598); 

                                                                                    pushFollow(FOLLOW_spec_sized_tn_in_line_p2_1600);
                                                                                    spec_sized_tn("P_8.13", 40);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:210:12: ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt39=2;
                                                                                    int LA39_0 = input.LA(1);

                                                                                    if ( (LA39_0==DELIMITER1) ) {
                                                                                        alt39=1;
                                                                                    }
                                                                                    switch (alt39) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:210:13: DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1639); 

                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_p2_1641);
                                                                                            spec_sized_cna("P_8.14", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:210:53: ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )*
                                                                                            loop14:
                                                                                            do {
                                                                                                int alt14=2;
                                                                                                int LA14_0 = input.LA(1);

                                                                                                if ( (LA14_0==REPETITEUR) ) {
                                                                                                    alt14=1;
                                                                                                }


                                                                                                switch (alt14) {
                                                                                            	case 1 :
                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:210:54: REPETITEUR spec_sized_cna[\"P_8.14\", 60]
                                                                                            	    {
                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1645); 

                                                                                            	    pushFollow(FOLLOW_spec_sized_cna_in_line_p2_1647);
                                                                                            	    spec_sized_cna("P_8.14", 60);

                                                                                            	    state._fsp--;


                                                                                            	    }
                                                                                            	    break;

                                                                                            	default :
                                                                                            	    break loop14;
                                                                                                }
                                                                                            } while (true);


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:211:13: ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt38=2;
                                                                                            int LA38_0 = input.LA(1);

                                                                                            if ( (LA38_0==DELIMITER1) ) {
                                                                                                alt38=1;
                                                                                            }
                                                                                            switch (alt38) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:211:14: DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1665); 

                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1667);
                                                                                                    st_sized_optionnal("P_8.15", 60);

                                                                                                    state._fsp--;


                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:212:14: ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt37=2;
                                                                                                    int LA37_0 = input.LA(1);

                                                                                                    if ( (LA37_0==DELIMITER1) ) {
                                                                                                        alt37=1;
                                                                                                    }
                                                                                                    switch (alt37) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:212:15: DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1684); 

                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1686);
                                                                                                            st_sized_optionnal("P_8.16", 60);

                                                                                                            state._fsp--;


                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:214:15: ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt36=2;
                                                                                                            int LA36_0 = input.LA(1);

                                                                                                            if ( (LA36_0==DELIMITER1) ) {
                                                                                                                alt36=1;
                                                                                                            }
                                                                                                            switch (alt36) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:214:16: DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1719); 

                                                                                                                    pushFollow(FOLLOW_nm_sized_optionnal_in_line_p2_1721);
                                                                                                                    nm_sized_optionnal("P_8.17", 10);

                                                                                                                    state._fsp--;


                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:216:16: ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt35=2;
                                                                                                                    int LA35_0 = input.LA(1);

                                                                                                                    if ( (LA35_0==DELIMITER1) ) {
                                                                                                                        alt35=1;
                                                                                                                    }
                                                                                                                    switch (alt35) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:216:17: DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1756); 

                                                                                                                            pushFollow(FOLLOW_nm_sized_optionnal_in_line_p2_1758);
                                                                                                                            nm_sized_optionnal("P_8.18", 10);

                                                                                                                            state._fsp--;


                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:217:17: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt34=2;
                                                                                                                            int LA34_0 = input.LA(1);

                                                                                                                            if ( (LA34_0==DELIMITER1) ) {
                                                                                                                                alt34=1;
                                                                                                                            }
                                                                                                                            switch (alt34) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:217:18: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1778); 

                                                                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1780);
                                                                                                                                    spec_sized_mult_lvl1_st_optionnal_6("P_8.19", 200);

                                                                                                                                    state._fsp--;


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:217:80: ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )*
                                                                                                                                    loop15:
                                                                                                                                    do {
                                                                                                                                        int alt15=2;
                                                                                                                                        int LA15_0 = input.LA(1);

                                                                                                                                        if ( (LA15_0==REPETITEUR) ) {
                                                                                                                                            alt15=1;
                                                                                                                                        }


                                                                                                                                        switch (alt15) {
                                                                                                                                    	case 1 :
                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:217:81: REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200]
                                                                                                                                    	    {
                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1784); 

                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1786);
                                                                                                                                    	    spec_sized_mult_lvl1_st_optionnal_6("P_8.19", 200);

                                                                                                                                    	    state._fsp--;


                                                                                                                                    	    }
                                                                                                                                    	    break;

                                                                                                                                    	default :
                                                                                                                                    	    break loop15;
                                                                                                                                        }
                                                                                                                                    } while (true);


                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:218:18: ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt33=2;
                                                                                                                                    int LA33_0 = input.LA(1);

                                                                                                                                    if ( (LA33_0==DELIMITER1) ) {
                                                                                                                                        alt33=1;
                                                                                                                                    }
                                                                                                                                    switch (alt33) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:218:19: DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1809); 

                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1811);
                                                                                                                                            st_sized_optionnal("P_8.20", 200);

                                                                                                                                            state._fsp--;


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:218:64: ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )*
                                                                                                                                            loop16:
                                                                                                                                            do {
                                                                                                                                                int alt16=2;
                                                                                                                                                int LA16_0 = input.LA(1);

                                                                                                                                                if ( (LA16_0==REPETITEUR) ) {
                                                                                                                                                    alt16=1;
                                                                                                                                                }


                                                                                                                                                switch (alt16) {
                                                                                                                                            	case 1 :
                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:218:65: REPETITEUR st_sized_optionnal[\"P_8.20\", 200]
                                                                                                                                            	    {
                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1815); 

                                                                                                                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1817);
                                                                                                                                            	    st_sized_optionnal("P_8.20", 200);

                                                                                                                                            	    state._fsp--;


                                                                                                                                            	    }
                                                                                                                                            	    break;

                                                                                                                                            	default :
                                                                                                                                            	    break loop16;
                                                                                                                                                }
                                                                                                                                            } while (true);


                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:219:19: ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt32=2;
                                                                                                                                            int LA32_0 = input.LA(1);

                                                                                                                                            if ( (LA32_0==DELIMITER1) ) {
                                                                                                                                                alt32=1;
                                                                                                                                            }
                                                                                                                                            switch (alt32) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:219:20: DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1841); 

                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1843);
                                                                                                                                                    st_sized_optionnal("P_8.21", 200);

                                                                                                                                                    state._fsp--;


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:220:20: ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt31=2;
                                                                                                                                                    int LA31_0 = input.LA(1);

                                                                                                                                                    if ( (LA31_0==DELIMITER1) ) {
                                                                                                                                                        alt31=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt31) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:220:21: DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1866); 

                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1868);
                                                                                                                                                            st_sized_optionnal("P_8.22", 60);

                                                                                                                                                            state._fsp--;


                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:221:21: ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt30=2;
                                                                                                                                                            int LA30_0 = input.LA(1);

                                                                                                                                                            if ( (LA30_0==DELIMITER1) ) {
                                                                                                                                                                alt30=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt30) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:221:22: DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1892); 

                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1894);
                                                                                                                                                                    st_sized_optionnal("P_8.23", 60);

                                                                                                                                                                    state._fsp--;


                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:222:22: ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    int alt29=2;
                                                                                                                                                                    int LA29_0 = input.LA(1);

                                                                                                                                                                    if ( (LA29_0==DELIMITER1) ) {
                                                                                                                                                                        alt29=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt29) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:222:23: DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1919); 

                                                                                                                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_1921);
                                                                                                                                                                            ts_sized_optionnal("P_8.24", 26);

                                                                                                                                                                            state._fsp--;


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:222:67: ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )?
                                                                                                                                                                            int alt17=2;
                                                                                                                                                                            int LA17_0 = input.LA(1);

                                                                                                                                                                            if ( (LA17_0==REPETITEUR) ) {
                                                                                                                                                                                alt17=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt17) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:222:68: REPETITEUR ts_sized_optionnal[\"P_8.24\", 26]
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1925); 

                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_1927);
                                                                                                                                                                                    ts_sized_optionnal("P_8.24", 26);

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:223:23: ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            int alt28=2;
                                                                                                                                                                            int LA28_0 = input.LA(1);

                                                                                                                                                                            if ( (LA28_0==DELIMITER1) ) {
                                                                                                                                                                                alt28=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt28) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:223:24: DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1955); 

                                                                                                                                                                                    pushFollow(FOLLOW_spec_const_8_25_in_line_p2_1957);
                                                                                                                                                                                    spec_const_8_25("P_8.25");

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:224:24: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    int alt27=2;
                                                                                                                                                                                    int LA27_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA27_0==DELIMITER1) ) {
                                                                                                                                                                                        alt27=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt27) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:224:25: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1984); 

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_8_in_line_p2_1986);
                                                                                                                                                                                            spec_sized_mult_lvl1_st_optionnal_8("P_8.26", 100);

                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:226:25: ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            int alt26=2;
                                                                                                                                                                                            int LA26_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA26_0==DELIMITER1) ) {
                                                                                                                                                                                                alt26=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt26) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:226:26: DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11039); 

                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11041);
                                                                                                                                                                                                    st_sized_optionnal("P_8.27", 100);

                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:227:26: ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    int alt25=2;
                                                                                                                                                                                                    int LA25_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA25_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt25=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt25) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:227:27: DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11070); 

                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:229:27: ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            int alt24=2;
                                                                                                                                                                                                            int LA24_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA24_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt24=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt24) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:229:28: DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11126); 

                                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11128);
                                                                                                                                                                                                                    st_sized_optionnal("P_8.29", 2);

                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:231:28: ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    int alt23=2;
                                                                                                                                                                                                                    int LA23_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA23_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt23=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt23) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:231:29: DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11187); 

                                                                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11189);
                                                                                                                                                                                                                            st_sized_optionnal("P_8.30", 20);

                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:232:29: ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            int alt22=2;
                                                                                                                                                                                                                            int LA22_0 = input.LA(1);

                                                                                                                                                                                                                            if ( (LA22_0==DELIMITER1) ) {
                                                                                                                                                                                                                                alt22=1;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            switch (alt22) {
                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:232:30: DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11221); 

                                                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11223);
                                                                                                                                                                                                                                    st_sized_optionnal("P_8.31", 20);

                                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:234:30: ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    int alt21=2;
                                                                                                                                                                                                                                    int LA21_0 = input.LA(1);

                                                                                                                                                                                                                                    if ( (LA21_0==DELIMITER1) ) {
                                                                                                                                                                                                                                        alt21=1;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    switch (alt21) {
                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:234:31: DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11286); 

                                                                                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11288);
                                                                                                                                                                                                                                            st_sized_optionnal("P_8.32", 20);

                                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:235:31: ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            int alt20=2;
                                                                                                                                                                                                                                            int LA20_0 = input.LA(1);

                                                                                                                                                                                                                                            if ( (LA20_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                alt20=1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            switch (alt20) {
                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:235:32: DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11322); 

                                                                                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_11324);
                                                                                                                                                                                                                                                    ts_sized_optionnal("P_8.33", 26);

                                                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:236:32: ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    int alt19=2;
                                                                                                                                                                                                                                                    int LA19_0 = input.LA(1);

                                                                                                                                                                                                                                                    if ( (LA19_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                        alt19=1;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    switch (alt19) {
                                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:236:33: DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )?
                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11359); 

                                                                                                                                                                                                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_11361);
                                                                                                                                                                                                                                                            ts_sized_optionnal("P_8.34", 26);

                                                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:237:33: ( DELIMITER1 )?
                                                                                                                                                                                                                                                            int alt18=2;
                                                                                                                                                                                                                                                            int LA18_0 = input.LA(1);

                                                                                                                                                                                                                                                            if ( (LA18_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                                alt18=1;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            switch (alt18) {
                                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:237:33: DELIMITER1
                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11396); 

                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                            }


                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:240:1: line_obr2_2 : line_obr2_1 ;
    public final void line_obr2_2() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:240:12: ( line_obr2_1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:241:3: line_obr2_1
            {
            pushFollow(FOLLOW_line_obr2_1_in_line_obr2_21467);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:243:1: line_obr2_1 : CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR_9.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR_9.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR_9.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR_9.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR_9.8\"] DELIMITER1 ts_sized_optionnal[\"OBR_9.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR_9.10\", 20] DELIMITER1 spec_sized_cna[\"OBR_9.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR_9.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_obr2_1() throws RecognitionException {
        contentHandler.startElement("ligne", "OBR");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:245:37: ( CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR_9.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR_9.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR_9.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR_9.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR_9.8\"] DELIMITER1 ts_sized_optionnal[\"OBR_9.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR_9.10\", 20] DELIMITER1 spec_sized_cna[\"OBR_9.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR_9.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:246:3: CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR_9.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR_9.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR_9.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR_9.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR_9.8\"] DELIMITER1 ts_sized_optionnal[\"OBR_9.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR_9.10\", 20] DELIMITER1 spec_sized_cna[\"OBR_9.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR_9.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_obr2_11484); 

            match(input,CHARO,FOLLOW_CHARO_in_line_obr2_11486); 

            match(input,CHARB,FOLLOW_CHARB_in_line_obr2_11488); 

            match(input,CHARR,FOLLOW_CHARR_in_line_obr2_11490); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11494); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_obr2_11496);
            nm_integer_sized_mandatory("OBR_9.2", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11501); 

            pushFollow(FOLLOW_spec_sized_9_3_in_line_obr2_11503);
            spec_sized_9_3("OBR_9.3", 23);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11508); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11510);
            spec_sized_mult_lvl1_st_optionnal_2("OBR_9.4", 23);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11515); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11517);
            spec_sized_mult_lvl1_st_optionnal_6("OBR_9.5", 640000);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:250:69: ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000] )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==REPETITEUR) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:250:70: REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11521); 

            	    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11523);
            	    spec_sized_mult_lvl1_st_optionnal_6("OBR_9.5", 64000);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11533); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11535);
            st_sized_optionnal("OBR_9.6", 2);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:252:47: ( REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2] )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==REPETITEUR) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:252:48: REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11539); 

            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11541);
            	    st_sized_optionnal("OBR_9.6", 2);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11548); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11550);
            ts_sized_optionnal("OBR_9.7", 26);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11555); 

            pushFollow(FOLLOW_spec_non_sized_9_8_in_line_obr2_11557);
            spec_non_sized_9_8("OBR_9.8");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11562); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11564);
            ts_sized_optionnal("OBR_9.9", 26);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11572); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11574);
            st_sized_optionnal("OBR_9.10", 20);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11579); 

            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_11581);
            spec_sized_cna("OBR_9.11", 60);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11589); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11591);
            st_sized_optionnal("OBR_9.12", 1);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:262:3: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==DELIMITER1) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:262:4: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11600); 

                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11602);
                    spec_sized_mult_lvl1_st_optionnal_2("OBR_9.13", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:263:4: ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==DELIMITER1) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:263:5: DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11609); 

                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11611);
                            st_sized_optionnal("OBR_9.14", 300);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:264:5: ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt76=2;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==DELIMITER1) ) {
                                alt76=1;
                            }
                            switch (alt76) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:264:6: DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11619); 

                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11621);
                                    ts_sized_optionnal("OBR_9.15", 26);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:265:6: ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt75=2;
                                    int LA75_0 = input.LA(1);

                                    if ( (LA75_0==DELIMITER1) ) {
                                        alt75=1;
                                    }
                                    switch (alt75) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:265:7: DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11630); 

                                            pushFollow(FOLLOW_spec_sized_9_16_in_line_obr2_11632);
                                            spec_sized_9_16("OBR_9_16", 300);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:266:7: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt74=2;
                                            int LA74_0 = input.LA(1);

                                            if ( (LA74_0==DELIMITER1) ) {
                                                alt74=1;
                                            }
                                            switch (alt74) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:266:8: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11642); 

                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11644);
                                                    spec_sized_mult_lvl1_st_optionnal_6("OBR_9.17", 60);

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:267:8: ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt73=2;
                                                    int LA73_0 = input.LA(1);

                                                    if ( (LA73_0==DELIMITER1) ) {
                                                        alt73=1;
                                                    }
                                                    switch (alt73) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:267:9: DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11655); 

                                                            pushFollow(FOLLOW_spec_sized_tn_in_line_obr2_11657);
                                                            spec_sized_tn("OBR_9.18", 40);

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:268:9: ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt72=2;
                                                            int LA72_0 = input.LA(1);

                                                            if ( (LA72_0==DELIMITER1) ) {
                                                                alt72=1;
                                                            }
                                                            switch (alt72) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:268:10: DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11669); 

                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11671);
                                                                    st_sized_optionnal("OBR_9.19", 60);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:269:10: ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt71=2;
                                                                    int LA71_0 = input.LA(1);

                                                                    if ( (LA71_0==DELIMITER1) ) {
                                                                        alt71=1;
                                                                    }
                                                                    switch (alt71) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:269:11: DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11684); 

                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11686);
                                                                            st_sized_optionnal("OBR_9.20", 60);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:270:11: ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt70=2;
                                                                            int LA70_0 = input.LA(1);

                                                                            if ( (LA70_0==DELIMITER1) ) {
                                                                                alt70=1;
                                                                            }
                                                                            switch (alt70) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:270:12: DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11700); 

                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11702);
                                                                                    st_sized_optionnal("OBR_9.21", 60);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:271:12: ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt69=2;
                                                                                    int LA69_0 = input.LA(1);

                                                                                    if ( (LA69_0==DELIMITER1) ) {
                                                                                        alt69=1;
                                                                                    }
                                                                                    switch (alt69) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:271:13: DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11717); 

                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11719);
                                                                                            st_sized_optionnal("OBR_9.22", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:272:13: ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt68=2;
                                                                                            int LA68_0 = input.LA(1);

                                                                                            if ( (LA68_0==DELIMITER1) ) {
                                                                                                alt68=1;
                                                                                            }
                                                                                            switch (alt68) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:272:14: DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11735); 

                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11737);
                                                                                                    ts_sized_optionnal("OBR_9.23", 26);

                                                                                                    state._fsp--;


                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:273:14: ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt67=2;
                                                                                                    int LA67_0 = input.LA(1);

                                                                                                    if ( (LA67_0==DELIMITER1) ) {
                                                                                                        alt67=1;
                                                                                                    }
                                                                                                    switch (alt67) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:273:15: DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11754); 

                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:274:15: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt66=2;
                                                                                                            int LA66_0 = input.LA(1);

                                                                                                            if ( (LA66_0==DELIMITER1) ) {
                                                                                                                alt66=1;
                                                                                                            }
                                                                                                            switch (alt66) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:274:16: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11772); 

                                                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11774);
                                                                                                                    spec_sized_mult_lvl1_st_optionnal_2("OBR_9.25", 10);

                                                                                                                    state._fsp--;


                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:275:16: ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt65=2;
                                                                                                                    int LA65_0 = input.LA(1);

                                                                                                                    if ( (LA65_0==DELIMITER1) ) {
                                                                                                                        alt65=1;
                                                                                                                    }
                                                                                                                    switch (alt65) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:275:17: DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11793); 

                                                                                                                            pushFollow(FOLLOW_spec_const_9_26_in_line_obr2_11795);
                                                                                                                            spec_const_9_26("OBR_9.26");

                                                                                                                            state._fsp--;


                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:276:17: ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt64=2;
                                                                                                                            int LA64_0 = input.LA(1);

                                                                                                                            if ( (LA64_0==DELIMITER1) ) {
                                                                                                                                alt64=1;
                                                                                                                            }
                                                                                                                            switch (alt64) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:276:18: DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11815); 

                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:277:18: ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt63=2;
                                                                                                                                    int LA63_0 = input.LA(1);

                                                                                                                                    if ( (LA63_0==DELIMITER1) ) {
                                                                                                                                        alt63=1;
                                                                                                                                    }
                                                                                                                                    switch (alt63) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:277:19: DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11835); 

                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:278:19: ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt62=2;
                                                                                                                                            int LA62_0 = input.LA(1);

                                                                                                                                            if ( (LA62_0==DELIMITER1) ) {
                                                                                                                                                alt62=1;
                                                                                                                                            }
                                                                                                                                            switch (alt62) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:278:20: DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11856); 

                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_11858);
                                                                                                                                                    spec_sized_cna("OBR_9.29", 150);

                                                                                                                                                    state._fsp--;


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:278:63: ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )*
                                                                                                                                                    loop51:
                                                                                                                                                    do {
                                                                                                                                                        int alt51=2;
                                                                                                                                                        int LA51_0 = input.LA(1);

                                                                                                                                                        if ( (LA51_0==REPETITEUR) ) {
                                                                                                                                                            alt51=1;
                                                                                                                                                        }


                                                                                                                                                        switch (alt51) {
                                                                                                                                                    	case 1 :
                                                                                                                                                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:278:64: REPETITEUR spec_sized_cna[\"P_8.14\", 150]
                                                                                                                                                    	    {
                                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11862); 

                                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_11864);
                                                                                                                                                    	    spec_sized_cna("P_8.14", 150);

                                                                                                                                                    	    state._fsp--;


                                                                                                                                                    	    }
                                                                                                                                                    	    break;

                                                                                                                                                    	default :
                                                                                                                                                    	    break loop51;
                                                                                                                                                        }
                                                                                                                                                    } while (true);


                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:279:20: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt61=2;
                                                                                                                                                    int LA61_0 = input.LA(1);

                                                                                                                                                    if ( (LA61_0==DELIMITER1) ) {
                                                                                                                                                        alt61=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt61) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:279:21: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11889); 

                                                                                                                                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_4_in_line_obr2_11891);
                                                                                                                                                            spec_sized_mult_lvl1_st_optionnal_4("OBR_9.30", 150);

                                                                                                                                                            state._fsp--;


                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:280:21: ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt60=2;
                                                                                                                                                            int LA60_0 = input.LA(1);

                                                                                                                                                            if ( (LA60_0==DELIMITER1) ) {
                                                                                                                                                                alt60=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt60) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:280:22: DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11915); 

                                                                                                                                                                    pushFollow(FOLLOW_spec_const_9_31_in_line_obr2_11917);
                                                                                                                                                                    spec_const_9_31("OBR_9.31");

                                                                                                                                                                    state._fsp--;


                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:282:22: ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                    int alt59=2;
                                                                                                                                                                    int LA59_0 = input.LA(1);

                                                                                                                                                                    if ( (LA59_0==DELIMITER1) ) {
                                                                                                                                                                        alt59=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt59) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:282:23: DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11964); 

                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11966);
                                                                                                                                                                            st_sized_optionnal("OBR_9.32", 300);

                                                                                                                                                                            state._fsp--;


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:282:70: ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )*
                                                                                                                                                                            loop52:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt52=2;
                                                                                                                                                                                int LA52_0 = input.LA(1);

                                                                                                                                                                                if ( (LA52_0==REPETITEUR) ) {
                                                                                                                                                                                    alt52=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt52) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:282:71: REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11970); 

                                                                                                                                                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11972);
                                                                                                                                                                            	    st_sized_optionnal("OBR_9.32", 300);

                                                                                                                                                                            	    state._fsp--;


                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop52;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:283:23: ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                            int alt58=2;
                                                                                                                                                                            int LA58_0 = input.LA(1);

                                                                                                                                                                            if ( (LA58_0==DELIMITER1) ) {
                                                                                                                                                                                alt58=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt58) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:283:24: DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12000); 

                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12002);
                                                                                                                                                                                    spec_sized_cna("OBR_9.33", 60);

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:284:24: ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                    int alt57=2;
                                                                                                                                                                                    int LA57_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA57_0==DELIMITER1) ) {
                                                                                                                                                                                        alt57=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt57) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:284:25: DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12029); 

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12031);
                                                                                                                                                                                            spec_sized_cna("OBR_9.34", 60);

                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:285:25: ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                            int alt56=2;
                                                                                                                                                                                            int LA56_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA56_0==DELIMITER1) ) {
                                                                                                                                                                                                alt56=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt56) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:285:26: DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12059); 

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12061);
                                                                                                                                                                                                    spec_sized_cna("OBR_9.35", 60);

                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:286:26: ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                    int alt55=2;
                                                                                                                                                                                                    int LA55_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA55_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt55=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt55) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:286:27: DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12090); 

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12092);
                                                                                                                                                                                                            spec_sized_cna("OBR_9.36", 60);

                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:287:27: ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                            int alt54=2;
                                                                                                                                                                                                            int LA54_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA54_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt54=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt54) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:287:28: DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12122); 

                                                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_12124);
                                                                                                                                                                                                                    ts_sized_optionnal("OBR_9.37", 26);

                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:288:29: ( DELIMITER1 )?
                                                                                                                                                                                                                    int alt53=2;
                                                                                                                                                                                                                    int LA53_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA53_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt53=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt53) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:288:29: DELIMITER1
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12155); 

                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:290:1: line_obx2_1 : CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX_10.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) ) ;
    public final void line_obx2_1() throws RecognitionException {
        contentHandler.startElement("ligne", "OBX");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:292:37: ( CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX_10.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:293:3: CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX_10.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) )
            {
            match(input,CR,FOLLOW_CR_in_line_obx2_12223); 

            match(input,CHARO,FOLLOW_CHARO_in_line_obx2_12225); 

            match(input,CHARB,FOLLOW_CHARB_in_line_obx2_12227); 

            match(input,CHARX,FOLLOW_CHARX_in_line_obx2_12229); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12233); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_obx2_12235);
            nm_integer_sized_mandatory("OBX_10.2", 10);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12240); 

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:296:5: ( ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:296:6: ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:296:6: ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:296:7: spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_nm_in_line_obx2_12248);
                    spec_const_10_3_nm("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:297:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==DELIMITER1) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:297:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12257); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12259);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:298:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==DELIMITER1) ) {
                                alt82=1;
                            }
                            switch (alt82) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:298:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12269); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12271);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:299:8: ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt81=2;
                                    int LA81_0 = input.LA(1);

                                    if ( (LA81_0==DELIMITER1) ) {
                                        alt81=1;
                                    }
                                    switch (alt81) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:299:9: DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12282); 

                                            pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2_12284);
                                            nm_sized_optionnal("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:299:58: ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )*
                                            loop79:
                                            do {
                                                int alt79=2;
                                                int LA79_0 = input.LA(1);

                                                if ( (LA79_0==REPETITEUR) ) {
                                                    alt79=1;
                                                }


                                                switch (alt79) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:299:59: REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12288); 

                                            	    pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2_12290);
                                            	    nm_sized_optionnal("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop79;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:300:9: ( line_obx2_1_post10_6 )?
                                            int alt80=2;
                                            int LA80_0 = input.LA(1);

                                            if ( (LA80_0==DELIMITER1) ) {
                                                alt80=1;
                                            }
                                            switch (alt80) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:300:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12303);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:301:7: ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:301:7: ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:301:8: spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_ce_in_line_obx2_12320);
                    spec_const_10_3_ce("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:302:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==DELIMITER1) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:302:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12329); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12331);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:303:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==DELIMITER1) ) {
                                alt87=1;
                            }
                            switch (alt87) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:303:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12341); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12343);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:304:8: ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt86=2;
                                    int LA86_0 = input.LA(1);

                                    if ( (LA86_0==DELIMITER1) ) {
                                        alt86=1;
                                    }
                                    switch (alt86) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:304:9: DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12354); 

                                            pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12356);
                                            spec_sized_10_6("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:304:55: ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )*
                                            loop84:
                                            do {
                                                int alt84=2;
                                                int LA84_0 = input.LA(1);

                                                if ( (LA84_0==REPETITEUR) ) {
                                                    alt84=1;
                                                }


                                                switch (alt84) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:304:56: REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12360); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12362);
                                            	    spec_sized_10_6("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop84;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:305:9: ( line_obx2_1_post10_6 )?
                                            int alt85=2;
                                            int LA85_0 = input.LA(1);

                                            if ( (LA85_0==DELIMITER1) ) {
                                                alt85=1;
                                            }
                                            switch (alt85) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:305:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12375);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:306:7: ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:306:7: ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:306:8: spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_fic_in_line_obx2_12392);
                    spec_const_10_3_fic("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:307:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==DELIMITER1) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:307:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12401); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12403);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:308:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt92=2;
                            int LA92_0 = input.LA(1);

                            if ( (LA92_0==DELIMITER1) ) {
                                alt92=1;
                            }
                            switch (alt92) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:308:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12413); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12415);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:309:8: ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt91=2;
                                    int LA91_0 = input.LA(1);

                                    if ( (LA91_0==DELIMITER1) ) {
                                        alt91=1;
                                    }
                                    switch (alt91) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:309:9: DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12426); 

                                            pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12428);
                                            spec_sized_10_6("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:309:55: ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )*
                                            loop89:
                                            do {
                                                int alt89=2;
                                                int LA89_0 = input.LA(1);

                                                if ( (LA89_0==REPETITEUR) ) {
                                                    alt89=1;
                                                }


                                                switch (alt89) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:309:56: REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12432); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12434);
                                            	    spec_sized_10_6("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop89;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:310:9: ( line_obx2_1_post10_6 )?
                                            int alt90=2;
                                            int LA90_0 = input.LA(1);

                                            if ( (LA90_0==DELIMITER1) ) {
                                                alt90=1;
                                            }
                                            switch (alt90) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:310:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12447);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:311:7: ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:311:7: ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:311:8: spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_st_in_line_obx2_12464);
                    spec_const_10_3_st("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:312:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==DELIMITER1) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:312:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12473); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12475);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:313:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt97=2;
                            int LA97_0 = input.LA(1);

                            if ( (LA97_0==DELIMITER1) ) {
                                alt97=1;
                            }
                            switch (alt97) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:313:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12485); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12487);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:314:8: ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt96=2;
                                    int LA96_0 = input.LA(1);

                                    if ( (LA96_0==DELIMITER1) ) {
                                        alt96=1;
                                    }
                                    switch (alt96) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:314:9: DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12498); 

                                            pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12500);
                                            spec_sized_10_6_tx("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:314:58: ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )*
                                            loop94:
                                            do {
                                                int alt94=2;
                                                int LA94_0 = input.LA(1);

                                                if ( (LA94_0==REPETITEUR) ) {
                                                    alt94=1;
                                                }


                                                switch (alt94) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:314:59: REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12504); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12506);
                                            	    spec_sized_10_6_tx("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop94;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:315:9: ( line_obx2_1_post10_6 )?
                                            int alt95=2;
                                            int LA95_0 = input.LA(1);

                                            if ( (LA95_0==DELIMITER1) ) {
                                                alt95=1;
                                            }
                                            switch (alt95) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:315:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12519);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:316:7: ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:316:7: ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:316:8: spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_gc_in_line_obx2_12536);
                    spec_const_10_3_gc("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:317:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==DELIMITER1) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:317:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12545); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12547);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:318:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt102=2;
                            int LA102_0 = input.LA(1);

                            if ( (LA102_0==DELIMITER1) ) {
                                alt102=1;
                            }
                            switch (alt102) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:318:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12557); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12559);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:319:8: ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt101=2;
                                    int LA101_0 = input.LA(1);

                                    if ( (LA101_0==DELIMITER1) ) {
                                        alt101=1;
                                    }
                                    switch (alt101) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:319:9: DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12570); 

                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12572);
                                            spec_sized_mult_lvl1_nm_optionnal_2("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:319:75: ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )*
                                            loop99:
                                            do {
                                                int alt99=2;
                                                int LA99_0 = input.LA(1);

                                                if ( (LA99_0==REPETITEUR) ) {
                                                    alt99=1;
                                                }


                                                switch (alt99) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:319:76: REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12576); 

                                            	    pushFollow(FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12578);
                                            	    spec_sized_mult_lvl1_nm_optionnal_2("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop99;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:320:9: ( line_obx2_1_post10_6 )?
                                            int alt100=2;
                                            int LA100_0 = input.LA(1);

                                            if ( (LA100_0==DELIMITER1) ) {
                                                alt100=1;
                                            }
                                            switch (alt100) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:320:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12591);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:321:7: ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:321:7: ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:321:8: spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_tx_in_line_obx2_12608);
                    spec_const_10_3_tx("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:322:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==DELIMITER1) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:322:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12617); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12619);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:323:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt107=2;
                            int LA107_0 = input.LA(1);

                            if ( (LA107_0==DELIMITER1) ) {
                                alt107=1;
                            }
                            switch (alt107) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:323:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12629); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12631);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:324:8: ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt106=2;
                                    int LA106_0 = input.LA(1);

                                    if ( (LA106_0==DELIMITER1) ) {
                                        alt106=1;
                                    }
                                    switch (alt106) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:324:9: DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12642); 

                                            pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12644);
                                            spec_sized_10_6_tx("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:324:58: ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )*
                                            loop104:
                                            do {
                                                int alt104=2;
                                                int LA104_0 = input.LA(1);

                                                if ( (LA104_0==REPETITEUR) ) {
                                                    alt104=1;
                                                }


                                                switch (alt104) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:324:59: REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12648); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12650);
                                            	    spec_sized_10_6_tx("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop104;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:325:9: ( line_obx2_1_post10_6 )?
                                            int alt105=2;
                                            int LA105_0 = input.LA(1);

                                            if ( (LA105_0==DELIMITER1) ) {
                                                alt105=1;
                                            }
                                            switch (alt105) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:325:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12663);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:326:7: ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:326:7: ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:326:8: spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_std_in_line_obx2_12680);
                    spec_const_10_3_std("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:327:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==DELIMITER1) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:327:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12689); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12691);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:328:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt112=2;
                            int LA112_0 = input.LA(1);

                            if ( (LA112_0==DELIMITER1) ) {
                                alt112=1;
                            }
                            switch (alt112) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:328:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12701); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12703);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:329:8: ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt111=2;
                                    int LA111_0 = input.LA(1);

                                    if ( (LA111_0==DELIMITER1) ) {
                                        alt111=1;
                                    }
                                    switch (alt111) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:329:9: DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12714); 

                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12716);
                                            st_sized_optionnal("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:329:58: ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )*
                                            loop109:
                                            do {
                                                int alt109=2;
                                                int LA109_0 = input.LA(1);

                                                if ( (LA109_0==REPETITEUR) ) {
                                                    alt109=1;
                                                }


                                                switch (alt109) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:329:59: REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12720); 

                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12722);
                                            	    st_sized_optionnal("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop109;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:330:9: ( line_obx2_1_post10_6 )?
                                            int alt110=2;
                                            int LA110_0 = input.LA(1);

                                            if ( (LA110_0==DELIMITER1) ) {
                                                alt110=1;
                                            }
                                            switch (alt110) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:330:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12735);
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

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:332:1: line_obx2_1_post10_6 : ( DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? ) ;
    public final void line_obx2_1_post10_6() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:332:21: ( ( DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:333:5: ( DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:333:5: ( DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:333:6: DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62756); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62758);
            st_sized_optionnal("OBX_10.7", 20);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:334:6: ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==DELIMITER1) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:334:7: DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62767); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62769);
                    st_sized_optionnal("OBX_10.8", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:334:53: ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==REPETITEUR) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:334:54: REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60]
                    	    {
                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_62773); 

                    	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62775);
                    	    st_sized_optionnal("OBX_10.8", 60);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:335:7: ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==DELIMITER1) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:335:8: DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62787); 

                            pushFollow(FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62789);
                            spec_const_10_9("OBX_10.9");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:335:47: ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )*
                            loop116:
                            do {
                                int alt116=2;
                                int LA116_0 = input.LA(1);

                                if ( (LA116_0==REPETITEUR) ) {
                                    alt116=1;
                                }


                                switch (alt116) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:335:48: REPETITEUR spec_const_10_9[\"OBX_10.9\"]
                            	    {
                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_62793); 

                            	    pushFollow(FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62795);
                            	    spec_const_10_9("OBX_10.9");

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop116;
                                }
                            } while (true);


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:336:8: ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                            int alt126=2;
                            int LA126_0 = input.LA(1);

                            if ( (LA126_0==DELIMITER1) ) {
                                alt126=1;
                            }
                            switch (alt126) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:336:9: DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62808); 

                                    pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2_1_post10_62810);
                                    nm_sized_optionnal("OBX_10.10", 5);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:337:9: ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                    int alt125=2;
                                    int LA125_0 = input.LA(1);

                                    if ( (LA125_0==DELIMITER1) ) {
                                        alt125=1;
                                    }
                                    switch (alt125) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:337:10: DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62822); 

                                            pushFollow(FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62824);
                                            spec_const_10_11("OBX_10.11");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:337:51: ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )*
                                            loop117:
                                            do {
                                                int alt117=2;
                                                int LA117_0 = input.LA(1);

                                                if ( (LA117_0==REPETITEUR) ) {
                                                    alt117=1;
                                                }


                                                switch (alt117) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:337:52: REPETITEUR spec_const_10_11[\"OBX_10.11\"]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_62828); 

                                            	    pushFollow(FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62830);
                                            	    spec_const_10_11("OBX_10.11");

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop117;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:338:10: ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )?
                                            int alt124=2;
                                            int LA124_0 = input.LA(1);

                                            if ( (LA124_0==DELIMITER1) ) {
                                                alt124=1;
                                            }
                                            switch (alt124) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:338:11: DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62845); 

                                                    pushFollow(FOLLOW_spec_const_10_12_in_line_obx2_1_post10_62847);
                                                    spec_const_10_12("OBX_10.12");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:339:11: ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )?
                                                    int alt123=2;
                                                    int LA123_0 = input.LA(1);

                                                    if ( (LA123_0==DELIMITER1) ) {
                                                        alt123=1;
                                                    }
                                                    switch (alt123) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:339:12: DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62862); 

                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62864);
                                                            ts_sized_optionnal("OBX_10.13", 26);

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:340:12: ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )?
                                                            int alt122=2;
                                                            int LA122_0 = input.LA(1);

                                                            if ( (LA122_0==DELIMITER1) ) {
                                                                alt122=1;
                                                            }
                                                            switch (alt122) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:340:13: DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62880); 

                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62882);
                                                                    st_sized_optionnal("OBX_10.14", 20);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:341:13: ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )?
                                                                    int alt121=2;
                                                                    int LA121_0 = input.LA(1);

                                                                    if ( (LA121_0==DELIMITER1) ) {
                                                                        alt121=1;
                                                                    }
                                                                    switch (alt121) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:341:14: DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62898); 

                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62900);
                                                                            ts_sized_optionnal("OBX_10.15", 26);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:342:14: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )?
                                                                            int alt120=2;
                                                                            int LA120_0 = input.LA(1);

                                                                            if ( (LA120_0==DELIMITER1) ) {
                                                                                alt120=1;
                                                                            }
                                                                            switch (alt120) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:342:15: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62917); 

                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obx2_1_post10_62919);
                                                                                    spec_sized_mult_lvl1_st_optionnal_6("OBX_10.16", 60);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:343:15: ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )?
                                                                                    int alt119=2;
                                                                                    int LA119_0 = input.LA(1);

                                                                                    if ( (LA119_0==DELIMITER1) ) {
                                                                                        alt119=1;
                                                                                    }
                                                                                    switch (alt119) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:343:16: DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62937); 

                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62939);
                                                                                            st_sized_optionnal("OBX_10.17", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:343:63: ( DELIMITER1 )?
                                                                                            int alt118=2;
                                                                                            int LA118_0 = input.LA(1);

                                                                                            if ( (LA118_0==DELIMITER1) ) {
                                                                                                alt118=1;
                                                                                            }
                                                                                            switch (alt118) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:343:63: DELIMITER1
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62942); 

                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:345:1: line_c2_1 : CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C_12.2\", 10] DELIMITER1 spec_const_12_3[\"C_12.3\"] DELIMITER1 st_sized_optionnal[\"C_12.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C_12.4\", 64000] )* ( DELIMITER1 )? ;
    public final void line_c2_1() throws RecognitionException {
        contentHandler.startElement("ligne", "C");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:347:37: ( CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C_12.2\", 10] DELIMITER1 spec_const_12_3[\"C_12.3\"] DELIMITER1 st_sized_optionnal[\"C_12.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C_12.4\", 64000] )* ( DELIMITER1 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:348:3: CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C_12.2\", 10] DELIMITER1 spec_const_12_3[\"C_12.3\"] DELIMITER1 st_sized_optionnal[\"C_12.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C_12.4\", 64000] )* ( DELIMITER1 )?
            {
            match(input,CR,FOLLOW_CR_in_line_c2_12981); 

            match(input,CHARC,FOLLOW_CHARC_in_line_c2_12983); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_12987); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_c2_12989);
            nm_integer_sized_mandatory("C_12.2", 10);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_12994); 

            pushFollow(FOLLOW_spec_const_12_3_in_line_c2_12996);
            spec_const_12_3("C_12.3");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_13001); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_c2_13003);
            st_sized_optionnal("C_12.4", 64000);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:351:50: ( REPETITEUR st_sized_optionnal[\"C_12.4\", 64000] )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==REPETITEUR) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:351:51: REPETITEUR st_sized_optionnal[\"C_12.4\", 64000]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_c2_13007); 

            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_c2_13009);
            	    st_sized_optionnal("C_12.4", 64000);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:352:3: ( DELIMITER1 )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==DELIMITER1) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:352:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_13018); 

                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:354:1: line_l2_1 : CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )? )? ;
    public final void line_l2_1() throws RecognitionException {
        contentHandler.startElement("ligne", "L");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:356:37: ( CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:357:3: CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_l2_13036); 

            match(input,CHARL,FOLLOW_CHARL_in_line_l2_13038); 

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:358:3: ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )? )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==DELIMITER1) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:358:4: DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13043); 

                    pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l2_13045);
                    nm_integer_sized_optionnal("L_14.2", 1);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:359:4: ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==DELIMITER1) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:359:5: DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13052); 

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:360:5: ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )?
                            int alt134=2;
                            int LA134_0 = input.LA(1);

                            if ( (LA134_0==DELIMITER1) ) {
                                alt134=1;
                            }
                            switch (alt134) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:360:6: DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13059); 

                                    pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l2_13061);
                                    nm_integer_sized_optionnal("L_14.4", 4);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:361:6: ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )?
                                    int alt133=2;
                                    int LA133_0 = input.LA(1);

                                    if ( (LA133_0==DELIMITER1) ) {
                                        alt133=1;
                                    }
                                    switch (alt133) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:361:7: DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13070); 

                                            pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l2_13072);
                                            nm_integer_sized_optionnal("L_14.5", 10);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:362:7: ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )?
                                            int alt132=2;
                                            int LA132_0 = input.LA(1);

                                            if ( (LA132_0==DELIMITER1) ) {
                                                alt132=1;
                                            }
                                            switch (alt132) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:362:8: DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13082); 

                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_l2_13084);
                                                    st_sized_optionnal("L_14.6", 12);

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:362:52: ( DELIMITER1 )?
                                                    int alt131=2;
                                                    int LA131_0 = input.LA(1);

                                                    if ( (LA131_0==DELIMITER1) ) {
                                                        alt131=1;
                                                    }
                                                    switch (alt131) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:362:52: DELIMITER1
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13087); 

                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:372:1: spec_const_sexe[String nameElement] : ( final_charM | final_charF | final_charU )? ;
    public final void spec_const_sexe(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:374:37: ( ( final_charM | final_charF | final_charU )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:375:3: ( final_charM | final_charF | final_charU )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:375:3: ( final_charM | final_charF | final_charU )?
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:375:4: final_charM
                    {
                    pushFollow(FOLLOW_final_charM_in_spec_const_sexe3125);
                    final_charM();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:375:18: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_sexe3129);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:375:32: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_sexe3133);
                    final_charU();

                    state._fsp--;


                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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



    // $ANTLR start "spec_const_7_13_version_2_0"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:377:1: spec_const_7_13_version_2_0[String nameElement] : spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_0(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:379:37: ( spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:380:3: spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_0_in_spec_const_7_13_version_2_03153);
            spec_const_7_13_1_version_2_0(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_03156); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_03158);
            spec_const_7_13_2(nameElement + ".2");

            state._fsp--;


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:382:1: spec_const_7_13_version_2_1[String nameElement] : spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_1(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:384:37: ( spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:385:3: spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_1_in_spec_const_7_13_version_2_13179);
            spec_const_7_13_1_version_2_1(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_13182); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_13184);
            spec_const_7_13_2(nameElement + ".2");

            state._fsp--;


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:387:1: spec_const_7_13_version_2_2[String nameElement] : spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_2(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:389:37: ( spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:390:3: spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_2_in_spec_const_7_13_version_2_23203);
            spec_const_7_13_1_version_2_2(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_23206); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_23208);
            spec_const_7_13_2(nameElement + ".2");

            state._fsp--;


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:392:1: spec_const_7_13_2[String nameElement] : ( final_charC | final_charL | final_charR );
    public final void spec_const_7_13_2(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:394:37: ( final_charC | final_charL | final_charR )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:395:3: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_7_13_23227);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:395:17: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_7_13_23231);
                    final_charL();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:395:31: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_7_13_23235);
                    final_charR();

                    state._fsp--;


                    }
                    break;

            }
            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:397:1: spec_const_7_7_contexte[String nameElement] : final_ORU ;
    public final void spec_const_7_7_contexte(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:399:37: ( final_ORU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:400:3: final_ORU
            {
            pushFollow(FOLLOW_final_ORU_in_spec_const_7_7_contexte3253);
            final_ORU();

            state._fsp--;


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:402:1: spec_const_7_12[String nameElement] : ( final_charP | final_charD | final_charT ) ;
    public final void spec_const_7_12(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:404:37: ( ( final_charP | final_charD | final_charT ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:405:3: ( final_charP | final_charD | final_charT )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:405:3: ( final_charP | final_charD | final_charT )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:405:4: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_7_123272);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:405:18: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_7_123276);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:405:32: final_charT
                    {
                    pushFollow(FOLLOW_final_charT_in_spec_const_7_123280);
                    final_charT();

                    state._fsp--;


                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:407:1: spec_const_9_31[String nameElement] : ( final_PORT | final_CART | final_WHLC | final_WALK )? ;
    public final void spec_const_9_31(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:409:37: ( ( final_PORT | final_CART | final_WHLC | final_WALK )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:410:3: ( final_PORT | final_CART | final_WHLC | final_WALK )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:410:3: ( final_PORT | final_CART | final_WHLC | final_WALK )?
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:410:4: final_PORT
                    {
                    pushFollow(FOLLOW_final_PORT_in_spec_const_9_313300);
                    final_PORT();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:410:17: final_CART
                    {
                    pushFollow(FOLLOW_final_CART_in_spec_const_9_313304);
                    final_CART();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:410:30: final_WHLC
                    {
                    pushFollow(FOLLOW_final_WHLC_in_spec_const_9_313308);
                    final_WHLC();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:410:43: final_WALK
                    {
                    pushFollow(FOLLOW_final_WALK_in_spec_const_9_313312);
                    final_WALK();

                    state._fsp--;


                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:412:1: spec_const_8_25[String nameElement] : ( final_OP | final_IP | final_ER | final_PA | final_MP )? ;
    public final void spec_const_8_25(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:414:37: ( ( final_OP | final_IP | final_ER | final_PA | final_MP )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:415:3: ( final_OP | final_IP | final_ER | final_PA | final_MP )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:415:3: ( final_OP | final_IP | final_ER | final_PA | final_MP )?
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:415:4: final_OP
                    {
                    pushFollow(FOLLOW_final_OP_in_spec_const_8_253333);
                    final_OP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:415:15: final_IP
                    {
                    pushFollow(FOLLOW_final_IP_in_spec_const_8_253337);
                    final_IP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:415:26: final_ER
                    {
                    pushFollow(FOLLOW_final_ER_in_spec_const_8_253341);
                    final_ER();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:415:37: final_PA
                    {
                    pushFollow(FOLLOW_final_PA_in_spec_const_8_253345);
                    final_PA();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:415:48: final_MP
                    {
                    pushFollow(FOLLOW_final_MP_in_spec_const_8_253349);
                    final_MP();

                    state._fsp--;


                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:417:1: spec_const_9_26[String nameElement] : ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )? ;
    public final void spec_const_9_26(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:419:37: ( ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:3: ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:3: ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )?
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:4: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_9_263370);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:18: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_9_263374);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:32: final_charM
                    {
                    pushFollow(FOLLOW_final_charM_in_spec_const_9_263378);
                    final_charM();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:46: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_9_263382);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:60: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_9_263386);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:74: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_9_263390);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:88: final_charO
                    {
                    pushFollow(FOLLOW_final_charO_in_spec_const_9_263394);
                    final_charO();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:421:3: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_9_263400);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:421:17: final_charX
                    {
                    pushFollow(FOLLOW_final_charX_in_spec_const_9_263404);
                    final_charX();

                    state._fsp--;


                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:423:1: spec_const_10_3_nm[String nameElement] : CHARN CHARM ;
    public final HPRIMSParser.spec_const_10_3_nm_return spec_const_10_3_nm(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_nm_return retval = new HPRIMSParser.spec_const_10_3_nm_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:425:37: ( CHARN CHARM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:426:3: CHARN CHARM
            {
            match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_nm3425); 

            match(input,CHARM,FOLLOW_CHARM_in_spec_const_10_3_nm3427); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:428:1: spec_const_10_3_ce[String nameElement] : CHARC CHARE ;
    public final HPRIMSParser.spec_const_10_3_ce_return spec_const_10_3_ce(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_ce_return retval = new HPRIMSParser.spec_const_10_3_ce_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:37: ( CHARC CHARE )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:431:3: CHARC CHARE
            {
            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_ce3448); 

            match(input,CHARE,FOLLOW_CHARE_in_spec_const_10_3_ce3450); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:433:1: spec_const_10_3_st[String nameElement] : CHARS CHART ;
    public final HPRIMSParser.spec_const_10_3_st_return spec_const_10_3_st(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_st_return retval = new HPRIMSParser.spec_const_10_3_st_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:435:37: ( CHARS CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:436:3: CHARS CHART
            {
            match(input,CHARS,FOLLOW_CHARS_in_spec_const_10_3_st3471); 

            match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_st3473); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:438:1: spec_const_10_3_gc[String nameElement] : CHARG CHARC ;
    public final HPRIMSParser.spec_const_10_3_gc_return spec_const_10_3_gc(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_gc_return retval = new HPRIMSParser.spec_const_10_3_gc_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:440:37: ( CHARG CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:441:3: CHARG CHARC
            {
            match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_gc3494); 

            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_gc3496); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:443:1: spec_const_10_3_tx[String nameElement] : CHART CHARX ;
    public final HPRIMSParser.spec_const_10_3_tx_return spec_const_10_3_tx(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_tx_return retval = new HPRIMSParser.spec_const_10_3_tx_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:37: ( CHART CHARX )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:446:3: CHART CHARX
            {
            match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_tx3518); 

            match(input,CHARX,FOLLOW_CHARX_in_spec_const_10_3_tx3520); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:448:1: spec_const_10_3_fic[String nameElement] : ( CHARF CHARI CHARC ) ;
    public final HPRIMSParser.spec_const_10_3_fic_return spec_const_10_3_fic(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_fic_return retval = new HPRIMSParser.spec_const_10_3_fic_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:450:37: ( ( CHARF CHARI CHARC ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:451:3: ( CHARF CHARI CHARC )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:451:3: ( CHARF CHARI CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:451:4: CHARF CHARI CHARC
            {
            match(input,CHARF,FOLLOW_CHARF_in_spec_const_10_3_fic3541); 

            match(input,CHARI,FOLLOW_CHARI_in_spec_const_10_3_fic3543); 

            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_fic3545); 

            }


            contentHandler.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:453:1: spec_const_10_3_std[String nameElement] : ( ( CHARA CHARD ) | ( CHARC CHARK ) | ( CHARC CHARN CHARA ) | ( CHARD CHART ) | ( CHARP CHARN ) | ( CHART CHARN ) | ( CHARG CHARB ) | ( CHARG CHARN ) );
    public final HPRIMSParser.spec_const_10_3_std_return spec_const_10_3_std(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_std_return retval = new HPRIMSParser.spec_const_10_3_std_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:455:37: ( ( CHARA CHARD ) | ( CHARC CHARK ) | ( CHARC CHARN CHARA ) | ( CHARD CHART ) | ( CHARP CHARN ) | ( CHART CHARN ) | ( CHARG CHARB ) | ( CHARG CHARN ) )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:456:3: ( CHARA CHARD )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:456:3: ( CHARA CHARD )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:456:4: CHARA CHARD
                    {
                    match(input,CHARA,FOLLOW_CHARA_in_spec_const_10_3_std3567); 

                    match(input,CHARD,FOLLOW_CHARD_in_spec_const_10_3_std3569); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:456:19: ( CHARC CHARK )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:456:19: ( CHARC CHARK )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:456:20: CHARC CHARK
                    {
                    match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_std3575); 

                    match(input,CHARK,FOLLOW_CHARK_in_spec_const_10_3_std3577); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:456:35: ( CHARC CHARN CHARA )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:456:35: ( CHARC CHARN CHARA )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:456:36: CHARC CHARN CHARA
                    {
                    match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_std3583); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3585); 

                    match(input,CHARA,FOLLOW_CHARA_in_spec_const_10_3_std3587); 

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:456:57: ( CHARD CHART )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:456:57: ( CHARD CHART )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:456:58: CHARD CHART
                    {
                    match(input,CHARD,FOLLOW_CHARD_in_spec_const_10_3_std3593); 

                    match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_std3595); 

                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:457:3: ( CHARP CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:457:3: ( CHARP CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:457:4: CHARP CHARN
                    {
                    match(input,CHARP,FOLLOW_CHARP_in_spec_const_10_3_std3603); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3605); 

                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:457:19: ( CHART CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:457:19: ( CHART CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:457:20: CHART CHARN
                    {
                    match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_std3611); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3613); 

                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:3: ( CHARG CHARB )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:3: ( CHARG CHARB )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:4: CHARG CHARB
                    {
                    match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_std3621); 

                    match(input,CHARB,FOLLOW_CHARB_in_spec_const_10_3_std3623); 

                    }


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:19: ( CHARG CHARN )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:19: ( CHARG CHARN )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:20: CHARG CHARN
                    {
                    match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_std3629); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3631); 

                    }


                    contentHandler.content(input.toString(retval.start,input.LT(-1)));

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:462:1: spec_sized_10_6[String nameElement, int maxSize] : st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )? ;
    public final HPRIMSParser.spec_sized_10_6_return spec_sized_10_6(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_10_6_return retval = new HPRIMSParser.spec_sized_10_6_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:464:37: ( st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:465:3: st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )?
            {
            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_63654);
            st_sized_optionnal(nameElement + ".1", 10);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:466:3: ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==DELIMITER2) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:466:4: DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_63660); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_63662);
                    st_sized_optionnal(nameElement + ".2", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:467:4: ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==DELIMITER2) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:467:5: DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_63669); 

                            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_63671);
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


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:470:1: spec_const_10_9[String nameElement] : ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )? ;
    public final void spec_const_10_9(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:472:37: ( ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:473:3: ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:473:3: ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )?
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:473:4: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_10_93699);
                    final_charL();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:473:18: final_charH
                    {
                    pushFollow(FOLLOW_final_charH_in_spec_const_10_93703);
                    final_charH();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:473:32: final_LL
                    {
                    pushFollow(FOLLOW_final_LL_in_spec_const_10_93707);
                    final_LL();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:473:43: final_HH
                    {
                    pushFollow(FOLLOW_final_HH_in_spec_const_10_93711);
                    final_HH();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:473:54: final_symbol_inf
                    {
                    pushFollow(FOLLOW_final_symbol_inf_in_spec_const_10_93715);
                    final_symbol_inf();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:473:73: final_symbol_sup
                    {
                    pushFollow(FOLLOW_final_symbol_sup_in_spec_const_10_93719);
                    final_symbol_sup();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:474:3: final_charN
                    {
                    pushFollow(FOLLOW_final_charN_in_spec_const_10_93725);
                    final_charN();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:474:17: final_charA
                    {
                    pushFollow(FOLLOW_final_charA_in_spec_const_10_93729);
                    final_charA();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:474:31: final_AA
                    {
                    pushFollow(FOLLOW_final_AA_in_spec_const_10_93733);
                    final_AA();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:474:42: final_Null
                    {
                    pushFollow(FOLLOW_final_Null_in_spec_const_10_93737);
                    final_Null();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:474:55: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_10_93741);
                    final_charU();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:474:69: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_10_93745);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:474:83: final_charB
                    {
                    pushFollow(FOLLOW_final_charB_in_spec_const_10_93749);
                    final_charB();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:475:3: final_charW
                    {
                    pushFollow(FOLLOW_final_charW_in_spec_const_10_93755);
                    final_charW();

                    state._fsp--;


                    }
                    break;
                case 15 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:475:17: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_93759);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 16 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:475:31: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_10_93763);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 17 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:475:45: final_charS
                    {
                    pushFollow(FOLLOW_final_charS_in_spec_const_10_93767);
                    final_charS();

                    state._fsp--;


                    }
                    break;
                case 18 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:475:59: final_MS
                    {
                    pushFollow(FOLLOW_final_MS_in_spec_const_10_93771);
                    final_MS();

                    state._fsp--;


                    }
                    break;
                case 19 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:475:70: final_VS
                    {
                    pushFollow(FOLLOW_final_VS_in_spec_const_10_93775);
                    final_VS();

                    state._fsp--;


                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:477:1: spec_const_10_11[String nameElement] : ( final_charA | final_charS | final_charR | final_charN )? ;
    public final void spec_const_10_11(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:479:37: ( ( final_charA | final_charS | final_charR | final_charN )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:480:3: ( final_charA | final_charS | final_charR | final_charN )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:480:3: ( final_charA | final_charS | final_charR | final_charN )?
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:480:4: final_charA
                    {
                    pushFollow(FOLLOW_final_charA_in_spec_const_10_113796);
                    final_charA();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:480:18: final_charS
                    {
                    pushFollow(FOLLOW_final_charS_in_spec_const_10_113800);
                    final_charS();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:480:32: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_113804);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:480:46: final_charN
                    {
                    pushFollow(FOLLOW_final_charN_in_spec_const_10_113808);
                    final_charN();

                    state._fsp--;


                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:482:1: spec_const_10_12[String nameElement] : ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )? ;
    public final void spec_const_10_12(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:484:37: ( ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:485:3: ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:485:3: ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )?
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:485:4: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_123829);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:485:18: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_10_123833);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:485:32: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_10_123837);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:485:46: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_10_123841);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:485:60: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_10_123845);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:485:74: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_10_123849);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:486:4: final_charX
                    {
                    pushFollow(FOLLOW_final_charX_in_spec_const_10_123856);
                    final_charX();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:486:18: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_10_123860);
                    final_charU();

                    state._fsp--;


                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:488:1: spec_const_12_3[String nameElement] : ( final_charP | final_charL )? ;
    public final void spec_const_12_3(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:490:37: ( ( final_charP | final_charL )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:491:3: ( final_charP | final_charL )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:491:3: ( final_charP | final_charL )?
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:491:4: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_12_33881);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:491:18: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_12_33885);
                    final_charL();

                    state._fsp--;


                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:493:1: spec_sized_mult_lvl1_st_mandatory_2[String nameElement, int maxSize] : st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return spec_sized_mult_lvl1_st_mandatory_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:495:37: ( st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:496:3: st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_23905);
            st_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_23911); 

            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_23913);
            st_nonsized_mandatory(nameElement + ".2");

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:500:1: spec_sized_mult_lvl1_st_optionnal_2[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return spec_sized_mult_lvl1_st_optionnal_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:502:37: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:503:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_23936);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==DELIMITER2) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"]
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_23942); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_23944);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:508:1: spec_sized_mult_lvl1_st_optionnal_4[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return spec_sized_mult_lvl1_st_optionnal_4(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:510:37: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:511:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_43969);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:512:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==DELIMITER2) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:512:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_43975); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_43977);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:513:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )?
                    int alt152=2;
                    int LA152_0 = input.LA(1);

                    if ( (LA152_0==DELIMITER2) ) {
                        alt152=1;
                    }
                    switch (alt152) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:513:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_43984); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_43986);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:514:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
                            int alt151=2;
                            int LA151_0 = input.LA(1);

                            if ( (LA151_0==DELIMITER2) ) {
                                alt151=1;
                            }
                            switch (alt151) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:514:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"]
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_43994); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_43996);
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


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:518:1: spec_sized_mult_lvl1_st_optionnal_6[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return spec_sized_mult_lvl1_st_optionnal_6(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:520:37: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64025);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:522:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==DELIMITER2) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:522:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64032); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64034);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:523:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    int alt157=2;
                    int LA157_0 = input.LA(1);

                    if ( (LA157_0==DELIMITER2) ) {
                        alt157=1;
                    }
                    switch (alt157) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:523:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64042); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64044);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:524:6: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            int alt156=2;
                            int LA156_0 = input.LA(1);

                            if ( (LA156_0==DELIMITER2) ) {
                                alt156=1;
                            }
                            switch (alt156) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:524:7: DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64053); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64055);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:525:7: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    int alt155=2;
                                    int LA155_0 = input.LA(1);

                                    if ( (LA155_0==DELIMITER2) ) {
                                        alt155=1;
                                    }
                                    switch (alt155) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:525:8: DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64065); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64067);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:526:8: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            int alt154=2;
                                            int LA154_0 = input.LA(1);

                                            if ( (LA154_0==DELIMITER2) ) {
                                                alt154=1;
                                            }
                                            switch (alt154) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:526:9: DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64078); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64080);
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


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:530:1: spec_sized_mult_lvl1_st_optionnal_8[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return spec_sized_mult_lvl1_st_optionnal_8(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:532:37: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:533:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84113);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:534:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==DELIMITER2) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:534:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84119); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84121);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:535:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )?
                    int alt164=2;
                    int LA164_0 = input.LA(1);

                    if ( (LA164_0==DELIMITER2) ) {
                        alt164=1;
                    }
                    switch (alt164) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:535:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84128); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84130);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:536:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )?
                            int alt163=2;
                            int LA163_0 = input.LA(1);

                            if ( (LA163_0==DELIMITER2) ) {
                                alt163=1;
                            }
                            switch (alt163) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:536:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84138); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84140);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:537:6: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )?
                                    int alt162=2;
                                    int LA162_0 = input.LA(1);

                                    if ( (LA162_0==DELIMITER2) ) {
                                        alt162=1;
                                    }
                                    switch (alt162) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:537:7: DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84149); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84151);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:538:7: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )?
                                            int alt161=2;
                                            int LA161_0 = input.LA(1);

                                            if ( (LA161_0==DELIMITER2) ) {
                                                alt161=1;
                                            }
                                            switch (alt161) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:538:8: DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )?
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84161); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84163);
                                                    st_non_sized_optionnal(nameElement + ".6");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:8: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )?
                                                    int alt160=2;
                                                    int LA160_0 = input.LA(1);

                                                    if ( (LA160_0==DELIMITER2) ) {
                                                        alt160=1;
                                                    }
                                                    switch (alt160) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:9: DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )?
                                                            {
                                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84174); 

                                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84176);
                                                            st_non_sized_optionnal(nameElement + ".7");

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:540:9: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )?
                                                            int alt159=2;
                                                            int LA159_0 = input.LA(1);

                                                            if ( (LA159_0==DELIMITER2) ) {
                                                                alt159=1;
                                                            }
                                                            switch (alt159) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:540:10: DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"]
                                                                    {
                                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84188); 

                                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84190);
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


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:544:1: spec_sized_mult_lvl2_st_optionnal_3[String nameElement] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final void spec_sized_mult_lvl2_st_optionnal_3(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:546:37: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:547:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34227);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:548:3: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==DELIMITER3) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:548:4: DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34233); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34235);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:4: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==DELIMITER3) ) {
                        alt166=1;
                    }
                    switch (alt166) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:5: DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34242); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34244);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:551:1: spec_sized_mult_lvl2_st_optionnal_6[String nameElement] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? ;
    public final void spec_sized_mult_lvl2_st_optionnal_6(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:553:37: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:554:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64267);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:555:3: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==DELIMITER3) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:555:4: DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64273); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64275);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:556:4: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    int alt171=2;
                    int LA171_0 = input.LA(1);

                    if ( (LA171_0==DELIMITER3) ) {
                        alt171=1;
                    }
                    switch (alt171) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:556:5: DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64282); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64284);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:557:5: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            int alt170=2;
                            int LA170_0 = input.LA(1);

                            if ( (LA170_0==DELIMITER3) ) {
                                alt170=1;
                            }
                            switch (alt170) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:557:6: DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64292); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64294);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:558:6: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    int alt169=2;
                                    int LA169_0 = input.LA(1);

                                    if ( (LA169_0==DELIMITER3) ) {
                                        alt169=1;
                                    }
                                    switch (alt169) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:558:7: DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64303); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64305);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:559:7: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            int alt168=2;
                                            int LA168_0 = input.LA(1);

                                            if ( (LA168_0==DELIMITER3) ) {
                                                alt168=1;
                                            }
                                            switch (alt168) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:559:8: DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64315); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64317);
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

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:561:1: spec_sized_mult_lvl1_nm_optionnal_2[String nameElement, int maxSize] : nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return spec_sized_mult_lvl1_nm_optionnal_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:563:37: ( nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:564:3: nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24346);
            nm_nonsized_optionnal(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_optionnal_24351); 

            pushFollow(FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24353);
            nm_nonsized_optionnal(nameElement + ".2");

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:568:1: spec_sized_mult_lvl1_nm_mandatory_2[String nameElement, int maxSize] : nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return spec_sized_mult_lvl1_nm_mandatory_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:570:37: ( nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:571:3: nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24378);
            nm_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_mandatory_24383); 

            pushFollow(FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24385);
            nm_nonsized_mandatory(nameElement + ".2");

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:575:1: spec_sized_cna[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_cna_return spec_sized_cna(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_cna_return retval = new HPRIMSParser.spec_sized_cna_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:577:37: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:578:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4408);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:579:4: ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==DELIMITER2) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:579:5: DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna4415); 

                    pushFollow(FOLLOW_spec_sized_mult_lvl2_st_optionnal_6_in_spec_sized_cna4417);
                    spec_sized_mult_lvl2_st_optionnal_6(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:580:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==DELIMITER2) ) {
                        alt173=1;
                    }
                    switch (alt173) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:580:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna4425); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4427);
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


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:588:1: spec_sized_8_3[String nameElement, int maxSize] : ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_8_3_return spec_sized_8_3(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_8_3_return retval = new HPRIMSParser.spec_sized_8_3_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:590:37: ( ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:591:3: ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:591:3: ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( ((LA176_0 >= CHARA && LA176_0 <= CHIFFRE9)||(LA176_0 >= LETTRE && LA176_0 <= POINT)) ) {
                alt176=1;
            }
            switch (alt176) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:591:4: st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    pushFollow(FOLLOW_st_sized_mandatory_in_spec_sized_8_34459);
                    st_sized_mandatory(nameElement + ".1", 16);

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:592:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt175=2;
                    int LA175_0 = input.LA(1);

                    if ( (LA175_0==DELIMITER2) ) {
                        alt175=1;
                    }
                    switch (alt175) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:592:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_8_34466); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34468);
                            st_non_sized_optionnal(nameElement + ".2");

                            state._fsp--;


                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_8_34476); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34478);
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


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:604:1: spec_sized_9_3[String nameElement, int maxSize] : st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )? ;
    public final HPRIMSParser.spec_sized_9_3_return spec_sized_9_3(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_9_3_return retval = new HPRIMSParser.spec_sized_9_3_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:606:37: ( st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:608:3: st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )?
            {
            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_9_34518);
            st_sized_optionnal(nameElement + ".1", 12);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:609:3: ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==DELIMITER2) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:609:4: DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10]
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_34524); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_9_34526);
                    st_sized_optionnal(nameElement + ".2", 10);

                    state._fsp--;


                    }
                    break;

            }


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:612:1: spec_non_sized_9_8[String nameElement] : ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )? ;
    public final void spec_non_sized_9_8(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:614:37: ( ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:615:3: ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )?
            {
            pushFollow(FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84551);
            ts_sized_optionnal(nameElement + ".1", 26);

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:616:4: ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==REPETITEUR) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:616:5: REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_spec_non_sized_9_84558); 

                    pushFollow(FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84560);
                    ts_sized_optionnal(nameElement + ".2", 26);

                    state._fsp--;


                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:618:1: spec_sized_9_16[String nameElement, int maxSize] : spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_9_16_return spec_sized_9_16(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_9_16_return retval = new HPRIMSParser.spec_sized_9_16_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:620:37: ( spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:621:3: spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_spec_sized_mult_lvl2_st_optionnal_3_in_spec_sized_9_164581);
            spec_sized_mult_lvl2_st_optionnal_3(nameElement + ".2");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:622:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==DELIMITER2) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:622:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_164587); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164589);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:623:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt179=2;
                    int LA179_0 = input.LA(1);

                    if ( (LA179_0==DELIMITER2) ) {
                        alt179=1;
                    }
                    switch (alt179) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:623:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_164596); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164598);
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


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:626:1: spec_sized_10_4[String my_NameElement, int my_maxsize] : st_nonsized_mandatory[$my_NameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_10_4_return spec_sized_10_4(String my_NameElement, int my_maxsize) throws RecognitionException {
        HPRIMSParser.spec_sized_10_4_return retval = new HPRIMSParser.spec_sized_10_4_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", my_NameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:628:37: ( st_nonsized_mandatory[$my_NameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:629:3: st_nonsized_mandatory[$my_NameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_10_44625);
            st_nonsized_mandatory(my_NameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:630:3: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )? )?
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==DELIMITER2) ) {
                alt185=1;
            }
            switch (alt185) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:630:4: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44631); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44633);
                    st_non_sized_optionnal(my_NameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:631:4: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )?
                    int alt184=2;
                    int LA184_0 = input.LA(1);

                    if ( (LA184_0==DELIMITER2) ) {
                        alt184=1;
                    }
                    switch (alt184) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:631:5: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44640); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44642);
                            st_non_sized_optionnal(my_NameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:632:5: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )?
                            int alt183=2;
                            int LA183_0 = input.LA(1);

                            if ( (LA183_0==DELIMITER2) ) {
                                alt183=1;
                            }
                            switch (alt183) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:632:6: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44650); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44652);
                                    st_non_sized_optionnal(my_NameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:633:6: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )?
                                    int alt182=2;
                                    int LA182_0 = input.LA(1);

                                    if ( (LA182_0==DELIMITER2) ) {
                                        alt182=1;
                                    }
                                    switch (alt182) {
                                        case 1 :
                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:633:7: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44661); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44663);
                                            st_non_sized_optionnal(my_NameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:634:7: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )?
                                            int alt181=2;
                                            int LA181_0 = input.LA(1);

                                            if ( (LA181_0==DELIMITER2) ) {
                                                alt181=1;
                                            }
                                            switch (alt181) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:634:8: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44673); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44675);
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


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:637:1: spec_sized_10_6_tx[String nameElement, int maxSize] : (g= final_spec_10_6_tx )? ;
    public final void spec_sized_10_6_tx(String nameElement, int maxSize) throws RecognitionException {
        String g =null;



          ParserRuleReturnScope retval = new ParserRuleReturnScope();
          retval.start = input.LT(1);
          contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:642:37: ( (g= final_spec_10_6_tx )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:643:3: (g= final_spec_10_6_tx )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:643:4: (g= final_spec_10_6_tx )?
            int alt186=2;
            int LA186_0 = input.LA(1);

            if ( ((LA186_0 >= CHARA && LA186_0 <= CHIFFRE9)||LA186_0==DELIMITER2||(LA186_0 >= LETTRE && LA186_0 <= POINT)) ) {
                alt186=1;
            }
            switch (alt186) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:643:4: g= final_spec_10_6_tx
                    {
                    pushFollow(FOLLOW_final_spec_10_6_tx_in_spec_sized_10_6_tx4710);
                    g=final_spec_10_6_tx();

                    state._fsp--;


                    }
                    break;

            }


            if (g != null)
                matchRegex(g, "^.{0," + maxSize + "}$", retval.start);

            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:647:1: spec_sized_tn[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )? ;
    public final HPRIMSParser.spec_sized_tn_return spec_sized_tn(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_tn_return retval = new HPRIMSParser.spec_sized_tn_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:649:37: ( st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:650:2: st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4732);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:651:3: ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )?
            int alt187=2;
            int LA187_0 = input.LA(1);

            if ( (LA187_0==REPETITEUR) ) {
                alt187=1;
            }
            switch (alt187) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:651:4: REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_spec_sized_tn4738); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4740);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:657:1: st_sized_optionnal[String nameElement, int maxSize] : ( final_st )? ;
    public final HPRIMSParser.st_sized_optionnal_return st_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.st_sized_optionnal_return retval = new HPRIMSParser.st_sized_optionnal_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:659:37: ( ( final_st )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:660:3: ( final_st )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:660:3: ( final_st )?
            int alt188=2;
            int LA188_0 = input.LA(1);

            if ( ((LA188_0 >= CHARA && LA188_0 <= CHIFFRE9)||(LA188_0 >= LETTRE && LA188_0 <= POINT)) ) {
                alt188=1;
            }
            switch (alt188) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:660:3: final_st
                    {
                    pushFollow(FOLLOW_final_st_in_st_sized_optionnal4768);
                    final_st();

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                 matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:664:1: st_sized_mandatory[String nameElement, int maxSize] : final_st ;
    public final HPRIMSParser.st_sized_mandatory_return st_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.st_sized_mandatory_return retval = new HPRIMSParser.st_sized_mandatory_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:666:37: ( final_st )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:667:3: final_st
            {
            pushFollow(FOLLOW_final_st_in_st_sized_mandatory4791);
            final_st();

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:670:1: st_non_sized_optionnal[String nameElement] : ( final_st )? ;
    public final void st_non_sized_optionnal(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:672:37: ( ( final_st )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:673:3: ( final_st )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:673:3: ( final_st )?
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( ((LA189_0 >= CHARA && LA189_0 <= CHIFFRE9)||(LA189_0 >= LETTRE && LA189_0 <= POINT)) ) {
                alt189=1;
            }
            switch (alt189) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:673:3: final_st
                    {
                    pushFollow(FOLLOW_final_st_in_st_non_sized_optionnal4813);
                    final_st();

                    state._fsp--;


                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:675:1: st_nonsized_mandatory[String nameElement] : final_st ;
    public final void st_nonsized_mandatory(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:677:37: ( final_st )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:678:3: final_st
            {
            pushFollow(FOLLOW_final_st_in_st_nonsized_mandatory4832);
            final_st();

            state._fsp--;


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:680:1: nm_sized_optionnal[String nameElement, int maxSize] : ( final_nm )? ;
    public final HPRIMSParser.nm_sized_optionnal_return nm_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_sized_optionnal_return retval = new HPRIMSParser.nm_sized_optionnal_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:682:37: ( ( final_nm )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:683:3: ( final_nm )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:683:3: ( final_nm )?
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( ((LA190_0 >= CHIFFRE0 && LA190_0 <= CHIFFRE9)||(LA190_0 >= MOINS && LA190_0 <= POINT)) ) {
                alt190=1;
            }
            switch (alt190) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:683:3: final_nm
                    {
                    pushFollow(FOLLOW_final_nm_in_nm_sized_optionnal4850);
                    final_nm();

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                 matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:687:1: nm_integer_sized_optionnal[String nameElement, int maxSize] : ( final_nm_integer )? ;
    public final HPRIMSParser.nm_integer_sized_optionnal_return nm_integer_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_integer_sized_optionnal_return retval = new HPRIMSParser.nm_integer_sized_optionnal_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:689:37: ( ( final_nm_integer )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:690:3: ( final_nm_integer )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:690:3: ( final_nm_integer )?
            int alt191=2;
            int LA191_0 = input.LA(1);

            if ( ((LA191_0 >= CHIFFRE0 && LA191_0 <= CHIFFRE9)) ) {
                alt191=1;
            }
            switch (alt191) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:690:3: final_nm_integer
                    {
                    pushFollow(FOLLOW_final_nm_integer_in_nm_integer_sized_optionnal4873);
                    final_nm_integer();

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                 matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:694:1: nm_integer_sized_mandatory[String nameElement, int maxSize] : final_nm_integer ;
    public final HPRIMSParser.nm_integer_sized_mandatory_return nm_integer_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_integer_sized_mandatory_return retval = new HPRIMSParser.nm_integer_sized_mandatory_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:696:37: ( final_nm_integer )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:697:3: final_nm_integer
            {
            pushFollow(FOLLOW_final_nm_integer_in_nm_integer_sized_mandatory4901);
            final_nm_integer();

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:701:1: ts_sized_optionnal[String nameElement, int maxSize] : ( final_ts )? ;
    public final HPRIMSParser.ts_sized_optionnal_return ts_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.ts_sized_optionnal_return retval = new HPRIMSParser.ts_sized_optionnal_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:703:37: ( ( final_ts )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:704:3: ( final_ts )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:704:3: ( final_ts )?
            int alt192=2;
            int LA192_0 = input.LA(1);

            if ( ((LA192_0 >= CHIFFRE0 && LA192_0 <= CHIFFRE9)) ) {
                alt192=1;
            }
            switch (alt192) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:704:3: final_ts
                    {
                    pushFollow(FOLLOW_final_ts_in_ts_sized_optionnal4924);
                    final_ts();

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:708:1: ts_sized_mandatory[String nameElement, int maxSize] : final_ts ;
    public final HPRIMSParser.ts_sized_mandatory_return ts_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.ts_sized_mandatory_return retval = new HPRIMSParser.ts_sized_mandatory_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:710:37: ( final_ts )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:711:3: final_ts
            {
            pushFollow(FOLLOW_final_ts_in_ts_sized_mandatory4947);
            final_ts();

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:714:1: nm_nonsized_mandatory[String nameElement] : final_nm ;
    public final void nm_nonsized_mandatory(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:716:37: ( final_nm )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:717:3: final_nm
            {
            pushFollow(FOLLOW_final_nm_in_nm_nonsized_mandatory4969);
            final_nm();

            state._fsp--;


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:719:1: nm_nonsized_optionnal[String nameElement] : ( final_nm )? ;
    public final void nm_nonsized_optionnal(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:721:37: ( ( final_nm )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:722:3: ( final_nm )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:722:3: ( final_nm )?
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( ((LA193_0 >= CHIFFRE0 && LA193_0 <= CHIFFRE9)||(LA193_0 >= MOINS && LA193_0 <= POINT)) ) {
                alt193=1;
            }
            switch (alt193) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:722:3: final_nm
                    {
                    pushFollow(FOLLOW_final_nm_in_nm_nonsized_optionnal4987);
                    final_nm();

                    state._fsp--;


                    }
                    break;

            }


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:724:1: spec_const_7_13_1_version_2_0[String nameElement] : final_version_2_0 ;
    public final void spec_const_7_13_1_version_2_0(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:726:37: ( final_version_2_0 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:727:3: final_version_2_0
            {
            pushFollow(FOLLOW_final_version_2_0_in_spec_const_7_13_1_version_2_05006);
            final_version_2_0();

            state._fsp--;


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:729:1: spec_const_7_13_1_version_2_1[String nameElement] : final_version_2_1 ;
    public final void spec_const_7_13_1_version_2_1(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:731:37: ( final_version_2_1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:732:3: final_version_2_1
            {
            pushFollow(FOLLOW_final_version_2_1_in_spec_const_7_13_1_version_2_15024);
            final_version_2_1();

            state._fsp--;


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:734:1: spec_const_7_13_1_version_2_2[String nameElement] : final_version_2_2 ;
    public final void spec_const_7_13_1_version_2_2(String nameElement) throws RecognitionException {
        contentHandler.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:736:37: ( final_version_2_2 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:737:3: final_version_2_2
            {
            pushFollow(FOLLOW_final_version_2_2_in_spec_const_7_13_1_version_2_25044);
            final_version_2_2();

            state._fsp--;


            }

            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:741:1: final_spec_10_6_tx returns [String consoText] : g= content_spec_10_6 ;
    public final String final_spec_10_6_tx() throws RecognitionException {
        String consoText = null;


        String g =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:741:46: (g= content_spec_10_6 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:742:3: g= content_spec_10_6
            {
            pushFollow(FOLLOW_content_spec_10_6_in_final_spec_10_6_tx5061);
            g=content_spec_10_6();

            state._fsp--;


            contentHandler.content(g);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:746:1: content_spec_10_6 returns [String consoText] : (r= character | DELIMITER2 ) (p= content_spec_10_6 )? ;
    public final String content_spec_10_6() throws RecognitionException {
        String consoText = null;


        HPRIMSParser.character_return r =null;

        String p =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:746:45: ( (r= character | DELIMITER2 ) (p= content_spec_10_6 )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:747:3: (r= character | DELIMITER2 ) (p= content_spec_10_6 )?
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:747:3: (r= character | DELIMITER2 )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:747:4: r= character
                    {
                    pushFollow(FOLLOW_character_in_content_spec_10_65083);
                    r=character();

                    state._fsp--;


                    consoText = (r!=null?input.toString(r.start,r.stop):null);

                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:747:42: DELIMITER2
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_content_spec_10_65089); 

                    consoText = "\n";

                    }
                    break;

            }


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:748:6: (p= content_spec_10_6 )?
            int alt195=2;
            int LA195_0 = input.LA(1);

            if ( ((LA195_0 >= CHARA && LA195_0 <= CHIFFRE9)||LA195_0==DELIMITER2||(LA195_0 >= LETTRE && LA195_0 <= POINT)) ) {
                alt195=1;
            }
            switch (alt195) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:748:6: p= content_spec_10_6
                    {
                    pushFollow(FOLLOW_content_spec_10_6_in_content_spec_10_65100);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:750:1: final_ts : chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )? ;
    public final HPRIMSParser.final_ts_return final_ts() throws RecognitionException {
        HPRIMSParser.final_ts_return retval = new HPRIMSParser.final_ts_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:750:9: ( chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )? )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:751:3: chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )?
            {
            pushFollow(FOLLOW_chiffre_in_final_ts5112);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5114);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5118);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5120);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5122);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5126);
            chiffre();

            state._fsp--;


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:753:11: ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )?
            int alt198=2;
            int LA198_0 = input.LA(1);

            if ( ((LA198_0 >= CHIFFRE0 && LA198_0 <= CHIFFRE9)) ) {
                alt198=1;
            }
            switch (alt198) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:753:12: chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )?
                    {
                    pushFollow(FOLLOW_chiffre_in_final_ts5129);
                    chiffre();

                    state._fsp--;


                    pushFollow(FOLLOW_chiffre_in_final_ts5131);
                    chiffre();

                    state._fsp--;


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:754:3: ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )?
                    int alt197=2;
                    int LA197_0 = input.LA(1);

                    if ( ((LA197_0 >= CHIFFRE0 && LA197_0 <= CHIFFRE9)) ) {
                        alt197=1;
                    }
                    switch (alt197) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:754:4: chiffre chiffre chiffre chiffre ( chiffre chiffre )?
                            {
                            pushFollow(FOLLOW_chiffre_in_final_ts5136);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5138);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5140);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5144);
                            chiffre();

                            state._fsp--;


                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:755:11: ( chiffre chiffre )?
                            int alt196=2;
                            int LA196_0 = input.LA(1);

                            if ( ((LA196_0 >= CHIFFRE0 && LA196_0 <= CHIFFRE9)) ) {
                                alt196=1;
                            }
                            switch (alt196) {
                                case 1 :
                                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:755:12: chiffre chiffre
                                    {
                                    pushFollow(FOLLOW_chiffre_in_final_ts5147);
                                    chiffre();

                                    state._fsp--;


                                    pushFollow(FOLLOW_chiffre_in_final_ts5149);
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


            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:758:1: final_st : ( character )+ ;
    public final HPRIMSParser.final_st_return final_st() throws RecognitionException {
        HPRIMSParser.final_st_return retval = new HPRIMSParser.final_st_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:758:9: ( ( character )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:759:3: ( character )+
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:759:3: ( character )+
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:759:3: character
            	    {
            	    pushFollow(FOLLOW_character_in_final_st5168);
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


            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:762:1: final_nm : ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) ) ;
    public final HPRIMSParser.final_nm_return final_nm() throws RecognitionException {
        HPRIMSParser.final_nm_return retval = new HPRIMSParser.final_nm_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:762:9: ( ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:763:3: ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:763:3: ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:763:4: ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:763:4: ( PLUS | MOINS )?
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


            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:764:3: ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:764:4: ( ( chiffre )+ ( POINT ( chiffre )* )? )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:764:4: ( ( chiffre )+ ( POINT ( chiffre )* )? )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:764:5: ( chiffre )+ ( POINT ( chiffre )* )?
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:764:5: ( chiffre )+
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
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:764:5: chiffre
                    	    {
                    	    pushFollow(FOLLOW_chiffre_in_final_nm5197);
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


                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:764:14: ( POINT ( chiffre )* )?
                    int alt203=2;
                    int LA203_0 = input.LA(1);

                    if ( (LA203_0==POINT) ) {
                        alt203=1;
                    }
                    switch (alt203) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:764:15: POINT ( chiffre )*
                            {
                            match(input,POINT,FOLLOW_POINT_in_final_nm5201); 

                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:764:21: ( chiffre )*
                            loop202:
                            do {
                                int alt202=2;
                                int LA202_0 = input.LA(1);

                                if ( ((LA202_0 >= CHIFFRE0 && LA202_0 <= CHIFFRE9)) ) {
                                    alt202=1;
                                }


                                switch (alt202) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:764:21: chiffre
                            	    {
                            	    pushFollow(FOLLOW_chiffre_in_final_nm5203);
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:765:4: ( POINT ( chiffre )+ )
                    {
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:765:4: ( POINT ( chiffre )+ )
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:765:5: POINT ( chiffre )+
                    {
                    match(input,POINT,FOLLOW_POINT_in_final_nm5213); 

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:765:11: ( chiffre )+
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
                    	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:765:11: chiffre
                    	    {
                    	    pushFollow(FOLLOW_chiffre_in_final_nm5215);
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


            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:768:1: final_nm_integer : ( chiffre )+ ;
    public final HPRIMSParser.final_nm_integer_return final_nm_integer() throws RecognitionException {
        HPRIMSParser.final_nm_integer_return retval = new HPRIMSParser.final_nm_integer_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:768:17: ( ( chiffre )+ )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:769:3: ( chiffre )+
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:769:3: ( chiffre )+
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
            	    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:769:3: chiffre
            	    {
            	    pushFollow(FOLLOW_chiffre_in_final_nm_integer5232);
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


            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:772:1: final_ORU : CHARO CHARR CHARU ;
    public final HPRIMSParser.final_ORU_return final_ORU() throws RecognitionException {
        HPRIMSParser.final_ORU_return retval = new HPRIMSParser.final_ORU_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:772:10: ( CHARO CHARR CHARU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:772:12: CHARO CHARR CHARU
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_ORU5244); 

            match(input,CHARR,FOLLOW_CHARR_in_final_ORU5246); 

            match(input,CHARU,FOLLOW_CHARU_in_final_ORU5248); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:774:1: final_CART : CHARC CHARA CHARR CHART ;
    public final HPRIMSParser.final_CART_return final_CART() throws RecognitionException {
        HPRIMSParser.final_CART_return retval = new HPRIMSParser.final_CART_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:774:11: ( CHARC CHARA CHARR CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:774:13: CHARC CHARA CHARR CHART
            {
            match(input,CHARC,FOLLOW_CHARC_in_final_CART5257); 

            match(input,CHARA,FOLLOW_CHARA_in_final_CART5259); 

            match(input,CHARR,FOLLOW_CHARR_in_final_CART5261); 

            match(input,CHART,FOLLOW_CHART_in_final_CART5263); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:775:1: final_PORT : CHARP CHARO CHARR CHART ;
    public final HPRIMSParser.final_PORT_return final_PORT() throws RecognitionException {
        HPRIMSParser.final_PORT_return retval = new HPRIMSParser.final_PORT_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:775:11: ( CHARP CHARO CHARR CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:775:13: CHARP CHARO CHARR CHART
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_PORT5271); 

            match(input,CHARO,FOLLOW_CHARO_in_final_PORT5273); 

            match(input,CHARR,FOLLOW_CHARR_in_final_PORT5275); 

            match(input,CHART,FOLLOW_CHART_in_final_PORT5277); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:776:1: final_WHLC : CHARW CHARH CHARL CHARC ;
    public final HPRIMSParser.final_WHLC_return final_WHLC() throws RecognitionException {
        HPRIMSParser.final_WHLC_return retval = new HPRIMSParser.final_WHLC_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:776:11: ( CHARW CHARH CHARL CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:776:13: CHARW CHARH CHARL CHARC
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_WHLC5285); 

            match(input,CHARH,FOLLOW_CHARH_in_final_WHLC5287); 

            match(input,CHARL,FOLLOW_CHARL_in_final_WHLC5289); 

            match(input,CHARC,FOLLOW_CHARC_in_final_WHLC5291); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:777:1: final_WALK : CHARW CHARA CHARL CHARK ;
    public final HPRIMSParser.final_WALK_return final_WALK() throws RecognitionException {
        HPRIMSParser.final_WALK_return retval = new HPRIMSParser.final_WALK_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:777:11: ( CHARW CHARA CHARL CHARK )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:777:13: CHARW CHARA CHARL CHARK
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_WALK5299); 

            match(input,CHARA,FOLLOW_CHARA_in_final_WALK5301); 

            match(input,CHARL,FOLLOW_CHARL_in_final_WALK5303); 

            match(input,CHARK,FOLLOW_CHARK_in_final_WALK5305); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:779:1: final_LL : CHARL CHARL ;
    public final HPRIMSParser.final_LL_return final_LL() throws RecognitionException {
        HPRIMSParser.final_LL_return retval = new HPRIMSParser.final_LL_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:779:9: ( CHARL CHARL )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:779:11: CHARL CHARL
            {
            match(input,CHARL,FOLLOW_CHARL_in_final_LL5314); 

            match(input,CHARL,FOLLOW_CHARL_in_final_LL5316); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:780:1: final_AA : CHARA CHARA ;
    public final HPRIMSParser.final_AA_return final_AA() throws RecognitionException {
        HPRIMSParser.final_AA_return retval = new HPRIMSParser.final_AA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:780:9: ( CHARA CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:780:11: CHARA CHARA
            {
            match(input,CHARA,FOLLOW_CHARA_in_final_AA5324); 

            match(input,CHARA,FOLLOW_CHARA_in_final_AA5326); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:781:1: final_HH : CHARH CHARH ;
    public final HPRIMSParser.final_HH_return final_HH() throws RecognitionException {
        HPRIMSParser.final_HH_return retval = new HPRIMSParser.final_HH_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:781:9: ( CHARH CHARH )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:781:11: CHARH CHARH
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_HH5334); 

            match(input,CHARH,FOLLOW_CHARH_in_final_HH5336); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:782:1: final_MS : CHARM CHARS ;
    public final HPRIMSParser.final_MS_return final_MS() throws RecognitionException {
        HPRIMSParser.final_MS_return retval = new HPRIMSParser.final_MS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:782:9: ( CHARM CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:782:11: CHARM CHARS
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_MS5344); 

            match(input,CHARS,FOLLOW_CHARS_in_final_MS5346); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:783:1: final_VS : CHARV CHARS ;
    public final HPRIMSParser.final_VS_return final_VS() throws RecognitionException {
        HPRIMSParser.final_VS_return retval = new HPRIMSParser.final_VS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:783:9: ( CHARV CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:783:11: CHARV CHARS
            {
            match(input,CHARV,FOLLOW_CHARV_in_final_VS5354); 

            match(input,CHARS,FOLLOW_CHARS_in_final_VS5356); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:784:1: final_Null : CHARN CHARu CHARl CHARl ;
    public final HPRIMSParser.final_Null_return final_Null() throws RecognitionException {
        HPRIMSParser.final_Null_return retval = new HPRIMSParser.final_Null_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:784:11: ( CHARN CHARu CHARl CHARl )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:784:13: CHARN CHARu CHARl CHARl
            {
            match(input,CHARN,FOLLOW_CHARN_in_final_Null5364); 

            match(input,CHARu,FOLLOW_CHARu_in_final_Null5366); 

            match(input,CHARl,FOLLOW_CHARl_in_final_Null5368); 

            match(input,CHARl,FOLLOW_CHARl_in_final_Null5370); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:785:1: final_symbol_inf : CHAR_SYMBOL_INF ;
    public final HPRIMSParser.final_symbol_inf_return final_symbol_inf() throws RecognitionException {
        HPRIMSParser.final_symbol_inf_return retval = new HPRIMSParser.final_symbol_inf_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:785:17: ( CHAR_SYMBOL_INF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:785:19: CHAR_SYMBOL_INF
            {
            match(input,CHAR_SYMBOL_INF,FOLLOW_CHAR_SYMBOL_INF_in_final_symbol_inf5378); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:786:1: final_symbol_sup : CHAR_SYMBOL_SUP ;
    public final HPRIMSParser.final_symbol_sup_return final_symbol_sup() throws RecognitionException {
        HPRIMSParser.final_symbol_sup_return retval = new HPRIMSParser.final_symbol_sup_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:786:17: ( CHAR_SYMBOL_SUP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:786:19: CHAR_SYMBOL_SUP
            {
            match(input,CHAR_SYMBOL_SUP,FOLLOW_CHAR_SYMBOL_SUP_in_final_symbol_sup5386); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:788:1: final_version_2_0 : CHARH CHIFFRE2 POINT CHIFFRE0 ;
    public final HPRIMSParser.final_version_2_0_return final_version_2_0() throws RecognitionException {
        HPRIMSParser.final_version_2_0_return retval = new HPRIMSParser.final_version_2_0_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:788:18: ( CHARH CHIFFRE2 POINT CHIFFRE0 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:788:20: CHARH CHIFFRE2 POINT CHIFFRE0
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_05395); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_05397); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_05399); 

            match(input,CHIFFRE0,FOLLOW_CHIFFRE0_in_final_version_2_05401); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:789:1: final_version_2_1 : CHARH CHIFFRE2 POINT CHIFFRE1 ;
    public final HPRIMSParser.final_version_2_1_return final_version_2_1() throws RecognitionException {
        HPRIMSParser.final_version_2_1_return retval = new HPRIMSParser.final_version_2_1_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:789:18: ( CHARH CHIFFRE2 POINT CHIFFRE1 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:789:20: CHARH CHIFFRE2 POINT CHIFFRE1
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_15409); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_15411); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_15413); 

            match(input,CHIFFRE1,FOLLOW_CHIFFRE1_in_final_version_2_15415); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:790:1: final_version_2_2 : CHARH CHIFFRE2 POINT CHIFFRE2 ;
    public final HPRIMSParser.final_version_2_2_return final_version_2_2() throws RecognitionException {
        HPRIMSParser.final_version_2_2_return retval = new HPRIMSParser.final_version_2_2_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:790:18: ( CHARH CHIFFRE2 POINT CHIFFRE2 )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:790:20: CHARH CHIFFRE2 POINT CHIFFRE2
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_25423); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_25425); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_25427); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_25429); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:792:1: final_OP : CHARO CHARP ;
    public final HPRIMSParser.final_OP_return final_OP() throws RecognitionException {
        HPRIMSParser.final_OP_return retval = new HPRIMSParser.final_OP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:792:9: ( CHARO CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:792:11: CHARO CHARP
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_OP5438); 

            match(input,CHARP,FOLLOW_CHARP_in_final_OP5440); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:793:1: final_IP : CHARI CHARP ;
    public final HPRIMSParser.final_IP_return final_IP() throws RecognitionException {
        HPRIMSParser.final_IP_return retval = new HPRIMSParser.final_IP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:793:9: ( CHARI CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:793:11: CHARI CHARP
            {
            match(input,CHARI,FOLLOW_CHARI_in_final_IP5448); 

            match(input,CHARP,FOLLOW_CHARP_in_final_IP5450); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:794:1: final_ER : CHARE CHARR ;
    public final HPRIMSParser.final_ER_return final_ER() throws RecognitionException {
        HPRIMSParser.final_ER_return retval = new HPRIMSParser.final_ER_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:794:9: ( CHARE CHARR )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:794:11: CHARE CHARR
            {
            match(input,CHARE,FOLLOW_CHARE_in_final_ER5458); 

            match(input,CHARR,FOLLOW_CHARR_in_final_ER5460); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:795:1: final_PA : CHARP CHARA ;
    public final HPRIMSParser.final_PA_return final_PA() throws RecognitionException {
        HPRIMSParser.final_PA_return retval = new HPRIMSParser.final_PA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:795:9: ( CHARP CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:795:11: CHARP CHARA
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_PA5468); 

            match(input,CHARA,FOLLOW_CHARA_in_final_PA5470); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:796:1: final_MP : CHARM CHARP ;
    public final HPRIMSParser.final_MP_return final_MP() throws RecognitionException {
        HPRIMSParser.final_MP_return retval = new HPRIMSParser.final_MP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:796:9: ( CHARM CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:796:11: CHARM CHARP
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_MP5478); 

            match(input,CHARP,FOLLOW_CHARP_in_final_MP5480); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:798:1: final_charA : CHARA ;
    public final HPRIMSParser.final_charA_return final_charA() throws RecognitionException {
        HPRIMSParser.final_charA_return retval = new HPRIMSParser.final_charA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:798:12: ( CHARA )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:798:14: CHARA
            {
            match(input,CHARA,FOLLOW_CHARA_in_final_charA5491); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:799:1: final_charB : CHARB ;
    public final HPRIMSParser.final_charB_return final_charB() throws RecognitionException {
        HPRIMSParser.final_charB_return retval = new HPRIMSParser.final_charB_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:799:12: ( CHARB )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:799:14: CHARB
            {
            match(input,CHARB,FOLLOW_CHARB_in_final_charB5499); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:800:1: final_charC : CHARC ;
    public final HPRIMSParser.final_charC_return final_charC() throws RecognitionException {
        HPRIMSParser.final_charC_return retval = new HPRIMSParser.final_charC_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:800:12: ( CHARC )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:800:14: CHARC
            {
            match(input,CHARC,FOLLOW_CHARC_in_final_charC5507); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:801:1: final_charD : CHARD ;
    public final HPRIMSParser.final_charD_return final_charD() throws RecognitionException {
        HPRIMSParser.final_charD_return retval = new HPRIMSParser.final_charD_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:801:12: ( CHARD )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:801:14: CHARD
            {
            match(input,CHARD,FOLLOW_CHARD_in_final_charD5515); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:802:1: final_charF : CHARF ;
    public final HPRIMSParser.final_charF_return final_charF() throws RecognitionException {
        HPRIMSParser.final_charF_return retval = new HPRIMSParser.final_charF_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:802:12: ( CHARF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:802:14: CHARF
            {
            match(input,CHARF,FOLLOW_CHARF_in_final_charF5523); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:803:1: final_charH : CHARH ;
    public final HPRIMSParser.final_charH_return final_charH() throws RecognitionException {
        HPRIMSParser.final_charH_return retval = new HPRIMSParser.final_charH_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:803:12: ( CHARH )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:803:14: CHARH
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_charH5531); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:804:1: final_charI : CHARI ;
    public final HPRIMSParser.final_charI_return final_charI() throws RecognitionException {
        HPRIMSParser.final_charI_return retval = new HPRIMSParser.final_charI_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:804:12: ( CHARI )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:804:14: CHARI
            {
            match(input,CHARI,FOLLOW_CHARI_in_final_charI5539); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:805:1: final_charL : CHARL ;
    public final HPRIMSParser.final_charL_return final_charL() throws RecognitionException {
        HPRIMSParser.final_charL_return retval = new HPRIMSParser.final_charL_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:805:12: ( CHARL )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:805:14: CHARL
            {
            match(input,CHARL,FOLLOW_CHARL_in_final_charL5547); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:806:1: final_charM : CHARM ;
    public final HPRIMSParser.final_charM_return final_charM() throws RecognitionException {
        HPRIMSParser.final_charM_return retval = new HPRIMSParser.final_charM_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:806:12: ( CHARM )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:806:14: CHARM
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_charM5555); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:807:1: final_charN : CHARN ;
    public final HPRIMSParser.final_charN_return final_charN() throws RecognitionException {
        HPRIMSParser.final_charN_return retval = new HPRIMSParser.final_charN_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:807:12: ( CHARN )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:807:14: CHARN
            {
            match(input,CHARN,FOLLOW_CHARN_in_final_charN5563); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:808:1: final_charO : CHARO ;
    public final HPRIMSParser.final_charO_return final_charO() throws RecognitionException {
        HPRIMSParser.final_charO_return retval = new HPRIMSParser.final_charO_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:808:12: ( CHARO )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:808:14: CHARO
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_charO5571); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:809:1: final_charP : CHARP ;
    public final HPRIMSParser.final_charP_return final_charP() throws RecognitionException {
        HPRIMSParser.final_charP_return retval = new HPRIMSParser.final_charP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:809:12: ( CHARP )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:809:14: CHARP
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_charP5579); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:810:1: final_charR : CHARR ;
    public final HPRIMSParser.final_charR_return final_charR() throws RecognitionException {
        HPRIMSParser.final_charR_return retval = new HPRIMSParser.final_charR_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:810:12: ( CHARR )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:810:14: CHARR
            {
            match(input,CHARR,FOLLOW_CHARR_in_final_charR5587); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:811:1: final_charS : CHARS ;
    public final HPRIMSParser.final_charS_return final_charS() throws RecognitionException {
        HPRIMSParser.final_charS_return retval = new HPRIMSParser.final_charS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:811:12: ( CHARS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:811:14: CHARS
            {
            match(input,CHARS,FOLLOW_CHARS_in_final_charS5595); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:1: final_charT : CHART ;
    public final HPRIMSParser.final_charT_return final_charT() throws RecognitionException {
        HPRIMSParser.final_charT_return retval = new HPRIMSParser.final_charT_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:12: ( CHART )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:812:14: CHART
            {
            match(input,CHART,FOLLOW_CHART_in_final_charT5603); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:813:1: final_charU : CHARU ;
    public final HPRIMSParser.final_charU_return final_charU() throws RecognitionException {
        HPRIMSParser.final_charU_return retval = new HPRIMSParser.final_charU_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:813:12: ( CHARU )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:813:14: CHARU
            {
            match(input,CHARU,FOLLOW_CHARU_in_final_charU5611); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:814:1: final_charW : CHARW ;
    public final HPRIMSParser.final_charW_return final_charW() throws RecognitionException {
        HPRIMSParser.final_charW_return retval = new HPRIMSParser.final_charW_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:814:12: ( CHARW )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:814:14: CHARW
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_charW5619); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:1: final_charX : CHARX ;
    public final HPRIMSParser.final_charX_return final_charX() throws RecognitionException {
        HPRIMSParser.final_charX_return retval = new HPRIMSParser.final_charX_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:12: ( CHARX )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:14: CHARX
            {
            match(input,CHARX,FOLLOW_CHARX_in_final_charX5627); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:818:1: delimiters : DELIMITERS ;
    public final HPRIMSParser.delimiters_return delimiters() throws RecognitionException {
        HPRIMSParser.delimiters_return retval = new HPRIMSParser.delimiters_return();
        retval.start = input.LT(1);


        contentHandler.startElement("champ", "delimiteurs");
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:820:37: ( DELIMITERS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:821:3: DELIMITERS
            {
            match(input,DELIMITERS,FOLLOW_DELIMITERS_in_delimiters5648); 

            contentHandler.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            contentHandler.endElement();
        }
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:826:1: character : ( lettre | chiffre ) ;
    public final HPRIMSParser.character_return character() throws RecognitionException {
        HPRIMSParser.character_return retval = new HPRIMSParser.character_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:826:10: ( ( lettre | chiffre ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:827:3: ( lettre | chiffre )
            {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:827:3: ( lettre | chiffre )
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
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:827:4: lettre
                    {
                    pushFollow(FOLLOW_lettre_in_character5664);
                    lettre();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:827:13: chiffre
                    {
                    pushFollow(FOLLOW_chiffre_in_character5668);
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:829:1: chiffre : ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 ) ;
    public final void chiffre() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:829:8: ( ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 ) )
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
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:833:1: lettre : ~ ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 | CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR ) ;
    public final void lettre() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:833:7: (~ ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 | CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR ) )
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
            return "104:1: hprim : ( hprim_oru_2_2 | hprim_oru_2_1 );";
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
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1556 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1567 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1569 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1582 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1584 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1598 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_p2_1600 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1639 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p2_1641 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1645 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p2_1647 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1665 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1667 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1684 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1686 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1719 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_p2_1721 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1756 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_p2_1758 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1778 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1780 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1784 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1786 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1809 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1811 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1815 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1817 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1841 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1843 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1866 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1868 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1892 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1894 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1919 = new BitSet(new long[]{0x000202FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_1921 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1925 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_1927 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1955 = new BitSet(new long[]{0x0000020000069100L});
    public static final BitSet FOLLOW_spec_const_8_25_in_line_p2_1957 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1984 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_8_in_line_p2_1986 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11039 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11041 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11070 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11126 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11128 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11187 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11189 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11221 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11223 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11286 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11288 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11322 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_11324 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11359 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_11361 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_obr2_1_in_line_obr2_21467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obr2_11484 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_line_obr2_11486 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_line_obr2_11488 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_line_obr2_11490 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11494 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_obr2_11496 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11501 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_9_3_in_line_obr2_11503 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11508 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11510 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11515 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11517 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11521 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11523 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11533 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11535 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11539 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11541 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11548 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11550 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11555 = new BitSet(new long[]{0x000200FFC0000000L});
    public static final BitSet FOLLOW_spec_non_sized_9_8_in_line_obr2_11557 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11562 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11564 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11572 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11574 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11579 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_11581 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11589 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11591 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11600 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11602 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11609 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11611 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11619 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11621 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11630 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_9_16_in_line_obr2_11632 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11642 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11644 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11655 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_obr2_11657 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11669 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11671 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11684 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11686 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11700 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11702 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11717 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11719 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11735 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11737 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11754 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11772 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11774 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11793 = new BitSet(new long[]{0x00000200020E92C0L});
    public static final BitSet FOLLOW_spec_const_9_26_in_line_obr2_11795 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11815 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11835 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11856 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_11858 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11862 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_11864 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11889 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_4_in_line_obr2_11891 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11915 = new BitSet(new long[]{0x0000020001040040L});
    public static final BitSet FOLLOW_spec_const_9_31_in_line_obr2_11917 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11964 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11966 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11970 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11972 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12000 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12002 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12029 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12031 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12059 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12061 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12090 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12092 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12122 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_12124 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obx2_12223 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_line_obx2_12225 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_line_obx2_12227 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CHARX_in_line_obx2_12229 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12233 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_obx2_12235 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12240 = new BitSet(new long[]{0x00000000003506D0L});
    public static final BitSet FOLLOW_spec_const_10_3_nm_in_line_obx2_12248 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12257 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12259 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12269 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12271 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12282 = new BitSet(new long[]{0x0003C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2_12284 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12288 = new BitSet(new long[]{0x0003C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2_12290 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_ce_in_line_obx2_12320 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12329 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12331 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12341 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12343 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12354 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12356 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12360 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12362 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_fic_in_line_obx2_12392 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12401 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12403 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12413 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12415 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12426 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12428 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12432 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12434 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_st_in_line_obx2_12464 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12473 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12475 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12485 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12487 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12498 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12500 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12504 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12506 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_gc_in_line_obx2_12536 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12545 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12547 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12557 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12559 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12570 = new BitSet(new long[]{0x0001C4FFC0000000L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12572 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12576 = new BitSet(new long[]{0x0001C4FFC0000000L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12578 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_tx_in_line_obx2_12608 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12617 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12619 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12629 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12631 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12642 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12644 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12648 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12650 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_std_in_line_obx2_12680 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12689 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12691 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12701 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12703 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12714 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12716 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12720 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12722 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62756 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62758 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62767 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62769 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_62773 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62775 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62787 = new BitSet(new long[]{0x000202000DD9D8B0L});
    public static final BitSet FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62789 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_62793 = new BitSet(new long[]{0x000202000DD9D8B0L});
    public static final BitSet FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62795 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62808 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2_1_post10_62810 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62822 = new BitSet(new long[]{0x0002020000190010L});
    public static final BitSet FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62824 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_62828 = new BitSet(new long[]{0x0002020000190010L});
    public static final BitSet FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62830 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62845 = new BitSet(new long[]{0x00000200024C12C0L});
    public static final BitSet FOLLOW_spec_const_10_12_in_line_obx2_1_post10_62847 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62862 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62864 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62880 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62882 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62898 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62900 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62917 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obx2_1_post10_62919 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62937 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62939 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_c2_12981 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_line_c2_12983 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_12987 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_c2_12989 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_12994 = new BitSet(new long[]{0x0000020000044000L});
    public static final BitSet FOLLOW_spec_const_12_3_in_line_c2_12996 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_13001 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_c2_13003 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_c2_13007 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_c2_13009 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_13018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_l2_13036 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_line_l2_13038 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13043 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l2_13045 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13052 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13059 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l2_13061 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13070 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l2_13072 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13082 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_l2_13084 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charM_in_spec_const_sexe3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_sexe3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_sexe3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_0_in_spec_const_7_13_version_2_03153 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_03156 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_03158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_1_in_spec_const_7_13_version_2_13179 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_13182 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_13184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_2_in_spec_const_7_13_version_2_23203 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_23206 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_23208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_7_13_23227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_7_13_23231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_7_13_23235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ORU_in_spec_const_7_7_contexte3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_7_123272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_7_123276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charT_in_spec_const_7_123280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_PORT_in_spec_const_9_313300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_CART_in_spec_const_9_313304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_WHLC_in_spec_const_9_313308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_WALK_in_spec_const_9_313312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_OP_in_spec_const_8_253333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_IP_in_spec_const_8_253337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ER_in_spec_const_8_253341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_PA_in_spec_const_8_253345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_MP_in_spec_const_8_253349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_9_263370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_9_263374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charM_in_spec_const_9_263378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_9_263382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_9_263386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_9_263390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charO_in_spec_const_9_263394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_9_263400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charX_in_spec_const_9_263404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_nm3425 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CHARM_in_spec_const_10_3_nm3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_ce3448 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CHARE_in_spec_const_10_3_ce3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARS_in_spec_const_10_3_st3471 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_st3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_gc3494 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_gc3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_tx3518 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CHARX_in_spec_const_10_3_tx3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARF_in_spec_const_10_3_fic3541 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CHARI_in_spec_const_10_3_fic3543 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_fic3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_spec_const_10_3_std3567 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CHARD_in_spec_const_10_3_std3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_std3575 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CHARK_in_spec_const_10_3_std3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_std3583 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_spec_const_10_3_std3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARD_in_spec_const_10_3_std3593 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_std3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_spec_const_10_3_std3603 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_std3611 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_std3621 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_spec_const_10_3_std3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_std3629 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_63654 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_63660 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_63662 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_63669 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_63671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_10_93699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charH_in_spec_const_10_93703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_LL_in_spec_const_10_93707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_HH_in_spec_const_10_93711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_symbol_inf_in_spec_const_10_93715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_symbol_sup_in_spec_const_10_93719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charN_in_spec_const_10_93725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charA_in_spec_const_10_93729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_AA_in_spec_const_10_93733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_Null_in_spec_const_10_93737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_10_93741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_10_93745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charB_in_spec_const_10_93749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charW_in_spec_const_10_93755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_93759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_10_93763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charS_in_spec_const_10_93767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_MS_in_spec_const_10_93771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_VS_in_spec_const_10_93775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charA_in_spec_const_10_113796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charS_in_spec_const_10_113800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_113804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charN_in_spec_const_10_113808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_123829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_10_123833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_10_123837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_10_123841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_10_123845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_10_123849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charX_in_spec_const_10_123856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_10_123860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_12_33881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_12_33885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_23905 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_23911 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_23913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_23936 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_23942 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_23944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_43969 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_43975 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_43977 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_43984 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_43986 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_43994 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_43996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64025 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64032 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64034 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64042 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64044 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64053 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64055 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64065 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64067 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64078 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84113 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84119 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84121 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84128 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84130 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84138 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84140 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84149 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84151 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84161 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84163 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84174 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84176 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84188 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34227 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34233 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34235 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34242 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64267 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64273 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64275 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64282 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64284 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64292 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64294 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64303 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64305 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64315 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24346 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_optionnal_24351 = new BitSet(new long[]{0x0001C0FFC0000000L});
    public static final BitSet FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24378 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_mandatory_24383 = new BitSet(new long[]{0x0001C0FFC0000000L});
    public static final BitSet FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4408 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna4415 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl2_st_optionnal_6_in_spec_sized_cna4417 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna4425 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_mandatory_in_spec_sized_8_34459 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_8_34466 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34468 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_8_34476 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_9_34518 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_34524 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_9_34526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84551 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_spec_non_sized_9_84558 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl2_st_optionnal_3_in_spec_sized_9_164581 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_164587 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164589 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_164596 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_10_44625 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44631 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44633 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44640 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44642 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44650 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44652 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44661 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44663 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44673 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_spec_10_6_tx_in_spec_sized_10_6_tx4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4732 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_spec_sized_tn4738 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_sized_optionnal4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_sized_mandatory4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_non_sized_optionnal4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_nonsized_mandatory4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_sized_optionnal4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_integer_in_nm_integer_sized_optionnal4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_integer_in_nm_integer_sized_mandatory4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ts_in_ts_sized_optionnal4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ts_in_ts_sized_mandatory4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_nonsized_mandatory4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_nonsized_optionnal4987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_0_in_spec_const_7_13_1_version_2_05006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_1_in_spec_const_7_13_1_version_2_15024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_2_in_spec_const_7_13_1_version_2_25044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_content_spec_10_6_in_final_spec_10_6_tx5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_in_content_spec_10_65083 = new BitSet(new long[]{0x0001E4FFFFFFFFF2L});
    public static final BitSet FOLLOW_DELIMITER2_in_content_spec_10_65089 = new BitSet(new long[]{0x0001E4FFFFFFFFF2L});
    public static final BitSet FOLLOW_content_spec_10_6_in_content_spec_10_65100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5112 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5114 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5118 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5120 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5122 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5126 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5129 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5131 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5136 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5138 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5140 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5144 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5147 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_in_final_st5168 = new BitSet(new long[]{0x0001E0FFFFFFFFF2L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5197 = new BitSet(new long[]{0x000100FFC0000002L});
    public static final BitSet FOLLOW_POINT_in_final_nm5201 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5203 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_POINT_in_final_nm5213 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5215 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_nm_integer5232 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_CHARO_in_final_ORU5244 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_ORU5246 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CHARU_in_final_ORU5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_final_CART5257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_CART5259 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_CART5261 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_final_CART5263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_PORT5271 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_final_PORT5273 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_PORT5275 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_final_PORT5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_WHLC5285 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CHARH_in_final_WHLC5287 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_WHLC5289 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_final_WHLC5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_WALK5299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_WALK5301 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_WALK5303 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CHARK_in_final_WALK5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARL_in_final_LL5314 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_LL5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_final_AA5324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_AA5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_HH5334 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CHARH_in_final_HH5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_MS5344 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CHARS_in_final_MS5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARV_in_final_VS5354 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CHARS_in_final_VS5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_final_Null5364 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CHARu_in_final_Null5366 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CHARl_in_final_Null5368 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CHARl_in_final_Null5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_SYMBOL_INF_in_final_symbol_inf5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_SYMBOL_SUP_in_final_symbol_sup5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_05395 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_05397 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_05399 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_CHIFFRE0_in_final_version_2_05401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_15409 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_15411 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_15413 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_CHIFFRE1_in_final_version_2_15415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_25423 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_25425 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_25427 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_25429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_OP5438 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_OP5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARI_in_final_IP5448 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_IP5450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARE_in_final_ER5458 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_ER5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_PA5468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_PA5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_MP5478 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_MP5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_final_charA5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARB_in_final_charB5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_final_charC5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARD_in_final_charD5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARF_in_final_charF5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_charH5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARI_in_final_charI5539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARL_in_final_charL5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_charM5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_final_charN5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_charO5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_charP5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARR_in_final_charR5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARS_in_final_charS5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_final_charT5603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARU_in_final_charU5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_charW5619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARX_in_final_charX5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITERS_in_delimiters5648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lettre_in_character5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chiffre_in_character5668 = new BitSet(new long[]{0x0000000000000002L});

}