package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.*;

public class AnnotationContextAdapter implements Adapter<AnnotationExpr, Java7Parser.AnnotationContext> {
    @Override
    public AnnotationExpr adapt(Java7Parser.AnnotationContext context) {

        if (context.markerAnnotation() != null) {
            return Adapters.getMarkerAnnotationContextAdapter().adapt(context.markerAnnotation());
        } else if (context.normalAnnotation() != null) {
            return Adapters.getNormalAnnotationContextAdapter().adapt(context.normalAnnotation());
        } else if (context.singleElementAnnotation() != null) {
            return Adapters.getSingleElementAnnotationContextAdapter().adapt(context.singleElementAnnotation());
        }

        throw new RuntimeException("Unexpected Annotation Type");
    }
}
