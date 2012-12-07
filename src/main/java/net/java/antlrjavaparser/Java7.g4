grammar Java7;

@parser::header {
package net.java.antlrjavaparser;
}

@lexer::header {
package net.java.antlrjavaparser;
}

@lexer::members {
  protected boolean enumIsKeyword = true;
  protected boolean assertIsKeyword = true;
}
/*
// [x] denotes zero or one occurrences of x.  => ?
// {x} denotes zero or more occurrences of x. => *
// x | y means one of either x or y.
*/

qualifiedIdentifier
    :    Identifier ( DOT Identifier )*                                                            // Identifier { . Identifier }
    ;

qualifiedIdentifierList
    :    qualifiedIdentifier ( ',' qualifiedIdentifier )*                                          // QualifiedIdentifier { , QualifiedIdentifier }
    ;

compilationUnit
    :    ( (annotations)? 'package' qualifiedIdentifier ';' )? (importDeclaration)* (typeDeclaration)*
    ;

importDeclaration
    :    'import' (STATIC)? Identifier ( DOT Identifier )* (DOT '*')? ';'                        // import [static] Identifier { . Identifier } [. *] ;
    ;

typeDeclaration
    :    classOrInterfaceDeclaration                                                               // ClassOrInterfaceDeclaration
    |    ';'                                                                                       // ;
    ;

classOrInterfaceDeclaration
    :    (modifier)* (classDeclaration | interfaceDeclaration)                                     // {Modifier} (ClassDeclaration | InterfaceDeclaration)
    ;

classDeclaration
    :    normalClassDeclaration                                                                    // NormalClassDeclaration
    |    enumDeclaration                                                                           // EnumDeclaration
    ;

interfaceDeclaration
    :    normalInterfaceDeclaration                                                                // NormalInterfaceDeclaration
    |    annotationTypeDeclaration                                                                 // AnnotationTypeDeclaration
    ;

normalClassDeclaration
    :    'class' Identifier (typeParameters)? (EXTENDS type)? ('implements' typeList)? classBody // class Identifier [TypeParameters] [extends Type] [implements TypeList] ClassBody
    ;

enumDeclaration
    :    'enum' Identifier ('implements' typeList)? enumBody                                       // enum Identifier [implements TypeList] EnumBody
    ;

normalInterfaceDeclaration
    :    'interface' Identifier (typeParameters)? (EXTENDS typeList)? interfaceBody              // interface Identifier [TypeParameters] [extends TypeList] InterfaceBody
    ;

annotationTypeDeclaration
    :    '@' 'interface' Identifier annotationTypeBody                                             // @ interface Identifier AnnotationTypeBody
    ;

type
    :    basicType ('[' ']')*                                                                      // BasicType {[]}
    |    referenceType ('[' ']')*                                                                  // ReferenceType {[]}
    ;

basicType
    :    'byte'                                                                                    // byte
    |    'short'                                                                                   // short
    |    'char'                                                                                    // char
    |    'int'                                                                                     // int
    |    'long'                                                                                    // long
    |    'float'                                                                                   // float
    |    'double'                                                                                  // double
    |    'boolean'                                                                                 // boolean
    ;

referenceType
    :    Identifier (typeArguments)? ( DOT Identifier (typeArguments)? )*                          // Identifier [TypeArguments] { . Identifier [TypeArguments] }
    ;

typeArguments
    :    '<' typeArgument ( ',' typeArgument )* '>'                                                    // < TypeArgument { , TypeArgument } >
    ;

typeArgument
    :    referenceType                                                                             // ReferenceType
    |    '?' ( ( EXTENDS | SUPER ) referenceType )?                                              // ? [ ( extends | super ) ReferenceType ]
    ;

nonWildcardTypeArguments
    :    '<' typeList '>'                                                                          // < TypeList >
    ;

typeList
    :    referenceType ( ',' referenceType )*                                                      // ReferenceType { , ReferenceType }
    ;

typeArgumentsOrDiamond
    :    '<' '>'                                                                                   // < >
    |    typeArguments                                                                             // TypeArguments
    ;

