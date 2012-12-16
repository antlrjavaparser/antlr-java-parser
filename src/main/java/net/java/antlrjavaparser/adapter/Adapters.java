package net.java.antlrjavaparser.adapter;

public class Adapters {
    private static CompilationUnitContextAdapter compilationUnitContextAdapter = new CompilationUnitContextAdapter();
    private static PackageDeclarationContextAdapter packageDeclarationContextAdapter = new PackageDeclarationContextAdapter();
    private static ImportDeclarationContextAdapter importDeclarationContextAdapter = new ImportDeclarationContextAdapter();
    private static QualifiedImportNameContextAdapter qualifiedImportNameContextAdapter = new QualifiedImportNameContextAdapter();
    private static TypeDeclarationContextAdapter typeDeclarationContextAdapter = new TypeDeclarationContextAdapter();
    private static ClassOrInterfaceDeclarationContextAdapter classOrInterfaceDeclarationContextAdapter = new ClassOrInterfaceDeclarationContextAdapter();
    private static ModifiersContextAdapter modifiersContextAdapter = new ModifiersContextAdapter();
    private static VariableModifiersContextAdapter variableModifiersContextAdapter = new VariableModifiersContextAdapter();
    private static ClassDeclarationContextAdapter classDeclarationContextAdapter = new ClassDeclarationContextAdapter();
    private static NormalClassDeclarationContextAdapter normalClassDeclarationContextAdapter = new NormalClassDeclarationContextAdapter();
    private static TypeParametersContextAdapter typeParametersContextAdapter = new TypeParametersContextAdapter();
    private static TypeParameterContextAdapter typeParameterContextAdapter = new TypeParameterContextAdapter();
    private static TypeBoundContextAdapter typeBoundContextAdapter = new TypeBoundContextAdapter();
    private static EnumDeclarationContextAdapter enumDeclarationContextAdapter = new EnumDeclarationContextAdapter();
    private static EnumBodyContextAdapter enumBodyContextAdapter = new EnumBodyContextAdapter();
    private static EnumConstantsContextAdapter enumConstantsContextAdapter = new EnumConstantsContextAdapter();
    private static EnumConstantContextAdapter enumConstantContextAdapter = new EnumConstantContextAdapter();
    private static EnumBodyDeclarationsContextAdapter enumBodyDeclarationsContextAdapter = new EnumBodyDeclarationsContextAdapter();
    private static InterfaceDeclarationContextAdapter interfaceDeclarationContextAdapter = new InterfaceDeclarationContextAdapter();
    private static NormalInterfaceDeclarationContextAdapter normalInterfaceDeclarationContextAdapter = new NormalInterfaceDeclarationContextAdapter();
    private static TypeListContextAdapter typeListContextAdapter = new TypeListContextAdapter();
    private static ClassBodyContextAdapter classBodyContextAdapter = new ClassBodyContextAdapter();
    private static InterfaceBodyContextAdapter interfaceBodyContextAdapter = new InterfaceBodyContextAdapter();
    private static ClassBodyDeclarationContextAdapter classBodyDeclarationContextAdapter = new ClassBodyDeclarationContextAdapter();
    private static MemberDeclContextAdapter memberDeclContextAdapter = new MemberDeclContextAdapter();
    private static MethodDeclarationContextAdapter methodDeclarationContextAdapter = new MethodDeclarationContextAdapter();
    private static FieldDeclarationContextAdapter fieldDeclarationContextAdapter = new FieldDeclarationContextAdapter();
    private static VariableDeclaratorContextAdapter variableDeclaratorContextAdapter = new VariableDeclaratorContextAdapter();
    private static InterfaceBodyDeclarationContextAdapter interfaceBodyDeclarationContextAdapter = new InterfaceBodyDeclarationContextAdapter();
    private static InterfaceMethodDeclarationContextAdapter interfaceMethodDeclarationContextAdapter = new InterfaceMethodDeclarationContextAdapter();
    private static InterfaceFieldDeclarationContextAdapter interfaceFieldDeclarationContextAdapter = new InterfaceFieldDeclarationContextAdapter();
    private static TypeContextAdapter typeContextAdapter = new TypeContextAdapter();
    private static ClassOrInterfaceTypeContextAdapter classOrInterfaceTypeContextAdapter = new ClassOrInterfaceTypeContextAdapter();
    private static PrimitiveTypeContextAdapter primitiveTypeContextAdapter = new PrimitiveTypeContextAdapter();
    private static TypeArgumentsContextAdapter typeArgumentsContextAdapter = new TypeArgumentsContextAdapter();
    private static TypeArgumentContextAdapter typeArgumentContextAdapter = new TypeArgumentContextAdapter();
    private static QualifiedNameListContextAdapter qualifiedNameListContextAdapter = new QualifiedNameListContextAdapter();
    private static FormalParametersContextAdapter formalParametersContextAdapter = new FormalParametersContextAdapter();
    private static FormalParameterDeclsContextAdapter formalParameterDeclsContextAdapter = new FormalParameterDeclsContextAdapter();
    private static NormalParameterDeclContextAdapter normalParameterDeclContextAdapter = new NormalParameterDeclContextAdapter();
    private static EllipsisParameterDeclContextAdapter ellipsisParameterDeclContextAdapter = new EllipsisParameterDeclContextAdapter();
    private static ExplicitConstructorInvocationContextAdapter explicitConstructorInvocationContextAdapter = new ExplicitConstructorInvocationContextAdapter();
    private static QualifiedNameContextAdapter qualifiedNameContextAdapter = new QualifiedNameContextAdapter();
    private static AnnotationsContextAdapter annotationsContextAdapter = new AnnotationsContextAdapter();
    private static AnnotationContextAdapter annotationContextAdapter = new AnnotationContextAdapter();
    private static MarkerAnnotationContextAdapter markerAnnotationContextAdapter = new MarkerAnnotationContextAdapter();
    private static SingleElementAnnotationContextAdapter singleElementAnnotationContextAdapter = new SingleElementAnnotationContextAdapter();
    private static NormalAnnotationContextAdapter normalAnnotationContextAdapter = new NormalAnnotationContextAdapter();
    private static ElementValuePairsContextAdapter elementValuePairsContextAdapter = new ElementValuePairsContextAdapter();
    private static ElementValuePairContextAdapter elementValuePairContextAdapter = new ElementValuePairContextAdapter();
    private static ElementValueContextAdapter elementValueContextAdapter = new ElementValueContextAdapter();
    private static ElementValueArrayInitializerContextAdapter elementValueArrayInitializerContextAdapter = new ElementValueArrayInitializerContextAdapter();
    private static AnnotationTypeDeclarationContextAdapter annotationTypeDeclarationContextAdapter = new AnnotationTypeDeclarationContextAdapter();
    private static AnnotationTypeBodyContextAdapter annotationTypeBodyContextAdapter = new AnnotationTypeBodyContextAdapter();
    private static AnnotationTypeElementDeclarationContextAdapter annotationTypeElementDeclarationContextAdapter = new AnnotationTypeElementDeclarationContextAdapter();
    private static AnnotationMethodDeclarationContextAdapter annotationMethodDeclarationContextAdapter = new AnnotationMethodDeclarationContextAdapter();
    private static BlockContextAdapter blockContextAdapter = new BlockContextAdapter();
    private static BlockStatementContextAdapter blockStatementContextAdapter = new BlockStatementContextAdapter();
    private static LocalVariableDeclarationStatementContextAdapter localVariableDeclarationStatementContextAdapter = new LocalVariableDeclarationStatementContextAdapter();
    private static LocalVariableDeclarationContextAdapter localVariableDeclarationContextAdapter = new LocalVariableDeclarationContextAdapter();
    private static StatementContextAdapter statementContextAdapter = new StatementContextAdapter();
    private static SwitchBlockStatementGroupsContextAdapter switchBlockStatementGroupsContextAdapter = new SwitchBlockStatementGroupsContextAdapter();
    private static SwitchBlockStatementGroupContextAdapter switchBlockStatementGroupContextAdapter = new SwitchBlockStatementGroupContextAdapter();
    private static SwitchLabelContextAdapter switchLabelContextAdapter = new SwitchLabelContextAdapter();
    private static TrystatementContextAdapter trystatementContextAdapter = new TrystatementContextAdapter();
    private static TryWithResourcesContextAdapter tryWithResourcesContextAdapter = new TryWithResourcesContextAdapter();
    private static ResourceSpecificationContextAdapter resourceSpecificationContextAdapter = new ResourceSpecificationContextAdapter();
    private static ResourcesContextAdapter resourcesContextAdapter = new ResourcesContextAdapter();
    private static ResourceContextAdapter resourceContextAdapter = new ResourceContextAdapter();
    private static CatchesContextAdapter catchesContextAdapter = new CatchesContextAdapter();
    private static CatchClauseContextAdapter catchClauseContextAdapter = new CatchClauseContextAdapter();
    private static CatchFormalParameterContextAdapter catchFormalParameterContextAdapter = new CatchFormalParameterContextAdapter();
    private static FormalParameterContextAdapter formalParameterContextAdapter = new FormalParameterContextAdapter();
    private static ForstatementContextAdapter forstatementContextAdapter = new ForstatementContextAdapter();
    private static ForInitContextAdapter forInitContextAdapter = new ForInitContextAdapter();
    private static ParExpressionContextAdapter parExpressionContextAdapter = new ParExpressionContextAdapter();
    private static ExpressionListContextAdapter expressionListContextAdapter = new ExpressionListContextAdapter();
    private static ExpressionContextAdapter expressionContextAdapter = new ExpressionContextAdapter();
    private static AssignmentOperatorContextAdapter assignmentOperatorContextAdapter = new AssignmentOperatorContextAdapter();
    private static ConditionalExpressionContextAdapter conditionalExpressionContextAdapter = new ConditionalExpressionContextAdapter();
    private static ConditionalOrExpressionContextAdapter conditionalOrExpressionContextAdapter = new ConditionalOrExpressionContextAdapter();
    private static ConditionalAndExpressionContextAdapter conditionalAndExpressionContextAdapter = new ConditionalAndExpressionContextAdapter();
    private static InclusiveOrExpressionContextAdapter inclusiveOrExpressionContextAdapter = new InclusiveOrExpressionContextAdapter();
    private static ExclusiveOrExpressionContextAdapter exclusiveOrExpressionContextAdapter = new ExclusiveOrExpressionContextAdapter();
    private static AndExpressionContextAdapter andExpressionContextAdapter = new AndExpressionContextAdapter();
    private static EqualityExpressionContextAdapter equalityExpressionContextAdapter = new EqualityExpressionContextAdapter();
    private static InstanceOfExpressionContextAdapter instanceOfExpressionContextAdapter = new InstanceOfExpressionContextAdapter();
    private static RelationalExpressionContextAdapter relationalExpressionContextAdapter = new RelationalExpressionContextAdapter();
    private static RelationalOpContextAdapter relationalOpContextAdapter = new RelationalOpContextAdapter();
    private static ShiftExpressionContextAdapter shiftExpressionContextAdapter = new ShiftExpressionContextAdapter();
    private static ShiftOpContextAdapter shiftOpContextAdapter = new ShiftOpContextAdapter();
    private static AdditiveExpressionContextAdapter additiveExpressionContextAdapter = new AdditiveExpressionContextAdapter();
    private static MultiplicativeExpressionContextAdapter multiplicativeExpressionContextAdapter = new MultiplicativeExpressionContextAdapter();
    private static UnaryExpressionContextAdapter unaryExpressionContextAdapter = new UnaryExpressionContextAdapter();
    private static UnaryExpressionNotPlusMinusContextAdapter unaryExpressionNotPlusMinusContextAdapter = new UnaryExpressionNotPlusMinusContextAdapter();
    private static CastExpressionContextAdapter castExpressionContextAdapter = new CastExpressionContextAdapter();
    private static PrimaryContextAdapter primaryContextAdapter = new PrimaryContextAdapter();
    private static SuperSuffixContextAdapter superSuffixContextAdapter = new SuperSuffixContextAdapter();
    private static IdentifierSuffixContextAdapter identifierSuffixContextAdapter = new IdentifierSuffixContextAdapter();
    private static SelectorContextAdapter selectorContextAdapter = new SelectorContextAdapter();
    private static CreatorContextAdapter creatorContextAdapter = new CreatorContextAdapter();
    private static ArrayCreatorContextAdapter arrayCreatorContextAdapter = new ArrayCreatorContextAdapter();
    private static VariableInitializerContextAdapter variableInitializerContextAdapter = new VariableInitializerContextAdapter();
    private static ArrayInitializerContextAdapter arrayInitializerContextAdapter = new ArrayInitializerContextAdapter();
    private static CreatedNameContextAdapter createdNameContextAdapter = new CreatedNameContextAdapter();
    private static InnerCreatorContextAdapter innerCreatorContextAdapter = new InnerCreatorContextAdapter();
    private static ClassCreatorRestContextAdapter classCreatorRestContextAdapter = new ClassCreatorRestContextAdapter();
    private static NonWildcardTypeArgumentsContextAdapter nonWildcardTypeArgumentsContextAdapter = new NonWildcardTypeArgumentsContextAdapter();
    private static ArgumentsContextAdapter argumentsContextAdapter = new ArgumentsContextAdapter();
    private static LiteralContextAdapter literalContextAdapter = new LiteralContextAdapter();
    private static ClassHeaderContextAdapter classHeaderContextAdapter = new ClassHeaderContextAdapter();
    private static EnumHeaderContextAdapter enumHeaderContextAdapter = new EnumHeaderContextAdapter();
    private static InterfaceHeaderContextAdapter interfaceHeaderContextAdapter = new InterfaceHeaderContextAdapter();
    private static AnnotationHeaderContextAdapter annotationHeaderContextAdapter = new AnnotationHeaderContextAdapter();
    private static TypeHeaderContextAdapter typeHeaderContextAdapter = new TypeHeaderContextAdapter();
    private static MethodHeaderContextAdapter methodHeaderContextAdapter = new MethodHeaderContextAdapter();
    private static FieldHeaderContextAdapter fieldHeaderContextAdapter = new FieldHeaderContextAdapter();
    private static LocalVariableHeaderContextAdapter localVariableHeaderContextAdapter = new LocalVariableHeaderContextAdapter();

