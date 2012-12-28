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
		RULE_statement = 64, RULE_emptyStatement = 65, RULE_switchBlockStatementGroups = 66, 
		RULE_switchBlockStatementGroup = 67, RULE_switchLabel = 68, RULE_trystatement = 69, 
		RULE_tryWithResources = 70, RULE_resourceSpecification = 71, RULE_resources = 72, 
		RULE_resource = 73, RULE_catches = 74, RULE_catchClause = 75, RULE_catchFormalParameter = 76, 
		RULE_forstatement = 77, RULE_foreachStatement = 78, RULE_normalForStatement = 79, 
		RULE_forInit = 80, RULE_parExpression = 81, RULE_expressionList = 82, 
		RULE_expression = 83, RULE_assignmentOperator = 84, RULE_conditionalExpression = 85, 
		RULE_conditionalOrExpression = 86, RULE_conditionalAndExpression = 87, 
		RULE_inclusiveOrExpression = 88, RULE_exclusiveOrExpression = 89, RULE_andExpression = 90, 
		RULE_equalityExpression = 91, RULE_notEqualityExpression = 92, RULE_instanceOfExpression = 93, 
		RULE_relationalExpression = 94, RULE_relationalOp = 95, RULE_shiftExpression = 96, 
		RULE_shiftOp = 97, RULE_additiveExpression = 98, RULE_additiveOp = 99, 
		RULE_multiplicativeExpression = 100, RULE_multiplicativeOp = 101, RULE_unaryExpression = 102, 
		RULE_unaryExpressionNotPlusMinus = 103, RULE_castExpression = 104, RULE_primary = 105, 
		RULE_superSuffix = 106, RULE_thisSuffix = 107, RULE_identifierSuffix = 108, 
		RULE_selector = 109, RULE_creator = 110, RULE_arrayCreator = 111, RULE_variableInitializer = 112, 
		RULE_arrayInitializer = 113, RULE_createdName = 114, RULE_innerCreator = 115, 
		RULE_classCreatorRest = 116, RULE_nonWildcardTypeArguments = 117, RULE_arguments = 118, 
		RULE_literal = 119, RULE_classHeader = 120, RULE_enumHeader = 121, RULE_interfaceHeader = 122, 
		RULE_annotationHeader = 123, RULE_typeHeader = 124, RULE_methodHeader = 125, 
		RULE_fieldHeader = 126, RULE_localVariableHeader = 127;
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
		"annotationHeader", "typeHeader", "methodHeader", "fieldHeader", "localVariableHeader"
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
			setState(257);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(256); packageDeclaration();
				}
				break;
			}
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(259); importDeclaration();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << AT) | (1L << ENUM))) != 0)) {
				{
				{
				setState(265); typeDeclaration();
				}
				}
				setState(270);
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
			setState(272);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(271); annotations();
				}
			}

			setState(274); match(PACKAGE);
			setState(275); qualifiedName();
			setState(276); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
			setState(302);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278); match(IMPORT);
				setState(280);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(279); match(STATIC);
					}
				}

				setState(282); match(Identifier);
				setState(283); match(DOT);
				setState(284); match(STAR);
				setState(285); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286); match(IMPORT);
				setState(288);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(287); match(STATIC);
					}
				}

				setState(290); match(Identifier);
				setState(293); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(291); match(DOT);
						setState(292); match(Identifier);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(295); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(299);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(297); match(DOT);
					setState(298); match(STAR);
					}
				}

				setState(301); match(SEMI);
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
			setState(304); match(Identifier);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(305); match(DOT);
				setState(306); match(Identifier);
				}
				}
				setState(311);
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
			setState(314);
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
				setState(312); classOrInterfaceDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(313); match(SEMI);
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
			setState(318);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316); classDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317); interfaceDeclaration();
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
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(320); modifier();
					}
					} 
				}
				setState(325);
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
			setState(338);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(326); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(327); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(328); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(329); match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(330); match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(331); match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(332); match(FINAL);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 8);
				{
				setState(333); match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 9);
				{
				setState(334); match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(335); match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 11);
				{
				setState(336); match(VOLATILE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 12);
				{
				setState(337); match(STRICTFP);
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
		public TerminalNode FINAL() { return getToken(Java7Parser.FINAL, 0); }
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
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
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(340); annotation();
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(347);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(346); match(FINAL);
				}
			}

			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(349); annotation();
				}
				}
				setState(354);
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
			setState(357);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355); normalClassDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356); enumDeclaration();
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
			setState(359); modifiers();
			setState(360); match(CLASS);
			setState(361); match(Identifier);
			setState(363);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(362); typeParameters();
				}
			}

			setState(367);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(365); match(EXTENDS);
				setState(366); type();
				}
			}

			setState(371);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(369); match(IMPLEMENTS);
				setState(370); typeList();
				}
			}

			setState(373); classBody();
			}
		}
		catch (RecognitionException re) {
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
			setState(375); match(LT);
			setState(376); typeParameter();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(377); match(COMMA);
				setState(378); typeParameter();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384); match(GT);
			}
		}
		catch (RecognitionException re) {
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
			setState(386); match(Identifier);
			setState(389);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(387); match(EXTENDS);
				setState(388); typeBound();
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
			setState(391); type();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(392); match(AMP);
				setState(393); type();
				}
				}
				setState(398);
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
			setState(399); modifiers();
			setState(400); match(ENUM);
			setState(401); match(Identifier);
			setState(404);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(402); match(IMPLEMENTS);
				setState(403); typeList();
				}
			}

			setState(406); enumBody();
			}
		}
		catch (RecognitionException re) {
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
			setState(408); match(LBRACE);
			setState(410);
			_la = _input.LA(1);
			if (_la==AT || _la==Identifier) {
				{
				setState(409); enumConstants();
				}
			}

			setState(413);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(412); match(COMMA);
				}
			}

			setState(416);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(415); enumBodyDeclarations();
				}
			}

			setState(418); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
			setState(420); enumConstant();
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(421); match(COMMA);
					setState(422); enumConstant();
					}
					} 
				}
				setState(427);
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
			setState(429);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(428); annotations();
				}
			}

			setState(431); match(Identifier);
			setState(433);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(432); arguments();
				}
			}

			setState(436);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(435); classBody();
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
			setState(438); match(SEMI);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << VOID) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT) | (1L << ENUM))) != 0) || _la==LT || _la==Identifier) {
				{
				{
				setState(439); classBodyDeclaration();
				}
				}
				setState(444);
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
			setState(447);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445); normalInterfaceDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446); annotationTypeDeclaration();
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
			setState(449); modifiers();
			setState(450); match(INTERFACE);
			setState(451); match(Identifier);
			setState(453);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(452); typeParameters();
				}
			}

			setState(457);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(455); match(EXTENDS);
				setState(456); typeList();
				}
			}

			setState(459); interfaceBody();
			}
		}
		catch (RecognitionException re) {
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
			setState(461); type();
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(462); match(COMMA);
				setState(463); type();
				}
				}
				setState(468);
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
			setState(469); match(LBRACE);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << VOID) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT) | (1L << ENUM))) != 0) || _la==LT || _la==Identifier) {
				{
				{
				setState(470); classBodyDeclaration();
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
			setState(478); match(LBRACE);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << VOID) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT) | (1L << ENUM))) != 0) || _la==LT || _la==Identifier) {
				{
				{
				setState(479); interfaceBodyDeclaration();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
			setState(493);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(487); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(488); match(STATIC);
					}
				}

				setState(491); block();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492); memberDecl();
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
			setState(500);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495); constructorDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496); fieldDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497); methodDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(498); classDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(499); interfaceDeclaration();
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
			setState(502); modifiers();
			setState(504);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(503); typeParameters();
				}
			}

			setState(508);
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
				setState(506); type();
				}
				break;
			case VOID:
				{
				setState(507); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(510); match(Identifier);
			setState(511); formalParameters();
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(512); match(LBRACKET);
				setState(513); match(RBRACKET);
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(521);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(519); match(THROWS);
				setState(520); qualifiedNameList();
				}
			}

			setState(525);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(523); block();
				}
				break;
			case SEMI:
				{
				setState(524); match(SEMI);
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
			setState(527); modifiers();
			setState(529);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(528); typeParameters();
				}
			}

			setState(531); match(Identifier);
			setState(532); formalParameters();
			setState(535);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(533); match(THROWS);
				setState(534); qualifiedNameList();
				}
			}

			setState(537); constructorBlock();
			}
		}
		catch (RecognitionException re) {
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
			setState(539); match(LBRACE);
			setState(541);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(540); explicitConstructorInvocation();
				}
				break;
			}
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << INTERFACE) | (1L << THROW) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TRY) | (1L << SWITCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ASSERT - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (TILDE - 64)) | (1L << (BANG - 64)) | (1L << (NEW - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(543); blockStatement();
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
			setState(551); modifiers();
			setState(552); type();
			setState(553); variableDeclarator();
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(554); match(COMMA);
				setState(555); variableDeclarator();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
			setState(563); match(Identifier);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(564); match(LBRACKET);
				setState(565); match(RBRACKET);
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(573);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(571); match(EQ);
				setState(572); variableInitializer();
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
			setState(580);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575); interfaceFieldDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576); interfaceMethodDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(577); interfaceDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(578); classDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(579); match(SEMI);
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
			setState(582); modifiers();
			setState(584);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(583); typeParameters();
				}
			}

			setState(588);
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
				setState(586); type();
				}
				break;
			case VOID:
				{
				setState(587); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(590); match(Identifier);
			setState(591); formalParameters();
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(592); match(LBRACKET);
				setState(593); match(RBRACKET);
				}
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(601);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(599); match(THROWS);
				setState(600); qualifiedNameList();
				}
			}

			setState(603); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 66, RULE_interfaceFieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605); modifiers();
			setState(606); type();
			setState(607); variableDeclarator();
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(608); match(COMMA);
				setState(609); variableDeclarator();
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(615); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 68, RULE_type);
		int _la;
		try {
			setState(633);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(617); classOrInterfaceType();
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(618); match(LBRACKET);
					setState(619); match(RBRACKET);
					}
					}
					setState(624);
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
				setState(625); primitiveType();
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(626); match(LBRACKET);
					setState(627); match(RBRACKET);
					}
					}
					setState(632);
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
		enterRule(_localctx, 70, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635); identifierTypeArgument();
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(636); match(DOT);
				setState(637); identifierTypeArgument();
				}
				}
				setState(642);
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
		enterRule(_localctx, 72, RULE_identifierTypeArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643); match(Identifier);
			setState(645);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(644); typeArguments();
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
		enterRule(_localctx, 74, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
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
		enterRule(_localctx, 76, RULE_typeArguments);
		int _la;
		try {
			setState(662);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649); match(LT);
				setState(650); typeArgument();
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(651); match(COMMA);
					setState(652); typeArgument();
					}
					}
					setState(657);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(658); match(GT);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(660); match(LT);
				setState(661); match(GT);
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
		enterRule(_localctx, 78, RULE_typeArgument);
		int _la;
		try {
			setState(670);
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
				setState(664); type();
				}
				break;
			case QUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(665); match(QUES);
				setState(668);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(666);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(667); type();
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
		enterRule(_localctx, 80, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672); qualifiedName();
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(673); match(COMMA);
				setState(674); qualifiedName();
				}
				}
				setState(679);
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
		enterRule(_localctx, 82, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680); match(LPAREN);
			setState(682);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT))) != 0) || _la==Identifier) {
				{
				setState(681); formalParameterDecls();
				}
			}

			setState(684); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 84, RULE_formalParameterDecls);
		int _la;
		try {
			int _alt;
			setState(709);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(686); ellipsisParameterDecl();
				((FormalParameterDeclsContext)_localctx).parameterType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(689); normalParameterDecl();
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(690); match(COMMA);
					setState(691); normalParameterDecl();
					}
					}
					setState(696);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((FormalParameterDeclsContext)_localctx).parameterType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(702); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(699); normalParameterDecl();
						setState(700); match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(704); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(706); ellipsisParameterDecl();
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
		enterRule(_localctx, 86, RULE_normalParameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711); variableModifiers();
			setState(712); type();
			setState(713); match(Identifier);
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(714); match(LBRACKET);
				setState(715); match(RBRACKET);
				}
				}
				setState(720);
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
		enterRule(_localctx, 88, RULE_ellipsisParameterDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721); variableModifiers();
			setState(722); type();
			setState(723); match(ELLIPSIS);
			setState(724); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 90, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(742);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(726); nonWildcardTypeArguments();
					}
				}

				setState(729);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==SUPER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(730); arguments();
				setState(731); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(733); primary();
				setState(734); match(DOT);
				setState(736);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(735); nonWildcardTypeArguments();
					}
				}

				setState(738); match(SUPER);
				setState(739); arguments();
				setState(740); match(SEMI);
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
		enterRule(_localctx, 92, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744); match(Identifier);
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(745); match(DOT);
				setState(746); match(Identifier);
				}
				}
				setState(751);
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
		enterRule(_localctx, 94, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(752); annotation();
				}
				}
				setState(755); 
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
		enterRule(_localctx, 96, RULE_annotation);
		try {
			setState(760);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(757); markerAnnotation();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(758); singleElementAnnotation();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(759); normalAnnotation();
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
		enterRule(_localctx, 98, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762); match(AT);
			setState(763); qualifiedName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 100, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765); match(AT);
			setState(766); qualifiedName();
			setState(767); match(LPAREN);
			setState(768); elementValue();
			setState(769); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 102, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771); match(AT);
			setState(772); qualifiedName();
			setState(773); match(LPAREN);
			setState(775);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(774); elementValuePairs();
				}
			}

			setState(777); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 104, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779); elementValuePair();
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(780); match(COMMA);
				setState(781); elementValuePair();
				}
				}
				setState(786);
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
		enterRule(_localctx, 106, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787); match(Identifier);
			setState(788); match(EQ);
			setState(789); elementValue();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 108, RULE_elementValue);
		try {
			setState(794);
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
				setState(791); conditionalExpression();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(792); annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(793); elementValueArrayInitializer();
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
		enterRule(_localctx, 110, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(796); match(LBRACE);
			setState(805);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUSPLUS - 65)) | (1L << (SUBSUB - 65)) | (1L << (TILDE - 65)) | (1L << (BANG - 65)) | (1L << (NEW - 65)) | (1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(797); elementValue();
				setState(802);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(798); match(COMMA);
						setState(799); elementValue();
						}
						} 
					}
					setState(804);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				}
			}

			setState(808);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(807); match(COMMA);
				}
			}

			setState(810); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 112, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812); modifiers();
			setState(813); match(AT);
			setState(814); match(INTERFACE);
			setState(815); match(Identifier);
			setState(816); annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 114, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818); match(LBRACE);
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << INTERFACE) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << AT) | (1L << ENUM))) != 0) || _la==Identifier) {
				{
				{
				setState(819); annotationTypeElementDeclaration();
				}
				}
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(825); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 116, RULE_annotationTypeElementDeclaration);
		try {
			setState(834);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827); annotationMethodDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828); interfaceFieldDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(829); normalClassDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(830); normalInterfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(831); enumDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(832); annotationTypeDeclaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(833); match(SEMI);
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
		enterRule(_localctx, 118, RULE_annotationMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836); modifiers();
			setState(837); type();
			setState(838); match(Identifier);
			setState(839); match(LPAREN);
			setState(840); match(RPAREN);
			setState(843);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(841); match(DEFAULT);
				setState(842); elementValue();
				}
			}

			setState(845); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 120, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847); match(LBRACE);
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << INTERFACE) | (1L << THROW) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TRY) | (1L << SWITCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ASSERT - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (TILDE - 64)) | (1L << (BANG - 64)) | (1L << (NEW - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(848); blockStatement();
				}
				}
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(854); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 122, RULE_blockStatement);
		try {
			setState(859);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856); localVariableDeclarationStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(857); classOrInterfaceDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(858); statement();
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
		enterRule(_localctx, 124, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861); localVariableDeclaration();
			setState(862); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 126, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864); variableModifiers();
			setState(865); type();
			setState(866); variableDeclarator();
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(867); match(COMMA);
				setState(868); variableDeclarator();
				}
				}
				setState(873);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(Java7Parser.RBRACE, 0); }
		public TerminalNode WHILE() { return getToken(Java7Parser.WHILE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(Java7Parser.SWITCH, 0); }
		public TerminalNode ELSE() { return getToken(Java7Parser.ELSE, 0); }
		public TerminalNode LBRACE() { return getToken(Java7Parser.LBRACE, 0); }
		public TerminalNode DO() { return getToken(Java7Parser.DO, 0); }
		public SwitchBlockStatementGroupsContext switchBlockStatementGroups() {
			return getRuleContext(SwitchBlockStatementGroupsContext.class,0);
		}
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Java7Parser.SEMI, 0); }
		public TerminalNode ASSERT() { return getToken(Java7Parser.ASSERT, 0); }
		public TerminalNode BREAK() { return getToken(Java7Parser.BREAK, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode IF() { return getToken(Java7Parser.IF, 0); }
		public TerminalNode COLON() { return getToken(Java7Parser.COLON, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(Java7Parser.SYNCHRONIZED, 0); }
		public TerminalNode CONTINUE() { return getToken(Java7Parser.CONTINUE, 0); }
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public TrystatementContext trystatement() {
			return getRuleContext(TrystatementContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(Java7Parser.RETURN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode THROW() { return getToken(Java7Parser.THROW, 0); }
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
		enterRule(_localctx, 128, RULE_statement);
		int _la;
		try {
			setState(938);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(874); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(875); match(ASSERT);
				setState(876); expression();
				setState(879);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(877); match(COLON);
					setState(878); expression();
					}
				}

				setState(881); match(SEMI);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(883); match(IF);
				setState(884); parExpression();
				setState(885); statement();
				setState(888);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(886); match(ELSE);
					setState(887); statement();
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(890); forstatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(891); match(WHILE);
				setState(892); parExpression();
				setState(893); statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(895); match(DO);
				setState(896); statement();
				setState(897); match(WHILE);
				setState(898); parExpression();
				setState(899); match(SEMI);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(901); trystatement();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(902); match(SWITCH);
				setState(903); parExpression();
				setState(904); match(LBRACE);
				setState(905); switchBlockStatementGroups();
				setState(906); match(RBRACE);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(908); match(SYNCHRONIZED);
				setState(909); parExpression();
				setState(910); block();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(912); match(RETURN);
				setState(914);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUSPLUS - 65)) | (1L << (SUBSUB - 65)) | (1L << (TILDE - 65)) | (1L << (BANG - 65)) | (1L << (NEW - 65)) | (1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(913); expression();
					}
				}

				setState(916); match(SEMI);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(917); match(THROW);
				setState(918); expression();
				setState(919); match(SEMI);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(921); match(BREAK);
				setState(923);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(922); match(Identifier);
					}
				}

				setState(925); match(SEMI);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(926); match(CONTINUE);
				setState(928);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(927); match(Identifier);
					}
				}

				setState(930); match(SEMI);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(931); expression();
				setState(932); match(SEMI);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(934); match(Identifier);
				setState(935); match(COLON);
				setState(936); statement();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(937); emptyStatement();
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
		enterRule(_localctx, 130, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 132, RULE_switchBlockStatementGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(942); switchBlockStatementGroup();
				}
				}
				setState(947);
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
		enterRule(_localctx, 134, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948); switchLabel();
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << CLASS) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << ABSTRACT) | (1L << STATIC) | (1L << FINAL) | (1L << STRICTFP) | (1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << INTERFACE) | (1L << THROW) | (1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TRY) | (1L << SWITCH) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << ENUM))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ASSERT - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (SUBSUB - 64)) | (1L << (TILDE - 64)) | (1L << (BANG - 64)) | (1L << (NEW - 64)) | (1L << (PLUS - 64)) | (1L << (SUB - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(949); blockStatement();
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Java7Parser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(Java7Parser.DEFAULT, 0); }
		public TerminalNode CASE() { return getToken(Java7Parser.CASE, 0); }
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
		enterRule(_localctx, 136, RULE_switchLabel);
		try {
			setState(961);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(955); match(CASE);
				setState(956); expression();
				setState(957); match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(959); match(DEFAULT);
				setState(960); match(COLON);
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
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public TryWithResourcesContext tryWithResources() {
			return getRuleContext(TryWithResourcesContext.class,0);
		}
		public TerminalNode FINALLY() { return getToken(Java7Parser.FINALLY, 0); }
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
		enterRule(_localctx, 138, RULE_trystatement);
		try {
			setState(988);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(963); match(TRY);
				setState(964); block();
				((TrystatementContext)_localctx).statementType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(967); match(TRY);
				setState(968); block();
				setState(969); catches();
				setState(970); match(FINALLY);
				setState(971); block();
				((TrystatementContext)_localctx).statementType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(974); match(TRY);
				setState(975); block();
				setState(976); catches();
				((TrystatementContext)_localctx).statementType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(979); match(TRY);
				setState(980); block();
				setState(981); match(FINALLY);
				setState(982); block();
				((TrystatementContext)_localctx).statementType =  4;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(985); tryWithResources();
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
		enterRule(_localctx, 140, RULE_tryWithResources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990); match(TRY);
			setState(991); resourceSpecification();
			setState(992); block();
			setState(994);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(993); catches();
				}
			}

			setState(998);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(996); match(FINALLY);
				setState(997); block();
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
		enterRule(_localctx, 142, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000); match(LPAREN);
			setState(1001); resources();
			setState(1003);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1002); match(SEMI);
				}
			}

			setState(1005); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 144, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1007); resource();
			setState(1012);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1008); match(SEMI);
					setState(1009); resource();
					}
					} 
				}
				setState(1014);
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
		enterRule(_localctx, 146, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1015); variableModifiers();
				}
				break;
			}
			setState(1018); type();
			setState(1019); match(Identifier);
			setState(1020); match(EQ);
			setState(1021); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 148, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023); catchClause();
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1024); catchClause();
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
		enterRule(_localctx, 150, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030); match(CATCH);
			setState(1031); match(LPAREN);
			setState(1032); catchFormalParameter();
			setState(1033); match(RPAREN);
			setState(1034); block();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 152, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036); variableModifiers();
			setState(1037); type();
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(1038); match(BAR);
				setState(1039); type();
				}
				}
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1045); match(Identifier);
			setState(1050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1046); match(LBRACKET);
				setState(1047); match(RBRACKET);
				}
				}
				setState(1052);
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
		public NormalForStatementContext normalForStatement() {
			return getRuleContext(NormalForStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
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
		enterRule(_localctx, 154, RULE_forstatement);
		try {
			setState(1055);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1053); foreachStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1054); normalForStatement();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Java7Parser.COLON, 0); }
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public TerminalNode FOR() { return getToken(Java7Parser.FOR, 0); }
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Java7Parser.LPAREN, 0); }
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
		enterRule(_localctx, 156, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057); match(FOR);
			setState(1058); match(LPAREN);
			setState(1059); variableModifiers();
			setState(1060); type();
			setState(1061); match(Identifier);
			setState(1062); match(COLON);
			setState(1063); expression();
			setState(1064); match(RPAREN);
			setState(1065); statement();
			}
		}
		catch (RecognitionException re) {
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Java7Parser.RPAREN, 0); }
		public TerminalNode FOR() { return getToken(Java7Parser.FOR, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(Java7Parser.SEMI); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
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
		enterRule(_localctx, 158, RULE_normalForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067); match(FOR);
			setState(1068); match(LPAREN);
			setState(1070);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << AT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUSPLUS - 65)) | (1L << (SUBSUB - 65)) | (1L << (TILDE - 65)) | (1L << (BANG - 65)) | (1L << (NEW - 65)) | (1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(1069); forInit();
				}
			}

			setState(1072); match(SEMI);
			setState(1074);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUSPLUS - 65)) | (1L << (SUBSUB - 65)) | (1L << (TILDE - 65)) | (1L << (BANG - 65)) | (1L << (NEW - 65)) | (1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(1073); expression();
				}
			}

			setState(1076); match(SEMI);
			setState(1078);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUSPLUS - 65)) | (1L << (SUBSUB - 65)) | (1L << (TILDE - 65)) | (1L << (BANG - 65)) | (1L << (NEW - 65)) | (1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(1077); expressionList();
				}
			}

			setState(1080); match(RPAREN);
			setState(1081); statement();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 160, RULE_forInit);
		try {
			setState(1085);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1083); localVariableDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084); expressionList();
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
		enterRule(_localctx, 162, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087); match(LPAREN);
			setState(1088); expression();
			setState(1089); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 164, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091); expression();
			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1092); match(COMMA);
				setState(1093); expression();
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
		enterRule(_localctx, 166, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099); conditionalExpression();
			setState(1103);
			_la = _input.LA(1);
			if (_la==EQ || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CARETEQ - 81)) | (1L << (PLUSEQ - 81)) | (1L << (SUBEQ - 81)) | (1L << (STAREQ - 81)) | (1L << (SLASHEQ - 81)) | (1L << (AMPEQ - 81)) | (1L << (BAREQ - 81)) | (1L << (PERCENTEQ - 81)) | (1L << (GT - 81)) | (1L << (LT - 81)))) != 0)) {
				{
				setState(1100); assignmentOperator();
				setState(1101); expression();
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
		enterRule(_localctx, 168, RULE_assignmentOperator);
		try {
			setState(1136);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1105); match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1107); match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1109); match(SUBEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1111); match(STAREQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  4;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1113); match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  5;
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1115); match(AMPEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  6;
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1117); match(BAREQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  7;
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1119); match(CARETEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  8;
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1121); match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  9;
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1123); match(LT);
				setState(1124); match(LT);
				setState(1125); match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  10;
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1127); match(GT);
				setState(1128); match(GT);
				setState(1129); match(GT);
				setState(1130); match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  11;
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1132); match(GT);
				setState(1133); match(GT);
				setState(1134); match(EQ);
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
		enterRule(_localctx, 170, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138); conditionalOrExpression();
			setState(1144);
			_la = _input.LA(1);
			if (_la==QUES) {
				{
				setState(1139); match(QUES);
				setState(1140); expression();
				setState(1141); match(COLON);
				setState(1142); conditionalExpression();
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
		enterRule(_localctx, 172, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146); conditionalAndExpression();
			setState(1151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BARBAR) {
				{
				{
				setState(1147); match(BARBAR);
				setState(1148); conditionalAndExpression();
				}
				}
				setState(1153);
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
		enterRule(_localctx, 174, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154); inclusiveOrExpression();
			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMPAMP) {
				{
				{
				setState(1155); match(AMPAMP);
				setState(1156); inclusiveOrExpression();
				}
				}
				setState(1161);
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
		enterRule(_localctx, 176, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162); exclusiveOrExpression();
			setState(1167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(1163); match(BAR);
				setState(1164); exclusiveOrExpression();
				}
				}
				setState(1169);
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
		enterRule(_localctx, 178, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170); andExpression();
			setState(1175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(1171); match(CARET);
				setState(1172); andExpression();
				}
				}
				setState(1177);
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
		enterRule(_localctx, 180, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178); equalityExpression();
			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(1179); match(AMP);
				setState(1180); equalityExpression();
				}
				}
				setState(1185);
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
		public NotEqualityExpressionContext notEqualityExpression(int i) {
			return getRuleContext(NotEqualityExpressionContext.class,i);
		}
		public TerminalNode EQEQ(int i) {
			return getToken(Java7Parser.EQEQ, i);
		}
		public List<TerminalNode> EQEQ() { return getTokens(Java7Parser.EQEQ); }
		public List<NotEqualityExpressionContext> notEqualityExpression() {
			return getRuleContexts(NotEqualityExpressionContext.class);
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
		enterRule(_localctx, 182, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186); notEqualityExpression();
			setState(1191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQEQ) {
				{
				{
				setState(1187); match(EQEQ);
				setState(1188); notEqualityExpression();
				}
				}
				setState(1193);
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
		public InstanceOfExpressionContext instanceOfExpression(int i) {
			return getRuleContext(InstanceOfExpressionContext.class,i);
		}
		public List<InstanceOfExpressionContext> instanceOfExpression() {
			return getRuleContexts(InstanceOfExpressionContext.class);
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
		enterRule(_localctx, 184, RULE_notEqualityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194); instanceOfExpression();
			setState(1199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BANGEQ) {
				{
				{
				setState(1195); match(BANGEQ);
				setState(1196); instanceOfExpression();
				}
				}
				setState(1201);
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
		enterRule(_localctx, 186, RULE_instanceOfExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202); relationalExpression();
			setState(1205);
			_la = _input.LA(1);
			if (_la==INSTANCEOF) {
				{
				setState(1203); match(INSTANCEOF);
				setState(1204); type();
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
		enterRule(_localctx, 188, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1207); shiftExpression();
			setState(1213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1208); relationalOp();
					setState(1209); shiftExpression();
					}
					} 
				}
				setState(1215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
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
		public TerminalNode GT() { return getToken(Java7Parser.GT, 0); }
		public TerminalNode LT() { return getToken(Java7Parser.LT, 0); }
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
		enterRule(_localctx, 190, RULE_relationalOp);
		try {
			setState(1226);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1216); match(LT);
				setState(1217); match(EQ);
				((RelationalOpContext)_localctx).operatorType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1219); match(GT);
				setState(1220); match(EQ);
				((RelationalOpContext)_localctx).operatorType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1222); match(LT);
				((RelationalOpContext)_localctx).operatorType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1224); match(GT);
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
		enterRule(_localctx, 192, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1228); additiveExpression();
			setState(1234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1229); shiftOp();
					setState(1230); additiveExpression();
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

	public static class ShiftOpContext extends ParserRuleContext {
		public int operatorType;
		public List<TerminalNode> GT() { return getTokens(Java7Parser.GT); }
		public List<TerminalNode> LT() { return getTokens(Java7Parser.LT); }
		public TerminalNode LT(int i) {
			return getToken(Java7Parser.LT, i);
		}
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
		enterRule(_localctx, 194, RULE_shiftOp);
		try {
			setState(1247);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1237); match(LT);
				setState(1238); match(LT);
				((ShiftOpContext)_localctx).operatorType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1240); match(GT);
				setState(1241); match(GT);
				setState(1242); match(GT);
				((ShiftOpContext)_localctx).operatorType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1244); match(GT);
				setState(1245); match(GT);
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
		public List<AdditiveOpContext> additiveOp() {
			return getRuleContexts(AdditiveOpContext.class);
		}
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
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
		enterRule(_localctx, 196, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249); multiplicativeExpression();
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==SUB) {
				{
				{
				setState(1250); additiveOp();
				setState(1251); multiplicativeExpression();
				}
				}
				setState(1257);
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
		public TerminalNode SUB() { return getToken(Java7Parser.SUB, 0); }
		public TerminalNode PLUS() { return getToken(Java7Parser.PLUS, 0); }
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
		enterRule(_localctx, 198, RULE_additiveOp);
		try {
			setState(1262);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1258); match(PLUS);
				((AdditiveOpContext)_localctx).operatorType =  1;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260); match(SUB);
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
		public List<MultiplicativeOpContext> multiplicativeOp() {
			return getRuleContexts(MultiplicativeOpContext.class);
		}
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public MultiplicativeOpContext multiplicativeOp(int i) {
			return getRuleContext(MultiplicativeOpContext.class,i);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
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
		enterRule(_localctx, 200, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264); unaryExpression();
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==SLASH || _la==PERCENT) {
				{
				{
				setState(1265); multiplicativeOp();
				setState(1266); unaryExpression();
				}
				}
				setState(1272);
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
		public TerminalNode SLASH() { return getToken(Java7Parser.SLASH, 0); }
		public TerminalNode STAR() { return getToken(Java7Parser.STAR, 0); }
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
		enterRule(_localctx, 202, RULE_multiplicativeOp);
		try {
			setState(1279);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1273); match(STAR);
				((MultiplicativeOpContext)_localctx).operatorType =  1;
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1275); match(SLASH);
				((MultiplicativeOpContext)_localctx).operatorType =  2;
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1277); match(PERCENT);
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
		public TerminalNode SUB() { return getToken(Java7Parser.SUB, 0); }
		public TerminalNode PLUS() { return getToken(Java7Parser.PLUS, 0); }
		public TerminalNode BANG() { return getToken(Java7Parser.BANG, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public TerminalNode SUBSUB() { return getToken(Java7Parser.SUBSUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(Java7Parser.PLUSPLUS, 0); }
		public TerminalNode TILDE() { return getToken(Java7Parser.TILDE, 0); }
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
		enterRule(_localctx, 204, RULE_unaryExpression);
		try {
			setState(1294);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1281); match(PLUS);
				setState(1282); unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1283); match(SUB);
				setState(1284); unaryExpression();
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1285); match(PLUSPLUS);
				setState(1286); unaryExpression();
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(1287); match(SUBSUB);
				setState(1288); unaryExpression();
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1289); match(TILDE);
				setState(1290); unaryExpression();
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 6);
				{
				setState(1291); match(BANG);
				setState(1292); unaryExpression();
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
				setState(1293); unaryExpressionNotPlusMinus();
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
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUBSUB() { return getToken(Java7Parser.SUBSUB, 0); }
		public TerminalNode PLUSPLUS() { return getToken(Java7Parser.PLUSPLUS, 0); }
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
		enterRule(_localctx, 206, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			setState(1307);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1296); castExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1297); primary();
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT || _la==LBRACKET) {
					{
					{
					setState(1298); selector();
					}
					}
					setState(1303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1305);
				_la = _input.LA(1);
				if (_la==PLUSPLUS || _la==SUBSUB) {
					{
					setState(1304);
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
		enterRule(_localctx, 208, RULE_castExpression);
		try {
			setState(1319);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1309); match(LPAREN);
				setState(1310); primitiveType();
				setState(1311); match(RPAREN);
				setState(1312); unaryExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1314); match(LPAREN);
				setState(1315); type();
				setState(1316); match(RPAREN);
				setState(1317); unaryExpressionNotPlusMinus();
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
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(Java7Parser.CLASS, 0); }
		public TerminalNode DOT(int i) {
			return getToken(Java7Parser.DOT, i);
		}
		public ThisSuffixContext thisSuffix() {
			return getRuleContext(ThisSuffixContext.class,0);
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
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public TerminalNode SUPER() { return getToken(Java7Parser.SUPER, 0); }
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
		enterRule(_localctx, 210, RULE_primary);
		int _la;
		try {
			int _alt;
			setState(1374);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1321); parExpression();
				((PrimaryContext)_localctx).operationType =  1;
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1324); match(THIS);
				setState(1329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1325); match(DOT);
						setState(1326); match(Identifier);
						}
						} 
					}
					setState(1331);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				}
				setState(1333);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1332); thisSuffix();
					}
					break;
				}
				((PrimaryContext)_localctx).operationType =  2;
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(1336); match(Identifier);
				setState(1341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1337); match(DOT);
						setState(1338); match(Identifier);
						}
						} 
					}
					setState(1343);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				}
				setState(1345);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1344); identifierSuffix();
					}
					break;
				}
				((PrimaryContext)_localctx).operationType =  3;
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1348); match(SUPER);
				setState(1349); superSuffix();
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
				setState(1352); literal();
				((PrimaryContext)_localctx).operationType =  5;
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 6);
				{
				setState(1355); creator();
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
				setState(1358); primitiveType();
				setState(1363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(1359); match(LBRACKET);
					setState(1360); match(RBRACKET);
					}
					}
					setState(1365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1366); match(DOT);
				setState(1367); match(CLASS);
				((PrimaryContext)_localctx).operationType =  7;
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 8);
				{
				setState(1370); match(VOID);
				setState(1371); match(DOT);
				setState(1372); match(CLASS);
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
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
		enterRule(_localctx, 212, RULE_superSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376); match(DOT);
			setState(1378);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1377); typeArguments();
				}
			}

			setState(1380); match(Identifier);
			setState(1382);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1381); arguments();
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
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(Java7Parser.LBRACKET); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(Java7Parser.LBRACKET, i);
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
		enterRule(_localctx, 214, RULE_thisSuffix);
		try {
			int _alt;
			setState(1406);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1388); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1384); match(LBRACKET);
						setState(1385); expression();
						setState(1386); match(RBRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1390); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				((ThisSuffixContext)_localctx).operationType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1394); arguments();
				((ThisSuffixContext)_localctx).operationType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1397); match(DOT);
				setState(1398); nonWildcardTypeArguments();
				setState(1399); match(Identifier);
				setState(1400); arguments();
				((ThisSuffixContext)_localctx).operationType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1403); innerCreator();
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
		public List<TerminalNode> RBRACKET() { return getTokens(Java7Parser.RBRACKET); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Java7Parser.DOT, 0); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Java7Parser.RBRACKET, i);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
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
		enterRule(_localctx, 216, RULE_identifierSuffix);
		int _la;
		try {
			int _alt;
			setState(1445);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1410); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1408); match(LBRACKET);
					setState(1409); match(RBRACKET);
					}
					}
					setState(1412); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACKET );
				setState(1414); match(DOT);
				setState(1415); match(CLASS);
				((IdentifierSuffixContext)_localctx).operationType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1421); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1417); match(LBRACKET);
						setState(1418); expression();
						setState(1419); match(RBRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1423); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				((IdentifierSuffixContext)_localctx).operationType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1427); arguments();
				((IdentifierSuffixContext)_localctx).operationType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1430); match(DOT);
				setState(1431); match(CLASS);
				((IdentifierSuffixContext)_localctx).operationType =  4;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1433); match(DOT);
				setState(1434); nonWildcardTypeArguments();
				setState(1435); match(Identifier);
				setState(1436); arguments();
				((IdentifierSuffixContext)_localctx).operationType =  5;
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1439); match(DOT);
				setState(1440); match(THIS);
				((IdentifierSuffixContext)_localctx).operationType =  6;
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1442); innerCreator();
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
		enterRule(_localctx, 218, RULE_selector);
		int _la;
		try {
			setState(1469);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1447); match(DOT);
				setState(1448); match(Identifier);
				setState(1450);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1449); arguments();
					}
				}

				((SelectorContext)_localctx).operationType =  1;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1453); match(DOT);
				setState(1454); match(THIS);
				((SelectorContext)_localctx).operationType =  2;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1456); match(DOT);
				setState(1457); match(SUPER);
				setState(1458); superSuffix();
				((SelectorContext)_localctx).operationType =  3;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1461); innerCreator();
				((SelectorContext)_localctx).operationType =  4;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1464); match(LBRACKET);
				setState(1465); expression();
				setState(1466); match(RBRACKET);
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
		enterRule(_localctx, 220, RULE_creator);
		try {
			setState(1481);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1471); match(NEW);
				setState(1472); nonWildcardTypeArguments();
				setState(1473); classOrInterfaceType();
				setState(1474); classCreatorRest();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1476); match(NEW);
				setState(1477); classOrInterfaceType();
				setState(1478); classCreatorRest();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1480); arrayCreator();
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
		enterRule(_localctx, 222, RULE_arrayCreator);
		int _la;
		try {
			int _alt;
			setState(1517);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1483); match(NEW);
				setState(1484); createdName();
				setState(1485); match(LBRACKET);
				setState(1486); match(RBRACKET);
				setState(1491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(1487); match(LBRACKET);
					setState(1488); match(RBRACKET);
					}
					}
					setState(1493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1494); arrayInitializer();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1496); match(NEW);
				setState(1497); createdName();
				setState(1498); match(LBRACKET);
				setState(1499); expression();
				setState(1500); match(RBRACKET);
				setState(1507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1501); match(LBRACKET);
						setState(1502); expression();
						setState(1503); match(RBRACKET);
						}
						} 
					}
					setState(1509);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
				}
				setState(1514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1510); match(LBRACKET);
						setState(1511); match(RBRACKET);
						}
						} 
					}
					setState(1516);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
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
		enterRule(_localctx, 224, RULE_variableInitializer);
		try {
			setState(1521);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1519); arrayInitializer();
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
				setState(1520); expression();
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
		enterRule(_localctx, 226, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1523); match(LBRACE);
			setState(1532);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUSPLUS - 65)) | (1L << (SUBSUB - 65)) | (1L << (TILDE - 65)) | (1L << (BANG - 65)) | (1L << (NEW - 65)) | (1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(1524); variableInitializer();
				setState(1529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1525); match(COMMA);
						setState(1526); variableInitializer();
						}
						} 
					}
					setState(1531);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				}
				}
			}

			setState(1535);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1534); match(COMMA);
				}
			}

			setState(1537); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 228, RULE_createdName);
		try {
			setState(1541);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1539); classOrInterfaceType();
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
				setState(1540); primitiveType();
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
		public IdentifierTypeArgumentContext identifierTypeArgument() {
			return getRuleContext(IdentifierTypeArgumentContext.class,0);
		}
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
		enterRule(_localctx, 230, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543); match(DOT);
			setState(1544); match(NEW);
			setState(1546);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1545); nonWildcardTypeArguments();
				}
			}

			setState(1548); identifierTypeArgument();
			setState(1549); classCreatorRest();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 232, RULE_classCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551); arguments();
			setState(1553);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1552); classBody();
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
		enterRule(_localctx, 234, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555); match(LT);
			setState(1556); typeList();
			setState(1557); match(GT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 236, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559); match(LPAREN);
			setState(1561);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << VOID) | (1L << BOOLEAN) | (1L << CHAR) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << THIS) | (1L << SUPER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUSPLUS - 65)) | (1L << (SUBSUB - 65)) | (1L << (TILDE - 65)) | (1L << (BANG - 65)) | (1L << (NEW - 65)) | (1L << (PLUS - 65)) | (1L << (SUB - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(1560); expressionList();
				}
			}

			setState(1563); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 238, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
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
		public TerminalNode CLASS() { return getToken(Java7Parser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
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
		enterRule(_localctx, 240, RULE_classHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567); modifiers();
			setState(1568); match(CLASS);
			setState(1569); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 242, RULE_enumHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571); modifiers();
			setState(1572);
			_la = _input.LA(1);
			if ( !(_la==ENUM || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1573); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 244, RULE_interfaceHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575); modifiers();
			setState(1576); match(INTERFACE);
			setState(1577); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 246, RULE_annotationHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1579); modifiers();
			setState(1580); match(AT);
			setState(1581); match(INTERFACE);
			setState(1582); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 248, RULE_typeHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584); modifiers();
			setState(1591);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(1585); match(CLASS);
				}
				break;
			case ENUM:
				{
				setState(1586); match(ENUM);
				}
				break;
			case INTERFACE:
			case AT:
				{
				{
				setState(1588);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1587); match(AT);
					}
				}

				setState(1590); match(INTERFACE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1593); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 250, RULE_methodHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595); modifiers();
			setState(1597);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1596); typeParameters();
				}
			}

			setState(1601);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1599); type();
				}
				break;

			case 2:
				{
				setState(1600); match(VOID);
				}
				break;
			}
			setState(1603); match(Identifier);
			setState(1604); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 252, RULE_fieldHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606); modifiers();
			setState(1607); type();
			setState(1608); match(Identifier);
			setState(1613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1609); match(LBRACKET);
				setState(1610); match(RBRACKET);
				}
				}
				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1616);
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
		enterRule(_localctx, 254, RULE_localVariableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1618); variableModifiers();
			setState(1619); type();
			setState(1620); match(Identifier);
			setState(1625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1621); match(LBRACKET);
				setState(1622); match(RBRACKET);
				}
				}
				setState(1627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1628);
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

	public static final String _serializedATN =
		"\1\1f\u065f\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7\6\2"+
		"\7\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16\7\16\2\17"+
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
		"\2r\7r\2s\7s\2t\7t\2u\7u\2v\7v\2w\7w\2x\7x\2y\7y\2z\7z\2{\7{\2|\7|\2}"+
		"\7}\2~\7~\2\177\7\177\1\0\3\0\u0102\b\0\1\0\5\0\u0105\b\0\n\0\f\0\u0108"+
		"\t\0\1\0\5\0\u010b\b\0\n\0\f\0\u010e\t\0\1\1\3\1\u0111\b\1\1\1\1\1\1\1"+
		"\1\1\1\2\1\2\3\2\u0119\b\2\1\2\1\2\1\2\1\2\1\2\1\2\3\2\u0121\b\2\1\2\1"+
		"\2\1\2\4\2\u0126\b\2\13\2\f\2\u0127\1\2\1\2\3\2\u012c\b\2\1\2\3\2\u012f"+
		"\b\2\1\3\1\3\1\3\5\3\u0134\b\3\n\3\f\3\u0137\t\3\1\4\1\4\3\4\u013b\b\4"+
		"\1\5\1\5\3\5\u013f\b\5\1\6\5\6\u0142\b\6\n\6\f\6\u0145\t\6\1\7\1\7\1\7"+
		"\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\3\7\u0153\b\7\1\b\5\b\u0156\b\b\n"+
		"\b\f\b\u0159\t\b\1\b\3\b\u015c\b\b\1\b\5\b\u015f\b\b\n\b\f\b\u0162\t\b"+
		"\1\t\1\t\3\t\u0166\b\t\1\n\1\n\1\n\1\n\3\n\u016c\b\n\1\n\1\n\3\n\u0170"+
		"\b\n\1\n\1\n\3\n\u0174\b\n\1\n\1\n\1\13\1\13\1\13\1\13\5\13\u017c\b\13"+
		"\n\13\f\13\u017f\t\13\1\13\1\13\1\f\1\f\1\f\3\f\u0186\b\f\1\r\1\r\1\r"+
		"\5\r\u018b\b\r\n\r\f\r\u018e\t\r\1\16\1\16\1\16\1\16\1\16\3\16\u0195\b"+
		"\16\1\16\1\16\1\17\1\17\3\17\u019b\b\17\1\17\3\17\u019e\b\17\1\17\3\17"+
		"\u01a1\b\17\1\17\1\17\1\20\1\20\1\20\5\20\u01a8\b\20\n\20\f\20\u01ab\t"+
		"\20\1\21\3\21\u01ae\b\21\1\21\1\21\3\21\u01b2\b\21\1\21\3\21\u01b5\b\21"+
		"\1\22\1\22\5\22\u01b9\b\22\n\22\f\22\u01bc\t\22\1\23\1\23\3\23\u01c0\b"+
		"\23\1\24\1\24\1\24\1\24\3\24\u01c6\b\24\1\24\1\24\3\24\u01ca\b\24\1\24"+
		"\1\24\1\25\1\25\1\25\5\25\u01d1\b\25\n\25\f\25\u01d4\t\25\1\26\1\26\5"+
		"\26\u01d8\b\26\n\26\f\26\u01db\t\26\1\26\1\26\1\27\1\27\5\27\u01e1\b\27"+
		"\n\27\f\27\u01e4\t\27\1\27\1\27\1\30\1\30\3\30\u01ea\b\30\1\30\1\30\3"+
		"\30\u01ee\b\30\1\31\1\31\1\31\1\31\1\31\3\31\u01f5\b\31\1\32\1\32\3\32"+
		"\u01f9\b\32\1\32\1\32\3\32\u01fd\b\32\1\32\1\32\1\32\1\32\5\32\u0203\b"+
		"\32\n\32\f\32\u0206\t\32\1\32\1\32\3\32\u020a\b\32\1\32\1\32\3\32\u020e"+
		"\b\32\1\33\1\33\3\33\u0212\b\33\1\33\1\33\1\33\1\33\3\33\u0218\b\33\1"+
		"\33\1\33\1\34\1\34\3\34\u021e\b\34\1\34\5\34\u0221\b\34\n\34\f\34\u0224"+
		"\t\34\1\34\1\34\1\35\1\35\1\35\1\35\1\35\5\35\u022d\b\35\n\35\f\35\u0230"+
		"\t\35\1\35\1\35\1\36\1\36\1\36\5\36\u0237\b\36\n\36\f\36\u023a\t\36\1"+
		"\36\1\36\3\36\u023e\b\36\1\37\1\37\1\37\1\37\1\37\3\37\u0245\b\37\1 \1"+
		" \3 \u0249\b \1 \1 \3 \u024d\b \1 \1 \1 \1 \5 \u0253\b \n \f \u0256\t"+
		" \1 \1 \3 \u025a\b \1 \1 \1!\1!\1!\1!\1!\5!\u0263\b!\n!\f!\u0266\t!\1"+
		"!\1!\1\"\1\"\1\"\5\"\u026d\b\"\n\"\f\"\u0270\t\"\1\"\1\"\1\"\5\"\u0275"+
		"\b\"\n\"\f\"\u0278\t\"\3\"\u027a\b\"\1#\1#\1#\5#\u027f\b#\n#\f#\u0282"+
		"\t#\1$\1$\3$\u0286\b$\1%\1%\1&\1&\1&\1&\5&\u028e\b&\n&\f&\u0291\t&\1&"+
		"\1&\1&\1&\3&\u0297\b&\1\'\1\'\1\'\1\'\3\'\u029d\b\'\3\'\u029f\b\'\1(\1"+
		"(\1(\5(\u02a4\b(\n(\f(\u02a7\t(\1)\1)\3)\u02ab\b)\1)\1)\1*\1*\1*\1*\1"+
		"*\1*\5*\u02b5\b*\n*\f*\u02b8\t*\1*\1*\1*\1*\1*\4*\u02bf\b*\13*\f*\u02c0"+
		"\1*\1*\1*\3*\u02c6\b*\1+\1+\1+\1+\1+\5+\u02cd\b+\n+\f+\u02d0\t+\1,\1,"+
		"\1,\1,\1,\1-\3-\u02d8\b-\1-\1-\1-\1-\1-\1-\1-\3-\u02e1\b-\1-\1-\1-\1-"+
		"\3-\u02e7\b-\1.\1.\1.\5.\u02ec\b.\n.\f.\u02ef\t.\1/\4/\u02f2\b/\13/\f"+
		"/\u02f3\1\60\1\60\1\60\3\60\u02f9\b\60\1\61\1\61\1\61\1\62\1\62\1\62\1"+
		"\62\1\62\1\62\1\63\1\63\1\63\1\63\3\63\u0308\b\63\1\63\1\63\1\64\1\64"+
		"\1\64\5\64\u030f\b\64\n\64\f\64\u0312\t\64\1\65\1\65\1\65\1\65\1\66\1"+
		"\66\1\66\3\66\u031b\b\66\1\67\1\67\1\67\1\67\5\67\u0321\b\67\n\67\f\67"+
		"\u0324\t\67\3\67\u0326\b\67\1\67\3\67\u0329\b\67\1\67\1\67\18\18\18\1"+
		"8\18\18\19\19\59\u0335\b9\n9\f9\u0338\t9\19\19\1:\1:\1:\1:\1:\1:\1:\3"+
		":\u0343\b:\1;\1;\1;\1;\1;\1;\1;\3;\u034c\b;\1;\1;\1<\1<\5<\u0352\b<\n"+
		"<\f<\u0355\t<\1<\1<\1=\1=\1=\3=\u035c\b=\1>\1>\1>\1?\1?\1?\1?\1?\5?\u0366"+
		"\b?\n?\f?\u0369\t?\1@\1@\1@\1@\1@\3@\u0370\b@\1@\1@\1@\1@\1@\1@\1@\3@"+
		"\u0379\b@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@"+
		"\1@\1@\1@\1@\3@\u0393\b@\1@\1@\1@\1@\1@\1@\1@\3@\u039c\b@\1@\1@\1@\3@"+
		"\u03a1\b@\1@\1@\1@\1@\1@\1@\1@\1@\3@\u03ab\b@\1A\1A\1B\5B\u03b0\bB\nB"+
		"\fB\u03b3\tB\1C\1C\5C\u03b7\bC\nC\fC\u03ba\tC\1D\1D\1D\1D\1D\1D\3D\u03c2"+
		"\bD\1E\1E\1E\1E\1E\1E\1E\1E\1E\1E\1E\1E\1E\1E\1E\1E\1E\1E\1E\1E\1E\1E"+
		"\1E\1E\1E\3E\u03dd\bE\1F\1F\1F\1F\3F\u03e3\bF\1F\1F\3F\u03e7\bF\1G\1G"+
		"\1G\3G\u03ec\bG\1G\1G\1H\1H\1H\5H\u03f3\bH\nH\fH\u03f6\tH\1I\3I\u03f9"+
		"\bI\1I\1I\1I\1I\1I\1J\1J\5J\u0402\bJ\nJ\fJ\u0405\tJ\1K\1K\1K\1K\1K\1K"+
		"\1L\1L\1L\1L\5L\u0411\bL\nL\fL\u0414\tL\1L\1L\1L\5L\u0419\bL\nL\fL\u041c"+
		"\tL\1M\1M\3M\u0420\bM\1N\1N\1N\1N\1N\1N\1N\1N\1N\1N\1O\1O\1O\3O\u042f"+
		"\bO\1O\1O\3O\u0433\bO\1O\1O\3O\u0437\bO\1O\1O\1O\1P\1P\3P\u043e\bP\1Q"+
		"\1Q\1Q\1Q\1R\1R\1R\5R\u0447\bR\nR\fR\u044a\tR\1S\1S\1S\1S\3S\u0450\bS"+
		"\1T\1T\1T\1T\1T\1T\1T\1T\1T\1T\1T\1T\1T\1T\1T\1T\1T\1T\1T\1T\1T\1T\1T"+
		"\1T\1T\1T\1T\1T\1T\1T\1T\3T\u0471\bT\1U\1U\1U\1U\1U\1U\3U\u0479\bU\1V"+
		"\1V\1V\5V\u047e\bV\nV\fV\u0481\tV\1W\1W\1W\5W\u0486\bW\nW\fW\u0489\tW"+
		"\1X\1X\1X\5X\u048e\bX\nX\fX\u0491\tX\1Y\1Y\1Y\5Y\u0496\bY\nY\fY\u0499"+
		"\tY\1Z\1Z\1Z\5Z\u049e\bZ\nZ\fZ\u04a1\tZ\1[\1[\1[\5[\u04a6\b[\n[\f[\u04a9"+
		"\t[\1\\\1\\\1\\\5\\\u04ae\b\\\n\\\f\\\u04b1\t\\\1]\1]\1]\3]\u04b6\b]\1"+
		"^\1^\1^\1^\5^\u04bc\b^\n^\f^\u04bf\t^\1_\1_\1_\1_\1_\1_\1_\1_\1_\1_\3"+
		"_\u04cb\b_\1`\1`\1`\1`\5`\u04d1\b`\n`\f`\u04d4\t`\1a\1a\1a\1a\1a\1a\1"+
		"a\1a\1a\1a\3a\u04e0\ba\1b\1b\1b\1b\5b\u04e6\bb\nb\fb\u04e9\tb\1c\1c\1"+
		"c\1c\3c\u04ef\bc\1d\1d\1d\1d\5d\u04f5\bd\nd\fd\u04f8\td\1e\1e\1e\1e\1"+
		"e\1e\3e\u0500\be\1f\1f\1f\1f\1f\1f\1f\1f\1f\1f\1f\1f\1f\3f\u050f\bf\1"+
		"g\1g\1g\5g\u0514\bg\ng\fg\u0517\tg\1g\3g\u051a\bg\3g\u051c\bg\1h\1h\1"+
		"h\1h\1h\1h\1h\1h\1h\1h\3h\u0528\bh\1i\1i\1i\1i\1i\1i\5i\u0530\bi\ni\f"+
		"i\u0533\ti\1i\3i\u0536\bi\1i\1i\1i\1i\5i\u053c\bi\ni\fi\u053f\ti\1i\3"+
		"i\u0542\bi\1i\1i\1i\1i\1i\1i\1i\1i\1i\1i\1i\1i\1i\1i\5i\u0552\bi\ni\f"+
		"i\u0555\ti\1i\1i\1i\1i\1i\1i\1i\1i\3i\u055f\bi\1j\1j\3j\u0563\bj\1j\1"+
		"j\3j\u0567\bj\1k\1k\1k\1k\4k\u056d\bk\13k\fk\u056e\1k\1k\1k\1k\1k\1k\1"+
		"k\1k\1k\1k\1k\1k\1k\1k\3k\u057f\bk\1l\1l\4l\u0583\bl\13l\fl\u0584\1l\1"+
		"l\1l\1l\1l\1l\1l\4l\u058e\bl\13l\fl\u058f\1l\1l\1l\1l\1l\1l\1l\1l\1l\1"+
		"l\1l\1l\1l\1l\1l\1l\1l\1l\1l\1l\3l\u05a6\bl\1m\1m\1m\3m\u05ab\bm\1m\1"+
		"m\1m\1m\1m\1m\1m\1m\1m\1m\1m\1m\1m\1m\1m\1m\1m\3m\u05be\bm\1n\1n\1n\1"+
		"n\1n\1n\1n\1n\1n\1n\3n\u05ca\bn\1o\1o\1o\1o\1o\1o\5o\u05d2\bo\no\fo\u05d5"+
		"\to\1o\1o\1o\1o\1o\1o\1o\1o\1o\1o\1o\5o\u05e2\bo\no\fo\u05e5\to\1o\1o"+
		"\5o\u05e9\bo\no\fo\u05ec\to\3o\u05ee\bo\1p\1p\3p\u05f2\bp\1q\1q\1q\1q"+
		"\5q\u05f8\bq\nq\fq\u05fb\tq\3q\u05fd\bq\1q\3q\u0600\bq\1q\1q\1r\1r\3r"+
		"\u0606\br\1s\1s\1s\3s\u060b\bs\1s\1s\1s\1t\1t\3t\u0612\bt\1u\1u\1u\1u"+
		"\1v\1v\3v\u061a\bv\1v\1v\1w\1w\1x\1x\1x\1x\1y\1y\1y\1y\1z\1z\1z\1z\1{"+
		"\1{\1{\1{\1{\1|\1|\1|\1|\3|\u0635\b|\1|\3|\u0638\b|\1|\1|\1}\1}\3}\u063e"+
		"\b}\1}\1}\3}\u0642\b}\1}\1}\1}\1~\1~\1~\1~\1~\5~\u064c\b~\n~\f~\u064f"+
		"\t~\1~\1~\1\177\1\177\1\177\1\177\1\177\5\177\u0658\b\177\n\177\f\177"+
		"\u065b\t\177\1\177\1\177\1\177\0\u0080\0\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\0\b\1\37&\2((++\1*+\1AB\2,.^a\2??bb\3\1\1\17\17\32"+
		"\32\3\1\1\17\17\32\32\u06de\0\u0101\1\0\0\0\2\u0110\1\0\0\0\4\u012e\1"+
		"\0\0\0\6\u0130\1\0\0\0\b\u013a\1\0\0\0\n\u013e\1\0\0\0\f\u0143\1\0\0\0"+
		"\16\u0152\1\0\0\0\20\u0157\1\0\0\0\22\u0165\1\0\0\0\24\u0167\1\0\0\0\26"+
		"\u0177\1\0\0\0\30\u0182\1\0\0\0\32\u0187\1\0\0\0\34\u018f\1\0\0\0\36\u0198"+
		"\1\0\0\0 \u01a4\1\0\0\0\"\u01ad\1\0\0\0$\u01b6\1\0\0\0&\u01bf\1\0\0\0"+
		"(\u01c1\1\0\0\0*\u01cd\1\0\0\0,\u01d5\1\0\0\0.\u01de\1\0\0\0\60\u01ed"+
		"\1\0\0\0\62\u01f4\1\0\0\0\64\u01f6\1\0\0\0\66\u020f\1\0\0\08\u021b\1\0"+
		"\0\0:\u0227\1\0\0\0<\u0233\1\0\0\0>\u0244\1\0\0\0@\u0246\1\0\0\0B\u025d"+
		"\1\0\0\0D\u0279\1\0\0\0F\u027b\1\0\0\0H\u0283\1\0\0\0J\u0287\1\0\0\0L"+
		"\u0296\1\0\0\0N\u029e\1\0\0\0P\u02a0\1\0\0\0R\u02a8\1\0\0\0T\u02c5\1\0"+
		"\0\0V\u02c7\1\0\0\0X\u02d1\1\0\0\0Z\u02e6\1\0\0\0\\\u02e8\1\0\0\0^\u02f1"+
		"\1\0\0\0`\u02f8\1\0\0\0b\u02fa\1\0\0\0d\u02fd\1\0\0\0f\u0303\1\0\0\0h"+
		"\u030b\1\0\0\0j\u0313\1\0\0\0l\u031a\1\0\0\0n\u031c\1\0\0\0p\u032c\1\0"+
		"\0\0r\u0332\1\0\0\0t\u0342\1\0\0\0v\u0344\1\0\0\0x\u034f\1\0\0\0z\u035b"+
		"\1\0\0\0|\u035d\1\0\0\0~\u0360\1\0\0\0\u0080\u03aa\1\0\0\0\u0082\u03ac"+
		"\1\0\0\0\u0084\u03b1\1\0\0\0\u0086\u03b4\1\0\0\0\u0088\u03c1\1\0\0\0\u008a"+
		"\u03dc\1\0\0\0\u008c\u03de\1\0\0\0\u008e\u03e8\1\0\0\0\u0090\u03ef\1\0"+
		"\0\0\u0092\u03f8\1\0\0\0\u0094\u03ff\1\0\0\0\u0096\u0406\1\0\0\0\u0098"+
		"\u040c\1\0\0\0\u009a\u041f\1\0\0\0\u009c\u0421\1\0\0\0\u009e\u042b\1\0"+
		"\0\0\u00a0\u043d\1\0\0\0\u00a2\u043f\1\0\0\0\u00a4\u0443\1\0\0\0\u00a6"+
		"\u044b\1\0\0\0\u00a8\u0470\1\0\0\0\u00aa\u0472\1\0\0\0\u00ac\u047a\1\0"+
		"\0\0\u00ae\u0482\1\0\0\0\u00b0\u048a\1\0\0\0\u00b2\u0492\1\0\0\0\u00b4"+
		"\u049a\1\0\0\0\u00b6\u04a2\1\0\0\0\u00b8\u04aa\1\0\0\0\u00ba\u04b2\1\0"+
		"\0\0\u00bc\u04b7\1\0\0\0\u00be\u04ca\1\0\0\0\u00c0\u04cc\1\0\0\0\u00c2"+
		"\u04df\1\0\0\0\u00c4\u04e1\1\0\0\0\u00c6\u04ee\1\0\0\0\u00c8\u04f0\1\0"+
		"\0\0\u00ca\u04ff\1\0\0\0\u00cc\u050e\1\0\0\0\u00ce\u051b\1\0\0\0\u00d0"+
		"\u0527\1\0\0\0\u00d2\u055e\1\0\0\0\u00d4\u0560\1\0\0\0\u00d6\u057e\1\0"+
		"\0\0\u00d8\u05a5\1\0\0\0\u00da\u05bd\1\0\0\0\u00dc\u05c9\1\0\0\0\u00de"+
		"\u05ed\1\0\0\0\u00e0\u05f1\1\0\0\0\u00e2\u05f3\1\0\0\0\u00e4\u0605\1\0"+
		"\0\0\u00e6\u0607\1\0\0\0\u00e8\u060f\1\0\0\0\u00ea\u0613\1\0\0\0\u00ec"+
		"\u0617\1\0\0\0\u00ee\u061d\1\0\0\0\u00f0\u061f\1\0\0\0\u00f2\u0623\1\0"+
		"\0\0\u00f4\u0627\1\0\0\0\u00f6\u062b\1\0\0\0\u00f8\u0630\1\0\0\0\u00fa"+
		"\u063b\1\0\0\0\u00fc\u0646\1\0\0\0\u00fe\u0652\1\0\0\0\u0100\u0102\3\2"+
		"\1\0\u0101\u0100\1\0\0\0\u0101\u0102\1\0\0\0\u0102\u0106\1\0\0\0\u0103"+
		"\u0105\3\4\2\0\u0104\u0103\1\0\0\0\u0105\u0108\1\0\0\0\u0106\u0104\1\0"+
		"\0\0\u0106\u0107\1\0\0\0\u0107\u010c\1\0\0\0\u0108\u0106\1\0\0\0\u0109"+
		"\u010b\3\b\4\0\u010a\u0109\1\0\0\0\u010b\u010e\1\0\0\0\u010c\u010a\1\0"+
		"\0\0\u010c\u010d\1\0\0\0\u010d\1\1\0\0\0\u010e\u010c\1\0\0\0\u010f\u0111"+
		"\3^/\0\u0110\u010f\1\0\0\0\u0110\u0111\1\0\0\0\u0111\u0112\1\0\0\0\u0112"+
		"\u0113\5\2\0\0\u0113\u0114\3\\.\0\u0114\u0115\5\1\0\0\u0115\3\1\0\0\0"+
		"\u0116\u0118\5\3\0\0\u0117\u0119\5\f\0\0\u0118\u0117\1\0\0\0\u0118\u0119"+
		"\1\0\0\0\u0119\u011a\1\0\0\0\u011a\u011b\5b\0\0\u011b\u011c\5\4\0\0\u011c"+
		"\u011d\5\5\0\0\u011d\u012f\5\1\0\0\u011e\u0120\5\3\0\0\u011f\u0121\5\f"+
		"\0\0\u0120\u011f\1\0\0\0\u0120\u0121\1\0\0\0\u0121\u0122\1\0\0\0\u0122"+
		"\u0125\5b\0\0\u0123\u0124\5\4\0\0\u0124\u0126\5b\0\0\u0125\u0123\1\0\0"+
		"\0\u0126\u0127\1\0\0\0\u0127\u0125\1\0\0\0\u0127\u0128\1\0\0\0\u0128\u012b"+
		"\1\0\0\0\u0129\u012a\5\4\0\0\u012a\u012c\5\5\0\0\u012b\u0129\1\0\0\0\u012b"+
		"\u012c\1\0\0\0\u012c\u012d\1\0\0\0\u012d\u012f\5\1\0\0\u012e\u0116\1\0"+
		"\0\0\u012e\u011e\1\0\0\0\u012f\5\1\0\0\0\u0130\u0135\5b\0\0\u0131\u0132"+
		"\5\4\0\0\u0132\u0134\5b\0\0\u0133\u0131\1\0\0\0\u0134\u0137\1\0\0\0\u0135"+
		"\u0133\1\0\0\0\u0135\u0136\1\0\0\0\u0136\7\1\0\0\0\u0137\u0135\1\0\0\0"+
		"\u0138\u013b\3\n\5\0\u0139\u013b\5\1\0\0\u013a\u0138\1\0\0\0\u013a\u0139"+
		"\1\0\0\0\u013b\t\1\0\0\0\u013c\u013f\3\22\t\0\u013d\u013f\3&\23\0\u013e"+
		"\u013c\1\0\0\0\u013e\u013d\1\0\0\0\u013f\13\1\0\0\0\u0140\u0142\3\16\7"+
		"\0\u0141\u0140\1\0\0\0\u0142\u0145\1\0\0\0\u0143\u0141\1\0\0\0\u0143\u0144"+
		"\1\0\0\0\u0144\r\1\0\0\0\u0145\u0143\1\0\0\0\u0146\u0153\3`\60\0\u0147"+
		"\u0153\5\b\0\0\u0148\u0153\5\t\0\0\u0149\u0153\5\n\0\0\u014a\u0153\5\f"+
		"\0\0\u014b\u0153\5\13\0\0\u014c\u0153\5\r\0\0\u014d\u0153\5\33\0\0\u014e"+
		"\u0153\5\34\0\0\u014f\u0153\5\35\0\0\u0150\u0153\5\36\0\0\u0151\u0153"+
		"\5\16\0\0\u0152\u0146\1\0\0\0\u0152\u0147\1\0\0\0\u0152\u0148\1\0\0\0"+
		"\u0152\u0149\1\0\0\0\u0152\u014a\1\0\0\0\u0152\u014b\1\0\0\0\u0152\u014c"+
		"\1\0\0\0\u0152\u014d\1\0\0\0\u0152\u014e\1\0\0\0\u0152\u014f\1\0\0\0\u0152"+
		"\u0150\1\0\0\0\u0152\u0151\1\0\0\0\u0153\17\1\0\0\0\u0154\u0156\3`\60"+
		"\0\u0155\u0154\1\0\0\0\u0156\u0159\1\0\0\0\u0157\u0155\1\0\0\0\u0157\u0158"+
		"\1\0\0\0\u0158\u015b\1\0\0\0\u0159\u0157\1\0\0\0\u015a\u015c\5\r\0\0\u015b"+
		"\u015a\1\0\0\0\u015b\u015c\1\0\0\0\u015c\u0160\1\0\0\0\u015d\u015f\3`"+
		"\60\0\u015e\u015d\1\0\0\0\u015f\u0162\1\0\0\0\u0160\u015e\1\0\0\0\u0160"+
		"\u0161\1\0\0\0\u0161\21\1\0\0\0\u0162\u0160\1\0\0\0\u0163\u0166\3\24\n"+
		"\0\u0164\u0166\3\34\16\0\u0165\u0163\1\0\0\0\u0165\u0164\1\0\0\0\u0166"+
		"\23\1\0\0\0\u0167\u0168\3\f\6\0\u0168\u0169\5\6\0\0\u0169\u016b\5b\0\0"+
		"\u016a\u016c\3\26\13\0\u016b\u016a\1\0\0\0\u016b\u016c\1\0\0\0\u016c\u016f"+
		"\1\0\0\0\u016d\u016e\5(\0\0\u016e\u0170\3D\"\0\u016f\u016d\1\0\0\0\u016f"+
		"\u0170\1\0\0\0\u0170\u0173\1\0\0\0\u0171\u0172\5\7\0\0\u0172\u0174\3*"+
		"\25\0\u0173\u0171\1\0\0\0\u0173\u0174\1\0\0\0\u0174\u0175\1\0\0\0\u0175"+
		"\u0176\3,\26\0\u0176\25\1\0\0\0\u0177\u0178\5Z\0\0\u0178\u017d\3\30\f"+
		"\0\u0179\u017a\5\17\0\0\u017a\u017c\3\30\f\0\u017b\u0179\1\0\0\0\u017c"+
		"\u017f\1\0\0\0\u017d\u017b\1\0\0\0\u017d\u017e\1\0\0\0\u017e\u0180\1\0"+
		"\0\0\u017f\u017d\1\0\0\0\u0180\u0181\5Y\0\0\u0181\27\1\0\0\0\u0182\u0185"+
		"\5b\0\0\u0183\u0184\5(\0\0\u0184\u0186\3\32\r\0\u0185\u0183\1\0\0\0\u0185"+
		"\u0186\1\0\0\0\u0186\31\1\0\0\0\u0187\u018c\3D\"\0\u0188\u0189\5L\0\0"+
		"\u0189\u018b\3D\"\0\u018a\u0188\1\0\0\0\u018b\u018e\1\0\0\0\u018c\u018a"+
		"\1\0\0\0\u018c\u018d\1\0\0\0\u018d\33\1\0\0\0\u018e\u018c\1\0\0\0\u018f"+
		"\u0190\3\f\6\0\u0190\u0191\5?\0\0\u0191\u0194\5b\0\0\u0192\u0193\5\7\0"+
		"\0\u0193\u0195\3*\25\0\u0194\u0192\1\0\0\0\u0194\u0195\1\0\0\0\u0195\u0196"+
		"\1\0\0\0\u0196\u0197\3\36\17\0\u0197\35\1\0\0\0\u0198\u019a\5\20\0\0\u0199"+
		"\u019b\3 \20\0\u019a\u0199\1\0\0\0\u019a\u019b\1\0\0\0\u019b\u019d\1\0"+
		"\0\0\u019c\u019e\5\17\0\0\u019d\u019c\1\0\0\0\u019d\u019e\1\0\0\0\u019e"+
		"\u01a0\1\0\0\0\u019f\u01a1\3$\22\0\u01a0\u019f\1\0\0\0\u01a0\u01a1\1\0"+
		"\0\0\u01a1\u01a2\1\0\0\0\u01a2\u01a3\5\21\0\0\u01a3\37\1\0\0\0\u01a4\u01a9"+
		"\3\"\21\0\u01a5\u01a6\5\17\0\0\u01a6\u01a8\3\"\21\0\u01a7\u01a5\1\0\0"+
		"\0\u01a8\u01ab\1\0\0\0\u01a9\u01a7\1\0\0\0\u01a9\u01aa\1\0\0\0\u01aa!"+
		"\1\0\0\0\u01ab\u01a9\1\0\0\0\u01ac\u01ae\3^/\0\u01ad\u01ac\1\0\0\0\u01ad"+
		"\u01ae\1\0\0\0\u01ae\u01af\1\0\0\0\u01af\u01b1\5b\0\0\u01b0\u01b2\3\u00ec"+
		"v\0\u01b1\u01b0\1\0\0\0\u01b1\u01b2\1\0\0\0\u01b2\u01b4\1\0\0\0\u01b3"+
		"\u01b5\3,\26\0\u01b4\u01b3\1\0\0\0\u01b4\u01b5\1\0\0\0\u01b5#\1\0\0\0"+
		"\u01b6\u01ba\5\1\0\0\u01b7\u01b9\3\60\30\0\u01b8\u01b7\1\0\0\0\u01b9\u01bc"+
		"\1\0\0\0\u01ba\u01b8\1\0\0\0\u01ba\u01bb\1\0\0\0\u01bb%\1\0\0\0\u01bc"+
		"\u01ba\1\0\0\0\u01bd\u01c0\3(\24\0\u01be\u01c0\3p8\0\u01bf\u01bd\1\0\0"+
		"\0\u01bf\u01be\1\0\0\0\u01c0\'\1\0\0\0\u01c1\u01c2\3\f\6\0\u01c2\u01c3"+
		"\5\27\0\0\u01c3\u01c5\5b\0\0\u01c4\u01c6\3\26\13\0\u01c5\u01c4\1\0\0\0"+
		"\u01c5\u01c6\1\0\0\0\u01c6\u01c9\1\0\0\0\u01c7\u01c8\5(\0\0\u01c8\u01ca"+
		"\3*\25\0\u01c9\u01c7\1\0\0\0\u01c9\u01ca\1\0\0\0\u01ca\u01cb\1\0\0\0\u01cb"+
		"\u01cc\3.\27\0\u01cc)\1\0\0\0\u01cd\u01d2\3D\"\0\u01ce\u01cf\5\17\0\0"+
		"\u01cf\u01d1\3D\"\0\u01d0\u01ce\1\0\0\0\u01d1\u01d4\1\0\0\0\u01d2\u01d0"+
		"\1\0\0\0\u01d2\u01d3\1\0\0\0\u01d3+\1\0\0\0\u01d4\u01d2\1\0\0\0\u01d5"+
		"\u01d9\5\20\0\0\u01d6\u01d8\3\60\30\0\u01d7\u01d6\1\0\0\0\u01d8\u01db"+
		"\1\0\0\0\u01d9\u01d7\1\0\0\0\u01d9\u01da\1\0\0\0\u01da\u01dc\1\0\0\0\u01db"+
		"\u01d9\1\0\0\0\u01dc\u01dd\5\21\0\0\u01dd-\1\0\0\0\u01de\u01e2\5\20\0"+
		"\0\u01df\u01e1\3>\37\0\u01e0\u01df\1\0\0\0\u01e1\u01e4\1\0\0\0\u01e2\u01e0"+
		"\1\0\0\0\u01e2\u01e3\1\0\0\0\u01e3\u01e5\1\0\0\0\u01e4\u01e2\1\0\0\0\u01e5"+
		"\u01e6\5\21\0\0\u01e6/\1\0\0\0\u01e7\u01ee\5\1\0\0\u01e8\u01ea\5\f\0\0"+
		"\u01e9\u01e8\1\0\0\0\u01e9\u01ea\1\0\0\0\u01ea\u01eb\1\0\0\0\u01eb\u01ee"+
		"\3x<\0\u01ec\u01ee\3\62\31\0\u01ed\u01e7\1\0\0\0\u01ed\u01e9\1\0\0\0\u01ed"+
		"\u01ec\1\0\0\0\u01ee\61\1\0\0\0\u01ef\u01f5\3\66\33\0\u01f0\u01f5\3:\35"+
		"\0\u01f1\u01f5\3\64\32\0\u01f2\u01f5\3\22\t\0\u01f3\u01f5\3&\23\0\u01f4"+
		"\u01ef\1\0\0\0\u01f4\u01f0\1\0\0\0\u01f4\u01f1\1\0\0\0\u01f4\u01f2\1\0"+
		"\0\0\u01f4\u01f3\1\0\0\0\u01f5\63\1\0\0\0\u01f6\u01f8\3\f\6\0\u01f7\u01f9"+
		"\3\26\13\0\u01f8\u01f7\1\0\0\0\u01f8\u01f9\1\0\0\0\u01f9\u01fc\1\0\0\0"+
		"\u01fa\u01fd\3D\"\0\u01fb\u01fd\5\26\0\0\u01fc\u01fa\1\0\0\0\u01fc\u01fb"+
		"\1\0\0\0\u01fd\u01fe\1\0\0\0\u01fe\u01ff\5b\0\0\u01ff\u0204\3R)\0\u0200"+
		"\u0201\5\22\0\0\u0201\u0203\5\23\0\0\u0202\u0200\1\0\0\0\u0203\u0206\1"+
		"\0\0\0\u0204\u0202\1\0\0\0\u0204\u0205\1\0\0\0\u0205\u0209\1\0\0\0\u0206"+
		"\u0204\1\0\0\0\u0207\u0208\5\31\0\0\u0208\u020a\3P(\0\u0209\u0207\1\0"+
		"\0\0\u0209\u020a\1\0\0\0\u020a\u020d\1\0\0\0\u020b\u020e\3x<\0\u020c\u020e"+
		"\5\1\0\0\u020d\u020b\1\0\0\0\u020d\u020c\1\0\0\0\u020e\65\1\0\0\0\u020f"+
		"\u0211\3\f\6\0\u0210\u0212\3\26\13\0\u0211\u0210\1\0\0\0\u0211\u0212\1"+
		"\0\0\0\u0212\u0213\1\0\0\0\u0213\u0214\5b\0\0\u0214\u0217\3R)\0\u0215"+
		"\u0216\5\31\0\0\u0216\u0218\3P(\0\u0217\u0215\1\0\0\0\u0217\u0218\1\0"+
		"\0\0\u0218\u0219\1\0\0\0\u0219\u021a\38\34\0\u021a\67\1\0\0\0\u021b\u021d"+
		"\5\20\0\0\u021c\u021e\3Z-\0\u021d\u021c\1\0\0\0\u021d\u021e\1\0\0\0\u021e"+
		"\u0222\1\0\0\0\u021f\u0221\3z=\0\u0220\u021f\1\0\0\0\u0221\u0224\1\0\0"+
		"\0\u0222\u0220\1\0\0\0\u0222\u0223\1\0\0\0\u0223\u0225\1\0\0\0\u0224\u0222"+
		"\1\0\0\0\u0225\u0226\5\21\0\0\u02269\1\0\0\0\u0227\u0228\3\f\6\0\u0228"+
		"\u0229\3D\"\0\u0229\u022e\3<\36\0\u022a\u022b\5\17\0\0\u022b\u022d\3<"+
		"\36\0\u022c\u022a\1\0\0\0\u022d\u0230\1\0\0\0\u022e\u022c\1\0\0\0\u022e"+
		"\u022f\1\0\0\0\u022f\u0231\1\0\0\0\u0230\u022e\1\0\0\0\u0231\u0232\5\1"+
		"\0\0\u0232;\1\0\0\0\u0233\u0238\5b\0\0\u0234\u0235\5\22\0\0\u0235\u0237"+
		"\5\23\0\0\u0236\u0234\1\0\0\0\u0237\u023a\1\0\0\0\u0238\u0236\1\0\0\0"+
		"\u0238\u0239\1\0\0\0\u0239\u023d\1\0\0\0\u023a\u0238\1\0\0\0\u023b\u023c"+
		"\5\32\0\0\u023c\u023e\3\u00e0p\0\u023d\u023b\1\0\0\0\u023d\u023e\1\0\0"+
		"\0\u023e=\1\0\0\0\u023f\u0245\3B!\0\u0240\u0245\3@ \0\u0241\u0245\3&\23"+
		"\0\u0242\u0245\3\22\t\0\u0243\u0245\5\1\0\0\u0244\u023f\1\0\0\0\u0244"+
		"\u0240\1\0\0\0\u0244\u0241\1\0\0\0\u0244\u0242\1\0\0\0\u0244\u0243\1\0"+
		"\0\0\u0245?\1\0\0\0\u0246\u0248\3\f\6\0\u0247\u0249\3\26\13\0\u0248\u0247"+
		"\1\0\0\0\u0248\u0249\1\0\0\0\u0249\u024c\1\0\0\0\u024a\u024d\3D\"\0\u024b"+
		"\u024d\5\26\0\0\u024c\u024a\1\0\0\0\u024c\u024b\1\0\0\0\u024d\u024e\1"+
		"\0\0\0\u024e\u024f\5b\0\0\u024f\u0254\3R)\0\u0250\u0251\5\22\0\0\u0251"+
		"\u0253\5\23\0\0\u0252\u0250\1\0\0\0\u0253\u0256\1\0\0\0\u0254\u0252\1"+
		"\0\0\0\u0254\u0255\1\0\0\0\u0255\u0259\1\0\0\0\u0256\u0254\1\0\0\0\u0257"+
		"\u0258\5\31\0\0\u0258\u025a\3P(\0\u0259\u0257\1\0\0\0\u0259\u025a\1\0"+
		"\0\0\u025a\u025b\1\0\0\0\u025b\u025c\5\1\0\0\u025cA\1\0\0\0\u025d\u025e"+
		"\3\f\6\0\u025e\u025f\3D\"\0\u025f\u0264\3<\36\0\u0260\u0261\5\17\0\0\u0261"+
		"\u0263\3<\36\0\u0262\u0260\1\0\0\0\u0263\u0266\1\0\0\0\u0264\u0262\1\0"+
		"\0\0\u0264\u0265\1\0\0\0\u0265\u0267\1\0\0\0\u0266\u0264\1\0\0\0\u0267"+
		"\u0268\5\1\0\0\u0268C\1\0\0\0\u0269\u026e\3F#\0\u026a\u026b\5\22\0\0\u026b"+
		"\u026d\5\23\0\0\u026c\u026a\1\0\0\0\u026d\u0270\1\0\0\0\u026e\u026c\1"+
		"\0\0\0\u026e\u026f\1\0\0\0\u026f\u027a\1\0\0\0\u0270\u026e\1\0\0\0\u0271"+
		"\u0276\3J%\0\u0272\u0273\5\22\0\0\u0273\u0275\5\23\0\0\u0274\u0272\1\0"+
		"\0\0\u0275\u0278\1\0\0\0\u0276\u0274\1\0\0\0\u0276\u0277\1\0\0\0\u0277"+
		"\u027a\1\0\0\0\u0278\u0276\1\0\0\0\u0279\u0269\1\0\0\0\u0279\u0271\1\0"+
		"\0\0\u027aE\1\0\0\0\u027b\u0280\3H$\0\u027c\u027d\5\4\0\0\u027d\u027f"+
		"\3H$\0\u027e\u027c\1\0\0\0\u027f\u0282\1\0\0\0\u0280\u027e\1\0\0\0\u0280"+
		"\u0281\1\0\0\0\u0281G\1\0\0\0\u0282\u0280\1\0\0\0\u0283\u0285\5b\0\0\u0284"+
		"\u0286\3L&\0\u0285\u0284\1\0\0\0\u0285\u0286\1\0\0\0\u0286I\1\0\0\0\u0287"+
		"\u0288\7\0\0\0\u0288K\1\0\0\0\u0289\u028a\5Z\0\0\u028a\u028f\3N\'\0\u028b"+
		"\u028c\5\17\0\0\u028c\u028e\3N\'\0\u028d\u028b\1\0\0\0\u028e\u0291\1\0"+
		"\0\0\u028f\u028d\1\0\0\0\u028f\u0290\1\0\0\0\u0290\u0292\1\0\0\0\u0291"+
		"\u028f\1\0\0\0\u0292\u0293\5Y\0\0\u0293\u0297\1\0\0\0\u0294\u0295\5Z\0"+
		"\0\u0295\u0297\5Y\0\0\u0296\u0289\1\0\0\0\u0296\u0294\1\0\0\0\u0297M\1"+
		"\0\0\0\u0298\u029f\3D\"\0\u0299\u029c\5\'\0\0\u029a\u029b\7\1\0\0\u029b"+
		"\u029d\3D\"\0\u029c\u029a\1\0\0\0\u029c\u029d\1\0\0\0\u029d\u029f\1\0"+
		"\0\0\u029e\u0298\1\0\0\0\u029e\u0299\1\0\0\0\u029fO\1\0\0\0\u02a0\u02a5"+
		"\3\\.\0\u02a1\u02a2\5\17\0\0\u02a2\u02a4\3\\.\0\u02a3\u02a1\1\0\0\0\u02a4"+
		"\u02a7\1\0\0\0\u02a5\u02a3\1\0\0\0\u02a5\u02a6\1\0\0\0\u02a6Q\1\0\0\0"+
		"\u02a7\u02a5\1\0\0\0\u02a8\u02aa\5\24\0\0\u02a9\u02ab\3T*\0\u02aa\u02a9"+
		"\1\0\0\0\u02aa\u02ab\1\0\0\0\u02ab\u02ac\1\0\0\0\u02ac\u02ad\5\25\0\0"+
		"\u02adS\1\0\0\0\u02ae\u02af\3X,\0\u02af\u02b0\6*\uffff\0\u02b0\u02c6\1"+
		"\0\0\0\u02b1\u02b6\3V+\0\u02b2\u02b3\5\17\0\0\u02b3\u02b5\3V+\0\u02b4"+
		"\u02b2\1\0\0\0\u02b5\u02b8\1\0\0\0\u02b6\u02b4\1\0\0\0\u02b6\u02b7\1\0"+
		"\0\0\u02b7\u02b9\1\0\0\0\u02b8\u02b6\1\0\0\0\u02b9\u02ba\6*\uffff\0\u02ba"+
		"\u02c6\1\0\0\0\u02bb\u02bc\3V+\0\u02bc\u02bd\5\17\0\0\u02bd\u02bf\1\0"+
		"\0\0\u02be\u02bb\1\0\0\0\u02bf\u02c0\1\0\0\0\u02c0\u02be\1\0\0\0\u02c0"+
		"\u02c1\1\0\0\0\u02c1\u02c2\1\0\0\0\u02c2\u02c3\3X,\0\u02c3\u02c4\6*\uffff"+
		"\0\u02c4\u02c6\1\0\0\0\u02c5\u02ae\1\0\0\0\u02c5\u02b1\1\0\0\0\u02c5\u02be"+
		"\1\0\0\0\u02c6U\1\0\0\0\u02c7\u02c8\3\20\b\0\u02c8\u02c9\3D\"\0\u02c9"+
		"\u02ce\5b\0\0\u02ca\u02cb\5\22\0\0\u02cb\u02cd\5\23\0\0\u02cc\u02ca\1"+
		"\0\0\0\u02cd\u02d0\1\0\0\0\u02ce\u02cc\1\0\0\0\u02ce\u02cf\1\0\0\0\u02cf"+
		"W\1\0\0\0\u02d0\u02ce\1\0\0\0\u02d1\u02d2\3\20\b\0\u02d2\u02d3\3D\"\0"+
		"\u02d3\u02d4\5)\0\0\u02d4\u02d5\5b\0\0\u02d5Y\1\0\0\0\u02d6\u02d8\3\u00ea"+
		"u\0\u02d7\u02d6\1\0\0\0\u02d7\u02d8\1\0\0\0\u02d8\u02d9\1\0\0\0\u02d9"+
		"\u02da\7\2\0\0\u02da\u02db\3\u00ecv\0\u02db\u02dc\5\1\0\0\u02dc\u02e7"+
		"\1\0\0\0\u02dd\u02de\3\u00d2i\0\u02de\u02e0\5\4\0\0\u02df\u02e1\3\u00ea"+
		"u\0\u02e0\u02df\1\0\0\0\u02e0\u02e1\1\0\0\0\u02e1\u02e2\1\0\0\0\u02e2"+
		"\u02e3\5+\0\0\u02e3\u02e4\3\u00ecv\0\u02e4\u02e5\5\1\0\0\u02e5\u02e7\1"+
		"\0\0\0\u02e6\u02d7\1\0\0\0\u02e6\u02dd\1\0\0\0\u02e7[\1\0\0\0\u02e8\u02ed"+
		"\5b\0\0\u02e9\u02ea\5\4\0\0\u02ea\u02ec\5b\0\0\u02eb\u02e9\1\0\0\0\u02ec"+
		"\u02ef\1\0\0\0\u02ed\u02eb\1\0\0\0\u02ed\u02ee\1\0\0\0\u02ee]\1\0\0\0"+
		"\u02ef\u02ed\1\0\0\0\u02f0\u02f2\3`\60\0\u02f1\u02f0\1\0\0\0\u02f2\u02f3"+
		"\1\0\0\0\u02f3\u02f1\1\0\0\0\u02f3\u02f4\1\0\0\0\u02f4_\1\0\0\0\u02f5"+
		"\u02f9\3b\61\0\u02f6\u02f9\3d\62\0\u02f7\u02f9\3f\63\0\u02f8\u02f5\1\0"+
		"\0\0\u02f8\u02f6\1\0\0\0\u02f8\u02f7\1\0\0\0\u02f9a\1\0\0\0\u02fa\u02fb"+
		"\5/\0\0\u02fb\u02fc\3\\.\0\u02fcc\1\0\0\0\u02fd\u02fe\5/\0\0\u02fe\u02ff"+
		"\3\\.\0\u02ff\u0300\5\24\0\0\u0300\u0301\3l\66\0\u0301\u0302\5\25\0\0"+
		"\u0302e\1\0\0\0\u0303\u0304\5/\0\0\u0304\u0305\3\\.\0\u0305\u0307\5\24"+
		"\0\0\u0306\u0308\3h\64\0\u0307\u0306\1\0\0\0\u0307\u0308\1\0\0\0\u0308"+
		"\u0309\1\0\0\0\u0309\u030a\5\25\0\0\u030ag\1\0\0\0\u030b\u0310\3j\65\0"+
		"\u030c\u030d\5\17\0\0\u030d\u030f\3j\65\0\u030e\u030c\1\0\0\0\u030f\u0312"+
		"\1\0\0\0\u0310\u030e\1\0\0\0\u0310\u0311\1\0\0\0\u0311i\1\0\0\0\u0312"+
		"\u0310\1\0\0\0\u0313\u0314\5b\0\0\u0314\u0315\5\32\0\0\u0315\u0316\3l"+
		"\66\0\u0316k\1\0\0\0\u0317\u031b\3\u00aaU\0\u0318\u031b\3`\60\0\u0319"+
		"\u031b\3n\67\0\u031a\u0317\1\0\0\0\u031a\u0318\1\0\0\0\u031a\u0319\1\0"+
		"\0\0\u031bm\1\0\0\0\u031c\u0325\5\20\0\0\u031d\u0322\3l\66\0\u031e\u031f"+
		"\5\17\0\0\u031f\u0321\3l\66\0\u0320\u031e\1\0\0\0\u0321\u0324\1\0\0\0"+
		"\u0322\u0320\1\0\0\0\u0322\u0323\1\0\0\0\u0323\u0326\1\0\0\0\u0324\u0322"+
		"\1\0\0\0\u0325\u031d\1\0\0\0\u0325\u0326\1\0\0\0\u0326\u0328\1\0\0\0\u0327"+
		"\u0329\5\17\0\0\u0328\u0327\1\0\0\0\u0328\u0329\1\0\0\0\u0329\u032a\1"+
		"\0\0\0\u032a\u032b\5\21\0\0\u032bo\1\0\0\0\u032c\u032d\3\f\6\0\u032d\u032e"+
		"\5/\0\0\u032e\u032f\5\27\0\0\u032f\u0330\5b\0\0\u0330\u0331\3r9\0\u0331"+
		"q\1\0\0\0\u0332\u0336\5\20\0\0\u0333\u0335\3t:\0\u0334\u0333\1\0\0\0\u0335"+
		"\u0338\1\0\0\0\u0336\u0334\1\0\0\0\u0336\u0337\1\0\0\0\u0337\u0339\1\0"+
		"\0\0\u0338\u0336\1\0\0\0\u0339\u033a\5\21\0\0\u033as\1\0\0\0\u033b\u0343"+
		"\3v;\0\u033c\u0343\3B!\0\u033d\u0343\3\24\n\0\u033e\u0343\3(\24\0\u033f"+
		"\u0343\3\34\16\0\u0340\u0343\3p8\0\u0341\u0343\5\1\0\0\u0342\u033b\1\0"+
		"\0\0\u0342\u033c\1\0\0\0\u0342\u033d\1\0\0\0\u0342\u033e\1\0\0\0\u0342"+
		"\u033f\1\0\0\0\u0342\u0340\1\0\0\0\u0342\u0341\1\0\0\0\u0343u\1\0\0\0"+
		"\u0344\u0345\3\f\6\0\u0345\u0346\3D\"\0\u0346\u0347\5b\0\0\u0347\u0348"+
		"\5\24\0\0\u0348\u034b\5\25\0\0\u0349\u034a\5\60\0\0\u034a\u034c\3l\66"+
		"\0\u034b\u0349\1\0\0\0\u034b\u034c\1\0\0\0\u034c\u034d\1\0\0\0\u034d\u034e"+
		"\5\1\0\0\u034ew\1\0\0\0\u034f\u0353\5\20\0\0\u0350\u0352\3z=\0\u0351\u0350"+
		"\1\0\0\0\u0352\u0355\1\0\0\0\u0353\u0351\1\0\0\0\u0353\u0354\1\0\0\0\u0354"+
		"\u0356\1\0\0\0\u0355\u0353\1\0\0\0\u0356\u0357\5\21\0\0\u0357y\1\0\0\0"+
		"\u0358\u035c\3|>\0\u0359\u035c\3\n\5\0\u035a\u035c\3\u0080@\0\u035b\u0358"+
		"\1\0\0\0\u035b\u0359\1\0\0\0\u035b\u035a\1\0\0\0\u035c{\1\0\0\0\u035d"+
		"\u035e\3~?\0\u035e\u035f\5\1\0\0\u035f}\1\0\0\0\u0360\u0361\3\20\b\0\u0361"+
		"\u0362\3D\"\0\u0362\u0367\3<\36\0\u0363\u0364\5\17\0\0\u0364\u0366\3<"+
		"\36\0\u0365\u0363\1\0\0\0\u0366\u0369\1\0\0\0\u0367\u0365\1\0\0\0\u0367"+
		"\u0368\1\0\0\0\u0368\177\1\0\0\0\u0369\u0367\1\0\0\0\u036a\u03ab\3x<\0"+
		"\u036b\u036c\5@\0\0\u036c\u036f\3\u00a6S\0\u036d\u036e\5\61\0\0\u036e"+
		"\u0370\3\u00a6S\0\u036f\u036d\1\0\0\0\u036f\u0370\1\0\0\0\u0370\u0371"+
		"\1\0\0\0\u0371\u0372\5\1\0\0\u0372\u03ab\1\0\0\0\u0373\u0374\5\62\0\0"+
		"\u0374\u0375\3\u00a2Q\0\u0375\u0378\3\u0080@\0\u0376\u0377\5\63\0\0\u0377"+
		"\u0379\3\u0080@\0\u0378\u0376\1\0\0\0\u0378\u0379\1\0\0\0\u0379\u03ab"+
		"\1\0\0\0\u037a\u03ab\3\u009aM\0\u037b\u037c\5\65\0\0\u037c\u037d\3\u00a2"+
		"Q\0\u037d\u037e\3\u0080@\0\u037e\u03ab\1\0\0\0\u037f\u0380\5\66\0\0\u0380"+
		"\u0381\3\u0080@\0\u0381\u0382\5\65\0\0\u0382\u0383\3\u00a2Q\0\u0383\u0384"+
		"\5\1\0\0\u0384\u03ab\1\0\0\0\u0385\u03ab\3\u008aE\0\u0386\u0387\59\0\0"+
		"\u0387\u0388\3\u00a2Q\0\u0388\u0389\5\20\0\0\u0389\u038a\3\u0084B\0\u038a"+
		"\u038b\5\21\0\0\u038b\u03ab\1\0\0\0\u038c\u038d\5\34\0\0\u038d\u038e\3"+
		"\u00a2Q\0\u038e\u038f\3x<\0\u038f\u03ab\1\0\0\0\u0390\u0392\5:\0\0\u0391"+
		"\u0393\3\u00a6S\0\u0392\u0391\1\0\0\0\u0392\u0393\1\0\0\0\u0393\u0394"+
		"\1\0\0\0\u0394\u03ab\5\1\0\0\u0395\u0396\5\30\0\0\u0396\u0397\3\u00a6"+
		"S\0\u0397\u0398\5\1\0\0\u0398\u03ab\1\0\0\0\u0399\u039b\5;\0\0\u039a\u039c"+
		"\5b\0\0\u039b\u039a\1\0\0\0\u039b\u039c\1\0\0\0\u039c\u039d\1\0\0\0\u039d"+
		"\u03ab\5\1\0\0\u039e\u03a0\5<\0\0\u039f\u03a1\5b\0\0\u03a0\u039f\1\0\0"+
		"\0\u03a0\u03a1\1\0\0\0\u03a1\u03a2\1\0\0\0\u03a2\u03ab\5\1\0\0\u03a3\u03a4"+
		"\3\u00a6S\0\u03a4\u03a5\5\1\0\0\u03a5\u03ab\1\0\0\0\u03a6\u03a7\5b\0\0"+
		"\u03a7\u03a8\5\61\0\0\u03a8\u03ab\3\u0080@\0\u03a9\u03ab\3\u0082A\0\u03aa"+
		"\u036a\1\0\0\0\u03aa\u036b\1\0\0\0\u03aa\u0373\1\0\0\0\u03aa\u037a\1\0"+
		"\0\0\u03aa\u037b\1\0\0\0\u03aa\u037f\1\0\0\0\u03aa\u0385\1\0\0\0\u03aa"+
		"\u0386\1\0\0\0\u03aa\u038c\1\0\0\0\u03aa\u0390\1\0\0\0\u03aa\u0395\1\0"+
		"\0\0\u03aa\u0399\1\0\0\0\u03aa\u039e\1\0\0\0\u03aa\u03a3\1\0\0\0\u03aa"+
		"\u03a6\1\0\0\0\u03aa\u03a9\1\0\0\0\u03ab\u0081\1\0\0\0\u03ac\u03ad\5\1"+
		"\0\0\u03ad\u0083\1\0\0\0\u03ae\u03b0\3\u0086C\0\u03af\u03ae\1\0\0\0\u03b0"+
		"\u03b3\1\0\0\0\u03b1\u03af\1\0\0\0\u03b1\u03b2\1\0\0\0\u03b2\u0085\1\0"+
		"\0\0\u03b3\u03b1\1\0\0\0\u03b4\u03b8\3\u0088D\0\u03b5\u03b7\3z=\0\u03b6"+
		"\u03b5\1\0\0\0\u03b7\u03ba\1\0\0\0\u03b8\u03b6\1\0\0\0\u03b8\u03b9\1\0"+
		"\0\0\u03b9\u0087\1\0\0\0\u03ba\u03b8\1\0\0\0\u03bb\u03bc\5>\0\0\u03bc"+
		"\u03bd\3\u00a6S\0\u03bd\u03be\5\61\0\0\u03be\u03c2\1\0\0\0\u03bf\u03c0"+
		"\5\60\0\0\u03c0\u03c2\5\61\0\0\u03c1\u03bb\1\0\0\0\u03c1\u03bf\1\0\0\0"+
		"\u03c2\u0089\1\0\0\0\u03c3\u03c4\5\67\0\0\u03c4\u03c5\3x<\0\u03c5\u03c6"+
		"\6E\uffff\0\u03c6\u03dd\1\0\0\0\u03c7\u03c8\5\67\0\0\u03c8\u03c9\3x<\0"+
		"\u03c9\u03ca\3\u0094J\0\u03ca\u03cb\58\0\0\u03cb\u03cc\3x<\0\u03cc\u03cd"+
		"\6E\uffff\0\u03cd\u03dd\1\0\0\0\u03ce\u03cf\5\67\0\0\u03cf\u03d0\3x<\0"+
		"\u03d0\u03d1\3\u0094J\0\u03d1\u03d2\6E\uffff\0\u03d2\u03dd\1\0\0\0\u03d3"+
		"\u03d4\5\67\0\0\u03d4\u03d5\3x<\0\u03d5\u03d6\58\0\0\u03d6\u03d7\3x<\0"+
		"\u03d7\u03d8\6E\uffff\0\u03d8\u03dd\1\0\0\0\u03d9\u03da\3\u008cF\0\u03da"+
		"\u03db\6E\uffff\0\u03db\u03dd\1\0\0\0\u03dc\u03c3\1\0\0\0\u03dc\u03c7"+
		"\1\0\0\0\u03dc\u03ce\1\0\0\0\u03dc\u03d3\1\0\0\0\u03dc\u03d9\1\0\0\0\u03dd"+
		"\u008b\1\0\0\0\u03de\u03df\5\67\0\0\u03df\u03e0\3\u008eG\0\u03e0\u03e2"+
		"\3x<\0\u03e1\u03e3\3\u0094J\0\u03e2\u03e1\1\0\0\0\u03e2\u03e3\1\0\0\0"+
		"\u03e3\u03e6\1\0\0\0\u03e4\u03e5\58\0\0\u03e5\u03e7\3x<\0\u03e6\u03e4"+
		"\1\0\0\0\u03e6\u03e7\1\0\0\0\u03e7\u008d\1\0\0\0\u03e8\u03e9\5\24\0\0"+
		"\u03e9\u03eb\3\u0090H\0\u03ea\u03ec\5\1\0\0\u03eb\u03ea\1\0\0\0\u03eb"+
		"\u03ec\1\0\0\0\u03ec\u03ed\1\0\0\0\u03ed\u03ee\5\25\0\0\u03ee\u008f\1"+
		"\0\0\0\u03ef\u03f4\3\u0092I\0\u03f0\u03f1\5\1\0\0\u03f1\u03f3\3\u0092"+
		"I\0\u03f2\u03f0\1\0\0\0\u03f3\u03f6\1\0\0\0\u03f4\u03f2\1\0\0\0\u03f4"+
		"\u03f5\1\0\0\0\u03f5\u0091\1\0\0\0\u03f6\u03f4\1\0\0\0\u03f7\u03f9\3\20"+
		"\b\0\u03f8\u03f7\1\0\0\0\u03f8\u03f9\1\0\0\0\u03f9\u03fa\1\0\0\0\u03fa"+
		"\u03fb\3D\"\0\u03fb\u03fc\5b\0\0\u03fc\u03fd\5\32\0\0\u03fd\u03fe\3\u00a6"+
		"S\0\u03fe\u0093\1\0\0\0\u03ff\u0403\3\u0096K\0\u0400\u0402\3\u0096K\0"+
		"\u0401\u0400\1\0\0\0\u0402\u0405\1\0\0\0\u0403\u0401\1\0\0\0\u0403\u0404"+
		"\1\0\0\0\u0404\u0095\1\0\0\0\u0405\u0403\1\0\0\0\u0406\u0407\5=\0\0\u0407"+
		"\u0408\5\24\0\0\u0408\u0409\3\u0098L\0\u0409\u040a\5\25\0\0\u040a\u040b"+
		"\3x<\0\u040b\u0097\1\0\0\0\u040c\u040d\3\20\b\0\u040d\u0412\3D\"\0\u040e"+
		"\u040f\5N\0\0\u040f\u0411\3D\"\0\u0410\u040e\1\0\0\0\u0411\u0414\1\0\0"+
		"\0\u0412\u0410\1\0\0\0\u0412\u0413\1\0\0\0\u0413\u0415\1\0\0\0\u0414\u0412"+
		"\1\0\0\0\u0415\u041a\5b\0\0\u0416\u0417\5\22\0\0\u0417\u0419\5\23\0\0"+
		"\u0418\u0416\1\0\0\0\u0419\u041c\1\0\0\0\u041a\u0418\1\0\0\0\u041a\u041b"+
		"\1\0\0\0\u041b\u0099\1\0\0\0\u041c\u041a\1\0\0\0\u041d\u0420\3\u009cN"+
		"\0\u041e\u0420\3\u009eO\0\u041f\u041d\1\0\0\0\u041f\u041e\1\0\0\0\u0420"+
		"\u009b\1\0\0\0\u0421\u0422\5\64\0\0\u0422\u0423\5\24\0\0\u0423\u0424\3"+
		"\20\b\0\u0424\u0425\3D\"\0\u0425\u0426\5b\0\0\u0426\u0427\5\61\0\0\u0427"+
		"\u0428\3\u00a6S\0\u0428\u0429\5\25\0\0\u0429\u042a\3\u0080@\0\u042a\u009d"+
		"\1\0\0\0\u042b\u042c\5\64\0\0\u042c\u042e\5\24\0\0\u042d\u042f\3\u00a0"+
		"P\0\u042e\u042d\1\0\0\0\u042e\u042f\1\0\0\0\u042f\u0430\1\0\0\0\u0430"+
		"\u0432\5\1\0\0\u0431\u0433\3\u00a6S\0\u0432\u0431\1\0\0\0\u0432\u0433"+
		"\1\0\0\0\u0433\u0434\1\0\0\0\u0434\u0436\5\1\0\0\u0435\u0437\3\u00a4R"+
		"\0\u0436\u0435\1\0\0\0\u0436\u0437\1\0\0\0\u0437\u0438\1\0\0\0\u0438\u0439"+
		"\5\25\0\0\u0439\u043a\3\u0080@\0\u043a\u009f\1\0\0\0\u043b\u043e\3~?\0"+
		"\u043c\u043e\3\u00a4R\0\u043d\u043b\1\0\0\0\u043d\u043c\1\0\0\0\u043e"+
		"\u00a1\1\0\0\0\u043f\u0440\5\24\0\0\u0440\u0441\3\u00a6S\0\u0441\u0442"+
		"\5\25\0\0\u0442\u00a3\1\0\0\0\u0443\u0448\3\u00a6S\0\u0444\u0445\5\17"+
		"\0\0\u0445\u0447\3\u00a6S\0\u0446\u0444\1\0\0\0\u0447\u044a\1\0\0\0\u0448"+
		"\u0446\1\0\0\0\u0448\u0449\1\0\0\0\u0449\u00a5\1\0\0\0\u044a\u0448\1\0"+
		"\0\0\u044b\u044f\3\u00aaU\0\u044c\u044d\3\u00a8T\0\u044d\u044e\3\u00a6"+
		"S\0\u044e\u0450\1\0\0\0\u044f\u044c\1\0\0\0\u044f\u0450\1\0\0\0\u0450"+
		"\u00a7\1\0\0\0\u0451\u0452\5\32\0\0\u0452\u0471\6T\uffff\0\u0453\u0454"+
		"\5R\0\0\u0454\u0471\6T\uffff\0\u0455\u0456\5S\0\0\u0456\u0471\6T\uffff"+
		"\0\u0457\u0458\5T\0\0\u0458\u0471\6T\uffff\0\u0459\u045a\5U\0\0\u045a"+
		"\u0471\6T\uffff\0\u045b\u045c\5V\0\0\u045c\u0471\6T\uffff\0\u045d\u045e"+
		"\5W\0\0\u045e\u0471\6T\uffff\0\u045f\u0460\5Q\0\0\u0460\u0471\6T\uffff"+
		"\0\u0461\u0462\5X\0\0\u0462\u0471\6T\uffff\0\u0463\u0464\5Z\0\0\u0464"+
		"\u0465\5Z\0\0\u0465\u0466\5\32\0\0\u0466\u0471\6T\uffff\0\u0467\u0468"+
		"\5Y\0\0\u0468\u0469\5Y\0\0\u0469\u046a\5Y\0\0\u046a\u046b\5\32\0\0\u046b"+
		"\u0471\6T\uffff\0\u046c\u046d\5Y\0\0\u046d\u046e\5Y\0\0\u046e\u046f\5"+
		"\32\0\0\u046f\u0471\6T\uffff\0\u0470\u0451\1\0\0\0\u0470\u0453\1\0\0\0"+
		"\u0470\u0455\1\0\0\0\u0470\u0457\1\0\0\0\u0470\u0459\1\0\0\0\u0470\u045b"+
		"\1\0\0\0\u0470\u045d\1\0\0\0\u0470\u045f\1\0\0\0\u0470\u0461\1\0\0\0\u0470"+
		"\u0463\1\0\0\0\u0470\u0467\1\0\0\0\u0470\u046c\1\0\0\0\u0471\u00a9\1\0"+
		"\0\0\u0472\u0478\3\u00acV\0\u0473\u0474\5\'\0\0\u0474\u0475\3\u00a6S\0"+
		"\u0475\u0476\5\61\0\0\u0476\u0477\3\u00aaU\0\u0477\u0479\1\0\0\0\u0478"+
		"\u0473\1\0\0\0\u0478\u0479\1\0\0\0\u0479\u00ab\1\0\0\0\u047a\u047f\3\u00ae"+
		"W\0\u047b\u047c\5P\0\0\u047c\u047e\3\u00aeW\0\u047d\u047b\1\0\0\0\u047e"+
		"\u0481\1\0\0\0\u047f\u047d\1\0\0\0\u047f\u0480\1\0\0\0\u0480\u00ad\1\0"+
		"\0\0\u0481\u047f\1\0\0\0\u0482\u0487\3\u00b0X\0\u0483\u0484\5O\0\0\u0484"+
		"\u0486\3\u00b0X\0\u0485\u0483\1\0\0\0\u0486\u0489\1\0\0\0\u0487\u0485"+
		"\1\0\0\0\u0487\u0488\1\0\0\0\u0488\u00af\1\0\0\0\u0489\u0487\1\0\0\0\u048a"+
		"\u048f\3\u00b2Y\0\u048b\u048c\5N\0\0\u048c\u048e\3\u00b2Y\0\u048d\u048b"+
		"\1\0\0\0\u048e\u0491\1\0\0\0\u048f\u048d\1\0\0\0\u048f\u0490\1\0\0\0\u0490"+
		"\u00b1\1\0\0\0\u0491\u048f\1\0\0\0\u0492\u0497\3\u00b4Z\0\u0493\u0494"+
		"\5M\0\0\u0494\u0496\3\u00b4Z\0\u0495\u0493\1\0\0\0\u0496\u0499\1\0\0\0"+
		"\u0497\u0495\1\0\0\0\u0497\u0498\1\0\0\0\u0498\u00b3\1\0\0\0\u0499\u0497"+
		"\1\0\0\0\u049a\u049f\3\u00b6[\0\u049b\u049c\5L\0\0\u049c\u049e\3\u00b6"+
		"[\0\u049d\u049b\1\0\0\0\u049e\u04a1\1\0\0\0\u049f\u049d\1\0\0\0\u049f"+
		"\u04a0\1\0\0\0\u04a0\u00b5\1\0\0\0\u04a1\u049f\1\0\0\0\u04a2\u04a7\3\u00b8"+
		"\\\0\u04a3\u04a4\5J\0\0\u04a4\u04a6\3\u00b8\\\0\u04a5\u04a3\1\0\0\0\u04a6"+
		"\u04a9\1\0\0\0\u04a7\u04a5\1\0\0\0\u04a7\u04a8\1\0\0\0\u04a8\u00b7\1\0"+
		"\0\0\u04a9\u04a7\1\0\0\0\u04aa\u04af\3\u00ba]\0\u04ab\u04ac\5K\0\0\u04ac"+
		"\u04ae\3\u00ba]\0\u04ad\u04ab\1\0\0\0\u04ae\u04b1\1\0\0\0\u04af\u04ad"+
		"\1\0\0\0\u04af\u04b0\1\0\0\0\u04b0\u00b9\1\0\0\0\u04b1\u04af\1\0\0\0\u04b2"+
		"\u04b5\3\u00bc^\0\u04b3\u04b4\5[\0\0\u04b4\u04b6\3D\"\0\u04b5\u04b3\1"+
		"\0\0\0\u04b5\u04b6\1\0\0\0\u04b6\u00bb\1\0\0\0\u04b7\u04bd\3\u00c0`\0"+
		"\u04b8\u04b9\3\u00be_\0\u04b9\u04ba\3\u00c0`\0\u04ba\u04bc\1\0\0\0\u04bb"+
		"\u04b8\1\0\0\0\u04bc\u04bf\1\0\0\0\u04bd\u04bb\1\0\0\0\u04bd\u04be\1\0"+
		"\0\0\u04be\u00bd\1\0\0\0\u04bf\u04bd\1\0\0\0\u04c0\u04c1\5Z\0\0\u04c1"+
		"\u04c2\5\32\0\0\u04c2\u04cb\6_\uffff\0\u04c3\u04c4\5Y\0\0\u04c4\u04c5"+
		"\5\32\0\0\u04c5\u04cb\6_\uffff\0\u04c6\u04c7\5Z\0\0\u04c7\u04cb\6_\uffff"+
		"\0\u04c8\u04c9\5Y\0\0\u04c9\u04cb\6_\uffff\0\u04ca\u04c0\1\0\0\0\u04ca"+
		"\u04c3\1\0\0\0\u04ca\u04c6\1\0\0\0\u04ca\u04c8\1\0\0\0\u04cb\u00bf\1\0"+
		"\0\0\u04cc\u04d2\3\u00c4b\0\u04cd\u04ce\3\u00c2a\0\u04ce\u04cf\3\u00c4"+
		"b\0\u04cf\u04d1\1\0\0\0\u04d0\u04cd\1\0\0\0\u04d1\u04d4\1\0\0\0\u04d2"+
		"\u04d0\1\0\0\0\u04d2\u04d3\1\0\0\0\u04d3\u00c1\1\0\0\0\u04d4\u04d2\1\0"+
		"\0\0\u04d5\u04d6\5Z\0\0\u04d6\u04d7\5Z\0\0\u04d7\u04e0\6a\uffff\0\u04d8"+
		"\u04d9\5Y\0\0\u04d9\u04da\5Y\0\0\u04da\u04db\5Y\0\0\u04db\u04e0\6a\uffff"+
		"\0\u04dc\u04dd\5Y\0\0\u04dd\u04de\5Y\0\0\u04de\u04e0\6a\uffff\0\u04df"+
		"\u04d5\1\0\0\0\u04df\u04d8\1\0\0\0\u04df\u04dc\1\0\0\0\u04e0\u00c3\1\0"+
		"\0\0\u04e1\u04e7\3\u00c8d\0\u04e2\u04e3\3\u00c6c\0\u04e3\u04e4\3\u00c8"+
		"d\0\u04e4\u04e6\1\0\0\0\u04e5\u04e2\1\0\0\0\u04e6\u04e9\1\0\0\0\u04e7"+
		"\u04e5\1\0\0\0\u04e7\u04e8\1\0\0\0\u04e8\u00c5\1\0\0\0\u04e9\u04e7\1\0"+
		"\0\0\u04ea\u04eb\5H\0\0\u04eb\u04ef\6c\uffff\0\u04ec\u04ed\5I\0\0\u04ed"+
		"\u04ef\6c\uffff\0\u04ee\u04ea\1\0\0\0\u04ee\u04ec\1\0\0\0\u04ef\u00c7"+
		"\1\0\0\0\u04f0\u04f6\3\u00ccf\0\u04f1\u04f2\3\u00cae\0\u04f2\u04f3\3\u00cc"+
		"f\0\u04f3\u04f5\1\0\0\0\u04f4\u04f1\1\0\0\0\u04f5\u04f8\1\0\0\0\u04f6"+
		"\u04f4\1\0\0\0\u04f6\u04f7\1\0\0\0\u04f7\u00c9\1\0\0\0\u04f8\u04f6\1\0"+
		"\0\0\u04f9\u04fa\5\5\0\0\u04fa\u0500\6e\uffff\0\u04fb\u04fc\5F\0\0\u04fc"+
		"\u0500\6e\uffff\0\u04fd\u04fe\5G\0\0\u04fe\u0500\6e\uffff\0\u04ff\u04f9"+
		"\1\0\0\0\u04ff\u04fb\1\0\0\0\u04ff\u04fd\1\0\0\0\u0500\u00cb\1\0\0\0\u0501"+
		"\u0502\5H\0\0\u0502\u050f\3\u00ccf\0\u0503\u0504\5I\0\0\u0504\u050f\3"+
		"\u00ccf\0\u0505\u0506\5A\0\0\u0506\u050f\3\u00ccf\0\u0507\u0508\5B\0\0"+
		"\u0508\u050f\3\u00ccf\0\u0509\u050a\5C\0\0\u050a\u050f\3\u00ccf\0\u050b"+
		"\u050c\5D\0\0\u050c\u050f\3\u00ccf\0\u050d\u050f\3\u00ceg\0\u050e\u0501"+
		"\1\0\0\0\u050e\u0503\1\0\0\0\u050e\u0505\1\0\0\0\u050e\u0507\1\0\0\0\u050e"+
		"\u0509\1\0\0\0\u050e\u050b\1\0\0\0\u050e\u050d\1\0\0\0\u050f\u00cd\1\0"+
		"\0\0\u0510\u051c\3\u00d0h\0\u0511\u0515\3\u00d2i\0\u0512\u0514\3\u00da"+
		"m\0\u0513\u0512\1\0\0\0\u0514\u0517\1\0\0\0\u0515\u0513\1\0\0\0\u0515"+
		"\u0516\1\0\0\0\u0516\u0519\1\0\0\0\u0517\u0515\1\0\0\0\u0518\u051a\7\3"+
		"\0\0\u0519\u0518\1\0\0\0\u0519\u051a\1\0\0\0\u051a\u051c\1\0\0\0\u051b"+
		"\u0510\1\0\0\0\u051b\u0511\1\0\0\0\u051c\u00cf\1\0\0\0\u051d\u051e\5\24"+
		"\0\0\u051e\u051f\3J%\0\u051f\u0520\5\25\0\0\u0520\u0521\3\u00ccf\0\u0521"+
		"\u0528\1\0\0\0\u0522\u0523\5\24\0\0\u0523\u0524\3D\"\0\u0524\u0525\5\25"+
		"\0\0\u0525\u0526\3\u00ceg\0\u0526\u0528\1\0\0\0\u0527\u051d\1\0\0\0\u0527"+
		"\u0522\1\0\0\0\u0528\u00d1\1\0\0\0\u0529\u052a\3\u00a2Q\0\u052a\u052b"+
		"\6i\uffff\0\u052b\u055f\1\0\0\0\u052c\u0531\5*\0\0\u052d\u052e\5\4\0\0"+
		"\u052e\u0530\5b\0\0\u052f\u052d\1\0\0\0\u0530\u0533\1\0\0\0\u0531\u052f"+
		"\1\0\0\0\u0531\u0532\1\0\0\0\u0532\u0535\1\0\0\0\u0533\u0531\1\0\0\0\u0534"+
		"\u0536\3\u00d6k\0\u0535\u0534\1\0\0\0\u0535\u0536\1\0\0\0\u0536\u0537"+
		"\1\0\0\0\u0537\u055f\6i\uffff\0\u0538\u053d\5b\0\0\u0539\u053a\5\4\0\0"+
		"\u053a\u053c\5b\0\0\u053b\u0539\1\0\0\0\u053c\u053f\1\0\0\0\u053d\u053b"+
		"\1\0\0\0\u053d\u053e\1\0\0\0\u053e\u0541\1\0\0\0\u053f\u053d\1\0\0\0\u0540"+
		"\u0542\3\u00d8l\0\u0541\u0540\1\0\0\0\u0541\u0542\1\0\0\0\u0542\u0543"+
		"\1\0\0\0\u0543\u055f\6i\uffff\0\u0544\u0545\5+\0\0\u0545\u0546\3\u00d4"+
		"j\0\u0546\u0547\6i\uffff\0\u0547\u055f\1\0\0\0\u0548\u0549\3\u00eew\0"+
		"\u0549\u054a\6i\uffff\0\u054a\u055f\1\0\0\0\u054b\u054c\3\u00dcn\0\u054c"+
		"\u054d\6i\uffff\0\u054d\u055f\1\0\0\0\u054e\u0553\3J%\0\u054f\u0550\5"+
		"\22\0\0\u0550\u0552\5\23\0\0\u0551\u054f\1\0\0\0\u0552\u0555\1\0\0\0\u0553"+
		"\u0551\1\0\0\0\u0553\u0554\1\0\0\0\u0554\u0556\1\0\0\0\u0555\u0553\1\0"+
		"\0\0\u0556\u0557\5\4\0\0\u0557\u0558\5\6\0\0\u0558\u0559\6i\uffff\0\u0559"+
		"\u055f\1\0\0\0\u055a\u055b\5\26\0\0\u055b\u055c\5\4\0\0\u055c\u055d\5"+
		"\6\0\0\u055d\u055f\6i\uffff\0\u055e\u0529\1\0\0\0\u055e\u052c\1\0\0\0"+
		"\u055e\u0538\1\0\0\0\u055e\u0544\1\0\0\0\u055e\u0548\1\0\0\0\u055e\u054b"+
		"\1\0\0\0\u055e\u054e\1\0\0\0\u055e\u055a\1\0\0\0\u055f\u00d3\1\0\0\0\u0560"+
		"\u0562\5\4\0\0\u0561\u0563\3L&\0\u0562\u0561\1\0\0\0\u0562\u0563\1\0\0"+
		"\0\u0563\u0564\1\0\0\0\u0564\u0566\5b\0\0\u0565\u0567\3\u00ecv\0\u0566"+
		"\u0565\1\0\0\0\u0566\u0567\1\0\0\0\u0567\u00d5\1\0\0\0\u0568\u0569\5\22"+
		"\0\0\u0569\u056a\3\u00a6S\0\u056a\u056b\5\23\0\0\u056b\u056d\1\0\0\0\u056c"+
		"\u0568\1\0\0\0\u056d\u056e\1\0\0\0\u056e\u056c\1\0\0\0\u056e\u056f\1\0"+
		"\0\0\u056f\u0570\1\0\0\0\u0570\u0571\6k\uffff\0\u0571\u057f\1\0\0\0\u0572"+
		"\u0573\3\u00ecv\0\u0573\u0574\6k\uffff\0\u0574\u057f\1\0\0\0\u0575\u0576"+
		"\5\4\0\0\u0576\u0577\3\u00eau\0\u0577\u0578\5b\0\0\u0578\u0579\3\u00ec"+
		"v\0\u0579\u057a\6k\uffff\0\u057a\u057f\1\0\0\0\u057b\u057c\3\u00e6s\0"+
		"\u057c\u057d\6k\uffff\0\u057d\u057f\1\0\0\0\u057e\u056c\1\0\0\0\u057e"+
		"\u0572\1\0\0\0\u057e\u0575\1\0\0\0\u057e\u057b\1\0\0\0\u057f\u00d7\1\0"+
		"\0\0\u0580\u0581\5\22\0\0\u0581\u0583\5\23\0\0\u0582\u0580\1\0\0\0\u0583"+
		"\u0584\1\0\0\0\u0584\u0582\1\0\0\0\u0584\u0585\1\0\0\0\u0585\u0586\1\0"+
		"\0\0\u0586\u0587\5\4\0\0\u0587\u0588\5\6\0\0\u0588\u05a6\6l\uffff\0\u0589"+
		"\u058a\5\22\0\0\u058a\u058b\3\u00a6S\0\u058b\u058c\5\23\0\0\u058c\u058e"+
		"\1\0\0\0\u058d\u0589\1\0\0\0\u058e\u058f\1\0\0\0\u058f\u058d\1\0\0\0\u058f"+
		"\u0590\1\0\0\0\u0590\u0591\1\0\0\0\u0591\u0592\6l\uffff\0\u0592\u05a6"+
		"\1\0\0\0\u0593\u0594\3\u00ecv\0\u0594\u0595\6l\uffff\0\u0595\u05a6\1\0"+
		"\0\0\u0596\u0597\5\4\0\0\u0597\u0598\5\6\0\0\u0598\u05a6\6l\uffff\0\u0599"+
		"\u059a\5\4\0\0\u059a\u059b\3\u00eau\0\u059b\u059c\5b\0\0\u059c\u059d\3"+
		"\u00ecv\0\u059d\u059e\6l\uffff\0\u059e\u05a6\1\0\0\0\u059f\u05a0\5\4\0"+
		"\0\u05a0\u05a1\5*\0\0\u05a1\u05a6\6l\uffff\0\u05a2\u05a3\3\u00e6s\0\u05a3"+
		"\u05a4\6l\uffff\0\u05a4\u05a6\1\0\0\0\u05a5\u0582\1\0\0\0\u05a5\u058d"+
		"\1\0\0\0\u05a5\u0593\1\0\0\0\u05a5\u0596\1\0\0\0\u05a5\u0599\1\0\0\0\u05a5"+
		"\u059f\1\0\0\0\u05a5\u05a2\1\0\0\0\u05a6\u00d9\1\0\0\0\u05a7\u05a8\5\4"+
		"\0\0\u05a8\u05aa\5b\0\0\u05a9\u05ab\3\u00ecv\0\u05aa\u05a9\1\0\0\0\u05aa"+
		"\u05ab\1\0\0\0\u05ab\u05ac\1\0\0\0\u05ac\u05be\6m\uffff\0\u05ad\u05ae"+
		"\5\4\0\0\u05ae\u05af\5*\0\0\u05af\u05be\6m\uffff\0\u05b0\u05b1\5\4\0\0"+
		"\u05b1\u05b2\5+\0\0\u05b2\u05b3\3\u00d4j\0\u05b3\u05b4\6m\uffff\0\u05b4"+
		"\u05be\1\0\0\0\u05b5\u05b6\3\u00e6s\0\u05b6\u05b7\6m\uffff\0\u05b7\u05be"+
		"\1\0\0\0\u05b8\u05b9\5\22\0\0\u05b9\u05ba\3\u00a6S\0\u05ba\u05bb\5\23"+
		"\0\0\u05bb\u05bc\6m\uffff\0\u05bc\u05be\1\0\0\0\u05bd\u05a7\1\0\0\0\u05bd"+
		"\u05ad\1\0\0\0\u05bd\u05b0\1\0\0\0\u05bd\u05b5\1\0\0\0\u05bd\u05b8\1\0"+
		"\0\0\u05be\u00db\1\0\0\0\u05bf\u05c0\5E\0\0\u05c0\u05c1\3\u00eau\0\u05c1"+
		"\u05c2\3F#\0\u05c2\u05c3\3\u00e8t\0\u05c3\u05ca\1\0\0\0\u05c4\u05c5\5"+
		"E\0\0\u05c5\u05c6\3F#\0\u05c6\u05c7\3\u00e8t\0\u05c7\u05ca\1\0\0\0\u05c8"+
		"\u05ca\3\u00deo\0\u05c9\u05bf\1\0\0\0\u05c9\u05c4\1\0\0\0\u05c9\u05c8"+
		"\1\0\0\0\u05ca\u00dd\1\0\0\0\u05cb\u05cc\5E\0\0\u05cc\u05cd\3\u00e4r\0"+
		"\u05cd\u05ce\5\22\0\0\u05ce\u05d3\5\23\0\0\u05cf\u05d0\5\22\0\0\u05d0"+
		"\u05d2\5\23\0\0\u05d1\u05cf\1\0\0\0\u05d2\u05d5\1\0\0\0\u05d3\u05d1\1"+
		"\0\0\0\u05d3\u05d4\1\0\0\0\u05d4\u05d6\1\0\0\0\u05d5\u05d3\1\0\0\0\u05d6"+
		"\u05d7\3\u00e2q\0\u05d7\u05ee\1\0\0\0\u05d8\u05d9\5E\0\0\u05d9\u05da\3"+
		"\u00e4r\0\u05da\u05db\5\22\0\0\u05db\u05dc\3\u00a6S\0\u05dc\u05e3\5\23"+
		"\0\0\u05dd\u05de\5\22\0\0\u05de\u05df\3\u00a6S\0\u05df\u05e0\5\23\0\0"+
		"\u05e0\u05e2\1\0\0\0\u05e1\u05dd\1\0\0\0\u05e2\u05e5\1\0\0\0\u05e3\u05e1"+
		"\1\0\0\0\u05e3\u05e4\1\0\0\0\u05e4\u05ea\1\0\0\0\u05e5\u05e3\1\0\0\0\u05e6"+
		"\u05e7\5\22\0\0\u05e7\u05e9\5\23\0\0\u05e8\u05e6\1\0\0\0\u05e9\u05ec\1"+
		"\0\0\0\u05ea\u05e8\1\0\0\0\u05ea\u05eb\1\0\0\0\u05eb\u05ee\1\0\0\0\u05ec"+
		"\u05ea\1\0\0\0\u05ed\u05cb\1\0\0\0\u05ed\u05d8\1\0\0\0\u05ee\u00df\1\0"+
		"\0\0\u05ef\u05f2\3\u00e2q\0\u05f0\u05f2\3\u00a6S\0\u05f1\u05ef\1\0\0\0"+
		"\u05f1\u05f0\1\0\0\0\u05f2\u00e1\1\0\0\0\u05f3\u05fc\5\20\0\0\u05f4\u05f9"+
		"\3\u00e0p\0\u05f5\u05f6\5\17\0\0\u05f6\u05f8\3\u00e0p\0\u05f7\u05f5\1"+
		"\0\0\0\u05f8\u05fb\1\0\0\0\u05f9\u05f7\1\0\0\0\u05f9\u05fa\1\0\0\0\u05fa"+
		"\u05fd\1\0\0\0\u05fb\u05f9\1\0\0\0\u05fc\u05f4\1\0\0\0\u05fc\u05fd\1\0"+
		"\0\0\u05fd\u05ff\1\0\0\0\u05fe\u0600\5\17\0\0\u05ff\u05fe\1\0\0\0\u05ff"+
		"\u0600\1\0\0\0\u0600\u0601\1\0\0\0\u0601\u0602\5\21\0\0\u0602\u00e3\1"+
		"\0\0\0\u0603\u0606\3F#\0\u0604\u0606\3J%\0\u0605\u0603\1\0\0\0\u0605\u0604"+
		"\1\0\0\0\u0606\u00e5\1\0\0\0\u0607\u0608\5\4\0\0\u0608\u060a\5E\0\0\u0609"+
		"\u060b\3\u00eau\0\u060a\u0609\1\0\0\0\u060a\u060b\1\0\0\0\u060b\u060c"+
		"\1\0\0\0\u060c\u060d\3H$\0\u060d\u060e\3\u00e8t\0\u060e\u00e7\1\0\0\0"+
		"\u060f\u0611\3\u00ecv\0\u0610\u0612\3,\26\0\u0611\u0610\1\0\0\0\u0611"+
		"\u0612\1\0\0\0\u0612\u00e9\1\0\0\0\u0613\u0614\5Z\0\0\u0614\u0615\3*\25"+
		"\0\u0615\u0616\5Y\0\0\u0616\u00eb\1\0\0\0\u0617\u0619\5\24\0\0\u0618\u061a"+
		"\3\u00a4R\0\u0619\u0618\1\0\0\0\u0619\u061a\1\0\0\0\u061a\u061b\1\0\0"+
		"\0\u061b\u061c\5\25\0\0\u061c\u00ed\1\0\0\0\u061d\u061e\7\4\0\0\u061e"+
		"\u00ef\1\0\0\0\u061f\u0620\3\f\6\0\u0620\u0621\5\6\0\0\u0621\u0622\5b"+
		"\0\0\u0622\u00f1\1\0\0\0\u0623\u0624\3\f\6\0\u0624\u0625\7\5\0\0\u0625"+
		"\u0626\5b\0\0\u0626\u00f3\1\0\0\0\u0627\u0628\3\f\6\0\u0628\u0629\5\27"+
		"\0\0\u0629\u062a\5b\0\0\u062a\u00f5\1\0\0\0\u062b\u062c\3\f\6\0\u062c"+
		"\u062d\5/\0\0\u062d\u062e\5\27\0\0\u062e\u062f\5b\0\0\u062f\u00f7\1\0"+
		"\0\0\u0630\u0637\3\f\6\0\u0631\u0638\5\6\0\0\u0632\u0638\5?\0\0\u0633"+
		"\u0635\5/\0\0\u0634\u0633\1\0\0\0\u0634\u0635\1\0\0\0\u0635\u0636\1\0"+
		"\0\0\u0636\u0638\5\27\0\0\u0637\u0631\1\0\0\0\u0637\u0632\1\0\0\0\u0637"+
		"\u0634\1\0\0\0\u0638\u0639\1\0\0\0\u0639\u063a\5b\0\0\u063a\u00f9\1\0"+
		"\0\0\u063b\u063d\3\f\6\0\u063c\u063e\3\26\13\0\u063d\u063c\1\0\0\0\u063d"+
		"\u063e\1\0\0\0\u063e\u0641\1\0\0\0\u063f\u0642\3D\"\0\u0640\u0642\5\26"+
		"\0\0\u0641\u063f\1\0\0\0\u0641\u0640\1\0\0\0\u0641\u0642\1\0\0\0\u0642"+
		"\u0643\1\0\0\0\u0643\u0644\5b\0\0\u0644\u0645\5\25\0\0\u0645\u00fb\1\0"+
		"\0\0\u0646\u0647\3\f\6\0\u0647\u0648\3D\"\0\u0648\u064d\5b\0\0\u0649\u064a"+
		"\5\22\0\0\u064a\u064c\5\23\0\0\u064b\u0649\1\0\0\0\u064c\u064f\1\0\0\0"+
		"\u064d\u064b\1\0\0\0\u064d\u064e\1\0\0\0\u064e\u0650\1\0\0\0\u064f\u064d"+
		"\1\0\0\0\u0650\u0651\7\6\0\0\u0651\u00fd\1\0\0\0\u0652\u0653\3\20\b\0"+
		"\u0653\u0654\3D\"\0\u0654\u0659\5b\0\0\u0655\u0656\5\22\0\0\u0656\u0658"+
		"\5\23\0\0\u0657\u0655\1\0\0\0\u0658\u065b\1\0\0\0\u0659\u0657\1\0\0\0"+
		"\u0659\u065a\1\0\0\0\u065a\u065c\1\0\0\0\u065b\u0659\1\0\0\0\u065c\u065d"+
		"\7\7\0\0\u065d\u00ff\1\0\0\0\u00af\u0101\u0106\u010c\u0110\u0118\u0120"+
		"\u0127\u012b\u012e\u0135\u013a\u013e\u0143\u0152\u0157\u015b\u0160\u0165"+
		"\u016b\u016f\u0173\u017d\u0185\u018c\u0194\u019a\u019d\u01a0\u01a9\u01ad"+
		"\u01b1\u01b4\u01ba\u01bf\u01c5\u01c9\u01d2\u01d9\u01e2\u01e9\u01ed\u01f4"+
		"\u01f8\u01fc\u0204\u0209\u020d\u0211\u0217\u021d\u0222\u022e\u0238\u023d"+
		"\u0244\u0248\u024c\u0254\u0259\u0264\u026e\u0276\u0279\u0280\u0285\u028f"+
		"\u0296\u029c\u029e\u02a5\u02aa\u02b6\u02c0\u02c5\u02ce\u02d7\u02e0\u02e6"+
		"\u02ed\u02f3\u02f8\u0307\u0310\u031a\u0322\u0325\u0328\u0336\u0342\u034b"+
		"\u0353\u035b\u0367\u036f\u0378\u0392\u039b\u03a0\u03aa\u03b1\u03b8\u03c1"+
		"\u03dc\u03e2\u03e6\u03eb\u03f4\u03f8\u0403\u0412\u041a\u041f\u042e\u0432"+
		"\u0436\u043d\u0448\u044f\u0470\u0478\u047f\u0487\u048f\u0497\u049f\u04a7"+
		"\u04af\u04b5\u04bd\u04ca\u04d2\u04df\u04e7\u04ee\u04f6\u04ff\u050e\u0515"+
		"\u0519\u051b\u0527\u0531\u0535\u053d\u0541\u0553\u055e\u0562\u0566\u056e"+
		"\u057e\u0584\u058f\u05a5\u05aa\u05bd\u05c9\u05d3\u05e3\u05ea\u05ed\u05f1"+
		"\u05f9\u05fc\u05ff\u0605\u060a\u0611\u0619\u0634\u0637\u063d\u0641\u064d"+
		"\u0659";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}