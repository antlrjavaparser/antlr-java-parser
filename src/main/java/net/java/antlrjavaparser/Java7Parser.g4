/*
 [The "BSD licence"]
 Copyright (c) 2007-2008 Terence Parr
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

/*
 *  Updated - December 14, 2012 - Mike De Haan,
 *      Added multi-catch, diamond type arguments, try with resources, and underscores in literals to support Java 7.
 *      This grammar successfully parses every .java file in the JDK 1.7 source
 */

/* This is the Parser part of the Java 6 grammar from Terry Parr as modified by
   Yang Jiang - modified to work as separate lexer and parser grammars by
   George S. Cowan, June, 2012.

   The motivation for this was to speed up the process of making iterative
   changes to the Java grammar for experimenting with new language features.
   Generate and compile with my ant script only dropped from 14 to 6 seconds,
   but it helps a little.

   The only changes to the parser that were needed were to replace token
   literals with token names, e.g., replace ',' with COMMA, and then add
   the tokenVocab=Java6Lex option. And of course change the grammar line to
     parser grammar Java6Parse;

   The full set of previous comments by Terry Parr and Yang Jiang follows.
   That parser is apparently the parser from the OpenJava project after
   automatic elimination of manual code to construct the AST that is
   used by the OpenJava compiler
   See http://openjdk.java.net/projects/compiler-grammar/
   and http://openjdk.java.net/projects/compiler-grammar/antlrworks/Java.g
 */

/*
 * This file is modified by Yang Jiang (yang.jiang.z@gmail.com), taken from the original
 * java grammar in www.antlr.org, with the goal to provide a standard ANTLR grammar
 * for java, as well as an implementation to construct the same AST trees as javac does.
 *
 * The major changes of this version as compared to the original version include:
 * 1) Top level rules are changed to include all of their sub-components.
 *    For example, the rule
 *
 *      classOrInterfaceDeclaration
 *          :   classOrInterfaceModifiers (classDeclaration | interfaceDeclaration)
 *      ;
 *
 *    is changed to
 *
 *      classOrInterfaceDeclaration
 *          :   classDeclaration | interfaceDeclaration
 *      ;
 *
 *    with classOrInterfaceModifiers been moved inside classDeclaration and
 *    interfaceDeclaration.
 *
 * 2) The original version is not quite clear on certain rules like memberDecl,
 *    where it mixed the styles of listing of top level rules and listing of sub rules.
 *
 *    memberDecl
 *      :   genericMethodOrConstructorDecl
 *      |   memberDeclaration
 *      |   VOID Identifier voidMethodDeclaratorRest
 *      |   Identifier constructorDeclaratorRest
 *      |   interfaceDeclaration
 *      |   classDeclaration
 *      ;
 *
 *    This is changed to a
 *
 *    memberDecl
 *      :   fieldDeclaration
 *      |   methodDeclaration
 *      |   classDeclaration
 *      |   interfaceDeclaration
 *      ;
 *    by folding similar rules into single rule.
 *
 * 3) Some syntactical predicates are added for efficiency, although this is not necessary
 *    for correctness.
 *
 * 4) Lexer part is rewritten completely to construct tokens needed for the parser.
 *
 * 5) This grammar adds more source level support
 *
 *
 * This grammar also adds bug fixes.
 *
 * 1) Adding typeArguments to superSuffix to alHexSignificandlow input like
 *      super.<TYPE>method()
 *
 * 2) Adding typeArguments to innerCreator to allow input like
 *      new Type1<String, Integer>().new Type2<String>()
 *
 * 3) conditionalExpression is changed to
 *    conditionalExpression
 *      :   conditionalOrExpression ( '?' expression ':' conditionalExpression )?
 *      ;
 *    to accept input like
 *      true?1:2=3
 *
 *    Note: note this is by no means a valid input, by the grammar should be able to parse
 *    this as
 *            (true?1:2)=3
 *    rather than
 *            true?1:(2=3)
 *
 *
 *  Know problems:
 *    Won't pass input containing unicode sequence like this
 *      char c = '\uffff'
 *      String s = "\uffff";
 *    Because Antlr does not treat '\uffff' as an valid char. This will be fixed in the next Antlr
 *    release. [Fixed in Antlr-3.1.1]
 *
 *  Things to do:
 *    More effort to make this grammar faster.
 *    Error reporting/recovering.
 *
 *
 *  NOTE: If you try to compile this file from command line and Antlr gives an exception
 *    like error message while compiling, add option
 *    -Xconversiontimeout 100000
 *    to the command line.
 *    If it still doesn't work or the compilation process
 *    takes too long, try to comment out the following two lines:
 *    |    {isValidSurrogateIdentifierStart((char)input.LT(1), (char)input.LT(2))}?=>('\ud800'..'\udbff') ('\udc00'..'\udfff')
 *    |    {isValidSurrogateIdentifierPart((char)input.LT(1), (char)input.LT(2))}?=>('\ud800'..'\udbff') ('\udc00'..'\udfff')
 *
 *
 *  Below are comments found in the original version.
 */