    private Adapters() {

    }

    public static CompilationUnitContextAdapter getCompilationUnitContextAdapter() {
        return compilationUnitContextAdapter;
    }

    public static PackageDeclarationContextAdapter getPackageDeclarationContextAdapter() {
        return packageDeclarationContextAdapter;
    }

    public static ImportDeclarationContextAdapter getImportDeclarationContextAdapter() {
        return importDeclarationContextAdapter;
    }

    public static QualifiedImportNameContextAdapter getQualifiedImportNameContextAdapter() {
        return qualifiedImportNameContextAdapter;
    }

    public static TypeDeclarationContextAdapter getTypeDeclarationContextAdapter() {
        return typeDeclarationContextAdapter;
    }

    public static ClassOrInterfaceDeclarationContextAdapter getClassOrInterfaceDeclarationContextAdapter() {
        return classOrInterfaceDeclarationContextAdapter;
    }

    public static ModifiersContextAdapter getModifiersContextAdapter() {
        return modifiersContextAdapter;
    }

    public static VariableModifiersContextAdapter getVariableModifiersContextAdapter() {
        return variableModifiersContextAdapter;
    }

    public static ClassDeclarationContextAdapter getClassDeclarationContextAdapter() {
        return classDeclarationContextAdapter;
    }

    public static NormalClassDeclarationContextAdapter getNormalClassDeclarationContextAdapter() {
        return normalClassDeclarationContextAdapter;
    }

