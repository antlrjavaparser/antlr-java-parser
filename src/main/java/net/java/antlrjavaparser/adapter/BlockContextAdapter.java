package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;

public class BlockContextAdapter implements Adapter<Node, Java7Parser.BlockContext> {
    public Node adapt(Java7Parser.BlockContext context) {
        return null;
    }
}
