package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;

public class StatementContextAdapter implements Adapter<Node, Java7Parser.StatementContext> {
    public Node adapt(Java7Parser.StatementContext context) {
        return null;
    }
}