/** A Java 1.5 grammar for ANTLR v3 derived from the spec
 *
 *  This is a very close representation of the spec; the changes
 *  are comestic (remove left recursion) and also fixes (the spec
 *  isn't exactly perfect).  I have run this on the 1.4.2 source
 *  and some nasty looking enums from 1.5, but have not really
 *  tested for 1.5 compatibility.
 *
 *  I built this with: java -Xmx100M org.antlr.Tool java.g
 *  and got two errors that are ok (for now):
 *  java.g:691:9: Decision can match input such as
 *    "'0'..'9'{'E', 'e'}{'+', '-'}'0'..'9'{'D', 'F', 'd', 'f'}"
 *    using multiple alternatives: 3, 4
 *  As a result, alternative(s) 4 were disabled for that input
 *  java.g:734:35: Decision can match input such as "{'$', 'A'..'Z',
 *    '_', 'a'..'z', '\u00C0'..'\u00D6', '\u00D8'..'\u00F6',
 *    '\u00F8'..'\u1FFF', '\u3040'..'\u318F', '\u3300'..'\u337F',
 *    '\u3400'..'\u3D2D', '\u4E00'..'\u9FFF', '\uF900'..'\uFAFF'}"
 *    using multiple alternatives: 1, 2
 *  As a result, alternative(s) 2 were disabled for that input
 *
 *  You can turn enum on/off as a keyword :)
 *
 *  Version 1.0 -- initial release July 5, 2006 (requires 3.0b2 or higher)
 *
 *  Primary author: Terence Parr, July 2006
 *
 *  Version 1.0.1 -- corrections by Koen Vanderkimpen & Marko van Dooren,
 *      October 25, 2006;
 *      fixed normalInterfaceDeclaration: now uses typeParameters instead
 *          of typeParameter (according to JLS, 3rd edition)
 *      fixed castExpression: no longer allows expression next to type
 *          (according to semantics in JLS, in contrast with syntax in JLS)
 *
 *  Version 1.0.2 -- Terence Parr, Nov 27, 2006
 *      java spec I built this from had some bizarre for-loop control.
 *          Looked weird and so I looked elsewhere...Yep, it's messed up.
 *          simplified.
 *
 *  Version 1.0.3 -- Chris Hogue, Feb 26, 2007
 *      Factored out an annotationName rule and used it in the annotation rule.
 *          Not sure why, but typeName wasn't recognizing references to inner
 *          annotations (e.g. @InterfaceName.InnerAnnotation())
 *      Factored out the elementValue section of an annotation reference.  Created
 *          elementValuePair and elementValuePairs rules, then used them in the
 *          annotation rule.  Allows it to recognize annotation references with
 *          multiple, comma separated attributes.
 *      Updated elementValueArrayInitializer so that it allows multiple elements.
 *          (It was only allowing 0 or 1 element).
 *      Updated localVariableDeclaration to allow annotations.  Interestingly the JLS
 *          doesn't appear to indicate this is legal, but it does work as of at least
 *          JDK 1.5.0_06.
 *      Moved the Identifier portion of annotationTypeElementRest to annotationMethodRest.
 *          Because annotationConstantRest already references variableDeclarator which
 *          has the Identifier portion in it, the parser would fail on constants in
 *          annotation definitions because it expected two identifiers.
 *      Added optional trailing ';' to the alternatives in annotationTypeElementRest.
 *          Wouldn't handle an inner interface that has a trailing ';'.
 *      Swapped the expression and type rule reference order in castExpression to
 *          make it check for genericized casts first.  It was failing to recognize a
 *          statement like  "Class<Byte> TYPE = (Class<Byte>)...;" because it was seeing
 *          'Class<Byte' in the cast expression as a less than expression, then failing
 *          on the '>'.
 *      Changed createdName to use typeArguments instead of nonWildcardTypeArguments.
 *
 *      Changed the 'this' alternative in primary to allow 'identifierSuffix' rather than
 *          just 'arguments'.  The case it couldn't handle was a call to an explicit
 *          generic method invocation (e.g. this.<E>doSomething()).  Using identifierSuffix
 *          may be overly aggressive--perhaps should create a more constrained thisSuffix rule?
 *
 *  Version 1.0.4 -- Hiroaki Nakamura, May 3, 2007
 *
 *  Fixed formalParameterDecls, localVariableDeclaration, forInit,
 *  and forVarControl to use variableModifier* not 'final'? (annotation)?
 *
 *  Version 1.0.5 -- Terence, June 21, 2007
 *  --a[i].foo didn't work. Fixed unaryExpression
 *
 *  Version 1.0.6 -- John Ridgway, March 17, 2008
 *      Made "assert" a switchable keyword like "enum".
 *      Fixed compilationUnit to disallow "annotation importDeclaration ...".
 *      Changed "Identifier ('.' Identifier)*" to "qualifiedName" in more
 *          places.
 *      Changed modifier* and/or variableModifier* to classOrInterfaceModifiers,
 *          modifiers or variableModifiers, as appropriate.
 *      Renamed "bound" to "typeBound" to better match language in the JLS.
 *      Added "memberDeclaration" which rewrites to methodDeclaration or
 *      fieldDeclaration and pulled type into memberDeclaration.  So we parse
 *          type and then move on to decide whether we're dealing with a field
 *          or a method.
 *      Modified "constructorDeclaration" to use "constructorBody" instead of
 *          "methodBody".  constructorBody starts with explicitConstructorInvocation,
 *          then goes on to blockStatement*.  Pulling explicitConstructorInvocation
 *          out of expressions allowed me to simplify "primary".
 *      Changed variableDeclarator to simplify it.
 *      Changed type to use classOrInterfaceType, thus simplifying it; of course
 *          I then had to add classOrInterfaceType, but it is used in several
 *          places.
 *      Fixed annotations, old version allowed "@X(y,z)", which is illegal.
 *      Added optional comma to end of "elementValueArrayInitializer"; as per JLS.
 *      Changed annotationTypeElementRest to use normalClassDeclaration and
 *          normalInterfaceDeclaration rather than classDeclaration and
 *          interfaceDeclaration, thus getting rid of a couple of grammar ambiguities.
 *      Split localVariableDeclaration into localVariableDeclarationStatement
 *          (includes the terminating semi-colon) and localVariableDeclaration.
 *          This allowed me to use localVariableDeclaration in "forInit" clauses,
 *           simplifying them.
 *      Changed switchBlockStatementGroup to use multiple labels.  This adds an
 *          ambiguity, but if one uses appropriately greedy parsing it yields the
 *           parse that is closest to the meaning of the switch statement.
 *      Renamed "forVarControl" to "enhancedForControl" -- JLS language.
 *      Added semantic predicates to test for shift operations rather than other
 *          things.  Thus, for instance, the string "< <" will never be treated
 *          as a left-shift operator.
 *      In "creator" we rule out "nonWildcardTypeArguments" on arrayCreation,
 *          which are illegal.
 *      Moved "nonWildcardTypeArguments into innerCreator.
 *      Removed 'super' superSuffix from explicitGenericInvocation, since that
 *          is only used in explicitConstructorInvocation at the beginning of a
 *           constructorBody.  (This is part of the simplification of expressions
 *           mentioned earlier.)
 *      Simplified primary (got rid of those things that are only used in
 *          explicitConstructorInvocation).
 *      Lexer -- removed "Exponent?" from FloatingPointLiteral choice 4, since it
 *          led to an ambiguity.
 *
 *      This grammar successfully parses every .java file in the JDK 1.5 source
 *          tree (excluding those whose file names include '-', which are not
 *          valid Java compilation units).
 *
 *  Known remaining problems:
 *      "Letter" and "JavaIDDigit" are wrong.  The actual specification of
 *      "Letter" should be "a character for which the method
 *      Character.isJavaIdentifierStart(int) returns true."  A "Java
 *      letter-or-digit is a character for which the method
 *      Character.isJavaIdentifierPart(int) returns true."
 *
 */
