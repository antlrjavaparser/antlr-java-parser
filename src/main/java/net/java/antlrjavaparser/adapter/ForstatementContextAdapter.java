package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.stmt.ForStmt;

public class ForstatementContextAdapter implements Adapter<ForStmt, Java7Parser.ForstatementContext> {
    public ForStmt adapt(Java7Parser.ForstatementContext context) {
        // Not used
        throw new UnsupportedOperationException();
    }
}
