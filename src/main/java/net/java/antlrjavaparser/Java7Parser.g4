parser grammar Java7Parser;

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

options {
    tokenVocab=Java7;
}

compilationUnit
    :    packageDeclaration? importDeclarations? typeDeclarations?
    ;

packageDeclaration
    :    annotations? PACKAGE qualifiedName SEMI
    ;

annotations
    :    annotation+
    ;

annotation
    :    markerAnnotation                                                                                              // MarkerAnnotation
    |    singleElementAnnotation                                                                                       // SingleElementAnnotation
    |    normalAnnotation                                                                                              // NormalAnnotation
    ;

markerAnnotation
    :    AT Identifier                                                                                                // @ Identifier
    ;

normalAnnotation
    :    AT Identifier LPAREN elementValuePairs? RPAREN                                                                     // @ TypeName ( ElementValuePairsopt )
    ;

singleElementAnnotation
    :    AT Identifier LPAREN elementValue RPAREN                                                                           // @ Identifier ( ElementValue )
    ;

elementValuePairs
    :    elementValuePair (COMMA elementValuePair)*
    ;

elementValuePair
    :    Identifier EQ elementValue                                                                                   // Identifier = ElementValue
    ;

elementValue
    :    annotation                                                                                                    // Annotation
    |    LBRACE (elementValue (COMMA elementValue)*)? COMMA? RBRACE                                                                                  // ElementValueArrayInitializer
    |    expression                                                                                         // ConditionalExpression
    ;

/*
elementValueArrayInitializer
    :    LBRACE elementValues? COMMA? RBRACE                                                                               // { ElementValuesopt ,opt }
    ;

elementValues
    :    elementValue (COMMA elementValue)*
    ;

*/
importDeclarations
    :    importDeclaration+                                                                                             // ImportDeclaration
    ;

importDeclaration
    :    singleTypeImportDeclaration                                                                                   // SingleTypeImportDeclaration
    |    typeImportOnDemandDeclaration                                                                                 // TypeImportOnDemandDeclaration
    |    singleStaticImportDeclaration                                                                                 // SingleStaticImportDeclaration
    |    staticImportOnDemandDeclaration                                                                               // StaticImportOnDemandDeclaration
    ;

singleTypeImportDeclaration
    :    IMPORT qualifiedName SEMI                                                                                         // import qualifiedName ;
    ;

typeImportOnDemandDeclaration
    :    IMPORT qualifiedName DOT STAR SEMI
    ;

singleStaticImportDeclaration
    :    IMPORT STATIC qualifiedName DOT Identifier SEMI                                                                 // import static TypeName . Identifier ;
    ;

staticImportOnDemandDeclaration
    :    IMPORT STATIC qualifiedName DOT STAR SEMI                                                                        // import static TypeName . * ;
    ;

///////////////////////////// ABOVE IS GOOD ////////////////////////

typeDeclarations
    :    typeDeclaration+                                                                                               // TypeDeclaration
    ;

typeDeclaration
    :    classDeclaration                                                                                              // ClassDeclaration
    |    interfaceDeclaration                                                                                          // InterfaceDeclaration
    |    SEMI                                                                                                           // ;
    ;

classDeclaration
    :    normalClassDeclaration                                                                                        // NormalClassDeclaration
    |    enumDeclaration                                                                                               // EnumDeclaration
    ;

normalClassDeclaration
    :    classModifiers? 'class' Identifier typeParameters? superRule? interfaces? classBody                     // ClassModifiersopt class Identifier TypeParametersopt Superopt Interfacesopt ClassBody
    ;

classModifiers
    :    classModifier+                                                                                                 // ClassModifier
    ;

classModifier
    :    annotation
    |    PUBLIC
    |    PROTECTED
    |    PRIVATE
    |    'abstract'
    |    'static'
    |    'final'
    |    'strictfp'
    ;

typeParameters
    :    LT typeParameterList GT                                                                                     // < TypeParameterList >
    ;

