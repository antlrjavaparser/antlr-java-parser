/*
 [The "BSD licence"]
 Copyright (c) 2007-2008 Terence Parr.
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/


/* This is the Lexer part of the Java 6 grammar from Terry Parr as modified by
   Yang Jiang
   - modified to work as separate lexer and parser grammars
     by George S. Cowan, June, 2012.
   - modified to support Java7
     by Mike De Haan, December 14, 2012

   See Java7Parser.g4 for the full set of comments from previous maintainers
 */
lexer grammar Java7Lexer;

@lexer::header {
package net.java.antlrjavaparser;
}

SEMI         : ';';
PACKAGE      : 'package';
IMPORT       : 'import';
DOT          : '.';
STAR         : '*';
CLASS        : 'class';
IMPLEMENTS   : 'implements';
PUBLIC       : 'public';
PROTECTED    : 'protected';
PRIVATE      : 'private';
ABSTRACT     : 'abstract';
STATIC       : 'static';
FINAL        : 'final';
STRICTFP     : 'strictfp';
COMMA        : ',';
LBRACE       : '{';
RBRACE       : '}';
LBRACKET     : '[';
RBRACKET     : ']';
LPAREN       : '(';
RPAREN       : ')';
VOID         : 'void';
INTERFACE    : 'interface';
THROW        : 'throw';
THROWS       : 'throws';
EQ           : '=';
NATIVE       : 'native';
SYNCHRONIZED : 'synchronized';
TRANSIENT    : 'transient';
VOLATILE     : 'volatile';
BOOLEAN      : 'boolean';
CHAR         : 'char';
BYTE         : 'byte';
SHORT        : 'short';
INT          : 'int';
LONG         : 'long';
FLOAT        : 'float';
DOUBLE       : 'double';
QUES         : '?';
EXTENDS      : 'extends';
ELLIPSIS     : '...';
THIS         : 'this';
SUPER        : 'super';
NULL         : 'null';
TRUE         : 'true';
FALSE        : 'false';
AT           : '@';
DEFAULT      : 'default';
COLON        : ':';
IF           : 'if';
ELSE         : 'else';
FOR          : 'for';
WHILE        : 'while';
DO           : 'do';
TRY          : 'try';
FINALLY      : 'finally';
SWITCH       : 'switch';
RETURN       : 'return';
BREAK        : 'break';
CONTINUE     : 'continue';
CATCH        : 'catch';
CASE         : 'case';
ENUM         : 'enum';
ASSERT       : 'assert';
PLUSPLUS     : '++';
SUBSUB       : '--';
TILDE        : '~';
BANG         : '!';
NEW          : 'new';
SLASH        : '/';
PERCENT      : '%';
PLUS         : '+';
SUB          : '-';
EQEQ         : '==';
BANGEQ       : '!=';
AMP          : '&';
CARET        : '^';
BAR          : '|';
AMPAMP       : '&&';
BARBAR       : '||';
CARETEQ      : '^=';
PLUSEQ       : '+=';
SUBEQ        : '-=';
STAREQ       : '*=';
SLASHEQ      : '/=';
AMPEQ        : '&=';
BAREQ        : '|=';
PERCENTEQ    : '%=';
GT           : '>';
LT           : '<';
INSTANCEOF   : 'instanceof';
CONST        : 'const';
GOTO         : 'goto';

fragment
ZeroToThree
    :    '0'..'3'
    ;

fragment
IntegerTypeSuffix
    :    'l'
    |    'L'
    ;

fragment
DecimalFloatingPointLiteral
    :    Digits DOT Digits? ExponentPart? FloatTypeSuffix?
    |    DOT Digits ExponentPart? FloatTypeSuffix?
    |    Digits ExponentPart FloatTypeSuffix?
    |    Digits ExponentPart? FloatTypeSuffix
    ;

fragment
HexadecimalFloatingPointLiteral
    :    HexSignificand BinaryExponent FloatTypeSuffix?
    ;

fragment
JavaLetterOrDigit
    :    JavaLetter
    |    JavaDigit
    ;

fragment
UnicodeMarker
    :    'u'+                                                                                                           // u
    ;

/////////////////////////////////////////////// NUMBERS ///////////////////////////////////////

fragment
DecimalNumeral
    :    '0'
    |    NonZeroDigit Digits?
    |    NonZeroDigit Underscores Digits
    ;

