// $ANTLR 3.4 C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g 2013-06-05 23:17:58

package com.github.aiderpmsi.hprim.parser.antlr;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class HPRIMSLexer extends Lexer {
    public static final int EOF=-1;
    public static final int CONTENT=4;
    public static final int CR=5;
    public static final int DELIMITER1=6;
    public static final int DELIMITER2=7;
    public static final int DELIMITER3=8;
    public static final int DELIMITERS=9;
    public static final int LINE_AP=10;
    public static final int LINE_C=11;
    public static final int LINE_GENERIC=12;
    public static final int LINE_H=13;
    public static final int LINE_OBR=14;
    public static final int LINE_OBX=15;
    public static final int LINE_P=16;
    public static final int REPETITEUR=17;



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
    public String getGrammarFileName() { return "C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g"; }

    // $ANTLR start "CR"
    public final void mCR() throws RecognitionException {
        try {
            int _type = CR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:684:4: ( 'h' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:684:6: 'h'
            {
            match('h'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CR"

    // $ANTLR start "DELIMITER1"
    public final void mDELIMITER1() throws RecognitionException {
        try {
            int _type = DELIMITER1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:685:11: ( 'f' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:685:13: 'f'
            {
            match('f'); 

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
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:686:11: ( 'e' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:686:13: 'e'
            {
            match('e'); 

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
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:687:11: ( 'd' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:687:13: 'd'
            {
            match('d'); 

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
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:688:11: ( 'c' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:688:13: 'c'
            {
            match('c'); 

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
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:689:11: ( 'b' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:689:13: 'b'
            {
            match('b'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REPETITEUR"

    // $ANTLR start "CONTENT"
    public final void mCONTENT() throws RecognitionException {
        try {
            int _type = CONTENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:690:8: ( 'a' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:690:10: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTENT"

    // $ANTLR start "LINE_AP"
    public final void mLINE_AP() throws RecognitionException {
        try {
            int _type = LINE_AP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:692:8: ( 'o' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:692:10: 'o'
            {
            match('o'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_AP"

    // $ANTLR start "LINE_C"
    public final void mLINE_C() throws RecognitionException {
        try {
            int _type = LINE_C;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:693:7: ( 'm' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:693:9: 'm'
            {
            match('m'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_C"

    // $ANTLR start "LINE_GENERIC"
    public final void mLINE_GENERIC() throws RecognitionException {
        try {
            int _type = LINE_GENERIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:694:13: ( 'l' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:694:15: 'l'
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
    // $ANTLR end "LINE_GENERIC"

    // $ANTLR start "LINE_H"
    public final void mLINE_H() throws RecognitionException {
        try {
            int _type = LINE_H;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:695:7: ( 'i' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:695:9: 'i'
            {
            match('i'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_H"

    // $ANTLR start "LINE_OBR"
    public final void mLINE_OBR() throws RecognitionException {
        try {
            int _type = LINE_OBR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:696:9: ( 'k' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:696:11: 'k'
            {
            match('k'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_OBR"

    // $ANTLR start "LINE_OBX"
    public final void mLINE_OBX() throws RecognitionException {
        try {
            int _type = LINE_OBX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:697:9: ( 'n' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:697:11: 'n'
            {
            match('n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_OBX"

    // $ANTLR start "LINE_P"
    public final void mLINE_P() throws RecognitionException {
        try {
            int _type = LINE_P;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:698:7: ( 'j' )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:698:9: 'j'
            {
            match('j'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_P"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1:8: ( CR | DELIMITER1 | DELIMITER2 | DELIMITER3 | DELIMITERS | REPETITEUR | CONTENT | LINE_AP | LINE_C | LINE_GENERIC | LINE_H | LINE_OBR | LINE_OBX | LINE_P )
        int alt1=14;
        switch ( input.LA(1) ) {
        case 'h':
            {
            alt1=1;
            }
            break;
        case 'f':
            {
            alt1=2;
            }
            break;
        case 'e':
            {
            alt1=3;
            }
            break;
        case 'd':
            {
            alt1=4;
            }
            break;
        case 'c':
            {
            alt1=5;
            }
            break;
        case 'b':
            {
            alt1=6;
            }
            break;
        case 'a':
            {
            alt1=7;
            }
            break;
        case 'o':
            {
            alt1=8;
            }
            break;
        case 'm':
            {
            alt1=9;
            }
            break;
        case 'l':
            {
            alt1=10;
            }
            break;
        case 'i':
            {
            alt1=11;
            }
            break;
        case 'k':
            {
            alt1=12;
            }
            break;
        case 'n':
            {
            alt1=13;
            }
            break;
        case 'j':
            {
            alt1=14;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;

        }

        switch (alt1) {
            case 1 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1:10: CR
                {
                mCR(); 


                }
                break;
            case 2 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1:13: DELIMITER1
                {
                mDELIMITER1(); 


                }
                break;
            case 3 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1:24: DELIMITER2
                {
                mDELIMITER2(); 


                }
                break;
            case 4 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1:35: DELIMITER3
                {
                mDELIMITER3(); 


                }
                break;
            case 5 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1:46: DELIMITERS
                {
                mDELIMITERS(); 


                }
                break;
            case 6 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1:57: REPETITEUR
                {
                mREPETITEUR(); 


                }
                break;
            case 7 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1:68: CONTENT
                {
                mCONTENT(); 


                }
                break;
            case 8 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1:76: LINE_AP
                {
                mLINE_AP(); 


                }
                break;
            case 9 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1:84: LINE_C
                {
                mLINE_C(); 


                }
                break;
            case 10 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1:91: LINE_GENERIC
                {
                mLINE_GENERIC(); 


                }
                break;
            case 11 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1:104: LINE_H
                {
                mLINE_H(); 


                }
                break;
            case 12 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1:111: LINE_OBR
                {
                mLINE_OBR(); 


                }
                break;
            case 13 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1:120: LINE_OBX
                {
                mLINE_OBX(); 


                }
                break;
            case 14 :
                // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:1:129: LINE_P
                {
                mLINE_P(); 


                }
                break;

        }

    }


 

}