typeParameterList
    :    typeParameter (COMMA typeParameter)*                                                                           // TypeParameterList , TypeParameter
    ;

superRule
    :    EXTENDS classOrInterfaceType                                                                                           // extends ClassType
    ;

interfaces
    :    IMPLEMENTS interfaceTypeList                                                                                // implements InterfaceTypeList
    ;

interfaceTypeList
    :    classOrInterfaceType (COMMA classOrInterfaceType)*
    ;

classBody
    :    LBRACE classBodyDeclarations? RBRACE                                                                                  // { ClassBodyDeclarationsopt }
    ;

classBodyDeclarations
    :    classBodyDeclaration+
    ;

classBodyDeclaration
    :    classMemberDeclaration                                                                                        // ClassMemberDeclaration
    |    instanceInitializer                                                                                           // InstanceInitializer
    |    staticInitializer                                                                                             // StaticInitializer
    |    constructorDeclaration                                                                                        // ConstructorDeclaration
    ;

classMemberDeclaration
    :    fieldDeclaration                                                                                              // FieldDeclaration
    |    methodDeclaration                                                                                             // MethodDeclaration
    |    classDeclaration                                                                                              // ClassDeclaration
    |    interfaceDeclaration                                                                                          // InterfaceDeclaration
    |    SEMI                                                                                                           // ;
    ;

// public static final String mike = "\2g\u037a\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6";
fieldDeclaration
    :    fieldModifiers? type variableDeclarators SEMI                                                                // FieldModifiersopt Type VariableDeclarators ;
    ;

variableDeclarators
    :    variableDeclarator (COMMA variableDeclarator)*
    ;

variableDeclarator
    :    variableDeclaratorId                                                                                          // VariableDeclaratorId
    |    variableDeclaratorId EQ variableInitializer                                                                  // VariableDeclaratorId = VariableInitializer
    ;

variableDeclaratorId
    :    Identifier ('[' ']')*                                                                                                   // Identifier
    ;

fieldModifiers
    :    fieldModifier+
    ;

fieldModifier
    :    annotation
    |    PUBLIC
    |    PROTECTED
    |    PRIVATE                                                                     // Annotation public protected private
    |    STATIC
    |    FINAL
    |    TRANSIENT
    |    VOLATILE                                                                       // static final transient volatile
    ;

methodDeclaration
//    :    methodModifiers? result Identifier LPAREN RPAREN methodBody
    :    methodHeader methodBody                                                                                       // MethodHeader MethodBody
    ;

methodHeader
    :    methodModifiers? typeParameters? result methodDeclarator throwsRule?                                        // MethodModifiersopt TypeParametersopt Result MethodDeclarator Throwsopt
    ;

methodDeclarator
    :    Identifier LPAREN formalParameterList? RPAREN                                                                     // Identifier ( FormalParameterListopt )
    ;


// For compatibility with older versions of the Java SE platform, the declaration of a
// method that returns an array is allowed to place (some or all of) the empty bracket
// pairs that form the declaration of the array type after the formal parameter list. This
// is supported by the following obsolescent production, but should not be used in
// new code.
//
//methodDeclarator
//    :    ('[' ']')+
//    ;

formalParameterList
    :    lastFormalParameter                                                                                           // LastFormalParameter
    |    formalParameters COMMA lastFormalParameter                                                                      // FormalParameters , LastFormalParameter
    ;

formalParameters
    :    formalParameter (COMMA formalParameter)*
    ;

formalParameter
    :    variableModifiers? type variableDeclaratorId                                                                // VariableModifiersopt Type VariableDeclaratorId
    ;

variableModifiers
    :    variableModifier+                                                                                              // VariableModifier
    ;

variableModifier
    :    annotation
    |    'final'
    ;

lastFormalParameter
    :    variableModifiers? type ELLIPSIS variableDeclaratorId                                                       // VariableModifiersopt Type... VariableDeclaratorId
    |    formalParameter                                                                                               // FormalParameter
    ;