    public static TypeParametersContextAdapter getTypeParametersContextAdapter() {
        return typeParametersContextAdapter;
    }

    public static TypeParameterContextAdapter getTypeParameterContextAdapter() {
        return typeParameterContextAdapter;
    }

    public static TypeBoundContextAdapter getTypeBoundContextAdapter() {
        return typeBoundContextAdapter;
    }

    public static EnumDeclarationContextAdapter getEnumDeclarationContextAdapter() {
        return enumDeclarationContextAdapter;
    }

    public static EnumBodyContextAdapter getEnumBodyContextAdapter() {
        return enumBodyContextAdapter;
    }

    public static EnumConstantsContextAdapter getEnumConstantsContextAdapter() {
        return enumConstantsContextAdapter;
    }

    public static EnumConstantContextAdapter getEnumConstantContextAdapter() {
        return enumConstantContextAdapter;
    }

    public static EnumBodyDeclarationsContextAdapter getEnumBodyDeclarationsContextAdapter() {
        return enumBodyDeclarationsContextAdapter;
    }

    public static InterfaceDeclarationContextAdapter getInterfaceDeclarationContextAdapter() {
        return interfaceDeclarationContextAdapter;
    }

    public static NormalInterfaceDeclarationContextAdapter getNormalInterfaceDeclarationContextAdapter() {
        return normalInterfaceDeclarationContextAdapter;
    }

