// Generated from Java7Parser.g4 by ANTLR 4.3

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
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PACKAGE=2, LT=92, STAR=5, WHILE=54, CONST=94, CASE=63, CHAR=32, NEW=71, 
		DO=55, BREAK=60, Identifier=100, LBRACKET=18, FINAL=13, RPAREN=21, IMPORT=3, 
		SUBSUB=68, STAREQ=86, CARET=79, THIS=42, RETURN=59, DOUBLE=38, BARBAR=82, 
		WhiteSpace=101, VOID=22, SUPER=43, EQ=26, GOTO=95, AMPAMP=81, QUES=39, 
		EQEQ=76, RBRACE=17, STATIC=12, PRIVATE=10, SWITCH=58, NULL=44, STRICTFP=14, 
		ELSE=52, ELLIPSIS=41, NATIVE=27, THROWS=25, INT=35, SLASHEQ=87, ASSERT=65, 
		TRY=56, FloatingPointLiteral=97, GT=91, CATCH=62, FALSE=46, THROW=24, 
		PROTECTED=9, CLASS=6, BAREQ=89, AMP=78, CharacterLiteral=98, PLUSPLUS=67, 
		LBRACE=16, SUBEQ=85, FOR=53, SUB=75, FLOAT=37, ABSTRACT=11, PLUSEQ=84, 
		LPAREN=20, IF=51, AT=47, BOOLEAN=31, SYNCHRONIZED=28, SLASH=72, SlashComment=103, 
		IMPLEMENTS=7, CONTINUE=61, COMMA=15, AMPEQ=88, TRANSIENT=29, TILDE=69, 
		BANGEQ=77, PLUS=74, LAMBDA=66, RBRACKET=19, DOT=4, BYTE=33, PERCENT=73, 
		VOLATILE=30, DEFAULT=48, SHORT=34, BANG=70, INSTANCEOF=93, TRUE=45, SEMI=1, 
		REF=49, StringLiteral=99, COLON=50, ENUM=64, FINALLY=57, PERCENTEQ=90, 
		LineTerminator=102, CARETEQ=83, INTERFACE=23, IntegerLiteral=96, LONG=36, 
		EXTENDS=40, PUBLIC=8, BAR=80, EndOfLineComment=104;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "'package'", "'import'", "'.'", "'*'", "'class'", 
		"'implements'", "'public'", "'protected'", "'private'", "'abstract'", 
		"'static'", "'final'", "'strictfp'", "','", "'{'", "'}'", "'['", "']'", 
		"'('", "')'", "'void'", "'interface'", "'throw'", "'throws'", "'='", "'native'", 
		"'synchronized'", "'transient'", "'volatile'", "'boolean'", "'char'", 
		"'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'?'", 
		"'extends'", "'...'", "'this'", "'super'", "'null'", "'true'", "'false'", 
		"'@'", "'default'", "'::'", "':'", "'if'", "'else'", "'for'", "'while'", 
		"'do'", "'try'", "'finally'", "'switch'", "'return'", "'break'", "'continue'", 
		"'catch'", "'case'", "'enum'", "'assert'", "'->'", "'++'", "'--'", "'~'", 
		"'!'", "'new'", "'/'", "'%'", "'+'", "'-'", "'=='", "'!='", "'&'", "'^'", 
		"'|'", "'&&'", "'||'", "'^='", "'+='", "'-='", "'*='", "'/='", "'&='", 
		"'|='", "'%='", "'>'", "'<'", "'instanceof'", "'const'", "'goto'", "IntegerLiteral", 
		"FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "Identifier", 
		"WhiteSpace", "LineTerminator", "SlashComment", "EndOfLineComment"
	};
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
		RULE_selector = 111, RULE_creator = 112, RULE_arrayCreator = 113, RULE_variableInitializer = 114, 
		RULE_arrayInitializer = 115, RULE_createdName = 116, RULE_innerCreator = 117, 
		RULE_classCreatorRest = 118, RULE_nonWildcardTypeArguments = 119, RULE_arguments = 120, 
		RULE_literal = 121, RULE_classHeader = 122, RULE_enumHeader = 123, RULE_interfaceHeader = 124, 
		RULE_annotationHeader = 125, RULE_typeHeader = 126, RULE_methodHeader = 127, 
		RULE_fieldHeader = 128, RULE_localVariableHeader = 129, RULE_inferredFormalParameterList = 130, 
		RULE_inferredFormalParameters = 131, RULE_lambdaExpression = 132, RULE_lambdaParameters = 133, 
		RULE_lambdaBody = 134, RULE_methodReference = 135, RULE_referenceType = 136, 
		RULE_typeVariable = 137, RULE_typeName = 138, RULE_arrayType = 139, RULE_dims = 140;
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
		"selector", "creator", "arrayCreator", "variableInitializer", "arrayInitializer", 
		"createdName", "innerCreator", "classCreatorRest", "nonWildcardTypeArguments", 
		"arguments", "literal", "classHeader", "enumHeader", "interfaceHeader", 
		"annotationHeader", "typeHeader", "methodHeader", "fieldHeader", "localVariableHeader", 
		"inferredFormalParameterList", "inferredFormalParameters", "lambdaExpression", 
		"lambdaParameters", "lambdaBody", "methodReference", "referenceType", 
		"typeVariable", "typeName", "arrayType", "dims"
	};

	@Override
	public String getGrammarFileName() { return "Java7Parser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
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
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(282); packageDeclaration();
				}
				break;
			}
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(285); importDeclaration();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (SEMI - 1)) | (1L << (CLASS - 1)) | (1L << (PUBLIC - 1)) | (1L << (PROTECTED - 1)) | (1L << (PRIVATE - 1)) | (1L << (ABSTRACT - 1)) | (1L << (STATIC - 1)) | (1L << (FINAL - 1)) | (1L << (STRICTFP - 1)) | (1L << (INTERFACE - 1)) | (1L << (NATIVE - 1)) | (1L << (SYNCHRONIZED - 1)) | (1L << (TRANSIENT - 1)) | (1L << (VOLATILE - 1)) | (1L << (AT - 1)) | (1L << (ENUM - 1)))) != 0)) {
				{
				{
				setState(291); typeDeclaration();
				}
				}
				setState(296);
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
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TerminalNode PACKAGE() { return getToken(Java7Parser.PACKAGE, 0); }
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
			setState(298);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(297); annotations();
				}
			}

			setState(300); match(PACKAGE);
			setState(301); qualifiedName();
			setState(302); match(SEMI);
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
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public TerminalNode IMPORT() { return getToken(Java7Parser.IMPORT, 0); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public TerminalNode STATIC() { return getToken(Java7Parser.STATIC, 0); }
		public TerminalNode STAR() { return getToken(Java7Parser.STAR, 0); }
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
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
			setState(328);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304); match(IMPORT);
				setState(306);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(305); match(STATIC);
					}
				}

				setState(308); match(Identifier);
				setState(309); match(DOT);
				setState(310); match(STAR);
				setState(311); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312); match(IMPORT);
				setState(314);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(313); match(STATIC);
					}
				}

				setState(316); match(Identifier);
				setState(319); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(317); match(DOT);
						setState(318); match(Identifier);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(321); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(325);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(323); match(DOT);
					setState(324); match(STAR);
					}
				}

				setState(327); match(SEMI);
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
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
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
			setState(330); match(Identifier);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(331); match(DOT);
				setState(332); match(Identifier);
				}
				}
				setState(337);
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
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
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
			setState(340);
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
				setState(338); classOrInterfaceDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(339); match(SEMI);
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
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
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
			setState(344);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342); classDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343); interfaceDeclaration();
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
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(346); modifier();
					}
					} 
				}
				setState(351);
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
		public TerminalNode TRANSIENT() { return getToken(Java7Parser.TRANSIENT, 0); }
		public TerminalNode PUBLIC() { return getToken(Java7Parser.PUBLIC, 0); }
		public TerminalNode FINAL() { return getToken(Java7Parser.FINAL, 0); }
		public TerminalNode NATIVE() { return getToken(Java7Parser.NATIVE, 0); }
		public TerminalNode PROTECTED() { return getToken(Java7Parser.PROTECTED, 0); }
		public TerminalNode ABSTRACT() { return getToken(Java7Parser.ABSTRACT, 0); }
		public TerminalNode PRIVATE() { return getToken(Java7Parser.PRIVATE, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(Java7Parser.STATIC, 0); }
		public TerminalNode VOLATILE() { return getToken(Java7Parser.VOLATILE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(Java7Parser.SYNCHRONIZED, 0); }
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
			setState(364);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(352); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(353); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(354); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(355); match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(356); match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(357); match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(358); match(FINAL);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 8);
				{
				setState(359); match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 9);
				{
				setState(360); match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(361); match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 11);
				{
				setState(362); match(VOLATILE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 12);
				{
				setState(363); match(STRICTFP);
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
		public TerminalNode FINAL() { return getToken(Java7Parser.FINAL, 0); }
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
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
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(366); annotation();
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(373);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(372); match(FINAL);
				}
			}

			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(375); annotation();
					}
					} 
				}
				setState(380);
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
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
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
			setState(383);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381); normalClassDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382); enumDeclaration();
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
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(Java7Parser.IMPLEMENTS, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(Java7Parser.EXTENDS, 0); }
		public TerminalNode CLASS() { return getToken(Java7Parser.CLASS, 0); }
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
			setState(385); modifiers();
			setState(386); match(CLASS);
			setState(387); match(Identifier);
			setState(389);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(388); typeParameters();
				}
			}

			setState(393);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(391); match(EXTENDS);
				setState(392); type();
				}
			}

			setState(397);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(395); match(IMPLEMENTS);
				setState(396); typeList();
				}
			}

			setState(399); classBody();
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
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode GT() { return getToken(Java7Parser.GT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
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
			setState(401); match(LT);
			setState(402); typeParameter();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(403); match(COMMA);
				setState(404); typeParameter();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410); match(GT);
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
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(Java7Parser.EXTENDS, 0); }
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
			setState(412); match(Identifier);
			setState(421);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(413); match(EXTENDS);
				setState(414); typeBound();
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AMP) {
					{
					{
					setState(415); additionalBound();
					}
					}
					setState(420);
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
		public TerminalNode AMP(int i) {
			return getToken(Java7Parser.AMP, i);
		}
		public List<TerminalNode> AMP() { return getTokens(Java7Parser.AMP); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
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
			setState(423); type();
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(424); match(AMP);
					setState(425); type();
					}
					} 
				}
				setState(430);
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
			setState(431); match(AMP);
			setState(432); classOrInterfaceType();
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
		public TerminalNode ENUM() { return getToken(Java7Parser.ENUM, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(Java7Parser.IMPLEMENTS, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
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
			setState(434); modifiers();
			setState(435); match(ENUM);
			setState(436); match(Identifier);
			setState(439);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(437); match(IMPLEMENTS);
				setState(438); typeList();
				}
			}

			setState(441); enumBody();
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
		public TerminalNode COMMA() { return getToken(Java7Parser.COMMA, 0); }
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
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
			setState(443); match(LBRACE);
			setState(445);
			_la = _input.LA(1);
			if (_la==AT || _la==Identifier) {
				{
				setState(444); enumConstants();
				}
			}

			setState(448);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(447); match(COMMA);
				}
			}

			setState(451);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(450); enumBodyDeclarations();
				}
			}

			setState(453); match(RBRACE);
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
			setState(455); enumConstant();
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(456); match(COMMA);
					setState(457); enumConstant();
					}
					} 
				}
				setState(462);
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
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
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
			setState(464);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(463); annotations();
				}
			}

			setState(466); match(Identifier);
			setState(468);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(467); arguments();
				}
			}

			setState(471);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(470); classBody();
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
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
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
			setState(473); match(SEMI);
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << VOID) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (LT - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(474); classBodyDeclaration();
				}
				}
				setState(479);
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
			setState(482);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(480); normalInterfaceDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481); annotationTypeDeclaration();
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
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode INTERFACE() { return getToken(Java7Parser.INTERFACE, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(Java7Parser.EXTENDS, 0); }
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
			setState(484); modifiers();
			setState(485); match(INTERFACE);
			setState(486); match(Identifier);
			setState(488);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(487); typeParameters();
				}
			}

			setState(492);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(490); match(EXTENDS);
				setState(491); typeList();
				}
			}

			setState(494); interfaceBody();
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
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
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
			setState(496); type();
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(497); match(COMMA);
				setState(498); type();
				}
				}
				setState(503);
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
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
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
			setState(504); match(LBRACE);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << VOID) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (LT - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(505); classBodyDeclaration();
				}
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(511); match(RBRACE);
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
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
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
			setState(513); match(LBRACE);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << VOID) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT) | (1L << DEFAULT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (LT - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(514); interfaceBodyDeclaration();
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(520); match(RBRACE);
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
		public TerminalNode STATIC() { return getToken(Java7Parser.STATIC, 0); }
		public MemberDeclContext memberDecl() {
			return getRuleContext(MemberDeclContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
			setState(528);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(522); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(523); match(STATIC);
					}
				}

				setState(526); block();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(527); memberDecl();
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
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
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
			setState(535);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530); constructorDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531); fieldDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(532); methodDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(533); classDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(534); interfaceDeclaration();
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
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(Java7Parser.THROWS, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode VOID() { return getToken(Java7Parser.VOID, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
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
			setState(537); modifiers();
			setState(539);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(538); typeParameters();
				}
			}

			setState(543);
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
				setState(541); type();
				}
				break;
			case VOID:
				{
				setState(542); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(545); match(Identifier);
			setState(546); formalParameters();
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(547); match(LBRACKET);
				setState(548); match(RBRACKET);
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(556);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(554); match(THROWS);
				setState(555); qualifiedNameList();
				}
			}

			setState(560);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(558); block();
				}
				break;
			case SEMI:
				{
				setState(559); match(SEMI);
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
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorBlockContext constructorBlock() {
			return getRuleContext(ConstructorBlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(Java7Parser.THROWS, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
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
			setState(562); modifiers();
			setState(564);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(563); typeParameters();
				}
			}

			setState(566); match(Identifier);
			setState(567); formalParameters();
			setState(570);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(568); match(THROWS);
				setState(569); qualifiedNameList();
				}
			}

			setState(572); constructorBlock();
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
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
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
			setState(574); match(LBRACE);
			setState(576);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(575); explicitConstructorInvocation();
				}
				break;
			}
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << INTERFACE) | (1L << THROW) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TRY) | (1L << SWITCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (ASSERT - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (TILDE - 64)) | (1L << (BANG - 64)) | (1L << (NEW - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(578); blockStatement();
				}
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(584); match(RBRACE);
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
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
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
			setState(586); modifiers();
			setState(587); type();
			setState(588); variableDeclarator();
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(589); match(COMMA);
				setState(590); variableDeclarator();
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596); match(SEMI);
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
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
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
			setState(598); match(Identifier);
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(599); match(LBRACKET);
				setState(600); match(RBRACKET);
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(608);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(606); match(EQ);
				setState(607); variableInitializer();
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
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public DefaultInterfaceMethodDeclarationContext defaultInterfaceMethodDeclaration() {
			return getRuleContext(DefaultInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceFieldDeclarationContext interfaceFieldDeclaration() {
			return getRuleContext(InterfaceFieldDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
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
			setState(616);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(610); interfaceFieldDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(611); interfaceMethodDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(612); defaultInterfaceMethodDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(613); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(614); classDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(615); match(SEMI);
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
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(Java7Parser.THROWS, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode VOID() { return getToken(Java7Parser.VOID, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
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
			setState(618); modifiers();
			setState(620);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(619); typeParameters();
				}
			}

			setState(624);
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
				setState(622); type();
				}
				break;
			case VOID:
				{
				setState(623); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(626); match(Identifier);
			setState(627); formalParameters();
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(628); match(LBRACKET);
				setState(629); match(RBRACKET);
				}
				}
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(637);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(635); match(THROWS);
				setState(636); qualifiedNameList();
				}
			}

			setState(641);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(639); block();
				}
				break;
			case SEMI:
				{
				setState(640); match(SEMI);
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
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(Java7Parser.THROWS, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode VOID() { return getToken(Java7Parser.VOID, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode DEFAULT() { return getToken(Java7Parser.DEFAULT, 0); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
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
			setState(648);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				{
				setState(643); match(DEFAULT);
				setState(644); modifiers();
				}
				}
				break;

			case 2:
				{
				{
				setState(645); modifiers();
				setState(646); match(DEFAULT);
				}
				}
				break;
			}
			setState(651);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(650); typeParameters();
				}
			}

			setState(655);
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
				setState(653); type();
				}
				break;
			case VOID:
				{
				setState(654); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(657); match(Identifier);
			setState(658); formalParameters();
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(659); match(LBRACKET);
				setState(660); match(RBRACKET);
				}
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(668);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(666); match(THROWS);
				setState(667); qualifiedNameList();
				}
			}

			setState(672);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(670); block();
				}
				break;
			case SEMI:
				{
				setState(671); match(SEMI);
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
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
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
			setState(674); modifiers();
			setState(675); type();
			setState(676); variableDeclarator();
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(677); match(COMMA);
				setState(678); variableDeclarator();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684); match(SEMI);
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
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
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
			setState(702);
			switch (_input.LA(1)) {
			case AT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(686); classOrInterfaceType();
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(687); match(LBRACKET);
					setState(688); match(RBRACKET);
					}
					}
					setState(693);
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
				setState(694); primitiveType();
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(695); match(LBRACKET);
					setState(696); match(RBRACKET);
					}
					}
					setState(701);
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
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public IdentifierTypeArgumentContext identifierTypeArgument(int i) {
			return getRuleContext(IdentifierTypeArgumentContext.class,i);
		}
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
			setState(704); identifierTypeArgument();
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(705); match(DOT);
				setState(706); identifierTypeArgument();
				}
				}
				setState(711);
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
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
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
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(712); annotation();
				}
				}
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(718); match(Identifier);
			setState(720);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(719); typeArguments();
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
		public TerminalNode BYTE() { return getToken(Java7Parser.BYTE, 0); }
		public TerminalNode BOOLEAN() { return getToken(Java7Parser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(Java7Parser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(Java7Parser.INT, 0); }
		public TerminalNode LONG() { return getToken(Java7Parser.LONG, 0); }
		public TerminalNode DOUBLE() { return getToken(Java7Parser.DOUBLE, 0); }
		public TerminalNode SHORT() { return getToken(Java7Parser.SHORT, 0); }
		public TerminalNode CHAR() { return getToken(Java7Parser.CHAR, 0); }
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
			setState(722);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TerminalNode LT() { return getToken(Java7Parser.LT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(Java7Parser.GT, 0); }
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
			setState(737);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(724); match(LT);
				setState(725); typeArgument();
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(726); match(COMMA);
					setState(727); typeArgument();
					}
					}
					setState(732);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(733); match(GT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(735); match(LT);
				setState(736); match(GT);
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
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode QUES() { return getToken(Java7Parser.QUES, 0); }
		public TerminalNode EXTENDS() { return getToken(Java7Parser.EXTENDS, 0); }
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
			setState(745);
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
				setState(739); type();
				}
				break;
			case QUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(740); match(QUES);
				setState(743);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(741);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(742); type();
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
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
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
			setState(747); qualifiedName();
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(748); match(COMMA);
				setState(749); qualifiedName();
				}
				}
				setState(754);
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
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
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
			setState(755); match(LPAREN);
			setState(757);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT))) != 0) || _la==Identifier) {
				{
				setState(756); formalParameterDecls();
				}
			}

			setState(759); match(RPAREN);
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
		public NormalParameterDeclContext normalParameterDecl(int i) {
			return getRuleContext(NormalParameterDeclContext.class,i);
		}
		public EllipsisParameterDeclContext ellipsisParameterDecl() {
			return getRuleContext(EllipsisParameterDeclContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public List<NormalParameterDeclContext> normalParameterDecl() {
			return getRuleContexts(NormalParameterDeclContext.class);
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
			setState(784);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761); ellipsisParameterDecl();
				((FormalParameterDeclsContext)_localctx).parameterType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764); normalParameterDecl();
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(765); match(COMMA);
					setState(766); normalParameterDecl();
					}
					}
					setState(771);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((FormalParameterDeclsContext)_localctx).parameterType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(777); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(774); normalParameterDecl();
						setState(775); match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(779); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(781); ellipsisParameterDecl();
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
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
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
			setState(786); variableModifiers();
			setState(787); type();
			setState(788); match(Identifier);
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(789); match(LBRACKET);
				setState(790); match(RBRACKET);
				}
				}
				setState(795);
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
		public TerminalNode ELLIPSIS() { return getToken(Java7Parser.ELLIPSIS, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
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
			setState(796); variableModifiers();
			setState(797); type();
			setState(798); match(ELLIPSIS);
			setState(799); match(Identifier);
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
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode THIS() { return getToken(Java7Parser.THIS, 0); }
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
			setState(817);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(801); nonWildcardTypeArguments();
					}
				}

				setState(804);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==SUPER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(805); arguments();
				setState(806); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808); primary();
				setState(809); match(DOT);
				setState(811);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(810); nonWildcardTypeArguments();
					}
				}

				setState(813); match(SUPER);
				setState(814); arguments();
				setState(815); match(SEMI);
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
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
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
			setState(819); match(Identifier);
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(820); match(DOT);
				setState(821); match(Identifier);
				}
				}
				setState(826);
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
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
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
			setState(828); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(827); annotation();
				}
				}
				setState(830); 
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
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
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
			setState(835);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(832); markerAnnotation();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(833); singleElementAnnotation();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(834); normalAnnotation();
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
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AT() { return getToken(Java7Parser.AT, 0); }
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
			setState(837); match(AT);
			setState(838); qualifiedName();
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
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public TerminalNode AT() { return getToken(Java7Parser.AT, 0); }
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
			setState(840); match(AT);
			setState(841); qualifiedName();
			setState(842); match(LPAREN);
			setState(843); elementValue();
			setState(844); match(RPAREN);
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
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public TerminalNode AT() { return getToken(Java7Parser.AT, 0); }
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
			setState(846); match(AT);
			setState(847); qualifiedName();
			setState(848); match(LPAREN);
			setState(850);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(849); elementValuePairs();
				}
			}

			setState(852); match(RPAREN);
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
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
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
			setState(854); elementValuePair();
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(855); match(COMMA);
				setState(856); elementValuePair();
				}
				}
				setState(861);
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
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
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
			setState(862); match(Identifier);
			setState(863); match(EQ);
			setState(864); elementValue();
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
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
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
			setState(869);
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
				setState(866); conditionalExpression();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(867); annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(868); elementValueArrayInitializer();
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
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
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
			setState(871); match(LBRACE);
			setState(880);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PLUSPLUS - 67)) | (1L << (SUBSUB - 67)) | (1L << (TILDE - 67)) | (1L << (BANG - 67)) | (1L << (NEW - 67)) | (1L << (PLUS - 67)) | (1L << (SUB - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(872); elementValue();
				setState(877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(873); match(COMMA);
						setState(874); elementValue();
						}
						} 
					}
					setState(879);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				}
			}

			setState(883);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(882); match(COMMA);
				}
			}

			setState(885); match(RBRACE);
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
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode INTERFACE() { return getToken(Java7Parser.INTERFACE, 0); }
		public TerminalNode AT() { return getToken(Java7Parser.AT, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
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
			setState(887); modifiers();
			setState(888); match(AT);
			setState(889); match(INTERFACE);
			setState(890); match(Identifier);
			setState(891); annotationTypeBody();
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
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
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
			setState(893); match(LBRACE);
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT))) != 0) || _la==ENUM || _la==Identifier) {
				{
				{
				setState(894); annotationTypeElementDeclaration();
				}
				}
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(900); match(RBRACE);
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
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationMethodDeclarationContext annotationMethodDeclaration() {
			return getRuleContext(AnnotationMethodDeclarationContext.class,0);
		}
		public InterfaceFieldDeclarationContext interfaceFieldDeclaration() {
			return getRuleContext(InterfaceFieldDeclarationContext.class,0);
		}
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
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
			setState(909);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(902); annotationMethodDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(903); interfaceFieldDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(904); normalClassDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(905); normalInterfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(906); enumDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(907); annotationTypeDeclaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(908); match(SEMI);
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
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(Java7Parser.DEFAULT, 0); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
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
			setState(911); modifiers();
			setState(912); type();
			setState(913); match(Identifier);
			setState(914); match(LPAREN);
			setState(915); match(RPAREN);
			setState(918);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(916); match(DEFAULT);
				setState(917); elementValue();
				}
			}

			setState(920); match(SEMI);
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
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
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
			setState(922); match(LBRACE);
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << INTERFACE) | (1L << THROW) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TRY) | (1L << SWITCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (ASSERT - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (TILDE - 64)) | (1L << (BANG - 64)) | (1L << (NEW - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(923); blockStatement();
				}
				}
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(929); match(RBRACE);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
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
			setState(934);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(931); localVariableDeclarationStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(932); classOrInterfaceDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(933); statement();
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
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
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
			setState(936); localVariableDeclaration();
			setState(937); match(SEMI);
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
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
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
			setState(939); variableModifiers();
			setState(940); type();
			setState(941); variableDeclarator();
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(942); match(COMMA);
				setState(943); variableDeclarator();
				}
				}
				setState(948);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode THROW() { return getToken(Java7Parser.THROW, 0); }
		public TerminalNode WHILE() { return getToken(Java7Parser.WHILE, 0); }
		public TerminalNode IF() { return getToken(Java7Parser.IF, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DO() { return getToken(Java7Parser.DO, 0); }
		public TerminalNode RETURN() { return getToken(Java7Parser.RETURN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ASSERT() { return getToken(Java7Parser.ASSERT, 0); }
		public TrystatementContext trystatement() {
			return getRuleContext(TrystatementContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(Java7Parser.BREAK, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(Java7Parser.SYNCHRONIZED, 0); }
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public TerminalNode CONTINUE() { return getToken(Java7Parser.CONTINUE, 0); }
		public SwitchBlockStatementGroupsContext switchBlockStatementGroups() {
			return getRuleContext(SwitchBlockStatementGroupsContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(Java7Parser.ELSE, 0); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TerminalNode SWITCH() { return getToken(Java7Parser.SWITCH, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Java7Parser.COLON, 0); }
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
			setState(1013);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(949); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(950); match(ASSERT);
				setState(951); expression();
				setState(954);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(952); match(COLON);
					setState(953); expression();
					}
				}

				setState(956); match(SEMI);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(958); match(IF);
				setState(959); parExpression();
				setState(960); statement();
				setState(963);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(961); match(ELSE);
					setState(962); statement();
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(965); forstatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(966); match(WHILE);
				setState(967); parExpression();
				setState(968); statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(970); match(DO);
				setState(971); statement();
				setState(972); match(WHILE);
				setState(973); parExpression();
				setState(974); match(SEMI);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(976); trystatement();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(977); match(SWITCH);
				setState(978); parExpression();
				setState(979); match(LBRACE);
				setState(980); switchBlockStatementGroups();
				setState(981); match(RBRACE);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(983); match(SYNCHRONIZED);
				setState(984); parExpression();
				setState(985); block();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(987); match(RETURN);
				setState(989);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PLUSPLUS - 67)) | (1L << (SUBSUB - 67)) | (1L << (TILDE - 67)) | (1L << (BANG - 67)) | (1L << (NEW - 67)) | (1L << (PLUS - 67)) | (1L << (SUB - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(988); expression();
					}
				}

				setState(991); match(SEMI);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(992); match(THROW);
				setState(993); expression();
				setState(994); match(SEMI);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(996); match(BREAK);
				setState(998);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(997); match(Identifier);
					}
				}

				setState(1000); match(SEMI);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1001); match(CONTINUE);
				setState(1003);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1002); match(Identifier);
					}
				}

				setState(1005); match(SEMI);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1006); expression();
				setState(1007); match(SEMI);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1009); match(Identifier);
				setState(1010); match(COLON);
				setState(1011); statement();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1012); emptyStatement();
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
			setState(1015); match(SEMI);
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
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
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
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(1017); switchBlockStatementGroup();
				}
				}
				setState(1022);
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
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public SwitchLabelContext switchLabel() {
			return getRuleContext(SwitchLabelContext.class,0);
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
			setState(1023); switchLabel();
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << INTERFACE) | (1L << THROW) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TRY) | (1L << SWITCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ENUM - 64)) | (1L << (ASSERT - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (TILDE - 64)) | (1L << (BANG - 64)) | (1L << (NEW - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(1024); blockStatement();
				}
				}
				setState(1029);
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
		public TerminalNode DEFAULT() { return getToken(Java7Parser.DEFAULT, 0); }
		public TerminalNode CASE() { return getToken(Java7Parser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Java7Parser.COLON, 0); }
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
			setState(1036);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030); match(CASE);
				setState(1031); expression();
				setState(1032); match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1034); match(DEFAULT);
				setState(1035); match(COLON);
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
		public TryWithResourcesContext tryWithResources() {
			return getRuleContext(TryWithResourcesContext.class,0);
		}
		public TerminalNode FINALLY() { return getToken(Java7Parser.FINALLY, 0); }
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TerminalNode TRY() { return getToken(Java7Parser.TRY, 0); }
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
			setState(1063);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038); match(TRY);
				setState(1039); block();
				((TrystatementContext)_localctx).statementType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1042); match(TRY);
				setState(1043); block();
				setState(1044); catches();
				setState(1045); match(FINALLY);
				setState(1046); block();
				((TrystatementContext)_localctx).statementType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1049); match(TRY);
				setState(1050); block();
				setState(1051); catches();
				((TrystatementContext)_localctx).statementType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1054); match(TRY);
				setState(1055); block();
				setState(1056); match(FINALLY);
				setState(1057); block();
				((TrystatementContext)_localctx).statementType =  4;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1060); tryWithResources();
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
		public TerminalNode FINALLY() { return getToken(Java7Parser.FINALLY, 0); }
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TerminalNode TRY() { return getToken(Java7Parser.TRY, 0); }
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
			setState(1065); match(TRY);
			setState(1066); resourceSpecification();
			setState(1067); block();
			setState(1069);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1068); catches();
				}
			}

			setState(1073);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1071); match(FINALLY);
				setState(1072); block();
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
			setState(1075); match(LPAREN);
			setState(1076); resources();
			setState(1078);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1077); match(SEMI);
				}
			}

			setState(1080); match(RPAREN);
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
			setState(1082); resource();
			setState(1087);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1083); match(SEMI);
					setState(1084); resource();
					}
					} 
				}
				setState(1089);
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
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
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
			setState(1091);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1090); variableModifiers();
				}
				break;
			}
			setState(1093); type();
			setState(1094); match(Identifier);
			setState(1095); match(EQ);
			setState(1096); expression();
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
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
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
			setState(1098); catchClause();
			setState(1102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1099); catchClause();
				}
				}
				setState(1104);
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
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public TerminalNode CATCH() { return getToken(Java7Parser.CATCH, 0); }
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
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
			setState(1105); match(CATCH);
			setState(1106); match(LPAREN);
			setState(1107); catchFormalParameter();
			setState(1108); match(RPAREN);
			setState(1109); block();
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
		public TerminalNode BAR(int i) {
			return getToken(Java7Parser.BAR, i);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public List<TerminalNode> BAR() { return getTokens(Java7Parser.BAR); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
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
			setState(1111); variableModifiers();
			setState(1112); type();
			setState(1117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(1113); match(BAR);
				setState(1114); type();
				}
				}
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1120); match(Identifier);
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1121); match(LBRACKET);
				setState(1122); match(RBRACKET);
				}
				}
				setState(1127);
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
			setState(1130);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1128); foreachStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1129); normalForStatement();
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode FOR() { return getToken(Java7Parser.FOR, 0); }
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public TerminalNode COLON() { return getToken(Java7Parser.COLON, 0); }
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
			setState(1132); match(FOR);
			setState(1133); match(LPAREN);
			setState(1134); variableModifiers();
			setState(1135); type();
			setState(1136); match(Identifier);
			setState(1137); match(COLON);
			setState(1138); expression();
			setState(1139); match(RPAREN);
			setState(1140); statement();
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
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode FOR() { return getToken(Java7Parser.FOR, 0); }
		public List<TerminalNode> SEMI() { return getTokens(Java7Parser.SEMI); }
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI(int i) {
			return getToken(Java7Parser.SEMI, i);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
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
			setState(1142); match(FOR);
			setState(1143); match(LPAREN);
			setState(1145);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PLUSPLUS - 67)) | (1L << (SUBSUB - 67)) | (1L << (TILDE - 67)) | (1L << (BANG - 67)) | (1L << (NEW - 67)) | (1L << (PLUS - 67)) | (1L << (SUB - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(1144); forInit();
				}
			}

			setState(1147); match(SEMI);
			setState(1149);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PLUSPLUS - 67)) | (1L << (SUBSUB - 67)) | (1L << (TILDE - 67)) | (1L << (BANG - 67)) | (1L << (NEW - 67)) | (1L << (PLUS - 67)) | (1L << (SUB - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(1148); expression();
				}
			}

			setState(1151); match(SEMI);
			setState(1153);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PLUSPLUS - 67)) | (1L << (SUBSUB - 67)) | (1L << (TILDE - 67)) | (1L << (BANG - 67)) | (1L << (NEW - 67)) | (1L << (PLUS - 67)) | (1L << (SUB - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(1152); expressionList();
				}
			}

			setState(1155); match(RPAREN);
			setState(1156); statement();
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
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
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
			setState(1160);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1158); localVariableDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1159); expressionList();
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
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
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
			setState(1162); match(LPAREN);
			setState(1163); expression();
			setState(1164); match(RPAREN);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
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
			setState(1166); expression();
			setState(1171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1167); match(COMMA);
				setState(1168); expression();
				}
				}
				setState(1173);
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
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
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
			setState(1174); methodReference();
			setState(1178);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1175); assignmentOperator();
				setState(1176); expression();
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
		public TerminalNode PLUSEQ() { return getToken(Java7Parser.PLUSEQ, 0); }
		public TerminalNode BAREQ() { return getToken(Java7Parser.BAREQ, 0); }
		public TerminalNode GT(int i) {
			return getToken(Java7Parser.GT, i);
		}
		public TerminalNode STAREQ() { return getToken(Java7Parser.STAREQ, 0); }
		public TerminalNode AMPEQ() { return getToken(Java7Parser.AMPEQ, 0); }
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(Java7Parser.SLASHEQ, 0); }
		public TerminalNode LT(int i) {
			return getToken(Java7Parser.LT, i);
		}
		public List<TerminalNode> LT() { return getTokens(Java7Parser.LT); }
		public TerminalNode CARETEQ() { return getToken(Java7Parser.CARETEQ, 0); }
		public TerminalNode SUBEQ() { return getToken(Java7Parser.SUBEQ, 0); }
		public List<TerminalNode> GT() { return getTokens(Java7Parser.GT); }
		public TerminalNode PERCENTEQ() { return getToken(Java7Parser.PERCENTEQ, 0); }
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
			setState(1211);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1180); match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1182); match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1184); match(SUBEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1186); match(STAREQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  4;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1188); match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  5;
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1190); match(AMPEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  6;
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1192); match(BAREQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  7;
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1194); match(CARETEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  8;
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1196); match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  9;
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1198); match(LT);
				setState(1199); match(LT);
				setState(1200); match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  10;
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1202); match(GT);
				setState(1203); match(GT);
				setState(1204); match(GT);
				setState(1205); match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  11;
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1207); match(GT);
				setState(1208); match(GT);
				setState(1209); match(EQ);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode QUES() { return getToken(Java7Parser.QUES, 0); }
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
			setState(1213); conditionalOrExpression();
			setState(1219);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1214); match(QUES);
				setState(1215); expression();
				setState(1216); match(COLON);
				setState(1217); expression();
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
		public List<TerminalNode> BARBAR() { return getTokens(Java7Parser.BARBAR); }
		public TerminalNode BARBAR(int i) {
			return getToken(Java7Parser.BARBAR, i);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
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
			setState(1221); conditionalAndExpression();
			setState(1226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1222); match(BARBAR);
					setState(1223); conditionalAndExpression();
					}
					} 
				}
				setState(1228);
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
		public List<TerminalNode> AMPAMP() { return getTokens(Java7Parser.AMPAMP); }
		public TerminalNode AMPAMP(int i) {
			return getToken(Java7Parser.AMPAMP, i);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
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
			setState(1229); inclusiveOrExpression();
			setState(1234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1230); match(AMPAMP);
					setState(1231); inclusiveOrExpression();
					}
					} 
				}
				setState(1236);
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
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public TerminalNode BAR(int i) {
			return getToken(Java7Parser.BAR, i);
		}
		public List<TerminalNode> BAR() { return getTokens(Java7Parser.BAR); }
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
			setState(1237); exclusiveOrExpression();
			setState(1242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1238); match(BAR);
					setState(1239); exclusiveOrExpression();
					}
					} 
				}
				setState(1244);
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
		public TerminalNode CARET(int i) {
			return getToken(Java7Parser.CARET, i);
		}
		public List<TerminalNode> CARET() { return getTokens(Java7Parser.CARET); }
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
			setState(1245); andExpression();
			setState(1250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1246); match(CARET);
					setState(1247); andExpression();
					}
					} 
				}
				setState(1252);
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
		public TerminalNode AMP(int i) {
			return getToken(Java7Parser.AMP, i);
		}
		public List<TerminalNode> AMP() { return getTokens(Java7Parser.AMP); }
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
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
			setState(1253); equalityExpression();
			setState(1258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1254); match(AMP);
					setState(1255); equalityExpression();
					}
					} 
				}
				setState(1260);
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
		public List<TerminalNode> EQEQ() { return getTokens(Java7Parser.EQEQ); }
		public TerminalNode EQEQ(int i) {
			return getToken(Java7Parser.EQEQ, i);
		}
		public NotEqualityExpressionContext notEqualityExpression(int i) {
			return getRuleContext(NotEqualityExpressionContext.class,i);
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
			setState(1261); notEqualityExpression();
			setState(1266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1262); match(EQEQ);
					setState(1263); notEqualityExpression();
					}
					} 
				}
				setState(1268);
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
		public List<TerminalNode> BANGEQ() { return getTokens(Java7Parser.BANGEQ); }
		public List<InstanceOfExpressionContext> instanceOfExpression() {
			return getRuleContexts(InstanceOfExpressionContext.class);
		}
		public InstanceOfExpressionContext instanceOfExpression(int i) {
			return getRuleContext(InstanceOfExpressionContext.class,i);
		}
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
			setState(1269); instanceOfExpression();
			setState(1274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1270); match(BANGEQ);
					setState(1271); instanceOfExpression();
					}
					} 
				}
				setState(1276);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(Java7Parser.INSTANCEOF, 0); }
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
			setState(1277); relationalExpression();
			setState(1280);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1278); match(INSTANCEOF);
				setState(1279); type();
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
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
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
			setState(1282); shiftExpression();
			setState(1288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1283); relationalOp();
					setState(1284); shiftExpression();
					}
					} 
				}
				setState(1290);
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
		public TerminalNode GT() { return getToken(Java7Parser.GT, 0); }
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
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
			setState(1301);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1291); match(LT);
				setState(1292); match(EQ);
				((RelationalOpContext)_localctx).operatorType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1294); match(GT);
				setState(1295); match(EQ);
				((RelationalOpContext)_localctx).operatorType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1297); match(LT);
				((RelationalOpContext)_localctx).operatorType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1299); match(GT);
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
		public List<ShiftOpContext> shiftOp() {
			return getRuleContexts(ShiftOpContext.class);
		}
		public ShiftOpContext shiftOp(int i) {
			return getRuleContext(ShiftOpContext.class,i);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
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
			setState(1303); additiveExpression();
			setState(1309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1304); shiftOp();
					setState(1305); additiveExpression();
					}
					} 
				}
				setState(1311);
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
		public TerminalNode LT(int i) {
			return getToken(Java7Parser.LT, i);
		}
		public List<TerminalNode> LT() { return getTokens(Java7Parser.LT); }
		public TerminalNode GT(int i) {
			return getToken(Java7Parser.GT, i);
		}
		public List<TerminalNode> GT() { return getTokens(Java7Parser.GT); }
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
			setState(1322);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1312); match(LT);
				setState(1313); match(LT);
				((ShiftOpContext)_localctx).operatorType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1315); match(GT);
				setState(1316); match(GT);
				setState(1317); match(GT);
				((ShiftOpContext)_localctx).operatorType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1319); match(GT);
				setState(1320); match(GT);
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
		public AdditiveOpContext additiveOp(int i) {
			return getRuleContext(AdditiveOpContext.class,i);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public List<AdditiveOpContext> additiveOp() {
			return getRuleContexts(AdditiveOpContext.class);
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
			setState(1324); multiplicativeExpression();
			setState(1330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1325); additiveOp();
					setState(1326); multiplicativeExpression();
					}
					} 
				}
				setState(1332);
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
			setState(1337);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1333); match(PLUS);
				((AdditiveOpContext)_localctx).operatorType =  1;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1335); match(SUB);
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
		public MultiplicativeOpContext multiplicativeOp(int i) {
			return getRuleContext(MultiplicativeOpContext.class,i);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<MultiplicativeOpContext> multiplicativeOp() {
			return getRuleContexts(MultiplicativeOpContext.class);
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
			setState(1339); unaryExpression();
			setState(1345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1340); multiplicativeOp();
					setState(1341); unaryExpression();
					}
					} 
				}
				setState(1347);
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
		public TerminalNode PERCENT() { return getToken(Java7Parser.PERCENT, 0); }
		public TerminalNode STAR() { return getToken(Java7Parser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(Java7Parser.SLASH, 0); }
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
			setState(1354);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1348); match(STAR);
				((MultiplicativeOpContext)_localctx).operatorType =  1;
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1350); match(SLASH);
				((MultiplicativeOpContext)_localctx).operatorType =  2;
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1352); match(PERCENT);
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
		public TerminalNode TILDE() { return getToken(Java7Parser.TILDE, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(Java7Parser.BANG, 0); }
		public TerminalNode PLUSPLUS() { return getToken(Java7Parser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(Java7Parser.SUBSUB, 0); }
		public TerminalNode PLUS() { return getToken(Java7Parser.PLUS, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public TerminalNode SUB() { return getToken(Java7Parser.SUB, 0); }
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
			setState(1369);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1356); match(PLUS);
				setState(1357); unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1358); match(SUB);
				setState(1359); unaryExpression();
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1360); match(PLUSPLUS);
				setState(1361); unaryExpression();
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(1362); match(SUBSUB);
				setState(1363); unaryExpression();
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1364); match(TILDE);
				setState(1365); unaryExpression();
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 6);
				{
				setState(1366); match(BANG);
				setState(1367); unaryExpression();
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
				setState(1368); unaryExpressionNotPlusMinus();
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
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(Java7Parser.PLUSPLUS, 0); }
		public TerminalNode SUBSUB() { return getToken(Java7Parser.SUBSUB, 0); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
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
			setState(1382);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1371); castExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1372); primary();
				setState(1376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT || _la==LBRACKET) {
					{
					{
					setState(1373); selector();
					}
					}
					setState(1378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1380);
				_la = _input.LA(1);
				if (_la==PLUSPLUS || _la==SUBSUB) {
					{
					setState(1379);
					_la = _input.LA(1);
					if ( !(_la==PLUSPLUS || _la==SUBSUB) ) {
					_errHandler.recoverInline(this);
					}
					consume();
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
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
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
			setState(1422);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1384); match(LPAREN);
				setState(1385); primitiveType();
				setState(1386); match(RPAREN);
				setState(1387); unaryExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1389); match(LPAREN);
				setState(1390); type();
				setState(1394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AMP) {
					{
					{
					setState(1391); additionalBound();
					}
					}
					setState(1396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1397); match(RPAREN);
				setState(1398); unaryExpressionNotPlusMinus();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1400); match(LPAREN);
				setState(1401); type();
				setState(1405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AMP) {
					{
					{
					setState(1402); additionalBound();
					}
					}
					setState(1407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1408); match(RPAREN);
				setState(1409); lambdaExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1411); match(LPAREN);
				setState(1412); type();
				setState(1416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AMP) {
					{
					{
					setState(1413); additionalBound();
					}
					}
					setState(1418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1419); match(RPAREN);
				setState(1420); methodReference();
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
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public ThisSuffixContext thisSuffix() {
			return getRuleContext(ThisSuffixContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java7Parser.VOID, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public TerminalNode CLASS() { return getToken(Java7Parser.CLASS, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode THIS() { return getToken(Java7Parser.THIS, 0); }
		public IdentifierSuffixContext identifierSuffix() {
			return getRuleContext(IdentifierSuffixContext.class,0);
		}
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
			setState(1477);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1424); parExpression();
				((PrimaryContext)_localctx).operationType =  1;
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1427); match(THIS);
				setState(1432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1428); match(DOT);
						setState(1429); match(Identifier);
						}
						} 
					}
					setState(1434);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				}
				setState(1436);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1435); thisSuffix();
					}
					break;
				}
				((PrimaryContext)_localctx).operationType =  2;
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(1439); match(Identifier);
				setState(1444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1440); match(DOT);
						setState(1441); match(Identifier);
						}
						} 
					}
					setState(1446);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
				}
				setState(1448);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1447); identifierSuffix();
					}
					break;
				}
				((PrimaryContext)_localctx).operationType =  3;
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1451); match(SUPER);
				setState(1452); superSuffix();
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
				setState(1455); literal();
				((PrimaryContext)_localctx).operationType =  5;
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 6);
				{
				setState(1458); creator();
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
				setState(1461); primitiveType();
				setState(1466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(1462); match(LBRACKET);
					setState(1463); match(RBRACKET);
					}
					}
					setState(1468);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1469); match(DOT);
				setState(1470); match(CLASS);
				((PrimaryContext)_localctx).operationType =  7;
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 8);
				{
				setState(1473); match(VOID);
				setState(1474); match(DOT);
				setState(1475); match(CLASS);
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
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
			setState(1479); match(DOT);
			setState(1481);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1480); typeArguments();
				}
			}

			setState(1483); match(Identifier);
			setState(1485);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1484); arguments();
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
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
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
			setState(1509);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1491); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1487); match(LBRACKET);
						setState(1488); expression();
						setState(1489); match(RBRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1493); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				((ThisSuffixContext)_localctx).operationType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1497); arguments();
				((ThisSuffixContext)_localctx).operationType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1500); match(DOT);
				setState(1501); nonWildcardTypeArguments();
				setState(1502); match(Identifier);
				setState(1503); arguments();
				((ThisSuffixContext)_localctx).operationType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1506); innerCreator();
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
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode CLASS() { return getToken(Java7Parser.CLASS, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode THIS() { return getToken(Java7Parser.THIS, 0); }
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
			setState(1548);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1513); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1511); match(LBRACKET);
					setState(1512); match(RBRACKET);
					}
					}
					setState(1515); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACKET );
				setState(1517); match(DOT);
				setState(1518); match(CLASS);
				((IdentifierSuffixContext)_localctx).operationType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1524); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1520); match(LBRACKET);
						setState(1521); expression();
						setState(1522); match(RBRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1526); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				((IdentifierSuffixContext)_localctx).operationType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1530); arguments();
				((IdentifierSuffixContext)_localctx).operationType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1533); match(DOT);
				setState(1534); match(CLASS);
				((IdentifierSuffixContext)_localctx).operationType =  4;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1536); match(DOT);
				setState(1537); nonWildcardTypeArguments();
				setState(1538); match(Identifier);
				setState(1539); arguments();
				((IdentifierSuffixContext)_localctx).operationType =  5;
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1542); match(DOT);
				setState(1543); match(THIS);
				((IdentifierSuffixContext)_localctx).operationType =  6;
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1545); innerCreator();
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

	public static class SelectorContext extends ParserRuleContext {
		public int operationType;
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(Java7Parser.LBRACKET, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(Java7Parser.RBRACKET, 0); }
		public TerminalNode THIS() { return getToken(Java7Parser.THIS, 0); }
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
		enterRule(_localctx, 222, RULE_selector);
		int _la;
		try {
			setState(1572);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1550); match(DOT);
				setState(1551); match(Identifier);
				setState(1553);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1552); arguments();
					}
				}

				((SelectorContext)_localctx).operationType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1556); match(DOT);
				setState(1557); match(THIS);
				((SelectorContext)_localctx).operationType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1559); match(DOT);
				setState(1560); match(SUPER);
				setState(1561); superSuffix();
				((SelectorContext)_localctx).operationType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1564); innerCreator();
				((SelectorContext)_localctx).operationType =  4;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1567); match(LBRACKET);
				setState(1568); expression();
				setState(1569); match(RBRACKET);
				((SelectorContext)_localctx).operationType =  5;
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
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode NEW() { return getToken(Java7Parser.NEW, 0); }
		public ArrayCreatorContext arrayCreator() {
			return getRuleContext(ArrayCreatorContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
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
		enterRule(_localctx, 224, RULE_creator);
		try {
			setState(1584);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1574); match(NEW);
				setState(1575); nonWildcardTypeArguments();
				setState(1576); classOrInterfaceType();
				setState(1577); classCreatorRest();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1579); match(NEW);
				setState(1580); classOrInterfaceType();
				setState(1581); classCreatorRest();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1583); arrayCreator();
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEW() { return getToken(Java7Parser.NEW, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
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
		enterRule(_localctx, 226, RULE_arrayCreator);
		int _la;
		try {
			int _alt;
			setState(1620);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1586); match(NEW);
				setState(1587); createdName();
				setState(1588); match(LBRACKET);
				setState(1589); match(RBRACKET);
				setState(1594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(1590); match(LBRACKET);
					setState(1591); match(RBRACKET);
					}
					}
					setState(1596);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1597); arrayInitializer();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1599); match(NEW);
				setState(1600); createdName();
				setState(1601); match(LBRACKET);
				setState(1602); expression();
				setState(1603); match(RBRACKET);
				setState(1610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1604); match(LBRACKET);
						setState(1605); expression();
						setState(1606); match(RBRACKET);
						}
						} 
					}
					setState(1612);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				}
				setState(1617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1613); match(LBRACKET);
						setState(1614); match(RBRACKET);
						}
						} 
					}
					setState(1619);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
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
		enterRule(_localctx, 228, RULE_variableInitializer);
		try {
			setState(1624);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1622); arrayInitializer();
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
				setState(1623); expression();
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
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
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
		enterRule(_localctx, 230, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1626); match(LBRACE);
			setState(1635);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PLUSPLUS - 67)) | (1L << (SUBSUB - 67)) | (1L << (TILDE - 67)) | (1L << (BANG - 67)) | (1L << (NEW - 67)) | (1L << (PLUS - 67)) | (1L << (SUB - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(1627); variableInitializer();
				setState(1632);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1628); match(COMMA);
						setState(1629); variableInitializer();
						}
						} 
					}
					setState(1634);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
				}
				}
			}

			setState(1638);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1637); match(COMMA);
				}
			}

			setState(1640); match(RBRACE);
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
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
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
		enterRule(_localctx, 232, RULE_createdName);
		try {
			setState(1644);
			switch (_input.LA(1)) {
			case AT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1642); classOrInterfaceType();
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
				setState(1643); primitiveType();
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
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode NEW() { return getToken(Java7Parser.NEW, 0); }
		public IdentifierTypeArgumentContext identifierTypeArgument() {
			return getRuleContext(IdentifierTypeArgumentContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
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
		enterRule(_localctx, 234, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1646); match(DOT);
			setState(1647); match(NEW);
			setState(1649);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1648); nonWildcardTypeArguments();
				}
			}

			setState(1651); identifierTypeArgument();
			setState(1652); classCreatorRest();
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
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
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
		enterRule(_localctx, 236, RULE_classCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654); arguments();
			setState(1656);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1655); classBody();
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
		enterRule(_localctx, 238, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1658); match(LT);
			setState(1659); typeList();
			setState(1660); match(GT);
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
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
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
		enterRule(_localctx, 240, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662); match(LPAREN);
			setState(1664);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (PLUSPLUS - 67)) | (1L << (SUBSUB - 67)) | (1L << (TILDE - 67)) | (1L << (BANG - 67)) | (1L << (NEW - 67)) | (1L << (PLUS - 67)) | (1L << (SUB - 67)) | (1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(1663); expressionList();
				}
			}

			setState(1666); match(RPAREN);
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
		public TerminalNode TRUE() { return getToken(Java7Parser.TRUE, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Java7Parser.CharacterLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(Java7Parser.IntegerLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(Java7Parser.StringLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java7Parser.FloatingPointLiteral, 0); }
		public TerminalNode NULL() { return getToken(Java7Parser.NULL, 0); }
		public TerminalNode FALSE() { return getToken(Java7Parser.FALSE, 0); }
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
		enterRule(_localctx, 242, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			_la = _input.LA(1);
			if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (NULL - 44)) | (1L << (TRUE - 44)) | (1L << (FALSE - 44)) | (1L << (IntegerLiteral - 44)) | (1L << (FloatingPointLiteral - 44)) | (1L << (CharacterLiteral - 44)) | (1L << (StringLiteral - 44)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(Java7Parser.CLASS, 0); }
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
		enterRule(_localctx, 244, RULE_classHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670); modifiers();
			setState(1671); match(CLASS);
			setState(1672); match(Identifier);
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
		public TerminalNode ENUM() { return getToken(Java7Parser.ENUM, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
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
		enterRule(_localctx, 246, RULE_enumHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674); modifiers();
			setState(1675);
			_la = _input.LA(1);
			if ( !(_la==ENUM || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1676); match(Identifier);
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
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode INTERFACE() { return getToken(Java7Parser.INTERFACE, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
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
		enterRule(_localctx, 248, RULE_interfaceHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678); modifiers();
			setState(1679); match(INTERFACE);
			setState(1680); match(Identifier);
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
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode INTERFACE() { return getToken(Java7Parser.INTERFACE, 0); }
		public TerminalNode AT() { return getToken(Java7Parser.AT, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
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
		enterRule(_localctx, 250, RULE_annotationHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682); modifiers();
			setState(1683); match(AT);
			setState(1684); match(INTERFACE);
			setState(1685); match(Identifier);
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
		public TerminalNode ENUM() { return getToken(Java7Parser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode INTERFACE() { return getToken(Java7Parser.INTERFACE, 0); }
		public TerminalNode AT() { return getToken(Java7Parser.AT, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(Java7Parser.CLASS, 0); }
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
		enterRule(_localctx, 252, RULE_typeHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1687); modifiers();
			setState(1694);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(1688); match(CLASS);
				}
				break;
			case ENUM:
				{
				setState(1689); match(ENUM);
				}
				break;
			case INTERFACE:
			case AT:
				{
				{
				setState(1691);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1690); match(AT);
					}
				}

				setState(1693); match(INTERFACE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1696); match(Identifier);
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
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode VOID() { return getToken(Java7Parser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
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
		enterRule(_localctx, 254, RULE_methodHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698); modifiers();
			setState(1700);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1699); typeParameters();
				}
			}

			setState(1704);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1702); type();
				}
				break;

			case 2:
				{
				setState(1703); match(VOID);
				}
				break;
			}
			setState(1706); match(Identifier);
			setState(1707); match(RPAREN);
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
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TerminalNode COMMA() { return getToken(Java7Parser.COMMA, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
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
		enterRule(_localctx, 256, RULE_fieldHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709); modifiers();
			setState(1710); type();
			setState(1711); match(Identifier);
			setState(1716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1712); match(LBRACKET);
				setState(1713); match(RBRACKET);
				}
				}
				setState(1718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1719);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << COMMA) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TerminalNode COMMA() { return getToken(Java7Parser.COMMA, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
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
		enterRule(_localctx, 258, RULE_localVariableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1721); variableModifiers();
			setState(1722); type();
			setState(1723); match(Identifier);
			setState(1728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1724); match(LBRACKET);
				setState(1725); match(RBRACKET);
				}
				}
				setState(1730);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1731);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << COMMA) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public InferredFormalParametersContext inferredFormalParameters() {
			return getRuleContext(InferredFormalParametersContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
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
		enterRule(_localctx, 260, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733); match(LPAREN);
			setState(1735);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1734); inferredFormalParameters();
				}
			}

			setState(1737); match(RPAREN);
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
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
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
		enterRule(_localctx, 262, RULE_inferredFormalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1739); match(Identifier);
			setState(1744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1740); match(COMMA);
				setState(1741); match(Identifier);
				}
				}
				setState(1746);
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
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode LAMBDA() { return getToken(Java7Parser.LAMBDA, 0); }
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
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
		enterRule(_localctx, 264, RULE_lambdaExpression);
		try {
			setState(1752);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1747); lambdaParameters();
				setState(1748); match(LAMBDA);
				setState(1749); lambdaBody();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1751); conditionalExpression();
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
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
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
		enterRule(_localctx, 266, RULE_lambdaParameters);
		try {
			setState(1757);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1754); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1755); formalParameters();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1756); inferredFormalParameterList();
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
		enterRule(_localctx, 268, RULE_lambdaBody);
		try {
			setState(1761);
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
				setState(1759); expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1760); block();
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
		public TerminalNode REF() { return getToken(Java7Parser.REF, 0); }
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public TerminalNode NEW() { return getToken(Java7Parser.NEW, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
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
		enterRule(_localctx, 270, RULE_methodReference);
		int _la;
		try {
			setState(1813);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1810);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1763); typeName();
					setState(1764); match(REF);
					setState(1766);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1765); typeArguments();
						}
					}

					setState(1768); match(Identifier);
					}
					break;

				case 2:
					{
					setState(1770); referenceType();
					setState(1771); match(REF);
					setState(1773);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1772); typeArguments();
						}
					}

					setState(1775); match(Identifier);
					}
					break;

				case 3:
					{
					setState(1777); primary();
					setState(1778); match(REF);
					setState(1780);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1779); typeArguments();
						}
					}

					setState(1782); match(Identifier);
					}
					break;

				case 4:
					{
					setState(1784); match(SUPER);
					setState(1785); match(REF);
					setState(1787);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1786); typeArguments();
						}
					}

					setState(1789); match(Identifier);
					}
					break;

				case 5:
					{
					setState(1790); typeName();
					setState(1791); match(DOT);
					setState(1792); match(SUPER);
					setState(1793); match(REF);
					setState(1795);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1794); typeArguments();
						}
					}

					setState(1797); match(Identifier);
					}
					break;

				case 6:
					{
					setState(1799); classOrInterfaceType();
					setState(1800); match(REF);
					setState(1802);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1801); typeArguments();
						}
					}

					setState(1804); match(NEW);
					}
					break;

				case 7:
					{
					setState(1806); arrayType();
					setState(1807); match(REF);
					setState(1808); match(NEW);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1812); lambdaExpression();
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
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
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
		enterRule(_localctx, 272, RULE_referenceType);
		try {
			setState(1818);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1815); classOrInterfaceType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1816); typeVariable();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1817); arrayType();
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
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
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
		enterRule(_localctx, 274, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1820); annotation();
				}
				}
				setState(1825);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1826); match(Identifier);
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
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
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
		enterRule(_localctx, 276, RULE_typeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1828); match(Identifier);
			setState(1833);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1829); match(DOT);
					setState(1830); match(Identifier);
					}
					} 
				}
				setState(1835);
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
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
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
		enterRule(_localctx, 278, RULE_arrayType);
		try {
			setState(1845);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1836); primitiveType();
				setState(1837); dims();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1839); classOrInterfaceType();
				setState(1840); dims();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1842); typeVariable();
				setState(1843); dims();
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
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
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
		enterRule(_localctx, 280, RULE_dims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1847); annotation();
				}
				}
				setState(1852);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1853); match(LBRACKET);
			setState(1854); match(RBRACKET);
			setState(1865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET || _la==AT) {
				{
				{
				setState(1858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1855); annotation();
					}
					}
					setState(1860);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1861); match(LBRACKET);
				setState(1862); match(RBRACKET);
				}
				}
				setState(1867);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3j\u074f\4\2\t\2\4"+
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
		"\t\u008e\3\2\5\2\u011e\n\2\3\2\7\2\u0121\n\2\f\2\16\2\u0124\13\2\3\2\7"+
		"\2\u0127\n\2\f\2\16\2\u012a\13\2\3\3\5\3\u012d\n\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\5\4\u0135\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u013d\n\4\3\4\3\4\3\4\6"+
		"\4\u0142\n\4\r\4\16\4\u0143\3\4\3\4\5\4\u0148\n\4\3\4\5\4\u014b\n\4\3"+
		"\5\3\5\3\5\7\5\u0150\n\5\f\5\16\5\u0153\13\5\3\6\3\6\5\6\u0157\n\6\3\7"+
		"\3\7\5\7\u015b\n\7\3\b\7\b\u015e\n\b\f\b\16\b\u0161\13\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u016f\n\t\3\n\7\n\u0172\n\n\f\n"+
		"\16\n\u0175\13\n\3\n\5\n\u0178\n\n\3\n\7\n\u017b\n\n\f\n\16\n\u017e\13"+
		"\n\3\13\3\13\5\13\u0182\n\13\3\f\3\f\3\f\3\f\5\f\u0188\n\f\3\f\3\f\5\f"+
		"\u018c\n\f\3\f\3\f\5\f\u0190\n\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u0198\n\r"+
		"\f\r\16\r\u019b\13\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u01a3\n\16\f\16"+
		"\16\16\u01a6\13\16\5\16\u01a8\n\16\3\17\3\17\3\17\7\17\u01ad\n\17\f\17"+
		"\16\17\u01b0\13\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u01ba"+
		"\n\21\3\21\3\21\3\22\3\22\5\22\u01c0\n\22\3\22\5\22\u01c3\n\22\3\22\5"+
		"\22\u01c6\n\22\3\22\3\22\3\23\3\23\3\23\7\23\u01cd\n\23\f\23\16\23\u01d0"+
		"\13\23\3\24\5\24\u01d3\n\24\3\24\3\24\5\24\u01d7\n\24\3\24\5\24\u01da"+
		"\n\24\3\25\3\25\7\25\u01de\n\25\f\25\16\25\u01e1\13\25\3\26\3\26\5\26"+
		"\u01e5\n\26\3\27\3\27\3\27\3\27\5\27\u01eb\n\27\3\27\3\27\5\27\u01ef\n"+
		"\27\3\27\3\27\3\30\3\30\3\30\7\30\u01f6\n\30\f\30\16\30\u01f9\13\30\3"+
		"\31\3\31\7\31\u01fd\n\31\f\31\16\31\u0200\13\31\3\31\3\31\3\32\3\32\7"+
		"\32\u0206\n\32\f\32\16\32\u0209\13\32\3\32\3\32\3\33\3\33\5\33\u020f\n"+
		"\33\3\33\3\33\5\33\u0213\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u021a\n\34"+
		"\3\35\3\35\5\35\u021e\n\35\3\35\3\35\5\35\u0222\n\35\3\35\3\35\3\35\3"+
		"\35\7\35\u0228\n\35\f\35\16\35\u022b\13\35\3\35\3\35\5\35\u022f\n\35\3"+
		"\35\3\35\5\35\u0233\n\35\3\36\3\36\5\36\u0237\n\36\3\36\3\36\3\36\3\36"+
		"\5\36\u023d\n\36\3\36\3\36\3\37\3\37\5\37\u0243\n\37\3\37\7\37\u0246\n"+
		"\37\f\37\16\37\u0249\13\37\3\37\3\37\3 \3 \3 \3 \3 \7 \u0252\n \f \16"+
		" \u0255\13 \3 \3 \3!\3!\3!\7!\u025c\n!\f!\16!\u025f\13!\3!\3!\5!\u0263"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u026b\n\"\3#\3#\5#\u026f\n#\3#\3#\5#\u0273"+
		"\n#\3#\3#\3#\3#\7#\u0279\n#\f#\16#\u027c\13#\3#\3#\5#\u0280\n#\3#\3#\5"+
		"#\u0284\n#\3$\3$\3$\3$\3$\5$\u028b\n$\3$\5$\u028e\n$\3$\3$\5$\u0292\n"+
		"$\3$\3$\3$\3$\7$\u0298\n$\f$\16$\u029b\13$\3$\3$\5$\u029f\n$\3$\3$\5$"+
		"\u02a3\n$\3%\3%\3%\3%\3%\7%\u02aa\n%\f%\16%\u02ad\13%\3%\3%\3&\3&\3&\7"+
		"&\u02b4\n&\f&\16&\u02b7\13&\3&\3&\3&\7&\u02bc\n&\f&\16&\u02bf\13&\5&\u02c1"+
		"\n&\3\'\3\'\3\'\7\'\u02c6\n\'\f\'\16\'\u02c9\13\'\3(\7(\u02cc\n(\f(\16"+
		"(\u02cf\13(\3(\3(\5(\u02d3\n(\3)\3)\3*\3*\3*\3*\7*\u02db\n*\f*\16*\u02de"+
		"\13*\3*\3*\3*\3*\5*\u02e4\n*\3+\3+\3+\3+\5+\u02ea\n+\5+\u02ec\n+\3,\3"+
		",\3,\7,\u02f1\n,\f,\16,\u02f4\13,\3-\3-\5-\u02f8\n-\3-\3-\3.\3.\3.\3."+
		"\3.\3.\7.\u0302\n.\f.\16.\u0305\13.\3.\3.\3.\3.\3.\6.\u030c\n.\r.\16."+
		"\u030d\3.\3.\3.\5.\u0313\n.\3/\3/\3/\3/\3/\7/\u031a\n/\f/\16/\u031d\13"+
		"/\3\60\3\60\3\60\3\60\3\60\3\61\5\61\u0325\n\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\5\61\u032e\n\61\3\61\3\61\3\61\3\61\5\61\u0334\n\61\3\62"+
		"\3\62\3\62\7\62\u0339\n\62\f\62\16\62\u033c\13\62\3\63\6\63\u033f\n\63"+
		"\r\63\16\63\u0340\3\64\3\64\3\64\5\64\u0346\n\64\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\5\67\u0355\n\67\3\67\3\67"+
		"\38\38\38\78\u035c\n8\f8\168\u035f\138\39\39\39\39\3:\3:\3:\5:\u0368\n"+
		":\3;\3;\3;\3;\7;\u036e\n;\f;\16;\u0371\13;\5;\u0373\n;\3;\5;\u0376\n;"+
		"\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\7=\u0382\n=\f=\16=\u0385\13=\3=\3=\3>\3"+
		">\3>\3>\3>\3>\3>\5>\u0390\n>\3?\3?\3?\3?\3?\3?\3?\5?\u0399\n?\3?\3?\3"+
		"@\3@\7@\u039f\n@\f@\16@\u03a2\13@\3@\3@\3A\3A\3A\5A\u03a9\nA\3B\3B\3B"+
		"\3C\3C\3C\3C\3C\7C\u03b3\nC\fC\16C\u03b6\13C\3D\3D\3D\3D\3D\5D\u03bd\n"+
		"D\3D\3D\3D\3D\3D\3D\3D\5D\u03c6\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u03e0\nD\3D\3D\3D\3D\3D\3D\3"+
		"D\5D\u03e9\nD\3D\3D\3D\5D\u03ee\nD\3D\3D\3D\3D\3D\3D\3D\3D\5D\u03f8\n"+
		"D\3E\3E\3F\7F\u03fd\nF\fF\16F\u0400\13F\3G\3G\7G\u0404\nG\fG\16G\u0407"+
		"\13G\3H\3H\3H\3H\3H\3H\5H\u040f\nH\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u042a\nI\3J\3J\3J\3J\5J\u0430"+
		"\nJ\3J\3J\5J\u0434\nJ\3K\3K\3K\5K\u0439\nK\3K\3K\3L\3L\3L\7L\u0440\nL"+
		"\fL\16L\u0443\13L\3M\5M\u0446\nM\3M\3M\3M\3M\3M\3N\3N\7N\u044f\nN\fN\16"+
		"N\u0452\13N\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\7P\u045e\nP\fP\16P\u0461\13"+
		"P\3P\3P\3P\7P\u0466\nP\fP\16P\u0469\13P\3Q\3Q\5Q\u046d\nQ\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\3R\3S\3S\3S\5S\u047c\nS\3S\3S\5S\u0480\nS\3S\3S\5S\u0484"+
		"\nS\3S\3S\3S\3T\3T\5T\u048b\nT\3U\3U\3U\3U\3V\3V\3V\7V\u0494\nV\fV\16"+
		"V\u0497\13V\3W\3W\3W\3W\5W\u049d\nW\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u04be\n"+
		"X\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u04c6\nY\3Z\3Z\3Z\7Z\u04cb\nZ\fZ\16Z\u04ce\13Z"+
		"\3[\3[\3[\7[\u04d3\n[\f[\16[\u04d6\13[\3\\\3\\\3\\\7\\\u04db\n\\\f\\\16"+
		"\\\u04de\13\\\3]\3]\3]\7]\u04e3\n]\f]\16]\u04e6\13]\3^\3^\3^\7^\u04eb"+
		"\n^\f^\16^\u04ee\13^\3_\3_\3_\7_\u04f3\n_\f_\16_\u04f6\13_\3`\3`\3`\7"+
		"`\u04fb\n`\f`\16`\u04fe\13`\3a\3a\3a\5a\u0503\na\3b\3b\3b\3b\7b\u0509"+
		"\nb\fb\16b\u050c\13b\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0518\nc\3d\3d\3"+
		"d\3d\7d\u051e\nd\fd\16d\u0521\13d\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u052d"+
		"\ne\3f\3f\3f\3f\7f\u0533\nf\ff\16f\u0536\13f\3g\3g\3g\3g\5g\u053c\ng\3"+
		"h\3h\3h\3h\7h\u0542\nh\fh\16h\u0545\13h\3i\3i\3i\3i\3i\3i\5i\u054d\ni"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u055c\nj\3k\3k\3k\7k\u0561"+
		"\nk\fk\16k\u0564\13k\3k\5k\u0567\nk\5k\u0569\nk\3l\3l\3l\3l\3l\3l\3l\3"+
		"l\7l\u0573\nl\fl\16l\u0576\13l\3l\3l\3l\3l\3l\3l\7l\u057e\nl\fl\16l\u0581"+
		"\13l\3l\3l\3l\3l\3l\3l\7l\u0589\nl\fl\16l\u058c\13l\3l\3l\3l\5l\u0591"+
		"\nl\3m\3m\3m\3m\3m\3m\7m\u0599\nm\fm\16m\u059c\13m\3m\5m\u059f\nm\3m\3"+
		"m\3m\3m\7m\u05a5\nm\fm\16m\u05a8\13m\3m\5m\u05ab\nm\3m\3m\3m\3m\3m\3m"+
		"\3m\3m\3m\3m\3m\3m\3m\3m\7m\u05bb\nm\fm\16m\u05be\13m\3m\3m\3m\3m\3m\3"+
		"m\3m\3m\5m\u05c8\nm\3n\3n\5n\u05cc\nn\3n\3n\5n\u05d0\nn\3o\3o\3o\3o\6"+
		"o\u05d6\no\ro\16o\u05d7\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u05e8"+
		"\no\3p\3p\6p\u05ec\np\rp\16p\u05ed\3p\3p\3p\3p\3p\3p\3p\6p\u05f7\np\r"+
		"p\16p\u05f8\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3"+
		"p\5p\u060f\np\3q\3q\3q\5q\u0614\nq\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3q\3q\3q\3q\3q\5q\u0627\nq\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\5r\u0633\n"+
		"r\3s\3s\3s\3s\3s\3s\7s\u063b\ns\fs\16s\u063e\13s\3s\3s\3s\3s\3s\3s\3s"+
		"\3s\3s\3s\3s\7s\u064b\ns\fs\16s\u064e\13s\3s\3s\7s\u0652\ns\fs\16s\u0655"+
		"\13s\5s\u0657\ns\3t\3t\5t\u065b\nt\3u\3u\3u\3u\7u\u0661\nu\fu\16u\u0664"+
		"\13u\5u\u0666\nu\3u\5u\u0669\nu\3u\3u\3v\3v\5v\u066f\nv\3w\3w\3w\5w\u0674"+
		"\nw\3w\3w\3w\3x\3x\5x\u067b\nx\3y\3y\3y\3y\3z\3z\5z\u0683\nz\3z\3z\3{"+
		"\3{\3|\3|\3|\3|\3}\3}\3}\3}\3~\3~\3~\3~\3\177\3\177\3\177\3\177\3\177"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u069e\n\u0080\3\u0080\5\u0080"+
		"\u06a1\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081\5\u0081\u06a7\n\u0081\3"+
		"\u0081\3\u0081\5\u0081\u06ab\n\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3"+
		"\u0082\3\u0082\3\u0082\3\u0082\7\u0082\u06b5\n\u0082\f\u0082\16\u0082"+
		"\u06b8\13\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\7\u0083\u06c1\n\u0083\f\u0083\16\u0083\u06c4\13\u0083\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\5\u0084\u06ca\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085"+
		"\3\u0085\7\u0085\u06d1\n\u0085\f\u0085\16\u0085\u06d4\13\u0085\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u06db\n\u0086\3\u0087\3\u0087"+
		"\3\u0087\5\u0087\u06e0\n\u0087\3\u0088\3\u0088\5\u0088\u06e4\n\u0088\3"+
		"\u0089\3\u0089\3\u0089\5\u0089\u06e9\n\u0089\3\u0089\3\u0089\3\u0089\3"+
		"\u0089\3\u0089\5\u0089\u06f0\n\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3"+
		"\u0089\5\u0089\u06f7\n\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5"+
		"\u0089\u06fe\n\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5"+
		"\u0089\u0706\n\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u070d"+
		"\n\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0715"+
		"\n\u0089\3\u0089\5\u0089\u0718\n\u0089\3\u008a\3\u008a\3\u008a\5\u008a"+
		"\u071d\n\u008a\3\u008b\7\u008b\u0720\n\u008b\f\u008b\16\u008b\u0723\13"+
		"\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\7\u008c\u072a\n\u008c\f"+
		"\u008c\16\u008c\u072d\13\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0738\n\u008d\3\u008e\7\u008e"+
		"\u073b\n\u008e\f\u008e\16\u008e\u073e\13\u008e\3\u008e\3\u008e\3\u008e"+
		"\7\u008e\u0743\n\u008e\f\u008e\16\u008e\u0746\13\u008e\3\u008e\3\u008e"+
		"\7\u008e\u074a\n\u008e\f\u008e\16\u008e\u074d\13\u008e\3\u008e\2\2\u008f"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\2\t"+
		"\3\2!(\4\2**--\3\2,-\3\2EF\4\2.\60be\4\2BBff\5\2\3\3\21\21\34\34\u07ec"+
		"\2\u011d\3\2\2\2\4\u012c\3\2\2\2\6\u014a\3\2\2\2\b\u014c\3\2\2\2\n\u0156"+
		"\3\2\2\2\f\u015a\3\2\2\2\16\u015f\3\2\2\2\20\u016e\3\2\2\2\22\u0173\3"+
		"\2\2\2\24\u0181\3\2\2\2\26\u0183\3\2\2\2\30\u0193\3\2\2\2\32\u019e\3\2"+
		"\2\2\34\u01a9\3\2\2\2\36\u01b1\3\2\2\2 \u01b4\3\2\2\2\"\u01bd\3\2\2\2"+
		"$\u01c9\3\2\2\2&\u01d2\3\2\2\2(\u01db\3\2\2\2*\u01e4\3\2\2\2,\u01e6\3"+
		"\2\2\2.\u01f2\3\2\2\2\60\u01fa\3\2\2\2\62\u0203\3\2\2\2\64\u0212\3\2\2"+
		"\2\66\u0219\3\2\2\28\u021b\3\2\2\2:\u0234\3\2\2\2<\u0240\3\2\2\2>\u024c"+
		"\3\2\2\2@\u0258\3\2\2\2B\u026a\3\2\2\2D\u026c\3\2\2\2F\u028a\3\2\2\2H"+
		"\u02a4\3\2\2\2J\u02c0\3\2\2\2L\u02c2\3\2\2\2N\u02cd\3\2\2\2P\u02d4\3\2"+
		"\2\2R\u02e3\3\2\2\2T\u02eb\3\2\2\2V\u02ed\3\2\2\2X\u02f5\3\2\2\2Z\u0312"+
		"\3\2\2\2\\\u0314\3\2\2\2^\u031e\3\2\2\2`\u0333\3\2\2\2b\u0335\3\2\2\2"+
		"d\u033e\3\2\2\2f\u0345\3\2\2\2h\u0347\3\2\2\2j\u034a\3\2\2\2l\u0350\3"+
		"\2\2\2n\u0358\3\2\2\2p\u0360\3\2\2\2r\u0367\3\2\2\2t\u0369\3\2\2\2v\u0379"+
		"\3\2\2\2x\u037f\3\2\2\2z\u038f\3\2\2\2|\u0391\3\2\2\2~\u039c\3\2\2\2\u0080"+
		"\u03a8\3\2\2\2\u0082\u03aa\3\2\2\2\u0084\u03ad\3\2\2\2\u0086\u03f7\3\2"+
		"\2\2\u0088\u03f9\3\2\2\2\u008a\u03fe\3\2\2\2\u008c\u0401\3\2\2\2\u008e"+
		"\u040e\3\2\2\2\u0090\u0429\3\2\2\2\u0092\u042b\3\2\2\2\u0094\u0435\3\2"+
		"\2\2\u0096\u043c\3\2\2\2\u0098\u0445\3\2\2\2\u009a\u044c\3\2\2\2\u009c"+
		"\u0453\3\2\2\2\u009e\u0459\3\2\2\2\u00a0\u046c\3\2\2\2\u00a2\u046e\3\2"+
		"\2\2\u00a4\u0478\3\2\2\2\u00a6\u048a\3\2\2\2\u00a8\u048c\3\2\2\2\u00aa"+
		"\u0490\3\2\2\2\u00ac\u0498\3\2\2\2\u00ae\u04bd\3\2\2\2\u00b0\u04bf\3\2"+
		"\2\2\u00b2\u04c7\3\2\2\2\u00b4\u04cf\3\2\2\2\u00b6\u04d7\3\2\2\2\u00b8"+
		"\u04df\3\2\2\2\u00ba\u04e7\3\2\2\2\u00bc\u04ef\3\2\2\2\u00be\u04f7\3\2"+
		"\2\2\u00c0\u04ff\3\2\2\2\u00c2\u0504\3\2\2\2\u00c4\u0517\3\2\2\2\u00c6"+
		"\u0519\3\2\2\2\u00c8\u052c\3\2\2\2\u00ca\u052e\3\2\2\2\u00cc\u053b\3\2"+
		"\2\2\u00ce\u053d\3\2\2\2\u00d0\u054c\3\2\2\2\u00d2\u055b\3\2\2\2\u00d4"+
		"\u0568\3\2\2\2\u00d6\u0590\3\2\2\2\u00d8\u05c7\3\2\2\2\u00da\u05c9\3\2"+
		"\2\2\u00dc\u05e7\3\2\2\2\u00de\u060e\3\2\2\2\u00e0\u0626\3\2\2\2\u00e2"+
		"\u0632\3\2\2\2\u00e4\u0656\3\2\2\2\u00e6\u065a\3\2\2\2\u00e8\u065c\3\2"+
		"\2\2\u00ea\u066e\3\2\2\2\u00ec\u0670\3\2\2\2\u00ee\u0678\3\2\2\2\u00f0"+
		"\u067c\3\2\2\2\u00f2\u0680\3\2\2\2\u00f4\u0686\3\2\2\2\u00f6\u0688\3\2"+
		"\2\2\u00f8\u068c\3\2\2\2\u00fa\u0690\3\2\2\2\u00fc\u0694\3\2\2\2\u00fe"+
		"\u0699\3\2\2\2\u0100\u06a4\3\2\2\2\u0102\u06af\3\2\2\2\u0104\u06bb\3\2"+
		"\2\2\u0106\u06c7\3\2\2\2\u0108\u06cd\3\2\2\2\u010a\u06da\3\2\2\2\u010c"+
		"\u06df\3\2\2\2\u010e\u06e3\3\2\2\2\u0110\u0717\3\2\2\2\u0112\u071c\3\2"+
		"\2\2\u0114\u0721\3\2\2\2\u0116\u0726\3\2\2\2\u0118\u0737\3\2\2\2\u011a"+
		"\u073c\3\2\2\2\u011c\u011e\5\4\3\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u0122\3\2\2\2\u011f\u0121\5\6\4\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0128\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0125\u0127\5\n\6\2\u0126\u0125\3\2\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\3\3\2\2\2"+
		"\u012a\u0128\3\2\2\2\u012b\u012d\5d\63\2\u012c\u012b\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7\4\2\2\u012f\u0130\5b\62\2\u0130"+
		"\u0131\7\3\2\2\u0131\5\3\2\2\2\u0132\u0134\7\5\2\2\u0133\u0135\7\16\2"+
		"\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137"+
		"\7f\2\2\u0137\u0138\7\6\2\2\u0138\u0139\7\7\2\2\u0139\u014b\7\3\2\2\u013a"+
		"\u013c\7\5\2\2\u013b\u013d\7\16\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3"+
		"\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\7f\2\2\u013f\u0140\7\6\2\2\u0140"+
		"\u0142\7f\2\2\u0141\u013f\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0146\7\6\2\2\u0146"+
		"\u0148\7\7\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u014b\7\3\2\2\u014a\u0132\3\2\2\2\u014a\u013a\3\2\2\2\u014b"+
		"\7\3\2\2\2\u014c\u0151\7f\2\2\u014d\u014e\7\6\2\2\u014e\u0150\7f\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\t\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0157\5\f\7\2\u0155\u0157"+
		"\7\3\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157\13\3\2\2\2\u0158"+
		"\u015b\5\24\13\2\u0159\u015b\5*\26\2\u015a\u0158\3\2\2\2\u015a\u0159\3"+
		"\2\2\2\u015b\r\3\2\2\2\u015c\u015e\5\20\t\2\u015d\u015c\3\2\2\2\u015e"+
		"\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\17\3\2\2"+
		"\2\u0161\u015f\3\2\2\2\u0162\u016f\5f\64\2\u0163\u016f\7\n\2\2\u0164\u016f"+
		"\7\13\2\2\u0165\u016f\7\f\2\2\u0166\u016f\7\16\2\2\u0167\u016f\7\r\2\2"+
		"\u0168\u016f\7\17\2\2\u0169\u016f\7\35\2\2\u016a\u016f\7\36\2\2\u016b"+
		"\u016f\7\37\2\2\u016c\u016f\7 \2\2\u016d\u016f\7\20\2\2\u016e\u0162\3"+
		"\2\2\2\u016e\u0163\3\2\2\2\u016e\u0164\3\2\2\2\u016e\u0165\3\2\2\2\u016e"+
		"\u0166\3\2\2\2\u016e\u0167\3\2\2\2\u016e\u0168\3\2\2\2\u016e\u0169\3\2"+
		"\2\2\u016e\u016a\3\2\2\2\u016e\u016b\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016d\3\2\2\2\u016f\21\3\2\2\2\u0170\u0172\5f\64\2\u0171\u0170\3\2\2"+
		"\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0177"+
		"\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178\7\17\2\2\u0177\u0176\3\2\2\2"+
		"\u0177\u0178\3\2\2\2\u0178\u017c\3\2\2\2\u0179\u017b\5f\64\2\u017a\u0179"+
		"\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\23\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0182\5\26\f\2\u0180\u0182\5 \21"+
		"\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182\25\3\2\2\2\u0183\u0184"+
		"\5\16\b\2\u0184\u0185\7\b\2\2\u0185\u0187\7f\2\2\u0186\u0188\5\30\r\2"+
		"\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u018a"+
		"\7*\2\2\u018a\u018c\5J&\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018f\3\2\2\2\u018d\u018e\7\t\2\2\u018e\u0190\5.\30\2\u018f\u018d\3\2"+
		"\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\5\60\31\2\u0192"+
		"\27\3\2\2\2\u0193\u0194\7^\2\2\u0194\u0199\5\32\16\2\u0195\u0196\7\21"+
		"\2\2\u0196\u0198\5\32\16\2\u0197\u0195\3\2\2\2\u0198\u019b\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2"+
		"\2\2\u019c\u019d\7]\2\2\u019d\31\3\2\2\2\u019e\u01a7\7f\2\2\u019f\u01a0"+
		"\7*\2\2\u01a0\u01a4\5\34\17\2\u01a1\u01a3\5\36\20\2\u01a2\u01a1\3\2\2"+
		"\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a8"+
		"\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u019f\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\33\3\2\2\2\u01a9\u01ae\5J&\2\u01aa\u01ab\7P\2\2\u01ab\u01ad\5J&\2\u01ac"+
		"\u01aa\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af\35\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\7P\2\2\u01b2\u01b3"+
		"\5L\'\2\u01b3\37\3\2\2\2\u01b4\u01b5\5\16\b\2\u01b5\u01b6\7B\2\2\u01b6"+
		"\u01b9\7f\2\2\u01b7\u01b8\7\t\2\2\u01b8\u01ba\5.\30\2\u01b9\u01b7\3\2"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\5\"\22\2\u01bc"+
		"!\3\2\2\2\u01bd\u01bf\7\22\2\2\u01be\u01c0\5$\23\2\u01bf\u01be\3\2\2\2"+
		"\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01c3\7\21\2\2\u01c2\u01c1"+
		"\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c6\5(\25\2\u01c5"+
		"\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7\23"+
		"\2\2\u01c8#\3\2\2\2\u01c9\u01ce\5&\24\2\u01ca\u01cb\7\21\2\2\u01cb\u01cd"+
		"\5&\24\2\u01cc\u01ca\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf%\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d3\5d\63\2"+
		"\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6"+
		"\7f\2\2\u01d5\u01d7\5\u00f2z\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2"+
		"\u01d7\u01d9\3\2\2\2\u01d8\u01da\5\60\31\2\u01d9\u01d8\3\2\2\2\u01d9\u01da"+
		"\3\2\2\2\u01da\'\3\2\2\2\u01db\u01df\7\3\2\2\u01dc\u01de\5\64\33\2\u01dd"+
		"\u01dc\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e0)\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e5\5,\27\2\u01e3\u01e5"+
		"\5v<\2\u01e4\u01e2\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5+\3\2\2\2\u01e6\u01e7"+
		"\5\16\b\2\u01e7\u01e8\7\31\2\2\u01e8\u01ea\7f\2\2\u01e9\u01eb\5\30\r\2"+
		"\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ed"+
		"\7*\2\2\u01ed\u01ef\5.\30\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f1\5\62\32\2\u01f1-\3\2\2\2\u01f2\u01f7\5J&\2"+
		"\u01f3\u01f4\7\21\2\2\u01f4\u01f6\5J&\2\u01f5\u01f3\3\2\2\2\u01f6\u01f9"+
		"\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8/\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01fa\u01fe\7\22\2\2\u01fb\u01fd\5\64\33\2\u01fc\u01fb"+
		"\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0201\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0202\7\23\2\2\u0202\61\3\2\2"+
		"\2\u0203\u0207\7\22\2\2\u0204\u0206\5B\"\2\u0205\u0204\3\2\2\2\u0206\u0209"+
		"\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u020a\u020b\7\23\2\2\u020b\63\3\2\2\2\u020c\u0213\7\3\2"+
		"\2\u020d\u020f\7\16\2\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0213\5~@\2\u0211\u0213\5\66\34\2\u0212\u020c\3\2"+
		"\2\2\u0212\u020e\3\2\2\2\u0212\u0211\3\2\2\2\u0213\65\3\2\2\2\u0214\u021a"+
		"\5:\36\2\u0215\u021a\5> \2\u0216\u021a\58\35\2\u0217\u021a\5\24\13\2\u0218"+
		"\u021a\5*\26\2\u0219\u0214\3\2\2\2\u0219\u0215\3\2\2\2\u0219\u0216\3\2"+
		"\2\2\u0219\u0217\3\2\2\2\u0219\u0218\3\2\2\2\u021a\67\3\2\2\2\u021b\u021d"+
		"\5\16\b\2\u021c\u021e\5\30\r\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2"+
		"\u021e\u0221\3\2\2\2\u021f\u0222\5J&\2\u0220\u0222\7\30\2\2\u0221\u021f"+
		"\3\2\2\2\u0221\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\7f\2\2\u0224"+
		"\u0229\5X-\2\u0225\u0226\7\24\2\2\u0226\u0228\7\25\2\2\u0227\u0225\3\2"+
		"\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022e\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022d\7\33\2\2\u022d\u022f\5"+
		"V,\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0232\3\2\2\2\u0230"+
		"\u0233\5~@\2\u0231\u0233\7\3\2\2\u0232\u0230\3\2\2\2\u0232\u0231\3\2\2"+
		"\2\u02339\3\2\2\2\u0234\u0236\5\16\b\2\u0235\u0237\5\30\r\2\u0236\u0235"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\7f\2\2\u0239"+
		"\u023c\5X-\2\u023a\u023b\7\33\2\2\u023b\u023d\5V,\2\u023c\u023a\3\2\2"+
		"\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\5<\37\2\u023f;"+
		"\3\2\2\2\u0240\u0242\7\22\2\2\u0241\u0243\5`\61\2\u0242\u0241\3\2\2\2"+
		"\u0242\u0243\3\2\2\2\u0243\u0247\3\2\2\2\u0244\u0246\5\u0080A\2\u0245"+
		"\u0244\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2"+
		"\2\2\u0248\u024a\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024b\7\23\2\2\u024b"+
		"=\3\2\2\2\u024c\u024d\5\16\b\2\u024d\u024e\5J&\2\u024e\u0253\5@!\2\u024f"+
		"\u0250\7\21\2\2\u0250\u0252\5@!\2\u0251\u024f\3\2\2\2\u0252\u0255\3\2"+
		"\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255"+
		"\u0253\3\2\2\2\u0256\u0257\7\3\2\2\u0257?\3\2\2\2\u0258\u025d\7f\2\2\u0259"+
		"\u025a\7\24\2\2\u025a\u025c\7\25\2\2\u025b\u0259\3\2\2\2\u025c\u025f\3"+
		"\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0262\3\2\2\2\u025f"+
		"\u025d\3\2\2\2\u0260\u0261\7\34\2\2\u0261\u0263\5\u00e6t\2\u0262\u0260"+
		"\3\2\2\2\u0262\u0263\3\2\2\2\u0263A\3\2\2\2\u0264\u026b\5H%\2\u0265\u026b"+
		"\5D#\2\u0266\u026b\5F$\2\u0267\u026b\5*\26\2\u0268\u026b\5\24\13\2\u0269"+
		"\u026b\7\3\2\2\u026a\u0264\3\2\2\2\u026a\u0265\3\2\2\2\u026a\u0266\3\2"+
		"\2\2\u026a\u0267\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u0269\3\2\2\2\u026b"+
		"C\3\2\2\2\u026c\u026e\5\16\b\2\u026d\u026f\5\30\r\2\u026e\u026d\3\2\2"+
		"\2\u026e\u026f\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u0273\5J&\2\u0271\u0273"+
		"\7\30\2\2\u0272\u0270\3\2\2\2\u0272\u0271\3\2\2\2\u0273\u0274\3\2\2\2"+
		"\u0274\u0275\7f\2\2\u0275\u027a\5X-\2\u0276\u0277\7\24\2\2\u0277\u0279"+
		"\7\25\2\2\u0278\u0276\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2"+
		"\u027a\u027b\3\2\2\2\u027b\u027f\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u027e"+
		"\7\33\2\2\u027e\u0280\5V,\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u0283\3\2\2\2\u0281\u0284\5~@\2\u0282\u0284\7\3\2\2\u0283\u0281\3\2\2"+
		"\2\u0283\u0282\3\2\2\2\u0284E\3\2\2\2\u0285\u0286\7\62\2\2\u0286\u028b"+
		"\5\16\b\2\u0287\u0288\5\16\b\2\u0288\u0289\7\62\2\2\u0289\u028b\3\2\2"+
		"\2\u028a\u0285\3\2\2\2\u028a\u0287\3\2\2\2\u028b\u028d\3\2\2\2\u028c\u028e"+
		"\5\30\r\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0291\3\2\2\2"+
		"\u028f\u0292\5J&\2\u0290\u0292\7\30\2\2\u0291\u028f\3\2\2\2\u0291\u0290"+
		"\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\7f\2\2\u0294\u0299\5X-\2\u0295"+
		"\u0296\7\24\2\2\u0296\u0298\7\25\2\2\u0297\u0295\3\2\2\2\u0298\u029b\3"+
		"\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029e\3\2\2\2\u029b"+
		"\u0299\3\2\2\2\u029c\u029d\7\33\2\2\u029d\u029f\5V,\2\u029e\u029c\3\2"+
		"\2\2\u029e\u029f\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u02a3\5~@\2\u02a1\u02a3"+
		"\7\3\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a1\3\2\2\2\u02a3G\3\2\2\2\u02a4"+
		"\u02a5\5\16\b\2\u02a5\u02a6\5J&\2\u02a6\u02ab\5@!\2\u02a7\u02a8\7\21\2"+
		"\2\u02a8\u02aa\5@!\2\u02a9\u02a7\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9"+
		"\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae"+
		"\u02af\7\3\2\2\u02afI\3\2\2\2\u02b0\u02b5\5L\'\2\u02b1\u02b2\7\24\2\2"+
		"\u02b2\u02b4\7\25\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3"+
		"\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02c1\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8"+
		"\u02bd\5P)\2\u02b9\u02ba\7\24\2\2\u02ba\u02bc\7\25\2\2\u02bb\u02b9\3\2"+
		"\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02b0\3\2\2\2\u02c0\u02b8\3\2"+
		"\2\2\u02c1K\3\2\2\2\u02c2\u02c7\5N(\2\u02c3\u02c4\7\6\2\2\u02c4\u02c6"+
		"\5N(\2\u02c5\u02c3\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8M\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cc\5f\64\2"+
		"\u02cb\u02ca\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce"+
		"\3\2\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d2\7f\2\2\u02d1"+
		"\u02d3\5R*\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3O\3\2\2\2\u02d4"+
		"\u02d5\t\2\2\2\u02d5Q\3\2\2\2\u02d6\u02d7\7^\2\2\u02d7\u02dc\5T+\2\u02d8"+
		"\u02d9\7\21\2\2\u02d9\u02db\5T+\2\u02da\u02d8\3\2\2\2\u02db\u02de\3\2"+
		"\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df\3\2\2\2\u02de"+
		"\u02dc\3\2\2\2\u02df\u02e0\7]\2\2\u02e0\u02e4\3\2\2\2\u02e1\u02e2\7^\2"+
		"\2\u02e2\u02e4\7]\2\2\u02e3\u02d6\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e4S\3"+
		"\2\2\2\u02e5\u02ec\5J&\2\u02e6\u02e9\7)\2\2\u02e7\u02e8\t\3\2\2\u02e8"+
		"\u02ea\5J&\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ec\3\2\2"+
		"\2\u02eb\u02e5\3\2\2\2\u02eb\u02e6\3\2\2\2\u02ecU\3\2\2\2\u02ed\u02f2"+
		"\5b\62\2\u02ee\u02ef\7\21\2\2\u02ef\u02f1\5b\62\2\u02f0\u02ee\3\2\2\2"+
		"\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3W\3"+
		"\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02f7\7\26\2\2\u02f6\u02f8\5Z.\2\u02f7"+
		"\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\7\27"+
		"\2\2\u02faY\3\2\2\2\u02fb\u02fc\5^\60\2\u02fc\u02fd\b.\1\2\u02fd\u0313"+
		"\3\2\2\2\u02fe\u0303\5\\/\2\u02ff\u0300\7\21\2\2\u0300\u0302\5\\/\2\u0301"+
		"\u02ff\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2"+
		"\2\2\u0304\u0306\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u0307\b.\1\2\u0307"+
		"\u0313\3\2\2\2\u0308\u0309\5\\/\2\u0309\u030a\7\21\2\2\u030a\u030c\3\2"+
		"\2\2\u030b\u0308\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030b\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\5^\60\2\u0310\u0311\b."+
		"\1\2\u0311\u0313\3\2\2\2\u0312\u02fb\3\2\2\2\u0312\u02fe\3\2\2\2\u0312"+
		"\u030b\3\2\2\2\u0313[\3\2\2\2\u0314\u0315\5\22\n\2\u0315\u0316\5J&\2\u0316"+
		"\u031b\7f\2\2\u0317\u0318\7\24\2\2\u0318\u031a\7\25\2\2\u0319\u0317\3"+
		"\2\2\2\u031a\u031d\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c"+
		"]\3\2\2\2\u031d\u031b\3\2\2\2\u031e\u031f\5\22\n\2\u031f\u0320\5J&\2\u0320"+
		"\u0321\7+\2\2\u0321\u0322\7f\2\2\u0322_\3\2\2\2\u0323\u0325\5\u00f0y\2"+
		"\u0324\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327"+
		"\t\4\2\2\u0327\u0328\5\u00f2z\2\u0328\u0329\7\3\2\2\u0329\u0334\3\2\2"+
		"\2\u032a\u032b\5\u00d8m\2\u032b\u032d\7\6\2\2\u032c\u032e\5\u00f0y\2\u032d"+
		"\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330\7-"+
		"\2\2\u0330\u0331\5\u00f2z\2\u0331\u0332\7\3\2\2\u0332\u0334\3\2\2\2\u0333"+
		"\u0324\3\2\2\2\u0333\u032a\3\2\2\2\u0334a\3\2\2\2\u0335\u033a\7f\2\2\u0336"+
		"\u0337\7\6\2\2\u0337\u0339\7f\2\2\u0338\u0336\3\2\2\2\u0339\u033c\3\2"+
		"\2\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033bc\3\2\2\2\u033c\u033a"+
		"\3\2\2\2\u033d\u033f\5f\64\2\u033e\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340"+
		"\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341e\3\2\2\2\u0342\u0346\5h\65\2"+
		"\u0343\u0346\5j\66\2\u0344\u0346\5l\67\2\u0345\u0342\3\2\2\2\u0345\u0343"+
		"\3\2\2\2\u0345\u0344\3\2\2\2\u0346g\3\2\2\2\u0347\u0348\7\61\2\2\u0348"+
		"\u0349\5b\62\2\u0349i\3\2\2\2\u034a\u034b\7\61\2\2\u034b\u034c\5b\62\2"+
		"\u034c\u034d\7\26\2\2\u034d\u034e\5r:\2\u034e\u034f\7\27\2\2\u034fk\3"+
		"\2\2\2\u0350\u0351\7\61\2\2\u0351\u0352\5b\62\2\u0352\u0354\7\26\2\2\u0353"+
		"\u0355\5n8\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\3\2\2"+
		"\2\u0356\u0357\7\27\2\2\u0357m\3\2\2\2\u0358\u035d\5p9\2\u0359\u035a\7"+
		"\21\2\2\u035a\u035c\5p9\2\u035b\u0359\3\2\2\2\u035c\u035f\3\2\2\2\u035d"+
		"\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035eo\3\2\2\2\u035f\u035d\3\2\2\2"+
		"\u0360\u0361\7f\2\2\u0361\u0362\7\34\2\2\u0362\u0363\5r:\2\u0363q\3\2"+
		"\2\2\u0364\u0368\5\u00b0Y\2\u0365\u0368\5f\64\2\u0366\u0368\5t;\2\u0367"+
		"\u0364\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0366\3\2\2\2\u0368s\3\2\2\2"+
		"\u0369\u0372\7\22\2\2\u036a\u036f\5r:\2\u036b\u036c\7\21\2\2\u036c\u036e"+
		"\5r:\2\u036d\u036b\3\2\2\2\u036e\u0371\3\2\2\2\u036f\u036d\3\2\2\2\u036f"+
		"\u0370\3\2\2\2\u0370\u0373\3\2\2\2\u0371\u036f\3\2\2\2\u0372\u036a\3\2"+
		"\2\2\u0372\u0373\3\2\2\2\u0373\u0375\3\2\2\2\u0374\u0376\7\21\2\2\u0375"+
		"\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\7\23"+
		"\2\2\u0378u\3\2\2\2\u0379\u037a\5\16\b\2\u037a\u037b\7\61\2\2\u037b\u037c"+
		"\7\31\2\2\u037c\u037d\7f\2\2\u037d\u037e\5x=\2\u037ew\3\2\2\2\u037f\u0383"+
		"\7\22\2\2\u0380\u0382\5z>\2\u0381\u0380\3\2\2\2\u0382\u0385\3\2\2\2\u0383"+
		"\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\3\2\2\2\u0385\u0383\3\2"+
		"\2\2\u0386\u0387\7\23\2\2\u0387y\3\2\2\2\u0388\u0390\5|?\2\u0389\u0390"+
		"\5H%\2\u038a\u0390\5\26\f\2\u038b\u0390\5,\27\2\u038c\u0390\5 \21\2\u038d"+
		"\u0390\5v<\2\u038e\u0390\7\3\2\2\u038f\u0388\3\2\2\2\u038f\u0389\3\2\2"+
		"\2\u038f\u038a\3\2\2\2\u038f\u038b\3\2\2\2\u038f\u038c\3\2\2\2\u038f\u038d"+
		"\3\2\2\2\u038f\u038e\3\2\2\2\u0390{\3\2\2\2\u0391\u0392\5\16\b\2\u0392"+
		"\u0393\5J&\2\u0393\u0394\7f\2\2\u0394\u0395\7\26\2\2\u0395\u0398\7\27"+
		"\2\2\u0396\u0397\7\62\2\2\u0397\u0399\5r:\2\u0398\u0396\3\2\2\2\u0398"+
		"\u0399\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b\7\3\2\2\u039b}\3\2\2\2"+
		"\u039c\u03a0\7\22\2\2\u039d\u039f\5\u0080A\2\u039e\u039d\3\2\2\2\u039f"+
		"\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a3\3\2"+
		"\2\2\u03a2\u03a0\3\2\2\2\u03a3\u03a4\7\23\2\2\u03a4\177\3\2\2\2\u03a5"+
		"\u03a9\5\u0082B\2\u03a6\u03a9\5\f\7\2\u03a7\u03a9\5\u0086D\2\u03a8\u03a5"+
		"\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a7\3\2\2\2\u03a9\u0081\3\2\2\2\u03aa"+
		"\u03ab\5\u0084C\2\u03ab\u03ac\7\3\2\2\u03ac\u0083\3\2\2\2\u03ad\u03ae"+
		"\5\22\n\2\u03ae\u03af\5J&\2\u03af\u03b4\5@!\2\u03b0\u03b1\7\21\2\2\u03b1"+
		"\u03b3\5@!\2\u03b2\u03b0\3\2\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b2\3\2\2"+
		"\2\u03b4\u03b5\3\2\2\2\u03b5\u0085\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b7\u03f8"+
		"\5~@\2\u03b8\u03b9\7C\2\2\u03b9\u03bc\5\u00acW\2\u03ba\u03bb\7\64\2\2"+
		"\u03bb\u03bd\5\u00acW\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u03be\3\2\2\2\u03be\u03bf\7\3\2\2\u03bf\u03f8\3\2\2\2\u03c0\u03c1\7\65"+
		"\2\2\u03c1\u03c2\5\u00a8U\2\u03c2\u03c5\5\u0086D\2\u03c3\u03c4\7\66\2"+
		"\2\u03c4\u03c6\5\u0086D\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6"+
		"\u03f8\3\2\2\2\u03c7\u03f8\5\u00a0Q\2\u03c8\u03c9\78\2\2\u03c9\u03ca\5"+
		"\u00a8U\2\u03ca\u03cb\5\u0086D\2\u03cb\u03f8\3\2\2\2\u03cc\u03cd\79\2"+
		"\2\u03cd\u03ce\5\u0086D\2\u03ce\u03cf\78\2\2\u03cf\u03d0\5\u00a8U\2\u03d0"+
		"\u03d1\7\3\2\2\u03d1\u03f8\3\2\2\2\u03d2\u03f8\5\u0090I\2\u03d3\u03d4"+
		"\7<\2\2\u03d4\u03d5\5\u00a8U\2\u03d5\u03d6\7\22\2\2\u03d6\u03d7\5\u008a"+
		"F\2\u03d7\u03d8\7\23\2\2\u03d8\u03f8\3\2\2\2\u03d9\u03da\7\36\2\2\u03da"+
		"\u03db\5\u00a8U\2\u03db\u03dc\5~@\2\u03dc\u03f8\3\2\2\2\u03dd\u03df\7"+
		"=\2\2\u03de\u03e0\5\u00acW\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0"+
		"\u03e1\3\2\2\2\u03e1\u03f8\7\3\2\2\u03e2\u03e3\7\32\2\2\u03e3\u03e4\5"+
		"\u00acW\2\u03e4\u03e5\7\3\2\2\u03e5\u03f8\3\2\2\2\u03e6\u03e8\7>\2\2\u03e7"+
		"\u03e9\7f\2\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ea\3\2"+
		"\2\2\u03ea\u03f8\7\3\2\2\u03eb\u03ed\7?\2\2\u03ec\u03ee\7f\2\2\u03ed\u03ec"+
		"\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f8\7\3\2\2\u03f0"+
		"\u03f1\5\u00acW\2\u03f1\u03f2\7\3\2\2\u03f2\u03f8\3\2\2\2\u03f3\u03f4"+
		"\7f\2\2\u03f4\u03f5\7\64\2\2\u03f5\u03f8\5\u0086D\2\u03f6\u03f8\5\u0088"+
		"E\2\u03f7\u03b7\3\2\2\2\u03f7\u03b8\3\2\2\2\u03f7\u03c0\3\2\2\2\u03f7"+
		"\u03c7\3\2\2\2\u03f7\u03c8\3\2\2\2\u03f7\u03cc\3\2\2\2\u03f7\u03d2\3\2"+
		"\2\2\u03f7\u03d3\3\2\2\2\u03f7\u03d9\3\2\2\2\u03f7\u03dd\3\2\2\2\u03f7"+
		"\u03e2\3\2\2\2\u03f7\u03e6\3\2\2\2\u03f7\u03eb\3\2\2\2\u03f7\u03f0\3\2"+
		"\2\2\u03f7\u03f3\3\2\2\2\u03f7\u03f6\3\2\2\2\u03f8\u0087\3\2\2\2\u03f9"+
		"\u03fa\7\3\2\2\u03fa\u0089\3\2\2\2\u03fb\u03fd\5\u008cG\2\u03fc\u03fb"+
		"\3\2\2\2\u03fd\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff"+
		"\u008b\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u0405\5\u008eH\2\u0402\u0404"+
		"\5\u0080A\2\u0403\u0402\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2\2"+
		"\2\u0405\u0406\3\2\2\2\u0406\u008d\3\2\2\2\u0407\u0405\3\2\2\2\u0408\u0409"+
		"\7A\2\2\u0409\u040a\5\u00acW\2\u040a\u040b\7\64\2\2\u040b\u040f\3\2\2"+
		"\2\u040c\u040d\7\62\2\2\u040d\u040f\7\64\2\2\u040e\u0408\3\2\2\2\u040e"+
		"\u040c\3\2\2\2\u040f\u008f\3\2\2\2\u0410\u0411\7:\2\2\u0411\u0412\5~@"+
		"\2\u0412\u0413\bI\1\2\u0413\u042a\3\2\2\2\u0414\u0415\7:\2\2\u0415\u0416"+
		"\5~@\2\u0416\u0417\5\u009aN\2\u0417\u0418\7;\2\2\u0418\u0419\5~@\2\u0419"+
		"\u041a\bI\1\2\u041a\u042a\3\2\2\2\u041b\u041c\7:\2\2\u041c\u041d\5~@\2"+
		"\u041d\u041e\5\u009aN\2\u041e\u041f\bI\1\2\u041f\u042a\3\2\2\2\u0420\u0421"+
		"\7:\2\2\u0421\u0422\5~@\2\u0422\u0423\7;\2\2\u0423\u0424\5~@\2\u0424\u0425"+
		"\bI\1\2\u0425\u042a\3\2\2\2\u0426\u0427\5\u0092J\2\u0427\u0428\bI\1\2"+
		"\u0428\u042a\3\2\2\2\u0429\u0410\3\2\2\2\u0429\u0414\3\2\2\2\u0429\u041b"+
		"\3\2\2\2\u0429\u0420\3\2\2\2\u0429\u0426\3\2\2\2\u042a\u0091\3\2\2\2\u042b"+
		"\u042c\7:\2\2\u042c\u042d\5\u0094K\2\u042d\u042f\5~@\2\u042e\u0430\5\u009a"+
		"N\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0433\3\2\2\2\u0431"+
		"\u0432\7;\2\2\u0432\u0434\5~@\2\u0433\u0431\3\2\2\2\u0433\u0434\3\2\2"+
		"\2\u0434\u0093\3\2\2\2\u0435\u0436\7\26\2\2\u0436\u0438\5\u0096L\2\u0437"+
		"\u0439\7\3\2\2\u0438\u0437\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\3\2"+
		"\2\2\u043a\u043b\7\27\2\2\u043b\u0095\3\2\2\2\u043c\u0441\5\u0098M\2\u043d"+
		"\u043e\7\3\2\2\u043e\u0440\5\u0098M\2\u043f\u043d\3\2\2\2\u0440\u0443"+
		"\3\2\2\2\u0441\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0097\3\2\2\2\u0443"+
		"\u0441\3\2\2\2\u0444\u0446\5\22\n\2\u0445\u0444\3\2\2\2\u0445\u0446\3"+
		"\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\5J&\2\u0448\u0449\7f\2\2\u0449"+
		"\u044a\7\34\2\2\u044a\u044b\5\u00acW\2\u044b\u0099\3\2\2\2\u044c\u0450"+
		"\5\u009cO\2\u044d\u044f\5\u009cO\2\u044e\u044d\3\2\2\2\u044f\u0452\3\2"+
		"\2\2\u0450\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u009b\3\2\2\2\u0452"+
		"\u0450\3\2\2\2\u0453\u0454\7@\2\2\u0454\u0455\7\26\2\2\u0455\u0456\5\u009e"+
		"P\2\u0456\u0457\7\27\2\2\u0457\u0458\5~@\2\u0458\u009d\3\2\2\2\u0459\u045a"+
		"\5\22\n\2\u045a\u045f\5J&\2\u045b\u045c\7R\2\2\u045c\u045e\5J&\2\u045d"+
		"\u045b\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2"+
		"\2\2\u0460\u0462\3\2\2\2\u0461\u045f\3\2\2\2\u0462\u0467\7f\2\2\u0463"+
		"\u0464\7\24\2\2\u0464\u0466\7\25\2\2\u0465\u0463\3\2\2\2\u0466\u0469\3"+
		"\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u009f\3\2\2\2\u0469"+
		"\u0467\3\2\2\2\u046a\u046d\5\u00a2R\2\u046b\u046d\5\u00a4S\2\u046c\u046a"+
		"\3\2\2\2\u046c\u046b\3\2\2\2\u046d\u00a1\3\2\2\2\u046e\u046f\7\67\2\2"+
		"\u046f\u0470\7\26\2\2\u0470\u0471\5\22\n\2\u0471\u0472\5J&\2\u0472\u0473"+
		"\7f\2\2\u0473\u0474\7\64\2\2\u0474\u0475\5\u00acW\2\u0475\u0476\7\27\2"+
		"\2\u0476\u0477\5\u0086D\2\u0477\u00a3\3\2\2\2\u0478\u0479\7\67\2\2\u0479"+
		"\u047b\7\26\2\2\u047a\u047c\5\u00a6T\2\u047b\u047a\3\2\2\2\u047b\u047c"+
		"\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047f\7\3\2\2\u047e\u0480\5\u00acW"+
		"\2\u047f\u047e\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0483"+
		"\7\3\2\2\u0482\u0484\5\u00aaV\2\u0483\u0482\3\2\2\2\u0483\u0484\3\2\2"+
		"\2\u0484\u0485\3\2\2\2\u0485\u0486\7\27\2\2\u0486\u0487\5\u0086D\2\u0487"+
		"\u00a5\3\2\2\2\u0488\u048b\5\u0084C\2\u0489\u048b\5\u00aaV\2\u048a\u0488"+
		"\3\2\2\2\u048a\u0489\3\2\2\2\u048b\u00a7\3\2\2\2\u048c\u048d\7\26\2\2"+
		"\u048d\u048e\5\u00acW\2\u048e\u048f\7\27\2\2\u048f\u00a9\3\2\2\2\u0490"+
		"\u0495\5\u00acW\2\u0491\u0492\7\21\2\2\u0492\u0494\5\u00acW\2\u0493\u0491"+
		"\3\2\2\2\u0494\u0497\3\2\2\2\u0495\u0493\3\2\2\2\u0495\u0496\3\2\2\2\u0496"+
		"\u00ab\3\2\2\2\u0497\u0495\3\2\2\2\u0498\u049c\5\u0110\u0089\2\u0499\u049a"+
		"\5\u00aeX\2\u049a\u049b\5\u00acW\2\u049b\u049d\3\2\2\2\u049c\u0499\3\2"+
		"\2\2\u049c\u049d\3\2\2\2\u049d\u00ad\3\2\2\2\u049e\u049f\7\34\2\2\u049f"+
		"\u04be\bX\1\2\u04a0\u04a1\7V\2\2\u04a1\u04be\bX\1\2\u04a2\u04a3\7W\2\2"+
		"\u04a3\u04be\bX\1\2\u04a4\u04a5\7X\2\2\u04a5\u04be\bX\1\2\u04a6\u04a7"+
		"\7Y\2\2\u04a7\u04be\bX\1\2\u04a8\u04a9\7Z\2\2\u04a9\u04be\bX\1\2\u04aa"+
		"\u04ab\7[\2\2\u04ab\u04be\bX\1\2\u04ac\u04ad\7U\2\2\u04ad\u04be\bX\1\2"+
		"\u04ae\u04af\7\\\2\2\u04af\u04be\bX\1\2\u04b0\u04b1\7^\2\2\u04b1\u04b2"+
		"\7^\2\2\u04b2\u04b3\7\34\2\2\u04b3\u04be\bX\1\2\u04b4\u04b5\7]\2\2\u04b5"+
		"\u04b6\7]\2\2\u04b6\u04b7\7]\2\2\u04b7\u04b8\7\34\2\2\u04b8\u04be\bX\1"+
		"\2\u04b9\u04ba\7]\2\2\u04ba\u04bb\7]\2\2\u04bb\u04bc\7\34\2\2\u04bc\u04be"+
		"\bX\1\2\u04bd\u049e\3\2\2\2\u04bd\u04a0\3\2\2\2\u04bd\u04a2\3\2\2\2\u04bd"+
		"\u04a4\3\2\2\2\u04bd\u04a6\3\2\2\2\u04bd\u04a8\3\2\2\2\u04bd\u04aa\3\2"+
		"\2\2\u04bd\u04ac\3\2\2\2\u04bd\u04ae\3\2\2\2\u04bd\u04b0\3\2\2\2\u04bd"+
		"\u04b4\3\2\2\2\u04bd\u04b9\3\2\2\2\u04be\u00af\3\2\2\2\u04bf\u04c5\5\u00b2"+
		"Z\2\u04c0\u04c1\7)\2\2\u04c1\u04c2\5\u00acW\2\u04c2\u04c3\7\64\2\2\u04c3"+
		"\u04c4\5\u00acW\2\u04c4\u04c6\3\2\2\2\u04c5\u04c0\3\2\2\2\u04c5\u04c6"+
		"\3\2\2\2\u04c6\u00b1\3\2\2\2\u04c7\u04cc\5\u00b4[\2\u04c8\u04c9\7T\2\2"+
		"\u04c9\u04cb\5\u00b4[\2\u04ca\u04c8\3\2\2\2\u04cb\u04ce\3\2\2\2\u04cc"+
		"\u04ca\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u00b3\3\2\2\2\u04ce\u04cc\3\2"+
		"\2\2\u04cf\u04d4\5\u00b6\\\2\u04d0\u04d1\7S\2\2\u04d1\u04d3\5\u00b6\\"+
		"\2\u04d2\u04d0\3\2\2\2\u04d3\u04d6\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d4\u04d5"+
		"\3\2\2\2\u04d5\u00b5\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d7\u04dc\5\u00b8]"+
		"\2\u04d8\u04d9\7R\2\2\u04d9\u04db\5\u00b8]\2\u04da\u04d8\3\2\2\2\u04db"+
		"\u04de\3\2\2\2\u04dc\u04da\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u00b7\3\2"+
		"\2\2\u04de\u04dc\3\2\2\2\u04df\u04e4\5\u00ba^\2\u04e0\u04e1\7Q\2\2\u04e1"+
		"\u04e3\5\u00ba^\2\u04e2\u04e0\3\2\2\2\u04e3\u04e6\3\2\2\2\u04e4\u04e2"+
		"\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u00b9\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e7"+
		"\u04ec\5\u00bc_\2\u04e8\u04e9\7P\2\2\u04e9\u04eb\5\u00bc_\2\u04ea\u04e8"+
		"\3\2\2\2\u04eb\u04ee\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed"+
		"\u00bb\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ef\u04f4\5\u00be`\2\u04f0\u04f1"+
		"\7N\2\2\u04f1\u04f3\5\u00be`\2\u04f2\u04f0\3\2\2\2\u04f3\u04f6\3\2\2\2"+
		"\u04f4\u04f2\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u00bd\3\2\2\2\u04f6\u04f4"+
		"\3\2\2\2\u04f7\u04fc\5\u00c0a\2\u04f8\u04f9\7O\2\2\u04f9\u04fb\5\u00c0"+
		"a\2\u04fa\u04f8\3\2\2\2\u04fb\u04fe\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fc"+
		"\u04fd\3\2\2\2\u04fd\u00bf\3\2\2\2\u04fe\u04fc\3\2\2\2\u04ff\u0502\5\u00c2"+
		"b\2\u0500\u0501\7_\2\2\u0501\u0503\5J&\2\u0502\u0500\3\2\2\2\u0502\u0503"+
		"\3\2\2\2\u0503\u00c1\3\2\2\2\u0504\u050a\5\u00c6d\2\u0505\u0506\5\u00c4"+
		"c\2\u0506\u0507\5\u00c6d\2\u0507\u0509\3\2\2\2\u0508\u0505\3\2\2\2\u0509"+
		"\u050c\3\2\2\2\u050a\u0508\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u00c3\3\2"+
		"\2\2\u050c\u050a\3\2\2\2\u050d\u050e\7^\2\2\u050e\u050f\7\34\2\2\u050f"+
		"\u0518\bc\1\2\u0510\u0511\7]\2\2\u0511\u0512\7\34\2\2\u0512\u0518\bc\1"+
		"\2\u0513\u0514\7^\2\2\u0514\u0518\bc\1\2\u0515\u0516\7]\2\2\u0516\u0518"+
		"\bc\1\2\u0517\u050d\3\2\2\2\u0517\u0510\3\2\2\2\u0517\u0513\3\2\2\2\u0517"+
		"\u0515\3\2\2\2\u0518\u00c5\3\2\2\2\u0519\u051f\5\u00caf\2\u051a\u051b"+
		"\5\u00c8e\2\u051b\u051c\5\u00caf\2\u051c\u051e\3\2\2\2\u051d\u051a\3\2"+
		"\2\2\u051e\u0521\3\2\2\2\u051f\u051d\3\2\2\2\u051f\u0520\3\2\2\2\u0520"+
		"\u00c7\3\2\2\2\u0521\u051f\3\2\2\2\u0522\u0523\7^\2\2\u0523\u0524\7^\2"+
		"\2\u0524\u052d\be\1\2\u0525\u0526\7]\2\2\u0526\u0527\7]\2\2\u0527\u0528"+
		"\7]\2\2\u0528\u052d\be\1\2\u0529\u052a\7]\2\2\u052a\u052b\7]\2\2\u052b"+
		"\u052d\be\1\2\u052c\u0522\3\2\2\2\u052c\u0525\3\2\2\2\u052c\u0529\3\2"+
		"\2\2\u052d\u00c9\3\2\2\2\u052e\u0534\5\u00ceh\2\u052f\u0530\5\u00ccg\2"+
		"\u0530\u0531\5\u00ceh\2\u0531\u0533\3\2\2\2\u0532\u052f\3\2\2\2\u0533"+
		"\u0536\3\2\2\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u00cb\3\2"+
		"\2\2\u0536\u0534\3\2\2\2\u0537\u0538\7L\2\2\u0538\u053c\bg\1\2\u0539\u053a"+
		"\7M\2\2\u053a\u053c\bg\1\2\u053b\u0537\3\2\2\2\u053b\u0539\3\2\2\2\u053c"+
		"\u00cd\3\2\2\2\u053d\u0543\5\u00d2j\2\u053e\u053f\5\u00d0i\2\u053f\u0540"+
		"\5\u00d2j\2\u0540\u0542\3\2\2\2\u0541\u053e\3\2\2\2\u0542\u0545\3\2\2"+
		"\2\u0543\u0541\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u00cf\3\2\2\2\u0545\u0543"+
		"\3\2\2\2\u0546\u0547\7\7\2\2\u0547\u054d\bi\1\2\u0548\u0549\7J\2\2\u0549"+
		"\u054d\bi\1\2\u054a\u054b\7K\2\2\u054b\u054d\bi\1\2\u054c\u0546\3\2\2"+
		"\2\u054c\u0548\3\2\2\2\u054c\u054a\3\2\2\2\u054d\u00d1\3\2\2\2\u054e\u054f"+
		"\7L\2\2\u054f\u055c\5\u00d2j\2\u0550\u0551\7M\2\2\u0551\u055c\5\u00d2"+
		"j\2\u0552\u0553\7E\2\2\u0553\u055c\5\u00d2j\2\u0554\u0555\7F\2\2\u0555"+
		"\u055c\5\u00d2j\2\u0556\u0557\7G\2\2\u0557\u055c\5\u00d2j\2\u0558\u0559"+
		"\7H\2\2\u0559\u055c\5\u00d2j\2\u055a\u055c\5\u00d4k\2\u055b\u054e\3\2"+
		"\2\2\u055b\u0550\3\2\2\2\u055b\u0552\3\2\2\2\u055b\u0554\3\2\2\2\u055b"+
		"\u0556\3\2\2\2\u055b\u0558\3\2\2\2\u055b\u055a\3\2\2\2\u055c\u00d3\3\2"+
		"\2\2\u055d\u0569\5\u00d6l\2\u055e\u0562\5\u00d8m\2\u055f\u0561\5\u00e0"+
		"q\2\u0560\u055f\3\2\2\2\u0561\u0564\3\2\2\2\u0562\u0560\3\2\2\2\u0562"+
		"\u0563\3\2\2\2\u0563\u0566\3\2\2\2\u0564\u0562\3\2\2\2\u0565\u0567\t\5"+
		"\2\2\u0566\u0565\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0569\3\2\2\2\u0568"+
		"\u055d\3\2\2\2\u0568\u055e\3\2\2\2\u0569\u00d5\3\2\2\2\u056a\u056b\7\26"+
		"\2\2\u056b\u056c\5P)\2\u056c\u056d\7\27\2\2\u056d\u056e\5\u00d2j\2\u056e"+
		"\u0591\3\2\2\2\u056f\u0570\7\26\2\2\u0570\u0574\5J&\2\u0571\u0573\5\36"+
		"\20\2\u0572\u0571\3\2\2\2\u0573\u0576\3\2\2\2\u0574\u0572\3\2\2\2\u0574"+
		"\u0575\3\2\2\2\u0575\u0577\3\2\2\2\u0576\u0574\3\2\2\2\u0577\u0578\7\27"+
		"\2\2\u0578\u0579\5\u00d4k\2\u0579\u0591\3\2\2\2\u057a\u057b\7\26\2\2\u057b"+
		"\u057f\5J&\2\u057c\u057e\5\36\20\2\u057d\u057c\3\2\2\2\u057e\u0581\3\2"+
		"\2\2\u057f\u057d\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0582\3\2\2\2\u0581"+
		"\u057f\3\2\2\2\u0582\u0583\7\27\2\2\u0583\u0584\5\u010a\u0086\2\u0584"+
		"\u0591\3\2\2\2\u0585\u0586\7\26\2\2\u0586\u058a\5J&\2\u0587\u0589\5\36"+
		"\20\2\u0588\u0587\3\2\2\2\u0589\u058c\3\2\2\2\u058a\u0588\3\2\2\2\u058a"+
		"\u058b\3\2\2\2\u058b\u058d\3\2\2\2\u058c\u058a\3\2\2\2\u058d\u058e\7\27"+
		"\2\2\u058e\u058f\5\u0110\u0089\2\u058f\u0591\3\2\2\2\u0590\u056a\3\2\2"+
		"\2\u0590\u056f\3\2\2\2\u0590\u057a\3\2\2\2\u0590\u0585\3\2\2\2\u0591\u00d7"+
		"\3\2\2\2\u0592\u0593\5\u00a8U\2\u0593\u0594\bm\1\2\u0594\u05c8\3\2\2\2"+
		"\u0595\u059a\7,\2\2\u0596\u0597\7\6\2\2\u0597\u0599\7f\2\2\u0598\u0596"+
		"\3\2\2\2\u0599\u059c\3\2\2\2\u059a\u0598\3\2\2\2\u059a\u059b\3\2\2\2\u059b"+
		"\u059e\3\2\2\2\u059c\u059a\3\2\2\2\u059d\u059f\5\u00dco\2\u059e\u059d"+
		"\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05c8\bm\1\2\u05a1"+
		"\u05a6\7f\2\2\u05a2\u05a3\7\6\2\2\u05a3\u05a5\7f\2\2\u05a4\u05a2\3\2\2"+
		"\2\u05a5\u05a8\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05aa"+
		"\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a9\u05ab\5\u00dep\2\u05aa\u05a9\3\2\2"+
		"\2\u05aa\u05ab\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05c8\bm\1\2\u05ad\u05ae"+
		"\7-\2\2\u05ae\u05af\5\u00dan\2\u05af\u05b0\bm\1\2\u05b0\u05c8\3\2\2\2"+
		"\u05b1\u05b2\5\u00f4{\2\u05b2\u05b3\bm\1\2\u05b3\u05c8\3\2\2\2\u05b4\u05b5"+
		"\5\u00e2r\2\u05b5\u05b6\bm\1\2\u05b6\u05c8\3\2\2\2\u05b7\u05bc\5P)\2\u05b8"+
		"\u05b9\7\24\2\2\u05b9\u05bb\7\25\2\2\u05ba\u05b8\3\2\2\2\u05bb\u05be\3"+
		"\2\2\2\u05bc\u05ba\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\3\2\2\2\u05be"+
		"\u05bc\3\2\2\2\u05bf\u05c0\7\6\2\2\u05c0\u05c1\7\b\2\2\u05c1\u05c2\bm"+
		"\1\2\u05c2\u05c8\3\2\2\2\u05c3\u05c4\7\30\2\2\u05c4\u05c5\7\6\2\2\u05c5"+
		"\u05c6\7\b\2\2\u05c6\u05c8\bm\1\2\u05c7\u0592\3\2\2\2\u05c7\u0595\3\2"+
		"\2\2\u05c7\u05a1\3\2\2\2\u05c7\u05ad\3\2\2\2\u05c7\u05b1\3\2\2\2\u05c7"+
		"\u05b4\3\2\2\2\u05c7\u05b7\3\2\2\2\u05c7\u05c3\3\2\2\2\u05c8\u00d9\3\2"+
		"\2\2\u05c9\u05cb\7\6\2\2\u05ca\u05cc\5R*\2\u05cb\u05ca\3\2\2\2\u05cb\u05cc"+
		"\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05cf\7f\2\2\u05ce\u05d0\5\u00f2z\2"+
		"\u05cf\u05ce\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u00db\3\2\2\2\u05d1\u05d2"+
		"\7\24\2\2\u05d2\u05d3\5\u00acW\2\u05d3\u05d4\7\25\2\2\u05d4\u05d6\3\2"+
		"\2\2\u05d5\u05d1\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d7"+
		"\u05d8\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05da\bo\1\2\u05da\u05e8\3\2"+
		"\2\2\u05db\u05dc\5\u00f2z\2\u05dc\u05dd\bo\1\2\u05dd\u05e8\3\2\2\2\u05de"+
		"\u05df\7\6\2\2\u05df\u05e0\5\u00f0y\2\u05e0\u05e1\7f\2\2\u05e1\u05e2\5"+
		"\u00f2z\2\u05e2\u05e3\bo\1\2\u05e3\u05e8\3\2\2\2\u05e4\u05e5\5\u00ecw"+
		"\2\u05e5\u05e6\bo\1\2\u05e6\u05e8\3\2\2\2\u05e7\u05d5\3\2\2\2\u05e7\u05db"+
		"\3\2\2\2\u05e7\u05de\3\2\2\2\u05e7\u05e4\3\2\2\2\u05e8\u00dd\3\2\2\2\u05e9"+
		"\u05ea\7\24\2\2\u05ea\u05ec\7\25\2\2\u05eb\u05e9\3\2\2\2\u05ec\u05ed\3"+
		"\2\2\2\u05ed\u05eb\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef"+
		"\u05f0\7\6\2\2\u05f0\u05f1\7\b\2\2\u05f1\u060f\bp\1\2\u05f2\u05f3\7\24"+
		"\2\2\u05f3\u05f4\5\u00acW\2\u05f4\u05f5\7\25\2\2\u05f5\u05f7\3\2\2\2\u05f6"+
		"\u05f2\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8\u05f9\3\2"+
		"\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fb\bp\1\2\u05fb\u060f\3\2\2\2\u05fc"+
		"\u05fd\5\u00f2z\2\u05fd\u05fe\bp\1\2\u05fe\u060f\3\2\2\2\u05ff\u0600\7"+
		"\6\2\2\u0600\u0601\7\b\2\2\u0601\u060f\bp\1\2\u0602\u0603\7\6\2\2\u0603"+
		"\u0604\5\u00f0y\2\u0604\u0605\7f\2\2\u0605\u0606\5\u00f2z\2\u0606\u0607"+
		"\bp\1\2\u0607\u060f\3\2\2\2\u0608\u0609\7\6\2\2\u0609\u060a\7,\2\2\u060a"+
		"\u060f\bp\1\2\u060b\u060c\5\u00ecw\2\u060c\u060d\bp\1\2\u060d\u060f\3"+
		"\2\2\2\u060e\u05eb\3\2\2\2\u060e\u05f6\3\2\2\2\u060e\u05fc\3\2\2\2\u060e"+
		"\u05ff\3\2\2\2\u060e\u0602\3\2\2\2\u060e\u0608\3\2\2\2\u060e\u060b\3\2"+
		"\2\2\u060f\u00df\3\2\2\2\u0610\u0611\7\6\2\2\u0611\u0613\7f\2\2\u0612"+
		"\u0614\5\u00f2z\2\u0613\u0612\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0615"+
		"\3\2\2\2\u0615\u0627\bq\1\2\u0616\u0617\7\6\2\2\u0617\u0618\7,\2\2\u0618"+
		"\u0627\bq\1\2\u0619\u061a\7\6\2\2\u061a\u061b\7-\2\2\u061b\u061c\5\u00da"+
		"n\2\u061c\u061d\bq\1\2\u061d\u0627\3\2\2\2\u061e\u061f\5\u00ecw\2\u061f"+
		"\u0620\bq\1\2\u0620\u0627\3\2\2\2\u0621\u0622\7\24\2\2\u0622\u0623\5\u00ac"+
		"W\2\u0623\u0624\7\25\2\2\u0624\u0625\bq\1\2\u0625\u0627\3\2\2\2\u0626"+
		"\u0610\3\2\2\2\u0626\u0616\3\2\2\2\u0626\u0619\3\2\2\2\u0626\u061e\3\2"+
		"\2\2\u0626\u0621\3\2\2\2\u0627\u00e1\3\2\2\2\u0628\u0629\7I\2\2\u0629"+
		"\u062a\5\u00f0y\2\u062a\u062b\5L\'\2\u062b\u062c\5\u00eex\2\u062c\u0633"+
		"\3\2\2\2\u062d\u062e\7I\2\2\u062e\u062f\5L\'\2\u062f\u0630\5\u00eex\2"+
		"\u0630\u0633\3\2\2\2\u0631\u0633\5\u00e4s\2\u0632\u0628\3\2\2\2\u0632"+
		"\u062d\3\2\2\2\u0632\u0631\3\2\2\2\u0633\u00e3\3\2\2\2\u0634\u0635\7I"+
		"\2\2\u0635\u0636\5\u00eav\2\u0636\u0637\7\24\2\2\u0637\u063c\7\25\2\2"+
		"\u0638\u0639\7\24\2\2\u0639\u063b\7\25\2\2\u063a\u0638\3\2\2\2\u063b\u063e"+
		"\3\2\2\2\u063c\u063a\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u063f\3\2\2\2\u063e"+
		"\u063c\3\2\2\2\u063f\u0640\5\u00e8u\2\u0640\u0657\3\2\2\2\u0641\u0642"+
		"\7I\2\2\u0642\u0643\5\u00eav\2\u0643\u0644\7\24\2\2\u0644\u0645\5\u00ac"+
		"W\2\u0645\u064c\7\25\2\2\u0646\u0647\7\24\2\2\u0647\u0648\5\u00acW\2\u0648"+
		"\u0649\7\25\2\2\u0649\u064b\3\2\2\2\u064a\u0646\3\2\2\2\u064b\u064e\3"+
		"\2\2\2\u064c\u064a\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u0653\3\2\2\2\u064e"+
		"\u064c\3\2\2\2\u064f\u0650\7\24\2\2\u0650\u0652\7\25\2\2\u0651\u064f\3"+
		"\2\2\2\u0652\u0655\3\2\2\2\u0653\u0651\3\2\2\2\u0653\u0654\3\2\2\2\u0654"+
		"\u0657\3\2\2\2\u0655\u0653\3\2\2\2\u0656\u0634\3\2\2\2\u0656\u0641\3\2"+
		"\2\2\u0657\u00e5\3\2\2\2\u0658\u065b\5\u00e8u\2\u0659\u065b\5\u00acW\2"+
		"\u065a\u0658\3\2\2\2\u065a\u0659\3\2\2\2\u065b\u00e7\3\2\2\2\u065c\u0665"+
		"\7\22\2\2\u065d\u0662\5\u00e6t\2\u065e\u065f\7\21\2\2\u065f\u0661\5\u00e6"+
		"t\2\u0660\u065e\3\2\2\2\u0661\u0664\3\2\2\2\u0662\u0660\3\2\2\2\u0662"+
		"\u0663\3\2\2\2\u0663\u0666\3\2\2\2\u0664\u0662\3\2\2\2\u0665\u065d\3\2"+
		"\2\2\u0665\u0666\3\2\2\2\u0666\u0668\3\2\2\2\u0667\u0669\7\21\2\2\u0668"+
		"\u0667\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u066b\7\23"+
		"\2\2\u066b\u00e9\3\2\2\2\u066c\u066f\5L\'\2\u066d\u066f\5P)\2\u066e\u066c"+
		"\3\2\2\2\u066e\u066d\3\2\2\2\u066f\u00eb\3\2\2\2\u0670\u0671\7\6\2\2\u0671"+
		"\u0673\7I\2\2\u0672\u0674\5\u00f0y\2\u0673\u0672\3\2\2\2\u0673\u0674\3"+
		"\2\2\2\u0674\u0675\3\2\2\2\u0675\u0676\5N(\2\u0676\u0677\5\u00eex\2\u0677"+
		"\u00ed\3\2\2\2\u0678\u067a\5\u00f2z\2\u0679\u067b\5\60\31\2\u067a\u0679"+
		"\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u00ef\3\2\2\2\u067c\u067d\7^\2\2\u067d"+
		"\u067e\5.\30\2\u067e\u067f\7]\2\2\u067f\u00f1\3\2\2\2\u0680\u0682\7\26"+
		"\2\2\u0681\u0683\5\u00aaV\2\u0682\u0681\3\2\2\2\u0682\u0683\3\2\2\2\u0683"+
		"\u0684\3\2\2\2\u0684\u0685\7\27\2\2\u0685\u00f3\3\2\2\2\u0686\u0687\t"+
		"\6\2\2\u0687\u00f5\3\2\2\2\u0688\u0689\5\16\b\2\u0689\u068a\7\b\2\2\u068a"+
		"\u068b\7f\2\2\u068b\u00f7\3\2\2\2\u068c\u068d\5\16\b\2\u068d\u068e\t\7"+
		"\2\2\u068e\u068f\7f\2\2\u068f\u00f9\3\2\2\2\u0690\u0691\5\16\b\2\u0691"+
		"\u0692\7\31\2\2\u0692\u0693\7f\2\2\u0693\u00fb\3\2\2\2\u0694\u0695\5\16"+
		"\b\2\u0695\u0696\7\61\2\2\u0696\u0697\7\31\2\2\u0697\u0698\7f\2\2\u0698"+
		"\u00fd\3\2\2\2\u0699\u06a0\5\16\b\2\u069a\u06a1\7\b\2\2\u069b\u06a1\7"+
		"B\2\2\u069c\u069e\7\61\2\2\u069d\u069c\3\2\2\2\u069d\u069e\3\2\2\2\u069e"+
		"\u069f\3\2\2\2\u069f\u06a1\7\31\2\2\u06a0\u069a\3\2\2\2\u06a0\u069b\3"+
		"\2\2\2\u06a0\u069d\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a3\7f\2\2\u06a3"+
		"\u00ff\3\2\2\2\u06a4\u06a6\5\16\b\2\u06a5\u06a7\5\30\r\2\u06a6\u06a5\3"+
		"\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06aa\3\2\2\2\u06a8\u06ab\5J&\2\u06a9"+
		"\u06ab\7\30\2\2\u06aa\u06a8\3\2\2\2\u06aa\u06a9\3\2\2\2\u06aa\u06ab\3"+
		"\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ad\7f\2\2\u06ad\u06ae\7\27\2\2\u06ae"+
		"\u0101\3\2\2\2\u06af\u06b0\5\16\b\2\u06b0\u06b1\5J&\2\u06b1\u06b6\7f\2"+
		"\2\u06b2\u06b3\7\24\2\2\u06b3\u06b5\7\25\2\2\u06b4\u06b2\3\2\2\2\u06b5"+
		"\u06b8\3\2\2\2\u06b6\u06b4\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06b9\3\2"+
		"\2\2\u06b8\u06b6\3\2\2\2\u06b9\u06ba\t\b\2\2\u06ba\u0103\3\2\2\2\u06bb"+
		"\u06bc\5\22\n\2\u06bc\u06bd\5J&\2\u06bd\u06c2\7f\2\2\u06be\u06bf\7\24"+
		"\2\2\u06bf\u06c1\7\25\2\2\u06c0\u06be\3\2\2\2\u06c1\u06c4\3\2\2\2\u06c2"+
		"\u06c0\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c5\3\2\2\2\u06c4\u06c2\3\2"+
		"\2\2\u06c5\u06c6\t\b\2\2\u06c6\u0105\3\2\2\2\u06c7\u06c9\7\26\2\2\u06c8"+
		"\u06ca\5\u0108\u0085\2\u06c9\u06c8\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cb"+
		"\3\2\2\2\u06cb\u06cc\7\27\2\2\u06cc\u0107\3\2\2\2\u06cd\u06d2\7f\2\2\u06ce"+
		"\u06cf\7\21\2\2\u06cf\u06d1\7f\2\2\u06d0\u06ce\3\2\2\2\u06d1\u06d4\3\2"+
		"\2\2\u06d2\u06d0\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u0109\3\2\2\2\u06d4"+
		"\u06d2\3\2\2\2\u06d5\u06d6\5\u010c\u0087\2\u06d6\u06d7\7D\2\2\u06d7\u06d8"+
		"\5\u010e\u0088\2\u06d8\u06db\3\2\2\2\u06d9\u06db\5\u00b0Y\2\u06da\u06d5"+
		"\3\2\2\2\u06da\u06d9\3\2\2\2\u06db\u010b\3\2\2\2\u06dc\u06e0\7f\2\2\u06dd"+
		"\u06e0\5X-\2\u06de\u06e0\5\u0106\u0084\2\u06df\u06dc\3\2\2\2\u06df\u06dd"+
		"\3\2\2\2\u06df\u06de\3\2\2\2\u06e0\u010d\3\2\2\2\u06e1\u06e4\5\u00acW"+
		"\2\u06e2\u06e4\5~@\2\u06e3\u06e1\3\2\2\2\u06e3\u06e2\3\2\2\2\u06e4\u010f"+
		"\3\2\2\2\u06e5\u06e6\5\u0116\u008c\2\u06e6\u06e8\7\63\2\2\u06e7\u06e9"+
		"\5R*\2\u06e8\u06e7\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea"+
		"\u06eb\7f\2\2\u06eb\u0715\3\2\2\2\u06ec\u06ed\5\u0112\u008a\2\u06ed\u06ef"+
		"\7\63\2\2\u06ee\u06f0\5R*\2\u06ef\u06ee\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0"+
		"\u06f1\3\2\2\2\u06f1\u06f2\7f\2\2\u06f2\u0715\3\2\2\2\u06f3\u06f4\5\u00d8"+
		"m\2\u06f4\u06f6\7\63\2\2\u06f5\u06f7\5R*\2\u06f6\u06f5\3\2\2\2\u06f6\u06f7"+
		"\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06f9\7f\2\2\u06f9\u0715\3\2\2\2\u06fa"+
		"\u06fb\7-\2\2\u06fb\u06fd\7\63\2\2\u06fc\u06fe\5R*\2\u06fd\u06fc\3\2\2"+
		"\2\u06fd\u06fe\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0715\7f\2\2\u0700\u0701"+
		"\5\u0116\u008c\2\u0701\u0702\7\6\2\2\u0702\u0703\7-\2\2\u0703\u0705\7"+
		"\63\2\2\u0704\u0706\5R*\2\u0705\u0704\3\2\2\2\u0705\u0706\3\2\2\2\u0706"+
		"\u0707\3\2\2\2\u0707\u0708\7f\2\2\u0708\u0715\3\2\2\2\u0709\u070a\5L\'"+
		"\2\u070a\u070c\7\63\2\2\u070b\u070d\5R*\2\u070c\u070b\3\2\2\2\u070c\u070d"+
		"\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u070f\7I\2\2\u070f\u0715\3\2\2\2\u0710"+
		"\u0711\5\u0118\u008d\2\u0711\u0712\7\63\2\2\u0712\u0713\7I\2\2\u0713\u0715"+
		"\3\2\2\2\u0714\u06e5\3\2\2\2\u0714\u06ec\3\2\2\2\u0714\u06f3\3\2\2\2\u0714"+
		"\u06fa\3\2\2\2\u0714\u0700\3\2\2\2\u0714\u0709\3\2\2\2\u0714\u0710\3\2"+
		"\2\2\u0715\u0718\3\2\2\2\u0716\u0718\5\u010a\u0086\2\u0717\u0714\3\2\2"+
		"\2\u0717\u0716\3\2\2\2\u0718\u0111\3\2\2\2\u0719\u071d\5L\'\2\u071a\u071d"+
		"\5\u0114\u008b\2\u071b\u071d\5\u0118\u008d\2\u071c\u0719\3\2\2\2\u071c"+
		"\u071a\3\2\2\2\u071c\u071b\3\2\2\2\u071d\u0113\3\2\2\2\u071e\u0720\5f"+
		"\64\2\u071f\u071e\3\2\2\2\u0720\u0723\3\2\2\2\u0721\u071f\3\2\2\2\u0721"+
		"\u0722\3\2\2\2\u0722\u0724\3\2\2\2\u0723\u0721\3\2\2\2\u0724\u0725\7f"+
		"\2\2\u0725\u0115\3\2\2\2\u0726\u072b\7f\2\2\u0727\u0728\7\6\2\2\u0728"+
		"\u072a\7f\2\2\u0729\u0727\3\2\2\2\u072a\u072d\3\2\2\2\u072b\u0729\3\2"+
		"\2\2\u072b\u072c\3\2\2\2\u072c\u0117\3\2\2\2\u072d\u072b\3\2\2\2\u072e"+
		"\u072f\5P)\2\u072f\u0730\5\u011a\u008e\2\u0730\u0738\3\2\2\2\u0731\u0732"+
		"\5L\'\2\u0732\u0733\5\u011a\u008e\2\u0733\u0738\3\2\2\2\u0734\u0735\5"+
		"\u0114\u008b\2\u0735\u0736\5\u011a\u008e\2\u0736\u0738\3\2\2\2\u0737\u072e"+
		"\3\2\2\2\u0737\u0731\3\2\2\2\u0737\u0734\3\2\2\2\u0738\u0119\3\2\2\2\u0739"+
		"\u073b\5f\64\2\u073a\u0739\3\2\2\2\u073b\u073e\3\2\2\2\u073c\u073a\3\2"+
		"\2\2\u073c\u073d\3\2\2\2\u073d\u073f\3\2\2\2\u073e\u073c\3\2\2\2\u073f"+
		"\u0740\7\24\2\2\u0740\u074b\7\25\2\2\u0741\u0743\5f\64\2\u0742\u0741\3"+
		"\2\2\2\u0743\u0746\3\2\2\2\u0744\u0742\3\2\2\2\u0744\u0745\3\2\2\2\u0745"+
		"\u0747\3\2\2\2\u0746\u0744\3\2\2\2\u0747\u0748\7\24\2\2\u0748\u074a\7"+
		"\25\2\2\u0749\u0744\3\2\2\2\u074a\u074d\3\2\2\2\u074b\u0749\3\2\2\2\u074b"+
		"\u074c\3\2\2\2\u074c\u011b\3\2\2\2\u074d\u074b\3\2\2\2\u00d1\u011d\u0122"+
		"\u0128\u012c\u0134\u013c\u0143\u0147\u014a\u0151\u0156\u015a\u015f\u016e"+
		"\u0173\u0177\u017c\u0181\u0187\u018b\u018f\u0199\u01a4\u01a7\u01ae\u01b9"+
		"\u01bf\u01c2\u01c5\u01ce\u01d2\u01d6\u01d9\u01df\u01e4\u01ea\u01ee\u01f7"+
		"\u01fe\u0207\u020e\u0212\u0219\u021d\u0221\u0229\u022e\u0232\u0236\u023c"+
		"\u0242\u0247\u0253\u025d\u0262\u026a\u026e\u0272\u027a\u027f\u0283\u028a"+
		"\u028d\u0291\u0299\u029e\u02a2\u02ab\u02b5\u02bd\u02c0\u02c7\u02cd\u02d2"+
		"\u02dc\u02e3\u02e9\u02eb\u02f2\u02f7\u0303\u030d\u0312\u031b\u0324\u032d"+
		"\u0333\u033a\u0340\u0345\u0354\u035d\u0367\u036f\u0372\u0375\u0383\u038f"+
		"\u0398\u03a0\u03a8\u03b4\u03bc\u03c5\u03df\u03e8\u03ed\u03f7\u03fe\u0405"+
		"\u040e\u0429\u042f\u0433\u0438\u0441\u0445\u0450\u045f\u0467\u046c\u047b"+
		"\u047f\u0483\u048a\u0495\u049c\u04bd\u04c5\u04cc\u04d4\u04dc\u04e4\u04ec"+
		"\u04f4\u04fc\u0502\u050a\u0517\u051f\u052c\u0534\u053b\u0543\u054c\u055b"+
		"\u0562\u0566\u0568\u0574\u057f\u058a\u0590\u059a\u059e\u05a6\u05aa\u05bc"+
		"\u05c7\u05cb\u05cf\u05d7\u05e7\u05ed\u05f8\u060e\u0613\u0626\u0632\u063c"+
		"\u064c\u0653\u0656\u065a\u0662\u0665\u0668\u066e\u0673\u067a\u0682\u069d"+
		"\u06a0\u06a6\u06aa\u06b6\u06c2\u06c9\u06d2\u06da\u06df\u06e3\u06e8\u06ef"+
		"\u06f6\u06fd\u0705\u070c\u0714\u0717\u071c\u0721\u072b\u0737\u073c\u0744"+
		"\u074b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}