package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;

public class PrimaryContextAdapter implements Adapter<Node, Java7Parser.PrimaryContext> {
    public Node adapt(Java7Parser.PrimaryContext context) {
        return null;
    }
}