nonWildcardTypeArgumentsOrDiamond
    :    '<' '>'                                                                                   // < >
    |    nonWildcardTypeArguments                                                                  // NonWildcardTypeArguments
    ;

typeParameters
    :    '<' typeParameter ( ',' typeParameter )* '>'                                              // < TypeParameter { , TypeParameter } >
    ;

typeParameter
    :    Identifier (EXTENDS bound)?                                                             // Identifier [extends Bound]
    ;

bound
    :    referenceType ( AMP referenceType )*                                                      // ReferenceType { & ReferenceType }
    ;

modifier
    :    annotation                                                                                // Annotation
    |    'public'                                                                                  // public
    |    'protected'                                                                               // protected
    |    'private'                                                                                 // private
    |    STATIC                                                                                  // static
    |    'abstract'                                                                                // abstract
    |    'final'                                                                                   // final
    |    'native'                                                                                  // native
    |    'synchronized'                                                                            // synchronized
    |    'transient'                                                                               // transient
    |    'volatile'                                                                                // volatile
    |    'strictfp'                                                                                // strictfp
    ;

annotations
    :    annotation (annotation)*                                                                  // Annotation {Annotation}
    ;

annotation
    :    '@' qualifiedIdentifier ( '(' (annotationElement)? ')' )?                                 // @ QualifiedIdentifier [ ( [AnnotationElement] ) ]
    ;

annotationElement
    :    elementValuePairs                                                                         // ElementValuePairs
    |    elementValue                                                                              // ElementValue
    ;

elementValuePairs
    :    elementValuePair ( ',' elementValuePair )*                                                // ElementValuePair { , ElementValuePair }
    ;

elementValuePair
    :    Identifier '=' elementValue                                                                 // Identifier = ElementValue
    ;

elementValue
    :    annotation                                                                                // Annotation
    |    expression                                                                                // Expression1
    |    elementValueArrayInitializer                                                              // ElementValueArrayInitializer
    ;

elementValueArrayInitializer
    :    '{' (elementValues)? (',')? '}'                                                              // { [ElementValues] [,] }
    ;

elementValues
    :    elementValue ( ',' elementValue )*                                                        // ElementValue { , ElementValue }
    ;

classBody
    :    '{' ( classBodyDeclaration )* '}'                                                         // { { ClassBodyDeclaration } }
    ;

classBodyDeclaration
    :    ';'                                                                                       // ;
    |    (modifier)* memberDecl                                                                    // {Modifier} MemberDecl
    |    (STATIC)? block                                                                         // [static] Block
    ;

memberDecl
    :    methodOrFieldDecl                                                                         // MethodOrFieldDecl
    |    'void' Identifier voidMethodDeclaratorRest                                                // void Identifier VoidMethodDeclaratorRest
    |    Identifier constructorDeclaratorRest                                                      // Identifier ConstructorDeclaratorRest
    |    genericMethodOrConstructorDecl                                                            // GenericMethodOrConstructorDecl
    |    classDeclaration                                                                          // ClassDeclaration
    |    interfaceDeclaration                                                                      // InterfaceDeclaration
    ;

methodOrFieldDecl
    :    type Identifier methodOrFieldRest                                                         // Type Identifier MethodOrFieldRest
    ;

methodOrFieldRest
    :    fieldDeclaratorsRest ';'                                                                  // FieldDeclaratorsRest ;
    |    methodDeclaratorRest                                                                      // MethodDeclaratorRest
    ;

fieldDeclaratorsRest
    :    variableDeclaratorRest ( ',' variableDeclarator )*                                        // VariableDeclaratorRest { , VariableDeclarator }
    ;

methodDeclaratorRest
    :    formalParameters ('[' ']')* ('throws' qualifiedIdentifierList)? (block | ';')                   // FormalParameters {[]} [throws QualifiedIdentifierList] (Block | ;)
    ;

voidMethodDeclaratorRest
    :    formalParameters ('throws' qualifiedIdentifierList)? (block | ';')                        // FormalParameters [throws QualifiedIdentifierList] (Block | ;)
    ;