methodModifiers
    :    methodModifier+
    ;

methodModifier
    :    annotation
    |    PUBLIC
    |    PROTECTED
    |    PRIVATE
    |    ABSTRACT                                                          // Annotation public protected private abstract
    |    STATIC
    |    FINAL
    |    SYNCHRONIZED
    |    NATIVE
    |    STRICTFP                                                           // static final synchronized native strictfp
    ;

result
    :    type                                                                                                          // Type
    |    VOID                                                                                                        // void
    ;

throwsRule
    :    THROWS exceptionTypeList                                                                                    // throws ExceptionTypeList
    ;

exceptionTypeList
    :    exceptionType (COMMA exceptionType)*
    ;

exceptionType
    :    qualifiedName                                                                                                      // TypeName
    |    typeVariable                                                                                                  // TypeVariable
    ;

methodBody
    :    block                                                                                                         // Block
    |    SEMI                                                                                                           // ;
    ;

instanceInitializer
    :    block                                                                                                         // Block
    ;

staticInitializer
    :    'static' block                                                                                                // static Block
    ;

constructorDeclaration
    :    constructorModifiers? constructorDeclarator throwsRule? constructorBody                                       // ConstructorModifiersopt ConstructorDeclarator Throwsopt ConstructorBody
    ;

constructorBody
    :    '{' explicitConstructorInvocation? blockStatements? '}'
    ;

constructorDeclarator
    :    typeParameters? Identifier '(' formalParameterList? ')'
    ;

constructorModifiers
    :    constructorModifier+                                                                                           // ConstructorModifier
    ;

constructorModifier
    :    annotation
    |    PUBLIC
    |    PROTECTED
    |    PRIVATE
    ;

explicitConstructorInvocation
    :    nonWildTypeArguments? 'this' '(' (expression (COMMA expression)*)? ')' SEMI                                                    // NonWildTypeArgumentsopt this ( ArgumentListopt ) ;
    |    nonWildTypeArguments? 'super' '(' (expression (COMMA expression)*)? ')' SEMI                                                   // NonWildTypeArgumentsopt super ( ArgumentListopt ) ;
    |    primary DOT nonWildTypeArguments? 'super' '(' (expression (COMMA expression)*)? ')' SEMI                                       // Primary . NonWildTypeArgumentsopt super ( ArgumentListopt ) ;
    ;

enumDeclaration
    :    classModifiers? ENUM Identifier interfaces? enumBody                                                    // ClassModifiersopt enum Identifier Interfacesopt EnumBody
    ;

enumBody
    :    '{' enumConstants? COMMA? enumBodyDeclarations? '}'                                                     // { EnumConstantsopt ,opt EnumBodyDeclarationsopt }
    ;

enumConstants
    :    enumConstant (COMMA enumConstant)*
    ;

enumConstant
    :    annotations? Identifier (expression (COMMA expression)*)? classBody?                                                           // Annotationsopt Identifier Argumentsopt ClassBodyopt
    ;

enumBodyDeclarations
    :    SEMI classBodyDeclarations?                                                                                  // ; ClassBodyDeclarationsopt
    ;

interfaceDeclaration
    :    normalInterfaceDeclaration                                                                                    // NormalInterfaceDeclaration
    |    annotationTypeDeclaration                                                                                     // AnnotationTypeDeclaration
    ;

normalInterfaceDeclaration
    :    interfaceModifiers? 'interface' Identifier                                                                // InterfaceModifiersopt interface Identifier
    |    typeParameters? extendsInterfaces? interfaceBody                                                          // TypeParametersopt ExtendsInterfacesopt InterfaceBody
    ;

interfaceModifiers
    :    interfaceModifier+
    ;

interfaceModifier
    :    annotation
    |    PUBLIC
    |    PROTECTED
    |    PRIVATE
    |    'abstract'
    |    'static'
    |    'strictfp'
    ;

