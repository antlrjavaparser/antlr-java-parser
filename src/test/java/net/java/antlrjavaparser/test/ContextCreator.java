package net.java.antlrjavaparser.test;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/15/12
 * Time: 12:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class ContextCreator {
    private static List<String> contexts = new LinkedList<String>();

    static {
        contexts.add("CompilationUnitContext");
        contexts.add("PackageDeclarationContext");
        contexts.add("ImportDeclarationContext");
        contexts.add("QualifiedImportNameContext");
        contexts.add("TypeDeclarationContext");
        contexts.add("ClassOrInterfaceDeclarationContext");
        contexts.add("ModifiersContext");
        contexts.add("VariableModifiersContext");
        contexts.add("ClassDeclarationContext");
        contexts.add("NormalClassDeclarationContext");
        contexts.add("TypeParametersContext");
        contexts.add("TypeParameterContext");
        contexts.add("TypeBoundContext");
        contexts.add("EnumDeclarationContext");
        contexts.add("EnumBodyContext");
        contexts.add("EnumConstantsContext");
        contexts.add("EnumConstantContext");
        contexts.add("EnumBodyDeclarationsContext");
        contexts.add("InterfaceDeclarationContext");
        contexts.add("NormalInterfaceDeclarationContext");
        contexts.add("TypeListContext");
        contexts.add("ClassBodyContext");
        contexts.add("InterfaceBodyContext");
        contexts.add("ClassBodyDeclarationContext");
        contexts.add("MemberDeclContext");
        contexts.add("MethodDeclarationContext");
        contexts.add("FieldDeclarationContext");
        contexts.add("VariableDeclaratorContext");
        contexts.add("InterfaceBodyDeclarationContext");
        contexts.add("InterfaceMethodDeclarationContext");
        contexts.add("InterfaceFieldDeclarationContext");
        contexts.add("TypeContext");
        contexts.add("ClassOrInterfaceTypeContext");
        contexts.add("PrimitiveTypeContext");
        contexts.add("TypeArgumentsContext");
        contexts.add("TypeArgumentContext");
        contexts.add("QualifiedNameListContext");
        contexts.add("FormalParametersContext");
        contexts.add("FormalParameterDeclsContext");
        contexts.add("NormalParameterDeclContext");
        contexts.add("EllipsisParameterDeclContext");
        contexts.add("ExplicitConstructorInvocationContext");
        contexts.add("QualifiedNameContext");
        contexts.add("AnnotationsContext");
        contexts.add("AnnotationContext");
        contexts.add("MarkerAnnotationContext");
        contexts.add("SingleElementAnnotationContext");
        contexts.add("NormalAnnotationContext");
        contexts.add("ElementValuePairsContext");
        contexts.add("ElementValuePairContext");
        contexts.add("ElementValueContext");
        contexts.add("ElementValueArrayInitializerContext");
        contexts.add("AnnotationTypeDeclarationContext");
        contexts.add("AnnotationTypeBodyContext");
        contexts.add("AnnotationTypeElementDeclarationContext");
        contexts.add("AnnotationMethodDeclarationContext");
        contexts.add("BlockContext");
        contexts.add("BlockStatementContext");
        contexts.add("LocalVariableDeclarationStatementContext");
        contexts.add("LocalVariableDeclarationContext");
        contexts.add("StatementContext");
        contexts.add("SwitchBlockStatementGroupsContext");
        contexts.add("SwitchBlockStatementGroupContext");
        contexts.add("SwitchLabelContext");
        contexts.add("TrystatementContext");
        contexts.add("TryWithResourcesContext");
        contexts.add("ResourceSpecificationContext");
        contexts.add("ResourcesContext");
        contexts.add("ResourceContext");
        contexts.add("CatchesContext");
        contexts.add("CatchClauseContext");
        contexts.add("CatchFormalParameterContext");
        contexts.add("FormalParameterContext");
        contexts.add("ForstatementContext");
        contexts.add("ForInitContext");
        contexts.add("ParExpressionContext");
        contexts.add("ExpressionListContext");
        contexts.add("ExpressionContext");
        contexts.add("AssignmentOperatorContext");
        contexts.add("ConditionalExpressionContext");
        contexts.add("ConditionalOrExpressionContext");
        contexts.add("ConditionalAndExpressionContext");
        contexts.add("InclusiveOrExpressionContext");
        contexts.add("ExclusiveOrExpressionContext");
        contexts.add("AndExpressionContext");
        contexts.add("EqualityExpressionContext");
        contexts.add("InstanceOfExpressionContext");
        contexts.add("RelationalExpressionContext");
        contexts.add("RelationalOpContext");
        contexts.add("ShiftExpressionContext");
        contexts.add("ShiftOpContext");
        contexts.add("AdditiveExpressionContext");
        contexts.add("MultiplicativeExpressionContext");
        contexts.add("UnaryExpressionContext");
        contexts.add("UnaryExpressionNotPlusMinusContext");
        contexts.add("CastExpressionContext");
        contexts.add("PrimaryContext");
        contexts.add("SuperSuffixContext");
        contexts.add("IdentifierSuffixContext");
        contexts.add("SelectorContext");
        contexts.add("CreatorContext");
        contexts.add("ArrayCreatorContext");
        contexts.add("VariableInitializerContext");
        contexts.add("ArrayInitializerContext");
        contexts.add("CreatedNameContext");
        contexts.add("InnerCreatorContext");
        contexts.add("ClassCreatorRestContext");
        contexts.add("NonWildcardTypeArgumentsContext");
        contexts.add("ArgumentsContext");
        contexts.add("LiteralContext");
        contexts.add("ClassHeaderContext");
        contexts.add("EnumHeaderContext");
        contexts.add("InterfaceHeaderContext");
        contexts.add("AnnotationHeaderContext");
        contexts.add("TypeHeaderContext");
        contexts.add("MethodHeaderContext");
        contexts.add("FieldHeaderContext");
        contexts.add("LocalVariableHeaderContext");
    }

    public static void main(String args[]) throws Exception {
        for (String context : contexts) {
            FileWriter writer = new FileWriter("C:\\tmp\\contexts\\" + context + "Adapter.java", false);
            PrintWriter out = new PrintWriter(writer);

            out.println("package net.java.antlrjavaparser.adapter;");
            out.println("");
            out.println("import net.java.antlrjavaparser.api.Node;");
            out.println("import net.java.antlrjavaparser.Java7Parser;");
            out.println("");
            out.println("public class " + context + "Adapter implements Adapter<Node, Java7Parser." + context + "> {");
            out.println("    public Node adapt(Java7Parser." + context + " context) {");
            out.println("        return null;");
            out.println("    }");
            out.println("}");

            writer.close();
        }

        FileWriter writer = new FileWriter("C:\\tmp\\contexts\\Adapters.java", false);
        PrintWriter out = new PrintWriter(writer);

        out.println("package net.java.antlrjavaparser.adapter;");
        out.println("");
        out.println("public class Adapters {");

        for (String context : contexts) {
            // private static CompilationUnitAdapter compilationUnitAdapter = new CompilationUnitAdapter();
            out.println("    private static " + context + "Adapter " + lowerFirstLetter(context) + "Adapter = new " + context + "Adapter();");
        }

        out.println("");

        for (String context : contexts) {

            /*
                public static StatementAdapter getStatementAdapter() {
                    return statementAdapter;
                }
             */
            out.println("    public static " + context + "Adapter get" + context + "Adapter() {");
            out.println("        return " + lowerFirstLetter(context) + "Adapter;");
            out.println("    }");
            out.println("");
        }

        out.println("");
        out.println("}");

        writer.close();
/*



        public class Adapters {

 */



    }

    private static String lowerFirstLetter(String name) {
        return name.substring(0,1).toLowerCase() + name.substring(1);
    }


}
