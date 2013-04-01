// $ANTLR 3.4 C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g 2013-03-31 15:52:55

package aider.org.hprim.parser.antlr;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class HPRIMSLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public HPRIMSLexer() {} 
    public HPRIMSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public HPRIMSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g"; }

    // $ANTLR start "CR"
    public final void mCR() throws RecognitionException {
        try {
            int _type = CR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:950:4: ( 'CR' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:950:6: 'CR'
            {
            match("CR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CR"

    // $ANTLR start "TOKENMISMATCH"
    public final void mTOKENMISMATCH() throws RecognitionException {
        try {
            int _type = TOKENMISMATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:951:15: ( 'MISMATCH' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:951:17: 'MISMATCH'
            {
            match("MISMATCH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TOKENMISMATCH"

    // $ANTLR start "DELIMITER1"
    public final void mDELIMITER1() throws RecognitionException {
        try {
            int _type = DELIMITER1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:952:11: ( '|' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:952:13: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DELIMITER1"

    // $ANTLR start "DELIMITER2"
    public final void mDELIMITER2() throws RecognitionException {
        try {
            int _type = DELIMITER2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:953:11: ( '~' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:953:13: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DELIMITER2"

    // $ANTLR start "DELIMITER3"
    public final void mDELIMITER3() throws RecognitionException {
        try {
            int _type = DELIMITER3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:954:11: ( '&' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:954:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DELIMITER3"

    // $ANTLR start "DELIMITERS"
    public final void mDELIMITERS() throws RecognitionException {
        try {
            int _type = DELIMITERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:955:11: ( 'DDWWDD' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:955:13: 'DDWWDD'
            {
            match("DDWWDD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DELIMITERS"

    // $ANTLR start "REPETITEUR"
    public final void mREPETITEUR() throws RecognitionException {
        try {
            int _type = REPETITEUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:956:11: ( '^' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:956:13: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REPETITEUR"

    // $ANTLR start "CHIFFRE0"
    public final void mCHIFFRE0() throws RecognitionException {
        try {
            int _type = CHIFFRE0;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:958:9: ( '0' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:958:11: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHIFFRE0"

    // $ANTLR start "CHIFFRE1"
    public final void mCHIFFRE1() throws RecognitionException {
        try {
            int _type = CHIFFRE1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:959:9: ( '1' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:959:11: '1'
            {
            match('1'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHIFFRE1"

    // $ANTLR start "CHIFFRE2"
    public final void mCHIFFRE2() throws RecognitionException {
        try {
            int _type = CHIFFRE2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:960:9: ( '2' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:960:11: '2'
            {
            match('2'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHIFFRE2"

    // $ANTLR start "CHIFFRE3"
    public final void mCHIFFRE3() throws RecognitionException {
        try {
            int _type = CHIFFRE3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:961:9: ( '3' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:961:11: '3'
            {
            match('3'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHIFFRE3"

    // $ANTLR start "CHIFFRE4"
    public final void mCHIFFRE4() throws RecognitionException {
        try {
            int _type = CHIFFRE4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:962:9: ( '4' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:962:11: '4'
            {
            match('4'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHIFFRE4"

    // $ANTLR start "CHIFFRE5"
    public final void mCHIFFRE5() throws RecognitionException {
        try {
            int _type = CHIFFRE5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:963:9: ( '5' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:963:11: '5'
            {
            match('5'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHIFFRE5"

    // $ANTLR start "CHIFFRE6"
    public final void mCHIFFRE6() throws RecognitionException {
        try {
            int _type = CHIFFRE6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:964:9: ( '6' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:964:11: '6'
            {
            match('6'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHIFFRE6"

    // $ANTLR start "CHIFFRE7"
    public final void mCHIFFRE7() throws RecognitionException {
        try {
            int _type = CHIFFRE7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:965:9: ( '7' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:965:11: '7'
            {
            match('7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHIFFRE7"

    // $ANTLR start "CHIFFRE8"
    public final void mCHIFFRE8() throws RecognitionException {
        try {
            int _type = CHIFFRE8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:966:9: ( '8' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:966:11: '8'
            {
            match('8'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHIFFRE8"

    // $ANTLR start "CHIFFRE9"
    public final void mCHIFFRE9() throws RecognitionException {
        try {
            int _type = CHIFFRE9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:967:9: ( '9' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:967:11: '9'
            {
            match('9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHIFFRE9"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:969:6: ( '.' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:969:8: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POINT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:970:5: ( '+' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:970:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MOINS"
    public final void mMOINS() throws RecognitionException {
        try {
            int _type = MOINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:971:6: ( '-' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:971:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOINS"

    // $ANTLR start "CHARA"
    public final void mCHARA() throws RecognitionException {
        try {
            int _type = CHARA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:973:7: ( 'A' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:973:9: 'A'
            {
            match('A'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARA"

    // $ANTLR start "CHARB"
    public final void mCHARB() throws RecognitionException {
        try {
            int _type = CHARB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:974:7: ( 'B' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:974:9: 'B'
            {
            match('B'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARB"

    // $ANTLR start "CHARC"
    public final void mCHARC() throws RecognitionException {
        try {
            int _type = CHARC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:975:7: ( 'C' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:975:9: 'C'
            {
            match('C'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARC"

    // $ANTLR start "CHARD"
    public final void mCHARD() throws RecognitionException {
        try {
            int _type = CHARD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:976:7: ( 'D' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:976:9: 'D'
            {
            match('D'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARD"

    // $ANTLR start "CHARE"
    public final void mCHARE() throws RecognitionException {
        try {
            int _type = CHARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:977:7: ( 'E' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:977:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARE"

    // $ANTLR start "CHARF"
    public final void mCHARF() throws RecognitionException {
        try {
            int _type = CHARF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:978:7: ( 'F' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:978:9: 'F'
            {
            match('F'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARF"

    // $ANTLR start "CHARG"
    public final void mCHARG() throws RecognitionException {
        try {
            int _type = CHARG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:979:7: ( 'G' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:979:9: 'G'
            {
            match('G'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARG"

    // $ANTLR start "CHARH"
    public final void mCHARH() throws RecognitionException {
        try {
            int _type = CHARH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:980:7: ( 'H' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:980:9: 'H'
            {
            match('H'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARH"

    // $ANTLR start "CHARI"
    public final void mCHARI() throws RecognitionException {
        try {
            int _type = CHARI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:981:7: ( 'I' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:981:9: 'I'
            {
            match('I'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARI"

    // $ANTLR start "CHARK"
    public final void mCHARK() throws RecognitionException {
        try {
            int _type = CHARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:982:7: ( 'K' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:982:9: 'K'
            {
            match('K'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARK"

    // $ANTLR start "CHARL"
    public final void mCHARL() throws RecognitionException {
        try {
            int _type = CHARL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:983:7: ( 'L' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:983:9: 'L'
            {
            match('L'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARL"

    // $ANTLR start "CHARM"
    public final void mCHARM() throws RecognitionException {
        try {
            int _type = CHARM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:984:7: ( 'M' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:984:9: 'M'
            {
            match('M'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARM"

    // $ANTLR start "CHARN"
    public final void mCHARN() throws RecognitionException {
        try {
            int _type = CHARN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:985:7: ( 'N' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:985:9: 'N'
            {
            match('N'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARN"

    // $ANTLR start "CHARO"
    public final void mCHARO() throws RecognitionException {
        try {
            int _type = CHARO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:986:7: ( 'O' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:986:9: 'O'
            {
            match('O'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARO"

    // $ANTLR start "CHARP"
    public final void mCHARP() throws RecognitionException {
        try {
            int _type = CHARP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:987:7: ( 'P' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:987:9: 'P'
            {
            match('P'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARP"

    // $ANTLR start "CHARR"
    public final void mCHARR() throws RecognitionException {
        try {
            int _type = CHARR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:988:7: ( 'R' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:988:9: 'R'
            {
            match('R'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARR"

    // $ANTLR start "CHARS"
    public final void mCHARS() throws RecognitionException {
        try {
            int _type = CHARS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:989:7: ( 'S' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:989:9: 'S'
            {
            match('S'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARS"

    // $ANTLR start "CHART"
    public final void mCHART() throws RecognitionException {
        try {
            int _type = CHART;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:990:7: ( 'T' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:990:9: 'T'
            {
            match('T'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHART"

    // $ANTLR start "CHARU"
    public final void mCHARU() throws RecognitionException {
        try {
            int _type = CHARU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:991:7: ( 'U' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:991:9: 'U'
            {
            match('U'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARU"

    // $ANTLR start "CHARV"
    public final void mCHARV() throws RecognitionException {
        try {
            int _type = CHARV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:992:7: ( 'V' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:992:9: 'V'
            {
            match('V'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARV"

    // $ANTLR start "CHARW"
    public final void mCHARW() throws RecognitionException {
        try {
            int _type = CHARW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:993:7: ( 'W' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:993:9: 'W'
            {
            match('W'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARW"

    // $ANTLR start "CHARX"
    public final void mCHARX() throws RecognitionException {
        try {
            int _type = CHARX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:994:7: ( 'X' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:994:9: 'X'
            {
            match('X'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARX"

    // $ANTLR start "CHARl"
    public final void mCHARl() throws RecognitionException {
        try {
            int _type = CHARl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:996:7: ( 'l' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:996:9: 'l'
            {
            match('l'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARl"

    // $ANTLR start "CHARu"
    public final void mCHARu() throws RecognitionException {
        try {
            int _type = CHARu;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:997:7: ( 'u' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:997:9: 'u'
            {
            match('u'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARu"

    // $ANTLR start "CHAR_SYMBOL_INF"
    public final void mCHAR_SYMBOL_INF() throws RecognitionException {
        try {
            int _type = CHAR_SYMBOL_INF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:999:17: ( '<' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:999:19: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR_SYMBOL_INF"

    // $ANTLR start "CHAR_SYMBOL_SUP"
    public final void mCHAR_SYMBOL_SUP() throws RecognitionException {
        try {
            int _type = CHAR_SYMBOL_SUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1000:17: ( '>' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1000:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR_SYMBOL_SUP"

    // $ANTLR start "LETTRE"
    public final void mLETTRE() throws RecognitionException {
        try {
            int _type = LETTRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1002:7: ( 'A' .. 'Z' | 'a' .. 'z' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTRE"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:8: ( CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR | CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 | POINT | PLUS | MOINS | CHARA | CHARB | CHARC | CHARD | CHARE | CHARF | CHARG | CHARH | CHARI | CHARK | CHARL | CHARM | CHARN | CHARO | CHARP | CHARR | CHARS | CHART | CHARU | CHARV | CHARW | CHARX | CHARl | CHARu | CHAR_SYMBOL_INF | CHAR_SYMBOL_SUP | LETTRE )
        int alt1=47;
        alt1 = dfa1.predict(input);
        switch (alt1) {
            case 1 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:10: CR
                {
                mCR(); 


                }
                break;
            case 2 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:13: TOKENMISMATCH
                {
                mTOKENMISMATCH(); 


                }
                break;
            case 3 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:27: DELIMITER1
                {
                mDELIMITER1(); 


                }
                break;
            case 4 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:38: DELIMITER2
                {
                mDELIMITER2(); 


                }
                break;
            case 5 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:49: DELIMITER3
                {
                mDELIMITER3(); 


                }
                break;
            case 6 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:60: DELIMITERS
                {
                mDELIMITERS(); 


                }
                break;
            case 7 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:71: REPETITEUR
                {
                mREPETITEUR(); 


                }
                break;
            case 8 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:82: CHIFFRE0
                {
                mCHIFFRE0(); 


                }
                break;
            case 9 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:91: CHIFFRE1
                {
                mCHIFFRE1(); 


                }
                break;
            case 10 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:100: CHIFFRE2
                {
                mCHIFFRE2(); 


                }
                break;
            case 11 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:109: CHIFFRE3
                {
                mCHIFFRE3(); 


                }
                break;
            case 12 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:118: CHIFFRE4
                {
                mCHIFFRE4(); 


                }
                break;
            case 13 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:127: CHIFFRE5
                {
                mCHIFFRE5(); 


                }
                break;
            case 14 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:136: CHIFFRE6
                {
                mCHIFFRE6(); 


                }
                break;
            case 15 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:145: CHIFFRE7
                {
                mCHIFFRE7(); 


                }
                break;
            case 16 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:154: CHIFFRE8
                {
                mCHIFFRE8(); 


                }
                break;
            case 17 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:163: CHIFFRE9
                {
                mCHIFFRE9(); 


                }
                break;
            case 18 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:172: POINT
                {
                mPOINT(); 


                }
                break;
            case 19 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:178: PLUS
                {
                mPLUS(); 


                }
                break;
            case 20 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:183: MOINS
                {
                mMOINS(); 


                }
                break;
            case 21 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:189: CHARA
                {
                mCHARA(); 


                }
                break;
            case 22 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:195: CHARB
                {
                mCHARB(); 


                }
                break;
            case 23 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:201: CHARC
                {
                mCHARC(); 


                }
                break;
            case 24 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:207: CHARD
                {
                mCHARD(); 


                }
                break;
            case 25 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:213: CHARE
                {
                mCHARE(); 


                }
                break;
            case 26 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:219: CHARF
                {
                mCHARF(); 


                }
                break;
            case 27 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:225: CHARG
                {
                mCHARG(); 


                }
                break;
            case 28 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:231: CHARH
                {
                mCHARH(); 


                }
                break;
            case 29 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:237: CHARI
                {
                mCHARI(); 


                }
                break;
            case 30 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:243: CHARK
                {
                mCHARK(); 


                }
                break;
            case 31 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:249: CHARL
                {
                mCHARL(); 


                }
                break;
            case 32 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:255: CHARM
                {
                mCHARM(); 


                }
                break;
            case 33 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:261: CHARN
                {
                mCHARN(); 


                }
                break;
            case 34 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:267: CHARO
                {
                mCHARO(); 


                }
                break;
            case 35 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:273: CHARP
                {
                mCHARP(); 


                }
                break;
            case 36 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:279: CHARR
                {
                mCHARR(); 


                }
                break;
            case 37 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:285: CHARS
                {
                mCHARS(); 


                }
                break;
            case 38 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:291: CHART
                {
                mCHART(); 


                }
                break;
            case 39 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:297: CHARU
                {
                mCHARU(); 


                }
                break;
            case 40 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:303: CHARV
                {
                mCHARV(); 


                }
                break;
            case 41 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:309: CHARW
                {
                mCHARW(); 


                }
                break;
            case 42 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:315: CHARX
                {
                mCHARX(); 


                }
                break;
            case 43 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:321: CHARl
                {
                mCHARl(); 


                }
                break;
            case 44 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:327: CHARu
                {
                mCHARu(); 


                }
                break;
            case 45 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:333: CHAR_SYMBOL_INF
                {
                mCHAR_SYMBOL_INF(); 


                }
                break;
            case 46 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:349: CHAR_SYMBOL_SUP
                {
                mCHAR_SYMBOL_SUP(); 


                }
                break;
            case 47 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\aider\\org\\hprim\\parser\\antlr\\HPRIMS.g:1:365: LETTRE
                {
                mLETTRE(); 


                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\1\uffff\1\56\1\60\3\uffff\1\62\101\uffff";
    static final String DFA1_eofS =
        "\110\uffff";
    static final String DFA1_minS =
        "\1\46\1\122\1\111\3\uffff\1\104\101\uffff";
    static final String DFA1_maxS =
        "\1\176\1\122\1\111\3\uffff\1\104\101\uffff";
    static final String DFA1_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
        "\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\31\1\32\1\33\1\34"+
        "\1\35\1\36\1\37\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
        "\1\53\1\54\1\55\1\56\1\57\1\1\1\27\1\2\1\40\1\6\1\30\1\25\1\26\1"+
        "\31\1\32\1\33\1\34\1\35\1\36\1\37\1\41\1\42\1\43\1\44\1\45\1\46"+
        "\1\47\1\50\1\51\1\52\1\53\1\54";
    static final String DFA1_specialS =
        "\110\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\5\4\uffff\1\23\1\uffff\1\24\1\22\1\uffff\1\10\1\11\1\12\1"+
            "\13\1\14\1\15\1\16\1\17\1\20\1\21\2\uffff\1\52\1\uffff\1\53"+
            "\2\uffff\1\25\1\26\1\1\1\6\1\27\1\30\1\31\1\32\1\33\1\54\1\34"+
            "\1\35\1\2\1\36\1\37\1\40\1\54\1\41\1\42\1\43\1\44\1\45\1\46"+
            "\1\47\2\54\3\uffff\1\7\2\uffff\13\54\1\50\10\54\1\51\5\54\1"+
            "\uffff\1\3\1\uffff\1\4",
            "\1\55",
            "\1\57",
            "",
            "",
            "",
            "\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( CR | TOKENMISMATCH | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR | CHIFFRE0 | CHIFFRE1 | CHIFFRE2 | CHIFFRE3 | CHIFFRE4 | CHIFFRE5 | CHIFFRE6 | CHIFFRE7 | CHIFFRE8 | CHIFFRE9 | POINT | PLUS | MOINS | CHARA | CHARB | CHARC | CHARD | CHARE | CHARF | CHARG | CHARH | CHARI | CHARK | CHARL | CHARM | CHARN | CHARO | CHARP | CHARR | CHARS | CHART | CHARU | CHARV | CHARW | CHARX | CHARl | CHARu | CHAR_SYMBOL_INF | CHAR_SYMBOL_SUP | LETTRE );";
        }
    }
 

}