parser grammar Java7Parser;

@parser::header {
package net.java.antlrjavaparser;
}

options {
    tokenVocab=Java7Lexer;
}

/********************************************************************************************
                          Parser section
*********************************************************************************************/

compilationUnit
    :   packageDeclaration?
        (importDeclaration
        )*
        (typeDeclaration
        )*
    ;

packageDeclaration
    :   annotations?
        PACKAGE qualifiedName
        SEMI
    ;

importDeclaration
    :   IMPORT
        (STATIC
        )?
        Identifier DOT STAR
        SEMI
    |   IMPORT
        (STATIC
        )?
        Identifier
        (DOT Identifier
        )+
        (DOT STAR
        )?
        SEMI
    ;

qualifiedImportName
    :   Identifier
        (DOT Identifier
        )*
    ;

typeDeclaration
    :   classOrInterfaceDeclaration
    |   SEMI
    ;

classOrInterfaceDeclaration
    :    classDeclaration
    |   interfaceDeclaration
    ;


modifiers
    :    modifier*
    ;

modifier
    :    annotation
    |    PUBLIC
    |    PROTECTED
    |    PRIVATE
    |    STATIC
    |    ABSTRACT
    |    FINAL
    |    NATIVE
    |    SYNCHRONIZED
    |    TRANSIENT
    |    VOLATILE
    |    STRICTFP
    ;