    public static TypeListContextAdapter getTypeListContextAdapter() {
        return typeListContextAdapter;
    }

    public static ClassBodyContextAdapter getClassBodyContextAdapter() {
        return classBodyContextAdapter;
    }

    public static InterfaceBodyContextAdapter getInterfaceBodyContextAdapter() {
        return interfaceBodyContextAdapter;
    }

    public static ClassBodyDeclarationContextAdapter getClassBodyDeclarationContextAdapter() {
        return classBodyDeclarationContextAdapter;
    }

    public static MemberDeclContextAdapter getMemberDeclContextAdapter() {
        return memberDeclContextAdapter;
    }

    public static MethodDeclarationContextAdapter getMethodDeclarationContextAdapter() {
        return methodDeclarationContextAdapter;
    }

    public static FieldDeclarationContextAdapter getFieldDeclarationContextAdapter() {
        return fieldDeclarationContextAdapter;
    }

    public static VariableDeclaratorContextAdapter getVariableDeclaratorContextAdapter() {
        return variableDeclaratorContextAdapter;
    }

    public static InterfaceBodyDeclarationContextAdapter getInterfaceBodyDeclarationContextAdapter() {
        return interfaceBodyDeclarationContextAdapter;
    }

    public static InterfaceMethodDeclarationContextAdapter getInterfaceMethodDeclarationContextAdapter() {
        return interfaceMethodDeclarationContextAdapter;
    }

