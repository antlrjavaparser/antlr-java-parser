package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;
import net.java.antlrjavaparser.api.expr.ObjectCreationExpr;

public class CreatorContextAdapter implements Adapter<Expression, Java7Parser.CreatorContext> {
    public Expression adapt(Java7Parser.CreatorContext context) {

        /*
            creator
                :   NEW nonWildcardTypeArguments classOrInterfaceType classCreatorRest
                |   NEW classOrInterfaceType classCreatorRest
                |   arrayCreator
                ;

            nonWildcardTypeArguments
                :   LT typeList GT
                ;

            classCreatorRest
                :   arguments
                    (classBody
                    )?
                ;

         */

        if (context.nonWildcardTypeArguments() != null) {
            ObjectCreationExpr objectCreationExpr = new ObjectCreationExpr();
            objectCreationExpr.setTypeArgs(Adapters.getTypeListContextAdapter().adapt(context.nonWildcardTypeArguments().typeList()));
            objectCreationExpr.setType(Adapters.getClassOrInterfaceTypeContextAdapter().adapt(context.classOrInterfaceType()));
            objectCreationExpr.setArgs(Adapters.getArgumentsContextAdapter().adapt(context.classCreatorRest().arguments()));

            if (context.classCreatorRest().classBody() != null) {
                objectCreationExpr.setAnonymousClassBody(Adapters.getClassBodyContextAdapter().adapt(context.classCreatorRest().classBody()));
            }

            return objectCreationExpr;
        } else if (context.classOrInterfaceType() != null) {
            ObjectCreationExpr objectCreationExpr = new ObjectCreationExpr();
            objectCreationExpr.setType(Adapters.getClassOrInterfaceTypeContextAdapter().adapt(context.classOrInterfaceType()));
            objectCreationExpr.setArgs(Adapters.getArgumentsContextAdapter().adapt(context.classCreatorRest().arguments()));

            if (context.classCreatorRest().classBody() != null) {
                objectCreationExpr.setAnonymousClassBody(Adapters.getClassBodyContextAdapter().adapt(context.classCreatorRest().classBody()));
            }

            return objectCreationExpr;
        } else if (context.arrayCreator() != null) {
            return Adapters.getArrayCreatorContextAdapter().adapt(context.arrayCreator());
        }

        throw new RuntimeException("Unknown creator type");
    }
}
