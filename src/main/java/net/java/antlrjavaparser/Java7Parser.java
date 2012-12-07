// $ANTLR ANTLRVersion> Java7Parser.java generatedTimestamp>

package net.java.antlrjavaparser;

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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENUM=1, ASSERT=2, SEMI=3, PACKAGE=4, IMPORT=5, DOT=6, STAR=7, CLASS=8, 
		IMPLEMENTS=9, PUBLIC=10, PROTECTED=11, PRIVATE=12, ABSTRACT=13, STATIC=14, 
		FINAL=15, STRICTFP=16, COMMA=17, LBRACE=18, RBRACE=19, LBRACKET=20, RBRACKET=21, 
		LPAREN=22, RPAREN=23, VOID=24, INTERFACE=25, THROW=26, THROWS=27, EQ=28, 
		NATIVE=29, SYNCHRONIZED=30, TRANSIENT=31, VOLATILE=32, BOOLEAN=33, CHAR=34, 
		BYTE=35, SHORT=36, INT=37, LONG=38, FLOAT=39, DOUBLE=40, QUES=41, EXTENDS=42, 
		ELLIPSIS=43, THIS=44, SUPER=45, NULL=46, TRUE=47, FALSE=48, AT=49, DEFAULT=50, 
		COLON=51, IF=52, ELSE=53, FOR=54, WHILE=55, DO=56, TRY=57, FINALLY=58, 
		SWITCH=59, RETURN=60, BREAK=61, CONTINUE=62, CATCH=63, CASE=64, PLUSPLUS=65, 
		SUBSUB=66, TILDE=67, BANG=68, NEW=69, SLASH=70, PERCENT=71, PLUS=72, SUB=73, 
		EQEQ=74, BANGEQ=75, AMP=76, CARET=77, BAR=78, AMPAMP=79, BARBAR=80, CARETEQ=81, 
		PLUSEQ=82, SUBEQ=83, STAREQ=84, SLASHEQ=85, AMPEQ=86, BAREQ=87, PERCENTEQ=88, 
		LTEQ=89, GTEQ=90, GTGTEQ=91, GTGTGTEQ=92, LTLTEQ=93, GTGTGT=94, GTGT=95, 
		LTLT=96, GT=97, LT=98, INSTANCEOF=99, DecimalIntegerLiteral=100, HexIntegerLiteral=101, 
		OctalIntegerLiteral=102, BinaryIntegerLiteral=103, FloatingPointLiteral=104, 
		CharacterLiteral=105, StringLiteral=106, NullLiteral=107, Identifier=108, 
		COMMENT=109, WS=110, LINE_COMMENT=111;
	public static final String[] tokenNames = {
		"<INVALID>", "'enum'", "'assert'", "';'", "'package'", "'import'", "'.'", 
		"'*'", "'class'", "'implements'", "'public'", "'protected'", "'private'", 
		"'abstract'", "'static'", "'final'", "'strictfp'", "','", "'{'", "'}'", 
		"'['", "']'", "'('", "')'", "'void'", "'interface'", "'throw'", "'throws'", 
		"'='", "'native'", "'synchronized'", "'transient'", "'volatile'", "'boolean'", 
		"'char'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", 
		"'?'", "'extends'", "'...'", "'this'", "'super'", "'null'", "'true'", 
		"'false'", "'@'", "'default'", "':'", "'if'", "'else'", "'for'", "'while'", 
		"'do'", "'try'", "'finally'", "'switch'", "'return'", "'break'", "'continue'", 
		"'catch'", "'case'", "'++'", "'--'", "'~'", "'!'", "'new'", "'/'", "'%'", 
		"'+'", "'-'", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'^='", 
		"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'%='", "'<='", "'>='", 
		"'>>='", "'>>>='", "'<<='", "'>>>'", "'>>'", "'<<'", "'>'", "'<'", "'instanceof'", 
		"DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", "BinaryIntegerLiteral", 
		"FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"Identifier", "COMMENT", "WS", "LINE_COMMENT"
	};
	public static final int
		RULE_qualifiedIdentifier = 0, RULE_qualifiedIdentifierList = 1, RULE_compilationUnit = 2, 
		RULE_importDeclaration = 3, RULE_typeDeclaration = 4, RULE_classOrInterfaceDeclaration = 5, 
		RULE_classDeclaration = 6, RULE_interfaceDeclaration = 7, RULE_normalClassDeclaration = 8, 
		RULE_enumDeclaration = 9, RULE_normalInterfaceDeclaration = 10, RULE_annotationTypeDeclaration = 11, 
		RULE_type = 12, RULE_basicType = 13, RULE_referenceType = 14, RULE_typeArguments = 15, 
		RULE_typeArgument = 16, RULE_nonWildcardTypeArguments = 17, RULE_typeList = 18, 
		RULE_typeArgumentsOrDiamond = 19, RULE_nonWildcardTypeArgumentsOrDiamond = 20, 
		RULE_typeParameters = 21, RULE_typeParameter = 22, RULE_bound = 23, RULE_modifier = 24, 
		RULE_annotations = 25, RULE_annotation = 26, RULE_annotationElement = 27, 
		RULE_elementValuePairs = 28, RULE_elementValuePair = 29, RULE_elementValue = 30, 
		RULE_elementValueArrayInitializer = 31, RULE_elementValues = 32, RULE_classBody = 33, 
		RULE_classBodyDeclaration = 34, RULE_memberDecl = 35, RULE_methodOrFieldDecl = 36, 
		RULE_methodOrFieldRest = 37, RULE_fieldDeclaratorsRest = 38, RULE_methodDeclaratorRest = 39, 
		RULE_voidMethodDeclaratorRest = 40, RULE_constructorDeclaratorRest = 41, 
		RULE_genericMethodOrConstructorDecl = 42, RULE_genericMethodOrConstructorRest = 43, 
		RULE_interfaceBody = 44, RULE_interfaceBodyDeclaration = 45, RULE_interfaceMemberDecl = 46, 
		RULE_interfaceMethodOrFieldDecl = 47, RULE_interfaceMethodOrFieldRest = 48, 
		RULE_constantDeclaratorsRest = 49, RULE_constantDeclaratorRest = 50, RULE_constantDeclarator = 51, 
		RULE_interfaceMethodDeclaratorRest = 52, RULE_voidInterfaceMethodDeclaratorRest = 53, 
		RULE_interfaceGenericMethodDecl = 54, RULE_formalParameters = 55, RULE_formalParameterDecls = 56, 
		RULE_variableModifier = 57, RULE_formalParameterDeclsRest = 58, RULE_variableDeclaratorId = 59, 
		RULE_variableDeclarators = 60, RULE_variableDeclarator = 61, RULE_variableDeclaratorRest = 62, 
		RULE_variableInitializer = 63, RULE_arrayInitializer = 64, RULE_block = 65, 
		RULE_blockStatement = 66, RULE_statementFoundInBlock = 67, RULE_localVariableDeclarationStatement = 68, 
		RULE_statement = 69, RULE_statementExpression = 70, RULE_catches = 71, 
		RULE_catchClause = 72, RULE_catchFormalParameter = 73, RULE_variableModifiers = 74, 
		RULE_catchType = 75, RULE_classType = 76, RULE_typeName = 77, RULE_finallyRule = 78, 
		RULE_resourceSpecification = 79, RULE_resources = 80, RULE_resource = 81, 
		RULE_switchBlockStatementGroups = 82, RULE_switchBlockStatementGroup = 83, 
		RULE_switchLabels = 84, RULE_switchLabel = 85, RULE_enumConstantName = 86, 
		RULE_forControl = 87, RULE_forVarControl = 88, RULE_forVarControlRest = 89, 
		RULE_forVariableDeclaratorsRest = 90, RULE_forInit = 91, RULE_forUpdate = 92, 
		RULE_expression = 93, RULE_expressionList = 94, RULE_assignmentOperator = 95, 
		RULE_primary = 96, RULE_parExpression = 97, RULE_arguments = 98, RULE_superSuffix = 99, 
		RULE_explicitGenericInvocationSuffix = 100, RULE_creator = 101, RULE_createdName = 102, 
		RULE_classCreatorRest = 103, RULE_arrayCreatorRest = 104, RULE_identifierSuffix = 105, 
		RULE_explicitGenericInvocation = 106, RULE_innerCreator = 107, RULE_selector = 108, 
		RULE_enumBody = 109, RULE_enumConstants = 110, RULE_enumConstant = 111, 
		RULE_enumBodyDeclarations = 112, RULE_annotationTypeBody = 113, RULE_annotationTypeElementDeclarations = 114, 
		RULE_annotationTypeElementDeclaration = 115, RULE_annotationTypeElementRest = 116, 
		RULE_annotationMethodOrConstantRest = 117, RULE_annotationMethodRest = 118, 
		RULE_literal = 119, RULE_integerLiteral = 120, RULE_booleanLiteral = 121;
	public static final String[] ruleNames = {
		"qualifiedIdentifier", "qualifiedIdentifierList", "compilationUnit", "importDeclaration", 
		"typeDeclaration", "classOrInterfaceDeclaration", "classDeclaration", 
		"interfaceDeclaration", "normalClassDeclaration", "enumDeclaration", "normalInterfaceDeclaration", 
		"annotationTypeDeclaration", "type", "basicType", "referenceType", "typeArguments", 
		"typeArgument", "nonWildcardTypeArguments", "typeList", "typeArgumentsOrDiamond", 
		"nonWildcardTypeArgumentsOrDiamond", "typeParameters", "typeParameter", 
		"bound", "modifier", "annotations", "annotation", "annotationElement", 
		"elementValuePairs", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"elementValues", "classBody", "classBodyDeclaration", "memberDecl", "methodOrFieldDecl", 
		"methodOrFieldRest", "fieldDeclaratorsRest", "methodDeclaratorRest", "voidMethodDeclaratorRest", 
		"constructorDeclaratorRest", "genericMethodOrConstructorDecl", "genericMethodOrConstructorRest", 
		"interfaceBody", "interfaceBodyDeclaration", "interfaceMemberDecl", "interfaceMethodOrFieldDecl", 
		"interfaceMethodOrFieldRest", "constantDeclaratorsRest", "constantDeclaratorRest", 
		"constantDeclarator", "interfaceMethodDeclaratorRest", "voidInterfaceMethodDeclaratorRest", 
		"interfaceGenericMethodDecl", "formalParameters", "formalParameterDecls", 
		"variableModifier", "formalParameterDeclsRest", "variableDeclaratorId", 
		"variableDeclarators", "variableDeclarator", "variableDeclaratorRest", 
		"variableInitializer", "arrayInitializer", "block", "blockStatement", 
		"statementFoundInBlock", "localVariableDeclarationStatement", "statement", 
		"statementExpression", "catches", "catchClause", "catchFormalParameter", 
		"variableModifiers", "catchType", "classType", "typeName", "finallyRule", 
		"resourceSpecification", "resources", "resource", "switchBlockStatementGroups", 
		"switchBlockStatementGroup", "switchLabels", "switchLabel", "enumConstantName", 
		"forControl", "forVarControl", "forVarControlRest", "forVariableDeclaratorsRest", 
		"forInit", "forUpdate", "expression", "expressionList", "assignmentOperator", 
		"primary", "parExpression", "arguments", "superSuffix", "explicitGenericInvocationSuffix", 
		"creator", "createdName", "classCreatorRest", "arrayCreatorRest", "identifierSuffix", 
		"explicitGenericInvocation", "innerCreator", "selector", "enumBody", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "annotationTypeBody", "annotationTypeElementDeclarations", 
		"annotationTypeElementDeclaration", "annotationTypeElementRest", "annotationMethodOrConstantRest", 
		"annotationMethodRest", "literal", "integerLiteral", "booleanLiteral"
	};

	@Override
	public String getGrammarFileName() { return "Java7.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java7Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QualifiedIdentifierContext extends ParserRuleContext {
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public QualifiedIdentifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterQualifiedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitQualifiedIdentifier(this);
		}
	}

	public final QualifiedIdentifierContext qualifiedIdentifier() throws RecognitionException {
		QualifiedIdentifierContext _localctx = new QualifiedIdentifierContext(_ctx, 0);
		enterRule(_localctx, RULE_qualifiedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(Identifier);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(245); match(DOT);
				setState(246); match(Identifier);
				}
				}
				setState(251);
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

	public static class QualifiedIdentifierListContext extends ParserRuleContext {
		public QualifiedIdentifierContext qualifiedIdentifier(int i) {
			return getRuleContext(QualifiedIdentifierContext.class,i);
		}
		public List<QualifiedIdentifierContext> qualifiedIdentifier() {
			return getRuleContexts(QualifiedIdentifierContext.class);
		}
		public QualifiedIdentifierListContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterQualifiedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitQualifiedIdentifierList(this);
		}
	}

	public final QualifiedIdentifierListContext qualifiedIdentifierList() throws RecognitionException {
		QualifiedIdentifierListContext _localctx = new QualifiedIdentifierListContext(_ctx, 2);
		enterRule(_localctx, RULE_qualifiedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); qualifiedIdentifier();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(253); match(COMMA);
				setState(254); qualifiedIdentifier();
				}
				}
				setState(259);
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, 4);
		enterRule(_localctx, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(261);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(260); annotations();
					}
				}

				setState(263); match(PACKAGE);
				setState(264); qualifiedIdentifier();
				setState(265); match(SEMI);
				}
				break;
			}
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(269); importDeclaration();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENUM || _la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==INTERFACE || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==AT) {
				{
				{
				setState(275); typeDeclaration();
				}
				}
				setState(280);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public TerminalNode STATIC() { return getToken(Java7Parser.STATIC, 0); }
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public ImportDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, 6);
		enterRule(_localctx, RULE_importDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(IMPORT);
			setState(283);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(282); match(STATIC);
				}
			}

			setState(285); match(Identifier);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(286); match(DOT);
					setState(287); match(Identifier);
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(295);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(293); match(DOT);
				setState(294); match(STAR);
				}
			}

			setState(297); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		public TypeDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, 8);
		enterRule(_localctx, RULE_typeDeclaration);
		try {
			setState(301);
			switch (_input.LA(1)) {
			case ENUM:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(299); classOrInterfaceDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(300); match(SEMI);
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
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassOrInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassOrInterfaceDeclaration(this);
		}
	}

	public final ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() throws RecognitionException {
		ClassOrInterfaceDeclarationContext _localctx = new ClassOrInterfaceDeclarationContext(_ctx, 10);
		enterRule(_localctx, RULE_classOrInterfaceDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(303); modifier();
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(311);
			switch (_input.LA(1)) {
			case ENUM:
			case CLASS:
				{
				setState(309); classDeclaration();
				}
				break;
			case INTERFACE:
			case AT:
				{
				setState(310); interfaceDeclaration();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, 12);
		enterRule(_localctx, RULE_classDeclaration);
		try {
			setState(315);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(313); normalClassDeclaration();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(314); enumDeclaration();
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, 14);
		enterRule(_localctx, RULE_interfaceDeclaration);
		try {
			setState(319);
			switch (_input.LA(1)) {
			case INTERFACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(317); normalInterfaceDeclaration();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(318); annotationTypeDeclaration();
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

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(Java7Parser.EXTENDS, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public NormalClassDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitNormalClassDeclaration(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, 16);
		enterRule(_localctx, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); match(CLASS);
			setState(322); match(Identifier);
			setState(324);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(323); typeParameters();
				}
			}

			setState(328);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(326); match(EXTENDS);
				setState(327); type();
				}
			}

			setState(332);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(330); match(IMPLEMENTS);
				setState(331); typeList();
				}
			}

			setState(334); classBody();
			}
		}
		catch (RecognitionException re) {
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
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public EnumDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, 18);
		enterRule(_localctx, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); match(ENUM);
			setState(337); match(Identifier);
			setState(340);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(338); match(IMPLEMENTS);
				setState(339); typeList();
				}
			}

			setState(342); enumBody();
			}
		}
		catch (RecognitionException re) {
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
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(Java7Parser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitNormalInterfaceDeclaration(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, 20);
		enterRule(_localctx, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344); match(INTERFACE);
			setState(345); match(Identifier);
			setState(347);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(346); typeParameters();
				}
			}

			setState(351);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(349); match(EXTENDS);
				setState(350); typeList();
				}
			}

			setState(353); interfaceBody();
			}
		}
		catch (RecognitionException re) {
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
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, 22);
		enterRule(_localctx, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355); match(AT);
			setState(356); match(INTERFACE);
			setState(357); match(Identifier);
			setState(358); annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
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
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, 24);
		enterRule(_localctx, RULE_type);
		try {
			int _alt;
			setState(376);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(360); basicType();
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(361); match(LBRACKET);
						setState(362); match(RBRACKET);
						}
						} 
					}
					setState(367);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(368); referenceType();
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(369); match(LBRACKET);
						setState(370); match(RBRACKET);
						}
						} 
					}
					setState(375);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class BasicTypeContext extends ParserRuleContext {
		public BasicTypeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBasicType(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, 26);
		enterRule(_localctx, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE) ) {
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public ReferenceTypeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitReferenceType(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, 28);
		enterRule(_localctx, RULE_referenceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380); match(Identifier);
			setState(382);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(381); typeArguments();
				}
				break;
			}
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(384); match(DOT);
					setState(385); match(Identifier);
					setState(387);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(386); typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, 30);
		enterRule(_localctx, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394); match(LT);
			setState(395); typeArgument();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(396); match(COMMA);
				setState(397); typeArgument();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403); match(GT);
			}
		}
		catch (RecognitionException re) {
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
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public TerminalNode EXTENDS() { return getToken(Java7Parser.EXTENDS, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, 32);
		enterRule(_localctx, RULE_typeArgument);
		int _la;
		try {
			setState(411);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(405); referenceType();
				}
				break;
			case QUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(406); match(QUES);
				setState(409);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(407);
					_input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(408); referenceType();
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, 34);
		enterRule(_localctx, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413); match(LT);
			setState(414); typeList();
			setState(415); match(GT);
			}
		}
		catch (RecognitionException re) {
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
		public List<ReferenceTypeContext> referenceType() {
			return getRuleContexts(ReferenceTypeContext.class);
		}
		public ReferenceTypeContext referenceType(int i) {
			return getRuleContext(ReferenceTypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, 36);
		enterRule(_localctx, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417); referenceType();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(418); match(COMMA);
				setState(419); referenceType();
				}
				}
				setState(424);
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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, 38);
		enterRule(_localctx, RULE_typeArgumentsOrDiamond);
		try {
			setState(428);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425); match(LT);
				setState(426); match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427); typeArguments();
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

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, 40);
		enterRule(_localctx, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(433);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430); match(LT);
				setState(431); match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432); nonWildcardTypeArguments();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, 42);
		enterRule(_localctx, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); match(LT);
			setState(436); typeParameter();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(437); match(COMMA);
				setState(438); typeParameter();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444); match(GT);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode EXTENDS() { return getToken(Java7Parser.EXTENDS, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public BoundContext bound() {
			return getRuleContext(BoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, 44);
		enterRule(_localctx, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446); match(Identifier);
			setState(449);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(447); match(EXTENDS);
				setState(448); bound();
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

	public static class BoundContext extends ParserRuleContext {
		public List<ReferenceTypeContext> referenceType() {
			return getRuleContexts(ReferenceTypeContext.class);
		}
		public TerminalNode AMP(int i) {
			return getToken(Java7Parser.AMP, i);
		}
		public List<TerminalNode> AMP() { return getTokens(Java7Parser.AMP); }
		public ReferenceTypeContext referenceType(int i) {
			return getRuleContext(ReferenceTypeContext.class,i);
		}
		public BoundContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBound(this);
		}
	}

	public final BoundContext bound() throws RecognitionException {
		BoundContext _localctx = new BoundContext(_ctx, 46);
		enterRule(_localctx, RULE_bound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451); referenceType();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(452); match(AMP);
				setState(453); referenceType();
				}
				}
				setState(458);
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

	public static class ModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(Java7Parser.STATIC, 0); }
		public ModifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, 48);
		enterRule(_localctx, RULE_modifier);
		try {
			setState(471);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(459); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(460); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(461); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(462); match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(463); match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(464); match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(465); match(FINAL);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 8);
				{
				setState(466); match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 9);
				{
				setState(467); match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(468); match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 11);
				{
				setState(469); match(VOLATILE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 12);
				{
				setState(470); match(STRICTFP);
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

	public static class AnnotationsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotations(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, 50);
		enterRule(_localctx, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473); annotation();
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(474); annotation();
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

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationElementContext annotationElement() {
			return getRuleContext(AnnotationElementContext.class,0);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, 52);
		enterRule(_localctx, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480); match(AT);
			setState(481); qualifiedIdentifier();
			setState(487);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(482); match(LPAREN);
				setState(484);
				_la = _input.LA(1);
				if (_la==LBRACE || _la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==TRUE || _la==FALSE || _la==AT || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==LT || _la==DecimalIntegerLiteral || _la==HexIntegerLiteral || _la==OctalIntegerLiteral || _la==BinaryIntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==NullLiteral || _la==Identifier) {
					{
					setState(483); annotationElement();
					}
				}

				setState(486); match(RPAREN);
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

	public static class AnnotationElementContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public AnnotationElementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_annotationElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationElement(this);
		}
	}

	public final AnnotationElementContext annotationElement() throws RecognitionException {
		AnnotationElementContext _localctx = new AnnotationElementContext(_ctx, 54);
		enterRule(_localctx, RULE_annotationElement);
		try {
			setState(491);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489); elementValuePairs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490); elementValue();
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, 56);
		enterRule(_localctx, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493); elementValuePair();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(494); match(COMMA);
				setState(495); elementValuePair();
				}
				}
				setState(500);
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
		public ElementValuePairContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, 58);
		enterRule(_localctx, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501); match(Identifier);
			setState(502); match(EQ);
			setState(503); elementValue();
			}
		}
		catch (RecognitionException re) {
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, 60);
		enterRule(_localctx, RULE_elementValue);
		try {
			setState(508);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(505); annotation();
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
			case TRUE:
			case FALSE:
			case PLUSPLUS:
			case SUBSUB:
			case TILDE:
			case BANG:
			case NEW:
			case PLUS:
			case SUB:
			case LT:
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case BinaryIntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(506); expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(507); elementValueArrayInitializer();
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
		public ElementValuesContext elementValues() {
			return getRuleContext(ElementValuesContext.class,0);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, 62);
		enterRule(_localctx, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510); match(LBRACE);
			setState(512);
			_la = _input.LA(1);
			if (_la==LBRACE || _la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==TRUE || _la==FALSE || _la==AT || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==LT || _la==DecimalIntegerLiteral || _la==HexIntegerLiteral || _la==OctalIntegerLiteral || _la==BinaryIntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==NullLiteral || _la==Identifier) {
				{
				setState(511); elementValues();
				}
			}

			setState(515);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(514); match(COMMA);
				}
			}

			setState(517); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuesContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValuesContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_elementValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterElementValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitElementValues(this);
		}
	}

	public final ElementValuesContext elementValues() throws RecognitionException {
		ElementValuesContext _localctx = new ElementValuesContext(_ctx, 64);
		enterRule(_localctx, RULE_elementValues);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(519); elementValue();
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(520); match(COMMA);
					setState(521); elementValue();
					}
					} 
				}
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, 66);
		enterRule(_localctx, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527); match(LBRACE);
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENUM || _la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==LBRACE || _la==VOID || _la==INTERFACE || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==AT || _la==LT || _la==Identifier) {
				{
				{
				setState(528); classBodyDeclaration();
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(534); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public MemberDeclContext memberDecl() {
			return getRuleContext(MemberDeclContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(Java7Parser.STATIC, 0); }
		public ClassBodyDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, 68);
		enterRule(_localctx, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(548);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(536); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(537); modifier();
						}
						} 
					}
					setState(542);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(543); memberDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(545);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(544); match(STATIC);
					}
				}

				setState(547); block();
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
		public MethodOrFieldDeclContext methodOrFieldDecl() {
			return getRuleContext(MethodOrFieldDeclContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public GenericMethodOrConstructorDeclContext genericMethodOrConstructorDecl() {
			return getRuleContext(GenericMethodOrConstructorDeclContext.class,0);
		}
		public ConstructorDeclaratorRestContext constructorDeclaratorRest() {
			return getRuleContext(ConstructorDeclaratorRestContext.class,0);
		}
		public VoidMethodDeclaratorRestContext voidMethodDeclaratorRest() {
			return getRuleContext(VoidMethodDeclaratorRestContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public MemberDeclContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_memberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitMemberDecl(this);
		}
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, 70);
		enterRule(_localctx, RULE_memberDecl);
		try {
			setState(559);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550); methodOrFieldDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551); match(VOID);
				setState(552); match(Identifier);
				setState(553); voidMethodDeclaratorRest();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(554); match(Identifier);
				setState(555); constructorDeclaratorRest();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(556); genericMethodOrConstructorDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(557); classDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(558); interfaceDeclaration();
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

	public static class MethodOrFieldDeclContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodOrFieldRestContext methodOrFieldRest() {
			return getRuleContext(MethodOrFieldRestContext.class,0);
		}
		public MethodOrFieldDeclContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_methodOrFieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterMethodOrFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitMethodOrFieldDecl(this);
		}
	}

	public final MethodOrFieldDeclContext methodOrFieldDecl() throws RecognitionException {
		MethodOrFieldDeclContext _localctx = new MethodOrFieldDeclContext(_ctx, 72);
		enterRule(_localctx, RULE_methodOrFieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561); type();
			setState(562); match(Identifier);
			setState(563); methodOrFieldRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodOrFieldRestContext extends ParserRuleContext {
		public FieldDeclaratorsRestContext fieldDeclaratorsRest() {
			return getRuleContext(FieldDeclaratorsRestContext.class,0);
		}
		public MethodDeclaratorRestContext methodDeclaratorRest() {
			return getRuleContext(MethodDeclaratorRestContext.class,0);
		}
		public MethodOrFieldRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_methodOrFieldRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterMethodOrFieldRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitMethodOrFieldRest(this);
		}
	}

	public final MethodOrFieldRestContext methodOrFieldRest() throws RecognitionException {
		MethodOrFieldRestContext _localctx = new MethodOrFieldRestContext(_ctx, 74);
		enterRule(_localctx, RULE_methodOrFieldRest);
		try {
			setState(569);
			switch (_input.LA(1)) {
			case SEMI:
			case COMMA:
			case LBRACKET:
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(565); fieldDeclaratorsRest();
				setState(566); match(SEMI);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(568); methodDeclaratorRest();
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

	public static class FieldDeclaratorsRestContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorRestContext variableDeclaratorRest() {
			return getRuleContext(VariableDeclaratorRestContext.class,0);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public FieldDeclaratorsRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaratorsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFieldDeclaratorsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFieldDeclaratorsRest(this);
		}
	}

	public final FieldDeclaratorsRestContext fieldDeclaratorsRest() throws RecognitionException {
		FieldDeclaratorsRestContext _localctx = new FieldDeclaratorsRestContext(_ctx, 76);
		enterRule(_localctx, RULE_fieldDeclaratorsRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571); variableDeclaratorRest();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(572); match(COMMA);
				setState(573); variableDeclarator();
				}
				}
				setState(578);
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

	public static class MethodDeclaratorRestContext extends ParserRuleContext {
		public QualifiedIdentifierListContext qualifiedIdentifierList() {
			return getRuleContext(QualifiedIdentifierListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodDeclaratorRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitMethodDeclaratorRest(this);
		}
	}

	public final MethodDeclaratorRestContext methodDeclaratorRest() throws RecognitionException {
		MethodDeclaratorRestContext _localctx = new MethodDeclaratorRestContext(_ctx, 78);
		enterRule(_localctx, RULE_methodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579); formalParameters();
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(580); match(LBRACKET);
				setState(581); match(RBRACKET);
				}
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(589);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(587); match(THROWS);
				setState(588); qualifiedIdentifierList();
				}
			}

			setState(593);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(591); block();
				}
				break;
			case SEMI:
				{
				setState(592); match(SEMI);
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

	public static class VoidMethodDeclaratorRestContext extends ParserRuleContext {
		public QualifiedIdentifierListContext qualifiedIdentifierList() {
			return getRuleContext(QualifiedIdentifierListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VoidMethodDeclaratorRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_voidMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVoidMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVoidMethodDeclaratorRest(this);
		}
	}

	public final VoidMethodDeclaratorRestContext voidMethodDeclaratorRest() throws RecognitionException {
		VoidMethodDeclaratorRestContext _localctx = new VoidMethodDeclaratorRestContext(_ctx, 80);
		enterRule(_localctx, RULE_voidMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); formalParameters();
			setState(598);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(596); match(THROWS);
				setState(597); qualifiedIdentifierList();
				}
			}

			setState(602);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(600); block();
				}
				break;
			case SEMI:
				{
				setState(601); match(SEMI);
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

	public static class ConstructorDeclaratorRestContext extends ParserRuleContext {
		public QualifiedIdentifierListContext qualifiedIdentifierList() {
			return getRuleContext(QualifiedIdentifierListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDeclaratorRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstructorDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstructorDeclaratorRest(this);
		}
	}

	public final ConstructorDeclaratorRestContext constructorDeclaratorRest() throws RecognitionException {
		ConstructorDeclaratorRestContext _localctx = new ConstructorDeclaratorRestContext(_ctx, 82);
		enterRule(_localctx, RULE_constructorDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604); formalParameters();
			setState(607);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(605); match(THROWS);
				setState(606); qualifiedIdentifierList();
				}
			}

			setState(609); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodOrConstructorDeclContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GenericMethodOrConstructorRestContext genericMethodOrConstructorRest() {
			return getRuleContext(GenericMethodOrConstructorRestContext.class,0);
		}
		public GenericMethodOrConstructorDeclContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodOrConstructorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterGenericMethodOrConstructorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitGenericMethodOrConstructorDecl(this);
		}
	}

	public final GenericMethodOrConstructorDeclContext genericMethodOrConstructorDecl() throws RecognitionException {
		GenericMethodOrConstructorDeclContext _localctx = new GenericMethodOrConstructorDeclContext(_ctx, 84);
		enterRule(_localctx, RULE_genericMethodOrConstructorDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611); typeParameters();
			setState(612); genericMethodOrConstructorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodOrConstructorRestContext extends ParserRuleContext {
		public ConstructorDeclaratorRestContext constructorDeclaratorRest() {
			return getRuleContext(ConstructorDeclaratorRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public MethodDeclaratorRestContext methodDeclaratorRest() {
			return getRuleContext(MethodDeclaratorRestContext.class,0);
		}
		public GenericMethodOrConstructorRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodOrConstructorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterGenericMethodOrConstructorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitGenericMethodOrConstructorRest(this);
		}
	}

	public final GenericMethodOrConstructorRestContext genericMethodOrConstructorRest() throws RecognitionException {
		GenericMethodOrConstructorRestContext _localctx = new GenericMethodOrConstructorRestContext(_ctx, 86);
		enterRule(_localctx, RULE_genericMethodOrConstructorRest);
		try {
			setState(622);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
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
					setState(614); type();
					}
					break;
				case VOID:
					{
					setState(615); match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(618); match(Identifier);
				setState(619); methodDeclaratorRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(620); match(Identifier);
				setState(621); constructorDeclaratorRest();
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, 88);
		enterRule(_localctx, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624); match(LBRACE);
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENUM || _la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==VOID || _la==INTERFACE || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==AT || _la==LT || _la==Identifier) {
				{
				{
				setState(625); interfaceBodyDeclaration();
				}
				}
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(631); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceMemberDeclContext interfaceMemberDecl() {
			return getRuleContext(InterfaceMemberDeclContext.class,0);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, 90);
		enterRule(_localctx, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(641);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(633); match(SEMI);
				}
				break;
			case ENUM:
			case CLASS:
			case PUBLIC:
			case PROTECTED:
			case PRIVATE:
			case ABSTRACT:
			case STATIC:
			case FINAL:
			case STRICTFP:
			case VOID:
			case INTERFACE:
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case BOOLEAN:
			case CHAR:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case AT:
			case LT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(634); modifier();
						}
						} 
					}
					setState(639);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(640); interfaceMemberDecl();
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

	public static class InterfaceMemberDeclContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() {
			return getRuleContext(InterfaceGenericMethodDeclContext.class,0);
		}
		public InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() {
			return getRuleContext(InterfaceMethodOrFieldDeclContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() {
			return getRuleContext(VoidInterfaceMethodDeclaratorRestContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public InterfaceMemberDeclContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceMemberDecl(this);
		}
	}

	public final InterfaceMemberDeclContext interfaceMemberDecl() throws RecognitionException {
		InterfaceMemberDeclContext _localctx = new InterfaceMemberDeclContext(_ctx, 92);
		enterRule(_localctx, RULE_interfaceMemberDecl);
		try {
			setState(650);
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
				setState(643); interfaceMethodOrFieldDecl();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(644); match(VOID);
				setState(645); match(Identifier);
				setState(646); voidInterfaceMethodDeclaratorRest();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 3);
				{
				setState(647); interfaceGenericMethodDecl();
				}
				break;
			case ENUM:
			case CLASS:
				enterOuterAlt(_localctx, 4);
				{
				setState(648); classDeclaration();
				}
				break;
			case INTERFACE:
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(649); interfaceDeclaration();
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

	public static class InterfaceMethodOrFieldDeclContext extends ParserRuleContext {
		public InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() {
			return getRuleContext(InterfaceMethodOrFieldRestContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InterfaceMethodOrFieldDeclContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceMethodOrFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceMethodOrFieldDecl(this);
		}
	}

	public final InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() throws RecognitionException {
		InterfaceMethodOrFieldDeclContext _localctx = new InterfaceMethodOrFieldDeclContext(_ctx, 94);
		enterRule(_localctx, RULE_interfaceMethodOrFieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652); type();
			setState(653); match(Identifier);
			setState(654); interfaceMethodOrFieldRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodOrFieldRestContext extends ParserRuleContext {
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public ConstantDeclaratorsRestContext constantDeclaratorsRest() {
			return getRuleContext(ConstantDeclaratorsRestContext.class,0);
		}
		public InterfaceMethodOrFieldRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceMethodOrFieldRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceMethodOrFieldRest(this);
		}
	}

	public final InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() throws RecognitionException {
		InterfaceMethodOrFieldRestContext _localctx = new InterfaceMethodOrFieldRestContext(_ctx, 96);
		enterRule(_localctx, RULE_interfaceMethodOrFieldRest);
		try {
			setState(660);
			switch (_input.LA(1)) {
			case LBRACKET:
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(656); constantDeclaratorsRest();
				setState(657); match(SEMI);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(659); interfaceMethodDeclaratorRest();
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

	public static class ConstantDeclaratorsRestContext extends ParserRuleContext {
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public ConstantDeclaratorsRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstantDeclaratorsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstantDeclaratorsRest(this);
		}
	}

	public final ConstantDeclaratorsRestContext constantDeclaratorsRest() throws RecognitionException {
		ConstantDeclaratorsRestContext _localctx = new ConstantDeclaratorsRestContext(_ctx, 98);
		enterRule(_localctx, RULE_constantDeclaratorsRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662); constantDeclaratorRest();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(663); match(COMMA);
				setState(664); constantDeclarator();
				}
				}
				setState(669);
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

	public static class ConstantDeclaratorRestContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstantDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstantDeclaratorRest(this);
		}
	}

	public final ConstantDeclaratorRestContext constantDeclaratorRest() throws RecognitionException {
		ConstantDeclaratorRestContext _localctx = new ConstantDeclaratorRestContext(_ctx, 100);
		enterRule(_localctx, RULE_constantDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(670); match(LBRACKET);
				setState(671); match(RBRACKET);
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(677); match(EQ);
			setState(678); variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ConstantDeclaratorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, 102);
		enterRule(_localctx, RULE_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680); match(Identifier);
			setState(681); constantDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public QualifiedIdentifierListContext qualifiedIdentifierList() {
			return getRuleContext(QualifiedIdentifierListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public InterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceMethodDeclaratorRest(this);
		}
	}

	public final InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() throws RecognitionException {
		InterfaceMethodDeclaratorRestContext _localctx = new InterfaceMethodDeclaratorRestContext(_ctx, 104);
		enterRule(_localctx, RULE_interfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683); formalParameters();
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(684); match(LBRACKET);
				setState(685); match(RBRACKET);
				}
				}
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(693);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(691); match(THROWS);
				setState(692); qualifiedIdentifierList();
				}
			}

			setState(695); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoidInterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public QualifiedIdentifierListContext qualifiedIdentifierList() {
			return getRuleContext(QualifiedIdentifierListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public VoidInterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_voidInterfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVoidInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVoidInterfaceMethodDeclaratorRest(this);
		}
	}

	public final VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() throws RecognitionException {
		VoidInterfaceMethodDeclaratorRestContext _localctx = new VoidInterfaceMethodDeclaratorRestContext(_ctx, 106);
		enterRule(_localctx, RULE_voidInterfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697); formalParameters();
			setState(700);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(698); match(THROWS);
				setState(699); qualifiedIdentifierList();
				}
			}

			setState(702); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceGenericMethodDeclContext extends ParserRuleContext {
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public InterfaceGenericMethodDeclContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_interfaceGenericMethodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceGenericMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceGenericMethodDecl(this);
		}
	}

	public final InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() throws RecognitionException {
		InterfaceGenericMethodDeclContext _localctx = new InterfaceGenericMethodDeclContext(_ctx, 108);
		enterRule(_localctx, RULE_interfaceGenericMethodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704); typeParameters();
			setState(707);
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
				setState(705); type();
				}
				break;
			case VOID:
				{
				setState(706); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(709); match(Identifier);
			setState(710); interfaceMethodDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
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
		public FormalParametersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, 110);
		enterRule(_localctx, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712); match(LPAREN);
			setState(714);
			_la = _input.LA(1);
			if (_la==FINAL || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==AT || _la==Identifier) {
				{
				setState(713); formalParameterDecls();
				}
			}

			setState(716); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		public FormalParameterDeclsRestContext formalParameterDeclsRest() {
			return getRuleContext(FormalParameterDeclsRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public FormalParameterDeclsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFormalParameterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFormalParameterDecls(this);
		}
	}

	public final FormalParameterDeclsContext formalParameterDecls() throws RecognitionException {
		FormalParameterDeclsContext _localctx = new FormalParameterDeclsContext(_ctx, 112);
		enterRule(_localctx, RULE_formalParameterDecls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(718); variableModifier();
				}
				}
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(724); type();
			setState(725); formalParameterDeclsRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(Java7Parser.FINAL, 0); }
		public VariableModifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, 114);
		enterRule(_localctx, RULE_variableModifier);
		try {
			setState(729);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(727); annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(728); match(FINAL);
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

	public static class FormalParameterDeclsRestContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public FormalParameterDeclsRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFormalParameterDeclsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFormalParameterDeclsRest(this);
		}
	}

	public final FormalParameterDeclsRestContext formalParameterDeclsRest() throws RecognitionException {
		FormalParameterDeclsRestContext _localctx = new FormalParameterDeclsRestContext(_ctx, 116);
		enterRule(_localctx, RULE_formalParameterDeclsRest);
		int _la;
		try {
			setState(738);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(731); variableDeclaratorId();
				setState(734);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(732); match(COMMA);
					setState(733); formalParameterDecls();
					}
				}

				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(736); match(ELLIPSIS);
				setState(737); variableDeclaratorId();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, 118);
		enterRule(_localctx, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740); match(Identifier);
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(741); match(LBRACKET);
				setState(742); match(RBRACKET);
				}
				}
				setState(747);
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, 120);
		enterRule(_localctx, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748); variableDeclarator();
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(749); match(COMMA);
				setState(750); variableDeclarator();
				}
				}
				setState(755);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorRestContext variableDeclaratorRest() {
			return getRuleContext(VariableDeclaratorRestContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public VariableDeclaratorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, 122);
		enterRule(_localctx, RULE_variableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756); match(Identifier);
			setState(757); variableDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorRestContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableDeclaratorRest(this);
		}
	}

	public final VariableDeclaratorRestContext variableDeclaratorRest() throws RecognitionException {
		VariableDeclaratorRestContext _localctx = new VariableDeclaratorRestContext(_ctx, 124);
		enterRule(_localctx, RULE_variableDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(759); match(LBRACKET);
				setState(760); match(RBRACKET);
				}
				}
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(768);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(766); match(EQ);
				setState(767); variableInitializer();
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, 126);
		enterRule(_localctx, RULE_variableInitializer);
		try {
			setState(772);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(770); arrayInitializer();
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
			case TRUE:
			case FALSE:
			case PLUSPLUS:
			case SUBSUB:
			case TILDE:
			case BANG:
			case NEW:
			case PLUS:
			case SUB:
			case LT:
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case BinaryIntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(771); expression(0);
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
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, 128);
		enterRule(_localctx, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(774); match(LBRACE);
			setState(786);
			_la = _input.LA(1);
			if (_la==LBRACE || _la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==LT || _la==DecimalIntegerLiteral || _la==HexIntegerLiteral || _la==OctalIntegerLiteral || _la==BinaryIntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==NullLiteral || _la==Identifier) {
				{
				setState(775); variableInitializer();
				setState(780);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(776); match(COMMA);
						setState(777); variableInitializer();
						}
						} 
					}
					setState(782);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				}
				setState(784);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(783); match(COMMA);
					}
				}

				}
			}

			setState(788); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, 130);
		enterRule(_localctx, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790); match(LBRACE);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENUM || _la==ASSERT || _la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==LBRACE || _la==LPAREN || _la==VOID || _la==INTERFACE || _la==THROW || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==TRUE || _la==FALSE || _la==AT || _la==IF || _la==FOR || _la==WHILE || _la==DO || _la==TRY || _la==SWITCH || _la==RETURN || _la==BREAK || _la==CONTINUE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==LT || _la==DecimalIntegerLiteral || _la==HexIntegerLiteral || _la==OctalIntegerLiteral || _la==BinaryIntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==NullLiteral || _la==Identifier) {
				{
				{
				setState(791); blockStatement();
				}
				}
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(797); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public StatementFoundInBlockContext statementFoundInBlock() {
			return getRuleContext(StatementFoundInBlockContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, 132);
		enterRule(_localctx, RULE_blockStatement);
		try {
			setState(802);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(799); localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(800); classOrInterfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(801); statementFoundInBlock();
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

	public static class StatementFoundInBlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public StatementFoundInBlockContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_statementFoundInBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterStatementFoundInBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitStatementFoundInBlock(this);
		}
	}

	public final StatementFoundInBlockContext statementFoundInBlock() throws RecognitionException {
		StatementFoundInBlockContext _localctx = new StatementFoundInBlockContext(_ctx, 134);
		enterRule(_localctx, RULE_statementFoundInBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(804); match(Identifier);
				setState(805); match(COLON);
				}
				break;
			}
			setState(808); statement();
			}
		}
		catch (RecognitionException re) {
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
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, 136);
		enterRule(_localctx, RULE_localVariableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(810); variableModifier();
				}
				}
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(816); type();
			setState(817); variableDeclarators();
			setState(818); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<CatchesContext> catches() {
			return getRuleContexts(CatchesContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FinallyRuleContext finallyRule() {
			return getRuleContext(FinallyRuleContext.class,0);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<SwitchBlockStatementGroupsContext> switchBlockStatementGroups() {
			return getRuleContexts(SwitchBlockStatementGroupsContext.class);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public SwitchBlockStatementGroupsContext switchBlockStatementGroups(int i) {
			return getRuleContext(SwitchBlockStatementGroupsContext.class,i);
		}
		public TerminalNode TRY() { return getToken(Java7Parser.TRY, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public CatchesContext catches(int i) {
			return getRuleContext(CatchesContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, 138);
		enterRule(_localctx, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(906);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(820); block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(821); match(TRY);
				setState(822); block();
				setState(828);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(823); catches();
					}
					break;
				case 2:
					{
					{
					setState(825);
					_la = _input.LA(1);
					if (_la==CATCH) {
						{
						setState(824); catches();
						}
					}

					setState(827); finallyRule();
					}
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(830); match(TRY);
				setState(831); resourceSpecification();
				setState(832); block();
				setState(834);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(833); catches();
					}
				}

				setState(837);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(836); finallyRule();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(839); match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(840); match(Identifier);
				setState(841); match(COLON);
				setState(842); statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(843); statementExpression();
				setState(844); match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(846); match(IF);
				setState(847); parExpression();
				setState(848); statement();
				setState(851);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(849); match(ELSE);
					setState(850); statement();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(853); match(ASSERT);
				setState(854); expression(0);
				setState(857);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(855); match(COLON);
					setState(856); expression(0);
					}
				}

				setState(859); match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(861); match(SWITCH);
				setState(862); parExpression();
				setState(866);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(863); switchBlockStatementGroups();
						}
						} 
					}
					setState(868);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(869); match(WHILE);
				setState(870); parExpression();
				setState(871); statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(873); match(DO);
				setState(874); statement();
				setState(875); match(WHILE);
				setState(876); parExpression();
				setState(877); match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(879); match(FOR);
				{
				setState(880); forControl();
				}
				setState(881); statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(883); match(BREAK);
				setState(885);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(884); match(Identifier);
					}
				}

				setState(887); match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(888); match(CONTINUE);
				setState(890);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(889); match(Identifier);
					}
				}

				setState(892); match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(893); match(RETURN);
				setState(895);
				_la = _input.LA(1);
				if (_la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==LT || _la==DecimalIntegerLiteral || _la==HexIntegerLiteral || _la==OctalIntegerLiteral || _la==BinaryIntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==NullLiteral || _la==Identifier) {
					{
					setState(894); expression(0);
					}
				}

				setState(897); match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(898); match(THROW);
				setState(899); expression(0);
				setState(900); match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(902); match(SYNCHRONIZED);
				setState(903); parExpression();
				setState(904); block();
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, 140);
		enterRule(_localctx, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		public CatchesContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCatches(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, 142);
		enterRule(_localctx, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910); catchClause();
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(911); catchClause();
				}
				}
				setState(916);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, 144);
		enterRule(_localctx, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917); match(CATCH);
			setState(918); match(LPAREN);
			setState(919); catchFormalParameter();
			setState(920); match(RPAREN);
			setState(921); block();
			}
		}
		catch (RecognitionException re) {
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
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCatchFormalParameter(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, 146);
		enterRule(_localctx, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			_la = _input.LA(1);
			if (_la==FINAL || _la==AT) {
				{
				setState(923); variableModifiers();
				}
			}

			setState(926); catchType();
			setState(927); variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
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
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_variableModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableModifiers(this);
		}
	}

	public final VariableModifiersContext variableModifiers() throws RecognitionException {
		VariableModifiersContext _localctx = new VariableModifiersContext(_ctx, 148);
		enterRule(_localctx, RULE_variableModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(929); variableModifier();
				}
				}
				setState(932); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FINAL || _la==AT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public CatchTypeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, 150);
		enterRule(_localctx, RULE_catchType);
		try {
			setState(939);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(934); classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(935); classType();
				setState(936); match(BAR);
				setState(937); catchType();
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

	public static class ClassTypeContext extends ParserRuleContext {
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public ClassTypeContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, 152);
		enterRule(_localctx, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(941); typeName();
			setState(943);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(942); typeArguments();
				}
			}

			}
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(945); match(DOT);
				setState(946); typeName();
				setState(948);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(947); typeArguments();
					}
				}

				}
				}
				setState(954);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public TypeNameContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, 154);
		enterRule(_localctx, RULE_typeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(955); match(Identifier);
			setState(960);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(956); match(DOT);
					setState(957); match(Identifier);
					}
					} 
				}
				setState(962);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
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

	public static class FinallyRuleContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(Java7Parser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyRuleContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_finallyRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFinallyRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFinallyRule(this);
		}
	}

	public final FinallyRuleContext finallyRule() throws RecognitionException {
		FinallyRuleContext _localctx = new FinallyRuleContext(_ctx, 156);
		enterRule(_localctx, RULE_finallyRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963); match(FINALLY);
			setState(964); block();
			}
		}
		catch (RecognitionException re) {
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
		public ResourceSpecificationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, 158);
		enterRule(_localctx, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966); match(LPAREN);
			setState(967); resources();
			setState(969);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(968); match(SEMI);
				}
			}

			setState(971); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourcesContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, 160);
		enterRule(_localctx, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(973); resource();
			setState(978);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(974); match(SEMI);
					setState(975); resource();
					}
					} 
				}
				setState(980);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public ResourceContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, 162);
		enterRule(_localctx, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(981); variableModifier();
				}
				}
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(987); referenceType();
			setState(988); variableDeclaratorId();
			setState(989); match(EQ);
			setState(990); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		public SwitchBlockStatementGroupsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroups; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSwitchBlockStatementGroups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSwitchBlockStatementGroups(this);
		}
	}

	public final SwitchBlockStatementGroupsContext switchBlockStatementGroups() throws RecognitionException {
		SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx, 164);
		enterRule(_localctx, RULE_switchBlockStatementGroups);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(992); switchBlockStatementGroup();
					}
					} 
				}
				setState(997);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, 166);
		enterRule(_localctx, RULE_switchBlockStatementGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(998); switchLabels();
			setState(1002);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(999); blockStatement();
					}
					} 
				}
				setState(1004);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSwitchLabels(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, 168);
		enterRule(_localctx, RULE_switchLabels);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1005); switchLabel();
			setState(1009);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1006); switchLabel();
					}
					} 
				}
				setState(1011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, 170);
		enterRule(_localctx, RULE_switchLabel);
		try {
			setState(1022);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1012); match(CASE);
				setState(1013); expression(0);
				setState(1014); match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1016); match(CASE);
				setState(1017); enumConstantName();
				setState(1018); match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1020); match(DEFAULT);
				setState(1021); match(COLON);
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

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, 172);
		enterRule(_localctx, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForVarControlContext forVarControl() {
			return getRuleContext(ForVarControlContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, 174);
		enterRule(_localctx, RULE_forControl);
		int _la;
		try {
			setState(1036);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1026); forVarControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1027); forInit();
				setState(1028); match(SEMI);
				setState(1030);
				_la = _input.LA(1);
				if (_la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==LT || _la==DecimalIntegerLiteral || _la==HexIntegerLiteral || _la==OctalIntegerLiteral || _la==BinaryIntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==NullLiteral || _la==Identifier) {
					{
					setState(1029); expression(0);
					}
				}

				setState(1032); match(SEMI);
				setState(1034);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1033); forUpdate();
					}
					break;
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

	public static class ForVarControlContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ForVarControlRestContext forVarControlRest() {
			return getRuleContext(ForVarControlRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public ForVarControlContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_forVarControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterForVarControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitForVarControl(this);
		}
	}

	public final ForVarControlContext forVarControl() throws RecognitionException {
		ForVarControlContext _localctx = new ForVarControlContext(_ctx, 176);
		enterRule(_localctx, RULE_forVarControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1038); variableModifier();
				}
				}
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1044); type();
			setState(1045); variableDeclaratorId();
			setState(1046); forVarControlRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForVarControlRestContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForVariableDeclaratorsRestContext forVariableDeclaratorsRest() {
			return getRuleContext(ForVariableDeclaratorsRestContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForVarControlRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_forVarControlRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterForVarControlRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitForVarControlRest(this);
		}
	}

	public final ForVarControlRestContext forVarControlRest() throws RecognitionException {
		ForVarControlRestContext _localctx = new ForVarControlRestContext(_ctx, 178);
		enterRule(_localctx, RULE_forVarControlRest);
		int _la;
		try {
			setState(1059);
			switch (_input.LA(1)) {
			case SEMI:
			case COMMA:
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(1048); forVariableDeclaratorsRest();
				setState(1049); match(SEMI);
				setState(1051);
				_la = _input.LA(1);
				if (_la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==LT || _la==DecimalIntegerLiteral || _la==HexIntegerLiteral || _la==OctalIntegerLiteral || _la==BinaryIntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==NullLiteral || _la==Identifier) {
					{
					setState(1050); expression(0);
					}
				}

				setState(1053); match(SEMI);
				setState(1055);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1054); forUpdate();
					}
					break;
				}
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1057); match(COLON);
				setState(1058); expression(0);
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

	public static class ForVariableDeclaratorsRestContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public ForVariableDeclaratorsRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_forVariableDeclaratorsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterForVariableDeclaratorsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitForVariableDeclaratorsRest(this);
		}
	}

	public final ForVariableDeclaratorsRestContext forVariableDeclaratorsRest() throws RecognitionException {
		ForVariableDeclaratorsRestContext _localctx = new ForVariableDeclaratorsRestContext(_ctx, 180);
		enterRule(_localctx, RULE_forVariableDeclaratorsRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1061); match(EQ);
				setState(1062); variableInitializer();
				}
			}

			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1065); match(COMMA);
				setState(1066); variableDeclarator();
				}
				}
				setState(1071);
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

	public static class ForInitContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public ForInitContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, 182);
		enterRule(_localctx, RULE_forInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072); statementExpression();
			setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1073); match(COMMA);
				setState(1074); statementExpression();
				}
				}
				setState(1079);
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

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public ForUpdateContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, 184);
		enterRule(_localctx, RULE_forUpdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080); statementExpression();
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1081); match(COMMA);
				setState(1082); statementExpression();
				}
				}
				setState(1087);
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
		public int _p;
		public int expressionType;
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(Java7Parser.LT, 0); }
		public TerminalNode STAR() { return getToken(Java7Parser.STAR, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode PERCENT() { return getToken(Java7Parser.PERCENT, 0); }
		public TerminalNode AMP() { return getToken(Java7Parser.AMP, 0); }
		public TerminalNode PLUSPLUS() { return getToken(Java7Parser.PLUSPLUS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode LTEQ() { return getToken(Java7Parser.LTEQ, 0); }
		public TerminalNode NEW() { return getToken(Java7Parser.NEW, 0); }
		public TerminalNode GTGTGT() { return getToken(Java7Parser.GTGTGT, 0); }
		public TerminalNode SUB() { return getToken(Java7Parser.SUB, 0); }
		public TerminalNode BANG() { return getToken(Java7Parser.BANG, 0); }
		public TerminalNode INSTANCEOF() { return getToken(Java7Parser.INSTANCEOF, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode GTEQ() { return getToken(Java7Parser.GTEQ, 0); }
		public TerminalNode GTGT() { return getToken(Java7Parser.GTGT, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(Java7Parser.LBRACKET, 0); }
		public TerminalNode COLON() { return getToken(Java7Parser.COLON, 0); }
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public TerminalNode SLASH() { return getToken(Java7Parser.SLASH, 0); }
		public TerminalNode SUBSUB() { return getToken(Java7Parser.SUBSUB, 0); }
		public TerminalNode CARET() { return getToken(Java7Parser.CARET, 0); }
		public TerminalNode THIS() { return getToken(Java7Parser.THIS, 0); }
		public TerminalNode TILDE() { return getToken(Java7Parser.TILDE, 0); }
		public TerminalNode BANGEQ() { return getToken(Java7Parser.BANGEQ, 0); }
		public TerminalNode GT() { return getToken(Java7Parser.GT, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode BARBAR() { return getToken(Java7Parser.BARBAR, 0); }
		public TerminalNode PLUS() { return getToken(Java7Parser.PLUS, 0); }
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public TerminalNode RBRACKET() { return getToken(Java7Parser.RBRACKET, 0); }
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public TerminalNode AMPAMP() { return getToken(Java7Parser.AMPAMP, 0); }
		public TerminalNode LTLT() { return getToken(Java7Parser.LTLT, 0); }
		public TerminalNode BAR() { return getToken(Java7Parser.BAR, 0); }
		public TerminalNode QUES() { return getToken(Java7Parser.QUES, 0); }
		public TerminalNode EQEQ() { return getToken(Java7Parser.EQEQ, 0); }
		public ExpressionContext(ParserRuleContext parent, int state) { super(parent, state); }
		public ExpressionContext(ParserRuleContext parent, int state, int _p) {
			super(parent, state);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = _ctx.s;
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 186;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1089); match(LPAREN);
				setState(1090); type();
				setState(1091); match(RPAREN);
				setState(1092); expression(18);
				((ExpressionContext)_localctx).expressionType =  10;
				}
				break;
			case 2:
				{
				setState(1095);
				_input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUSPLUS || _la==SUBSUB || _la==PLUS || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1096); expression(15);
				((ExpressionContext)_localctx).expressionType =  13;
				}
				break;
			case 3:
				{
				setState(1099);
				_input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TILDE || _la==BANG) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1100); expression(14);
				((ExpressionContext)_localctx).expressionType =  14;
				}
				break;
			case 4:
				{
				setState(1103); primary();
				((ExpressionContext)_localctx).expressionType =  1;
				}
				break;
			case 5:
				{
				setState(1106); match(NEW);
				setState(1107); creator();
				((ExpressionContext)_localctx).expressionType =  8;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1236);
					switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1112);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(1113);
						_input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==STAR || _la==SLASH || _la==PERCENT) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1114); expression(14);
						((ExpressionContext)_localctx).expressionType =  15;
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1117);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(1118);
						_input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1119); expression(13);
						((ExpressionContext)_localctx).expressionType =  16;
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1122);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(1123);
						_input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==GTGTGT || _la==GTGT || _la==LTLT) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1124); expression(12);
						((ExpressionContext)_localctx).expressionType =  17;
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1127);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(1128);
						_input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LTEQ || _la==GTEQ || _la==GT || _la==LT) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1129); expression(11);
						((ExpressionContext)_localctx).expressionType =  18;
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1132);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(1133);
						_input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQEQ || _la==BANGEQ) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1134); expression(9);
						((ExpressionContext)_localctx).expressionType =  20;
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1137);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(1138); match(AMP);
						setState(1139); expression(8);
						((ExpressionContext)_localctx).expressionType =  21;
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1142);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(1143); match(CARET);
						setState(1144); expression(6);
						((ExpressionContext)_localctx).expressionType =  22;
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1147);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(1148); match(BAR);
						setState(1149); expression(6);
						((ExpressionContext)_localctx).expressionType =  23;
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1152);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(1153); match(AMPAMP);
						setState(1154); expression(5);
						((ExpressionContext)_localctx).expressionType =  24;
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1157);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(1158); match(BARBAR);
						setState(1159); expression(4);
						((ExpressionContext)_localctx).expressionType =  25;
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1162);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1163); match(QUES);
						setState(1164); expression(0);
						setState(1165); match(COLON);
						setState(1166); expression(3);
						((ExpressionContext)_localctx).expressionType =  26;
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1169);
						if (!(26 >= _localctx._p)) throw new FailedPredicateException(this, "26 >= $_p");
						setState(1170); match(DOT);
						setState(1171); match(Identifier);
						((ExpressionContext)_localctx).expressionType =  2;
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1173);
						if (!(25 >= _localctx._p)) throw new FailedPredicateException(this, "25 >= $_p");
						setState(1174); match(DOT);
						setState(1175); match(THIS);
						((ExpressionContext)_localctx).expressionType =  3;
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1177);
						if (!(24 >= _localctx._p)) throw new FailedPredicateException(this, "24 >= $_p");
						setState(1178); match(DOT);
						setState(1179); match(SUPER);
						setState(1180); match(LPAREN);
						setState(1182);
						_la = _input.LA(1);
						if (_la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==LT || _la==DecimalIntegerLiteral || _la==HexIntegerLiteral || _la==OctalIntegerLiteral || _la==BinaryIntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==NullLiteral || _la==Identifier) {
							{
							setState(1181); expressionList();
							}
						}

						setState(1184); match(RPAREN);
						((ExpressionContext)_localctx).expressionType =  4;
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1186);
						if (!(23 >= _localctx._p)) throw new FailedPredicateException(this, "23 >= $_p");
						setState(1187); match(DOT);
						setState(1188); match(NEW);
						setState(1189); match(Identifier);
						setState(1190); match(LPAREN);
						setState(1192);
						_la = _input.LA(1);
						if (_la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==LT || _la==DecimalIntegerLiteral || _la==HexIntegerLiteral || _la==OctalIntegerLiteral || _la==BinaryIntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==NullLiteral || _la==Identifier) {
							{
							setState(1191); expressionList();
							}
						}

						setState(1194); match(RPAREN);
						((ExpressionContext)_localctx).expressionType =  5;
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1196);
						if (!(22 >= _localctx._p)) throw new FailedPredicateException(this, "22 >= $_p");
						setState(1197); match(DOT);
						setState(1198); match(SUPER);
						setState(1199); match(DOT);
						setState(1200); match(Identifier);
						setState(1202);
						switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
						case 1:
							{
							setState(1201); arguments();
							}
							break;
						}
						((ExpressionContext)_localctx).expressionType =  6;
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1205);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(1206); match(DOT);
						setState(1207); explicitGenericInvocation();
						((ExpressionContext)_localctx).expressionType =  7;
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1210);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(1211); match(LBRACKET);
						setState(1212); expression(0);
						setState(1213); match(RBRACKET);
						((ExpressionContext)_localctx).expressionType =  9;
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1216);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(1217);
						_input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUSPLUS || _la==SUBSUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						((ExpressionContext)_localctx).expressionType =  11;
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1219);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(1220); match(LPAREN);
						setState(1222);
						_la = _input.LA(1);
						if (_la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==LT || _la==DecimalIntegerLiteral || _la==HexIntegerLiteral || _la==OctalIntegerLiteral || _la==BinaryIntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==NullLiteral || _la==Identifier) {
							{
							setState(1221); expressionList();
							}
						}

						setState(1224); match(RPAREN);
						((ExpressionContext)_localctx).expressionType =  12;
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1226);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(1227); match(INSTANCEOF);
						setState(1228); type();
						((ExpressionContext)_localctx).expressionType =  19;
						}
						break;
					case 22:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1231);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(1232); assignmentOperator();
						setState(1233); expression(0);
						((ExpressionContext)_localctx).expressionType =  27;
						}
						break;
					}
					} 
				}
				setState(1240);
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
			unrollRecursionContexts(_parentctx);
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
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public ExpressionListContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, 188);
		enterRule(_localctx, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241); expression(0);
			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1242); match(COMMA);
				setState(1243); expression(0);
				}
				}
				setState(1248);
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, 190);
		enterRule(_localctx, RULE_assignmentOperator);
		try {
			setState(1261);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(1249); match(EQ);
				}
				break;
			case PLUSEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(1250); match(PLUSEQ);
				}
				break;
			case SUBEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(1251); match(SUBEQ);
				}
				break;
			case STAREQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(1252); match(STAREQ);
				}
				break;
			case SLASHEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(1253); match(SLASHEQ);
				}
				break;
			case AMPEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(1254); match(AMPEQ);
				}
				break;
			case BAREQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(1255); match(BAREQ);
				}
				break;
			case CARETEQ:
				enterOuterAlt(_localctx, 8);
				{
				setState(1256); match(CARETEQ);
				}
				break;
			case PERCENTEQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(1257); match(PERCENTEQ);
				}
				break;
			case LTLTEQ:
				enterOuterAlt(_localctx, 10);
				{
				setState(1258); match(LTLTEQ);
				}
				break;
			case GTGTEQ:
				enterOuterAlt(_localctx, 11);
				{
				setState(1259); match(GTGTEQ);
				}
				break;
			case GTGTGTEQ:
				enterOuterAlt(_localctx, 12);
				{
				setState(1260); match(GTGTGTEQ);
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

	public static class PrimaryContext extends ParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public IdentifierSuffixContext identifierSuffix() {
			return getRuleContext(IdentifierSuffixContext.class,0);
		}
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, 192);
		enterRule(_localctx, RULE_primary);
		int _la;
		try {
			int _alt;
			setState(1304);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case BinaryIntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1263); literal();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1264); parExpression();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1265); match(THIS);
				setState(1267);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1266); arguments();
					}
					break;
				}
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1269); match(SUPER);
				setState(1270); superSuffix();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(1271); match(NEW);
				setState(1272); creator();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1273); nonWildcardTypeArguments();
				setState(1277);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1274); explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1275); match(THIS);
					setState(1276); arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 7);
				{
				setState(1279); match(Identifier);
				setState(1284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1280); match(DOT);
						setState(1281); match(Identifier);
						}
						} 
					}
					setState(1286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				}
				setState(1288);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1287); identifierSuffix();
					}
					break;
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
				enterOuterAlt(_localctx, 8);
				{
				setState(1290); basicType();
				setState(1295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(1291); match(LBRACKET);
					setState(1292); match(RBRACKET);
					}
					}
					setState(1297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1298); match(DOT);
				setState(1299); match(CLASS);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 9);
				{
				setState(1301); match(VOID);
				setState(1302); match(DOT);
				setState(1303); match(CLASS);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, 194);
		enterRule(_localctx, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306); match(LPAREN);
			setState(1307); expression(0);
			setState(1308); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, 196);
		enterRule(_localctx, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310); match(LPAREN);
			setState(1319);
			_la = _input.LA(1);
			if (_la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==LT || _la==DecimalIntegerLiteral || _la==HexIntegerLiteral || _la==OctalIntegerLiteral || _la==BinaryIntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==NullLiteral || _la==Identifier) {
				{
				setState(1311); expression(0);
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1312); match(COMMA);
					setState(1313); expression(0);
					}
					}
					setState(1318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1321); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, 198);
		enterRule(_localctx, RULE_superSuffix);
		try {
			setState(1329);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1323); arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1324); match(DOT);
				setState(1325); match(Identifier);
				setState(1327);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1326); arguments();
					}
					break;
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

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, 200);
		enterRule(_localctx, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1335);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1331); match(SUPER);
				setState(1332); superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1333); match(Identifier);
				setState(1334); arguments();
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

	public static class CreatorContext extends ParserRuleContext {
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, 202);
		enterRule(_localctx, RULE_creator);
		try {
			setState(1346);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1337); nonWildcardTypeArguments();
				setState(1338); createdName();
				setState(1339); classCreatorRest();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1341); createdName();
				setState(1344);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					setState(1342); classCreatorRest();
					}
					break;
				case LBRACKET:
					{
					setState(1343); arrayCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class CreatedNameContext extends ParserRuleContext {
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public CreatedNameContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, 204);
		enterRule(_localctx, RULE_createdName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348); match(Identifier);
			setState(1350);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1349); typeArgumentsOrDiamond();
				}
			}

			setState(1359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1352); match(DOT);
				setState(1353); match(Identifier);
				setState(1355);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1354); typeArgumentsOrDiamond();
					}
				}

				}
				}
				setState(1361);
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, 206);
		enterRule(_localctx, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362); arguments();
			setState(1364);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1363); classBody();
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, 208);
		enterRule(_localctx, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1366); match(LBRACKET);
			setState(1392);
			switch (_input.LA(1)) {
			case LBRACE:
			case LBRACKET:
				{
				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(1367); match(LBRACKET);
					setState(1368); match(RBRACKET);
					}
					}
					setState(1373);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1374); arrayInitializer();
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
			case TRUE:
			case FALSE:
			case PLUSPLUS:
			case SUBSUB:
			case TILDE:
			case BANG:
			case NEW:
			case PLUS:
			case SUB:
			case LT:
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case BinaryIntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case Identifier:
				{
				setState(1375); expression(0);
				setState(1382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1376); match(LBRACKET);
						setState(1377); expression(0);
						setState(1378); match(RBRACKET);
						}
						} 
					}
					setState(1384);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				}
				setState(1389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(1385); match(LBRACKET);
					setState(1386); match(RBRACKET);
					}
					}
					setState(1391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1394); match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
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
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public IdentifierSuffixContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_identifierSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterIdentifierSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitIdentifierSuffix(this);
		}
	}

	public final IdentifierSuffixContext identifierSuffix() throws RecognitionException {
		IdentifierSuffixContext _localctx = new IdentifierSuffixContext(_ctx, 210);
		enterRule(_localctx, RULE_identifierSuffix);
		int _la;
		try {
			setState(1424);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1396); match(LBRACKET);
				setState(1407);
				switch (_input.LA(1)) {
				case DOT:
				case LBRACKET:
					{
					setState(1401);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LBRACKET) {
						{
						{
						setState(1397); match(LBRACKET);
						setState(1398); match(RBRACKET);
						}
						}
						setState(1403);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1404); match(DOT);
					setState(1405); match(CLASS);
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
				case TRUE:
				case FALSE:
				case PLUSPLUS:
				case SUBSUB:
				case TILDE:
				case BANG:
				case NEW:
				case PLUS:
				case SUB:
				case LT:
				case DecimalIntegerLiteral:
				case HexIntegerLiteral:
				case OctalIntegerLiteral:
				case BinaryIntegerLiteral:
				case FloatingPointLiteral:
				case CharacterLiteral:
				case StringLiteral:
				case NullLiteral:
				case Identifier:
					{
					setState(1406); expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1409); match(RBRACKET);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1410); arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1411); match(DOT);
				setState(1422);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(1412); match(CLASS);
					}
					break;
				case LT:
					{
					setState(1413); explicitGenericInvocation();
					}
					break;
				case THIS:
					{
					setState(1414); match(THIS);
					}
					break;
				case SUPER:
					{
					setState(1415); match(SUPER);
					setState(1416); arguments();
					}
					break;
				case NEW:
					{
					setState(1417); match(NEW);
					setState(1419);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1418); nonWildcardTypeArguments();
						}
					}

					setState(1421); innerCreator();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, 212);
		enterRule(_localctx, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426); nonWildcardTypeArguments();
			setState(1427); explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
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
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, 214);
		enterRule(_localctx, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429); match(Identifier);
			setState(1431);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1430); nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1433); classCreatorRest();
			}
		}
		catch (RecognitionException re) {
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, 216);
		enterRule(_localctx, RULE_selector);
		int _la;
		try {
			setState(1456);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1435); match(DOT);
				setState(1436); match(Identifier);
				setState(1438);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1437); arguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1440); match(DOT);
				setState(1441); explicitGenericInvocation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1442); match(DOT);
				setState(1443); match(THIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1444); match(DOT);
				setState(1445); match(SUPER);
				setState(1446); superSuffix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1447); match(DOT);
				setState(1448); match(NEW);
				setState(1450);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1449); nonWildcardTypeArguments();
					}
				}

				setState(1452); innerCreator();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1454);
				_la = _input.LA(1);
				if (_la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==LT || _la==DecimalIntegerLiteral || _la==HexIntegerLiteral || _la==OctalIntegerLiteral || _la==BinaryIntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==NullLiteral || _la==Identifier) {
					{
					setState(1453); expression(0);
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

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumBody(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, 218);
		enterRule(_localctx, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458); match(LBRACE);
			setState(1460);
			_la = _input.LA(1);
			if (_la==AT || _la==Identifier) {
				{
				setState(1459); enumConstants();
				}
			}

			setState(1463);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1462); match(COMMA);
				}
			}

			setState(1466);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1465); enumBodyDeclarations();
				}
			}

			setState(1468); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public EnumConstantsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, 220);
		enterRule(_localctx, RULE_enumConstants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1470); enumConstant();
				}
				}
				setState(1473); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT || _la==Identifier );
			}
		}
		catch (RecognitionException re) {
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public EnumConstantContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, 222);
		enterRule(_localctx, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1475); annotations();
				}
			}

			setState(1478); match(Identifier);
			setState(1480);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1479); arguments();
				}
			}

			setState(1483);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1482); classBody();
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
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, 224);
		enterRule(_localctx, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485); match(SEMI);
			setState(1489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENUM || _la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==LBRACE || _la==VOID || _la==INTERFACE || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==AT || _la==LT || _la==Identifier) {
				{
				{
				setState(1486); classBodyDeclaration();
				}
				}
				setState(1491);
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

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public AnnotationTypeElementDeclarationsContext annotationTypeElementDeclarations() {
			return getRuleContext(AnnotationTypeElementDeclarationsContext.class,0);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, 226);
		enterRule(_localctx, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492); match(LBRACE);
			setState(1494);
			_la = _input.LA(1);
			if (_la==ENUM || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==INTERFACE || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==AT || _la==Identifier) {
				{
				setState(1493); annotationTypeElementDeclarations();
				}
			}

			setState(1496); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationsContext extends ParserRuleContext {
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationsContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationTypeElementDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationTypeElementDeclarations(this);
		}
	}

	public final AnnotationTypeElementDeclarationsContext annotationTypeElementDeclarations() throws RecognitionException {
		AnnotationTypeElementDeclarationsContext _localctx = new AnnotationTypeElementDeclarationsContext(_ctx, 228);
		enterRule(_localctx, RULE_annotationTypeElementDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1498); annotationTypeElementDeclaration();
				}
				}
				setState(1501); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ENUM || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==INTERFACE || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==AT || _la==Identifier );
			}
		}
		catch (RecognitionException re) {
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
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, 230);
		enterRule(_localctx, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1503); modifier();
					}
					} 
				}
				setState(1508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			}
			setState(1509); annotationTypeElementRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, 232);
		enterRule(_localctx, RULE_annotationTypeElementRest);
		try {
			setState(1520);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1511); type();
				setState(1512); match(Identifier);
				setState(1513); annotationMethodOrConstantRest();
				setState(1514); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1516); classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1517); interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1518); enumDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1519); annotationTypeDeclaration();
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

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public ConstantDeclaratorsRestContext constantDeclaratorsRest() {
			return getRuleContext(ConstantDeclaratorsRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, 234);
		enterRule(_localctx, RULE_annotationMethodOrConstantRest);
		try {
			setState(1524);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1522); annotationMethodRest();
				}
				break;
			case LBRACKET:
			case EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(1523); constantDeclaratorsRest();
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

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, 236);
		enterRule(_localctx, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526); match(LPAREN);
			setState(1527); match(RPAREN);
			setState(1530);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(1528); match(LBRACKET);
				setState(1529); match(RBRACKET);
				}
			}

			setState(1534);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1532); match(DEFAULT);
				setState(1533); elementValue();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(Java7Parser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(Java7Parser.NullLiteral, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode CharacterLiteral() { return getToken(Java7Parser.CharacterLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java7Parser.FloatingPointLiteral, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, 238);
		enterRule(_localctx, RULE_literal);
		try {
			setState(1542);
			switch (_input.LA(1)) {
			case DecimalIntegerLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case BinaryIntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1536); integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1537); match(FloatingPointLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(1538); match(CharacterLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(1539); match(StringLiteral);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1540); booleanLiteral();
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(1541); match(NullLiteral);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode OctalIntegerLiteral() { return getToken(Java7Parser.OctalIntegerLiteral, 0); }
		public TerminalNode DecimalIntegerLiteral() { return getToken(Java7Parser.DecimalIntegerLiteral, 0); }
		public TerminalNode BinaryIntegerLiteral() { return getToken(Java7Parser.BinaryIntegerLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(Java7Parser.HexIntegerLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, 240);
		enterRule(_localctx, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			_input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==DecimalIntegerLiteral || _la==HexIntegerLiteral || _la==OctalIntegerLiteral || _la==BinaryIntegerLiteral) ) {
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(Java7Parser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(Java7Parser.TRUE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, 242);
		enterRule(_localctx, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			_input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 93: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	public boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 13 >= _localctx._p;
		case 1: return 12 >= _localctx._p;
		case 2: return 11 >= _localctx._p;
		case 3: return 10 >= _localctx._p;
		case 4: return 8 >= _localctx._p;
		case 5: return 7 >= _localctx._p;
		case 6: return 6 >= _localctx._p;
		case 7: return 5 >= _localctx._p;
		case 8: return 4 >= _localctx._p;
		case 9: return 3 >= _localctx._p;
		case 10: return 2 >= _localctx._p;
		case 11: return 26 >= _localctx._p;
		case 12: return 25 >= _localctx._p;
		case 13: return 24 >= _localctx._p;
		case 14: return 23 >= _localctx._p;
		case 15: return 22 >= _localctx._p;
		case 17: return 19 >= _localctx._p;
		case 16: return 21 >= _localctx._p;
		case 19: return 16 >= _localctx._p;
		case 18: return 17 >= _localctx._p;
		case 21: return 1 >= _localctx._p;
		case 20: return 9 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3o\u060d\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7\6\2\7"+
		"\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16\7\16\2\17"+
		"\7\17\2\20\7\20\2\21\7\21\2\22\7\22\2\23\7\23\2\24\7\24\2\25\7\25\2\26"+
		"\7\26\2\27\7\27\2\30\7\30\2\31\7\31\2\32\7\32\2\33\7\33\2\34\7\34\2\35"+
		"\7\35\2\36\7\36\2\37\7\37\2 \7 \2!\7!\2\"\7\"\2#\7#\2$\7$\2%\7%\2&\7&"+
		"\2\'\7\'\2(\7(\2)\7)\2*\7*\2+\7+\2,\7,\2-\7-\2.\7.\2/\7/\2\60\7\60\2\61"+
		"\7\61\2\62\7\62\2\63\7\63\2\64\7\64\2\65\7\65\2\66\7\66\2\67\7\67\28\7"+
		"8\29\79\2:\7:\2;\7;\2<\7<\2=\7=\2>\7>\2?\7?\2@\7@\2A\7A\2B\7B\2C\7C\2"+
		"D\7D\2E\7E\2F\7F\2G\7G\2H\7H\2I\7I\2J\7J\2K\7K\2L\7L\2M\7M\2N\7N\2O\7"+
		"O\2P\7P\2Q\7Q\2R\7R\2S\7S\2T\7T\2U\7U\2V\7V\2W\7W\2X\7X\2Y\7Y\2Z\7Z\2"+
		"[\7[\2\\\7\\\2]\7]\2^\7^\2_\7_\2`\7`\2a\7a\2b\7b\2c\7c\2d\7d\2e\7e\2f"+
		"\7f\2g\7g\2h\7h\2i\7i\2j\7j\2k\7k\2l\7l\2m\7m\2n\7n\2o\7o\2p\7p\2q\7q"+
		"\2r\7r\2s\7s\2t\7t\2u\7u\2v\7v\2w\7w\2x\7x\2y\7y\1\0\1\0\1\0\5\0\u00f8"+
		"\b\0\n\0\f\0\u00fb\t\0\1\1\1\1\1\1\5\1\u0100\b\1\n\1\f\1\u0103\t\1\1\2"+
		"\3\2\u0106\b\2\1\2\1\2\1\2\1\2\3\2\u010c\b\2\1\2\5\2\u010f\b\2\n\2\f\2"+
		"\u0112\t\2\1\2\5\2\u0115\b\2\n\2\f\2\u0118\t\2\1\3\1\3\3\3\u011c\b\3\1"+
		"\3\1\3\1\3\5\3\u0121\b\3\n\3\f\3\u0124\t\3\1\3\1\3\3\3\u0128\b\3\1\3\1"+
		"\3\1\4\1\4\3\4\u012e\b\4\1\5\5\5\u0131\b\5\n\5\f\5\u0134\t\5\1\5\1\5\3"+
		"\5\u0138\b\5\1\6\1\6\3\6\u013c\b\6\1\7\1\7\3\7\u0140\b\7\1\b\1\b\1\b\3"+
		"\b\u0145\b\b\1\b\1\b\3\b\u0149\b\b\1\b\1\b\3\b\u014d\b\b\1\b\1\b\1\t\1"+
		"\t\1\t\1\t\3\t\u0155\b\t\1\t\1\t\1\n\1\n\1\n\3\n\u015c\b\n\1\n\1\n\3\n"+
		"\u0160\b\n\1\n\1\n\1\13\1\13\1\13\1\13\1\13\1\f\1\f\1\f\5\f\u016c\b\f"+
		"\n\f\f\f\u016f\t\f\1\f\1\f\1\f\5\f\u0174\b\f\n\f\f\f\u0177\t\f\3\f\u0179"+
		"\b\f\1\r\1\r\1\16\1\16\3\16\u017f\b\16\1\16\1\16\1\16\3\16\u0184\b\16"+
		"\5\16\u0186\b\16\n\16\f\16\u0189\t\16\1\17\1\17\1\17\1\17\5\17\u018f\b"+
		"\17\n\17\f\17\u0192\t\17\1\17\1\17\1\20\1\20\1\20\1\20\3\20\u019a\b\20"+
		"\3\20\u019c\b\20\1\21\1\21\1\21\1\21\1\22\1\22\1\22\5\22\u01a5\b\22\n"+
		"\22\f\22\u01a8\t\22\1\23\1\23\1\23\3\23\u01ad\b\23\1\24\1\24\1\24\3\24"+
		"\u01b2\b\24\1\25\1\25\1\25\1\25\5\25\u01b8\b\25\n\25\f\25\u01bb\t\25\1"+
		"\25\1\25\1\26\1\26\1\26\3\26\u01c2\b\26\1\27\1\27\1\27\5\27\u01c7\b\27"+
		"\n\27\f\27\u01ca\t\27\1\30\1\30\1\30\1\30\1\30\1\30\1\30\1\30\1\30\1\30"+
		"\1\30\1\30\3\30\u01d8\b\30\1\31\1\31\5\31\u01dc\b\31\n\31\f\31\u01df\t"+
		"\31\1\32\1\32\1\32\1\32\3\32\u01e5\b\32\1\32\3\32\u01e8\b\32\1\33\1\33"+
		"\3\33\u01ec\b\33\1\34\1\34\1\34\5\34\u01f1\b\34\n\34\f\34\u01f4\t\34\1"+
		"\35\1\35\1\35\1\35\1\36\1\36\1\36\3\36\u01fd\b\36\1\37\1\37\3\37\u0201"+
		"\b\37\1\37\3\37\u0204\b\37\1\37\1\37\1 \1 \1 \5 \u020b\b \n \f \u020e"+
		"\t \1!\1!\5!\u0212\b!\n!\f!\u0215\t!\1!\1!\1\"\1\"\5\"\u021b\b\"\n\"\f"+
		"\"\u021e\t\"\1\"\1\"\3\"\u0222\b\"\1\"\3\"\u0225\b\"\1#\1#\1#\1#\1#\1"+
		"#\1#\1#\1#\3#\u0230\b#\1$\1$\1$\1$\1%\1%\1%\1%\3%\u023a\b%\1&\1&\1&\5"+
		"&\u023f\b&\n&\f&\u0242\t&\1\'\1\'\1\'\5\'\u0247\b\'\n\'\f\'\u024a\t\'"+
		"\1\'\1\'\3\'\u024e\b\'\1\'\1\'\3\'\u0252\b\'\1(\1(\1(\3(\u0257\b(\1(\1"+
		"(\3(\u025b\b(\1)\1)\1)\3)\u0260\b)\1)\1)\1*\1*\1*\1+\1+\3+\u0269\b+\1"+
		"+\1+\1+\1+\3+\u026f\b+\1,\1,\5,\u0273\b,\n,\f,\u0276\t,\1,\1,\1-\1-\5"+
		"-\u027c\b-\n-\f-\u027f\t-\1-\3-\u0282\b-\1.\1.\1.\1.\1.\1.\1.\3.\u028b"+
		"\b.\1/\1/\1/\1/\1\60\1\60\1\60\1\60\3\60\u0295\b\60\1\61\1\61\1\61\5\61"+
		"\u029a\b\61\n\61\f\61\u029d\t\61\1\62\1\62\5\62\u02a1\b\62\n\62\f\62\u02a4"+
		"\t\62\1\62\1\62\1\62\1\63\1\63\1\63\1\64\1\64\1\64\5\64\u02af\b\64\n\64"+
		"\f\64\u02b2\t\64\1\64\1\64\3\64\u02b6\b\64\1\64\1\64\1\65\1\65\1\65\3"+
		"\65\u02bd\b\65\1\65\1\65\1\66\1\66\1\66\3\66\u02c4\b\66\1\66\1\66\1\66"+
		"\1\67\1\67\3\67\u02cb\b\67\1\67\1\67\18\58\u02d0\b8\n8\f8\u02d3\t8\18"+
		"\18\18\19\19\39\u02da\b9\1:\1:\1:\3:\u02df\b:\1:\1:\3:\u02e3\b:\1;\1;"+
		"\1;\5;\u02e8\b;\n;\f;\u02eb\t;\1<\1<\1<\5<\u02f0\b<\n<\f<\u02f3\t<\1="+
		"\1=\1=\1>\1>\5>\u02fa\b>\n>\f>\u02fd\t>\1>\1>\3>\u0301\b>\1?\1?\3?\u0305"+
		"\b?\1@\1@\1@\1@\5@\u030b\b@\n@\f@\u030e\t@\1@\3@\u0311\b@\3@\u0313\b@"+
		"\1@\1@\1A\1A\5A\u0319\bA\nA\fA\u031c\tA\1A\1A\1B\1B\1B\3B\u0323\bB\1C"+
		"\1C\3C\u0327\bC\1C\1C\1D\5D\u032c\bD\nD\fD\u032f\tD\1D\1D\1D\1D\1E\1E"+
		"\1E\1E\1E\3E\u033a\bE\1E\3E\u033d\bE\1E\1E\1E\1E\3E\u0343\bE\1E\3E\u0346"+
		"\bE\1E\1E\1E\1E\1E\1E\1E\1E\1E\1E\1E\1E\3E\u0354\bE\1E\1E\1E\1E\3E\u035a"+
		"\bE\1E\1E\1E\1E\1E\5E\u0361\bE\nE\fE\u0364\tE\1E\1E\1E\1E\1E\1E\1E\1E"+
		"\1E\1E\1E\1E\1E\1E\1E\1E\3E\u0376\bE\1E\1E\1E\3E\u037b\bE\1E\1E\1E\3E"+
		"\u0380\bE\1E\1E\1E\1E\1E\1E\1E\1E\1E\3E\u038b\bE\1F\1F\1G\1G\5G\u0391"+
		"\bG\nG\fG\u0394\tG\1H\1H\1H\1H\1H\1H\1I\3I\u039d\bI\1I\1I\1I\1J\4J\u03a3"+
		"\bJ\13J\fJ\u03a4\1K\1K\1K\1K\1K\3K\u03ac\bK\1L\1L\3L\u03b0\bL\1L\1L\1"+
		"L\3L\u03b5\bL\5L\u03b7\bL\nL\fL\u03ba\tL\1M\1M\1M\5M\u03bf\bM\nM\fM\u03c2"+
		"\tM\1N\1N\1N\1O\1O\1O\3O\u03ca\bO\1O\1O\1P\1P\1P\5P\u03d1\bP\nP\fP\u03d4"+
		"\tP\1Q\5Q\u03d7\bQ\nQ\fQ\u03da\tQ\1Q\1Q\1Q\1Q\1Q\1R\5R\u03e2\bR\nR\fR"+
		"\u03e5\tR\1S\1S\5S\u03e9\bS\nS\fS\u03ec\tS\1T\1T\5T\u03f0\bT\nT\fT\u03f3"+
		"\tT\1U\1U\1U\1U\1U\1U\1U\1U\1U\1U\3U\u03ff\bU\1V\1V\1W\1W\1W\1W\3W\u0407"+
		"\bW\1W\1W\3W\u040b\bW\3W\u040d\bW\1X\5X\u0410\bX\nX\fX\u0413\tX\1X\1X"+
		"\1X\1X\1Y\1Y\1Y\3Y\u041c\bY\1Y\1Y\3Y\u0420\bY\1Y\1Y\3Y\u0424\bY\1Z\1Z"+
		"\3Z\u0428\bZ\1Z\1Z\5Z\u042c\bZ\nZ\fZ\u042f\tZ\1[\1[\1[\5[\u0434\b[\n["+
		"\f[\u0437\t[\1\\\1\\\1\\\5\\\u043c\b\\\n\\\f\\\u043f\t\\\1]\1]\1]\1]\1"+
		"]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\3]\u0457\b]\1]\1"+
		"]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1"+
		"]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1"+
		"]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\3"+
		"]\u049f\b]\1]\1]\1]\1]\1]\1]\1]\1]\3]\u04a9\b]\1]\1]\1]\1]\1]\1]\1]\1"+
		"]\3]\u04b3\b]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\3"+
		"]\u04c7\b]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\1]\5]\u04d5\b]\n]\f]\u04d8"+
		"\t]\1^\1^\1^\5^\u04dd\b^\n^\f^\u04e0\t^\1_\1_\1_\1_\1_\1_\1_\1_\1_\1_"+
		"\1_\1_\3_\u04ee\b_\1`\1`\1`\1`\3`\u04f4\b`\1`\1`\1`\1`\1`\1`\1`\1`\3`"+
		"\u04fe\b`\1`\1`\1`\5`\u0503\b`\n`\f`\u0506\t`\1`\3`\u0509\b`\1`\1`\1`"+
		"\5`\u050e\b`\n`\f`\u0511\t`\1`\1`\1`\1`\1`\1`\3`\u0519\b`\1a\1a\1a\1a"+
		"\1b\1b\1b\1b\5b\u0523\bb\nb\fb\u0526\tb\3b\u0528\bb\1b\1b\1c\1c\1c\1c"+
		"\3c\u0530\bc\3c\u0532\bc\1d\1d\1d\1d\3d\u0538\bd\1e\1e\1e\1e\1e\1e\1e"+
		"\3e\u0541\be\3e\u0543\be\1f\1f\3f\u0547\bf\1f\1f\1f\3f\u054c\bf\5f\u054e"+
		"\bf\nf\ff\u0551\tf\1g\1g\3g\u0555\bg\1h\1h\1h\5h\u055a\bh\nh\fh\u055d"+
		"\th\1h\1h\1h\1h\1h\1h\5h\u0565\bh\nh\fh\u0568\th\1h\1h\5h\u056c\bh\nh"+
		"\fh\u056f\th\3h\u0571\bh\1h\1h\1i\1i\1i\5i\u0578\bi\ni\fi\u057b\ti\1i"+
		"\1i\1i\3i\u0580\bi\1i\1i\1i\1i\1i\1i\1i\1i\1i\1i\3i\u058c\bi\1i\3i\u058f"+
		"\bi\3i\u0591\bi\1j\1j\1j\1k\1k\3k\u0598\bk\1k\1k\1l\1l\1l\3l\u059f\bl"+
		"\1l\1l\1l\1l\1l\1l\1l\1l\1l\1l\3l\u05ab\bl\1l\1l\3l\u05af\bl\3l\u05b1"+
		"\bl\1m\1m\3m\u05b5\bm\1m\3m\u05b8\bm\1m\3m\u05bb\bm\1m\1m\1n\4n\u05c0"+
		"\bn\13n\fn\u05c1\1o\3o\u05c5\bo\1o\1o\3o\u05c9\bo\1o\3o\u05cc\bo\1p\1"+
		"p\5p\u05d0\bp\np\fp\u05d3\tp\1q\1q\3q\u05d7\bq\1q\1q\1r\4r\u05dc\br\13"+
		"r\fr\u05dd\1s\5s\u05e1\bs\ns\fs\u05e4\ts\1s\1s\1t\1t\1t\1t\1t\1t\1t\1"+
		"t\1t\3t\u05f1\bt\1u\1u\3u\u05f5\bu\1v\1v\1v\1v\3v\u05fb\bv\1v\1v\3v\u05ff"+
		"\bv\1w\1w\1w\1w\1w\1w\3w\u0607\bw\1x\1x\1y\1y\1yz\0\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\0\f\1!(\2**--\2ABHI\1CD\2\7\7FG\1HI\1^`\2YZab\1JK\1AB\1dg\1/\60\u06a2"+
		"\0\u00f4\1\0\0\0\2\u00fc\1\0\0\0\4\u010b\1\0\0\0\6\u0119\1\0\0\0\b\u012d"+
		"\1\0\0\0\n\u0132\1\0\0\0\f\u013b\1\0\0\0\16\u013f\1\0\0\0\20\u0141\1\0"+
		"\0\0\22\u0150\1\0\0\0\24\u0158\1\0\0\0\26\u0163\1\0\0\0\30\u0178\1\0\0"+
		"\0\32\u017a\1\0\0\0\34\u017c\1\0\0\0\36\u018a\1\0\0\0 \u019b\1\0\0\0\""+
		"\u019d\1\0\0\0$\u01a1\1\0\0\0&\u01ac\1\0\0\0(\u01b1\1\0\0\0*\u01b3\1\0"+
		"\0\0,\u01be\1\0\0\0.\u01c3\1\0\0\0\60\u01d7\1\0\0\0\62\u01d9\1\0\0\0\64"+
		"\u01e0\1\0\0\0\66\u01eb\1\0\0\08\u01ed\1\0\0\0:\u01f5\1\0\0\0<\u01fc\1"+
		"\0\0\0>\u01fe\1\0\0\0@\u0207\1\0\0\0B\u020f\1\0\0\0D\u0224\1\0\0\0F\u022f"+
		"\1\0\0\0H\u0231\1\0\0\0J\u0239\1\0\0\0L\u023b\1\0\0\0N\u0243\1\0\0\0P"+
		"\u0253\1\0\0\0R\u025c\1\0\0\0T\u0263\1\0\0\0V\u026e\1\0\0\0X\u0270\1\0"+
		"\0\0Z\u0281\1\0\0\0\\\u028a\1\0\0\0^\u028c\1\0\0\0`\u0294\1\0\0\0b\u0296"+
		"\1\0\0\0d\u02a2\1\0\0\0f\u02a8\1\0\0\0h\u02ab\1\0\0\0j\u02b9\1\0\0\0l"+
		"\u02c0\1\0\0\0n\u02c8\1\0\0\0p\u02d1\1\0\0\0r\u02d9\1\0\0\0t\u02e2\1\0"+
		"\0\0v\u02e4\1\0\0\0x\u02ec\1\0\0\0z\u02f4\1\0\0\0|\u02fb\1\0\0\0~\u0304"+
		"\1\0\0\0\u0080\u0306\1\0\0\0\u0082\u0316\1\0\0\0\u0084\u0322\1\0\0\0\u0086"+
		"\u0326\1\0\0\0\u0088\u032d\1\0\0\0\u008a\u038a\1\0\0\0\u008c\u038c\1\0"+
		"\0\0\u008e\u038e\1\0\0\0\u0090\u0395\1\0\0\0\u0092\u039c\1\0\0\0\u0094"+
		"\u03a2\1\0\0\0\u0096\u03ab\1\0\0\0\u0098\u03ad\1\0\0\0\u009a\u03bb\1\0"+
		"\0\0\u009c\u03c3\1\0\0\0\u009e\u03c6\1\0\0\0\u00a0\u03cd\1\0\0\0\u00a2"+
		"\u03d8\1\0\0\0\u00a4\u03e3\1\0\0\0\u00a6\u03e6\1\0\0\0\u00a8\u03ed\1\0"+
		"\0\0\u00aa\u03fe\1\0\0\0\u00ac\u0400\1\0\0\0\u00ae\u040c\1\0\0\0\u00b0"+
		"\u0411\1\0\0\0\u00b2\u0423\1\0\0\0\u00b4\u0427\1\0\0\0\u00b6\u0430\1\0"+
		"\0\0\u00b8\u0438\1\0\0\0\u00ba\u0456\1\0\0\0\u00bc\u04d9\1\0\0\0\u00be"+
		"\u04ed\1\0\0\0\u00c0\u0518\1\0\0\0\u00c2\u051a\1\0\0\0\u00c4\u051e\1\0"+
		"\0\0\u00c6\u0531\1\0\0\0\u00c8\u0537\1\0\0\0\u00ca\u0542\1\0\0\0\u00cc"+
		"\u0544\1\0\0\0\u00ce\u0552\1\0\0\0\u00d0\u0556\1\0\0\0\u00d2\u0590\1\0"+
		"\0\0\u00d4\u0592\1\0\0\0\u00d6\u0595\1\0\0\0\u00d8\u05b0\1\0\0\0\u00da"+
		"\u05b2\1\0\0\0\u00dc\u05bf\1\0\0\0\u00de\u05c4\1\0\0\0\u00e0\u05cd\1\0"+
		"\0\0\u00e2\u05d4\1\0\0\0\u00e4\u05db\1\0\0\0\u00e6\u05e2\1\0\0\0\u00e8"+
		"\u05f0\1\0\0\0\u00ea\u05f4\1\0\0\0\u00ec\u05f6\1\0\0\0\u00ee\u0606\1\0"+
		"\0\0\u00f0\u0608\1\0\0\0\u00f2\u060a\1\0\0\0\u00f4\u00f9\5l\0\0\u00f5"+
		"\u00f6\5\6\0\0\u00f6\u00f8\5l\0\0\u00f7\u00f5\1\0\0\0\u00f8\u00fb\1\0"+
		"\0\0\u00f9\u00f7\1\0\0\0\u00f9\u00fa\1\0\0\0\u00fa\1\1\0\0\0\u00fb\u00f9"+
		"\1\0\0\0\u00fc\u0101\3\0\0\0\u00fd\u00fe\5\21\0\0\u00fe\u0100\3\0\0\0"+
		"\u00ff\u00fd\1\0\0\0\u0100\u0103\1\0\0\0\u0101\u00ff\1\0\0\0\u0101\u0102"+
		"\1\0\0\0\u0102\3\1\0\0\0\u0103\u0101\1\0\0\0\u0104\u0106\3\62\31\0\u0105"+
		"\u0104\1\0\0\0\u0105\u0106\1\0\0\0\u0106\u0107\1\0\0\0\u0107\u0108\5\4"+
		"\0\0\u0108\u0109\3\0\0\0\u0109\u010a\5\3\0\0\u010a\u010c\1\0\0\0\u010b"+
		"\u0105\1\0\0\0\u010b\u010c\1\0\0\0\u010c\u0110\1\0\0\0\u010d\u010f\3\6"+
		"\3\0\u010e\u010d\1\0\0\0\u010f\u0112\1\0\0\0\u0110\u010e\1\0\0\0\u0110"+
		"\u0111\1\0\0\0\u0111\u0116\1\0\0\0\u0112\u0110\1\0\0\0\u0113\u0115\3\b"+
		"\4\0\u0114\u0113\1\0\0\0\u0115\u0118\1\0\0\0\u0116\u0114\1\0\0\0\u0116"+
		"\u0117\1\0\0\0\u0117\5\1\0\0\0\u0118\u0116\1\0\0\0\u0119\u011b\5\5\0\0"+
		"\u011a\u011c\5\16\0\0\u011b\u011a\1\0\0\0\u011b\u011c\1\0\0\0\u011c\u011d"+
		"\1\0\0\0\u011d\u0122\5l\0\0\u011e\u011f\5\6\0\0\u011f\u0121\5l\0\0\u0120"+
		"\u011e\1\0\0\0\u0121\u0124\1\0\0\0\u0122\u0120\1\0\0\0\u0122\u0123\1\0"+
		"\0\0\u0123\u0127\1\0\0\0\u0124\u0122\1\0\0\0\u0125\u0126\5\6\0\0\u0126"+
		"\u0128\5\7\0\0\u0127\u0125\1\0\0\0\u0127\u0128\1\0\0\0\u0128\u0129\1\0"+
		"\0\0\u0129\u012a\5\3\0\0\u012a\7\1\0\0\0\u012b\u012e\3\n\5\0\u012c\u012e"+
		"\5\3\0\0\u012d\u012b\1\0\0\0\u012d\u012c\1\0\0\0\u012e\t\1\0\0\0\u012f"+
		"\u0131\3\60\30\0\u0130\u012f\1\0\0\0\u0131\u0134\1\0\0\0\u0132\u0130\1"+
		"\0\0\0\u0132\u0133\1\0\0\0\u0133\u0137\1\0\0\0\u0134\u0132\1\0\0\0\u0135"+
		"\u0138\3\f\6\0\u0136\u0138\3\16\7\0\u0137\u0135\1\0\0\0\u0137\u0136\1"+
		"\0\0\0\u0138\13\1\0\0\0\u0139\u013c\3\20\b\0\u013a\u013c\3\22\t\0\u013b"+
		"\u0139\1\0\0\0\u013b\u013a\1\0\0\0\u013c\r\1\0\0\0\u013d\u0140\3\24\n"+
		"\0\u013e\u0140\3\26\13\0\u013f\u013d\1\0\0\0\u013f\u013e\1\0\0\0\u0140"+
		"\17\1\0\0\0\u0141\u0142\5\b\0\0\u0142\u0144\5l\0\0\u0143\u0145\3*\25\0"+
		"\u0144\u0143\1\0\0\0\u0144\u0145\1\0\0\0\u0145\u0148\1\0\0\0\u0146\u0147"+
		"\5*\0\0\u0147\u0149\3\30\f\0\u0148\u0146\1\0\0\0\u0148\u0149\1\0\0\0\u0149"+
		"\u014c\1\0\0\0\u014a\u014b\5\t\0\0\u014b\u014d\3$\22\0\u014c\u014a\1\0"+
		"\0\0\u014c\u014d\1\0\0\0\u014d\u014e\1\0\0\0\u014e\u014f\3B!\0\u014f\21"+
		"\1\0\0\0\u0150\u0151\5\1\0\0\u0151\u0154\5l\0\0\u0152\u0153\5\t\0\0\u0153"+
		"\u0155\3$\22\0\u0154\u0152\1\0\0\0\u0154\u0155\1\0\0\0\u0155\u0156\1\0"+
		"\0\0\u0156\u0157\3\u00dam\0\u0157\23\1\0\0\0\u0158\u0159\5\31\0\0\u0159"+
		"\u015b\5l\0\0\u015a\u015c\3*\25\0\u015b\u015a\1\0\0\0\u015b\u015c\1\0"+
		"\0\0\u015c\u015f\1\0\0\0\u015d\u015e\5*\0\0\u015e\u0160\3$\22\0\u015f"+
		"\u015d\1\0\0\0\u015f\u0160\1\0\0\0\u0160\u0161\1\0\0\0\u0161\u0162\3X"+
		",\0\u0162\25\1\0\0\0\u0163\u0164\5\61\0\0\u0164\u0165\5\31\0\0\u0165\u0166"+
		"\5l\0\0\u0166\u0167\3\u00e2q\0\u0167\27\1\0\0\0\u0168\u016d\3\32\r\0\u0169"+
		"\u016a\5\24\0\0\u016a\u016c\5\25\0\0\u016b\u0169\1\0\0\0\u016c\u016f\1"+
		"\0\0\0\u016d\u016b\1\0\0\0\u016d\u016e\1\0\0\0\u016e\u0179\1\0\0\0\u016f"+
		"\u016d\1\0\0\0\u0170\u0175\3\34\16\0\u0171\u0172\5\24\0\0\u0172\u0174"+
		"\5\25\0\0\u0173\u0171\1\0\0\0\u0174\u0177\1\0\0\0\u0175\u0173\1\0\0\0"+
		"\u0175\u0176\1\0\0\0\u0176\u0179\1\0\0\0\u0177\u0175\1\0\0\0\u0178\u0168"+
		"\1\0\0\0\u0178\u0170\1\0\0\0\u0179\31\1\0\0\0\u017a\u017b\7\0\0\0\u017b"+
		"\33\1\0\0\0\u017c\u017e\5l\0\0\u017d\u017f\3\36\17\0\u017e\u017d\1\0\0"+
		"\0\u017e\u017f\1\0\0\0\u017f\u0187\1\0\0\0\u0180\u0181\5\6\0\0\u0181\u0183"+
		"\5l\0\0\u0182\u0184\3\36\17\0\u0183\u0182\1\0\0\0\u0183\u0184\1\0\0\0"+
		"\u0184\u0186\1\0\0\0\u0185\u0180\1\0\0\0\u0186\u0189\1\0\0\0\u0187\u0185"+
		"\1\0\0\0\u0187\u0188\1\0\0\0\u0188\35\1\0\0\0\u0189\u0187\1\0\0\0\u018a"+
		"\u018b\5b\0\0\u018b\u0190\3 \20\0\u018c\u018d\5\21\0\0\u018d\u018f\3 "+
		"\20\0\u018e\u018c\1\0\0\0\u018f\u0192\1\0\0\0\u0190\u018e\1\0\0\0\u0190"+
		"\u0191\1\0\0\0\u0191\u0193\1\0\0\0\u0192\u0190\1\0\0\0\u0193\u0194\5a"+
		"\0\0\u0194\37\1\0\0\0\u0195\u019c\3\34\16\0\u0196\u0199\5)\0\0\u0197\u0198"+
		"\7\1\0\0\u0198\u019a\3\34\16\0\u0199\u0197\1\0\0\0\u0199\u019a\1\0\0\0"+
		"\u019a\u019c\1\0\0\0\u019b\u0195\1\0\0\0\u019b\u0196\1\0\0\0\u019c!\1"+
		"\0\0\0\u019d\u019e\5b\0\0\u019e\u019f\3$\22\0\u019f\u01a0\5a\0\0\u01a0"+
		"#\1\0\0\0\u01a1\u01a6\3\34\16\0\u01a2\u01a3\5\21\0\0\u01a3\u01a5\3\34"+
		"\16\0\u01a4\u01a2\1\0\0\0\u01a5\u01a8\1\0\0\0\u01a6\u01a4\1\0\0\0\u01a6"+
		"\u01a7\1\0\0\0\u01a7%\1\0\0\0\u01a8\u01a6\1\0\0\0\u01a9\u01aa\5b\0\0\u01aa"+
		"\u01ad\5a\0\0\u01ab\u01ad\3\36\17\0\u01ac\u01a9\1\0\0\0\u01ac\u01ab\1"+
		"\0\0\0\u01ad\'\1\0\0\0\u01ae\u01af\5b\0\0\u01af\u01b2\5a\0\0\u01b0\u01b2"+
		"\3\"\21\0\u01b1\u01ae\1\0\0\0\u01b1\u01b0\1\0\0\0\u01b2)\1\0\0\0\u01b3"+
		"\u01b4\5b\0\0\u01b4\u01b9\3,\26\0\u01b5\u01b6\5\21\0\0\u01b6\u01b8\3,"+
		"\26\0\u01b7\u01b5\1\0\0\0\u01b8\u01bb\1\0\0\0\u01b9\u01b7\1\0\0\0\u01b9"+
		"\u01ba\1\0\0\0\u01ba\u01bc\1\0\0\0\u01bb\u01b9\1\0\0\0\u01bc\u01bd\5a"+
		"\0\0\u01bd+\1\0\0\0\u01be\u01c1\5l\0\0\u01bf\u01c0\5*\0\0\u01c0\u01c2"+
		"\3.\27\0\u01c1\u01bf\1\0\0\0\u01c1\u01c2\1\0\0\0\u01c2-\1\0\0\0\u01c3"+
		"\u01c8\3\34\16\0\u01c4\u01c5\5L\0\0\u01c5\u01c7\3\34\16\0\u01c6\u01c4"+
		"\1\0\0\0\u01c7\u01ca\1\0\0\0\u01c8\u01c6\1\0\0\0\u01c8\u01c9\1\0\0\0\u01c9"+
		"/\1\0\0\0\u01ca\u01c8\1\0\0\0\u01cb\u01d8\3\64\32\0\u01cc\u01d8\5\n\0"+
		"\0\u01cd\u01d8\5\13\0\0\u01ce\u01d8\5\f\0\0\u01cf\u01d8\5\16\0\0\u01d0"+
		"\u01d8\5\r\0\0\u01d1\u01d8\5\17\0\0\u01d2\u01d8\5\35\0\0\u01d3\u01d8\5"+
		"\36\0\0\u01d4\u01d8\5\37\0\0\u01d5\u01d8\5 \0\0\u01d6\u01d8\5\20\0\0\u01d7"+
		"\u01cb\1\0\0\0\u01d7\u01cc\1\0\0\0\u01d7\u01cd\1\0\0\0\u01d7\u01ce\1\0"+
		"\0\0\u01d7\u01cf\1\0\0\0\u01d7\u01d0\1\0\0\0\u01d7\u01d1\1\0\0\0\u01d7"+
		"\u01d2\1\0\0\0\u01d7\u01d3\1\0\0\0\u01d7\u01d4\1\0\0\0\u01d7\u01d5\1\0"+
		"\0\0\u01d7\u01d6\1\0\0\0\u01d8\61\1\0\0\0\u01d9\u01dd\3\64\32\0\u01da"+
		"\u01dc\3\64\32\0\u01db\u01da\1\0\0\0\u01dc\u01df\1\0\0\0\u01dd\u01db\1"+
		"\0\0\0\u01dd\u01de\1\0\0\0\u01de\63\1\0\0\0\u01df\u01dd\1\0\0\0\u01e0"+
		"\u01e1\5\61\0\0\u01e1\u01e7\3\0\0\0\u01e2\u01e4\5\26\0\0\u01e3\u01e5\3"+
		"\66\33\0\u01e4\u01e3\1\0\0\0\u01e4\u01e5\1\0\0\0\u01e5\u01e6\1\0\0\0\u01e6"+
		"\u01e8\5\27\0\0\u01e7\u01e2\1\0\0\0\u01e7\u01e8\1\0\0\0\u01e8\65\1\0\0"+
		"\0\u01e9\u01ec\38\34\0\u01ea\u01ec\3<\36\0\u01eb\u01e9\1\0\0\0\u01eb\u01ea"+
		"\1\0\0\0\u01ec\67\1\0\0\0\u01ed\u01f2\3:\35\0\u01ee\u01ef\5\21\0\0\u01ef"+
		"\u01f1\3:\35\0\u01f0\u01ee\1\0\0\0\u01f1\u01f4\1\0\0\0\u01f2\u01f0\1\0"+
		"\0\0\u01f2\u01f3\1\0\0\0\u01f39\1\0\0\0\u01f4\u01f2\1\0\0\0\u01f5\u01f6"+
		"\5l\0\0\u01f6\u01f7\5\34\0\0\u01f7\u01f8\3<\36\0\u01f8;\1\0\0\0\u01f9"+
		"\u01fd\3\64\32\0\u01fa\u01fd\3\u00ba]\0\u01fb\u01fd\3>\37\0\u01fc\u01f9"+
		"\1\0\0\0\u01fc\u01fa\1\0\0\0\u01fc\u01fb\1\0\0\0\u01fd=\1\0\0\0\u01fe"+
		"\u0200\5\22\0\0\u01ff\u0201\3@ \0\u0200\u01ff\1\0\0\0\u0200\u0201\1\0"+
		"\0\0\u0201\u0203\1\0\0\0\u0202\u0204\5\21\0\0\u0203\u0202\1\0\0\0\u0203"+
		"\u0204\1\0\0\0\u0204\u0205\1\0\0\0\u0205\u0206\5\23\0\0\u0206?\1\0\0\0"+
		"\u0207\u020c\3<\36\0\u0208\u0209\5\21\0\0\u0209\u020b\3<\36\0\u020a\u0208"+
		"\1\0\0\0\u020b\u020e\1\0\0\0\u020c\u020a\1\0\0\0\u020c\u020d\1\0\0\0\u020d"+
		"A\1\0\0\0\u020e\u020c\1\0\0\0\u020f\u0213\5\22\0\0\u0210\u0212\3D\"\0"+
		"\u0211\u0210\1\0\0\0\u0212\u0215\1\0\0\0\u0213\u0211\1\0\0\0\u0213\u0214"+
		"\1\0\0\0\u0214\u0216\1\0\0\0\u0215\u0213\1\0\0\0\u0216\u0217\5\23\0\0"+
		"\u0217C\1\0\0\0\u0218\u0225\5\3\0\0\u0219\u021b\3\60\30\0\u021a\u0219"+
		"\1\0\0\0\u021b\u021e\1\0\0\0\u021c\u021a\1\0\0\0\u021c\u021d\1\0\0\0\u021d"+
		"\u021f\1\0\0\0\u021e\u021c\1\0\0\0\u021f\u0225\3F#\0\u0220\u0222\5\16"+
		"\0\0\u0221\u0220\1\0\0\0\u0221\u0222\1\0\0\0\u0222\u0223\1\0\0\0\u0223"+
		"\u0225\3\u0082A\0\u0224\u0218\1\0\0\0\u0224\u021c\1\0\0\0\u0224\u0221"+
		"\1\0\0\0\u0225E\1\0\0\0\u0226\u0230\3H$\0\u0227\u0228\5\30\0\0\u0228\u0229"+
		"\5l\0\0\u0229\u0230\3P(\0\u022a\u022b\5l\0\0\u022b\u0230\3R)\0\u022c\u0230"+
		"\3T*\0\u022d\u0230\3\f\6\0\u022e\u0230\3\16\7\0\u022f\u0226\1\0\0\0\u022f"+
		"\u0227\1\0\0\0\u022f\u022a\1\0\0\0\u022f\u022c\1\0\0\0\u022f\u022d\1\0"+
		"\0\0\u022f\u022e\1\0\0\0\u0230G\1\0\0\0\u0231\u0232\3\30\f\0\u0232\u0233"+
		"\5l\0\0\u0233\u0234\3J%\0\u0234I\1\0\0\0\u0235\u0236\3L&\0\u0236\u0237"+
		"\5\3\0\0\u0237\u023a\1\0\0\0\u0238\u023a\3N\'\0\u0239\u0235\1\0\0\0\u0239"+
		"\u0238\1\0\0\0\u023aK\1\0\0\0\u023b\u0240\3|>\0\u023c\u023d\5\21\0\0\u023d"+
		"\u023f\3z=\0\u023e\u023c\1\0\0\0\u023f\u0242\1\0\0\0\u0240\u023e\1\0\0"+
		"\0\u0240\u0241\1\0\0\0\u0241M\1\0\0\0\u0242\u0240\1\0\0\0\u0243\u0248"+
		"\3n\67\0\u0244\u0245\5\24\0\0\u0245\u0247\5\25\0\0\u0246\u0244\1\0\0\0"+
		"\u0247\u024a\1\0\0\0\u0248\u0246\1\0\0\0\u0248\u0249\1\0\0\0\u0249\u024d"+
		"\1\0\0\0\u024a\u0248\1\0\0\0\u024b\u024c\5\33\0\0\u024c\u024e\3\2\1\0"+
		"\u024d\u024b\1\0\0\0\u024d\u024e\1\0\0\0\u024e\u0251\1\0\0\0\u024f\u0252"+
		"\3\u0082A\0\u0250\u0252\5\3\0\0\u0251\u024f\1\0\0\0\u0251\u0250\1\0\0"+
		"\0\u0252O\1\0\0\0\u0253\u0256\3n\67\0\u0254\u0255\5\33\0\0\u0255\u0257"+
		"\3\2\1\0\u0256\u0254\1\0\0\0\u0256\u0257\1\0\0\0\u0257\u025a\1\0\0\0\u0258"+
		"\u025b\3\u0082A\0\u0259\u025b\5\3\0\0\u025a\u0258\1\0\0\0\u025a\u0259"+
		"\1\0\0\0\u025bQ\1\0\0\0\u025c\u025f\3n\67\0\u025d\u025e\5\33\0\0\u025e"+
		"\u0260\3\2\1\0\u025f\u025d\1\0\0\0\u025f\u0260\1\0\0\0\u0260\u0261\1\0"+
		"\0\0\u0261\u0262\3\u0082A\0\u0262S\1\0\0\0\u0263\u0264\3*\25\0\u0264\u0265"+
		"\3V+\0\u0265U\1\0\0\0\u0266\u0269\3\30\f\0\u0267\u0269\5\30\0\0\u0268"+
		"\u0266\1\0\0\0\u0268\u0267\1\0\0\0\u0269\u026a\1\0\0\0\u026a\u026b\5l"+
		"\0\0\u026b\u026f\3N\'\0\u026c\u026d\5l\0\0\u026d\u026f\3R)\0\u026e\u0268"+
		"\1\0\0\0\u026e\u026c\1\0\0\0\u026fW\1\0\0\0\u0270\u0274\5\22\0\0\u0271"+
		"\u0273\3Z-\0\u0272\u0271\1\0\0\0\u0273\u0276\1\0\0\0\u0274\u0272\1\0\0"+
		"\0\u0274\u0275\1\0\0\0\u0275\u0277\1\0\0\0\u0276\u0274\1\0\0\0\u0277\u0278"+
		"\5\23\0\0\u0278Y\1\0\0\0\u0279\u0282\5\3\0\0\u027a\u027c\3\60\30\0\u027b"+
		"\u027a\1\0\0\0\u027c\u027f\1\0\0\0\u027d\u027b\1\0\0\0\u027d\u027e\1\0"+
		"\0\0\u027e\u0280\1\0\0\0\u027f\u027d\1\0\0\0\u0280\u0282\3\\.\0\u0281"+
		"\u0279\1\0\0\0\u0281\u027d\1\0\0\0\u0282[\1\0\0\0\u0283\u028b\3^/\0\u0284"+
		"\u0285\5\30\0\0\u0285\u0286\5l\0\0\u0286\u028b\3j\65\0\u0287\u028b\3l"+
		"\66\0\u0288\u028b\3\f\6\0\u0289\u028b\3\16\7\0\u028a\u0283\1\0\0\0\u028a"+
		"\u0284\1\0\0\0\u028a\u0287\1\0\0\0\u028a\u0288\1\0\0\0\u028a\u0289\1\0"+
		"\0\0\u028b]\1\0\0\0\u028c\u028d\3\30\f\0\u028d\u028e\5l\0\0\u028e\u028f"+
		"\3`\60\0\u028f_\1\0\0\0\u0290\u0291\3b\61\0\u0291\u0292\5\3\0\0\u0292"+
		"\u0295\1\0\0\0\u0293\u0295\3h\64\0\u0294\u0290\1\0\0\0\u0294\u0293\1\0"+
		"\0\0\u0295a\1\0\0\0\u0296\u029b\3d\62\0\u0297\u0298\5\21\0\0\u0298\u029a"+
		"\3f\63\0\u0299\u0297\1\0\0\0\u029a\u029d\1\0\0\0\u029b\u0299\1\0\0\0\u029b"+
		"\u029c\1\0\0\0\u029cc\1\0\0\0\u029d\u029b\1\0\0\0\u029e\u029f\5\24\0\0"+
		"\u029f\u02a1\5\25\0\0\u02a0\u029e\1\0\0\0\u02a1\u02a4\1\0\0\0\u02a2\u02a0"+
		"\1\0\0\0\u02a2\u02a3\1\0\0\0\u02a3\u02a5\1\0\0\0\u02a4\u02a2\1\0\0\0\u02a5"+
		"\u02a6\5\34\0\0\u02a6\u02a7\3~?\0\u02a7e\1\0\0\0\u02a8\u02a9\5l\0\0\u02a9"+
		"\u02aa\3d\62\0\u02aag\1\0\0\0\u02ab\u02b0\3n\67\0\u02ac\u02ad\5\24\0\0"+
		"\u02ad\u02af\5\25\0\0\u02ae\u02ac\1\0\0\0\u02af\u02b2\1\0\0\0\u02b0\u02ae"+
		"\1\0\0\0\u02b0\u02b1\1\0\0\0\u02b1\u02b5\1\0\0\0\u02b2\u02b0\1\0\0\0\u02b3"+
		"\u02b4\5\33\0\0\u02b4\u02b6\3\2\1\0\u02b5\u02b3\1\0\0\0\u02b5\u02b6\1"+
		"\0\0\0\u02b6\u02b7\1\0\0\0\u02b7\u02b8\5\3\0\0\u02b8i\1\0\0\0\u02b9\u02bc"+
		"\3n\67\0\u02ba\u02bb\5\33\0\0\u02bb\u02bd\3\2\1\0\u02bc\u02ba\1\0\0\0"+
		"\u02bc\u02bd\1\0\0\0\u02bd\u02be\1\0\0\0\u02be\u02bf\5\3\0\0\u02bfk\1"+
		"\0\0\0\u02c0\u02c3\3*\25\0\u02c1\u02c4\3\30\f\0\u02c2\u02c4\5\30\0\0\u02c3"+
		"\u02c1\1\0\0\0\u02c3\u02c2\1\0\0\0\u02c4\u02c5\1\0\0\0\u02c5\u02c6\5l"+
		"\0\0\u02c6\u02c7\3h\64\0\u02c7m\1\0\0\0\u02c8\u02ca\5\26\0\0\u02c9\u02cb"+
		"\3p8\0\u02ca\u02c9\1\0\0\0\u02ca\u02cb\1\0\0\0\u02cb\u02cc\1\0\0\0\u02cc"+
		"\u02cd\5\27\0\0\u02cdo\1\0\0\0\u02ce\u02d0\3r9\0\u02cf\u02ce\1\0\0\0\u02d0"+
		"\u02d3\1\0\0\0\u02d1\u02cf\1\0\0\0\u02d1\u02d2\1\0\0\0\u02d2\u02d4\1\0"+
		"\0\0\u02d3\u02d1\1\0\0\0\u02d4\u02d5\3\30\f\0\u02d5\u02d6\3t:\0\u02d6"+
		"q\1\0\0\0\u02d7\u02da\3\64\32\0\u02d8\u02da\5\17\0\0\u02d9\u02d7\1\0\0"+
		"\0\u02d9\u02d8\1\0\0\0\u02das\1\0\0\0\u02db\u02de\3v;\0\u02dc\u02dd\5"+
		"\21\0\0\u02dd\u02df\3p8\0\u02de\u02dc\1\0\0\0\u02de\u02df\1\0\0\0\u02df"+
		"\u02e3\1\0\0\0\u02e0\u02e1\5+\0\0\u02e1\u02e3\3v;\0\u02e2\u02db\1\0\0"+
		"\0\u02e2\u02e0\1\0\0\0\u02e3u\1\0\0\0\u02e4\u02e9\5l\0\0\u02e5\u02e6\5"+
		"\24\0\0\u02e6\u02e8\5\25\0\0\u02e7\u02e5\1\0\0\0\u02e8\u02eb\1\0\0\0\u02e9"+
		"\u02e7\1\0\0\0\u02e9\u02ea\1\0\0\0\u02eaw\1\0\0\0\u02eb\u02e9\1\0\0\0"+
		"\u02ec\u02f1\3z=\0\u02ed\u02ee\5\21\0\0\u02ee\u02f0\3z=\0\u02ef\u02ed"+
		"\1\0\0\0\u02f0\u02f3\1\0\0\0\u02f1\u02ef\1\0\0\0\u02f1\u02f2\1\0\0\0\u02f2"+
		"y\1\0\0\0\u02f3\u02f1\1\0\0\0\u02f4\u02f5\5l\0\0\u02f5\u02f6\3|>\0\u02f6"+
		"{\1\0\0\0\u02f7\u02f8\5\24\0\0\u02f8\u02fa\5\25\0\0\u02f9\u02f7\1\0\0"+
		"\0\u02fa\u02fd\1\0\0\0\u02fb\u02f9\1\0\0\0\u02fb\u02fc\1\0\0\0\u02fc\u0300"+
		"\1\0\0\0\u02fd\u02fb\1\0\0\0\u02fe\u02ff\5\34\0\0\u02ff\u0301\3~?\0\u0300"+
		"\u02fe\1\0\0\0\u0300\u0301\1\0\0\0\u0301}\1\0\0\0\u0302\u0305\3\u0080"+
		"@\0\u0303\u0305\3\u00ba]\0\u0304\u0302\1\0\0\0\u0304\u0303\1\0\0\0\u0305"+
		"\177\1\0\0\0\u0306\u0312\5\22\0\0\u0307\u030c\3~?\0\u0308\u0309\5\21\0"+
		"\0\u0309\u030b\3~?\0\u030a\u0308\1\0\0\0\u030b\u030e\1\0\0\0\u030c\u030a"+
		"\1\0\0\0\u030c\u030d\1\0\0\0\u030d\u0310\1\0\0\0\u030e\u030c\1\0\0\0\u030f"+
		"\u0311\5\21\0\0\u0310\u030f\1\0\0\0\u0310\u0311\1\0\0\0\u0311\u0313\1"+
		"\0\0\0\u0312\u0307\1\0\0\0\u0312\u0313\1\0\0\0\u0313\u0314\1\0\0\0\u0314"+
		"\u0315\5\23\0\0\u0315\u0081\1\0\0\0\u0316\u031a\5\22\0\0\u0317\u0319\3"+
		"\u0084B\0\u0318\u0317\1\0\0\0\u0319\u031c\1\0\0\0\u031a\u0318\1\0\0\0"+
		"\u031a\u031b\1\0\0\0\u031b\u031d\1\0\0\0\u031c\u031a\1\0\0\0\u031d\u031e"+
		"\5\23\0\0\u031e\u0083\1\0\0\0\u031f\u0323\3\u0088D\0\u0320\u0323\3\n\5"+
		"\0\u0321\u0323\3\u0086C\0\u0322\u031f\1\0\0\0\u0322\u0320\1\0\0\0\u0322"+
		"\u0321\1\0\0\0\u0323\u0085\1\0\0\0\u0324\u0325\5l\0\0\u0325\u0327\5\63"+
		"\0\0\u0326\u0324\1\0\0\0\u0326\u0327\1\0\0\0\u0327\u0328\1\0\0\0\u0328"+
		"\u0329\3\u008aE\0\u0329\u0087\1\0\0\0\u032a\u032c\3r9\0\u032b\u032a\1"+
		"\0\0\0\u032c\u032f\1\0\0\0\u032d\u032b\1\0\0\0\u032d\u032e\1\0\0\0\u032e"+
		"\u0330\1\0\0\0\u032f\u032d\1\0\0\0\u0330\u0331\3\30\f\0\u0331\u0332\3"+
		"x<\0\u0332\u0333\5\3\0\0\u0333\u0089\1\0\0\0\u0334\u038b\3\u0082A\0\u0335"+
		"\u0336\59\0\0\u0336\u033c\3\u0082A\0\u0337\u033d\3\u008eG\0\u0338\u033a"+
		"\3\u008eG\0\u0339\u0338\1\0\0\0\u0339\u033a\1\0\0\0\u033a\u033b\1\0\0"+
		"\0\u033b\u033d\3\u009cN\0\u033c\u0337\1\0\0\0\u033c\u0339\1\0\0\0\u033d"+
		"\u038b\1\0\0\0\u033e\u033f\59\0\0\u033f\u0340\3\u009eO\0\u0340\u0342\3"+
		"\u0082A\0\u0341\u0343\3\u008eG\0\u0342\u0341\1\0\0\0\u0342\u0343\1\0\0"+
		"\0\u0343\u0345\1\0\0\0\u0344\u0346\3\u009cN\0\u0345\u0344\1\0\0\0\u0345"+
		"\u0346\1\0\0\0\u0346\u038b\1\0\0\0\u0347\u038b\5\3\0\0\u0348\u0349\5l"+
		"\0\0\u0349\u034a\5\63\0\0\u034a\u038b\3\u008aE\0\u034b\u034c\3\u008cF"+
		"\0\u034c\u034d\5\3\0\0\u034d\u038b\1\0\0\0\u034e\u034f\5\64\0\0\u034f"+
		"\u0350\3\u00c2a\0\u0350\u0353\3\u008aE\0\u0351\u0352\5\65\0\0\u0352\u0354"+
		"\3\u008aE\0\u0353\u0351\1\0\0\0\u0353\u0354\1\0\0\0\u0354\u038b\1\0\0"+
		"\0\u0355\u0356\5\2\0\0\u0356\u0359\3\u00ba]\0\u0357\u0358\5\63\0\0\u0358"+
		"\u035a\3\u00ba]\0\u0359\u0357\1\0\0\0\u0359\u035a\1\0\0\0\u035a\u035b"+
		"\1\0\0\0\u035b\u035c\5\3\0\0\u035c\u038b\1\0\0\0\u035d\u035e\5;\0\0\u035e"+
		"\u0362\3\u00c2a\0\u035f\u0361\3\u00a4R\0\u0360\u035f\1\0\0\0\u0361\u0364"+
		"\1\0\0\0\u0362\u0360\1\0\0\0\u0362\u0363\1\0\0\0\u0363\u038b\1\0\0\0\u0364"+
		"\u0362\1\0\0\0\u0365\u0366\5\67\0\0\u0366\u0367\3\u00c2a\0\u0367\u0368"+
		"\3\u008aE\0\u0368\u038b\1\0\0\0\u0369\u036a\58\0\0\u036a\u036b\3\u008a"+
		"E\0\u036b\u036c\5\67\0\0\u036c\u036d\3\u00c2a\0\u036d\u036e\5\3\0\0\u036e"+
		"\u038b\1\0\0\0\u036f\u0370\5\66\0\0\u0370\u0371\3\u00aeW\0\u0371\u0372"+
		"\3\u008aE\0\u0372\u038b\1\0\0\0\u0373\u0375\5=\0\0\u0374\u0376\5l\0\0"+
		"\u0375\u0374\1\0\0\0\u0375\u0376\1\0\0\0\u0376\u0377\1\0\0\0\u0377\u038b"+
		"\5\3\0\0\u0378\u037a\5>\0\0\u0379\u037b\5l\0\0\u037a\u0379\1\0\0\0\u037a"+
		"\u037b\1\0\0\0\u037b\u037c\1\0\0\0\u037c\u038b\5\3\0\0\u037d\u037f\5<"+
		"\0\0\u037e\u0380\3\u00ba]\0\u037f\u037e\1\0\0\0\u037f\u0380\1\0\0\0\u0380"+
		"\u0381\1\0\0\0\u0381\u038b\5\3\0\0\u0382\u0383\5\32\0\0\u0383\u0384\3"+
		"\u00ba]\0\u0384\u0385\5\3\0\0\u0385\u038b\1\0\0\0\u0386\u0387\5\36\0\0"+
		"\u0387\u0388\3\u00c2a\0\u0388\u0389\3\u0082A\0\u0389\u038b\1\0\0\0\u038a"+
		"\u0334\1\0\0\0\u038a\u0335\1\0\0\0\u038a\u033e\1\0\0\0\u038a\u0347\1\0"+
		"\0\0\u038a\u0348\1\0\0\0\u038a\u034b\1\0\0\0\u038a\u034e\1\0\0\0\u038a"+
		"\u0355\1\0\0\0\u038a\u035d\1\0\0\0\u038a\u0365\1\0\0\0\u038a\u0369\1\0"+
		"\0\0\u038a\u036f\1\0\0\0\u038a\u0373\1\0\0\0\u038a\u0378\1\0\0\0\u038a"+
		"\u037d\1\0\0\0\u038a\u0382\1\0\0\0\u038a\u0386\1\0\0\0\u038b\u008b\1\0"+
		"\0\0\u038c\u038d\3\u00ba]\0\u038d\u008d\1\0\0\0\u038e\u0392\3\u0090H\0"+
		"\u038f\u0391\3\u0090H\0\u0390\u038f\1\0\0\0\u0391\u0394\1\0\0\0\u0392"+
		"\u0390\1\0\0\0\u0392\u0393\1\0\0\0\u0393\u008f\1\0\0\0\u0394\u0392\1\0"+
		"\0\0\u0395\u0396\5?\0\0\u0396\u0397\5\26\0\0\u0397\u0398\3\u0092I\0\u0398"+
		"\u0399\5\27\0\0\u0399\u039a\3\u0082A\0\u039a\u0091\1\0\0\0\u039b\u039d"+
		"\3\u0094J\0\u039c\u039b\1\0\0\0\u039c\u039d\1\0\0\0\u039d\u039e\1\0\0"+
		"\0\u039e\u039f\3\u0096K\0\u039f\u03a0\3v;\0\u03a0\u0093\1\0\0\0\u03a1"+
		"\u03a3\3r9\0\u03a2\u03a1\1\0\0\0\u03a3\u03a4\1\0\0\0\u03a4\u03a2\1\0\0"+
		"\0\u03a4\u03a5\1\0\0\0\u03a5\u0095\1\0\0\0\u03a6\u03ac\3\u0098L\0\u03a7"+
		"\u03a8\3\u0098L\0\u03a8\u03a9\5N\0\0\u03a9\u03aa\3\u0096K\0\u03aa\u03ac"+
		"\1\0\0\0\u03ab\u03a6\1\0\0\0\u03ab\u03a7\1\0\0\0\u03ac\u0097\1\0\0\0\u03ad"+
		"\u03af\3\u009aM\0\u03ae\u03b0\3\36\17\0\u03af\u03ae\1\0\0\0\u03af\u03b0"+
		"\1\0\0\0\u03b0\u03b8\1\0\0\0\u03b1\u03b2\5\6\0\0\u03b2\u03b4\3\u009aM"+
		"\0\u03b3\u03b5\3\36\17\0\u03b4\u03b3\1\0\0\0\u03b4\u03b5\1\0\0\0\u03b5"+
		"\u03b7\1\0\0\0\u03b6\u03b1\1\0\0\0\u03b7\u03ba\1\0\0\0\u03b8\u03b6\1\0"+
		"\0\0\u03b8\u03b9\1\0\0\0\u03b9\u0099\1\0\0\0\u03ba\u03b8\1\0\0\0\u03bb"+
		"\u03c0\5l\0\0\u03bc\u03bd\5\6\0\0\u03bd\u03bf\5l\0\0\u03be\u03bc\1\0\0"+
		"\0\u03bf\u03c2\1\0\0\0\u03c0\u03be\1\0\0\0\u03c0\u03c1\1\0\0\0\u03c1\u009b"+
		"\1\0\0\0\u03c2\u03c0\1\0\0\0\u03c3\u03c4\5:\0\0\u03c4\u03c5\3\u0082A\0"+
		"\u03c5\u009d\1\0\0\0\u03c6\u03c7\5\26\0\0\u03c7\u03c9\3\u00a0P\0\u03c8"+
		"\u03ca\5\3\0\0\u03c9\u03c8\1\0\0\0\u03c9\u03ca\1\0\0\0\u03ca\u03cb\1\0"+
		"\0\0\u03cb\u03cc\5\27\0\0\u03cc\u009f\1\0\0\0\u03cd\u03d2\3\u00a2Q\0\u03ce"+
		"\u03cf\5\3\0\0\u03cf\u03d1\3\u00a2Q\0\u03d0\u03ce\1\0\0\0\u03d1\u03d4"+
		"\1\0\0\0\u03d2\u03d0\1\0\0\0\u03d2\u03d3\1\0\0\0\u03d3\u00a1\1\0\0\0\u03d4"+
		"\u03d2\1\0\0\0\u03d5\u03d7\3r9\0\u03d6\u03d5\1\0\0\0\u03d7\u03da\1\0\0"+
		"\0\u03d8\u03d6\1\0\0\0\u03d8\u03d9\1\0\0\0\u03d9\u03db\1\0\0\0\u03da\u03d8"+
		"\1\0\0\0\u03db\u03dc\3\34\16\0\u03dc\u03dd\3v;\0\u03dd\u03de\5\34\0\0"+
		"\u03de\u03df\3\u00ba]\0\u03df\u00a3\1\0\0\0\u03e0\u03e2\3\u00a6S\0\u03e1"+
		"\u03e0\1\0\0\0\u03e2\u03e5\1\0\0\0\u03e3\u03e1\1\0\0\0\u03e3\u03e4\1\0"+
		"\0\0\u03e4\u00a5\1\0\0\0\u03e5\u03e3\1\0\0\0\u03e6\u03ea\3\u00a8T\0\u03e7"+
		"\u03e9\3\u0084B\0\u03e8\u03e7\1\0\0\0\u03e9\u03ec\1\0\0\0\u03ea\u03e8"+
		"\1\0\0\0\u03ea\u03eb\1\0\0\0\u03eb\u00a7\1\0\0\0\u03ec\u03ea\1\0\0\0\u03ed"+
		"\u03f1\3\u00aaU\0\u03ee\u03f0\3\u00aaU\0\u03ef\u03ee\1\0\0\0\u03f0\u03f3"+
		"\1\0\0\0\u03f1\u03ef\1\0\0\0\u03f1\u03f2\1\0\0\0\u03f2\u00a9\1\0\0\0\u03f3"+
		"\u03f1\1\0\0\0\u03f4\u03f5\5@\0\0\u03f5\u03f6\3\u00ba]\0\u03f6\u03f7\5"+
		"\63\0\0\u03f7\u03ff\1\0\0\0\u03f8\u03f9\5@\0\0\u03f9\u03fa\3\u00acV\0"+
		"\u03fa\u03fb\5\63\0\0\u03fb\u03ff\1\0\0\0\u03fc\u03fd\5\62\0\0\u03fd\u03ff"+
		"\5\63\0\0\u03fe\u03f4\1\0\0\0\u03fe\u03f8\1\0\0\0\u03fe\u03fc\1\0\0\0"+
		"\u03ff\u00ab\1\0\0\0\u0400\u0401\5l\0\0\u0401\u00ad\1\0\0\0\u0402\u040d"+
		"\3\u00b0X\0\u0403\u0404\3\u00b6[\0\u0404\u0406\5\3\0\0\u0405\u0407\3\u00ba"+
		"]\0\u0406\u0405\1\0\0\0\u0406\u0407\1\0\0\0\u0407\u0408\1\0\0\0\u0408"+
		"\u040a\5\3\0\0\u0409\u040b\3\u00b8\\\0\u040a\u0409\1\0\0\0\u040a\u040b"+
		"\1\0\0\0\u040b\u040d\1\0\0\0\u040c\u0402\1\0\0\0\u040c\u0403\1\0\0\0\u040d"+
		"\u00af\1\0\0\0\u040e\u0410\3r9\0\u040f\u040e\1\0\0\0\u0410\u0413\1\0\0"+
		"\0\u0411\u040f\1\0\0\0\u0411\u0412\1\0\0\0\u0412\u0414\1\0\0\0\u0413\u0411"+
		"\1\0\0\0\u0414\u0415\3\30\f\0\u0415\u0416\3v;\0\u0416\u0417\3\u00b2Y\0"+
		"\u0417\u00b1\1\0\0\0\u0418\u0419\3\u00b4Z\0\u0419\u041b\5\3\0\0\u041a"+
		"\u041c\3\u00ba]\0\u041b\u041a\1\0\0\0\u041b\u041c\1\0\0\0\u041c\u041d"+
		"\1\0\0\0\u041d\u041f\5\3\0\0\u041e\u0420\3\u00b8\\\0\u041f\u041e\1\0\0"+
		"\0\u041f\u0420\1\0\0\0\u0420\u0424\1\0\0\0\u0421\u0422\5\63\0\0\u0422"+
		"\u0424\3\u00ba]\0\u0423\u0418\1\0\0\0\u0423\u0421\1\0\0\0\u0424\u00b3"+
		"\1\0\0\0\u0425\u0426\5\34\0\0\u0426\u0428\3~?\0\u0427\u0425\1\0\0\0\u0427"+
		"\u0428\1\0\0\0\u0428\u042d\1\0\0\0\u0429\u042a\5\21\0\0\u042a\u042c\3"+
		"z=\0\u042b\u0429\1\0\0\0\u042c\u042f\1\0\0\0\u042d\u042b\1\0\0\0\u042d"+
		"\u042e\1\0\0\0\u042e\u00b5\1\0\0\0\u042f\u042d\1\0\0\0\u0430\u0435\3\u008c"+
		"F\0\u0431\u0432\5\21\0\0\u0432\u0434\3\u008cF\0\u0433\u0431\1\0\0\0\u0434"+
		"\u0437\1\0\0\0\u0435\u0433\1\0\0\0\u0435\u0436\1\0\0\0\u0436\u00b7\1\0"+
		"\0\0\u0437\u0435\1\0\0\0\u0438\u043d\3\u008cF\0\u0439\u043a\5\21\0\0\u043a"+
		"\u043c\3\u008cF\0\u043b\u0439\1\0\0\0\u043c\u043f\1\0\0\0\u043d\u043b"+
		"\1\0\0\0\u043d\u043e\1\0\0\0\u043e\u00b9\1\0\0\0\u043f\u043d\1\0\0\0\u0440"+
		"\u0441\6]\uffff\0\u0441\u0442\5\26\0\0\u0442\u0443\3\30\f\0\u0443\u0444"+
		"\5\27\0\0\u0444\u0445\3\u00ba]\0\u0445\u0446\6]\uffff\0\u0446\u0457\1"+
		"\0\0\0\u0447\u0448\7\2\0\0\u0448\u0449\3\u00ba]\0\u0449\u044a\6]\uffff"+
		"\0\u044a\u0457\1\0\0\0\u044b\u044c\7\3\0\0\u044c\u044d\3\u00ba]\0\u044d"+
		"\u044e\6]\uffff\0\u044e\u0457\1\0\0\0\u044f\u0450\3\u00c0`\0\u0450\u0451"+
		"\6]\uffff\0\u0451\u0457\1\0\0\0\u0452\u0453\5E\0\0\u0453\u0454\3\u00ca"+
		"e\0\u0454\u0455\6]\uffff\0\u0455\u0457\1\0\0\0\u0456\u0440\1\0\0\0\u0456"+
		"\u0447\1\0\0\0\u0456\u044b\1\0\0\0\u0456\u044f\1\0\0\0\u0456\u0452\1\0"+
		"\0\0\u0457\u04d6\1\0\0\0\u0458\u0459\4]\0\1\u0459\u045a\7\4\0\0\u045a"+
		"\u045b\3\u00ba]\0\u045b\u045c\6]\uffff\0\u045c\u04d5\1\0\0\0\u045d\u045e"+
		"\4]\1\1\u045e\u045f\7\5\0\0\u045f\u0460\3\u00ba]\0\u0460\u0461\6]\uffff"+
		"\0\u0461\u04d5\1\0\0\0\u0462\u0463\4]\2\1\u0463\u0464\7\6\0\0\u0464\u0465"+
		"\3\u00ba]\0\u0465\u0466\6]\uffff\0\u0466\u04d5\1\0\0\0\u0467\u0468\4]"+
		"\3\1\u0468\u0469\7\7\0\0\u0469\u046a\3\u00ba]\0\u046a\u046b\6]\uffff\0"+
		"\u046b\u04d5\1\0\0\0\u046c\u046d\4]\4\1\u046d\u046e\7\b\0\0\u046e\u046f"+
		"\3\u00ba]\0\u046f\u0470\6]\uffff\0\u0470\u04d5\1\0\0\0\u0471\u0472\4]"+
		"\5\1\u0472\u0473\5L\0\0\u0473\u0474\3\u00ba]\0\u0474\u0475\6]\uffff\0"+
		"\u0475\u04d5\1\0\0\0\u0476\u0477\4]\6\1\u0477\u0478\5M\0\0\u0478\u0479"+
		"\3\u00ba]\0\u0479\u047a\6]\uffff\0\u047a\u04d5\1\0\0\0\u047b\u047c\4]"+
		"\7\1\u047c\u047d\5N\0\0\u047d\u047e\3\u00ba]\0\u047e\u047f\6]\uffff\0"+
		"\u047f\u04d5\1\0\0\0\u0480\u0481\4]\b\1\u0481\u0482\5O\0\0\u0482\u0483"+
		"\3\u00ba]\0\u0483\u0484\6]\uffff\0\u0484\u04d5\1\0\0\0\u0485\u0486\4]"+
		"\t\1\u0486\u0487\5P\0\0\u0487\u0488\3\u00ba]\0\u0488\u0489\6]\uffff\0"+
		"\u0489\u04d5\1\0\0\0\u048a\u048b\4]\n\1\u048b\u048c\5)\0\0\u048c\u048d"+
		"\3\u00ba]\0\u048d\u048e\5\63\0\0\u048e\u048f\3\u00ba]\0\u048f\u0490\6"+
		"]\uffff\0\u0490\u04d5\1\0\0\0\u0491\u0492\4]\13\1\u0492\u0493\5\6\0\0"+
		"\u0493\u0494\5l\0\0\u0494\u04d5\6]\uffff\0\u0495\u0496\4]\f\1\u0496\u0497"+
		"\5\6\0\0\u0497\u0498\5,\0\0\u0498\u04d5\6]\uffff\0\u0499\u049a\4]\r\1"+
		"\u049a\u049b\5\6\0\0\u049b\u049c\5-\0\0\u049c\u049e\5\26\0\0\u049d\u049f"+
		"\3\u00bc^\0\u049e\u049d\1\0\0\0\u049e\u049f\1\0\0\0\u049f\u04a0\1\0\0"+
		"\0\u04a0\u04a1\5\27\0\0\u04a1\u04d5\6]\uffff\0\u04a2\u04a3\4]\16\1\u04a3"+
		"\u04a4\5\6\0\0\u04a4\u04a5\5E\0\0\u04a5\u04a6\5l\0\0\u04a6\u04a8\5\26"+
		"\0\0\u04a7\u04a9\3\u00bc^\0\u04a8\u04a7\1\0\0\0\u04a8\u04a9\1\0\0\0\u04a9"+
		"\u04aa\1\0\0\0\u04aa\u04ab\5\27\0\0\u04ab\u04d5\6]\uffff\0\u04ac\u04ad"+
		"\4]\17\1\u04ad\u04ae\5\6\0\0\u04ae\u04af\5-\0\0\u04af\u04b0\5\6\0\0\u04b0"+
		"\u04b2\5l\0\0\u04b1\u04b3\3\u00c4b\0\u04b2\u04b1\1\0\0\0\u04b2\u04b3\1"+
		"\0\0\0\u04b3\u04b4\1\0\0\0\u04b4\u04d5\6]\uffff\0\u04b5\u04b6\4]\20\1"+
		"\u04b6\u04b7\5\6\0\0\u04b7\u04b8\3\u00d4j\0\u04b8\u04b9\6]\uffff\0\u04b9"+
		"\u04d5\1\0\0\0\u04ba\u04bb\4]\21\1\u04bb\u04bc\5\24\0\0\u04bc\u04bd\3"+
		"\u00ba]\0\u04bd\u04be\5\25\0\0\u04be\u04bf\6]\uffff\0\u04bf\u04d5\1\0"+
		"\0\0\u04c0\u04c1\4]\22\1\u04c1\u04c2\7\t\0\0\u04c2\u04d5\6]\uffff\0\u04c3"+
		"\u04c4\4]\23\1\u04c4\u04c6\5\26\0\0\u04c5\u04c7\3\u00bc^\0\u04c6\u04c5"+
		"\1\0\0\0\u04c6\u04c7\1\0\0\0\u04c7\u04c8\1\0\0\0\u04c8\u04c9\5\27\0\0"+
		"\u04c9\u04d5\6]\uffff\0\u04ca\u04cb\4]\24\1\u04cb\u04cc\5c\0\0\u04cc\u04cd"+
		"\3\30\f\0\u04cd\u04ce\6]\uffff\0\u04ce\u04d5\1\0\0\0\u04cf\u04d0\4]\25"+
		"\1\u04d0\u04d1\3\u00be_\0\u04d1\u04d2\3\u00ba]\0\u04d2\u04d3\6]\uffff"+
		"\0\u04d3\u04d5\1\0\0\0\u04d4\u0458\1\0\0\0\u04d4\u045d\1\0\0\0\u04d4\u0462"+
		"\1\0\0\0\u04d4\u0467\1\0\0\0\u04d4\u046c\1\0\0\0\u04d4\u0471\1\0\0\0\u04d4"+
		"\u0476\1\0\0\0\u04d4\u047b\1\0\0\0\u04d4\u0480\1\0\0\0\u04d4\u0485\1\0"+
		"\0\0\u04d4\u048a\1\0\0\0\u04d4\u0491\1\0\0\0\u04d4\u0495\1\0\0\0\u04d4"+
		"\u0499\1\0\0\0\u04d4\u04a2\1\0\0\0\u04d4\u04ac\1\0\0\0\u04d4\u04b5\1\0"+
		"\0\0\u04d4\u04ba\1\0\0\0\u04d4\u04c0\1\0\0\0\u04d4\u04c3\1\0\0\0\u04d4"+
		"\u04ca\1\0\0\0\u04d4\u04cf\1\0\0\0\u04d5\u04d8\1\0\0\0\u04d6\u04d4\1\0"+
		"\0\0\u04d6\u04d7\1\0\0\0\u04d7\u00bb\1\0\0\0\u04d8\u04d6\1\0\0\0\u04d9"+
		"\u04de\3\u00ba]\0\u04da\u04db\5\21\0\0\u04db\u04dd\3\u00ba]\0\u04dc\u04da"+
		"\1\0\0\0\u04dd\u04e0\1\0\0\0\u04de\u04dc\1\0\0\0\u04de\u04df\1\0\0\0\u04df"+
		"\u00bd\1\0\0\0\u04e0\u04de\1\0\0\0\u04e1\u04ee\5\34\0\0\u04e2\u04ee\5"+
		"R\0\0\u04e3\u04ee\5S\0\0\u04e4\u04ee\5T\0\0\u04e5\u04ee\5U\0\0\u04e6\u04ee"+
		"\5V\0\0\u04e7\u04ee\5W\0\0\u04e8\u04ee\5Q\0\0\u04e9\u04ee\5X\0\0\u04ea"+
		"\u04ee\5]\0\0\u04eb\u04ee\5[\0\0\u04ec\u04ee\5\\\0\0\u04ed\u04e1\1\0\0"+
		"\0\u04ed\u04e2\1\0\0\0\u04ed\u04e3\1\0\0\0\u04ed\u04e4\1\0\0\0\u04ed\u04e5"+
		"\1\0\0\0\u04ed\u04e6\1\0\0\0\u04ed\u04e7\1\0\0\0\u04ed\u04e8\1\0\0\0\u04ed"+
		"\u04e9\1\0\0\0\u04ed\u04ea\1\0\0\0\u04ed\u04eb\1\0\0\0\u04ed\u04ec\1\0"+
		"\0\0\u04ee\u00bf\1\0\0\0\u04ef\u0519\3\u00eew\0\u04f0\u0519\3\u00c2a\0"+
		"\u04f1\u04f3\5,\0\0\u04f2\u04f4\3\u00c4b\0\u04f3\u04f2\1\0\0\0\u04f3\u04f4"+
		"\1\0\0\0\u04f4\u0519\1\0\0\0\u04f5\u04f6\5-\0\0\u04f6\u0519\3\u00c6c\0"+
		"\u04f7\u04f8\5E\0\0\u04f8\u0519\3\u00cae\0\u04f9\u04fd\3\"\21\0\u04fa"+
		"\u04fe\3\u00c8d\0\u04fb\u04fc\5,\0\0\u04fc\u04fe\3\u00c4b\0\u04fd\u04fa"+
		"\1\0\0\0\u04fd\u04fb\1\0\0\0\u04fe\u0519\1\0\0\0\u04ff\u0504\5l\0\0\u0500"+
		"\u0501\5\6\0\0\u0501\u0503\5l\0\0\u0502\u0500\1\0\0\0\u0503\u0506\1\0"+
		"\0\0\u0504\u0502\1\0\0\0\u0504\u0505\1\0\0\0\u0505\u0508\1\0\0\0\u0506"+
		"\u0504\1\0\0\0\u0507\u0509\3\u00d2i\0\u0508\u0507\1\0\0\0\u0508\u0509"+
		"\1\0\0\0\u0509\u0519\1\0\0\0\u050a\u050f\3\32\r\0\u050b\u050c\5\24\0\0"+
		"\u050c\u050e\5\25\0\0\u050d\u050b\1\0\0\0\u050e\u0511\1\0\0\0\u050f\u050d"+
		"\1\0\0\0\u050f\u0510\1\0\0\0\u0510\u0512\1\0\0\0\u0511\u050f\1\0\0\0\u0512"+
		"\u0513\5\6\0\0\u0513\u0514\5\b\0\0\u0514\u0519\1\0\0\0\u0515\u0516\5\30"+
		"\0\0\u0516\u0517\5\6\0\0\u0517\u0519\5\b\0\0\u0518\u04ef\1\0\0\0\u0518"+
		"\u04f0\1\0\0\0\u0518\u04f1\1\0\0\0\u0518\u04f5\1\0\0\0\u0518\u04f7\1\0"+
		"\0\0\u0518\u04f9\1\0\0\0\u0518\u04ff\1\0\0\0\u0518\u050a\1\0\0\0\u0518"+
		"\u0515\1\0\0\0\u0519\u00c1\1\0\0\0\u051a\u051b\5\26\0\0\u051b\u051c\3"+
		"\u00ba]\0\u051c\u051d\5\27\0\0\u051d\u00c3\1\0\0\0\u051e\u0527\5\26\0"+
		"\0\u051f\u0524\3\u00ba]\0\u0520\u0521\5\21\0\0\u0521\u0523\3\u00ba]\0"+
		"\u0522\u0520\1\0\0\0\u0523\u0526\1\0\0\0\u0524\u0522\1\0\0\0\u0524\u0525"+
		"\1\0\0\0\u0525\u0528\1\0\0\0\u0526\u0524\1\0\0\0\u0527\u051f\1\0\0\0\u0527"+
		"\u0528\1\0\0\0\u0528\u0529\1\0\0\0\u0529\u052a\5\27\0\0\u052a\u00c5\1"+
		"\0\0\0\u052b\u0532\3\u00c4b\0\u052c\u052d\5\6\0\0\u052d\u052f\5l\0\0\u052e"+
		"\u0530\3\u00c4b\0\u052f\u052e\1\0\0\0\u052f\u0530\1\0\0\0\u0530\u0532"+
		"\1\0\0\0\u0531\u052b\1\0\0\0\u0531\u052c\1\0\0\0\u0532\u00c7\1\0\0\0\u0533"+
		"\u0534\5-\0\0\u0534\u0538\3\u00c6c\0\u0535\u0536\5l\0\0\u0536\u0538\3"+
		"\u00c4b\0\u0537\u0533\1\0\0\0\u0537\u0535\1\0\0\0\u0538\u00c9\1\0\0\0"+
		"\u0539\u053a\3\"\21\0\u053a\u053b\3\u00ccf\0\u053b\u053c\3\u00ceg\0\u053c"+
		"\u0543\1\0\0\0\u053d\u0540\3\u00ccf\0\u053e\u0541\3\u00ceg\0\u053f\u0541"+
		"\3\u00d0h\0\u0540\u053e\1\0\0\0\u0540\u053f\1\0\0\0\u0541\u0543\1\0\0"+
		"\0\u0542\u0539\1\0\0\0\u0542\u053d\1\0\0\0\u0543\u00cb\1\0\0\0\u0544\u0546"+
		"\5l\0\0\u0545\u0547\3&\23\0\u0546\u0545\1\0\0\0\u0546\u0547\1\0\0\0\u0547"+
		"\u054f\1\0\0\0\u0548\u0549\5\6\0\0\u0549\u054b\5l\0\0\u054a\u054c\3&\23"+
		"\0\u054b\u054a\1\0\0\0\u054b\u054c\1\0\0\0\u054c\u054e\1\0\0\0\u054d\u0548"+
		"\1\0\0\0\u054e\u0551\1\0\0\0\u054f\u054d\1\0\0\0\u054f\u0550\1\0\0\0\u0550"+
		"\u00cd\1\0\0\0\u0551\u054f\1\0\0\0\u0552\u0554\3\u00c4b\0\u0553\u0555"+
		"\3B!\0\u0554\u0553\1\0\0\0\u0554\u0555\1\0\0\0\u0555\u00cf\1\0\0\0\u0556"+
		"\u0570\5\24\0\0\u0557\u0558\5\24\0\0\u0558\u055a\5\25\0\0\u0559\u0557"+
		"\1\0\0\0\u055a\u055d\1\0\0\0\u055b\u0559\1\0\0\0\u055b\u055c\1\0\0\0\u055c"+
		"\u055e\1\0\0\0\u055d\u055b\1\0\0\0\u055e\u0571\3\u0080@\0\u055f\u0566"+
		"\3\u00ba]\0\u0560\u0561\5\24\0\0\u0561\u0562\3\u00ba]\0\u0562\u0563\5"+
		"\25\0\0\u0563\u0565\1\0\0\0\u0564\u0560\1\0\0\0\u0565\u0568\1\0\0\0\u0566"+
		"\u0564\1\0\0\0\u0566\u0567\1\0\0\0\u0567\u056d\1\0\0\0\u0568\u0566\1\0"+
		"\0\0\u0569\u056a\5\24\0\0\u056a\u056c\5\25\0\0\u056b\u0569\1\0\0\0\u056c"+
		"\u056f\1\0\0\0\u056d\u056b\1\0\0\0\u056d\u056e\1\0\0\0\u056e\u0571\1\0"+
		"\0\0\u056f\u056d\1\0\0\0\u0570\u055b\1\0\0\0\u0570\u055f\1\0\0\0\u0571"+
		"\u0572\1\0\0\0\u0572\u0573\5\25\0\0\u0573\u00d1\1\0\0\0\u0574\u057f\5"+
		"\24\0\0\u0575\u0576\5\24\0\0\u0576\u0578\5\25\0\0\u0577\u0575\1\0\0\0"+
		"\u0578\u057b\1\0\0\0\u0579\u0577\1\0\0\0\u0579\u057a\1\0\0\0\u057a\u057c"+
		"\1\0\0\0\u057b\u0579\1\0\0\0\u057c\u057d\5\6\0\0\u057d\u0580\5\b\0\0\u057e"+
		"\u0580\3\u00ba]\0\u057f\u0579\1\0\0\0\u057f\u057e\1\0\0\0\u0580\u0581"+
		"\1\0\0\0\u0581\u0591\5\25\0\0\u0582\u0591\3\u00c4b\0\u0583\u058e\5\6\0"+
		"\0\u0584\u058f\5\b\0\0\u0585\u058f\3\u00d4j\0\u0586\u058f\5,\0\0\u0587"+
		"\u0588\5-\0\0\u0588\u058f\3\u00c4b\0\u0589\u058b\5E\0\0\u058a\u058c\3"+
		"\"\21\0\u058b\u058a\1\0\0\0\u058b\u058c\1\0\0\0\u058c\u058d\1\0\0\0\u058d"+
		"\u058f\3\u00d6k\0\u058e\u0584\1\0\0\0\u058e\u0585\1\0\0\0\u058e\u0586"+
		"\1\0\0\0\u058e\u0587\1\0\0\0\u058e\u0589\1\0\0\0\u058f\u0591\1\0\0\0\u0590"+
		"\u0574\1\0\0\0\u0590\u0582\1\0\0\0\u0590\u0583\1\0\0\0\u0591\u00d3\1\0"+
		"\0\0\u0592\u0593\3\"\21\0\u0593\u0594\3\u00c8d\0\u0594\u00d5\1\0\0\0\u0595"+
		"\u0597\5l\0\0\u0596\u0598\3(\24\0\u0597\u0596\1\0\0\0\u0597\u0598\1\0"+
		"\0\0\u0598\u0599\1\0\0\0\u0599\u059a\3\u00ceg\0\u059a\u00d7\1\0\0\0\u059b"+
		"\u059c\5\6\0\0\u059c\u059e\5l\0\0\u059d\u059f\3\u00c4b\0\u059e\u059d\1"+
		"\0\0\0\u059e\u059f\1\0\0\0\u059f\u05b1\1\0\0\0\u05a0\u05a1\5\6\0\0\u05a1"+
		"\u05b1\3\u00d4j\0\u05a2\u05a3\5\6\0\0\u05a3\u05b1\5,\0\0\u05a4\u05a5\5"+
		"\6\0\0\u05a5\u05a6\5-\0\0\u05a6\u05b1\3\u00c6c\0\u05a7\u05a8\5\6\0\0\u05a8"+
		"\u05aa\5E\0\0\u05a9\u05ab\3\"\21\0\u05aa\u05a9\1\0\0\0\u05aa\u05ab\1\0"+
		"\0\0\u05ab\u05ac\1\0\0\0\u05ac\u05b1\3\u00d6k\0\u05ad\u05af\3\u00ba]\0"+
		"\u05ae\u05ad\1\0\0\0\u05ae\u05af\1\0\0\0\u05af\u05b1\1\0\0\0\u05b0\u059b"+
		"\1\0\0\0\u05b0\u05a0\1\0\0\0\u05b0\u05a2\1\0\0\0\u05b0\u05a4\1\0\0\0\u05b0"+
		"\u05a7\1\0\0\0\u05b0\u05ae\1\0\0\0\u05b1\u00d9\1\0\0\0\u05b2\u05b4\5\22"+
		"\0\0\u05b3\u05b5\3\u00dcn\0\u05b4\u05b3\1\0\0\0\u05b4\u05b5\1\0\0\0\u05b5"+
		"\u05b7\1\0\0\0\u05b6\u05b8\5\21\0\0\u05b7\u05b6\1\0\0\0\u05b7\u05b8\1"+
		"\0\0\0\u05b8\u05ba\1\0\0\0\u05b9\u05bb\3\u00e0p\0\u05ba\u05b9\1\0\0\0"+
		"\u05ba\u05bb\1\0\0\0\u05bb\u05bc\1\0\0\0\u05bc\u05bd\5\23\0\0\u05bd\u00db"+
		"\1\0\0\0\u05be\u05c0\3\u00deo\0\u05bf\u05be\1\0\0\0\u05c0\u05c1\1\0\0"+
		"\0\u05c1\u05bf\1\0\0\0\u05c1\u05c2\1\0\0\0\u05c2\u00dd\1\0\0\0\u05c3\u05c5"+
		"\3\62\31\0\u05c4\u05c3\1\0\0\0\u05c4\u05c5\1\0\0\0\u05c5\u05c6\1\0\0\0"+
		"\u05c6\u05c8\5l\0\0\u05c7\u05c9\3\u00c4b\0\u05c8\u05c7\1\0\0\0\u05c8\u05c9"+
		"\1\0\0\0\u05c9\u05cb\1\0\0\0\u05ca\u05cc\3B!\0\u05cb\u05ca\1\0\0\0\u05cb"+
		"\u05cc\1\0\0\0\u05cc\u00df\1\0\0\0\u05cd\u05d1\5\3\0\0\u05ce\u05d0\3D"+
		"\"\0\u05cf\u05ce\1\0\0\0\u05d0\u05d3\1\0\0\0\u05d1\u05cf\1\0\0\0\u05d1"+
		"\u05d2\1\0\0\0\u05d2\u00e1\1\0\0\0\u05d3\u05d1\1\0\0\0\u05d4\u05d6\5\22"+
		"\0\0\u05d5\u05d7\3\u00e4r\0\u05d6\u05d5\1\0\0\0\u05d6\u05d7\1\0\0\0\u05d7"+
		"\u05d8\1\0\0\0\u05d8\u05d9\5\23\0\0\u05d9\u00e3\1\0\0\0\u05da\u05dc\3"+
		"\u00e6s\0\u05db\u05da\1\0\0\0\u05dc\u05dd\1\0\0\0\u05dd\u05db\1\0\0\0"+
		"\u05dd\u05de\1\0\0\0\u05de\u00e5\1\0\0\0\u05df\u05e1\3\60\30\0\u05e0\u05df"+
		"\1\0\0\0\u05e1\u05e4\1\0\0\0\u05e2\u05e0\1\0\0\0\u05e2\u05e3\1\0\0\0\u05e3"+
		"\u05e5\1\0\0\0\u05e4\u05e2\1\0\0\0\u05e5\u05e6\3\u00e8t\0\u05e6\u00e7"+
		"\1\0\0\0\u05e7\u05e8\3\30\f\0\u05e8\u05e9\5l\0\0\u05e9\u05ea\3\u00eau"+
		"\0\u05ea\u05eb\5\3\0\0\u05eb\u05f1\1\0\0\0\u05ec\u05f1\3\f\6\0\u05ed\u05f1"+
		"\3\16\7\0\u05ee\u05f1\3\22\t\0\u05ef\u05f1\3\26\13\0\u05f0\u05e7\1\0\0"+
		"\0\u05f0\u05ec\1\0\0\0\u05f0\u05ed\1\0\0\0\u05f0\u05ee\1\0\0\0\u05f0\u05ef"+
		"\1\0\0\0\u05f1\u00e9\1\0\0\0\u05f2\u05f5\3\u00ecv\0\u05f3\u05f5\3b\61"+
		"\0\u05f4\u05f2\1\0\0\0\u05f4\u05f3\1\0\0\0\u05f5\u00eb\1\0\0\0\u05f6\u05f7"+
		"\5\26\0\0\u05f7\u05fa\5\27\0\0\u05f8\u05f9\5\24\0\0\u05f9\u05fb\5\25\0"+
		"\0\u05fa\u05f8\1\0\0\0\u05fa\u05fb\1\0\0\0\u05fb\u05fe\1\0\0\0\u05fc\u05fd"+
		"\5\62\0\0\u05fd\u05ff\3<\36\0\u05fe\u05fc\1\0\0\0\u05fe\u05ff\1\0\0\0"+
		"\u05ff\u00ed\1\0\0\0\u0600\u0607\3\u00f0x\0\u0601\u0607\5h\0\0\u0602\u0607"+
		"\5i\0\0\u0603\u0607\5j\0\0\u0604\u0607\3\u00f2y\0\u0605\u0607\5k\0\0\u0606"+
		"\u0600\1\0\0\0\u0606\u0601\1\0\0\0\u0606\u0602\1\0\0\0\u0606\u0603\1\0"+
		"\0\0\u0606\u0604\1\0\0\0\u0606\u0605\1\0\0\0\u0607\u00ef\1\0\0\0\u0608"+
		"\u0609\7\n\0\0\u0609\u00f1\1\0\0\0\u060a\u060b\7\13\0\0\u060b\u00f3\1"+
		"\0\0\0\u00b5\u00f9\u0101\u0105\u010b\u0110\u0116\u011b\u0122\u0127\u012d"+
		"\u0132\u0137\u013b\u013f\u0144\u0148\u014c\u0154\u015b\u015f\u016d\u0175"+
		"\u0178\u017e\u0183\u0187\u0190\u0199\u019b\u01a6\u01ac\u01b1\u01b9\u01c1"+
		"\u01c8\u01d7\u01dd\u01e4\u01e7\u01eb\u01f2\u01fc\u0200\u0203\u020c\u0213"+
		"\u021c\u0221\u0224\u022f\u0239\u0240\u0248\u024d\u0251\u0256\u025a\u025f"+
		"\u0268\u026e\u0274\u027d\u0281\u028a\u0294\u029b\u02a2\u02b0\u02b5\u02bc"+
		"\u02c3\u02ca\u02d1\u02d9\u02de\u02e2\u02e9\u02f1\u02fb\u0300\u0304\u030c"+
		"\u0310\u0312\u031a\u0322\u0326\u032d\u0339\u033c\u0342\u0345\u0353\u0359"+
		"\u0362\u0375\u037a\u037f\u038a\u0392\u039c\u03a4\u03ab\u03af\u03b4\u03b8"+
		"\u03c0\u03c9\u03d2\u03d8\u03e3\u03ea\u03f1\u03fe\u0406\u040a\u040c\u0411"+
		"\u041b\u041f\u0423\u0427\u042d\u0435\u043d\u0456\u049e\u04a8\u04b2\u04c6"+
		"\u04d4\u04d6\u04de\u04ed\u04f3\u04fd\u0504\u0508\u050f\u0518\u0524\u0527"+
		"\u052f\u0531\u0537\u0540\u0542\u0546\u054b\u054f\u0554\u055b\u0566\u056d"+
		"\u0570\u0579\u057f\u058b\u058e\u0590\u0597\u059e\u05aa\u05ae\u05b0\u05b4"+
		"\u05b7\u05ba\u05c1\u05c4\u05c8\u05cb\u05d1\u05d6\u05dd\u05e2\u05f0\u05f4"+
		"\u05fa\u05fe\u0606";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}