package net.java.antlrjavaparser.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/1/12
 * Time: 6:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Adapters {
    private static CompilationUnitAdapter compilationUnitAdapter = new CompilationUnitAdapter();
    private static PackageDeclarationAdapter packageDeclarationAdapter = new PackageDeclarationAdapter();
    private static ImportDeclarationAdapter importDeclarationAdapter = new ImportDeclarationAdapter();
    private static TypeDeclarationAdapter typeDeclarationAdapter = new TypeDeclarationAdapter();
    private static ClassDeclarationAdapter classDeclarationAdapter = new ClassDeclarationAdapter();
    private static InterfaceDeclarationAdapter interfaceDeclarationAdapter = new InterfaceDeclarationAdapter();
    private static ClassBodyDeclarationAdapter classBodyDeclarationAdapter = new ClassBodyDeclarationAdapter();
    private static MethodDeclarationAdapter methodDeclarationAdapter = new MethodDeclarationAdapter();
    private static AnnotationAdapter annotationAdapter = new AnnotationAdapter();
    private static ElementValuePairAdapter elementValuePairAdapter = new ElementValuePairAdapter();
    private static ElementValueAdapter elementValueAdapter = new ElementValueAdapter();
    private static ExpressionAdapter expressionAdapter = new ExpressionAdapter();
    private static PrimaryAdapter primaryAdapter = new PrimaryAdapter();
    private static LiteralAdapter literalAdapter = new LiteralAdapter();
    private static BlockStatementAdapter blockStatementAdapter = new BlockStatementAdapter();


    private static StatementAdapter statementAdapter = new StatementAdapter();
    private static BlockAdapter blockAdapter = new BlockAdapter();
    private static LocalVariableDeclarationStatementAdapter localVariableDeclarationStatementAdapter = new LocalVariableDeclarationStatementAdapter();
    private static NormalInterfaceDeclarationAdapter normalInterfaceDeclarationAdapter = new NormalInterfaceDeclarationAdapter();
    private static AnnotationTypeDeclarationAdapter annotationTypeDeclarationAdapter = new AnnotationTypeDeclarationAdapter();
    private static TypeParametersAdapter typeParametersAdapter = new TypeParametersAdapter();
    private static TypeParameterAdapter typeParameterAdapter = new TypeParameterAdapter();
    private static TypeBoundAdapter typeBoundAdapter = new TypeBoundAdapter();
    private static ClassOrInterfaceTypeAdapter classOrInterfaceTypeAdapter = new ClassOrInterfaceTypeAdapter();
    private static PrimitiveTypeAdapter primitiveTypeAdapter = new PrimitiveTypeAdapter();
    private static TypeAdapter typeAdapter = new TypeAdapter();
    private static InterfaceTypeAdapter interfaceTypeAdapter = new InterfaceTypeAdapter();

    public static BlockAdapter getBlockAdapter() {
        return blockAdapter;
    }

    public static StatementAdapter getStatementAdapter() {
        return statementAdapter;
    }

    public static LocalVariableDeclarationStatementAdapter getLocalVariableDeclarationStatementAdapter() {
        return localVariableDeclarationStatementAdapter;
    }

    public static ClassDeclarationAdapter getClassDeclarationAdapter() {
        return classDeclarationAdapter;
    }

    public static InterfaceDeclarationAdapter getInterfaceDeclarationAdapter() {
        return interfaceDeclarationAdapter;
    }

    public static NormalInterfaceDeclarationAdapter getNormalInterfaceDeclarationAdapter() {
        return normalInterfaceDeclarationAdapter;
    }

    public static AnnotationTypeDeclarationAdapter getAnnotationTypeDeclarationAdapter() {
        return annotationTypeDeclarationAdapter;
    }

    public static TypeParametersAdapter getTypeParametersAdapter() {
        return typeParametersAdapter;
    }

    public static TypeParameterAdapter getTypeParameterAdapter() {
        return typeParameterAdapter;
    }

    public static TypeBoundAdapter getTypeBoundAdapter() {
        return typeBoundAdapter;
    }

    public static ClassOrInterfaceTypeAdapter getClassOrInterfaceTypeAdapter() {
        return classOrInterfaceTypeAdapter;
    }

    public static PrimitiveTypeAdapter getPrimitiveTypeAdapter() {
        return primitiveTypeAdapter;
    }

    public static TypeAdapter getTypeAdapter() {
        return typeAdapter;
    }

    public static InterfaceTypeAdapter getInterfaceTypeAdapter() {
        return interfaceTypeAdapter;
    }

    public static CompilationUnitAdapter getCompilationUnitAdapter() {
        return compilationUnitAdapter;
    }

    public static PackageDeclarationAdapter getPackageDeclarationAdapter() {
        return packageDeclarationAdapter;
    }

    public static ImportDeclarationAdapter getImportDeclarationAdapter() {
        return importDeclarationAdapter;
    }

    public static TypeDeclarationAdapter getTypeDeclarationAdapter() {
        return typeDeclarationAdapter;
    }

    public static ClassBodyDeclarationAdapter getClassBodyDeclarationAdapter() {
        return classBodyDeclarationAdapter;
    }

    public static MethodDeclarationAdapter getMethodDeclarationAdapter() {
        return methodDeclarationAdapter;
    }

    public static AnnotationAdapter getAnnotationAdapter() {
        return annotationAdapter;
    }

    public static ElementValuePairAdapter getElementValuePairAdapter() {
        return elementValuePairAdapter;
    }

    public static ElementValueAdapter getElementValueAdapter() {
        return elementValueAdapter;
    }

    public static ExpressionAdapter getExpressionAdapter() {
        return expressionAdapter;
    }

    public static PrimaryAdapter getPrimaryAdapter() {
        return primaryAdapter;
    }

    public static LiteralAdapter getLiteralAdapter() {
        return literalAdapter;
    }

    public static BlockStatementAdapter getBlockStatementAdapter() {
        return blockStatementAdapter;
    }
}