constructorDeclaratorRest
    :    formalParameters ('throws' qualifiedIdentifierList)? block                                // FormalParameters [throws QualifiedIdentifierList] Block
    ;

genericMethodOrConstructorDecl
    :    typeParameters genericMethodOrConstructorRest                                             // TypeParameters GenericMethodOrConstructorRest
    ;

genericMethodOrConstructorRest
    :    (type | 'void') Identifier methodDeclaratorRest                                           // (Type | void) Identifier MethodDeclaratorRest
    |    Identifier constructorDeclaratorRest                                                      // Identifier ConstructorDeclaratorRest
    ;

interfaceBody
    :    '{' ( interfaceBodyDeclaration )* '}'                                                      // { { InterfaceBodyDeclaration } }
    ;

interfaceBodyDeclaration
    :    ';'                                                                                       // ;
    |    (modifier)* interfaceMemberDecl                                                           // {Modifier} InterfaceMemberDecl
    ;

interfaceMemberDecl
    :    interfaceMethodOrFieldDecl                                                                // InterfaceMethodOrFieldDecl
    |    'void' Identifier voidInterfaceMethodDeclaratorRest                                       // void Identifier VoidInterfaceMethodDeclaratorRest
    |    interfaceGenericMethodDecl                                                                // InterfaceGenericMethodDecl
    |    classDeclaration                                                                          // ClassDeclaration
    |    interfaceDeclaration                                                                      // InterfaceDeclaration
    ;

interfaceMethodOrFieldDecl
    :    type Identifier interfaceMethodOrFieldRest                                                // Type Identifier InterfaceMethodOrFieldRest
    ;

interfaceMethodOrFieldRest
    :    constantDeclaratorsRest ';'                                                               // ConstantDeclaratorsRest ;
    |    interfaceMethodDeclaratorRest                                                             // InterfaceMethodDeclaratorRest
    ;

constantDeclaratorsRest
    :    constantDeclaratorRest ( ',' constantDeclarator )*                                        // ConstantDeclaratorRest { , ConstantDeclarator }
    ;

constantDeclaratorRest
    :    ('[' ']')* '=' variableInitializer                                                                // {[]} = VariableInitializer
    ;

constantDeclarator
    :    Identifier constantDeclaratorRest                                                         // Identifier ConstantDeclaratorRest
    ;

interfaceMethodDeclaratorRest
    :    formalParameters ('[' ']')* ('throws' qualifiedIdentifierList)? ';'                             // FormalParameters {[]} [throws QualifiedIdentifierList] ;
    ;

voidInterfaceMethodDeclaratorRest
    :    formalParameters ('throws' qualifiedIdentifierList)? ';'                                  // FormalParameters [throws QualifiedIdentifierList] ;
    ;

interfaceGenericMethodDecl
    :    typeParameters (type | 'void') Identifier interfaceMethodDeclaratorRest                   // TypeParameters (Type | void) Identifier InterfaceMethodDeclaratorRest
    ;

formalParameters
    :    '(' (formalParameterDecls)? ')'                                                               // ( [FormalParameterDecls] )
    ;

formalParameterDecls
    :    (variableModifier)* type formalParameterDeclsRest                                         // {VariableModifier} Type FormalParameterDeclsRest
    ;

variableModifier
    :    'final'                                                                                   // final
    |    annotation                                                                                // Annotation
    ;

formalParameterDeclsRest
    :    variableDeclaratorId ( ',' formalParameterDecls )?                                        // VariableDeclaratorId [ , FormalParameterDecls ]
    |    '...' variableDeclaratorId                                                                // ... VariableDeclaratorId
    ;

variableDeclaratorId
    :    Identifier ('[' ']')*                                                                           // Identifier {[]}
    ;

variableDeclarators
    :    variableDeclarator ( ',' variableDeclarator )*                                            // VariableDeclarator { , VariableDeclarator }
    ;

variableDeclarator
    :    Identifier variableDeclaratorRest                                                         // Identifier VariableDeclaratorRest
    ;

