package net.java.antlrjavaparser.test;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.Java7ParserBaseListener;
import net.java.antlrjavaparser.adapter.Adapters;
import net.java.antlrjavaparser.api.CompilationUnit;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 11/28/12
 * Time: 10:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class CompilationUnitListener extends Java7ParserBaseListener {

    private Java7Parser parser;
    private CompilationUnit compilationUnit;

    public CompilationUnitListener(Java7Parser parser) {
        this.parser = parser;
    }

    @Override
    public void exitCompilationUnit(Java7Parser.CompilationUnitContext ctx) {

        //System.out.println("Done");

        //compilationUnit = Adapters.getCompilationUnitContextAdapter().adapt(ctx);

        //System.out.println(compilationUnit.toString());

/*
        // Annotations
        ctx.packageDeclaration();

        ctx.importDeclaration();

        Java7Parser.StatementContext soFar = ctx.typeDeclaration().get(0)
                .classDeclaration().classBody().classBodyDeclaration(0)
                .member().methodDeclaration().methodDeclarationRest().methodBody()
                .block().blockStatement().get(0).statement();

                //.get(0).statement().getText();

        System.out.println("statement:" + soFar.getText());

        System.out.println("Is switch statement: " + (soFar.switchStatement() != null));
        System.out.println("Is if statement: " + (soFar.ifStatement() != null));
*/
    }
/*
    @Override
    public void enterMethodDeclaration(Java7Parser.MethodDeclarationContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        String type = "void";
        if ( ctx.type()!=null ) {
            type = tokens.getText(ctx.type());
        }

        //String args = tokens.getText(ctx.formalParameters());

        Java7Parser.NormalParameterDeclContext dctx = ctx.formalParameters().formalParameterDecls().normalParameterDecl().get(0);

        String args = args = dctx.type().getText() + " " + dctx.IDENTIFIER() + " " + dctx.ARRAYDECL().get(0);
       //System.out.println("\t" + type + " " + ctx.IDENTIFIER() + "(" + args + ");");
    }

    private static String blankIfNull(Object obj) {
        if (obj == null) {
            return "";
        } else {
            return obj.toString();
        }
    }

    private static String dottedIdentifier(List<TerminalNode> terminalNodeList) {
        String identifier = "";

        for (int i = 0; i < terminalNodeList.size(); i++) {
            identifier += (i > 0 ? "." : "") + terminalNodeList.get(i).getText();
        }

        return identifier;
    }


    private static List<AnnotationExpr> buildAnnotations(Java7Parser.AnnotationsContext annotations) {
        if (annotations == null || annotations.annotation() == null || annotations.annotation().size() == 0) {
            return null;
        }

        // Marker:              @Annotation
        // Single Member:       @Annotation("Something")
        // Normal Annotation:   @Annotation(a="Something", b="SomethingElse")

        List<AnnotationExpr> annotationExprs = new ArrayList<AnnotationExpr>();

        for (Java7Parser.AnnotationContext context : annotations.annotation()) {
            AnnotationExpr annotationExpr = buildAnnotation(context);

            if (annotationExpr != null) {
                annotationExprs.add(annotationExpr);
            }
        }

        return annotationExprs;
    }

    private static AnnotationExpr buildAnnotation(Java7Parser.AnnotationContext context) {
        if (context == null) {
            return null;
        }

        // Marker:              @Annotation
        // Single Member:       @Annotation("Something")
        // Normal Annotation:   @Annotation(a="Something", b="SomethingElse")
        // Complex:             @ReallyComplexAnnotation( { @SimpleAnnotation(a="...", b=3), @SimpleAnnotation(a="...", b=4) } )

        if (context.elementValuePairs() != null) {
            // Normal Annotation
            NormalAnnotationExpr annotationExpr = new NormalAnnotationExpr();

            System.out.println("Normal @: " + dottedIdentifier(context.qualifiedName().IDENTIFIER()));

            for (Java7Parser.ElementValuePairContext elementValueContext : context.elementValuePairs().elementValuePair()) {
                //elementValueContext.elementValue().
            }

            annotationExpr.setName(new NameExpr(dottedIdentifier(context.qualifiedName().IDENTIFIER())));

            return annotationExpr;
        } else if (context.elementValue() != null) {
            // Single Member
            SingleMemberAnnotationExpr annotationExpr = new SingleMemberAnnotationExpr();

            annotationExpr.setName(new NameExpr(dottedIdentifier(context.qualifiedName().IDENTIFIER())));

            //context.elementValue().conditionalExpression()

            return annotationExpr;
        } else {
            // Marker
            MarkerAnnotationExpr annotationExpr = new MarkerAnnotationExpr();
            annotationExpr.setName(new NameExpr(dottedIdentifier(context.qualifiedName().IDENTIFIER())));

            return annotationExpr;
        }
    }

    private static ConditionalExpr buildConditionalExpr(Java7Parser.ConditionalExpressionContext context) {

        ConditionalExpr conditionalExpr = new ConditionalExpr();

        if (context.conditionalOrExpression() != null) {

        } else {
            // a = b ? c : d

            //conditionalExpr.setCondition(buildConditionalExpr(context.conditionalExpression()));

        }

        return null;
    }
*/

    public CompilationUnit getCompilationUnit() {
        return compilationUnit;
    }
}
