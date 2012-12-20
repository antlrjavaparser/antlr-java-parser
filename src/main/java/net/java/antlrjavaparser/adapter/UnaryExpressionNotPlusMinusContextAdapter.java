package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;
import net.java.antlrjavaparser.api.expr.MethodCallExpr;
import net.java.antlrjavaparser.api.expr.ThisExpr;

public class UnaryExpressionNotPlusMinusContextAdapter implements Adapter<Expression, Java7Parser.UnaryExpressionNotPlusMinusContext> {
    public Expression adapt(Java7Parser.UnaryExpressionNotPlusMinusContext context) {

        Adapters.getCastExpressionContextAdapter().adapt(context.castExpression());


        /*
            unaryExpressionNotPlusMinus
                :   castExpression
                |   primary (selector)* (PLUSPLUS | SUBSUB)?
                ;
         */


        /*
            selector
                :   DOT Identifier (arguments)?
                |   DOT THIS
                |   DOT SUPER superSuffix
                |   innerCreator
                |   LBRACKET expression RBRACKET
                ;
         */

        /*
            primary
                :   parExpression
                |   THIS (DOT Identifier)* (identifierSuffix)?
                |   Identifier (DOT Identifier)* (identifierSuffix)?
                |   SUPER superSuffix
                |   literal
                |   creator
                |   primitiveType (LBRACKET RBRACKET)* DOT CLASS
                |   VOID DOT CLASS
                ;

         */

        if (context.castExpression() != null) {
            return Adapters.getCastExpressionContextAdapter().adapt(context.castExpression());
        } else if (context.primary() != null) {

            Expression expression = Adapters.getPrimaryContextAdapter().adapt(context.primary());
            Expression leftExpression = expression;

            if (context.selector() != null && context.selector().size() > 0) {
                for (int i = 0; i < context.selector().size(); i++) {
                    if (context.selector(i).Identifier() != null) {
                        MethodCallExpr methodCallExpr = new MethodCallExpr();
                        methodCallExpr.setArgs(Adapters.getArgumentsContextAdapter().adapt(context.selector(i).arguments()));

                        // I'm not sure if we do anything with this
                        // methodCallExpr.setTypeArgs();
                        methodCallExpr.setName(context.selector(i).Identifier().getText());
                        methodCallExpr.setScope(leftExpression);
                        leftExpression = methodCallExpr;

                        return methodCallExpr;

                    } else if (context.selector(i).THIS() != null) {
                    } else if (context.selector(i).SUPER() != null) {
                    } else if (context.selector(i).innerCreator() != null) {
                    } else if (context.selector(i).expression() != null) {

                    }

                    // selector
                    //:   DOT Identifier (arguments)?   // MethodCallExpr
                    //|   DOT THIS                      // ThisExpr
                    //|   DOT SUPER superSuffix         // SuperExpr
                    //|   innerCreator                  // ObjectCreationExpr
                    //|   LBRACKET expression RBRACKET  // ArrayAccessExpr



                    ThisExpr thisExpr;
                    //thisExpr.set
                }

            }

            return expression;
        }


        return null;

    }
}