    public static InterfaceFieldDeclarationContextAdapter getInterfaceFieldDeclarationContextAdapter() {
        return interfaceFieldDeclarationContextAdapter;
    }

    public static TypeContextAdapter getTypeContextAdapter() {
        return typeContextAdapter;
    }

    public static ClassOrInterfaceTypeContextAdapter getClassOrInterfaceTypeContextAdapter() {
        return classOrInterfaceTypeContextAdapter;
    }

    public static PrimitiveTypeContextAdapter getPrimitiveTypeContextAdapter() {
        return primitiveTypeContextAdapter;
    }

    public static TypeArgumentsContextAdapter getTypeArgumentsContextAdapter() {
        return typeArgumentsContextAdapter;
    }

    public static TypeArgumentContextAdapter getTypeArgumentContextAdapter() {
        return typeArgumentContextAdapter;
    }

    public static QualifiedNameListContextAdapter getQualifiedNameListContextAdapter() {
        return qualifiedNameListContextAdapter;
    }

    public static FormalParametersContextAdapter getFormalParametersContextAdapter() {
        return formalParametersContextAdapter;
    }

    public static FormalParameterDeclsContextAdapter getFormalParameterDeclsContextAdapter() {
        return formalParameterDeclsContextAdapter;
    }

    public static NormalParameterDeclContextAdapter getNormalParameterDeclContextAdapter() {
        return normalParameterDeclContextAdapter;
    }