fragment
Digits
    :    Digit
    |    Digit DigitsAndUnderscores? Digit
    ;

fragment
Digit
    :    '0'
    |    NonZeroDigit
    ;

fragment
NonZeroDigit
    :    '1'..'9'
    ;

fragment
DigitsAndUnderscores
    :    DigitOrUnderscore+
    ;

fragment
DigitOrUnderscore
    :    Digit
    |    '_'
    ;

fragment
Underscores
    :    '_'+
    ;

fragment
HexNumeral
    :    '0' 'x' HexDigits
    |    '0' 'X' HexDigits
    ;

fragment
HexDigits
    :    HexDigit
    |    HexDigit HexDigitsAndUnderscores? HexDigit
    ;

fragment
HexDigit
    :    ('0'..'9' | 'a'..'f' | 'A'..'F')
    ;

fragment
HexDigitsAndUnderscores
    :    HexDigitOrUnderscore+
    ;

fragment
HexDigitOrUnderscore
    :    HexDigit
    |    '_'
    ;

fragment
OctalNumeral
    :    '0' OctalDigits
    |    '0' Underscores OctalDigits
    ;

fragment
OctalDigits
    :    OctalDigit
    |    OctalDigit OctalDigitsAndUnderscores? OctalDigit
    ;

fragment
OctalDigit
    :    '0'..'7'
    ;

fragment
OctalDigitsAndUnderscores
    :    OctalDigitOrUnderscore+
    ;

fragment
OctalDigitOrUnderscore
    :    OctalDigit
    |    '_'
    ;

fragment
BinaryNumeral
    :    '0' 'b' BinaryDigits
    |    '0' 'B' BinaryDigits
    ;

fragment
BinaryDigits
    :    BinaryDigit
    |    BinaryDigit BinaryDigitsAndUnderscores? BinaryDigit
    ;

fragment
BinaryDigit
    :    '0'..'1'
    ;

fragment
BinaryDigitsAndUnderscores
    :    BinaryDigitOrUnderscore+
    ;

fragment
BinaryDigitOrUnderscore
    :    BinaryDigit
    |    '_'
    ;


fragment
ExponentPart
    :    ('e' | 'E') SignedInteger
    ;

fragment
SignedInteger
    :    Sign? Digits
    ;

fragment
Sign
    :    PLUS
    |    SUB
    ;

fragment
FloatTypeSuffix
    :    'f'
    |    'F'
    |    'd'
    |    'D'
    ;

fragment
HexSignificand
    :    HexNumeral
    |    HexNumeral DOT
    |    '0' 'x' HexDigits? DOT HexDigits
    |    '0' 'X' HexDigits? DOT HexDigits
    ;

fragment
BinaryExponent
    :    ('p' | 'P') SignedInteger
    ;

