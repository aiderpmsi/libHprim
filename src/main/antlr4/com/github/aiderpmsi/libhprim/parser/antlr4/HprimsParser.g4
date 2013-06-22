parser grammar HprimsParser;

options {

    // Default language but name it anyway
    //
    language  = Java;

    // Use the vocabulary generated by the accompanying
    // lexer. Maven knows how to work out the relationship
    // between the lexer and parser and will build the 
    // lexer before the parser. It will also rebuild the
    // parser if the lexer changes.
    //
    tokenVocab = HprimsLexer;
    
    superClass = AbstractHprimsParser;
    
}

@header {
import com.github.aiderpmsi.libhprim.parser.AbstractHprimsParser;
import java.util.HashMap;

}

hprim
@init{startDocument();}
@after{endDocument();} :
  (test_line_h_adm) =>
    ((test_line_h_2_0) => line_h_adm_2_0
     |
     (test_line_h_2_1) => line_h_adm_2_1
     |
     (test_line_h_2_2) => line_h_adm_2_2
    )
  |
  (test_line_h_fac) =>
    ((test_line_h_2_0) => line_h_fac_2_0
     |
     (test_line_h_2_1) => line_h_fac_2_1
     |
     (test_line_h_2_2) => line_h_fac_2_2
    )
  ;

// Test simple (utilisé dans un prédicat syntaxique) permettant de savoir
// quel type de message on a
test_line_h_adm :
  HCONTENT HDELIMITER1 HDELIMITER2 HREPETITER HESC HDELIMITER3
  DELIMITER1 (content | DELIMITER2 | REPETITER | DELIMITER3)*
  DELIMITER1 (content | DELIMITER2 | REPETITER | DELIMITER3)*
  DELIMITER1 (content | DELIMITER2 | REPETITER | DELIMITER3)*
  DELIMITER1 (content | DELIMITER2 | REPETITER | DELIMITER3)*
  DELIMITER1 a=content {matchRegex($a.contentText, "^ADM$");};

line_h
@init{startElement("HPRIM", new HashMap<String, String>(){{put("strictness", Integer.toString(getStrictNess()));}});}
@after{endElement();} :
   a=HCONTENT {startElement("H.1", new HashMap<String, String>());content($a.text);endElement();}
   b=HDELIMITER1 c=HDELIMITER2 d=HREPETITER e=HESC f=HDELIMITER3 {startElement("H.2", new HashMap<String, String>());content($b.text + $c.text + $d.text + $e.text + $f.text);endElement();}
   DELIMITER1 g=content {matchRegex("^.");} {startElement("H.3", new HashMap<String, String>());content($g.contentText);endElement();} DELIMITER1 CR+ NONPRINTABLE*
   line_p
   DELIMITER1 h=content {startElement("H.4", new HashMap<String, String>());content($h.contentText);endElement();} DELIMITER1 EOF;

// Types de base pour les contenus
content returns [String contentText]:
  g=baseContent ((CR+ NONPRINTABLE* line_a DELIMITER1 h=content {$contentText = $g.text + $h.contentText;}) | {$contentText = $g.text;});

// Débuts de ligne
line_a :
  {tryToken("A")}? baseContent;

line_p :
  {tryToken("P")}? baseContent;

baseContent :
  CONTENT?;