    public static EllipsisParameterDeclContextAdapter getEllipsisParameterDeclContextAdapter() {
        return ellipsisParameterDeclContextAdapter;
    }

    public static ExplicitConstructorInvocationContextAdapter getExplicitConstructorInvocationContextAdapter() {
        return explicitConstructorInvocationContextAdapter;
    }

    public static QualifiedNameContextAdapter getQualifiedNameContextAdapter() {
        return qualifiedNameContextAdapter;
    }

    public static AnnotationsContextAdapter getAnnotationsContextAdapter() {
        return annotationsContextAdapter;
    }

    public static AnnotationContextAdapter getAnnotationContextAdapter() {
        return annotationContextAdapter;
    }

    public static MarkerAnnotationContextAdapter getMarkerAnnotationContextAdapter() {
        return markerAnnotationContextAdapter;
    }

    public static SingleElementAnnotationContextAdapter getSingleElementAnnotationContextAdapter() {
        return singleElementAnnotationContextAdapter;
    }

    public static NormalAnnotationContextAdapter getNormalAnnotationContextAdapter() {
        return normalAnnotationContextAdapter;
    }

    public static ElementValuePairsContextAdapter getElementValuePairsContextAdapter() {
        return elementValuePairsContextAdapter;
    }

    public static ElementValuePairContextAdapter getElementValuePairContextAdapter() {
        return elementValuePairContextAdapter;
    }

    public static ElementValueContextAdapter getElementValueContextAdapter() {
        return elementValueContextAdapter;
    }

    public static ElementValueArrayInitializerContextAdapter getElementValueArrayInitializerContextAdapter() {
        return elementValueArrayInitializerContextAdapter;
    }

    public static AnnotationTypeDeclarationContextAdapter getAnnotationTypeDeclarationContextAdapter() {
        return annotationTypeDeclarationContextAdapter;
    }

    public static AnnotationTypeBodyContextAdapter getAnnotationTypeBodyContextAdapter() {
        return annotationTypeBodyContextAdapter;
    }

    public static AnnotationTypeElementDeclarationContextAdapter getAnnotationTypeElementDeclarationContextAdapter() {
        return annotationTypeElementDeclarationContextAdapter;
    }

    public static AnnotationMethodDeclarationContextAdapter getAnnotationMethodDeclarationContextAdapter() {
        return annotationMethodDeclarationContextAdapter;
    }

    public static BlockContextAdapter getBlockContextAdapter() {
        return blockContextAdapter;
    }

    public static BlockStatementContextAdapter getBlockStatementContextAdapter() {
        return blockStatementContextAdapter;
    }

    public static LocalVariableDeclarationStatementContextAdapter getLocalVariableDeclarationStatementContextAdapter() {
        return localVariableDeclarationStatementContextAdapter;
    }

    public static LocalVariableDeclarationContextAdapter getLocalVariableDeclarationContextAdapter() {
        return localVariableDeclarationContextAdapter;
    }

    public static StatementContextAdapter getStatementContextAdapter() {
        return statementContextAdapter;
    }

