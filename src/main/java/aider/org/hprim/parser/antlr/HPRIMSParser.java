// $ANTLR 3.4 C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g 2013-02-12 13:16:54

package aider.org.hprim.parser.antlr;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import aider.org.hprim.parser.HPRIMSCollecteur;
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
    public String getGrammarFileName() { return "C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g"; }



      /**
       * Collecteur utilisé dans cette classe
       */
      public HPRIMSCollecteur collecteur;
      
      /**
       * Etat de succès ou d'échec dimport du fichier
       */
      private boolean stateSuccess = true;

      /**
       * Stocke la liste des erreurs
       */
      private ArrayList<String> errors = new ArrayList<String>();

      /**
       * Logger de la classe
       */
      //@SuppressWarnings("unused")
      private static final Logger logger = Logger.getLogger(HPRIMSParser.class.getCanonicalName());

      /**
       * Constructeur
       * @param lexer
       * @param my_col
       */
      public HPRIMSParser(TokenStream input, HPRIMSCollecteur collecteur) {
        this(input);
        this.collecteur = collecteur;
      }

      /**
       * Retourne la liste des erreurs de la liste de parsing
       * @return
       */
      public ArrayList<String> getErrors() {
        return errors;
      }
      
      /**
       * Formate une erreur sous forme de chaine de caract�res
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
       * La reconnaissance d'une erreur dans le parser ajoute cette erreur dans la liste des erreurs
       * @param tokenNames
       * @param e
       */
      public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
        String msg = formatError(e);
        errors.add(msg);
        setStateSuccess(false);
      }
      
        /**
         * Définit si le parsing a été un succès ou non
         * @param stateSuccess
         */
        public void setStateSuccess(boolean stateSuccess) {
          this.stateSuccess = stateSuccess;
        }
          
        /**
         * Renvoie si le parsing a �t� un succ�s ou non
         * @return 
         */
        public boolean getStateSuccess() {
          return this.stateSuccess;
        }
     
        /**
         * R�alise un regexp
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




    // $ANTLR start "hprim_2_2"
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:144:1: hprim_2_2 : line_h2_2 ( body_p2_1 )* line_l2_1 ( CR )? EOF ;
    public final void hprim_2_2() throws RecognitionException {
        collecteur.startElement("message", "hprim_2_2");
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:146:33: ( line_h2_2 ( body_p2_1 )* line_l2_1 ( CR )? EOF )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:147:3: line_h2_2 ( body_p2_1 )* line_l2_1 ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_2_in_hprim_2_272);
            line_h2_2();

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:148:3: ( body_p2_1 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CR) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==CHARP) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:148:3: body_p2_1
            	    {
            	    pushFollow(FOLLOW_body_p2_1_in_hprim_2_276);
            	    body_p2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            pushFollow(FOLLOW_line_l2_1_in_hprim_2_281);
            line_l2_1();

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:150:3: ( CR )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CR) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:150:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_2_285); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_2_290); 

            }

            collecteur.endElement();
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "hprim_2_2"



    // $ANTLR start "hprim_2_1"
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:153:1: hprim_2_1 : line_h2_1 ( body_p2_1 )* line_l2_1 ( CR )? EOF ;
    public final void hprim_2_1() throws RecognitionException {
        collecteur.startElement("message", "hprim_2_1");
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:155:33: ( line_h2_1 ( body_p2_1 )* line_l2_1 ( CR )? EOF )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:156:3: line_h2_1 ( body_p2_1 )* line_l2_1 ( CR )? EOF
            {
            pushFollow(FOLLOW_line_h2_1_in_hprim_2_1107);
            line_h2_1();

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:157:3: ( body_p2_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==CR) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==CHARP) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:157:3: body_p2_1
            	    {
            	    pushFollow(FOLLOW_body_p2_1_in_hprim_2_1111);
            	    body_p2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            pushFollow(FOLLOW_line_l2_1_in_hprim_2_1116);
            line_l2_1();

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:159:3: ( CR )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CR) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:159:3: CR
                    {
                    match(input,CR,FOLLOW_CR_in_hprim_2_1120); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_hprim_2_1125); 

            }

            collecteur.endElement();
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "hprim_2_1"



    // $ANTLR start "body_p2_1"
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:162:1: body_p2_1 : line_p2_1 ( line_c2_1 )* ( body_obr2_1 )+ ;
    public final void body_p2_1() throws RecognitionException {
        collecteur.startElement("body", "P");
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:164:33: ( line_p2_1 ( line_c2_1 )* ( body_obr2_1 )+ )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:165:3: line_p2_1 ( line_c2_1 )* ( body_obr2_1 )+
            {
            pushFollow(FOLLOW_line_p2_1_in_body_p2_1142);
            line_p2_1();

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:165:13: ( line_c2_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==CR) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==CHARC) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:165:14: line_c2_1
            	    {
            	    pushFollow(FOLLOW_line_c2_1_in_body_p2_1145);
            	    line_c2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:166:4: ( body_obr2_1 )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==CR) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==CHARO) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:166:4: body_obr2_1
            	    {
            	    pushFollow(FOLLOW_body_obr2_1_in_body_p2_1152);
            	    body_obr2_1();

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


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:168:1: body_obr2_1 : line_obr2_1 ( line_c2_1 )* ( body_obx2_1 )+ ;
    public final void body_obr2_1() throws RecognitionException {
        collecteur.startElement("body", "OBR");
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:170:33: ( line_obr2_1 ( line_c2_1 )* ( body_obx2_1 )+ )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:171:4: line_obr2_1 ( line_c2_1 )* ( body_obx2_1 )+
            {
            pushFollow(FOLLOW_line_obr2_1_in_body_obr2_1171);
            line_obr2_1();

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:171:16: ( line_c2_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==CR) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==CHARC) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:171:17: line_c2_1
            	    {
            	    pushFollow(FOLLOW_line_c2_1_in_body_obr2_1174);
            	    line_c2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:172:5: ( body_obx2_1 )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==CR) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==CHARO) ) {
                        int LA8_3 = input.LA(3);

                        if ( (LA8_3==CHARB) ) {
                            int LA8_4 = input.LA(4);

                            if ( (LA8_4==CHARX) ) {
                                alt8=1;
                            }


                        }


                    }


                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:172:5: body_obx2_1
            	    {
            	    pushFollow(FOLLOW_body_obx2_1_in_body_obr2_1182);
            	    body_obx2_1();

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


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:174:1: body_obx2_1 : line_obx2_1 ( line_c2_1 )* ;
    public final void body_obx2_1() throws RecognitionException {
        collecteur.startElement("body", "OBX");
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:176:33: ( line_obx2_1 ( line_c2_1 )* )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:177:4: line_obx2_1 ( line_c2_1 )*
            {
            pushFollow(FOLLOW_line_obx2_1_in_body_obx2_1201);
            line_obx2_1();

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:177:16: ( line_c2_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==CR) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==CHARC) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:177:17: line_c2_1
            	    {
            	    pushFollow(FOLLOW_line_c2_1_in_body_obx2_1204);
            	    line_c2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:182:1: line_h2_2 : delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 spec_const_7_13_version_2_2[\"H_7.13\"] DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_2() throws RecognitionException {
        collecteur.startElement("ligne", "H");
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:184:33: ( delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 spec_const_7_13_version_2_2[\"H_7.13\"] DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:185:3: delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 spec_const_7_13_version_2_2[\"H_7.13\"] DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_delimiters_in_line_h2_2226);
            delimiters();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2230); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_2232);
            st_sized_optionnal("H_7.3", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2237); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_2239);
            st_sized_optionnal("H_7.4", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2244); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_2246);
            spec_sized_mult_lvl1_st_mandatory_2("H_7.5", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2251); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_2253);
            spec_sized_mult_lvl1_st_optionnal_6("H_7.6", 100);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2258); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_in_line_h2_2260);
            spec_const_7_7_contexte("H_7.7");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2265); 

            pushFollow(FOLLOW_spec_sized_tn_in_line_h2_2267);
            spec_sized_tn("H_7.8", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2272); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_2274);
            st_sized_optionnal("H_7.9", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2279); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_2281);
            spec_sized_mult_lvl1_st_mandatory_2("H_7.10", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2286); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_2288);
            st_sized_optionnal("H_7.11", 80);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2293); 

            pushFollow(FOLLOW_spec_const_7_12_in_line_h2_2295);
            spec_const_7_12("H_7.12");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2300); 

            pushFollow(FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2302);
            spec_const_7_13_version_2_2("H_7.13");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2307); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_2309);
            ts_sized_mandatory("H_7.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:198:3: ( DELIMITER1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DELIMITER1) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:198:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_2314); 

                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:202:1: line_h2_1 : delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 ( spec_const_7_13_version_2_0[\"H_7.13\"] | spec_const_7_13_version_2_1[\"H_7.13\"] | spec_const_7_13_version_2_2[\"H_7.13\"] ) DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )? ;
    public final void line_h2_1() throws RecognitionException {
        collecteur.startElement("ligne", "H");
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:204:33: ( delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 ( spec_const_7_13_version_2_0[\"H_7.13\"] | spec_const_7_13_version_2_1[\"H_7.13\"] | spec_const_7_13_version_2_2[\"H_7.13\"] ) DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:205:3: delimiters DELIMITER1 st_sized_optionnal[\"H_7.3\", 12] DELIMITER1 st_sized_optionnal[\"H_7.4\", 12] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.5\", 40] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"H_7.6\", 100] DELIMITER1 spec_const_7_7_contexte[\"H_7.7\"] DELIMITER1 spec_sized_tn[\"H_7.8\", 40] DELIMITER1 st_sized_optionnal[\"H_7.9\", 40] DELIMITER1 spec_sized_mult_lvl1_st_mandatory_2[\"H_7.10\", 40] DELIMITER1 st_sized_optionnal[\"H_7.11\", 80] DELIMITER1 spec_const_7_12[\"H_7.12\"] DELIMITER1 ( spec_const_7_13_version_2_0[\"H_7.13\"] | spec_const_7_13_version_2_1[\"H_7.13\"] | spec_const_7_13_version_2_2[\"H_7.13\"] ) DELIMITER1 ts_sized_mandatory[\"H_7.14\", 26] ( DELIMITER1 )?
            {
            pushFollow(FOLLOW_delimiters_in_line_h2_1334);
            delimiters();

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1338); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_1340);
            st_sized_optionnal("H_7.3", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1345); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_1347);
            st_sized_optionnal("H_7.4", 12);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1352); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_1354);
            spec_sized_mult_lvl1_st_mandatory_2("H_7.5", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1359); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_1361);
            spec_sized_mult_lvl1_st_optionnal_6("H_7.6", 100);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1366); 

            pushFollow(FOLLOW_spec_const_7_7_contexte_in_line_h2_1368);
            spec_const_7_7_contexte("H_7.7");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1373); 

            pushFollow(FOLLOW_spec_sized_tn_in_line_h2_1375);
            spec_sized_tn("H_7.8", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1380); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_1382);
            st_sized_optionnal("H_7.9", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1387); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_1389);
            spec_sized_mult_lvl1_st_mandatory_2("H_7.10", 40);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1394); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_h2_1396);
            st_sized_optionnal("H_7.11", 80);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1401); 

            pushFollow(FOLLOW_spec_const_7_12_in_line_h2_1403);
            spec_const_7_12("H_7.12");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1411); 

            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:217:14: ( spec_const_7_13_version_2_0[\"H_7.13\"] | spec_const_7_13_version_2_1[\"H_7.13\"] | spec_const_7_13_version_2_2[\"H_7.13\"] )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==CHARH) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==CHIFFRE2) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==POINT) ) {
                        switch ( input.LA(4) ) {
                        case CHIFFRE0:
                            {
                            alt11=1;
                            }
                            break;
                        case CHIFFRE1:
                            {
                            alt11=2;
                            }
                            break;
                        case CHIFFRE2:
                            {
                            alt11=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 3, input);

                            throw nvae;

                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:217:15: spec_const_7_13_version_2_0[\"H_7.13\"]
                    {
                    pushFollow(FOLLOW_spec_const_7_13_version_2_0_in_line_h2_1414);
                    spec_const_7_13_version_2_0("H_7.13");

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:217:55: spec_const_7_13_version_2_1[\"H_7.13\"]
                    {
                    pushFollow(FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1419);
                    spec_const_7_13_version_2_1("H_7.13");

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:217:95: spec_const_7_13_version_2_2[\"H_7.13\"]
                    {
                    pushFollow(FOLLOW_spec_const_7_13_version_2_2_in_line_h2_1424);
                    spec_const_7_13_version_2_2("H_7.13");

                    state._fsp--;


                    }
                    break;

            }


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1430); 

            pushFollow(FOLLOW_ts_sized_mandatory_in_line_h2_1432);
            ts_sized_mandatory("H_7.14", 26);

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:219:3: ( DELIMITER1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==DELIMITER1) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:219:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_h2_1437); 

                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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



    // $ANTLR start "line_p2_1"
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:221:1: line_p2_1 : CR CHARP DELIMITER1 nm_integer_sized_optionnal[\"P_8.2\", 4] DELIMITER1 spec_sized_8_3[\"P_8.3\", 36] DELIMITER1 st_sized_optionnal[\"P_8.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_p2_1() throws RecognitionException {
        collecteur.startElement("ligne", "P");
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:223:33: ( CR CHARP DELIMITER1 nm_integer_sized_optionnal[\"P_8.2\", 4] DELIMITER1 spec_sized_8_3[\"P_8.3\", 36] DELIMITER1 st_sized_optionnal[\"P_8.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:224:3: CR CHARP DELIMITER1 nm_integer_sized_optionnal[\"P_8.2\", 4] DELIMITER1 spec_sized_8_3[\"P_8.3\", 36] DELIMITER1 st_sized_optionnal[\"P_8.4\", 16] ( DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_p2_1455); 

            match(input,CHARP,FOLLOW_CHARP_in_line_p2_1457); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1461); 

            pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_p2_1463);
            nm_integer_sized_optionnal("P_8.2", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1468); 

            pushFollow(FOLLOW_spec_sized_8_3_in_line_p2_1470);
            spec_sized_8_3("P_8.3", 36);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1475); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1477);
            st_sized_optionnal("P_8.4", 16);

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:228:3: ( DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==DELIMITER1) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:228:4: DELIMITER1 st_sized_optionnal[\"P_8.5\", 16] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1483); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1485);
                    st_sized_optionnal("P_8.5", 16);

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:229:4: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==DELIMITER1) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:229:5: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.6\", 48] ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1492); 

                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1494);
                            spec_sized_mult_lvl1_st_optionnal_6("P_8.6", 48);

                            state._fsp--;


                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:230:5: ( DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==DELIMITER1) ) {
                                alt45=1;
                            }
                            switch (alt45) {
                                case 1 :
                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:230:6: DELIMITER1 st_sized_optionnal[\"P_8.7\", 24] ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1502); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1504);
                                    st_sized_optionnal("P_8.7", 24);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:231:6: ( DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt44=2;
                                    int LA44_0 = input.LA(1);

                                    if ( (LA44_0==DELIMITER1) ) {
                                        alt44=1;
                                    }
                                    switch (alt44) {
                                        case 1 :
                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:231:7: DELIMITER1 ts_sized_optionnal[\"P_8.8\", 26] ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1513); 

                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_1515);
                                            ts_sized_optionnal("P_8.8", 26);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:232:7: ( DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt43=2;
                                            int LA43_0 = input.LA(1);

                                            if ( (LA43_0==DELIMITER1) ) {
                                                alt43=1;
                                            }
                                            switch (alt43) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:232:8: DELIMITER1 spec_const_sexe[\"P_8.9\"] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1525); 

                                                    pushFollow(FOLLOW_spec_const_sexe_in_line_p2_1527);
                                                    spec_const_sexe("P_8.9");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:233:8: ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt42=2;
                                                    int LA42_0 = input.LA(1);

                                                    if ( (LA42_0==DELIMITER1) ) {
                                                        alt42=1;
                                                    }
                                                    switch (alt42) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:233:9: DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1538); 

                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:234:9: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt41=2;
                                                            int LA41_0 = input.LA(1);

                                                            if ( (LA41_0==DELIMITER1) ) {
                                                                alt41=1;
                                                            }
                                                            switch (alt41) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:234:10: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.11\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1549); 

                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1551);
                                                                    spec_sized_mult_lvl1_st_optionnal_6("P_8.11", 200);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:235:10: ( DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt40=2;
                                                                    int LA40_0 = input.LA(1);

                                                                    if ( (LA40_0==DELIMITER1) ) {
                                                                        alt40=1;
                                                                    }
                                                                    switch (alt40) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:235:11: DELIMITER1 st_sized_optionnal[\"P_8.12\", 120] ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1564); 

                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1566);
                                                                            st_sized_optionnal("P_8.12", 120);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:236:11: ( DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt39=2;
                                                                            int LA39_0 = input.LA(1);

                                                                            if ( (LA39_0==DELIMITER1) ) {
                                                                                alt39=1;
                                                                            }
                                                                            switch (alt39) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:236:12: DELIMITER1 spec_sized_tn[\"P_8.13\", 40] ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1580); 

                                                                                    pushFollow(FOLLOW_spec_sized_tn_in_line_p2_1582);
                                                                                    spec_sized_tn("P_8.13", 40);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:239:12: ( DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt38=2;
                                                                                    int LA38_0 = input.LA(1);

                                                                                    if ( (LA38_0==DELIMITER1) ) {
                                                                                        alt38=1;
                                                                                    }
                                                                                    switch (alt38) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:239:13: DELIMITER1 spec_sized_cna[\"P_8.14\", 60] ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )* ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1621); 

                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_p2_1623);
                                                                                            spec_sized_cna("P_8.14", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:239:53: ( REPETITEUR spec_sized_cna[\"P_8.14\", 60] )*
                                                                                            loop13:
                                                                                            do {
                                                                                                int alt13=2;
                                                                                                int LA13_0 = input.LA(1);

                                                                                                if ( (LA13_0==REPETITEUR) ) {
                                                                                                    alt13=1;
                                                                                                }


                                                                                                switch (alt13) {
                                                                                            	case 1 :
                                                                                            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:239:54: REPETITEUR spec_sized_cna[\"P_8.14\", 60]
                                                                                            	    {
                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1627); 

                                                                                            	    pushFollow(FOLLOW_spec_sized_cna_in_line_p2_1629);
                                                                                            	    spec_sized_cna("P_8.14", 60);

                                                                                            	    state._fsp--;


                                                                                            	    }
                                                                                            	    break;

                                                                                            	default :
                                                                                            	    break loop13;
                                                                                                }
                                                                                            } while (true);


                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:240:13: ( DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt37=2;
                                                                                            int LA37_0 = input.LA(1);

                                                                                            if ( (LA37_0==DELIMITER1) ) {
                                                                                                alt37=1;
                                                                                            }
                                                                                            switch (alt37) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:240:14: DELIMITER1 st_sized_optionnal[\"P_8.15\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1647); 

                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1649);
                                                                                                    st_sized_optionnal("P_8.15", 60);

                                                                                                    state._fsp--;


                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:241:14: ( DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt36=2;
                                                                                                    int LA36_0 = input.LA(1);

                                                                                                    if ( (LA36_0==DELIMITER1) ) {
                                                                                                        alt36=1;
                                                                                                    }
                                                                                                    switch (alt36) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:241:15: DELIMITER1 st_sized_optionnal[\"P_8.16\", 60] ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1666); 

                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1668);
                                                                                                            st_sized_optionnal("P_8.16", 60);

                                                                                                            state._fsp--;


                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:243:15: ( DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt35=2;
                                                                                                            int LA35_0 = input.LA(1);

                                                                                                            if ( (LA35_0==DELIMITER1) ) {
                                                                                                                alt35=1;
                                                                                                            }
                                                                                                            switch (alt35) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:243:16: DELIMITER1 nm_sized_optionnal[\"P_8.17\", 10] ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1701); 

                                                                                                                    pushFollow(FOLLOW_nm_sized_optionnal_in_line_p2_1703);
                                                                                                                    nm_sized_optionnal("P_8.17", 10);

                                                                                                                    state._fsp--;


                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:245:16: ( DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt34=2;
                                                                                                                    int LA34_0 = input.LA(1);

                                                                                                                    if ( (LA34_0==DELIMITER1) ) {
                                                                                                                        alt34=1;
                                                                                                                    }
                                                                                                                    switch (alt34) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:245:17: DELIMITER1 nm_sized_optionnal[\"P_8.18\", 10] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1738); 

                                                                                                                            pushFollow(FOLLOW_nm_sized_optionnal_in_line_p2_1740);
                                                                                                                            nm_sized_optionnal("P_8.18", 10);

                                                                                                                            state._fsp--;


                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:246:17: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt33=2;
                                                                                                                            int LA33_0 = input.LA(1);

                                                                                                                            if ( (LA33_0==DELIMITER1) ) {
                                                                                                                                alt33=1;
                                                                                                                            }
                                                                                                                            switch (alt33) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:246:18: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1760); 

                                                                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1762);
                                                                                                                                    spec_sized_mult_lvl1_st_optionnal_6("P_8.19", 200);

                                                                                                                                    state._fsp--;


                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:246:80: ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200] )*
                                                                                                                                    loop14:
                                                                                                                                    do {
                                                                                                                                        int alt14=2;
                                                                                                                                        int LA14_0 = input.LA(1);

                                                                                                                                        if ( (LA14_0==REPETITEUR) ) {
                                                                                                                                            alt14=1;
                                                                                                                                        }


                                                                                                                                        switch (alt14) {
                                                                                                                                    	case 1 :
                                                                                                                                    	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:246:81: REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"P_8.19\", 200]
                                                                                                                                    	    {
                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1766); 

                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1768);
                                                                                                                                    	    spec_sized_mult_lvl1_st_optionnal_6("P_8.19", 200);

                                                                                                                                    	    state._fsp--;


                                                                                                                                    	    }
                                                                                                                                    	    break;

                                                                                                                                    	default :
                                                                                                                                    	    break loop14;
                                                                                                                                        }
                                                                                                                                    } while (true);


                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:247:18: ( DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt32=2;
                                                                                                                                    int LA32_0 = input.LA(1);

                                                                                                                                    if ( (LA32_0==DELIMITER1) ) {
                                                                                                                                        alt32=1;
                                                                                                                                    }
                                                                                                                                    switch (alt32) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:247:19: DELIMITER1 st_sized_optionnal[\"P_8.20\", 200] ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )* ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1791); 

                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1793);
                                                                                                                                            st_sized_optionnal("P_8.20", 200);

                                                                                                                                            state._fsp--;


                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:247:64: ( REPETITEUR st_sized_optionnal[\"P_8.20\", 200] )*
                                                                                                                                            loop15:
                                                                                                                                            do {
                                                                                                                                                int alt15=2;
                                                                                                                                                int LA15_0 = input.LA(1);

                                                                                                                                                if ( (LA15_0==REPETITEUR) ) {
                                                                                                                                                    alt15=1;
                                                                                                                                                }


                                                                                                                                                switch (alt15) {
                                                                                                                                            	case 1 :
                                                                                                                                            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:247:65: REPETITEUR st_sized_optionnal[\"P_8.20\", 200]
                                                                                                                                            	    {
                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1797); 

                                                                                                                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1799);
                                                                                                                                            	    st_sized_optionnal("P_8.20", 200);

                                                                                                                                            	    state._fsp--;


                                                                                                                                            	    }
                                                                                                                                            	    break;

                                                                                                                                            	default :
                                                                                                                                            	    break loop15;
                                                                                                                                                }
                                                                                                                                            } while (true);


                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:248:19: ( DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt31=2;
                                                                                                                                            int LA31_0 = input.LA(1);

                                                                                                                                            if ( (LA31_0==DELIMITER1) ) {
                                                                                                                                                alt31=1;
                                                                                                                                            }
                                                                                                                                            switch (alt31) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:248:20: DELIMITER1 st_sized_optionnal[\"P_8.21\", 200] ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1823); 

                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1825);
                                                                                                                                                    st_sized_optionnal("P_8.21", 200);

                                                                                                                                                    state._fsp--;


                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:249:20: ( DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt30=2;
                                                                                                                                                    int LA30_0 = input.LA(1);

                                                                                                                                                    if ( (LA30_0==DELIMITER1) ) {
                                                                                                                                                        alt30=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt30) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:249:21: DELIMITER1 st_sized_optionnal[\"P_8.22\", 60] ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1848); 

                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1850);
                                                                                                                                                            st_sized_optionnal("P_8.22", 60);

                                                                                                                                                            state._fsp--;


                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:250:21: ( DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt29=2;
                                                                                                                                                            int LA29_0 = input.LA(1);

                                                                                                                                                            if ( (LA29_0==DELIMITER1) ) {
                                                                                                                                                                alt29=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt29) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:250:22: DELIMITER1 st_sized_optionnal[\"P_8.23\", 60] ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1874); 

                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_1876);
                                                                                                                                                                    st_sized_optionnal("P_8.23", 60);

                                                                                                                                                                    state._fsp--;


                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:251:22: ( DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                    int alt28=2;
                                                                                                                                                                    int LA28_0 = input.LA(1);

                                                                                                                                                                    if ( (LA28_0==DELIMITER1) ) {
                                                                                                                                                                        alt28=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt28) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:251:23: DELIMITER1 ts_sized_optionnal[\"P_8.24\", 26] ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )? ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1901); 

                                                                                                                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_1903);
                                                                                                                                                                            ts_sized_optionnal("P_8.24", 26);

                                                                                                                                                                            state._fsp--;


                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:251:67: ( REPETITEUR ts_sized_optionnal[\"P_8.24\", 26] )?
                                                                                                                                                                            int alt16=2;
                                                                                                                                                                            int LA16_0 = input.LA(1);

                                                                                                                                                                            if ( (LA16_0==REPETITEUR) ) {
                                                                                                                                                                                alt16=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt16) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:251:68: REPETITEUR ts_sized_optionnal[\"P_8.24\", 26]
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_p2_1907); 

                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_1909);
                                                                                                                                                                                    ts_sized_optionnal("P_8.24", 26);

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:252:23: ( DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                            int alt27=2;
                                                                                                                                                                            int LA27_0 = input.LA(1);

                                                                                                                                                                            if ( (LA27_0==DELIMITER1) ) {
                                                                                                                                                                                alt27=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt27) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:252:24: DELIMITER1 spec_const_8_25[\"P_8.25\"] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1937); 

                                                                                                                                                                                    pushFollow(FOLLOW_spec_const_8_25_in_line_p2_1939);
                                                                                                                                                                                    spec_const_8_25("P_8.25");

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:253:24: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                    int alt26=2;
                                                                                                                                                                                    int LA26_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA26_0==DELIMITER1) ) {
                                                                                                                                                                                        alt26=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt26) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:253:25: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_8[\"P_8.26\", 100] ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_1966); 

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_8_in_line_p2_1968);
                                                                                                                                                                                            spec_sized_mult_lvl1_st_optionnal_8("P_8.26", 100);

                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:255:25: ( DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                                                            int alt25=2;
                                                                                                                                                                                            int LA25_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA25_0==DELIMITER1) ) {
                                                                                                                                                                                                alt25=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt25) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:255:26: DELIMITER1 st_sized_optionnal[\"P_8.27\", 100] ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11021); 

                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11023);
                                                                                                                                                                                                    st_sized_optionnal("P_8.27", 100);

                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:256:26: ( DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                                                                    int alt24=2;
                                                                                                                                                                                                    int LA24_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA24_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt24=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt24) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:256:27: DELIMITER1 ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11052); 

                                                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:258:27: ( DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                                                            int alt23=2;
                                                                                                                                                                                                            int LA23_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA23_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt23=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt23) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:258:28: DELIMITER1 st_sized_optionnal[\"P_8.29\", 2] ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11108); 

                                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11110);
                                                                                                                                                                                                                    st_sized_optionnal("P_8.29", 2);

                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:260:28: ( DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                                                                    int alt22=2;
                                                                                                                                                                                                                    int LA22_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA22_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt22=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt22) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:260:29: DELIMITER1 st_sized_optionnal[\"P_8.30\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11169); 

                                                                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11171);
                                                                                                                                                                                                                            st_sized_optionnal("P_8.30", 20);

                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:261:29: ( DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                                                            int alt21=2;
                                                                                                                                                                                                                            int LA21_0 = input.LA(1);

                                                                                                                                                                                                                            if ( (LA21_0==DELIMITER1) ) {
                                                                                                                                                                                                                                alt21=1;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            switch (alt21) {
                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:261:30: DELIMITER1 st_sized_optionnal[\"P_8.31\", 20] ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11203); 

                                                                                                                                                                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11205);
                                                                                                                                                                                                                                    st_sized_optionnal("P_8.31", 20);

                                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:263:30: ( DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                                                                    int alt20=2;
                                                                                                                                                                                                                                    int LA20_0 = input.LA(1);

                                                                                                                                                                                                                                    if ( (LA20_0==DELIMITER1) ) {
                                                                                                                                                                                                                                        alt20=1;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    switch (alt20) {
                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:263:31: DELIMITER1 st_sized_optionnal[\"P_8.32\", 20] ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11268); 

                                                                                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_p2_11270);
                                                                                                                                                                                                                                            st_sized_optionnal("P_8.32", 20);

                                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:264:31: ( DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                                                            int alt19=2;
                                                                                                                                                                                                                                            int LA19_0 = input.LA(1);

                                                                                                                                                                                                                                            if ( (LA19_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                alt19=1;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            switch (alt19) {
                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:264:32: DELIMITER1 ts_sized_optionnal[\"P_8.33\", 26] ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11304); 

                                                                                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_11306);
                                                                                                                                                                                                                                                    ts_sized_optionnal("P_8.33", 26);

                                                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:265:32: ( DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                                                                    int alt18=2;
                                                                                                                                                                                                                                                    int LA18_0 = input.LA(1);

                                                                                                                                                                                                                                                    if ( (LA18_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                        alt18=1;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    switch (alt18) {
                                                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:265:33: DELIMITER1 ts_sized_optionnal[\"P_8.34\", 26] ( DELIMITER1 )?
                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11341); 

                                                                                                                                                                                                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_p2_11343);
                                                                                                                                                                                                                                                            ts_sized_optionnal("P_8.34", 26);

                                                                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:266:33: ( DELIMITER1 )?
                                                                                                                                                                                                                                                            int alt17=2;
                                                                                                                                                                                                                                                            int LA17_0 = input.LA(1);

                                                                                                                                                                                                                                                            if ( (LA17_0==DELIMITER1) ) {
                                                                                                                                                                                                                                                                alt17=1;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            switch (alt17) {
                                                                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:266:33: DELIMITER1
                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_p2_11378); 

                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                                            }


                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                                    }


                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    break;

                                                                                                                                                                                                                            }


                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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



    // $ANTLR start "line_obr2_1"
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:268:1: line_obr2_1 : CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR_9.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR_9.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR_9.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR_9.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR_9.8\"] DELIMITER1 ts_sized_optionnal[\"OBR_9.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR_9.10\", 20] DELIMITER1 spec_sized_cna[\"OBR_9.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR_9.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? ;
    public final void line_obr2_1() throws RecognitionException {
        collecteur.startElement("ligne", "OBR");
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:270:33: ( CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR_9.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR_9.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR_9.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR_9.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR_9.8\"] DELIMITER1 ts_sized_optionnal[\"OBR_9.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR_9.10\", 20] DELIMITER1 spec_sized_cna[\"OBR_9.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR_9.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:271:3: CR CHARO CHARB CHARR DELIMITER1 nm_integer_sized_mandatory[\"OBR_9.2\", 4] DELIMITER1 spec_sized_9_3[\"OBR_9.3\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.4\", 23] DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 640000] ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000] )* DELIMITER1 st_sized_optionnal[\"OBR_9.6\", 2] ( REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2] )* DELIMITER1 ts_sized_optionnal[\"OBR_9.7\", 26] DELIMITER1 spec_non_sized_9_8[\"OBR_9.8\"] DELIMITER1 ts_sized_optionnal[\"OBR_9.9\", 26] DELIMITER1 st_sized_optionnal[\"OBR_9.10\", 20] DELIMITER1 spec_sized_cna[\"OBR_9.11\", 60] DELIMITER1 st_sized_optionnal[\"OBR_9.12\", 1] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_obr2_11459); 

            match(input,CHARO,FOLLOW_CHARO_in_line_obr2_11461); 

            match(input,CHARB,FOLLOW_CHARB_in_line_obr2_11463); 

            match(input,CHARR,FOLLOW_CHARR_in_line_obr2_11465); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11469); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_obr2_11471);
            nm_integer_sized_mandatory("OBR_9.2", 4);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11476); 

            pushFollow(FOLLOW_spec_sized_9_3_in_line_obr2_11478);
            spec_sized_9_3("OBR_9.3", 23);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11483); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11485);
            spec_sized_mult_lvl1_st_optionnal_2("OBR_9.4", 23);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11490); 

            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11492);
            spec_sized_mult_lvl1_st_optionnal_6("OBR_9.5", 640000);

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:275:69: ( REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000] )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==REPETITEUR) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:275:70: REPETITEUR spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.5\", 64000]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11496); 

            	    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11498);
            	    spec_sized_mult_lvl1_st_optionnal_6("OBR_9.5", 64000);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11508); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11510);
            st_sized_optionnal("OBR_9.6", 2);

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:277:47: ( REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2] )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==REPETITEUR) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:277:48: REPETITEUR st_sized_optionnal[\"OBR_9.6\", 2]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11514); 

            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11516);
            	    st_sized_optionnal("OBR_9.6", 2);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11523); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11525);
            ts_sized_optionnal("OBR_9.7", 26);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11530); 

            pushFollow(FOLLOW_spec_non_sized_9_8_in_line_obr2_11532);
            spec_non_sized_9_8("OBR_9.8");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11537); 

            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11539);
            ts_sized_optionnal("OBR_9.9", 26);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11547); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11549);
            st_sized_optionnal("OBR_9.10", 20);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11554); 

            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_11556);
            spec_sized_cna("OBR_9.11", 60);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11564); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11566);
            st_sized_optionnal("OBR_9.12", 1);

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:287:3: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==DELIMITER1) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:287:4: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.13\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11575); 

                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11577);
                    spec_sized_mult_lvl1_st_optionnal_2("OBR_9.13", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:288:4: ( DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==DELIMITER1) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:288:5: DELIMITER1 st_sized_optionnal[\"OBR_9.14\", 300] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11584); 

                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11586);
                            st_sized_optionnal("OBR_9.14", 300);

                            state._fsp--;


                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:289:5: ( DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                            int alt75=2;
                            int LA75_0 = input.LA(1);

                            if ( (LA75_0==DELIMITER1) ) {
                                alt75=1;
                            }
                            switch (alt75) {
                                case 1 :
                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:289:6: DELIMITER1 ts_sized_optionnal[\"OBR_9.15\", 26] ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11594); 

                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11596);
                                    ts_sized_optionnal("OBR_9.15", 26);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:290:6: ( DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                    int alt74=2;
                                    int LA74_0 = input.LA(1);

                                    if ( (LA74_0==DELIMITER1) ) {
                                        alt74=1;
                                    }
                                    switch (alt74) {
                                        case 1 :
                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:290:7: DELIMITER1 spec_sized_9_16[\"OBR_9_16\", 300] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11605); 

                                            pushFollow(FOLLOW_spec_sized_9_16_in_line_obr2_11607);
                                            spec_sized_9_16("OBR_9_16", 300);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:291:7: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                            int alt73=2;
                                            int LA73_0 = input.LA(1);

                                            if ( (LA73_0==DELIMITER1) ) {
                                                alt73=1;
                                            }
                                            switch (alt73) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:291:8: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBR_9.17\", 60] ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11617); 

                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11619);
                                                    spec_sized_mult_lvl1_st_optionnal_6("OBR_9.17", 60);

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:292:8: ( DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                    int alt72=2;
                                                    int LA72_0 = input.LA(1);

                                                    if ( (LA72_0==DELIMITER1) ) {
                                                        alt72=1;
                                                    }
                                                    switch (alt72) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:292:9: DELIMITER1 spec_sized_tn[\"OBR_9.18\", 40] ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11630); 

                                                            pushFollow(FOLLOW_spec_sized_tn_in_line_obr2_11632);
                                                            spec_sized_tn("OBR_9.18", 40);

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:293:9: ( DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                            int alt71=2;
                                                            int LA71_0 = input.LA(1);

                                                            if ( (LA71_0==DELIMITER1) ) {
                                                                alt71=1;
                                                            }
                                                            switch (alt71) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:293:10: DELIMITER1 st_sized_optionnal[\"OBR_9.19\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11644); 

                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11646);
                                                                    st_sized_optionnal("OBR_9.19", 60);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:294:10: ( DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                    int alt70=2;
                                                                    int LA70_0 = input.LA(1);

                                                                    if ( (LA70_0==DELIMITER1) ) {
                                                                        alt70=1;
                                                                    }
                                                                    switch (alt70) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:294:11: DELIMITER1 st_sized_optionnal[\"OBR_9.20\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11659); 

                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11661);
                                                                            st_sized_optionnal("OBR_9.20", 60);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:295:11: ( DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                            int alt69=2;
                                                                            int LA69_0 = input.LA(1);

                                                                            if ( (LA69_0==DELIMITER1) ) {
                                                                                alt69=1;
                                                                            }
                                                                            switch (alt69) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:295:12: DELIMITER1 st_sized_optionnal[\"OBR_9.21\", 60] ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11675); 

                                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11677);
                                                                                    st_sized_optionnal("OBR_9.21", 60);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:296:12: ( DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                    int alt68=2;
                                                                                    int LA68_0 = input.LA(1);

                                                                                    if ( (LA68_0==DELIMITER1) ) {
                                                                                        alt68=1;
                                                                                    }
                                                                                    switch (alt68) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:296:13: DELIMITER1 st_sized_optionnal[\"OBR_9.22\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11692); 

                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11694);
                                                                                            st_sized_optionnal("OBR_9.22", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:297:13: ( DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                            int alt67=2;
                                                                                            int LA67_0 = input.LA(1);

                                                                                            if ( (LA67_0==DELIMITER1) ) {
                                                                                                alt67=1;
                                                                                            }
                                                                                            switch (alt67) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:297:14: DELIMITER1 ts_sized_optionnal[\"OBR_9.23\", 26] ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11710); 

                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_11712);
                                                                                                    ts_sized_optionnal("OBR_9.23", 26);

                                                                                                    state._fsp--;


                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:298:14: ( DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                    int alt66=2;
                                                                                                    int LA66_0 = input.LA(1);

                                                                                                    if ( (LA66_0==DELIMITER1) ) {
                                                                                                        alt66=1;
                                                                                                    }
                                                                                                    switch (alt66) {
                                                                                                        case 1 :
                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:298:15: DELIMITER1 ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            {
                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11729); 

                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:299:15: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                            int alt65=2;
                                                                                                            int LA65_0 = input.LA(1);

                                                                                                            if ( (LA65_0==DELIMITER1) ) {
                                                                                                                alt65=1;
                                                                                                            }
                                                                                                            switch (alt65) {
                                                                                                                case 1 :
                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:299:16: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_2[\"OBR_9.25\", 10] ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    {
                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11747); 

                                                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11749);
                                                                                                                    spec_sized_mult_lvl1_st_optionnal_2("OBR_9.25", 10);

                                                                                                                    state._fsp--;


                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:300:16: ( DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                    int alt64=2;
                                                                                                                    int LA64_0 = input.LA(1);

                                                                                                                    if ( (LA64_0==DELIMITER1) ) {
                                                                                                                        alt64=1;
                                                                                                                    }
                                                                                                                    switch (alt64) {
                                                                                                                        case 1 :
                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:300:17: DELIMITER1 spec_const_9_26[\"OBR_9.26\"] ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            {
                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11768); 

                                                                                                                            pushFollow(FOLLOW_spec_const_9_26_in_line_obr2_11770);
                                                                                                                            spec_const_9_26("OBR_9.26");

                                                                                                                            state._fsp--;


                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:301:17: ( DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                            int alt63=2;
                                                                                                                            int LA63_0 = input.LA(1);

                                                                                                                            if ( (LA63_0==DELIMITER1) ) {
                                                                                                                                alt63=1;
                                                                                                                            }
                                                                                                                            switch (alt63) {
                                                                                                                                case 1 :
                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:301:18: DELIMITER1 ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    {
                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11790); 

                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:302:18: ( DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
                                                                                                                                    int alt62=2;
                                                                                                                                    int LA62_0 = input.LA(1);

                                                                                                                                    if ( (LA62_0==DELIMITER1) ) {
                                                                                                                                        alt62=1;
                                                                                                                                    }
                                                                                                                                    switch (alt62) {
                                                                                                                                        case 1 :
                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:302:19: DELIMITER1 ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            {
                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11810); 

                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:303:19: ( DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                                                                                                                                            int alt61=2;
                                                                                                                                            int LA61_0 = input.LA(1);

                                                                                                                                            if ( (LA61_0==DELIMITER1) ) {
                                                                                                                                                alt61=1;
                                                                                                                                            }
                                                                                                                                            switch (alt61) {
                                                                                                                                                case 1 :
                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:303:20: DELIMITER1 spec_sized_cna[\"OBR_9.29\", 150] ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )* ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                    {
                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11831); 

                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_11833);
                                                                                                                                                    spec_sized_cna("OBR_9.29", 150);

                                                                                                                                                    state._fsp--;


                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:303:63: ( REPETITEUR spec_sized_cna[\"P_8.14\", 150] )*
                                                                                                                                                    loop50:
                                                                                                                                                    do {
                                                                                                                                                        int alt50=2;
                                                                                                                                                        int LA50_0 = input.LA(1);

                                                                                                                                                        if ( (LA50_0==REPETITEUR) ) {
                                                                                                                                                            alt50=1;
                                                                                                                                                        }


                                                                                                                                                        switch (alt50) {
                                                                                                                                                    	case 1 :
                                                                                                                                                    	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:303:64: REPETITEUR spec_sized_cna[\"P_8.14\", 150]
                                                                                                                                                    	    {
                                                                                                                                                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11837); 

                                                                                                                                                    	    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_11839);
                                                                                                                                                    	    spec_sized_cna("P_8.14", 150);

                                                                                                                                                    	    state._fsp--;


                                                                                                                                                    	    }
                                                                                                                                                    	    break;

                                                                                                                                                    	default :
                                                                                                                                                    	    break loop50;
                                                                                                                                                        }
                                                                                                                                                    } while (true);


                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:304:20: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                                                                                                                                                    int alt60=2;
                                                                                                                                                    int LA60_0 = input.LA(1);

                                                                                                                                                    if ( (LA60_0==DELIMITER1) ) {
                                                                                                                                                        alt60=1;
                                                                                                                                                    }
                                                                                                                                                    switch (alt60) {
                                                                                                                                                        case 1 :
                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:304:21: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_4[\"OBR_9.30\", 150] ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                            {
                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11864); 

                                                                                                                                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_4_in_line_obr2_11866);
                                                                                                                                                            spec_sized_mult_lvl1_st_optionnal_4("OBR_9.30", 150);

                                                                                                                                                            state._fsp--;


                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:305:21: ( DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                                                                                                                                            int alt59=2;
                                                                                                                                                            int LA59_0 = input.LA(1);

                                                                                                                                                            if ( (LA59_0==DELIMITER1) ) {
                                                                                                                                                                alt59=1;
                                                                                                                                                            }
                                                                                                                                                            switch (alt59) {
                                                                                                                                                                case 1 :
                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:305:22: DELIMITER1 spec_const_9_31[\"OBR_9.31\"] ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                    {
                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11890); 

                                                                                                                                                                    pushFollow(FOLLOW_spec_const_9_31_in_line_obr2_11892);
                                                                                                                                                                    spec_const_9_31("OBR_9.31");

                                                                                                                                                                    state._fsp--;


                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:307:22: ( DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )? )?
                                                                                                                                                                    int alt58=2;
                                                                                                                                                                    int LA58_0 = input.LA(1);

                                                                                                                                                                    if ( (LA58_0==DELIMITER1) ) {
                                                                                                                                                                        alt58=1;
                                                                                                                                                                    }
                                                                                                                                                                    switch (alt58) {
                                                                                                                                                                        case 1 :
                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:307:23: DELIMITER1 st_sized_optionnal[\"OBR_9.32\", 300] ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )* ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                            {
                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11939); 

                                                                                                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11941);
                                                                                                                                                                            st_sized_optionnal("OBR_9.32", 300);

                                                                                                                                                                            state._fsp--;


                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:307:70: ( REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300] )*
                                                                                                                                                                            loop51:
                                                                                                                                                                            do {
                                                                                                                                                                                int alt51=2;
                                                                                                                                                                                int LA51_0 = input.LA(1);

                                                                                                                                                                                if ( (LA51_0==REPETITEUR) ) {
                                                                                                                                                                                    alt51=1;
                                                                                                                                                                                }


                                                                                                                                                                                switch (alt51) {
                                                                                                                                                                            	case 1 :
                                                                                                                                                                            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:307:71: REPETITEUR st_sized_optionnal[\"OBR_9.32\", 300]
                                                                                                                                                                            	    {
                                                                                                                                                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obr2_11945); 

                                                                                                                                                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obr2_11947);
                                                                                                                                                                            	    st_sized_optionnal("OBR_9.32", 300);

                                                                                                                                                                            	    state._fsp--;


                                                                                                                                                                            	    }
                                                                                                                                                                            	    break;

                                                                                                                                                                            	default :
                                                                                                                                                                            	    break loop51;
                                                                                                                                                                                }
                                                                                                                                                                            } while (true);


                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:308:23: ( DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )? )?
                                                                                                                                                                            int alt57=2;
                                                                                                                                                                            int LA57_0 = input.LA(1);

                                                                                                                                                                            if ( (LA57_0==DELIMITER1) ) {
                                                                                                                                                                                alt57=1;
                                                                                                                                                                            }
                                                                                                                                                                            switch (alt57) {
                                                                                                                                                                                case 1 :
                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:308:24: DELIMITER1 spec_sized_cna[\"OBR_9.33\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                    {
                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_11975); 

                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_11977);
                                                                                                                                                                                    spec_sized_cna("OBR_9.33", 60);

                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:309:24: ( DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )? )?
                                                                                                                                                                                    int alt56=2;
                                                                                                                                                                                    int LA56_0 = input.LA(1);

                                                                                                                                                                                    if ( (LA56_0==DELIMITER1) ) {
                                                                                                                                                                                        alt56=1;
                                                                                                                                                                                    }
                                                                                                                                                                                    switch (alt56) {
                                                                                                                                                                                        case 1 :
                                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:309:25: DELIMITER1 spec_sized_cna[\"OBR_9.34\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                            {
                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12004); 

                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12006);
                                                                                                                                                                                            spec_sized_cna("OBR_9.34", 60);

                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:310:25: ( DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )? )?
                                                                                                                                                                                            int alt55=2;
                                                                                                                                                                                            int LA55_0 = input.LA(1);

                                                                                                                                                                                            if ( (LA55_0==DELIMITER1) ) {
                                                                                                                                                                                                alt55=1;
                                                                                                                                                                                            }
                                                                                                                                                                                            switch (alt55) {
                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:310:26: DELIMITER1 spec_sized_cna[\"OBR_9.35\", 60] ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                    {
                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12034); 

                                                                                                                                                                                                    pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12036);
                                                                                                                                                                                                    spec_sized_cna("OBR_9.35", 60);

                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:311:26: ( DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )? )?
                                                                                                                                                                                                    int alt54=2;
                                                                                                                                                                                                    int LA54_0 = input.LA(1);

                                                                                                                                                                                                    if ( (LA54_0==DELIMITER1) ) {
                                                                                                                                                                                                        alt54=1;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    switch (alt54) {
                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:311:27: DELIMITER1 spec_sized_cna[\"OBR_9.36\", 60] ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                            {
                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12065); 

                                                                                                                                                                                                            pushFollow(FOLLOW_spec_sized_cna_in_line_obr2_12067);
                                                                                                                                                                                                            spec_sized_cna("OBR_9.36", 60);

                                                                                                                                                                                                            state._fsp--;


                                                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:312:27: ( DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )? )?
                                                                                                                                                                                                            int alt53=2;
                                                                                                                                                                                                            int LA53_0 = input.LA(1);

                                                                                                                                                                                                            if ( (LA53_0==DELIMITER1) ) {
                                                                                                                                                                                                                alt53=1;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            switch (alt53) {
                                                                                                                                                                                                                case 1 :
                                                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:312:28: DELIMITER1 ts_sized_optionnal[\"OBR_9.37\", 26] ( DELIMITER1 )?
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12097); 

                                                                                                                                                                                                                    pushFollow(FOLLOW_ts_sized_optionnal_in_line_obr2_12099);
                                                                                                                                                                                                                    ts_sized_optionnal("OBR_9.37", 26);

                                                                                                                                                                                                                    state._fsp--;


                                                                                                                                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:313:29: ( DELIMITER1 )?
                                                                                                                                                                                                                    int alt52=2;
                                                                                                                                                                                                                    int LA52_0 = input.LA(1);

                                                                                                                                                                                                                    if ( (LA52_0==DELIMITER1) ) {
                                                                                                                                                                                                                        alt52=1;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    switch (alt52) {
                                                                                                                                                                                                                        case 1 :
                                                                                                                                                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:313:29: DELIMITER1
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obr2_12130); 

                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break;

                                                                                                                                                                                                                    }


                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;

                                                                                                                                                                                                            }


                                                                                                                                                                                                            }
                                                                                                                                                                                                            break;

                                                                                                                                                                                                    }


                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;

                                                                                                                                                                                            }


                                                                                                                                                                                            }
                                                                                                                                                                                            break;

                                                                                                                                                                                    }


                                                                                                                                                                                    }
                                                                                                                                                                                    break;

                                                                                                                                                                            }


                                                                                                                                                                            }
                                                                                                                                                                            break;

                                                                                                                                                                    }


                                                                                                                                                                    }
                                                                                                                                                                    break;

                                                                                                                                                            }


                                                                                                                                                            }
                                                                                                                                                            break;

                                                                                                                                                    }


                                                                                                                                                    }
                                                                                                                                                    break;

                                                                                                                                            }


                                                                                                                                            }
                                                                                                                                            break;

                                                                                                                                    }


                                                                                                                                    }
                                                                                                                                    break;

                                                                                                                            }


                                                                                                                            }
                                                                                                                            break;

                                                                                                                    }


                                                                                                                    }
                                                                                                                    break;

                                                                                                            }


                                                                                                            }
                                                                                                            break;

                                                                                                    }


                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:315:1: line_obx2_1 : CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX_10.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) ) ;
    public final void line_obx2_1() throws RecognitionException {
        collecteur.startElement("ligne", "OBX");
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:317:33: ( CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX_10.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) ) )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:318:3: CR CHARO CHARB CHARX DELIMITER1 nm_integer_sized_mandatory[\"OBX_10.2\", 10] DELIMITER1 ( ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) )
            {
            match(input,CR,FOLLOW_CR_in_line_obx2_12198); 

            match(input,CHARO,FOLLOW_CHARO_in_line_obx2_12200); 

            match(input,CHARB,FOLLOW_CHARB_in_line_obx2_12202); 

            match(input,CHARX,FOLLOW_CHARX_in_line_obx2_12204); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12208); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_obx2_12210);
            nm_integer_sized_mandatory("OBX_10.2", 10);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12215); 

            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:321:5: ( ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) | ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? ) )
            int alt113=7;
            switch ( input.LA(1) ) {
            case CHARN:
                {
                alt113=1;
                }
                break;
            case CHARC:
                {
                int LA113_2 = input.LA(2);

                if ( (LA113_2==CHARE) ) {
                    alt113=2;
                }
                else if ( (LA113_2==CHARK||LA113_2==CHARN) ) {
                    alt113=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHARF:
                {
                alt113=3;
                }
                break;
            case CHARS:
                {
                alt113=4;
                }
                break;
            case CHARG:
                {
                int LA113_5 = input.LA(2);

                if ( (LA113_5==CHARC) ) {
                    alt113=5;
                }
                else if ( (LA113_5==CHARB||LA113_5==CHARN) ) {
                    alt113=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 5, input);

                    throw nvae;

                }
                }
                break;
            case CHART:
                {
                int LA113_6 = input.LA(2);

                if ( (LA113_6==CHARX) ) {
                    alt113=6;
                }
                else if ( (LA113_6==CHARN) ) {
                    alt113=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 6, input);

                    throw nvae;

                }
                }
                break;
            case CHARA:
            case CHARD:
            case CHARP:
                {
                alt113=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;

            }

            switch (alt113) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:321:6: ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:321:6: ( spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:321:7: spec_const_10_3_nm[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_nm_in_line_obx2_12223);
                    spec_const_10_3_nm("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:322:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==DELIMITER1) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:322:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12232); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12234);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:323:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt81=2;
                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==DELIMITER1) ) {
                                alt81=1;
                            }
                            switch (alt81) {
                                case 1 :
                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:323:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12244); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12246);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:324:8: ( DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt80=2;
                                    int LA80_0 = input.LA(1);

                                    if ( (LA80_0==DELIMITER1) ) {
                                        alt80=1;
                                    }
                                    switch (alt80) {
                                        case 1 :
                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:324:9: DELIMITER1 nm_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12257); 

                                            pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2_12259);
                                            nm_sized_optionnal("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:324:58: ( REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000] )*
                                            loop78:
                                            do {
                                                int alt78=2;
                                                int LA78_0 = input.LA(1);

                                                if ( (LA78_0==REPETITEUR) ) {
                                                    alt78=1;
                                                }


                                                switch (alt78) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:324:59: REPETITEUR nm_sized_optionnal[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12263); 

                                            	    pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2_12265);
                                            	    nm_sized_optionnal("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop78;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:325:9: ( line_obx2_1_post10_6 )?
                                            int alt79=2;
                                            int LA79_0 = input.LA(1);

                                            if ( (LA79_0==DELIMITER1) ) {
                                                alt79=1;
                                            }
                                            switch (alt79) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:325:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12278);
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
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:326:7: ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:326:7: ( spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:326:8: spec_const_10_3_ce[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_ce_in_line_obx2_12295);
                    spec_const_10_3_ce("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:327:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==DELIMITER1) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:327:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12304); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12306);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:328:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt86=2;
                            int LA86_0 = input.LA(1);

                            if ( (LA86_0==DELIMITER1) ) {
                                alt86=1;
                            }
                            switch (alt86) {
                                case 1 :
                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:328:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12316); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12318);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:329:8: ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt85=2;
                                    int LA85_0 = input.LA(1);

                                    if ( (LA85_0==DELIMITER1) ) {
                                        alt85=1;
                                    }
                                    switch (alt85) {
                                        case 1 :
                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:329:9: DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12329); 

                                            pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12331);
                                            spec_sized_10_6("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:329:55: ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )*
                                            loop83:
                                            do {
                                                int alt83=2;
                                                int LA83_0 = input.LA(1);

                                                if ( (LA83_0==REPETITEUR) ) {
                                                    alt83=1;
                                                }


                                                switch (alt83) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:329:56: REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12335); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12337);
                                            	    spec_sized_10_6("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop83;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:330:9: ( line_obx2_1_post10_6 )?
                                            int alt84=2;
                                            int LA84_0 = input.LA(1);

                                            if ( (LA84_0==DELIMITER1) ) {
                                                alt84=1;
                                            }
                                            switch (alt84) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:330:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12350);
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
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:331:7: ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:331:7: ( spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:331:8: spec_const_10_3_fic[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_fic_in_line_obx2_12367);
                    spec_const_10_3_fic("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:332:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==DELIMITER1) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:332:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12376); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12378);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:333:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt91=2;
                            int LA91_0 = input.LA(1);

                            if ( (LA91_0==DELIMITER1) ) {
                                alt91=1;
                            }
                            switch (alt91) {
                                case 1 :
                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:333:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12388); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12390);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:334:8: ( DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt90=2;
                                    int LA90_0 = input.LA(1);

                                    if ( (LA90_0==DELIMITER1) ) {
                                        alt90=1;
                                    }
                                    switch (alt90) {
                                        case 1 :
                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:334:9: DELIMITER1 spec_sized_10_6[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12401); 

                                            pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12403);
                                            spec_sized_10_6("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:334:55: ( REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000] )*
                                            loop88:
                                            do {
                                                int alt88=2;
                                                int LA88_0 = input.LA(1);

                                                if ( (LA88_0==REPETITEUR) ) {
                                                    alt88=1;
                                                }


                                                switch (alt88) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:334:56: REPETITEUR spec_sized_10_6[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12407); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_in_line_obx2_12409);
                                            	    spec_sized_10_6("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop88;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:335:9: ( line_obx2_1_post10_6 )?
                                            int alt89=2;
                                            int LA89_0 = input.LA(1);

                                            if ( (LA89_0==DELIMITER1) ) {
                                                alt89=1;
                                            }
                                            switch (alt89) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:335:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12422);
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
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:336:7: ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:336:7: ( spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:336:8: spec_const_10_3_st[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_st_in_line_obx2_12439);
                    spec_const_10_3_st("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:337:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==DELIMITER1) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:337:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12448); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12450);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:338:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt96=2;
                            int LA96_0 = input.LA(1);

                            if ( (LA96_0==DELIMITER1) ) {
                                alt96=1;
                            }
                            switch (alt96) {
                                case 1 :
                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:338:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12460); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12462);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:339:8: ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt95=2;
                                    int LA95_0 = input.LA(1);

                                    if ( (LA95_0==DELIMITER1) ) {
                                        alt95=1;
                                    }
                                    switch (alt95) {
                                        case 1 :
                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:339:9: DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12473); 

                                            pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12475);
                                            spec_sized_10_6_tx("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:339:58: ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )*
                                            loop93:
                                            do {
                                                int alt93=2;
                                                int LA93_0 = input.LA(1);

                                                if ( (LA93_0==REPETITEUR) ) {
                                                    alt93=1;
                                                }


                                                switch (alt93) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:339:59: REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12479); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12481);
                                            	    spec_sized_10_6_tx("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop93;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:340:9: ( line_obx2_1_post10_6 )?
                                            int alt94=2;
                                            int LA94_0 = input.LA(1);

                                            if ( (LA94_0==DELIMITER1) ) {
                                                alt94=1;
                                            }
                                            switch (alt94) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:340:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12494);
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
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:341:7: ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:341:7: ( spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:341:8: spec_const_10_3_gc[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_gc_in_line_obx2_12511);
                    spec_const_10_3_gc("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:342:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==DELIMITER1) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:342:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12520); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12522);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:343:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt101=2;
                            int LA101_0 = input.LA(1);

                            if ( (LA101_0==DELIMITER1) ) {
                                alt101=1;
                            }
                            switch (alt101) {
                                case 1 :
                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:343:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12532); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12534);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:344:8: ( DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt100=2;
                                    int LA100_0 = input.LA(1);

                                    if ( (LA100_0==DELIMITER1) ) {
                                        alt100=1;
                                    }
                                    switch (alt100) {
                                        case 1 :
                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:344:9: DELIMITER1 spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12545); 

                                            pushFollow(FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12547);
                                            spec_sized_mult_lvl1_nm_optionnal_2("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:344:75: ( REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000] )*
                                            loop98:
                                            do {
                                                int alt98=2;
                                                int LA98_0 = input.LA(1);

                                                if ( (LA98_0==REPETITEUR) ) {
                                                    alt98=1;
                                                }


                                                switch (alt98) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:344:76: REPETITEUR spec_sized_mult_lvl1_nm_optionnal_2[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12551); 

                                            	    pushFollow(FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12553);
                                            	    spec_sized_mult_lvl1_nm_optionnal_2("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop98;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:345:9: ( line_obx2_1_post10_6 )?
                                            int alt99=2;
                                            int LA99_0 = input.LA(1);

                                            if ( (LA99_0==DELIMITER1) ) {
                                                alt99=1;
                                            }
                                            switch (alt99) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:345:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12566);
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
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:346:7: ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:346:7: ( spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:346:8: spec_const_10_3_tx[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_tx_in_line_obx2_12583);
                    spec_const_10_3_tx("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:347:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==DELIMITER1) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:347:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12592); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12594);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:348:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt106=2;
                            int LA106_0 = input.LA(1);

                            if ( (LA106_0==DELIMITER1) ) {
                                alt106=1;
                            }
                            switch (alt106) {
                                case 1 :
                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:348:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12604); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12606);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:349:8: ( DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt105=2;
                                    int LA105_0 = input.LA(1);

                                    if ( (LA105_0==DELIMITER1) ) {
                                        alt105=1;
                                    }
                                    switch (alt105) {
                                        case 1 :
                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:349:9: DELIMITER1 spec_sized_10_6_tx[\"OBX_10.6\", 64000] ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12617); 

                                            pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12619);
                                            spec_sized_10_6_tx("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:349:58: ( REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000] )*
                                            loop103:
                                            do {
                                                int alt103=2;
                                                int LA103_0 = input.LA(1);

                                                if ( (LA103_0==REPETITEUR) ) {
                                                    alt103=1;
                                                }


                                                switch (alt103) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:349:59: REPETITEUR spec_sized_10_6_tx[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12623); 

                                            	    pushFollow(FOLLOW_spec_sized_10_6_tx_in_line_obx2_12625);
                                            	    spec_sized_10_6_tx("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop103;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:350:9: ( line_obx2_1_post10_6 )?
                                            int alt104=2;
                                            int LA104_0 = input.LA(1);

                                            if ( (LA104_0==DELIMITER1) ) {
                                                alt104=1;
                                            }
                                            switch (alt104) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:350:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12638);
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
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:351:7: ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:351:7: ( spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )? )
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:351:8: spec_const_10_3_std[\"OBX_10.3\"] ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    {
                    pushFollow(FOLLOW_spec_const_10_3_std_in_line_obx2_12655);
                    spec_const_10_3_std("OBX_10.3");

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:352:6: ( DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )? )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==DELIMITER1) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:352:7: DELIMITER1 spec_sized_10_4[\"OBX_10.4\", 200] ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12664); 

                            pushFollow(FOLLOW_spec_sized_10_4_in_line_obx2_12666);
                            spec_sized_10_4("OBX_10.4", 200);

                            state._fsp--;


                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:353:7: ( DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )? )?
                            int alt111=2;
                            int LA111_0 = input.LA(1);

                            if ( (LA111_0==DELIMITER1) ) {
                                alt111=1;
                            }
                            switch (alt111) {
                                case 1 :
                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:353:8: DELIMITER1 st_sized_optionnal[\"OBX_10.5\", 10] ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12676); 

                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12678);
                                    st_sized_optionnal("OBX_10.5", 10);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:354:8: ( DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )? )?
                                    int alt110=2;
                                    int LA110_0 = input.LA(1);

                                    if ( (LA110_0==DELIMITER1) ) {
                                        alt110=1;
                                    }
                                    switch (alt110) {
                                        case 1 :
                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:354:9: DELIMITER1 st_sized_optionnal[\"OBX_10.6\", 64000] ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )* ( line_obx2_1_post10_6 )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_12689); 

                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12691);
                                            st_sized_optionnal("OBX_10.6", 64000);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:354:58: ( REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000] )*
                                            loop108:
                                            do {
                                                int alt108=2;
                                                int LA108_0 = input.LA(1);

                                                if ( (LA108_0==REPETITEUR) ) {
                                                    alt108=1;
                                                }


                                                switch (alt108) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:354:59: REPETITEUR st_sized_optionnal[\"OBX_10.6\", 64000]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_12695); 

                                            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_12697);
                                            	    st_sized_optionnal("OBX_10.6", 64000);

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop108;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:355:9: ( line_obx2_1_post10_6 )?
                                            int alt109=2;
                                            int LA109_0 = input.LA(1);

                                            if ( (LA109_0==DELIMITER1) ) {
                                                alt109=1;
                                            }
                                            switch (alt109) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:355:9: line_obx2_1_post10_6
                                                    {
                                                    pushFollow(FOLLOW_line_obx2_1_post10_6_in_line_obx2_12710);
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

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:357:1: line_obx2_1_post10_6 : ( DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? ) ;
    public final void line_obx2_1_post10_6() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:357:21: ( ( DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? ) )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:358:5: ( DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:358:5: ( DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:358:6: DELIMITER1 st_sized_optionnal[\"OBX_10.7\", 20] ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
            {
            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62731); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62733);
            st_sized_optionnal("OBX_10.7", 20);

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:359:6: ( DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )? )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==DELIMITER1) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:359:7: DELIMITER1 st_sized_optionnal[\"OBX_10.8\", 60] ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )* ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62742); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62744);
                    st_sized_optionnal("OBX_10.8", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:359:53: ( REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60] )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==REPETITEUR) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:359:54: REPETITEUR st_sized_optionnal[\"OBX_10.8\", 60]
                    	    {
                    	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_62748); 

                    	    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62750);
                    	    st_sized_optionnal("OBX_10.8", 60);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop114;
                        }
                    } while (true);


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:360:7: ( DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )? )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==DELIMITER1) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:360:8: DELIMITER1 spec_const_10_9[\"OBX_10.9\"] ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )* ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62762); 

                            pushFollow(FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62764);
                            spec_const_10_9("OBX_10.9");

                            state._fsp--;


                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:360:47: ( REPETITEUR spec_const_10_9[\"OBX_10.9\"] )*
                            loop115:
                            do {
                                int alt115=2;
                                int LA115_0 = input.LA(1);

                                if ( (LA115_0==REPETITEUR) ) {
                                    alt115=1;
                                }


                                switch (alt115) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:360:48: REPETITEUR spec_const_10_9[\"OBX_10.9\"]
                            	    {
                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_62768); 

                            	    pushFollow(FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62770);
                            	    spec_const_10_9("OBX_10.9");

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop115;
                                }
                            } while (true);


                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:361:8: ( DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )? )?
                            int alt125=2;
                            int LA125_0 = input.LA(1);

                            if ( (LA125_0==DELIMITER1) ) {
                                alt125=1;
                            }
                            switch (alt125) {
                                case 1 :
                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:361:9: DELIMITER1 nm_sized_optionnal[\"OBX_10.10\", 5] ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62783); 

                                    pushFollow(FOLLOW_nm_sized_optionnal_in_line_obx2_1_post10_62785);
                                    nm_sized_optionnal("OBX_10.10", 5);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:362:9: ( DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )? )?
                                    int alt124=2;
                                    int LA124_0 = input.LA(1);

                                    if ( (LA124_0==DELIMITER1) ) {
                                        alt124=1;
                                    }
                                    switch (alt124) {
                                        case 1 :
                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:362:10: DELIMITER1 spec_const_10_11[\"OBX_10.11\"] ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )* ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62797); 

                                            pushFollow(FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62799);
                                            spec_const_10_11("OBX_10.11");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:362:51: ( REPETITEUR spec_const_10_11[\"OBX_10.11\"] )*
                                            loop116:
                                            do {
                                                int alt116=2;
                                                int LA116_0 = input.LA(1);

                                                if ( (LA116_0==REPETITEUR) ) {
                                                    alt116=1;
                                                }


                                                switch (alt116) {
                                            	case 1 :
                                            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:362:52: REPETITEUR spec_const_10_11[\"OBX_10.11\"]
                                            	    {
                                            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_obx2_1_post10_62803); 

                                            	    pushFollow(FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62805);
                                            	    spec_const_10_11("OBX_10.11");

                                            	    state._fsp--;


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop116;
                                                }
                                            } while (true);


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:363:10: ( DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )? )?
                                            int alt123=2;
                                            int LA123_0 = input.LA(1);

                                            if ( (LA123_0==DELIMITER1) ) {
                                                alt123=1;
                                            }
                                            switch (alt123) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:363:11: DELIMITER1 spec_const_10_12[\"OBX_10.12\"] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62820); 

                                                    pushFollow(FOLLOW_spec_const_10_12_in_line_obx2_1_post10_62822);
                                                    spec_const_10_12("OBX_10.12");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:364:11: ( DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )? )?
                                                    int alt122=2;
                                                    int LA122_0 = input.LA(1);

                                                    if ( (LA122_0==DELIMITER1) ) {
                                                        alt122=1;
                                                    }
                                                    switch (alt122) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:364:12: DELIMITER1 ts_sized_optionnal[\"OBX_10.13\", 26] ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )?
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62837); 

                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62839);
                                                            ts_sized_optionnal("OBX_10.13", 26);

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:365:12: ( DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )? )?
                                                            int alt121=2;
                                                            int LA121_0 = input.LA(1);

                                                            if ( (LA121_0==DELIMITER1) ) {
                                                                alt121=1;
                                                            }
                                                            switch (alt121) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:365:13: DELIMITER1 st_sized_optionnal[\"OBX_10.14\", 20] ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )?
                                                                    {
                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62855); 

                                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62857);
                                                                    st_sized_optionnal("OBX_10.14", 20);

                                                                    state._fsp--;


                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:366:13: ( DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )? )?
                                                                    int alt120=2;
                                                                    int LA120_0 = input.LA(1);

                                                                    if ( (LA120_0==DELIMITER1) ) {
                                                                        alt120=1;
                                                                    }
                                                                    switch (alt120) {
                                                                        case 1 :
                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:366:14: DELIMITER1 ts_sized_optionnal[\"OBX_10.15\", 26] ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )?
                                                                            {
                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62873); 

                                                                            pushFollow(FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62875);
                                                                            ts_sized_optionnal("OBX_10.15", 26);

                                                                            state._fsp--;


                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:367:14: ( DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )? )?
                                                                            int alt119=2;
                                                                            int LA119_0 = input.LA(1);

                                                                            if ( (LA119_0==DELIMITER1) ) {
                                                                                alt119=1;
                                                                            }
                                                                            switch (alt119) {
                                                                                case 1 :
                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:367:15: DELIMITER1 spec_sized_mult_lvl1_st_optionnal_6[\"OBX_10.16\", 60] ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )?
                                                                                    {
                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62892); 

                                                                                    pushFollow(FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obx2_1_post10_62894);
                                                                                    spec_sized_mult_lvl1_st_optionnal_6("OBX_10.16", 60);

                                                                                    state._fsp--;


                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:368:15: ( DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )? )?
                                                                                    int alt118=2;
                                                                                    int LA118_0 = input.LA(1);

                                                                                    if ( (LA118_0==DELIMITER1) ) {
                                                                                        alt118=1;
                                                                                    }
                                                                                    switch (alt118) {
                                                                                        case 1 :
                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:368:16: DELIMITER1 st_sized_optionnal[\"OBX_10.17\", 60] ( DELIMITER1 )?
                                                                                            {
                                                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62912); 

                                                                                            pushFollow(FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62914);
                                                                                            st_sized_optionnal("OBX_10.17", 60);

                                                                                            state._fsp--;


                                                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:368:63: ( DELIMITER1 )?
                                                                                            int alt117=2;
                                                                                            int LA117_0 = input.LA(1);

                                                                                            if ( (LA117_0==DELIMITER1) ) {
                                                                                                alt117=1;
                                                                                            }
                                                                                            switch (alt117) {
                                                                                                case 1 :
                                                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:368:63: DELIMITER1
                                                                                                    {
                                                                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_obx2_1_post10_62917); 

                                                                                                    }
                                                                                                    break;

                                                                                            }


                                                                                            }
                                                                                            break;

                                                                                    }


                                                                                    }
                                                                                    break;

                                                                            }


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:370:1: line_c2_1 : CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C_12.2\", 10] DELIMITER1 spec_const_12_3[\"C_12.3\"] DELIMITER1 st_sized_optionnal[\"C_12.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C_12.4\", 64000] )* ( DELIMITER1 )? ;
    public final void line_c2_1() throws RecognitionException {
        collecteur.startElement("ligne", "C");
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:372:33: ( CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C_12.2\", 10] DELIMITER1 spec_const_12_3[\"C_12.3\"] DELIMITER1 st_sized_optionnal[\"C_12.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C_12.4\", 64000] )* ( DELIMITER1 )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:373:3: CR CHARC DELIMITER1 nm_integer_sized_mandatory[\"C_12.2\", 10] DELIMITER1 spec_const_12_3[\"C_12.3\"] DELIMITER1 st_sized_optionnal[\"C_12.4\", 64000] ( REPETITEUR st_sized_optionnal[\"C_12.4\", 64000] )* ( DELIMITER1 )?
            {
            match(input,CR,FOLLOW_CR_in_line_c2_12956); 

            match(input,CHARC,FOLLOW_CHARC_in_line_c2_12958); 

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_12962); 

            pushFollow(FOLLOW_nm_integer_sized_mandatory_in_line_c2_12964);
            nm_integer_sized_mandatory("C_12.2", 10);

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_12969); 

            pushFollow(FOLLOW_spec_const_12_3_in_line_c2_12971);
            spec_const_12_3("C_12.3");

            state._fsp--;


            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_12976); 

            pushFollow(FOLLOW_st_sized_optionnal_in_line_c2_12978);
            st_sized_optionnal("C_12.4", 64000);

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:376:50: ( REPETITEUR st_sized_optionnal[\"C_12.4\", 64000] )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==REPETITEUR) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:376:51: REPETITEUR st_sized_optionnal[\"C_12.4\", 64000]
            	    {
            	    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_line_c2_12982); 

            	    pushFollow(FOLLOW_st_sized_optionnal_in_line_c2_12984);
            	    st_sized_optionnal("C_12.4", 64000);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop128;
                }
            } while (true);


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:377:3: ( DELIMITER1 )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==DELIMITER1) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:377:3: DELIMITER1
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_c2_12993); 

                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:379:1: line_l2_1 : CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )? )? ;
    public final void line_l2_1() throws RecognitionException {
        collecteur.startElement("ligne", "L");
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:381:33: ( CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )? )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:382:3: CR CHARL ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )? )?
            {
            match(input,CR,FOLLOW_CR_in_line_l2_13011); 

            match(input,CHARL,FOLLOW_CHARL_in_line_l2_13013); 

            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:383:3: ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )? )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==DELIMITER1) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:383:4: DELIMITER1 nm_integer_sized_optionnal[\"L_14.2\", 1] ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )?
                    {
                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13018); 

                    pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l2_13020);
                    nm_integer_sized_optionnal("L_14.2", 1);

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:384:4: ( DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )? )?
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==DELIMITER1) ) {
                        alt134=1;
                    }
                    switch (alt134) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:384:5: DELIMITER1 ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )?
                            {
                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13027); 

                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:385:5: ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )? )?
                            int alt133=2;
                            int LA133_0 = input.LA(1);

                            if ( (LA133_0==DELIMITER1) ) {
                                alt133=1;
                            }
                            switch (alt133) {
                                case 1 :
                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:385:6: DELIMITER1 nm_integer_sized_optionnal[\"L_14.4\", 4] ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )?
                                    {
                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13034); 

                                    pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l2_13036);
                                    nm_integer_sized_optionnal("L_14.4", 4);

                                    state._fsp--;


                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:386:6: ( DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )? )?
                                    int alt132=2;
                                    int LA132_0 = input.LA(1);

                                    if ( (LA132_0==DELIMITER1) ) {
                                        alt132=1;
                                    }
                                    switch (alt132) {
                                        case 1 :
                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:386:7: DELIMITER1 nm_integer_sized_optionnal[\"L_14.5\", 10] ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )?
                                            {
                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13045); 

                                            pushFollow(FOLLOW_nm_integer_sized_optionnal_in_line_l2_13047);
                                            nm_integer_sized_optionnal("L_14.5", 10);

                                            state._fsp--;


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:387:7: ( DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )? )?
                                            int alt131=2;
                                            int LA131_0 = input.LA(1);

                                            if ( (LA131_0==DELIMITER1) ) {
                                                alt131=1;
                                            }
                                            switch (alt131) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:387:8: DELIMITER1 st_sized_optionnal[\"L_14.6\", 12] ( DELIMITER1 )?
                                                    {
                                                    match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13057); 

                                                    pushFollow(FOLLOW_st_sized_optionnal_in_line_l2_13059);
                                                    st_sized_optionnal("L_14.6", 12);

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:387:52: ( DELIMITER1 )?
                                                    int alt130=2;
                                                    int LA130_0 = input.LA(1);

                                                    if ( (LA130_0==DELIMITER1) ) {
                                                        alt130=1;
                                                    }
                                                    switch (alt130) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:387:52: DELIMITER1
                                                            {
                                                            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_line_l2_13062); 

                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:397:1: spec_const_sexe[String nameElement] : ( final_charM | final_charF | final_charU )? ;
    public final void spec_const_sexe(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:399:33: ( ( final_charM | final_charF | final_charU )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:400:3: ( final_charM | final_charF | final_charU )?
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:400:3: ( final_charM | final_charF | final_charU )?
            int alt136=4;
            switch ( input.LA(1) ) {
                case CHARM:
                    {
                    alt136=1;
                    }
                    break;
                case CHARF:
                    {
                    alt136=2;
                    }
                    break;
                case CHARU:
                    {
                    alt136=3;
                    }
                    break;
            }

            switch (alt136) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:400:4: final_charM
                    {
                    pushFollow(FOLLOW_final_charM_in_spec_const_sexe3100);
                    final_charM();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:400:18: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_sexe3104);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:400:32: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_sexe3108);
                    final_charU();

                    state._fsp--;


                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:402:1: spec_const_7_13_version_2_0[String nameElement] : spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_0(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:404:33: ( spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:405:3: spec_const_7_13_1_version_2_0[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_0_in_spec_const_7_13_version_2_03128);
            spec_const_7_13_1_version_2_0(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_03131); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_03133);
            spec_const_7_13_2(nameElement + ".2");

            state._fsp--;


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:407:1: spec_const_7_13_version_2_1[String nameElement] : spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_1(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:409:33: ( spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:410:3: spec_const_7_13_1_version_2_1[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_1_in_spec_const_7_13_version_2_13154);
            spec_const_7_13_1_version_2_1(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_13157); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_13159);
            spec_const_7_13_2(nameElement + ".2");

            state._fsp--;


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:412:1: spec_const_7_13_version_2_2[String nameElement] : spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] ;
    public final void spec_const_7_13_version_2_2(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:414:33: ( spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:415:3: spec_const_7_13_1_version_2_2[$nameElement + \".1\"] DELIMITER2 spec_const_7_13_2[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_spec_const_7_13_1_version_2_2_in_spec_const_7_13_version_2_23178);
            spec_const_7_13_1_version_2_2(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_23181); 

            pushFollow(FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_23183);
            spec_const_7_13_2(nameElement + ".2");

            state._fsp--;


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:417:1: spec_const_7_13_2[String nameElement] : ( final_charC | final_charL | final_charR );
    public final void spec_const_7_13_2(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:419:33: ( final_charC | final_charL | final_charR )
            int alt137=3;
            switch ( input.LA(1) ) {
            case CHARC:
                {
                alt137=1;
                }
                break;
            case CHARL:
                {
                alt137=2;
                }
                break;
            case CHARR:
                {
                alt137=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;

            }

            switch (alt137) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:3: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_7_13_23202);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:17: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_7_13_23206);
                    final_charL();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:420:31: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_7_13_23210);
                    final_charR();

                    state._fsp--;


                    }
                    break;

            }
            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:422:1: spec_const_7_7_contexte[String nameElement] : final_ORU ;
    public final void spec_const_7_7_contexte(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:424:33: ( final_ORU )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:425:3: final_ORU
            {
            pushFollow(FOLLOW_final_ORU_in_spec_const_7_7_contexte3228);
            final_ORU();

            state._fsp--;


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:427:1: spec_const_7_12[String nameElement] : ( final_charP | final_charD | final_charT ) ;
    public final void spec_const_7_12(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:429:33: ( ( final_charP | final_charD | final_charT ) )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:3: ( final_charP | final_charD | final_charT )
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:3: ( final_charP | final_charD | final_charT )
            int alt138=3;
            switch ( input.LA(1) ) {
            case CHARP:
                {
                alt138=1;
                }
                break;
            case CHARD:
                {
                alt138=2;
                }
                break;
            case CHART:
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
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:4: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_7_123247);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:18: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_7_123251);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:430:32: final_charT
                    {
                    pushFollow(FOLLOW_final_charT_in_spec_const_7_123255);
                    final_charT();

                    state._fsp--;


                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:432:1: spec_const_9_31[String nameElement] : ( final_PORT | final_CART | final_WHLC | final_WALK )? ;
    public final void spec_const_9_31(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:434:33: ( ( final_PORT | final_CART | final_WHLC | final_WALK )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:435:3: ( final_PORT | final_CART | final_WHLC | final_WALK )?
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:435:3: ( final_PORT | final_CART | final_WHLC | final_WALK )?
            int alt139=5;
            switch ( input.LA(1) ) {
                case CHARP:
                    {
                    alt139=1;
                    }
                    break;
                case CHARC:
                    {
                    alt139=2;
                    }
                    break;
                case CHARW:
                    {
                    int LA139_3 = input.LA(2);

                    if ( (LA139_3==CHARH) ) {
                        alt139=3;
                    }
                    else if ( (LA139_3==CHARA) ) {
                        alt139=4;
                    }
                    }
                    break;
            }

            switch (alt139) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:435:4: final_PORT
                    {
                    pushFollow(FOLLOW_final_PORT_in_spec_const_9_313275);
                    final_PORT();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:435:17: final_CART
                    {
                    pushFollow(FOLLOW_final_CART_in_spec_const_9_313279);
                    final_CART();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:435:30: final_WHLC
                    {
                    pushFollow(FOLLOW_final_WHLC_in_spec_const_9_313283);
                    final_WHLC();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:435:43: final_WALK
                    {
                    pushFollow(FOLLOW_final_WALK_in_spec_const_9_313287);
                    final_WALK();

                    state._fsp--;


                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:437:1: spec_const_8_25[String nameElement] : ( final_OP | final_IP | final_ER | final_PA | final_MP )? ;
    public final void spec_const_8_25(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:439:33: ( ( final_OP | final_IP | final_ER | final_PA | final_MP )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:440:3: ( final_OP | final_IP | final_ER | final_PA | final_MP )?
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:440:3: ( final_OP | final_IP | final_ER | final_PA | final_MP )?
            int alt140=6;
            switch ( input.LA(1) ) {
                case CHARO:
                    {
                    alt140=1;
                    }
                    break;
                case CHARI:
                    {
                    alt140=2;
                    }
                    break;
                case CHARE:
                    {
                    alt140=3;
                    }
                    break;
                case CHARP:
                    {
                    alt140=4;
                    }
                    break;
                case CHARM:
                    {
                    alt140=5;
                    }
                    break;
            }

            switch (alt140) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:440:4: final_OP
                    {
                    pushFollow(FOLLOW_final_OP_in_spec_const_8_253308);
                    final_OP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:440:15: final_IP
                    {
                    pushFollow(FOLLOW_final_IP_in_spec_const_8_253312);
                    final_IP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:440:26: final_ER
                    {
                    pushFollow(FOLLOW_final_ER_in_spec_const_8_253316);
                    final_ER();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:440:37: final_PA
                    {
                    pushFollow(FOLLOW_final_PA_in_spec_const_8_253320);
                    final_PA();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:440:48: final_MP
                    {
                    pushFollow(FOLLOW_final_MP_in_spec_const_8_253324);
                    final_MP();

                    state._fsp--;


                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:442:1: spec_const_9_26[String nameElement] : ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )? ;
    public final void spec_const_9_26(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:444:33: ( ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:3: ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )?
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:3: ( final_charF | final_charP | final_charM | final_charI | final_charR | final_charC | final_charO | final_charD | final_charX )?
            int alt141=10;
            switch ( input.LA(1) ) {
                case CHARF:
                    {
                    alt141=1;
                    }
                    break;
                case CHARP:
                    {
                    alt141=2;
                    }
                    break;
                case CHARM:
                    {
                    alt141=3;
                    }
                    break;
                case CHARI:
                    {
                    alt141=4;
                    }
                    break;
                case CHARR:
                    {
                    alt141=5;
                    }
                    break;
                case CHARC:
                    {
                    alt141=6;
                    }
                    break;
                case CHARO:
                    {
                    alt141=7;
                    }
                    break;
                case CHARD:
                    {
                    alt141=8;
                    }
                    break;
                case CHARX:
                    {
                    alt141=9;
                    }
                    break;
            }

            switch (alt141) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:4: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_9_263345);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:18: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_9_263349);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:32: final_charM
                    {
                    pushFollow(FOLLOW_final_charM_in_spec_const_9_263353);
                    final_charM();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:46: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_9_263357);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:60: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_9_263361);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:74: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_9_263365);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:445:88: final_charO
                    {
                    pushFollow(FOLLOW_final_charO_in_spec_const_9_263369);
                    final_charO();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:446:3: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_9_263375);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:446:17: final_charX
                    {
                    pushFollow(FOLLOW_final_charX_in_spec_const_9_263379);
                    final_charX();

                    state._fsp--;


                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:448:1: spec_const_10_3_nm[String nameElement] : CHARN CHARM ;
    public final HPRIMSParser.spec_const_10_3_nm_return spec_const_10_3_nm(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_nm_return retval = new HPRIMSParser.spec_const_10_3_nm_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:450:33: ( CHARN CHARM )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:451:3: CHARN CHARM
            {
            match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_nm3400); 

            match(input,CHARM,FOLLOW_CHARM_in_spec_const_10_3_nm3402); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:453:1: spec_const_10_3_ce[String nameElement] : CHARC CHARE ;
    public final HPRIMSParser.spec_const_10_3_ce_return spec_const_10_3_ce(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_ce_return retval = new HPRIMSParser.spec_const_10_3_ce_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:455:33: ( CHARC CHARE )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:456:3: CHARC CHARE
            {
            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_ce3423); 

            match(input,CHARE,FOLLOW_CHARE_in_spec_const_10_3_ce3425); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:458:1: spec_const_10_3_st[String nameElement] : CHARS CHART ;
    public final HPRIMSParser.spec_const_10_3_st_return spec_const_10_3_st(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_st_return retval = new HPRIMSParser.spec_const_10_3_st_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:460:33: ( CHARS CHART )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:461:3: CHARS CHART
            {
            match(input,CHARS,FOLLOW_CHARS_in_spec_const_10_3_st3446); 

            match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_st3448); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:463:1: spec_const_10_3_gc[String nameElement] : CHARG CHARC ;
    public final HPRIMSParser.spec_const_10_3_gc_return spec_const_10_3_gc(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_gc_return retval = new HPRIMSParser.spec_const_10_3_gc_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:465:33: ( CHARG CHARC )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:466:3: CHARG CHARC
            {
            match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_gc3469); 

            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_gc3471); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:468:1: spec_const_10_3_tx[String nameElement] : CHART CHARX ;
    public final HPRIMSParser.spec_const_10_3_tx_return spec_const_10_3_tx(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_tx_return retval = new HPRIMSParser.spec_const_10_3_tx_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:470:33: ( CHART CHARX )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:471:3: CHART CHARX
            {
            match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_tx3493); 

            match(input,CHARX,FOLLOW_CHARX_in_spec_const_10_3_tx3495); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:473:1: spec_const_10_3_fic[String nameElement] : ( CHARF CHARI CHARC ) ;
    public final HPRIMSParser.spec_const_10_3_fic_return spec_const_10_3_fic(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_fic_return retval = new HPRIMSParser.spec_const_10_3_fic_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:475:33: ( ( CHARF CHARI CHARC ) )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:476:3: ( CHARF CHARI CHARC )
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:476:3: ( CHARF CHARI CHARC )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:476:4: CHARF CHARI CHARC
            {
            match(input,CHARF,FOLLOW_CHARF_in_spec_const_10_3_fic3516); 

            match(input,CHARI,FOLLOW_CHARI_in_spec_const_10_3_fic3518); 

            match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_fic3520); 

            }


            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:478:1: spec_const_10_3_std[String nameElement] : ( ( CHARA CHARD ) | ( CHARC CHARK ) | ( CHARC CHARN CHARA ) | ( CHARD CHART ) | ( CHARP CHARN ) | ( CHART CHARN ) | ( CHARG CHARB ) | ( CHARG CHARN ) );
    public final HPRIMSParser.spec_const_10_3_std_return spec_const_10_3_std(String nameElement) throws RecognitionException {
        HPRIMSParser.spec_const_10_3_std_return retval = new HPRIMSParser.spec_const_10_3_std_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:480:33: ( ( CHARA CHARD ) | ( CHARC CHARK ) | ( CHARC CHARN CHARA ) | ( CHARD CHART ) | ( CHARP CHARN ) | ( CHART CHARN ) | ( CHARG CHARB ) | ( CHARG CHARN ) )
            int alt142=8;
            switch ( input.LA(1) ) {
            case CHARA:
                {
                alt142=1;
                }
                break;
            case CHARC:
                {
                int LA142_2 = input.LA(2);

                if ( (LA142_2==CHARK) ) {
                    alt142=2;
                }
                else if ( (LA142_2==CHARN) ) {
                    alt142=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 142, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHARD:
                {
                alt142=4;
                }
                break;
            case CHARP:
                {
                alt142=5;
                }
                break;
            case CHART:
                {
                alt142=6;
                }
                break;
            case CHARG:
                {
                int LA142_6 = input.LA(2);

                if ( (LA142_6==CHARB) ) {
                    alt142=7;
                }
                else if ( (LA142_6==CHARN) ) {
                    alt142=8;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 142, 6, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;

            }

            switch (alt142) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:3: ( CHARA CHARD )
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:3: ( CHARA CHARD )
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:4: CHARA CHARD
                    {
                    match(input,CHARA,FOLLOW_CHARA_in_spec_const_10_3_std3542); 

                    match(input,CHARD,FOLLOW_CHARD_in_spec_const_10_3_std3544); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:19: ( CHARC CHARK )
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:19: ( CHARC CHARK )
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:20: CHARC CHARK
                    {
                    match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_std3550); 

                    match(input,CHARK,FOLLOW_CHARK_in_spec_const_10_3_std3552); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:35: ( CHARC CHARN CHARA )
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:35: ( CHARC CHARN CHARA )
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:36: CHARC CHARN CHARA
                    {
                    match(input,CHARC,FOLLOW_CHARC_in_spec_const_10_3_std3558); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3560); 

                    match(input,CHARA,FOLLOW_CHARA_in_spec_const_10_3_std3562); 

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:57: ( CHARD CHART )
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:57: ( CHARD CHART )
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:481:58: CHARD CHART
                    {
                    match(input,CHARD,FOLLOW_CHARD_in_spec_const_10_3_std3568); 

                    match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_std3570); 

                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:482:3: ( CHARP CHARN )
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:482:3: ( CHARP CHARN )
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:482:4: CHARP CHARN
                    {
                    match(input,CHARP,FOLLOW_CHARP_in_spec_const_10_3_std3578); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3580); 

                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:482:19: ( CHART CHARN )
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:482:19: ( CHART CHARN )
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:482:20: CHART CHARN
                    {
                    match(input,CHART,FOLLOW_CHART_in_spec_const_10_3_std3586); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3588); 

                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:483:3: ( CHARG CHARB )
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:483:3: ( CHARG CHARB )
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:483:4: CHARG CHARB
                    {
                    match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_std3596); 

                    match(input,CHARB,FOLLOW_CHARB_in_spec_const_10_3_std3598); 

                    }


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:483:19: ( CHARG CHARN )
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:483:19: ( CHARG CHARN )
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:483:20: CHARG CHARN
                    {
                    match(input,CHARG,FOLLOW_CHARG_in_spec_const_10_3_std3604); 

                    match(input,CHARN,FOLLOW_CHARN_in_spec_const_10_3_std3606); 

                    }


                    collecteur.content(input.toString(retval.start,input.LT(-1)));

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:487:1: spec_sized_10_6[String nameElement, int maxSize] : st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )? ;
    public final HPRIMSParser.spec_sized_10_6_return spec_sized_10_6(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_10_6_return retval = new HPRIMSParser.spec_sized_10_6_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:489:33: ( st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:490:3: st_sized_optionnal[$nameElement + \".1\", 10] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )?
            {
            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_63629);
            st_sized_optionnal(nameElement + ".1", 10);

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:491:3: ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )? )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==DELIMITER2) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:491:4: DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 60] ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_63635); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_63637);
                    st_sized_optionnal(nameElement + ".2", 60);

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:492:4: ( DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10] )?
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==DELIMITER2) ) {
                        alt143=1;
                    }
                    switch (alt143) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:492:5: DELIMITER2 st_sized_optionnal[$nameElement + \".3\", 10]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_63644); 

                            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_10_63646);
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


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:495:1: spec_const_10_9[String nameElement] : ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )? ;
    public final void spec_const_10_9(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:497:33: ( ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:498:3: ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )?
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:498:3: ( final_charL | final_charH | final_LL | final_HH | final_symbol_inf | final_symbol_sup | final_charN | final_charA | final_AA | final_Null | final_charU | final_charD | final_charB | final_charW | final_charR | final_charI | final_charS | final_MS | final_VS )?
            int alt145=20;
            switch ( input.LA(1) ) {
                case CHARL:
                    {
                    int LA145_1 = input.LA(2);

                    if ( (LA145_1==CHARL) ) {
                        alt145=3;
                    }
                    else if ( ((LA145_1 >= CR && LA145_1 <= DELIMITER1)||LA145_1==REPETITEUR) ) {
                        alt145=1;
                    }
                    }
                    break;
                case CHARH:
                    {
                    int LA145_2 = input.LA(2);

                    if ( (LA145_2==CHARH) ) {
                        alt145=4;
                    }
                    else if ( ((LA145_2 >= CR && LA145_2 <= DELIMITER1)||LA145_2==REPETITEUR) ) {
                        alt145=2;
                    }
                    }
                    break;
                case CHAR_SYMBOL_INF:
                    {
                    alt145=5;
                    }
                    break;
                case CHAR_SYMBOL_SUP:
                    {
                    alt145=6;
                    }
                    break;
                case CHARN:
                    {
                    int LA145_5 = input.LA(2);

                    if ( (LA145_5==CHARu) ) {
                        alt145=10;
                    }
                    else if ( ((LA145_5 >= CR && LA145_5 <= DELIMITER1)||LA145_5==REPETITEUR) ) {
                        alt145=7;
                    }
                    }
                    break;
                case CHARA:
                    {
                    int LA145_6 = input.LA(2);

                    if ( (LA145_6==CHARA) ) {
                        alt145=9;
                    }
                    else if ( ((LA145_6 >= CR && LA145_6 <= DELIMITER1)||LA145_6==REPETITEUR) ) {
                        alt145=8;
                    }
                    }
                    break;
                case CHARU:
                    {
                    alt145=11;
                    }
                    break;
                case CHARD:
                    {
                    alt145=12;
                    }
                    break;
                case CHARB:
                    {
                    alt145=13;
                    }
                    break;
                case CHARW:
                    {
                    alt145=14;
                    }
                    break;
                case CHARR:
                    {
                    alt145=15;
                    }
                    break;
                case CHARI:
                    {
                    alt145=16;
                    }
                    break;
                case CHARS:
                    {
                    alt145=17;
                    }
                    break;
                case CHARM:
                    {
                    alt145=18;
                    }
                    break;
                case CHARV:
                    {
                    alt145=19;
                    }
                    break;
            }

            switch (alt145) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:498:4: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_10_93674);
                    final_charL();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:498:18: final_charH
                    {
                    pushFollow(FOLLOW_final_charH_in_spec_const_10_93678);
                    final_charH();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:498:32: final_LL
                    {
                    pushFollow(FOLLOW_final_LL_in_spec_const_10_93682);
                    final_LL();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:498:43: final_HH
                    {
                    pushFollow(FOLLOW_final_HH_in_spec_const_10_93686);
                    final_HH();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:498:54: final_symbol_inf
                    {
                    pushFollow(FOLLOW_final_symbol_inf_in_spec_const_10_93690);
                    final_symbol_inf();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:498:73: final_symbol_sup
                    {
                    pushFollow(FOLLOW_final_symbol_sup_in_spec_const_10_93694);
                    final_symbol_sup();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:3: final_charN
                    {
                    pushFollow(FOLLOW_final_charN_in_spec_const_10_93700);
                    final_charN();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:17: final_charA
                    {
                    pushFollow(FOLLOW_final_charA_in_spec_const_10_93704);
                    final_charA();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:31: final_AA
                    {
                    pushFollow(FOLLOW_final_AA_in_spec_const_10_93708);
                    final_AA();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:42: final_Null
                    {
                    pushFollow(FOLLOW_final_Null_in_spec_const_10_93712);
                    final_Null();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:55: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_10_93716);
                    final_charU();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:69: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_10_93720);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:499:83: final_charB
                    {
                    pushFollow(FOLLOW_final_charB_in_spec_const_10_93724);
                    final_charB();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:500:3: final_charW
                    {
                    pushFollow(FOLLOW_final_charW_in_spec_const_10_93730);
                    final_charW();

                    state._fsp--;


                    }
                    break;
                case 15 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:500:17: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_93734);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 16 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:500:31: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_10_93738);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 17 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:500:45: final_charS
                    {
                    pushFollow(FOLLOW_final_charS_in_spec_const_10_93742);
                    final_charS();

                    state._fsp--;


                    }
                    break;
                case 18 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:500:59: final_MS
                    {
                    pushFollow(FOLLOW_final_MS_in_spec_const_10_93746);
                    final_MS();

                    state._fsp--;


                    }
                    break;
                case 19 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:500:70: final_VS
                    {
                    pushFollow(FOLLOW_final_VS_in_spec_const_10_93750);
                    final_VS();

                    state._fsp--;


                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:502:1: spec_const_10_11[String nameElement] : ( final_charA | final_charS | final_charR | final_charN )? ;
    public final void spec_const_10_11(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:504:33: ( ( final_charA | final_charS | final_charR | final_charN )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:3: ( final_charA | final_charS | final_charR | final_charN )?
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:3: ( final_charA | final_charS | final_charR | final_charN )?
            int alt146=5;
            switch ( input.LA(1) ) {
                case CHARA:
                    {
                    alt146=1;
                    }
                    break;
                case CHARS:
                    {
                    alt146=2;
                    }
                    break;
                case CHARR:
                    {
                    alt146=3;
                    }
                    break;
                case CHARN:
                    {
                    alt146=4;
                    }
                    break;
            }

            switch (alt146) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:4: final_charA
                    {
                    pushFollow(FOLLOW_final_charA_in_spec_const_10_113771);
                    final_charA();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:18: final_charS
                    {
                    pushFollow(FOLLOW_final_charS_in_spec_const_10_113775);
                    final_charS();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:32: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_113779);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:505:46: final_charN
                    {
                    pushFollow(FOLLOW_final_charN_in_spec_const_10_113783);
                    final_charN();

                    state._fsp--;


                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:507:1: spec_const_10_12[String nameElement] : ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )? ;
    public final void spec_const_10_12(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:509:33: ( ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:510:3: ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )?
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:510:3: ( final_charR | final_charP | final_charF | final_charC | final_charI | final_charD | final_charX | final_charU )?
            int alt147=9;
            switch ( input.LA(1) ) {
                case CHARR:
                    {
                    alt147=1;
                    }
                    break;
                case CHARP:
                    {
                    alt147=2;
                    }
                    break;
                case CHARF:
                    {
                    alt147=3;
                    }
                    break;
                case CHARC:
                    {
                    alt147=4;
                    }
                    break;
                case CHARI:
                    {
                    alt147=5;
                    }
                    break;
                case CHARD:
                    {
                    alt147=6;
                    }
                    break;
                case CHARX:
                    {
                    alt147=7;
                    }
                    break;
                case CHARU:
                    {
                    alt147=8;
                    }
                    break;
            }

            switch (alt147) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:510:4: final_charR
                    {
                    pushFollow(FOLLOW_final_charR_in_spec_const_10_123804);
                    final_charR();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:510:18: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_10_123808);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:510:32: final_charF
                    {
                    pushFollow(FOLLOW_final_charF_in_spec_const_10_123812);
                    final_charF();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:510:46: final_charC
                    {
                    pushFollow(FOLLOW_final_charC_in_spec_const_10_123816);
                    final_charC();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:510:60: final_charI
                    {
                    pushFollow(FOLLOW_final_charI_in_spec_const_10_123820);
                    final_charI();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:510:74: final_charD
                    {
                    pushFollow(FOLLOW_final_charD_in_spec_const_10_123824);
                    final_charD();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:511:4: final_charX
                    {
                    pushFollow(FOLLOW_final_charX_in_spec_const_10_123831);
                    final_charX();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:511:18: final_charU
                    {
                    pushFollow(FOLLOW_final_charU_in_spec_const_10_123835);
                    final_charU();

                    state._fsp--;


                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:513:1: spec_const_12_3[String nameElement] : ( final_charP | final_charL )? ;
    public final void spec_const_12_3(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:515:33: ( ( final_charP | final_charL )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:516:3: ( final_charP | final_charL )?
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:516:3: ( final_charP | final_charL )?
            int alt148=3;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==CHARP) ) {
                alt148=1;
            }
            else if ( (LA148_0==CHARL) ) {
                alt148=2;
            }
            switch (alt148) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:516:4: final_charP
                    {
                    pushFollow(FOLLOW_final_charP_in_spec_const_12_33856);
                    final_charP();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:516:18: final_charL
                    {
                    pushFollow(FOLLOW_final_charL_in_spec_const_12_33860);
                    final_charL();

                    state._fsp--;


                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:518:1: spec_sized_mult_lvl1_st_mandatory_2[String nameElement, int maxSize] : st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return spec_sized_mult_lvl1_st_mandatory_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_mandatory_2_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:520:33: ( st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:521:3: st_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 st_nonsized_mandatory[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_23880);
            st_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_23886); 

            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_23888);
            st_nonsized_mandatory(nameElement + ".2");

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:525:1: spec_sized_mult_lvl1_st_optionnal_2[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return spec_sized_mult_lvl1_st_optionnal_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_2_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:527:33: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:528:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_23911);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:529:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==DELIMITER2) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:529:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"]
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_23917); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_23919);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:533:1: spec_sized_mult_lvl1_st_optionnal_4[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return spec_sized_mult_lvl1_st_optionnal_4(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_4_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:535:33: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:536:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_43944);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:537:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )? )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==DELIMITER2) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:537:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_43950); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_43952);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:538:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )? )?
                    int alt151=2;
                    int LA151_0 = input.LA(1);

                    if ( (LA151_0==DELIMITER2) ) {
                        alt151=1;
                    }
                    switch (alt151) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:538:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_43959); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_43961);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] )?
                            int alt150=2;
                            int LA150_0 = input.LA(1);

                            if ( (LA150_0==DELIMITER2) ) {
                                alt150=1;
                            }
                            switch (alt150) {
                                case 1 :
                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:539:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"]
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_43969); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_43971);
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


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:543:1: spec_sized_mult_lvl1_st_optionnal_6[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return spec_sized_mult_lvl1_st_optionnal_6(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_6_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:545:33: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:546:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64000);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:547:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==DELIMITER2) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:547:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64007); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64009);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:548:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    int alt156=2;
                    int LA156_0 = input.LA(1);

                    if ( (LA156_0==DELIMITER2) ) {
                        alt156=1;
                    }
                    switch (alt156) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:548:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64017); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64019);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:6: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            int alt155=2;
                            int LA155_0 = input.LA(1);

                            if ( (LA155_0==DELIMITER2) ) {
                                alt155=1;
                            }
                            switch (alt155) {
                                case 1 :
                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:549:7: DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64028); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64030);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:550:7: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    int alt154=2;
                                    int LA154_0 = input.LA(1);

                                    if ( (LA154_0==DELIMITER2) ) {
                                        alt154=1;
                                    }
                                    switch (alt154) {
                                        case 1 :
                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:550:8: DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64040); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64042);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:551:8: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            int alt153=2;
                                            int LA153_0 = input.LA(1);

                                            if ( (LA153_0==DELIMITER2) ) {
                                                alt153=1;
                                            }
                                            switch (alt153) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:551:9: DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64053); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64055);
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


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:555:1: spec_sized_mult_lvl1_st_optionnal_8[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return spec_sized_mult_lvl1_st_optionnal_8(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return retval = new HPRIMSParser.spec_sized_mult_lvl1_st_optionnal_8_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:557:33: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:558:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84088);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:559:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )? )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==DELIMITER2) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:559:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84094); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84096);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:560:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )? )?
                    int alt163=2;
                    int LA163_0 = input.LA(1);

                    if ( (LA163_0==DELIMITER2) ) {
                        alt163=1;
                    }
                    switch (alt163) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:560:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84103); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84105);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:561:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )? )?
                            int alt162=2;
                            int LA162_0 = input.LA(1);

                            if ( (LA162_0==DELIMITER2) ) {
                                alt162=1;
                            }
                            switch (alt162) {
                                case 1 :
                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:561:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84113); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84115);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:562:6: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )? )?
                                    int alt161=2;
                                    int LA161_0 = input.LA(1);

                                    if ( (LA161_0==DELIMITER2) ) {
                                        alt161=1;
                                    }
                                    switch (alt161) {
                                        case 1 :
                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:562:7: DELIMITER2 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84124); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84126);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:563:7: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )? )?
                                            int alt160=2;
                                            int LA160_0 = input.LA(1);

                                            if ( (LA160_0==DELIMITER2) ) {
                                                alt160=1;
                                            }
                                            switch (alt160) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:563:8: DELIMITER2 st_non_sized_optionnal[$nameElement + \".6\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )?
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84136); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84138);
                                                    st_non_sized_optionnal(nameElement + ".6");

                                                    state._fsp--;


                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:564:8: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )? )?
                                                    int alt159=2;
                                                    int LA159_0 = input.LA(1);

                                                    if ( (LA159_0==DELIMITER2) ) {
                                                        alt159=1;
                                                    }
                                                    switch (alt159) {
                                                        case 1 :
                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:564:9: DELIMITER2 st_non_sized_optionnal[$nameElement + \".7\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )?
                                                            {
                                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84149); 

                                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84151);
                                                            st_non_sized_optionnal(nameElement + ".7");

                                                            state._fsp--;


                                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:565:9: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"] )?
                                                            int alt158=2;
                                                            int LA158_0 = input.LA(1);

                                                            if ( (LA158_0==DELIMITER2) ) {
                                                                alt158=1;
                                                            }
                                                            switch (alt158) {
                                                                case 1 :
                                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:565:10: DELIMITER2 st_non_sized_optionnal[$nameElement + \".8\"]
                                                                    {
                                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84163); 

                                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84165);
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


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:569:1: spec_sized_mult_lvl2_st_optionnal_3[String nameElement] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final void spec_sized_mult_lvl2_st_optionnal_3(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:571:33: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:572:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34202);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:573:3: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==DELIMITER3) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:573:4: DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34208); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34210);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:574:4: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt165=2;
                    int LA165_0 = input.LA(1);

                    if ( (LA165_0==DELIMITER3) ) {
                        alt165=1;
                    }
                    switch (alt165) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:574:5: DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34217); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34219);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:576:1: spec_sized_mult_lvl2_st_optionnal_6[String nameElement] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? ;
    public final void spec_sized_mult_lvl2_st_optionnal_6(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:578:33: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:579:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64242);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:580:3: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )? )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==DELIMITER3) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:580:4: DELIMITER3 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64248); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64250);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:581:4: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )? )?
                    int alt170=2;
                    int LA170_0 = input.LA(1);

                    if ( (LA170_0==DELIMITER3) ) {
                        alt170=1;
                    }
                    switch (alt170) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:581:5: DELIMITER3 st_non_sized_optionnal[$nameElement + \".3\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64257); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64259);
                            st_non_sized_optionnal(nameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:582:5: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )? )?
                            int alt169=2;
                            int LA169_0 = input.LA(1);

                            if ( (LA169_0==DELIMITER3) ) {
                                alt169=1;
                            }
                            switch (alt169) {
                                case 1 :
                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:582:6: DELIMITER3 st_non_sized_optionnal[$nameElement + \".4\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64267); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64269);
                                    st_non_sized_optionnal(nameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:583:6: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )? )?
                                    int alt168=2;
                                    int LA168_0 = input.LA(1);

                                    if ( (LA168_0==DELIMITER3) ) {
                                        alt168=1;
                                    }
                                    switch (alt168) {
                                        case 1 :
                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:583:7: DELIMITER3 st_non_sized_optionnal[$nameElement + \".5\"] ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64278); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64280);
                                            st_non_sized_optionnal(nameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:584:7: ( DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"] )?
                                            int alt167=2;
                                            int LA167_0 = input.LA(1);

                                            if ( (LA167_0==DELIMITER3) ) {
                                                alt167=1;
                                            }
                                            switch (alt167) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:584:8: DELIMITER3 st_non_sized_optionnal[$nameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER3,FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64290); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64292);
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

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:586:1: spec_sized_mult_lvl1_nm_optionnal_2[String nameElement, int maxSize] : nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return spec_sized_mult_lvl1_nm_optionnal_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_nm_optionnal_2_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:588:33: ( nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:589:3: nm_nonsized_optionnal[$nameElement + \".1\"] DELIMITER2 nm_nonsized_optionnal[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24321);
            nm_nonsized_optionnal(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_optionnal_24326); 

            pushFollow(FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24328);
            nm_nonsized_optionnal(nameElement + ".2");

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:593:1: spec_sized_mult_lvl1_nm_mandatory_2[String nameElement, int maxSize] : nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"] ;
    public final HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return spec_sized_mult_lvl1_nm_mandatory_2(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return retval = new HPRIMSParser.spec_sized_mult_lvl1_nm_mandatory_2_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:595:33: ( nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"] )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:596:3: nm_nonsized_mandatory[$nameElement + \".1\"] DELIMITER2 nm_nonsized_mandatory[$nameElement + \".2\"]
            {
            pushFollow(FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24353);
            nm_nonsized_mandatory(nameElement + ".1");

            state._fsp--;


            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_mandatory_24358); 

            pushFollow(FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24360);
            nm_nonsized_mandatory(nameElement + ".2");

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:600:1: spec_sized_cna[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_cna_return spec_sized_cna(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_cna_return retval = new HPRIMSParser.spec_sized_cna_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:602:33: ( st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:603:3: st_non_sized_optionnal[$nameElement + \".1\"] ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4383);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:604:4: ( DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==DELIMITER2) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:604:5: DELIMITER2 spec_sized_mult_lvl2_st_optionnal_6[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna4390); 

                    pushFollow(FOLLOW_spec_sized_mult_lvl2_st_optionnal_6_in_spec_sized_cna4392);
                    spec_sized_mult_lvl2_st_optionnal_6(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:605:5: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt172=2;
                    int LA172_0 = input.LA(1);

                    if ( (LA172_0==DELIMITER2) ) {
                        alt172=1;
                    }
                    switch (alt172) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:605:6: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_cna4400); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4402);
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


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:609:1: spec_sized_8_3[String nameElement, int maxSize] : st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? ;
    public final HPRIMSParser.spec_sized_8_3_return spec_sized_8_3(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_8_3_return retval = new HPRIMSParser.spec_sized_8_3_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:611:33: ( st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:612:3: st_sized_mandatory[$nameElement + \".1\", 16] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
            {
            pushFollow(FOLLOW_st_sized_mandatory_in_spec_sized_8_34429);
            st_sized_mandatory(nameElement + ".1", 16);

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:613:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==DELIMITER2) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:613:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_8_34435); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34437);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_8_34444); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34446);
                    st_non_sized_optionnal(nameElement + ".3");

                    state._fsp--;


                    }
                    break;

            }


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:625:1: spec_sized_9_3[String nameElement, int maxSize] : st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )? ;
    public final HPRIMSParser.spec_sized_9_3_return spec_sized_9_3(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_9_3_return retval = new HPRIMSParser.spec_sized_9_3_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:627:33: ( st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:629:3: st_sized_optionnal[$nameElement + \".1\", 12] ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )?
            {
            pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_9_34483);
            st_sized_optionnal(nameElement + ".1", 12);

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:630:3: ( DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10] )?
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==DELIMITER2) ) {
                alt175=1;
            }
            switch (alt175) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:630:4: DELIMITER2 st_sized_optionnal[$nameElement + \".2\", 10]
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_34489); 

                    pushFollow(FOLLOW_st_sized_optionnal_in_spec_sized_9_34491);
                    st_sized_optionnal(nameElement + ".2", 10);

                    state._fsp--;


                    }
                    break;

            }


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:633:1: spec_non_sized_9_8[String nameElement] : ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )? ;
    public final void spec_non_sized_9_8(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:635:33: ( ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:636:3: ts_sized_optionnal[$nameElement + \".1\", 26] ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )?
            {
            pushFollow(FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84516);
            ts_sized_optionnal(nameElement + ".1", 26);

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:637:4: ( REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26] )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==REPETITEUR) ) {
                alt176=1;
            }
            switch (alt176) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:637:5: REPETITEUR ts_sized_optionnal[$nameElement + \".2\", 26]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_spec_non_sized_9_84523); 

                    pushFollow(FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84525);
                    ts_sized_optionnal(nameElement + ".2", 26);

                    state._fsp--;


                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:639:1: spec_sized_9_16[String nameElement, int maxSize] : spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? ;
    public final HPRIMSParser.spec_sized_9_16_return spec_sized_9_16(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_9_16_return retval = new HPRIMSParser.spec_sized_9_16_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:641:33: ( spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:642:3: spec_sized_mult_lvl2_st_optionnal_3[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            {
            pushFollow(FOLLOW_spec_sized_mult_lvl2_st_optionnal_3_in_spec_sized_9_164546);
            spec_sized_mult_lvl2_st_optionnal_3(nameElement + ".2");

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:643:3: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )? )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==DELIMITER2) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:643:4: DELIMITER2 st_non_sized_optionnal[$nameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_164552); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164554);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:644:4: ( DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"] )?
                    int alt177=2;
                    int LA177_0 = input.LA(1);

                    if ( (LA177_0==DELIMITER2) ) {
                        alt177=1;
                    }
                    switch (alt177) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:644:5: DELIMITER2 st_non_sized_optionnal[$nameElement + \".3\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_9_164561); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164563);
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


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:647:1: spec_sized_10_4[String my_NameElement, int my_maxsize] : st_nonsized_mandatory[$my_NameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )? )? ;
    public final HPRIMSParser.spec_sized_10_4_return spec_sized_10_4(String my_NameElement, int my_maxsize) throws RecognitionException {
        HPRIMSParser.spec_sized_10_4_return retval = new HPRIMSParser.spec_sized_10_4_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", my_NameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:649:33: ( st_nonsized_mandatory[$my_NameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )? )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:650:3: st_nonsized_mandatory[$my_NameElement + \".1\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )? )?
            {
            pushFollow(FOLLOW_st_nonsized_mandatory_in_spec_sized_10_44590);
            st_nonsized_mandatory(my_NameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:651:3: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )? )?
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==DELIMITER2) ) {
                alt183=1;
            }
            switch (alt183) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:651:4: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".2\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )?
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44596); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44598);
                    st_non_sized_optionnal(my_NameElement + ".2");

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:652:4: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )? )?
                    int alt182=2;
                    int LA182_0 = input.LA(1);

                    if ( (LA182_0==DELIMITER2) ) {
                        alt182=1;
                    }
                    switch (alt182) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:652:5: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".3\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )?
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44605); 

                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44607);
                            st_non_sized_optionnal(my_NameElement + ".3");

                            state._fsp--;


                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:653:5: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )? )?
                            int alt181=2;
                            int LA181_0 = input.LA(1);

                            if ( (LA181_0==DELIMITER2) ) {
                                alt181=1;
                            }
                            switch (alt181) {
                                case 1 :
                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:653:6: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".4\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )?
                                    {
                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44615); 

                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44617);
                                    st_non_sized_optionnal(my_NameElement + ".4");

                                    state._fsp--;


                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:654:6: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )? )?
                                    int alt180=2;
                                    int LA180_0 = input.LA(1);

                                    if ( (LA180_0==DELIMITER2) ) {
                                        alt180=1;
                                    }
                                    switch (alt180) {
                                        case 1 :
                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:654:7: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".5\"] ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )?
                                            {
                                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44626); 

                                            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44628);
                                            st_non_sized_optionnal(my_NameElement + ".5");

                                            state._fsp--;


                                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:655:7: ( DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"] )?
                                            int alt179=2;
                                            int LA179_0 = input.LA(1);

                                            if ( (LA179_0==DELIMITER2) ) {
                                                alt179=1;
                                            }
                                            switch (alt179) {
                                                case 1 :
                                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:655:8: DELIMITER2 st_non_sized_optionnal[$my_NameElement + \".6\"]
                                                    {
                                                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_spec_sized_10_44638); 

                                                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44640);
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


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:658:1: spec_sized_10_6_tx[String nameElement, int maxSize] : (g= final_spec_10_6_tx )? ;
    public final void spec_sized_10_6_tx(String nameElement, int maxSize) throws RecognitionException {
        String g =null;



          ParserRuleReturnScope retval = new ParserRuleReturnScope();
          retval.start = input.LT(1);
          collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:663:33: ( (g= final_spec_10_6_tx )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:664:3: (g= final_spec_10_6_tx )?
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:664:4: (g= final_spec_10_6_tx )?
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( ((LA184_0 >= CHARA && LA184_0 <= CHIFFRE9)||LA184_0==DELIMITER2||(LA184_0 >= LETTRE && LA184_0 <= POINT)) ) {
                alt184=1;
            }
            switch (alt184) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:664:4: g= final_spec_10_6_tx
                    {
                    pushFollow(FOLLOW_final_spec_10_6_tx_in_spec_sized_10_6_tx4675);
                    g=final_spec_10_6_tx();

                    state._fsp--;


                    }
                    break;

            }


            if (g != null)
                matchRegex(g, "^.{0," + maxSize + "}$", retval.start);

            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:668:1: spec_sized_tn[String nameElement, int maxSize] : st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )? ;
    public final HPRIMSParser.spec_sized_tn_return spec_sized_tn(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.spec_sized_tn_return retval = new HPRIMSParser.spec_sized_tn_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:670:33: ( st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:671:2: st_non_sized_optionnal[$nameElement + \".1\"] ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )?
            {
            pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4697);
            st_non_sized_optionnal(nameElement + ".1");

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:672:3: ( REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"] )?
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==REPETITEUR) ) {
                alt185=1;
            }
            switch (alt185) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:672:4: REPETITEUR st_non_sized_optionnal[$nameElement + \".2\"]
                    {
                    match(input,REPETITEUR,FOLLOW_REPETITEUR_in_spec_sized_tn4703); 

                    pushFollow(FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4705);
                    st_non_sized_optionnal(nameElement + ".2");

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:678:1: st_sized_optionnal[String nameElement, int maxSize] : ( final_st )? ;
    public final HPRIMSParser.st_sized_optionnal_return st_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.st_sized_optionnal_return retval = new HPRIMSParser.st_sized_optionnal_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:680:33: ( ( final_st )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:681:3: ( final_st )?
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:681:3: ( final_st )?
            int alt186=2;
            int LA186_0 = input.LA(1);

            if ( ((LA186_0 >= CHARA && LA186_0 <= CHIFFRE9)||(LA186_0 >= LETTRE && LA186_0 <= POINT)) ) {
                alt186=1;
            }
            switch (alt186) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:681:3: final_st
                    {
                    pushFollow(FOLLOW_final_st_in_st_sized_optionnal4733);
                    final_st();

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                 matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:685:1: st_sized_mandatory[String nameElement, int maxSize] : final_st ;
    public final HPRIMSParser.st_sized_mandatory_return st_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.st_sized_mandatory_return retval = new HPRIMSParser.st_sized_mandatory_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:687:33: ( final_st )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:688:3: final_st
            {
            pushFollow(FOLLOW_final_st_in_st_sized_mandatory4756);
            final_st();

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:691:1: st_non_sized_optionnal[String nameElement] : ( final_st )? ;
    public final void st_non_sized_optionnal(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:693:33: ( ( final_st )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:694:3: ( final_st )?
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:694:3: ( final_st )?
            int alt187=2;
            int LA187_0 = input.LA(1);

            if ( ((LA187_0 >= CHARA && LA187_0 <= CHIFFRE9)||(LA187_0 >= LETTRE && LA187_0 <= POINT)) ) {
                alt187=1;
            }
            switch (alt187) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:694:3: final_st
                    {
                    pushFollow(FOLLOW_final_st_in_st_non_sized_optionnal4778);
                    final_st();

                    state._fsp--;


                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:696:1: st_nonsized_mandatory[String nameElement] : final_st ;
    public final void st_nonsized_mandatory(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:698:33: ( final_st )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:699:3: final_st
            {
            pushFollow(FOLLOW_final_st_in_st_nonsized_mandatory4797);
            final_st();

            state._fsp--;


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:701:1: nm_sized_optionnal[String nameElement, int maxSize] : ( final_nm )? ;
    public final HPRIMSParser.nm_sized_optionnal_return nm_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_sized_optionnal_return retval = new HPRIMSParser.nm_sized_optionnal_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:703:33: ( ( final_nm )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:704:3: ( final_nm )?
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:704:3: ( final_nm )?
            int alt188=2;
            int LA188_0 = input.LA(1);

            if ( ((LA188_0 >= CHIFFRE0 && LA188_0 <= CHIFFRE9)||(LA188_0 >= MOINS && LA188_0 <= POINT)) ) {
                alt188=1;
            }
            switch (alt188) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:704:3: final_nm
                    {
                    pushFollow(FOLLOW_final_nm_in_nm_sized_optionnal4815);
                    final_nm();

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                 matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:708:1: nm_integer_sized_optionnal[String nameElement, int maxSize] : ( final_nm_integer )? ;
    public final HPRIMSParser.nm_integer_sized_optionnal_return nm_integer_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_integer_sized_optionnal_return retval = new HPRIMSParser.nm_integer_sized_optionnal_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:710:33: ( ( final_nm_integer )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:711:3: ( final_nm_integer )?
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:711:3: ( final_nm_integer )?
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( ((LA189_0 >= CHIFFRE0 && LA189_0 <= CHIFFRE9)) ) {
                alt189=1;
            }
            switch (alt189) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:711:3: final_nm_integer
                    {
                    pushFollow(FOLLOW_final_nm_integer_in_nm_integer_sized_optionnal4838);
                    final_nm_integer();

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                 matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:715:1: nm_integer_sized_mandatory[String nameElement, int maxSize] : final_nm_integer ;
    public final HPRIMSParser.nm_integer_sized_mandatory_return nm_integer_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.nm_integer_sized_mandatory_return retval = new HPRIMSParser.nm_integer_sized_mandatory_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:717:33: ( final_nm_integer )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:718:3: final_nm_integer
            {
            pushFollow(FOLLOW_final_nm_integer_in_nm_integer_sized_mandatory4866);
            final_nm_integer();

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:722:1: ts_sized_optionnal[String nameElement, int maxSize] : ( final_ts )? ;
    public final HPRIMSParser.ts_sized_optionnal_return ts_sized_optionnal(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.ts_sized_optionnal_return retval = new HPRIMSParser.ts_sized_optionnal_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:724:33: ( ( final_ts )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:725:3: ( final_ts )?
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:725:3: ( final_ts )?
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( ((LA190_0 >= CHIFFRE0 && LA190_0 <= CHIFFRE9)) ) {
                alt190=1;
            }
            switch (alt190) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:725:3: final_ts
                    {
                    pushFollow(FOLLOW_final_ts_in_ts_sized_optionnal4889);
                    final_ts();

                    state._fsp--;


                    }
                    break;

            }


            if (input.toString(retval.start,input.LT(-1)) != null)
                matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:729:1: ts_sized_mandatory[String nameElement, int maxSize] : final_ts ;
    public final HPRIMSParser.ts_sized_mandatory_return ts_sized_mandatory(String nameElement, int maxSize) throws RecognitionException {
        HPRIMSParser.ts_sized_mandatory_return retval = new HPRIMSParser.ts_sized_mandatory_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:731:33: ( final_ts )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:732:3: final_ts
            {
            pushFollow(FOLLOW_final_ts_in_ts_sized_mandatory4912);
            final_ts();

            state._fsp--;


            matchRegex(input.toString(retval.start,input.LT(-1)), "^.{0," + maxSize + "}$", retval.start);

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:735:1: nm_nonsized_mandatory[String nameElement] : final_nm ;
    public final void nm_nonsized_mandatory(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:737:33: ( final_nm )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:738:3: final_nm
            {
            pushFollow(FOLLOW_final_nm_in_nm_nonsized_mandatory4934);
            final_nm();

            state._fsp--;


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:740:1: nm_nonsized_optionnal[String nameElement] : ( final_nm )? ;
    public final void nm_nonsized_optionnal(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:742:33: ( ( final_nm )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:743:3: ( final_nm )?
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:743:3: ( final_nm )?
            int alt191=2;
            int LA191_0 = input.LA(1);

            if ( ((LA191_0 >= CHIFFRE0 && LA191_0 <= CHIFFRE9)||(LA191_0 >= MOINS && LA191_0 <= POINT)) ) {
                alt191=1;
            }
            switch (alt191) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:743:3: final_nm
                    {
                    pushFollow(FOLLOW_final_nm_in_nm_nonsized_optionnal4952);
                    final_nm();

                    state._fsp--;


                    }
                    break;

            }


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:745:1: spec_const_7_13_1_version_2_0[String nameElement] : final_version_2_0 ;
    public final void spec_const_7_13_1_version_2_0(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:747:33: ( final_version_2_0 )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:748:3: final_version_2_0
            {
            pushFollow(FOLLOW_final_version_2_0_in_spec_const_7_13_1_version_2_04971);
            final_version_2_0();

            state._fsp--;


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:750:1: spec_const_7_13_1_version_2_1[String nameElement] : final_version_2_1 ;
    public final void spec_const_7_13_1_version_2_1(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:752:33: ( final_version_2_1 )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:753:3: final_version_2_1
            {
            pushFollow(FOLLOW_final_version_2_1_in_spec_const_7_13_1_version_2_14989);
            final_version_2_1();

            state._fsp--;


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:755:1: spec_const_7_13_1_version_2_2[String nameElement] : final_version_2_2 ;
    public final void spec_const_7_13_1_version_2_2(String nameElement) throws RecognitionException {
        collecteur.startElement("champ", nameElement);
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:757:33: ( final_version_2_2 )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:758:3: final_version_2_2
            {
            pushFollow(FOLLOW_final_version_2_2_in_spec_const_7_13_1_version_2_25009);
            final_version_2_2();

            state._fsp--;


            }

            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:762:1: final_spec_10_6_tx returns [String consoText] : g= content_spec_10_6 ;
    public final String final_spec_10_6_tx() throws RecognitionException {
        String consoText = null;


        String g =null;


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:762:46: (g= content_spec_10_6 )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:763:3: g= content_spec_10_6
            {
            pushFollow(FOLLOW_content_spec_10_6_in_final_spec_10_6_tx5026);
            g=content_spec_10_6();

            state._fsp--;


            collecteur.content(g);
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:767:1: content_spec_10_6 returns [String consoText] : (r= character | DELIMITER2 ) (p= content_spec_10_6 )? ;
    public final String content_spec_10_6() throws RecognitionException {
        String consoText = null;


        HPRIMSParser.character_return r =null;

        String p =null;


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:767:45: ( (r= character | DELIMITER2 ) (p= content_spec_10_6 )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:768:3: (r= character | DELIMITER2 ) (p= content_spec_10_6 )?
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:768:3: (r= character | DELIMITER2 )
            int alt192=2;
            int LA192_0 = input.LA(1);

            if ( ((LA192_0 >= CHARA && LA192_0 <= CHIFFRE9)||(LA192_0 >= LETTRE && LA192_0 <= POINT)) ) {
                alt192=1;
            }
            else if ( (LA192_0==DELIMITER2) ) {
                alt192=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 192, 0, input);

                throw nvae;

            }
            switch (alt192) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:768:4: r= character
                    {
                    pushFollow(FOLLOW_character_in_content_spec_10_65048);
                    r=character();

                    state._fsp--;


                    consoText = (r!=null?input.toString(r.start,r.stop):null);

                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:768:42: DELIMITER2
                    {
                    match(input,DELIMITER2,FOLLOW_DELIMITER2_in_content_spec_10_65054); 

                    consoText = "\n";

                    }
                    break;

            }


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:769:6: (p= content_spec_10_6 )?
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( ((LA193_0 >= CHARA && LA193_0 <= CHIFFRE9)||LA193_0==DELIMITER2||(LA193_0 >= LETTRE && LA193_0 <= POINT)) ) {
                alt193=1;
            }
            switch (alt193) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:769:6: p= content_spec_10_6
                    {
                    pushFollow(FOLLOW_content_spec_10_6_in_content_spec_10_65065);
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:771:1: final_ts : chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )? ;
    public final HPRIMSParser.final_ts_return final_ts() throws RecognitionException {
        HPRIMSParser.final_ts_return retval = new HPRIMSParser.final_ts_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:771:9: ( chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )? )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:772:3: chiffre chiffre chiffre chiffre chiffre chiffre ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )?
            {
            pushFollow(FOLLOW_chiffre_in_final_ts5077);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5079);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5083);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5085);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5087);
            chiffre();

            state._fsp--;


            pushFollow(FOLLOW_chiffre_in_final_ts5091);
            chiffre();

            state._fsp--;


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:774:11: ( chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )? )?
            int alt196=2;
            int LA196_0 = input.LA(1);

            if ( ((LA196_0 >= CHIFFRE0 && LA196_0 <= CHIFFRE9)) ) {
                alt196=1;
            }
            switch (alt196) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:774:12: chiffre chiffre ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )?
                    {
                    pushFollow(FOLLOW_chiffre_in_final_ts5094);
                    chiffre();

                    state._fsp--;


                    pushFollow(FOLLOW_chiffre_in_final_ts5096);
                    chiffre();

                    state._fsp--;


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:775:3: ( chiffre chiffre chiffre chiffre ( chiffre chiffre )? )?
                    int alt195=2;
                    int LA195_0 = input.LA(1);

                    if ( ((LA195_0 >= CHIFFRE0 && LA195_0 <= CHIFFRE9)) ) {
                        alt195=1;
                    }
                    switch (alt195) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:775:4: chiffre chiffre chiffre chiffre ( chiffre chiffre )?
                            {
                            pushFollow(FOLLOW_chiffre_in_final_ts5101);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5103);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5105);
                            chiffre();

                            state._fsp--;


                            pushFollow(FOLLOW_chiffre_in_final_ts5109);
                            chiffre();

                            state._fsp--;


                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:776:11: ( chiffre chiffre )?
                            int alt194=2;
                            int LA194_0 = input.LA(1);

                            if ( ((LA194_0 >= CHIFFRE0 && LA194_0 <= CHIFFRE9)) ) {
                                alt194=1;
                            }
                            switch (alt194) {
                                case 1 :
                                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:776:12: chiffre chiffre
                                    {
                                    pushFollow(FOLLOW_chiffre_in_final_ts5112);
                                    chiffre();

                                    state._fsp--;


                                    pushFollow(FOLLOW_chiffre_in_final_ts5114);
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


            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:779:1: final_st : ( character )+ ;
    public final HPRIMSParser.final_st_return final_st() throws RecognitionException {
        HPRIMSParser.final_st_return retval = new HPRIMSParser.final_st_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:779:9: ( ( character )+ )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:780:3: ( character )+
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:780:3: ( character )+
            int cnt197=0;
            loop197:
            do {
                int alt197=2;
                int LA197_0 = input.LA(1);

                if ( ((LA197_0 >= CHARA && LA197_0 <= CHIFFRE9)||(LA197_0 >= LETTRE && LA197_0 <= POINT)) ) {
                    alt197=1;
                }


                switch (alt197) {
            	case 1 :
            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:780:3: character
            	    {
            	    pushFollow(FOLLOW_character_in_final_st5133);
            	    character();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt197 >= 1 ) break loop197;
                        EarlyExitException eee =
                            new EarlyExitException(197, input);
                        throw eee;
                }
                cnt197++;
            } while (true);


            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:783:1: final_nm : ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) ) ;
    public final HPRIMSParser.final_nm_return final_nm() throws RecognitionException {
        HPRIMSParser.final_nm_return retval = new HPRIMSParser.final_nm_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:783:9: ( ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) ) )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:784:3: ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) )
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:784:3: ( ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) ) )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:784:4: ( PLUS | MOINS )? ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) )
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:784:4: ( PLUS | MOINS )?
            int alt198=2;
            int LA198_0 = input.LA(1);

            if ( ((LA198_0 >= MOINS && LA198_0 <= PLUS)) ) {
                alt198=1;
            }
            switch (alt198) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:
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


            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:785:3: ( ( ( chiffre )+ ( POINT ( chiffre )* )? ) | ( POINT ( chiffre )+ ) )
            int alt203=2;
            int LA203_0 = input.LA(1);

            if ( ((LA203_0 >= CHIFFRE0 && LA203_0 <= CHIFFRE9)) ) {
                alt203=1;
            }
            else if ( (LA203_0==POINT) ) {
                alt203=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 203, 0, input);

                throw nvae;

            }
            switch (alt203) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:785:4: ( ( chiffre )+ ( POINT ( chiffre )* )? )
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:785:4: ( ( chiffre )+ ( POINT ( chiffre )* )? )
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:785:5: ( chiffre )+ ( POINT ( chiffre )* )?
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:785:5: ( chiffre )+
                    int cnt199=0;
                    loop199:
                    do {
                        int alt199=2;
                        int LA199_0 = input.LA(1);

                        if ( ((LA199_0 >= CHIFFRE0 && LA199_0 <= CHIFFRE9)) ) {
                            alt199=1;
                        }


                        switch (alt199) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:785:5: chiffre
                    	    {
                    	    pushFollow(FOLLOW_chiffre_in_final_nm5162);
                    	    chiffre();

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


                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:785:14: ( POINT ( chiffre )* )?
                    int alt201=2;
                    int LA201_0 = input.LA(1);

                    if ( (LA201_0==POINT) ) {
                        alt201=1;
                    }
                    switch (alt201) {
                        case 1 :
                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:785:15: POINT ( chiffre )*
                            {
                            match(input,POINT,FOLLOW_POINT_in_final_nm5166); 

                            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:785:21: ( chiffre )*
                            loop200:
                            do {
                                int alt200=2;
                                int LA200_0 = input.LA(1);

                                if ( ((LA200_0 >= CHIFFRE0 && LA200_0 <= CHIFFRE9)) ) {
                                    alt200=1;
                                }


                                switch (alt200) {
                            	case 1 :
                            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:785:21: chiffre
                            	    {
                            	    pushFollow(FOLLOW_chiffre_in_final_nm5168);
                            	    chiffre();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop200;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:786:4: ( POINT ( chiffre )+ )
                    {
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:786:4: ( POINT ( chiffre )+ )
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:786:5: POINT ( chiffre )+
                    {
                    match(input,POINT,FOLLOW_POINT_in_final_nm5178); 

                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:786:11: ( chiffre )+
                    int cnt202=0;
                    loop202:
                    do {
                        int alt202=2;
                        int LA202_0 = input.LA(1);

                        if ( ((LA202_0 >= CHIFFRE0 && LA202_0 <= CHIFFRE9)) ) {
                            alt202=1;
                        }


                        switch (alt202) {
                    	case 1 :
                    	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:786:11: chiffre
                    	    {
                    	    pushFollow(FOLLOW_chiffre_in_final_nm5180);
                    	    chiffre();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt202 >= 1 ) break loop202;
                                EarlyExitException eee =
                                    new EarlyExitException(202, input);
                                throw eee;
                        }
                        cnt202++;
                    } while (true);


                    }


                    }
                    break;

            }


            }


            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:789:1: final_nm_integer : ( chiffre )+ ;
    public final HPRIMSParser.final_nm_integer_return final_nm_integer() throws RecognitionException {
        HPRIMSParser.final_nm_integer_return retval = new HPRIMSParser.final_nm_integer_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:789:17: ( ( chiffre )+ )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:790:3: ( chiffre )+
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:790:3: ( chiffre )+
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
            	    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:790:3: chiffre
            	    {
            	    pushFollow(FOLLOW_chiffre_in_final_nm_integer5197);
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


            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:793:1: final_ORU : CHARO CHARR CHARU ;
    public final HPRIMSParser.final_ORU_return final_ORU() throws RecognitionException {
        HPRIMSParser.final_ORU_return retval = new HPRIMSParser.final_ORU_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:793:10: ( CHARO CHARR CHARU )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:793:12: CHARO CHARR CHARU
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_ORU5209); 

            match(input,CHARR,FOLLOW_CHARR_in_final_ORU5211); 

            match(input,CHARU,FOLLOW_CHARU_in_final_ORU5213); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:795:1: final_CART : CHARC CHARA CHARR CHART ;
    public final HPRIMSParser.final_CART_return final_CART() throws RecognitionException {
        HPRIMSParser.final_CART_return retval = new HPRIMSParser.final_CART_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:795:11: ( CHARC CHARA CHARR CHART )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:795:13: CHARC CHARA CHARR CHART
            {
            match(input,CHARC,FOLLOW_CHARC_in_final_CART5222); 

            match(input,CHARA,FOLLOW_CHARA_in_final_CART5224); 

            match(input,CHARR,FOLLOW_CHARR_in_final_CART5226); 

            match(input,CHART,FOLLOW_CHART_in_final_CART5228); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:796:1: final_PORT : CHARP CHARO CHARR CHART ;
    public final HPRIMSParser.final_PORT_return final_PORT() throws RecognitionException {
        HPRIMSParser.final_PORT_return retval = new HPRIMSParser.final_PORT_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:796:11: ( CHARP CHARO CHARR CHART )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:796:13: CHARP CHARO CHARR CHART
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_PORT5236); 

            match(input,CHARO,FOLLOW_CHARO_in_final_PORT5238); 

            match(input,CHARR,FOLLOW_CHARR_in_final_PORT5240); 

            match(input,CHART,FOLLOW_CHART_in_final_PORT5242); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:797:1: final_WHLC : CHARW CHARH CHARL CHARC ;
    public final HPRIMSParser.final_WHLC_return final_WHLC() throws RecognitionException {
        HPRIMSParser.final_WHLC_return retval = new HPRIMSParser.final_WHLC_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:797:11: ( CHARW CHARH CHARL CHARC )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:797:13: CHARW CHARH CHARL CHARC
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_WHLC5250); 

            match(input,CHARH,FOLLOW_CHARH_in_final_WHLC5252); 

            match(input,CHARL,FOLLOW_CHARL_in_final_WHLC5254); 

            match(input,CHARC,FOLLOW_CHARC_in_final_WHLC5256); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:798:1: final_WALK : CHARW CHARA CHARL CHARK ;
    public final HPRIMSParser.final_WALK_return final_WALK() throws RecognitionException {
        HPRIMSParser.final_WALK_return retval = new HPRIMSParser.final_WALK_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:798:11: ( CHARW CHARA CHARL CHARK )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:798:13: CHARW CHARA CHARL CHARK
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_WALK5264); 

            match(input,CHARA,FOLLOW_CHARA_in_final_WALK5266); 

            match(input,CHARL,FOLLOW_CHARL_in_final_WALK5268); 

            match(input,CHARK,FOLLOW_CHARK_in_final_WALK5270); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:800:1: final_LL : CHARL CHARL ;
    public final HPRIMSParser.final_LL_return final_LL() throws RecognitionException {
        HPRIMSParser.final_LL_return retval = new HPRIMSParser.final_LL_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:800:9: ( CHARL CHARL )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:800:11: CHARL CHARL
            {
            match(input,CHARL,FOLLOW_CHARL_in_final_LL5279); 

            match(input,CHARL,FOLLOW_CHARL_in_final_LL5281); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:801:1: final_AA : CHARA CHARA ;
    public final HPRIMSParser.final_AA_return final_AA() throws RecognitionException {
        HPRIMSParser.final_AA_return retval = new HPRIMSParser.final_AA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:801:9: ( CHARA CHARA )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:801:11: CHARA CHARA
            {
            match(input,CHARA,FOLLOW_CHARA_in_final_AA5289); 

            match(input,CHARA,FOLLOW_CHARA_in_final_AA5291); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:802:1: final_HH : CHARH CHARH ;
    public final HPRIMSParser.final_HH_return final_HH() throws RecognitionException {
        HPRIMSParser.final_HH_return retval = new HPRIMSParser.final_HH_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:802:9: ( CHARH CHARH )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:802:11: CHARH CHARH
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_HH5299); 

            match(input,CHARH,FOLLOW_CHARH_in_final_HH5301); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:803:1: final_MS : CHARM CHARS ;
    public final HPRIMSParser.final_MS_return final_MS() throws RecognitionException {
        HPRIMSParser.final_MS_return retval = new HPRIMSParser.final_MS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:803:9: ( CHARM CHARS )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:803:11: CHARM CHARS
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_MS5309); 

            match(input,CHARS,FOLLOW_CHARS_in_final_MS5311); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:804:1: final_VS : CHARV CHARS ;
    public final HPRIMSParser.final_VS_return final_VS() throws RecognitionException {
        HPRIMSParser.final_VS_return retval = new HPRIMSParser.final_VS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:804:9: ( CHARV CHARS )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:804:11: CHARV CHARS
            {
            match(input,CHARV,FOLLOW_CHARV_in_final_VS5319); 

            match(input,CHARS,FOLLOW_CHARS_in_final_VS5321); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:805:1: final_Null : CHARN CHARu CHARl CHARl ;
    public final HPRIMSParser.final_Null_return final_Null() throws RecognitionException {
        HPRIMSParser.final_Null_return retval = new HPRIMSParser.final_Null_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:805:11: ( CHARN CHARu CHARl CHARl )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:805:13: CHARN CHARu CHARl CHARl
            {
            match(input,CHARN,FOLLOW_CHARN_in_final_Null5329); 

            match(input,CHARu,FOLLOW_CHARu_in_final_Null5331); 

            match(input,CHARl,FOLLOW_CHARl_in_final_Null5333); 

            match(input,CHARl,FOLLOW_CHARl_in_final_Null5335); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:806:1: final_symbol_inf : CHAR_SYMBOL_INF ;
    public final HPRIMSParser.final_symbol_inf_return final_symbol_inf() throws RecognitionException {
        HPRIMSParser.final_symbol_inf_return retval = new HPRIMSParser.final_symbol_inf_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:806:17: ( CHAR_SYMBOL_INF )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:806:19: CHAR_SYMBOL_INF
            {
            match(input,CHAR_SYMBOL_INF,FOLLOW_CHAR_SYMBOL_INF_in_final_symbol_inf5343); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:807:1: final_symbol_sup : CHAR_SYMBOL_SUP ;
    public final HPRIMSParser.final_symbol_sup_return final_symbol_sup() throws RecognitionException {
        HPRIMSParser.final_symbol_sup_return retval = new HPRIMSParser.final_symbol_sup_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:807:17: ( CHAR_SYMBOL_SUP )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:807:19: CHAR_SYMBOL_SUP
            {
            match(input,CHAR_SYMBOL_SUP,FOLLOW_CHAR_SYMBOL_SUP_in_final_symbol_sup5351); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:809:1: final_version_2_0 : CHARH CHIFFRE2 POINT CHIFFRE0 ;
    public final HPRIMSParser.final_version_2_0_return final_version_2_0() throws RecognitionException {
        HPRIMSParser.final_version_2_0_return retval = new HPRIMSParser.final_version_2_0_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:809:18: ( CHARH CHIFFRE2 POINT CHIFFRE0 )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:809:20: CHARH CHIFFRE2 POINT CHIFFRE0
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_05360); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_05362); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_05364); 

            match(input,CHIFFRE0,FOLLOW_CHIFFRE0_in_final_version_2_05366); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:810:1: final_version_2_1 : CHARH CHIFFRE2 POINT CHIFFRE1 ;
    public final HPRIMSParser.final_version_2_1_return final_version_2_1() throws RecognitionException {
        HPRIMSParser.final_version_2_1_return retval = new HPRIMSParser.final_version_2_1_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:810:18: ( CHARH CHIFFRE2 POINT CHIFFRE1 )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:810:20: CHARH CHIFFRE2 POINT CHIFFRE1
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_15374); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_15376); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_15378); 

            match(input,CHIFFRE1,FOLLOW_CHIFFRE1_in_final_version_2_15380); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:811:1: final_version_2_2 : CHARH CHIFFRE2 POINT CHIFFRE2 ;
    public final HPRIMSParser.final_version_2_2_return final_version_2_2() throws RecognitionException {
        HPRIMSParser.final_version_2_2_return retval = new HPRIMSParser.final_version_2_2_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:811:18: ( CHARH CHIFFRE2 POINT CHIFFRE2 )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:811:20: CHARH CHIFFRE2 POINT CHIFFRE2
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_version_2_25388); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_25390); 

            match(input,POINT,FOLLOW_POINT_in_final_version_2_25392); 

            match(input,CHIFFRE2,FOLLOW_CHIFFRE2_in_final_version_2_25394); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:813:1: final_OP : CHARO CHARP ;
    public final HPRIMSParser.final_OP_return final_OP() throws RecognitionException {
        HPRIMSParser.final_OP_return retval = new HPRIMSParser.final_OP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:813:9: ( CHARO CHARP )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:813:11: CHARO CHARP
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_OP5403); 

            match(input,CHARP,FOLLOW_CHARP_in_final_OP5405); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:814:1: final_IP : CHARI CHARP ;
    public final HPRIMSParser.final_IP_return final_IP() throws RecognitionException {
        HPRIMSParser.final_IP_return retval = new HPRIMSParser.final_IP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:814:9: ( CHARI CHARP )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:814:11: CHARI CHARP
            {
            match(input,CHARI,FOLLOW_CHARI_in_final_IP5413); 

            match(input,CHARP,FOLLOW_CHARP_in_final_IP5415); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:1: final_ER : CHARE CHARR ;
    public final HPRIMSParser.final_ER_return final_ER() throws RecognitionException {
        HPRIMSParser.final_ER_return retval = new HPRIMSParser.final_ER_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:9: ( CHARE CHARR )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:815:11: CHARE CHARR
            {
            match(input,CHARE,FOLLOW_CHARE_in_final_ER5423); 

            match(input,CHARR,FOLLOW_CHARR_in_final_ER5425); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:816:1: final_PA : CHARP CHARA ;
    public final HPRIMSParser.final_PA_return final_PA() throws RecognitionException {
        HPRIMSParser.final_PA_return retval = new HPRIMSParser.final_PA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:816:9: ( CHARP CHARA )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:816:11: CHARP CHARA
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_PA5433); 

            match(input,CHARA,FOLLOW_CHARA_in_final_PA5435); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:817:1: final_MP : CHARM CHARP ;
    public final HPRIMSParser.final_MP_return final_MP() throws RecognitionException {
        HPRIMSParser.final_MP_return retval = new HPRIMSParser.final_MP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:817:9: ( CHARM CHARP )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:817:11: CHARM CHARP
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_MP5443); 

            match(input,CHARP,FOLLOW_CHARP_in_final_MP5445); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:819:1: final_charA : CHARA ;
    public final HPRIMSParser.final_charA_return final_charA() throws RecognitionException {
        HPRIMSParser.final_charA_return retval = new HPRIMSParser.final_charA_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:819:12: ( CHARA )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:819:14: CHARA
            {
            match(input,CHARA,FOLLOW_CHARA_in_final_charA5456); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:820:1: final_charB : CHARB ;
    public final HPRIMSParser.final_charB_return final_charB() throws RecognitionException {
        HPRIMSParser.final_charB_return retval = new HPRIMSParser.final_charB_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:820:12: ( CHARB )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:820:14: CHARB
            {
            match(input,CHARB,FOLLOW_CHARB_in_final_charB5464); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:821:1: final_charC : CHARC ;
    public final HPRIMSParser.final_charC_return final_charC() throws RecognitionException {
        HPRIMSParser.final_charC_return retval = new HPRIMSParser.final_charC_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:821:12: ( CHARC )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:821:14: CHARC
            {
            match(input,CHARC,FOLLOW_CHARC_in_final_charC5472); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:822:1: final_charD : CHARD ;
    public final HPRIMSParser.final_charD_return final_charD() throws RecognitionException {
        HPRIMSParser.final_charD_return retval = new HPRIMSParser.final_charD_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:822:12: ( CHARD )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:822:14: CHARD
            {
            match(input,CHARD,FOLLOW_CHARD_in_final_charD5480); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:823:1: final_charF : CHARF ;
    public final HPRIMSParser.final_charF_return final_charF() throws RecognitionException {
        HPRIMSParser.final_charF_return retval = new HPRIMSParser.final_charF_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:823:12: ( CHARF )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:823:14: CHARF
            {
            match(input,CHARF,FOLLOW_CHARF_in_final_charF5488); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:824:1: final_charH : CHARH ;
    public final HPRIMSParser.final_charH_return final_charH() throws RecognitionException {
        HPRIMSParser.final_charH_return retval = new HPRIMSParser.final_charH_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:824:12: ( CHARH )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:824:14: CHARH
            {
            match(input,CHARH,FOLLOW_CHARH_in_final_charH5496); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:825:1: final_charI : CHARI ;
    public final HPRIMSParser.final_charI_return final_charI() throws RecognitionException {
        HPRIMSParser.final_charI_return retval = new HPRIMSParser.final_charI_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:825:12: ( CHARI )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:825:14: CHARI
            {
            match(input,CHARI,FOLLOW_CHARI_in_final_charI5504); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:826:1: final_charL : CHARL ;
    public final HPRIMSParser.final_charL_return final_charL() throws RecognitionException {
        HPRIMSParser.final_charL_return retval = new HPRIMSParser.final_charL_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:826:12: ( CHARL )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:826:14: CHARL
            {
            match(input,CHARL,FOLLOW_CHARL_in_final_charL5512); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:827:1: final_charM : CHARM ;
    public final HPRIMSParser.final_charM_return final_charM() throws RecognitionException {
        HPRIMSParser.final_charM_return retval = new HPRIMSParser.final_charM_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:827:12: ( CHARM )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:827:14: CHARM
            {
            match(input,CHARM,FOLLOW_CHARM_in_final_charM5520); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:828:1: final_charN : CHARN ;
    public final HPRIMSParser.final_charN_return final_charN() throws RecognitionException {
        HPRIMSParser.final_charN_return retval = new HPRIMSParser.final_charN_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:828:12: ( CHARN )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:828:14: CHARN
            {
            match(input,CHARN,FOLLOW_CHARN_in_final_charN5528); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:829:1: final_charO : CHARO ;
    public final HPRIMSParser.final_charO_return final_charO() throws RecognitionException {
        HPRIMSParser.final_charO_return retval = new HPRIMSParser.final_charO_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:829:12: ( CHARO )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:829:14: CHARO
            {
            match(input,CHARO,FOLLOW_CHARO_in_final_charO5536); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:830:1: final_charP : CHARP ;
    public final HPRIMSParser.final_charP_return final_charP() throws RecognitionException {
        HPRIMSParser.final_charP_return retval = new HPRIMSParser.final_charP_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:830:12: ( CHARP )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:830:14: CHARP
            {
            match(input,CHARP,FOLLOW_CHARP_in_final_charP5544); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:831:1: final_charR : CHARR ;
    public final HPRIMSParser.final_charR_return final_charR() throws RecognitionException {
        HPRIMSParser.final_charR_return retval = new HPRIMSParser.final_charR_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:831:12: ( CHARR )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:831:14: CHARR
            {
            match(input,CHARR,FOLLOW_CHARR_in_final_charR5552); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:832:1: final_charS : CHARS ;
    public final HPRIMSParser.final_charS_return final_charS() throws RecognitionException {
        HPRIMSParser.final_charS_return retval = new HPRIMSParser.final_charS_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:832:12: ( CHARS )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:832:14: CHARS
            {
            match(input,CHARS,FOLLOW_CHARS_in_final_charS5560); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:833:1: final_charT : CHART ;
    public final HPRIMSParser.final_charT_return final_charT() throws RecognitionException {
        HPRIMSParser.final_charT_return retval = new HPRIMSParser.final_charT_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:833:12: ( CHART )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:833:14: CHART
            {
            match(input,CHART,FOLLOW_CHART_in_final_charT5568); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:834:1: final_charU : CHARU ;
    public final HPRIMSParser.final_charU_return final_charU() throws RecognitionException {
        HPRIMSParser.final_charU_return retval = new HPRIMSParser.final_charU_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:834:12: ( CHARU )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:834:14: CHARU
            {
            match(input,CHARU,FOLLOW_CHARU_in_final_charU5576); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:835:1: final_charW : CHARW ;
    public final HPRIMSParser.final_charW_return final_charW() throws RecognitionException {
        HPRIMSParser.final_charW_return retval = new HPRIMSParser.final_charW_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:835:12: ( CHARW )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:835:14: CHARW
            {
            match(input,CHARW,FOLLOW_CHARW_in_final_charW5584); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:836:1: final_charX : CHARX ;
    public final HPRIMSParser.final_charX_return final_charX() throws RecognitionException {
        HPRIMSParser.final_charX_return retval = new HPRIMSParser.final_charX_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:836:12: ( CHARX )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:836:14: CHARX
            {
            match(input,CHARX,FOLLOW_CHARX_in_final_charX5592); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:839:1: delimiters : DELIMITERS ;
    public final HPRIMSParser.delimiters_return delimiters() throws RecognitionException {
        HPRIMSParser.delimiters_return retval = new HPRIMSParser.delimiters_return();
        retval.start = input.LT(1);


        collecteur.startElement("champ", "delimiteurs");
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:841:33: ( DELIMITERS )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:842:3: DELIMITERS
            {
            match(input,DELIMITERS,FOLLOW_DELIMITERS_in_delimiters5613); 

            collecteur.content(input.toString(retval.start,input.LT(-1)));

            }

            retval.stop = input.LT(-1);


            collecteur.endElement();
        }
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:847:1: character : ( lettre | chiffre ) ;
    public final HPRIMSParser.character_return character() throws RecognitionException {
        HPRIMSParser.character_return retval = new HPRIMSParser.character_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:847:10: ( ( lettre | chiffre ) )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:848:3: ( lettre | chiffre )
            {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:848:3: ( lettre | chiffre )
            int alt205=2;
            int LA205_0 = input.LA(1);

            if ( ((LA205_0 >= CHARA && LA205_0 <= CHARu)||(LA205_0 >= LETTRE && LA205_0 <= POINT)) ) {
                alt205=1;
            }
            else if ( ((LA205_0 >= CHIFFRE0 && LA205_0 <= CHIFFRE9)) ) {
                alt205=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 205, 0, input);

                throw nvae;

            }
            switch (alt205) {
                case 1 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:848:4: lettre
                    {
                    pushFollow(FOLLOW_lettre_in_character5629);
                    lettre();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:848:13: chiffre
                    {
                    pushFollow(FOLLOW_chiffre_in_character5633);
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:850:1: chiffre : ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 ) ;
    public final void chiffre() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:850:8: ( ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 ) )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:
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
    // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:854:1: lettre : ~ ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 | CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR ) ;
    public final void lettre() throws RecognitionException {
        try {
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:854:7: (~ ( CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 | CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR ) )
            // C:\\Users\\delabre\\workspace\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:
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


 

    public static final BitSet FOLLOW_line_h2_2_in_hprim_2_272 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p2_1_in_hprim_2_276 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l2_1_in_hprim_2_281 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_2_285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_2_290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_h2_1_in_hprim_2_1107 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_p2_1_in_hprim_2_1111 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_l2_1_in_hprim_2_1116 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_CR_in_hprim_2_1120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim_2_1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_p2_1_in_body_p2_1142 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_c2_1_in_body_p2_1145 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_obr2_1_in_body_p2_1152 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_obr2_1_in_body_obr2_1171 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_line_c2_1_in_body_obr2_1174 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_body_obx2_1_in_body_obr2_1182 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_obx2_1_in_body_obx2_1201 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_line_c2_1_in_body_obx2_1204 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_delimiters_in_line_h2_2226 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2230 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_2232 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2237 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_2239 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2244 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_2246 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2251 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_2253 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2258 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_in_line_h2_2260 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2265 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_h2_2267 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2272 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_2274 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2279 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_2281 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2286 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_2288 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2293 = new BitSet(new long[]{0x0000000000240080L});
    public static final BitSet FOLLOW_spec_const_7_12_in_line_h2_2295 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2300 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_2_in_line_h2_2302 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2307 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_2309 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delimiters_in_line_h2_1334 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1338 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_1340 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1345 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_1347 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1352 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_1354 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1359 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_h2_1361 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1366 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_spec_const_7_7_contexte_in_line_h2_1368 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1373 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_h2_1375 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1380 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_1382 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1387 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_mandatory_2_in_line_h2_1389 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1394 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_h2_1396 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1401 = new BitSet(new long[]{0x0000000000240080L});
    public static final BitSet FOLLOW_spec_const_7_12_in_line_h2_1403 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1411 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_0_in_line_h2_1414 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_1_in_line_h2_1419 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_spec_const_7_13_version_2_2_in_line_h2_1424 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1430 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_mandatory_in_line_h2_1432 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_h2_1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_p2_1455 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_line_p2_1457 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1461 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_p2_1463 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1468 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_8_3_in_line_p2_1470 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1475 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1477 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1483 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1485 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1492 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1494 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1502 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1504 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1513 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_1515 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1525 = new BitSet(new long[]{0x0000020000408200L});
    public static final BitSet FOLLOW_spec_const_sexe_in_line_p2_1527 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1538 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1549 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1551 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1564 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1566 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1580 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_p2_1582 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1621 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p2_1623 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1627 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_p2_1629 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1647 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1649 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1666 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1668 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1701 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_p2_1703 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1738 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_p2_1740 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1760 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1762 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1766 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_p2_1768 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1791 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1793 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1797 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1799 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1823 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1825 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1848 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1850 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1874 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_1876 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1901 = new BitSet(new long[]{0x000202FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_1903 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_p2_1907 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_1909 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1937 = new BitSet(new long[]{0x0000020000069100L});
    public static final BitSet FOLLOW_spec_const_8_25_in_line_p2_1939 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_1966 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_8_in_line_p2_1968 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11021 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11023 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11052 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11108 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11110 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11169 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11171 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11203 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11205 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11268 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_p2_11270 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11304 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_11306 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11341 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_p2_11343 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_p2_11378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obr2_11459 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_line_obr2_11461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_line_obr2_11463 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_line_obr2_11465 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11469 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_obr2_11471 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11476 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_9_3_in_line_obr2_11478 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11483 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11485 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11490 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11492 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11496 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11498 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11508 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11510 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11514 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11516 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11523 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11525 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11530 = new BitSet(new long[]{0x000200FFC0000000L});
    public static final BitSet FOLLOW_spec_non_sized_9_8_in_line_obr2_11532 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11537 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11539 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11547 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11549 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11554 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_11556 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11564 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11566 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11575 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11577 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11584 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11586 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11594 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11596 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11605 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_9_16_in_line_obr2_11607 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11617 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obr2_11619 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11630 = new BitSet(new long[]{0x0003E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_tn_in_line_obr2_11632 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11644 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11646 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11659 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11661 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11675 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11677 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11692 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11694 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11710 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_11712 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11729 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11747 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_2_in_line_obr2_11749 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11768 = new BitSet(new long[]{0x00000200020E92C0L});
    public static final BitSet FOLLOW_spec_const_9_26_in_line_obr2_11770 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11790 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11810 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11831 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_11833 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11837 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_11839 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11864 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_4_in_line_obr2_11866 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11890 = new BitSet(new long[]{0x0000020001040040L});
    public static final BitSet FOLLOW_spec_const_9_31_in_line_obr2_11892 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11939 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11941 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obr2_11945 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obr2_11947 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_11975 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_11977 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12004 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12006 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12034 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12036 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12065 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_cna_in_line_obr2_12067 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12097 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obr2_12099 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obr2_12130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_obx2_12198 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_line_obx2_12200 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_line_obx2_12202 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CHARX_in_line_obx2_12204 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12208 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_obx2_12210 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12215 = new BitSet(new long[]{0x00000000003506D0L});
    public static final BitSet FOLLOW_spec_const_10_3_nm_in_line_obx2_12223 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12232 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12234 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12244 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12246 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12257 = new BitSet(new long[]{0x0003C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2_12259 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12263 = new BitSet(new long[]{0x0003C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2_12265 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_ce_in_line_obx2_12295 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12304 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12306 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12316 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12318 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12329 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12331 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12335 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12337 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_fic_in_line_obx2_12367 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12376 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12378 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12388 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12390 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12401 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12403 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12407 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_in_line_obx2_12409 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_st_in_line_obx2_12439 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12448 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12450 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12460 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12462 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12473 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12475 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12479 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12481 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_gc_in_line_obx2_12511 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12520 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12522 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12532 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12534 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12545 = new BitSet(new long[]{0x0001C4FFC0000000L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12547 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12551 = new BitSet(new long[]{0x0001C4FFC0000000L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_nm_optionnal_2_in_line_obx2_12553 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_tx_in_line_obx2_12583 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12592 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12594 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12604 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12606 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12617 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12619 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12623 = new BitSet(new long[]{0x0003E6FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_6_tx_in_line_obx2_12625 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_10_3_std_in_line_obx2_12655 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12664 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_10_4_in_line_obx2_12666 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12676 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12678 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_12689 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12691 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_12695 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_12697 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_line_obx2_1_post10_6_in_line_obx2_12710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62731 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62733 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62742 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62744 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_62748 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62750 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62762 = new BitSet(new long[]{0x000202000DD9D8B0L});
    public static final BitSet FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62764 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_62768 = new BitSet(new long[]{0x000202000DD9D8B0L});
    public static final BitSet FOLLOW_spec_const_10_9_in_line_obx2_1_post10_62770 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62783 = new BitSet(new long[]{0x0001C2FFC0000000L});
    public static final BitSet FOLLOW_nm_sized_optionnal_in_line_obx2_1_post10_62785 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62797 = new BitSet(new long[]{0x0002020000190010L});
    public static final BitSet FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62799 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_obx2_1_post10_62803 = new BitSet(new long[]{0x0002020000190010L});
    public static final BitSet FOLLOW_spec_const_10_11_in_line_obx2_1_post10_62805 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62820 = new BitSet(new long[]{0x00000200024C12C0L});
    public static final BitSet FOLLOW_spec_const_10_12_in_line_obx2_1_post10_62822 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62837 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62839 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62855 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62857 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62873 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_line_obx2_1_post10_62875 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62892 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl1_st_optionnal_6_in_line_obx2_1_post10_62894 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62912 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_obx2_1_post10_62914 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_obx2_1_post10_62917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_c2_12956 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_line_c2_12958 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_12962 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_mandatory_in_line_c2_12964 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_12969 = new BitSet(new long[]{0x0000020000044000L});
    public static final BitSet FOLLOW_spec_const_12_3_in_line_c2_12971 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_12976 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_c2_12978 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_line_c2_12982 = new BitSet(new long[]{0x0003E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_c2_12984 = new BitSet(new long[]{0x0002020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_c2_12993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CR_in_line_l2_13011 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_line_l2_13013 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13018 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l2_13020 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13027 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13034 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l2_13036 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13045 = new BitSet(new long[]{0x000002FFC0000000L});
    public static final BitSet FOLLOW_nm_integer_sized_optionnal_in_line_l2_13047 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13057 = new BitSet(new long[]{0x0001E2FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_line_l2_13059 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DELIMITER1_in_line_l2_13062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charM_in_spec_const_sexe3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_sexe3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_sexe3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_0_in_spec_const_7_13_version_2_03128 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_03131 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_03133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_1_in_spec_const_7_13_version_2_13154 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_13157 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_13159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_const_7_13_1_version_2_2_in_spec_const_7_13_version_2_23178 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_const_7_13_version_2_23181 = new BitSet(new long[]{0x0000000000084040L});
    public static final BitSet FOLLOW_spec_const_7_13_2_in_spec_const_7_13_version_2_23183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_7_13_23202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_7_13_23206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_7_13_23210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ORU_in_spec_const_7_7_contexte3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_7_123247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_7_123251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charT_in_spec_const_7_123255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_PORT_in_spec_const_9_313275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_CART_in_spec_const_9_313279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_WHLC_in_spec_const_9_313283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_WALK_in_spec_const_9_313287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_OP_in_spec_const_8_253308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_IP_in_spec_const_8_253312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ER_in_spec_const_8_253316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_PA_in_spec_const_8_253320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_MP_in_spec_const_8_253324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_9_263345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_9_263349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charM_in_spec_const_9_263353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_9_263357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_9_263361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_9_263365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charO_in_spec_const_9_263369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_9_263375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charX_in_spec_const_9_263379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_nm3400 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CHARM_in_spec_const_10_3_nm3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_ce3423 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_CHARE_in_spec_const_10_3_ce3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARS_in_spec_const_10_3_st3446 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_st3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_gc3469 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_gc3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_tx3493 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CHARX_in_spec_const_10_3_tx3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARF_in_spec_const_10_3_fic3516 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CHARI_in_spec_const_10_3_fic3518 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_fic3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_spec_const_10_3_std3542 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CHARD_in_spec_const_10_3_std3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_std3550 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CHARK_in_spec_const_10_3_std3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_spec_const_10_3_std3558 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_spec_const_10_3_std3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARD_in_spec_const_10_3_std3568 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_std3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_spec_const_10_3_std3578 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_spec_const_10_3_std3586 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_std3596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARB_in_spec_const_10_3_std3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARG_in_spec_const_10_3_std3604 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CHARN_in_spec_const_10_3_std3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_63629 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_63635 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_63637 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_63644 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_10_63646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_10_93674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charH_in_spec_const_10_93678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_LL_in_spec_const_10_93682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_HH_in_spec_const_10_93686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_symbol_inf_in_spec_const_10_93690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_symbol_sup_in_spec_const_10_93694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charN_in_spec_const_10_93700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charA_in_spec_const_10_93704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_AA_in_spec_const_10_93708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_Null_in_spec_const_10_93712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_10_93716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_10_93720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charB_in_spec_const_10_93724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charW_in_spec_const_10_93730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_93734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_10_93738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charS_in_spec_const_10_93742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_MS_in_spec_const_10_93746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_VS_in_spec_const_10_93750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charA_in_spec_const_10_113771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charS_in_spec_const_10_113775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_113779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charN_in_spec_const_10_113783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charR_in_spec_const_10_123804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_10_123808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charF_in_spec_const_10_123812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charC_in_spec_const_10_123816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charI_in_spec_const_10_123820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charD_in_spec_const_10_123824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charX_in_spec_const_10_123831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charU_in_spec_const_10_123835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charP_in_spec_const_12_33856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_charL_in_spec_const_12_33860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_23880 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_mandatory_23886 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_mult_lvl1_st_mandatory_23888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_23911 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_23917 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_23919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_43944 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_43950 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_43952 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_43959 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_43961 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_43969 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_43971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64000 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64007 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64009 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64017 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64019 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64028 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64030 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64040 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64042 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_64053 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_64055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84088 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84094 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84096 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84103 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84105 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84113 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84115 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84124 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84126 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84136 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84138 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84149 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84151 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_st_optionnal_84163 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl1_st_optionnal_84165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34202 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34208 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34210 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_34217 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_34219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64242 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64248 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64250 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64257 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64259 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64267 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64269 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64278 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64280 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DELIMITER3_in_spec_sized_mult_lvl2_st_optionnal_64290 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_mult_lvl2_st_optionnal_64292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24321 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_optionnal_24326 = new BitSet(new long[]{0x0001C0FFC0000000L});
    public static final BitSet FOLLOW_nm_nonsized_optionnal_in_spec_sized_mult_lvl1_nm_optionnal_24328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24353 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_mult_lvl1_nm_mandatory_24358 = new BitSet(new long[]{0x0001C0FFC0000000L});
    public static final BitSet FOLLOW_nm_nonsized_mandatory_in_spec_sized_mult_lvl1_nm_mandatory_24360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4383 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna4390 = new BitSet(new long[]{0x0001E8FFFFFFFFF0L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl2_st_optionnal_6_in_spec_sized_cna4392 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_cna4400 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_cna4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_mandatory_in_spec_sized_8_34429 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_8_34435 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34437 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_8_34444 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_8_34446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_9_34483 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_34489 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_sized_optionnal_in_spec_sized_9_34491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84516 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_spec_non_sized_9_84523 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_ts_sized_optionnal_in_spec_non_sized_9_84525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_sized_mult_lvl2_st_optionnal_3_in_spec_sized_9_164546 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_164552 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164554 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_9_164561 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_9_164563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_nonsized_mandatory_in_spec_sized_10_44590 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44596 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44598 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44605 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44607 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44615 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44617 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44626 = new BitSet(new long[]{0x0001E4FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44628 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_DELIMITER2_in_spec_sized_10_44638 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_10_44640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_spec_10_6_tx_in_spec_sized_10_6_tx4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4697 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_REPETITEUR_in_spec_sized_tn4703 = new BitSet(new long[]{0x0001E0FFFFFFFFF0L});
    public static final BitSet FOLLOW_st_non_sized_optionnal_in_spec_sized_tn4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_sized_optionnal4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_sized_mandatory4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_non_sized_optionnal4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_st_in_st_nonsized_mandatory4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_sized_optionnal4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_integer_in_nm_integer_sized_optionnal4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_integer_in_nm_integer_sized_mandatory4866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ts_in_ts_sized_optionnal4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_ts_in_ts_sized_mandatory4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_nonsized_mandatory4934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_nm_in_nm_nonsized_optionnal4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_0_in_spec_const_7_13_1_version_2_04971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_1_in_spec_const_7_13_1_version_2_14989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_final_version_2_2_in_spec_const_7_13_1_version_2_25009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_content_spec_10_6_in_final_spec_10_6_tx5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_in_content_spec_10_65048 = new BitSet(new long[]{0x0001E4FFFFFFFFF2L});
    public static final BitSet FOLLOW_DELIMITER2_in_content_spec_10_65054 = new BitSet(new long[]{0x0001E4FFFFFFFFF2L});
    public static final BitSet FOLLOW_content_spec_10_6_in_content_spec_10_65065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5077 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5079 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5083 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5085 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5087 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5091 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5094 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5096 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5101 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5103 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5105 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5109 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5112 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_ts5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_in_final_st5133 = new BitSet(new long[]{0x0001E0FFFFFFFFF2L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5162 = new BitSet(new long[]{0x000100FFC0000002L});
    public static final BitSet FOLLOW_POINT_in_final_nm5166 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5168 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_POINT_in_final_nm5178 = new BitSet(new long[]{0x000000FFC0000000L});
    public static final BitSet FOLLOW_chiffre_in_final_nm5180 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_chiffre_in_final_nm_integer5197 = new BitSet(new long[]{0x000000FFC0000002L});
    public static final BitSet FOLLOW_CHARO_in_final_ORU5209 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_ORU5211 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CHARU_in_final_ORU5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_final_CART5222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_CART5224 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_CART5226 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_final_CART5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_PORT5236 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CHARO_in_final_PORT5238 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_PORT5240 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CHART_in_final_PORT5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_WHLC5250 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CHARH_in_final_WHLC5252 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_WHLC5254 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CHARC_in_final_WHLC5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_WALK5264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_WALK5266 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_WALK5268 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CHARK_in_final_WALK5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARL_in_final_LL5279 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CHARL_in_final_LL5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_final_AA5289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_AA5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_HH5299 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CHARH_in_final_HH5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_MS5309 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CHARS_in_final_MS5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARV_in_final_VS5319 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CHARS_in_final_VS5321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_final_Null5329 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CHARu_in_final_Null5331 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CHARl_in_final_Null5333 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CHARl_in_final_Null5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_SYMBOL_INF_in_final_symbol_inf5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_SYMBOL_SUP_in_final_symbol_sup5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_05360 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_05362 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_05364 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_CHIFFRE0_in_final_version_2_05366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_15374 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_15376 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_15378 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_CHIFFRE1_in_final_version_2_15380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_version_2_25388 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_25390 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_POINT_in_final_version_2_25392 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHIFFRE2_in_final_version_2_25394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_OP5403 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_OP5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARI_in_final_IP5413 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_IP5415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARE_in_final_ER5423 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CHARR_in_final_ER5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_PA5433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARA_in_final_PA5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_MP5443 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CHARP_in_final_MP5445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARA_in_final_charA5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARB_in_final_charB5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARC_in_final_charC5472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARD_in_final_charD5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARF_in_final_charF5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARH_in_final_charH5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARI_in_final_charI5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARL_in_final_charL5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARM_in_final_charM5520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARN_in_final_charN5528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARO_in_final_charO5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARP_in_final_charP5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARR_in_final_charR5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARS_in_final_charS5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHART_in_final_charT5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARU_in_final_charU5576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARW_in_final_charW5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARX_in_final_charX5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITERS_in_delimiters5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lettre_in_character5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chiffre_in_character5633 = new BitSet(new long[]{0x0000000000000002L});

}