package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.*;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/4/12
 * Time: 7:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class AnnotationAdapter implements Adapter<AnnotationExpr, Java7Parser.AnnotationContext> {
    @Override
    public AnnotationExpr adapt(Java7Parser.AnnotationContext context) {
/*
        if (context.markerAnnotation() != null) {
            MarkerAnnotationExpr markerAnnotationExpr = new MarkerAnnotationExpr();
            markerAnnotationExpr.setName(
                    new NameExpr(AdapterUtil.dottedIdentifier(context.markerAnnotation().annotationName().Identifier())));

            return markerAnnotationExpr;
        } else if (context.normalAnnotation() != null) {
            NormalAnnotationExpr normalAnnotationExpr = new NormalAnnotationExpr();
            normalAnnotationExpr.setName(
                    new NameExpr(AdapterUtil.dottedIdentifier(context.normalAnnotation().annotationName().Identifier())));

            //context.normalAnnotation().elementValuePairs()



            return normalAnnotationExpr;
        } else if (context.singleElementAnnotation() != null) {
            MarkerAnnotationExpr markerAnnotationExpr = new MarkerAnnotationExpr();
            markerAnnotationExpr.setName(
                    new NameExpr(AdapterUtil.dottedIdentifier(context.singleElementAnnotation().annotationName().Identifier())));

            return markerAnnotationExpr;
        }

        //AnnotationExpr annotationExpr = new AnnotationExpr();
        //annotationExpr.setName(new NameExpr(AdapterUtil.dottedIdentifier(context.annotationName().Identifier())));
*/
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
/*
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
    */
}