extendsInterfaces
    :    'extends' interfaceTypeList                                                                                   // extends InterfaceTypeList
    ;

interfaceBody
    :    '{' interfaceMemberDeclarations? '}'                                                                            // { InterfaceMemberDeclarationsopt }
    ;

interfaceMemberDeclarations
    :    interfaceMemberDeclaration+
    ;

interfaceMemberDeclaration
    :    constantDeclaration                                                                                           // ConstantDeclaration
    |    abstractMethodDeclaration                                                                                     // AbstractMethodDeclaration
    |    classDeclaration                                                                                              // ClassDeclaration
    |    interfaceDeclaration                                                                                          // InterfaceDeclaration
    |    SEMI                                                                                                           // ;
    ;

constantDeclaration
    :    constantModifiers? type variableDeclarators SEMI                                                             // ConstantModifiersopt Type VariableDeclarators ;
    ;

constantModifiers
    :    constantModifier+
    ;

constantModifier
    :    annotation
    |    PUBLIC
    |    'static'
    |    'final'
    ;

abstractMethodDeclaration
    :    abstractMethodModifiers? typeParameters? result
    |    methodDeclarator throwsRule? SEMI
    ;

abstractMethodModifiers
    :    abstractMethodModifier+
    ;

abstractMethodModifier
    :    annotation
    |    PUBLIC
    |    'abstract'
    ;

annotationTypeDeclaration
    :    interfaceModifiers? AT 'interface' Identifier annotationTypeBody                                         // InterfaceModifiersopt @ interface Identifier AnnotationTypeBody
    ;

annotationTypeBody
    :    '{' annotationTypeElementDeclarations? '}'                                                                      // { AnnotationTypeElementDeclarationsopt }
    ;

annotationTypeElementDeclarations
    :    annotationTypeElementDeclaration+
    ;

annotationTypeElementDeclaration
    :    abstractMethodModifiers? type Identifier '(' ')' dims? defaultValue? SEMI                                // AbstractMethodModifiersopt Type Identifier ( ) Dimsopt DefaultValueopt ;
    |    constantDeclaration                                                                                           // ConstantDeclaration
    |    classDeclaration                                                                                              // ClassDeclaration
    |    interfaceDeclaration                                                                                          // InterfaceDeclaration
    |    enumDeclaration                                                                                               // EnumDeclaration
    |    annotationTypeDeclaration                                                                                     // AnnotationTypeDeclaration
    |    SEMI                                                                                                           // ;
    ;

defaultValue
    :    'default' elementValue                                                                                        // default ElementValue
    ;

typeParameter
    :    typeVariable typeBound?                                                                                     // TypeVariable TypeBoundopt
    ;

typeBound
    :    EXTENDS typeVariable                                                                                        // extends TypeVariable
    |    EXTENDS classOrInterfaceType additionalBoundList?                                                         // extends ClassOrInterfaceType AdditionalBoundListopt
    ;

additionalBoundList
    :    additionalBound+
    ;

additionalBound
    :    '&' classOrInterfaceType                                                                                             // & InterfaceType
    ;

block
    :    '{' blockStatements? '}'                                                                                        // { BlockStatementsopt }
    ;

blockStatements
    :    blockStatement+
    ;

blockStatement
    :    localVariableDeclarationStatement                                                                             // LocalVariableDeclarationStatement
    |    classDeclaration                                                                                              // ClassDeclaration
    |    statement                                                                                                     // Statement
    ;

localVariableDeclarationStatement
    :    localVariableDeclaration SEMI                                                                                  // LocalVariableDeclaration ;
    ;

localVariableDeclaration
    :    variableModifiers? type variableDeclarators                                                                 // VariableModifiersopt Type VariableDeclarators
    ;

