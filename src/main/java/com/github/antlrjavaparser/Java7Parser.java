// Generated from Java7Parser.g4 by ANTLR 4.5.1

package com.github.antlrjavaparser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java7Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMI=1, PACKAGE=2, IMPORT=3, DOT=4, STAR=5, CLASS=6, IMPLEMENTS=7, PUBLIC=8, 
		PROTECTED=9, PRIVATE=10, ABSTRACT=11, STATIC=12, FINAL=13, STRICTFP=14, 
		COMMA=15, LBRACE=16, RBRACE=17, LBRACKET=18, RBRACKET=19, LPAREN=20, RPAREN=21, 
		VOID=22, INTERFACE=23, THROW=24, THROWS=25, EQ=26, NATIVE=27, SYNCHRONIZED=28, 
		TRANSIENT=29, VOLATILE=30, BOOLEAN=31, CHAR=32, BYTE=33, SHORT=34, INT=35, 
		LONG=36, FLOAT=37, DOUBLE=38, QUES=39, EXTENDS=40, ELLIPSIS=41, THIS=42, 
		SUPER=43, NULL=44, TRUE=45, FALSE=46, AT=47, DEFAULT=48, REF=49, COLON=50, 
		IF=51, ELSE=52, FOR=53, WHILE=54, DO=55, TRY=56, FINALLY=57, SWITCH=58, 
		RETURN=59, BREAK=60, CONTINUE=61, CATCH=62, CASE=63, ENUM=64, ASSERT=65, 
		LAMBDA=66, PLUSPLUS=67, SUBSUB=68, TILDE=69, BANG=70, NEW=71, SLASH=72, 
		PERCENT=73, PLUS=74, SUB=75, EQEQ=76, BANGEQ=77, AMP=78, CARET=79, BAR=80, 
		AMPAMP=81, BARBAR=82, CARETEQ=83, PLUSEQ=84, SUBEQ=85, STAREQ=86, SLASHEQ=87, 
		AMPEQ=88, BAREQ=89, PERCENTEQ=90, GT=91, LT=92, INSTANCEOF=93, CONST=94, 
		GOTO=95, IntegerLiteral=96, FloatingPointLiteral=97, CharacterLiteral=98, 
		StringLiteral=99, Identifier=100, WhiteSpace=101, LineTerminator=102, 
		SlashComment=103, EndOfLineComment=104;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_qualifiedImportName = 3, RULE_typeDeclaration = 4, RULE_classOrInterfaceDeclaration = 5, 
		RULE_modifiers = 6, RULE_modifier = 7, RULE_variableModifiers = 8, RULE_classDeclaration = 9, 
		RULE_normalClassDeclaration = 10, RULE_typeParameters = 11, RULE_typeParameter = 12, 
		RULE_typeBound = 13, RULE_additionalBound = 14, RULE_enumDeclaration = 15, 
		RULE_enumBody = 16, RULE_enumConstants = 17, RULE_enumConstant = 18, RULE_enumBodyDeclarations = 19, 
		RULE_interfaceDeclaration = 20, RULE_normalInterfaceDeclaration = 21, 
		RULE_typeList = 22, RULE_classBody = 23, RULE_interfaceBody = 24, RULE_classBodyDeclaration = 25, 
		RULE_memberDecl = 26, RULE_methodDeclaration = 27, RULE_constructorDeclaration = 28, 
		RULE_constructorBlock = 29, RULE_fieldDeclaration = 30, RULE_variableDeclarator = 31, 
		RULE_interfaceBodyDeclaration = 32, RULE_interfaceMethodDeclaration = 33, 
		RULE_defaultInterfaceMethodDeclaration = 34, RULE_interfaceFieldDeclaration = 35, 
		RULE_type = 36, RULE_classOrInterfaceType = 37, RULE_identifierTypeArgument = 38, 
		RULE_primitiveType = 39, RULE_typeArguments = 40, RULE_typeArgument = 41, 
		RULE_qualifiedNameList = 42, RULE_formalParameters = 43, RULE_formalParameterDecls = 44, 
		RULE_normalParameterDecl = 45, RULE_ellipsisParameterDecl = 46, RULE_explicitConstructorInvocation = 47, 
		RULE_qualifiedName = 48, RULE_annotations = 49, RULE_annotation = 50, 
		RULE_markerAnnotation = 51, RULE_singleElementAnnotation = 52, RULE_normalAnnotation = 53, 
		RULE_elementValuePairs = 54, RULE_elementValuePair = 55, RULE_elementValue = 56, 
		RULE_elementValueArrayInitializer = 57, RULE_annotationTypeDeclaration = 58, 
		RULE_annotationTypeBody = 59, RULE_annotationTypeElementDeclaration = 60, 
		RULE_annotationMethodDeclaration = 61, RULE_block = 62, RULE_blockStatement = 63, 
		RULE_localVariableDeclarationStatement = 64, RULE_localVariableDeclaration = 65, 
		RULE_statement = 66, RULE_emptyStatement = 67, RULE_switchBlockStatementGroups = 68, 
		RULE_switchBlockStatementGroup = 69, RULE_switchLabel = 70, RULE_trystatement = 71, 
		RULE_tryWithResources = 72, RULE_resourceSpecification = 73, RULE_resources = 74, 
		RULE_resource = 75, RULE_catches = 76, RULE_catchClause = 77, RULE_catchFormalParameter = 78, 
		RULE_forstatement = 79, RULE_foreachStatement = 80, RULE_normalForStatement = 81, 
		RULE_forInit = 82, RULE_parExpression = 83, RULE_expressionList = 84, 
		RULE_expression = 85, RULE_assignmentOperator = 86, RULE_conditionalExpression = 87, 
		RULE_conditionalOrExpression = 88, RULE_conditionalAndExpression = 89, 
		RULE_inclusiveOrExpression = 90, RULE_exclusiveOrExpression = 91, RULE_andExpression = 92, 
		RULE_equalityExpression = 93, RULE_notEqualityExpression = 94, RULE_instanceOfExpression = 95, 
		RULE_relationalExpression = 96, RULE_relationalOp = 97, RULE_shiftExpression = 98, 
		RULE_shiftOp = 99, RULE_additiveExpression = 100, RULE_additiveOp = 101, 
		RULE_multiplicativeExpression = 102, RULE_multiplicativeOp = 103, RULE_unaryExpression = 104, 
		RULE_unaryExpressionNotPlusMinus = 105, RULE_castExpression = 106, RULE_primary = 107, 
		RULE_superSuffix = 108, RULE_thisSuffix = 109, RULE_identifierSuffix = 110, 
		RULE_typeParamCall = 111, RULE_selector = 112, RULE_creator = 113, RULE_arrayCreator = 114, 
		RULE_variableInitializer = 115, RULE_arrayInitializer = 116, RULE_createdName = 117, 
		RULE_innerCreator = 118, RULE_classCreatorRest = 119, RULE_nonWildcardTypeArguments = 120, 
		RULE_arguments = 121, RULE_literal = 122, RULE_classHeader = 123, RULE_enumHeader = 124, 
		RULE_interfaceHeader = 125, RULE_annotationHeader = 126, RULE_typeHeader = 127, 
		RULE_methodHeader = 128, RULE_fieldHeader = 129, RULE_localVariableHeader = 130, 
		RULE_inferredFormalParameterList = 131, RULE_inferredFormalParameters = 132, 
		RULE_lambdaExpression = 133, RULE_lambdaParameters = 134, RULE_lambdaBody = 135, 
		RULE_methodReference = 136, RULE_referenceType = 137, RULE_typeVariable = 138, 
		RULE_typeName = 139, RULE_arrayType = 140, RULE_dims = 141;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "qualifiedImportName", 
		"typeDeclaration", "classOrInterfaceDeclaration", "modifiers", "modifier", 
		"variableModifiers", "classDeclaration", "normalClassDeclaration", "typeParameters", 
		"typeParameter", "typeBound", "additionalBound", "enumDeclaration", "enumBody", 
		"enumConstants", "enumConstant", "enumBodyDeclarations", "interfaceDeclaration", 
		"normalInterfaceDeclaration", "typeList", "classBody", "interfaceBody", 
		"classBodyDeclaration", "memberDecl", "methodDeclaration", "constructorDeclaration", 
		"constructorBlock", "fieldDeclaration", "variableDeclarator", "interfaceBodyDeclaration", 
		"interfaceMethodDeclaration", "defaultInterfaceMethodDeclaration", "interfaceFieldDeclaration", 
		"type", "classOrInterfaceType", "identifierTypeArgument", "primitiveType", 
		"typeArguments", "typeArgument", "qualifiedNameList", "formalParameters", 
		"formalParameterDecls", "normalParameterDecl", "ellipsisParameterDecl", 
		"explicitConstructorInvocation", "qualifiedName", "annotations", "annotation", 
		"markerAnnotation", "singleElementAnnotation", "normalAnnotation", "elementValuePairs", 
		"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
		"annotationTypeBody", "annotationTypeElementDeclaration", "annotationMethodDeclaration", 
		"block", "blockStatement", "localVariableDeclarationStatement", "localVariableDeclaration", 
		"statement", "emptyStatement", "switchBlockStatementGroups", "switchBlockStatementGroup", 
		"switchLabel", "trystatement", "tryWithResources", "resourceSpecification", 
		"resources", "resource", "catches", "catchClause", "catchFormalParameter", 
		"forstatement", "foreachStatement", "normalForStatement", "forInit", "parExpression", 
		"expressionList", "expression", "assignmentOperator", "conditionalExpression", 
		"conditionalOrExpression", "conditionalAndExpression", "inclusiveOrExpression", 
		"exclusiveOrExpression", "andExpression", "equalityExpression", "notEqualityExpression", 
		"instanceOfExpression", "relationalExpression", "relationalOp", "shiftExpression", 
		"shiftOp", "additiveExpression", "additiveOp", "multiplicativeExpression", 
		"multiplicativeOp", "unaryExpression", "unaryExpressionNotPlusMinus", 
		"castExpression", "primary", "superSuffix", "thisSuffix", "identifierSuffix", 
		"typeParamCall", "selector", "creator", "arrayCreator", "variableInitializer", 
		"arrayInitializer", "createdName", "innerCreator", "classCreatorRest", 
		"nonWildcardTypeArguments", "arguments", "literal", "classHeader", "enumHeader", 
		"interfaceHeader", "annotationHeader", "typeHeader", "methodHeader", "fieldHeader", 
		"localVariableHeader", "inferredFormalParameterList", "inferredFormalParameters", 
		"lambdaExpression", "lambdaParameters", "lambdaBody", "methodReference", 
		"referenceType", "typeVariable", "typeName", "arrayType", "dims"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'package'", "'import'", "'.'", "'*'", "'class'", "'implements'", 
		"'public'", "'protected'", "'private'", "'abstract'", "'static'", "'final'", 
		"'strictfp'", "','", "'{'", "'}'", "'['", "']'", "'('", "')'", "'void'", 
		"'interface'", "'throw'", "'throws'", "'='", "'native'", "'synchronized'", 
		"'transient'", "'volatile'", "'boolean'", "'char'", "'byte'", "'short'", 
		"'int'", "'long'", "'float'", "'double'", "'?'", "'extends'", "'...'", 
		"'this'", "'super'", "'null'", "'true'", "'false'", "'@'", "'default'", 
		"'::'", "':'", "'if'", "'else'", "'for'", "'while'", "'do'", "'try'", 
		"'finally'", "'switch'", "'return'", "'break'", "'continue'", "'catch'", 
		"'case'", "'enum'", "'assert'", "'->'", "'++'", "'--'", "'~'", "'!'", 
		"'new'", "'/'", "'%'", "'+'", "'-'", "'=='", "'!='", "'&'", "'^'", "'|'", 
		"'&&'", "'||'", "'^='", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
		"'%='", "'>'", "'<'", "'instanceof'", "'const'", "'goto'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMI", "PACKAGE", "IMPORT", "DOT", "STAR", "CLASS", "IMPLEMENTS", 
		"PUBLIC", "PROTECTED", "PRIVATE", "ABSTRACT", "STATIC", "FINAL", "STRICTFP", 
		"COMMA", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "LPAREN", "RPAREN", 
		"VOID", "INTERFACE", "THROW", "THROWS", "EQ", "NATIVE", "SYNCHRONIZED", 
		"TRANSIENT", "VOLATILE", "BOOLEAN", "CHAR", "BYTE", "SHORT", "INT", "LONG", 
		"FLOAT", "DOUBLE", "QUES", "EXTENDS", "ELLIPSIS", "THIS", "SUPER", "NULL", 
		"TRUE", "FALSE", "AT", "DEFAULT", "REF", "COLON", "IF", "ELSE", "FOR", 
		"WHILE", "DO", "TRY", "FINALLY", "SWITCH", "RETURN", "BREAK", "CONTINUE", 
		"CATCH", "CASE", "ENUM", "ASSERT", "LAMBDA", "PLUSPLUS", "SUBSUB", "TILDE", 
		"BANG", "NEW", "SLASH", "PERCENT", "PLUS", "SUB", "EQEQ", "BANGEQ", "AMP", 
		"CARET", "BAR", "AMPAMP", "BARBAR", "CARETEQ", "PLUSEQ", "SUBEQ", "STAREQ", 
		"SLASHEQ", "AMPEQ", "BAREQ", "PERCENTEQ", "GT", "LT", "INSTANCEOF", "CONST", 
		"GOTO", "IntegerLiteral", "FloatingPointLiteral", "CharacterLiteral", 
		"StringLiteral", "Identifier", "WhiteSpace", "LineTerminator", "SlashComment", 
		"EndOfLineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Java7Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java7Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(284);
				packageDeclaration();
				}
				break;
			}
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(287);
				importDeclaration();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (SEMI - 1)) | (1L << (CLASS - 1)) | (1L << (PUBLIC - 1)) | (1L << (PROTECTED - 1)) | (1L << (PRIVATE - 1)) | (1L << (ABSTRACT - 1)) | (1L << (STATIC - 1)) | (1L << (FINAL - 1)) | (1L << (STRICTFP - 1)) | (1L << (INTERFACE - 1)) | (1L << (NATIVE - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOLATILE - 1)) | (1L << (AT - 1)) | (1L << (ENUM - 1)))) != 0)) {
				{
				{
				setState(293);
				typeDeclaration();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(Java7Parser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(299);
				annotations();
				}
			}

			setState(302);
			match(PACKAGE);
			setState(303);
			qualifiedName();
			setState(304);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Java7Parser.IMPORT, 0); }
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public TerminalNode STAR() { return getToken(Java7Parser.STAR, 0); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(Java7Parser.STATIC, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			int _alt;
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(IMPORT);
				setState(308);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(307);
					match(STATIC);
					}
				}

				setState(310);
				match(Identifier);
				setState(311);
				match(DOT);
				setState(312);
				match(STAR);
				setState(313);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(IMPORT);
				setState(316);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(315);
					match(STATIC);
					}
				}

				setState(318);
				match(Identifier);
				setState(321); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(319);
						match(DOT);
						setState(320);
						match(Identifier);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(323); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(327);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(325);
					match(DOT);
					setState(326);
					match(STAR);
					}
				}

				setState(329);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedImportNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public QualifiedImportNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedImportName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterQualifiedImportName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitQualifiedImportName(this);
		}
	}

	public final QualifiedImportNameContext qualifiedImportName() throws RecognitionException {
		QualifiedImportNameContext _localctx = new QualifiedImportNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_qualifiedImportName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(Identifier);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(333);
				match(DOT);
				setState(334);
				match(Identifier);
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeDeclaration);
		try {
			setState(342);
			switch (_input.LA(1)) {
			case CLASS:
			case PUBLIC:
			case PROTECTED:
			case PRIVATE:
			case ABSTRACT:
			case STATIC:
			case FINAL:
			case STRICTFP:
			case INTERFACE:
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case AT:
			case ENUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				classOrInterfaceDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterClassOrInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitClassOrInterfaceDeclaration(this);
		}
	}

	public final ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() throws RecognitionException {
		ClassOrInterfaceDeclarationContext _localctx = new ClassOrInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceDeclaration);
		try {
			setState(346);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				interfaceDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifiersContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitModifiers(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(348);
					modifier();
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(Java7Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(Java7Parser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(Java7Parser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(Java7Parser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(Java7Parser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(Java7Parser.FINAL, 0); }
		public TerminalNode NATIVE() { return getToken(Java7Parser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(Java7Parser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(Java7Parser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(Java7Parser.VOLATILE, 0); }
		public TerminalNode STRICTFP() { return getToken(Java7Parser.STRICTFP, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_modifier);
		try {
			setState(366);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(358);
				match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(359);
				match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(360);
				match(FINAL);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 8);
				{
				setState(361);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 9);
				{
				setState(362);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(363);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 11);
				{
				setState(364);
				match(VOLATILE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 12);
				{
				setState(365);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifiersContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode FINAL() { return getToken(Java7Parser.FINAL, 0); }
		public VariableModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterVariableModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitVariableModifiers(this);
		}
	}

	public final VariableModifiersContext variableModifiers() throws RecognitionException {
		VariableModifiersContext _localctx = new VariableModifiersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableModifiers);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(368);
					annotation();
					}
					} 
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(375);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(374);
				match(FINAL);
				}
			}

			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(377);
					annotation();
					}
					} 
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classDeclaration);
		try {
			setState(385);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(Java7Parser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(Java7Parser.EXTENDS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(Java7Parser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitNormalClassDeclaration(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			modifiers();
			setState(388);
			match(CLASS);
			setState(389);
			match(Identifier);
			setState(391);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(390);
				typeParameters();
				}
			}

			setState(395);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(393);
				match(EXTENDS);
				setState(394);
				type();
				}
			}

			setState(399);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(397);
				match(IMPLEMENTS);
				setState(398);
				typeList();
				}
			}

			setState(401);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Java7Parser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(Java7Parser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(LT);
			setState(404);
			typeParameter();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(405);
				match(COMMA);
				setState(406);
				typeParameter();
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode EXTENDS() { return getToken(Java7Parser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(Identifier);
			setState(423);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(415);
				match(EXTENDS);
				setState(416);
				typeBound();
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AMP) {
					{
					{
					setState(417);
					additionalBound();
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> AMP() { return getTokens(Java7Parser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(Java7Parser.AMP, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeBound);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			type();
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(426);
					match(AMP);
					setState(427);
					type();
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public TerminalNode AMP() { return getToken(Java7Parser.AMP, 0); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitAdditionalBound(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(AMP);
			setState(434);
			classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode ENUM() { return getToken(Java7Parser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(Java7Parser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			modifiers();
			setState(437);
			match(ENUM);
			setState(438);
			match(Identifier);
			setState(441);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(439);
				match(IMPLEMENTS);
				setState(440);
				typeList();
				}
			}

			setState(443);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Java7Parser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitEnumBody(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(LBRACE);
			setState(447);
			_la = _input.LA(1);
			if (_la==AT || _la==Identifier) {
				{
				setState(446);
				enumConstants();
				}
			}

			setState(450);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(449);
				match(COMMA);
				}
			}

			setState(453);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(452);
				enumBodyDeclarations();
				}
			}

			setState(455);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			enumConstant();
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(458);
					match(COMMA);
					setState(459);
					enumConstant();
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(465);
				annotations();
				}
			}

			setState(468);
			match(Identifier);
			setState(470);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(469);
				arguments();
				}
			}

			setState(473);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(472);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(SEMI);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << VOID) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (LT - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(476);
				classBodyDeclaration();
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_interfaceDeclaration);
		try {
			setState(484);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				annotationTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode INTERFACE() { return getToken(Java7Parser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(Java7Parser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitNormalInterfaceDeclaration(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			modifiers();
			setState(487);
			match(INTERFACE);
			setState(488);
			match(Identifier);
			setState(490);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(489);
				typeParameters();
				}
			}

			setState(494);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(492);
				match(EXTENDS);
				setState(493);
				typeList();
				}
			}

			setState(496);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			type();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(499);
				match(COMMA);
				setState(500);
				type();
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(LBRACE);
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << VOID) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (LT - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(507);
				classBodyDeclaration();
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(LBRACE);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << VOID) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT) | (1L << DEFAULT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (LT - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(516);
				interfaceBodyDeclaration();
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(522);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(Java7Parser.STATIC, 0); }
		public MemberDeclContext memberDecl() {
			return getRuleContext(MemberDeclContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(530);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(525);
					match(STATIC);
					}
				}

				setState(528);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				memberDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclContext extends ParserRuleContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitMemberDecl(this);
		}
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_memberDecl);
		try {
			setState(537);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				constructorDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				methodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(536);
				interfaceDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java7Parser.VOID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode THROWS() { return getToken(Java7Parser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			modifiers();
			setState(541);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(540);
				typeParameters();
				}
			}

			setState(545);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case AT:
			case Identifier:
				{
				setState(543);
				type();
				}
				break;
			case VOID:
				{
				setState(544);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(547);
			match(Identifier);
			setState(548);
			formalParameters();
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(549);
				match(LBRACKET);
				setState(550);
				match(RBRACKET);
				}
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(558);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(556);
				match(THROWS);
				setState(557);
				qualifiedNameList();
				}
			}

			setState(562);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(560);
				block();
				}
				break;
			case SEMI:
				{
				setState(561);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBlockContext constructorBlock() {
			return getRuleContext(ConstructorBlockContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(Java7Parser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			modifiers();
			setState(566);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(565);
				typeParameters();
				}
			}

			setState(568);
			match(Identifier);
			setState(569);
			formalParameters();
			setState(572);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(570);
				match(THROWS);
				setState(571);
				qualifiedNameList();
				}
			}

			setState(574);
			constructorBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public ConstructorBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterConstructorBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitConstructorBlock(this);
		}
	}

	public final ConstructorBlockContext constructorBlock() throws RecognitionException {
		ConstructorBlockContext _localctx = new ConstructorBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constructorBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(LBRACE);
			setState(578);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(577);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << INTERFACE) | (1L << THROW) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TRY) | (1L << SWITCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (ASSERT - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (TILDE - 64)) | (1L << (BANG - 64)) | (1L << (NEW - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(580);
				blockStatement();
				}
				}
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(586);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			modifiers();
			setState(589);
			type();
			setState(590);
			variableDeclarator();
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(591);
				match(COMMA);
				setState(592);
				variableDeclarator();
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(598);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(Identifier);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(601);
				match(LBRACKET);
				setState(602);
				match(RBRACKET);
				}
				}
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(610);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(608);
				match(EQ);
				setState(609);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceFieldDeclarationContext interfaceFieldDeclaration() {
			return getRuleContext(InterfaceFieldDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public DefaultInterfaceMethodDeclarationContext defaultInterfaceMethodDeclaration() {
			return getRuleContext(DefaultInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceBodyDeclaration);
		try {
			setState(618);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				interfaceFieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
				defaultInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(615);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(616);
				classDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(617);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java7Parser.VOID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode THROWS() { return getToken(Java7Parser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			modifiers();
			setState(622);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(621);
				typeParameters();
				}
			}

			setState(626);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case AT:
			case Identifier:
				{
				setState(624);
				type();
				}
				break;
			case VOID:
				{
				setState(625);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(628);
			match(Identifier);
			setState(629);
			formalParameters();
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(630);
				match(LBRACKET);
				setState(631);
				match(RBRACKET);
				}
				}
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(639);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(637);
				match(THROWS);
				setState(638);
				qualifiedNameList();
				}
			}

			setState(643);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(641);
				block();
				}
				break;
			case SEMI:
				{
				setState(642);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java7Parser.VOID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode THROWS() { return getToken(Java7Parser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(Java7Parser.DEFAULT, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public DefaultInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterDefaultInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitDefaultInterfaceMethodDeclaration(this);
		}
	}

	public final DefaultInterfaceMethodDeclarationContext defaultInterfaceMethodDeclaration() throws RecognitionException {
		DefaultInterfaceMethodDeclarationContext _localctx = new DefaultInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_defaultInterfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				{
				setState(645);
				match(DEFAULT);
				setState(646);
				modifiers();
				}
				}
				break;
			case 2:
				{
				{
				setState(647);
				modifiers();
				setState(648);
				match(DEFAULT);
				}
				}
				break;
			}
			setState(653);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(652);
				typeParameters();
				}
			}

			setState(657);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case AT:
			case Identifier:
				{
				setState(655);
				type();
				}
				break;
			case VOID:
				{
				setState(656);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(659);
			match(Identifier);
			setState(660);
			formalParameters();
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(661);
				match(LBRACKET);
				setState(662);
				match(RBRACKET);
				}
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(670);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(668);
				match(THROWS);
				setState(669);
				qualifiedNameList();
				}
			}

			setState(674);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(672);
				block();
				}
				break;
			case SEMI:
				{
				setState(673);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceFieldDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public InterfaceFieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceFieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterInterfaceFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitInterfaceFieldDeclaration(this);
		}
	}

	public final InterfaceFieldDeclarationContext interfaceFieldDeclaration() throws RecognitionException {
		InterfaceFieldDeclarationContext _localctx = new InterfaceFieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_interfaceFieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			modifiers();
			setState(677);
			type();
			setState(678);
			variableDeclarator();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(679);
				match(COMMA);
				setState(680);
				variableDeclarator();
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(686);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type);
		int _la;
		try {
			setState(704);
			switch (_input.LA(1)) {
			case AT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				classOrInterfaceType();
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(689);
					match(LBRACKET);
					setState(690);
					match(RBRACKET);
					}
					}
					setState(695);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case CHAR:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				primitiveType();
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(697);
					match(LBRACKET);
					setState(698);
					match(RBRACKET);
					}
					}
					setState(703);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<IdentifierTypeArgumentContext> identifierTypeArgument() {
			return getRuleContexts(IdentifierTypeArgumentContext.class);
		}
		public IdentifierTypeArgumentContext identifierTypeArgument(int i) {
			return getRuleContext(IdentifierTypeArgumentContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			identifierTypeArgument();
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(707);
				match(DOT);
				setState(708);
				identifierTypeArgument();
				}
				}
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierTypeArgumentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public IdentifierTypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierTypeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterIdentifierTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitIdentifierTypeArgument(this);
		}
	}

	public final IdentifierTypeArgumentContext identifierTypeArgument() throws RecognitionException {
		IdentifierTypeArgumentContext _localctx = new IdentifierTypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_identifierTypeArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(714);
				annotation();
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(720);
			match(Identifier);
			setState(722);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(721);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(Java7Parser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(Java7Parser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(Java7Parser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(Java7Parser.SHORT, 0); }
		public TerminalNode INT() { return getToken(Java7Parser.INT, 0); }
		public TerminalNode LONG() { return getToken(Java7Parser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(Java7Parser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(Java7Parser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Java7Parser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(Java7Parser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeArguments);
		int _la;
		try {
			setState(739);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				match(LT);
				setState(727);
				typeArgument();
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(728);
					match(COMMA);
					setState(729);
					typeArgument();
					}
					}
					setState(734);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(735);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				match(LT);
				setState(738);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode QUES() { return getToken(Java7Parser.QUES, 0); }
		public TerminalNode EXTENDS() { return getToken(Java7Parser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeArgument);
		int _la;
		try {
			setState(747);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case AT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				type();
				}
				break;
			case QUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				match(QUES);
				setState(745);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(743);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(744);
					type();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			qualifiedName();
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(750);
				match(COMMA);
				setState(751);
				qualifiedName();
				}
				}
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(LPAREN);
			setState(759);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT))) != 0) || _la==Identifier) {
				{
				setState(758);
				formalParameterDecls();
				}
			}

			setState(761);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterDeclsContext extends ParserRuleContext {
		public int parameterType;
		public EllipsisParameterDeclContext ellipsisParameterDecl() {
			return getRuleContext(EllipsisParameterDeclContext.class,0);
		}
		public List<NormalParameterDeclContext> normalParameterDecl() {
			return getRuleContexts(NormalParameterDeclContext.class);
		}
		public NormalParameterDeclContext normalParameterDecl(int i) {
			return getRuleContext(NormalParameterDeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public FormalParameterDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterFormalParameterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitFormalParameterDecls(this);
		}
	}

	public final FormalParameterDeclsContext formalParameterDecls() throws RecognitionException {
		FormalParameterDeclsContext _localctx = new FormalParameterDeclsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_formalParameterDecls);
		int _la;
		try {
			int _alt;
			setState(786);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				ellipsisParameterDecl();
				((FormalParameterDeclsContext)_localctx).parameterType =  1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				normalParameterDecl();
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(767);
					match(COMMA);
					setState(768);
					normalParameterDecl();
					}
					}
					setState(773);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((FormalParameterDeclsContext)_localctx).parameterType =  2;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(779); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(776);
						normalParameterDecl();
						setState(777);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(781); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(783);
				ellipsisParameterDecl();
				((FormalParameterDeclsContext)_localctx).parameterType =  3;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalParameterDeclContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public NormalParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalParameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterNormalParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitNormalParameterDecl(this);
		}
	}

	public final NormalParameterDeclContext normalParameterDecl() throws RecognitionException {
		NormalParameterDeclContext _localctx = new NormalParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_normalParameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			variableModifiers();
			setState(789);
			type();
			setState(790);
			match(Identifier);
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(791);
				match(LBRACKET);
				setState(792);
				match(RBRACKET);
				}
				}
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EllipsisParameterDeclContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(Java7Parser.ELLIPSIS, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public EllipsisParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ellipsisParameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterEllipsisParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitEllipsisParameterDecl(this);
		}
	}

	public final EllipsisParameterDeclContext ellipsisParameterDecl() throws RecognitionException {
		EllipsisParameterDeclContext _localctx = new EllipsisParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ellipsisParameterDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			variableModifiers();
			setState(799);
			type();
			setState(800);
			match(ELLIPSIS);
			setState(801);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TerminalNode THIS() { return getToken(Java7Parser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitExplicitConstructorInvocation(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(819);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(803);
					nonWildcardTypeArguments();
					}
				}

				setState(806);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==SUPER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(807);
				arguments();
				setState(808);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				primary();
				setState(811);
				match(DOT);
				setState(813);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(812);
					nonWildcardTypeArguments();
					}
				}

				setState(815);
				match(SUPER);
				setState(816);
				arguments();
				setState(817);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(Identifier);
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(822);
				match(DOT);
				setState(823);
				match(Identifier);
				}
				}
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitAnnotations(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(829);
				annotation();
				}
				}
				setState(832); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_annotation);
		try {
			setState(837);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				markerAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				singleElementAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(836);
				normalAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Java7Parser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterMarkerAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitMarkerAnnotation(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(AT);
			setState(840);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Java7Parser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterSingleElementAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitSingleElementAnnotation(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(AT);
			setState(843);
			qualifiedName();
			setState(844);
			match(LPAREN);
			setState(845);
			elementValue();
			setState(846);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Java7Parser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterNormalAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitNormalAnnotation(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(AT);
			setState(849);
			qualifiedName();
			setState(850);
			match(LPAREN);
			setState(852);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(851);
				elementValuePairs();
				}
			}

			setState(854);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			elementValuePair();
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(857);
				match(COMMA);
				setState(858);
				elementValuePair();
				}
				}
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(Identifier);
			setState(865);
			match(EQ);
			setState(866);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementValue);
		try {
			setState(871);
			switch (_input.LA(1)) {
			case LPAREN:
			case VOID:
			case BOOLEAN:
			case CHAR:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case THIS:
			case SUPER:
			case NULL:
			case TRUE:
			case FALSE:
			case PLUSPLUS:
			case SUBSUB:
			case TILDE:
			case BANG:
			case NEW:
			case PLUS:
			case SUB:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				conditionalExpression();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(870);
				elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			match(LBRACE);
			setState(882);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PLUSPLUS - 67)) | (1L << (SUBSUB - 67)) | (1L << (TILDE - 67)) | (1L << (BANG - 67)) | (1L << (NEW - 67)) | (1L << (PLUS - 67)) | (1L << (SUB - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(874);
				elementValue();
				setState(879);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(875);
						match(COMMA);
						setState(876);
						elementValue();
						}
						} 
					}
					setState(881);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				}
			}

			setState(885);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(884);
				match(COMMA);
				}
			}

			setState(887);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode AT() { return getToken(Java7Parser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(Java7Parser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			modifiers();
			setState(890);
			match(AT);
			setState(891);
			match(INTERFACE);
			setState(892);
			match(Identifier);
			setState(893);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(LBRACE);
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT))) != 0) || _la==ENUM || _la==Identifier) {
				{
				{
				setState(896);
				annotationTypeElementDeclaration();
				}
				}
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(902);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationMethodDeclarationContext annotationMethodDeclaration() {
			return getRuleContext(AnnotationMethodDeclarationContext.class,0);
		}
		public InterfaceFieldDeclarationContext interfaceFieldDeclaration() {
			return getRuleContext(InterfaceFieldDeclarationContext.class,0);
		}
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationTypeElementDeclaration);
		try {
			setState(911);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(904);
				annotationMethodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				interfaceFieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(906);
				normalClassDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(907);
				normalInterfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(908);
				enumDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(909);
				annotationTypeDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(910);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TerminalNode DEFAULT() { return getToken(Java7Parser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterAnnotationMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitAnnotationMethodDeclaration(this);
		}
	}

	public final AnnotationMethodDeclarationContext annotationMethodDeclaration() throws RecognitionException {
		AnnotationMethodDeclarationContext _localctx = new AnnotationMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			modifiers();
			setState(914);
			type();
			setState(915);
			match(Identifier);
			setState(916);
			match(LPAREN);
			setState(917);
			match(RPAREN);
			setState(920);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(918);
				match(DEFAULT);
				setState(919);
				elementValue();
				}
			}

			setState(922);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(LBRACE);
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << INTERFACE) | (1L << THROW) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TRY) | (1L << SWITCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (ASSERT - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (TILDE - 64)) | (1L << (BANG - 64)) | (1L << (NEW - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(925);
				blockStatement();
				}
				}
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(931);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_blockStatement);
		try {
			setState(936);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(933);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(934);
				classOrInterfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(935);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			localVariableDeclaration();
			setState(939);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			variableModifiers();
			setState(942);
			type();
			setState(943);
			variableDeclarator();
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(944);
				match(COMMA);
				setState(945);
				variableDeclarator();
				}
				}
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(Java7Parser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(Java7Parser.COLON, 0); }
		public TerminalNode IF() { return getToken(Java7Parser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Java7Parser.ELSE, 0); }
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(Java7Parser.WHILE, 0); }
		public TerminalNode DO() { return getToken(Java7Parser.DO, 0); }
		public TrystatementContext trystatement() {
			return getRuleContext(TrystatementContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(Java7Parser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public SwitchBlockStatementGroupsContext switchBlockStatementGroups() {
			return getRuleContext(SwitchBlockStatementGroupsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(Java7Parser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(Java7Parser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(Java7Parser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(Java7Parser.BREAK, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode CONTINUE() { return getToken(Java7Parser.CONTINUE, 0); }
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_statement);
		int _la;
		try {
			setState(1015);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				match(ASSERT);
				setState(953);
				expression();
				setState(956);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(954);
					match(COLON);
					setState(955);
					expression();
					}
				}

				setState(958);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(960);
				match(IF);
				setState(961);
				parExpression();
				setState(962);
				statement();
				setState(965);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(963);
					match(ELSE);
					setState(964);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(967);
				forstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(968);
				match(WHILE);
				setState(969);
				parExpression();
				setState(970);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(972);
				match(DO);
				setState(973);
				statement();
				setState(974);
				match(WHILE);
				setState(975);
				parExpression();
				setState(976);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(978);
				trystatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(979);
				match(SWITCH);
				setState(980);
				parExpression();
				setState(981);
				match(LBRACE);
				setState(982);
				switchBlockStatementGroups();
				setState(983);
				match(RBRACE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(985);
				match(SYNCHRONIZED);
				setState(986);
				parExpression();
				setState(987);
				block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(989);
				match(RETURN);
				setState(991);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PLUSPLUS - 67)) | (1L << (SUBSUB - 67)) | (1L << (TILDE - 67)) | (1L << (BANG - 67)) | (1L << (NEW - 67)) | (1L << (PLUS - 67)) | (1L << (SUB - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(990);
					expression();
					}
				}

				setState(993);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(994);
				match(THROW);
				setState(995);
				expression();
				setState(996);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(998);
				match(BREAK);
				setState(1000);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(999);
					match(Identifier);
					}
				}

				setState(1002);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1003);
				match(CONTINUE);
				setState(1005);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1004);
					match(Identifier);
					}
				}

				setState(1007);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1008);
				expression();
				setState(1009);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1011);
				match(Identifier);
				setState(1012);
				match(COLON);
				setState(1013);
				statement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1014);
				emptyStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupsContext extends ParserRuleContext {
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public SwitchBlockStatementGroupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroups; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterSwitchBlockStatementGroups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitSwitchBlockStatementGroups(this);
		}
	}

	public final SwitchBlockStatementGroupsContext switchBlockStatementGroups() throws RecognitionException {
		SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_switchBlockStatementGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(1019);
				switchBlockStatementGroup();
				}
				}
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelContext switchLabel() {
			return getRuleContext(SwitchLabelContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			switchLabel();
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << INTERFACE) | (1L << THROW) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TRY) | (1L << SWITCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (ASSERT - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (TILDE - 64)) | (1L << (BANG - 64)) | (1L << (NEW - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(1026);
				blockStatement();
				}
				}
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(Java7Parser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Java7Parser.COLON, 0); }
		public TerminalNode DEFAULT() { return getToken(Java7Parser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_switchLabel);
		try {
			setState(1038);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1032);
				match(CASE);
				setState(1033);
				expression();
				setState(1034);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036);
				match(DEFAULT);
				setState(1037);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrystatementContext extends ParserRuleContext {
		public int statementType;
		public TerminalNode TRY() { return getToken(Java7Parser.TRY, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public TerminalNode FINALLY() { return getToken(Java7Parser.FINALLY, 0); }
		public TryWithResourcesContext tryWithResources() {
			return getRuleContext(TryWithResourcesContext.class,0);
		}
		public TrystatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trystatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterTrystatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitTrystatement(this);
		}
	}

	public final TrystatementContext trystatement() throws RecognitionException {
		TrystatementContext _localctx = new TrystatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_trystatement);
		try {
			setState(1065);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1040);
				match(TRY);
				setState(1041);
				block();
				((TrystatementContext)_localctx).statementType =  1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				match(TRY);
				setState(1045);
				block();
				setState(1046);
				catches();
				setState(1047);
				match(FINALLY);
				setState(1048);
				block();
				((TrystatementContext)_localctx).statementType =  2;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1051);
				match(TRY);
				setState(1052);
				block();
				setState(1053);
				catches();
				((TrystatementContext)_localctx).statementType =  3;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1056);
				match(TRY);
				setState(1057);
				block();
				setState(1058);
				match(FINALLY);
				setState(1059);
				block();
				((TrystatementContext)_localctx).statementType =  4;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1062);
				tryWithResources();
				((TrystatementContext)_localctx).statementType =  5;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithResourcesContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(Java7Parser.TRY, 0); }
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public TerminalNode FINALLY() { return getToken(Java7Parser.FINALLY, 0); }
		public TryWithResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterTryWithResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitTryWithResources(this);
		}
	}

	public final TryWithResourcesContext tryWithResources() throws RecognitionException {
		TryWithResourcesContext _localctx = new TryWithResourcesContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_tryWithResources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			match(TRY);
			setState(1068);
			resourceSpecification();
			setState(1069);
			block();
			setState(1071);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1070);
				catches();
				}
			}

			setState(1075);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1073);
				match(FINALLY);
				setState(1074);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			match(LPAREN);
			setState(1078);
			resources();
			setState(1080);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1079);
				match(SEMI);
				}
			}

			setState(1082);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			resource();
			setState(1089);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1085);
					match(SEMI);
					setState(1086);
					resource();
					}
					} 
				}
				setState(1091);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1092);
				variableModifiers();
				}
				break;
			}
			setState(1095);
			type();
			setState(1096);
			match(Identifier);
			setState(1097);
			match(EQ);
			setState(1098);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitCatches(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			catchClause();
			setState(1104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1101);
				catchClause();
				}
				}
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(Java7Parser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(CATCH);
			setState(1108);
			match(LPAREN);
			setState(1109);
			catchFormalParameter();
			setState(1110);
			match(RPAREN);
			setState(1111);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public List<TerminalNode> BAR() { return getTokens(Java7Parser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(Java7Parser.BAR, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitCatchFormalParameter(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			variableModifiers();
			setState(1114);
			type();
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(1115);
				match(BAR);
				setState(1116);
				type();
				}
				}
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1122);
			match(Identifier);
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1123);
				match(LBRACKET);
				setState(1124);
				match(RBRACKET);
				}
				}
				setState(1129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForstatementContext extends ParserRuleContext {
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public NormalForStatementContext normalForStatement() {
			return getRuleContext(NormalForStatementContext.class,0);
		}
		public ForstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterForstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitForstatement(this);
		}
	}

	public final ForstatementContext forstatement() throws RecognitionException {
		ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_forstatement);
		try {
			setState(1132);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				foreachStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131);
				normalForStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Java7Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(Java7Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitForeachStatement(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			match(FOR);
			setState(1135);
			match(LPAREN);
			setState(1136);
			variableModifiers();
			setState(1137);
			type();
			setState(1138);
			match(Identifier);
			setState(1139);
			match(COLON);
			setState(1140);
			expression();
			setState(1141);
			match(RPAREN);
			setState(1142);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Java7Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(Java7Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Java7Parser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public NormalForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterNormalForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitNormalForStatement(this);
		}
	}

	public final NormalForStatementContext normalForStatement() throws RecognitionException {
		NormalForStatementContext _localctx = new NormalForStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_normalForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(FOR);
			setState(1145);
			match(LPAREN);
			setState(1147);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PLUSPLUS - 67)) | (1L << (SUBSUB - 67)) | (1L << (TILDE - 67)) | (1L << (BANG - 67)) | (1L << (NEW - 67)) | (1L << (PLUS - 67)) | (1L << (SUB - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(1146);
				forInit();
				}
			}

			setState(1149);
			match(SEMI);
			setState(1151);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PLUSPLUS - 67)) | (1L << (SUBSUB - 67)) | (1L << (TILDE - 67)) | (1L << (BANG - 67)) | (1L << (NEW - 67)) | (1L << (PLUS - 67)) | (1L << (SUB - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(1150);
				expression();
				}
			}

			setState(1153);
			match(SEMI);
			setState(1155);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PLUSPLUS - 67)) | (1L << (SUBSUB - 67)) | (1L << (TILDE - 67)) | (1L << (BANG - 67)) | (1L << (NEW - 67)) | (1L << (PLUS - 67)) | (1L << (SUB - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(1154);
				expressionList();
				}
			}

			setState(1157);
			match(RPAREN);
			setState(1158);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_forInit);
		try {
			setState(1162);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1160);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1161);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			match(LPAREN);
			setState(1165);
			expression();
			setState(1166);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			expression();
			setState(1173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1169);
				match(COMMA);
				setState(1170);
				expression();
				}
				}
				setState(1175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			methodReference();
			setState(1180);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1177);
				assignmentOperator();
				setState(1178);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public int assignmentType;
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(Java7Parser.PLUSEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(Java7Parser.SUBEQ, 0); }
		public TerminalNode STAREQ() { return getToken(Java7Parser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(Java7Parser.SLASHEQ, 0); }
		public TerminalNode AMPEQ() { return getToken(Java7Parser.AMPEQ, 0); }
		public TerminalNode BAREQ() { return getToken(Java7Parser.BAREQ, 0); }
		public TerminalNode CARETEQ() { return getToken(Java7Parser.CARETEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(Java7Parser.PERCENTEQ, 0); }
		public List<TerminalNode> LT() { return getTokens(Java7Parser.LT); }
		public TerminalNode LT(int i) {
			return getToken(Java7Parser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(Java7Parser.GT); }
		public TerminalNode GT(int i) {
			return getToken(Java7Parser.GT, i);
		}
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_assignmentOperator);
		try {
			setState(1213);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1182);
				match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1184);
				match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  2;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1186);
				match(SUBEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  3;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1188);
				match(STAREQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  4;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1190);
				match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  5;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1192);
				match(AMPEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  6;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1194);
				match(BAREQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  7;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1196);
				match(CARETEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  8;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1198);
				match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  9;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1200);
				match(LT);
				setState(1201);
				match(LT);
				setState(1202);
				match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  10;
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1204);
				match(GT);
				setState(1205);
				match(GT);
				setState(1206);
				match(GT);
				setState(1207);
				match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  11;
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1209);
				match(GT);
				setState(1210);
				match(GT);
				setState(1211);
				match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  12;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUES() { return getToken(Java7Parser.QUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(Java7Parser.COLON, 0); }
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			conditionalOrExpression();
			setState(1221);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1216);
				match(QUES);
				setState(1217);
				expression();
				setState(1218);
				match(COLON);
				setState(1219);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public List<TerminalNode> BARBAR() { return getTokens(Java7Parser.BARBAR); }
		public TerminalNode BARBAR(int i) {
			return getToken(Java7Parser.BARBAR, i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_conditionalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			conditionalAndExpression();
			setState(1228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1224);
					match(BARBAR);
					setState(1225);
					conditionalAndExpression();
					}
					} 
				}
				setState(1230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AMPAMP() { return getTokens(Java7Parser.AMPAMP); }
		public TerminalNode AMPAMP(int i) {
			return getToken(Java7Parser.AMPAMP, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_conditionalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			inclusiveOrExpression();
			setState(1236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1232);
					match(AMPAMP);
					setState(1233);
					inclusiveOrExpression();
					}
					} 
				}
				setState(1238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> BAR() { return getTokens(Java7Parser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(Java7Parser.BAR, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_inclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			exclusiveOrExpression();
			setState(1244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1240);
					match(BAR);
					setState(1241);
					exclusiveOrExpression();
					}
					} 
				}
				setState(1246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(Java7Parser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(Java7Parser.CARET, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_exclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			andExpression();
			setState(1252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1248);
					match(CARET);
					setState(1249);
					andExpression();
					}
					} 
				}
				setState(1254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AMP() { return getTokens(Java7Parser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(Java7Parser.AMP, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			equalityExpression();
			setState(1260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1256);
					match(AMP);
					setState(1257);
					equalityExpression();
					}
					} 
				}
				setState(1262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<NotEqualityExpressionContext> notEqualityExpression() {
			return getRuleContexts(NotEqualityExpressionContext.class);
		}
		public NotEqualityExpressionContext notEqualityExpression(int i) {
			return getRuleContext(NotEqualityExpressionContext.class,i);
		}
		public List<TerminalNode> EQEQ() { return getTokens(Java7Parser.EQEQ); }
		public TerminalNode EQEQ(int i) {
			return getToken(Java7Parser.EQEQ, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_equalityExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			notEqualityExpression();
			setState(1268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1264);
					match(EQEQ);
					setState(1265);
					notEqualityExpression();
					}
					} 
				}
				setState(1270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotEqualityExpressionContext extends ParserRuleContext {
		public List<InstanceOfExpressionContext> instanceOfExpression() {
			return getRuleContexts(InstanceOfExpressionContext.class);
		}
		public InstanceOfExpressionContext instanceOfExpression(int i) {
			return getRuleContext(InstanceOfExpressionContext.class,i);
		}
		public List<TerminalNode> BANGEQ() { return getTokens(Java7Parser.BANGEQ); }
		public TerminalNode BANGEQ(int i) {
			return getToken(Java7Parser.BANGEQ, i);
		}
		public NotEqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEqualityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterNotEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitNotEqualityExpression(this);
		}
	}

	public final NotEqualityExpressionContext notEqualityExpression() throws RecognitionException {
		NotEqualityExpressionContext _localctx = new NotEqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_notEqualityExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			instanceOfExpression();
			setState(1276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1272);
					match(BANGEQ);
					setState(1273);
					instanceOfExpression();
					}
					} 
				}
				setState(1278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceOfExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(Java7Parser.INSTANCEOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InstanceOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceOfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitInstanceOfExpression(this);
		}
	}

	public final InstanceOfExpressionContext instanceOfExpression() throws RecognitionException {
		InstanceOfExpressionContext _localctx = new InstanceOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_instanceOfExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			relationalExpression();
			setState(1282);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1280);
				match(INSTANCEOF);
				setState(1281);
				type();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<RelationalOpContext> relationalOp() {
			return getRuleContexts(RelationalOpContext.class);
		}
		public RelationalOpContext relationalOp(int i) {
			return getRuleContext(RelationalOpContext.class,i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			shiftExpression();
			setState(1290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1285);
					relationalOp();
					setState(1286);
					shiftExpression();
					}
					} 
				}
				setState(1292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalOpContext extends ParserRuleContext {
		public int operatorType;
		public TerminalNode LT() { return getToken(Java7Parser.LT, 0); }
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
		public TerminalNode GT() { return getToken(Java7Parser.GT, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitRelationalOp(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_relationalOp);
		try {
			setState(1303);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1293);
				match(LT);
				setState(1294);
				match(EQ);
				((RelationalOpContext)_localctx).operatorType =  1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1296);
				match(GT);
				setState(1297);
				match(EQ);
				((RelationalOpContext)_localctx).operatorType =  2;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1299);
				match(LT);
				((RelationalOpContext)_localctx).operatorType =  3;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1301);
				match(GT);
				((RelationalOpContext)_localctx).operatorType =  4;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<ShiftOpContext> shiftOp() {
			return getRuleContexts(ShiftOpContext.class);
		}
		public ShiftOpContext shiftOp(int i) {
			return getRuleContext(ShiftOpContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			additiveExpression();
			setState(1311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1306);
					shiftOp();
					setState(1307);
					additiveExpression();
					}
					} 
				}
				setState(1313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftOpContext extends ParserRuleContext {
		public int operatorType;
		public List<TerminalNode> LT() { return getTokens(Java7Parser.LT); }
		public TerminalNode LT(int i) {
			return getToken(Java7Parser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(Java7Parser.GT); }
		public TerminalNode GT(int i) {
			return getToken(Java7Parser.GT, i);
		}
		public ShiftOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterShiftOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitShiftOp(this);
		}
	}

	public final ShiftOpContext shiftOp() throws RecognitionException {
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_shiftOp);
		try {
			setState(1324);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1314);
				match(LT);
				setState(1315);
				match(LT);
				((ShiftOpContext)_localctx).operatorType =  1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1317);
				match(GT);
				setState(1318);
				match(GT);
				setState(1319);
				match(GT);
				((ShiftOpContext)_localctx).operatorType =  2;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1321);
				match(GT);
				setState(1322);
				match(GT);
				((ShiftOpContext)_localctx).operatorType =  3;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<AdditiveOpContext> additiveOp() {
			return getRuleContexts(AdditiveOpContext.class);
		}
		public AdditiveOpContext additiveOp(int i) {
			return getRuleContext(AdditiveOpContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			multiplicativeExpression();
			setState(1332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1327);
					additiveOp();
					setState(1328);
					multiplicativeExpression();
					}
					} 
				}
				setState(1334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveOpContext extends ParserRuleContext {
		public int operatorType;
		public TerminalNode PLUS() { return getToken(Java7Parser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(Java7Parser.SUB, 0); }
		public AdditiveOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterAdditiveOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitAdditiveOp(this);
		}
	}

	public final AdditiveOpContext additiveOp() throws RecognitionException {
		AdditiveOpContext _localctx = new AdditiveOpContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_additiveOp);
		try {
			setState(1339);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1335);
				match(PLUS);
				((AdditiveOpContext)_localctx).operatorType =  1;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1337);
				match(SUB);
				((AdditiveOpContext)_localctx).operatorType =  2;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<MultiplicativeOpContext> multiplicativeOp() {
			return getRuleContexts(MultiplicativeOpContext.class);
		}
		public MultiplicativeOpContext multiplicativeOp(int i) {
			return getRuleContext(MultiplicativeOpContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			unaryExpression();
			setState(1347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1342);
					multiplicativeOp();
					setState(1343);
					unaryExpression();
					}
					} 
				}
				setState(1349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeOpContext extends ParserRuleContext {
		public int operatorType;
		public TerminalNode STAR() { return getToken(Java7Parser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(Java7Parser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(Java7Parser.PERCENT, 0); }
		public MultiplicativeOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterMultiplicativeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitMultiplicativeOp(this);
		}
	}

	public final MultiplicativeOpContext multiplicativeOp() throws RecognitionException {
		MultiplicativeOpContext _localctx = new MultiplicativeOpContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_multiplicativeOp);
		try {
			setState(1356);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1350);
				match(STAR);
				((MultiplicativeOpContext)_localctx).operatorType =  1;
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1352);
				match(SLASH);
				((MultiplicativeOpContext)_localctx).operatorType =  2;
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1354);
				match(PERCENT);
				((MultiplicativeOpContext)_localctx).operatorType =  3;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(Java7Parser.PLUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(Java7Parser.SUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(Java7Parser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(Java7Parser.SUBSUB, 0); }
		public TerminalNode TILDE() { return getToken(Java7Parser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(Java7Parser.BANG, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_unaryExpression);
		try {
			setState(1371);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1358);
				match(PLUS);
				setState(1359);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1360);
				match(SUB);
				setState(1361);
				unaryExpression();
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1362);
				match(PLUSPLUS);
				setState(1363);
				unaryExpression();
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(1364);
				match(SUBSUB);
				setState(1365);
				unaryExpression();
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1366);
				match(TILDE);
				setState(1367);
				unaryExpression();
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 6);
				{
				setState(1368);
				match(BANG);
				setState(1369);
				unaryExpression();
				}
				break;
			case LPAREN:
			case VOID:
			case BOOLEAN:
			case CHAR:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case THIS:
			case SUPER:
			case NULL:
			case TRUE:
			case FALSE:
			case NEW:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 7);
				{
				setState(1370);
				unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public TerminalNode PLUSPLUS() { return getToken(Java7Parser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(Java7Parser.SUBSUB, 0); }
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			setState(1384);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1373);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1374);
				primary();
				setState(1378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT || _la==LBRACKET) {
					{
					{
					setState(1375);
					selector();
					}
					}
					setState(1380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1382);
				_la = _input.LA(1);
				if (_la==PLUSPLUS || _la==SUBSUB) {
					{
					setState(1381);
					_la = _input.LA(1);
					if ( !(_la==PLUSPLUS || _la==SUBSUB) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_castExpression);
		int _la;
		try {
			setState(1424);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1386);
				match(LPAREN);
				setState(1387);
				primitiveType();
				setState(1388);
				match(RPAREN);
				setState(1389);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1391);
				match(LPAREN);
				setState(1392);
				type();
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AMP) {
					{
					{
					setState(1393);
					additionalBound();
					}
					}
					setState(1398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1399);
				match(RPAREN);
				setState(1400);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1402);
				match(LPAREN);
				setState(1403);
				type();
				setState(1407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AMP) {
					{
					{
					setState(1404);
					additionalBound();
					}
					}
					setState(1409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1410);
				match(RPAREN);
				setState(1411);
				lambdaExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1413);
				match(LPAREN);
				setState(1414);
				type();
				setState(1418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AMP) {
					{
					{
					setState(1415);
					additionalBound();
					}
					}
					setState(1420);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1421);
				match(RPAREN);
				setState(1422);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public int operationType;
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode THIS() { return getToken(Java7Parser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public ThisSuffixContext thisSuffix() {
			return getRuleContext(ThisSuffixContext.class,0);
		}
		public IdentifierSuffixContext identifierSuffix() {
			return getRuleContext(IdentifierSuffixContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(Java7Parser.CLASS, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode VOID() { return getToken(Java7Parser.VOID, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_primary);
		int _la;
		try {
			int _alt;
			setState(1479);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1426);
				parExpression();
				((PrimaryContext)_localctx).operationType =  1;
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1429);
				match(THIS);
				setState(1434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1430);
						match(DOT);
						setState(1431);
						match(Identifier);
						}
						} 
					}
					setState(1436);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				}
				setState(1438);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1437);
					thisSuffix();
					}
					break;
				}
				((PrimaryContext)_localctx).operationType =  2;
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(1441);
				match(Identifier);
				setState(1446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1442);
						match(DOT);
						setState(1443);
						match(Identifier);
						}
						} 
					}
					setState(1448);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
				}
				setState(1450);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1449);
					identifierSuffix();
					}
					break;
				}
				((PrimaryContext)_localctx).operationType =  3;
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1453);
				match(SUPER);
				setState(1454);
				superSuffix();
				((PrimaryContext)_localctx).operationType =  4;
				}
				break;
			case NULL:
			case TRUE:
			case FALSE:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1457);
				literal();
				((PrimaryContext)_localctx).operationType =  5;
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 6);
				{
				setState(1460);
				creator();
				((PrimaryContext)_localctx).operationType =  6;
				}
				break;
			case BOOLEAN:
			case CHAR:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1463);
				primitiveType();
				setState(1468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(1464);
					match(LBRACKET);
					setState(1465);
					match(RBRACKET);
					}
					}
					setState(1470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1471);
				match(DOT);
				setState(1472);
				match(CLASS);
				((PrimaryContext)_localctx).operationType =  7;
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 8);
				{
				setState(1475);
				match(VOID);
				setState(1476);
				match(DOT);
				setState(1477);
				match(CLASS);
				((PrimaryContext)_localctx).operationType =  8;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_superSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			match(DOT);
			setState(1483);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1482);
				typeArguments();
				}
			}

			setState(1485);
			match(Identifier);
			setState(1487);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1486);
				arguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThisSuffixContext extends ParserRuleContext {
		public int operationType;
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public ThisSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterThisSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitThisSuffix(this);
		}
	}

	public final ThisSuffixContext thisSuffix() throws RecognitionException {
		ThisSuffixContext _localctx = new ThisSuffixContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_thisSuffix);
		try {
			int _alt;
			setState(1511);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1493); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1489);
						match(LBRACKET);
						setState(1490);
						expression();
						setState(1491);
						match(RBRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1495); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				((ThisSuffixContext)_localctx).operationType =  1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				arguments();
				((ThisSuffixContext)_localctx).operationType =  2;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1502);
				match(DOT);
				setState(1503);
				nonWildcardTypeArguments();
				setState(1504);
				match(Identifier);
				setState(1505);
				arguments();
				((ThisSuffixContext)_localctx).operationType =  3;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1508);
				innerCreator();
				((ThisSuffixContext)_localctx).operationType =  4;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSuffixContext extends ParserRuleContext {
		public int operationType;
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(Java7Parser.CLASS, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode THIS() { return getToken(Java7Parser.THIS, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public IdentifierSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterIdentifierSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitIdentifierSuffix(this);
		}
	}

	public final IdentifierSuffixContext identifierSuffix() throws RecognitionException {
		IdentifierSuffixContext _localctx = new IdentifierSuffixContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_identifierSuffix);
		int _la;
		try {
			int _alt;
			setState(1550);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1515); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1513);
					match(LBRACKET);
					setState(1514);
					match(RBRACKET);
					}
					}
					setState(1517); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACKET );
				setState(1519);
				match(DOT);
				setState(1520);
				match(CLASS);
				((IdentifierSuffixContext)_localctx).operationType =  1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1526); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1522);
						match(LBRACKET);
						setState(1523);
						expression();
						setState(1524);
						match(RBRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1528); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				((IdentifierSuffixContext)_localctx).operationType =  2;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1532);
				arguments();
				((IdentifierSuffixContext)_localctx).operationType =  3;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1535);
				match(DOT);
				setState(1536);
				match(CLASS);
				((IdentifierSuffixContext)_localctx).operationType =  4;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1538);
				match(DOT);
				setState(1539);
				nonWildcardTypeArguments();
				setState(1540);
				match(Identifier);
				setState(1541);
				arguments();
				((IdentifierSuffixContext)_localctx).operationType =  5;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1544);
				match(DOT);
				setState(1545);
				match(THIS);
				((IdentifierSuffixContext)_localctx).operationType =  6;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1547);
				innerCreator();
				((IdentifierSuffixContext)_localctx).operationType =  7;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParamCallContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TypeParamCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterTypeParamCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitTypeParamCall(this);
		}
	}

	public final TypeParamCallContext typeParamCall() throws RecognitionException {
		TypeParamCallContext _localctx = new TypeParamCallContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_typeParamCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			match(DOT);
			{
			setState(1553);
			typeArguments();
			}
			setState(1554);
			match(Identifier);
			{
			setState(1555);
			arguments();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public int operationType;
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode THIS() { return getToken(Java7Parser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(Java7Parser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(Java7Parser.RBRACKET, 0); }
		public TypeParamCallContext typeParamCall() {
			return getRuleContext(TypeParamCallContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_selector);
		int _la;
		try {
			setState(1582);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1557);
				match(DOT);
				setState(1558);
				match(Identifier);
				setState(1560);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1559);
					arguments();
					}
				}

				((SelectorContext)_localctx).operationType =  1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1563);
				match(DOT);
				setState(1564);
				match(THIS);
				((SelectorContext)_localctx).operationType =  2;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1566);
				match(DOT);
				setState(1567);
				match(SUPER);
				setState(1568);
				superSuffix();
				((SelectorContext)_localctx).operationType =  3;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1571);
				innerCreator();
				((SelectorContext)_localctx).operationType =  4;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1574);
				match(LBRACKET);
				setState(1575);
				expression();
				setState(1576);
				match(RBRACKET);
				((SelectorContext)_localctx).operationType =  5;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1579);
				typeParamCall();
				((SelectorContext)_localctx).operationType =  6;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(Java7Parser.NEW, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorContext arrayCreator() {
			return getRuleContext(ArrayCreatorContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_creator);
		try {
			setState(1594);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1584);
				match(NEW);
				setState(1585);
				nonWildcardTypeArguments();
				setState(1586);
				classOrInterfaceType();
				setState(1587);
				classCreatorRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1589);
				match(NEW);
				setState(1590);
				classOrInterfaceType();
				setState(1591);
				classCreatorRest();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1593);
				arrayCreator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(Java7Parser.NEW, 0); }
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterArrayCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitArrayCreator(this);
		}
	}

	public final ArrayCreatorContext arrayCreator() throws RecognitionException {
		ArrayCreatorContext _localctx = new ArrayCreatorContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_arrayCreator);
		int _la;
		try {
			int _alt;
			setState(1630);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1596);
				match(NEW);
				setState(1597);
				createdName();
				setState(1598);
				match(LBRACKET);
				setState(1599);
				match(RBRACKET);
				setState(1604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(1600);
					match(LBRACKET);
					setState(1601);
					match(RBRACKET);
					}
					}
					setState(1606);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1607);
				arrayInitializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1609);
				match(NEW);
				setState(1610);
				createdName();
				setState(1611);
				match(LBRACKET);
				setState(1612);
				expression();
				setState(1613);
				match(RBRACKET);
				setState(1620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1614);
						match(LBRACKET);
						setState(1615);
						expression();
						setState(1616);
						match(RBRACKET);
						}
						} 
					}
					setState(1622);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				}
				setState(1627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1623);
						match(LBRACKET);
						setState(1624);
						match(RBRACKET);
						}
						} 
					}
					setState(1629);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_variableInitializer);
		try {
			setState(1634);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1632);
				arrayInitializer();
				}
				break;
			case LPAREN:
			case VOID:
			case BOOLEAN:
			case CHAR:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case THIS:
			case SUPER:
			case NULL:
			case TRUE:
			case FALSE:
			case AT:
			case PLUSPLUS:
			case SUBSUB:
			case TILDE:
			case BANG:
			case NEW:
			case PLUS:
			case SUB:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1633);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			match(LBRACE);
			setState(1645);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PLUSPLUS - 67)) | (1L << (SUBSUB - 67)) | (1L << (TILDE - 67)) | (1L << (BANG - 67)) | (1L << (NEW - 67)) | (1L << (PLUS - 67)) | (1L << (SUB - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(1637);
				variableInitializer();
				setState(1642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1638);
						match(COMMA);
						setState(1639);
						variableInitializer();
						}
						} 
					}
					setState(1644);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
				}
				}
			}

			setState(1648);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1647);
				match(COMMA);
				}
			}

			setState(1650);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_createdName);
		try {
			setState(1654);
			switch (_input.LA(1)) {
			case AT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1652);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1653);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TerminalNode NEW() { return getToken(Java7Parser.NEW, 0); }
		public IdentifierTypeArgumentContext identifierTypeArgument() {
			return getRuleContext(IdentifierTypeArgumentContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			match(DOT);
			setState(1657);
			match(NEW);
			setState(1659);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1658);
				nonWildcardTypeArguments();
				}
			}

			setState(1661);
			identifierTypeArgument();
			setState(1662);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_classCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			arguments();
			setState(1666);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1665);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Java7Parser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(Java7Parser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			match(LT);
			setState(1669);
			typeList();
			setState(1670);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			match(LPAREN);
			setState(1674);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PLUSPLUS - 67)) | (1L << (SUBSUB - 67)) | (1L << (TILDE - 67)) | (1L << (BANG - 67)) | (1L << (NEW - 67)) | (1L << (PLUS - 67)) | (1L << (SUB - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(1673);
				expressionList();
				}
			}

			setState(1676);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(Java7Parser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java7Parser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Java7Parser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(Java7Parser.StringLiteral, 0); }
		public TerminalNode TRUE() { return getToken(Java7Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Java7Parser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(Java7Parser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			_la = _input.LA(1);
			if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (NULL - 44)) | (1L << (TRUE - 44)) | (1L << (FALSE - 44)) | (1L << (IntegerLiteral - 44)) | (1L << (FloatingPointLiteral - 44)) | (1L << (CharacterLiteral - 44)) | (1L << (StringLiteral - 44)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassHeaderContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(Java7Parser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ClassHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterClassHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitClassHeader(this);
		}
	}

	public final ClassHeaderContext classHeader() throws RecognitionException {
		ClassHeaderContext _localctx = new ClassHeaderContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_classHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			modifiers();
			setState(1681);
			match(CLASS);
			setState(1682);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumHeaderContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public TerminalNode ENUM() { return getToken(Java7Parser.ENUM, 0); }
		public EnumHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterEnumHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitEnumHeader(this);
		}
	}

	public final EnumHeaderContext enumHeader() throws RecognitionException {
		EnumHeaderContext _localctx = new EnumHeaderContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_enumHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			modifiers();
			setState(1685);
			_la = _input.LA(1);
			if ( !(_la==ENUM || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1686);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceHeaderContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode INTERFACE() { return getToken(Java7Parser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public InterfaceHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterInterfaceHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitInterfaceHeader(this);
		}
	}

	public final InterfaceHeaderContext interfaceHeader() throws RecognitionException {
		InterfaceHeaderContext _localctx = new InterfaceHeaderContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_interfaceHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
			modifiers();
			setState(1689);
			match(INTERFACE);
			setState(1690);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationHeaderContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode AT() { return getToken(Java7Parser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(Java7Parser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public AnnotationHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterAnnotationHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitAnnotationHeader(this);
		}
	}

	public final AnnotationHeaderContext annotationHeader() throws RecognitionException {
		AnnotationHeaderContext _localctx = new AnnotationHeaderContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_annotationHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
			modifiers();
			setState(1693);
			match(AT);
			setState(1694);
			match(INTERFACE);
			setState(1695);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeHeaderContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode CLASS() { return getToken(Java7Parser.CLASS, 0); }
		public TerminalNode ENUM() { return getToken(Java7Parser.ENUM, 0); }
		public TerminalNode INTERFACE() { return getToken(Java7Parser.INTERFACE, 0); }
		public TerminalNode AT() { return getToken(Java7Parser.AT, 0); }
		public TypeHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterTypeHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitTypeHeader(this);
		}
	}

	public final TypeHeaderContext typeHeader() throws RecognitionException {
		TypeHeaderContext _localctx = new TypeHeaderContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_typeHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
			modifiers();
			setState(1704);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(1698);
				match(CLASS);
				}
				break;
			case ENUM:
				{
				setState(1699);
				match(ENUM);
				}
				break;
			case INTERFACE:
			case AT:
				{
				{
				setState(1701);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1700);
					match(AT);
					}
				}

				setState(1703);
				match(INTERFACE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1706);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java7Parser.VOID, 0); }
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitMethodHeader(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_methodHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			modifiers();
			setState(1710);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1709);
				typeParameters();
				}
			}

			setState(1714);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1712);
				type();
				}
				break;
			case 2:
				{
				setState(1713);
				match(VOID);
				}
				break;
			}
			setState(1716);
			match(Identifier);
			setState(1717);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldHeaderContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
		public TerminalNode COMMA() { return getToken(Java7Parser.COMMA, 0); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public FieldHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterFieldHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitFieldHeader(this);
		}
	}

	public final FieldHeaderContext fieldHeader() throws RecognitionException {
		FieldHeaderContext _localctx = new FieldHeaderContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_fieldHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			modifiers();
			setState(1720);
			type();
			setState(1721);
			match(Identifier);
			setState(1726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1722);
				match(LBRACKET);
				setState(1723);
				match(RBRACKET);
				}
				}
				setState(1728);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1729);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << COMMA) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableHeaderContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
		public TerminalNode COMMA() { return getToken(Java7Parser.COMMA, 0); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public LocalVariableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterLocalVariableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitLocalVariableHeader(this);
		}
	}

	public final LocalVariableHeaderContext localVariableHeader() throws RecognitionException {
		LocalVariableHeaderContext _localctx = new LocalVariableHeaderContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_localVariableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			variableModifiers();
			setState(1732);
			type();
			setState(1733);
			match(Identifier);
			setState(1738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1734);
				match(LBRACKET);
				setState(1735);
				match(RBRACKET);
				}
				}
				setState(1740);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1741);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << COMMA) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public InferredFormalParametersContext inferredFormalParameters() {
			return getRuleContext(InferredFormalParametersContext.class,0);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitInferredFormalParameterList(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			match(LPAREN);
			setState(1745);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1744);
				inferredFormalParameters();
				}
			}

			setState(1747);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParametersContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public InferredFormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterInferredFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitInferredFormalParameters(this);
		}
	}

	public final InferredFormalParametersContext inferredFormalParameters() throws RecognitionException {
		InferredFormalParametersContext _localctx = new InferredFormalParametersContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_inferredFormalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
			match(Identifier);
			setState(1754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1750);
				match(COMMA);
				setState(1751);
				match(Identifier);
				}
				}
				setState(1756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode LAMBDA() { return getToken(Java7Parser.LAMBDA, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_lambdaExpression);
		try {
			setState(1762);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1757);
				lambdaParameters();
				setState(1758);
				match(LAMBDA);
				setState(1759);
				lambdaBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1761);
				conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_lambdaParameters);
		try {
			setState(1767);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1764);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1765);
				formalParameters();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1766);
				inferredFormalParameterList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_lambdaBody);
		try {
			setState(1771);
			switch (_input.LA(1)) {
			case LPAREN:
			case VOID:
			case BOOLEAN:
			case CHAR:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case THIS:
			case SUPER:
			case NULL:
			case TRUE:
			case FALSE:
			case AT:
			case PLUSPLUS:
			case SUBSUB:
			case TILDE:
			case BANG:
			case NEW:
			case PLUS:
			case SUB:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1769);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1770);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode REF() { return getToken(Java7Parser.REF, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(Java7Parser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitMethodReference(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_methodReference);
		int _la;
		try {
			setState(1823);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1820);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1773);
					typeName();
					setState(1774);
					match(REF);
					setState(1776);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1775);
						typeArguments();
						}
					}

					setState(1778);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(1780);
					referenceType();
					setState(1781);
					match(REF);
					setState(1783);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1782);
						typeArguments();
						}
					}

					setState(1785);
					match(Identifier);
					}
					break;
				case 3:
					{
					setState(1787);
					primary();
					setState(1788);
					match(REF);
					setState(1790);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1789);
						typeArguments();
						}
					}

					setState(1792);
					match(Identifier);
					}
					break;
				case 4:
					{
					setState(1794);
					match(SUPER);
					setState(1795);
					match(REF);
					setState(1797);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1796);
						typeArguments();
						}
					}

					setState(1799);
					match(Identifier);
					}
					break;
				case 5:
					{
					setState(1800);
					typeName();
					setState(1801);
					match(DOT);
					setState(1802);
					match(SUPER);
					setState(1803);
					match(REF);
					setState(1805);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1804);
						typeArguments();
						}
					}

					setState(1807);
					match(Identifier);
					}
					break;
				case 6:
					{
					setState(1809);
					classOrInterfaceType();
					setState(1810);
					match(REF);
					setState(1812);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1811);
						typeArguments();
						}
					}

					setState(1814);
					match(NEW);
					}
					break;
				case 7:
					{
					setState(1816);
					arrayType();
					setState(1817);
					match(REF);
					setState(1818);
					match(NEW);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1822);
				lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitReferenceType(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_referenceType);
		try {
			setState(1828);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1825);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1826);
				typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1827);
				arrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitTypeVariable(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1830);
				annotation();
				}
				}
				setState(1835);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1836);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_typeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			match(Identifier);
			setState(1843);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1839);
					match(DOT);
					setState(1840);
					match(Identifier);
					}
					} 
				}
				setState(1845);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_arrayType);
		try {
			setState(1855);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1846);
				primitiveType();
				setState(1847);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1849);
				classOrInterfaceType();
				setState(1850);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1852);
				typeVariable();
				setState(1853);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitDims(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_dims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1857);
				annotation();
				}
				}
				setState(1862);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1863);
			match(LBRACKET);
			setState(1864);
			match(RBRACKET);
			setState(1875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET || _la==AT) {
				{
				{
				setState(1868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1865);
					annotation();
					}
					}
					setState(1870);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1871);
				match(LBRACKET);
				setState(1872);
				match(RBRACKET);
				}
				}
				setState(1877);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3j\u0759\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\3\2\5\2\u0120\n\2\3\2\7\2\u0123\n\2\f\2\16\2"+
		"\u0126\13\2\3\2\7\2\u0129\n\2\f\2\16\2\u012c\13\2\3\3\5\3\u012f\n\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\5\4\u0137\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u013f"+
		"\n\4\3\4\3\4\3\4\6\4\u0144\n\4\r\4\16\4\u0145\3\4\3\4\5\4\u014a\n\4\3"+
		"\4\5\4\u014d\n\4\3\5\3\5\3\5\7\5\u0152\n\5\f\5\16\5\u0155\13\5\3\6\3\6"+
		"\5\6\u0159\n\6\3\7\3\7\5\7\u015d\n\7\3\b\7\b\u0160\n\b\f\b\16\b\u0163"+
		"\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0171\n\t\3"+
		"\n\7\n\u0174\n\n\f\n\16\n\u0177\13\n\3\n\5\n\u017a\n\n\3\n\7\n\u017d\n"+
		"\n\f\n\16\n\u0180\13\n\3\13\3\13\5\13\u0184\n\13\3\f\3\f\3\f\3\f\5\f\u018a"+
		"\n\f\3\f\3\f\5\f\u018e\n\f\3\f\3\f\5\f\u0192\n\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\7\r\u019a\n\r\f\r\16\r\u019d\13\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16"+
		"\u01a5\n\16\f\16\16\16\u01a8\13\16\5\16\u01aa\n\16\3\17\3\17\3\17\7\17"+
		"\u01af\n\17\f\17\16\17\u01b2\13\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u01bc\n\21\3\21\3\21\3\22\3\22\5\22\u01c2\n\22\3\22\5\22\u01c5"+
		"\n\22\3\22\5\22\u01c8\n\22\3\22\3\22\3\23\3\23\3\23\7\23\u01cf\n\23\f"+
		"\23\16\23\u01d2\13\23\3\24\5\24\u01d5\n\24\3\24\3\24\5\24\u01d9\n\24\3"+
		"\24\5\24\u01dc\n\24\3\25\3\25\7\25\u01e0\n\25\f\25\16\25\u01e3\13\25\3"+
		"\26\3\26\5\26\u01e7\n\26\3\27\3\27\3\27\3\27\5\27\u01ed\n\27\3\27\3\27"+
		"\5\27\u01f1\n\27\3\27\3\27\3\30\3\30\3\30\7\30\u01f8\n\30\f\30\16\30\u01fb"+
		"\13\30\3\31\3\31\7\31\u01ff\n\31\f\31\16\31\u0202\13\31\3\31\3\31\3\32"+
		"\3\32\7\32\u0208\n\32\f\32\16\32\u020b\13\32\3\32\3\32\3\33\3\33\5\33"+
		"\u0211\n\33\3\33\3\33\5\33\u0215\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u021c"+
		"\n\34\3\35\3\35\5\35\u0220\n\35\3\35\3\35\5\35\u0224\n\35\3\35\3\35\3"+
		"\35\3\35\7\35\u022a\n\35\f\35\16\35\u022d\13\35\3\35\3\35\5\35\u0231\n"+
		"\35\3\35\3\35\5\35\u0235\n\35\3\36\3\36\5\36\u0239\n\36\3\36\3\36\3\36"+
		"\3\36\5\36\u023f\n\36\3\36\3\36\3\37\3\37\5\37\u0245\n\37\3\37\7\37\u0248"+
		"\n\37\f\37\16\37\u024b\13\37\3\37\3\37\3 \3 \3 \3 \3 \7 \u0254\n \f \16"+
		" \u0257\13 \3 \3 \3!\3!\3!\7!\u025e\n!\f!\16!\u0261\13!\3!\3!\5!\u0265"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u026d\n\"\3#\3#\5#\u0271\n#\3#\3#\5#\u0275"+
		"\n#\3#\3#\3#\3#\7#\u027b\n#\f#\16#\u027e\13#\3#\3#\5#\u0282\n#\3#\3#\5"+
		"#\u0286\n#\3$\3$\3$\3$\3$\5$\u028d\n$\3$\5$\u0290\n$\3$\3$\5$\u0294\n"+
		"$\3$\3$\3$\3$\7$\u029a\n$\f$\16$\u029d\13$\3$\3$\5$\u02a1\n$\3$\3$\5$"+
		"\u02a5\n$\3%\3%\3%\3%\3%\7%\u02ac\n%\f%\16%\u02af\13%\3%\3%\3&\3&\3&\7"+
		"&\u02b6\n&\f&\16&\u02b9\13&\3&\3&\3&\7&\u02be\n&\f&\16&\u02c1\13&\5&\u02c3"+
		"\n&\3\'\3\'\3\'\7\'\u02c8\n\'\f\'\16\'\u02cb\13\'\3(\7(\u02ce\n(\f(\16"+
		"(\u02d1\13(\3(\3(\5(\u02d5\n(\3)\3)\3*\3*\3*\3*\7*\u02dd\n*\f*\16*\u02e0"+
		"\13*\3*\3*\3*\3*\5*\u02e6\n*\3+\3+\3+\3+\5+\u02ec\n+\5+\u02ee\n+\3,\3"+
		",\3,\7,\u02f3\n,\f,\16,\u02f6\13,\3-\3-\5-\u02fa\n-\3-\3-\3.\3.\3.\3."+
		"\3.\3.\7.\u0304\n.\f.\16.\u0307\13.\3.\3.\3.\3.\3.\6.\u030e\n.\r.\16."+
		"\u030f\3.\3.\3.\5.\u0315\n.\3/\3/\3/\3/\3/\7/\u031c\n/\f/\16/\u031f\13"+
		"/\3\60\3\60\3\60\3\60\3\60\3\61\5\61\u0327\n\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\5\61\u0330\n\61\3\61\3\61\3\61\3\61\5\61\u0336\n\61\3\62"+
		"\3\62\3\62\7\62\u033b\n\62\f\62\16\62\u033e\13\62\3\63\6\63\u0341\n\63"+
		"\r\63\16\63\u0342\3\64\3\64\3\64\5\64\u0348\n\64\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\5\67\u0357\n\67\3\67\3\67"+
		"\38\38\38\78\u035e\n8\f8\168\u0361\138\39\39\39\39\3:\3:\3:\5:\u036a\n"+
		":\3;\3;\3;\3;\7;\u0370\n;\f;\16;\u0373\13;\5;\u0375\n;\3;\5;\u0378\n;"+
		"\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\7=\u0384\n=\f=\16=\u0387\13=\3=\3=\3>\3"+
		">\3>\3>\3>\3>\3>\5>\u0392\n>\3?\3?\3?\3?\3?\3?\3?\5?\u039b\n?\3?\3?\3"+
		"@\3@\7@\u03a1\n@\f@\16@\u03a4\13@\3@\3@\3A\3A\3A\5A\u03ab\nA\3B\3B\3B"+
		"\3C\3C\3C\3C\3C\7C\u03b5\nC\fC\16C\u03b8\13C\3D\3D\3D\3D\3D\5D\u03bf\n"+
		"D\3D\3D\3D\3D\3D\3D\3D\5D\u03c8\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u03e2\nD\3D\3D\3D\3D\3D\3D\3"+
		"D\5D\u03eb\nD\3D\3D\3D\5D\u03f0\nD\3D\3D\3D\3D\3D\3D\3D\3D\5D\u03fa\n"+
		"D\3E\3E\3F\7F\u03ff\nF\fF\16F\u0402\13F\3G\3G\7G\u0406\nG\fG\16G\u0409"+
		"\13G\3H\3H\3H\3H\3H\3H\5H\u0411\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u042c\nI\3J\3J\3J\3J\5J\u0432"+
		"\nJ\3J\3J\5J\u0436\nJ\3K\3K\3K\5K\u043b\nK\3K\3K\3L\3L\3L\7L\u0442\nL"+
		"\fL\16L\u0445\13L\3M\5M\u0448\nM\3M\3M\3M\3M\3M\3N\3N\7N\u0451\nN\fN\16"+
		"N\u0454\13N\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\7P\u0460\nP\fP\16P\u0463\13"+
		"P\3P\3P\3P\7P\u0468\nP\fP\16P\u046b\13P\3Q\3Q\5Q\u046f\nQ\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\3R\3S\3S\3S\5S\u047e\nS\3S\3S\5S\u0482\nS\3S\3S\5S\u0486"+
		"\nS\3S\3S\3S\3T\3T\5T\u048d\nT\3U\3U\3U\3U\3V\3V\3V\7V\u0496\nV\fV\16"+
		"V\u0499\13V\3W\3W\3W\3W\5W\u049f\nW\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u04c0\n"+
		"X\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u04c8\nY\3Z\3Z\3Z\7Z\u04cd\nZ\fZ\16Z\u04d0\13Z"+
		"\3[\3[\3[\7[\u04d5\n[\f[\16[\u04d8\13[\3\\\3\\\3\\\7\\\u04dd\n\\\f\\\16"+
		"\\\u04e0\13\\\3]\3]\3]\7]\u04e5\n]\f]\16]\u04e8\13]\3^\3^\3^\7^\u04ed"+
		"\n^\f^\16^\u04f0\13^\3_\3_\3_\7_\u04f5\n_\f_\16_\u04f8\13_\3`\3`\3`\7"+
		"`\u04fd\n`\f`\16`\u0500\13`\3a\3a\3a\5a\u0505\na\3b\3b\3b\3b\7b\u050b"+
		"\nb\fb\16b\u050e\13b\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u051a\nc\3d\3d\3"+
		"d\3d\7d\u0520\nd\fd\16d\u0523\13d\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u052f"+
		"\ne\3f\3f\3f\3f\7f\u0535\nf\ff\16f\u0538\13f\3g\3g\3g\3g\5g\u053e\ng\3"+
		"h\3h\3h\3h\7h\u0544\nh\fh\16h\u0547\13h\3i\3i\3i\3i\3i\3i\5i\u054f\ni"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u055e\nj\3k\3k\3k\7k\u0563"+
		"\nk\fk\16k\u0566\13k\3k\5k\u0569\nk\5k\u056b\nk\3l\3l\3l\3l\3l\3l\3l\3"+
		"l\7l\u0575\nl\fl\16l\u0578\13l\3l\3l\3l\3l\3l\3l\7l\u0580\nl\fl\16l\u0583"+
		"\13l\3l\3l\3l\3l\3l\3l\7l\u058b\nl\fl\16l\u058e\13l\3l\3l\3l\5l\u0593"+
		"\nl\3m\3m\3m\3m\3m\3m\7m\u059b\nm\fm\16m\u059e\13m\3m\5m\u05a1\nm\3m\3"+
		"m\3m\3m\7m\u05a7\nm\fm\16m\u05aa\13m\3m\5m\u05ad\nm\3m\3m\3m\3m\3m\3m"+
		"\3m\3m\3m\3m\3m\3m\3m\3m\7m\u05bd\nm\fm\16m\u05c0\13m\3m\3m\3m\3m\3m\3"+
		"m\3m\3m\5m\u05ca\nm\3n\3n\5n\u05ce\nn\3n\3n\5n\u05d2\nn\3o\3o\3o\3o\6"+
		"o\u05d8\no\ro\16o\u05d9\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u05ea"+
		"\no\3p\3p\6p\u05ee\np\rp\16p\u05ef\3p\3p\3p\3p\3p\3p\3p\6p\u05f9\np\r"+
		"p\16p\u05fa\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3"+
		"p\5p\u0611\np\3q\3q\3q\3q\3q\3r\3r\3r\5r\u061b\nr\3r\3r\3r\3r\3r\3r\3"+
		"r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\5r\u0631\nr\3s\3s\3s\3s\3s\3"+
		"s\3s\3s\3s\3s\5s\u063d\ns\3t\3t\3t\3t\3t\3t\7t\u0645\nt\ft\16t\u0648\13"+
		"t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\7t\u0655\nt\ft\16t\u0658\13t\3t\3t"+
		"\7t\u065c\nt\ft\16t\u065f\13t\5t\u0661\nt\3u\3u\5u\u0665\nu\3v\3v\3v\3"+
		"v\7v\u066b\nv\fv\16v\u066e\13v\5v\u0670\nv\3v\5v\u0673\nv\3v\3v\3w\3w"+
		"\5w\u0679\nw\3x\3x\3x\5x\u067e\nx\3x\3x\3x\3y\3y\5y\u0685\ny\3z\3z\3z"+
		"\3z\3{\3{\5{\u068d\n{\3{\3{\3|\3|\3}\3}\3}\3}\3~\3~\3~\3~\3\177\3\177"+
		"\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3"+
		"\u0081\3\u0081\5\u0081\u06a8\n\u0081\3\u0081\5\u0081\u06ab\n\u0081\3\u0081"+
		"\3\u0081\3\u0082\3\u0082\5\u0082\u06b1\n\u0082\3\u0082\3\u0082\5\u0082"+
		"\u06b5\n\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\7\u0083\u06bf\n\u0083\f\u0083\16\u0083\u06c2\13\u0083\3\u0083"+
		"\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u06cb\n\u0084"+
		"\f\u0084\16\u0084\u06ce\13\u0084\3\u0084\3\u0084\3\u0085\3\u0085\5\u0085"+
		"\u06d4\n\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\7\u0086\u06db\n"+
		"\u0086\f\u0086\16\u0086\u06de\13\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\5\u0087\u06e5\n\u0087\3\u0088\3\u0088\3\u0088\5\u0088\u06ea\n"+
		"\u0088\3\u0089\3\u0089\5\u0089\u06ee\n\u0089\3\u008a\3\u008a\3\u008a\5"+
		"\u008a\u06f3\n\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u06fa"+
		"\n\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0701\n\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0708\n\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0710\n\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0717\n\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u071f\n\u008a\3\u008a\5\u008a"+
		"\u0722\n\u008a\3\u008b\3\u008b\3\u008b\5\u008b\u0727\n\u008b\3\u008c\7"+
		"\u008c\u072a\n\u008c\f\u008c\16\u008c\u072d\13\u008c\3\u008c\3\u008c\3"+
		"\u008d\3\u008d\3\u008d\7\u008d\u0734\n\u008d\f\u008d\16\u008d\u0737\13"+
		"\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\5\u008e\u0742\n\u008e\3\u008f\7\u008f\u0745\n\u008f\f\u008f\16"+
		"\u008f\u0748\13\u008f\3\u008f\3\u008f\3\u008f\7\u008f\u074d\n\u008f\f"+
		"\u008f\16\u008f\u0750\13\u008f\3\u008f\3\u008f\7\u008f\u0754\n\u008f\f"+
		"\u008f\16\u008f\u0757\13\u008f\3\u008f\2\2\u0090\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\2\t\3\2!(\4\2**--\3\2"+
		",-\3\2EF\4\2.\60be\4\2BBff\5\2\3\3\21\21\34\34\u07f6\2\u011f\3\2\2\2\4"+
		"\u012e\3\2\2\2\6\u014c\3\2\2\2\b\u014e\3\2\2\2\n\u0158\3\2\2\2\f\u015c"+
		"\3\2\2\2\16\u0161\3\2\2\2\20\u0170\3\2\2\2\22\u0175\3\2\2\2\24\u0183\3"+
		"\2\2\2\26\u0185\3\2\2\2\30\u0195\3\2\2\2\32\u01a0\3\2\2\2\34\u01ab\3\2"+
		"\2\2\36\u01b3\3\2\2\2 \u01b6\3\2\2\2\"\u01bf\3\2\2\2$\u01cb\3\2\2\2&\u01d4"+
		"\3\2\2\2(\u01dd\3\2\2\2*\u01e6\3\2\2\2,\u01e8\3\2\2\2.\u01f4\3\2\2\2\60"+
		"\u01fc\3\2\2\2\62\u0205\3\2\2\2\64\u0214\3\2\2\2\66\u021b\3\2\2\28\u021d"+
		"\3\2\2\2:\u0236\3\2\2\2<\u0242\3\2\2\2>\u024e\3\2\2\2@\u025a\3\2\2\2B"+
		"\u026c\3\2\2\2D\u026e\3\2\2\2F\u028c\3\2\2\2H\u02a6\3\2\2\2J\u02c2\3\2"+
		"\2\2L\u02c4\3\2\2\2N\u02cf\3\2\2\2P\u02d6\3\2\2\2R\u02e5\3\2\2\2T\u02ed"+
		"\3\2\2\2V\u02ef\3\2\2\2X\u02f7\3\2\2\2Z\u0314\3\2\2\2\\\u0316\3\2\2\2"+
		"^\u0320\3\2\2\2`\u0335\3\2\2\2b\u0337\3\2\2\2d\u0340\3\2\2\2f\u0347\3"+
		"\2\2\2h\u0349\3\2\2\2j\u034c\3\2\2\2l\u0352\3\2\2\2n\u035a\3\2\2\2p\u0362"+
		"\3\2\2\2r\u0369\3\2\2\2t\u036b\3\2\2\2v\u037b\3\2\2\2x\u0381\3\2\2\2z"+
		"\u0391\3\2\2\2|\u0393\3\2\2\2~\u039e\3\2\2\2\u0080\u03aa\3\2\2\2\u0082"+
		"\u03ac\3\2\2\2\u0084\u03af\3\2\2\2\u0086\u03f9\3\2\2\2\u0088\u03fb\3\2"+
		"\2\2\u008a\u0400\3\2\2\2\u008c\u0403\3\2\2\2\u008e\u0410\3\2\2\2\u0090"+
		"\u042b\3\2\2\2\u0092\u042d\3\2\2\2\u0094\u0437\3\2\2\2\u0096\u043e\3\2"+
		"\2\2\u0098\u0447\3\2\2\2\u009a\u044e\3\2\2\2\u009c\u0455\3\2\2\2\u009e"+
		"\u045b\3\2\2\2\u00a0\u046e\3\2\2\2\u00a2\u0470\3\2\2\2\u00a4\u047a\3\2"+
		"\2\2\u00a6\u048c\3\2\2\2\u00a8\u048e\3\2\2\2\u00aa\u0492\3\2\2\2\u00ac"+
		"\u049a\3\2\2\2\u00ae\u04bf\3\2\2\2\u00b0\u04c1\3\2\2\2\u00b2\u04c9\3\2"+
		"\2\2\u00b4\u04d1\3\2\2\2\u00b6\u04d9\3\2\2\2\u00b8\u04e1\3\2\2\2\u00ba"+
		"\u04e9\3\2\2\2\u00bc\u04f1\3\2\2\2\u00be\u04f9\3\2\2\2\u00c0\u0501\3\2"+
		"\2\2\u00c2\u0506\3\2\2\2\u00c4\u0519\3\2\2\2\u00c6\u051b\3\2\2\2\u00c8"+
		"\u052e\3\2\2\2\u00ca\u0530\3\2\2\2\u00cc\u053d\3\2\2\2\u00ce\u053f\3\2"+
		"\2\2\u00d0\u054e\3\2\2\2\u00d2\u055d\3\2\2\2\u00d4\u056a\3\2\2\2\u00d6"+
		"\u0592\3\2\2\2\u00d8\u05c9\3\2\2\2\u00da\u05cb\3\2\2\2\u00dc\u05e9\3\2"+
		"\2\2\u00de\u0610\3\2\2\2\u00e0\u0612\3\2\2\2\u00e2\u0630\3\2\2\2\u00e4"+
		"\u063c\3\2\2\2\u00e6\u0660\3\2\2\2\u00e8\u0664\3\2\2\2\u00ea\u0666\3\2"+
		"\2\2\u00ec\u0678\3\2\2\2\u00ee\u067a\3\2\2\2\u00f0\u0682\3\2\2\2\u00f2"+
		"\u0686\3\2\2\2\u00f4\u068a\3\2\2\2\u00f6\u0690\3\2\2\2\u00f8\u0692\3\2"+
		"\2\2\u00fa\u0696\3\2\2\2\u00fc\u069a\3\2\2\2\u00fe\u069e\3\2\2\2\u0100"+
		"\u06a3\3\2\2\2\u0102\u06ae\3\2\2\2\u0104\u06b9\3\2\2\2\u0106\u06c5\3\2"+
		"\2\2\u0108\u06d1\3\2\2\2\u010a\u06d7\3\2\2\2\u010c\u06e4\3\2\2\2\u010e"+
		"\u06e9\3\2\2\2\u0110\u06ed\3\2\2\2\u0112\u0721\3\2\2\2\u0114\u0726\3\2"+
		"\2\2\u0116\u072b\3\2\2\2\u0118\u0730\3\2\2\2\u011a\u0741\3\2\2\2\u011c"+
		"\u0746\3\2\2\2\u011e\u0120\5\4\3\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0124\3\2\2\2\u0121\u0123\5\6\4\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u012a\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0127\u0129\5\n\6\2\u0128\u0127\3\2\2\2\u0129"+
		"\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\3\3\2\2\2"+
		"\u012c\u012a\3\2\2\2\u012d\u012f\5d\63\2\u012e\u012d\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7\4\2\2\u0131\u0132\5b\62\2\u0132"+
		"\u0133\7\3\2\2\u0133\5\3\2\2\2\u0134\u0136\7\5\2\2\u0135\u0137\7\16\2"+
		"\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139"+
		"\7f\2\2\u0139\u013a\7\6\2\2\u013a\u013b\7\7\2\2\u013b\u014d\7\3\2\2\u013c"+
		"\u013e\7\5\2\2\u013d\u013f\7\16\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3"+
		"\2\2\2\u013f\u0140\3\2\2\2\u0140\u0143\7f\2\2\u0141\u0142\7\6\2\2\u0142"+
		"\u0144\7f\2\2\u0143\u0141\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0148\7\6\2\2\u0148"+
		"\u014a\7\7\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014d\7\3\2\2\u014c\u0134\3\2\2\2\u014c\u013c\3\2\2\2\u014d"+
		"\7\3\2\2\2\u014e\u0153\7f\2\2\u014f\u0150\7\6\2\2\u0150\u0152\7f\2\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\t\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0159\5\f\7\2\u0157\u0159"+
		"\7\3\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159\13\3\2\2\2\u015a"+
		"\u015d\5\24\13\2\u015b\u015d\5*\26\2\u015c\u015a\3\2\2\2\u015c\u015b\3"+
		"\2\2\2\u015d\r\3\2\2\2\u015e\u0160\5\20\t\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\17\3\2\2"+
		"\2\u0163\u0161\3\2\2\2\u0164\u0171\5f\64\2\u0165\u0171\7\n\2\2\u0166\u0171"+
		"\7\13\2\2\u0167\u0171\7\f\2\2\u0168\u0171\7\16\2\2\u0169\u0171\7\r\2\2"+
		"\u016a\u0171\7\17\2\2\u016b\u0171\7\35\2\2\u016c\u0171\7\36\2\2\u016d"+
		"\u0171\7\37\2\2\u016e\u0171\7 \2\2\u016f\u0171\7\20\2\2\u0170\u0164\3"+
		"\2\2\2\u0170\u0165\3\2\2\2\u0170\u0166\3\2\2\2\u0170\u0167\3\2\2\2\u0170"+
		"\u0168\3\2\2\2\u0170\u0169\3\2\2\2\u0170\u016a\3\2\2\2\u0170\u016b\3\2"+
		"\2\2\u0170\u016c\3\2\2\2\u0170\u016d\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u016f\3\2\2\2\u0171\21\3\2\2\2\u0172\u0174\5f\64\2\u0173\u0172\3\2\2"+
		"\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0179"+
		"\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u017a\7\17\2\2\u0179\u0178\3\2\2\2"+
		"\u0179\u017a\3\2\2\2\u017a\u017e\3\2\2\2\u017b\u017d\5f\64\2\u017c\u017b"+
		"\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\23\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0184\5\26\f\2\u0182\u0184\5 \21"+
		"\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184\25\3\2\2\2\u0185\u0186"+
		"\5\16\b\2\u0186\u0187\7\b\2\2\u0187\u0189\7f\2\2\u0188\u018a\5\30\r\2"+
		"\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u018c"+
		"\7*\2\2\u018c\u018e\5J&\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u0191\3\2\2\2\u018f\u0190\7\t\2\2\u0190\u0192\5.\30\2\u0191\u018f\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\5\60\31\2\u0194"+
		"\27\3\2\2\2\u0195\u0196\7^\2\2\u0196\u019b\5\32\16\2\u0197\u0198\7\21"+
		"\2\2\u0198\u019a\5\32\16\2\u0199\u0197\3\2\2\2\u019a\u019d\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019e\u019f\7]\2\2\u019f\31\3\2\2\2\u01a0\u01a9\7f\2\2\u01a1\u01a2"+
		"\7*\2\2\u01a2\u01a6\5\34\17\2\u01a3\u01a5\5\36\20\2\u01a4\u01a3\3\2\2"+
		"\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01aa"+
		"\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01a1\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\33\3\2\2\2\u01ab\u01b0\5J&\2\u01ac\u01ad\7P\2\2\u01ad\u01af\5J&\2\u01ae"+
		"\u01ac\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\35\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\7P\2\2\u01b4\u01b5"+
		"\5L\'\2\u01b5\37\3\2\2\2\u01b6\u01b7\5\16\b\2\u01b7\u01b8\7B\2\2\u01b8"+
		"\u01bb\7f\2\2\u01b9\u01ba\7\t\2\2\u01ba\u01bc\5.\30\2\u01bb\u01b9\3\2"+
		"\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\5\"\22\2\u01be"+
		"!\3\2\2\2\u01bf\u01c1\7\22\2\2\u01c0\u01c2\5$\23\2\u01c1\u01c0\3\2\2\2"+
		"\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c5\7\21\2\2\u01c4\u01c3"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c8\5(\25\2\u01c7"+
		"\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\7\23"+
		"\2\2\u01ca#\3\2\2\2\u01cb\u01d0\5&\24\2\u01cc\u01cd\7\21\2\2\u01cd\u01cf"+
		"\5&\24\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1%\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d5\5d\63\2"+
		"\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8"+
		"\7f\2\2\u01d7\u01d9\5\u00f4{\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2"+
		"\u01d9\u01db\3\2\2\2\u01da\u01dc\5\60\31\2\u01db\u01da\3\2\2\2\u01db\u01dc"+
		"\3\2\2\2\u01dc\'\3\2\2\2\u01dd\u01e1\7\3\2\2\u01de\u01e0\5\64\33\2\u01df"+
		"\u01de\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2)\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e7\5,\27\2\u01e5\u01e7"+
		"\5v<\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7+\3\2\2\2\u01e8\u01e9"+
		"\5\16\b\2\u01e9\u01ea\7\31\2\2\u01ea\u01ec\7f\2\2\u01eb\u01ed\5\30\r\2"+
		"\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ef"+
		"\7*\2\2\u01ef\u01f1\5.\30\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f3\5\62\32\2\u01f3-\3\2\2\2\u01f4\u01f9\5J&\2"+
		"\u01f5\u01f6\7\21\2\2\u01f6\u01f8\5J&\2\u01f7\u01f5\3\2\2\2\u01f8\u01fb"+
		"\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa/\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fc\u0200\7\22\2\2\u01fd\u01ff\5\64\33\2\u01fe\u01fd"+
		"\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0204\7\23\2\2\u0204\61\3\2\2"+
		"\2\u0205\u0209\7\22\2\2\u0206\u0208\5B\"\2\u0207\u0206\3\2\2\2\u0208\u020b"+
		"\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b"+
		"\u0209\3\2\2\2\u020c\u020d\7\23\2\2\u020d\63\3\2\2\2\u020e\u0215\7\3\2"+
		"\2\u020f\u0211\7\16\2\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0215\5~@\2\u0213\u0215\5\66\34\2\u0214\u020e\3\2"+
		"\2\2\u0214\u0210\3\2\2\2\u0214\u0213\3\2\2\2\u0215\65\3\2\2\2\u0216\u021c"+
		"\5:\36\2\u0217\u021c\5> \2\u0218\u021c\58\35\2\u0219\u021c\5\24\13\2\u021a"+
		"\u021c\5*\26\2\u021b\u0216\3\2\2\2\u021b\u0217\3\2\2\2\u021b\u0218\3\2"+
		"\2\2\u021b\u0219\3\2\2\2\u021b\u021a\3\2\2\2\u021c\67\3\2\2\2\u021d\u021f"+
		"\5\16\b\2\u021e\u0220\5\30\r\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2"+
		"\u0220\u0223\3\2\2\2\u0221\u0224\5J&\2\u0222\u0224\7\30\2\2\u0223\u0221"+
		"\3\2\2\2\u0223\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\7f\2\2\u0226"+
		"\u022b\5X-\2\u0227\u0228\7\24\2\2\u0228\u022a\7\25\2\2\u0229\u0227\3\2"+
		"\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\u0230\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u022f\7\33\2\2\u022f\u0231\5"+
		"V,\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0234\3\2\2\2\u0232"+
		"\u0235\5~@\2\u0233\u0235\7\3\2\2\u0234\u0232\3\2\2\2\u0234\u0233\3\2\2"+
		"\2\u02359\3\2\2\2\u0236\u0238\5\16\b\2\u0237\u0239\5\30\r\2\u0238\u0237"+
		"\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\7f\2\2\u023b"+
		"\u023e\5X-\2\u023c\u023d\7\33\2\2\u023d\u023f\5V,\2\u023e\u023c\3\2\2"+
		"\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\5<\37\2\u0241;"+
		"\3\2\2\2\u0242\u0244\7\22\2\2\u0243\u0245\5`\61\2\u0244\u0243\3\2\2\2"+
		"\u0244\u0245\3\2\2\2\u0245\u0249\3\2\2\2\u0246\u0248\5\u0080A\2\u0247"+
		"\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2"+
		"\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024d\7\23\2\2\u024d"+
		"=\3\2\2\2\u024e\u024f\5\16\b\2\u024f\u0250\5J&\2\u0250\u0255\5@!\2\u0251"+
		"\u0252\7\21\2\2\u0252\u0254\5@!\2\u0253\u0251\3\2\2\2\u0254\u0257\3\2"+
		"\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257"+
		"\u0255\3\2\2\2\u0258\u0259\7\3\2\2\u0259?\3\2\2\2\u025a\u025f\7f\2\2\u025b"+
		"\u025c\7\24\2\2\u025c\u025e\7\25\2\2\u025d\u025b\3\2\2\2\u025e\u0261\3"+
		"\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0264\3\2\2\2\u0261"+
		"\u025f\3\2\2\2\u0262\u0263\7\34\2\2\u0263\u0265\5\u00e8u\2\u0264\u0262"+
		"\3\2\2\2\u0264\u0265\3\2\2\2\u0265A\3\2\2\2\u0266\u026d\5H%\2\u0267\u026d"+
		"\5D#\2\u0268\u026d\5F$\2\u0269\u026d\5*\26\2\u026a\u026d\5\24\13\2\u026b"+
		"\u026d\7\3\2\2\u026c\u0266\3\2\2\2\u026c\u0267\3\2\2\2\u026c\u0268\3\2"+
		"\2\2\u026c\u0269\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026b\3\2\2\2\u026d"+
		"C\3\2\2\2\u026e\u0270\5\16\b\2\u026f\u0271\5\30\r\2\u0270\u026f\3\2\2"+
		"\2\u0270\u0271\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0275\5J&\2\u0273\u0275"+
		"\7\30\2\2\u0274\u0272\3\2\2\2\u0274\u0273\3\2\2\2\u0275\u0276\3\2\2\2"+
		"\u0276\u0277\7f\2\2\u0277\u027c\5X-\2\u0278\u0279\7\24\2\2\u0279\u027b"+
		"\7\25\2\2\u027a\u0278\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2"+
		"\u027c\u027d\3\2\2\2\u027d\u0281\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0280"+
		"\7\33\2\2\u0280\u0282\5V,\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282"+
		"\u0285\3\2\2\2\u0283\u0286\5~@\2\u0284\u0286\7\3\2\2\u0285\u0283\3\2\2"+
		"\2\u0285\u0284\3\2\2\2\u0286E\3\2\2\2\u0287\u0288\7\62\2\2\u0288\u028d"+
		"\5\16\b\2\u0289\u028a\5\16\b\2\u028a\u028b\7\62\2\2\u028b\u028d\3\2\2"+
		"\2\u028c\u0287\3\2\2\2\u028c\u0289\3\2\2\2\u028d\u028f\3\2\2\2\u028e\u0290"+
		"\5\30\r\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0293\3\2\2\2"+
		"\u0291\u0294\5J&\2\u0292\u0294\7\30\2\2\u0293\u0291\3\2\2\2\u0293\u0292"+
		"\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\7f\2\2\u0296\u029b\5X-\2\u0297"+
		"\u0298\7\24\2\2\u0298\u029a\7\25\2\2\u0299\u0297\3\2\2\2\u029a\u029d\3"+
		"\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02a0\3\2\2\2\u029d"+
		"\u029b\3\2\2\2\u029e\u029f\7\33\2\2\u029f\u02a1\5V,\2\u02a0\u029e\3\2"+
		"\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a5\5~@\2\u02a3\u02a5"+
		"\7\3\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5G\3\2\2\2\u02a6"+
		"\u02a7\5\16\b\2\u02a7\u02a8\5J&\2\u02a8\u02ad\5@!\2\u02a9\u02aa\7\21\2"+
		"\2\u02aa\u02ac\5@!\2\u02ab\u02a9\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab"+
		"\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0"+
		"\u02b1\7\3\2\2\u02b1I\3\2\2\2\u02b2\u02b7\5L\'\2\u02b3\u02b4\7\24\2\2"+
		"\u02b4\u02b6\7\25\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5"+
		"\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02c3\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba"+
		"\u02bf\5P)\2\u02bb\u02bc\7\24\2\2\u02bc\u02be\7\25\2\2\u02bd\u02bb\3\2"+
		"\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0"+
		"\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02b2\3\2\2\2\u02c2\u02ba\3\2"+
		"\2\2\u02c3K\3\2\2\2\u02c4\u02c9\5N(\2\u02c5\u02c6\7\6\2\2\u02c6\u02c8"+
		"\5N(\2\u02c7\u02c5\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02caM\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02ce\5f\64\2"+
		"\u02cd\u02cc\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0"+
		"\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d4\7f\2\2\u02d3"+
		"\u02d5\5R*\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5O\3\2\2\2\u02d6"+
		"\u02d7\t\2\2\2\u02d7Q\3\2\2\2\u02d8\u02d9\7^\2\2\u02d9\u02de\5T+\2\u02da"+
		"\u02db\7\21\2\2\u02db\u02dd\5T+\2\u02dc\u02da\3\2\2\2\u02dd\u02e0\3\2"+
		"\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0"+
		"\u02de\3\2\2\2\u02e1\u02e2\7]\2\2\u02e2\u02e6\3\2\2\2\u02e3\u02e4\7^\2"+
		"\2\u02e4\u02e6\7]\2\2\u02e5\u02d8\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6S\3"+
		"\2\2\2\u02e7\u02ee\5J&\2\u02e8\u02eb\7)\2\2\u02e9\u02ea\t\3\2\2\u02ea"+
		"\u02ec\5J&\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2\2"+
		"\2\u02ed\u02e7\3\2\2\2\u02ed\u02e8\3\2\2\2\u02eeU\3\2\2\2\u02ef\u02f4"+
		"\5b\62\2\u02f0\u02f1\7\21\2\2\u02f1\u02f3\5b\62\2\u02f2\u02f0\3\2\2\2"+
		"\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5W\3"+
		"\2\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02f9\7\26\2\2\u02f8\u02fa\5Z.\2\u02f9"+
		"\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\7\27"+
		"\2\2\u02fcY\3\2\2\2\u02fd\u02fe\5^\60\2\u02fe\u02ff\b.\1\2\u02ff\u0315"+
		"\3\2\2\2\u0300\u0305\5\\/\2\u0301\u0302\7\21\2\2\u0302\u0304\5\\/\2\u0303"+
		"\u0301\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2"+
		"\2\2\u0306\u0308\3\2\2\2\u0307\u0305\3\2\2\2\u0308\u0309\b.\1\2\u0309"+
		"\u0315\3\2\2\2\u030a\u030b\5\\/\2\u030b\u030c\7\21\2\2\u030c\u030e\3\2"+
		"\2\2\u030d\u030a\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u030d\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\5^\60\2\u0312\u0313\b."+
		"\1\2\u0313\u0315\3\2\2\2\u0314\u02fd\3\2\2\2\u0314\u0300\3\2\2\2\u0314"+
		"\u030d\3\2\2\2\u0315[\3\2\2\2\u0316\u0317\5\22\n\2\u0317\u0318\5J&\2\u0318"+
		"\u031d\7f\2\2\u0319\u031a\7\24\2\2\u031a\u031c\7\25\2\2\u031b\u0319\3"+
		"\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"]\3\2\2\2\u031f\u031d\3\2\2\2\u0320\u0321\5\22\n\2\u0321\u0322\5J&\2\u0322"+
		"\u0323\7+\2\2\u0323\u0324\7f\2\2\u0324_\3\2\2\2\u0325\u0327\5\u00f2z\2"+
		"\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329"+
		"\t\4\2\2\u0329\u032a\5\u00f4{\2\u032a\u032b\7\3\2\2\u032b\u0336\3\2\2"+
		"\2\u032c\u032d\5\u00d8m\2\u032d\u032f\7\6\2\2\u032e\u0330\5\u00f2z\2\u032f"+
		"\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\7-"+
		"\2\2\u0332\u0333\5\u00f4{\2\u0333\u0334\7\3\2\2\u0334\u0336\3\2\2\2\u0335"+
		"\u0326\3\2\2\2\u0335\u032c\3\2\2\2\u0336a\3\2\2\2\u0337\u033c\7f\2\2\u0338"+
		"\u0339\7\6\2\2\u0339\u033b\7f\2\2\u033a\u0338\3\2\2\2\u033b\u033e\3\2"+
		"\2\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033dc\3\2\2\2\u033e\u033c"+
		"\3\2\2\2\u033f\u0341\5f\64\2\u0340\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342"+
		"\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343e\3\2\2\2\u0344\u0348\5h\65\2"+
		"\u0345\u0348\5j\66\2\u0346\u0348\5l\67\2\u0347\u0344\3\2\2\2\u0347\u0345"+
		"\3\2\2\2\u0347\u0346\3\2\2\2\u0348g\3\2\2\2\u0349\u034a\7\61\2\2\u034a"+
		"\u034b\5b\62\2\u034bi\3\2\2\2\u034c\u034d\7\61\2\2\u034d\u034e\5b\62\2"+
		"\u034e\u034f\7\26\2\2\u034f\u0350\5r:\2\u0350\u0351\7\27\2\2\u0351k\3"+
		"\2\2\2\u0352\u0353\7\61\2\2\u0353\u0354\5b\62\2\u0354\u0356\7\26\2\2\u0355"+
		"\u0357\5n8\2\u0356\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2"+
		"\2\u0358\u0359\7\27\2\2\u0359m\3\2\2\2\u035a\u035f\5p9\2\u035b\u035c\7"+
		"\21\2\2\u035c\u035e\5p9\2\u035d\u035b\3\2\2\2\u035e\u0361\3\2\2\2\u035f"+
		"\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360o\3\2\2\2\u0361\u035f\3\2\2\2"+
		"\u0362\u0363\7f\2\2\u0363\u0364\7\34\2\2\u0364\u0365\5r:\2\u0365q\3\2"+
		"\2\2\u0366\u036a\5\u00b0Y\2\u0367\u036a\5f\64\2\u0368\u036a\5t;\2\u0369"+
		"\u0366\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u0368\3\2\2\2\u036as\3\2\2\2"+
		"\u036b\u0374\7\22\2\2\u036c\u0371\5r:\2\u036d\u036e\7\21\2\2\u036e\u0370"+
		"\5r:\2\u036f\u036d\3\2\2\2\u0370\u0373\3\2\2\2\u0371\u036f\3\2\2\2\u0371"+
		"\u0372\3\2\2\2\u0372\u0375\3\2\2\2\u0373\u0371\3\2\2\2\u0374\u036c\3\2"+
		"\2\2\u0374\u0375\3\2\2\2\u0375\u0377\3\2\2\2\u0376\u0378\7\21\2\2\u0377"+
		"\u0376\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\7\23"+
		"\2\2\u037au\3\2\2\2\u037b\u037c\5\16\b\2\u037c\u037d\7\61\2\2\u037d\u037e"+
		"\7\31\2\2\u037e\u037f\7f\2\2\u037f\u0380\5x=\2\u0380w\3\2\2\2\u0381\u0385"+
		"\7\22\2\2\u0382\u0384\5z>\2\u0383\u0382\3\2\2\2\u0384\u0387\3\2\2\2\u0385"+
		"\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\3\2\2\2\u0387\u0385\3\2"+
		"\2\2\u0388\u0389\7\23\2\2\u0389y\3\2\2\2\u038a\u0392\5|?\2\u038b\u0392"+
		"\5H%\2\u038c\u0392\5\26\f\2\u038d\u0392\5,\27\2\u038e\u0392\5 \21\2\u038f"+
		"\u0392\5v<\2\u0390\u0392\7\3\2\2\u0391\u038a\3\2\2\2\u0391\u038b\3\2\2"+
		"\2\u0391\u038c\3\2\2\2\u0391\u038d\3\2\2\2\u0391\u038e\3\2\2\2\u0391\u038f"+
		"\3\2\2\2\u0391\u0390\3\2\2\2\u0392{\3\2\2\2\u0393\u0394\5\16\b\2\u0394"+
		"\u0395\5J&\2\u0395\u0396\7f\2\2\u0396\u0397\7\26\2\2\u0397\u039a\7\27"+
		"\2\2\u0398\u0399\7\62\2\2\u0399\u039b\5r:\2\u039a\u0398\3\2\2\2\u039a"+
		"\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\7\3\2\2\u039d}\3\2\2\2"+
		"\u039e\u03a2\7\22\2\2\u039f\u03a1\5\u0080A\2\u03a0\u039f\3\2\2\2\u03a1"+
		"\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\3\2"+
		"\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03a6\7\23\2\2\u03a6\177\3\2\2\2\u03a7"+
		"\u03ab\5\u0082B\2\u03a8\u03ab\5\f\7\2\u03a9\u03ab\5\u0086D\2\u03aa\u03a7"+
		"\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03a9\3\2\2\2\u03ab\u0081\3\2\2\2\u03ac"+
		"\u03ad\5\u0084C\2\u03ad\u03ae\7\3\2\2\u03ae\u0083\3\2\2\2\u03af\u03b0"+
		"\5\22\n\2\u03b0\u03b1\5J&\2\u03b1\u03b6\5@!\2\u03b2\u03b3\7\21\2\2\u03b3"+
		"\u03b5\5@!\2\u03b4\u03b2\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4\3\2\2"+
		"\2\u03b6\u03b7\3\2\2\2\u03b7\u0085\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9\u03fa"+
		"\5~@\2\u03ba\u03bb\7C\2\2\u03bb\u03be\5\u00acW\2\u03bc\u03bd\7\64\2\2"+
		"\u03bd\u03bf\5\u00acW\2\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf"+
		"\u03c0\3\2\2\2\u03c0\u03c1\7\3\2\2\u03c1\u03fa\3\2\2\2\u03c2\u03c3\7\65"+
		"\2\2\u03c3\u03c4\5\u00a8U\2\u03c4\u03c7\5\u0086D\2\u03c5\u03c6\7\66\2"+
		"\2\u03c6\u03c8\5\u0086D\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8"+
		"\u03fa\3\2\2\2\u03c9\u03fa\5\u00a0Q\2\u03ca\u03cb\78\2\2\u03cb\u03cc\5"+
		"\u00a8U\2\u03cc\u03cd\5\u0086D\2\u03cd\u03fa\3\2\2\2\u03ce\u03cf\79\2"+
		"\2\u03cf\u03d0\5\u0086D\2\u03d0\u03d1\78\2\2\u03d1\u03d2\5\u00a8U\2\u03d2"+
		"\u03d3\7\3\2\2\u03d3\u03fa\3\2\2\2\u03d4\u03fa\5\u0090I\2\u03d5\u03d6"+
		"\7<\2\2\u03d6\u03d7\5\u00a8U\2\u03d7\u03d8\7\22\2\2\u03d8\u03d9\5\u008a"+
		"F\2\u03d9\u03da\7\23\2\2\u03da\u03fa\3\2\2\2\u03db\u03dc\7\36\2\2\u03dc"+
		"\u03dd\5\u00a8U\2\u03dd\u03de\5~@\2\u03de\u03fa\3\2\2\2\u03df\u03e1\7"+
		"=\2\2\u03e0\u03e2\5\u00acW\2\u03e1\u03e0\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2"+
		"\u03e3\3\2\2\2\u03e3\u03fa\7\3\2\2\u03e4\u03e5\7\32\2\2\u03e5\u03e6\5"+
		"\u00acW\2\u03e6\u03e7\7\3\2\2\u03e7\u03fa\3\2\2\2\u03e8\u03ea\7>\2\2\u03e9"+
		"\u03eb\7f\2\2\u03ea\u03e9\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\3\2"+
		"\2\2\u03ec\u03fa\7\3\2\2\u03ed\u03ef\7?\2\2\u03ee\u03f0\7f\2\2\u03ef\u03ee"+
		"\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03fa\7\3\2\2\u03f2"+
		"\u03f3\5\u00acW\2\u03f3\u03f4\7\3\2\2\u03f4\u03fa\3\2\2\2\u03f5\u03f6"+
		"\7f\2\2\u03f6\u03f7\7\64\2\2\u03f7\u03fa\5\u0086D\2\u03f8\u03fa\5\u0088"+
		"E\2\u03f9\u03b9\3\2\2\2\u03f9\u03ba\3\2\2\2\u03f9\u03c2\3\2\2\2\u03f9"+
		"\u03c9\3\2\2\2\u03f9\u03ca\3\2\2\2\u03f9\u03ce\3\2\2\2\u03f9\u03d4\3\2"+
		"\2\2\u03f9\u03d5\3\2\2\2\u03f9\u03db\3\2\2\2\u03f9\u03df\3\2\2\2\u03f9"+
		"\u03e4\3\2\2\2\u03f9\u03e8\3\2\2\2\u03f9\u03ed\3\2\2\2\u03f9\u03f2\3\2"+
		"\2\2\u03f9\u03f5\3\2\2\2\u03f9\u03f8\3\2\2\2\u03fa\u0087\3\2\2\2\u03fb"+
		"\u03fc\7\3\2\2\u03fc\u0089\3\2\2\2\u03fd\u03ff\5\u008cG\2\u03fe\u03fd"+
		"\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2\2\2\u0400\u0401\3\2\2\2\u0401"+
		"\u008b\3\2\2\2\u0402\u0400\3\2\2\2\u0403\u0407\5\u008eH\2\u0404\u0406"+
		"\5\u0080A\2\u0405\u0404\3\2\2\2\u0406\u0409\3\2\2\2\u0407\u0405\3\2\2"+
		"\2\u0407\u0408\3\2\2\2\u0408\u008d\3\2\2\2\u0409\u0407\3\2\2\2\u040a\u040b"+
		"\7A\2\2\u040b\u040c\5\u00acW\2\u040c\u040d\7\64\2\2\u040d\u0411\3\2\2"+
		"\2\u040e\u040f\7\62\2\2\u040f\u0411\7\64\2\2\u0410\u040a\3\2\2\2\u0410"+
		"\u040e\3\2\2\2\u0411\u008f\3\2\2\2\u0412\u0413\7:\2\2\u0413\u0414\5~@"+
		"\2\u0414\u0415\bI\1\2\u0415\u042c\3\2\2\2\u0416\u0417\7:\2\2\u0417\u0418"+
		"\5~@\2\u0418\u0419\5\u009aN\2\u0419\u041a\7;\2\2\u041a\u041b\5~@\2\u041b"+
		"\u041c\bI\1\2\u041c\u042c\3\2\2\2\u041d\u041e\7:\2\2\u041e\u041f\5~@\2"+
		"\u041f\u0420\5\u009aN\2\u0420\u0421\bI\1\2\u0421\u042c\3\2\2\2\u0422\u0423"+
		"\7:\2\2\u0423\u0424\5~@\2\u0424\u0425\7;\2\2\u0425\u0426\5~@\2\u0426\u0427"+
		"\bI\1\2\u0427\u042c\3\2\2\2\u0428\u0429\5\u0092J\2\u0429\u042a\bI\1\2"+
		"\u042a\u042c\3\2\2\2\u042b\u0412\3\2\2\2\u042b\u0416\3\2\2\2\u042b\u041d"+
		"\3\2\2\2\u042b\u0422\3\2\2\2\u042b\u0428\3\2\2\2\u042c\u0091\3\2\2\2\u042d"+
		"\u042e\7:\2\2\u042e\u042f\5\u0094K\2\u042f\u0431\5~@\2\u0430\u0432\5\u009a"+
		"N\2\u0431\u0430\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0435\3\2\2\2\u0433"+
		"\u0434\7;\2\2\u0434\u0436\5~@\2\u0435\u0433\3\2\2\2\u0435\u0436\3\2\2"+
		"\2\u0436\u0093\3\2\2\2\u0437\u0438\7\26\2\2\u0438\u043a\5\u0096L\2\u0439"+
		"\u043b\7\3\2\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043c\3\2"+
		"\2\2\u043c\u043d\7\27\2\2\u043d\u0095\3\2\2\2\u043e\u0443\5\u0098M\2\u043f"+
		"\u0440\7\3\2\2\u0440\u0442\5\u0098M\2\u0441\u043f\3\2\2\2\u0442\u0445"+
		"\3\2\2\2\u0443\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0097\3\2\2\2\u0445"+
		"\u0443\3\2\2\2\u0446\u0448\5\22\n\2\u0447\u0446\3\2\2\2\u0447\u0448\3"+
		"\2\2\2\u0448\u0449\3\2\2\2\u0449\u044a\5J&\2\u044a\u044b\7f\2\2\u044b"+
		"\u044c\7\34\2\2\u044c\u044d\5\u00acW\2\u044d\u0099\3\2\2\2\u044e\u0452"+
		"\5\u009cO\2\u044f\u0451\5\u009cO\2\u0450\u044f\3\2\2\2\u0451\u0454\3\2"+
		"\2\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u009b\3\2\2\2\u0454"+
		"\u0452\3\2\2\2\u0455\u0456\7@\2\2\u0456\u0457\7\26\2\2\u0457\u0458\5\u009e"+
		"P\2\u0458\u0459\7\27\2\2\u0459\u045a\5~@\2\u045a\u009d\3\2\2\2\u045b\u045c"+
		"\5\22\n\2\u045c\u0461\5J&\2\u045d\u045e\7R\2\2\u045e\u0460\5J&\2\u045f"+
		"\u045d\3\2\2\2\u0460\u0463\3\2\2\2\u0461\u045f\3\2\2\2\u0461\u0462\3\2"+
		"\2\2\u0462\u0464\3\2\2\2\u0463\u0461\3\2\2\2\u0464\u0469\7f\2\2\u0465"+
		"\u0466\7\24\2\2\u0466\u0468\7\25\2\2\u0467\u0465\3\2\2\2\u0468\u046b\3"+
		"\2\2\2\u0469\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u009f\3\2\2\2\u046b"+
		"\u0469\3\2\2\2\u046c\u046f\5\u00a2R\2\u046d\u046f\5\u00a4S\2\u046e\u046c"+
		"\3\2\2\2\u046e\u046d\3\2\2\2\u046f\u00a1\3\2\2\2\u0470\u0471\7\67\2\2"+
		"\u0471\u0472\7\26\2\2\u0472\u0473\5\22\n\2\u0473\u0474\5J&\2\u0474\u0475"+
		"\7f\2\2\u0475\u0476\7\64\2\2\u0476\u0477\5\u00acW\2\u0477\u0478\7\27\2"+
		"\2\u0478\u0479\5\u0086D\2\u0479\u00a3\3\2\2\2\u047a\u047b\7\67\2\2\u047b"+
		"\u047d\7\26\2\2\u047c\u047e\5\u00a6T\2\u047d\u047c\3\2\2\2\u047d\u047e"+
		"\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0481\7\3\2\2\u0480\u0482\5\u00acW"+
		"\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0485"+
		"\7\3\2\2\u0484\u0486\5\u00aaV\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2"+
		"\2\u0486\u0487\3\2\2\2\u0487\u0488\7\27\2\2\u0488\u0489\5\u0086D\2\u0489"+
		"\u00a5\3\2\2\2\u048a\u048d\5\u0084C\2\u048b\u048d\5\u00aaV\2\u048c\u048a"+
		"\3\2\2\2\u048c\u048b\3\2\2\2\u048d\u00a7\3\2\2\2\u048e\u048f\7\26\2\2"+
		"\u048f\u0490\5\u00acW\2\u0490\u0491\7\27\2\2\u0491\u00a9\3\2\2\2\u0492"+
		"\u0497\5\u00acW\2\u0493\u0494\7\21\2\2\u0494\u0496\5\u00acW\2\u0495\u0493"+
		"\3\2\2\2\u0496\u0499\3\2\2\2\u0497\u0495\3\2\2\2\u0497\u0498\3\2\2\2\u0498"+
		"\u00ab\3\2\2\2\u0499\u0497\3\2\2\2\u049a\u049e\5\u0112\u008a\2\u049b\u049c"+
		"\5\u00aeX\2\u049c\u049d\5\u00acW\2\u049d\u049f\3\2\2\2\u049e\u049b\3\2"+
		"\2\2\u049e\u049f\3\2\2\2\u049f\u00ad\3\2\2\2\u04a0\u04a1\7\34\2\2\u04a1"+
		"\u04c0\bX\1\2\u04a2\u04a3\7V\2\2\u04a3\u04c0\bX\1\2\u04a4\u04a5\7W\2\2"+
		"\u04a5\u04c0\bX\1\2\u04a6\u04a7\7X\2\2\u04a7\u04c0\bX\1\2\u04a8\u04a9"+
		"\7Y\2\2\u04a9\u04c0\bX\1\2\u04aa\u04ab\7Z\2\2\u04ab\u04c0\bX\1\2\u04ac"+
		"\u04ad\7[\2\2\u04ad\u04c0\bX\1\2\u04ae\u04af\7U\2\2\u04af\u04c0\bX\1\2"+
		"\u04b0\u04b1\7\\\2\2\u04b1\u04c0\bX\1\2\u04b2\u04b3\7^\2\2\u04b3\u04b4"+
		"\7^\2\2\u04b4\u04b5\7\34\2\2\u04b5\u04c0\bX\1\2\u04b6\u04b7\7]\2\2\u04b7"+
		"\u04b8\7]\2\2\u04b8\u04b9\7]\2\2\u04b9\u04ba\7\34\2\2\u04ba\u04c0\bX\1"+
		"\2\u04bb\u04bc\7]\2\2\u04bc\u04bd\7]\2\2\u04bd\u04be\7\34\2\2\u04be\u04c0"+
		"\bX\1\2\u04bf\u04a0\3\2\2\2\u04bf\u04a2\3\2\2\2\u04bf\u04a4\3\2\2\2\u04bf"+
		"\u04a6\3\2\2\2\u04bf\u04a8\3\2\2\2\u04bf\u04aa\3\2\2\2\u04bf\u04ac\3\2"+
		"\2\2\u04bf\u04ae\3\2\2\2\u04bf\u04b0\3\2\2\2\u04bf\u04b2\3\2\2\2\u04bf"+
		"\u04b6\3\2\2\2\u04bf\u04bb\3\2\2\2\u04c0\u00af\3\2\2\2\u04c1\u04c7\5\u00b2"+
		"Z\2\u04c2\u04c3\7)\2\2\u04c3\u04c4\5\u00acW\2\u04c4\u04c5\7\64\2\2\u04c5"+
		"\u04c6\5\u00acW\2\u04c6\u04c8\3\2\2\2\u04c7\u04c2\3\2\2\2\u04c7\u04c8"+
		"\3\2\2\2\u04c8\u00b1\3\2\2\2\u04c9\u04ce\5\u00b4[\2\u04ca\u04cb\7T\2\2"+
		"\u04cb\u04cd\5\u00b4[\2\u04cc\u04ca\3\2\2\2\u04cd\u04d0\3\2\2\2\u04ce"+
		"\u04cc\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u00b3\3\2\2\2\u04d0\u04ce\3\2"+
		"\2\2\u04d1\u04d6\5\u00b6\\\2\u04d2\u04d3\7S\2\2\u04d3\u04d5\5\u00b6\\"+
		"\2\u04d4\u04d2\3\2\2\2\u04d5\u04d8\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d6\u04d7"+
		"\3\2\2\2\u04d7\u00b5\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d9\u04de\5\u00b8]"+
		"\2\u04da\u04db\7R\2\2\u04db\u04dd\5\u00b8]\2\u04dc\u04da\3\2\2\2\u04dd"+
		"\u04e0\3\2\2\2\u04de\u04dc\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u00b7\3\2"+
		"\2\2\u04e0\u04de\3\2\2\2\u04e1\u04e6\5\u00ba^\2\u04e2\u04e3\7Q\2\2\u04e3"+
		"\u04e5\5\u00ba^\2\u04e4\u04e2\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6\u04e4"+
		"\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u00b9\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e9"+
		"\u04ee\5\u00bc_\2\u04ea\u04eb\7P\2\2\u04eb\u04ed\5\u00bc_\2\u04ec\u04ea"+
		"\3\2\2\2\u04ed\u04f0\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef"+
		"\u00bb\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f1\u04f6\5\u00be`\2\u04f2\u04f3"+
		"\7N\2\2\u04f3\u04f5\5\u00be`\2\u04f4\u04f2\3\2\2\2\u04f5\u04f8\3\2\2\2"+
		"\u04f6\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u00bd\3\2\2\2\u04f8\u04f6"+
		"\3\2\2\2\u04f9\u04fe\5\u00c0a\2\u04fa\u04fb\7O\2\2\u04fb\u04fd\5\u00c0"+
		"a\2\u04fc\u04fa\3\2\2\2\u04fd\u0500\3\2\2\2\u04fe\u04fc\3\2\2\2\u04fe"+
		"\u04ff\3\2\2\2\u04ff\u00bf\3\2\2\2\u0500\u04fe\3\2\2\2\u0501\u0504\5\u00c2"+
		"b\2\u0502\u0503\7_\2\2\u0503\u0505\5J&\2\u0504\u0502\3\2\2\2\u0504\u0505"+
		"\3\2\2\2\u0505\u00c1\3\2\2\2\u0506\u050c\5\u00c6d\2\u0507\u0508\5\u00c4"+
		"c\2\u0508\u0509\5\u00c6d\2\u0509\u050b\3\2\2\2\u050a\u0507\3\2\2\2\u050b"+
		"\u050e\3\2\2\2\u050c\u050a\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u00c3\3\2"+
		"\2\2\u050e\u050c\3\2\2\2\u050f\u0510\7^\2\2\u0510\u0511\7\34\2\2\u0511"+
		"\u051a\bc\1\2\u0512\u0513\7]\2\2\u0513\u0514\7\34\2\2\u0514\u051a\bc\1"+
		"\2\u0515\u0516\7^\2\2\u0516\u051a\bc\1\2\u0517\u0518\7]\2\2\u0518\u051a"+
		"\bc\1\2\u0519\u050f\3\2\2\2\u0519\u0512\3\2\2\2\u0519\u0515\3\2\2\2\u0519"+
		"\u0517\3\2\2\2\u051a\u00c5\3\2\2\2\u051b\u0521\5\u00caf\2\u051c\u051d"+
		"\5\u00c8e\2\u051d\u051e\5\u00caf\2\u051e\u0520\3\2\2\2\u051f\u051c\3\2"+
		"\2\2\u0520\u0523\3\2\2\2\u0521\u051f\3\2\2\2\u0521\u0522\3\2\2\2\u0522"+
		"\u00c7\3\2\2\2\u0523\u0521\3\2\2\2\u0524\u0525\7^\2\2\u0525\u0526\7^\2"+
		"\2\u0526\u052f\be\1\2\u0527\u0528\7]\2\2\u0528\u0529\7]\2\2\u0529\u052a"+
		"\7]\2\2\u052a\u052f\be\1\2\u052b\u052c\7]\2\2\u052c\u052d\7]\2\2\u052d"+
		"\u052f\be\1\2\u052e\u0524\3\2\2\2\u052e\u0527\3\2\2\2\u052e\u052b\3\2"+
		"\2\2\u052f\u00c9\3\2\2\2\u0530\u0536\5\u00ceh\2\u0531\u0532\5\u00ccg\2"+
		"\u0532\u0533\5\u00ceh\2\u0533\u0535\3\2\2\2\u0534\u0531\3\2\2\2\u0535"+
		"\u0538\3\2\2\2\u0536\u0534\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u00cb\3\2"+
		"\2\2\u0538\u0536\3\2\2\2\u0539\u053a\7L\2\2\u053a\u053e\bg\1\2\u053b\u053c"+
		"\7M\2\2\u053c\u053e\bg\1\2\u053d\u0539\3\2\2\2\u053d\u053b\3\2\2\2\u053e"+
		"\u00cd\3\2\2\2\u053f\u0545\5\u00d2j\2\u0540\u0541\5\u00d0i\2\u0541\u0542"+
		"\5\u00d2j\2\u0542\u0544\3\2\2\2\u0543\u0540\3\2\2\2\u0544\u0547\3\2\2"+
		"\2\u0545\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u00cf\3\2\2\2\u0547\u0545"+
		"\3\2\2\2\u0548\u0549\7\7\2\2\u0549\u054f\bi\1\2\u054a\u054b\7J\2\2\u054b"+
		"\u054f\bi\1\2\u054c\u054d\7K\2\2\u054d\u054f\bi\1\2\u054e\u0548\3\2\2"+
		"\2\u054e\u054a\3\2\2\2\u054e\u054c\3\2\2\2\u054f\u00d1\3\2\2\2\u0550\u0551"+
		"\7L\2\2\u0551\u055e\5\u00d2j\2\u0552\u0553\7M\2\2\u0553\u055e\5\u00d2"+
		"j\2\u0554\u0555\7E\2\2\u0555\u055e\5\u00d2j\2\u0556\u0557\7F\2\2\u0557"+
		"\u055e\5\u00d2j\2\u0558\u0559\7G\2\2\u0559\u055e\5\u00d2j\2\u055a\u055b"+
		"\7H\2\2\u055b\u055e\5\u00d2j\2\u055c\u055e\5\u00d4k\2\u055d\u0550\3\2"+
		"\2\2\u055d\u0552\3\2\2\2\u055d\u0554\3\2\2\2\u055d\u0556\3\2\2\2\u055d"+
		"\u0558\3\2\2\2\u055d\u055a\3\2\2\2\u055d\u055c\3\2\2\2\u055e\u00d3\3\2"+
		"\2\2\u055f\u056b\5\u00d6l\2\u0560\u0564\5\u00d8m\2\u0561\u0563\5\u00e2"+
		"r\2\u0562\u0561\3\2\2\2\u0563\u0566\3\2\2\2\u0564\u0562\3\2\2\2\u0564"+
		"\u0565\3\2\2\2\u0565\u0568\3\2\2\2\u0566\u0564\3\2\2\2\u0567\u0569\t\5"+
		"\2\2\u0568\u0567\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056b\3\2\2\2\u056a"+
		"\u055f\3\2\2\2\u056a\u0560\3\2\2\2\u056b\u00d5\3\2\2\2\u056c\u056d\7\26"+
		"\2\2\u056d\u056e\5P)\2\u056e\u056f\7\27\2\2\u056f\u0570\5\u00d2j\2\u0570"+
		"\u0593\3\2\2\2\u0571\u0572\7\26\2\2\u0572\u0576\5J&\2\u0573\u0575\5\36"+
		"\20\2\u0574\u0573\3\2\2\2\u0575\u0578\3\2\2\2\u0576\u0574\3\2\2\2\u0576"+
		"\u0577\3\2\2\2\u0577\u0579\3\2\2\2\u0578\u0576\3\2\2\2\u0579\u057a\7\27"+
		"\2\2\u057a\u057b\5\u00d4k\2\u057b\u0593\3\2\2\2\u057c\u057d\7\26\2\2\u057d"+
		"\u0581\5J&\2\u057e\u0580\5\36\20\2\u057f\u057e\3\2\2\2\u0580\u0583\3\2"+
		"\2\2\u0581\u057f\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0584\3\2\2\2\u0583"+
		"\u0581\3\2\2\2\u0584\u0585\7\27\2\2\u0585\u0586\5\u010c\u0087\2\u0586"+
		"\u0593\3\2\2\2\u0587\u0588\7\26\2\2\u0588\u058c\5J&\2\u0589\u058b\5\36"+
		"\20\2\u058a\u0589\3\2\2\2\u058b\u058e\3\2\2\2\u058c\u058a\3\2\2\2\u058c"+
		"\u058d\3\2\2\2\u058d\u058f\3\2\2\2\u058e\u058c\3\2\2\2\u058f\u0590\7\27"+
		"\2\2\u0590\u0591\5\u0112\u008a\2\u0591\u0593\3\2\2\2\u0592\u056c\3\2\2"+
		"\2\u0592\u0571\3\2\2\2\u0592\u057c\3\2\2\2\u0592\u0587\3\2\2\2\u0593\u00d7"+
		"\3\2\2\2\u0594\u0595\5\u00a8U\2\u0595\u0596\bm\1\2\u0596\u05ca\3\2\2\2"+
		"\u0597\u059c\7,\2\2\u0598\u0599\7\6\2\2\u0599\u059b\7f\2\2\u059a\u0598"+
		"\3\2\2\2\u059b\u059e\3\2\2\2\u059c\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d"+
		"\u05a0\3\2\2\2\u059e\u059c\3\2\2\2\u059f\u05a1\5\u00dco\2\u05a0\u059f"+
		"\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05ca\bm\1\2\u05a3"+
		"\u05a8\7f\2\2\u05a4\u05a5\7\6\2\2\u05a5\u05a7\7f\2\2\u05a6\u05a4\3\2\2"+
		"\2\u05a7\u05aa\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05ac"+
		"\3\2\2\2\u05aa\u05a8\3\2\2\2\u05ab\u05ad\5\u00dep\2\u05ac\u05ab\3\2\2"+
		"\2\u05ac\u05ad\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05ca\bm\1\2\u05af\u05b0"+
		"\7-\2\2\u05b0\u05b1\5\u00dan\2\u05b1\u05b2\bm\1\2\u05b2\u05ca\3\2\2\2"+
		"\u05b3\u05b4\5\u00f6|\2\u05b4\u05b5\bm\1\2\u05b5\u05ca\3\2\2\2\u05b6\u05b7"+
		"\5\u00e4s\2\u05b7\u05b8\bm\1\2\u05b8\u05ca\3\2\2\2\u05b9\u05be\5P)\2\u05ba"+
		"\u05bb\7\24\2\2\u05bb\u05bd\7\25\2\2\u05bc\u05ba\3\2\2\2\u05bd\u05c0\3"+
		"\2\2\2\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c1\3\2\2\2\u05c0"+
		"\u05be\3\2\2\2\u05c1\u05c2\7\6\2\2\u05c2\u05c3\7\b\2\2\u05c3\u05c4\bm"+
		"\1\2\u05c4\u05ca\3\2\2\2\u05c5\u05c6\7\30\2\2\u05c6\u05c7\7\6\2\2\u05c7"+
		"\u05c8\7\b\2\2\u05c8\u05ca\bm\1\2\u05c9\u0594\3\2\2\2\u05c9\u0597\3\2"+
		"\2\2\u05c9\u05a3\3\2\2\2\u05c9\u05af\3\2\2\2\u05c9\u05b3\3\2\2\2\u05c9"+
		"\u05b6\3\2\2\2\u05c9\u05b9\3\2\2\2\u05c9\u05c5\3\2\2\2\u05ca\u00d9\3\2"+
		"\2\2\u05cb\u05cd\7\6\2\2\u05cc\u05ce\5R*\2\u05cd\u05cc\3\2\2\2\u05cd\u05ce"+
		"\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d1\7f\2\2\u05d0\u05d2\5\u00f4{\2"+
		"\u05d1\u05d0\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u00db\3\2\2\2\u05d3\u05d4"+
		"\7\24\2\2\u05d4\u05d5\5\u00acW\2\u05d5\u05d6\7\25\2\2\u05d6\u05d8\3\2"+
		"\2\2\u05d7\u05d3\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05d7\3\2\2\2\u05d9"+
		"\u05da\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dc\bo\1\2\u05dc\u05ea\3\2"+
		"\2\2\u05dd\u05de\5\u00f4{\2\u05de\u05df\bo\1\2\u05df\u05ea\3\2\2\2\u05e0"+
		"\u05e1\7\6\2\2\u05e1\u05e2\5\u00f2z\2\u05e2\u05e3\7f\2\2\u05e3\u05e4\5"+
		"\u00f4{\2\u05e4\u05e5\bo\1\2\u05e5\u05ea\3\2\2\2\u05e6\u05e7\5\u00eex"+
		"\2\u05e7\u05e8\bo\1\2\u05e8\u05ea\3\2\2\2\u05e9\u05d7\3\2\2\2\u05e9\u05dd"+
		"\3\2\2\2\u05e9\u05e0\3\2\2\2\u05e9\u05e6\3\2\2\2\u05ea\u00dd\3\2\2\2\u05eb"+
		"\u05ec\7\24\2\2\u05ec\u05ee\7\25\2\2\u05ed\u05eb\3\2\2\2\u05ee\u05ef\3"+
		"\2\2\2\u05ef\u05ed\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1"+
		"\u05f2\7\6\2\2\u05f2\u05f3\7\b\2\2\u05f3\u0611\bp\1\2\u05f4\u05f5\7\24"+
		"\2\2\u05f5\u05f6\5\u00acW\2\u05f6\u05f7\7\25\2\2\u05f7\u05f9\3\2\2\2\u05f8"+
		"\u05f4\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fa\u05fb\3\2"+
		"\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fd\bp\1\2\u05fd\u0611\3\2\2\2\u05fe"+
		"\u05ff\5\u00f4{\2\u05ff\u0600\bp\1\2\u0600\u0611\3\2\2\2\u0601\u0602\7"+
		"\6\2\2\u0602\u0603\7\b\2\2\u0603\u0611\bp\1\2\u0604\u0605\7\6\2\2\u0605"+
		"\u0606\5\u00f2z\2\u0606\u0607\7f\2\2\u0607\u0608\5\u00f4{\2\u0608\u0609"+
		"\bp\1\2\u0609\u0611\3\2\2\2\u060a\u060b\7\6\2\2\u060b\u060c\7,\2\2\u060c"+
		"\u0611\bp\1\2\u060d\u060e\5\u00eex\2\u060e\u060f\bp\1\2\u060f\u0611\3"+
		"\2\2\2\u0610\u05ed\3\2\2\2\u0610\u05f8\3\2\2\2\u0610\u05fe\3\2\2\2\u0610"+
		"\u0601\3\2\2\2\u0610\u0604\3\2\2\2\u0610\u060a\3\2\2\2\u0610\u060d\3\2"+
		"\2\2\u0611\u00df\3\2\2\2\u0612\u0613\7\6\2\2\u0613\u0614\5R*\2\u0614\u0615"+
		"\7f\2\2\u0615\u0616\5\u00f4{\2\u0616\u00e1\3\2\2\2\u0617\u0618\7\6\2\2"+
		"\u0618\u061a\7f\2\2\u0619\u061b\5\u00f4{\2\u061a\u0619\3\2\2\2\u061a\u061b"+
		"\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u0631\br\1\2\u061d\u061e\7\6\2\2\u061e"+
		"\u061f\7,\2\2\u061f\u0631\br\1\2\u0620\u0621\7\6\2\2\u0621\u0622\7-\2"+
		"\2\u0622\u0623\5\u00dan\2\u0623\u0624\br\1\2\u0624\u0631\3\2\2\2\u0625"+
		"\u0626\5\u00eex\2\u0626\u0627\br\1\2\u0627\u0631\3\2\2\2\u0628\u0629\7"+
		"\24\2\2\u0629\u062a\5\u00acW\2\u062a\u062b\7\25\2\2\u062b\u062c\br\1\2"+
		"\u062c\u0631\3\2\2\2\u062d\u062e\5\u00e0q\2\u062e\u062f\br\1\2\u062f\u0631"+
		"\3\2\2\2\u0630\u0617\3\2\2\2\u0630\u061d\3\2\2\2\u0630\u0620\3\2\2\2\u0630"+
		"\u0625\3\2\2\2\u0630\u0628\3\2\2\2\u0630\u062d\3\2\2\2\u0631\u00e3\3\2"+
		"\2\2\u0632\u0633\7I\2\2\u0633\u0634\5\u00f2z\2\u0634\u0635\5L\'\2\u0635"+
		"\u0636\5\u00f0y\2\u0636\u063d\3\2\2\2\u0637\u0638\7I\2\2\u0638\u0639\5"+
		"L\'\2\u0639\u063a\5\u00f0y\2\u063a\u063d\3\2\2\2\u063b\u063d\5\u00e6t"+
		"\2\u063c\u0632\3\2\2\2\u063c\u0637\3\2\2\2\u063c\u063b\3\2\2\2\u063d\u00e5"+
		"\3\2\2\2\u063e\u063f\7I\2\2\u063f\u0640\5\u00ecw\2\u0640\u0641\7\24\2"+
		"\2\u0641\u0646\7\25\2\2\u0642\u0643\7\24\2\2\u0643\u0645\7\25\2\2\u0644"+
		"\u0642\3\2\2\2\u0645\u0648\3\2\2\2\u0646\u0644\3\2\2\2\u0646\u0647\3\2"+
		"\2\2\u0647\u0649\3\2\2\2\u0648\u0646\3\2\2\2\u0649\u064a\5\u00eav\2\u064a"+
		"\u0661\3\2\2\2\u064b\u064c\7I\2\2\u064c\u064d\5\u00ecw\2\u064d\u064e\7"+
		"\24\2\2\u064e\u064f\5\u00acW\2\u064f\u0656\7\25\2\2\u0650\u0651\7\24\2"+
		"\2\u0651\u0652\5\u00acW\2\u0652\u0653\7\25\2\2\u0653\u0655\3\2\2\2\u0654"+
		"\u0650\3\2\2\2\u0655\u0658\3\2\2\2\u0656\u0654\3\2\2\2\u0656\u0657\3\2"+
		"\2\2\u0657\u065d\3\2\2\2\u0658\u0656\3\2\2\2\u0659\u065a\7\24\2\2\u065a"+
		"\u065c\7\25\2\2\u065b\u0659\3\2\2\2\u065c\u065f\3\2\2\2\u065d\u065b\3"+
		"\2\2\2\u065d\u065e\3\2\2\2\u065e\u0661\3\2\2\2\u065f\u065d\3\2\2\2\u0660"+
		"\u063e\3\2\2\2\u0660\u064b\3\2\2\2\u0661\u00e7\3\2\2\2\u0662\u0665\5\u00ea"+
		"v\2\u0663\u0665\5\u00acW\2\u0664\u0662\3\2\2\2\u0664\u0663\3\2\2\2\u0665"+
		"\u00e9\3\2\2\2\u0666\u066f\7\22\2\2\u0667\u066c\5\u00e8u\2\u0668\u0669"+
		"\7\21\2\2\u0669\u066b\5\u00e8u\2\u066a\u0668\3\2\2\2\u066b\u066e\3\2\2"+
		"\2\u066c\u066a\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u0670\3\2\2\2\u066e\u066c"+
		"\3\2\2\2\u066f\u0667\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0672\3\2\2\2\u0671"+
		"\u0673\7\21\2\2\u0672\u0671\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0674\3"+
		"\2\2\2\u0674\u0675\7\23\2\2\u0675\u00eb\3\2\2\2\u0676\u0679\5L\'\2\u0677"+
		"\u0679\5P)\2\u0678\u0676\3\2\2\2\u0678\u0677\3\2\2\2\u0679\u00ed\3\2\2"+
		"\2\u067a\u067b\7\6\2\2\u067b\u067d\7I\2\2\u067c\u067e\5\u00f2z\2\u067d"+
		"\u067c\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0680\5N"+
		"(\2\u0680\u0681\5\u00f0y\2\u0681\u00ef\3\2\2\2\u0682\u0684\5\u00f4{\2"+
		"\u0683\u0685\5\60\31\2\u0684\u0683\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u00f1"+
		"\3\2\2\2\u0686\u0687\7^\2\2\u0687\u0688\5.\30\2\u0688\u0689\7]\2\2\u0689"+
		"\u00f3\3\2\2\2\u068a\u068c\7\26\2\2\u068b\u068d\5\u00aaV\2\u068c\u068b"+
		"\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u068f\7\27\2\2"+
		"\u068f\u00f5\3\2\2\2\u0690\u0691\t\6\2\2\u0691\u00f7\3\2\2\2\u0692\u0693"+
		"\5\16\b\2\u0693\u0694\7\b\2\2\u0694\u0695\7f\2\2\u0695\u00f9\3\2\2\2\u0696"+
		"\u0697\5\16\b\2\u0697\u0698\t\7\2\2\u0698\u0699\7f\2\2\u0699\u00fb\3\2"+
		"\2\2\u069a\u069b\5\16\b\2\u069b\u069c\7\31\2\2\u069c\u069d\7f\2\2\u069d"+
		"\u00fd\3\2\2\2\u069e\u069f\5\16\b\2\u069f\u06a0\7\61\2\2\u06a0\u06a1\7"+
		"\31\2\2\u06a1\u06a2\7f\2\2\u06a2\u00ff\3\2\2\2\u06a3\u06aa\5\16\b\2\u06a4"+
		"\u06ab\7\b\2\2\u06a5\u06ab\7B\2\2\u06a6\u06a8\7\61\2\2\u06a7\u06a6\3\2"+
		"\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06ab\7\31\2\2\u06aa"+
		"\u06a4\3\2\2\2\u06aa\u06a5\3\2\2\2\u06aa\u06a7\3\2\2\2\u06ab\u06ac\3\2"+
		"\2\2\u06ac\u06ad\7f\2\2\u06ad\u0101\3\2\2\2\u06ae\u06b0\5\16\b\2\u06af"+
		"\u06b1\5\30\r\2\u06b0\u06af\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b4\3"+
		"\2\2\2\u06b2\u06b5\5J&\2\u06b3\u06b5\7\30\2\2\u06b4\u06b2\3\2\2\2\u06b4"+
		"\u06b3\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06b7\7f"+
		"\2\2\u06b7\u06b8\7\27\2\2\u06b8\u0103\3\2\2\2\u06b9\u06ba\5\16\b\2\u06ba"+
		"\u06bb\5J&\2\u06bb\u06c0\7f\2\2\u06bc\u06bd\7\24\2\2\u06bd\u06bf\7\25"+
		"\2\2\u06be\u06bc\3\2\2\2\u06bf\u06c2\3\2\2\2\u06c0\u06be\3\2\2\2\u06c0"+
		"\u06c1\3\2\2\2\u06c1\u06c3\3\2\2\2\u06c2\u06c0\3\2\2\2\u06c3\u06c4\t\b"+
		"\2\2\u06c4\u0105\3\2\2\2\u06c5\u06c6\5\22\n\2\u06c6\u06c7\5J&\2\u06c7"+
		"\u06cc\7f\2\2\u06c8\u06c9\7\24\2\2\u06c9\u06cb\7\25\2\2\u06ca\u06c8\3"+
		"\2\2\2\u06cb\u06ce\3\2\2\2\u06cc\u06ca\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd"+
		"\u06cf\3\2\2\2\u06ce\u06cc\3\2\2\2\u06cf\u06d0\t\b\2\2\u06d0\u0107\3\2"+
		"\2\2\u06d1\u06d3\7\26\2\2\u06d2\u06d4\5\u010a\u0086\2\u06d3\u06d2\3\2"+
		"\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d6\7\27\2\2\u06d6"+
		"\u0109\3\2\2\2\u06d7\u06dc\7f\2\2\u06d8\u06d9\7\21\2\2\u06d9\u06db\7f"+
		"\2\2\u06da\u06d8\3\2\2\2\u06db\u06de\3\2\2\2\u06dc\u06da\3\2\2\2\u06dc"+
		"\u06dd\3\2\2\2\u06dd\u010b\3\2\2\2\u06de\u06dc\3\2\2\2\u06df\u06e0\5\u010e"+
		"\u0088\2\u06e0\u06e1\7D\2\2\u06e1\u06e2\5\u0110\u0089\2\u06e2\u06e5\3"+
		"\2\2\2\u06e3\u06e5\5\u00b0Y\2\u06e4\u06df\3\2\2\2\u06e4\u06e3\3\2\2\2"+
		"\u06e5\u010d\3\2\2\2\u06e6\u06ea\7f\2\2\u06e7\u06ea\5X-\2\u06e8\u06ea"+
		"\5\u0108\u0085\2\u06e9\u06e6\3\2\2\2\u06e9\u06e7\3\2\2\2\u06e9\u06e8\3"+
		"\2\2\2\u06ea\u010f\3\2\2\2\u06eb\u06ee\5\u00acW\2\u06ec\u06ee\5~@\2\u06ed"+
		"\u06eb\3\2\2\2\u06ed\u06ec\3\2\2\2\u06ee\u0111\3\2\2\2\u06ef\u06f0\5\u0118"+
		"\u008d\2\u06f0\u06f2\7\63\2\2\u06f1\u06f3\5R*\2\u06f2\u06f1\3\2\2\2\u06f2"+
		"\u06f3\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f5\7f\2\2\u06f5\u071f\3\2"+
		"\2\2\u06f6\u06f7\5\u0114\u008b\2\u06f7\u06f9\7\63\2\2\u06f8\u06fa\5R*"+
		"\2\u06f9\u06f8\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fc"+
		"\7f\2\2\u06fc\u071f\3\2\2\2\u06fd\u06fe\5\u00d8m\2\u06fe\u0700\7\63\2"+
		"\2\u06ff\u0701\5R*\2\u0700\u06ff\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0702"+
		"\3\2\2\2\u0702\u0703\7f\2\2\u0703\u071f\3\2\2\2\u0704\u0705\7-\2\2\u0705"+
		"\u0707\7\63\2\2\u0706\u0708\5R*\2\u0707\u0706\3\2\2\2\u0707\u0708\3\2"+
		"\2\2\u0708\u0709\3\2\2\2\u0709\u071f\7f\2\2\u070a\u070b\5\u0118\u008d"+
		"\2\u070b\u070c\7\6\2\2\u070c\u070d\7-\2\2\u070d\u070f\7\63\2\2\u070e\u0710"+
		"\5R*\2\u070f\u070e\3\2\2\2\u070f\u0710\3\2\2\2\u0710\u0711\3\2\2\2\u0711"+
		"\u0712\7f\2\2\u0712\u071f\3\2\2\2\u0713\u0714\5L\'\2\u0714\u0716\7\63"+
		"\2\2\u0715\u0717\5R*\2\u0716\u0715\3\2\2\2\u0716\u0717\3\2\2\2\u0717\u0718"+
		"\3\2\2\2\u0718\u0719\7I\2\2\u0719\u071f\3\2\2\2\u071a\u071b\5\u011a\u008e"+
		"\2\u071b\u071c\7\63\2\2\u071c\u071d\7I\2\2\u071d\u071f\3\2\2\2\u071e\u06ef"+
		"\3\2\2\2\u071e\u06f6\3\2\2\2\u071e\u06fd\3\2\2\2\u071e\u0704\3\2\2\2\u071e"+
		"\u070a\3\2\2\2\u071e\u0713\3\2\2\2\u071e\u071a\3\2\2\2\u071f\u0722\3\2"+
		"\2\2\u0720\u0722\5\u010c\u0087\2\u0721\u071e\3\2\2\2\u0721\u0720\3\2\2"+
		"\2\u0722\u0113\3\2\2\2\u0723\u0727\5L\'\2\u0724\u0727\5\u0116\u008c\2"+
		"\u0725\u0727\5\u011a\u008e\2\u0726\u0723\3\2\2\2\u0726\u0724\3\2\2\2\u0726"+
		"\u0725\3\2\2\2\u0727\u0115\3\2\2\2\u0728\u072a\5f\64\2\u0729\u0728\3\2"+
		"\2\2\u072a\u072d\3\2\2\2\u072b\u0729\3\2\2\2\u072b\u072c\3\2\2\2\u072c"+
		"\u072e\3\2\2\2\u072d\u072b\3\2\2\2\u072e\u072f\7f\2\2\u072f\u0117\3\2"+
		"\2\2\u0730\u0735\7f\2\2\u0731\u0732\7\6\2\2\u0732\u0734\7f\2\2\u0733\u0731"+
		"\3\2\2\2\u0734\u0737\3\2\2\2\u0735\u0733\3\2\2\2\u0735\u0736\3\2\2\2\u0736"+
		"\u0119\3\2\2\2\u0737\u0735\3\2\2\2\u0738\u0739\5P)\2\u0739\u073a\5\u011c"+
		"\u008f\2\u073a\u0742\3\2\2\2\u073b\u073c\5L\'\2\u073c\u073d\5\u011c\u008f"+
		"\2\u073d\u0742\3\2\2\2\u073e\u073f\5\u0116\u008c\2\u073f\u0740\5\u011c"+
		"\u008f\2\u0740\u0742\3\2\2\2\u0741\u0738\3\2\2\2\u0741\u073b\3\2\2\2\u0741"+
		"\u073e\3\2\2\2\u0742\u011b\3\2\2\2\u0743\u0745\5f\64\2\u0744\u0743\3\2"+
		"\2\2\u0745\u0748\3\2\2\2\u0746\u0744\3\2\2\2\u0746\u0747\3\2\2\2\u0747"+
		"\u0749\3\2\2\2\u0748\u0746\3\2\2\2\u0749\u074a\7\24\2\2\u074a\u0755\7"+
		"\25\2\2\u074b\u074d\5f\64\2\u074c\u074b\3\2\2\2\u074d\u0750\3\2\2\2\u074e"+
		"\u074c\3\2\2\2\u074e\u074f\3\2\2\2\u074f\u0751\3\2\2\2\u0750\u074e\3\2"+
		"\2\2\u0751\u0752\7\24\2\2\u0752\u0754\7\25\2\2\u0753\u074e\3\2\2\2\u0754"+
		"\u0757\3\2\2\2\u0755\u0753\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u011d\3\2"+
		"\2\2\u0757\u0755\3\2\2\2\u00d1\u011f\u0124\u012a\u012e\u0136\u013e\u0145"+
		"\u0149\u014c\u0153\u0158\u015c\u0161\u0170\u0175\u0179\u017e\u0183\u0189"+
		"\u018d\u0191\u019b\u01a6\u01a9\u01b0\u01bb\u01c1\u01c4\u01c7\u01d0\u01d4"+
		"\u01d8\u01db\u01e1\u01e6\u01ec\u01f0\u01f9\u0200\u0209\u0210\u0214\u021b"+
		"\u021f\u0223\u022b\u0230\u0234\u0238\u023e\u0244\u0249\u0255\u025f\u0264"+
		"\u026c\u0270\u0274\u027c\u0281\u0285\u028c\u028f\u0293\u029b\u02a0\u02a4"+
		"\u02ad\u02b7\u02bf\u02c2\u02c9\u02cf\u02d4\u02de\u02e5\u02eb\u02ed\u02f4"+
		"\u02f9\u0305\u030f\u0314\u031d\u0326\u032f\u0335\u033c\u0342\u0347\u0356"+
		"\u035f\u0369\u0371\u0374\u0377\u0385\u0391\u039a\u03a2\u03aa\u03b6\u03be"+
		"\u03c7\u03e1\u03ea\u03ef\u03f9\u0400\u0407\u0410\u042b\u0431\u0435\u043a"+
		"\u0443\u0447\u0452\u0461\u0469\u046e\u047d\u0481\u0485\u048c\u0497\u049e"+
		"\u04bf\u04c7\u04ce\u04d6\u04de\u04e6\u04ee\u04f6\u04fe\u0504\u050c\u0519"+
		"\u0521\u052e\u0536\u053d\u0545\u054e\u055d\u0564\u0568\u056a\u0576\u0581"+
		"\u058c\u0592\u059c\u05a0\u05a8\u05ac\u05be\u05c9\u05cd\u05d1\u05d9\u05e9"+
		"\u05ef\u05fa\u0610\u061a\u0630\u063c\u0646\u0656\u065d\u0660\u0664\u066c"+
		"\u066f\u0672\u0678\u067d\u0684\u068c\u06a7\u06aa\u06b0\u06b4\u06c0\u06cc"+
		"\u06d3\u06dc\u06e4\u06e9\u06ed\u06f2\u06f9\u0700\u0707\u070f\u0716\u071e"+
		"\u0721\u0726\u072b\u0735\u0741\u0746\u074e\u0755";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}