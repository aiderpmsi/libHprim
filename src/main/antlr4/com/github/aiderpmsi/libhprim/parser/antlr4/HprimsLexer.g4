// This is a sample lexer generated by the ANTLR3 Maven Archetype
// generator. It shows how to use a superclass to implement
// support methods and variables you may use in the lexer actions
// rather than create a messy lexer that has the Java code embedded
// in it.
//

lexer grammar HprimsLexer;

options {

   language=Java;  // Default

   // Tell ANTLR to make the generated lexer class extend the
   // the named class, which is where any supporting code and 
   // variables will be placed.
   //
   superClass = AbstractHprimsLexer;
}

// What package should the generated source exist in?
//
@header {
import com.github.aiderpmsi.libhprim.parser.AbstractHprimsLexer;
}

CR : {isNewLine()}? . ;
DELIMITER1 : {tryToken(delimiters[0])}? . ;
DELIMITER2 : {tryToken(delimiters[1])}? . ;
REPETITER : {tryToken(delimiters[2])}? . ;
ESC : {tryToken(delimiters[3])}? . ;
DELIMITER3 : {tryToken(delimiters[4])}? . ;
NONPRINTABLE : {isNotPrintable()}? . ;
PRINTABLE : . ;