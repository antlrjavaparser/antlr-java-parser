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
		RULE_formalParameter = 77, RULE_forstatement = 78, RULE_foreachStatement = 79, 
		RULE_normalForStatement = 80, RULE_forInit = 81, RULE_parExpression = 82, 
		RULE_expressionList = 83, RULE_expression = 84, RULE_assignmentOperator = 85, 
		RULE_conditionalExpression = 86, RULE_conditionalOrExpression = 87, RULE_conditionalAndExpression = 88, 
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
		RULE_fieldHeader = 127, RULE_localVariableHeader = 128;
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
		"formalParameter", "forstatement", "foreachStatement", "normalForStatement", 
		"forInit", "parExpression", "expressionList", "expression", "assignmentOperator", 
		"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
		"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
		"notEqualityExpression", "instanceOfExpression", "relationalExpression", 
		"relationalOp", "shiftExpression", "shiftOp", "additiveExpression", "additiveOp", 
		"multiplicativeExpression", "multiplicativeOp", "unaryExpression", "unaryExpressionNotPlusMinus", 
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
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(258); packageDeclaration();
				}
				break;
			}
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(261); importDeclaration();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==INTERFACE || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==AT || _la==ENUM) {
				{
				{
				setState(267); typeDeclaration();
				}
				}
				setState(272);
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
			setState(274);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(273); annotations();
				}
			}

			setState(276); match(PACKAGE);
			setState(277); qualifiedName();
			setState(278); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
			setState(304);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280); match(IMPORT);
				setState(282);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(281); match(STATIC);
					}
				}

				setState(284); match(Identifier);
				setState(285); match(DOT);
				setState(286); match(STAR);
				setState(287); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288); match(IMPORT);
				setState(290);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(289); match(STATIC);
					}
				}

				setState(292); match(Identifier);
				setState(295); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(293); match(DOT);
						setState(294); match(Identifier);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(297); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(301);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(299); match(DOT);
					setState(300); match(STAR);
					}
				}

				setState(303); match(SEMI);
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
			setState(306); match(Identifier);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(307); match(DOT);
				setState(308); match(Identifier);
				}
				}
				setState(313);
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
			setState(316);
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
				setState(314); classOrInterfaceDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(315); match(SEMI);
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
			setState(320);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318); classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319); interfaceDeclaration();
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
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(322); modifier();
					}
					} 
				}
				setState(327);
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
			setState(340);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(328); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(329); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(330); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(331); match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(332); match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(333); match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(334); match(FINAL);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 8);
				{
				setState(335); match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 9);
				{
				setState(336); match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(337); match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 11);
				{
				setState(338); match(VOLATILE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 12);
				{
				setState(339); match(STRICTFP);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(342); annotation();
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(349);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(348); match(FINAL);
				}
			}

			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(351); annotation();
				}
				}
				setState(356);
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
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357); normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358); enumDeclaration();
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
			setState(361); modifiers();
			setState(362); match(CLASS);
			setState(363); match(Identifier);
			setState(365);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(364); typeParameters();
				}
			}

			setState(369);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(367); match(EXTENDS);
				setState(368); type();
				}
			}

			setState(373);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(371); match(IMPLEMENTS);
				setState(372); typeList();
				}
			}

			setState(375); classBody();
			}
		}
		catch (RecognitionException re) {
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
			setState(377); match(LT);
			setState(378); typeParameter();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(379); match(COMMA);
				setState(380); typeParameter();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386); match(GT);
			}
		}
		catch (RecognitionException re) {
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
			setState(388); match(Identifier);
			setState(391);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(389); match(EXTENDS);
				setState(390); typeBound();
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
			setState(393); type();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(394); match(AMP);
				setState(395); type();
				}
				}
				setState(400);
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
			setState(401); modifiers();
			setState(402); match(ENUM);
			setState(403); match(Identifier);
			setState(406);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(404); match(IMPLEMENTS);
				setState(405); typeList();
				}
			}

			setState(408); enumBody();
			}
		}
		catch (RecognitionException re) {
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
			setState(410); match(LBRACE);
			setState(412);
			_la = _input.LA(1);
			if (_la==AT || _la==Identifier) {
				{
				setState(411); enumConstants();
				}
			}

			setState(415);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(414); match(COMMA);
				}
			}

			setState(418);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(417); enumBodyDeclarations();
				}
			}

			setState(420); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
			setState(422); enumConstant();
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(423); match(COMMA);
					setState(424); enumConstant();
					}
					} 
				}
				setState(429);
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
			setState(431);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(430); annotations();
				}
			}

			setState(433); match(Identifier);
			setState(435);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(434); arguments();
				}
			}

			setState(438);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(437); classBody();
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
			setState(440); match(SEMI);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==LBRACE || _la==VOID || _la==INTERFACE || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==AT || _la==ENUM || _la==LT || _la==Identifier) {
				{
				{
				setState(441); classBodyDeclaration();
				}
				}
				setState(446);
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
			setState(449);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447); normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448); annotationTypeDeclaration();
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
			setState(451); modifiers();
			setState(452); match(INTERFACE);
			setState(453); match(Identifier);
			setState(455);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(454); typeParameters();
				}
			}

			setState(459);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(457); match(EXTENDS);
				setState(458); typeList();
				}
			}

			setState(461); interfaceBody();
			}
		}
		catch (RecognitionException re) {
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
			setState(463); type();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(464); match(COMMA);
				setState(465); type();
				}
				}
				setState(470);
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
			setState(471); match(LBRACE);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==LBRACE || _la==VOID || _la==INTERFACE || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==AT || _la==ENUM || _la==LT || _la==Identifier) {
				{
				{
				setState(472); classBodyDeclaration();
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
			setState(480); match(LBRACE);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==VOID || _la==INTERFACE || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==AT || _la==ENUM || _la==LT || _la==Identifier) {
				{
				{
				setState(481); interfaceBodyDeclaration();
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(487); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
			setState(495);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(490); match(STATIC);
					}
				}

				setState(493); block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(494); memberDecl();
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
			setState(502);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497); constructorDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498); fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(499); methodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(500); classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(501); interfaceDeclaration();
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
			setState(504); modifiers();
			setState(506);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(505); typeParameters();
				}
			}

			setState(510);
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
				setState(508); type();
				}
				break;
			case VOID:
				{
				setState(509); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(512); match(Identifier);
			setState(513); formalParameters();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(514); match(LBRACKET);
				setState(515); match(RBRACKET);
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(523);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(521); match(THROWS);
				setState(522); qualifiedNameList();
				}
			}

			setState(527);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(525); block();
				}
				break;
			case SEMI:
				{
				setState(526); match(SEMI);
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
			setState(529); modifiers();
			setState(531);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(530); typeParameters();
				}
			}

			setState(533); match(Identifier);
			setState(534); formalParameters();
			setState(537);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(535); match(THROWS);
				setState(536); qualifiedNameList();
				}
			}

			setState(539); constructorBlock();
			}
		}
		catch (RecognitionException re) {
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
			setState(541); match(LBRACE);
			setState(543);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(542); explicitConstructorInvocation();
				}
				break;
			}
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==LBRACE || _la==LPAREN || _la==VOID || _la==INTERFACE || _la==THROW || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==AT || _la==IF || _la==FOR || _la==WHILE || _la==DO || _la==TRY || _la==SWITCH || _la==RETURN || _la==BREAK || _la==CONTINUE || _la==ENUM || _la==ASSERT || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
				{
				{
				setState(545); blockStatement();
				}
				}
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(551); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
			setState(553); modifiers();
			setState(554); type();
			setState(555); variableDeclarator();
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(556); match(COMMA);
				setState(557); variableDeclarator();
				}
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(563); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
			setState(565); match(Identifier);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(566); match(LBRACKET);
				setState(567); match(RBRACKET);
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(573); match(EQ);
				setState(574); variableInitializer();
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
			setState(582);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577); interfaceFieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578); interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(579); interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(580); classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(581); match(SEMI);
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
			setState(584); modifiers();
			setState(586);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(585); typeParameters();
				}
			}

			setState(590);
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
				setState(588); type();
				}
				break;
			case VOID:
				{
				setState(589); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(592); match(Identifier);
			setState(593); formalParameters();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(594); match(LBRACKET);
				setState(595); match(RBRACKET);
				}
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(603);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(601); match(THROWS);
				setState(602); qualifiedNameList();
				}
			}

			setState(605); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
			setState(607); modifiers();
			setState(608); type();
			setState(609); variableDeclarator();
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(610); match(COMMA);
				setState(611); variableDeclarator();
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
			setState(635);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(619); classOrInterfaceType();
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(620); match(LBRACKET);
					setState(621); match(RBRACKET);
					}
					}
					setState(626);
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
				setState(627); primitiveType();
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
			setState(637); identifierTypeArgument();
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(638); match(DOT);
				setState(639); identifierTypeArgument();
				}
				}
				setState(644);
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
			setState(645); match(Identifier);
			setState(647);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(646); typeArguments();
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
			setState(649);
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
			setState(664);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651); match(LT);
				setState(652); typeArgument();
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(653); match(COMMA);
					setState(654); typeArgument();
					}
					}
					setState(659);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(660); match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(662); match(LT);
				setState(663); match(GT);
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
			setState(672);
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
				setState(666); type();
				}
				break;
			case QUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(667); match(QUES);
				setState(670);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(668);
					_input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(669); type();
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
			setState(674); qualifiedName();
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(675); match(COMMA);
				setState(676); qualifiedName();
				}
				}
				setState(681);
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
			setState(682); match(LPAREN);
			setState(684);
			_la = _input.LA(1);
			if (_la==FINAL || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==AT || _la==Identifier) {
				{
				setState(683); formalParameterDecls();
				}
			}

			setState(686); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(706);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(688); ellipsisParameterDecl();
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
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(700); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(697); normalParameterDecl();
						setState(698); match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(702); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(704); ellipsisParameterDecl();
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
			setState(708); variableModifiers();
			setState(709); type();
			setState(710); match(Identifier);
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(711); match(LBRACKET);
				setState(712); match(RBRACKET);
				}
				}
				setState(717);
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
			setState(718); variableModifiers();
			setState(719); type();
			setState(720); match(ELLIPSIS);
			setState(721); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
			setState(739);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(723); nonWildcardTypeArguments();
					}
				}

				setState(726);
				_input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==THIS || _la==SUPER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(727); arguments();
				setState(728); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(730); primary();
				setState(731); match(DOT);
				setState(733);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(732); nonWildcardTypeArguments();
					}
				}

				setState(735); match(SUPER);
				setState(736); arguments();
				setState(737); match(SEMI);
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
			setState(741); match(Identifier);
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(742); match(DOT);
				setState(743); match(Identifier);
				}
				}
				setState(748);
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
			setState(750); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(749); annotation();
				}
				}
				setState(752); 
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
			setState(757);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(754); markerAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(755); singleElementAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(756); normalAnnotation();
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
			setState(759); match(AT);
			setState(760); qualifiedName();
			}
		}
		catch (RecognitionException re) {
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
			setState(762); match(AT);
			setState(763); qualifiedName();
			setState(764); match(LPAREN);
			setState(765); elementValue();
			setState(766); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(768); match(AT);
			setState(769); qualifiedName();
			setState(770); match(LPAREN);
			setState(772);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(771); elementValuePairs();
				}
			}

			setState(774); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
			setState(776); elementValuePair();
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(777); match(COMMA);
				setState(778); elementValuePair();
				}
				}
				setState(783);
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
			setState(784); match(Identifier);
			setState(785); match(EQ);
			setState(786); elementValue();
			}
		}
		catch (RecognitionException re) {
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
			setState(791);
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
				setState(788); conditionalExpression();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(789); annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(790); elementValueArrayInitializer();
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
			setState(793); match(LBRACE);
			setState(802);
			_la = _input.LA(1);
			if (_la==LBRACE || _la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==AT || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
				{
				setState(794); elementValue();
				setState(799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(795); match(COMMA);
						setState(796); elementValue();
						}
						} 
					}
					setState(801);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				}
			}

			setState(805);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(804); match(COMMA);
				}
			}

			setState(807); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
			setState(809); modifiers();
			setState(810); match(AT);
			setState(811); match(INTERFACE);
			setState(812); match(Identifier);
			setState(813); annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
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
			setState(815); match(LBRACE);
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==INTERFACE || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==AT || _la==ENUM || _la==Identifier) {
				{
				{
				setState(816); annotationTypeElementDeclaration();
				}
				}
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(822); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
			setState(831);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(824); annotationMethodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(825); interfaceFieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(826); normalClassDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(827); normalInterfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(828); enumDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(829); annotationTypeDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(830); match(SEMI);
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
			setState(833); modifiers();
			setState(834); type();
			setState(835); match(Identifier);
			setState(836); match(LPAREN);
			setState(837); match(RPAREN);
			setState(840);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(838); match(DEFAULT);
				setState(839); elementValue();
				}
			}

			setState(842); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
			setState(844); match(LBRACE);
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==LBRACE || _la==LPAREN || _la==VOID || _la==INTERFACE || _la==THROW || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==AT || _la==IF || _la==FOR || _la==WHILE || _la==DO || _la==TRY || _la==SWITCH || _la==RETURN || _la==BREAK || _la==CONTINUE || _la==ENUM || _la==ASSERT || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
				{
				{
				setState(845); blockStatement();
				}
				}
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(851); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
			setState(856);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853); localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(854); classOrInterfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(855); statement();
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
			setState(858); localVariableDeclaration();
			setState(859); match(SEMI);
			}
		}
		catch (RecognitionException re) {
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
			setState(861); variableModifiers();
			setState(862); type();
			setState(863); variableDeclarator();
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(864); match(COMMA);
				setState(865); variableDeclarator();
				}
				}
				setState(870);
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
			setState(935);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(871); block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(872); match(ASSERT);
				setState(873); expression();
				setState(876);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(874); match(COLON);
					setState(875); expression();
					}
				}

				setState(878); match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(880); match(IF);
				setState(881); parExpression();
				setState(882); statement();
				setState(885);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(883); match(ELSE);
					setState(884); statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(887); forstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(888); match(WHILE);
				setState(889); parExpression();
				setState(890); statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(892); match(DO);
				setState(893); statement();
				setState(894); match(WHILE);
				setState(895); parExpression();
				setState(896); match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(898); trystatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(899); match(SWITCH);
				setState(900); parExpression();
				setState(901); match(LBRACE);
				setState(902); switchBlockStatementGroups();
				setState(903); match(RBRACE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(905); match(SYNCHRONIZED);
				setState(906); parExpression();
				setState(907); block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(909); match(RETURN);
				setState(911);
				_la = _input.LA(1);
				if (_la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
					{
					setState(910); expression();
					}
				}

				setState(913); match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(914); match(THROW);
				setState(915); expression();
				setState(916); match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(918); match(BREAK);
				setState(920);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(919); match(Identifier);
					}
				}

				setState(922); match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(923); match(CONTINUE);
				setState(925);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(924); match(Identifier);
					}
				}

				setState(927); match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(928); expression();
				setState(929); match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(931); match(Identifier);
				setState(932); match(COLON);
				setState(933); statement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(934); emptyStatement();
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
		public EmptyStatementContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, 130);
		enterRule(_localctx, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx, 132);
		enterRule(_localctx, RULE_switchBlockStatementGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(939); switchBlockStatementGroup();
				}
				}
				setState(944);
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
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, 134);
		enterRule(_localctx, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945); switchLabel();
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==CLASS || _la==PUBLIC || _la==PROTECTED || _la==PRIVATE || _la==ABSTRACT || _la==STATIC || _la==FINAL || _la==STRICTFP || _la==LBRACE || _la==LPAREN || _la==VOID || _la==INTERFACE || _la==THROW || _la==NATIVE || _la==SYNCHRONIZED || _la==TRANSIENT || _la==VOLATILE || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==AT || _la==IF || _la==FOR || _la==WHILE || _la==DO || _la==TRY || _la==SWITCH || _la==RETURN || _la==BREAK || _la==CONTINUE || _la==ENUM || _la==ASSERT || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
				{
				{
				setState(946); blockStatement();
				}
				}
				setState(951);
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
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, 136);
		enterRule(_localctx, RULE_switchLabel);
		try {
			setState(958);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(952); match(CASE);
				setState(953); expression();
				setState(954); match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(956); match(DEFAULT);
				setState(957); match(COLON);
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
		TrystatementContext _localctx = new TrystatementContext(_ctx, 138);
		enterRule(_localctx, RULE_trystatement);
		try {
			setState(972);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(960); match(TRY);
				setState(961); block();
				setState(969);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(962); catches();
					setState(963); match(FINALLY);
					setState(964); block();
					}
					break;
				case 2:
					{
					setState(966); catches();
					}
					break;
				case 3:
					{
					setState(967); match(FINALLY);
					setState(968); block();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(971); tryWithResources();
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
		TryWithResourcesContext _localctx = new TryWithResourcesContext(_ctx, 140);
		enterRule(_localctx, RULE_tryWithResources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974); match(TRY);
			setState(975); resourceSpecification();
			setState(976); block();
			setState(978);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(977); catches();
				}
			}

			setState(982);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(980); match(FINALLY);
				setState(981); block();
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
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, 142);
		enterRule(_localctx, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984); match(LPAREN);
			setState(985); resources();
			setState(987);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(986); match(SEMI);
				}
			}

			setState(989); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		ResourcesContext _localctx = new ResourcesContext(_ctx, 144);
		enterRule(_localctx, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(991); resource();
			setState(996);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(992); match(SEMI);
					setState(993); resource();
					}
					} 
				}
				setState(998);
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
		ResourceContext _localctx = new ResourceContext(_ctx, 146);
		enterRule(_localctx, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(999); variableModifiers();
				}
				break;
			}
			setState(1002); type();
			setState(1003); match(Identifier);
			setState(1004); match(EQ);
			setState(1005); expression();
			}
		}
		catch (RecognitionException re) {
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
		CatchesContext _localctx = new CatchesContext(_ctx, 148);
		enterRule(_localctx, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007); catchClause();
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1008); catchClause();
				}
				}
				setState(1013);
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
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, 150);
		enterRule(_localctx, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014); match(CATCH);
			setState(1015); match(LPAREN);
			setState(1016); catchFormalParameter();
			setState(1017); match(RPAREN);
			setState(1018); block();
			}
		}
		catch (RecognitionException re) {
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
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, 152);
		enterRule(_localctx, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020); variableModifiers();
			setState(1021); type();
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(1022); match(BAR);
				setState(1023); type();
				}
				}
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1029); match(Identifier);
			setState(1034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1030); match(LBRACKET);
				setState(1031); match(RBRACKET);
				}
				}
				setState(1036);
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
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, 154);
		enterRule(_localctx, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037); variableModifiers();
			setState(1038); type();
			setState(1039); match(Identifier);
			setState(1044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1040); match(LBRACKET);
				setState(1041); match(RBRACKET);
				}
				}
				setState(1046);
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
		ForstatementContext _localctx = new ForstatementContext(_ctx, 156);
		enterRule(_localctx, RULE_forstatement);
		try {
			setState(1049);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1047); foreachStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1048); normalForStatement();
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
		public ForeachStatementContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, 158);
		enterRule(_localctx, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051); match(FOR);
			setState(1052); match(LPAREN);
			setState(1053); variableModifiers();
			setState(1054); type();
			setState(1055); match(Identifier);
			setState(1056); match(COLON);
			setState(1057); expression();
			setState(1058); match(RPAREN);
			setState(1059); statement();
			}
		}
		catch (RecognitionException re) {
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
		public NormalForStatementContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		NormalForStatementContext _localctx = new NormalForStatementContext(_ctx, 160);
		enterRule(_localctx, RULE_normalForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061); match(FOR);
			setState(1062); match(LPAREN);
			setState(1064);
			_la = _input.LA(1);
			if (_la==FINAL || _la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==AT || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
				{
				setState(1063); forInit();
				}
			}

			setState(1066); match(SEMI);
			setState(1068);
			_la = _input.LA(1);
			if (_la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
				{
				setState(1067); expression();
				}
			}

			setState(1070); match(SEMI);
			setState(1072);
			_la = _input.LA(1);
			if (_la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
				{
				setState(1071); expressionList();
				}
			}

			setState(1074); match(RPAREN);
			setState(1075); statement();
			}
		}
		catch (RecognitionException re) {
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
		ForInitContext _localctx = new ForInitContext(_ctx, 162);
		enterRule(_localctx, RULE_forInit);
		try {
			setState(1079);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1077); localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1078); expressionList();
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
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, 164);
		enterRule(_localctx, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081); match(LPAREN);
			setState(1082); expression();
			setState(1083); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, 166);
		enterRule(_localctx, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085); expression();
			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1086); match(COMMA);
				setState(1087); expression();
				}
				}
				setState(1092);
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
		ExpressionContext _localctx = new ExpressionContext(_ctx, 168);
		enterRule(_localctx, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093); conditionalExpression();
			setState(1097);
			_la = _input.LA(1);
			if (_la==EQ || _la==CARETEQ || _la==PLUSEQ || _la==SUBEQ || _la==STAREQ || _la==SLASHEQ || _la==AMPEQ || _la==BAREQ || _la==PERCENTEQ || _la==GT || _la==LT) {
				{
				setState(1094); assignmentOperator();
				setState(1095); expression();
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
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, 170);
		enterRule(_localctx, RULE_assignmentOperator);
		try {
			setState(1130);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1099); match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1101); match(PLUSEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  2;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1103); match(SUBEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  3;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1105); match(STAREQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  4;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1107); match(SLASHEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  5;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1109); match(AMPEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  6;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1111); match(BAREQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  7;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1113); match(CARETEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  8;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1115); match(PERCENTEQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  9;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1117); match(LT);
				setState(1118); match(LT);
				setState(1119); match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  10;
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1121); match(GT);
				setState(1122); match(GT);
				setState(1123); match(GT);
				setState(1124); match(EQ);
				((AssignmentOperatorContext)_localctx).assignmentType =  11;
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1126); match(GT);
				setState(1127); match(GT);
				setState(1128); match(EQ);
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
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, 172);
		enterRule(_localctx, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132); conditionalOrExpression();
			setState(1138);
			_la = _input.LA(1);
			if (_la==QUES) {
				{
				setState(1133); match(QUES);
				setState(1134); expression();
				setState(1135); match(COLON);
				setState(1136); conditionalExpression();
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
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, 174);
		enterRule(_localctx, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140); conditionalAndExpression();
			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BARBAR) {
				{
				{
				setState(1141); match(BARBAR);
				setState(1142); conditionalAndExpression();
				}
				}
				setState(1147);
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
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, 176);
		enterRule(_localctx, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148); inclusiveOrExpression();
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMPAMP) {
				{
				{
				setState(1149); match(AMPAMP);
				setState(1150); inclusiveOrExpression();
				}
				}
				setState(1155);
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
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, 178);
		enterRule(_localctx, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156); exclusiveOrExpression();
			setState(1161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(1157); match(BAR);
				setState(1158); exclusiveOrExpression();
				}
				}
				setState(1163);
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
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, 180);
		enterRule(_localctx, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164); andExpression();
			setState(1169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(1165); match(CARET);
				setState(1166); andExpression();
				}
				}
				setState(1171);
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
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, 182);
		enterRule(_localctx, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172); equalityExpression();
			setState(1177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(1173); match(AMP);
				setState(1174); equalityExpression();
				}
				}
				setState(1179);
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
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, 184);
		enterRule(_localctx, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180); notEqualityExpression();
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQEQ) {
				{
				{
				setState(1181); match(EQEQ);
				setState(1182); notEqualityExpression();
				}
				}
				setState(1187);
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
		public NotEqualityExpressionContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		NotEqualityExpressionContext _localctx = new NotEqualityExpressionContext(_ctx, 186);
		enterRule(_localctx, RULE_notEqualityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188); instanceOfExpression();
			setState(1193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BANGEQ) {
				{
				{
				setState(1189); match(BANGEQ);
				setState(1190); instanceOfExpression();
				}
				}
				setState(1195);
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
		InstanceOfExpressionContext _localctx = new InstanceOfExpressionContext(_ctx, 188);
		enterRule(_localctx, RULE_instanceOfExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196); relationalExpression();
			setState(1199);
			_la = _input.LA(1);
			if (_la==INSTANCEOF) {
				{
				setState(1197); match(INSTANCEOF);
				setState(1198); type();
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
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, 190);
		enterRule(_localctx, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1201); shiftExpression();
			setState(1207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1202); relationalOp();
					setState(1203); shiftExpression();
					}
					} 
				}
				setState(1209);
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

	public static class RelationalOpContext extends ParserRuleContext {
		public int operatorType;
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
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, 192);
		enterRule(_localctx, RULE_relationalOp);
		try {
			setState(1220);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1210); match(LT);
				setState(1211); match(EQ);
				((RelationalOpContext)_localctx).operatorType =  1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1213); match(GT);
				setState(1214); match(EQ);
				((RelationalOpContext)_localctx).operatorType =  2;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1216); match(LT);
				((RelationalOpContext)_localctx).operatorType =  3;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1218); match(GT);
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
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, 194);
		enterRule(_localctx, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1222); additiveExpression();
			setState(1228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1223); shiftOp();
					setState(1224); additiveExpression();
					}
					} 
				}
				setState(1230);
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
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, 196);
		enterRule(_localctx, RULE_shiftOp);
		try {
			setState(1241);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1231); match(LT);
				setState(1232); match(LT);
				((ShiftOpContext)_localctx).operatorType =  1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1234); match(GT);
				setState(1235); match(GT);
				setState(1236); match(GT);
				((ShiftOpContext)_localctx).operatorType =  2;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1238); match(GT);
				setState(1239); match(GT);
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
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, 198);
		enterRule(_localctx, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243); multiplicativeExpression();
			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==SUB) {
				{
				{
				setState(1244); additiveOp();
				setState(1245); multiplicativeExpression();
				}
				}
				setState(1251);
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
		public AdditiveOpContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		AdditiveOpContext _localctx = new AdditiveOpContext(_ctx, 200);
		enterRule(_localctx, RULE_additiveOp);
		try {
			setState(1256);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1252); match(PLUS);
				((AdditiveOpContext)_localctx).operatorType =  1;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1254); match(SUB);
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
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, 202);
		enterRule(_localctx, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258); unaryExpression();
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==SLASH || _la==PERCENT) {
				{
				{
				setState(1259); multiplicativeOp();
				setState(1260); unaryExpression();
				}
				}
				setState(1266);
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
		public MultiplicativeOpContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		MultiplicativeOpContext _localctx = new MultiplicativeOpContext(_ctx, 204);
		enterRule(_localctx, RULE_multiplicativeOp);
		try {
			setState(1273);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1267); match(STAR);
				((MultiplicativeOpContext)_localctx).operatorType =  1;
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1269); match(SLASH);
				((MultiplicativeOpContext)_localctx).operatorType =  2;
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1271); match(PERCENT);
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
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, 206);
		enterRule(_localctx, RULE_unaryExpression);
		try {
			setState(1288);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1275); match(PLUS);
				setState(1276); unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1277); match(SUB);
				setState(1278); unaryExpression();
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1279); match(PLUSPLUS);
				setState(1280); unaryExpression();
				}
				break;
			case SUBSUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(1281); match(SUBSUB);
				setState(1282); unaryExpression();
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1283); match(TILDE);
				setState(1284); unaryExpression();
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 6);
				{
				setState(1285); match(BANG);
				setState(1286); unaryExpression();
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
				setState(1287); unaryExpressionNotPlusMinus();
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
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, 208);
		enterRule(_localctx, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			setState(1301);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1290); castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1291); primary();
				setState(1295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT || _la==LBRACKET) {
					{
					{
					setState(1292); selector();
					}
					}
					setState(1297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1299);
				_la = _input.LA(1);
				if (_la==PLUSPLUS || _la==SUBSUB) {
					{
					setState(1298);
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
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, 210);
		enterRule(_localctx, RULE_castExpression);
		try {
			setState(1313);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1303); match(LPAREN);
				setState(1304); primitiveType();
				setState(1305); match(RPAREN);
				setState(1306); unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1308); match(LPAREN);
				setState(1309); type();
				setState(1310); match(RPAREN);
				setState(1311); unaryExpressionNotPlusMinus();
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
		PrimaryContext _localctx = new PrimaryContext(_ctx, 212);
		enterRule(_localctx, RULE_primary);
		int _la;
		try {
			int _alt;
			setState(1368);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1315); parExpression();
				((PrimaryContext)_localctx).operationType =  1;
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1318); match(THIS);
				setState(1323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1319); match(DOT);
						setState(1320); match(Identifier);
						}
						} 
					}
					setState(1325);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				}
				setState(1327);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1326); thisSuffix();
					}
					break;
				}
				((PrimaryContext)_localctx).operationType =  2;
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(1330); match(Identifier);
				setState(1335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1331); match(DOT);
						setState(1332); match(Identifier);
						}
						} 
					}
					setState(1337);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				setState(1339);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1338); identifierSuffix();
					}
					break;
				}
				((PrimaryContext)_localctx).operationType =  3;
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1342); match(SUPER);
				setState(1343); superSuffix();
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
				setState(1346); literal();
				((PrimaryContext)_localctx).operationType =  5;
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 6);
				{
				setState(1349); creator();
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
				setState(1352); primitiveType();
				setState(1357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(1353); match(LBRACKET);
					setState(1354); match(RBRACKET);
					}
					}
					setState(1359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1360); match(DOT);
				setState(1361); match(CLASS);
				((PrimaryContext)_localctx).operationType =  7;
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 8);
				{
				setState(1364); match(VOID);
				setState(1365); match(DOT);
				setState(1366); match(CLASS);
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
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, 214);
		enterRule(_localctx, RULE_superSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370); match(DOT);
			setState(1372);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1371); typeArguments();
				}
			}

			setState(1374); match(Identifier);
			setState(1376);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1375); arguments();
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
		public ThisSuffixContext(ParserRuleContext parent, int state) {
			super(parent, state);
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
		ThisSuffixContext _localctx = new ThisSuffixContext(_ctx, 216);
		enterRule(_localctx, RULE_thisSuffix);
		try {
			int _alt;
			setState(1400);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1382); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1378); match(LBRACKET);
						setState(1379); expression();
						setState(1380); match(RBRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1384); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				((ThisSuffixContext)_localctx).operationType =  1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1388); arguments();
				((ThisSuffixContext)_localctx).operationType =  2;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1391); match(DOT);
				setState(1392); nonWildcardTypeArguments();
				setState(1393); match(Identifier);
				setState(1394); arguments();
				((ThisSuffixContext)_localctx).operationType =  3;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1397); innerCreator();
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
		IdentifierSuffixContext _localctx = new IdentifierSuffixContext(_ctx, 218);
		enterRule(_localctx, RULE_identifierSuffix);
		int _la;
		try {
			int _alt;
			setState(1439);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1404); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1402); match(LBRACKET);
					setState(1403); match(RBRACKET);
					}
					}
					setState(1406); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACKET );
				setState(1408); match(DOT);
				setState(1409); match(CLASS);
				((IdentifierSuffixContext)_localctx).operationType =  1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1415); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1411); match(LBRACKET);
						setState(1412); expression();
						setState(1413); match(RBRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1417); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				((IdentifierSuffixContext)_localctx).operationType =  2;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1421); arguments();
				((IdentifierSuffixContext)_localctx).operationType =  3;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1424); match(DOT);
				setState(1425); match(CLASS);
				((IdentifierSuffixContext)_localctx).operationType =  4;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1427); match(DOT);
				setState(1428); nonWildcardTypeArguments();
				setState(1429); match(Identifier);
				setState(1430); arguments();
				((IdentifierSuffixContext)_localctx).operationType =  5;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1433); match(DOT);
				setState(1434); match(THIS);
				((IdentifierSuffixContext)_localctx).operationType =  6;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1436); innerCreator();
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
		SelectorContext _localctx = new SelectorContext(_ctx, 220);
		enterRule(_localctx, RULE_selector);
		int _la;
		try {
			setState(1463);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1441); match(DOT);
				setState(1442); match(Identifier);
				setState(1444);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1443); arguments();
					}
				}

				((SelectorContext)_localctx).operationType =  1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1447); match(DOT);
				setState(1448); match(THIS);
				((SelectorContext)_localctx).operationType =  2;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1450); match(DOT);
				setState(1451); match(SUPER);
				setState(1452); superSuffix();
				((SelectorContext)_localctx).operationType =  3;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1455); innerCreator();
				((SelectorContext)_localctx).operationType =  4;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1458); match(LBRACKET);
				setState(1459); expression();
				setState(1460); match(RBRACKET);
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
		CreatorContext _localctx = new CreatorContext(_ctx, 222);
		enterRule(_localctx, RULE_creator);
		try {
			setState(1475);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1465); match(NEW);
				setState(1466); nonWildcardTypeArguments();
				setState(1467); classOrInterfaceType();
				setState(1468); classCreatorRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1470); match(NEW);
				setState(1471); classOrInterfaceType();
				setState(1472); classCreatorRest();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1474); arrayCreator();
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
		ArrayCreatorContext _localctx = new ArrayCreatorContext(_ctx, 224);
		enterRule(_localctx, RULE_arrayCreator);
		int _la;
		try {
			int _alt;
			setState(1511);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1477); match(NEW);
				setState(1478); createdName();
				setState(1479); match(LBRACKET);
				setState(1480); match(RBRACKET);
				setState(1485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(1481); match(LBRACKET);
					setState(1482); match(RBRACKET);
					}
					}
					setState(1487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1488); arrayInitializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1490); match(NEW);
				setState(1491); createdName();
				setState(1492); match(LBRACKET);
				setState(1493); expression();
				setState(1494); match(RBRACKET);
				setState(1501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1495); match(LBRACKET);
						setState(1496); expression();
						setState(1497); match(RBRACKET);
						}
						} 
					}
					setState(1503);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				}
				setState(1508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1504); match(LBRACKET);
						setState(1505); match(RBRACKET);
						}
						} 
					}
					setState(1510);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
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
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, 226);
		enterRule(_localctx, RULE_variableInitializer);
		try {
			setState(1515);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1513); arrayInitializer();
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
				setState(1514); expression();
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
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, 228);
		enterRule(_localctx, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1517); match(LBRACE);
			setState(1526);
			_la = _input.LA(1);
			if (_la==LBRACE || _la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
				{
				setState(1518); variableInitializer();
				setState(1523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1519); match(COMMA);
						setState(1520); variableInitializer();
						}
						} 
					}
					setState(1525);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
				}
				}
			}

			setState(1529);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1528); match(COMMA);
				}
			}

			setState(1531); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
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
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, 230);
		enterRule(_localctx, RULE_createdName);
		try {
			setState(1535);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1533); classOrInterfaceType();
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
				setState(1534); primitiveType();
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
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, 232);
		enterRule(_localctx, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537); match(DOT);
			setState(1538); match(NEW);
			setState(1540);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1539); nonWildcardTypeArguments();
				}
			}

			setState(1542); identifierTypeArgument();
			setState(1543); classCreatorRest();
			}
		}
		catch (RecognitionException re) {
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
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, 234);
		enterRule(_localctx, RULE_classCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545); arguments();
			setState(1547);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1546); classBody();
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
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, 236);
		enterRule(_localctx, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549); match(LT);
			setState(1550); typeList();
			setState(1551); match(GT);
			}
		}
		catch (RecognitionException re) {
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
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, 238);
		enterRule(_localctx, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553); match(LPAREN);
			setState(1555);
			_la = _input.LA(1);
			if (_la==LPAREN || _la==VOID || _la==BOOLEAN || _la==CHAR || _la==BYTE || _la==SHORT || _la==INT || _la==LONG || _la==FLOAT || _la==DOUBLE || _la==THIS || _la==SUPER || _la==NULL || _la==TRUE || _la==FALSE || _la==PLUSPLUS || _la==SUBSUB || _la==TILDE || _la==BANG || _la==NEW || _la==PLUS || _la==SUB || _la==IntegerLiteral || _la==FloatingPointLiteral || _la==CharacterLiteral || _la==StringLiteral || _la==Identifier) {
				{
				setState(1554); expressionList();
				}
			}

			setState(1557); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		LiteralContext _localctx = new LiteralContext(_ctx, 240);
		enterRule(_localctx, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
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
		ClassHeaderContext _localctx = new ClassHeaderContext(_ctx, 242);
		enterRule(_localctx, RULE_classHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561); modifiers();
			setState(1562); match(CLASS);
			setState(1563); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		EnumHeaderContext _localctx = new EnumHeaderContext(_ctx, 244);
		enterRule(_localctx, RULE_enumHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565); modifiers();
			setState(1566);
			_input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ENUM || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1567); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		InterfaceHeaderContext _localctx = new InterfaceHeaderContext(_ctx, 246);
		enterRule(_localctx, RULE_interfaceHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569); modifiers();
			setState(1570); match(INTERFACE);
			setState(1571); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		AnnotationHeaderContext _localctx = new AnnotationHeaderContext(_ctx, 248);
		enterRule(_localctx, RULE_annotationHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573); modifiers();
			setState(1574); match(AT);
			setState(1575); match(INTERFACE);
			setState(1576); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		TypeHeaderContext _localctx = new TypeHeaderContext(_ctx, 250);
		enterRule(_localctx, RULE_typeHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578); modifiers();
			setState(1585);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(1579); match(CLASS);
				}
				break;
			case ENUM:
				{
				setState(1580); match(ENUM);
				}
				break;
			case INTERFACE:
			case AT:
				{
				{
				setState(1582);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(1581); match(AT);
					}
				}

				setState(1584); match(INTERFACE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1587); match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, 252);
		enterRule(_localctx, RULE_methodHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589); modifiers();
			setState(1591);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1590); typeParameters();
				}
			}

			setState(1595);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1593); type();
				}
				break;
			case 2:
				{
				setState(1594); match(VOID);
				}
				break;
			}
			setState(1597); match(Identifier);
			setState(1598); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
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
		FieldHeaderContext _localctx = new FieldHeaderContext(_ctx, 254);
		enterRule(_localctx, RULE_fieldHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600); modifiers();
			setState(1601); type();
			setState(1602); match(Identifier);
			setState(1607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1603); match(LBRACKET);
				setState(1604); match(RBRACKET);
				}
				}
				setState(1609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1610);
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
		LocalVariableHeaderContext _localctx = new LocalVariableHeaderContext(_ctx, 256);
		enterRule(_localctx, RULE_localVariableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612); variableModifiers();
			setState(1613); type();
			setState(1614); match(Identifier);
			setState(1619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1615); match(LBRACKET);
				setState(1616); match(RBRACKET);
				}
				}
				setState(1621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1622);
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
		"\1f\u0659\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7\6\2\7"+
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
		"\2r\7r\2s\7s\2t\7t\2u\7u\2v\7v\2w\7w\2x\7x\2y\7y\2z\7z\2{\7{\2|\7|\2}"+
		"\7}\2~\7~\2\177\7\177\2\u0080\7\u0080\1\0\3\0\u0104\b\0\1\0\5\0\u0107"+
		"\b\0\n\0\f\0\u010a\t\0\1\0\5\0\u010d\b\0\n\0\f\0\u0110\t\0\1\1\3\1\u0113"+
		"\b\1\1\1\1\1\1\1\1\1\1\2\1\2\3\2\u011b\b\2\1\2\1\2\1\2\1\2\1\2\1\2\3\2"+
		"\u0123\b\2\1\2\1\2\1\2\4\2\u0128\b\2\13\2\f\2\u0129\1\2\1\2\3\2\u012e"+
		"\b\2\1\2\3\2\u0131\b\2\1\3\1\3\1\3\5\3\u0136\b\3\n\3\f\3\u0139\t\3\1\4"+
		"\1\4\3\4\u013d\b\4\1\5\1\5\3\5\u0141\b\5\1\6\5\6\u0144\b\6\n\6\f\6\u0147"+
		"\t\6\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\7\3\7\u0155\b\7\1\b"+
		"\5\b\u0158\b\b\n\b\f\b\u015b\t\b\1\b\3\b\u015e\b\b\1\b\5\b\u0161\b\b\n"+
		"\b\f\b\u0164\t\b\1\t\1\t\3\t\u0168\b\t\1\n\1\n\1\n\1\n\3\n\u016e\b\n\1"+
		"\n\1\n\3\n\u0172\b\n\1\n\1\n\3\n\u0176\b\n\1\n\1\n\1\13\1\13\1\13\1\13"+
		"\5\13\u017e\b\13\n\13\f\13\u0181\t\13\1\13\1\13\1\f\1\f\1\f\3\f\u0188"+
		"\b\f\1\r\1\r\1\r\5\r\u018d\b\r\n\r\f\r\u0190\t\r\1\16\1\16\1\16\1\16\1"+
		"\16\3\16\u0197\b\16\1\16\1\16\1\17\1\17\3\17\u019d\b\17\1\17\3\17\u01a0"+
		"\b\17\1\17\3\17\u01a3\b\17\1\17\1\17\1\20\1\20\1\20\5\20\u01aa\b\20\n"+
		"\20\f\20\u01ad\t\20\1\21\3\21\u01b0\b\21\1\21\1\21\3\21\u01b4\b\21\1\21"+
		"\3\21\u01b7\b\21\1\22\1\22\5\22\u01bb\b\22\n\22\f\22\u01be\t\22\1\23\1"+
		"\23\3\23\u01c2\b\23\1\24\1\24\1\24\1\24\3\24\u01c8\b\24\1\24\1\24\3\24"+
		"\u01cc\b\24\1\24\1\24\1\25\1\25\1\25\5\25\u01d3\b\25\n\25\f\25\u01d6\t"+
		"\25\1\26\1\26\5\26\u01da\b\26\n\26\f\26\u01dd\t\26\1\26\1\26\1\27\1\27"+
		"\5\27\u01e3\b\27\n\27\f\27\u01e6\t\27\1\27\1\27\1\30\1\30\3\30\u01ec\b"+
		"\30\1\30\1\30\3\30\u01f0\b\30\1\31\1\31\1\31\1\31\1\31\3\31\u01f7\b\31"+
		"\1\32\1\32\3\32\u01fb\b\32\1\32\1\32\3\32\u01ff\b\32\1\32\1\32\1\32\1"+
		"\32\5\32\u0205\b\32\n\32\f\32\u0208\t\32\1\32\1\32\3\32\u020c\b\32\1\32"+
		"\1\32\3\32\u0210\b\32\1\33\1\33\3\33\u0214\b\33\1\33\1\33\1\33\1\33\3"+
		"\33\u021a\b\33\1\33\1\33\1\34\1\34\3\34\u0220\b\34\1\34\5\34\u0223\b\34"+
		"\n\34\f\34\u0226\t\34\1\34\1\34\1\35\1\35\1\35\1\35\1\35\5\35\u022f\b"+
		"\35\n\35\f\35\u0232\t\35\1\35\1\35\1\36\1\36\1\36\5\36\u0239\b\36\n\36"+
		"\f\36\u023c\t\36\1\36\1\36\3\36\u0240\b\36\1\37\1\37\1\37\1\37\1\37\3"+
		"\37\u0247\b\37\1 \1 \3 \u024b\b \1 \1 \3 \u024f\b \1 \1 \1 \1 \5 \u0255"+
		"\b \n \f \u0258\t \1 \1 \3 \u025c\b \1 \1 \1!\1!\1!\1!\1!\5!\u0265\b!"+
		"\n!\f!\u0268\t!\1!\1!\1\"\1\"\1\"\5\"\u026f\b\"\n\"\f\"\u0272\t\"\1\""+
		"\1\"\1\"\5\"\u0277\b\"\n\"\f\"\u027a\t\"\3\"\u027c\b\"\1#\1#\1#\5#\u0281"+
		"\b#\n#\f#\u0284\t#\1$\1$\3$\u0288\b$\1%\1%\1&\1&\1&\1&\5&\u0290\b&\n&"+
		"\f&\u0293\t&\1&\1&\1&\1&\3&\u0299\b&\1\'\1\'\1\'\1\'\3\'\u029f\b\'\3\'"+
		"\u02a1\b\'\1(\1(\1(\5(\u02a6\b(\n(\f(\u02a9\t(\1)\1)\3)\u02ad\b)\1)\1"+
		")\1*\1*\1*\1*\5*\u02b5\b*\n*\f*\u02b8\t*\1*\1*\1*\4*\u02bd\b*\13*\f*\u02be"+
		"\1*\1*\3*\u02c3\b*\1+\1+\1+\1+\1+\5+\u02ca\b+\n+\f+\u02cd\t+\1,\1,\1,"+
		"\1,\1,\1-\3-\u02d5\b-\1-\1-\1-\1-\1-\1-\1-\3-\u02de\b-\1-\1-\1-\1-\3-"+
		"\u02e4\b-\1.\1.\1.\5.\u02e9\b.\n.\f.\u02ec\t.\1/\4/\u02ef\b/\13/\f/\u02f0"+
		"\1\60\1\60\1\60\3\60\u02f6\b\60\1\61\1\61\1\61\1\62\1\62\1\62\1\62\1\62"+
		"\1\62\1\63\1\63\1\63\1\63\3\63\u0305\b\63\1\63\1\63\1\64\1\64\1\64\5\64"+
		"\u030c\b\64\n\64\f\64\u030f\t\64\1\65\1\65\1\65\1\65\1\66\1\66\1\66\3"+
		"\66\u0318\b\66\1\67\1\67\1\67\1\67\5\67\u031e\b\67\n\67\f\67\u0321\t\67"+
		"\3\67\u0323\b\67\1\67\3\67\u0326\b\67\1\67\1\67\18\18\18\18\18\18\19\1"+
		"9\59\u0332\b9\n9\f9\u0335\t9\19\19\1:\1:\1:\1:\1:\1:\1:\3:\u0340\b:\1"+
		";\1;\1;\1;\1;\1;\1;\3;\u0349\b;\1;\1;\1<\1<\5<\u034f\b<\n<\f<\u0352\t"+
		"<\1<\1<\1=\1=\1=\3=\u0359\b=\1>\1>\1>\1?\1?\1?\1?\1?\5?\u0363\b?\n?\f"+
		"?\u0366\t?\1@\1@\1@\1@\1@\3@\u036d\b@\1@\1@\1@\1@\1@\1@\1@\3@\u0376\b"+
		"@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1@\1"+
		"@\1@\3@\u0390\b@\1@\1@\1@\1@\1@\1@\1@\3@\u0399\b@\1@\1@\1@\3@\u039e\b"+
		"@\1@\1@\1@\1@\1@\1@\1@\1@\3@\u03a8\b@\1A\1A\1B\5B\u03ad\bB\nB\fB\u03b0"+
		"\tB\1C\1C\5C\u03b4\bC\nC\fC\u03b7\tC\1D\1D\1D\1D\1D\1D\3D\u03bf\bD\1E"+
		"\1E\1E\1E\1E\1E\1E\1E\1E\3E\u03ca\bE\1E\3E\u03cd\bE\1F\1F\1F\1F\3F\u03d3"+
		"\bF\1F\1F\3F\u03d7\bF\1G\1G\1G\3G\u03dc\bG\1G\1G\1H\1H\1H\5H\u03e3\bH"+
		"\nH\fH\u03e6\tH\1I\3I\u03e9\bI\1I\1I\1I\1I\1I\1J\1J\5J\u03f2\bJ\nJ\fJ"+
		"\u03f5\tJ\1K\1K\1K\1K\1K\1K\1L\1L\1L\1L\5L\u0401\bL\nL\fL\u0404\tL\1L"+
		"\1L\1L\5L\u0409\bL\nL\fL\u040c\tL\1M\1M\1M\1M\1M\5M\u0413\bM\nM\fM\u0416"+
		"\tM\1N\1N\3N\u041a\bN\1O\1O\1O\1O\1O\1O\1O\1O\1O\1O\1P\1P\1P\3P\u0429"+
		"\bP\1P\1P\3P\u042d\bP\1P\1P\3P\u0431\bP\1P\1P\1P\1Q\1Q\3Q\u0438\bQ\1R"+
		"\1R\1R\1R\1S\1S\1S\5S\u0441\bS\nS\fS\u0444\tS\1T\1T\1T\1T\3T\u044a\bT"+
		"\1U\1U\1U\1U\1U\1U\1U\1U\1U\1U\1U\1U\1U\1U\1U\1U\1U\1U\1U\1U\1U\1U\1U"+
		"\1U\1U\1U\1U\1U\1U\1U\1U\3U\u046b\bU\1V\1V\1V\1V\1V\1V\3V\u0473\bV\1W"+
		"\1W\1W\5W\u0478\bW\nW\fW\u047b\tW\1X\1X\1X\5X\u0480\bX\nX\fX\u0483\tX"+
		"\1Y\1Y\1Y\5Y\u0488\bY\nY\fY\u048b\tY\1Z\1Z\1Z\5Z\u0490\bZ\nZ\fZ\u0493"+
		"\tZ\1[\1[\1[\5[\u0498\b[\n[\f[\u049b\t[\1\\\1\\\1\\\5\\\u04a0\b\\\n\\"+
		"\f\\\u04a3\t\\\1]\1]\1]\5]\u04a8\b]\n]\f]\u04ab\t]\1^\1^\1^\3^\u04b0\b"+
		"^\1_\1_\1_\1_\5_\u04b6\b_\n_\f_\u04b9\t_\1`\1`\1`\1`\1`\1`\1`\1`\1`\1"+
		"`\3`\u04c5\b`\1a\1a\1a\1a\5a\u04cb\ba\na\fa\u04ce\ta\1b\1b\1b\1b\1b\1"+
		"b\1b\1b\1b\1b\3b\u04da\bb\1c\1c\1c\1c\5c\u04e0\bc\nc\fc\u04e3\tc\1d\1"+
		"d\1d\1d\3d\u04e9\bd\1e\1e\1e\1e\5e\u04ef\be\ne\fe\u04f2\te\1f\1f\1f\1"+
		"f\1f\1f\3f\u04fa\bf\1g\1g\1g\1g\1g\1g\1g\1g\1g\1g\1g\1g\1g\3g\u0509\b"+
		"g\1h\1h\1h\5h\u050e\bh\nh\fh\u0511\th\1h\3h\u0514\bh\3h\u0516\bh\1i\1"+
		"i\1i\1i\1i\1i\1i\1i\1i\1i\3i\u0522\bi\1j\1j\1j\1j\1j\1j\5j\u052a\bj\n"+
		"j\fj\u052d\tj\1j\3j\u0530\bj\1j\1j\1j\1j\5j\u0536\bj\nj\fj\u0539\tj\1"+
		"j\3j\u053c\bj\1j\1j\1j\1j\1j\1j\1j\1j\1j\1j\1j\1j\1j\1j\5j\u054c\bj\n"+
		"j\fj\u054f\tj\1j\1j\1j\1j\1j\1j\1j\1j\3j\u0559\bj\1k\1k\3k\u055d\bk\1"+
		"k\1k\3k\u0561\bk\1l\1l\1l\1l\4l\u0567\bl\13l\fl\u0568\1l\1l\1l\1l\1l\1"+
		"l\1l\1l\1l\1l\1l\1l\1l\1l\3l\u0579\bl\1m\1m\4m\u057d\bm\13m\fm\u057e\1"+
		"m\1m\1m\1m\1m\1m\1m\4m\u0588\bm\13m\fm\u0589\1m\1m\1m\1m\1m\1m\1m\1m\1"+
		"m\1m\1m\1m\1m\1m\1m\1m\1m\1m\1m\1m\3m\u05a0\bm\1n\1n\1n\3n\u05a5\bn\1"+
		"n\1n\1n\1n\1n\1n\1n\1n\1n\1n\1n\1n\1n\1n\1n\1n\1n\3n\u05b8\bn\1o\1o\1"+
		"o\1o\1o\1o\1o\1o\1o\1o\3o\u05c4\bo\1p\1p\1p\1p\1p\1p\5p\u05cc\bp\np\f"+
		"p\u05cf\tp\1p\1p\1p\1p\1p\1p\1p\1p\1p\1p\1p\5p\u05dc\bp\np\fp\u05df\t"+
		"p\1p\1p\5p\u05e3\bp\np\fp\u05e6\tp\3p\u05e8\bp\1q\1q\3q\u05ec\bq\1r\1"+
		"r\1r\1r\5r\u05f2\br\nr\fr\u05f5\tr\3r\u05f7\br\1r\3r\u05fa\br\1r\1r\1"+
		"s\1s\3s\u0600\bs\1t\1t\1t\3t\u0605\bt\1t\1t\1t\1u\1u\3u\u060c\bu\1v\1"+
		"v\1v\1v\1w\1w\3w\u0614\bw\1w\1w\1x\1x\1y\1y\1y\1y\1z\1z\1z\1z\1{\1{\1"+
		"{\1{\1|\1|\1|\1|\1|\1}\1}\1}\1}\3}\u062f\b}\1}\3}\u0632\b}\1}\1}\1~\1"+
		"~\3~\u0638\b~\1~\1~\3~\u063c\b~\1~\1~\1~\1\177\1\177\1\177\1\177\1\177"+
		"\5\177\u0646\b\177\n\177\f\177\u0649\t\177\1\177\1\177\1\u0080\1\u0080"+
		"\1\u0080\1\u0080\1\u0080\5\u0080\u0652\b\u0080\n\u0080\f\u0080\u0655\t"+
		"\u0080\1\u0080\1\u0080\1\u0080\u0081\0\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\0\b\1\37&\2((++\1*+\1AB\2,.^a\2??bb\3\1\1\17"+
		"\17\32\32\3\1\1\17\17\32\32\u06d7\0\u0103\1\0\0\0\2\u0112\1\0\0\0\4\u0130"+
		"\1\0\0\0\6\u0132\1\0\0\0\b\u013c\1\0\0\0\n\u0140\1\0\0\0\f\u0145\1\0\0"+
		"\0\16\u0154\1\0\0\0\20\u0159\1\0\0\0\22\u0167\1\0\0\0\24\u0169\1\0\0\0"+
		"\26\u0179\1\0\0\0\30\u0184\1\0\0\0\32\u0189\1\0\0\0\34\u0191\1\0\0\0\36"+
		"\u019a\1\0\0\0 \u01a6\1\0\0\0\"\u01af\1\0\0\0$\u01b8\1\0\0\0&\u01c1\1"+
		"\0\0\0(\u01c3\1\0\0\0*\u01cf\1\0\0\0,\u01d7\1\0\0\0.\u01e0\1\0\0\0\60"+
		"\u01ef\1\0\0\0\62\u01f6\1\0\0\0\64\u01f8\1\0\0\0\66\u0211\1\0\0\08\u021d"+
		"\1\0\0\0:\u0229\1\0\0\0<\u0235\1\0\0\0>\u0246\1\0\0\0@\u0248\1\0\0\0B"+
		"\u025f\1\0\0\0D\u027b\1\0\0\0F\u027d\1\0\0\0H\u0285\1\0\0\0J\u0289\1\0"+
		"\0\0L\u0298\1\0\0\0N\u02a0\1\0\0\0P\u02a2\1\0\0\0R\u02aa\1\0\0\0T\u02c2"+
		"\1\0\0\0V\u02c4\1\0\0\0X\u02ce\1\0\0\0Z\u02e3\1\0\0\0\\\u02e5\1\0\0\0"+
		"^\u02ee\1\0\0\0`\u02f5\1\0\0\0b\u02f7\1\0\0\0d\u02fa\1\0\0\0f\u0300\1"+
		"\0\0\0h\u0308\1\0\0\0j\u0310\1\0\0\0l\u0317\1\0\0\0n\u0319\1\0\0\0p\u0329"+
		"\1\0\0\0r\u032f\1\0\0\0t\u033f\1\0\0\0v\u0341\1\0\0\0x\u034c\1\0\0\0z"+
		"\u0358\1\0\0\0|\u035a\1\0\0\0~\u035d\1\0\0\0\u0080\u03a7\1\0\0\0\u0082"+
		"\u03a9\1\0\0\0\u0084\u03ae\1\0\0\0\u0086\u03b1\1\0\0\0\u0088\u03be\1\0"+
		"\0\0\u008a\u03cc\1\0\0\0\u008c\u03ce\1\0\0\0\u008e\u03d8\1\0\0\0\u0090"+
		"\u03df\1\0\0\0\u0092\u03e8\1\0\0\0\u0094\u03ef\1\0\0\0\u0096\u03f6\1\0"+
		"\0\0\u0098\u03fc\1\0\0\0\u009a\u040d\1\0\0\0\u009c\u0419\1\0\0\0\u009e"+
		"\u041b\1\0\0\0\u00a0\u0425\1\0\0\0\u00a2\u0437\1\0\0\0\u00a4\u0439\1\0"+
		"\0\0\u00a6\u043d\1\0\0\0\u00a8\u0445\1\0\0\0\u00aa\u046a\1\0\0\0\u00ac"+
		"\u046c\1\0\0\0\u00ae\u0474\1\0\0\0\u00b0\u047c\1\0\0\0\u00b2\u0484\1\0"+
		"\0\0\u00b4\u048c\1\0\0\0\u00b6\u0494\1\0\0\0\u00b8\u049c\1\0\0\0\u00ba"+
		"\u04a4\1\0\0\0\u00bc\u04ac\1\0\0\0\u00be\u04b1\1\0\0\0\u00c0\u04c4\1\0"+
		"\0\0\u00c2\u04c6\1\0\0\0\u00c4\u04d9\1\0\0\0\u00c6\u04db\1\0\0\0\u00c8"+
		"\u04e8\1\0\0\0\u00ca\u04ea\1\0\0\0\u00cc\u04f9\1\0\0\0\u00ce\u0508\1\0"+
		"\0\0\u00d0\u0515\1\0\0\0\u00d2\u0521\1\0\0\0\u00d4\u0558\1\0\0\0\u00d6"+
		"\u055a\1\0\0\0\u00d8\u0578\1\0\0\0\u00da\u059f\1\0\0\0\u00dc\u05b7\1\0"+
		"\0\0\u00de\u05c3\1\0\0\0\u00e0\u05e7\1\0\0\0\u00e2\u05eb\1\0\0\0\u00e4"+
		"\u05ed\1\0\0\0\u00e6\u05ff\1\0\0\0\u00e8\u0601\1\0\0\0\u00ea\u0609\1\0"+
		"\0\0\u00ec\u060d\1\0\0\0\u00ee\u0611\1\0\0\0\u00f0\u0617\1\0\0\0\u00f2"+
		"\u0619\1\0\0\0\u00f4\u061d\1\0\0\0\u00f6\u0621\1\0\0\0\u00f8\u0625\1\0"+
		"\0\0\u00fa\u062a\1\0\0\0\u00fc\u0635\1\0\0\0\u00fe\u0640\1\0\0\0\u0100"+
		"\u064c\1\0\0\0\u0102\u0104\3\2\1\0\u0103\u0102\1\0\0\0\u0103\u0104\1\0"+
		"\0\0\u0104\u0108\1\0\0\0\u0105\u0107\3\4\2\0\u0106\u0105\1\0\0\0\u0107"+
		"\u010a\1\0\0\0\u0108\u0106\1\0\0\0\u0108\u0109\1\0\0\0\u0109\u010e\1\0"+
		"\0\0\u010a\u0108\1\0\0\0\u010b\u010d\3\b\4\0\u010c\u010b\1\0\0\0\u010d"+
		"\u0110\1\0\0\0\u010e\u010c\1\0\0\0\u010e\u010f\1\0\0\0\u010f\1\1\0\0\0"+
		"\u0110\u010e\1\0\0\0\u0111\u0113\3^/\0\u0112\u0111\1\0\0\0\u0112\u0113"+
		"\1\0\0\0\u0113\u0114\1\0\0\0\u0114\u0115\5\2\0\0\u0115\u0116\3\\.\0\u0116"+
		"\u0117\5\1\0\0\u0117\3\1\0\0\0\u0118\u011a\5\3\0\0\u0119\u011b\5\f\0\0"+
		"\u011a\u0119\1\0\0\0\u011a\u011b\1\0\0\0\u011b\u011c\1\0\0\0\u011c\u011d"+
		"\5b\0\0\u011d\u011e\5\4\0\0\u011e\u011f\5\5\0\0\u011f\u0131\5\1\0\0\u0120"+
		"\u0122\5\3\0\0\u0121\u0123\5\f\0\0\u0122\u0121\1\0\0\0\u0122\u0123\1\0"+
		"\0\0\u0123\u0124\1\0\0\0\u0124\u0127\5b\0\0\u0125\u0126\5\4\0\0\u0126"+
		"\u0128\5b\0\0\u0127\u0125\1\0\0\0\u0128\u0129\1\0\0\0\u0129\u0127\1\0"+
		"\0\0\u0129\u012a\1\0\0\0\u012a\u012d\1\0\0\0\u012b\u012c\5\4\0\0\u012c"+
		"\u012e\5\5\0\0\u012d\u012b\1\0\0\0\u012d\u012e\1\0\0\0\u012e\u012f\1\0"+
		"\0\0\u012f\u0131\5\1\0\0\u0130\u0118\1\0\0\0\u0130\u0120\1\0\0\0\u0131"+
		"\5\1\0\0\0\u0132\u0137\5b\0\0\u0133\u0134\5\4\0\0\u0134\u0136\5b\0\0\u0135"+
		"\u0133\1\0\0\0\u0136\u0139\1\0\0\0\u0137\u0135\1\0\0\0\u0137\u0138\1\0"+
		"\0\0\u0138\7\1\0\0\0\u0139\u0137\1\0\0\0\u013a\u013d\3\n\5\0\u013b\u013d"+
		"\5\1\0\0\u013c\u013a\1\0\0\0\u013c\u013b\1\0\0\0\u013d\t\1\0\0\0\u013e"+
		"\u0141\3\22\t\0\u013f\u0141\3&\23\0\u0140\u013e\1\0\0\0\u0140\u013f\1"+
		"\0\0\0\u0141\13\1\0\0\0\u0142\u0144\3\16\7\0\u0143\u0142\1\0\0\0\u0144"+
		"\u0147\1\0\0\0\u0145\u0143\1\0\0\0\u0145\u0146\1\0\0\0\u0146\r\1\0\0\0"+
		"\u0147\u0145\1\0\0\0\u0148\u0155\3`\60\0\u0149\u0155\5\b\0\0\u014a\u0155"+
		"\5\t\0\0\u014b\u0155\5\n\0\0\u014c\u0155\5\f\0\0\u014d\u0155\5\13\0\0"+
		"\u014e\u0155\5\r\0\0\u014f\u0155\5\33\0\0\u0150\u0155\5\34\0\0\u0151\u0155"+
		"\5\35\0\0\u0152\u0155\5\36\0\0\u0153\u0155\5\16\0\0\u0154\u0148\1\0\0"+
		"\0\u0154\u0149\1\0\0\0\u0154\u014a\1\0\0\0\u0154\u014b\1\0\0\0\u0154\u014c"+
		"\1\0\0\0\u0154\u014d\1\0\0\0\u0154\u014e\1\0\0\0\u0154\u014f\1\0\0\0\u0154"+
		"\u0150\1\0\0\0\u0154\u0151\1\0\0\0\u0154\u0152\1\0\0\0\u0154\u0153\1\0"+
		"\0\0\u0155\17\1\0\0\0\u0156\u0158\3`\60\0\u0157\u0156\1\0\0\0\u0158\u015b"+
		"\1\0\0\0\u0159\u0157\1\0\0\0\u0159\u015a\1\0\0\0\u015a\u015d\1\0\0\0\u015b"+
		"\u0159\1\0\0\0\u015c\u015e\5\r\0\0\u015d\u015c\1\0\0\0\u015d\u015e\1\0"+
		"\0\0\u015e\u0162\1\0\0\0\u015f\u0161\3`\60\0\u0160\u015f\1\0\0\0\u0161"+
		"\u0164\1\0\0\0\u0162\u0160\1\0\0\0\u0162\u0163\1\0\0\0\u0163\21\1\0\0"+
		"\0\u0164\u0162\1\0\0\0\u0165\u0168\3\24\n\0\u0166\u0168\3\34\16\0\u0167"+
		"\u0165\1\0\0\0\u0167\u0166\1\0\0\0\u0168\23\1\0\0\0\u0169\u016a\3\f\6"+
		"\0\u016a\u016b\5\6\0\0\u016b\u016d\5b\0\0\u016c\u016e\3\26\13\0\u016d"+
		"\u016c\1\0\0\0\u016d\u016e\1\0\0\0\u016e\u0171\1\0\0\0\u016f\u0170\5("+
		"\0\0\u0170\u0172\3D\"\0\u0171\u016f\1\0\0\0\u0171\u0172\1\0\0\0\u0172"+
		"\u0175\1\0\0\0\u0173\u0174\5\7\0\0\u0174\u0176\3*\25\0\u0175\u0173\1\0"+
		"\0\0\u0175\u0176\1\0\0\0\u0176\u0177\1\0\0\0\u0177\u0178\3,\26\0\u0178"+
		"\25\1\0\0\0\u0179\u017a\5Z\0\0\u017a\u017f\3\30\f\0\u017b\u017c\5\17\0"+
		"\0\u017c\u017e\3\30\f\0\u017d\u017b\1\0\0\0\u017e\u0181\1\0\0\0\u017f"+
		"\u017d\1\0\0\0\u017f\u0180\1\0\0\0\u0180\u0182\1\0\0\0\u0181\u017f\1\0"+
		"\0\0\u0182\u0183\5Y\0\0\u0183\27\1\0\0\0\u0184\u0187\5b\0\0\u0185\u0186"+
		"\5(\0\0\u0186\u0188\3\32\r\0\u0187\u0185\1\0\0\0\u0187\u0188\1\0\0\0\u0188"+
		"\31\1\0\0\0\u0189\u018e\3D\"\0\u018a\u018b\5L\0\0\u018b\u018d\3D\"\0\u018c"+
		"\u018a\1\0\0\0\u018d\u0190\1\0\0\0\u018e\u018c\1\0\0\0\u018e\u018f\1\0"+
		"\0\0\u018f\33\1\0\0\0\u0190\u018e\1\0\0\0\u0191\u0192\3\f\6\0\u0192\u0193"+
		"\5?\0\0\u0193\u0196\5b\0\0\u0194\u0195\5\7\0\0\u0195\u0197\3*\25\0\u0196"+
		"\u0194\1\0\0\0\u0196\u0197\1\0\0\0\u0197\u0198\1\0\0\0\u0198\u0199\3\36"+
		"\17\0\u0199\35\1\0\0\0\u019a\u019c\5\20\0\0\u019b\u019d\3 \20\0\u019c"+
		"\u019b\1\0\0\0\u019c\u019d\1\0\0\0\u019d\u019f\1\0\0\0\u019e\u01a0\5\17"+
		"\0\0\u019f\u019e\1\0\0\0\u019f\u01a0\1\0\0\0\u01a0\u01a2\1\0\0\0\u01a1"+
		"\u01a3\3$\22\0\u01a2\u01a1\1\0\0\0\u01a2\u01a3\1\0\0\0\u01a3\u01a4\1\0"+
		"\0\0\u01a4\u01a5\5\21\0\0\u01a5\37\1\0\0\0\u01a6\u01ab\3\"\21\0\u01a7"+
		"\u01a8\5\17\0\0\u01a8\u01aa\3\"\21\0\u01a9\u01a7\1\0\0\0\u01aa\u01ad\1"+
		"\0\0\0\u01ab\u01a9\1\0\0\0\u01ab\u01ac\1\0\0\0\u01ac!\1\0\0\0\u01ad\u01ab"+
		"\1\0\0\0\u01ae\u01b0\3^/\0\u01af\u01ae\1\0\0\0\u01af\u01b0\1\0\0\0\u01b0"+
		"\u01b1\1\0\0\0\u01b1\u01b3\5b\0\0\u01b2\u01b4\3\u00eew\0\u01b3\u01b2\1"+
		"\0\0\0\u01b3\u01b4\1\0\0\0\u01b4\u01b6\1\0\0\0\u01b5\u01b7\3,\26\0\u01b6"+
		"\u01b5\1\0\0\0\u01b6\u01b7\1\0\0\0\u01b7#\1\0\0\0\u01b8\u01bc\5\1\0\0"+
		"\u01b9\u01bb\3\60\30\0\u01ba\u01b9\1\0\0\0\u01bb\u01be\1\0\0\0\u01bc\u01ba"+
		"\1\0\0\0\u01bc\u01bd\1\0\0\0\u01bd%\1\0\0\0\u01be\u01bc\1\0\0\0\u01bf"+
		"\u01c2\3(\24\0\u01c0\u01c2\3p8\0\u01c1\u01bf\1\0\0\0\u01c1\u01c0\1\0\0"+
		"\0\u01c2\'\1\0\0\0\u01c3\u01c4\3\f\6\0\u01c4\u01c5\5\27\0\0\u01c5\u01c7"+
		"\5b\0\0\u01c6\u01c8\3\26\13\0\u01c7\u01c6\1\0\0\0\u01c7\u01c8\1\0\0\0"+
		"\u01c8\u01cb\1\0\0\0\u01c9\u01ca\5(\0\0\u01ca\u01cc\3*\25\0\u01cb\u01c9"+
		"\1\0\0\0\u01cb\u01cc\1\0\0\0\u01cc\u01cd\1\0\0\0\u01cd\u01ce\3.\27\0\u01ce"+
		")\1\0\0\0\u01cf\u01d4\3D\"\0\u01d0\u01d1\5\17\0\0\u01d1\u01d3\3D\"\0\u01d2"+
		"\u01d0\1\0\0\0\u01d3\u01d6\1\0\0\0\u01d4\u01d2\1\0\0\0\u01d4\u01d5\1\0"+
		"\0\0\u01d5+\1\0\0\0\u01d6\u01d4\1\0\0\0\u01d7\u01db\5\20\0\0\u01d8\u01da"+
		"\3\60\30\0\u01d9\u01d8\1\0\0\0\u01da\u01dd\1\0\0\0\u01db\u01d9\1\0\0\0"+
		"\u01db\u01dc\1\0\0\0\u01dc\u01de\1\0\0\0\u01dd\u01db\1\0\0\0\u01de\u01df"+
		"\5\21\0\0\u01df-\1\0\0\0\u01e0\u01e4\5\20\0\0\u01e1\u01e3\3>\37\0\u01e2"+
		"\u01e1\1\0\0\0\u01e3\u01e6\1\0\0\0\u01e4\u01e2\1\0\0\0\u01e4\u01e5\1\0"+
		"\0\0\u01e5\u01e7\1\0\0\0\u01e6\u01e4\1\0\0\0\u01e7\u01e8\5\21\0\0\u01e8"+
		"/\1\0\0\0\u01e9\u01f0\5\1\0\0\u01ea\u01ec\5\f\0\0\u01eb\u01ea\1\0\0\0"+
		"\u01eb\u01ec\1\0\0\0\u01ec\u01ed\1\0\0\0\u01ed\u01f0\3x<\0\u01ee\u01f0"+
		"\3\62\31\0\u01ef\u01e9\1\0\0\0\u01ef\u01eb\1\0\0\0\u01ef\u01ee\1\0\0\0"+
		"\u01f0\61\1\0\0\0\u01f1\u01f7\3\66\33\0\u01f2\u01f7\3:\35\0\u01f3\u01f7"+
		"\3\64\32\0\u01f4\u01f7\3\22\t\0\u01f5\u01f7\3&\23\0\u01f6\u01f1\1\0\0"+
		"\0\u01f6\u01f2\1\0\0\0\u01f6\u01f3\1\0\0\0\u01f6\u01f4\1\0\0\0\u01f6\u01f5"+
		"\1\0\0\0\u01f7\63\1\0\0\0\u01f8\u01fa\3\f\6\0\u01f9\u01fb\3\26\13\0\u01fa"+
		"\u01f9\1\0\0\0\u01fa\u01fb\1\0\0\0\u01fb\u01fe\1\0\0\0\u01fc\u01ff\3D"+
		"\"\0\u01fd\u01ff\5\26\0\0\u01fe\u01fc\1\0\0\0\u01fe\u01fd\1\0\0\0\u01ff"+
		"\u0200\1\0\0\0\u0200\u0201\5b\0\0\u0201\u0206\3R)\0\u0202\u0203\5\22\0"+
		"\0\u0203\u0205\5\23\0\0\u0204\u0202\1\0\0\0\u0205\u0208\1\0\0\0\u0206"+
		"\u0204\1\0\0\0\u0206\u0207\1\0\0\0\u0207\u020b\1\0\0\0\u0208\u0206\1\0"+
		"\0\0\u0209\u020a\5\31\0\0\u020a\u020c\3P(\0\u020b\u0209\1\0\0\0\u020b"+
		"\u020c\1\0\0\0\u020c\u020f\1\0\0\0\u020d\u0210\3x<\0\u020e\u0210\5\1\0"+
		"\0\u020f\u020d\1\0\0\0\u020f\u020e\1\0\0\0\u0210\65\1\0\0\0\u0211\u0213"+
		"\3\f\6\0\u0212\u0214\3\26\13\0\u0213\u0212\1\0\0\0\u0213\u0214\1\0\0\0"+
		"\u0214\u0215\1\0\0\0\u0215\u0216\5b\0\0\u0216\u0219\3R)\0\u0217\u0218"+
		"\5\31\0\0\u0218\u021a\3P(\0\u0219\u0217\1\0\0\0\u0219\u021a\1\0\0\0\u021a"+
		"\u021b\1\0\0\0\u021b\u021c\38\34\0\u021c\67\1\0\0\0\u021d\u021f\5\20\0"+
		"\0\u021e\u0220\3Z-\0\u021f\u021e\1\0\0\0\u021f\u0220\1\0\0\0\u0220\u0224"+
		"\1\0\0\0\u0221\u0223\3z=\0\u0222\u0221\1\0\0\0\u0223\u0226\1\0\0\0\u0224"+
		"\u0222\1\0\0\0\u0224\u0225\1\0\0\0\u0225\u0227\1\0\0\0\u0226\u0224\1\0"+
		"\0\0\u0227\u0228\5\21\0\0\u02289\1\0\0\0\u0229\u022a\3\f\6\0\u022a\u022b"+
		"\3D\"\0\u022b\u0230\3<\36\0\u022c\u022d\5\17\0\0\u022d\u022f\3<\36\0\u022e"+
		"\u022c\1\0\0\0\u022f\u0232\1\0\0\0\u0230\u022e\1\0\0\0\u0230\u0231\1\0"+
		"\0\0\u0231\u0233\1\0\0\0\u0232\u0230\1\0\0\0\u0233\u0234\5\1\0\0\u0234"+
		";\1\0\0\0\u0235\u023a\5b\0\0\u0236\u0237\5\22\0\0\u0237\u0239\5\23\0\0"+
		"\u0238\u0236\1\0\0\0\u0239\u023c\1\0\0\0\u023a\u0238\1\0\0\0\u023a\u023b"+
		"\1\0\0\0\u023b\u023f\1\0\0\0\u023c\u023a\1\0\0\0\u023d\u023e\5\32\0\0"+
		"\u023e\u0240\3\u00e2q\0\u023f\u023d\1\0\0\0\u023f\u0240\1\0\0\0\u0240"+
		"=\1\0\0\0\u0241\u0247\3B!\0\u0242\u0247\3@ \0\u0243\u0247\3&\23\0\u0244"+
		"\u0247\3\22\t\0\u0245\u0247\5\1\0\0\u0246\u0241\1\0\0\0\u0246\u0242\1"+
		"\0\0\0\u0246\u0243\1\0\0\0\u0246\u0244\1\0\0\0\u0246\u0245\1\0\0\0\u0247"+
		"?\1\0\0\0\u0248\u024a\3\f\6\0\u0249\u024b\3\26\13\0\u024a\u0249\1\0\0"+
		"\0\u024a\u024b\1\0\0\0\u024b\u024e\1\0\0\0\u024c\u024f\3D\"\0\u024d\u024f"+
		"\5\26\0\0\u024e\u024c\1\0\0\0\u024e\u024d\1\0\0\0\u024f\u0250\1\0\0\0"+
		"\u0250\u0251\5b\0\0\u0251\u0256\3R)\0\u0252\u0253\5\22\0\0\u0253\u0255"+
		"\5\23\0\0\u0254\u0252\1\0\0\0\u0255\u0258\1\0\0\0\u0256\u0254\1\0\0\0"+
		"\u0256\u0257\1\0\0\0\u0257\u025b\1\0\0\0\u0258\u0256\1\0\0\0\u0259\u025a"+
		"\5\31\0\0\u025a\u025c\3P(\0\u025b\u0259\1\0\0\0\u025b\u025c\1\0\0\0\u025c"+
		"\u025d\1\0\0\0\u025d\u025e\5\1\0\0\u025eA\1\0\0\0\u025f\u0260\3\f\6\0"+
		"\u0260\u0261\3D\"\0\u0261\u0266\3<\36\0\u0262\u0263\5\17\0\0\u0263\u0265"+
		"\3<\36\0\u0264\u0262\1\0\0\0\u0265\u0268\1\0\0\0\u0266\u0264\1\0\0\0\u0266"+
		"\u0267\1\0\0\0\u0267\u0269\1\0\0\0\u0268\u0266\1\0\0\0\u0269\u026a\5\1"+
		"\0\0\u026aC\1\0\0\0\u026b\u0270\3F#\0\u026c\u026d\5\22\0\0\u026d\u026f"+
		"\5\23\0\0\u026e\u026c\1\0\0\0\u026f\u0272\1\0\0\0\u0270\u026e\1\0\0\0"+
		"\u0270\u0271\1\0\0\0\u0271\u027c\1\0\0\0\u0272\u0270\1\0\0\0\u0273\u0278"+
		"\3J%\0\u0274\u0275\5\22\0\0\u0275\u0277\5\23\0\0\u0276\u0274\1\0\0\0\u0277"+
		"\u027a\1\0\0\0\u0278\u0276\1\0\0\0\u0278\u0279\1\0\0\0\u0279\u027c\1\0"+
		"\0\0\u027a\u0278\1\0\0\0\u027b\u026b\1\0\0\0\u027b\u0273\1\0\0\0\u027c"+
		"E\1\0\0\0\u027d\u0282\3H$\0\u027e\u027f\5\4\0\0\u027f\u0281\3H$\0\u0280"+
		"\u027e\1\0\0\0\u0281\u0284\1\0\0\0\u0282\u0280\1\0\0\0\u0282\u0283\1\0"+
		"\0\0\u0283G\1\0\0\0\u0284\u0282\1\0\0\0\u0285\u0287\5b\0\0\u0286\u0288"+
		"\3L&\0\u0287\u0286\1\0\0\0\u0287\u0288\1\0\0\0\u0288I\1\0\0\0\u0289\u028a"+
		"\7\0\0\0\u028aK\1\0\0\0\u028b\u028c\5Z\0\0\u028c\u0291\3N\'\0\u028d\u028e"+
		"\5\17\0\0\u028e\u0290\3N\'\0\u028f\u028d\1\0\0\0\u0290\u0293\1\0\0\0\u0291"+
		"\u028f\1\0\0\0\u0291\u0292\1\0\0\0\u0292\u0294\1\0\0\0\u0293\u0291\1\0"+
		"\0\0\u0294\u0295\5Y\0\0\u0295\u0299\1\0\0\0\u0296\u0297\5Z\0\0\u0297\u0299"+
		"\5Y\0\0\u0298\u028b\1\0\0\0\u0298\u0296\1\0\0\0\u0299M\1\0\0\0\u029a\u02a1"+
		"\3D\"\0\u029b\u029e\5\'\0\0\u029c\u029d\7\1\0\0\u029d\u029f\3D\"\0\u029e"+
		"\u029c\1\0\0\0\u029e\u029f\1\0\0\0\u029f\u02a1\1\0\0\0\u02a0\u029a\1\0"+
		"\0\0\u02a0\u029b\1\0\0\0\u02a1O\1\0\0\0\u02a2\u02a7\3\\.\0\u02a3\u02a4"+
		"\5\17\0\0\u02a4\u02a6\3\\.\0\u02a5\u02a3\1\0\0\0\u02a6\u02a9\1\0\0\0\u02a7"+
		"\u02a5\1\0\0\0\u02a7\u02a8\1\0\0\0\u02a8Q\1\0\0\0\u02a9\u02a7\1\0\0\0"+
		"\u02aa\u02ac\5\24\0\0\u02ab\u02ad\3T*\0\u02ac\u02ab\1\0\0\0\u02ac\u02ad"+
		"\1\0\0\0\u02ad\u02ae\1\0\0\0\u02ae\u02af\5\25\0\0\u02afS\1\0\0\0\u02b0"+
		"\u02c3\3X,\0\u02b1\u02b6\3V+\0\u02b2\u02b3\5\17\0\0\u02b3\u02b5\3V+\0"+
		"\u02b4\u02b2\1\0\0\0\u02b5\u02b8\1\0\0\0\u02b6\u02b4\1\0\0\0\u02b6\u02b7"+
		"\1\0\0\0\u02b7\u02c3\1\0\0\0\u02b8\u02b6\1\0\0\0\u02b9\u02ba\3V+\0\u02ba"+
		"\u02bb\5\17\0\0\u02bb\u02bd\1\0\0\0\u02bc\u02b9\1\0\0\0\u02bd\u02be\1"+
		"\0\0\0\u02be\u02bc\1\0\0\0\u02be\u02bf\1\0\0\0\u02bf\u02c0\1\0\0\0\u02c0"+
		"\u02c1\3X,\0\u02c1\u02c3\1\0\0\0\u02c2\u02b0\1\0\0\0\u02c2\u02b1\1\0\0"+
		"\0\u02c2\u02bc\1\0\0\0\u02c3U\1\0\0\0\u02c4\u02c5\3\20\b\0\u02c5\u02c6"+
		"\3D\"\0\u02c6\u02cb\5b\0\0\u02c7\u02c8\5\22\0\0\u02c8\u02ca\5\23\0\0\u02c9"+
		"\u02c7\1\0\0\0\u02ca\u02cd\1\0\0\0\u02cb\u02c9\1\0\0\0\u02cb\u02cc\1\0"+
		"\0\0\u02ccW\1\0\0\0\u02cd\u02cb\1\0\0\0\u02ce\u02cf\3\20\b\0\u02cf\u02d0"+
		"\3D\"\0\u02d0\u02d1\5)\0\0\u02d1\u02d2\5b\0\0\u02d2Y\1\0\0\0\u02d3\u02d5"+
		"\3\u00ecv\0\u02d4\u02d3\1\0\0\0\u02d4\u02d5\1\0\0\0\u02d5\u02d6\1\0\0"+
		"\0\u02d6\u02d7\7\2\0\0\u02d7\u02d8\3\u00eew\0\u02d8\u02d9\5\1\0\0\u02d9"+
		"\u02e4\1\0\0\0\u02da\u02db\3\u00d4j\0\u02db\u02dd\5\4\0\0\u02dc\u02de"+
		"\3\u00ecv\0\u02dd\u02dc\1\0\0\0\u02dd\u02de\1\0\0\0\u02de\u02df\1\0\0"+
		"\0\u02df\u02e0\5+\0\0\u02e0\u02e1\3\u00eew\0\u02e1\u02e2\5\1\0\0\u02e2"+
		"\u02e4\1\0\0\0\u02e3\u02d4\1\0\0\0\u02e3\u02da\1\0\0\0\u02e4[\1\0\0\0"+
		"\u02e5\u02ea\5b\0\0\u02e6\u02e7\5\4\0\0\u02e7\u02e9\5b\0\0\u02e8\u02e6"+
		"\1\0\0\0\u02e9\u02ec\1\0\0\0\u02ea\u02e8\1\0\0\0\u02ea\u02eb\1\0\0\0\u02eb"+
		"]\1\0\0\0\u02ec\u02ea\1\0\0\0\u02ed\u02ef\3`\60\0\u02ee\u02ed\1\0\0\0"+
		"\u02ef\u02f0\1\0\0\0\u02f0\u02ee\1\0\0\0\u02f0\u02f1\1\0\0\0\u02f1_\1"+
		"\0\0\0\u02f2\u02f6\3b\61\0\u02f3\u02f6\3d\62\0\u02f4\u02f6\3f\63\0\u02f5"+
		"\u02f2\1\0\0\0\u02f5\u02f3\1\0\0\0\u02f5\u02f4\1\0\0\0\u02f6a\1\0\0\0"+
		"\u02f7\u02f8\5/\0\0\u02f8\u02f9\3\\.\0\u02f9c\1\0\0\0\u02fa\u02fb\5/\0"+
		"\0\u02fb\u02fc\3\\.\0\u02fc\u02fd\5\24\0\0\u02fd\u02fe\3l\66\0\u02fe\u02ff"+
		"\5\25\0\0\u02ffe\1\0\0\0\u0300\u0301\5/\0\0\u0301\u0302\3\\.\0\u0302\u0304"+
		"\5\24\0\0\u0303\u0305\3h\64\0\u0304\u0303\1\0\0\0\u0304\u0305\1\0\0\0"+
		"\u0305\u0306\1\0\0\0\u0306\u0307\5\25\0\0\u0307g\1\0\0\0\u0308\u030d\3"+
		"j\65\0\u0309\u030a\5\17\0\0\u030a\u030c\3j\65\0\u030b\u0309\1\0\0\0\u030c"+
		"\u030f\1\0\0\0\u030d\u030b\1\0\0\0\u030d\u030e\1\0\0\0\u030ei\1\0\0\0"+
		"\u030f\u030d\1\0\0\0\u0310\u0311\5b\0\0\u0311\u0312\5\32\0\0\u0312\u0313"+
		"\3l\66\0\u0313k\1\0\0\0\u0314\u0318\3\u00acV\0\u0315\u0318\3`\60\0\u0316"+
		"\u0318\3n\67\0\u0317\u0314\1\0\0\0\u0317\u0315\1\0\0\0\u0317\u0316\1\0"+
		"\0\0\u0318m\1\0\0\0\u0319\u0322\5\20\0\0\u031a\u031f\3l\66\0\u031b\u031c"+
		"\5\17\0\0\u031c\u031e\3l\66\0\u031d\u031b\1\0\0\0\u031e\u0321\1\0\0\0"+
		"\u031f\u031d\1\0\0\0\u031f\u0320\1\0\0\0\u0320\u0323\1\0\0\0\u0321\u031f"+
		"\1\0\0\0\u0322\u031a\1\0\0\0\u0322\u0323\1\0\0\0\u0323\u0325\1\0\0\0\u0324"+
		"\u0326\5\17\0\0\u0325\u0324\1\0\0\0\u0325\u0326\1\0\0\0\u0326\u0327\1"+
		"\0\0\0\u0327\u0328\5\21\0\0\u0328o\1\0\0\0\u0329\u032a\3\f\6\0\u032a\u032b"+
		"\5/\0\0\u032b\u032c\5\27\0\0\u032c\u032d\5b\0\0\u032d\u032e\3r9\0\u032e"+
		"q\1\0\0\0\u032f\u0333\5\20\0\0\u0330\u0332\3t:\0\u0331\u0330\1\0\0\0\u0332"+
		"\u0335\1\0\0\0\u0333\u0331\1\0\0\0\u0333\u0334\1\0\0\0\u0334\u0336\1\0"+
		"\0\0\u0335\u0333\1\0\0\0\u0336\u0337\5\21\0\0\u0337s\1\0\0\0\u0338\u0340"+
		"\3v;\0\u0339\u0340\3B!\0\u033a\u0340\3\24\n\0\u033b\u0340\3(\24\0\u033c"+
		"\u0340\3\34\16\0\u033d\u0340\3p8\0\u033e\u0340\5\1\0\0\u033f\u0338\1\0"+
		"\0\0\u033f\u0339\1\0\0\0\u033f\u033a\1\0\0\0\u033f\u033b\1\0\0\0\u033f"+
		"\u033c\1\0\0\0\u033f\u033d\1\0\0\0\u033f\u033e\1\0\0\0\u0340u\1\0\0\0"+
		"\u0341\u0342\3\f\6\0\u0342\u0343\3D\"\0\u0343\u0344\5b\0\0\u0344\u0345"+
		"\5\24\0\0\u0345\u0348\5\25\0\0\u0346\u0347\5\60\0\0\u0347\u0349\3l\66"+
		"\0\u0348\u0346\1\0\0\0\u0348\u0349\1\0\0\0\u0349\u034a\1\0\0\0\u034a\u034b"+
		"\5\1\0\0\u034bw\1\0\0\0\u034c\u0350\5\20\0\0\u034d\u034f\3z=\0\u034e\u034d"+
		"\1\0\0\0\u034f\u0352\1\0\0\0\u0350\u034e\1\0\0\0\u0350\u0351\1\0\0\0\u0351"+
		"\u0353\1\0\0\0\u0352\u0350\1\0\0\0\u0353\u0354\5\21\0\0\u0354y\1\0\0\0"+
		"\u0355\u0359\3|>\0\u0356\u0359\3\n\5\0\u0357\u0359\3\u0080@\0\u0358\u0355"+
		"\1\0\0\0\u0358\u0356\1\0\0\0\u0358\u0357\1\0\0\0\u0359{\1\0\0\0\u035a"+
		"\u035b\3~?\0\u035b\u035c\5\1\0\0\u035c}\1\0\0\0\u035d\u035e\3\20\b\0\u035e"+
		"\u035f\3D\"\0\u035f\u0364\3<\36\0\u0360\u0361\5\17\0\0\u0361\u0363\3<"+
		"\36\0\u0362\u0360\1\0\0\0\u0363\u0366\1\0\0\0\u0364\u0362\1\0\0\0\u0364"+
		"\u0365\1\0\0\0\u0365\177\1\0\0\0\u0366\u0364\1\0\0\0\u0367\u03a8\3x<\0"+
		"\u0368\u0369\5@\0\0\u0369\u036c\3\u00a8T\0\u036a\u036b\5\61\0\0\u036b"+
		"\u036d\3\u00a8T\0\u036c\u036a\1\0\0\0\u036c\u036d\1\0\0\0\u036d\u036e"+
		"\1\0\0\0\u036e\u036f\5\1\0\0\u036f\u03a8\1\0\0\0\u0370\u0371\5\62\0\0"+
		"\u0371\u0372\3\u00a4R\0\u0372\u0375\3\u0080@\0\u0373\u0374\5\63\0\0\u0374"+
		"\u0376\3\u0080@\0\u0375\u0373\1\0\0\0\u0375\u0376\1\0\0\0\u0376\u03a8"+
		"\1\0\0\0\u0377\u03a8\3\u009cN\0\u0378\u0379\5\65\0\0\u0379\u037a\3\u00a4"+
		"R\0\u037a\u037b\3\u0080@\0\u037b\u03a8\1\0\0\0\u037c\u037d\5\66\0\0\u037d"+
		"\u037e\3\u0080@\0\u037e\u037f\5\65\0\0\u037f\u0380\3\u00a4R\0\u0380\u0381"+
		"\5\1\0\0\u0381\u03a8\1\0\0\0\u0382\u03a8\3\u008aE\0\u0383\u0384\59\0\0"+
		"\u0384\u0385\3\u00a4R\0\u0385\u0386\5\20\0\0\u0386\u0387\3\u0084B\0\u0387"+
		"\u0388\5\21\0\0\u0388\u03a8\1\0\0\0\u0389\u038a\5\34\0\0\u038a\u038b\3"+
		"\u00a4R\0\u038b\u038c\3x<\0\u038c\u03a8\1\0\0\0\u038d\u038f\5:\0\0\u038e"+
		"\u0390\3\u00a8T\0\u038f\u038e\1\0\0\0\u038f\u0390\1\0\0\0\u0390\u0391"+
		"\1\0\0\0\u0391\u03a8\5\1\0\0\u0392\u0393\5\30\0\0\u0393\u0394\3\u00a8"+
		"T\0\u0394\u0395\5\1\0\0\u0395\u03a8\1\0\0\0\u0396\u0398\5;\0\0\u0397\u0399"+
		"\5b\0\0\u0398\u0397\1\0\0\0\u0398\u0399\1\0\0\0\u0399\u039a\1\0\0\0\u039a"+
		"\u03a8\5\1\0\0\u039b\u039d\5<\0\0\u039c\u039e\5b\0\0\u039d\u039c\1\0\0"+
		"\0\u039d\u039e\1\0\0\0\u039e\u039f\1\0\0\0\u039f\u03a8\5\1\0\0\u03a0\u03a1"+
		"\3\u00a8T\0\u03a1\u03a2\5\1\0\0\u03a2\u03a8\1\0\0\0\u03a3\u03a4\5b\0\0"+
		"\u03a4\u03a5\5\61\0\0\u03a5\u03a8\3\u0080@\0\u03a6\u03a8\3\u0082A\0\u03a7"+
		"\u0367\1\0\0\0\u03a7\u0368\1\0\0\0\u03a7\u0370\1\0\0\0\u03a7\u0377\1\0"+
		"\0\0\u03a7\u0378\1\0\0\0\u03a7\u037c\1\0\0\0\u03a7\u0382\1\0\0\0\u03a7"+
		"\u0383\1\0\0\0\u03a7\u0389\1\0\0\0\u03a7\u038d\1\0\0\0\u03a7\u0392\1\0"+
		"\0\0\u03a7\u0396\1\0\0\0\u03a7\u039b\1\0\0\0\u03a7\u03a0\1\0\0\0\u03a7"+
		"\u03a3\1\0\0\0\u03a7\u03a6\1\0\0\0\u03a8\u0081\1\0\0\0\u03a9\u03aa\5\1"+
		"\0\0\u03aa\u0083\1\0\0\0\u03ab\u03ad\3\u0086C\0\u03ac\u03ab\1\0\0\0\u03ad"+
		"\u03b0\1\0\0\0\u03ae\u03ac\1\0\0\0\u03ae\u03af\1\0\0\0\u03af\u0085\1\0"+
		"\0\0\u03b0\u03ae\1\0\0\0\u03b1\u03b5\3\u0088D\0\u03b2\u03b4\3z=\0\u03b3"+
		"\u03b2\1\0\0\0\u03b4\u03b7\1\0\0\0\u03b5\u03b3\1\0\0\0\u03b5\u03b6\1\0"+
		"\0\0\u03b6\u0087\1\0\0\0\u03b7\u03b5\1\0\0\0\u03b8\u03b9\5>\0\0\u03b9"+
		"\u03ba\3\u00a8T\0\u03ba\u03bb\5\61\0\0\u03bb\u03bf\1\0\0\0\u03bc\u03bd"+
		"\5\60\0\0\u03bd\u03bf\5\61\0\0\u03be\u03b8\1\0\0\0\u03be\u03bc\1\0\0\0"+
		"\u03bf\u0089\1\0\0\0\u03c0\u03c1\5\67\0\0\u03c1\u03c9\3x<\0\u03c2\u03c3"+
		"\3\u0094J\0\u03c3\u03c4\58\0\0\u03c4\u03c5\3x<\0\u03c5\u03ca\1\0\0\0\u03c6"+
		"\u03ca\3\u0094J\0\u03c7\u03c8\58\0\0\u03c8\u03ca\3x<\0\u03c9\u03c2\1\0"+
		"\0\0\u03c9\u03c6\1\0\0\0\u03c9\u03c7\1\0\0\0\u03ca\u03cd\1\0\0\0\u03cb"+
		"\u03cd\3\u008cF\0\u03cc\u03c0\1\0\0\0\u03cc\u03cb\1\0\0\0\u03cd\u008b"+
		"\1\0\0\0\u03ce\u03cf\5\67\0\0\u03cf\u03d0\3\u008eG\0\u03d0\u03d2\3x<\0"+
		"\u03d1\u03d3\3\u0094J\0\u03d2\u03d1\1\0\0\0\u03d2\u03d3\1\0\0\0\u03d3"+
		"\u03d6\1\0\0\0\u03d4\u03d5\58\0\0\u03d5\u03d7\3x<\0\u03d6\u03d4\1\0\0"+
		"\0\u03d6\u03d7\1\0\0\0\u03d7\u008d\1\0\0\0\u03d8\u03d9\5\24\0\0\u03d9"+
		"\u03db\3\u0090H\0\u03da\u03dc\5\1\0\0\u03db\u03da\1\0\0\0\u03db\u03dc"+
		"\1\0\0\0\u03dc\u03dd\1\0\0\0\u03dd\u03de\5\25\0\0\u03de\u008f\1\0\0\0"+
		"\u03df\u03e4\3\u0092I\0\u03e0\u03e1\5\1\0\0\u03e1\u03e3\3\u0092I\0\u03e2"+
		"\u03e0\1\0\0\0\u03e3\u03e6\1\0\0\0\u03e4\u03e2\1\0\0\0\u03e4\u03e5\1\0"+
		"\0\0\u03e5\u0091\1\0\0\0\u03e6\u03e4\1\0\0\0\u03e7\u03e9\3\20\b\0\u03e8"+
		"\u03e7\1\0\0\0\u03e8\u03e9\1\0\0\0\u03e9\u03ea\1\0\0\0\u03ea\u03eb\3D"+
		"\"\0\u03eb\u03ec\5b\0\0\u03ec\u03ed\5\32\0\0\u03ed\u03ee\3\u00a8T\0\u03ee"+
		"\u0093\1\0\0\0\u03ef\u03f3\3\u0096K\0\u03f0\u03f2\3\u0096K\0\u03f1\u03f0"+
		"\1\0\0\0\u03f2\u03f5\1\0\0\0\u03f3\u03f1\1\0\0\0\u03f3\u03f4\1\0\0\0\u03f4"+
		"\u0095\1\0\0\0\u03f5\u03f3\1\0\0\0\u03f6\u03f7\5=\0\0\u03f7\u03f8\5\24"+
		"\0\0\u03f8\u03f9\3\u0098L\0\u03f9\u03fa\5\25\0\0\u03fa\u03fb\3x<\0\u03fb"+
		"\u0097\1\0\0\0\u03fc\u03fd\3\20\b\0\u03fd\u0402\3D\"\0\u03fe\u03ff\5N"+
		"\0\0\u03ff\u0401\3D\"\0\u0400\u03fe\1\0\0\0\u0401\u0404\1\0\0\0\u0402"+
		"\u0400\1\0\0\0\u0402\u0403\1\0\0\0\u0403\u0405\1\0\0\0\u0404\u0402\1\0"+
		"\0\0\u0405\u040a\5b\0\0\u0406\u0407\5\22\0\0\u0407\u0409\5\23\0\0\u0408"+
		"\u0406\1\0\0\0\u0409\u040c\1\0\0\0\u040a\u0408\1\0\0\0\u040a\u040b\1\0"+
		"\0\0\u040b\u0099\1\0\0\0\u040c\u040a\1\0\0\0\u040d\u040e\3\20\b\0\u040e"+
		"\u040f\3D\"\0\u040f\u0414\5b\0\0\u0410\u0411\5\22\0\0\u0411\u0413\5\23"+
		"\0\0\u0412\u0410\1\0\0\0\u0413\u0416\1\0\0\0\u0414\u0412\1\0\0\0\u0414"+
		"\u0415\1\0\0\0\u0415\u009b\1\0\0\0\u0416\u0414\1\0\0\0\u0417\u041a\3\u009e"+
		"O\0\u0418\u041a\3\u00a0P\0\u0419\u0417\1\0\0\0\u0419\u0418\1\0\0\0\u041a"+
		"\u009d\1\0\0\0\u041b\u041c\5\64\0\0\u041c\u041d\5\24\0\0\u041d\u041e\3"+
		"\20\b\0\u041e\u041f\3D\"\0\u041f\u0420\5b\0\0\u0420\u0421\5\61\0\0\u0421"+
		"\u0422\3\u00a8T\0\u0422\u0423\5\25\0\0\u0423\u0424\3\u0080@\0\u0424\u009f"+
		"\1\0\0\0\u0425\u0426\5\64\0\0\u0426\u0428\5\24\0\0\u0427\u0429\3\u00a2"+
		"Q\0\u0428\u0427\1\0\0\0\u0428\u0429\1\0\0\0\u0429\u042a\1\0\0\0\u042a"+
		"\u042c\5\1\0\0\u042b\u042d\3\u00a8T\0\u042c\u042b\1\0\0\0\u042c\u042d"+
		"\1\0\0\0\u042d\u042e\1\0\0\0\u042e\u0430\5\1\0\0\u042f\u0431\3\u00a6S"+
		"\0\u0430\u042f\1\0\0\0\u0430\u0431\1\0\0\0\u0431\u0432\1\0\0\0\u0432\u0433"+
		"\5\25\0\0\u0433\u0434\3\u0080@\0\u0434\u00a1\1\0\0\0\u0435\u0438\3~?\0"+
		"\u0436\u0438\3\u00a6S\0\u0437\u0435\1\0\0\0\u0437\u0436\1\0\0\0\u0438"+
		"\u00a3\1\0\0\0\u0439\u043a\5\24\0\0\u043a\u043b\3\u00a8T\0\u043b\u043c"+
		"\5\25\0\0\u043c\u00a5\1\0\0\0\u043d\u0442\3\u00a8T\0\u043e\u043f\5\17"+
		"\0\0\u043f\u0441\3\u00a8T\0\u0440\u043e\1\0\0\0\u0441\u0444\1\0\0\0\u0442"+
		"\u0440\1\0\0\0\u0442\u0443\1\0\0\0\u0443\u00a7\1\0\0\0\u0444\u0442\1\0"+
		"\0\0\u0445\u0449\3\u00acV\0\u0446\u0447\3\u00aaU\0\u0447\u0448\3\u00a8"+
		"T\0\u0448\u044a\1\0\0\0\u0449\u0446\1\0\0\0\u0449\u044a\1\0\0\0\u044a"+
		"\u00a9\1\0\0\0\u044b\u044c\5\32\0\0\u044c\u046b\6U\uffff\0\u044d\u044e"+
		"\5R\0\0\u044e\u046b\6U\uffff\0\u044f\u0450\5S\0\0\u0450\u046b\6U\uffff"+
		"\0\u0451\u0452\5T\0\0\u0452\u046b\6U\uffff\0\u0453\u0454\5U\0\0\u0454"+
		"\u046b\6U\uffff\0\u0455\u0456\5V\0\0\u0456\u046b\6U\uffff\0\u0457\u0458"+
		"\5W\0\0\u0458\u046b\6U\uffff\0\u0459\u045a\5Q\0\0\u045a\u046b\6U\uffff"+
		"\0\u045b\u045c\5X\0\0\u045c\u046b\6U\uffff\0\u045d\u045e\5Z\0\0\u045e"+
		"\u045f\5Z\0\0\u045f\u0460\5\32\0\0\u0460\u046b\6U\uffff\0\u0461\u0462"+
		"\5Y\0\0\u0462\u0463\5Y\0\0\u0463\u0464\5Y\0\0\u0464\u0465\5\32\0\0\u0465"+
		"\u046b\6U\uffff\0\u0466\u0467\5Y\0\0\u0467\u0468\5Y\0\0\u0468\u0469\5"+
		"\32\0\0\u0469\u046b\6U\uffff\0\u046a\u044b\1\0\0\0\u046a\u044d\1\0\0\0"+
		"\u046a\u044f\1\0\0\0\u046a\u0451\1\0\0\0\u046a\u0453\1\0\0\0\u046a\u0455"+
		"\1\0\0\0\u046a\u0457\1\0\0\0\u046a\u0459\1\0\0\0\u046a\u045b\1\0\0\0\u046a"+
		"\u045d\1\0\0\0\u046a\u0461\1\0\0\0\u046a\u0466\1\0\0\0\u046b\u00ab\1\0"+
		"\0\0\u046c\u0472\3\u00aeW\0\u046d\u046e\5\'\0\0\u046e\u046f\3\u00a8T\0"+
		"\u046f\u0470\5\61\0\0\u0470\u0471\3\u00acV\0\u0471\u0473\1\0\0\0\u0472"+
		"\u046d\1\0\0\0\u0472\u0473\1\0\0\0\u0473\u00ad\1\0\0\0\u0474\u0479\3\u00b0"+
		"X\0\u0475\u0476\5P\0\0\u0476\u0478\3\u00b0X\0\u0477\u0475\1\0\0\0\u0478"+
		"\u047b\1\0\0\0\u0479\u0477\1\0\0\0\u0479\u047a\1\0\0\0\u047a\u00af\1\0"+
		"\0\0\u047b\u0479\1\0\0\0\u047c\u0481\3\u00b2Y\0\u047d\u047e\5O\0\0\u047e"+
		"\u0480\3\u00b2Y\0\u047f\u047d\1\0\0\0\u0480\u0483\1\0\0\0\u0481\u047f"+
		"\1\0\0\0\u0481\u0482\1\0\0\0\u0482\u00b1\1\0\0\0\u0483\u0481\1\0\0\0\u0484"+
		"\u0489\3\u00b4Z\0\u0485\u0486\5N\0\0\u0486\u0488\3\u00b4Z\0\u0487\u0485"+
		"\1\0\0\0\u0488\u048b\1\0\0\0\u0489\u0487\1\0\0\0\u0489\u048a\1\0\0\0\u048a"+
		"\u00b3\1\0\0\0\u048b\u0489\1\0\0\0\u048c\u0491\3\u00b6[\0\u048d\u048e"+
		"\5M\0\0\u048e\u0490\3\u00b6[\0\u048f\u048d\1\0\0\0\u0490\u0493\1\0\0\0"+
		"\u0491\u048f\1\0\0\0\u0491\u0492\1\0\0\0\u0492\u00b5\1\0\0\0\u0493\u0491"+
		"\1\0\0\0\u0494\u0499\3\u00b8\\\0\u0495\u0496\5L\0\0\u0496\u0498\3\u00b8"+
		"\\\0\u0497\u0495\1\0\0\0\u0498\u049b\1\0\0\0\u0499\u0497\1\0\0\0\u0499"+
		"\u049a\1\0\0\0\u049a\u00b7\1\0\0\0\u049b\u0499\1\0\0\0\u049c\u04a1\3\u00ba"+
		"]\0\u049d\u049e\5J\0\0\u049e\u04a0\3\u00ba]\0\u049f\u049d\1\0\0\0\u04a0"+
		"\u04a3\1\0\0\0\u04a1\u049f\1\0\0\0\u04a1\u04a2\1\0\0\0\u04a2\u00b9\1\0"+
		"\0\0\u04a3\u04a1\1\0\0\0\u04a4\u04a9\3\u00bc^\0\u04a5\u04a6\5K\0\0\u04a6"+
		"\u04a8\3\u00bc^\0\u04a7\u04a5\1\0\0\0\u04a8\u04ab\1\0\0\0\u04a9\u04a7"+
		"\1\0\0\0\u04a9\u04aa\1\0\0\0\u04aa\u00bb\1\0\0\0\u04ab\u04a9\1\0\0\0\u04ac"+
		"\u04af\3\u00be_\0\u04ad\u04ae\5[\0\0\u04ae\u04b0\3D\"\0\u04af\u04ad\1"+
		"\0\0\0\u04af\u04b0\1\0\0\0\u04b0\u00bd\1\0\0\0\u04b1\u04b7\3\u00c2a\0"+
		"\u04b2\u04b3\3\u00c0`\0\u04b3\u04b4\3\u00c2a\0\u04b4\u04b6\1\0\0\0\u04b5"+
		"\u04b2\1\0\0\0\u04b6\u04b9\1\0\0\0\u04b7\u04b5\1\0\0\0\u04b7\u04b8\1\0"+
		"\0\0\u04b8\u00bf\1\0\0\0\u04b9\u04b7\1\0\0\0\u04ba\u04bb\5Z\0\0\u04bb"+
		"\u04bc\5\32\0\0\u04bc\u04c5\6`\uffff\0\u04bd\u04be\5Y\0\0\u04be\u04bf"+
		"\5\32\0\0\u04bf\u04c5\6`\uffff\0\u04c0\u04c1\5Z\0\0\u04c1\u04c5\6`\uffff"+
		"\0\u04c2\u04c3\5Y\0\0\u04c3\u04c5\6`\uffff\0\u04c4\u04ba\1\0\0\0\u04c4"+
		"\u04bd\1\0\0\0\u04c4\u04c0\1\0\0\0\u04c4\u04c2\1\0\0\0\u04c5\u00c1\1\0"+
		"\0\0\u04c6\u04cc\3\u00c6c\0\u04c7\u04c8\3\u00c4b\0\u04c8\u04c9\3\u00c6"+
		"c\0\u04c9\u04cb\1\0\0\0\u04ca\u04c7\1\0\0\0\u04cb\u04ce\1\0\0\0\u04cc"+
		"\u04ca\1\0\0\0\u04cc\u04cd\1\0\0\0\u04cd\u00c3\1\0\0\0\u04ce\u04cc\1\0"+
		"\0\0\u04cf\u04d0\5Z\0\0\u04d0\u04d1\5Z\0\0\u04d1\u04da\6b\uffff\0\u04d2"+
		"\u04d3\5Y\0\0\u04d3\u04d4\5Y\0\0\u04d4\u04d5\5Y\0\0\u04d5\u04da\6b\uffff"+
		"\0\u04d6\u04d7\5Y\0\0\u04d7\u04d8\5Y\0\0\u04d8\u04da\6b\uffff\0\u04d9"+
		"\u04cf\1\0\0\0\u04d9\u04d2\1\0\0\0\u04d9\u04d6\1\0\0\0\u04da\u00c5\1\0"+
		"\0\0\u04db\u04e1\3\u00cae\0\u04dc\u04dd\3\u00c8d\0\u04dd\u04de\3\u00ca"+
		"e\0\u04de\u04e0\1\0\0\0\u04df\u04dc\1\0\0\0\u04e0\u04e3\1\0\0\0\u04e1"+
		"\u04df\1\0\0\0\u04e1\u04e2\1\0\0\0\u04e2\u00c7\1\0\0\0\u04e3\u04e1\1\0"+
		"\0\0\u04e4\u04e5\5H\0\0\u04e5\u04e9\6d\uffff\0\u04e6\u04e7\5I\0\0\u04e7"+
		"\u04e9\6d\uffff\0\u04e8\u04e4\1\0\0\0\u04e8\u04e6\1\0\0\0\u04e9\u00c9"+
		"\1\0\0\0\u04ea\u04f0\3\u00ceg\0\u04eb\u04ec\3\u00ccf\0\u04ec\u04ed\3\u00ce"+
		"g\0\u04ed\u04ef\1\0\0\0\u04ee\u04eb\1\0\0\0\u04ef\u04f2\1\0\0\0\u04f0"+
		"\u04ee\1\0\0\0\u04f0\u04f1\1\0\0\0\u04f1\u00cb\1\0\0\0\u04f2\u04f0\1\0"+
		"\0\0\u04f3\u04f4\5\5\0\0\u04f4\u04fa\6f\uffff\0\u04f5\u04f6\5F\0\0\u04f6"+
		"\u04fa\6f\uffff\0\u04f7\u04f8\5G\0\0\u04f8\u04fa\6f\uffff\0\u04f9\u04f3"+
		"\1\0\0\0\u04f9\u04f5\1\0\0\0\u04f9\u04f7\1\0\0\0\u04fa\u00cd\1\0\0\0\u04fb"+
		"\u04fc\5H\0\0\u04fc\u0509\3\u00ceg\0\u04fd\u04fe\5I\0\0\u04fe\u0509\3"+
		"\u00ceg\0\u04ff\u0500\5A\0\0\u0500\u0509\3\u00ceg\0\u0501\u0502\5B\0\0"+
		"\u0502\u0509\3\u00ceg\0\u0503\u0504\5C\0\0\u0504\u0509\3\u00ceg\0\u0505"+
		"\u0506\5D\0\0\u0506\u0509\3\u00ceg\0\u0507\u0509\3\u00d0h\0\u0508\u04fb"+
		"\1\0\0\0\u0508\u04fd\1\0\0\0\u0508\u04ff\1\0\0\0\u0508\u0501\1\0\0\0\u0508"+
		"\u0503\1\0\0\0\u0508\u0505\1\0\0\0\u0508\u0507\1\0\0\0\u0509\u00cf\1\0"+
		"\0\0\u050a\u0516\3\u00d2i\0\u050b\u050f\3\u00d4j\0\u050c\u050e\3\u00dc"+
		"n\0\u050d\u050c\1\0\0\0\u050e\u0511\1\0\0\0\u050f\u050d\1\0\0\0\u050f"+
		"\u0510\1\0\0\0\u0510\u0513\1\0\0\0\u0511\u050f\1\0\0\0\u0512\u0514\7\3"+
		"\0\0\u0513\u0512\1\0\0\0\u0513\u0514\1\0\0\0\u0514\u0516\1\0\0\0\u0515"+
		"\u050a\1\0\0\0\u0515\u050b\1\0\0\0\u0516\u00d1\1\0\0\0\u0517\u0518\5\24"+
		"\0\0\u0518\u0519\3J%\0\u0519\u051a\5\25\0\0\u051a\u051b\3\u00ceg\0\u051b"+
		"\u0522\1\0\0\0\u051c\u051d\5\24\0\0\u051d\u051e\3D\"\0\u051e\u051f\5\25"+
		"\0\0\u051f\u0520\3\u00d0h\0\u0520\u0522\1\0\0\0\u0521\u0517\1\0\0\0\u0521"+
		"\u051c\1\0\0\0\u0522\u00d3\1\0\0\0\u0523\u0524\3\u00a4R\0\u0524\u0525"+
		"\6j\uffff\0\u0525\u0559\1\0\0\0\u0526\u052b\5*\0\0\u0527\u0528\5\4\0\0"+
		"\u0528\u052a\5b\0\0\u0529\u0527\1\0\0\0\u052a\u052d\1\0\0\0\u052b\u0529"+
		"\1\0\0\0\u052b\u052c\1\0\0\0\u052c\u052f\1\0\0\0\u052d\u052b\1\0\0\0\u052e"+
		"\u0530\3\u00d8l\0\u052f\u052e\1\0\0\0\u052f\u0530\1\0\0\0\u0530\u0531"+
		"\1\0\0\0\u0531\u0559\6j\uffff\0\u0532\u0537\5b\0\0\u0533\u0534\5\4\0\0"+
		"\u0534\u0536\5b\0\0\u0535\u0533\1\0\0\0\u0536\u0539\1\0\0\0\u0537\u0535"+
		"\1\0\0\0\u0537\u0538\1\0\0\0\u0538\u053b\1\0\0\0\u0539\u0537\1\0\0\0\u053a"+
		"\u053c\3\u00dam\0\u053b\u053a\1\0\0\0\u053b\u053c\1\0\0\0\u053c\u053d"+
		"\1\0\0\0\u053d\u0559\6j\uffff\0\u053e\u053f\5+\0\0\u053f\u0540\3\u00d6"+
		"k\0\u0540\u0541\6j\uffff\0\u0541\u0559\1\0\0\0\u0542\u0543\3\u00f0x\0"+
		"\u0543\u0544\6j\uffff\0\u0544\u0559\1\0\0\0\u0545\u0546\3\u00deo\0\u0546"+
		"\u0547\6j\uffff\0\u0547\u0559\1\0\0\0\u0548\u054d\3J%\0\u0549\u054a\5"+
		"\22\0\0\u054a\u054c\5\23\0\0\u054b\u0549\1\0\0\0\u054c\u054f\1\0\0\0\u054d"+
		"\u054b\1\0\0\0\u054d\u054e\1\0\0\0\u054e\u0550\1\0\0\0\u054f\u054d\1\0"+
		"\0\0\u0550\u0551\5\4\0\0\u0551\u0552\5\6\0\0\u0552\u0553\6j\uffff\0\u0553"+
		"\u0559\1\0\0\0\u0554\u0555\5\26\0\0\u0555\u0556\5\4\0\0\u0556\u0557\5"+
		"\6\0\0\u0557\u0559\6j\uffff\0\u0558\u0523\1\0\0\0\u0558\u0526\1\0\0\0"+
		"\u0558\u0532\1\0\0\0\u0558\u053e\1\0\0\0\u0558\u0542\1\0\0\0\u0558\u0545"+
		"\1\0\0\0\u0558\u0548\1\0\0\0\u0558\u0554\1\0\0\0\u0559\u00d5\1\0\0\0\u055a"+
		"\u055c\5\4\0\0\u055b\u055d\3L&\0\u055c\u055b\1\0\0\0\u055c\u055d\1\0\0"+
		"\0\u055d\u055e\1\0\0\0\u055e\u0560\5b\0\0\u055f\u0561\3\u00eew\0\u0560"+
		"\u055f\1\0\0\0\u0560\u0561\1\0\0\0\u0561\u00d7\1\0\0\0\u0562\u0563\5\22"+
		"\0\0\u0563\u0564\3\u00a8T\0\u0564\u0565\5\23\0\0\u0565\u0567\1\0\0\0\u0566"+
		"\u0562\1\0\0\0\u0567\u0568\1\0\0\0\u0568\u0566\1\0\0\0\u0568\u0569\1\0"+
		"\0\0\u0569\u056a\1\0\0\0\u056a\u056b\6l\uffff\0\u056b\u0579\1\0\0\0\u056c"+
		"\u056d\3\u00eew\0\u056d\u056e\6l\uffff\0\u056e\u0579\1\0\0\0\u056f\u0570"+
		"\5\4\0\0\u0570\u0571\3\u00ecv\0\u0571\u0572\5b\0\0\u0572\u0573\3\u00ee"+
		"w\0\u0573\u0574\6l\uffff\0\u0574\u0579\1\0\0\0\u0575\u0576\3\u00e8t\0"+
		"\u0576\u0577\6l\uffff\0\u0577\u0579\1\0\0\0\u0578\u0566\1\0\0\0\u0578"+
		"\u056c\1\0\0\0\u0578\u056f\1\0\0\0\u0578\u0575\1\0\0\0\u0579\u00d9\1\0"+
		"\0\0\u057a\u057b\5\22\0\0\u057b\u057d\5\23\0\0\u057c\u057a\1\0\0\0\u057d"+
		"\u057e\1\0\0\0\u057e\u057c\1\0\0\0\u057e\u057f\1\0\0\0\u057f\u0580\1\0"+
		"\0\0\u0580\u0581\5\4\0\0\u0581\u0582\5\6\0\0\u0582\u05a0\6m\uffff\0\u0583"+
		"\u0584\5\22\0\0\u0584\u0585\3\u00a8T\0\u0585\u0586\5\23\0\0\u0586\u0588"+
		"\1\0\0\0\u0587\u0583\1\0\0\0\u0588\u0589\1\0\0\0\u0589\u0587\1\0\0\0\u0589"+
		"\u058a\1\0\0\0\u058a\u058b\1\0\0\0\u058b\u058c\6m\uffff\0\u058c\u05a0"+
		"\1\0\0\0\u058d\u058e\3\u00eew\0\u058e\u058f\6m\uffff\0\u058f\u05a0\1\0"+
		"\0\0\u0590\u0591\5\4\0\0\u0591\u0592\5\6\0\0\u0592\u05a0\6m\uffff\0\u0593"+
		"\u0594\5\4\0\0\u0594\u0595\3\u00ecv\0\u0595\u0596\5b\0\0\u0596\u0597\3"+
		"\u00eew\0\u0597\u0598\6m\uffff\0\u0598\u05a0\1\0\0\0\u0599\u059a\5\4\0"+
		"\0\u059a\u059b\5*\0\0\u059b\u05a0\6m\uffff\0\u059c\u059d\3\u00e8t\0\u059d"+
		"\u059e\6m\uffff\0\u059e\u05a0\1\0\0\0\u059f\u057c\1\0\0\0\u059f\u0587"+
		"\1\0\0\0\u059f\u058d\1\0\0\0\u059f\u0590\1\0\0\0\u059f\u0593\1\0\0\0\u059f"+
		"\u0599\1\0\0\0\u059f\u059c\1\0\0\0\u05a0\u00db\1\0\0\0\u05a1\u05a2\5\4"+
		"\0\0\u05a2\u05a4\5b\0\0\u05a3\u05a5\3\u00eew\0\u05a4\u05a3\1\0\0\0\u05a4"+
		"\u05a5\1\0\0\0\u05a5\u05a6\1\0\0\0\u05a6\u05b8\6n\uffff\0\u05a7\u05a8"+
		"\5\4\0\0\u05a8\u05a9\5*\0\0\u05a9\u05b8\6n\uffff\0\u05aa\u05ab\5\4\0\0"+
		"\u05ab\u05ac\5+\0\0\u05ac\u05ad\3\u00d6k\0\u05ad\u05ae\6n\uffff\0\u05ae"+
		"\u05b8\1\0\0\0\u05af\u05b0\3\u00e8t\0\u05b0\u05b1\6n\uffff\0\u05b1\u05b8"+
		"\1\0\0\0\u05b2\u05b3\5\22\0\0\u05b3\u05b4\3\u00a8T\0\u05b4\u05b5\5\23"+
		"\0\0\u05b5\u05b6\6n\uffff\0\u05b6\u05b8\1\0\0\0\u05b7\u05a1\1\0\0\0\u05b7"+
		"\u05a7\1\0\0\0\u05b7\u05aa\1\0\0\0\u05b7\u05af\1\0\0\0\u05b7\u05b2\1\0"+
		"\0\0\u05b8\u00dd\1\0\0\0\u05b9\u05ba\5E\0\0\u05ba\u05bb\3\u00ecv\0\u05bb"+
		"\u05bc\3F#\0\u05bc\u05bd\3\u00eau\0\u05bd\u05c4\1\0\0\0\u05be\u05bf\5"+
		"E\0\0\u05bf\u05c0\3F#\0\u05c0\u05c1\3\u00eau\0\u05c1\u05c4\1\0\0\0\u05c2"+
		"\u05c4\3\u00e0p\0\u05c3\u05b9\1\0\0\0\u05c3\u05be\1\0\0\0\u05c3\u05c2"+
		"\1\0\0\0\u05c4\u00df\1\0\0\0\u05c5\u05c6\5E\0\0\u05c6\u05c7\3\u00e6s\0"+
		"\u05c7\u05c8\5\22\0\0\u05c8\u05cd\5\23\0\0\u05c9\u05ca\5\22\0\0\u05ca"+
		"\u05cc\5\23\0\0\u05cb\u05c9\1\0\0\0\u05cc\u05cf\1\0\0\0\u05cd\u05cb\1"+
		"\0\0\0\u05cd\u05ce\1\0\0\0\u05ce\u05d0\1\0\0\0\u05cf\u05cd\1\0\0\0\u05d0"+
		"\u05d1\3\u00e4r\0\u05d1\u05e8\1\0\0\0\u05d2\u05d3\5E\0\0\u05d3\u05d4\3"+
		"\u00e6s\0\u05d4\u05d5\5\22\0\0\u05d5\u05d6\3\u00a8T\0\u05d6\u05dd\5\23"+
		"\0\0\u05d7\u05d8\5\22\0\0\u05d8\u05d9\3\u00a8T\0\u05d9\u05da\5\23\0\0"+
		"\u05da\u05dc\1\0\0\0\u05db\u05d7\1\0\0\0\u05dc\u05df\1\0\0\0\u05dd\u05db"+
		"\1\0\0\0\u05dd\u05de\1\0\0\0\u05de\u05e4\1\0\0\0\u05df\u05dd\1\0\0\0\u05e0"+
		"\u05e1\5\22\0\0\u05e1\u05e3\5\23\0\0\u05e2\u05e0\1\0\0\0\u05e3\u05e6\1"+
		"\0\0\0\u05e4\u05e2\1\0\0\0\u05e4\u05e5\1\0\0\0\u05e5\u05e8\1\0\0\0\u05e6"+
		"\u05e4\1\0\0\0\u05e7\u05c5\1\0\0\0\u05e7\u05d2\1\0\0\0\u05e8\u00e1\1\0"+
		"\0\0\u05e9\u05ec\3\u00e4r\0\u05ea\u05ec\3\u00a8T\0\u05eb\u05e9\1\0\0\0"+
		"\u05eb\u05ea\1\0\0\0\u05ec\u00e3\1\0\0\0\u05ed\u05f6\5\20\0\0\u05ee\u05f3"+
		"\3\u00e2q\0\u05ef\u05f0\5\17\0\0\u05f0\u05f2\3\u00e2q\0\u05f1\u05ef\1"+
		"\0\0\0\u05f2\u05f5\1\0\0\0\u05f3\u05f1\1\0\0\0\u05f3\u05f4\1\0\0\0\u05f4"+
		"\u05f7\1\0\0\0\u05f5\u05f3\1\0\0\0\u05f6\u05ee\1\0\0\0\u05f6\u05f7\1\0"+
		"\0\0\u05f7\u05f9\1\0\0\0\u05f8\u05fa\5\17\0\0\u05f9\u05f8\1\0\0\0\u05f9"+
		"\u05fa\1\0\0\0\u05fa\u05fb\1\0\0\0\u05fb\u05fc\5\21\0\0\u05fc\u00e5\1"+
		"\0\0\0\u05fd\u0600\3F#\0\u05fe\u0600\3J%\0\u05ff\u05fd\1\0\0\0\u05ff\u05fe"+
		"\1\0\0\0\u0600\u00e7\1\0\0\0\u0601\u0602\5\4\0\0\u0602\u0604\5E\0\0\u0603"+
		"\u0605\3\u00ecv\0\u0604\u0603\1\0\0\0\u0604\u0605\1\0\0\0\u0605\u0606"+
		"\1\0\0\0\u0606\u0607\3H$\0\u0607\u0608\3\u00eau\0\u0608\u00e9\1\0\0\0"+
		"\u0609\u060b\3\u00eew\0\u060a\u060c\3,\26\0\u060b\u060a\1\0\0\0\u060b"+
		"\u060c\1\0\0\0\u060c\u00eb\1\0\0\0\u060d\u060e\5Z\0\0\u060e\u060f\3*\25"+
		"\0\u060f\u0610\5Y\0\0\u0610\u00ed\1\0\0\0\u0611\u0613\5\24\0\0\u0612\u0614"+
		"\3\u00a6S\0\u0613\u0612\1\0\0\0\u0613\u0614\1\0\0\0\u0614\u0615\1\0\0"+
		"\0\u0615\u0616\5\25\0\0\u0616\u00ef\1\0\0\0\u0617\u0618\7\4\0\0\u0618"+
		"\u00f1\1\0\0\0\u0619\u061a\3\f\6\0\u061a\u061b\5\6\0\0\u061b\u061c\5b"+
		"\0\0\u061c\u00f3\1\0\0\0\u061d\u061e\3\f\6\0\u061e\u061f\7\5\0\0\u061f"+
		"\u0620\5b\0\0\u0620\u00f5\1\0\0\0\u0621\u0622\3\f\6\0\u0622\u0623\5\27"+
		"\0\0\u0623\u0624\5b\0\0\u0624\u00f7\1\0\0\0\u0625\u0626\3\f\6\0\u0626"+
		"\u0627\5/\0\0\u0627\u0628\5\27\0\0\u0628\u0629\5b\0\0\u0629\u00f9\1\0"+
		"\0\0\u062a\u0631\3\f\6\0\u062b\u0632\5\6\0\0\u062c\u0632\5?\0\0\u062d"+
		"\u062f\5/\0\0\u062e\u062d\1\0\0\0\u062e\u062f\1\0\0\0\u062f\u0630\1\0"+
		"\0\0\u0630\u0632\5\27\0\0\u0631\u062b\1\0\0\0\u0631\u062c\1\0\0\0\u0631"+
		"\u062e\1\0\0\0\u0632\u0633\1\0\0\0\u0633\u0634\5b\0\0\u0634\u00fb\1\0"+
		"\0\0\u0635\u0637\3\f\6\0\u0636\u0638\3\26\13\0\u0637\u0636\1\0\0\0\u0637"+
		"\u0638\1\0\0\0\u0638\u063b\1\0\0\0\u0639\u063c\3D\"\0\u063a\u063c\5\26"+
		"\0\0\u063b\u0639\1\0\0\0\u063b\u063a\1\0\0\0\u063b\u063c\1\0\0\0\u063c"+
		"\u063d\1\0\0\0\u063d\u063e\5b\0\0\u063e\u063f\5\25\0\0\u063f\u00fd\1\0"+
		"\0\0\u0640\u0641\3\f\6\0\u0641\u0642\3D\"\0\u0642\u0647\5b\0\0\u0643\u0644"+
		"\5\22\0\0\u0644\u0646\5\23\0\0\u0645\u0643\1\0\0\0\u0646\u0649\1\0\0\0"+
		"\u0647\u0645\1\0\0\0\u0647\u0648\1\0\0\0\u0648\u064a\1\0\0\0\u0649\u0647"+
		"\1\0\0\0\u064a\u064b\7\6\0\0\u064b\u00ff\1\0\0\0\u064c\u064d\3\20\b\0"+
		"\u064d\u064e\3D\"\0\u064e\u0653\5b\0\0\u064f\u0650\5\22\0\0\u0650\u0652"+
		"\5\23\0\0\u0651\u064f\1\0\0\0\u0652\u0655\1\0\0\0\u0653\u0651\1\0\0\0"+
		"\u0653\u0654\1\0\0\0\u0654\u0656\1\0\0\0\u0655\u0653\1\0\0\0\u0656\u0657"+
		"\7\7\0\0\u0657\u0101\1\0\0\0\u00b1\u0103\u0108\u010e\u0112\u011a\u0122"+
		"\u0129\u012d\u0130\u0137\u013c\u0140\u0145\u0154\u0159\u015d\u0162\u0167"+
		"\u016d\u0171\u0175\u017f\u0187\u018e\u0196\u019c\u019f\u01a2\u01ab\u01af"+
		"\u01b3\u01b6\u01bc\u01c1\u01c7\u01cb\u01d4\u01db\u01e4\u01eb\u01ef\u01f6"+
		"\u01fa\u01fe\u0206\u020b\u020f\u0213\u0219\u021f\u0224\u0230\u023a\u023f"+
		"\u0246\u024a\u024e\u0256\u025b\u0266\u0270\u0278\u027b\u0282\u0287\u0291"+
		"\u0298\u029e\u02a0\u02a7\u02ac\u02b6\u02be\u02c2\u02cb\u02d4\u02dd\u02e3"+
		"\u02ea\u02f0\u02f5\u0304\u030d\u0317\u031f\u0322\u0325\u0333\u033f\u0348"+
		"\u0350\u0358\u0364\u036c\u0375\u038f\u0398\u039d\u03a7\u03ae\u03b5\u03be"+
		"\u03c9\u03cc\u03d2\u03d6\u03db\u03e4\u03e8\u03f3\u0402\u040a\u0414\u0419"+
		"\u0428\u042c\u0430\u0437\u0442\u0449\u046a\u0472\u0479\u0481\u0489\u0491"+
		"\u0499\u04a1\u04a9\u04af\u04b7\u04c4\u04cc\u04d9\u04e1\u04e8\u04f0\u04f9"+
		"\u0508\u050f\u0513\u0515\u0521\u052b\u052f\u0537\u053b\u054d\u0558\u055c"+
		"\u0560\u0568\u0578\u057e\u0589\u059f\u05a4\u05b7\u05c3\u05cd\u05dd\u05e4"+
		"\u05e7\u05eb\u05f3\u05f6\u05f9\u05ff\u0604\u060b\u0613\u062e\u0631\u0637"+
		"\u063b\u0647\u0653";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
	    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}