    public static SwitchBlockStatementGroupsContextAdapter getSwitchBlockStatementGroupsContextAdapter() {
        return switchBlockStatementGroupsContextAdapter;
    }

    public static SwitchBlockStatementGroupContextAdapter getSwitchBlockStatementGroupContextAdapter() {
        return switchBlockStatementGroupContextAdapter;
    }

    public static SwitchLabelContextAdapter getSwitchLabelContextAdapter() {
        return switchLabelContextAdapter;
    }

    public static TrystatementContextAdapter getTrystatementContextAdapter() {
        return trystatementContextAdapter;
    }

    public static TryWithResourcesContextAdapter getTryWithResourcesContextAdapter() {
        return tryWithResourcesContextAdapter;
    }

    public static ResourceSpecificationContextAdapter getResourceSpecificationContextAdapter() {
        return resourceSpecificationContextAdapter;
    }

    public static ResourcesContextAdapter getResourcesContextAdapter() {
        return resourcesContextAdapter;
    }

    public static ResourceContextAdapter getResourceContextAdapter() {
        return resourceContextAdapter;
    }

    public static CatchesContextAdapter getCatchesContextAdapter() {
        return catchesContextAdapter;
    }

    public static CatchClauseContextAdapter getCatchClauseContextAdapter() {
        return catchClauseContextAdapter;
    }

    public static CatchFormalParameterContextAdapter getCatchFormalParameterContextAdapter() {
        return catchFormalParameterContextAdapter;
    }

    public static FormalParameterContextAdapter getFormalParameterContextAdapter() {
        return formalParameterContextAdapter;
    }

    public static ForstatementContextAdapter getForstatementContextAdapter() {
        return forstatementContextAdapter;
    }

    public static ForInitContextAdapter getForInitContextAdapter() {
        return forInitContextAdapter;
    }

    public static ParExpressionContextAdapter getParExpressionContextAdapter() {
        return parExpressionContextAdapter;
    }

    public static ExpressionListContextAdapter getExpressionListContextAdapter() {
        return expressionListContextAdapter;
    }

    public static ExpressionContextAdapter getExpressionContextAdapter() {
        return expressionContextAdapter;
    }

    public static AssignmentOperatorContextAdapter getAssignmentOperatorContextAdapter() {
        return assignmentOperatorContextAdapter;
    }

    public static ConditionalExpressionContextAdapter getConditionalExpressionContextAdapter() {
        return conditionalExpressionContextAdapter;
    }

    public static ConditionalOrExpressionContextAdapter getConditionalOrExpressionContextAdapter() {
        return conditionalOrExpressionContextAdapter;
    }

    public static ConditionalAndExpressionContextAdapter getConditionalAndExpressionContextAdapter() {
        return conditionalAndExpressionContextAdapter;
    }

    public static InclusiveOrExpressionContextAdapter getInclusiveOrExpressionContextAdapter() {
        return inclusiveOrExpressionContextAdapter;
    }

    public static ExclusiveOrExpressionContextAdapter getExclusiveOrExpressionContextAdapter() {
        return exclusiveOrExpressionContextAdapter;
    }

    public static AndExpressionContextAdapter getAndExpressionContextAdapter() {
        return andExpressionContextAdapter;
    }

    public static EqualityExpressionContextAdapter getEqualityExpressionContextAdapter() {
        return equalityExpressionContextAdapter;
    }

    public static InstanceOfExpressionContextAdapter getInstanceOfExpressionContextAdapter() {
        return instanceOfExpressionContextAdapter;
    }

    public static RelationalExpressionContextAdapter getRelationalExpressionContextAdapter() {
        return relationalExpressionContextAdapter;
    }

    public static RelationalOpContextAdapter getRelationalOpContextAdapter() {
        return relationalOpContextAdapter;
    }