variableModifiers
    :   annotation* FINAL? annotation*
    ;


classDeclaration
    :   normalClassDeclaration
    |   enumDeclaration
    ;

normalClassDeclaration
    :   modifiers  CLASS Identifier
        (typeParameters
        )?
        (EXTENDS type
        )?
        (IMPLEMENTS typeList
        )?
        classBody
    ;


typeParameters
    :   LT
            typeParameter
            (COMMA typeParameter
            )*
        GT
    ;

typeParameter
    :   Identifier
        (EXTENDS typeBound
        )?
    ;


typeBound
    :   type
        (AMP type
        )*
    ;


enumDeclaration
    :   modifiers ENUM Identifier (IMPLEMENTS typeList)? enumBody
    ;


enumBody
    :    LBRACE (enumConstants)? COMMA? (enumBodyDeclarations)? RBRACE
    ;

enumConstants
    :    enumConstant (COMMA enumConstant)*
    ;

/**
 * NOTE: here differs from the javac grammar, missing TypeArguments.
 * EnumeratorDeclaration = AnnotationsOpt [TypeArguments] Identifier [ Arguments ] [ "{" ClassBody "}" ]
 */
enumConstant
    :   (annotations)? Identifier(arguments)? (classBody)?
    ;

enumBodyDeclarations
    :   SEMI
        (classBodyDeclaration
        )*
    ;

interfaceDeclaration
    :   normalInterfaceDeclaration
    |   annotationTypeDeclaration
    ;

normalInterfaceDeclaration
    :   modifiers INTERFACE Identifier
        (typeParameters
        )?
        (EXTENDS typeList
        )?
        interfaceBody
    ;

typeList
    :   type
        (COMMA type
        )*
    ;

classBody
    :   LBRACE
        (classBodyDeclaration
        )*
        RBRACE
    ;

interfaceBody
    :   LBRACE
        (interfaceBodyDeclaration
        )*
        RBRACE
    ;

classBodyDeclaration
    :   SEMI
    |   (STATIC
        )?
        block
    |   memberDecl
    ;

memberDecl
    :    constructorDeclaration
    |    fieldDeclaration
    |    methodDeclaration
    |    classDeclaration
    |    interfaceDeclaration
    ;

methodDeclaration
    :    modifiers typeParameters? (type | VOID) Identifier formalParameters (LBRACKET RBRACKET)* (THROWS qualifiedNameList)? (block | SEMI)
    ;

