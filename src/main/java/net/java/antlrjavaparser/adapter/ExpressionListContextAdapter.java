package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

import java.util.LinkedList;
import java.util.List;

public class ExpressionListContextAdapter implements Adapter<List<Expression>, Java7Parser.ExpressionListContext> {
    public List<Expression> adapt(Java7Parser.ExpressionListContext context) {
        List<Expression> expressionList = new LinkedList<Expression>();
        for (Java7Parser.ExpressionContext expressionContext : context.expression()) {
            expressionList.add(Adapters.getExpressionContextAdapter().adapt(expressionContext));
        }
        return expressionList;
    }
}
