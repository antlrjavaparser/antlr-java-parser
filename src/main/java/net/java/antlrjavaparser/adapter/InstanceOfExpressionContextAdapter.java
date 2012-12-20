package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;
import net.java.antlrjavaparser.api.expr.InstanceOfExpr;
import net.java.antlrjavaparser.api.type.Type;

public class InstanceOfExpressionContextAdapter implements Adapter<Expression, Java7Parser.InstanceOfExpressionContext> {
    public Expression adapt(Java7Parser.InstanceOfExpressionContext context) {

        Expression expression = Adapters.getRelationalExpressionContextAdapter().adapt(context.relationalExpression());

        if (context.type() != null) {
            Type type = Adapters.getTypeContextAdapter().adapt(context.type());
            InstanceOfExpr instanceOfExpr = new InstanceOfExpr();
            instanceOfExpr.setType(type);
            instanceOfExpr.setExpr(expression);
            return instanceOfExpr;
        }

        return expression;
    }
}