/* For constructor, return type is null, name is 'init' */
constructorDeclaration
    :    modifiers typeParameters? Identifier formalParameters (THROWS qualifiedNameList)? constructorBlock
    ;

constructorBlock
    :    LBRACE explicitConstructorInvocation? blockStatement* RBRACE
    ;

fieldDeclaration
    :   modifiers
        type
        variableDeclarator
        (COMMA variableDeclarator
        )*
        SEMI
    ;

variableDeclarator
    :   Identifier
        (LBRACKET RBRACKET
        )*
        (EQ variableInitializer
        )?
    ;

interfaceBodyDeclaration
    :   interfaceFieldDeclaration
    |   interfaceMethodDeclaration
    |   interfaceDeclaration
    |   classDeclaration
    |   SEMI
    ;

interfaceMethodDeclaration
    :    modifiers (typeParameters)? (type|VOID) Identifier formalParameters (LBRACKET RBRACKET)* (THROWS qualifiedNameList)? SEMI
    ;

/**
 * NOTE, should not use variableDeclarator here, as it doesn't necessary require
 * an initializer, while an interface field does, or judge by the returned value.
 * But this gives better diagnostic message, or antlr won't predict this rule.
 */
interfaceFieldDeclaration
    :   modifiers type variableDeclarator
        (COMMA variableDeclarator
        )*
        SEMI
    ;


type
    :   classOrInterfaceType
        (LBRACKET RBRACKET
        )*
    |   primitiveType
        (LBRACKET RBRACKET
        )*
    ;

classOrInterfaceType
    :   identifierTypeArgument (DOT identifierTypeArgument)*
    ;

identifierTypeArgument
    :    Identifier typeArguments?
    ;

primitiveType
    :   BOOLEAN
    |   CHAR
    |   BYTE
    |   SHORT
    |   INT
    |   LONG
    |   FLOAT
    |   DOUBLE
    ;

typeArguments
    :    LT typeArgument (COMMA typeArgument)* GT
    |    LT GT
    ;

typeArgument
    :   type
    |   QUES
        (
            (EXTENDS
            |SUPER
            )
            type
        )?
    ;

qualifiedNameList
    :   qualifiedName
        (COMMA qualifiedName
        )*
    ;

formalParameters
    :   LPAREN
        (formalParameterDecls
        )?
        RPAREN
    ;

formalParameterDecls
locals [int parameterType]
    :   ellipsisParameterDecl                               {$parameterType = 1;}
    |   normalParameterDecl (COMMA normalParameterDecl)*    {$parameterType = 2;}
    |   (normalParameterDecl COMMA)+ ellipsisParameterDecl  {$parameterType = 3;}
    ;

normalParameterDecl
    :   variableModifiers type Identifier (LBRACKET RBRACKET)*
    ;

ellipsisParameterDecl
    :   variableModifiers
        type  ELLIPSIS
        Identifier
    ;

explicitConstructorInvocation
    :   (nonWildcardTypeArguments)? (THIS|SUPER) arguments SEMI
    |   primary DOT (nonWildcardTypeArguments)? SUPER arguments SEMI
    ;

qualifiedName
    :   Identifier
        (DOT Identifier
        )*
    ;

annotations
    :   (annotation
        )+
    ;

/**
 *  Using an annotation.
 * '@' is flagged in modifier
 */
annotation
    :    markerAnnotation
    |    singleElementAnnotation
    |    normalAnnotation
    ;

markerAnnotation
    :    AT qualifiedName
    ;

singleElementAnnotation
    :    AT qualifiedName LPAREN elementValue RPAREN
    ;

normalAnnotation
    :    AT qualifiedName LPAREN elementValuePairs? RPAREN
    ;

elementValuePairs
    :   elementValuePair
        (COMMA elementValuePair
        )*
    ;

elementValuePair
    :   Identifier EQ elementValue
    ;

elementValue
    :   conditionalExpression
    |   annotation
    |   elementValueArrayInitializer
    ;

elementValueArrayInitializer
    :   LBRACE
        (elementValue
            (COMMA elementValue
            )*
        )? (COMMA)? RBRACE
    ;

