package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.NameExpr;

import java.util.LinkedList;
import java.util.List;

public class QualifiedNameListContextAdapter implements Adapter<List<NameExpr>, Java7Parser.QualifiedNameListContext> {
    public List<NameExpr> adapt(Java7Parser.QualifiedNameListContext context) {

        List<NameExpr> nameExprList = new LinkedList<NameExpr>();
        for (Java7Parser.QualifiedNameContext qualifiedNameContext : context.qualifiedName()) {
            nameExprList.add(Adapters.getQualifiedNameContextAdapter().adapt(qualifiedNameContext));
        }

        return nameExprList;
    }
}
