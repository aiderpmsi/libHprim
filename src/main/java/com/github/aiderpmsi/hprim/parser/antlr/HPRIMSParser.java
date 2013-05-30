// $ANTLR 3.4 C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g 2013-05-31 00:35:48

package com.github.aiderpmsi.hprim.parser.antlr;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.LinkedList;

import com.github.aiderpmsi.hprim.parser.MatchRegexTokenException;
import com.github.aiderpmsi.hprim.parser.ContentHandlerException;
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
      private int strictNess = 2;

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
        public boolean matchRegex(String text, String regex) {
          if (strictNess <= 1)
            return true;
          Pattern my_p = Pattern.compile(regex, Pattern.DOTALL);
          Matcher my_m = my_p.matcher(text);
          return my_m.matches();
        }




    // $ANTLR start "hprim"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:215:1: hprim : start_line_h EOF ;
    public final void hprim() throws RecognitionException {
        startDocument();
        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:217:24: ( start_line_h EOF )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:218:3: start_line_h EOF
            {
            pushFollow(FOLLOW_start_line_h_in_hprim76);
            start_line_h();

            state._fsp--;


            match(input,EOF,FOLLOW_EOF_in_hprim78); 

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



    // $ANTLR start "start_line_h"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:221:1: start_line_h : delimiters DELIMITER1 field DELIMITER1 field DELIMITER1 (h_5_1= spec_field[\"^.{1,}$\"] DELIMITER2 h_5_2= spec_field[\"^.{1,}$\"] (|{...}? ( DELIMITER2 spec_field[\"\"] )? ) ) {...}?;
    public final void start_line_h() throws RecognitionException {
        HPRIMSParser.spec_field_return h_5_1 =null;

        HPRIMSParser.spec_field_return h_5_2 =null;


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:221:14: ( delimiters DELIMITER1 field DELIMITER1 field DELIMITER1 (h_5_1= spec_field[\"^.{1,}$\"] DELIMITER2 h_5_2= spec_field[\"^.{1,}$\"] (|{...}? ( DELIMITER2 spec_field[\"\"] )? ) ) {...}?)
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:222:3: delimiters DELIMITER1 field DELIMITER1 field DELIMITER1 (h_5_1= spec_field[\"^.{1,}$\"] DELIMITER2 h_5_2= spec_field[\"^.{1,}$\"] (|{...}? ( DELIMITER2 spec_field[\"\"] )? ) ) {...}?
            {
            startElement("H.1");content("H");endElement();

            startElement("H.2");

            pushFollow(FOLLOW_delimiters_in_start_line_h95);
            delimiters();

            state._fsp--;


            endElement();

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h101); 

            startElement("H.3");

            pushFollow(FOLLOW_field_in_start_line_h105);
            field();

            state._fsp--;


            endElement();

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h111); 

            startElement("H.4");

            pushFollow(FOLLOW_field_in_start_line_h115);
            field();

            state._fsp--;


            endElement();

            match(input,DELIMITER1,FOLLOW_DELIMITER1_in_start_line_h121); 

            startElement("H.5");

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:227:5: (h_5_1= spec_field[\"^.{1,}$\"] DELIMITER2 h_5_2= spec_field[\"^.{1,}$\"] (|{...}? ( DELIMITER2 spec_field[\"\"] )? ) )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:227:6: h_5_1= spec_field[\"^.{1,}$\"] DELIMITER2 h_5_2= spec_field[\"^.{1,}$\"] (|{...}? ( DELIMITER2 spec_field[\"\"] )? )
            {
            startElement("H.5.1");

            pushFollow(FOLLOW_spec_field_in_start_line_h134);
            h_5_1=spec_field("^.{1,}$");

            state._fsp--;


            endElement();

            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_start_line_h144); 

            startElement("H.5.2");

            pushFollow(FOLLOW_spec_field_in_start_line_h150);
            h_5_2=spec_field("^.{1,}$");

            state._fsp--;


            endElement();

            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:229:6: (|{...}? ( DELIMITER2 spec_field[\"\"] )? )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EOF) ) {
                int LA2_1 = input.LA(2);

                if ( ((matchRegex((h_5_1!=null?input.toString(h_5_1.start,h_5_1.stop):null) + (h_5_2!=null?input.toString(h_5_2.start,h_5_2.stop):null), "^.{0,15}$"))) ) {
                    alt2=1;
                }
                else if ( ((((matchRegex((h_5_1!=null?input.toString(h_5_1.start,h_5_1.stop):null) + (h_5_2!=null?input.toString(h_5_2.start,h_5_2.stop):null), "^.{0,15}$"))&&(matchRegex((h_5_1!=null?input.toString(h_5_1.start,h_5_1.stop):null) + (h_5_2!=null?input.toString(h_5_2.start,h_5_2.stop):null), "^.{0,15}$")))&&(strictNess <= 2))) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==DELIMITER2) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:229:7: 
                    {
                    }
                    break;
                case 2 :
                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:229:9: {...}? ( DELIMITER2 spec_field[\"\"] )?
                    {
                    if ( !((strictNess <= 2)) ) {
                        throw new FailedPredicateException(input, "start_line_h", "strictNess <= 2");
                    }

                    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:229:28: ( DELIMITER2 spec_field[\"\"] )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==DELIMITER2) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:229:29: DELIMITER2 spec_field[\"\"]
                            {
                            match(input,DELIMITER2,FOLLOW_DELIMITER2_in_start_line_h166); 

                            pushFollow(FOLLOW_spec_field_in_start_line_h168);
                            spec_field("");

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            if ( !((matchRegex((h_5_1!=null?input.toString(h_5_1.start,h_5_1.stop):null) + (h_5_2!=null?input.toString(h_5_2.start,h_5_2.stop):null), "^.{0,15}$"))) ) {
                throw new FailedPredicateException(input, "start_line_h", "matchRegex($h_5_1.text + $h_5_2.text, \"^.{0,15}$\")");
            }

            endElement();

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


    public static class spec_field_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "spec_field"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:234:1: spec_field[String fieldPattern] :{...}? CONTENT ;
    public final HPRIMSParser.spec_field_return spec_field(String fieldPattern) throws RecognitionException {
        HPRIMSParser.spec_field_return retval = new HPRIMSParser.spec_field_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:234:33: ({...}? CONTENT )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:235:3: {...}? CONTENT
            {
            if ( !((matchRegex(input.LT(1).getText(), fieldPattern))) ) {
                throw new FailedPredicateException(input, "spec_field", "matchRegex(input.LT(1).getText(), fieldPattern)");
            }

            match(input,CONTENT,FOLLOW_CONTENT_in_spec_field195); 

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
    // $ANTLR end "spec_field"


    public static class field_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "field"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:240:1: field : CONTENT ;
    public final HPRIMSParser.field_return field() throws RecognitionException {
        HPRIMSParser.field_return retval = new HPRIMSParser.field_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:240:7: ( CONTENT )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:241:3: CONTENT
            {
            match(input,CONTENT,FOLLOW_CONTENT_in_field210); 

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
    // $ANTLR end "field"


    public static class delimiters_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "delimiters"
    // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:245:1: delimiters : DELIMITERS ;
    public final HPRIMSParser.delimiters_return delimiters() throws RecognitionException {
        HPRIMSParser.delimiters_return retval = new HPRIMSParser.delimiters_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:245:12: ( DELIMITERS )
            // C:\\Users\\delabre\\git\\libHprim\\target\\classes\\com\\github\\aiderpmsi\\hprim\\parser\\antlr\\HPRIMS.g:246:3: DELIMITERS
            {
            match(input,DELIMITERS,FOLLOW_DELIMITERS_in_delimiters225); 

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
    // $ANTLR end "delimiters"

    // Delegated rules


 

    public static final BitSet FOLLOW_start_line_h_in_hprim76 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hprim78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delimiters_in_start_line_h95 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_start_line_h105 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_field_in_start_line_h115 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DELIMITER1_in_start_line_h121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h134 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DELIMITER2_in_start_line_h144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h150 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DELIMITER2_in_start_line_h166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_spec_field_in_start_line_h168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_spec_field195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTENT_in_field210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITERS_in_delimiters225 = new BitSet(new long[]{0x0000000000000002L});

}