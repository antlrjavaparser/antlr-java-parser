package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;
import net.java.antlrjavaparser.api.expr.UnaryExpr;

public class UnaryExpressionContextAdapter implements Adapter<Expression, Java7Parser.UnaryExpressionContext> {
    public Expression adapt(Java7Parser.UnaryExpressionContext context) {

        if (context.unaryExpressionNotPlusMinus() != null) {
            return Adapters.getUnaryExpressionNotPlusMinusContextAdapter().adapt(context.unaryExpressionNotPlusMinus());
        } else {
            UnaryExpr unaryExpr = new UnaryExpr();

            UnaryExpr.Operator operator = null;

            if (context.PLUS() != null) {
                operator = UnaryExpr.Operator.positive;
            } else if (context.PLUSPLUS() != null) {
                operator = UnaryExpr.Operator.preIncrement;
            } else if (context.SUB() != null) {
                operator = UnaryExpr.Operator.negative;
            } else if (context.SUBSUB() != null) {
                operator = UnaryExpr.Operator.preDecrement;
            } else if (context.TILDE() != null) {
                operator = UnaryExpr.Operator.inverse;
            } else if (context.BANG() != null) {
                operator = UnaryExpr.Operator.not;
            }

            unaryExpr.setOperator(operator);
            unaryExpr.setExpr(Adapters.getUnaryExpressionContextAdapter().adapt(context.unaryExpression()));

            return unaryExpr;
        }
    }
}
