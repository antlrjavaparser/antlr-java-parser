package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.stmt.Statement;

public class TrystatementContextAdapter implements Adapter<Statement, Java7Parser.TrystatementContext> {
    public Statement adapt(Java7Parser.TrystatementContext context) {
        throw new RuntimeException("Not yet supported");
    }
}
