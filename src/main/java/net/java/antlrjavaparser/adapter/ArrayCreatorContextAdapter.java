package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.ArrayCreationExpr;
import net.java.antlrjavaparser.api.expr.ArrayInitializerExpr;
import net.java.antlrjavaparser.api.expr.Expression;

import java.util.LinkedList;
import java.util.List;

public class ArrayCreatorContextAdapter implements Adapter<Expression, Java7Parser.ArrayCreatorContext> {
    public Expression adapt(Java7Parser.ArrayCreatorContext context) {

        /*
        arrayCreator
            :   NEW createdName LBRACKET RBRACKET (LBRACKET RBRACKET)* arrayInitializer
            |   NEW createdName LBRACKET expression RBRACKET (LBRACKET expression RBRACKET)* (LBRACKET RBRACKET)*
            ;

        new MyClass[] {};

         */

        ArrayCreationExpr arrayCreationExpr = new ArrayCreationExpr();
        arrayCreationExpr.setArrayCount(context.LBRACKET().size());
        arrayCreationExpr.setType(Adapters.getCreatedNameContextAdapter().adapt(context.createdName()));

        if (context.arrayInitializer() != null) {
            arrayCreationExpr.setInitializer(Adapters.getArrayInitializerContextAdapter().adapt(context.arrayInitializer()));
        } else if (context.expression() != null) {
            List<Expression> expressionList = new LinkedList<Expression>();
            for (Java7Parser.ExpressionContext expressionContext : context.expression()) {
                expressionList.add(Adapters.getExpressionContextAdapter().adapt(expressionContext));
            }
            arrayCreationExpr.setDimensions(expressionList);
        }

        return arrayCreationExpr;
    }
}
