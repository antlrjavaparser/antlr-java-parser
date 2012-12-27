package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.ObjectCreationExpr;
import net.java.antlrjavaparser.api.type.ClassOrInterfaceType;

public class InnerCreatorContextAdapter implements Adapter<ObjectCreationExpr, Java7Parser.InnerCreatorContext> {
    public ObjectCreationExpr adapt(Java7Parser.InnerCreatorContext context) {

        /*
            innerCreator
                :   DOT NEW (nonWildcardTypeArguments)? identifierTypeArgument classCreatorRest
                ;
         */

        ObjectCreationExpr objectCreationExpr = new ObjectCreationExpr();

        if (context.nonWildcardTypeArguments() != null) {
            objectCreationExpr.setTypeArgs(Adapters.getTypeListContextAdapter().adapt(context.nonWildcardTypeArguments().typeList()));
        }

        ClassOrInterfaceType classOrInterfaceType = new ClassOrInterfaceType();
        classOrInterfaceType.setName(context.identifierTypeArgument().Identifier().getText());

        if (context.identifierTypeArgument().typeArguments() != null) {
            classOrInterfaceType.setTypeArgs(Adapters.getTypeArgumentsContextAdapter().adapt(context.identifierTypeArgument().typeArguments()));
        }

        objectCreationExpr.setType(classOrInterfaceType);

        // arguments classBody?
        objectCreationExpr.setArgs(Adapters.getArgumentsContextAdapter().adapt(context.classCreatorRest().arguments()));

        if (context.classCreatorRest().classBody() != null) {
            objectCreationExpr.setAnonymousClassBody(Adapters.getClassBodyContextAdapter().adapt(context.classCreatorRest().classBody()));
        }

        return objectCreationExpr;
    }
}