    public static ShiftExpressionContextAdapter getShiftExpressionContextAdapter() {
        return shiftExpressionContextAdapter;
    }

    public static ShiftOpContextAdapter getShiftOpContextAdapter() {
        return shiftOpContextAdapter;
    }

    public static AdditiveExpressionContextAdapter getAdditiveExpressionContextAdapter() {
        return additiveExpressionContextAdapter;
    }

    public static MultiplicativeExpressionContextAdapter getMultiplicativeExpressionContextAdapter() {
        return multiplicativeExpressionContextAdapter;
    }

    public static UnaryExpressionContextAdapter getUnaryExpressionContextAdapter() {
        return unaryExpressionContextAdapter;
    }

    public static UnaryExpressionNotPlusMinusContextAdapter getUnaryExpressionNotPlusMinusContextAdapter() {
        return unaryExpressionNotPlusMinusContextAdapter;
    }

    public static CastExpressionContextAdapter getCastExpressionContextAdapter() {
        return castExpressionContextAdapter;
    }

    public static PrimaryContextAdapter getPrimaryContextAdapter() {
        return primaryContextAdapter;
    }

    public static SuperSuffixContextAdapter getSuperSuffixContextAdapter() {
        return superSuffixContextAdapter;
    }

    public static IdentifierSuffixContextAdapter getIdentifierSuffixContextAdapter() {
        return identifierSuffixContextAdapter;
    }

    public static SelectorContextAdapter getSelectorContextAdapter() {
        return selectorContextAdapter;
    }

    public static CreatorContextAdapter getCreatorContextAdapter() {
        return creatorContextAdapter;
    }

    public static ArrayCreatorContextAdapter getArrayCreatorContextAdapter() {
        return arrayCreatorContextAdapter;
    }

    public static VariableInitializerContextAdapter getVariableInitializerContextAdapter() {
        return variableInitializerContextAdapter;
    }

    public static ArrayInitializerContextAdapter getArrayInitializerContextAdapter() {
        return arrayInitializerContextAdapter;
    }

    public static CreatedNameContextAdapter getCreatedNameContextAdapter() {
        return createdNameContextAdapter;
    }

    public static InnerCreatorContextAdapter getInnerCreatorContextAdapter() {
        return innerCreatorContextAdapter;
    }

    public static ClassCreatorRestContextAdapter getClassCreatorRestContextAdapter() {
        return classCreatorRestContextAdapter;
    }

    public static NonWildcardTypeArgumentsContextAdapter getNonWildcardTypeArgumentsContextAdapter() {
        return nonWildcardTypeArgumentsContextAdapter;
    }

    public static ArgumentsContextAdapter getArgumentsContextAdapter() {
        return argumentsContextAdapter;
    }

    public static LiteralContextAdapter getLiteralContextAdapter() {
        return literalContextAdapter;
    }

    public static ClassHeaderContextAdapter getClassHeaderContextAdapter() {
        return classHeaderContextAdapter;
    }

    public static EnumHeaderContextAdapter getEnumHeaderContextAdapter() {
        return enumHeaderContextAdapter;
    }

    public static InterfaceHeaderContextAdapter getInterfaceHeaderContextAdapter() {
        return interfaceHeaderContextAdapter;
    }

    public static AnnotationHeaderContextAdapter getAnnotationHeaderContextAdapter() {
        return annotationHeaderContextAdapter;
    }

    public static TypeHeaderContextAdapter getTypeHeaderContextAdapter() {
        return typeHeaderContextAdapter;
    }

    public static MethodHeaderContextAdapter getMethodHeaderContextAdapter() {
        return methodHeaderContextAdapter;
    }

    public static FieldHeaderContextAdapter getFieldHeaderContextAdapter() {
        return fieldHeaderContextAdapter;
    }

    public static LocalVariableHeaderContextAdapter getLocalVariableHeaderContextAdapter() {
        return localVariableHeaderContextAdapter;
    }


}