/**
 * Annotation declaration.
 */
annotationTypeDeclaration
    :   modifiers AT
        INTERFACE
        Identifier
        annotationTypeBody
    ;

annotationTypeBody
    :   LBRACE
        (annotationTypeElementDeclaration
        )*
        RBRACE
    ;

/**
 * NOTE: here use interfaceFieldDeclaration for field declared inside annotation. they are syntactically the same.
 */
annotationTypeElementDeclaration
    :   annotationMethodDeclaration
    |   interfaceFieldDeclaration
    |   normalClassDeclaration
    |   normalInterfaceDeclaration
    |   enumDeclaration
    |   annotationTypeDeclaration
    |   SEMI
    ;

annotationMethodDeclaration
    :    modifiers type Identifier LPAREN RPAREN (DEFAULT elementValue)? SEMI
    ;

block
    :   LBRACE
        (blockStatement
        )*
        RBRACE
    ;

/*
staticBlock returns [JCBlock tree]
        @init {
            ListBuffer<JCStatement> stats = new ListBuffer<JCStatement>();
            int pos = ((AntlrJavacToken) $start).getStartIndex();
        }
        @after {
            $tree = T.at(pos).Block(Flags.STATIC, stats.toList());
            pu.storeEnd($tree, $stop);
            // construct a dummy static modifiers for end position
            pu.storeEnd(T.at(pos).Modifiers(Flags.STATIC,  com.sun.tools.javac.util.List.<JCAnnotation>nil()),$st);
        }
    :   st_1=STATIC LBRACE
        (blockStatement
            {
                if ($blockStatement.tree == null) {
                    stats.appendList($blockStatement.list);
                } else {
                    stats.append($blockStatement.tree);
                }
            }
        )* RBRACE
    ;
*/
blockStatement
    :   localVariableDeclarationStatement
    |   classOrInterfaceDeclaration
    |   statement
    ;


localVariableDeclarationStatement
    :   localVariableDeclaration
        SEMI
    ;

localVariableDeclaration
    :   variableModifiers type
        variableDeclarator
        (COMMA variableDeclarator
        )*
    ;

statement
    :   block
    |   ASSERT  expression (COLON expression)? SEMI
    |   IF parExpression statement (ELSE statement)?
    |   forstatement
    |   WHILE parExpression statement
    |   DO statement WHILE parExpression SEMI
    |   trystatement
    |   SWITCH parExpression LBRACE switchBlockStatementGroups RBRACE
    |   SYNCHRONIZED parExpression block
    |   RETURN (expression )? SEMI
    |   THROW expression SEMI
    |   BREAK
            (Identifier
            )? SEMI
    |   CONTINUE
            (Identifier
            )? SEMI
    |   expression  SEMI
    |   Identifier COLON statement
    |   emptyStatement
    ;

emptyStatement
    :    SEMI
    ;

switchBlockStatementGroups
    :   (switchBlockStatementGroup )*
    ;

switchBlockStatementGroup
    :
        switchLabel
        (blockStatement
        )*
    ;

switchLabel
    :   CASE expression COLON
    |   DEFAULT COLON
    ;


trystatement
locals [int statementType]
    :    TRY block                       {$statementType = 1;}
    |    TRY block catches FINALLY block {$statementType = 2;}
    |    TRY block catches               {$statementType = 3;}
    |    TRY block FINALLY block         {$statementType = 4;}
    |    tryWithResources                {$statementType = 5;}
    ;

tryWithResources
    :    TRY resourceSpecification block catches? (FINALLY block)?
    ;

resourceSpecification
    :    '(' resources (';')? ')'                                                                      // ( Resources [;] )
    ;

resources
    :    resource ( ';' resource )*                                                                // Resource { ; Resource }
    ;

resource
    :    variableModifiers? type Identifier EQ expression                       // {VariableModifier} ReferenceType VariableDeclaratorId = Expression
    ;

catches
    :   catchClause
        (catchClause
        )*
    ;

catchClause
    :   CATCH LPAREN catchFormalParameter RPAREN block
    ;

catchFormalParameter
    :    variableModifiers type (BAR type)* Identifier (LBRACKET RBRACKET)*
    ;

forstatement
    :    foreachStatement
    |    normalForStatement
    ;