variableDeclaratorRest
    :    ('[' ']')* ( '=' variableInitializer )?                                                           // {[]} [ = VariableInitializer ]
    ;

variableInitializer
    :    arrayInitializer                                                                          // ArrayInitializer
    |    expression                                                                                // Expression
    ;

arrayInitializer
    :    '{' ( variableInitializer ( ',' variableInitializer )* (',')? )? '}'                           // { [ VariableInitializer { , VariableInitializer } [,] ] }
    ;

block
    :    '{' blockStatement* '}'                                                                      // { BlockStatements }
    ;

blockStatement
    :    localVariableDeclarationStatement                                                         // LocalVariableDeclarationStatement
    |    classOrInterfaceDeclaration                                                               // ClassOrInterfaceDeclaration
    |    statementFoundInBlock
    ;

statementFoundInBlock
    :    (Identifier ':')? statement
    ;

localVariableDeclarationStatement
    :    ( variableModifier )* type variableDeclarators ';'                                        // { VariableModifier } Type VariableDeclarators ;
    ;

statement
    :    block                                                                                     // Block
    |    TRY block ( catches | ((catches)? finallyRule) )
    |    TRY resourceSpecification block (catches)? (finallyRule)?                                   // try ResourceSpecification Block [Catches] [Finally]
    |    ';'                                                                                       // ;
    |    Identifier ':' statement                                                                    // Identifier : Statement
    |    statementExpression ';'                                                                   // StatementExpression ;
    |    'if' parExpression statement ('else' statement)?                                          // if ParExpression Statement [else Statement]
    |    'assert' expression (':' expression)? ';'                                                   // assert Expression [: Expression] ;
    |    'switch' parExpression ( switchBlockStatementGroups )*                                    // switch ParExpression { SwitchBlockStatementGroups }
    |    'while' parExpression statement                                                           // while ParExpression Statement
    |    'do' statement 'while' parExpression ';'                                                  // do Statement while ParExpression ;
    |    'for' ( forControl ) statement                                                            // for ( ForControl ) Statement
    |    'break' (Identifier)? ';'                                                                 // break [Identifier] ;
    |    'continue' (Identifier)? ';'                                                              // continue [Identifier] ;
    |    'return' (expression)? ';'                                                                // return [Expression] ;
    |    'throw' expression ';'                                                                    // throw Expression ;
    |    'synchronized' parExpression block                                                        // synchronized ParExpression Block
    ;

statementExpression
    :    expression                                                                                // Expression
    ;

catches
    :    catchClause ( catchClause )*                                                              // CatchClause { CatchClause }
    ;

catchClause
    :    'catch' '(' catchFormalParameter ')' block
    ;

catchFormalParameter
    :    variableModifiers? catchType variableDeclaratorId
    ;

variableModifiers
    :    variableModifier+
    ;

variableModifier
    :    annotation
    |    FINAL
    ;

catchType
    :    classType
    |    classType '|' catchType
    ;

classType
    :    (typeName typeArguments?) ('.' typeName typeArguments?)*
    ;

typeName
    :    Identifier ( '.' Identifier )*
    ;

finallyRule
    :    FINALLY block                                                                           // finally Block
    ;

resourceSpecification
    :    '(' resources (';')? ')'                                                                      // ( Resources [;] )
    ;

resources
    :    resource ( ';' resource )*                                                                // Resource { ; Resource }
    ;

resource
    :    (variableModifier)* referenceType variableDeclaratorId '=' expression                       // {VariableModifier} ReferenceType VariableDeclaratorId = Expression
    ;

switchBlockStatementGroups
    :    ( switchBlockStatementGroup )*                                                            // { SwitchBlockStatementGroup }
    ;

switchBlockStatementGroup
    :    switchLabels blockStatement*                                                              // SwitchLabels BlockStatements
    ;

switchLabels
    :    switchLabel ( switchLabel )*                                                              // SwitchLabel { SwitchLabel }
    ;

switchLabel
    :    'case' expression ':'
    |    'case' enumConstantName ':'
    |    'default' ':'
    ;