fragment
SingleCharacter
    :    ~['\\]
    ;

fragment
OctalEscape
    :    '\\' OctalDigit                                                                                                  // \ OctalDigit
    |    '\\' OctalDigit OctalDigit                                                                                       // \ OctalDigit OctalDigit
    |    '\\' ZeroToThree OctalDigit OctalDigit                                                                           // \ ZeroToThree OctalDigit OctalDigit
    ;

fragment
IdentifierChars
    :    JavaLetter JavaLetterOrDigit*                                                                                                   // JavaLetter
    ;

fragment
JavaLetter                  // any Unicode character that is a Java letter (see below)
    :    '\u0024'           // $
    |    '\u0041'..'\u005a' // A-Z
    |    '\u005f'           // _
    |    '\u0061'..'\u007a' // a-z
    |    '\u00c0'..'\u00d6' // À-Ö
    |    '\u00d8'..'\u00f6' // Ø-ö
    |    '\u00f8'..'\u00ff' // ø-ÿ
    |    '\u0100'..'\u1fff'
    |    '\u3040'..'\u318f'
    |    '\u3300'..'\u337f'
    |    '\u3400'..'\u3d2d'
    |    '\u4e00'..'\u9fff'
    |    '\uf900'..'\ufaff'
    ;

fragment
JavaDigit
    :    '\u0030'..'\u0039'   // 0-9
    |    '\u0660'..'\u0669'   // Arabic 0-9
    |    '\u06f0'..'\u06f9'   // Arabic-Indic 0-9
    |    '\u0966'..'\u096f'   // Devanagari 0-9
    |    '\u09e6'..'\u09ef'   // Bengali 0-9
    |    '\u0a66'..'\u0a6f'   // Gurmukhi 0-9
    |    '\u0ae6'..'\u0aef'   // Gujarati 0-9
    |    '\u0b66'..'\u0b6f'   // Oriya 0-9
    |    '\u0be7'..'\u0bef'   // Tamil 0-9
    |    '\u0c66'..'\u0c6f'   // Telugu 0-9
    |    '\u0ce6'..'\u0cef'   // Kannada 0-9
    |    '\u0d66'..'\u0d6f'   // Malayalam 0-9
    |    '\u0e50'..'\u0e59'   // Thai 0-9
    |    '\u0ed0'..'\u0ed9'   // Lao 0-9
    |    '\u1040'..'\u1049'   // Myanmar 0-9
    ;

fragment
EscapeSequence
    :    '\\b' /* \u0008: backspace BS */
    |    '\\t' /* \u0009: horizontal tab HT */
    |    '\\n' /* \u000a: linefeed LF */
    |    '\\f' /* \u000c: form feed FF */
    |    '\\r' /* \u000d: carriage return CR */
    |    '\\"' /* \u0022: double quote " */
    |    '\\\'' /* \u0027: single quote ' */
    |    '\\\\' /* \u005c: backslash \ */
    |    OctalEscape /* \u0000 to \u00ff: from octal value */
    ;

fragment
RawInputCharacter	// any Unicode character
    :    '\u0024'
    |    '\u0041'..'\u005a'
    |    '\u005f'
    |    '\u0061'..'\u007a'
    |    '\u00c0'..'\u00d6'
    |    '\u00d8'..'\u00f6'
    |    '\u00f8'..'\u00ff'
    |    '\u0100'..'\u1fff'
    |    '\u3040'..'\u318f'
    |    '\u3300'..'\u337f'
    |    '\u3400'..'\u3d2d'
    |    '\u4e00'..'\u9fff'
    |    '\uf900'..'\ufaff'
    ;

fragment
DecimalIntegerLiteral
    :    DecimalNumeral IntegerTypeSuffix?
    ;

fragment
HexIntegerLiteral
    :    HexNumeral IntegerTypeSuffix?
    ;

fragment
OctalIntegerLiteral
    :    OctalNumeral IntegerTypeSuffix?
    ;

fragment
BinaryIntegerLiteral
    :    BinaryNumeral IntegerTypeSuffix?
    ;


fragment
InputCharacter
    :    UnicodeInputCharacter
    ;

fragment
UnicodeInputCharacter
    :    UnicodeEscape                                                                                                 // UnicodeEscape
    |    RawInputCharacter                                                                                             // RawInputCharacter
    ;

fragment
UnicodeEscape
    :    '\\' UnicodeMarker HexDigit HexDigit HexDigit HexDigit
    ;

fragment
StringCharacters
    :    StringCharacter+                                                                                               // StringCharacter
    ;

fragment
StringCharacter
    :    EscapeSequence
    |    UnicodeEscape
    |    ~('"'|'\\')
    ;

/////// NON-FRAGMENTS //////////

IntegerLiteral
    :    DecimalIntegerLiteral
    |    HexIntegerLiteral
    |    OctalIntegerLiteral
    |    BinaryIntegerLiteral
    ;

FloatingPointLiteral
    :    DecimalFloatingPointLiteral
    |    HexadecimalFloatingPointLiteral
    ;

CharacterLiteral
    :    '\'' SingleCharacter '\''                                                                                           // ' SingleCharacter '
    |    '\'' EscapeSequence '\''                                                                                            // ' EscapeSequence '
    |    '\'' UnicodeEscape '\''
    ;

StringLiteral
    :    '"' StringCharacter*? '"'
    ;

Identifier
    :    IdentifierChars
    ;

WhiteSpace
    :    (' '
    |    '\u0009'                                        // the ASCII HT character, also known as "horizontal tab"
    |    '\u000C'                                        // the ASCII FF character, also known as "form feed"
    |    LineTerminator)  -> channel(HIDDEN)                                // LineTerminator
    ;

LineTerminator
    :    ('\n'
    |    '\r'
    |    '\r\n')          -> channel(HIDDEN)
    ;

SlashComment
    :   '/*' .*? '*/'    -> channel(HIDDEN) // match anything between /* and */
    ;

EndOfLineComment
    :    '//' .*? LineTerminator -> channel(HIDDEN)
    ;