statement
    :    labeledStatement                                                                                              // LabeledStatement
    |    ifThenStatement                                                                                               // IfThenStatement
    |    ifThenElseStatement                                                                                           // IfThenElseStatement
    |    whileStatement                                                                                                // WhileStatement
    |    forStatement                                                                                                  // ForStatement
    |    statementWithoutTrailingSubstatement                                                                          // StatementWithoutTrailingSubstatement
    ;

statementWithoutTrailingSubstatement
    :    block                                                                                                         // Block
    |    emptyStatement                                                                                                // EmptyStatement
    |    expressionStatement                                                                                           // ExpressionStatement
    |    assertStatement                                                                                               // AssertStatement
    |    switchStatement                                                                                               // SwitchStatement
    |    doStatement                                                                                                   // DoStatement
    |    breakStatement                                                                                                // BreakStatement
    |    continueStatement                                                                                             // ContinueStatement
    |    returnStatement                                                                                               // ReturnStatement
    |    synchronizedStatement                                                                                         // SynchronizedStatement
    |    throwStatement                                                                                                // ThrowStatement
    |    tryStatement                                                                                                  // TryStatement
    ;

statementNoShortIf
    :    statementWithoutTrailingSubstatement                                                                          // StatementWithoutTrailingSubstatement
    |    labeledStatementNoShortIf                                                                                     // LabeledStatementNoShortIf
    |    ifThenElseStatementNoShortIf                                                                                  // IfThenElseStatementNoShortIf
    |    whileStatementNoShortIf                                                                                       // WhileStatementNoShortIf
    |    forStatementNoShortIf                                                                                         // ForStatementNoShortIf
    ;

emptyStatement
    :    SEMI                                                                                                           // ;
    ;

labeledStatement
    :    Identifier COLON statement                                                                                      // Identifier : Statement
    ;

labeledStatementNoShortIf
    :    Identifier COLON statementNoShortIf                                                                             // Identifier : StatementNoShortIf
    ;

expressionStatement
    :    statementExpression SEMI                                                                                       // StatementExpression ;
    ;

statementExpression
    :    methodInvocation                                                                                              // MethodInvocation
    |    classInstanceCreationExpression                                                                               // ClassInstanceCreationExpression
    |    expression                                                                                                    // Assignment
    ;

ifThenStatement
    :    IF LPAREN expression RPAREN statement                                                                             // if ( Expression ) Statement
    ;

ifThenElseStatement
    :    IF '(' expression ')' statementNoShortIf 'else' statement                                                   // if ( Expression ) StatementNoShortIf else Statement
    ;

ifThenElseStatementNoShortIf
    :    IF '(' expression ')' statementNoShortIf 'else' statementNoShortIf                                          // if ( Expression ) StatementNoShortIf else StatementNoShortIf
    ;

assertStatement
    :    ASSERT expression SEMI                                                                                      // assert Expression1 ;
    |    ASSERT expression COLON expression SEMI                                                                      // assert Expression1 : Expression2 ;
    ;

switchStatement
    :    SWITCH '(' expression ')' switchBlock                                                                       // switch ( Expression ) SwitchBlock
    ;

switchBlock
    :    '{' switchBlockStatementGroups? switchLabels? '}'                                                             // { SwitchBlockStatementGroupsopt SwitchLabelsopt }
    ;

switchBlockStatementGroups
    :    switchBlockStatementGroup+
    ;

switchBlockStatementGroup
    :    switchLabels blockStatements                                                                                  // SwitchLabels BlockStatements
    ;

switchLabels
    :    switchLabel+                                                                                                   // SwitchLabel
    ;

switchLabel
    :    CASE expression COLON
    |    CASE Identifier COLON
    |    DEFAULT COLON
    ;

whileStatement
    :    'while' '(' expression ')' statement                                                                          // while ( Expression ) Statement
    ;

whileStatementNoShortIf
    :    'while' '(' expression ')' statementNoShortIf                                                                 // while ( Expression ) StatementNoShortIf
    ;