enumConstantName
    :    Identifier                                                                                // Identifier
    ;

forControl
    :    forVarControl                                                                             // ForVarControl
    |    forInit ';' (expression)? ';' (forUpdate)?                                                // ForInit ; [Expression] ; [ForUpdate]
    ;

forVarControl
    :    (variableModifier)* type variableDeclaratorId forVarControlRest                           // {VariableModifier} Type VariableDeclaratorId ForVarControlRest
    ;

forVarControlRest
    :    forVariableDeclaratorsRest ';' (expression)? ';' (forUpdate)?                             // ForVariableDeclaratorsRest ; [Expression] ; [ForUpdate]
    |    ':' expression                                                                              // : Expression
    ;

forVariableDeclaratorsRest
    :    ( '=' variableInitializer )? ( ',' variableDeclarator )*                                    // [ = VariableInitializer ] { , VariableDeclarator }
    ;

forInit
    :    statementExpression ( ',' statementExpression )*
    ;

forUpdate
    :    statementExpression ( ',' statementExpression )*                                          // StatementExpression { , StatementExpression }
    ;

expression
locals [int expressionType]
    :   primary                                                         {$expressionType = 1;}
    |   expression DOT Identifier                                       {$expressionType = 2;}
    |   expression DOT THIS                                             {$expressionType = 3;}
    |   expression DOT SUPER LPAREN expressionList? RPAREN              {$expressionType = 4;}
    |   expression DOT NEW Identifier LPAREN expressionList? RPAREN     {$expressionType = 5;}
    |   expression DOT SUPER DOT Identifier arguments?                  {$expressionType = 6;}
    |   expression DOT explicitGenericInvocation                        {$expressionType = 7;}
    |   NEW creator                                                     {$expressionType = 8;}
    |   expression LBRACKET expression RBRACKET                         {$expressionType = 9;}
    |   LPAREN type RPAREN expression                                   {$expressionType = 10;}
    |   expression (PLUSPLUS | SUBSUB)                                  {$expressionType = 11;}
    |   expression LPAREN expressionList? RPAREN                        {$expressionType = 12;}
    |   (PLUS|SUB|PLUSPLUS|SUBSUB) expression                           {$expressionType = 13;}
    |   (TILDE|BANG) expression                                         {$expressionType = 14;}
    |   expression (STAR|SLASH|PERCENT) expression                      {$expressionType = 15;}
    |   expression (PLUS|SUB) expression                                {$expressionType = 16;}
    |   expression (LTLT | GTGTGT | GTGT) expression                    {$expressionType = 17;}
    |   expression (LTEQ | GTEQ | GT | LT) expression                   {$expressionType = 18;}
    |   expression INSTANCEOF type                                      {$expressionType = 19;}
    |   expression (EQEQ | BANGEQ) expression                           {$expressionType = 20;}
    |   expression AMP expression                                       {$expressionType = 21;}
    |   expression CARET<assoc=right> expression                        {$expressionType = 22;}
    |   expression BAR expression                                       {$expressionType = 23;}
    |   expression AMPAMP expression                                    {$expressionType = 24;}
    |   expression BARBAR expression                                    {$expressionType = 25;}
    |   expression QUES expression COLON expression                     {$expressionType = 26;}
    |   expression assignmentOperator expression                        {$expressionType = 27;}
    ;

expressionList
    :   expression (COMMA expression)*
    ;

assignmentOperator
    :    '='<assoc=right>                                                                                         // =
    |    '+='<assoc=right>                                                                                        // +=
    |    '-='<assoc=right>                                                                                        // -=
    |    '*='<assoc=right>                                                                                      // *=
    |    '/='<assoc=right>                                                                                        // /=
    |    '&='<assoc=right>                                                                                        // &=
    |    '|='<assoc=right>                                                                                        // |=
    |    '^='<assoc=right>                                                                                        // ^=
    |    '%='<assoc=right>                                                                                        // %=
    |    '<<='<assoc=right>                                                                                       // <<=
    |    '>>='<assoc=right>                                                                                       // >>=
    |    '>>>='<assoc=right>                                                                                      // >>>=
    ;

