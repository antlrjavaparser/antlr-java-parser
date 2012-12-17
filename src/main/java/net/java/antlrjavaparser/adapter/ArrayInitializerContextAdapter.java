package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.ArrayInitializerExpr;
import net.java.antlrjavaparser.api.expr.Expression;

import java.util.LinkedList;
import java.util.List;

public class ArrayInitializerContextAdapter implements Adapter<ArrayInitializerExpr, Java7Parser.ArrayInitializerContext> {
    public ArrayInitializerExpr adapt(Java7Parser.ArrayInitializerContext context) {

        ArrayInitializerExpr arrayInitializerExpr = new ArrayInitializerExpr();

        List<Expression> expressionList = new LinkedList<Expression>();
        for (Java7Parser.VariableInitializerContext variableInitializerContext : context.variableInitializer()) {
            expressionList.add(Adapters.getVariableInitializerContextAdapter().adapt(variableInitializerContext));
        }
        arrayInitializerExpr.setValues(expressionList);

        return arrayInitializerExpr;
    }
}