foreachStatement
    :    FOR LPAREN variableModifiers type Identifier COLON expression RPAREN statement
    ;

normalForStatement
    :    FOR LPAREN (forInit)? SEMI (expression)? SEMI (expressionList)? RPAREN statement
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;

parExpression
    :   LPAREN expression RPAREN
    ;

expressionList
    :   expression
        (COMMA expression
        )*
    ;

expression
    :   conditionalExpression
        (assignmentOperator expression
        )?
    ;

assignmentOperator
locals [int assignmentType]
    :   EQ          {$assignmentType = 1;}
    |   PLUSEQ      {$assignmentType = 2;}
    |   SUBEQ       {$assignmentType = 3;}
    |   STAREQ      {$assignmentType = 4;}
    |   SLASHEQ     {$assignmentType = 5;}
    |   AMPEQ       {$assignmentType = 6;}
    |   BAREQ       {$assignmentType = 7;}
    |   CARETEQ     {$assignmentType = 8;}
    |   PERCENTEQ   {$assignmentType = 9;}
    |   LT LT EQ    {$assignmentType = 10;}
    |   GT GT GT EQ {$assignmentType = 11;}
    |   GT GT EQ    {$assignmentType = 12;}
    ;

conditionalExpression
    :   conditionalOrExpression
        (QUES expression COLON conditionalExpression
        )?
    ;

conditionalOrExpression
    :   conditionalAndExpression
        (BARBAR conditionalAndExpression
        )*
    ;

conditionalAndExpression
    :   inclusiveOrExpression
        (AMPAMP inclusiveOrExpression
        )*
    ;

inclusiveOrExpression
    :   exclusiveOrExpression
        (BAR exclusiveOrExpression
        )*
    ;

exclusiveOrExpression
    :   andExpression
        (CARET andExpression
        )*
    ;

andExpression
    :   equalityExpression
        (AMP equalityExpression
        )*
    ;

equalityExpression
    :   notEqualityExpression (EQEQ notEqualityExpression)*
    ;

notEqualityExpression
    :    instanceOfExpression (BANGEQ instanceOfExpression)*
    ;

instanceOfExpression
    :   relationalExpression
        (INSTANCEOF type
        )?
    ;

relationalExpression
    :   shiftExpression (relationalOp shiftExpression)*
    ;

relationalOp
    locals [int operatorType]
    :   LT EQ {$operatorType = 1;}
    |   GT EQ {$operatorType = 2;}
    |   LT    {$operatorType = 3;}
    |   GT    {$operatorType = 4;}
    ;

shiftExpression
    :   additiveExpression (shiftOp additiveExpression)*
    ;

shiftOp
    locals [int operatorType]
    :    LT LT    {$operatorType = 1;}
    |    GT GT GT {$operatorType = 2;}
    |    GT GT    {$operatorType = 3;}
    ;


additiveExpression
    :   multiplicativeExpression (additiveOp multiplicativeExpression)*
    ;

additiveOp
    locals [int operatorType]
    :    PLUS    {$operatorType = 1;}
    |    SUB     {$operatorType = 2;}
    ;

multiplicativeExpression
    :
        unaryExpression (multiplicativeOp unaryExpression)*
    ;

multiplicativeOp
    locals [int operatorType]
    :    STAR    {$operatorType = 1;}
    |    SLASH   {$operatorType = 2;}
    |    PERCENT {$operatorType = 3;}
    ;

/**
 * NOTE: for '+' and '-', if the next token is int or long interal, then it's not a unary expression.
 *       it's a literal with signed value. INTLTERAL AND LONG LITERAL are added here for this.
 */
unaryExpression
    :   PLUS  unaryExpression
    |   SUB unaryExpression
    |   PLUSPLUS unaryExpression
    |   SUBSUB unaryExpression
    |   TILDE unaryExpression
    |   BANG unaryExpression
    |   unaryExpressionNotPlusMinus
    ;

unaryExpressionNotPlusMinus
    :   castExpression
    |   primary (selector)* (PLUSPLUS | SUBSUB)?
    ;

castExpression
    :   LPAREN primitiveType RPAREN unaryExpression
    |   LPAREN type RPAREN unaryExpressionNotPlusMinus
    ;