primary
    :    literal                                                                                   // Literal
    |    parExpression                                                                             // ParExpression
    |    'this' (arguments)?                                                                       // this [Arguments]
    |    SUPER superSuffix                                                                       // super SuperSuffix
    |    'new' creator                                                                             // new Creator
    |    nonWildcardTypeArguments ( explicitGenericInvocationSuffix | 'this' arguments )           // NonWildcardTypeArguments ( ExplicitGenericInvocationSuffix | this Arguments )
    |    Identifier ( DOT Identifier )* (identifierSuffix)?                                        // Identifier { . Identifier } [IdentifierSuffix]
    |    basicType ('[' ']')* DOT 'class'                                                                // BasicType {[]} . class
    |    'void' DOT 'class'                                                                        // void . class
    ;

parExpression
    :    '(' expression ')'                                                                            // ( Expression )
    ;

arguments
    :    '(' ( expression ( ',' expression )* )? ')'                                                   // ( [ Expression { , Expression } ] )
    ;

superSuffix
    :    arguments                                                                                 // Arguments
    |    DOT Identifier (arguments)?                                                               // . Identifier [Arguments]
    ;

explicitGenericInvocationSuffix
    :    SUPER superSuffix                                                                       // super SuperSuffix
    |    Identifier arguments                                                                      // Identifier Arguments
    ;

creator
    :    nonWildcardTypeArguments createdName classCreatorRest                                     // NonWildcardTypeArguments CreatedName ClassCreatorRest
    |    createdName ( classCreatorRest | arrayCreatorRest )                                       // CreatedName ( ClassCreatorRest | ArrayCreatorRest )
    ;

createdName
    :    Identifier (typeArgumentsOrDiamond)? ( DOT Identifier (typeArgumentsOrDiamond)? )*         // Identifier [TypeArgumentsOrDiamond] { . Identifier [TypeArgumentsOrDiamond] }
    ;

classCreatorRest
    :    arguments (classBody)?                                                                    // Arguments [ClassBody]
    ;

arrayCreatorRest
    :    '[' ( ] ('[' ']')* arrayInitializer | expression ] ('[' expression ']')* ('[' ']')* ) ']'
    ;

identifierSuffix
    :    '[' ( ('[' ']')* DOT 'class' | expression ) ']'
    |    arguments
    |    DOT ( 'class' | explicitGenericInvocation | 'this' | SUPER arguments | 'new' (nonWildcardTypeArguments)? innerCreator )
    ;

explicitGenericInvocation
    :    nonWildcardTypeArguments explicitGenericInvocationSuffix                                  // NonWildcardTypeArguments ExplicitGenericInvocationSuffix
    ;

innerCreator
    :    Identifier (nonWildcardTypeArgumentsOrDiamond)? classCreatorRest                          // Identifier [NonWildcardTypeArgumentsOrDiamond] ClassCreatorRest
    ;

selector
    :    DOT Identifier (arguments)?                                                               // . Identifier [Arguments]
    |    DOT explicitGenericInvocation                                                             // . ExplicitGenericInvocation
    |    DOT 'this'                                                                                // . this
    |    DOT SUPER superSuffix                                                                   // . super SuperSuffix
    |    DOT 'new' (nonWildcardTypeArguments)? innerCreator                                        // . new [NonWildcardTypeArguments] InnerCreator
    |    ( expression )?                                                                           // [ Expression ]
    ;

enumBody
    :    '{' (enumConstants)? (',')? (enumBodyDeclarations)? '}'                                   // { [EnumConstants] [,] [EnumBodyDeclarations] }
    ;

enumConstants
    :    enumConstant+                                                                              // EnumConstant
    ;

enumConstant
    :    (annotations)? Identifier (arguments)? (classBody)?                                       // [Annotations] Identifier [Arguments] [ClassBody]
    ;

enumBodyDeclarations
    :    ';' (classBodyDeclaration)*                                                               // ; {ClassBodyDeclaration}
    ;

