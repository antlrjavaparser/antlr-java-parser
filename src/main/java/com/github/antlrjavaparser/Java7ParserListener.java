// Generated from Java7Parser.g4 by ANTLR 4.5.1

package com.github.antlrjavaparser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Java7Parser}.
 */
public interface Java7ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Java7Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(Java7Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(Java7Parser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(Java7Parser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(Java7Parser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(Java7Parser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(Java7Parser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#qualifiedImportName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedImportName(Java7Parser.QualifiedImportNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#qualifiedImportName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedImportName(Java7Parser.QualifiedImportNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(Java7Parser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(Java7Parser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#classOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceDeclaration(Java7Parser.ClassOrInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#classOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceDeclaration(Java7Parser.ClassOrInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(Java7Parser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(Java7Parser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(Java7Parser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(Java7Parser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifiers(Java7Parser.VariableModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifiers(Java7Parser.VariableModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(Java7Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(Java7Parser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(Java7Parser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(Java7Parser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(Java7Parser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(Java7Parser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(Java7Parser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(Java7Parser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(Java7Parser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(Java7Parser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(Java7Parser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(Java7Parser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(Java7Parser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(Java7Parser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(Java7Parser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(Java7Parser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(Java7Parser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(Java7Parser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(Java7Parser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(Java7Parser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(Java7Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(Java7Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(Java7Parser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(Java7Parser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(Java7Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(Java7Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(Java7Parser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(Java7Parser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(Java7Parser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(Java7Parser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(Java7Parser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(Java7Parser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(Java7Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(Java7Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void enterMemberDecl(Java7Parser.MemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void exitMemberDecl(Java7Parser.MemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(Java7Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(Java7Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(Java7Parser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(Java7Parser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#constructorBlock}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBlock(Java7Parser.ConstructorBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#constructorBlock}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBlock(Java7Parser.ConstructorBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(Java7Parser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(Java7Parser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(Java7Parser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(Java7Parser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(Java7Parser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(Java7Parser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(Java7Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(Java7Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#defaultInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDefaultInterfaceMethodDeclaration(Java7Parser.DefaultInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#defaultInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDefaultInterfaceMethodDeclaration(Java7Parser.DefaultInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#interfaceFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceFieldDeclaration(Java7Parser.InterfaceFieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#interfaceFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceFieldDeclaration(Java7Parser.InterfaceFieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Java7Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Java7Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(Java7Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(Java7Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#identifierTypeArgument}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierTypeArgument(Java7Parser.IdentifierTypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#identifierTypeArgument}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierTypeArgument(Java7Parser.IdentifierTypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(Java7Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(Java7Parser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(Java7Parser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(Java7Parser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(Java7Parser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(Java7Parser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(Java7Parser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(Java7Parser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(Java7Parser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(Java7Parser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#formalParameterDecls}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDecls(Java7Parser.FormalParameterDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#formalParameterDecls}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDecls(Java7Parser.FormalParameterDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#normalParameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterNormalParameterDecl(Java7Parser.NormalParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#normalParameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitNormalParameterDecl(Java7Parser.NormalParameterDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#ellipsisParameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterEllipsisParameterDecl(Java7Parser.EllipsisParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#ellipsisParameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitEllipsisParameterDecl(Java7Parser.EllipsisParameterDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(Java7Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(Java7Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(Java7Parser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(Java7Parser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(Java7Parser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(Java7Parser.AnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(Java7Parser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(Java7Parser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(Java7Parser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(Java7Parser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(Java7Parser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(Java7Parser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(Java7Parser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(Java7Parser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(Java7Parser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(Java7Parser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(Java7Parser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(Java7Parser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(Java7Parser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(Java7Parser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(Java7Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(Java7Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(Java7Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(Java7Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(Java7Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(Java7Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(Java7Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(Java7Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#annotationMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodDeclaration(Java7Parser.AnnotationMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#annotationMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodDeclaration(Java7Parser.AnnotationMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Java7Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Java7Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(Java7Parser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(Java7Parser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(Java7Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(Java7Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(Java7Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(Java7Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Java7Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Java7Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(Java7Parser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(Java7Parser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroups(Java7Parser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroups(Java7Parser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(Java7Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(Java7Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(Java7Parser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(Java7Parser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#trystatement}.
	 * @param ctx the parse tree
	 */
	void enterTrystatement(Java7Parser.TrystatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#trystatement}.
	 * @param ctx the parse tree
	 */
	void exitTrystatement(Java7Parser.TrystatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#tryWithResources}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResources(Java7Parser.TryWithResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#tryWithResources}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResources(Java7Parser.TryWithResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(Java7Parser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(Java7Parser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(Java7Parser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(Java7Parser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(Java7Parser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(Java7Parser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(Java7Parser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(Java7Parser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(Java7Parser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(Java7Parser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(Java7Parser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(Java7Parser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#forstatement}.
	 * @param ctx the parse tree
	 */
	void enterForstatement(Java7Parser.ForstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#forstatement}.
	 * @param ctx the parse tree
	 */
	void exitForstatement(Java7Parser.ForstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachStatement(Java7Parser.ForeachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachStatement(Java7Parser.ForeachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#normalForStatement}.
	 * @param ctx the parse tree
	 */
	void enterNormalForStatement(Java7Parser.NormalForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#normalForStatement}.
	 * @param ctx the parse tree
	 */
	void exitNormalForStatement(Java7Parser.NormalForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(Java7Parser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(Java7Parser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(Java7Parser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(Java7Parser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(Java7Parser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(Java7Parser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Java7Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Java7Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(Java7Parser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(Java7Parser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(Java7Parser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(Java7Parser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(Java7Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(Java7Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(Java7Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(Java7Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(Java7Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(Java7Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(Java7Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(Java7Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(Java7Parser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(Java7Parser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(Java7Parser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(Java7Parser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#notEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualityExpression(Java7Parser.NotEqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#notEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualityExpression(Java7Parser.NotEqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(Java7Parser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(Java7Parser.InstanceOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(Java7Parser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(Java7Parser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(Java7Parser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(Java7Parser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(Java7Parser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(Java7Parser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(Java7Parser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(Java7Parser.ShiftOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(Java7Parser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(Java7Parser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOp(Java7Parser.AdditiveOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOp(Java7Parser.AdditiveOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(Java7Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(Java7Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOp(Java7Parser.MultiplicativeOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOp(Java7Parser.MultiplicativeOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(Java7Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(Java7Parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(Java7Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(Java7Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(Java7Parser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(Java7Parser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(Java7Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(Java7Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(Java7Parser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(Java7Parser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#thisSuffix}.
	 * @param ctx the parse tree
	 */
	void enterThisSuffix(Java7Parser.ThisSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#thisSuffix}.
	 * @param ctx the parse tree
	 */
	void exitThisSuffix(Java7Parser.ThisSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#identifierSuffix}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSuffix(Java7Parser.IdentifierSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#identifierSuffix}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSuffix(Java7Parser.IdentifierSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeParamCall}.
	 * @param ctx the parse tree
	 */
	void enterTypeParamCall(Java7Parser.TypeParamCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeParamCall}.
	 * @param ctx the parse tree
	 */
	void exitTypeParamCall(Java7Parser.TypeParamCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(Java7Parser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(Java7Parser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(Java7Parser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(Java7Parser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#arrayCreator}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreator(Java7Parser.ArrayCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#arrayCreator}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreator(Java7Parser.ArrayCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(Java7Parser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(Java7Parser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(Java7Parser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(Java7Parser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(Java7Parser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(Java7Parser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(Java7Parser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(Java7Parser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(Java7Parser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(Java7Parser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(Java7Parser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(Java7Parser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(Java7Parser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(Java7Parser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Java7Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Java7Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#classHeader}.
	 * @param ctx the parse tree
	 */
	void enterClassHeader(Java7Parser.ClassHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#classHeader}.
	 * @param ctx the parse tree
	 */
	void exitClassHeader(Java7Parser.ClassHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#enumHeader}.
	 * @param ctx the parse tree
	 */
	void enterEnumHeader(Java7Parser.EnumHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#enumHeader}.
	 * @param ctx the parse tree
	 */
	void exitEnumHeader(Java7Parser.EnumHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#interfaceHeader}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceHeader(Java7Parser.InterfaceHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#interfaceHeader}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceHeader(Java7Parser.InterfaceHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#annotationHeader}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationHeader(Java7Parser.AnnotationHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#annotationHeader}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationHeader(Java7Parser.AnnotationHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeHeader}.
	 * @param ctx the parse tree
	 */
	void enterTypeHeader(Java7Parser.TypeHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeHeader}.
	 * @param ctx the parse tree
	 */
	void exitTypeHeader(Java7Parser.TypeHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(Java7Parser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(Java7Parser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#fieldHeader}.
	 * @param ctx the parse tree
	 */
	void enterFieldHeader(Java7Parser.FieldHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#fieldHeader}.
	 * @param ctx the parse tree
	 */
	void exitFieldHeader(Java7Parser.FieldHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#localVariableHeader}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableHeader(Java7Parser.LocalVariableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#localVariableHeader}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableHeader(Java7Parser.LocalVariableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(Java7Parser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(Java7Parser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#inferredFormalParameters}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameters(Java7Parser.InferredFormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#inferredFormalParameters}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameters(Java7Parser.InferredFormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(Java7Parser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(Java7Parser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(Java7Parser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(Java7Parser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(Java7Parser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(Java7Parser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(Java7Parser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(Java7Parser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(Java7Parser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(Java7Parser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(Java7Parser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(Java7Parser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(Java7Parser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(Java7Parser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(Java7Parser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(Java7Parser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java7Parser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(Java7Parser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java7Parser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(Java7Parser.DimsContext ctx);
}