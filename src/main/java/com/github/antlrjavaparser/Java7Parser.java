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
		PACKAGE=2, LT=91, STAR=5, WHILE=53, CONST=93, CASE=62, CHAR=32, NEW=70, 
		DO=54, BREAK=59, Identifier=99, LBRACKET=18, FINAL=13, RPAREN=21, IMPORT=3, 
		SUBSUB=67, STAREQ=85, CARET=78, THIS=42, RETURN=58, DOUBLE=38, BARBAR=81, 
		WhiteSpace=100, VOID=22, SUPER=43, EQ=26, GOTO=94, AMPAMP=80, QUES=39, 
		EQEQ=75, RBRACE=17, STATIC=12, PRIVATE=10, SWITCH=57, NULL=44, STRICTFP=14, 
		ELSE=51, ELLIPSIS=41, NATIVE=27, THROWS=25, INT=35, SLASHEQ=86, ASSERT=64, 
		TRY=55, FloatingPointLiteral=96, GT=90, CATCH=61, FALSE=46, THROW=24, 
		PROTECTED=9, CLASS=6, BAREQ=88, AMP=77, CharacterLiteral=97, PLUSPLUS=66, 
		LBRACE=16, SUBEQ=84, FOR=52, SUB=74, FLOAT=37, ABSTRACT=11, PLUSEQ=83, 
		LPAREN=20, IF=50, AT=47, BOOLEAN=31, SYNCHRONIZED=28, SLASH=71, SlashComment=102, 
		IMPLEMENTS=7, CONTINUE=60, COMMA=15, AMPEQ=87, TRANSIENT=29, TILDE=68, 
		BANGEQ=76, PLUS=73, LAMBDA=65, RBRACKET=19, DOT=4, BYTE=33, PERCENT=72, 
		VOLATILE=30, DEFAULT=48, SHORT=34, BANG=69, INSTANCEOF=92, TRUE=45, SEMI=1, 
		StringLiteral=98, COLON=49, ENUM=63, FINALLY=56, PERCENTEQ=89, LineTerminator=101, 
		CARETEQ=82, INTERFACE=23, IntegerLiteral=95, LONG=36, EXTENDS=40, PUBLIC=8, 
		BAR=79, EndOfLineComment=103;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "'package'", "'import'", "'.'", "'*'", "'class'", 
		"'implements'", "'public'", "'protected'", "'private'", "'abstract'", 
		"'static'", "'final'", "'strictfp'", "','", "'{'", "'}'", "'['", "']'", 
		"'('", "')'", "'void'", "'interface'", "'throw'", "'throws'", "'='", "'native'", 
		"'synchronized'", "'transient'", "'volatile'", "'boolean'", "'char'", 
		"'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'?'", 
		"'extends'", "'...'", "'this'", "'super'", "'null'", "'true'", "'false'", 
		"'@'", "'default'", "':'", "'if'", "'else'", "'for'", "'while'", "'do'", 
		"'try'", "'finally'", "'switch'", "'return'", "'break'", "'continue'", 
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
		RULE_typeBound = 13, RULE_enumDeclaration = 14, RULE_enumBody = 15, RULE_enumConstants = 16, 
		RULE_enumConstant = 17, RULE_enumBodyDeclarations = 18, RULE_interfaceDeclaration = 19, 
		RULE_normalInterfaceDeclaration = 20, RULE_typeList = 21, RULE_classBody = 22, 
		RULE_interfaceBody = 23, RULE_classBodyDeclaration = 24, RULE_memberDecl = 25, 
		RULE_methodDeclaration = 26, RULE_constructorDeclaration = 27, RULE_constructorBlock = 28, 
		RULE_fieldDeclaration = 29, RULE_variableDeclarator = 30, RULE_interfaceBodyDeclaration = 31, 
		RULE_interfaceMethodDeclaration = 32, RULE_defaultInterfaceMethodDeclaration = 33, 
		RULE_interfaceFieldDeclaration = 34, RULE_type = 35, RULE_classOrInterfaceType = 36, 
		RULE_identifierTypeArgument = 37, RULE_primitiveType = 38, RULE_typeArguments = 39, 
		RULE_typeArgument = 40, RULE_qualifiedNameList = 41, RULE_formalParameters = 42, 
		RULE_formalParameterDecls = 43, RULE_normalParameterDecl = 44, RULE_ellipsisParameterDecl = 45, 
		RULE_explicitConstructorInvocation = 46, RULE_qualifiedName = 47, RULE_annotations = 48, 
		RULE_annotation = 49, RULE_markerAnnotation = 50, RULE_singleElementAnnotation = 51, 
		RULE_normalAnnotation = 52, RULE_elementValuePairs = 53, RULE_elementValuePair = 54, 
		RULE_elementValue = 55, RULE_elementValueArrayInitializer = 56, RULE_annotationTypeDeclaration = 57, 
		RULE_annotationTypeBody = 58, RULE_annotationTypeElementDeclaration = 59, 
		RULE_annotationMethodDeclaration = 60, RULE_block = 61, RULE_blockStatement = 62, 
		RULE_localVariableDeclarationStatement = 63, RULE_localVariableDeclaration = 64, 
		RULE_statement = 65, RULE_emptyStatement = 66, RULE_switchBlockStatementGroups = 67, 
		RULE_switchBlockStatementGroup = 68, RULE_switchLabel = 69, RULE_trystatement = 70, 
		RULE_tryWithResources = 71, RULE_resourceSpecification = 72, RULE_resources = 73, 
		RULE_resource = 74, RULE_catches = 75, RULE_catchClause = 76, RULE_catchFormalParameter = 77, 
		RULE_forstatement = 78, RULE_foreachStatement = 79, RULE_normalForStatement = 80, 
		RULE_forInit = 81, RULE_parExpression = 82, RULE_expressionList = 83, 
		RULE_expression = 84, RULE_assignmentOperator = 85, RULE_conditionalExpression = 86, 
		RULE_conditionalOrExpression = 87, RULE_conditionalAndExpression = 88, 
		RULE_inclusiveOrExpression = 89, RULE_exclusiveOrExpression = 90, RULE_andExpression = 91, 
		RULE_equalityExpression = 92, RULE_notEqualityExpression = 93, RULE_instanceOfExpression = 94, 
		RULE_relationalExpression = 95, RULE_relationalOp = 96, RULE_shiftExpression = 97, 
		RULE_shiftOp = 98, RULE_additiveExpression = 99, RULE_additiveOp = 100, 
		RULE_multiplicativeExpression = 101, RULE_multiplicativeOp = 102, RULE_unaryExpression = 103, 
		RULE_unaryExpressionNotPlusMinus = 104, RULE_castExpression = 105, RULE_primary = 106, 
		RULE_superSuffix = 107, RULE_thisSuffix = 108, RULE_identifierSuffix = 109, 
		RULE_selector = 110, RULE_creator = 111, RULE_arrayCreator = 112, RULE_variableInitializer = 113, 
		RULE_arrayInitializer = 114, RULE_createdName = 115, RULE_innerCreator = 116, 
		RULE_classCreatorRest = 117, RULE_nonWildcardTypeArguments = 118, RULE_arguments = 119, 
		RULE_literal = 120, RULE_classHeader = 121, RULE_enumHeader = 122, RULE_interfaceHeader = 123, 
		RULE_annotationHeader = 124, RULE_typeHeader = 125, RULE_methodHeader = 126, 
		RULE_fieldHeader = 127, RULE_localVariableHeader = 128, RULE_inferredFormalParameterList = 129, 
		RULE_inferredFormalParameters = 130, RULE_lambdaExpression = 131, RULE_lambdaParameters = 132, 
		RULE_lambdaBody = 133;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "qualifiedImportName", 
		"typeDeclaration", "classOrInterfaceDeclaration", "modifiers", "modifier", 
		"variableModifiers", "classDeclaration", "normalClassDeclaration", "typeParameters", 
		"typeParameter", "typeBound", "enumDeclaration", "enumBody", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
		"typeList", "classBody", "interfaceBody", "classBodyDeclaration", "memberDecl", 
		"methodDeclaration", "constructorDeclaration", "constructorBlock", "fieldDeclaration", 
		"variableDeclarator", "interfaceBodyDeclaration", "interfaceMethodDeclaration", 
		"defaultInterfaceMethodDeclaration", "interfaceFieldDeclaration", "type", 
		"classOrInterfaceType", "identifierTypeArgument", "primitiveType", "typeArguments", 
		"typeArgument", "qualifiedNameList", "formalParameters", "formalParameterDecls", 
		"normalParameterDecl", "ellipsisParameterDecl", "explicitConstructorInvocation", 
		"qualifiedName", "annotations", "annotation", "markerAnnotation", "singleElementAnnotation", 
		"normalAnnotation", "elementValuePairs", "elementValuePair", "elementValue", 
		"elementValueArrayInitializer", "annotationTypeDeclaration", "annotationTypeBody", 
		"annotationTypeElementDeclaration", "annotationMethodDeclaration", "block", 
		"blockStatement", "localVariableDeclarationStatement", "localVariableDeclaration", 
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
		"lambdaParameters", "lambdaBody"
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
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(268); packageDeclaration();
				}
				break;
			}
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(271); importDeclaration();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << AT) | (1L << ENUM))) != 0)) {
				{
				{
				setState(277); typeDeclaration();
				}
				}
				setState(282);
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
			setState(284);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(283); annotations();
				}
			}

			setState(286); match(PACKAGE);
			setState(287); qualifiedName();
			setState(288); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
			setState(314);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290); match(IMPORT);
				setState(292);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(291); match(STATIC);
					}
				}

				setState(294); match(Identifier);
				setState(295); match(DOT);
				setState(296); match(STAR);
				setState(297); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298); match(IMPORT);
				setState(300);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(299); match(STATIC);
					}
				}

				setState(302); match(Identifier);
				setState(305); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(303); match(DOT);
						setState(304); match(Identifier);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(307); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(311);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(309); match(DOT);
					setState(310); match(STAR);
					}
				}

				setState(313); match(SEMI);
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
			setState(316); match(Identifier);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(317); match(DOT);
				setState(318); match(Identifier);
				}
				}
				setState(323);
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
			setState(326);
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
				setState(324); classOrInterfaceDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(325); match(SEMI);
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
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328); classDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329); interfaceDeclaration();
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
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(332); modifier();
					}
					} 
				}
				setState(337);
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
			setState(350);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(338); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(339); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(340); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(341); match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(342); match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(343); match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(344); match(FINAL);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 8);
				{
				setState(345); match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 9);
				{
				setState(346); match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(347); match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 11);
				{
				setState(348); match(VOLATILE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 12);
				{
				setState(349); match(STRICTFP);
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
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(352); annotation();
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(359);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(358); match(FINAL);
				}
			}

			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(361); annotation();
				}
				}
				setState(366);
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
			setState(369);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367); normalClassDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368); enumDeclaration();
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
			setState(371); modifiers();
			setState(372); match(CLASS);
			setState(373); match(Identifier);
			setState(375);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(374); typeParameters();
				}
			}

			setState(379);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(377); match(EXTENDS);
				setState(378); type();
				}
			}

			setState(383);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(381); match(IMPLEMENTS);
				setState(382); typeList();
				}
			}

			setState(385); classBody();
			}
		}
		catch (RecognitionException re) {
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
			setState(387); match(LT);
			setState(388); typeParameter();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(389); match(COMMA);
				setState(390); typeParameter();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396); match(GT);
			}
		}
		catch (RecognitionException re) {
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
			setState(398); match(Identifier);
			setState(401);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(399); match(EXTENDS);
				setState(400); typeBound();
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403); type();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(404); match(AMP);
				setState(405); type();
				}
				}
				setState(410);
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
		enterRule(_localctx, 28, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411); modifiers();
			setState(412); match(ENUM);
			setState(413); match(Identifier);
			setState(416);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(414); match(IMPLEMENTS);
				setState(415); typeList();
				}
			}

			setState(418); enumBody();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420); match(LBRACE);
			setState(422);
			_la = _input.LA(1);
			if (_la==AT || _la==Identifier) {
				{
				setState(421); enumConstants();
				}
			}

			setState(425);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(424); match(COMMA);
				}
			}

			setState(428);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(427); enumBodyDeclarations();
				}
			}

			setState(430); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 32, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432); enumConstant();
			setState(437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(433); match(COMMA);
					setState(434); enumConstant();
					}
					} 
				}
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 34, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(440); annotations();
				}
			}

			setState(443); match(Identifier);
			setState(445);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(444); arguments();
				}
			}

			setState(448);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(447); classBody();
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
		enterRule(_localctx, 36, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); match(SEMI);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << VOID) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT) | (1L << ENUM))) != 0) || _la==LT || _la==Identifier) {
				{
				{
				setState(451); classBodyDeclaration();
				}
				}
				setState(456);
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
		enterRule(_localctx, 38, RULE_interfaceDeclaration);
		try {
			setState(459);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457); normalInterfaceDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458); annotationTypeDeclaration();
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
		enterRule(_localctx, 40, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461); modifiers();
			setState(462); match(INTERFACE);
			setState(463); match(Identifier);
			setState(465);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(464); typeParameters();
				}
			}

			setState(469);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(467); match(EXTENDS);
				setState(468); typeList();
				}
			}

			setState(471); interfaceBody();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 42, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473); type();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(474); match(COMMA);
				setState(475); type();
				}
				}
				setState(480);
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
		enterRule(_localctx, 44, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481); match(LBRACE);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << VOID) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT) | (1L << ENUM))) != 0) || _la==LT || _la==Identifier) {
				{
				{
				setState(482); classBodyDeclaration();
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 46, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490); match(LBRACE);
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << VOID) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT) | (1L << DEFAULT) | (1L << ENUM))) != 0) || _la==LT || _la==Identifier) {
				{
				{
				setState(491); interfaceBodyDeclaration();
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(497); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 48, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(505);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(500); match(STATIC);
					}
				}

				setState(503); block();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(504); memberDecl();
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
		enterRule(_localctx, 50, RULE_memberDecl);
		try {
			setState(512);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507); constructorDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508); fieldDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(509); methodDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(510); classDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(511); interfaceDeclaration();
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
		enterRule(_localctx, 52, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514); modifiers();
			setState(516);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(515); typeParameters();
				}
			}

			setState(520);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case Identifier:
				{
				setState(518); type();
				}
				break;
			case VOID:
				{
				setState(519); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(522); match(Identifier);
			setState(523); formalParameters();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(524); match(LBRACKET);
				setState(525); match(RBRACKET);
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(533);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(531); match(THROWS);
				setState(532); qualifiedNameList();
				}
			}

			setState(537);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(535); block();
				}
				break;
			case SEMI:
				{
				setState(536); match(SEMI);
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
		enterRule(_localctx, 54, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539); modifiers();
			setState(541);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(540); typeParameters();
				}
			}

			setState(543); match(Identifier);
			setState(544); formalParameters();
			setState(547);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(545); match(THROWS);
				setState(546); qualifiedNameList();
				}
			}

			setState(549); constructorBlock();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_constructorBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551); match(LBRACE);
			setState(553);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(552); explicitConstructorInvocation();
				}
				break;
			}
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << INTERFACE) | (1L << THROW) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TRY) | (1L << SWITCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ASSERT - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (TILDE - 64)) | (1L << (BANG - 64)) | (1L << (NEW - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(555); blockStatement();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 58, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563); modifiers();
			setState(564); type();
			setState(565); variableDeclarator();
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(566); match(COMMA);
				setState(567); variableDeclarator();
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(573); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 60, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575); match(Identifier);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(576); match(LBRACKET);
				setState(577); match(RBRACKET);
				}
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(585);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(583); match(EQ);
				setState(584); variableInitializer();
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
		enterRule(_localctx, 62, RULE_interfaceBodyDeclaration);
		try {
			setState(593);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587); interfaceFieldDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588); interfaceMethodDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(589); defaultInterfaceMethodDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(590); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(591); classDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(592); match(SEMI);
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
		enterRule(_localctx, 64, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); modifiers();
			setState(597);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(596); typeParameters();
				}
			}

			setState(601);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case Identifier:
				{
				setState(599); type();
				}
				break;
			case VOID:
				{
				setState(600); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(603); match(Identifier);
			setState(604); formalParameters();
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(605); match(LBRACKET);
				setState(606); match(RBRACKET);
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(614);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(612); match(THROWS);
				setState(613); qualifiedNameList();
				}
			}

			setState(618);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(616); block();
				}
				break;
			case SEMI:
				{
				setState(617); match(SEMI);
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
		enterRule(_localctx, 66, RULE_defaultInterfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				{
				setState(620); match(DEFAULT);
				setState(621); modifiers();
				}
				}
				break;

			case 2:
				{
				{
				setState(622); modifiers();
				setState(623); match(DEFAULT);
				}
				}
				break;
			}
			setState(628);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(627); typeParameters();
				}
			}

			setState(632);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case Identifier:
				{
				setState(630); type();
				}
				break;
			case VOID:
				{
				setState(631); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(634); match(Identifier);
			setState(635); formalParameters();
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(636); match(LBRACKET);
				setState(637); match(RBRACKET);
				}
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(645);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(643); match(THROWS);
				setState(644); qualifiedNameList();
				}
			}

			setState(649);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(647); block();
				}
				break;
			case SEMI:
				{
				setState(648); match(SEMI);
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
		enterRule(_localctx, 68, RULE_interfaceFieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651); modifiers();
			setState(652); type();
			setState(653); variableDeclarator();
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(654); match(COMMA);
				setState(655); variableDeclarator();
				}
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(661); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 70, RULE_type);
		int _la;
		try {
			setState(679);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(663); classOrInterfaceType();
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(664); match(LBRACKET);
					setState(665); match(RBRACKET);
					}
					}
					setState(670);
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
				setState(671); primitiveType();
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(672); match(LBRACKET);
					setState(673); match(RBRACKET);
					}
					}
					setState(678);
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
		enterRule(_localctx, 72, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681); identifierTypeArgument();
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(682); match(DOT);
				setState(683); identifierTypeArgument();
				}
				}
				setState(688);
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
		enterRule(_localctx, 74, RULE_identifierTypeArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689); match(Identifier);
			setState(691);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(690); typeArguments();
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
		enterRule(_localctx, 76, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
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
		enterRule(_localctx, 78, RULE_typeArguments);
		int _la;
		try {
			setState(708);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695); match(LT);
				setState(696); typeArgument();
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(697); match(COMMA);
					setState(698); typeArgument();
					}
					}
					setState(703);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(704); match(GT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706); match(LT);
				setState(707); match(GT);
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
		enterRule(_localctx, 80, RULE_typeArgument);
		int _la;
		try {
			setState(716);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(710); type();
				}
				break;
			case QUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(711); match(QUES);
				setState(714);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(712);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(713); type();
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
		enterRule(_localctx, 82, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718); qualifiedName();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(719); match(COMMA);
				setState(720); qualifiedName();
				}
				}
				setState(725);
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
		enterRule(_localctx, 84, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726); match(LPAREN);
			setState(728);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT))) != 0) || _la==Identifier) {
				{
				setState(727); formalParameterDecls();
				}
			}

			setState(730); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 86, RULE_formalParameterDecls);
		int _la;
		try {
			int _alt;
			setState(755);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(732); ellipsisParameterDecl();
				((FormalParameterDeclsContext)_localctx).parameterType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(735); normalParameterDecl();
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(736); match(COMMA);
					setState(737); normalParameterDecl();
					}
					}
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((FormalParameterDeclsContext)_localctx).parameterType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(748); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(745); normalParameterDecl();
						setState(746); match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(750); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(752); ellipsisParameterDecl();
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
		enterRule(_localctx, 88, RULE_normalParameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757); variableModifiers();
			setState(758); type();
			setState(759); match(Identifier);
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(760); match(LBRACKET);
				setState(761); match(RBRACKET);
				}
				}
				setState(766);
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
		enterRule(_localctx, 90, RULE_ellipsisParameterDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767); variableModifiers();
			setState(768); type();
			setState(769); match(ELLIPSIS);
			setState(770); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 92, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(788);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(772); nonWildcardTypeArguments();
					}
				}

				setState(775);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==SUPER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(776); arguments();
				setState(777); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(779); primary();
				setState(780); match(DOT);
				setState(782);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(781); nonWildcardTypeArguments();
					}
				}

				setState(784); match(SUPER);
				setState(785); arguments();
				setState(786); match(SEMI);
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
		enterRule(_localctx, 94, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790); match(Identifier);
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(791); match(DOT);
				setState(792); match(Identifier);
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
		enterRule(_localctx, 96, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(798); annotation();
				}
				}
				setState(801); 
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
		enterRule(_localctx, 98, RULE_annotation);
		try {
			setState(806);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(803); markerAnnotation();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(804); singleElementAnnotation();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(805); normalAnnotation();
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
		enterRule(_localctx, 100, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808); match(AT);
			setState(809); qualifiedName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 102, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811); match(AT);
			setState(812); qualifiedName();
			setState(813); match(LPAREN);
			setState(814); elementValue();
			setState(815); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 104, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817); match(AT);
			setState(818); qualifiedName();
			setState(819); match(LPAREN);
			setState(821);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(820); elementValuePairs();
				}
			}

			setState(823); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 106, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825); elementValuePair();
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(826); match(COMMA);
				setState(827); elementValuePair();
				}
				}
				setState(832);
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
		enterRule(_localctx, 108, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833); match(Identifier);
			setState(834); match(EQ);
			setState(835); elementValue();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 110, RULE_elementValue);
		try {
			setState(840);
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
				setState(837); conditionalExpression();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(838); annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(839); elementValueArrayInitializer();
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
		enterRule(_localctx, 112, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(842); match(LBRACE);
			setState(851);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (TILDE - 66)) | (1L << (BANG - 66)) | (1L << (NEW - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(843); elementValue();
				setState(848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(844); match(COMMA);
						setState(845); elementValue();
						}
						} 
					}
					setState(850);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				}
			}

			setState(854);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(853); match(COMMA);
				}
			}

			setState(856); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 114, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858); modifiers();
			setState(859); match(AT);
			setState(860); match(INTERFACE);
			setState(861); match(Identifier);
			setState(862); annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 116, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864); match(LBRACE);
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT) | (1L << ENUM))) != 0) || _la==Identifier) {
				{
				{
				setState(865); annotationTypeElementDeclaration();
				}
				}
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(871); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 118, RULE_annotationTypeElementDeclaration);
		try {
			setState(880);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(873); annotationMethodDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(874); interfaceFieldDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(875); normalClassDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(876); normalInterfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(877); enumDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(878); annotationTypeDeclaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(879); match(SEMI);
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
		enterRule(_localctx, 120, RULE_annotationMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882); modifiers();
			setState(883); type();
			setState(884); match(Identifier);
			setState(885); match(LPAREN);
			setState(886); match(RPAREN);
			setState(889);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(887); match(DEFAULT);
				setState(888); elementValue();
				}
			}

			setState(891); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 122, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893); match(LBRACE);
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << INTERFACE) | (1L << THROW) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TRY) | (1L << SWITCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ASSERT - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (TILDE - 64)) | (1L << (BANG - 64)) | (1L << (NEW - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(894); blockStatement();
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
		enterRule(_localctx, 124, RULE_blockStatement);
		try {
			setState(905);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(902); localVariableDeclarationStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(903); classOrInterfaceDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(904); statement();
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
		enterRule(_localctx, 126, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907); localVariableDeclaration();
			setState(908); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 128, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910); variableModifiers();
			setState(911); type();
			setState(912); variableDeclarator();
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(913); match(COMMA);
				setState(914); variableDeclarator();
				}
				}
				setState(919);
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
		enterRule(_localctx, 130, RULE_statement);
		int _la;
		try {
			setState(984);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(920); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(921); match(ASSERT);
				setState(922); expression();
				setState(925);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(923); match(COLON);
					setState(924); expression();
					}
				}

				setState(927); match(SEMI);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(929); match(IF);
				setState(930); parExpression();
				setState(931); statement();
				setState(934);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(932); match(ELSE);
					setState(933); statement();
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(936); forstatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(937); match(WHILE);
				setState(938); parExpression();
				setState(939); statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(941); match(DO);
				setState(942); statement();
				setState(943); match(WHILE);
				setState(944); parExpression();
				setState(945); match(SEMI);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(947); trystatement();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(948); match(SWITCH);
				setState(949); parExpression();
				setState(950); match(LBRACE);
				setState(951); switchBlockStatementGroups();
				setState(952); match(RBRACE);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(954); match(SYNCHRONIZED);
				setState(955); parExpression();
				setState(956); block();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(958); match(RETURN);
				setState(960);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (TILDE - 66)) | (1L << (BANG - 66)) | (1L << (NEW - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(959); expression();
					}
				}

				setState(962); match(SEMI);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(963); match(THROW);
				setState(964); expression();
				setState(965); match(SEMI);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(967); match(BREAK);
				setState(969);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(968); match(Identifier);
					}
				}

				setState(971); match(SEMI);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(972); match(CONTINUE);
				setState(974);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(973); match(Identifier);
					}
				}

				setState(976); match(SEMI);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(977); expression();
				setState(978); match(SEMI);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(980); match(Identifier);
				setState(981); match(COLON);
				setState(982); statement();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(983); emptyStatement();
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
		enterRule(_localctx, 132, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 134, RULE_switchBlockStatementGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(988); switchBlockStatementGroup();
				}
				}
				setState(993);
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
		enterRule(_localctx, 136, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994); switchLabel();
			setState(998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << INTERFACE) | (1L << THROW) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TRY) | (1L << SWITCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ASSERT - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (TILDE - 64)) | (1L << (BANG - 64)) | (1L << (NEW - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(995); blockStatement();
				}
				}
				setState(1000);
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
		enterRule(_localctx, 138, RULE_switchLabel);
		try {
			setState(1007);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001); match(CASE);
				setState(1002); expression();
				setState(1003); match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005); match(DEFAULT);
				setState(1006); match(COLON);
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
		enterRule(_localctx, 140, RULE_trystatement);
		try {
			setState(1034);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1009); match(TRY);
				setState(1010); block();
				((TrystatementContext)_localctx).statementType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013); match(TRY);
				setState(1014); block();
				setState(1015); catches();
				setState(1016); match(FINALLY);
				setState(1017); block();
				((TrystatementContext)_localctx).statementType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1020); match(TRY);
				setState(1021); block();
				setState(1022); catches();
				((TrystatementContext)_localctx).statementType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1025); match(TRY);
				setState(1026); block();
				setState(1027); match(FINALLY);
				setState(1028); block();
				((TrystatementContext)_localctx).statementType =  4;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1031); tryWithResources();
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
		enterRule(_localctx, 142, RULE_tryWithResources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036); match(TRY);
			setState(1037); resourceSpecification();
			setState(1038); block();
			setState(1040);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1039); catches();
				}
			}

			setState(1044);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1042); match(FINALLY);
				setState(1043); block();
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
		enterRule(_localctx, 144, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046); match(LPAREN);
			setState(1047); resources();
			setState(1049);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1048); match(SEMI);
				}
			}

			setState(1051); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 146, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1053); resource();
			setState(1058);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1054); match(SEMI);
					setState(1055); resource();
					}
					} 
				}
				setState(1060);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
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
		enterRule(_localctx, 148, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1061); variableModifiers();
				}
				break;
			}
			setState(1064); type();
			setState(1065); match(Identifier);
			setState(1066); match(EQ);
			setState(1067); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 150, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069); catchClause();
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1070); catchClause();
				}
				}
				setState(1075);
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
		enterRule(_localctx, 152, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076); match(CATCH);
			setState(1077); match(LPAREN);
			setState(1078); catchFormalParameter();
			setState(1079); match(RPAREN);
			setState(1080); block();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 154, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082); variableModifiers();
			setState(1083); type();
			setState(1088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(1084); match(BAR);
				setState(1085); type();
				}
				}
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1091); match(Identifier);
			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1092); match(LBRACKET);
				setState(1093); match(RBRACKET);
				}
				}
				setState(1098);
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
		enterRule(_localctx, 156, RULE_forstatement);
		try {
			setState(1101);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1099); foreachStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1100); normalForStatement();
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
		enterRule(_localctx, 158, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103); match(FOR);
			setState(1104); match(LPAREN);
			setState(1105); variableModifiers();
			setState(1106); type();
			setState(1107); match(Identifier);
			setState(1108); match(COLON);
			setState(1109); expression();
			setState(1110); match(RPAREN);
			setState(1111); statement();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 160, RULE_normalForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113); match(FOR);
			setState(1114); match(LPAREN);
			setState(1116);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (TILDE - 66)) | (1L << (BANG - 66)) | (1L << (NEW - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1115); forInit();
				}
			}

			setState(1118); match(SEMI);
			setState(1120);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (TILDE - 66)) | (1L << (BANG - 66)) | (1L << (NEW - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1119); expression();
				}
			}

			setState(1122); match(SEMI);
			setState(1124);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (TILDE - 66)) | (1L << (BANG - 66)) | (1L << (NEW - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1123); expressionList();
				}
			}

			setState(1126); match(RPAREN);
			setState(1127); statement();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 162, RULE_forInit);
		try {
			setState(1131);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1129); localVariableDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130); expressionList();
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
		enterRule(_localctx, 164, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133); match(LPAREN);
			setState(1134); expression();
			setState(1135); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 166, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137); expression();
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1138); match(COMMA);
				setState(1139); expression();
				}
				}
				setState(1144);
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
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
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
		enterRule(_localctx, 168, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145); lambdaExpression();
			setState(1149);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1146); assignmentOperator();
				setState(1147); expression();
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
		enterRule(_localctx, 170, RULE_assignmentOperator);
		try {
			setState(1182);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1151); match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1153); match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1155); match(SUBEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1157); match(STAREQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  4;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1159); match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  5;
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1161); match(AMPEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  6;
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1163); match(BAREQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  7;
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1165); match(CARETEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  8;
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1167); match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  9;
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1169); match(LT);
				setState(1170); match(LT);
				setState(1171); match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  10;
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1173); match(GT);
				setState(1174); match(GT);
				setState(1175); match(GT);
				setState(1176); match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  11;
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1178); match(GT);
				setState(1179); match(GT);
				setState(1180); match(EQ);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode QUES() { return getToken(Java7Parser.QUES, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
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
		enterRule(_localctx, 172, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184); conditionalOrExpression();
			setState(1190);
			_la = _input.LA(1);
			if (_la==QUES) {
				{
				setState(1185); match(QUES);
				setState(1186); expression();
				setState(1187); match(COLON);
				setState(1188); conditionalExpression();
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
		enterRule(_localctx, 174, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192); conditionalAndExpression();
			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BARBAR) {
				{
				{
				setState(1193); match(BARBAR);
				setState(1194); conditionalAndExpression();
				}
				}
				setState(1199);
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
		enterRule(_localctx, 176, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200); inclusiveOrExpression();
			setState(1205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMPAMP) {
				{
				{
				setState(1201); match(AMPAMP);
				setState(1202); inclusiveOrExpression();
				}
				}
				setState(1207);
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
		enterRule(_localctx, 178, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208); exclusiveOrExpression();
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(1209); match(BAR);
				setState(1210); exclusiveOrExpression();
				}
				}
				setState(1215);
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
		enterRule(_localctx, 180, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216); andExpression();
			setState(1221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(1217); match(CARET);
				setState(1218); andExpression();
				}
				}
				setState(1223);
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
		enterRule(_localctx, 182, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224); equalityExpression();
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(1225); match(AMP);
				setState(1226); equalityExpression();
				}
				}
				setState(1231);
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
		enterRule(_localctx, 184, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232); notEqualityExpression();
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQEQ) {
				{
				{
				setState(1233); match(EQEQ);
				setState(1234); notEqualityExpression();
				}
				}
				setState(1239);
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
		enterRule(_localctx, 186, RULE_notEqualityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240); instanceOfExpression();
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BANGEQ) {
				{
				{
				setState(1241); match(BANGEQ);
				setState(1242); instanceOfExpression();
				}
				}
				setState(1247);
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
		enterRule(_localctx, 188, RULE_instanceOfExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248); relationalExpression();
			setState(1251);
			_la = _input.LA(1);
			if (_la==INSTANCEOF) {
				{
				setState(1249); match(INSTANCEOF);
				setState(1250); type();
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
		enterRule(_localctx, 190, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1253); shiftExpression();
			setState(1259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1254); relationalOp();
					setState(1255); shiftExpression();
					}
					} 
				}
				setState(1261);
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
		enterRule(_localctx, 192, RULE_relationalOp);
		try {
			setState(1272);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1262); match(LT);
				setState(1263); match(EQ);
				((RelationalOpContext)_localctx).operatorType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1265); match(GT);
				setState(1266); match(EQ);
				((RelationalOpContext)_localctx).operatorType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1268); match(LT);
				((RelationalOpContext)_localctx).operatorType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1270); match(GT);
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
		enterRule(_localctx, 194, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1274); additiveExpression();
			setState(1280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1275); shiftOp();
					setState(1276); additiveExpression();
					}
					} 
				}
				setState(1282);
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
		enterRule(_localctx, 196, RULE_shiftOp);
		try {
			setState(1293);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1283); match(LT);
				setState(1284); match(LT);
				((ShiftOpContext)_localctx).operatorType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1286); match(GT);
				setState(1287); match(GT);
				setState(1288); match(GT);
				((ShiftOpContext)_localctx).operatorType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1290); match(GT);
				setState(1291); match(GT);
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
		enterRule(_localctx, 198, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295); multiplicativeExpression();
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==SUB) {
				{
				{
				setState(1296); additiveOp();
				setState(1297); multiplicativeExpression();
				}
				}
				setState(1303);
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
		enterRule(_localctx, 200, RULE_additiveOp);
		try {
			setState(1308);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304); match(PLUS);
				((AdditiveOpContext)_localctx).operatorType =  1;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1306); match(SUB);
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
		enterRule(_localctx, 202, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310); unaryExpression();
			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==SLASH || _la==PERCENT) {
				{
				{
				setState(1311); multiplicativeOp();
				setState(1312); unaryExpression();
				}
				}
				setState(1318);
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
		enterRule(_localctx, 204, RULE_multiplicativeOp);
		try {
			setState(1325);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1319); match(STAR);
				((MultiplicativeOpContext)_localctx).operatorType =  1;
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1321); match(SLASH);
				((MultiplicativeOpContext)_localctx).operatorType =  2;
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1323); match(PERCENT);
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
		enterRule(_localctx, 206, RULE_unaryExpression);
		try {
			setState(1340);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1327); match(PLUS);
				setState(1328); unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1329); match(SUB);
				setState(1330); unaryExpression();
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1331); match(PLUSPLUS);
				setState(1332); unaryExpression();
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(1333); match(SUBSUB);
				setState(1334); unaryExpression();
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1335); match(TILDE);
				setState(1336); unaryExpression();
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 6);
				{
				setState(1337); match(BANG);
				setState(1338); unaryExpression();
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
				setState(1339); unaryExpressionNotPlusMinus();
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
		enterRule(_localctx, 208, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			setState(1353);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1342); castExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1343); primary();
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT || _la==LBRACKET) {
					{
					{
					setState(1344); selector();
					}
					}
					setState(1349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1351);
				_la = _input.LA(1);
				if (_la==PLUSPLUS || _la==SUBSUB) {
					{
					setState(1350);
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
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
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
		enterRule(_localctx, 210, RULE_castExpression);
		try {
			setState(1365);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1355); match(LPAREN);
				setState(1356); primitiveType();
				setState(1357); match(RPAREN);
				setState(1358); unaryExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1360); match(LPAREN);
				setState(1361); type();
				setState(1362); match(RPAREN);
				setState(1363); unaryExpressionNotPlusMinus();
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
		enterRule(_localctx, 212, RULE_primary);
		int _la;
		try {
			int _alt;
			setState(1420);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1367); parExpression();
				((PrimaryContext)_localctx).operationType =  1;
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1370); match(THIS);
				setState(1375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1371); match(DOT);
						setState(1372); match(Identifier);
						}
						} 
					}
					setState(1377);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				}
				setState(1379);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1378); thisSuffix();
					}
					break;
				}
				((PrimaryContext)_localctx).operationType =  2;
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(1382); match(Identifier);
				setState(1387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1383); match(DOT);
						setState(1384); match(Identifier);
						}
						} 
					}
					setState(1389);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
				}
				setState(1391);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1390); identifierSuffix();
					}
					break;
				}
				((PrimaryContext)_localctx).operationType =  3;
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1394); match(SUPER);
				setState(1395); superSuffix();
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
				setState(1398); literal();
				((PrimaryContext)_localctx).operationType =  5;
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 6);
				{
				setState(1401); creator();
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
				setState(1404); primitiveType();
				setState(1409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(1405); match(LBRACKET);
					setState(1406); match(RBRACKET);
					}
					}
					setState(1411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1412); match(DOT);
				setState(1413); match(CLASS);
				((PrimaryContext)_localctx).operationType =  7;
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 8);
				{
				setState(1416); match(VOID);
				setState(1417); match(DOT);
				setState(1418); match(CLASS);
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
		enterRule(_localctx, 214, RULE_superSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422); match(DOT);
			setState(1424);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1423); typeArguments();
				}
			}

			setState(1426); match(Identifier);
			setState(1428);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1427); arguments();
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
		enterRule(_localctx, 216, RULE_thisSuffix);
		try {
			int _alt;
			setState(1452);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1434); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1430); match(LBRACKET);
						setState(1431); expression();
						setState(1432); match(RBRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1436); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				((ThisSuffixContext)_localctx).operationType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1440); arguments();
				((ThisSuffixContext)_localctx).operationType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1443); match(DOT);
				setState(1444); nonWildcardTypeArguments();
				setState(1445); match(Identifier);
				setState(1446); arguments();
				((ThisSuffixContext)_localctx).operationType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1449); innerCreator();
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
		enterRule(_localctx, 218, RULE_identifierSuffix);
		int _la;
		try {
			int _alt;
			setState(1491);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1456); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1454); match(LBRACKET);
					setState(1455); match(RBRACKET);
					}
					}
					setState(1458); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACKET );
				setState(1460); match(DOT);
				setState(1461); match(CLASS);
				((IdentifierSuffixContext)_localctx).operationType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1467); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1463); match(LBRACKET);
						setState(1464); expression();
						setState(1465); match(RBRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1469); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				((IdentifierSuffixContext)_localctx).operationType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1473); arguments();
				((IdentifierSuffixContext)_localctx).operationType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1476); match(DOT);
				setState(1477); match(CLASS);
				((IdentifierSuffixContext)_localctx).operationType =  4;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1479); match(DOT);
				setState(1480); nonWildcardTypeArguments();
				setState(1481); match(Identifier);
				setState(1482); arguments();
				((IdentifierSuffixContext)_localctx).operationType =  5;
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1485); match(DOT);
				setState(1486); match(THIS);
				((IdentifierSuffixContext)_localctx).operationType =  6;
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1488); innerCreator();
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
		enterRule(_localctx, 220, RULE_selector);
		int _la;
		try {
			setState(1515);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1493); match(DOT);
				setState(1494); match(Identifier);
				setState(1496);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1495); arguments();
					}
				}

				((SelectorContext)_localctx).operationType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499); match(DOT);
				setState(1500); match(THIS);
				((SelectorContext)_localctx).operationType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1502); match(DOT);
				setState(1503); match(SUPER);
				setState(1504); superSuffix();
				((SelectorContext)_localctx).operationType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1507); innerCreator();
				((SelectorContext)_localctx).operationType =  4;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1510); match(LBRACKET);
				setState(1511); expression();
				setState(1512); match(RBRACKET);
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
		enterRule(_localctx, 222, RULE_creator);
		try {
			setState(1527);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1517); match(NEW);
				setState(1518); nonWildcardTypeArguments();
				setState(1519); classOrInterfaceType();
				setState(1520); classCreatorRest();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1522); match(NEW);
				setState(1523); classOrInterfaceType();
				setState(1524); classCreatorRest();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1526); arrayCreator();
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
		enterRule(_localctx, 224, RULE_arrayCreator);
		int _la;
		try {
			int _alt;
			setState(1563);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1529); match(NEW);
				setState(1530); createdName();
				setState(1531); match(LBRACKET);
				setState(1532); match(RBRACKET);
				setState(1537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(1533); match(LBRACKET);
					setState(1534); match(RBRACKET);
					}
					}
					setState(1539);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1540); arrayInitializer();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1542); match(NEW);
				setState(1543); createdName();
				setState(1544); match(LBRACKET);
				setState(1545); expression();
				setState(1546); match(RBRACKET);
				setState(1553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1547); match(LBRACKET);
						setState(1548); expression();
						setState(1549); match(RBRACKET);
						}
						} 
					}
					setState(1555);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				}
				setState(1560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1556); match(LBRACKET);
						setState(1557); match(RBRACKET);
						}
						} 
					}
					setState(1562);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
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
		enterRule(_localctx, 226, RULE_variableInitializer);
		try {
			setState(1567);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1565); arrayInitializer();
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
				setState(1566); expression();
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
		enterRule(_localctx, 228, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1569); match(LBRACE);
			setState(1578);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (TILDE - 66)) | (1L << (BANG - 66)) | (1L << (NEW - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1570); variableInitializer();
				setState(1575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1571); match(COMMA);
						setState(1572); variableInitializer();
						}
						} 
					}
					setState(1577);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				}
				}
			}

			setState(1581);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1580); match(COMMA);
				}
			}

			setState(1583); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 230, RULE_createdName);
		try {
			setState(1587);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1585); classOrInterfaceType();
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
				setState(1586); primitiveType();
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
		enterRule(_localctx, 232, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589); match(DOT);
			setState(1590); match(NEW);
			setState(1592);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1591); nonWildcardTypeArguments();
				}
			}

			setState(1594); identifierTypeArgument();
			setState(1595); classCreatorRest();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 234, RULE_classCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597); arguments();
			setState(1599);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1598); classBody();
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
		enterRule(_localctx, 236, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601); match(LT);
			setState(1602); typeList();
			setState(1603); match(GT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 238, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605); match(LPAREN);
			setState(1607);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (PLUSPLUS - 66)) | (1L << (SUBSUB - 66)) | (1L << (TILDE - 66)) | (1L << (BANG - 66)) | (1L << (NEW - 66)) | (1L << (PLUS - 66)) | (1L << (SUB - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1606); expressionList();
				}
			}

			setState(1609); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 240, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
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
		enterRule(_localctx, 242, RULE_classHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613); modifiers();
			setState(1614); match(CLASS);
			setState(1615); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 244, RULE_enumHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617); modifiers();
			setState(1618);
			_la = _input.LA(1);
			if ( !(_la==ENUM || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1619); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 246, RULE_interfaceHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621); modifiers();
			setState(1622); match(INTERFACE);
			setState(1623); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 248, RULE_annotationHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625); modifiers();
			setState(1626); match(AT);
			setState(1627); match(INTERFACE);
			setState(1628); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 250, RULE_typeHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630); modifiers();
			setState(1637);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(1631); match(CLASS);
				}
				break;
			case ENUM:
				{
				setState(1632); match(ENUM);
				}
				break;
			case INTERFACE:
			case AT:
				{
				{
				setState(1634);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1633); match(AT);
					}
				}

				setState(1636); match(INTERFACE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1639); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 252, RULE_methodHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641); modifiers();
			setState(1643);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1642); typeParameters();
				}
			}

			setState(1647);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1645); type();
				}
				break;

			case 2:
				{
				setState(1646); match(VOID);
				}
				break;
			}
			setState(1649); match(Identifier);
			setState(1650); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 254, RULE_fieldHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1652); modifiers();
			setState(1653); type();
			setState(1654); match(Identifier);
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1655); match(LBRACKET);
				setState(1656); match(RBRACKET);
				}
				}
				setState(1661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1662);
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
		enterRule(_localctx, 256, RULE_localVariableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664); variableModifiers();
			setState(1665); type();
			setState(1666); match(Identifier);
			setState(1671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1667); match(LBRACKET);
				setState(1668); match(RBRACKET);
				}
				}
				setState(1673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1674);
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
		enterRule(_localctx, 258, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676); match(LPAREN);
			setState(1678);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1677); inferredFormalParameters();
				}
			}

			setState(1680); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 260, RULE_inferredFormalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682); match(Identifier);
			setState(1687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1683); match(COMMA);
				setState(1684); match(Identifier);
				}
				}
				setState(1689);
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
		enterRule(_localctx, 262, RULE_lambdaExpression);
		try {
			setState(1695);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1690); lambdaParameters();
				setState(1691); match(LAMBDA);
				setState(1692); lambdaBody();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1694); conditionalExpression();
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
		enterRule(_localctx, 264, RULE_lambdaParameters);
		try {
			setState(1700);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1697); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1698); formalParameters();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1699); inferredFormalParameterList();
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
		enterRule(_localctx, 266, RULE_lambdaBody);
		try {
			setState(1704);
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
				setState(1702); expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1703); block();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3i\u06ad\4\2\t\2\4"+
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
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\3\2\5\2\u0110\n\2\3\2\7\2\u0113"+
		"\n\2\f\2\16\2\u0116\13\2\3\2\7\2\u0119\n\2\f\2\16\2\u011c\13\2\3\3\5\3"+
		"\u011f\n\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u0127\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\u012f\n\4\3\4\3\4\3\4\6\4\u0134\n\4\r\4\16\4\u0135\3\4\3\4\5\4"+
		"\u013a\n\4\3\4\5\4\u013d\n\4\3\5\3\5\3\5\7\5\u0142\n\5\f\5\16\5\u0145"+
		"\13\5\3\6\3\6\5\6\u0149\n\6\3\7\3\7\5\7\u014d\n\7\3\b\7\b\u0150\n\b\f"+
		"\b\16\b\u0153\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u0161\n\t\3\n\7\n\u0164\n\n\f\n\16\n\u0167\13\n\3\n\5\n\u016a\n\n\3\n"+
		"\7\n\u016d\n\n\f\n\16\n\u0170\13\n\3\13\3\13\5\13\u0174\n\13\3\f\3\f\3"+
		"\f\3\f\5\f\u017a\n\f\3\f\3\f\5\f\u017e\n\f\3\f\3\f\5\f\u0182\n\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\7\r\u018a\n\r\f\r\16\r\u018d\13\r\3\r\3\r\3\16\3\16"+
		"\3\16\5\16\u0194\n\16\3\17\3\17\3\17\7\17\u0199\n\17\f\17\16\17\u019c"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\5\20\u01a3\n\20\3\20\3\20\3\21\3\21\5"+
		"\21\u01a9\n\21\3\21\5\21\u01ac\n\21\3\21\5\21\u01af\n\21\3\21\3\21\3\22"+
		"\3\22\3\22\7\22\u01b6\n\22\f\22\16\22\u01b9\13\22\3\23\5\23\u01bc\n\23"+
		"\3\23\3\23\5\23\u01c0\n\23\3\23\5\23\u01c3\n\23\3\24\3\24\7\24\u01c7\n"+
		"\24\f\24\16\24\u01ca\13\24\3\25\3\25\5\25\u01ce\n\25\3\26\3\26\3\26\3"+
		"\26\5\26\u01d4\n\26\3\26\3\26\5\26\u01d8\n\26\3\26\3\26\3\27\3\27\3\27"+
		"\7\27\u01df\n\27\f\27\16\27\u01e2\13\27\3\30\3\30\7\30\u01e6\n\30\f\30"+
		"\16\30\u01e9\13\30\3\30\3\30\3\31\3\31\7\31\u01ef\n\31\f\31\16\31\u01f2"+
		"\13\31\3\31\3\31\3\32\3\32\5\32\u01f8\n\32\3\32\3\32\5\32\u01fc\n\32\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u0203\n\33\3\34\3\34\5\34\u0207\n\34\3\34"+
		"\3\34\5\34\u020b\n\34\3\34\3\34\3\34\3\34\7\34\u0211\n\34\f\34\16\34\u0214"+
		"\13\34\3\34\3\34\5\34\u0218\n\34\3\34\3\34\5\34\u021c\n\34\3\35\3\35\5"+
		"\35\u0220\n\35\3\35\3\35\3\35\3\35\5\35\u0226\n\35\3\35\3\35\3\36\3\36"+
		"\5\36\u022c\n\36\3\36\7\36\u022f\n\36\f\36\16\36\u0232\13\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\7\37\u023b\n\37\f\37\16\37\u023e\13\37\3\37"+
		"\3\37\3 \3 \3 \7 \u0245\n \f \16 \u0248\13 \3 \3 \5 \u024c\n \3!\3!\3"+
		"!\3!\3!\3!\5!\u0254\n!\3\"\3\"\5\"\u0258\n\"\3\"\3\"\5\"\u025c\n\"\3\""+
		"\3\"\3\"\3\"\7\"\u0262\n\"\f\"\16\"\u0265\13\"\3\"\3\"\5\"\u0269\n\"\3"+
		"\"\3\"\5\"\u026d\n\"\3#\3#\3#\3#\3#\5#\u0274\n#\3#\5#\u0277\n#\3#\3#\5"+
		"#\u027b\n#\3#\3#\3#\3#\7#\u0281\n#\f#\16#\u0284\13#\3#\3#\5#\u0288\n#"+
		"\3#\3#\5#\u028c\n#\3$\3$\3$\3$\3$\7$\u0293\n$\f$\16$\u0296\13$\3$\3$\3"+
		"%\3%\3%\7%\u029d\n%\f%\16%\u02a0\13%\3%\3%\3%\7%\u02a5\n%\f%\16%\u02a8"+
		"\13%\5%\u02aa\n%\3&\3&\3&\7&\u02af\n&\f&\16&\u02b2\13&\3\'\3\'\5\'\u02b6"+
		"\n\'\3(\3(\3)\3)\3)\3)\7)\u02be\n)\f)\16)\u02c1\13)\3)\3)\3)\3)\5)\u02c7"+
		"\n)\3*\3*\3*\3*\5*\u02cd\n*\5*\u02cf\n*\3+\3+\3+\7+\u02d4\n+\f+\16+\u02d7"+
		"\13+\3,\3,\5,\u02db\n,\3,\3,\3-\3-\3-\3-\3-\3-\7-\u02e5\n-\f-\16-\u02e8"+
		"\13-\3-\3-\3-\3-\3-\6-\u02ef\n-\r-\16-\u02f0\3-\3-\3-\5-\u02f6\n-\3.\3"+
		".\3.\3.\3.\7.\u02fd\n.\f.\16.\u0300\13.\3/\3/\3/\3/\3/\3\60\5\60\u0308"+
		"\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0311\n\60\3\60\3\60\3\60"+
		"\3\60\5\60\u0317\n\60\3\61\3\61\3\61\7\61\u031c\n\61\f\61\16\61\u031f"+
		"\13\61\3\62\6\62\u0322\n\62\r\62\16\62\u0323\3\63\3\63\3\63\5\63\u0329"+
		"\n\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\5\66\u0338\n\66\3\66\3\66\3\67\3\67\3\67\7\67\u033f\n\67\f\67\16\67\u0342"+
		"\13\67\38\38\38\38\39\39\39\59\u034b\n9\3:\3:\3:\3:\7:\u0351\n:\f:\16"+
		":\u0354\13:\5:\u0356\n:\3:\5:\u0359\n:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\7"+
		"<\u0365\n<\f<\16<\u0368\13<\3<\3<\3=\3=\3=\3=\3=\3=\3=\5=\u0373\n=\3>"+
		"\3>\3>\3>\3>\3>\3>\5>\u037c\n>\3>\3>\3?\3?\7?\u0382\n?\f?\16?\u0385\13"+
		"?\3?\3?\3@\3@\3@\5@\u038c\n@\3A\3A\3A\3B\3B\3B\3B\3B\7B\u0396\nB\fB\16"+
		"B\u0399\13B\3C\3C\3C\3C\3C\5C\u03a0\nC\3C\3C\3C\3C\3C\3C\3C\5C\u03a9\n"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\5C\u03c3\nC\3C\3C\3C\3C\3C\3C\3C\5C\u03cc\nC\3C\3C\3C\5C\u03d1\n"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u03db\nC\3D\3D\3E\7E\u03e0\nE\fE\16E\u03e3"+
		"\13E\3F\3F\7F\u03e7\nF\fF\16F\u03ea\13F\3G\3G\3G\3G\3G\3G\5G\u03f2\nG"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\5H\u040d\nH\3I\3I\3I\3I\5I\u0413\nI\3I\3I\5I\u0417\nI\3J\3J\3J"+
		"\5J\u041c\nJ\3J\3J\3K\3K\3K\7K\u0423\nK\fK\16K\u0426\13K\3L\5L\u0429\n"+
		"L\3L\3L\3L\3L\3L\3M\3M\7M\u0432\nM\fM\16M\u0435\13M\3N\3N\3N\3N\3N\3N"+
		"\3O\3O\3O\3O\7O\u0441\nO\fO\16O\u0444\13O\3O\3O\3O\7O\u0449\nO\fO\16O"+
		"\u044c\13O\3P\3P\5P\u0450\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\5"+
		"R\u045f\nR\3R\3R\5R\u0463\nR\3R\3R\5R\u0467\nR\3R\3R\3R\3S\3S\5S\u046e"+
		"\nS\3T\3T\3T\3T\3U\3U\3U\7U\u0477\nU\fU\16U\u047a\13U\3V\3V\3V\3V\5V\u0480"+
		"\nV\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u04a1\nW\3X\3X\3X\3X\3X\3X\5X\u04a9\nX"+
		"\3Y\3Y\3Y\7Y\u04ae\nY\fY\16Y\u04b1\13Y\3Z\3Z\3Z\7Z\u04b6\nZ\fZ\16Z\u04b9"+
		"\13Z\3[\3[\3[\7[\u04be\n[\f[\16[\u04c1\13[\3\\\3\\\3\\\7\\\u04c6\n\\\f"+
		"\\\16\\\u04c9\13\\\3]\3]\3]\7]\u04ce\n]\f]\16]\u04d1\13]\3^\3^\3^\7^\u04d6"+
		"\n^\f^\16^\u04d9\13^\3_\3_\3_\7_\u04de\n_\f_\16_\u04e1\13_\3`\3`\3`\5"+
		"`\u04e6\n`\3a\3a\3a\3a\7a\u04ec\na\fa\16a\u04ef\13a\3b\3b\3b\3b\3b\3b"+
		"\3b\3b\3b\3b\5b\u04fb\nb\3c\3c\3c\3c\7c\u0501\nc\fc\16c\u0504\13c\3d\3"+
		"d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u0510\nd\3e\3e\3e\3e\7e\u0516\ne\fe\16e\u0519"+
		"\13e\3f\3f\3f\3f\5f\u051f\nf\3g\3g\3g\3g\7g\u0525\ng\fg\16g\u0528\13g"+
		"\3h\3h\3h\3h\3h\3h\5h\u0530\nh\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i"+
		"\5i\u053f\ni\3j\3j\3j\7j\u0544\nj\fj\16j\u0547\13j\3j\5j\u054a\nj\5j\u054c"+
		"\nj\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u0558\nk\3l\3l\3l\3l\3l\3l\7l\u0560"+
		"\nl\fl\16l\u0563\13l\3l\5l\u0566\nl\3l\3l\3l\3l\7l\u056c\nl\fl\16l\u056f"+
		"\13l\3l\5l\u0572\nl\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\7l\u0582"+
		"\nl\fl\16l\u0585\13l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u058f\nl\3m\3m\5m\u0593"+
		"\nm\3m\3m\5m\u0597\nm\3n\3n\3n\3n\6n\u059d\nn\rn\16n\u059e\3n\3n\3n\3"+
		"n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\5n\u05af\nn\3o\3o\6o\u05b3\no\ro\16o\u05b4"+
		"\3o\3o\3o\3o\3o\3o\3o\6o\u05be\no\ro\16o\u05bf\3o\3o\3o\3o\3o\3o\3o\3"+
		"o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u05d6\no\3p\3p\3p\5p\u05db\n"+
		"p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\5p\u05ee\np\3q\3"+
		"q\3q\3q\3q\3q\3q\3q\3q\3q\5q\u05fa\nq\3r\3r\3r\3r\3r\3r\7r\u0602\nr\f"+
		"r\16r\u0605\13r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\7r\u0612\nr\fr\16r\u0615"+
		"\13r\3r\3r\7r\u0619\nr\fr\16r\u061c\13r\5r\u061e\nr\3s\3s\5s\u0622\ns"+
		"\3t\3t\3t\3t\7t\u0628\nt\ft\16t\u062b\13t\5t\u062d\nt\3t\5t\u0630\nt\3"+
		"t\3t\3u\3u\5u\u0636\nu\3v\3v\3v\5v\u063b\nv\3v\3v\3v\3w\3w\5w\u0642\n"+
		"w\3x\3x\3x\3x\3y\3y\5y\u064a\ny\3y\3y\3z\3z\3{\3{\3{\3{\3|\3|\3|\3|\3"+
		"}\3}\3}\3}\3~\3~\3~\3~\3~\3\177\3\177\3\177\3\177\5\177\u0665\n\177\3"+
		"\177\5\177\u0668\n\177\3\177\3\177\3\u0080\3\u0080\5\u0080\u066e\n\u0080"+
		"\3\u0080\3\u0080\5\u0080\u0672\n\u0080\3\u0080\3\u0080\3\u0080\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u067c\n\u0081\f\u0081\16\u0081"+
		"\u067f\13\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\7\u0082\u0688\n\u0082\f\u0082\16\u0082\u068b\13\u0082\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\5\u0083\u0691\n\u0083\3\u0083\3\u0083\3\u0084\3\u0084"+
		"\3\u0084\7\u0084\u0698\n\u0084\f\u0084\16\u0084\u069b\13\u0084\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u06a2\n\u0085\3\u0086\3\u0086"+
		"\3\u0086\5\u0086\u06a7\n\u0086\3\u0087\3\u0087\5\u0087\u06ab\n\u0087\3"+
		"\u0087\2\2\u0088\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\2\t\3\2!(\4\2**--\3\2,-\3\2DE\4\2"+
		".\60ad\4\2AAee\5\2\3\3\21\21\34\34\u0734\2\u010f\3\2\2\2\4\u011e\3\2\2"+
		"\2\6\u013c\3\2\2\2\b\u013e\3\2\2\2\n\u0148\3\2\2\2\f\u014c\3\2\2\2\16"+
		"\u0151\3\2\2\2\20\u0160\3\2\2\2\22\u0165\3\2\2\2\24\u0173\3\2\2\2\26\u0175"+
		"\3\2\2\2\30\u0185\3\2\2\2\32\u0190\3\2\2\2\34\u0195\3\2\2\2\36\u019d\3"+
		"\2\2\2 \u01a6\3\2\2\2\"\u01b2\3\2\2\2$\u01bb\3\2\2\2&\u01c4\3\2\2\2(\u01cd"+
		"\3\2\2\2*\u01cf\3\2\2\2,\u01db\3\2\2\2.\u01e3\3\2\2\2\60\u01ec\3\2\2\2"+
		"\62\u01fb\3\2\2\2\64\u0202\3\2\2\2\66\u0204\3\2\2\28\u021d\3\2\2\2:\u0229"+
		"\3\2\2\2<\u0235\3\2\2\2>\u0241\3\2\2\2@\u0253\3\2\2\2B\u0255\3\2\2\2D"+
		"\u0273\3\2\2\2F\u028d\3\2\2\2H\u02a9\3\2\2\2J\u02ab\3\2\2\2L\u02b3\3\2"+
		"\2\2N\u02b7\3\2\2\2P\u02c6\3\2\2\2R\u02ce\3\2\2\2T\u02d0\3\2\2\2V\u02d8"+
		"\3\2\2\2X\u02f5\3\2\2\2Z\u02f7\3\2\2\2\\\u0301\3\2\2\2^\u0316\3\2\2\2"+
		"`\u0318\3\2\2\2b\u0321\3\2\2\2d\u0328\3\2\2\2f\u032a\3\2\2\2h\u032d\3"+
		"\2\2\2j\u0333\3\2\2\2l\u033b\3\2\2\2n\u0343\3\2\2\2p\u034a\3\2\2\2r\u034c"+
		"\3\2\2\2t\u035c\3\2\2\2v\u0362\3\2\2\2x\u0372\3\2\2\2z\u0374\3\2\2\2|"+
		"\u037f\3\2\2\2~\u038b\3\2\2\2\u0080\u038d\3\2\2\2\u0082\u0390\3\2\2\2"+
		"\u0084\u03da\3\2\2\2\u0086\u03dc\3\2\2\2\u0088\u03e1\3\2\2\2\u008a\u03e4"+
		"\3\2\2\2\u008c\u03f1\3\2\2\2\u008e\u040c\3\2\2\2\u0090\u040e\3\2\2\2\u0092"+
		"\u0418\3\2\2\2\u0094\u041f\3\2\2\2\u0096\u0428\3\2\2\2\u0098\u042f\3\2"+
		"\2\2\u009a\u0436\3\2\2\2\u009c\u043c\3\2\2\2\u009e\u044f\3\2\2\2\u00a0"+
		"\u0451\3\2\2\2\u00a2\u045b\3\2\2\2\u00a4\u046d\3\2\2\2\u00a6\u046f\3\2"+
		"\2\2\u00a8\u0473\3\2\2\2\u00aa\u047b\3\2\2\2\u00ac\u04a0\3\2\2\2\u00ae"+
		"\u04a2\3\2\2\2\u00b0\u04aa\3\2\2\2\u00b2\u04b2\3\2\2\2\u00b4\u04ba\3\2"+
		"\2\2\u00b6\u04c2\3\2\2\2\u00b8\u04ca\3\2\2\2\u00ba\u04d2\3\2\2\2\u00bc"+
		"\u04da\3\2\2\2\u00be\u04e2\3\2\2\2\u00c0\u04e7\3\2\2\2\u00c2\u04fa\3\2"+
		"\2\2\u00c4\u04fc\3\2\2\2\u00c6\u050f\3\2\2\2\u00c8\u0511\3\2\2\2\u00ca"+
		"\u051e\3\2\2\2\u00cc\u0520\3\2\2\2\u00ce\u052f\3\2\2\2\u00d0\u053e\3\2"+
		"\2\2\u00d2\u054b\3\2\2\2\u00d4\u0557\3\2\2\2\u00d6\u058e\3\2\2\2\u00d8"+
		"\u0590\3\2\2\2\u00da\u05ae\3\2\2\2\u00dc\u05d5\3\2\2\2\u00de\u05ed\3\2"+
		"\2\2\u00e0\u05f9\3\2\2\2\u00e2\u061d\3\2\2\2\u00e4\u0621\3\2\2\2\u00e6"+
		"\u0623\3\2\2\2\u00e8\u0635\3\2\2\2\u00ea\u0637\3\2\2\2\u00ec\u063f\3\2"+
		"\2\2\u00ee\u0643\3\2\2\2\u00f0\u0647\3\2\2\2\u00f2\u064d\3\2\2\2\u00f4"+
		"\u064f\3\2\2\2\u00f6\u0653\3\2\2\2\u00f8\u0657\3\2\2\2\u00fa\u065b\3\2"+
		"\2\2\u00fc\u0660\3\2\2\2\u00fe\u066b\3\2\2\2\u0100\u0676\3\2\2\2\u0102"+
		"\u0682\3\2\2\2\u0104\u068e\3\2\2\2\u0106\u0694\3\2\2\2\u0108\u06a1\3\2"+
		"\2\2\u010a\u06a6\3\2\2\2\u010c\u06aa\3\2\2\2\u010e\u0110\5\4\3\2\u010f"+
		"\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0114\3\2\2\2\u0111\u0113\5\6"+
		"\4\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u011a\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\5\n"+
		"\6\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\3\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\5b\62\2"+
		"\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121"+
		"\7\4\2\2\u0121\u0122\5`\61\2\u0122\u0123\7\3\2\2\u0123\5\3\2\2\2\u0124"+
		"\u0126\7\5\2\2\u0125\u0127\7\16\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3"+
		"\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7e\2\2\u0129\u012a\7\6\2\2\u012a"+
		"\u012b\7\7\2\2\u012b\u013d\7\3\2\2\u012c\u012e\7\5\2\2\u012d\u012f\7\16"+
		"\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0133\7e\2\2\u0131\u0132\7\6\2\2\u0132\u0134\7e\2\2\u0133\u0131\3\2\2"+
		"\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0139"+
		"\3\2\2\2\u0137\u0138\7\6\2\2\u0138\u013a\7\7\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\7\3\2\2\u013c\u0124\3\2"+
		"\2\2\u013c\u012c\3\2\2\2\u013d\7\3\2\2\2\u013e\u0143\7e\2\2\u013f\u0140"+
		"\7\6\2\2\u0140\u0142\7e\2\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\t\3\2\2\2\u0145\u0143\3\2\2\2"+
		"\u0146\u0149\5\f\7\2\u0147\u0149\7\3\2\2\u0148\u0146\3\2\2\2\u0148\u0147"+
		"\3\2\2\2\u0149\13\3\2\2\2\u014a\u014d\5\24\13\2\u014b\u014d\5(\25\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\r\3\2\2\2\u014e\u0150\5\20\t"+
		"\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\17\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0161\5d\63\2\u0155"+
		"\u0161\7\n\2\2\u0156\u0161\7\13\2\2\u0157\u0161\7\f\2\2\u0158\u0161\7"+
		"\16\2\2\u0159\u0161\7\r\2\2\u015a\u0161\7\17\2\2\u015b\u0161\7\35\2\2"+
		"\u015c\u0161\7\36\2\2\u015d\u0161\7\37\2\2\u015e\u0161\7 \2\2\u015f\u0161"+
		"\7\20\2\2\u0160\u0154\3\2\2\2\u0160\u0155\3\2\2\2\u0160\u0156\3\2\2\2"+
		"\u0160\u0157\3\2\2\2\u0160\u0158\3\2\2\2\u0160\u0159\3\2\2\2\u0160\u015a"+
		"\3\2\2\2\u0160\u015b\3\2\2\2\u0160\u015c\3\2\2\2\u0160\u015d\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161\21\3\2\2\2\u0162\u0164\5d\63"+
		"\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016a\7\17\2\2"+
		"\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016e\3\2\2\2\u016b\u016d"+
		"\5d\63\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\23\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0174\5\26\f"+
		"\2\u0172\u0174\5\36\20\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174"+
		"\25\3\2\2\2\u0175\u0176\5\16\b\2\u0176\u0177\7\b\2\2\u0177\u0179\7e\2"+
		"\2\u0178\u017a\5\30\r\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017d\3\2\2\2\u017b\u017c\7*\2\2\u017c\u017e\5H%\2\u017d\u017b\3\2\2"+
		"\2\u017d\u017e\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u0180\7\t\2\2\u0180\u0182"+
		"\5,\27\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0184\5.\30\2\u0184\27\3\2\2\2\u0185\u0186\7]\2\2\u0186\u018b\5\32\16"+
		"\2\u0187\u0188\7\21\2\2\u0188\u018a\5\32\16\2\u0189\u0187\3\2\2\2\u018a"+
		"\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2"+
		"\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7\\\2\2\u018f\31\3\2\2\2\u0190\u0193"+
		"\7e\2\2\u0191\u0192\7*\2\2\u0192\u0194\5\34\17\2\u0193\u0191\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\33\3\2\2\2\u0195\u019a\5H%\2\u0196\u0197\7O\2\2\u0197"+
		"\u0199\5H%\2\u0198\u0196\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2"+
		"\2\u019a\u019b\3\2\2\2\u019b\35\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e"+
		"\5\16\b\2\u019e\u019f\7A\2\2\u019f\u01a2\7e\2\2\u01a0\u01a1\7\t\2\2\u01a1"+
		"\u01a3\5,\27\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4\u01a5\5 \21\2\u01a5\37\3\2\2\2\u01a6\u01a8\7\22\2\2\u01a7\u01a9"+
		"\5\"\22\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2"+
		"\u01aa\u01ac\7\21\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae"+
		"\3\2\2\2\u01ad\u01af\5&\24\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b1\7\23\2\2\u01b1!\3\2\2\2\u01b2\u01b7\5$\23\2"+
		"\u01b3\u01b4\7\21\2\2\u01b4\u01b6\5$\23\2\u01b5\u01b3\3\2\2\2\u01b6\u01b9"+
		"\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8#\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01ba\u01bc\5b\62\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\7e\2\2\u01be\u01c0\5\u00f0y\2\u01bf"+
		"\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01c3\5."+
		"\30\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3%\3\2\2\2\u01c4\u01c8"+
		"\7\3\2\2\u01c5\u01c7\5\62\32\2\u01c6\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2"+
		"\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\'\3\2\2\2\u01ca\u01c8\3"+
		"\2\2\2\u01cb\u01ce\5*\26\2\u01cc\u01ce\5t;\2\u01cd\u01cb\3\2\2\2\u01cd"+
		"\u01cc\3\2\2\2\u01ce)\3\2\2\2\u01cf\u01d0\5\16\b\2\u01d0\u01d1\7\31\2"+
		"\2\u01d1\u01d3\7e\2\2\u01d2\u01d4\5\30\r\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d6\7*\2\2\u01d6\u01d8\5,\27\2\u01d7"+
		"\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\5\60"+
		"\31\2\u01da+\3\2\2\2\u01db\u01e0\5H%\2\u01dc\u01dd\7\21\2\2\u01dd\u01df"+
		"\5H%\2\u01de\u01dc\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1-\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e7\7\22\2\2"+
		"\u01e4\u01e6\5\62\32\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5"+
		"\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea"+
		"\u01eb\7\23\2\2\u01eb/\3\2\2\2\u01ec\u01f0\7\22\2\2\u01ed\u01ef\5@!\2"+
		"\u01ee\u01ed\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1"+
		"\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\7\23\2\2"+
		"\u01f4\61\3\2\2\2\u01f5\u01fc\7\3\2\2\u01f6\u01f8\7\16\2\2\u01f7\u01f6"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fc\5|?\2\u01fa"+
		"\u01fc\5\64\33\2\u01fb\u01f5\3\2\2\2\u01fb\u01f7\3\2\2\2\u01fb\u01fa\3"+
		"\2\2\2\u01fc\63\3\2\2\2\u01fd\u0203\58\35\2\u01fe\u0203\5<\37\2\u01ff"+
		"\u0203\5\66\34\2\u0200\u0203\5\24\13\2\u0201\u0203\5(\25\2\u0202\u01fd"+
		"\3\2\2\2\u0202\u01fe\3\2\2\2\u0202\u01ff\3\2\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0201\3\2\2\2\u0203\65\3\2\2\2\u0204\u0206\5\16\b\2\u0205\u0207\5\30"+
		"\r\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u020a\3\2\2\2\u0208"+
		"\u020b\5H%\2\u0209\u020b\7\30\2\2\u020a\u0208\3\2\2\2\u020a\u0209\3\2"+
		"\2\2\u020b\u020c\3\2\2\2\u020c\u020d\7e\2\2\u020d\u0212\5V,\2\u020e\u020f"+
		"\7\24\2\2\u020f\u0211\7\25\2\2\u0210\u020e\3\2\2\2\u0211\u0214\3\2\2\2"+
		"\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0217\3\2\2\2\u0214\u0212"+
		"\3\2\2\2\u0215\u0216\7\33\2\2\u0216\u0218\5T+\2\u0217\u0215\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u021c\5|?\2\u021a\u021c\7\3\2"+
		"\2\u021b\u0219\3\2\2\2\u021b\u021a\3\2\2\2\u021c\67\3\2\2\2\u021d\u021f"+
		"\5\16\b\2\u021e\u0220\5\30\r\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2"+
		"\u0220\u0221\3\2\2\2\u0221\u0222\7e\2\2\u0222\u0225\5V,\2\u0223\u0224"+
		"\7\33\2\2\u0224\u0226\5T+\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"\u0227\3\2\2\2\u0227\u0228\5:\36\2\u02289\3\2\2\2\u0229\u022b\7\22\2\2"+
		"\u022a\u022c\5^\60\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u0230"+
		"\3\2\2\2\u022d\u022f\5~@\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2"+
		"\2\2\u0233\u0234\7\23\2\2\u0234;\3\2\2\2\u0235\u0236\5\16\b\2\u0236\u0237"+
		"\5H%\2\u0237\u023c\5> \2\u0238\u0239\7\21\2\2\u0239\u023b\5> \2\u023a"+
		"\u0238\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2"+
		"\2\2\u023d\u023f\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0240\7\3\2\2\u0240"+
		"=\3\2\2\2\u0241\u0246\7e\2\2\u0242\u0243\7\24\2\2\u0243\u0245\7\25\2\2"+
		"\u0244\u0242\3\2\2\2\u0245\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247"+
		"\3\2\2\2\u0247\u024b\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u024a\7\34\2\2"+
		"\u024a\u024c\5\u00e4s\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"?\3\2\2\2\u024d\u0254\5F$\2\u024e\u0254\5B\"\2\u024f\u0254\5D#\2\u0250"+
		"\u0254\5(\25\2\u0251\u0254\5\24\13\2\u0252\u0254\7\3\2\2\u0253\u024d\3"+
		"\2\2\2\u0253\u024e\3\2\2\2\u0253\u024f\3\2\2\2\u0253\u0250\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0253\u0252\3\2\2\2\u0254A\3\2\2\2\u0255\u0257\5\16\b\2"+
		"\u0256\u0258\5\30\r\2\u0257\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025b"+
		"\3\2\2\2\u0259\u025c\5H%\2\u025a\u025c\7\30\2\2\u025b\u0259\3\2\2\2\u025b"+
		"\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\7e\2\2\u025e\u0263\5V,"+
		"\2\u025f\u0260\7\24\2\2\u0260\u0262\7\25\2\2\u0261\u025f\3\2\2\2\u0262"+
		"\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0268\3\2"+
		"\2\2\u0265\u0263\3\2\2\2\u0266\u0267\7\33\2\2\u0267\u0269\5T+\2\u0268"+
		"\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026c\3\2\2\2\u026a\u026d\5|"+
		"?\2\u026b\u026d\7\3\2\2\u026c\u026a\3\2\2\2\u026c\u026b\3\2\2\2\u026d"+
		"C\3\2\2\2\u026e\u026f\7\62\2\2\u026f\u0274\5\16\b\2\u0270\u0271\5\16\b"+
		"\2\u0271\u0272\7\62\2\2\u0272\u0274\3\2\2\2\u0273\u026e\3\2\2\2\u0273"+
		"\u0270\3\2\2\2\u0274\u0276\3\2\2\2\u0275\u0277\5\30\r\2\u0276\u0275\3"+
		"\2\2\2\u0276\u0277\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u027b\5H%\2\u0279"+
		"\u027b\7\30\2\2\u027a\u0278\3\2\2\2\u027a\u0279\3\2\2\2\u027b\u027c\3"+
		"\2\2\2\u027c\u027d\7e\2\2\u027d\u0282\5V,\2\u027e\u027f\7\24\2\2\u027f"+
		"\u0281\7\25\2\2\u0280\u027e\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3"+
		"\2\2\2\u0282\u0283\3\2\2\2\u0283\u0287\3\2\2\2\u0284\u0282\3\2\2\2\u0285"+
		"\u0286\7\33\2\2\u0286\u0288\5T+\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2"+
		"\2\2\u0288\u028b\3\2\2\2\u0289\u028c\5|?\2\u028a\u028c\7\3\2\2\u028b\u0289"+
		"\3\2\2\2\u028b\u028a\3\2\2\2\u028cE\3\2\2\2\u028d\u028e\5\16\b\2\u028e"+
		"\u028f\5H%\2\u028f\u0294\5> \2\u0290\u0291\7\21\2\2\u0291\u0293\5> \2"+
		"\u0292\u0290\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295"+
		"\3\2\2\2\u0295\u0297\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u0298\7\3\2\2\u0298"+
		"G\3\2\2\2\u0299\u029e\5J&\2\u029a\u029b\7\24\2\2\u029b\u029d\7\25\2\2"+
		"\u029c\u029a\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029f\u02aa\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a6\5N(\2\u02a2"+
		"\u02a3\7\24\2\2\u02a3\u02a5\7\25\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a8\3"+
		"\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8"+
		"\u02a6\3\2\2\2\u02a9\u0299\3\2\2\2\u02a9\u02a1\3\2\2\2\u02aaI\3\2\2\2"+
		"\u02ab\u02b0\5L\'\2\u02ac\u02ad\7\6\2\2\u02ad\u02af\5L\'\2\u02ae\u02ac"+
		"\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"K\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3\u02b5\7e\2\2\u02b4\u02b6\5P)\2\u02b5"+
		"\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6M\3\2\2\2\u02b7\u02b8\t\2\2\2"+
		"\u02b8O\3\2\2\2\u02b9\u02ba\7]\2\2\u02ba\u02bf\5R*\2\u02bb\u02bc\7\21"+
		"\2\2\u02bc\u02be\5R*\2\u02bd\u02bb\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd"+
		"\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2"+
		"\u02c3\7\\\2\2\u02c3\u02c7\3\2\2\2\u02c4\u02c5\7]\2\2\u02c5\u02c7\7\\"+
		"\2\2\u02c6\u02b9\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7Q\3\2\2\2\u02c8\u02cf"+
		"\5H%\2\u02c9\u02cc\7)\2\2\u02ca\u02cb\t\3\2\2\u02cb\u02cd\5H%\2\u02cc"+
		"\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02c8\3\2"+
		"\2\2\u02ce\u02c9\3\2\2\2\u02cfS\3\2\2\2\u02d0\u02d5\5`\61\2\u02d1\u02d2"+
		"\7\21\2\2\u02d2\u02d4\5`\61\2\u02d3\u02d1\3\2\2\2\u02d4\u02d7\3\2\2\2"+
		"\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6U\3\2\2\2\u02d7\u02d5\3"+
		"\2\2\2\u02d8\u02da\7\26\2\2\u02d9\u02db\5X-\2\u02da\u02d9\3\2\2\2\u02da"+
		"\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\7\27\2\2\u02ddW\3\2\2\2"+
		"\u02de\u02df\5\\/\2\u02df\u02e0\b-\1\2\u02e0\u02f6\3\2\2\2\u02e1\u02e6"+
		"\5Z.\2\u02e2\u02e3\7\21\2\2\u02e3\u02e5\5Z.\2\u02e4\u02e2\3\2\2\2\u02e5"+
		"\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9\3\2"+
		"\2\2\u02e8\u02e6\3\2\2\2\u02e9\u02ea\b-\1\2\u02ea\u02f6\3\2\2\2\u02eb"+
		"\u02ec\5Z.\2\u02ec\u02ed\7\21\2\2\u02ed\u02ef\3\2\2\2\u02ee\u02eb\3\2"+
		"\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1"+
		"\u02f2\3\2\2\2\u02f2\u02f3\5\\/\2\u02f3\u02f4\b-\1\2\u02f4\u02f6\3\2\2"+
		"\2\u02f5\u02de\3\2\2\2\u02f5\u02e1\3\2\2\2\u02f5\u02ee\3\2\2\2\u02f6Y"+
		"\3\2\2\2\u02f7\u02f8\5\22\n\2\u02f8\u02f9\5H%\2\u02f9\u02fe\7e\2\2\u02fa"+
		"\u02fb\7\24\2\2\u02fb\u02fd\7\25\2\2\u02fc\u02fa\3\2\2\2\u02fd\u0300\3"+
		"\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff[\3\2\2\2\u0300\u02fe"+
		"\3\2\2\2\u0301\u0302\5\22\n\2\u0302\u0303\5H%\2\u0303\u0304\7+\2\2\u0304"+
		"\u0305\7e\2\2\u0305]\3\2\2\2\u0306\u0308\5\u00eex\2\u0307\u0306\3\2\2"+
		"\2\u0307\u0308\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\t\4\2\2\u030a\u030b"+
		"\5\u00f0y\2\u030b\u030c\7\3\2\2\u030c\u0317\3\2\2\2\u030d\u030e\5\u00d6"+
		"l\2\u030e\u0310\7\6\2\2\u030f\u0311\5\u00eex\2\u0310\u030f\3\2\2\2\u0310"+
		"\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\7-\2\2\u0313\u0314\5\u00f0"+
		"y\2\u0314\u0315\7\3\2\2\u0315\u0317\3\2\2\2\u0316\u0307\3\2\2\2\u0316"+
		"\u030d\3\2\2\2\u0317_\3\2\2\2\u0318\u031d\7e\2\2\u0319\u031a\7\6\2\2\u031a"+
		"\u031c\7e\2\2\u031b\u0319\3\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b\3\2"+
		"\2\2\u031d\u031e\3\2\2\2\u031ea\3\2\2\2\u031f\u031d\3\2\2\2\u0320\u0322"+
		"\5d\63\2\u0321\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0321\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324c\3\2\2\2\u0325\u0329\5f\64\2\u0326\u0329\5h\65\2"+
		"\u0327\u0329\5j\66\2\u0328\u0325\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0327"+
		"\3\2\2\2\u0329e\3\2\2\2\u032a\u032b\7\61\2\2\u032b\u032c\5`\61\2\u032c"+
		"g\3\2\2\2\u032d\u032e\7\61\2\2\u032e\u032f\5`\61\2\u032f\u0330\7\26\2"+
		"\2\u0330\u0331\5p9\2\u0331\u0332\7\27\2\2\u0332i\3\2\2\2\u0333\u0334\7"+
		"\61\2\2\u0334\u0335\5`\61\2\u0335\u0337\7\26\2\2\u0336\u0338\5l\67\2\u0337"+
		"\u0336\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033a\7\27"+
		"\2\2\u033ak\3\2\2\2\u033b\u0340\5n8\2\u033c\u033d\7\21\2\2\u033d\u033f"+
		"\5n8\2\u033e\u033c\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2\2\2\u0340"+
		"\u0341\3\2\2\2\u0341m\3\2\2\2\u0342\u0340\3\2\2\2\u0343\u0344\7e\2\2\u0344"+
		"\u0345\7\34\2\2\u0345\u0346\5p9\2\u0346o\3\2\2\2\u0347\u034b\5\u00aeX"+
		"\2\u0348\u034b\5d\63\2\u0349\u034b\5r:\2\u034a\u0347\3\2\2\2\u034a\u0348"+
		"\3\2\2\2\u034a\u0349\3\2\2\2\u034bq\3\2\2\2\u034c\u0355\7\22\2\2\u034d"+
		"\u0352\5p9\2\u034e\u034f\7\21\2\2\u034f\u0351\5p9\2\u0350\u034e\3\2\2"+
		"\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0356"+
		"\3\2\2\2\u0354\u0352\3\2\2\2\u0355\u034d\3\2\2\2\u0355\u0356\3\2\2\2\u0356"+
		"\u0358\3\2\2\2\u0357\u0359\7\21\2\2\u0358\u0357\3\2\2\2\u0358\u0359\3"+
		"\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\7\23\2\2\u035bs\3\2\2\2\u035c\u035d"+
		"\5\16\b\2\u035d\u035e\7\61\2\2\u035e\u035f\7\31\2\2\u035f\u0360\7e\2\2"+
		"\u0360\u0361\5v<\2\u0361u\3\2\2\2\u0362\u0366\7\22\2\2\u0363\u0365\5x"+
		"=\2\u0364\u0363\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2\2\2\u0366"+
		"\u0367\3\2\2\2\u0367\u0369\3\2\2\2\u0368\u0366\3\2\2\2\u0369\u036a\7\23"+
		"\2\2\u036aw\3\2\2\2\u036b\u0373\5z>\2\u036c\u0373\5F$\2\u036d\u0373\5"+
		"\26\f\2\u036e\u0373\5*\26\2\u036f\u0373\5\36\20\2\u0370\u0373\5t;\2\u0371"+
		"\u0373\7\3\2\2\u0372\u036b\3\2\2\2\u0372\u036c\3\2\2\2\u0372\u036d\3\2"+
		"\2\2\u0372\u036e\3\2\2\2\u0372\u036f\3\2\2\2\u0372\u0370\3\2\2\2\u0372"+
		"\u0371\3\2\2\2\u0373y\3\2\2\2\u0374\u0375\5\16\b\2\u0375\u0376\5H%\2\u0376"+
		"\u0377\7e\2\2\u0377\u0378\7\26\2\2\u0378\u037b\7\27\2\2\u0379\u037a\7"+
		"\62\2\2\u037a\u037c\5p9\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c"+
		"\u037d\3\2\2\2\u037d\u037e\7\3\2\2\u037e{\3\2\2\2\u037f\u0383\7\22\2\2"+
		"\u0380\u0382\5~@\2\u0381\u0380\3\2\2\2\u0382\u0385\3\2\2\2\u0383\u0381"+
		"\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\3\2\2\2\u0385\u0383\3\2\2\2\u0386"+
		"\u0387\7\23\2\2\u0387}\3\2\2\2\u0388\u038c\5\u0080A\2\u0389\u038c\5\f"+
		"\7\2\u038a\u038c\5\u0084C\2\u038b\u0388\3\2\2\2\u038b\u0389\3\2\2\2\u038b"+
		"\u038a\3\2\2\2\u038c\177\3\2\2\2\u038d\u038e\5\u0082B\2\u038e\u038f\7"+
		"\3\2\2\u038f\u0081\3\2\2\2\u0390\u0391\5\22\n\2\u0391\u0392\5H%\2\u0392"+
		"\u0397\5> \2\u0393\u0394\7\21\2\2\u0394\u0396\5> \2\u0395\u0393\3\2\2"+
		"\2\u0396\u0399\3\2\2\2\u0397\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0083"+
		"\3\2\2\2\u0399\u0397\3\2\2\2\u039a\u03db\5|?\2\u039b\u039c\7B\2\2\u039c"+
		"\u039f\5\u00aaV\2\u039d\u039e\7\63\2\2\u039e\u03a0\5\u00aaV\2\u039f\u039d"+
		"\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a2\7\3\2\2\u03a2"+
		"\u03db\3\2\2\2\u03a3\u03a4\7\64\2\2\u03a4\u03a5\5\u00a6T\2\u03a5\u03a8"+
		"\5\u0084C\2\u03a6\u03a7\7\65\2\2\u03a7\u03a9\5\u0084C\2\u03a8\u03a6\3"+
		"\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03db\3\2\2\2\u03aa\u03db\5\u009eP\2"+
		"\u03ab\u03ac\7\67\2\2\u03ac\u03ad\5\u00a6T\2\u03ad\u03ae\5\u0084C\2\u03ae"+
		"\u03db\3\2\2\2\u03af\u03b0\78\2\2\u03b0\u03b1\5\u0084C\2\u03b1\u03b2\7"+
		"\67\2\2\u03b2\u03b3\5\u00a6T\2\u03b3\u03b4\7\3\2\2\u03b4\u03db\3\2\2\2"+
		"\u03b5\u03db\5\u008eH\2\u03b6\u03b7\7;\2\2\u03b7\u03b8\5\u00a6T\2\u03b8"+
		"\u03b9\7\22\2\2\u03b9\u03ba\5\u0088E\2\u03ba\u03bb\7\23\2\2\u03bb\u03db"+
		"\3\2\2\2\u03bc\u03bd\7\36\2\2\u03bd\u03be\5\u00a6T\2\u03be\u03bf\5|?\2"+
		"\u03bf\u03db\3\2\2\2\u03c0\u03c2\7<\2\2\u03c1\u03c3\5\u00aaV\2\u03c2\u03c1"+
		"\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03db\7\3\2\2\u03c5"+
		"\u03c6\7\32\2\2\u03c6\u03c7\5\u00aaV\2\u03c7\u03c8\7\3\2\2\u03c8\u03db"+
		"\3\2\2\2\u03c9\u03cb\7=\2\2\u03ca\u03cc\7e\2\2\u03cb\u03ca\3\2\2\2\u03cb"+
		"\u03cc\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03db\7\3\2\2\u03ce\u03d0\7>"+
		"\2\2\u03cf\u03d1\7e\2\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"\u03d2\3\2\2\2\u03d2\u03db\7\3\2\2\u03d3\u03d4\5\u00aaV\2\u03d4\u03d5"+
		"\7\3\2\2\u03d5\u03db\3\2\2\2\u03d6\u03d7\7e\2\2\u03d7\u03d8\7\63\2\2\u03d8"+
		"\u03db\5\u0084C\2\u03d9\u03db\5\u0086D\2\u03da\u039a\3\2\2\2\u03da\u039b"+
		"\3\2\2\2\u03da\u03a3\3\2\2\2\u03da\u03aa\3\2\2\2\u03da\u03ab\3\2\2\2\u03da"+
		"\u03af\3\2\2\2\u03da\u03b5\3\2\2\2\u03da\u03b6\3\2\2\2\u03da\u03bc\3\2"+
		"\2\2\u03da\u03c0\3\2\2\2\u03da\u03c5\3\2\2\2\u03da\u03c9\3\2\2\2\u03da"+
		"\u03ce\3\2\2\2\u03da\u03d3\3\2\2\2\u03da\u03d6\3\2\2\2\u03da\u03d9\3\2"+
		"\2\2\u03db\u0085\3\2\2\2\u03dc\u03dd\7\3\2\2\u03dd\u0087\3\2\2\2\u03de"+
		"\u03e0\5\u008aF\2\u03df\u03de\3\2\2\2\u03e0\u03e3\3\2\2\2\u03e1\u03df"+
		"\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u0089\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e4"+
		"\u03e8\5\u008cG\2\u03e5\u03e7\5~@\2\u03e6\u03e5\3\2\2\2\u03e7\u03ea\3"+
		"\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u008b\3\2\2\2\u03ea"+
		"\u03e8\3\2\2\2\u03eb\u03ec\7@\2\2\u03ec\u03ed\5\u00aaV\2\u03ed\u03ee\7"+
		"\63\2\2\u03ee\u03f2\3\2\2\2\u03ef\u03f0\7\62\2\2\u03f0\u03f2\7\63\2\2"+
		"\u03f1\u03eb\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2\u008d\3\2\2\2\u03f3\u03f4"+
		"\79\2\2\u03f4\u03f5\5|?\2\u03f5\u03f6\bH\1\2\u03f6\u040d\3\2\2\2\u03f7"+
		"\u03f8\79\2\2\u03f8\u03f9\5|?\2\u03f9\u03fa\5\u0098M\2\u03fa\u03fb\7:"+
		"\2\2\u03fb\u03fc\5|?\2\u03fc\u03fd\bH\1\2\u03fd\u040d\3\2\2\2\u03fe\u03ff"+
		"\79\2\2\u03ff\u0400\5|?\2\u0400\u0401\5\u0098M\2\u0401\u0402\bH\1\2\u0402"+
		"\u040d\3\2\2\2\u0403\u0404\79\2\2\u0404\u0405\5|?\2\u0405\u0406\7:\2\2"+
		"\u0406\u0407\5|?\2\u0407\u0408\bH\1\2\u0408\u040d\3\2\2\2\u0409\u040a"+
		"\5\u0090I\2\u040a\u040b\bH\1\2\u040b\u040d\3\2\2\2\u040c\u03f3\3\2\2\2"+
		"\u040c\u03f7\3\2\2\2\u040c\u03fe\3\2\2\2\u040c\u0403\3\2\2\2\u040c\u0409"+
		"\3\2\2\2\u040d\u008f\3\2\2\2\u040e\u040f\79\2\2\u040f\u0410\5\u0092J\2"+
		"\u0410\u0412\5|?\2\u0411\u0413\5\u0098M\2\u0412\u0411\3\2\2\2\u0412\u0413"+
		"\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0415\7:\2\2\u0415\u0417\5|?\2\u0416"+
		"\u0414\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0091\3\2\2\2\u0418\u0419\7\26"+
		"\2\2\u0419\u041b\5\u0094K\2\u041a\u041c\7\3\2\2\u041b\u041a\3\2\2\2\u041b"+
		"\u041c\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041e\7\27\2\2\u041e\u0093\3"+
		"\2\2\2\u041f\u0424\5\u0096L\2\u0420\u0421\7\3\2\2\u0421\u0423\5\u0096"+
		"L\2\u0422\u0420\3\2\2\2\u0423\u0426\3\2\2\2\u0424\u0422\3\2\2\2\u0424"+
		"\u0425\3\2\2\2\u0425\u0095\3\2\2\2\u0426\u0424\3\2\2\2\u0427\u0429\5\22"+
		"\n\2\u0428\u0427\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\3\2\2\2\u042a"+
		"\u042b\5H%\2\u042b\u042c\7e\2\2\u042c\u042d\7\34\2\2\u042d\u042e\5\u00aa"+
		"V\2\u042e\u0097\3\2\2\2\u042f\u0433\5\u009aN\2\u0430\u0432\5\u009aN\2"+
		"\u0431\u0430\3\2\2\2\u0432\u0435\3\2\2\2\u0433\u0431\3\2\2\2\u0433\u0434"+
		"\3\2\2\2\u0434\u0099\3\2\2\2\u0435\u0433\3\2\2\2\u0436\u0437\7?\2\2\u0437"+
		"\u0438\7\26\2\2\u0438\u0439\5\u009cO\2\u0439\u043a\7\27\2\2\u043a\u043b"+
		"\5|?\2\u043b\u009b\3\2\2\2\u043c\u043d\5\22\n\2\u043d\u0442\5H%\2\u043e"+
		"\u043f\7Q\2\2\u043f\u0441\5H%\2\u0440\u043e\3\2\2\2\u0441\u0444\3\2\2"+
		"\2\u0442\u0440\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0445\3\2\2\2\u0444\u0442"+
		"\3\2\2\2\u0445\u044a\7e\2\2\u0446\u0447\7\24\2\2\u0447\u0449\7\25\2\2"+
		"\u0448\u0446\3\2\2\2\u0449\u044c\3\2\2\2\u044a\u0448\3\2\2\2\u044a\u044b"+
		"\3\2\2\2\u044b\u009d\3\2\2\2\u044c\u044a\3\2\2\2\u044d\u0450\5\u00a0Q"+
		"\2\u044e\u0450\5\u00a2R\2\u044f\u044d\3\2\2\2\u044f\u044e\3\2\2\2\u0450"+
		"\u009f\3\2\2\2\u0451\u0452\7\66\2\2\u0452\u0453\7\26\2\2\u0453\u0454\5"+
		"\22\n\2\u0454\u0455\5H%\2\u0455\u0456\7e\2\2\u0456\u0457\7\63\2\2\u0457"+
		"\u0458\5\u00aaV\2\u0458\u0459\7\27\2\2\u0459\u045a\5\u0084C\2\u045a\u00a1"+
		"\3\2\2\2\u045b\u045c\7\66\2\2\u045c\u045e\7\26\2\2\u045d\u045f\5\u00a4"+
		"S\2\u045e\u045d\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0460\3\2\2\2\u0460"+
		"\u0462\7\3\2\2\u0461\u0463\5\u00aaV\2\u0462\u0461\3\2\2\2\u0462\u0463"+
		"\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0466\7\3\2\2\u0465\u0467\5\u00a8U"+
		"\2\u0466\u0465\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469"+
		"\7\27\2\2\u0469\u046a\5\u0084C\2\u046a\u00a3\3\2\2\2\u046b\u046e\5\u0082"+
		"B\2\u046c\u046e\5\u00a8U\2\u046d\u046b\3\2\2\2\u046d\u046c\3\2\2\2\u046e"+
		"\u00a5\3\2\2\2\u046f\u0470\7\26\2\2\u0470\u0471\5\u00aaV\2\u0471\u0472"+
		"\7\27\2\2\u0472\u00a7\3\2\2\2\u0473\u0478\5\u00aaV\2\u0474\u0475\7\21"+
		"\2\2\u0475\u0477\5\u00aaV\2\u0476\u0474\3\2\2\2\u0477\u047a\3\2\2\2\u0478"+
		"\u0476\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u00a9\3\2\2\2\u047a\u0478\3\2"+
		"\2\2\u047b\u047f\5\u0108\u0085\2\u047c\u047d\5\u00acW\2\u047d\u047e\5"+
		"\u00aaV\2\u047e\u0480\3\2\2\2\u047f\u047c\3\2\2\2\u047f\u0480\3\2\2\2"+
		"\u0480\u00ab\3\2\2\2\u0481\u0482\7\34\2\2\u0482\u04a1\bW\1\2\u0483\u0484"+
		"\7U\2\2\u0484\u04a1\bW\1\2\u0485\u0486\7V\2\2\u0486\u04a1\bW\1\2\u0487"+
		"\u0488\7W\2\2\u0488\u04a1\bW\1\2\u0489\u048a\7X\2\2\u048a\u04a1\bW\1\2"+
		"\u048b\u048c\7Y\2\2\u048c\u04a1\bW\1\2\u048d\u048e\7Z\2\2\u048e\u04a1"+
		"\bW\1\2\u048f\u0490\7T\2\2\u0490\u04a1\bW\1\2\u0491\u0492\7[\2\2\u0492"+
		"\u04a1\bW\1\2\u0493\u0494\7]\2\2\u0494\u0495\7]\2\2\u0495\u0496\7\34\2"+
		"\2\u0496\u04a1\bW\1\2\u0497\u0498\7\\\2\2\u0498\u0499\7\\\2\2\u0499\u049a"+
		"\7\\\2\2\u049a\u049b\7\34\2\2\u049b\u04a1\bW\1\2\u049c\u049d\7\\\2\2\u049d"+
		"\u049e\7\\\2\2\u049e\u049f\7\34\2\2\u049f\u04a1\bW\1\2\u04a0\u0481\3\2"+
		"\2\2\u04a0\u0483\3\2\2\2\u04a0\u0485\3\2\2\2\u04a0\u0487\3\2\2\2\u04a0"+
		"\u0489\3\2\2\2\u04a0\u048b\3\2\2\2\u04a0\u048d\3\2\2\2\u04a0\u048f\3\2"+
		"\2\2\u04a0\u0491\3\2\2\2\u04a0\u0493\3\2\2\2\u04a0\u0497\3\2\2\2\u04a0"+
		"\u049c\3\2\2\2\u04a1\u00ad\3\2\2\2\u04a2\u04a8\5\u00b0Y\2\u04a3\u04a4"+
		"\7)\2\2\u04a4\u04a5\5\u00aaV\2\u04a5\u04a6\7\63\2\2\u04a6\u04a7\5\u00ae"+
		"X\2\u04a7\u04a9\3\2\2\2\u04a8\u04a3\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9"+
		"\u00af\3\2\2\2\u04aa\u04af\5\u00b2Z\2\u04ab\u04ac\7S\2\2\u04ac\u04ae\5"+
		"\u00b2Z\2\u04ad\u04ab\3\2\2\2\u04ae\u04b1\3\2\2\2\u04af\u04ad\3\2\2\2"+
		"\u04af\u04b0\3\2\2\2\u04b0\u00b1\3\2\2\2\u04b1\u04af\3\2\2\2\u04b2\u04b7"+
		"\5\u00b4[\2\u04b3\u04b4\7R\2\2\u04b4\u04b6\5\u00b4[\2\u04b5\u04b3\3\2"+
		"\2\2\u04b6\u04b9\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8"+
		"\u00b3\3\2\2\2\u04b9\u04b7\3\2\2\2\u04ba\u04bf\5\u00b6\\\2\u04bb\u04bc"+
		"\7Q\2\2\u04bc\u04be\5\u00b6\\\2\u04bd\u04bb\3\2\2\2\u04be\u04c1\3\2\2"+
		"\2\u04bf\u04bd\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u00b5\3\2\2\2\u04c1\u04bf"+
		"\3\2\2\2\u04c2\u04c7\5\u00b8]\2\u04c3\u04c4\7P\2\2\u04c4\u04c6\5\u00b8"+
		"]\2\u04c5\u04c3\3\2\2\2\u04c6\u04c9\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c7"+
		"\u04c8\3\2\2\2\u04c8\u00b7\3\2\2\2\u04c9\u04c7\3\2\2\2\u04ca\u04cf\5\u00ba"+
		"^\2\u04cb\u04cc\7O\2\2\u04cc\u04ce\5\u00ba^\2\u04cd\u04cb\3\2\2\2\u04ce"+
		"\u04d1\3\2\2\2\u04cf\u04cd\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u00b9\3\2"+
		"\2\2\u04d1\u04cf\3\2\2\2\u04d2\u04d7\5\u00bc_\2\u04d3\u04d4\7M\2\2\u04d4"+
		"\u04d6\5\u00bc_\2\u04d5\u04d3\3\2\2\2\u04d6\u04d9\3\2\2\2\u04d7\u04d5"+
		"\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u00bb\3\2\2\2\u04d9\u04d7\3\2\2\2\u04da"+
		"\u04df\5\u00be`\2\u04db\u04dc\7N\2\2\u04dc\u04de\5\u00be`\2\u04dd\u04db"+
		"\3\2\2\2\u04de\u04e1\3\2\2\2\u04df\u04dd\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0"+
		"\u00bd\3\2\2\2\u04e1\u04df\3\2\2\2\u04e2\u04e5\5\u00c0a\2\u04e3\u04e4"+
		"\7^\2\2\u04e4\u04e6\5H%\2\u04e5\u04e3\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6"+
		"\u00bf\3\2\2\2\u04e7\u04ed\5\u00c4c\2\u04e8\u04e9\5\u00c2b\2\u04e9\u04ea"+
		"\5\u00c4c\2\u04ea\u04ec\3\2\2\2\u04eb\u04e8\3\2\2\2\u04ec\u04ef\3\2\2"+
		"\2\u04ed\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u00c1\3\2\2\2\u04ef\u04ed"+
		"\3\2\2\2\u04f0\u04f1\7]\2\2\u04f1\u04f2\7\34\2\2\u04f2\u04fb\bb\1\2\u04f3"+
		"\u04f4\7\\\2\2\u04f4\u04f5\7\34\2\2\u04f5\u04fb\bb\1\2\u04f6\u04f7\7]"+
		"\2\2\u04f7\u04fb\bb\1\2\u04f8\u04f9\7\\\2\2\u04f9\u04fb\bb\1\2\u04fa\u04f0"+
		"\3\2\2\2\u04fa\u04f3\3\2\2\2\u04fa\u04f6\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fb"+
		"\u00c3\3\2\2\2\u04fc\u0502\5\u00c8e\2\u04fd\u04fe\5\u00c6d\2\u04fe\u04ff"+
		"\5\u00c8e\2\u04ff\u0501\3\2\2\2\u0500\u04fd\3\2\2\2\u0501\u0504\3\2\2"+
		"\2\u0502\u0500\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u00c5\3\2\2\2\u0504\u0502"+
		"\3\2\2\2\u0505\u0506\7]\2\2\u0506\u0507\7]\2\2\u0507\u0510\bd\1\2\u0508"+
		"\u0509\7\\\2\2\u0509\u050a\7\\\2\2\u050a\u050b\7\\\2\2\u050b\u0510\bd"+
		"\1\2\u050c\u050d\7\\\2\2\u050d\u050e\7\\\2\2\u050e\u0510\bd\1\2\u050f"+
		"\u0505\3\2\2\2\u050f\u0508\3\2\2\2\u050f\u050c\3\2\2\2\u0510\u00c7\3\2"+
		"\2\2\u0511\u0517\5\u00ccg\2\u0512\u0513\5\u00caf\2\u0513\u0514\5\u00cc"+
		"g\2\u0514\u0516\3\2\2\2\u0515\u0512\3\2\2\2\u0516\u0519\3\2\2\2\u0517"+
		"\u0515\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u00c9\3\2\2\2\u0519\u0517\3\2"+
		"\2\2\u051a\u051b\7K\2\2\u051b\u051f\bf\1\2\u051c\u051d\7L\2\2\u051d\u051f"+
		"\bf\1\2\u051e\u051a\3\2\2\2\u051e\u051c\3\2\2\2\u051f\u00cb\3\2\2\2\u0520"+
		"\u0526\5\u00d0i\2\u0521\u0522\5\u00ceh\2\u0522\u0523\5\u00d0i\2\u0523"+
		"\u0525\3\2\2\2\u0524\u0521\3\2\2\2\u0525\u0528\3\2\2\2\u0526\u0524\3\2"+
		"\2\2\u0526\u0527\3\2\2\2\u0527\u00cd\3\2\2\2\u0528\u0526\3\2\2\2\u0529"+
		"\u052a\7\7\2\2\u052a\u0530\bh\1\2\u052b\u052c\7I\2\2\u052c\u0530\bh\1"+
		"\2\u052d\u052e\7J\2\2\u052e\u0530\bh\1\2\u052f\u0529\3\2\2\2\u052f\u052b"+
		"\3\2\2\2\u052f\u052d\3\2\2\2\u0530\u00cf\3\2\2\2\u0531\u0532\7K\2\2\u0532"+
		"\u053f\5\u00d0i\2\u0533\u0534\7L\2\2\u0534\u053f\5\u00d0i\2\u0535\u0536"+
		"\7D\2\2\u0536\u053f\5\u00d0i\2\u0537\u0538\7E\2\2\u0538\u053f\5\u00d0"+
		"i\2\u0539\u053a\7F\2\2\u053a\u053f\5\u00d0i\2\u053b\u053c\7G\2\2\u053c"+
		"\u053f\5\u00d0i\2\u053d\u053f\5\u00d2j\2\u053e\u0531\3\2\2\2\u053e\u0533"+
		"\3\2\2\2\u053e\u0535\3\2\2\2\u053e\u0537\3\2\2\2\u053e\u0539\3\2\2\2\u053e"+
		"\u053b\3\2\2\2\u053e\u053d\3\2\2\2\u053f\u00d1\3\2\2\2\u0540\u054c\5\u00d4"+
		"k\2\u0541\u0545\5\u00d6l\2\u0542\u0544\5\u00dep\2\u0543\u0542\3\2\2\2"+
		"\u0544\u0547\3\2\2\2\u0545\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0549"+
		"\3\2\2\2\u0547\u0545\3\2\2\2\u0548\u054a\t\5\2\2\u0549\u0548\3\2\2\2\u0549"+
		"\u054a\3\2\2\2\u054a\u054c\3\2\2\2\u054b\u0540\3\2\2\2\u054b\u0541\3\2"+
		"\2\2\u054c\u00d3\3\2\2\2\u054d\u054e\7\26\2\2\u054e\u054f\5N(\2\u054f"+
		"\u0550\7\27\2\2\u0550\u0551\5\u00d0i\2\u0551\u0558\3\2\2\2\u0552\u0553"+
		"\7\26\2\2\u0553\u0554\5H%\2\u0554\u0555\7\27\2\2\u0555\u0556\5\u00d2j"+
		"\2\u0556\u0558\3\2\2\2\u0557\u054d\3\2\2\2\u0557\u0552\3\2\2\2\u0558\u00d5"+
		"\3\2\2\2\u0559\u055a\5\u00a6T\2\u055a\u055b\bl\1\2\u055b\u058f\3\2\2\2"+
		"\u055c\u0561\7,\2\2\u055d\u055e\7\6\2\2\u055e\u0560\7e\2\2\u055f\u055d"+
		"\3\2\2\2\u0560\u0563\3\2\2\2\u0561\u055f\3\2\2\2\u0561\u0562\3\2\2\2\u0562"+
		"\u0565\3\2\2\2\u0563\u0561\3\2\2\2\u0564\u0566\5\u00dan\2\u0565\u0564"+
		"\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u058f\bl\1\2\u0568"+
		"\u056d\7e\2\2\u0569\u056a\7\6\2\2\u056a\u056c\7e\2\2\u056b\u0569\3\2\2"+
		"\2\u056c\u056f\3\2\2\2\u056d\u056b\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0571"+
		"\3\2\2\2\u056f\u056d\3\2\2\2\u0570\u0572\5\u00dco\2\u0571\u0570\3\2\2"+
		"\2\u0571\u0572\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u058f\bl\1\2\u0574\u0575"+
		"\7-\2\2\u0575\u0576\5\u00d8m\2\u0576\u0577\bl\1\2\u0577\u058f\3\2\2\2"+
		"\u0578\u0579\5\u00f2z\2\u0579\u057a\bl\1\2\u057a\u058f\3\2\2\2\u057b\u057c"+
		"\5\u00e0q\2\u057c\u057d\bl\1\2\u057d\u058f\3\2\2\2\u057e\u0583\5N(\2\u057f"+
		"\u0580\7\24\2\2\u0580\u0582\7\25\2\2\u0581\u057f\3\2\2\2\u0582\u0585\3"+
		"\2\2\2\u0583\u0581\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0586\3\2\2\2\u0585"+
		"\u0583\3\2\2\2\u0586\u0587\7\6\2\2\u0587\u0588\7\b\2\2\u0588\u0589\bl"+
		"\1\2\u0589\u058f\3\2\2\2\u058a\u058b\7\30\2\2\u058b\u058c\7\6\2\2\u058c"+
		"\u058d\7\b\2\2\u058d\u058f\bl\1\2\u058e\u0559\3\2\2\2\u058e\u055c\3\2"+
		"\2\2\u058e\u0568\3\2\2\2\u058e\u0574\3\2\2\2\u058e\u0578\3\2\2\2\u058e"+
		"\u057b\3\2\2\2\u058e\u057e\3\2\2\2\u058e\u058a\3\2\2\2\u058f\u00d7\3\2"+
		"\2\2\u0590\u0592\7\6\2\2\u0591\u0593\5P)\2\u0592\u0591\3\2\2\2\u0592\u0593"+
		"\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0596\7e\2\2\u0595\u0597\5\u00f0y\2"+
		"\u0596\u0595\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u00d9\3\2\2\2\u0598\u0599"+
		"\7\24\2\2\u0599\u059a\5\u00aaV\2\u059a\u059b\7\25\2\2\u059b\u059d\3\2"+
		"\2\2\u059c\u0598\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u059c\3\2\2\2\u059e"+
		"\u059f\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a1\bn\1\2\u05a1\u05af\3\2"+
		"\2\2\u05a2\u05a3\5\u00f0y\2\u05a3\u05a4\bn\1\2\u05a4\u05af\3\2\2\2\u05a5"+
		"\u05a6\7\6\2\2\u05a6\u05a7\5\u00eex\2\u05a7\u05a8\7e\2\2\u05a8\u05a9\5"+
		"\u00f0y\2\u05a9\u05aa\bn\1\2\u05aa\u05af\3\2\2\2\u05ab\u05ac\5\u00eav"+
		"\2\u05ac\u05ad\bn\1\2\u05ad\u05af\3\2\2\2\u05ae\u059c\3\2\2\2\u05ae\u05a2"+
		"\3\2\2\2\u05ae\u05a5\3\2\2\2\u05ae\u05ab\3\2\2\2\u05af\u00db\3\2\2\2\u05b0"+
		"\u05b1\7\24\2\2\u05b1\u05b3\7\25\2\2\u05b2\u05b0\3\2\2\2\u05b3\u05b4\3"+
		"\2\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6"+
		"\u05b7\7\6\2\2\u05b7\u05b8\7\b\2\2\u05b8\u05d6\bo\1\2\u05b9\u05ba\7\24"+
		"\2\2\u05ba\u05bb\5\u00aaV\2\u05bb\u05bc\7\25\2\2\u05bc\u05be\3\2\2\2\u05bd"+
		"\u05b9\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05bd\3\2\2\2\u05bf\u05c0\3\2"+
		"\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c2\bo\1\2\u05c2\u05d6\3\2\2\2\u05c3"+
		"\u05c4\5\u00f0y\2\u05c4\u05c5\bo\1\2\u05c5\u05d6\3\2\2\2\u05c6\u05c7\7"+
		"\6\2\2\u05c7\u05c8\7\b\2\2\u05c8\u05d6\bo\1\2\u05c9\u05ca\7\6\2\2\u05ca"+
		"\u05cb\5\u00eex\2\u05cb\u05cc\7e\2\2\u05cc\u05cd\5\u00f0y\2\u05cd\u05ce"+
		"\bo\1\2\u05ce\u05d6\3\2\2\2\u05cf\u05d0\7\6\2\2\u05d0\u05d1\7,\2\2\u05d1"+
		"\u05d6\bo\1\2\u05d2\u05d3\5\u00eav\2\u05d3\u05d4\bo\1\2\u05d4\u05d6\3"+
		"\2\2\2\u05d5\u05b2\3\2\2\2\u05d5\u05bd\3\2\2\2\u05d5\u05c3\3\2\2\2\u05d5"+
		"\u05c6\3\2\2\2\u05d5\u05c9\3\2\2\2\u05d5\u05cf\3\2\2\2\u05d5\u05d2\3\2"+
		"\2\2\u05d6\u00dd\3\2\2\2\u05d7\u05d8\7\6\2\2\u05d8\u05da\7e\2\2\u05d9"+
		"\u05db\5\u00f0y\2\u05da\u05d9\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dc"+
		"\3\2\2\2\u05dc\u05ee\bp\1\2\u05dd\u05de\7\6\2\2\u05de\u05df\7,\2\2\u05df"+
		"\u05ee\bp\1\2\u05e0\u05e1\7\6\2\2\u05e1\u05e2\7-\2\2\u05e2\u05e3\5\u00d8"+
		"m\2\u05e3\u05e4\bp\1\2\u05e4\u05ee\3\2\2\2\u05e5\u05e6\5\u00eav\2\u05e6"+
		"\u05e7\bp\1\2\u05e7\u05ee\3\2\2\2\u05e8\u05e9\7\24\2\2\u05e9\u05ea\5\u00aa"+
		"V\2\u05ea\u05eb\7\25\2\2\u05eb\u05ec\bp\1\2\u05ec\u05ee\3\2\2\2\u05ed"+
		"\u05d7\3\2\2\2\u05ed\u05dd\3\2\2\2\u05ed\u05e0\3\2\2\2\u05ed\u05e5\3\2"+
		"\2\2\u05ed\u05e8\3\2\2\2\u05ee\u00df\3\2\2\2\u05ef\u05f0\7H\2\2\u05f0"+
		"\u05f1\5\u00eex\2\u05f1\u05f2\5J&\2\u05f2\u05f3\5\u00ecw\2\u05f3\u05fa"+
		"\3\2\2\2\u05f4\u05f5\7H\2\2\u05f5\u05f6\5J&\2\u05f6\u05f7\5\u00ecw\2\u05f7"+
		"\u05fa\3\2\2\2\u05f8\u05fa\5\u00e2r\2\u05f9\u05ef\3\2\2\2\u05f9\u05f4"+
		"\3\2\2\2\u05f9\u05f8\3\2\2\2\u05fa\u00e1\3\2\2\2\u05fb\u05fc\7H\2\2\u05fc"+
		"\u05fd\5\u00e8u\2\u05fd\u05fe\7\24\2\2\u05fe\u0603\7\25\2\2\u05ff\u0600"+
		"\7\24\2\2\u0600\u0602\7\25\2\2\u0601\u05ff\3\2\2\2\u0602\u0605\3\2\2\2"+
		"\u0603\u0601\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0606\3\2\2\2\u0605\u0603"+
		"\3\2\2\2\u0606\u0607\5\u00e6t\2\u0607\u061e\3\2\2\2\u0608\u0609\7H\2\2"+
		"\u0609\u060a\5\u00e8u\2\u060a\u060b\7\24\2\2\u060b\u060c\5\u00aaV\2\u060c"+
		"\u0613\7\25\2\2\u060d\u060e\7\24\2\2\u060e\u060f\5\u00aaV\2\u060f\u0610"+
		"\7\25\2\2\u0610\u0612\3\2\2\2\u0611\u060d\3\2\2\2\u0612\u0615\3\2\2\2"+
		"\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u061a\3\2\2\2\u0615\u0613"+
		"\3\2\2\2\u0616\u0617\7\24\2\2\u0617\u0619\7\25\2\2\u0618\u0616\3\2\2\2"+
		"\u0619\u061c\3\2\2\2\u061a\u0618\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061e"+
		"\3\2\2\2\u061c\u061a\3\2\2\2\u061d\u05fb\3\2\2\2\u061d\u0608\3\2\2\2\u061e"+
		"\u00e3\3\2\2\2\u061f\u0622\5\u00e6t\2\u0620\u0622\5\u00aaV\2\u0621\u061f"+
		"\3\2\2\2\u0621\u0620\3\2\2\2\u0622\u00e5\3\2\2\2\u0623\u062c\7\22\2\2"+
		"\u0624\u0629\5\u00e4s\2\u0625\u0626\7\21\2\2\u0626\u0628\5\u00e4s\2\u0627"+
		"\u0625\3\2\2\2\u0628\u062b\3\2\2\2\u0629\u0627\3\2\2\2\u0629\u062a\3\2"+
		"\2\2\u062a\u062d\3\2\2\2\u062b\u0629\3\2\2\2\u062c\u0624\3\2\2\2\u062c"+
		"\u062d\3\2\2\2\u062d\u062f\3\2\2\2\u062e\u0630\7\21\2\2\u062f\u062e\3"+
		"\2\2\2\u062f\u0630\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0632\7\23\2\2\u0632"+
		"\u00e7\3\2\2\2\u0633\u0636\5J&\2\u0634\u0636\5N(\2\u0635\u0633\3\2\2\2"+
		"\u0635\u0634\3\2\2\2\u0636\u00e9\3\2\2\2\u0637\u0638\7\6\2\2\u0638\u063a"+
		"\7H\2\2\u0639\u063b\5\u00eex\2\u063a\u0639\3\2\2\2\u063a\u063b\3\2\2\2"+
		"\u063b\u063c\3\2\2\2\u063c\u063d\5L\'\2\u063d\u063e\5\u00ecw\2\u063e\u00eb"+
		"\3\2\2\2\u063f\u0641\5\u00f0y\2\u0640\u0642\5.\30\2\u0641\u0640\3\2\2"+
		"\2\u0641\u0642\3\2\2\2\u0642\u00ed\3\2\2\2\u0643\u0644\7]\2\2\u0644\u0645"+
		"\5,\27\2\u0645\u0646\7\\\2\2\u0646\u00ef\3\2\2\2\u0647\u0649\7\26\2\2"+
		"\u0648\u064a\5\u00a8U\2\u0649\u0648\3\2\2\2\u0649\u064a\3\2\2\2\u064a"+
		"\u064b\3\2\2\2\u064b\u064c\7\27\2\2\u064c\u00f1\3\2\2\2\u064d\u064e\t"+
		"\6\2\2\u064e\u00f3\3\2\2\2\u064f\u0650\5\16\b\2\u0650\u0651\7\b\2\2\u0651"+
		"\u0652\7e\2\2\u0652\u00f5\3\2\2\2\u0653\u0654\5\16\b\2\u0654\u0655\t\7"+
		"\2\2\u0655\u0656\7e\2\2\u0656\u00f7\3\2\2\2\u0657\u0658\5\16\b\2\u0658"+
		"\u0659\7\31\2\2\u0659\u065a\7e\2\2\u065a\u00f9\3\2\2\2\u065b\u065c\5\16"+
		"\b\2\u065c\u065d\7\61\2\2\u065d\u065e\7\31\2\2\u065e\u065f\7e\2\2\u065f"+
		"\u00fb\3\2\2\2\u0660\u0667\5\16\b\2\u0661\u0668\7\b\2\2\u0662\u0668\7"+
		"A\2\2\u0663\u0665\7\61\2\2\u0664\u0663\3\2\2\2\u0664\u0665\3\2\2\2\u0665"+
		"\u0666\3\2\2\2\u0666\u0668\7\31\2\2\u0667\u0661\3\2\2\2\u0667\u0662\3"+
		"\2\2\2\u0667\u0664\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a\7e\2\2\u066a"+
		"\u00fd\3\2\2\2\u066b\u066d\5\16\b\2\u066c\u066e\5\30\r\2\u066d\u066c\3"+
		"\2\2\2\u066d\u066e\3\2\2\2\u066e\u0671\3\2\2\2\u066f\u0672\5H%\2\u0670"+
		"\u0672\7\30\2\2\u0671\u066f\3\2\2\2\u0671\u0670\3\2\2\2\u0671\u0672\3"+
		"\2\2\2\u0672\u0673\3\2\2\2\u0673\u0674\7e\2\2\u0674\u0675\7\27\2\2\u0675"+
		"\u00ff\3\2\2\2\u0676\u0677\5\16\b\2\u0677\u0678\5H%\2\u0678\u067d\7e\2"+
		"\2\u0679\u067a\7\24\2\2\u067a\u067c\7\25\2\2\u067b\u0679\3\2\2\2\u067c"+
		"\u067f\3\2\2\2\u067d\u067b\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0680\3\2"+
		"\2\2\u067f\u067d\3\2\2\2\u0680\u0681\t\b\2\2\u0681\u0101\3\2\2\2\u0682"+
		"\u0683\5\22\n\2\u0683\u0684\5H%\2\u0684\u0689\7e\2\2\u0685\u0686\7\24"+
		"\2\2\u0686\u0688\7\25\2\2\u0687\u0685\3\2\2\2\u0688\u068b\3\2\2\2\u0689"+
		"\u0687\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u068c\3\2\2\2\u068b\u0689\3\2"+
		"\2\2\u068c\u068d\t\b\2\2\u068d\u0103\3\2\2\2\u068e\u0690\7\26\2\2\u068f"+
		"\u0691\5\u0106\u0084\2\u0690\u068f\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u0692"+
		"\3\2\2\2\u0692\u0693\7\27\2\2\u0693\u0105\3\2\2\2\u0694\u0699\7e\2\2\u0695"+
		"\u0696\7\21\2\2\u0696\u0698\7e\2\2\u0697\u0695\3\2\2\2\u0698\u069b\3\2"+
		"\2\2\u0699\u0697\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u0107\3\2\2\2\u069b"+
		"\u0699\3\2\2\2\u069c\u069d\5\u010a\u0086\2\u069d\u069e\7C\2\2\u069e\u069f"+
		"\5\u010c\u0087\2\u069f\u06a2\3\2\2\2\u06a0\u06a2\5\u00aeX\2\u06a1\u069c"+
		"\3\2\2\2\u06a1\u06a0\3\2\2\2\u06a2\u0109\3\2\2\2\u06a3\u06a7\7e\2\2\u06a4"+
		"\u06a7\5V,\2\u06a5\u06a7\5\u0104\u0083\2\u06a6\u06a3\3\2\2\2\u06a6\u06a4"+
		"\3\2\2\2\u06a6\u06a5\3\2\2\2\u06a7\u010b\3\2\2\2\u06a8\u06ab\5\u00aaV"+
		"\2\u06a9\u06ab\5|?\2\u06aa\u06a8\3\2\2\2\u06aa\u06a9\3\2\2\2\u06ab\u010d"+
		"\3\2\2\2\u00bd\u010f\u0114\u011a\u011e\u0126\u012e\u0135\u0139\u013c\u0143"+
		"\u0148\u014c\u0151\u0160\u0165\u0169\u016e\u0173\u0179\u017d\u0181\u018b"+
		"\u0193\u019a\u01a2\u01a8\u01ab\u01ae\u01b7\u01bb\u01bf\u01c2\u01c8\u01cd"+
		"\u01d3\u01d7\u01e0\u01e7\u01f0\u01f7\u01fb\u0202\u0206\u020a\u0212\u0217"+
		"\u021b\u021f\u0225\u022b\u0230\u023c\u0246\u024b\u0253\u0257\u025b\u0263"+
		"\u0268\u026c\u0273\u0276\u027a\u0282\u0287\u028b\u0294\u029e\u02a6\u02a9"+
		"\u02b0\u02b5\u02bf\u02c6\u02cc\u02ce\u02d5\u02da\u02e6\u02f0\u02f5\u02fe"+
		"\u0307\u0310\u0316\u031d\u0323\u0328\u0337\u0340\u034a\u0352\u0355\u0358"+
		"\u0366\u0372\u037b\u0383\u038b\u0397\u039f\u03a8\u03c2\u03cb\u03d0\u03da"+
		"\u03e1\u03e8\u03f1\u040c\u0412\u0416\u041b\u0424\u0428\u0433\u0442\u044a"+
		"\u044f\u045e\u0462\u0466\u046d\u0478\u047f\u04a0\u04a8\u04af\u04b7\u04bf"+
		"\u04c7\u04cf\u04d7\u04df\u04e5\u04ed\u04fa\u0502\u050f\u0517\u051e\u0526"+
		"\u052f\u053e\u0545\u0549\u054b\u0557\u0561\u0565\u056d\u0571\u0583\u058e"+
		"\u0592\u0596\u059e\u05ae\u05b4\u05bf\u05d5\u05da\u05ed\u05f9\u0603\u0613"+
		"\u061a\u061d\u0621\u0629\u062c\u062f\u0635\u063a\u0641\u0649\u0664\u0667"+
		"\u066d\u0671\u067d\u0689\u0690\u0699\u06a1\u06a6\u06aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}