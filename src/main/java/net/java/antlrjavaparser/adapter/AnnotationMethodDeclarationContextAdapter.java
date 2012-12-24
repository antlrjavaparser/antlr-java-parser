package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.AnnotationMemberDeclaration;
import net.java.antlrjavaparser.api.body.BodyDeclaration;

public class AnnotationMethodDeclarationContextAdapter implements Adapter<BodyDeclaration, Java7Parser.AnnotationMethodDeclarationContext> {
    public BodyDeclaration adapt(Java7Parser.AnnotationMethodDeclarationContext context) {
        /*
            annotationMethodDeclaration
                :    modifiers type Identifier LPAREN RPAREN (DEFAULT elementValue)? SEMI
                ;
         */

        AnnotationMemberDeclaration annotationMemberDeclaration = new AnnotationMemberDeclaration();

        AdapterUtil.setModifiers(context.modifiers(), annotationMemberDeclaration);
        annotationMemberDeclaration.setType(Adapters.getTypeContextAdapter().adapt(context.type()));
        annotationMemberDeclaration.setName(context.Identifier().getText());

        if (context.elementValue() != null) {
            annotationMemberDeclaration.setDefaultValue(Adapters.getElementValueContextAdapter().adapt(context.elementValue()));
        }

        return annotationMemberDeclaration;
    }
}
