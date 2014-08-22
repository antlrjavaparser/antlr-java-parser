// Generated from Java7Parser.g4 by ANTLR 4.3

package com.github.antlrjavaparser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Java7Parser}.
 */
public interface Java7ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Java7Parser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(@NotNull Java7Parser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(@NotNull Java7Parser.InnerCreatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull Java7Parser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull Java7Parser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull Java7Parser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull Java7Parser.TypeDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull Java7Parser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull Java7Parser.AnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(@NotNull Java7Parser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(@NotNull Java7Parser.EnumConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(@NotNull Java7Parser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(@NotNull Java7Parser.LambdaParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroups(@NotNull Java7Parser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroups(@NotNull Java7Parser.SwitchBlockStatementGroupsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#annotationHeader}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationHeader(@NotNull Java7Parser.AnnotationHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#annotationHeader}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationHeader(@NotNull Java7Parser.AnnotationHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(@NotNull Java7Parser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(@NotNull Java7Parser.NormalClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull Java7Parser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull Java7Parser.ImportDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#thisSuffix}.
	 * @param ctx the parse tree
	 */
	void enterThisSuffix(@NotNull Java7Parser.ThisSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#thisSuffix}.
	 * @param ctx the parse tree
	 */
	void exitThisSuffix(@NotNull Java7Parser.ThisSuffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(@NotNull Java7Parser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(@NotNull Java7Parser.ElementValuePairsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(@NotNull Java7Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(@NotNull Java7Parser.InterfaceMethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(@NotNull Java7Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(@NotNull Java7Parser.ExclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(@NotNull Java7Parser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(@NotNull Java7Parser.InstanceOfExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(@NotNull Java7Parser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(@NotNull Java7Parser.InterfaceBodyDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(@NotNull Java7Parser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(@NotNull Java7Parser.EnumConstantsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(@NotNull Java7Parser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(@NotNull Java7Parser.MarkerAnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(@NotNull Java7Parser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(@NotNull Java7Parser.CatchClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#tryWithResources}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResources(@NotNull Java7Parser.TryWithResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#tryWithResources}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResources(@NotNull Java7Parser.TryWithResourcesContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(@NotNull Java7Parser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(@NotNull Java7Parser.SingleElementAnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(@NotNull Java7Parser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(@NotNull Java7Parser.EnumBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull Java7Parser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull Java7Parser.EnumDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#qualifiedImportName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedImportName(@NotNull Java7Parser.QualifiedImportNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#qualifiedImportName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedImportName(@NotNull Java7Parser.QualifiedImportNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachStatement(@NotNull Java7Parser.ForeachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachStatement(@NotNull Java7Parser.ForeachStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull Java7Parser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull Java7Parser.TypeParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(@NotNull Java7Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(@NotNull Java7Parser.ExplicitConstructorInvocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(@NotNull Java7Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(@NotNull Java7Parser.EnumBodyDeclarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(@NotNull Java7Parser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(@NotNull Java7Parser.TypeBoundContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#annotationMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodDeclaration(@NotNull Java7Parser.AnnotationMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#annotationMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodDeclaration(@NotNull Java7Parser.AnnotationMethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull Java7Parser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull Java7Parser.VariableInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull Java7Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull Java7Parser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(@NotNull Java7Parser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(@NotNull Java7Parser.ConditionalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull Java7Parser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull Java7Parser.AndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(@NotNull Java7Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(@NotNull Java7Parser.LocalVariableDeclarationStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(@NotNull Java7Parser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(@NotNull Java7Parser.SuperSuffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull Java7Parser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull Java7Parser.FieldDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(@NotNull Java7Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(@NotNull Java7Parser.NormalInterfaceDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(@NotNull Java7Parser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(@NotNull Java7Parser.ModifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeHeader}.
	 * @param ctx the parse tree
	 */
	void enterTypeHeader(@NotNull Java7Parser.TypeHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeHeader}.
	 * @param ctx the parse tree
	 */
	void exitTypeHeader(@NotNull Java7Parser.TypeHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull Java7Parser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull Java7Parser.ParExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(@NotNull Java7Parser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(@NotNull Java7Parser.CatchesContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull Java7Parser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull Java7Parser.SwitchLabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull Java7Parser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull Java7Parser.TypeParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull Java7Parser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull Java7Parser.QualifiedNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull Java7Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull Java7Parser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#localVariableHeader}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableHeader(@NotNull Java7Parser.LocalVariableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#localVariableHeader}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableHeader(@NotNull Java7Parser.LocalVariableHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#trystatement}.
	 * @param ctx the parse tree
	 */
	void enterTrystatement(@NotNull Java7Parser.TrystatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#trystatement}.
	 * @param ctx the parse tree
	 */
	void exitTrystatement(@NotNull Java7Parser.TrystatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(@NotNull Java7Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(@NotNull Java7Parser.InclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull Java7Parser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull Java7Parser.ArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull Java7Parser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull Java7Parser.EqualityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull Java7Parser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull Java7Parser.FormalParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull Java7Parser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull Java7Parser.CastExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#interfaceHeader}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceHeader(@NotNull Java7Parser.InterfaceHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#interfaceHeader}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceHeader(@NotNull Java7Parser.InterfaceHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(@NotNull Java7Parser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(@NotNull Java7Parser.TypeArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(@NotNull Java7Parser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(@NotNull Java7Parser.InferredFormalParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(@NotNull Java7Parser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(@NotNull Java7Parser.LambdaBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(@NotNull Java7Parser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(@NotNull Java7Parser.AnnotationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull Java7Parser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull Java7Parser.ForInitContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(@NotNull Java7Parser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(@NotNull Java7Parser.LambdaExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(@NotNull Java7Parser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(@NotNull Java7Parser.SelectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull Java7Parser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull Java7Parser.VariableDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(@NotNull Java7Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(@NotNull Java7Parser.AnnotationTypeDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull Java7Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull Java7Parser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(@NotNull Java7Parser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(@NotNull Java7Parser.ResourcesContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(@NotNull Java7Parser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(@NotNull Java7Parser.RelationalOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull Java7Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull Java7Parser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull Java7Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull Java7Parser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOp(@NotNull Java7Parser.AdditiveOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOp(@NotNull Java7Parser.AdditiveOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#interfaceFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceFieldDeclaration(@NotNull Java7Parser.InterfaceFieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#interfaceFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceFieldDeclaration(@NotNull Java7Parser.InterfaceFieldDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void enterMemberDecl(@NotNull Java7Parser.MemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void exitMemberDecl(@NotNull Java7Parser.MemberDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(@NotNull Java7Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(@NotNull Java7Parser.ElementValueArrayInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#classHeader}.
	 * @param ctx the parse tree
	 */
	void enterClassHeader(@NotNull Java7Parser.ClassHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#classHeader}.
	 * @param ctx the parse tree
	 */
	void exitClassHeader(@NotNull Java7Parser.ClassHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull Java7Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull Java7Parser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#ellipsisParameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterEllipsisParameterDecl(@NotNull Java7Parser.EllipsisParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#ellipsisParameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitEllipsisParameterDecl(@NotNull Java7Parser.EllipsisParameterDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#normalParameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterNormalParameterDecl(@NotNull Java7Parser.NormalParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#normalParameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitNormalParameterDecl(@NotNull Java7Parser.NormalParameterDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(@NotNull Java7Parser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(@NotNull Java7Parser.ShiftExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#identifierSuffix}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSuffix(@NotNull Java7Parser.IdentifierSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#identifierSuffix}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSuffix(@NotNull Java7Parser.IdentifierSuffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull Java7Parser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull Java7Parser.ClassBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#constructorBlock}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBlock(@NotNull Java7Parser.ConstructorBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#constructorBlock}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBlock(@NotNull Java7Parser.ConstructorBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(@NotNull Java7Parser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(@NotNull Java7Parser.CreatedNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(@NotNull Java7Parser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(@NotNull Java7Parser.InterfaceDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull Java7Parser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull Java7Parser.PackageDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(@NotNull Java7Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(@NotNull Java7Parser.ConditionalAndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull Java7Parser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull Java7Parser.AdditiveExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull Java7Parser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull Java7Parser.TypeArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(@NotNull Java7Parser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(@NotNull Java7Parser.ClassCreatorRestContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#arrayCreator}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreator(@NotNull Java7Parser.ArrayCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#arrayCreator}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreator(@NotNull Java7Parser.ArrayCreatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(@NotNull Java7Parser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(@NotNull Java7Parser.CatchFormalParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(@NotNull Java7Parser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(@NotNull Java7Parser.EmptyStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull Java7Parser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull Java7Parser.ModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull Java7Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull Java7Parser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(@NotNull Java7Parser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(@NotNull Java7Parser.InterfaceBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(@NotNull Java7Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(@NotNull Java7Parser.ClassBodyDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(@NotNull Java7Parser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(@NotNull Java7Parser.TypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull Java7Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull Java7Parser.LocalVariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull Java7Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull Java7Parser.MultiplicativeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull Java7Parser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull Java7Parser.AssignmentOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#inferredFormalParameters}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameters(@NotNull Java7Parser.InferredFormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#inferredFormalParameters}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameters(@NotNull Java7Parser.InferredFormalParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(@NotNull Java7Parser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(@NotNull Java7Parser.ShiftOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull Java7Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull Java7Parser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(@NotNull Java7Parser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(@NotNull Java7Parser.ElementValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(@NotNull Java7Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(@NotNull Java7Parser.ClassOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(@NotNull Java7Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(@NotNull Java7Parser.UnaryExpressionNotPlusMinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(@NotNull Java7Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(@NotNull Java7Parser.AnnotationTypeElementDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull Java7Parser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull Java7Parser.BlockStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(@NotNull Java7Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(@NotNull Java7Parser.AnnotationTypeBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(@NotNull Java7Parser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(@NotNull Java7Parser.CreatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(@NotNull Java7Parser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(@NotNull Java7Parser.QualifiedNameListContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOp(@NotNull Java7Parser.MultiplicativeOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOp(@NotNull Java7Parser.MultiplicativeOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#formalParameterDecls}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDecls(@NotNull Java7Parser.FormalParameterDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#formalParameterDecls}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDecls(@NotNull Java7Parser.FormalParameterDeclsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(@NotNull Java7Parser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(@NotNull Java7Parser.NormalAnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull Java7Parser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull Java7Parser.RelationalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(@NotNull Java7Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(@NotNull Java7Parser.ConditionalOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#forstatement}.
	 * @param ctx the parse tree
	 */
	void enterForstatement(@NotNull Java7Parser.ForstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#forstatement}.
	 * @param ctx the parse tree
	 */
	void exitForstatement(@NotNull Java7Parser.ForstatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#identifierTypeArgument}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierTypeArgument(@NotNull Java7Parser.IdentifierTypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#identifierTypeArgument}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierTypeArgument(@NotNull Java7Parser.IdentifierTypeArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#enumHeader}.
	 * @param ctx the parse tree
	 */
	void enterEnumHeader(@NotNull Java7Parser.EnumHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#enumHeader}.
	 * @param ctx the parse tree
	 */
	void exitEnumHeader(@NotNull Java7Parser.EnumHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull Java7Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull Java7Parser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(@NotNull Java7Parser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(@NotNull Java7Parser.ResourceSpecificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull Java7Parser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull Java7Parser.ConstructorDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(@NotNull Java7Parser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(@NotNull Java7Parser.ResourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(@NotNull Java7Parser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(@NotNull Java7Parser.ElementValuePairContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#normalForStatement}.
	 * @param ctx the parse tree
	 */
	void enterNormalForStatement(@NotNull Java7Parser.NormalForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#normalForStatement}.
	 * @param ctx the parse tree
	 */
	void exitNormalForStatement(@NotNull Java7Parser.NormalForStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#notEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualityExpression(@NotNull Java7Parser.NotEqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#notEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualityExpression(@NotNull Java7Parser.NotEqualityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(@NotNull Java7Parser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(@NotNull Java7Parser.MethodHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull Java7Parser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull Java7Parser.ArrayInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull Java7Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull Java7Parser.PrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifiers(@NotNull Java7Parser.VariableModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifiers(@NotNull Java7Parser.VariableModifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(@NotNull Java7Parser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(@NotNull Java7Parser.NonWildcardTypeArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#fieldHeader}.
	 * @param ctx the parse tree
	 */
	void enterFieldHeader(@NotNull Java7Parser.FieldHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#fieldHeader}.
	 * @param ctx the parse tree
	 */
	void exitFieldHeader(@NotNull Java7Parser.FieldHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#classOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceDeclaration(@NotNull Java7Parser.ClassOrInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#classOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceDeclaration(@NotNull Java7Parser.ClassOrInterfaceDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull Java7Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull Java7Parser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link Java7Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull Java7Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull Java7Parser.SwitchBlockStatementGroupContext ctx);
}