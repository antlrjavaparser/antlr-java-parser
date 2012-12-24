package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.AnnotationDeclaration;

public class AnnotationTypeDeclarationContextAdapter implements Adapter<AnnotationDeclaration, Java7Parser.AnnotationTypeDeclarationContext> {
    public AnnotationDeclaration adapt(Java7Parser.AnnotationTypeDeclarationContext context) {

        AnnotationDeclaration annotationDeclaration = new AnnotationDeclaration();

        AdapterUtil.setModifiers(context.modifiers(), annotationDeclaration);
        annotationDeclaration.setName(context.Identifier().getText());
        annotationDeclaration.setMembers(Adapters.getAnnotationTypeBodyContextAdapter().adapt(context.annotationTypeBody()));

        return annotationDeclaration;
    }
}
