package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.EnumConstantDeclaration;

public class EnumConstantContextAdapter implements Adapter<EnumConstantDeclaration, Java7Parser.EnumConstantContext> {
    public EnumConstantDeclaration adapt(Java7Parser.EnumConstantContext context) {

        /*
        enumConstant
            :   (annotations)? Identifier(arguments)? (classBody)?
            ;
         */

        EnumConstantDeclaration enumConstantDeclaration = new EnumConstantDeclaration();

        if (context.annotations() != null) {
            enumConstantDeclaration.setAnnotations(Adapters.getAnnotationsContextAdapter().adapt(context.annotations()));
        }

        enumConstantDeclaration.setName(context.Identifier().getText());

        if (context.arguments() != null) {
            enumConstantDeclaration.setArgs(Adapters.getArgumentsContextAdapter().adapt(context.arguments()));
        }

        if (context.classBody() != null) {
            enumConstantDeclaration.setClassBody(Adapters.getClassBodyContextAdapter().adapt(context.classBody()));
        }

        return enumConstantDeclaration;
    }
}