doStatement
    :    'do' statement 'while' '(' expression ')' SEMI                                                                 // do Statement while ( Expression ) ;
    ;

forStatement
    :    basicForStatement                                                                                             // BasicForStatement
    |    enhancedForStatement                                                                                          // EnhancedForStatement
    ;

basicForStatement
    :    'for' '(' forInit? SEMI expression? SEMI forUpdate? ')' statement                                         // for ( ForInitopt ; Expressionopt ; ForUpdateopt ) Statement
    ;

forStatementNoShortIf
    :    'for' '(' forInit? SEMI expression? SEMI forUpdate? ')' statementNoShortIf                                // for ( ForInitopt ; Expressionopt ; ForUpdateopt ) StatementNoShortIf
    ;

forInit
    :    statementExpressionList                                                                                       // StatementExpressionList
    |    localVariableDeclaration                                                                                      // LocalVariableDeclaration
    ;

forUpdate
    :    statementExpressionList                                                                                       // StatementExpressionList
    ;

statementExpressionList
    :    statementExpression (COMMA statementExpression)*
    ;

enhancedForStatement
    :    FOR '(' formalParameter COLON expression ')' statement                                                        // for ( FormalParameter : Expression ) Statement
    ;

breakStatement
    :    BREAK Identifier? SEMI                                                                                     // break Identifieropt ;
    ;

continueStatement
    :    CONTINUE Identifier? SEMI                                                                                  // continue Identifieropt ;
    ;

returnStatement
    :    'return' expression? SEMI                                                                                    // return Expressionopt ;
    ;

throwStatement
    :    THROW expression SEMI                                                                                        // throw Expression ;
    ;

synchronizedStatement
    :    'synchronized' '(' expression ')' block                                                                       // synchronized ( Expression ) Block
    ;

tryStatement
    :    'try' block catches                                                                                           // try Block Catches
    |    'try' block catches? finallyRule                                                                                // try Block Catchesopt Finally
    |    tryWithResourcesStatement                                                                                     // TryWithResourcesStatement
    ;

catches
    :    catchClause (catchClause)*                                                                                                  // CatchClause
    ;

catchClause
    :    CATCH '(' catchFormalParameter ')' block                                                                    // catch ( CatchFormalParameter ) Block
    ;

catchFormalParameter
    :    variableModifiers? catchType variableDeclaratorId                                                           // VariableModifiersopt CatchType VariableDeclaratorId
    ;

catchType
    :    classOrInterfaceType (BAR classOrInterfaceType)*
    ;

finallyRule
    :    FINALLY block                                                                                               // finally Block
    ;

tryWithResourcesStatement
    :    'try' resourceSpecification block catches? finallyRule?                                                       // try ResourceSpecification Block Catchesopt Finallyopt
    ;

resourceSpecification
    :    '(' resources SEMI? ')'                                                                                    // ( Resources ;opt )
    ;

resources
    :    resource (SEMI resource)*                                                                                                     // Resource
    ;

resource
    :    variableModifiers? type variableDeclaratorId EQ expression                                                 // VariableModifiersopt Type VariableDeclaratorId = Expression
    ;

primary
    :    expression
    ;

methodInvocation
    :    primary
    ;

classInstanceCreationExpression
    :    primary
    ;

fieldAccess
    :    primary
    ;

arrayAccess
    :    primary
    ;

primaryNoNewArray
    :    primary
    ;

type
    :    primitiveType (LBRACKET RBRACKET)*
    |    classOrInterfaceType (LBRACKET RBRACKET)*
    |    typeVariable (LBRACKET RBRACKET)*
    ;

classOrInterfaceType
    :    typeDeclSpecifier typeArguments?
    ;

typeDeclSpecifier
    :    qualifiedName                                                                                                      // qualifiedName
    |    (qualifiedName typeArguments?)+ DOT Identifier                                                                           // ClassOrInterfaceType . Identifier
    ;