annotationTypeBody
    :    '{' (annotationTypeElementDeclarations)? '}'                                                  // { [AnnotationTypeElementDeclarations] }
    ;

annotationTypeElementDeclarations
    :    annotationTypeElementDeclaration+                                                          // AnnotationTypeElementDeclaration
    ;

annotationTypeElementDeclaration
    :    (modifier)* annotationTypeElementRest                                                     // {Modifier} AnnotationTypeElementRest
    ;

annotationTypeElementRest
    :    type Identifier annotationMethodOrConstantRest ';'                                        // Type Identifier AnnotationMethodOrConstantRest ;
    |    classDeclaration                                                                          // ClassDeclaration
    |    interfaceDeclaration                                                                      // InterfaceDeclaration
    |    enumDeclaration                                                                           // EnumDeclaration
    |    annotationTypeDeclaration                                                                 // AnnotationTypeDeclaration
    ;

annotationMethodOrConstantRest
    :    annotationMethodRest                                                                      // AnnotationMethodRest
    |    constantDeclaratorsRest                                                                   // ConstantDeclaratorsRest
    ;

annotationMethodRest
    :    '(' ')' ('[' ']')? ('default' elementValue)?                                                       // ( ) [[]] [default ElementValue]
    ;


/////// LEXER ////////


fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

ENUM:   'enum' {if (!enumIsKeyword) setType(Identifier);}
    ;

ASSERT
    :   'assert' {if (!assertIsKeyword) setType(Identifier);}
    ;

SEMI       : ';';
PACKAGE    : 'package';
IMPORT     : 'import';
DOT        : '.';
STAR       : '*';
CLASS      : 'class';
IMPLEMENTS : 'implements';
PUBLIC : 'public';
PROTECTED : 'protected';
PRIVATE : 'private';
ABSTRACT : 'abstract';
STATIC : 'static';
FINAL : 'final';
STRICTFP : 'strictfp';
COMMA : ',';
LBRACE : '{';
RBRACE : '}';
LBRACKET : '[';
RBRACKET : ']';
LPAREN : '(';
RPAREN : ')';
VOID : 'void';
INTERFACE : 'interface';
THROW : 'throw';
THROWS : 'throws';
EQ : '=';
NATIVE : 'native';
SYNCHRONIZED : 'synchronized';
TRANSIENT : 'transient';
VOLATILE : 'volatile';
BOOLEAN : 'boolean';
CHAR : 'char';
BYTE : 'byte';
SHORT : 'short';
INT : 'int';
LONG : 'long';
FLOAT : 'float';
DOUBLE : 'double';
QUES : '?';
EXTENDS : 'extends';
ELLIPSIS : '...';
THIS : 'this';
SUPER : 'super';
NULL : 'null';
TRUE : 'true';
FALSE : 'false';
AT : '@';
DEFAULT : 'default';
COLON : ':';
IF : 'if';
ELSE : 'else';
FOR : 'for';
WHILE : 'while';
DO : 'do';
TRY : 'try';
FINALLY : 'finally';
SWITCH : 'switch';
RETURN : 'return';
BREAK : 'break';
CONTINUE : 'continue';
CATCH : 'catch';
CASE : 'case';
PLUSPLUS : '++';
SUBSUB : '--';
TILDE : '~';
BANG : '!';
NEW : 'new';
SLASH : '/';
PERCENT : '%';
PLUS : '+';
SUB : '-';
EQEQ : '==';
BANGEQ : '!=';
AMP : '&';
CARET : '^';
BAR : '|';
AMPAMP : '&&';
BARBAR : '||';
CARETEQ : '^=';
PLUSEQ : '+=';
SUBEQ : '-=';
STAREQ : '*=';
SLASHEQ : '/=';
AMPEQ : '&=';
BAREQ : '|=';
PERCENTEQ : '%=';
LTEQ : '<=';
GTEQ : '>=';
GTGTEQ : '>>=';
GTGTGTEQ : '>>>=';
LTLTEQ : '<<=';
GTGTGT : '>>>';
GTGT : '>>';
LTLT : '<<';
GT : '>';
LT : '<';
INSTANCEOF : 'instanceof';

