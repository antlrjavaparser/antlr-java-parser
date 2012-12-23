package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.CastExpr;
import net.java.antlrjavaparser.api.expr.Expression;

public class CastExpressionContextAdapter implements Adapter<Expression, Java7Parser.CastExpressionContext> {
    public Expression adapt(Java7Parser.CastExpressionContext context) {

        /*
            castExpression
                :   LPAREN primitiveType RPAREN unaryExpression
                |   LPAREN type RPAREN unaryExpressionNotPlusMinus
                ;
         */

        CastExpr castExpr = new CastExpr();

        if (context.type() != null) {
            castExpr.setType(Adapters.getTypeContextAdapter().adapt(context.type()));
            castExpr.setExpr(Adapters.getUnaryExpressionNotPlusMinusContextAdapter().adapt(context.unaryExpressionNotPlusMinus()));
        } else if (context.primitiveType() != null) {
            castExpr.setType(Adapters.getPrimitiveTypeContextAdapter().adapt(context.primitiveType()));
            castExpr.setExpr(Adapters.getUnaryExpressionContextAdapter().adapt(context.unaryExpression()));
        }

        return castExpr;
    }
}