/**
 * have to use scope here, parameter passing isn't well supported in antlr.
 */
primary
locals [int operationType]
    :    parExpression                                      {$operationType = 1;}
    |    THIS (DOT Identifier)* (thisSuffix)?               {$operationType = 2;}
    |    Identifier (DOT Identifier)* (identifierSuffix)?   {$operationType = 3;}
    |    SUPER superSuffix                                  {$operationType = 4;}
    |    literal                                            {$operationType = 5;}
    |    creator                                            {$operationType = 6;}
    |    primitiveType (LBRACKET RBRACKET)* DOT CLASS       {$operationType = 7;}
    |    VOID DOT CLASS                                     {$operationType = 8;}
    ;

superSuffix
    :   DOT (typeArguments)? Identifier (arguments)?
    ;

thisSuffix
locals [int operationType]
    :   (LBRACKET expression RBRACKET)+                     {$operationType = 1;}
    |   arguments                                           {$operationType = 2;}
    |   DOT nonWildcardTypeArguments Identifier arguments   {$operationType = 3;}
    |   innerCreator                                        {$operationType = 4;}
    ;


identifierSuffix
locals [int operationType]
    :   (LBRACKET RBRACKET)+ DOT CLASS                      {$operationType = 1;}
    |   (LBRACKET expression RBRACKET)+                     {$operationType = 2;}
    |   arguments                                           {$operationType = 3;}
    |   DOT CLASS                                           {$operationType = 4;}
    |   DOT nonWildcardTypeArguments Identifier arguments   {$operationType = 5;}
    |   DOT THIS                                            {$operationType = 6;}
    |   innerCreator                                        {$operationType = 7;}
    ;

selector
locals [int operationType]
    :   DOT Identifier (arguments)?     {$operationType = 1;}
    |   DOT THIS                        {$operationType = 2;}
    |   DOT SUPER superSuffix           {$operationType = 3;}
    |   innerCreator                    {$operationType = 4;}
    |   LBRACKET expression RBRACKET    {$operationType = 5;}
    ;

creator
    :   NEW nonWildcardTypeArguments classOrInterfaceType classCreatorRest
    |   NEW classOrInterfaceType classCreatorRest
    |   arrayCreator
    ;

arrayCreator
    :   NEW createdName LBRACKET RBRACKET (LBRACKET RBRACKET)* arrayInitializer
    |   NEW createdName LBRACKET expression RBRACKET (LBRACKET expression RBRACKET)* (LBRACKET RBRACKET)*
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayInitializer
    :   LBRACE
            (variableInitializer
                (COMMA variableInitializer
                )*
            )?
            (COMMA)?
        RBRACE             //Yang's fix, position change.
    ;

createdName
    :   classOrInterfaceType
    |   primitiveType
    ;

innerCreator
    :   DOT NEW (nonWildcardTypeArguments)? identifierTypeArgument classCreatorRest
    ;

classCreatorRest
    :   arguments (classBody)?
    ;

nonWildcardTypeArguments
    :   LT typeList GT
    ;

arguments
    :   LPAREN (expressionList
        )? RPAREN
    ;

literal
    :   IntegerLiteral
    |   FloatingPointLiteral
    |   CharacterLiteral
    |   StringLiteral
    |   TRUE
    |   FALSE
    |   NULL
    ;

/**
 * These are headers help to make syntatical predicates, not necessary but helps to make grammar faster.
 */

classHeader
    :   modifiers CLASS Identifier
    ;

enumHeader
    :   modifiers (ENUM|Identifier) Identifier
    ;

interfaceHeader
    :   modifiers INTERFACE Identifier
    ;

annotationHeader
    :   modifiers AT INTERFACE Identifier
    ;

typeHeader
    :   modifiers (CLASS|ENUM|(AT ? INTERFACE)) Identifier
    ;

methodHeader
    :   modifiers typeParameters? (type|VOID)? Identifier RPAREN
    ;

fieldHeader
    :   modifiers type Identifier (LBRACKET RBRACKET)* (EQ|COMMA|SEMI)
    ;

localVariableHeader
    :   variableModifiers type Identifier (LBRACKET RBRACKET)* (EQ|COMMA|SEMI)
    ;