typeVariable
    :    Identifier                                                                                                    // Identifier
    ;

typeArgumentsOrDiamond
    :    typeArguments                                                                                                 // TypeArguments
    |    LT GT                                                                                                        // <>
    ;

typeArguments
    :    LT typeArgumentList GT                                                                                      // < TypeArgumentList >
    ;

typeArgumentList
    :    typeArgument (COMMA typeArgument)*                                                                                                 // TypeArgument
    ;

typeArgument
    :    referenceType                                                                                                 // ReferenceType
    |    wildcard                                                                                                      // Wildcard
    ;

wildcard
    :    '?' wildcardBounds?                                                                                         // ? WildcardBoundsopt
    ;

wildcardBounds
    :    'extends' referenceType                                                                                       // extends ReferenceType
    |    'super' referenceType                                                                                         // super ReferenceType
    ;

nonWildTypeArguments
    :    LT referenceTypeList GT                                                                                     // < ReferenceTypeList >
    ;

referenceTypeList
    :    referenceType (COMMA referenceType)*
    ;

referenceType
    :    type
    ;

dims
    :    ('[' ']')+
    ;

//////////////////////////////////////////// EXPRESSIONS ///////////////////////////////////
expression
    :    qualifiedName                                                                                                // qualifiedName
    |    qualifiedName '[' expression ']'                                                                             // ArrayAccess
    |    expression assignmentOperator expression                                                                      // Assignment
    |    expression '[' expression ']'<assoc=right>                                                                                    // ArrayAccess
    |    expression DOT Identifier                                                                                        // Field Access
    |    'super' DOT Identifier                                                                                        // Field Access
    |    Identifier DOT 'super' DOT Identifier                                                                          // Field Access
    |    expression PLUSPLUS                                                                                           // PostIncrementExpression
    |    expression SUBSUB                                                                                             // PostDecrementExpression
    |    expression '?'<assoc=right> expression COLON expression                                            // conditionalExpression
    |    expression BARBAR<assoc=right> expression                                                       // conditionalOrExpression
    |    expression AMPAMP<assoc=right> expression                                                         // conditionalAndExpression
    |    expression '&'<assoc=right> expression                                                                          // andExpression
    |    expression '^'<assoc=right> expression                                                                       // exclusiveOrExpression
    |    expression BAR<assoc=right> expression                                                               // inclusiveOrExpression
    |    PLUS expression                                                                                          // + UnaryExpression
    |    SUB expression                                                                                           // - UnaryExpression
    |    PLUSPLUS expression                                                                                      // PreIncrementExpression
    |    SUBSUB expression                                                                                        // PreDecrementExpression:
    |    '~' expression                                                                                           // UnaryExpressionNotPlusMinus
    |    '!' expression                                                                                           // UnaryExpressionNotPlusMinus
    |    '(' primitiveType ')' expression                                                                         // CastExpression
    |    '(' referenceType ')' expression                                                             // CastExpression
    |    expression STAR<assoc=right> expression                                                                 // MultiplicativeExpression
    |    expression '/'<assoc=right> expression                                                                  // MultiplicativeExpression
    |    expression '%'<assoc=right> expression                                                                  // MultiplicativeExpression
    |    expression PLUS<assoc=right> expression                                                              // additiveExpression
    |    expression SUB<assoc=right> expression                                                               // additiveExpression
    |    expression LTLT<assoc=right> expression                                                                       // ShiftExpression
    |    expression GTGT<assoc=right> expression                                                                       // ShiftExpression
    |    expression GTGT<assoc=right> expression                                                                       // ShiftExpression
    |    expression LT<assoc=right> expression                                                                       // RelationalExpression
    |    expression GT<assoc=right> expression                                                                       // RelationalExpression
    |    expression LTEQ<assoc=right> expression                                                                     // RelationalExpression
    |    expression GTEQ<assoc=right> expression                                                                     // RelationalExpression
    |    expression 'instanceof' referenceType                                                               // RelationalExpression
    |    expression EQEQ<assoc=right> expression                                                                  // EqualityExpression
    |    expression BANGEQ<assoc=right> expression                                                                // EqualityExpression
    |    literal                                                                                                       // Literal
    |    type DOT 'class'                                                                                              // PrimaryNoNewArray
    |    'void' DOT 'class'                                                                                            // PrimaryNoNewArray
    |    'this'                                                                                                        // PrimaryNoNewArray
    |    Identifier DOT 'this'                                                                                          // PrimaryNoNewArray
    |    '(' expression ')'                                                                                            // PrimaryNoNewArray
    |    'new' typeArguments? typeDeclSpecifier typeArgumentsOrDiamond? '(' (expression (COMMA expression)*)? ')' classBody?               // classInstanceCreationExpression
    |    expression DOT 'new' typeArguments? Identifier typeArgumentsOrDiamond? '(' (expression (COMMA expression)*)? ')' classBody?          // classInstanceCreationExpression
    |    qualifiedName '(' (expression (COMMA expression)*)? ')'                                                                              // Method Invocation
    |    expression DOT nonWildTypeArguments? Identifier '(' (expression (COMMA expression)*)? ')'                                            // Method Invocation
    |    'super' DOT nonWildTypeArguments? Identifier '(' (expression (COMMA expression)*)? ')'                                            // Method Invocation
    |    Identifier DOT 'super' DOT nonWildTypeArguments? Identifier '(' (expression (COMMA expression)*)? ')'                              // Method Invocation
    |    qualifiedName DOT nonWildTypeArguments Identifier '(' (expression (COMMA expression)*)? ')'                                            // Method Invocation
    |    'new' primitiveType ('[' expression ']')+ dims?                                       // arrayCreationExpression
    |    'new' classOrInterfaceType ('[' expression ']')+ dims?                                // arrayCreationExpression
    |    'new' primitiveType dims '{' (expression (COMMA expression)*)? COMMA? '}'             // arrayCreationExpression
    |    'new' classOrInterfaceType dims '{' (expression (COMMA expression)*)? COMMA? '}'      // arrayCreationExpression
    ;

