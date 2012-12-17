package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.NameExpr;

public class QualifiedNameContextAdapter implements Adapter<NameExpr, Java7Parser.QualifiedNameContext> {
    public NameExpr adapt(Java7Parser.QualifiedNameContext context) {
        return new NameExpr(AdapterUtil.dottedIdentifier(context.Identifier()));
    }
}
