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
		PACKAGE=2, LT=90, STAR=5, WHILE=53, CONST=92, CASE=62, CHAR=32, NEW=69, 
		DO=54, BREAK=59, Identifier=98, LBRACKET=18, FINAL=13, RPAREN=21, IMPORT=3, 
		SUBSUB=66, STAREQ=84, CARET=77, THIS=42, RETURN=58, DOUBLE=38, BARBAR=80, 
		WhiteSpace=99, VOID=22, SUPER=43, EQ=26, GOTO=93, AMPAMP=79, QUES=39, 
		EQEQ=74, RBRACE=17, STATIC=12, PRIVATE=10, SWITCH=57, NULL=44, STRICTFP=14, 
		ELSE=51, ELLIPSIS=41, NATIVE=27, THROWS=25, INT=35, SLASHEQ=85, ASSERT=64, 
		TRY=55, FloatingPointLiteral=95, GT=89, CATCH=61, FALSE=46, THROW=24, 
		PROTECTED=9, CLASS=6, BAREQ=87, AMP=76, PLUSPLUS=65, CharacterLiteral=96, 
		LBRACE=16, SUBEQ=83, FOR=52, SUB=73, FLOAT=37, ABSTRACT=11, PLUSEQ=82, 
		LPAREN=20, IF=50, AT=47, BOOLEAN=31, SYNCHRONIZED=28, SLASH=70, SlashComment=101, 
		IMPLEMENTS=7, CONTINUE=60, COMMA=15, AMPEQ=86, TRANSIENT=29, TILDE=67, 
		BANGEQ=75, PLUS=72, RBRACKET=19, DOT=4, BYTE=33, PERCENT=71, VOLATILE=30, 
		DEFAULT=48, SHORT=34, BANG=68, INSTANCEOF=91, TRUE=45, SEMI=1, StringLiteral=97, 
		COLON=49, ENUM=63, FINALLY=56, PERCENTEQ=88, LineTerminator=100, CARETEQ=81, 
		INTERFACE=23, IntegerLiteral=94, LONG=36, EXTENDS=40, PUBLIC=8, BAR=78, 
		EndOfLineComment=102;
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
		"'catch'", "'case'", "'enum'", "'assert'", "'++'", "'--'", "'~'", "'!'", 
		"'new'", "'/'", "'%'", "'+'", "'-'", "'=='", "'!='", "'&'", "'^'", "'|'", 
		"'&&'", "'||'", "'^='", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
		"'%='", "'>'", "'<'", "'instanceof'", "'const'", "'goto'", "IntegerLiteral", 
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
		RULE_interfaceMethodDeclaration = 32, RULE_interfaceFieldDeclaration = 33, 
		RULE_type = 34, RULE_classOrInterfaceType = 35, RULE_identifierTypeArgument = 36, 
		RULE_primitiveType = 37, RULE_typeArguments = 38, RULE_typeArgument = 39, 
		RULE_qualifiedNameList = 40, RULE_formalParameters = 41, RULE_formalParameterDecls = 42, 
		RULE_normalParameterDecl = 43, RULE_ellipsisParameterDecl = 44, RULE_explicitConstructorInvocation = 45, 
		RULE_qualifiedName = 46, RULE_annotations = 47, RULE_annotation = 48, 
		RULE_markerAnnotation = 49, RULE_singleElementAnnotation = 50, RULE_normalAnnotation = 51, 
		RULE_elementValuePairs = 52, RULE_elementValuePair = 53, RULE_elementValue = 54, 
		RULE_elementValueArrayInitializer = 55, RULE_annotationTypeDeclaration = 56, 
		RULE_annotationTypeBody = 57, RULE_annotationTypeElementDeclaration = 58, 
		RULE_annotationMethodDeclaration = 59, RULE_block = 60, RULE_blockStatement = 61, 
		RULE_localVariableDeclarationStatement = 62, RULE_localVariableDeclaration = 63, 
		RULE_statement = 64, RULE_switchBlockStatementGroups = 65, RULE_switchBlockStatementGroup = 66, 
		RULE_switchLabel = 67, RULE_trystatement = 68, RULE_tryWithResources = 69, 
		RULE_resourceSpecification = 70, RULE_resources = 71, RULE_resource = 72, 
		RULE_catches = 73, RULE_catchClause = 74, RULE_catchFormalParameter = 75, 
		RULE_formalParameter = 76, RULE_forstatement = 77, RULE_forInit = 78, 
		RULE_parExpression = 79, RULE_expressionList = 80, RULE_expression = 81, 
		RULE_assignmentOperator = 82, RULE_conditionalExpression = 83, RULE_conditionalOrExpression = 84, 
		RULE_conditionalAndExpression = 85, RULE_inclusiveOrExpression = 86, RULE_exclusiveOrExpression = 87, 
		RULE_andExpression = 88, RULE_equalityExpression = 89, RULE_instanceOfExpression = 90, 
		RULE_relationalExpression = 91, RULE_relationalOp = 92, RULE_shiftExpression = 93, 
		RULE_shiftOp = 94, RULE_additiveExpression = 95, RULE_multiplicativeExpression = 96, 
		RULE_unaryExpression = 97, RULE_unaryExpressionNotPlusMinus = 98, RULE_castExpression = 99, 
		RULE_primary = 100, RULE_superSuffix = 101, RULE_identifierSuffix = 102, 
		RULE_selector = 103, RULE_creator = 104, RULE_arrayCreator = 105, RULE_variableInitializer = 106, 
		RULE_arrayInitializer = 107, RULE_createdName = 108, RULE_innerCreator = 109, 
		RULE_classCreatorRest = 110, RULE_nonWildcardTypeArguments = 111, RULE_arguments = 112, 
		RULE_literal = 113, RULE_classHeader = 114, RULE_enumHeader = 115, RULE_interfaceHeader = 116, 
		RULE_annotationHeader = 117, RULE_typeHeader = 118, RULE_methodHeader = 119, 
		RULE_fieldHeader = 120, RULE_localVariableHeader = 121;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "qualifiedImportName", 
		"typeDeclaration", "classOrInterfaceDeclaration", "modifiers", "modifier", 
		"variableModifiers", "classDeclaration", "normalClassDeclaration", "typeParameters", 
		"typeParameter", "typeBound", "enumDeclaration", "enumBody", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
		"typeList", "classBody", "interfaceBody", "classBodyDeclaration", "memberDecl", 
		"methodDeclaration", "constructorDeclaration", "constructorBlock", "fieldDeclaration", 
		"variableDeclarator", "interfaceBodyDeclaration", "interfaceMethodDeclaration", 
		"interfaceFieldDeclaration", "type", "classOrInterfaceType", "identifierTypeArgument", 
		"primitiveType", "typeArguments", "typeArgument", "qualifiedNameList", 
		"formalParameters", "formalParameterDecls", "normalParameterDecl", "ellipsisParameterDecl", 
		"explicitConstructorInvocation", "qualifiedName", "annotations", "annotation", 
		"markerAnnotation", "singleElementAnnotation", "normalAnnotation", "elementValuePairs", 
		"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
		"annotationTypeBody", "annotationTypeElementDeclaration", "annotationMethodDeclaration", 
		"block", "blockStatement", "localVariableDeclarationStatement", "localVariableDeclaration", 
		"statement", "switchBlockStatementGroups", "switchBlockStatementGroup", 
		"switchLabel", "trystatement", "tryWithResources", "resourceSpecification", 
		"resources", "resource", "catches", "catchClause", "catchFormalParameter", 
		"formalParameter", "forstatement", "forInit", "parExpression", "expressionList", 
		"expression", "assignmentOperator", "conditionalExpression", "conditionalOrExpression", 
		"conditionalAndExpression", "inclusiveOrExpression", "exclusiveOrExpression", 
		"andExpression", "equalityExpression", "instanceOfExpression", "relationalExpression", 
		"relationalOp", "shiftExpression", "shiftOp", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "unaryExpressionNotPlusMinus", "castExpression", "primary", 
		"superSuffix", "identifierSuffix", "selector", "creator", "arrayCreator", 
		"variableInitializer", "arrayInitializer", "createdName", "innerCreator", 
		"classCreatorRest", "nonWildcardTypeArguments", "arguments", "literal", 
		"classHeader", "enumHeader", "interfaceHeader", "annotationHeader", "typeHeader", 
		"methodHeader", "fieldHeader", "localVariableHeader"
	};

	@Override
	public String getGrammarFileName() { return "Java7Parser.g4"; }

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
	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
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
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, 0);
		enterRule(_localctx, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(244); packageDeclaration();
				}
				break;
			}
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(247); importDeclaration();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==INTERFACE || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==AT || _la==ENUM) {
				{
				{
				setState(253); typeDeclaration();
				}
				}
				setState(258);
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
		public PackageDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, 2);
		enterRule(_localctx, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(259); annotations();
				}
			}

			setState(262); match(PACKAGE);
			setState(263); qualifiedName();
			setState(264); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IMPORT() { return getToken(Java7Parser.IMPORT, 0); }
		public TerminalNode STAR() { return getToken(Java7Parser.STAR, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public TerminalNode STATIC() { return getToken(Java7Parser.STATIC, 0); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public ImportDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, 4);
		enterRule(_localctx, RULE_importDeclaration);
		int _la;
		try {
			int _alt;
			setState(290);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266); match(IMPORT);
				setState(268);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(267); match(STATIC);
					}
				}

				setState(270); match(Identifier);
				setState(271); match(DOT);
				setState(272); match(STAR);
				setState(273); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274); match(IMPORT);
				setState(276);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(275); match(STATIC);
					}
				}

				setState(278); match(Identifier);
				setState(281); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(279); match(DOT);
						setState(280); match(Identifier);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(283); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(287);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(285); match(DOT);
					setState(286); match(STAR);
					}
				}

				setState(289); match(SEMI);
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
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public QualifiedImportNameContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		QualifiedImportNameContext _localctx = new QualifiedImportNameContext(_ctx, 6);
		enterRule(_localctx, RULE_qualifiedImportName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); match(Identifier);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(293); match(DOT);
				setState(294); match(Identifier);
				}
				}
				setState(299);
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
		public TypeDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, 8);
		enterRule(_localctx, RULE_typeDeclaration);
		try {
			setState(302);
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
				setState(300); classOrInterfaceDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(301); match(SEMI);
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
		public ClassOrInterfaceDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ClassOrInterfaceDeclarationContext _localctx = new ClassOrInterfaceDeclarationContext(_ctx, 10);
		enterRule(_localctx, RULE_classOrInterfaceDeclaration);
		try {
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304); classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305); interfaceDeclaration();
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
		public ModifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ModifiersContext _localctx = new ModifiersContext(_ctx, 12);
		enterRule(_localctx, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(308); modifier();
					}
					} 
				}
				setState(313);
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
		public TerminalNode NATIVE() { return getToken(Java7Parser.NATIVE, 0); }
		public TerminalNode FINAL() { return getToken(Java7Parser.FINAL, 0); }
		public TerminalNode PROTECTED() { return getToken(Java7Parser.PROTECTED, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(Java7Parser.SYNCHRONIZED, 0); }
		public TerminalNode ABSTRACT() { return getToken(Java7Parser.ABSTRACT, 0); }
		public TerminalNode VOLATILE() { return getToken(Java7Parser.VOLATILE, 0); }
		public TerminalNode STATIC() { return getToken(Java7Parser.STATIC, 0); }
		public TerminalNode PRIVATE() { return getToken(Java7Parser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(Java7Parser.PUBLIC, 0); }
		public TerminalNode TRANSIENT() { return getToken(Java7Parser.TRANSIENT, 0); }
		public TerminalNode STRICTFP() { return getToken(Java7Parser.STRICTFP, 0); }
		public ModifierContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ModifierContext _localctx = new ModifierContext(_ctx, 14);
		enterRule(_localctx, RULE_modifier);
		try {
			setState(326);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(314); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(315); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(316); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(317); match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(318); match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(319); match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(320); match(FINAL);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 8);
				{
				setState(321); match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 9);
				{
				setState(322); match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(323); match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 11);
				{
				setState(324); match(VOLATILE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 12);
				{
				setState(325); match(STRICTFP);
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
		public List<TerminalNode> FINAL() { return getTokens(Java7Parser.FINAL); }
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode FINAL(int i) {
			return getToken(Java7Parser.FINAL, i);
		}
		public VariableModifiersContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		VariableModifiersContext _localctx = new VariableModifiersContext(_ctx, 16);
		enterRule(_localctx, RULE_variableModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(330);
				switch (_input.LA(1)) {
				case FINAL:
					{
					setState(328); match(FINAL);
					}
					break;
				case AT:
					{
					setState(329); annotation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(334);
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
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, 18);
		enterRule(_localctx, RULE_classDeclaration);
		try {
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335); normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336); enumDeclaration();
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
		public TerminalNode CLASS() { return getToken(Java7Parser.CLASS, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(Java7Parser.IMPLEMENTS, 0); }
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
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, 20);
		enterRule(_localctx, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); modifiers();
			setState(340); match(CLASS);
			setState(341); match(Identifier);
			setState(343);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(342); typeParameters();
				}
			}

			setState(347);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(345); match(EXTENDS);
				setState(346); type();
				}
			}

			setState(351);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(349); match(IMPLEMENTS);
				setState(350); typeList();
				}
			}

			setState(353); classBody();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode GT() { return getToken(Java7Parser.GT, 0); }
		public TerminalNode LT() { return getToken(Java7Parser.LT, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, 22);
		enterRule(_localctx, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355); match(LT);
			setState(356); typeParameter();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(357); match(COMMA);
				setState(358); typeParameter();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364); match(GT);
			}
		}
		catch (RecognitionException re) {
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
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(Java7Parser.EXTENDS, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeParameterContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, 24);
		enterRule(_localctx, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); match(Identifier);
			setState(369);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(367); match(EXTENDS);
				setState(368); typeBound();
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
		public TypeBoundContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, 26);
		enterRule(_localctx, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371); type();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(372); match(AMP);
				setState(373); type();
				}
				}
				setState(378);
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
		public TerminalNode IMPLEMENTS() { return getToken(Java7Parser.IMPLEMENTS, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, 28);
		enterRule(_localctx, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); modifiers();
			setState(380); match(ENUM);
			setState(381); match(Identifier);
			setState(384);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(382); match(IMPLEMENTS);
				setState(383); typeList();
				}
			}

			setState(386); enumBody();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public TerminalNode COMMA() { return getToken(Java7Parser.COMMA, 0); }
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public EnumBodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, 30);
		enterRule(_localctx, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388); match(LBRACE);
			setState(390);
			_la = _input.LA(1);
			if (_la==AT || _la==Identifier) {
				{
				setState(389); enumConstants();
				}
			}

			setState(393);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(392); match(COMMA);
				}
			}

			setState(396);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(395); enumBodyDeclarations();
				}
			}

			setState(398); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, 32);
		enterRule(_localctx, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400); enumConstant();
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(401); match(COMMA);
					setState(402); enumConstant();
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, 34);
		enterRule(_localctx, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(408); annotations();
				}
			}

			setState(411); match(Identifier);
			setState(413);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(412); arguments();
				}
			}

			setState(416);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(415); classBody();
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
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, 36);
		enterRule(_localctx, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); match(SEMI);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==LBRACE || _la==VOID || _la==INTERFACE || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==AT || _la==ENUM || _la==LT || _la==Identifier) {
				{
				{
				setState(419); classBodyDeclaration();
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
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, 38);
		enterRule(_localctx, RULE_interfaceDeclaration);
		try {
			setState(427);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425); normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426); annotationTypeDeclaration();
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
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode INTERFACE() { return getToken(Java7Parser.INTERFACE, 0); }
		public TerminalNode EXTENDS() { return getToken(Java7Parser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, 40);
		enterRule(_localctx, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429); modifiers();
			setState(430); match(INTERFACE);
			setState(431); match(Identifier);
			setState(433);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(432); typeParameters();
				}
			}

			setState(437);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(435); match(EXTENDS);
				setState(436); typeList();
				}
			}

			setState(439); interfaceBody();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeListContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		TypeListContext _localctx = new TypeListContext(_ctx, 42);
		enterRule(_localctx, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441); type();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(442); match(COMMA);
				setState(443); type();
				}
				}
				setState(448);
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
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public ClassBodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, 44);
		enterRule(_localctx, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449); match(LBRACE);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==LBRACE || _la==VOID || _la==INTERFACE || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==AT || _la==ENUM || _la==LT || _la==Identifier) {
				{
				{
				setState(450); classBodyDeclaration();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public InterfaceBodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, 46);
		enterRule(_localctx, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458); match(LBRACE);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==VOID || _la==INTERFACE || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==AT || _la==ENUM || _la==LT || _la==Identifier) {
				{
				{
				setState(459); interfaceBodyDeclaration();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public MemberDeclContext memberDecl() {
			return getRuleContext(MemberDeclContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(Java7Parser.STATIC, 0); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public ClassBodyDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, 48);
		enterRule(_localctx, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(473);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(468); match(STATIC);
					}
				}

				setState(471); block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(472); memberDecl();
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
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MemberDeclContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, 50);
		enterRule(_localctx, RULE_memberDecl);
		try {
			setState(480);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475); constructorDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476); fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(477); methodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(478); classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(479); interfaceDeclaration();
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
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode THROWS() { return getToken(Java7Parser.THROWS, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java7Parser.VOID, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, 52);
		enterRule(_localctx, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482); modifiers();
			setState(484);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(483); typeParameters();
				}
			}

			setState(488);
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
				setState(486); type();
				}
				break;
			case VOID:
				{
				setState(487); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(490); match(Identifier);
			setState(491); formalParameters();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(492); match(LBRACKET);
				setState(493); match(RBRACKET);
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(501);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(499); match(THROWS);
				setState(500); qualifiedNameList();
				}
			}

			setState(505);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(503); block();
				}
				break;
			case SEMI:
				{
				setState(504); match(SEMI);
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
		public TerminalNode THROWS() { return getToken(Java7Parser.THROWS, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ConstructorBlockContext constructorBlock() {
			return getRuleContext(ConstructorBlockContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, 54);
		enterRule(_localctx, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507); modifiers();
			setState(509);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(508); typeParameters();
				}
			}

			setState(511); match(Identifier);
			setState(512); formalParameters();
			setState(515);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(513); match(THROWS);
				setState(514); qualifiedNameList();
				}
			}

			setState(517); constructorBlock();
			}
		}
		catch (RecognitionException re) {
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
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public ConstructorBlockContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ConstructorBlockContext _localctx = new ConstructorBlockContext(_ctx, 56);
		enterRule(_localctx, RULE_constructorBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519); match(LBRACE);
			setState(521);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(520); explicitConstructorInvocation();
				}
				break;
			}
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==LBRACE || _la==LPAREN || _la==VOID || _la==INTERFACE || _la==THROW || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==AT || _la==IF || _la==FOR || _la==WHILE || _la==DO || _la==TRY || _la==SWITCH || _la==RETURN || _la==BREAK || _la==CONTINUE || _la==ENUM || _la==ASSERT || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
				{
				{
				setState(523); blockStatement();
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, 58);
		enterRule(_localctx, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531); modifiers();
			setState(532); type();
			setState(533); variableDeclarator();
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(534); match(COMMA);
				setState(535); variableDeclarator();
				}
				}
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(541); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, 60);
		enterRule(_localctx, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543); match(Identifier);
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(544); match(LBRACKET);
				setState(545); match(RBRACKET);
				}
				}
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(553);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(551); match(EQ);
				setState(552); variableInitializer();
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
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceFieldDeclarationContext interfaceFieldDeclaration() {
			return getRuleContext(InterfaceFieldDeclarationContext.class,0);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, 62);
		enterRule(_localctx, RULE_interfaceBodyDeclaration);
		try {
			setState(560);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(555); interfaceFieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(556); interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(557); interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(558); classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(559); match(SEMI);
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
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public TerminalNode THROWS() { return getToken(Java7Parser.THROWS, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java7Parser.VOID, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, 64);
		enterRule(_localctx, RULE_interfaceMethodDeclaration);
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

			setState(568);
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
				setState(566); type();
				}
				break;
			case VOID:
				{
				setState(567); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(570); match(Identifier);
			setState(571); formalParameters();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(572); match(LBRACKET);
				setState(573); match(RBRACKET);
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(581);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(579); match(THROWS);
				setState(580); qualifiedNameList();
				}
			}

			setState(583); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public InterfaceFieldDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		InterfaceFieldDeclarationContext _localctx = new InterfaceFieldDeclarationContext(_ctx, 66);
		enterRule(_localctx, RULE_interfaceFieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585); modifiers();
			setState(586); type();
			setState(587); variableDeclarator();
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(588); match(COMMA);
				setState(589); variableDeclarator();
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(595); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public TypeContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		TypeContext _localctx = new TypeContext(_ctx, 68);
		enterRule(_localctx, RULE_type);
		int _la;
		try {
			setState(613);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(597); classOrInterfaceType();
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(598); match(LBRACKET);
					setState(599); match(RBRACKET);
					}
					}
					setState(604);
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
				setState(605); primitiveType();
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(606); match(LBRACKET);
					setState(607); match(RBRACKET);
					}
					}
					setState(612);
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
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public IdentifierTypeArgumentContext identifierTypeArgument(int i) {
			return getRuleContext(IdentifierTypeArgumentContext.class,i);
		}
		public List<IdentifierTypeArgumentContext> identifierTypeArgument() {
			return getRuleContexts(IdentifierTypeArgumentContext.class);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, 70);
		enterRule(_localctx, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615); identifierTypeArgument();
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(616); match(DOT);
				setState(617); identifierTypeArgument();
				}
				}
				setState(622);
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
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public IdentifierTypeArgumentContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		IdentifierTypeArgumentContext _localctx = new IdentifierTypeArgumentContext(_ctx, 72);
		enterRule(_localctx, RULE_identifierTypeArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623); match(Identifier);
			setState(625);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(624); typeArguments();
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
		public TerminalNode CHAR() { return getToken(Java7Parser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(Java7Parser.DOUBLE, 0); }
		public TerminalNode BYTE() { return getToken(Java7Parser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(Java7Parser.SHORT, 0); }
		public TerminalNode FLOAT() { return getToken(Java7Parser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(Java7Parser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(Java7Parser.BOOLEAN, 0); }
		public TerminalNode LONG() { return getToken(Java7Parser.LONG, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, 74);
		enterRule(_localctx, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(Java7Parser.GT, 0); }
		public TerminalNode LT() { return getToken(Java7Parser.LT, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TypeArgumentsContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, 76);
		enterRule(_localctx, RULE_typeArguments);
		int _la;
		try {
			setState(642);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(629); match(LT);
				setState(630); typeArgument();
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(631); match(COMMA);
					setState(632); typeArgument();
					}
					}
					setState(637);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(638); match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640); match(LT);
				setState(641); match(GT);
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
		public TerminalNode EXTENDS() { return getToken(Java7Parser.EXTENDS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode QUES() { return getToken(Java7Parser.QUES, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, 78);
		enterRule(_localctx, RULE_typeArgument);
		int _la;
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
				setState(644); type();
				}
				break;
			case QUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(645); match(QUES);
				setState(648);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(646);
					_input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(647); type();
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
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, 80);
		enterRule(_localctx, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652); qualifiedName();
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(653); match(COMMA);
				setState(654); qualifiedName();
				}
				}
				setState(659);
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
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public FormalParametersContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, 82);
		enterRule(_localctx, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660); match(LPAREN);
			setState(662);
			_la = _input.LA(1);
			if (_la==FINAL || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==AT || _la==Identifier) {
				{
				setState(661); formalParameterDecls();
				}
			}

			setState(664); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		public NormalParameterDeclContext normalParameterDecl(int i) {
			return getRuleContext(NormalParameterDeclContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public EllipsisParameterDeclContext ellipsisParameterDecl() {
			return getRuleContext(EllipsisParameterDeclContext.class,0);
		}
		public List<NormalParameterDeclContext> normalParameterDecl() {
			return getRuleContexts(NormalParameterDeclContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public FormalParameterDeclsContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		FormalParameterDeclsContext _localctx = new FormalParameterDeclsContext(_ctx, 84);
		enterRule(_localctx, RULE_formalParameterDecls);
		int _la;
		try {
			int _alt;
			setState(684);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(666); ellipsisParameterDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667); normalParameterDecl();
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(668); match(COMMA);
					setState(669); normalParameterDecl();
					}
					}
					setState(674);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(678); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(675); normalParameterDecl();
						setState(676); match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(680); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(682); ellipsisParameterDecl();
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
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public NormalParameterDeclContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		NormalParameterDeclContext _localctx = new NormalParameterDeclContext(_ctx, 86);
		enterRule(_localctx, RULE_normalParameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686); variableModifiers();
			setState(687); type();
			setState(688); match(Identifier);
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(689); match(LBRACKET);
				setState(690); match(RBRACKET);
				}
				}
				setState(695);
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
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EllipsisParameterDeclContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		EllipsisParameterDeclContext _localctx = new EllipsisParameterDeclContext(_ctx, 88);
		enterRule(_localctx, RULE_ellipsisParameterDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696); variableModifiers();
			setState(697); type();
			setState(698); match(ELLIPSIS);
			setState(699); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TerminalNode THIS() { return getToken(Java7Parser.THIS, 0); }
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, 90);
		enterRule(_localctx, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(717);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(701); nonWildcardTypeArguments();
					}
				}

				setState(704);
				_input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==SUPER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(705); arguments();
				setState(706); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708); primary();
				setState(709); match(DOT);
				setState(711);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(710); nonWildcardTypeArguments();
					}
				}

				setState(713); match(SUPER);
				setState(714); arguments();
				setState(715); match(SEMI);
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
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public QualifiedNameContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, 92);
		enterRule(_localctx, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719); match(Identifier);
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(720); match(DOT);
				setState(721); match(Identifier);
				}
				}
				setState(726);
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
		public AnnotationsContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, 94);
		enterRule(_localctx, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(727); annotation();
				}
				}
				setState(730); 
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
		public AnnotationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		AnnotationContext _localctx = new AnnotationContext(_ctx, 96);
		enterRule(_localctx, RULE_annotation);
		try {
			setState(735);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(732); markerAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(733); singleElementAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(734); normalAnnotation();
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
		public MarkerAnnotationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, 98);
		enterRule(_localctx, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737); match(AT);
			setState(738); qualifiedName();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public SingleElementAnnotationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, 100);
		enterRule(_localctx, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740); match(AT);
			setState(741); qualifiedName();
			setState(742); match(LPAREN);
			setState(743); elementValue();
			setState(744); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public NormalAnnotationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, 102);
		enterRule(_localctx, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746); match(AT);
			setState(747); qualifiedName();
			setState(748); match(LPAREN);
			setState(750);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(749); elementValuePairs();
				}
			}

			setState(752); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, 104);
		enterRule(_localctx, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754); elementValuePair();
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(755); match(COMMA);
				setState(756); elementValuePair();
				}
				}
				setState(761);
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
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ElementValuePairContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, 106);
		enterRule(_localctx, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762); match(Identifier);
			setState(763); match(EQ);
			setState(764); elementValue();
			}
		}
		catch (RecognitionException re) {
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
		public ElementValueContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ElementValueContext _localctx = new ElementValueContext(_ctx, 108);
		enterRule(_localctx, RULE_elementValue);
		try {
			setState(769);
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
				setState(766); conditionalExpression();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(767); annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(768); elementValueArrayInitializer();
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
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, 110);
		enterRule(_localctx, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(771); match(LBRACE);
			setState(780);
			_la = _input.LA(1);
			if (_la==LBRACE || _la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==AT || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
				{
				setState(772); elementValue();
				setState(777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(773); match(COMMA);
						setState(774); elementValue();
						}
						} 
					}
					setState(779);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
			}

			setState(783);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(782); match(COMMA);
				}
			}

			setState(785); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode AT() { return getToken(Java7Parser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(Java7Parser.INTERFACE, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, 112);
		enterRule(_localctx, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787); modifiers();
			setState(788); match(AT);
			setState(789); match(INTERFACE);
			setState(790); match(Identifier);
			setState(791); annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
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
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public AnnotationTypeBodyContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, 114);
		enterRule(_localctx, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793); match(LBRACE);
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==INTERFACE || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==AT || _la==ENUM || _la==Identifier) {
				{
				{
				setState(794); annotationTypeElementDeclaration();
				}
				}
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(800); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationMethodDeclarationContext annotationMethodDeclaration() {
			return getRuleContext(AnnotationMethodDeclarationContext.class,0);
		}
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public InterfaceFieldDeclarationContext interfaceFieldDeclaration() {
			return getRuleContext(InterfaceFieldDeclarationContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, 116);
		enterRule(_localctx, RULE_annotationTypeElementDeclaration);
		try {
			setState(809);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802); annotationMethodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803); interfaceFieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(804); normalClassDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(805); normalInterfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(806); enumDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(807); annotationTypeDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(808); match(SEMI);
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
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public TerminalNode DEFAULT() { return getToken(Java7Parser.DEFAULT, 0); }
		public AnnotationMethodDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		AnnotationMethodDeclarationContext _localctx = new AnnotationMethodDeclarationContext(_ctx, 118);
		enterRule(_localctx, RULE_annotationMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811); modifiers();
			setState(812); type();
			setState(813); match(Identifier);
			setState(814); match(LPAREN);
			setState(815); match(RPAREN);
			setState(818);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(816); match(DEFAULT);
				setState(817); elementValue();
				}
			}

			setState(820); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		BlockContext _localctx = new BlockContext(_ctx, 120);
		enterRule(_localctx, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822); match(LBRACE);
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==LBRACE || _la==LPAREN || _la==VOID || _la==INTERFACE || _la==THROW || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==AT || _la==IF || _la==FOR || _la==WHILE || _la==DO || _la==TRY || _la==SWITCH || _la==RETURN || _la==BREAK || _la==CONTINUE || _la==ENUM || _la==ASSERT || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
				{
				{
				setState(823); blockStatement();
				}
				}
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(829); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, 122);
		enterRule(_localctx, RULE_blockStatement);
		try {
			setState(834);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(831); localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(832); classOrInterfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(833); statement();
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
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, 124);
		enterRule(_localctx, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836); localVariableDeclaration();
			setState(837); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, 126);
		enterRule(_localctx, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839); variableModifiers();
			setState(840); type();
			setState(841); variableDeclarator();
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(842); match(COMMA);
				setState(843); variableDeclarator();
				}
				}
				setState(848);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COLON() { return getToken(Java7Parser.COLON, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(Java7Parser.SYNCHRONIZED, 0); }
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public TerminalNode WHILE() { return getToken(Java7Parser.WHILE, 0); }
		public TerminalNode CONTINUE() { return getToken(Java7Parser.CONTINUE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(Java7Parser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public TerminalNode ELSE() { return getToken(Java7Parser.ELSE, 0); }
		public TerminalNode RETURN() { return getToken(Java7Parser.RETURN, 0); }
		public TrystatementContext trystatement() {
			return getRuleContext(TrystatementContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public SwitchBlockStatementGroupsContext switchBlockStatementGroups() {
			return getRuleContext(SwitchBlockStatementGroupsContext.class,0);
		}
		public TerminalNode DO() { return getToken(Java7Parser.DO, 0); }
		public TerminalNode ASSERT() { return getToken(Java7Parser.ASSERT, 0); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(Java7Parser.BREAK, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode THROW() { return getToken(Java7Parser.THROW, 0); }
		public TerminalNode IF() { return getToken(Java7Parser.IF, 0); }
		public StatementContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		StatementContext _localctx = new StatementContext(_ctx, 128);
		enterRule(_localctx, RULE_statement);
		int _la;
		try {
			setState(921);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(849); block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(850); match(ASSERT);
				setState(851); expression();
				setState(854);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(852); match(COLON);
					setState(853); expression();
					}
				}

				setState(856); match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(858); match(ASSERT);
				setState(859); expression();
				setState(862);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(860); match(COLON);
					setState(861); expression();
					}
				}

				setState(864); match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(866); match(IF);
				setState(867); parExpression();
				setState(868); statement();
				setState(871);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(869); match(ELSE);
					setState(870); statement();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(873); forstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(874); match(WHILE);
				setState(875); parExpression();
				setState(876); statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(878); match(DO);
				setState(879); statement();
				setState(880); match(WHILE);
				setState(881); parExpression();
				setState(882); match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(884); trystatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(885); match(SWITCH);
				setState(886); parExpression();
				setState(887); match(LBRACE);
				setState(888); switchBlockStatementGroups();
				setState(889); match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(891); match(SYNCHRONIZED);
				setState(892); parExpression();
				setState(893); block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(895); match(RETURN);
				setState(897);
				_la = _input.LA(1);
				if (_la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
					{
					setState(896); expression();
					}
				}

				setState(899); match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(900); match(THROW);
				setState(901); expression();
				setState(902); match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(904); match(BREAK);
				setState(906);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(905); match(Identifier);
					}
				}

				setState(908); match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(909); match(CONTINUE);
				setState(911);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(910); match(Identifier);
					}
				}

				setState(913); match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(914); expression();
				setState(915); match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(917); match(Identifier);
				setState(918); match(COLON);
				setState(919); statement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(920); match(SEMI);
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
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterSwitchBlockStatementGroups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitSwitchBlockStatementGroups(this);
		}
	}

	public final SwitchBlockStatementGroupsContext switchBlockStatementGroups() throws RecognitionException {
		SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx, 130);
		enterRule(_localctx, RULE_switchBlockStatementGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(923); switchBlockStatementGroup();
				}
				}
				setState(928);
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
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchLabelContext switchLabel() {
			return getRuleContext(SwitchLabelContext.class,0);
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
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, 132);
		enterRule(_localctx, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929); switchLabel();
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==LBRACE || _la==LPAREN || _la==VOID || _la==INTERFACE || _la==THROW || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==AT || _la==IF || _la==FOR || _la==WHILE || _la==DO || _la==TRY || _la==SWITCH || _la==RETURN || _la==BREAK || _la==CONTINUE || _la==ENUM || _la==ASSERT || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
				{
				{
				setState(930); blockStatement();
				}
				}
				setState(935);
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
		public TerminalNode COLON() { return getToken(Java7Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(Java7Parser.DEFAULT, 0); }
		public TerminalNode CASE() { return getToken(Java7Parser.CASE, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, 134);
		enterRule(_localctx, RULE_switchLabel);
		try {
			setState(942);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(936); match(CASE);
				setState(937); expression();
				setState(938); match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(940); match(DEFAULT);
				setState(941); match(COLON);
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
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode FINALLY(int i) {
			return getToken(Java7Parser.FINALLY, i);
		}
		public List<CatchesContext> catches() {
			return getRuleContexts(CatchesContext.class);
		}
		public TryWithResourcesContext tryWithResources() {
			return getRuleContext(TryWithResourcesContext.class,0);
		}
		public List<TerminalNode> FINALLY() { return getTokens(Java7Parser.FINALLY); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TerminalNode TRY() { return getToken(Java7Parser.TRY, 0); }
		public CatchesContext catches(int i) {
			return getRuleContext(CatchesContext.class,i);
		}
		public TrystatementContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		TrystatementContext _localctx = new TrystatementContext(_ctx, 136);
		enterRule(_localctx, RULE_trystatement);
		try {
			setState(956);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(944); match(TRY);
				setState(945); block();
				setState(953);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(946); catches();
					setState(947); match(FINALLY);
					setState(948); block();
					}
					break;
				case 2:
					{
					setState(950); catches();
					}
					break;
				case 3:
					{
					setState(951); match(FINALLY);
					setState(952); block();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(955); tryWithResources();
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
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public TerminalNode FINALLY() { return getToken(Java7Parser.FINALLY, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TerminalNode TRY() { return getToken(Java7Parser.TRY, 0); }
		public TryWithResourcesContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		TryWithResourcesContext _localctx = new TryWithResourcesContext(_ctx, 138);
		enterRule(_localctx, RULE_tryWithResources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958); match(TRY);
			setState(959); resourceSpecification();
			setState(960); block();
			setState(962);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(961); catches();
				}
			}

			setState(966);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(964); match(FINALLY);
				setState(965); block();
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
		public ResourceSpecificationContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, 140);
		enterRule(_localctx, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968); match(LPAREN);
			setState(969); resources();
			setState(971);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(970); match(SEMI);
				}
			}

			setState(973); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, 142);
		enterRule(_localctx, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(975); resource();
			setState(980);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(976); match(SEMI);
					setState(977); resource();
					}
					} 
				}
				setState(982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
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
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ResourceContext _localctx = new ResourceContext(_ctx, 144);
		enterRule(_localctx, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(983); variableModifiers();
				}
				break;
			}
			setState(986); type();
			setState(987); match(Identifier);
			setState(988); match(EQ);
			setState(989); expression();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitCatches(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, 146);
		enterRule(_localctx, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991); catchClause();
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(992); catchClause();
				}
				}
				setState(997);
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
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public TerminalNode CATCH() { return getToken(Java7Parser.CATCH, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, 148);
		enterRule(_localctx, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998); match(CATCH);
			setState(999); match(LPAREN);
			setState(1000); catchFormalParameter();
			setState(1001); match(RPAREN);
			setState(1002); block();
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode BAR(int i) {
			return getToken(Java7Parser.BAR, i);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public List<TerminalNode> BAR() { return getTokens(Java7Parser.BAR); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, 150);
		enterRule(_localctx, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004); variableModifiers();
			setState(1005); type();
			setState(1010);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(1006); match(BAR);
				setState(1007); type();
				}
				}
				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1013); match(Identifier);
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1014); match(LBRACKET);
				setState(1015); match(RBRACKET);
				}
				}
				setState(1020);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public FormalParameterContext(ParserRuleContext parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, 152);
		enterRule(_localctx, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021); variableModifiers();
			setState(1022); type();
			setState(1023); match(Identifier);
			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1024); match(LBRACKET);
				setState(1025); match(RBRACKET);
				}
				}
				setState(1030);
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
		public TerminalNode COLON() { return getToken(Java7Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode FOR() { return getToken(Java7Parser.FOR, 0); }
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(Java7Parser.SEMI); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode SEMI(int i) {
			return getToken(Java7Parser.SEMI, i);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public ForstatementContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ForstatementContext _localctx = new ForstatementContext(_ctx, 154);
		enterRule(_localctx, RULE_forstatement);
		int _la;
		try {
			setState(1056);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1031); match(FOR);
				setState(1032); match(LPAREN);
				setState(1033); variableModifiers();
				setState(1034); type();
				setState(1035); match(Identifier);
				setState(1036); match(COLON);
				setState(1037); expression();
				setState(1038); match(RPAREN);
				setState(1039); statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1041); match(FOR);
				setState(1042); match(LPAREN);
				setState(1044);
				_la = _input.LA(1);
				if (_la==FINAL || _la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==AT || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
					{
					setState(1043); forInit();
					}
				}

				setState(1046); match(SEMI);
				setState(1048);
				_la = _input.LA(1);
				if (_la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
					{
					setState(1047); expression();
					}
				}

				setState(1050); match(SEMI);
				setState(1052);
				_la = _input.LA(1);
				if (_la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
					{
					setState(1051); expressionList();
					}
				}

				setState(1054); match(RPAREN);
				setState(1055); statement();
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

	public static class ForInitContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ForInitContext _localctx = new ForInitContext(_ctx, 156);
		enterRule(_localctx, RULE_forInit);
		try {
			setState(1060);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058); localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1059); expressionList();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, 158);
		enterRule(_localctx, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062); match(LPAREN);
			setState(1063); expression();
			setState(1064); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, 160);
		enterRule(_localctx, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066); expression();
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1067); match(COMMA);
				setState(1068); expression();
				}
				}
				setState(1073);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ExpressionContext _localctx = new ExpressionContext(_ctx, 162);
		enterRule(_localctx, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074); conditionalExpression();
			setState(1078);
			_la = _input.LA(1);
			if (_la==EQ || _la==CARETEQ || _la==PLUSEQ || _la==SUBEQ || _la==STAREQ || _la==SLASHEQ || _la==AMPEQ || _la==BAREQ || _la==PERCENTEQ || _la==GT || _la==LT) {
				{
				setState(1075); assignmentOperator();
				setState(1076); expression();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public int assignmentType;
		public TerminalNode SUBEQ() { return getToken(Java7Parser.SUBEQ, 0); }
		public List<TerminalNode> GT() { return getTokens(Java7Parser.GT); }
		public TerminalNode CARETEQ() { return getToken(Java7Parser.CARETEQ, 0); }
		public List<TerminalNode> LT() { return getTokens(Java7Parser.LT); }
		public TerminalNode SLASHEQ() { return getToken(Java7Parser.SLASHEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(Java7Parser.PERCENTEQ, 0); }
		public TerminalNode BAREQ() { return getToken(Java7Parser.BAREQ, 0); }
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
		public TerminalNode LT(int i) {
			return getToken(Java7Parser.LT, i);
		}
		public TerminalNode AMPEQ() { return getToken(Java7Parser.AMPEQ, 0); }
		public TerminalNode GT(int i) {
			return getToken(Java7Parser.GT, i);
		}
		public TerminalNode STAREQ() { return getToken(Java7Parser.STAREQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(Java7Parser.PLUSEQ, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, 164);
		enterRule(_localctx, RULE_assignmentOperator);
		try {
			setState(1111);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080); match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1082); match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  2;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1084); match(SUBEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  3;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1086); match(STAREQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  4;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1088); match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  5;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1090); match(AMPEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  6;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1092); match(BAREQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  7;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1094); match(CARETEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  8;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1096); match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  9;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1098); match(LT);
				setState(1099); match(LT);
				setState(1100); match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  10;
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1102); match(GT);
				setState(1103); match(GT);
				setState(1104); match(GT);
				setState(1105); match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  11;
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1107); match(GT);
				setState(1108); match(GT);
				setState(1109); match(EQ);
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
		public TerminalNode COLON() { return getToken(Java7Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUES() { return getToken(Java7Parser.QUES, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, 166);
		enterRule(_localctx, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113); conditionalOrExpression();
			setState(1119);
			_la = _input.LA(1);
			if (_la==QUES) {
				{
				setState(1114); match(QUES);
				setState(1115); expression();
				setState(1116); match(COLON);
				setState(1117); conditionalExpression();
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
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, 168);
		enterRule(_localctx, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121); conditionalAndExpression();
			setState(1126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BARBAR) {
				{
				{
				setState(1122); match(BARBAR);
				setState(1123); conditionalAndExpression();
				}
				}
				setState(1128);
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
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public List<TerminalNode> AMPAMP() { return getTokens(Java7Parser.AMPAMP); }
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public TerminalNode AMPAMP(int i) {
			return getToken(Java7Parser.AMPAMP, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, 170);
		enterRule(_localctx, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129); inclusiveOrExpression();
			setState(1134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMPAMP) {
				{
				{
				setState(1130); match(AMPAMP);
				setState(1131); inclusiveOrExpression();
				}
				}
				setState(1136);
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
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public TerminalNode BAR(int i) {
			return getToken(Java7Parser.BAR, i);
		}
		public List<TerminalNode> BAR() { return getTokens(Java7Parser.BAR); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, 172);
		enterRule(_localctx, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137); exclusiveOrExpression();
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(1138); match(BAR);
				setState(1139); exclusiveOrExpression();
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public TerminalNode CARET(int i) {
			return getToken(Java7Parser.CARET, i);
		}
		public List<TerminalNode> CARET() { return getTokens(Java7Parser.CARET); }
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, 174);
		enterRule(_localctx, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145); andExpression();
			setState(1150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(1146); match(CARET);
				setState(1147); andExpression();
				}
				}
				setState(1152);
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
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public TerminalNode AMP(int i) {
			return getToken(Java7Parser.AMP, i);
		}
		public List<TerminalNode> AMP() { return getTokens(Java7Parser.AMP); }
		public AndExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, 176);
		enterRule(_localctx, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153); equalityExpression();
			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(1154); match(AMP);
				setState(1155); equalityExpression();
				}
				}
				setState(1160);
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
		public List<TerminalNode> BANGEQ() { return getTokens(Java7Parser.BANGEQ); }
		public InstanceOfExpressionContext instanceOfExpression(int i) {
			return getRuleContext(InstanceOfExpressionContext.class,i);
		}
		public List<InstanceOfExpressionContext> instanceOfExpression() {
			return getRuleContexts(InstanceOfExpressionContext.class);
		}
		public TerminalNode EQEQ(int i) {
			return getToken(Java7Parser.EQEQ, i);
		}
		public TerminalNode BANGEQ(int i) {
			return getToken(Java7Parser.BANGEQ, i);
		}
		public List<TerminalNode> EQEQ() { return getTokens(Java7Parser.EQEQ); }
		public EqualityExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, 178);
		enterRule(_localctx, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161); instanceOfExpression();
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQEQ || _la==BANGEQ) {
				{
				{
				setState(1162);
				_input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQEQ || _la==BANGEQ) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1163); instanceOfExpression();
				}
				}
				setState(1168);
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
		public TerminalNode INSTANCEOF() { return getToken(Java7Parser.INSTANCEOF, 0); }
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InstanceOfExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		InstanceOfExpressionContext _localctx = new InstanceOfExpressionContext(_ctx, 180);
		enterRule(_localctx, RULE_instanceOfExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169); relationalExpression();
			setState(1172);
			_la = _input.LA(1);
			if (_la==INSTANCEOF) {
				{
				setState(1170); match(INSTANCEOF);
				setState(1171); type();
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
		public List<RelationalOpContext> relationalOp() {
			return getRuleContexts(RelationalOpContext.class);
		}
		public RelationalOpContext relationalOp(int i) {
			return getRuleContext(RelationalOpContext.class,i);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, 182);
		enterRule(_localctx, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1174); shiftExpression();
			setState(1180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1175); relationalOp();
					setState(1176); shiftExpression();
					}
					} 
				}
				setState(1182);
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

	public static class RelationalOpContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(Java7Parser.GT, 0); }
		public TerminalNode LT() { return getToken(Java7Parser.LT, 0); }
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
		public RelationalOpContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, 184);
		enterRule(_localctx, RULE_relationalOp);
		try {
			setState(1189);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1183); match(LT);
				setState(1184); match(EQ);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1185); match(GT);
				setState(1186); match(EQ);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1187); match(LT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1188); match(GT);
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
		public List<ShiftOpContext> shiftOp() {
			return getRuleContexts(ShiftOpContext.class);
		}
		public ShiftOpContext shiftOp(int i) {
			return getRuleContext(ShiftOpContext.class,i);
		}
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, 186);
		enterRule(_localctx, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1191); additiveExpression();
			setState(1197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1192); shiftOp();
					setState(1193); additiveExpression();
					}
					} 
				}
				setState(1199);
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

	public static class ShiftOpContext extends ParserRuleContext {
		public List<TerminalNode> GT() { return getTokens(Java7Parser.GT); }
		public List<TerminalNode> LT() { return getTokens(Java7Parser.LT); }
		public TerminalNode LT(int i) {
			return getToken(Java7Parser.LT, i);
		}
		public TerminalNode GT(int i) {
			return getToken(Java7Parser.GT, i);
		}
		public ShiftOpContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, 188);
		enterRule(_localctx, RULE_shiftOp);
		try {
			setState(1207);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1200); match(LT);
				setState(1201); match(LT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1202); match(GT);
				setState(1203); match(GT);
				setState(1204); match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1205); match(GT);
				setState(1206); match(GT);
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
		public List<TerminalNode> SUB() { return getTokens(Java7Parser.SUB); }
		public List<TerminalNode> PLUS() { return getTokens(Java7Parser.PLUS); }
		public TerminalNode SUB(int i) {
			return getToken(Java7Parser.SUB, i);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public TerminalNode PLUS(int i) {
			return getToken(Java7Parser.PLUS, i);
		}
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, 190);
		enterRule(_localctx, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209); multiplicativeExpression();
			setState(1214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==SUB) {
				{
				{
				setState(1210);
				_input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1211); multiplicativeExpression();
				}
				}
				setState(1216);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<TerminalNode> SLASH() { return getTokens(Java7Parser.SLASH); }
		public List<TerminalNode> STAR() { return getTokens(Java7Parser.STAR); }
		public TerminalNode PERCENT(int i) {
			return getToken(Java7Parser.PERCENT, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(Java7Parser.PERCENT); }
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public TerminalNode SLASH(int i) {
			return getToken(Java7Parser.SLASH, i);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public TerminalNode STAR(int i) {
			return getToken(Java7Parser.STAR, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, 192);
		enterRule(_localctx, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217); unaryExpression();
			setState(1222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==SLASH || _la==PERCENT) {
				{
				{
				setState(1218);
				_input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==SLASH || _la==PERCENT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1219); unaryExpression();
				}
				}
				setState(1224);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(Java7Parser.SUB, 0); }
		public TerminalNode PLUS() { return getToken(Java7Parser.PLUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public TerminalNode SUBSUB() { return getToken(Java7Parser.SUBSUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(Java7Parser.PLUSPLUS, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, 194);
		enterRule(_localctx, RULE_unaryExpression);
		try {
			setState(1234);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225); match(PLUS);
				setState(1226); unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1227); match(SUB);
				setState(1228); unaryExpression();
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1229); match(PLUSPLUS);
				setState(1230); unaryExpression();
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(1231); match(SUBSUB);
				setState(1232); unaryExpression();
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
			case TILDE:
			case BANG:
			case NEW:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(1233); unaryExpressionNotPlusMinus();
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
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public TerminalNode BANG() { return getToken(Java7Parser.BANG, 0); }
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUBSUB() { return getToken(Java7Parser.SUBSUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(Java7Parser.PLUSPLUS, 0); }
		public TerminalNode TILDE() { return getToken(Java7Parser.TILDE, 0); }
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, 196);
		enterRule(_localctx, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			setState(1251);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1236); match(TILDE);
				setState(1237); unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1238); match(BANG);
				setState(1239); unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1240); castExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1241); primary();
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT || _la==LBRACKET) {
					{
					{
					setState(1242); selector();
					}
					}
					setState(1247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1249);
				_la = _input.LA(1);
				if (_la==PLUSPLUS || _la==SUBSUB) {
					{
					setState(1248);
					_input.LT(1);
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
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public CastExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, 198);
		enterRule(_localctx, RULE_castExpression);
		try {
			setState(1263);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1253); match(LPAREN);
				setState(1254); primitiveType();
				setState(1255); match(RPAREN);
				setState(1256); unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1258); match(LPAREN);
				setState(1259); type();
				setState(1260); match(RPAREN);
				setState(1261); unaryExpressionNotPlusMinus();
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
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(Java7Parser.CLASS, 0); }
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public TerminalNode THIS() { return getToken(Java7Parser.THIS, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode VOID() { return getToken(Java7Parser.VOID, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public List<TerminalNode> DOT() { return getTokens(Java7Parser.DOT); }
		public IdentifierSuffixContext identifierSuffix() {
			return getRuleContext(IdentifierSuffixContext.class,0);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		PrimaryContext _localctx = new PrimaryContext(_ctx, 200);
		enterRule(_localctx, RULE_primary);
		int _la;
		try {
			int _alt;
			setState(1306);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1265); parExpression();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1266); match(THIS);
				setState(1271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1267); match(DOT);
						setState(1268); match(Identifier);
						}
						} 
					}
					setState(1273);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				}
				setState(1275);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1274); identifierSuffix();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(1277); match(Identifier);
				setState(1282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1278); match(DOT);
						setState(1279); match(Identifier);
						}
						} 
					}
					setState(1284);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				}
				setState(1286);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1285); identifierSuffix();
					}
					break;
				}
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1288); match(SUPER);
				setState(1289); superSuffix();
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
				setState(1290); literal();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 6);
				{
				setState(1291); creator();
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
				setState(1292); primitiveType();
				setState(1297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(1293); match(LBRACKET);
					setState(1294); match(RBRACKET);
					}
					}
					setState(1299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1300); match(DOT);
				setState(1301); match(CLASS);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 8);
				{
				setState(1303); match(VOID);
				setState(1304); match(DOT);
				setState(1305); match(CLASS);
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, 202);
		enterRule(_localctx, RULE_superSuffix);
		int _la;
		try {
			setState(1317);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1308); arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1309); match(DOT);
				setState(1311);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1310); typeArguments();
					}
				}

				setState(1313); match(Identifier);
				setState(1315);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1314); arguments();
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

	public static class IdentifierSuffixContext extends ParserRuleContext {
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode CLASS() { return getToken(Java7Parser.CLASS, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public TerminalNode THIS() { return getToken(Java7Parser.THIS, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public IdentifierSuffixContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		IdentifierSuffixContext _localctx = new IdentifierSuffixContext(_ctx, 204);
		enterRule(_localctx, RULE_identifierSuffix);
		int _la;
		try {
			int _alt;
			setState(1349);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1321); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1319); match(LBRACKET);
					setState(1320); match(RBRACKET);
					}
					}
					setState(1323); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACKET );
				setState(1325); match(DOT);
				setState(1326); match(CLASS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1331); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1327); match(LBRACKET);
						setState(1328); expression();
						setState(1329); match(RBRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1333); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1335); arguments();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1336); match(DOT);
				setState(1337); match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1338); match(DOT);
				setState(1339); nonWildcardTypeArguments();
				setState(1340); match(Identifier);
				setState(1341); arguments();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1343); match(DOT);
				setState(1344); match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1345); match(DOT);
				setState(1346); match(SUPER);
				setState(1347); arguments();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1348); innerCreator();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(Java7Parser.LBRACKET, 0); }
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
		public TerminalNode RBRACKET() { return getToken(Java7Parser.RBRACKET, 0); }
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode THIS() { return getToken(Java7Parser.THIS, 0); }
		public SelectorContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		SelectorContext _localctx = new SelectorContext(_ctx, 206);
		enterRule(_localctx, RULE_selector);
		int _la;
		try {
			setState(1366);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1351); match(DOT);
				setState(1352); match(Identifier);
				setState(1354);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1353); arguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1356); match(DOT);
				setState(1357); match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1358); match(DOT);
				setState(1359); match(SUPER);
				setState(1360); superSuffix();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1361); innerCreator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1362); match(LBRACKET);
				setState(1363); expression();
				setState(1364); match(RBRACKET);
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
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ArrayCreatorContext arrayCreator() {
			return getRuleContext(ArrayCreatorContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		CreatorContext _localctx = new CreatorContext(_ctx, 208);
		enterRule(_localctx, RULE_creator);
		try {
			setState(1378);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1368); match(NEW);
				setState(1369); nonWildcardTypeArguments();
				setState(1370); classOrInterfaceType();
				setState(1371); classCreatorRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1373); match(NEW);
				setState(1374); classOrInterfaceType();
				setState(1375); classCreatorRest();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1377); arrayCreator();
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public TerminalNode NEW() { return getToken(Java7Parser.NEW, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public ArrayCreatorContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ArrayCreatorContext _localctx = new ArrayCreatorContext(_ctx, 210);
		enterRule(_localctx, RULE_arrayCreator);
		int _la;
		try {
			int _alt;
			setState(1414);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1380); match(NEW);
				setState(1381); createdName();
				setState(1382); match(LBRACKET);
				setState(1383); match(RBRACKET);
				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(1384); match(LBRACKET);
					setState(1385); match(RBRACKET);
					}
					}
					setState(1390);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1391); arrayInitializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1393); match(NEW);
				setState(1394); createdName();
				setState(1395); match(LBRACKET);
				setState(1396); expression();
				setState(1397); match(RBRACKET);
				setState(1404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1398); match(LBRACKET);
						setState(1399); expression();
						setState(1400); match(RBRACKET);
						}
						} 
					}
					setState(1406);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				}
				setState(1411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1407); match(LBRACKET);
						setState(1408); match(RBRACKET);
						}
						} 
					}
					setState(1413);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
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
		public VariableInitializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, 212);
		enterRule(_localctx, RULE_variableInitializer);
		try {
			setState(1418);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1416); arrayInitializer();
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
				setState(1417); expression();
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
		public TerminalNode COMMA(int i) {
			return getToken(Java7Parser.COMMA, i);
		}
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Java7Parser.COMMA); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, 214);
		enterRule(_localctx, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1420); match(LBRACE);
			setState(1429);
			_la = _input.LA(1);
			if (_la==LBRACE || _la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
				{
				setState(1421); variableInitializer();
				setState(1426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1422); match(COMMA);
						setState(1423); variableInitializer();
						}
						} 
					}
					setState(1428);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				}
				}
			}

			setState(1432);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1431); match(COMMA);
				}
			}

			setState(1434); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public CreatedNameContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, 216);
		enterRule(_localctx, RULE_createdName);
		try {
			setState(1438);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1436); classOrInterfaceType();
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
				setState(1437); primitiveType();
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
		public TerminalNode NEW() { return getToken(Java7Parser.NEW, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
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
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, 218);
		enterRule(_localctx, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440); match(DOT);
			setState(1441); match(NEW);
			setState(1443);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1442); nonWildcardTypeArguments();
				}
			}

			setState(1445); match(Identifier);
			setState(1447);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1446); typeArguments();
				}
			}

			setState(1449); classCreatorRest();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7ParserListener ) ((Java7ParserListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, 220);
		enterRule(_localctx, RULE_classCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451); arguments();
			setState(1453);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1452); classBody();
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
		public TerminalNode GT() { return getToken(Java7Parser.GT, 0); }
		public TerminalNode LT() { return getToken(Java7Parser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, 222);
		enterRule(_localctx, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455); match(LT);
			setState(1456); typeList();
			setState(1457); match(GT);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
		public ArgumentsContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, 224);
		enterRule(_localctx, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459); match(LPAREN);
			setState(1461);
			_la = _input.LA(1);
			if (_la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
				{
				setState(1460); expressionList();
				}
			}

			setState(1463); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IntegerLiteral() { return getToken(Java7Parser.IntegerLiteral, 0); }
		public TerminalNode FALSE() { return getToken(Java7Parser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(Java7Parser.TRUE, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Java7Parser.CharacterLiteral, 0); }
		public TerminalNode NULL() { return getToken(Java7Parser.NULL, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java7Parser.FloatingPointLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		LiteralContext _localctx = new LiteralContext(_ctx, 226);
		enterRule(_localctx, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			_input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==NULL || _la==TRUE || _la==FALSE || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral) ) {
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
		public TerminalNode CLASS() { return getToken(Java7Parser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ClassHeaderContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ClassHeaderContext _localctx = new ClassHeaderContext(_ctx, 228);
		enterRule(_localctx, RULE_classHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467); modifiers();
			setState(1468); match(CLASS);
			setState(1469); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		public EnumHeaderContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		EnumHeaderContext _localctx = new EnumHeaderContext(_ctx, 230);
		enterRule(_localctx, RULE_enumHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471); modifiers();
			setState(1472);
			_input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ENUM || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1473); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode INTERFACE() { return getToken(Java7Parser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public InterfaceHeaderContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		InterfaceHeaderContext _localctx = new InterfaceHeaderContext(_ctx, 232);
		enterRule(_localctx, RULE_interfaceHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475); modifiers();
			setState(1476); match(INTERFACE);
			setState(1477); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode AT() { return getToken(Java7Parser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(Java7Parser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public AnnotationHeaderContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		AnnotationHeaderContext _localctx = new AnnotationHeaderContext(_ctx, 234);
		enterRule(_localctx, RULE_annotationHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479); modifiers();
			setState(1480); match(AT);
			setState(1481); match(INTERFACE);
			setState(1482); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode AT() { return getToken(Java7Parser.AT, 0); }
		public TerminalNode CLASS() { return getToken(Java7Parser.CLASS, 0); }
		public TerminalNode INTERFACE() { return getToken(Java7Parser.INTERFACE, 0); }
		public TerminalNode ENUM() { return getToken(Java7Parser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TypeHeaderContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		TypeHeaderContext _localctx = new TypeHeaderContext(_ctx, 236);
		enterRule(_localctx, RULE_typeHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484); modifiers();
			setState(1491);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(1485); match(CLASS);
				}
				break;
			case ENUM:
				{
				setState(1486); match(ENUM);
				}
				break;
			case INTERFACE:
			case AT:
				{
				{
				setState(1488);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1487); match(AT);
					}
				}

				setState(1490); match(INTERFACE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1493); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public TerminalNode VOID() { return getToken(Java7Parser.VOID, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public MethodHeaderContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, 238);
		enterRule(_localctx, RULE_methodHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495); modifiers();
			setState(1497);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1496); typeParameters();
				}
			}

			setState(1501);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1499); type();
				}
				break;
			case 2:
				{
				setState(1500); match(VOID);
				}
				break;
			}
			setState(1503); match(Identifier);
			setState(1504); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
		public TerminalNode COMMA() { return getToken(Java7Parser.COMMA, 0); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public FieldHeaderContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		FieldHeaderContext _localctx = new FieldHeaderContext(_ctx, 240);
		enterRule(_localctx, RULE_fieldHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506); modifiers();
			setState(1507); type();
			setState(1508); match(Identifier);
			setState(1513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1509); match(LBRACKET);
				setState(1510); match(RBRACKET);
				}
				}
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1516);
			_input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SEMI || _la==COMMA || _la==EQ) ) {
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
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode EQ() { return getToken(Java7Parser.EQ, 0); }
		public TerminalNode COMMA() { return getToken(Java7Parser.COMMA, 0); }
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
		}
		public LocalVariableHeaderContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		LocalVariableHeaderContext _localctx = new LocalVariableHeaderContext(_ctx, 242);
		enterRule(_localctx, RULE_localVariableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518); variableModifiers();
			setState(1519); type();
			setState(1520); match(Identifier);
			setState(1525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1521); match(LBRACKET);
				setState(1522); match(RBRACKET);
				}
				}
				setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1528);
			_input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SEMI || _la==COMMA || _la==EQ) ) {
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

	public static final String _serializedATN =
		"\1f\u05fb\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7\6\2\7"+
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
		"\2r\7r\2s\7s\2t\7t\2u\7u\2v\7v\2w\7w\2x\7x\2y\7y\1\0\3\0\u00f6\b\0\1\0"+
		"\5\0\u00f9\b\0\n\0\f\0\u00fc\t\0\1\0\5\0\u00ff\b\0\n\0\f\0\u0102\t\0\1"+
		"\1\3\1\u0105\b\1\1\1\1\1\1\1\1\1\1\2\1\2\3\2\u010d\b\2\1\2\1\2\1\2\1\2"+
		"\1\2\1\2\3\2\u0115\b\2\1\2\1\2\1\2\4\2\u011a\b\2\13\2\f\2\u011b\1\2\1"+
		"\2\3\2\u0120\b\2\1\2\3\2\u0123\b\2\1\3\1\3\1\3\5\3\u0128\b\3\n\3\f\3\u012b"+
		"\t\3\1\4\1\4\3\4\u012f\b\4\1\5\1\5\3\5\u0133\b\5\1\6\5\6\u0136\b\6\n\6"+
		"\f\6\u0139\t\6\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\3\7\u0147"+
		"\b\7\1\b\1\b\5\b\u014b\b\b\n\b\f\b\u014e\t\b\1\t\1\t\3\t\u0152\b\t\1\n"+
		"\1\n\1\n\1\n\3\n\u0158\b\n\1\n\1\n\3\n\u015c\b\n\1\n\1\n\3\n\u0160\b\n"+
		"\1\n\1\n\1\13\1\13\1\13\1\13\5\13\u0168\b\13\n\13\f\13\u016b\t\13\1\13"+
		"\1\13\1\f\1\f\1\f\3\f\u0172\b\f\1\r\1\r\1\r\5\r\u0177\b\r\n\r\f\r\u017a"+
		"\t\r\1\16\1\16\1\16\1\16\1\16\3\16\u0181\b\16\1\16\1\16\1\17\1\17\3\17"+
		"\u0187\b\17\1\17\3\17\u018a\b\17\1\17\3\17\u018d\b\17\1\17\1\17\1\20\1"+
		"\20\1\20\5\20\u0194\b\20\n\20\f\20\u0197\t\20\1\21\3\21\u019a\b\21\1\21"+
		"\1\21\3\21\u019e\b\21\1\21\3\21\u01a1\b\21\1\22\1\22\5\22\u01a5\b\22\n"+
		"\22\f\22\u01a8\t\22\1\23\1\23\3\23\u01ac\b\23\1\24\1\24\1\24\1\24\3\24"+
		"\u01b2\b\24\1\24\1\24\3\24\u01b6\b\24\1\24\1\24\1\25\1\25\1\25\5\25\u01bd"+
		"\b\25\n\25\f\25\u01c0\t\25\1\26\1\26\5\26\u01c4\b\26\n\26\f\26\u01c7\t"+
		"\26\1\26\1\26\1\27\1\27\5\27\u01cd\b\27\n\27\f\27\u01d0\t\27\1\27\1\27"+
		"\1\30\1\30\3\30\u01d6\b\30\1\30\1\30\3\30\u01da\b\30\1\31\1\31\1\31\1"+
		"\31\1\31\3\31\u01e1\b\31\1\32\1\32\3\32\u01e5\b\32\1\32\1\32\3\32\u01e9"+
		"\b\32\1\32\1\32\1\32\1\32\5\32\u01ef\b\32\n\32\f\32\u01f2\t\32\1\32\1"+
		"\32\3\32\u01f6\b\32\1\32\1\32\3\32\u01fa\b\32\1\33\1\33\3\33\u01fe\b\33"+
		"\1\33\1\33\1\33\1\33\3\33\u0204\b\33\1\33\1\33\1\34\1\34\3\34\u020a\b"+
		"\34\1\34\5\34\u020d\b\34\n\34\f\34\u0210\t\34\1\34\1\34\1\35\1\35\1\35"+
		"\1\35\1\35\5\35\u0219\b\35\n\35\f\35\u021c\t\35\1\35\1\35\1\36\1\36\1"+
		"\36\5\36\u0223\b\36\n\36\f\36\u0226\t\36\1\36\1\36\3\36\u022a\b\36\1\37"+
		"\1\37\1\37\1\37\1\37\3\37\u0231\b\37\1 \1 \3 \u0235\b \1 \1 \3 \u0239"+
		"\b \1 \1 \1 \1 \5 \u023f\b \n \f \u0242\t \1 \1 \3 \u0246\b \1 \1 \1!"+
		"\1!\1!\1!\1!\5!\u024f\b!\n!\f!\u0252\t!\1!\1!\1\"\1\"\1\"\5\"\u0259\b"+
		"\"\n\"\f\"\u025c\t\"\1\"\1\"\1\"\5\"\u0261\b\"\n\"\f\"\u0264\t\"\3\"\u0266"+
		"\b\"\1#\1#\1#\5#\u026b\b#\n#\f#\u026e\t#\1$\1$\3$\u0272\b$\1%\1%\1&\1"+
		"&\1&\1&\5&\u027a\b&\n&\f&\u027d\t&\1&\1&\1&\1&\3&\u0283\b&\1\'\1\'\1\'"+
		"\1\'\3\'\u0289\b\'\3\'\u028b\b\'\1(\1(\1(\5(\u0290\b(\n(\f(\u0293\t(\1"+
		")\1)\3)\u0297\b)\1)\1)\1*\1*\1*\1*\5*\u029f\b*\n*\f*\u02a2\t*\1*\1*\1"+
		"*\4*\u02a7\b*\13*\f*\u02a8\1*\1*\3*\u02ad\b*\1+\1+\1+\1+\1+\5+\u02b4\b"+
		"+\n+\f+\u02b7\t+\1,\1,\1,\1,\1,\1-\3-\u02bf\b-\1-\1-\1-\1-\1-\1-\1-\3"+
		"-\u02c8\b-\1-\1-\1-\1-\3-\u02ce\b-\1.\1.\1.\5.\u02d3\b.\n.\f.\u02d6\t"+
		".\1/\4/\u02d9\b/\13/\f/\u02da\1\60\1\60\1\60\3\60\u02e0\b\60\1\61\1\61"+
		"\1\61\1\62\1\62\1\62\1\62\1\62\1\62\1\63\1\63\1\63\1\63\3\63\u02ef\b\63"+
		"\1\63\1\63\1\64\1\64\1\64\5\64\u02f6\b\64\n\64\f\64\u02f9\t\64\1\65\1"+
		"\65\1\65\1\65\1\66\1\66\1\66\3\66\u0302\b\66\1\67\1\67\1\67\1\67\5\67"+
		"\u0308\b\67\n\67\f\67\u030b\t\67\3\67\u030d\b\67\1\67\3\67\u0310\b\67"+
		"\1\67\1\67\18\18\18\18\18\18\19\19\59\u031c\b9\n9\f9\u031f\t9\19\19\1"+
		":\1:\1:\1:\1:\1:\1:\3:\u032a\b:\1;\1;\1;\1;\1;\1;\1;\3;\u0333\b;\1;\1"+
		";\1<\1<\5<\u0339\b<\n<\f<\u033c\t<\1<\1<\1=\1=\1=\3=\u0343\b=\1>\1>\1"+
		">\1?\1?\1?\1?\1?\5?\u034d\b?\n?\f?\u0350\t?\1@\1@\1@\1@\1@\3@\u0357\b"+
		"@\1@\1@\1@\1@\1@\1@\3@\u035f\b@\1@\1@\1@\1@\1@\1@\1@\3@\u0368\b@\1@\1"+
		"@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\3"+
		"@\u0382\b@\1@\1@\1@\1@\1@\1@\1@\3@\u038b\b@\1@\1@\1@\3@\u0390\b@\1@\1"+
		"@\1@\1@\1@\1@\1@\1@\3@\u039a\b@\1A\5A\u039d\bA\nA\fA\u03a0\tA\1B\1B\5"+
		"B\u03a4\bB\nB\fB\u03a7\tB\1C\1C\1C\1C\1C\1C\3C\u03af\bC\1D\1D\1D\1D\1"+
		"D\1D\1D\1D\1D\3D\u03ba\bD\1D\3D\u03bd\bD\1E\1E\1E\1E\3E\u03c3\bE\1E\1"+
		"E\3E\u03c7\bE\1F\1F\1F\3F\u03cc\bF\1F\1F\1G\1G\1G\5G\u03d3\bG\nG\fG\u03d6"+
		"\tG\1H\3H\u03d9\bH\1H\1H\1H\1H\1H\1I\1I\5I\u03e2\bI\nI\fI\u03e5\tI\1J"+
		"\1J\1J\1J\1J\1J\1K\1K\1K\1K\5K\u03f1\bK\nK\fK\u03f4\tK\1K\1K\1K\5K\u03f9"+
		"\bK\nK\fK\u03fc\tK\1L\1L\1L\1L\1L\5L\u0403\bL\nL\fL\u0406\tL\1M\1M\1M"+
		"\1M\1M\1M\1M\1M\1M\1M\1M\1M\1M\3M\u0415\bM\1M\1M\3M\u0419\bM\1M\1M\3M"+
		"\u041d\bM\1M\1M\3M\u0421\bM\1N\1N\3N\u0425\bN\1O\1O\1O\1O\1P\1P\1P\5P"+
		"\u042e\bP\nP\fP\u0431\tP\1Q\1Q\1Q\1Q\3Q\u0437\bQ\1R\1R\1R\1R\1R\1R\1R"+
		"\1R\1R\1R\1R\1R\1R\1R\1R\1R\1R\1R\1R\1R\1R\1R\1R\1R\1R\1R\1R\1R\1R\1R"+
		"\1R\3R\u0458\bR\1S\1S\1S\1S\1S\1S\3S\u0460\bS\1T\1T\1T\5T\u0465\bT\nT"+
		"\fT\u0468\tT\1U\1U\1U\5U\u046d\bU\nU\fU\u0470\tU\1V\1V\1V\5V\u0475\bV"+
		"\nV\fV\u0478\tV\1W\1W\1W\5W\u047d\bW\nW\fW\u0480\tW\1X\1X\1X\5X\u0485"+
		"\bX\nX\fX\u0488\tX\1Y\1Y\1Y\5Y\u048d\bY\nY\fY\u0490\tY\1Z\1Z\1Z\3Z\u0495"+
		"\bZ\1[\1[\1[\1[\5[\u049b\b[\n[\f[\u049e\t[\1\\\1\\\1\\\1\\\1\\\1\\\3\\"+
		"\u04a6\b\\\1]\1]\1]\1]\5]\u04ac\b]\n]\f]\u04af\t]\1^\1^\1^\1^\1^\1^\1"+
		"^\3^\u04b8\b^\1_\1_\1_\5_\u04bd\b_\n_\f_\u04c0\t_\1`\1`\1`\5`\u04c5\b"+
		"`\n`\f`\u04c8\t`\1a\1a\1a\1a\1a\1a\1a\1a\1a\3a\u04d3\ba\1b\1b\1b\1b\1"+
		"b\1b\1b\5b\u04dc\bb\nb\fb\u04df\tb\1b\3b\u04e2\bb\3b\u04e4\bb\1c\1c\1"+
		"c\1c\1c\1c\1c\1c\1c\1c\3c\u04f0\bc\1d\1d\1d\1d\5d\u04f6\bd\nd\fd\u04f9"+
		"\td\1d\3d\u04fc\bd\1d\1d\1d\5d\u0501\bd\nd\fd\u0504\td\1d\3d\u0507\bd"+
		"\1d\1d\1d\1d\1d\1d\1d\5d\u0510\bd\nd\fd\u0513\td\1d\1d\1d\1d\1d\1d\3d"+
		"\u051b\bd\1e\1e\1e\3e\u0520\be\1e\1e\3e\u0524\be\3e\u0526\be\1f\1f\4f"+
		"\u052a\bf\13f\ff\u052b\1f\1f\1f\1f\1f\1f\4f\u0534\bf\13f\ff\u0535\1f\1"+
		"f\1f\1f\1f\1f\1f\1f\1f\1f\1f\1f\1f\1f\3f\u0546\bf\1g\1g\1g\3g\u054b\b"+
		"g\1g\1g\1g\1g\1g\1g\1g\1g\1g\1g\3g\u0557\bg\1h\1h\1h\1h\1h\1h\1h\1h\1"+
		"h\1h\3h\u0563\bh\1i\1i\1i\1i\1i\1i\5i\u056b\bi\ni\fi\u056e\ti\1i\1i\1"+
		"i\1i\1i\1i\1i\1i\1i\1i\1i\5i\u057b\bi\ni\fi\u057e\ti\1i\1i\5i\u0582\b"+
		"i\ni\fi\u0585\ti\3i\u0587\bi\1j\1j\3j\u058b\bj\1k\1k\1k\1k\5k\u0591\b"+
		"k\nk\fk\u0594\tk\3k\u0596\bk\1k\3k\u0599\bk\1k\1k\1l\1l\3l\u059f\bl\1"+
		"m\1m\1m\3m\u05a4\bm\1m\1m\3m\u05a8\bm\1m\1m\1n\1n\3n\u05ae\bn\1o\1o\1"+
		"o\1o\1p\1p\3p\u05b6\bp\1p\1p\1q\1q\1r\1r\1r\1r\1s\1s\1s\1s\1t\1t\1t\1"+
		"t\1u\1u\1u\1u\1u\1v\1v\1v\1v\3v\u05d1\bv\1v\3v\u05d4\bv\1v\1v\1w\1w\3"+
		"w\u05da\bw\1w\1w\3w\u05de\bw\1w\1w\1w\1x\1x\1x\1x\1x\5x\u05e8\bx\nx\f"+
		"x\u05eb\tx\1x\1x\1y\1y\1y\1y\1y\5y\u05f4\by\ny\fy\u05f7\ty\1y\1y\1yz\0"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\0\13\1\37&\2((++\1*+\1JK\1HI\2\5\5FG\1AB\2,.^a\2??"+
		"bb\3\1\1\17\17\32\32\3\1\1\17\17\32\32\u067c\0\u00f5\1\0\0\0\2\u0104\1"+
		"\0\0\0\4\u0122\1\0\0\0\6\u0124\1\0\0\0\b\u012e\1\0\0\0\n\u0132\1\0\0\0"+
		"\f\u0137\1\0\0\0\16\u0146\1\0\0\0\20\u014c\1\0\0\0\22\u0151\1\0\0\0\24"+
		"\u0153\1\0\0\0\26\u0163\1\0\0\0\30\u016e\1\0\0\0\32\u0173\1\0\0\0\34\u017b"+
		"\1\0\0\0\36\u0184\1\0\0\0 \u0190\1\0\0\0\"\u0199\1\0\0\0$\u01a2\1\0\0"+
		"\0&\u01ab\1\0\0\0(\u01ad\1\0\0\0*\u01b9\1\0\0\0,\u01c1\1\0\0\0.\u01ca"+
		"\1\0\0\0\60\u01d9\1\0\0\0\62\u01e0\1\0\0\0\64\u01e2\1\0\0\0\66\u01fb\1"+
		"\0\0\08\u0207\1\0\0\0:\u0213\1\0\0\0<\u021f\1\0\0\0>\u0230\1\0\0\0@\u0232"+
		"\1\0\0\0B\u0249\1\0\0\0D\u0265\1\0\0\0F\u0267\1\0\0\0H\u026f\1\0\0\0J"+
		"\u0273\1\0\0\0L\u0282\1\0\0\0N\u028a\1\0\0\0P\u028c\1\0\0\0R\u0294\1\0"+
		"\0\0T\u02ac\1\0\0\0V\u02ae\1\0\0\0X\u02b8\1\0\0\0Z\u02cd\1\0\0\0\\\u02cf"+
		"\1\0\0\0^\u02d8\1\0\0\0`\u02df\1\0\0\0b\u02e1\1\0\0\0d\u02e4\1\0\0\0f"+
		"\u02ea\1\0\0\0h\u02f2\1\0\0\0j\u02fa\1\0\0\0l\u0301\1\0\0\0n\u0303\1\0"+
		"\0\0p\u0313\1\0\0\0r\u0319\1\0\0\0t\u0329\1\0\0\0v\u032b\1\0\0\0x\u0336"+
		"\1\0\0\0z\u0342\1\0\0\0|\u0344\1\0\0\0~\u0347\1\0\0\0\u0080\u0399\1\0"+
		"\0\0\u0082\u039e\1\0\0\0\u0084\u03a1\1\0\0\0\u0086\u03ae\1\0\0\0\u0088"+
		"\u03bc\1\0\0\0\u008a\u03be\1\0\0\0\u008c\u03c8\1\0\0\0\u008e\u03cf\1\0"+
		"\0\0\u0090\u03d8\1\0\0\0\u0092\u03df\1\0\0\0\u0094\u03e6\1\0\0\0\u0096"+
		"\u03ec\1\0\0\0\u0098\u03fd\1\0\0\0\u009a\u0420\1\0\0\0\u009c\u0424\1\0"+
		"\0\0\u009e\u0426\1\0\0\0\u00a0\u042a\1\0\0\0\u00a2\u0432\1\0\0\0\u00a4"+
		"\u0457\1\0\0\0\u00a6\u0459\1\0\0\0\u00a8\u0461\1\0\0\0\u00aa\u0469\1\0"+
		"\0\0\u00ac\u0471\1\0\0\0\u00ae\u0479\1\0\0\0\u00b0\u0481\1\0\0\0\u00b2"+
		"\u0489\1\0\0\0\u00b4\u0491\1\0\0\0\u00b6\u0496\1\0\0\0\u00b8\u04a5\1\0"+
		"\0\0\u00ba\u04a7\1\0\0\0\u00bc\u04b7\1\0\0\0\u00be\u04b9\1\0\0\0\u00c0"+
		"\u04c1\1\0\0\0\u00c2\u04d2\1\0\0\0\u00c4\u04e3\1\0\0\0\u00c6\u04ef\1\0"+
		"\0\0\u00c8\u051a\1\0\0\0\u00ca\u0525\1\0\0\0\u00cc\u0545\1\0\0\0\u00ce"+
		"\u0556\1\0\0\0\u00d0\u0562\1\0\0\0\u00d2\u0586\1\0\0\0\u00d4\u058a\1\0"+
		"\0\0\u00d6\u058c\1\0\0\0\u00d8\u059e\1\0\0\0\u00da\u05a0\1\0\0\0\u00dc"+
		"\u05ab\1\0\0\0\u00de\u05af\1\0\0\0\u00e0\u05b3\1\0\0\0\u00e2\u05b9\1\0"+
		"\0\0\u00e4\u05bb\1\0\0\0\u00e6\u05bf\1\0\0\0\u00e8\u05c3\1\0\0\0\u00ea"+
		"\u05c7\1\0\0\0\u00ec\u05cc\1\0\0\0\u00ee\u05d7\1\0\0\0\u00f0\u05e2\1\0"+
		"\0\0\u00f2\u05ee\1\0\0\0\u00f4\u00f6\3\2\1\0\u00f5\u00f4\1\0\0\0\u00f5"+
		"\u00f6\1\0\0\0\u00f6\u00fa\1\0\0\0\u00f7\u00f9\3\4\2\0\u00f8\u00f7\1\0"+
		"\0\0\u00f9\u00fc\1\0\0\0\u00fa\u00f8\1\0\0\0\u00fa\u00fb\1\0\0\0\u00fb"+
		"\u0100\1\0\0\0\u00fc\u00fa\1\0\0\0\u00fd\u00ff\3\b\4\0\u00fe\u00fd\1\0"+
		"\0\0\u00ff\u0102\1\0\0\0\u0100\u00fe\1\0\0\0\u0100\u0101\1\0\0\0\u0101"+
		"\1\1\0\0\0\u0102\u0100\1\0\0\0\u0103\u0105\3^/\0\u0104\u0103\1\0\0\0\u0104"+
		"\u0105\1\0\0\0\u0105\u0106\1\0\0\0\u0106\u0107\5\2\0\0\u0107\u0108\3\\"+
		".\0\u0108\u0109\5\1\0\0\u0109\3\1\0\0\0\u010a\u010c\5\3\0\0\u010b\u010d"+
		"\5\f\0\0\u010c\u010b\1\0\0\0\u010c\u010d\1\0\0\0\u010d\u010e\1\0\0\0\u010e"+
		"\u010f\5b\0\0\u010f\u0110\5\4\0\0\u0110\u0111\5\5\0\0\u0111\u0123\5\1"+
		"\0\0\u0112\u0114\5\3\0\0\u0113\u0115\5\f\0\0\u0114\u0113\1\0\0\0\u0114"+
		"\u0115\1\0\0\0\u0115\u0116\1\0\0\0\u0116\u0119\5b\0\0\u0117\u0118\5\4"+
		"\0\0\u0118\u011a\5b\0\0\u0119\u0117\1\0\0\0\u011a\u011b\1\0\0\0\u011b"+
		"\u0119\1\0\0\0\u011b\u011c\1\0\0\0\u011c\u011f\1\0\0\0\u011d\u011e\5\4"+
		"\0\0\u011e\u0120\5\5\0\0\u011f\u011d\1\0\0\0\u011f\u0120\1\0\0\0\u0120"+
		"\u0121\1\0\0\0\u0121\u0123\5\1\0\0\u0122\u010a\1\0\0\0\u0122\u0112\1\0"+
		"\0\0\u0123\5\1\0\0\0\u0124\u0129\5b\0\0\u0125\u0126\5\4\0\0\u0126\u0128"+
		"\5b\0\0\u0127\u0125\1\0\0\0\u0128\u012b\1\0\0\0\u0129\u0127\1\0\0\0\u0129"+
		"\u012a\1\0\0\0\u012a\7\1\0\0\0\u012b\u0129\1\0\0\0\u012c\u012f\3\n\5\0"+
		"\u012d\u012f\5\1\0\0\u012e\u012c\1\0\0\0\u012e\u012d\1\0\0\0\u012f\t\1"+
		"\0\0\0\u0130\u0133\3\22\t\0\u0131\u0133\3&\23\0\u0132\u0130\1\0\0\0\u0132"+
		"\u0131\1\0\0\0\u0133\13\1\0\0\0\u0134\u0136\3\16\7\0\u0135\u0134\1\0\0"+
		"\0\u0136\u0139\1\0\0\0\u0137\u0135\1\0\0\0\u0137\u0138\1\0\0\0\u0138\r"+
		"\1\0\0\0\u0139\u0137\1\0\0\0\u013a\u0147\3`\60\0\u013b\u0147\5\b\0\0\u013c"+
		"\u0147\5\t\0\0\u013d\u0147\5\n\0\0\u013e\u0147\5\f\0\0\u013f\u0147\5\13"+
		"\0\0\u0140\u0147\5\r\0\0\u0141\u0147\5\33\0\0\u0142\u0147\5\34\0\0\u0143"+
		"\u0147\5\35\0\0\u0144\u0147\5\36\0\0\u0145\u0147\5\16\0\0\u0146\u013a"+
		"\1\0\0\0\u0146\u013b\1\0\0\0\u0146\u013c\1\0\0\0\u0146\u013d\1\0\0\0\u0146"+
		"\u013e\1\0\0\0\u0146\u013f\1\0\0\0\u0146\u0140\1\0\0\0\u0146\u0141\1\0"+
		"\0\0\u0146\u0142\1\0\0\0\u0146\u0143\1\0\0\0\u0146\u0144\1\0\0\0\u0146"+
		"\u0145\1\0\0\0\u0147\17\1\0\0\0\u0148\u014b\5\r\0\0\u0149\u014b\3`\60"+
		"\0\u014a\u0148\1\0\0\0\u014a\u0149\1\0\0\0\u014b\u014e\1\0\0\0\u014c\u014a"+
		"\1\0\0\0\u014c\u014d\1\0\0\0\u014d\21\1\0\0\0\u014e\u014c\1\0\0\0\u014f"+
		"\u0152\3\24\n\0\u0150\u0152\3\34\16\0\u0151\u014f\1\0\0\0\u0151\u0150"+
		"\1\0\0\0\u0152\23\1\0\0\0\u0153\u0154\3\f\6\0\u0154\u0155\5\6\0\0\u0155"+
		"\u0157\5b\0\0\u0156\u0158\3\26\13\0\u0157\u0156\1\0\0\0\u0157\u0158\1"+
		"\0\0\0\u0158\u015b\1\0\0\0\u0159\u015a\5(\0\0\u015a\u015c\3D\"\0\u015b"+
		"\u0159\1\0\0\0\u015b\u015c\1\0\0\0\u015c\u015f\1\0\0\0\u015d\u015e\5\7"+
		"\0\0\u015e\u0160\3*\25\0\u015f\u015d\1\0\0\0\u015f\u0160\1\0\0\0\u0160"+
		"\u0161\1\0\0\0\u0161\u0162\3,\26\0\u0162\25\1\0\0\0\u0163\u0164\5Z\0\0"+
		"\u0164\u0169\3\30\f\0\u0165\u0166\5\17\0\0\u0166\u0168\3\30\f\0\u0167"+
		"\u0165\1\0\0\0\u0168\u016b\1\0\0\0\u0169\u0167\1\0\0\0\u0169\u016a\1\0"+
		"\0\0\u016a\u016c\1\0\0\0\u016b\u0169\1\0\0\0\u016c\u016d\5Y\0\0\u016d"+
		"\27\1\0\0\0\u016e\u0171\5b\0\0\u016f\u0170\5(\0\0\u0170\u0172\3\32\r\0"+
		"\u0171\u016f\1\0\0\0\u0171\u0172\1\0\0\0\u0172\31\1\0\0\0\u0173\u0178"+
		"\3D\"\0\u0174\u0175\5L\0\0\u0175\u0177\3D\"\0\u0176\u0174\1\0\0\0\u0177"+
		"\u017a\1\0\0\0\u0178\u0176\1\0\0\0\u0178\u0179\1\0\0\0\u0179\33\1\0\0"+
		"\0\u017a\u0178\1\0\0\0\u017b\u017c\3\f\6\0\u017c\u017d\5?\0\0\u017d\u0180"+
		"\5b\0\0\u017e\u017f\5\7\0\0\u017f\u0181\3*\25\0\u0180\u017e\1\0\0\0\u0180"+
		"\u0181\1\0\0\0\u0181\u0182\1\0\0\0\u0182\u0183\3\36\17\0\u0183\35\1\0"+
		"\0\0\u0184\u0186\5\20\0\0\u0185\u0187\3 \20\0\u0186\u0185\1\0\0\0\u0186"+
		"\u0187\1\0\0\0\u0187\u0189\1\0\0\0\u0188\u018a\5\17\0\0\u0189\u0188\1"+
		"\0\0\0\u0189\u018a\1\0\0\0\u018a\u018c\1\0\0\0\u018b\u018d\3$\22\0\u018c"+
		"\u018b\1\0\0\0\u018c\u018d\1\0\0\0\u018d\u018e\1\0\0\0\u018e\u018f\5\21"+
		"\0\0\u018f\37\1\0\0\0\u0190\u0195\3\"\21\0\u0191\u0192\5\17\0\0\u0192"+
		"\u0194\3\"\21\0\u0193\u0191\1\0\0\0\u0194\u0197\1\0\0\0\u0195\u0193\1"+
		"\0\0\0\u0195\u0196\1\0\0\0\u0196!\1\0\0\0\u0197\u0195\1\0\0\0\u0198\u019a"+
		"\3^/\0\u0199\u0198\1\0\0\0\u0199\u019a\1\0\0\0\u019a\u019b\1\0\0\0\u019b"+
		"\u019d\5b\0\0\u019c\u019e\3\u00e0p\0\u019d\u019c\1\0\0\0\u019d\u019e\1"+
		"\0\0\0\u019e\u01a0\1\0\0\0\u019f\u01a1\3,\26\0\u01a0\u019f\1\0\0\0\u01a0"+
		"\u01a1\1\0\0\0\u01a1#\1\0\0\0\u01a2\u01a6\5\1\0\0\u01a3\u01a5\3\60\30"+
		"\0\u01a4\u01a3\1\0\0\0\u01a5\u01a8\1\0\0\0\u01a6\u01a4\1\0\0\0\u01a6\u01a7"+
		"\1\0\0\0\u01a7%\1\0\0\0\u01a8\u01a6\1\0\0\0\u01a9\u01ac\3(\24\0\u01aa"+
		"\u01ac\3p8\0\u01ab\u01a9\1\0\0\0\u01ab\u01aa\1\0\0\0\u01ac\'\1\0\0\0\u01ad"+
		"\u01ae\3\f\6\0\u01ae\u01af\5\27\0\0\u01af\u01b1\5b\0\0\u01b0\u01b2\3\26"+
		"\13\0\u01b1\u01b0\1\0\0\0\u01b1\u01b2\1\0\0\0\u01b2\u01b5\1\0\0\0\u01b3"+
		"\u01b4\5(\0\0\u01b4\u01b6\3*\25\0\u01b5\u01b3\1\0\0\0\u01b5\u01b6\1\0"+
		"\0\0\u01b6\u01b7\1\0\0\0\u01b7\u01b8\3.\27\0\u01b8)\1\0\0\0\u01b9\u01be"+
		"\3D\"\0\u01ba\u01bb\5\17\0\0\u01bb\u01bd\3D\"\0\u01bc\u01ba\1\0\0\0\u01bd"+
		"\u01c0\1\0\0\0\u01be\u01bc\1\0\0\0\u01be\u01bf\1\0\0\0\u01bf+\1\0\0\0"+
		"\u01c0\u01be\1\0\0\0\u01c1\u01c5\5\20\0\0\u01c2\u01c4\3\60\30\0\u01c3"+
		"\u01c2\1\0\0\0\u01c4\u01c7\1\0\0\0\u01c5\u01c3\1\0\0\0\u01c5\u01c6\1\0"+
		"\0\0\u01c6\u01c8\1\0\0\0\u01c7\u01c5\1\0\0\0\u01c8\u01c9\5\21\0\0\u01c9"+
		"-\1\0\0\0\u01ca\u01ce\5\20\0\0\u01cb\u01cd\3>\37\0\u01cc\u01cb\1\0\0\0"+
		"\u01cd\u01d0\1\0\0\0\u01ce\u01cc\1\0\0\0\u01ce\u01cf\1\0\0\0\u01cf\u01d1"+
		"\1\0\0\0\u01d0\u01ce\1\0\0\0\u01d1\u01d2\5\21\0\0\u01d2/\1\0\0\0\u01d3"+
		"\u01da\5\1\0\0\u01d4\u01d6\5\f\0\0\u01d5\u01d4\1\0\0\0\u01d5\u01d6\1\0"+
		"\0\0\u01d6\u01d7\1\0\0\0\u01d7\u01da\3x<\0\u01d8\u01da\3\62\31\0\u01d9"+
		"\u01d3\1\0\0\0\u01d9\u01d5\1\0\0\0\u01d9\u01d8\1\0\0\0\u01da\61\1\0\0"+
		"\0\u01db\u01e1\3\66\33\0\u01dc\u01e1\3:\35\0\u01dd\u01e1\3\64\32\0\u01de"+
		"\u01e1\3\22\t\0\u01df\u01e1\3&\23\0\u01e0\u01db\1\0\0\0\u01e0\u01dc\1"+
		"\0\0\0\u01e0\u01dd\1\0\0\0\u01e0\u01de\1\0\0\0\u01e0\u01df\1\0\0\0\u01e1"+
		"\63\1\0\0\0\u01e2\u01e4\3\f\6\0\u01e3\u01e5\3\26\13\0\u01e4\u01e3\1\0"+
		"\0\0\u01e4\u01e5\1\0\0\0\u01e5\u01e8\1\0\0\0\u01e6\u01e9\3D\"\0\u01e7"+
		"\u01e9\5\26\0\0\u01e8\u01e6\1\0\0\0\u01e8\u01e7\1\0\0\0\u01e9\u01ea\1"+
		"\0\0\0\u01ea\u01eb\5b\0\0\u01eb\u01f0\3R)\0\u01ec\u01ed\5\22\0\0\u01ed"+
		"\u01ef\5\23\0\0\u01ee\u01ec\1\0\0\0\u01ef\u01f2\1\0\0\0\u01f0\u01ee\1"+
		"\0\0\0\u01f0\u01f1\1\0\0\0\u01f1\u01f5\1\0\0\0\u01f2\u01f0\1\0\0\0\u01f3"+
		"\u01f4\5\31\0\0\u01f4\u01f6\3P(\0\u01f5\u01f3\1\0\0\0\u01f5\u01f6\1\0"+
		"\0\0\u01f6\u01f9\1\0\0\0\u01f7\u01fa\3x<\0\u01f8\u01fa\5\1\0\0\u01f9\u01f7"+
		"\1\0\0\0\u01f9\u01f8\1\0\0\0\u01fa\65\1\0\0\0\u01fb\u01fd\3\f\6\0\u01fc"+
		"\u01fe\3\26\13\0\u01fd\u01fc\1\0\0\0\u01fd\u01fe\1\0\0\0\u01fe\u01ff\1"+
		"\0\0\0\u01ff\u0200\5b\0\0\u0200\u0203\3R)\0\u0201\u0202\5\31\0\0\u0202"+
		"\u0204\3P(\0\u0203\u0201\1\0\0\0\u0203\u0204\1\0\0\0\u0204\u0205\1\0\0"+
		"\0\u0205\u0206\38\34\0\u0206\67\1\0\0\0\u0207\u0209\5\20\0\0\u0208\u020a"+
		"\3Z-\0\u0209\u0208\1\0\0\0\u0209\u020a\1\0\0\0\u020a\u020e\1\0\0\0\u020b"+
		"\u020d\3z=\0\u020c\u020b\1\0\0\0\u020d\u0210\1\0\0\0\u020e\u020c\1\0\0"+
		"\0\u020e\u020f\1\0\0\0\u020f\u0211\1\0\0\0\u0210\u020e\1\0\0\0\u0211\u0212"+
		"\5\21\0\0\u02129\1\0\0\0\u0213\u0214\3\f\6\0\u0214\u0215\3D\"\0\u0215"+
		"\u021a\3<\36\0\u0216\u0217\5\17\0\0\u0217\u0219\3<\36\0\u0218\u0216\1"+
		"\0\0\0\u0219\u021c\1\0\0\0\u021a\u0218\1\0\0\0\u021a\u021b\1\0\0\0\u021b"+
		"\u021d\1\0\0\0\u021c\u021a\1\0\0\0\u021d\u021e\5\1\0\0\u021e;\1\0\0\0"+
		"\u021f\u0224\5b\0\0\u0220\u0221\5\22\0\0\u0221\u0223\5\23\0\0\u0222\u0220"+
		"\1\0\0\0\u0223\u0226\1\0\0\0\u0224\u0222\1\0\0\0\u0224\u0225\1\0\0\0\u0225"+
		"\u0229\1\0\0\0\u0226\u0224\1\0\0\0\u0227\u0228\5\32\0\0\u0228\u022a\3"+
		"\u00d4j\0\u0229\u0227\1\0\0\0\u0229\u022a\1\0\0\0\u022a=\1\0\0\0\u022b"+
		"\u0231\3B!\0\u022c\u0231\3@ \0\u022d\u0231\3&\23\0\u022e\u0231\3\22\t"+
		"\0\u022f\u0231\5\1\0\0\u0230\u022b\1\0\0\0\u0230\u022c\1\0\0\0\u0230\u022d"+
		"\1\0\0\0\u0230\u022e\1\0\0\0\u0230\u022f\1\0\0\0\u0231?\1\0\0\0\u0232"+
		"\u0234\3\f\6\0\u0233\u0235\3\26\13\0\u0234\u0233\1\0\0\0\u0234\u0235\1"+
		"\0\0\0\u0235\u0238\1\0\0\0\u0236\u0239\3D\"\0\u0237\u0239\5\26\0\0\u0238"+
		"\u0236\1\0\0\0\u0238\u0237\1\0\0\0\u0239\u023a\1\0\0\0\u023a\u023b\5b"+
		"\0\0\u023b\u0240\3R)\0\u023c\u023d\5\22\0\0\u023d\u023f\5\23\0\0\u023e"+
		"\u023c\1\0\0\0\u023f\u0242\1\0\0\0\u0240\u023e\1\0\0\0\u0240\u0241\1\0"+
		"\0\0\u0241\u0245\1\0\0\0\u0242\u0240\1\0\0\0\u0243\u0244\5\31\0\0\u0244"+
		"\u0246\3P(\0\u0245\u0243\1\0\0\0\u0245\u0246\1\0\0\0\u0246\u0247\1\0\0"+
		"\0\u0247\u0248\5\1\0\0\u0248A\1\0\0\0\u0249\u024a\3\f\6\0\u024a\u024b"+
		"\3D\"\0\u024b\u0250\3<\36\0\u024c\u024d\5\17\0\0\u024d\u024f\3<\36\0\u024e"+
		"\u024c\1\0\0\0\u024f\u0252\1\0\0\0\u0250\u024e\1\0\0\0\u0250\u0251\1\0"+
		"\0\0\u0251\u0253\1\0\0\0\u0252\u0250\1\0\0\0\u0253\u0254\5\1\0\0\u0254"+
		"C\1\0\0\0\u0255\u025a\3F#\0\u0256\u0257\5\22\0\0\u0257\u0259\5\23\0\0"+
		"\u0258\u0256\1\0\0\0\u0259\u025c\1\0\0\0\u025a\u0258\1\0\0\0\u025a\u025b"+
		"\1\0\0\0\u025b\u0266\1\0\0\0\u025c\u025a\1\0\0\0\u025d\u0262\3J%\0\u025e"+
		"\u025f\5\22\0\0\u025f\u0261\5\23\0\0\u0260\u025e\1\0\0\0\u0261\u0264\1"+
		"\0\0\0\u0262\u0260\1\0\0\0\u0262\u0263\1\0\0\0\u0263\u0266\1\0\0\0\u0264"+
		"\u0262\1\0\0\0\u0265\u0255\1\0\0\0\u0265\u025d\1\0\0\0\u0266E\1\0\0\0"+
		"\u0267\u026c\3H$\0\u0268\u0269\5\4\0\0\u0269\u026b\3H$\0\u026a\u0268\1"+
		"\0\0\0\u026b\u026e\1\0\0\0\u026c\u026a\1\0\0\0\u026c\u026d\1\0\0\0\u026d"+
		"G\1\0\0\0\u026e\u026c\1\0\0\0\u026f\u0271\5b\0\0\u0270\u0272\3L&\0\u0271"+
		"\u0270\1\0\0\0\u0271\u0272\1\0\0\0\u0272I\1\0\0\0\u0273\u0274\7\0\0\0"+
		"\u0274K\1\0\0\0\u0275\u0276\5Z\0\0\u0276\u027b\3N\'\0\u0277\u0278\5\17"+
		"\0\0\u0278\u027a\3N\'\0\u0279\u0277\1\0\0\0\u027a\u027d\1\0\0\0\u027b"+
		"\u0279\1\0\0\0\u027b\u027c\1\0\0\0\u027c\u027e\1\0\0\0\u027d\u027b\1\0"+
		"\0\0\u027e\u027f\5Y\0\0\u027f\u0283\1\0\0\0\u0280\u0281\5Z\0\0\u0281\u0283"+
		"\5Y\0\0\u0282\u0275\1\0\0\0\u0282\u0280\1\0\0\0\u0283M\1\0\0\0\u0284\u028b"+
		"\3D\"\0\u0285\u0288\5\'\0\0\u0286\u0287\7\1\0\0\u0287\u0289\3D\"\0\u0288"+
		"\u0286\1\0\0\0\u0288\u0289\1\0\0\0\u0289\u028b\1\0\0\0\u028a\u0284\1\0"+
		"\0\0\u028a\u0285\1\0\0\0\u028bO\1\0\0\0\u028c\u0291\3\\.\0\u028d\u028e"+
		"\5\17\0\0\u028e\u0290\3\\.\0\u028f\u028d\1\0\0\0\u0290\u0293\1\0\0\0\u0291"+
		"\u028f\1\0\0\0\u0291\u0292\1\0\0\0\u0292Q\1\0\0\0\u0293\u0291\1\0\0\0"+
		"\u0294\u0296\5\24\0\0\u0295\u0297\3T*\0\u0296\u0295\1\0\0\0\u0296\u0297"+
		"\1\0\0\0\u0297\u0298\1\0\0\0\u0298\u0299\5\25\0\0\u0299S\1\0\0\0\u029a"+
		"\u02ad\3X,\0\u029b\u02a0\3V+\0\u029c\u029d\5\17\0\0\u029d\u029f\3V+\0"+
		"\u029e\u029c\1\0\0\0\u029f\u02a2\1\0\0\0\u02a0\u029e\1\0\0\0\u02a0\u02a1"+
		"\1\0\0\0\u02a1\u02ad\1\0\0\0\u02a2\u02a0\1\0\0\0\u02a3\u02a4\3V+\0\u02a4"+
		"\u02a5\5\17\0\0\u02a5\u02a7\1\0\0\0\u02a6\u02a3\1\0\0\0\u02a7\u02a8\1"+
		"\0\0\0\u02a8\u02a6\1\0\0\0\u02a8\u02a9\1\0\0\0\u02a9\u02aa\1\0\0\0\u02aa"+
		"\u02ab\3X,\0\u02ab\u02ad\1\0\0\0\u02ac\u029a\1\0\0\0\u02ac\u029b\1\0\0"+
		"\0\u02ac\u02a6\1\0\0\0\u02adU\1\0\0\0\u02ae\u02af\3\20\b\0\u02af\u02b0"+
		"\3D\"\0\u02b0\u02b5\5b\0\0\u02b1\u02b2\5\22\0\0\u02b2\u02b4\5\23\0\0\u02b3"+
		"\u02b1\1\0\0\0\u02b4\u02b7\1\0\0\0\u02b5\u02b3\1\0\0\0\u02b5\u02b6\1\0"+
		"\0\0\u02b6W\1\0\0\0\u02b7\u02b5\1\0\0\0\u02b8\u02b9\3\20\b\0\u02b9\u02ba"+
		"\3D\"\0\u02ba\u02bb\5)\0\0\u02bb\u02bc\5b\0\0\u02bcY\1\0\0\0\u02bd\u02bf"+
		"\3\u00deo\0\u02be\u02bd\1\0\0\0\u02be\u02bf\1\0\0\0\u02bf\u02c0\1\0\0"+
		"\0\u02c0\u02c1\7\2\0\0\u02c1\u02c2\3\u00e0p\0\u02c2\u02c3\5\1\0\0\u02c3"+
		"\u02ce\1\0\0\0\u02c4\u02c5\3\u00c8d\0\u02c5\u02c7\5\4\0\0\u02c6\u02c8"+
		"\3\u00deo\0\u02c7\u02c6\1\0\0\0\u02c7\u02c8\1\0\0\0\u02c8\u02c9\1\0\0"+
		"\0\u02c9\u02ca\5+\0\0\u02ca\u02cb\3\u00e0p\0\u02cb\u02cc\5\1\0\0\u02cc"+
		"\u02ce\1\0\0\0\u02cd\u02be\1\0\0\0\u02cd\u02c4\1\0\0\0\u02ce[\1\0\0\0"+
		"\u02cf\u02d4\5b\0\0\u02d0\u02d1\5\4\0\0\u02d1\u02d3\5b\0\0\u02d2\u02d0"+
		"\1\0\0\0\u02d3\u02d6\1\0\0\0\u02d4\u02d2\1\0\0\0\u02d4\u02d5\1\0\0\0\u02d5"+
		"]\1\0\0\0\u02d6\u02d4\1\0\0\0\u02d7\u02d9\3`\60\0\u02d8\u02d7\1\0\0\0"+
		"\u02d9\u02da\1\0\0\0\u02da\u02d8\1\0\0\0\u02da\u02db\1\0\0\0\u02db_\1"+
		"\0\0\0\u02dc\u02e0\3b\61\0\u02dd\u02e0\3d\62\0\u02de\u02e0\3f\63\0\u02df"+
		"\u02dc\1\0\0\0\u02df\u02dd\1\0\0\0\u02df\u02de\1\0\0\0\u02e0a\1\0\0\0"+
		"\u02e1\u02e2\5/\0\0\u02e2\u02e3\3\\.\0\u02e3c\1\0\0\0\u02e4\u02e5\5/\0"+
		"\0\u02e5\u02e6\3\\.\0\u02e6\u02e7\5\24\0\0\u02e7\u02e8\3l\66\0\u02e8\u02e9"+
		"\5\25\0\0\u02e9e\1\0\0\0\u02ea\u02eb\5/\0\0\u02eb\u02ec\3\\.\0\u02ec\u02ee"+
		"\5\24\0\0\u02ed\u02ef\3h\64\0\u02ee\u02ed\1\0\0\0\u02ee\u02ef\1\0\0\0"+
		"\u02ef\u02f0\1\0\0\0\u02f0\u02f1\5\25\0\0\u02f1g\1\0\0\0\u02f2\u02f7\3"+
		"j\65\0\u02f3\u02f4\5\17\0\0\u02f4\u02f6\3j\65\0\u02f5\u02f3\1\0\0\0\u02f6"+
		"\u02f9\1\0\0\0\u02f7\u02f5\1\0\0\0\u02f7\u02f8\1\0\0\0\u02f8i\1\0\0\0"+
		"\u02f9\u02f7\1\0\0\0\u02fa\u02fb\5b\0\0\u02fb\u02fc\5\32\0\0\u02fc\u02fd"+
		"\3l\66\0\u02fdk\1\0\0\0\u02fe\u0302\3\u00a6S\0\u02ff\u0302\3`\60\0\u0300"+
		"\u0302\3n\67\0\u0301\u02fe\1\0\0\0\u0301\u02ff\1\0\0\0\u0301\u0300\1\0"+
		"\0\0\u0302m\1\0\0\0\u0303\u030c\5\20\0\0\u0304\u0309\3l\66\0\u0305\u0306"+
		"\5\17\0\0\u0306\u0308\3l\66\0\u0307\u0305\1\0\0\0\u0308\u030b\1\0\0\0"+
		"\u0309\u0307\1\0\0\0\u0309\u030a\1\0\0\0\u030a\u030d\1\0\0\0\u030b\u0309"+
		"\1\0\0\0\u030c\u0304\1\0\0\0\u030c\u030d\1\0\0\0\u030d\u030f\1\0\0\0\u030e"+
		"\u0310\5\17\0\0\u030f\u030e\1\0\0\0\u030f\u0310\1\0\0\0\u0310\u0311\1"+
		"\0\0\0\u0311\u0312\5\21\0\0\u0312o\1\0\0\0\u0313\u0314\3\f\6\0\u0314\u0315"+
		"\5/\0\0\u0315\u0316\5\27\0\0\u0316\u0317\5b\0\0\u0317\u0318\3r9\0\u0318"+
		"q\1\0\0\0\u0319\u031d\5\20\0\0\u031a\u031c\3t:\0\u031b\u031a\1\0\0\0\u031c"+
		"\u031f\1\0\0\0\u031d\u031b\1\0\0\0\u031d\u031e\1\0\0\0\u031e\u0320\1\0"+
		"\0\0\u031f\u031d\1\0\0\0\u0320\u0321\5\21\0\0\u0321s\1\0\0\0\u0322\u032a"+
		"\3v;\0\u0323\u032a\3B!\0\u0324\u032a\3\24\n\0\u0325\u032a\3(\24\0\u0326"+
		"\u032a\3\34\16\0\u0327\u032a\3p8\0\u0328\u032a\5\1\0\0\u0329\u0322\1\0"+
		"\0\0\u0329\u0323\1\0\0\0\u0329\u0324\1\0\0\0\u0329\u0325\1\0\0\0\u0329"+
		"\u0326\1\0\0\0\u0329\u0327\1\0\0\0\u0329\u0328\1\0\0\0\u032au\1\0\0\0"+
		"\u032b\u032c\3\f\6\0\u032c\u032d\3D\"\0\u032d\u032e\5b\0\0\u032e\u032f"+
		"\5\24\0\0\u032f\u0332\5\25\0\0\u0330\u0331\5\60\0\0\u0331\u0333\3l\66"+
		"\0\u0332\u0330\1\0\0\0\u0332\u0333\1\0\0\0\u0333\u0334\1\0\0\0\u0334\u0335"+
		"\5\1\0\0\u0335w\1\0\0\0\u0336\u033a\5\20\0\0\u0337\u0339\3z=\0\u0338\u0337"+
		"\1\0\0\0\u0339\u033c\1\0\0\0\u033a\u0338\1\0\0\0\u033a\u033b\1\0\0\0\u033b"+
		"\u033d\1\0\0\0\u033c\u033a\1\0\0\0\u033d\u033e\5\21\0\0\u033ey\1\0\0\0"+
		"\u033f\u0343\3|>\0\u0340\u0343\3\n\5\0\u0341\u0343\3\u0080@\0\u0342\u033f"+
		"\1\0\0\0\u0342\u0340\1\0\0\0\u0342\u0341\1\0\0\0\u0343{\1\0\0\0\u0344"+
		"\u0345\3~?\0\u0345\u0346\5\1\0\0\u0346}\1\0\0\0\u0347\u0348\3\20\b\0\u0348"+
		"\u0349\3D\"\0\u0349\u034e\3<\36\0\u034a\u034b\5\17\0\0\u034b\u034d\3<"+
		"\36\0\u034c\u034a\1\0\0\0\u034d\u0350\1\0\0\0\u034e\u034c\1\0\0\0\u034e"+
		"\u034f\1\0\0\0\u034f\177\1\0\0\0\u0350\u034e\1\0\0\0\u0351\u039a\3x<\0"+
		"\u0352\u0353\5@\0\0\u0353\u0356\3\u00a2Q\0\u0354\u0355\5\61\0\0\u0355"+
		"\u0357\3\u00a2Q\0\u0356\u0354\1\0\0\0\u0356\u0357\1\0\0\0\u0357\u0358"+
		"\1\0\0\0\u0358\u0359\5\1\0\0\u0359\u039a\1\0\0\0\u035a\u035b\5@\0\0\u035b"+
		"\u035e\3\u00a2Q\0\u035c\u035d\5\61\0\0\u035d\u035f\3\u00a2Q\0\u035e\u035c"+
		"\1\0\0\0\u035e\u035f\1\0\0\0\u035f\u0360\1\0\0\0\u0360\u0361\5\1\0\0\u0361"+
		"\u039a\1\0\0\0\u0362\u0363\5\62\0\0\u0363\u0364\3\u009eO\0\u0364\u0367"+
		"\3\u0080@\0\u0365\u0366\5\63\0\0\u0366\u0368\3\u0080@\0\u0367\u0365\1"+
		"\0\0\0\u0367\u0368\1\0\0\0\u0368\u039a\1\0\0\0\u0369\u039a\3\u009aM\0"+
		"\u036a\u036b\5\65\0\0\u036b\u036c\3\u009eO\0\u036c\u036d\3\u0080@\0\u036d"+
		"\u039a\1\0\0\0\u036e\u036f\5\66\0\0\u036f\u0370\3\u0080@\0\u0370\u0371"+
		"\5\65\0\0\u0371\u0372\3\u009eO\0\u0372\u0373\5\1\0\0\u0373\u039a\1\0\0"+
		"\0\u0374\u039a\3\u0088D\0\u0375\u0376\59\0\0\u0376\u0377\3\u009eO\0\u0377"+
		"\u0378\5\20\0\0\u0378\u0379\3\u0082A\0\u0379\u037a\5\21\0\0\u037a\u039a"+
		"\1\0\0\0\u037b\u037c\5\34\0\0\u037c\u037d\3\u009eO\0\u037d\u037e\3x<\0"+
		"\u037e\u039a\1\0\0\0\u037f\u0381\5:\0\0\u0380\u0382\3\u00a2Q\0\u0381\u0380"+
		"\1\0\0\0\u0381\u0382\1\0\0\0\u0382\u0383\1\0\0\0\u0383\u039a\5\1\0\0\u0384"+
		"\u0385\5\30\0\0\u0385\u0386\3\u00a2Q\0\u0386\u0387\5\1\0\0\u0387\u039a"+
		"\1\0\0\0\u0388\u038a\5;\0\0\u0389\u038b\5b\0\0\u038a\u0389\1\0\0\0\u038a"+
		"\u038b\1\0\0\0\u038b\u038c\1\0\0\0\u038c\u039a\5\1\0\0\u038d\u038f\5<"+
		"\0\0\u038e\u0390\5b\0\0\u038f\u038e\1\0\0\0\u038f\u0390\1\0\0\0\u0390"+
		"\u0391\1\0\0\0\u0391\u039a\5\1\0\0\u0392\u0393\3\u00a2Q\0\u0393\u0394"+
		"\5\1\0\0\u0394\u039a\1\0\0\0\u0395\u0396\5b\0\0\u0396\u0397\5\61\0\0\u0397"+
		"\u039a\3\u0080@\0\u0398\u039a\5\1\0\0\u0399\u0351\1\0\0\0\u0399\u0352"+
		"\1\0\0\0\u0399\u035a\1\0\0\0\u0399\u0362\1\0\0\0\u0399\u0369\1\0\0\0\u0399"+
		"\u036a\1\0\0\0\u0399\u036e\1\0\0\0\u0399\u0374\1\0\0\0\u0399\u0375\1\0"+
		"\0\0\u0399\u037b\1\0\0\0\u0399\u037f\1\0\0\0\u0399\u0384\1\0\0\0\u0399"+
		"\u0388\1\0\0\0\u0399\u038d\1\0\0\0\u0399\u0392\1\0\0\0\u0399\u0395\1\0"+
		"\0\0\u0399\u0398\1\0\0\0\u039a\u0081\1\0\0\0\u039b\u039d\3\u0084B\0\u039c"+
		"\u039b\1\0\0\0\u039d\u03a0\1\0\0\0\u039e\u039c\1\0\0\0\u039e\u039f\1\0"+
		"\0\0\u039f\u0083\1\0\0\0\u03a0\u039e\1\0\0\0\u03a1\u03a5\3\u0086C\0\u03a2"+
		"\u03a4\3z=\0\u03a3\u03a2\1\0\0\0\u03a4\u03a7\1\0\0\0\u03a5\u03a3\1\0\0"+
		"\0\u03a5\u03a6\1\0\0\0\u03a6\u0085\1\0\0\0\u03a7\u03a5\1\0\0\0\u03a8\u03a9"+
		"\5>\0\0\u03a9\u03aa\3\u00a2Q\0\u03aa\u03ab\5\61\0\0\u03ab\u03af\1\0\0"+
		"\0\u03ac\u03ad\5\60\0\0\u03ad\u03af\5\61\0\0\u03ae\u03a8\1\0\0\0\u03ae"+
		"\u03ac\1\0\0\0\u03af\u0087\1\0\0\0\u03b0\u03b1\5\67\0\0\u03b1\u03b9\3"+
		"x<\0\u03b2\u03b3\3\u0092I\0\u03b3\u03b4\58\0\0\u03b4\u03b5\3x<\0\u03b5"+
		"\u03ba\1\0\0\0\u03b6\u03ba\3\u0092I\0\u03b7\u03b8\58\0\0\u03b8\u03ba\3"+
		"x<\0\u03b9\u03b2\1\0\0\0\u03b9\u03b6\1\0\0\0\u03b9\u03b7\1\0\0\0\u03ba"+
		"\u03bd\1\0\0\0\u03bb\u03bd\3\u008aE\0\u03bc\u03b0\1\0\0\0\u03bc\u03bb"+
		"\1\0\0\0\u03bd\u0089\1\0\0\0\u03be\u03bf\5\67\0\0\u03bf\u03c0\3\u008c"+
		"F\0\u03c0\u03c2\3x<\0\u03c1\u03c3\3\u0092I\0\u03c2\u03c1\1\0\0\0\u03c2"+
		"\u03c3\1\0\0\0\u03c3\u03c6\1\0\0\0\u03c4\u03c5\58\0\0\u03c5\u03c7\3x<"+
		"\0\u03c6\u03c4\1\0\0\0\u03c6\u03c7\1\0\0\0\u03c7\u008b\1\0\0\0\u03c8\u03c9"+
		"\5\24\0\0\u03c9\u03cb\3\u008eG\0\u03ca\u03cc\5\1\0\0\u03cb\u03ca\1\0\0"+
		"\0\u03cb\u03cc\1\0\0\0\u03cc\u03cd\1\0\0\0\u03cd\u03ce\5\25\0\0\u03ce"+
		"\u008d\1\0\0\0\u03cf\u03d4\3\u0090H\0\u03d0\u03d1\5\1\0\0\u03d1\u03d3"+
		"\3\u0090H\0\u03d2\u03d0\1\0\0\0\u03d3\u03d6\1\0\0\0\u03d4\u03d2\1\0\0"+
		"\0\u03d4\u03d5\1\0\0\0\u03d5\u008f\1\0\0\0\u03d6\u03d4\1\0\0\0\u03d7\u03d9"+
		"\3\20\b\0\u03d8\u03d7\1\0\0\0\u03d8\u03d9\1\0\0\0\u03d9\u03da\1\0\0\0"+
		"\u03da\u03db\3D\"\0\u03db\u03dc\5b\0\0\u03dc\u03dd\5\32\0\0\u03dd\u03de"+
		"\3\u00a2Q\0\u03de\u0091\1\0\0\0\u03df\u03e3\3\u0094J\0\u03e0\u03e2\3\u0094"+
		"J\0\u03e1\u03e0\1\0\0\0\u03e2\u03e5\1\0\0\0\u03e3\u03e1\1\0\0\0\u03e3"+
		"\u03e4\1\0\0\0\u03e4\u0093\1\0\0\0\u03e5\u03e3\1\0\0\0\u03e6\u03e7\5="+
		"\0\0\u03e7\u03e8\5\24\0\0\u03e8\u03e9\3\u0096K\0\u03e9\u03ea\5\25\0\0"+
		"\u03ea\u03eb\3x<\0\u03eb\u0095\1\0\0\0\u03ec\u03ed\3\20\b\0\u03ed\u03f2"+
		"\3D\"\0\u03ee\u03ef\5N\0\0\u03ef\u03f1\3D\"\0\u03f0\u03ee\1\0\0\0\u03f1"+
		"\u03f4\1\0\0\0\u03f2\u03f0\1\0\0\0\u03f2\u03f3\1\0\0\0\u03f3\u03f5\1\0"+
		"\0\0\u03f4\u03f2\1\0\0\0\u03f5\u03fa\5b\0\0\u03f6\u03f7\5\22\0\0\u03f7"+
		"\u03f9\5\23\0\0\u03f8\u03f6\1\0\0\0\u03f9\u03fc\1\0\0\0\u03fa\u03f8\1"+
		"\0\0\0\u03fa\u03fb\1\0\0\0\u03fb\u0097\1\0\0\0\u03fc\u03fa\1\0\0\0\u03fd"+
		"\u03fe\3\20\b\0\u03fe\u03ff\3D\"\0\u03ff\u0404\5b\0\0\u0400\u0401\5\22"+
		"\0\0\u0401\u0403\5\23\0\0\u0402\u0400\1\0\0\0\u0403\u0406\1\0\0\0\u0404"+
		"\u0402\1\0\0\0\u0404\u0405\1\0\0\0\u0405\u0099\1\0\0\0\u0406\u0404\1\0"+
		"\0\0\u0407\u0408\5\64\0\0\u0408\u0409\5\24\0\0\u0409\u040a\3\20\b\0\u040a"+
		"\u040b\3D\"\0\u040b\u040c\5b\0\0\u040c\u040d\5\61\0\0\u040d\u040e\3\u00a2"+
		"Q\0\u040e\u040f\5\25\0\0\u040f\u0410\3\u0080@\0\u0410\u0421\1\0\0\0\u0411"+
		"\u0412\5\64\0\0\u0412\u0414\5\24\0\0\u0413\u0415\3\u009cN\0\u0414\u0413"+
		"\1\0\0\0\u0414\u0415\1\0\0\0\u0415\u0416\1\0\0\0\u0416\u0418\5\1\0\0\u0417"+
		"\u0419\3\u00a2Q\0\u0418\u0417\1\0\0\0\u0418\u0419\1\0\0\0\u0419\u041a"+
		"\1\0\0\0\u041a\u041c\5\1\0\0\u041b\u041d\3\u00a0P\0\u041c\u041b\1\0\0"+
		"\0\u041c\u041d\1\0\0\0\u041d\u041e\1\0\0\0\u041e\u041f\5\25\0\0\u041f"+
		"\u0421\3\u0080@\0\u0420\u0407\1\0\0\0\u0420\u0411\1\0\0\0\u0421\u009b"+
		"\1\0\0\0\u0422\u0425\3~?\0\u0423\u0425\3\u00a0P\0\u0424\u0422\1\0\0\0"+
		"\u0424\u0423\1\0\0\0\u0425\u009d\1\0\0\0\u0426\u0427\5\24\0\0\u0427\u0428"+
		"\3\u00a2Q\0\u0428\u0429\5\25\0\0\u0429\u009f\1\0\0\0\u042a\u042f\3\u00a2"+
		"Q\0\u042b\u042c\5\17\0\0\u042c\u042e\3\u00a2Q\0\u042d\u042b\1\0\0\0\u042e"+
		"\u0431\1\0\0\0\u042f\u042d\1\0\0\0\u042f\u0430\1\0\0\0\u0430\u00a1\1\0"+
		"\0\0\u0431\u042f\1\0\0\0\u0432\u0436\3\u00a6S\0\u0433\u0434\3\u00a4R\0"+
		"\u0434\u0435\3\u00a2Q\0\u0435\u0437\1\0\0\0\u0436\u0433\1\0\0\0\u0436"+
		"\u0437\1\0\0\0\u0437\u00a3\1\0\0\0\u0438\u0439\5\32\0\0\u0439\u0458\6"+
		"R\uffff\0\u043a\u043b\5R\0\0\u043b\u0458\6R\uffff\0\u043c\u043d\5S\0\0"+
		"\u043d\u0458\6R\uffff\0\u043e\u043f\5T\0\0\u043f\u0458\6R\uffff\0\u0440"+
		"\u0441\5U\0\0\u0441\u0458\6R\uffff\0\u0442\u0443\5V\0\0\u0443\u0458\6"+
		"R\uffff\0\u0444\u0445\5W\0\0\u0445\u0458\6R\uffff\0\u0446\u0447\5Q\0\0"+
		"\u0447\u0458\6R\uffff\0\u0448\u0449\5X\0\0\u0449\u0458\6R\uffff\0\u044a"+
		"\u044b\5Z\0\0\u044b\u044c\5Z\0\0\u044c\u044d\5\32\0\0\u044d\u0458\6R\uffff"+
		"\0\u044e\u044f\5Y\0\0\u044f\u0450\5Y\0\0\u0450\u0451\5Y\0\0\u0451\u0452"+
		"\5\32\0\0\u0452\u0458\6R\uffff\0\u0453\u0454\5Y\0\0\u0454\u0455\5Y\0\0"+
		"\u0455\u0456\5\32\0\0\u0456\u0458\6R\uffff\0\u0457\u0438\1\0\0\0\u0457"+
		"\u043a\1\0\0\0\u0457\u043c\1\0\0\0\u0457\u043e\1\0\0\0\u0457\u0440\1\0"+
		"\0\0\u0457\u0442\1\0\0\0\u0457\u0444\1\0\0\0\u0457\u0446\1\0\0\0\u0457"+
		"\u0448\1\0\0\0\u0457\u044a\1\0\0\0\u0457\u044e\1\0\0\0\u0457\u0453\1\0"+
		"\0\0\u0458\u00a5\1\0\0\0\u0459\u045f\3\u00a8T\0\u045a\u045b\5\'\0\0\u045b"+
		"\u045c\3\u00a2Q\0\u045c\u045d\5\61\0\0\u045d\u045e\3\u00a6S\0\u045e\u0460"+
		"\1\0\0\0\u045f\u045a\1\0\0\0\u045f\u0460\1\0\0\0\u0460\u00a7\1\0\0\0\u0461"+
		"\u0466\3\u00aaU\0\u0462\u0463\5P\0\0\u0463\u0465\3\u00aaU\0\u0464\u0462"+
		"\1\0\0\0\u0465\u0468\1\0\0\0\u0466\u0464\1\0\0\0\u0466\u0467\1\0\0\0\u0467"+
		"\u00a9\1\0\0\0\u0468\u0466\1\0\0\0\u0469\u046e\3\u00acV\0\u046a\u046b"+
		"\5O\0\0\u046b\u046d\3\u00acV\0\u046c\u046a\1\0\0\0\u046d\u0470\1\0\0\0"+
		"\u046e\u046c\1\0\0\0\u046e\u046f\1\0\0\0\u046f\u00ab\1\0\0\0\u0470\u046e"+
		"\1\0\0\0\u0471\u0476\3\u00aeW\0\u0472\u0473\5N\0\0\u0473\u0475\3\u00ae"+
		"W\0\u0474\u0472\1\0\0\0\u0475\u0478\1\0\0\0\u0476\u0474\1\0\0\0\u0476"+
		"\u0477\1\0\0\0\u0477\u00ad\1\0\0\0\u0478\u0476\1\0\0\0\u0479\u047e\3\u00b0"+
		"X\0\u047a\u047b\5M\0\0\u047b\u047d\3\u00b0X\0\u047c\u047a\1\0\0\0\u047d"+
		"\u0480\1\0\0\0\u047e\u047c\1\0\0\0\u047e\u047f\1\0\0\0\u047f\u00af\1\0"+
		"\0\0\u0480\u047e\1\0\0\0\u0481\u0486\3\u00b2Y\0\u0482\u0483\5L\0\0\u0483"+
		"\u0485\3\u00b2Y\0\u0484\u0482\1\0\0\0\u0485\u0488\1\0\0\0\u0486\u0484"+
		"\1\0\0\0\u0486\u0487\1\0\0\0\u0487\u00b1\1\0\0\0\u0488\u0486\1\0\0\0\u0489"+
		"\u048e\3\u00b4Z\0\u048a\u048b\7\3\0\0\u048b\u048d\3\u00b4Z\0\u048c\u048a"+
		"\1\0\0\0\u048d\u0490\1\0\0\0\u048e\u048c\1\0\0\0\u048e\u048f\1\0\0\0\u048f"+
		"\u00b3\1\0\0\0\u0490\u048e\1\0\0\0\u0491\u0494\3\u00b6[\0\u0492\u0493"+
		"\5[\0\0\u0493\u0495\3D\"\0\u0494\u0492\1\0\0\0\u0494\u0495\1\0\0\0\u0495"+
		"\u00b5\1\0\0\0\u0496\u049c\3\u00ba]\0\u0497\u0498\3\u00b8\\\0\u0498\u0499"+
		"\3\u00ba]\0\u0499\u049b\1\0\0\0\u049a\u0497\1\0\0\0\u049b\u049e\1\0\0"+
		"\0\u049c\u049a\1\0\0\0\u049c\u049d\1\0\0\0\u049d\u00b7\1\0\0\0\u049e\u049c"+
		"\1\0\0\0\u049f\u04a0\5Z\0\0\u04a0\u04a6\5\32\0\0\u04a1\u04a2\5Y\0\0\u04a2"+
		"\u04a6\5\32\0\0\u04a3\u04a6\5Z\0\0\u04a4\u04a6\5Y\0\0\u04a5\u049f\1\0"+
		"\0\0\u04a5\u04a1\1\0\0\0\u04a5\u04a3\1\0\0\0\u04a5\u04a4\1\0\0\0\u04a6"+
		"\u00b9\1\0\0\0\u04a7\u04ad\3\u00be_\0\u04a8\u04a9\3\u00bc^\0\u04a9\u04aa"+
		"\3\u00be_\0\u04aa\u04ac\1\0\0\0\u04ab\u04a8\1\0\0\0\u04ac\u04af\1\0\0"+
		"\0\u04ad\u04ab\1\0\0\0\u04ad\u04ae\1\0\0\0\u04ae\u00bb\1\0\0\0\u04af\u04ad"+
		"\1\0\0\0\u04b0\u04b1\5Z\0\0\u04b1\u04b8\5Z\0\0\u04b2\u04b3\5Y\0\0\u04b3"+
		"\u04b4\5Y\0\0\u04b4\u04b8\5Y\0\0\u04b5\u04b6\5Y\0\0\u04b6\u04b8\5Y\0\0"+
		"\u04b7\u04b0\1\0\0\0\u04b7\u04b2\1\0\0\0\u04b7\u04b5\1\0\0\0\u04b8\u00bd"+
		"\1\0\0\0\u04b9\u04be\3\u00c0`\0\u04ba\u04bb\7\4\0\0\u04bb\u04bd\3\u00c0"+
		"`\0\u04bc\u04ba\1\0\0\0\u04bd\u04c0\1\0\0\0\u04be\u04bc\1\0\0\0\u04be"+
		"\u04bf\1\0\0\0\u04bf\u00bf\1\0\0\0\u04c0\u04be\1\0\0\0\u04c1\u04c6\3\u00c2"+
		"a\0\u04c2\u04c3\7\5\0\0\u04c3\u04c5\3\u00c2a\0\u04c4\u04c2\1\0\0\0\u04c5"+
		"\u04c8\1\0\0\0\u04c6\u04c4\1\0\0\0\u04c6\u04c7\1\0\0\0\u04c7\u00c1\1\0"+
		"\0\0\u04c8\u04c6\1\0\0\0\u04c9\u04ca\5H\0\0\u04ca\u04d3\3\u00c2a\0\u04cb"+
		"\u04cc\5I\0\0\u04cc\u04d3\3\u00c2a\0\u04cd\u04ce\5A\0\0\u04ce\u04d3\3"+
		"\u00c2a\0\u04cf\u04d0\5B\0\0\u04d0\u04d3\3\u00c2a\0\u04d1\u04d3\3\u00c4"+
		"b\0\u04d2\u04c9\1\0\0\0\u04d2\u04cb\1\0\0\0\u04d2\u04cd\1\0\0\0\u04d2"+
		"\u04cf\1\0\0\0\u04d2\u04d1\1\0\0\0\u04d3\u00c3\1\0\0\0\u04d4\u04d5\5C"+
		"\0\0\u04d5\u04e4\3\u00c2a\0\u04d6\u04d7\5D\0\0\u04d7\u04e4\3\u00c2a\0"+
		"\u04d8\u04e4\3\u00c6c\0\u04d9\u04dd\3\u00c8d\0\u04da\u04dc\3\u00ceg\0"+
		"\u04db\u04da\1\0\0\0\u04dc\u04df\1\0\0\0\u04dd\u04db\1\0\0\0\u04dd\u04de"+
		"\1\0\0\0\u04de\u04e1\1\0\0\0\u04df\u04dd\1\0\0\0\u04e0\u04e2\7\6\0\0\u04e1"+
		"\u04e0\1\0\0\0\u04e1\u04e2\1\0\0\0\u04e2\u04e4\1\0\0\0\u04e3\u04d4\1\0"+
		"\0\0\u04e3\u04d6\1\0\0\0\u04e3\u04d8\1\0\0\0\u04e3\u04d9\1\0\0\0\u04e4"+
		"\u00c5\1\0\0\0\u04e5\u04e6\5\24\0\0\u04e6\u04e7\3J%\0\u04e7\u04e8\5\25"+
		"\0\0\u04e8\u04e9\3\u00c2a\0\u04e9\u04f0\1\0\0\0\u04ea\u04eb\5\24\0\0\u04eb"+
		"\u04ec\3D\"\0\u04ec\u04ed\5\25\0\0\u04ed\u04ee\3\u00c4b\0\u04ee\u04f0"+
		"\1\0\0\0\u04ef\u04e5\1\0\0\0\u04ef\u04ea\1\0\0\0\u04f0\u00c7\1\0\0\0\u04f1"+
		"\u051b\3\u009eO\0\u04f2\u04f7\5*\0\0\u04f3\u04f4\5\4\0\0\u04f4\u04f6\5"+
		"b\0\0\u04f5\u04f3\1\0\0\0\u04f6\u04f9\1\0\0\0\u04f7\u04f5\1\0\0\0\u04f7"+
		"\u04f8\1\0\0\0\u04f8\u04fb\1\0\0\0\u04f9\u04f7\1\0\0\0\u04fa\u04fc\3\u00cc"+
		"f\0\u04fb\u04fa\1\0\0\0\u04fb\u04fc\1\0\0\0\u04fc\u051b\1\0\0\0\u04fd"+
		"\u0502\5b\0\0\u04fe\u04ff\5\4\0\0\u04ff\u0501\5b\0\0\u0500\u04fe\1\0\0"+
		"\0\u0501\u0504\1\0\0\0\u0502\u0500\1\0\0\0\u0502\u0503\1\0\0\0\u0503\u0506"+
		"\1\0\0\0\u0504\u0502\1\0\0\0\u0505\u0507\3\u00ccf\0\u0506\u0505\1\0\0"+
		"\0\u0506\u0507\1\0\0\0\u0507\u051b\1\0\0\0\u0508\u0509\5+\0\0\u0509\u051b"+
		"\3\u00cae\0\u050a\u051b\3\u00e2q\0\u050b\u051b\3\u00d0h\0\u050c\u0511"+
		"\3J%\0\u050d\u050e\5\22\0\0\u050e\u0510\5\23\0\0\u050f\u050d\1\0\0\0\u0510"+
		"\u0513\1\0\0\0\u0511\u050f\1\0\0\0\u0511\u0512\1\0\0\0\u0512\u0514\1\0"+
		"\0\0\u0513\u0511\1\0\0\0\u0514\u0515\5\4\0\0\u0515\u0516\5\6\0\0\u0516"+
		"\u051b\1\0\0\0\u0517\u0518\5\26\0\0\u0518\u0519\5\4\0\0\u0519\u051b\5"+
		"\6\0\0\u051a\u04f1\1\0\0\0\u051a\u04f2\1\0\0\0\u051a\u04fd\1\0\0\0\u051a"+
		"\u0508\1\0\0\0\u051a\u050a\1\0\0\0\u051a\u050b\1\0\0\0\u051a\u050c\1\0"+
		"\0\0\u051a\u0517\1\0\0\0\u051b\u00c9\1\0\0\0\u051c\u0526\3\u00e0p\0\u051d"+
		"\u051f\5\4\0\0\u051e\u0520\3L&\0\u051f\u051e\1\0\0\0\u051f\u0520\1\0\0"+
		"\0\u0520\u0521\1\0\0\0\u0521\u0523\5b\0\0\u0522\u0524\3\u00e0p\0\u0523"+
		"\u0522\1\0\0\0\u0523\u0524\1\0\0\0\u0524\u0526\1\0\0\0\u0525\u051c\1\0"+
		"\0\0\u0525\u051d\1\0\0\0\u0526\u00cb\1\0\0\0\u0527\u0528\5\22\0\0\u0528"+
		"\u052a\5\23\0\0\u0529\u0527\1\0\0\0\u052a\u052b\1\0\0\0\u052b\u0529\1"+
		"\0\0\0\u052b\u052c\1\0\0\0\u052c\u052d\1\0\0\0\u052d\u052e\5\4\0\0\u052e"+
		"\u0546\5\6\0\0\u052f\u0530\5\22\0\0\u0530\u0531\3\u00a2Q\0\u0531\u0532"+
		"\5\23\0\0\u0532\u0534\1\0\0\0\u0533\u052f\1\0\0\0\u0534\u0535\1\0\0\0"+
		"\u0535\u0533\1\0\0\0\u0535\u0536\1\0\0\0\u0536\u0546\1\0\0\0\u0537\u0546"+
		"\3\u00e0p\0\u0538\u0539\5\4\0\0\u0539\u0546\5\6\0\0\u053a\u053b\5\4\0"+
		"\0\u053b\u053c\3\u00deo\0\u053c\u053d\5b\0\0\u053d\u053e\3\u00e0p\0\u053e"+
		"\u0546\1\0\0\0\u053f\u0540\5\4\0\0\u0540\u0546\5*\0\0\u0541\u0542\5\4"+
		"\0\0\u0542\u0543\5+\0\0\u0543\u0546\3\u00e0p\0\u0544\u0546\3\u00dam\0"+
		"\u0545\u0529\1\0\0\0\u0545\u0533\1\0\0\0\u0545\u0537\1\0\0\0\u0545\u0538"+
		"\1\0\0\0\u0545\u053a\1\0\0\0\u0545\u053f\1\0\0\0\u0545\u0541\1\0\0\0\u0545"+
		"\u0544\1\0\0\0\u0546\u00cd\1\0\0\0\u0547\u0548\5\4\0\0\u0548\u054a\5b"+
		"\0\0\u0549\u054b\3\u00e0p\0\u054a\u0549\1\0\0\0\u054a\u054b\1\0\0\0\u054b"+
		"\u0557\1\0\0\0\u054c\u054d\5\4\0\0\u054d\u0557\5*\0\0\u054e\u054f\5\4"+
		"\0\0\u054f\u0550\5+\0\0\u0550\u0557\3\u00cae\0\u0551\u0557\3\u00dam\0"+
		"\u0552\u0553\5\22\0\0\u0553\u0554\3\u00a2Q\0\u0554\u0555\5\23\0\0\u0555"+
		"\u0557\1\0\0\0\u0556\u0547\1\0\0\0\u0556\u054c\1\0\0\0\u0556\u054e\1\0"+
		"\0\0\u0556\u0551\1\0\0\0\u0556\u0552\1\0\0\0\u0557\u00cf\1\0\0\0\u0558"+
		"\u0559\5E\0\0\u0559\u055a\3\u00deo\0\u055a\u055b\3F#\0\u055b\u055c\3\u00dc"+
		"n\0\u055c\u0563\1\0\0\0\u055d\u055e\5E\0\0\u055e\u055f\3F#\0\u055f\u0560"+
		"\3\u00dcn\0\u0560\u0563\1\0\0\0\u0561\u0563\3\u00d2i\0\u0562\u0558\1\0"+
		"\0\0\u0562\u055d\1\0\0\0\u0562\u0561\1\0\0\0\u0563\u00d1\1\0\0\0\u0564"+
		"\u0565\5E\0\0\u0565\u0566\3\u00d8l\0\u0566\u0567\5\22\0\0\u0567\u056c"+
		"\5\23\0\0\u0568\u0569\5\22\0\0\u0569\u056b\5\23\0\0\u056a\u0568\1\0\0"+
		"\0\u056b\u056e\1\0\0\0\u056c\u056a\1\0\0\0\u056c\u056d\1\0\0\0\u056d\u056f"+
		"\1\0\0\0\u056e\u056c\1\0\0\0\u056f\u0570\3\u00d6k\0\u0570\u0587\1\0\0"+
		"\0\u0571\u0572\5E\0\0\u0572\u0573\3\u00d8l\0\u0573\u0574\5\22\0\0\u0574"+
		"\u0575\3\u00a2Q\0\u0575\u057c\5\23\0\0\u0576\u0577\5\22\0\0\u0577\u0578"+
		"\3\u00a2Q\0\u0578\u0579\5\23\0\0\u0579\u057b\1\0\0\0\u057a\u0576\1\0\0"+
		"\0\u057b\u057e\1\0\0\0\u057c\u057a\1\0\0\0\u057c\u057d\1\0\0\0\u057d\u0583"+
		"\1\0\0\0\u057e\u057c\1\0\0\0\u057f\u0580\5\22\0\0\u0580\u0582\5\23\0\0"+
		"\u0581\u057f\1\0\0\0\u0582\u0585\1\0\0\0\u0583\u0581\1\0\0\0\u0583\u0584"+
		"\1\0\0\0\u0584\u0587\1\0\0\0\u0585\u0583\1\0\0\0\u0586\u0564\1\0\0\0\u0586"+
		"\u0571\1\0\0\0\u0587\u00d3\1\0\0\0\u0588\u058b\3\u00d6k\0\u0589\u058b"+
		"\3\u00a2Q\0\u058a\u0588\1\0\0\0\u058a\u0589\1\0\0\0\u058b\u00d5\1\0\0"+
		"\0\u058c\u0595\5\20\0\0\u058d\u0592\3\u00d4j\0\u058e\u058f\5\17\0\0\u058f"+
		"\u0591\3\u00d4j\0\u0590\u058e\1\0\0\0\u0591\u0594\1\0\0\0\u0592\u0590"+
		"\1\0\0\0\u0592\u0593\1\0\0\0\u0593\u0596\1\0\0\0\u0594\u0592\1\0\0\0\u0595"+
		"\u058d\1\0\0\0\u0595\u0596\1\0\0\0\u0596\u0598\1\0\0\0\u0597\u0599\5\17"+
		"\0\0\u0598\u0597\1\0\0\0\u0598\u0599\1\0\0\0\u0599\u059a\1\0\0\0\u059a"+
		"\u059b\5\21\0\0\u059b\u00d7\1\0\0\0\u059c\u059f\3F#\0\u059d\u059f\3J%"+
		"\0\u059e\u059c\1\0\0\0\u059e\u059d\1\0\0\0\u059f\u00d9\1\0\0\0\u05a0\u05a1"+
		"\5\4\0\0\u05a1\u05a3\5E\0\0\u05a2\u05a4\3\u00deo\0\u05a3\u05a2\1\0\0\0"+
		"\u05a3\u05a4\1\0\0\0\u05a4\u05a5\1\0\0\0\u05a5\u05a7\5b\0\0\u05a6\u05a8"+
		"\3L&\0\u05a7\u05a6\1\0\0\0\u05a7\u05a8\1\0\0\0\u05a8\u05a9\1\0\0\0\u05a9"+
		"\u05aa\3\u00dcn\0\u05aa\u00db\1\0\0\0\u05ab\u05ad\3\u00e0p\0\u05ac\u05ae"+
		"\3,\26\0\u05ad\u05ac\1\0\0\0\u05ad\u05ae\1\0\0\0\u05ae\u00dd\1\0\0\0\u05af"+
		"\u05b0\5Z\0\0\u05b0\u05b1\3*\25\0\u05b1\u05b2\5Y\0\0\u05b2\u00df\1\0\0"+
		"\0\u05b3\u05b5\5\24\0\0\u05b4\u05b6\3\u00a0P\0\u05b5\u05b4\1\0\0\0\u05b5"+
		"\u05b6\1\0\0\0\u05b6\u05b7\1\0\0\0\u05b7\u05b8\5\25\0\0\u05b8\u00e1\1"+
		"\0\0\0\u05b9\u05ba\7\7\0\0\u05ba\u00e3\1\0\0\0\u05bb\u05bc\3\f\6\0\u05bc"+
		"\u05bd\5\6\0\0\u05bd\u05be\5b\0\0\u05be\u00e5\1\0\0\0\u05bf\u05c0\3\f"+
		"\6\0\u05c0\u05c1\7\b\0\0\u05c1\u05c2\5b\0\0\u05c2\u00e7\1\0\0\0\u05c3"+
		"\u05c4\3\f\6\0\u05c4\u05c5\5\27\0\0\u05c5\u05c6\5b\0\0\u05c6\u00e9\1\0"+
		"\0\0\u05c7\u05c8\3\f\6\0\u05c8\u05c9\5/\0\0\u05c9\u05ca\5\27\0\0\u05ca"+
		"\u05cb\5b\0\0\u05cb\u00eb\1\0\0\0\u05cc\u05d3\3\f\6\0\u05cd\u05d4\5\6"+
		"\0\0\u05ce\u05d4\5?\0\0\u05cf\u05d1\5/\0\0\u05d0\u05cf\1\0\0\0\u05d0\u05d1"+
		"\1\0\0\0\u05d1\u05d2\1\0\0\0\u05d2\u05d4\5\27\0\0\u05d3\u05cd\1\0\0\0"+
		"\u05d3\u05ce\1\0\0\0\u05d3\u05d0\1\0\0\0\u05d4\u05d5\1\0\0\0\u05d5\u05d6"+
		"\5b\0\0\u05d6\u00ed\1\0\0\0\u05d7\u05d9\3\f\6\0\u05d8\u05da\3\26\13\0"+
		"\u05d9\u05d8\1\0\0\0\u05d9\u05da\1\0\0\0\u05da\u05dd\1\0\0\0\u05db\u05de"+
		"\3D\"\0\u05dc\u05de\5\26\0\0\u05dd\u05db\1\0\0\0\u05dd\u05dc\1\0\0\0\u05dd"+
		"\u05de\1\0\0\0\u05de\u05df\1\0\0\0\u05df\u05e0\5b\0\0\u05e0\u05e1\5\25"+
		"\0\0\u05e1\u00ef\1\0\0\0\u05e2\u05e3\3\f\6\0\u05e3\u05e4\3D\"\0\u05e4"+
		"\u05e9\5b\0\0\u05e5\u05e6\5\22\0\0\u05e6\u05e8\5\23\0\0\u05e7\u05e5\1"+
		"\0\0\0\u05e8\u05eb\1\0\0\0\u05e9\u05e7\1\0\0\0\u05e9\u05ea\1\0\0\0\u05ea"+
		"\u05ec\1\0\0\0\u05eb\u05e9\1\0\0\0\u05ec\u05ed\7\t\0\0\u05ed\u00f1\1\0"+
		"\0\0\u05ee\u05ef\3\20\b\0\u05ef\u05f0\3D\"\0\u05f0\u05f5\5b\0\0\u05f1"+
		"\u05f2\5\22\0\0\u05f2\u05f4\5\23\0\0\u05f3\u05f1\1\0\0\0\u05f4\u05f7\1"+
		"\0\0\0\u05f5\u05f3\1\0\0\0\u05f5\u05f6\1\0\0\0\u05f6\u05f8\1\0\0\0\u05f7"+
		"\u05f5\1\0\0\0\u05f8\u05f9\7\n\0\0\u05f9\u00f3\1\0\0\0\u00ae\u00f5\u00fa"+
		"\u0100\u0104\u010c\u0114\u011b\u011f\u0122\u0129\u012e\u0132\u0137\u0146"+
		"\u014a\u014c\u0151\u0157\u015b\u015f\u0169\u0171\u0178\u0180\u0186\u0189"+
		"\u018c\u0195\u0199\u019d\u01a0\u01a6\u01ab\u01b1\u01b5\u01be\u01c5\u01ce"+
		"\u01d5\u01d9\u01e0\u01e4\u01e8\u01f0\u01f5\u01f9\u01fd\u0203\u0209\u020e"+
		"\u021a\u0224\u0229\u0230\u0234\u0238\u0240\u0245\u0250\u025a\u0262\u0265"+
		"\u026c\u0271\u027b\u0282\u0288\u028a\u0291\u0296\u02a0\u02a8\u02ac\u02b5"+
		"\u02be\u02c7\u02cd\u02d4\u02da\u02df\u02ee\u02f7\u0301\u0309\u030c\u030f"+
		"\u031d\u0329\u0332\u033a\u0342\u034e\u0356\u035e\u0367\u0381\u038a\u038f"+
		"\u0399\u039e\u03a5\u03ae\u03b9\u03bc\u03c2\u03c6\u03cb\u03d4\u03d8\u03e3"+
		"\u03f2\u03fa\u0404\u0414\u0418\u041c\u0420\u0424\u042f\u0436\u0457\u045f"+
		"\u0466\u046e\u0476\u047e\u0486\u048e\u0494\u049c\u04a5\u04ad\u04b7\u04be"+
		"\u04c6\u04d2\u04dd\u04e1\u04e3\u04ef\u04f7\u04fb\u0502\u0506\u0511\u051a"+
		"\u051f\u0523\u0525\u052b\u0535\u0545\u054a\u0556\u0562\u056c\u057c\u0583"+
		"\u0586\u058a\u0592\u0595\u0598\u059e\u05a3\u05a7\u05ad\u05b5\u05d0\u05d3"+
		"\u05d9\u05dd\u05e9\u05f5";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}