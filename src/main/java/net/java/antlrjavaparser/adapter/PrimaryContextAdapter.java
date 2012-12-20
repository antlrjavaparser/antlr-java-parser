package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

public class PrimaryContextAdapter implements Adapter<Expression, Java7Parser.PrimaryContext> {
    public Expression adapt(Java7Parser.PrimaryContext context) {
        return null;
    }
}