/********************************************************************************
Java7 Literals
********************************************************************************/

literal
    :    integerLiteral                                                                            // IntegerLiteral
    |    FloatingPointLiteral                                                                      // FloatingPointLiteral
    |    CharacterLiteral                                                                          // CharacterLiteral
    |    StringLiteral                                                                             // StringLiteral
    |    booleanLiteral                                                                            // BooleanLiteral
    |    NullLiteral                                                                               // NullLiteral
    ;

/*
Identifier:
    IdentifierName but not a Keyword or BooleanLiteral or NullLiteral
*/

integerLiteral
    :    DecimalIntegerLiteral
    |    HexIntegerLiteral
    |    OctalIntegerLiteral
    |    BinaryIntegerLiteral
    ;

DecimalIntegerLiteral
    :    DecimalNumeral IntegerTypeSuffix?
    ;

HexIntegerLiteral
    :    HexNumeral IntegerTypeSuffix?
    ;

OctalIntegerLiteral
    :    OctalNumeral IntegerTypeSuffix?
    ;

BinaryIntegerLiteral
    :    BinaryNumeral IntegerTypeSuffix?
    ;

fragment
IntegerTypeSuffix
    :    'l'
    |    'L'
    ;

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
    :    ('0'..'9'|'a'..'f'|'A'..'F')
    ;

fragment
HexDigitsAndUnderscores
    :    HexDigitOrUnderscore+;

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

FloatingPointLiteral
    :    DecimalFloatingPointLiteral
    |    HexadecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral
    :    Digits DOT Digits? ExponentPart? FloatTypeSuffix?
    |    DOT Digits ExponentPart? FloatTypeSuffix?
    |    Digits ExponentPart FloatTypeSuffix?
    |    Digits ExponentPart? FloatTypeSuffix
    ;

fragment
ExponentPart
    :    ('e'|'E') SignedInteger
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
HexadecimalFloatingPointLiteral
    :    HexSignificand BinaryExponent FloatTypeSuffix?
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
    :    ('p'|'P') SignedInteger
    ;

booleanLiteral
    :    TRUE
    |    FALSE
    ;

CharacterLiteral
    :    '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;

StringLiteral
    :    '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

NullLiteral
    :    NULL
    ;

Identifier
    :   Letter (Letter|JavaIDDigit)*
    ;

/********************************************************************************
END Java7
********************************************************************************/

fragment
Letter
    :  '\u0024' |
       '\u0041'..'\u005a' |
       '\u005f' |
       '\u0061'..'\u007a' |
       '\u00c0'..'\u00d6' |
       '\u00d8'..'\u00f6' |
       '\u00f8'..'\u00ff' |
       '\u0100'..'\u1fff' |
       '\u3040'..'\u318f' |
       '\u3300'..'\u337f' |
       '\u3400'..'\u3d2d' |
       '\u4e00'..'\u9fff' |
       '\uf900'..'\ufaff'
    ;

fragment
JavaIDDigit
    :  '\u0030'..'\u0039' |
       '\u0660'..'\u0669' |
       '\u06f0'..'\u06f9' |
       '\u0966'..'\u096f' |
       '\u09e6'..'\u09ef' |
       '\u0a66'..'\u0a6f' |
       '\u0ae6'..'\u0aef' |
       '\u0b66'..'\u0b6f' |
       '\u0be7'..'\u0bef' |
       '\u0c66'..'\u0c6f' |
       '\u0ce6'..'\u0cef' |
       '\u0d66'..'\u0d6f' |
       '\u0e50'..'\u0e59' |
       '\u0ed0'..'\u0ed9' |
       '\u1040'..'\u1049'
   ;

COMMENT
    :   '/*' .*? '*/'    -> channel(HIDDEN) // match anything between /* and */
    ;
WS  :   [ \r\t\u000C\n]+ -> channel(HIDDEN)
    ;

LINE_COMMENT
    : '//' ~[\r\n]* '\r'? '\n' -> channel(HIDDEN)
    ;