variableInitializer
    :    '{' (expression (COMMA expression)*)? COMMA? '}'
    |    expression
    ;

assignmentOperator
    :
    |    EQ<assoc=right>
    |    STAREQ<assoc=right>
    |    SLASHEQ<assoc=right>
    |    PERCENTEQ<assoc=right>
    |    PLUSEQ<assoc=right>
    |    SUBEQ<assoc=right>
    |    LTLTEQ<assoc=right>
    |    GTGTEQ<assoc=right>
    |    GTGTGTEQ<assoc=right>
    |    AMPEQ<assoc=right>
    |    CARETEQ<assoc=right>
    |    BAREQ<assoc=right>
    ;


primitiveType
    :    numericType
    |    BOOLEAN                                                                                                     // boolean
    ;

numericType
    :    integralType                                                                                                  // IntegralType
    |    floatingPointType                                                                                             // FloatingPointType
    ;

integralType
    :    BYTE
    |    SHORT
    |    INT
    |    LONG
    |    CHAR
    ;

floatingPointType
    :    FLOAT
    |    DOUBLE                                                                                              // float double
    ;

qualifiedName
    :    Identifier (DOT Identifier)*
    ;


literal
    :    IntegerLiteral                                                                            // IntegerLiteral
    |    FloatingPointLiteral                                                                      // FloatingPointLiteral
    |    booleanLiteral                                                                            // BooleanLiteral
    |    CharacterLiteral                                                                          // CharacterLiteral
    |    StringLiteral                                                                             // StringLiteral
    |    nullLiteral                                                                               // NullLiteral
    ;

booleanLiteral
    :    TRUE
    |    FALSE
    ;

nullLiteral
    :    NULL
    ;
