package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.stmt.BlockStmt;

public class BlockContextAdapter implements Adapter<BlockStmt, Java7Parser.BlockContext> {
    public BlockStmt adapt(Java7Parser.BlockContext context) {
        BlockStmt blockStmt = new BlockStmt();

        return blockStmt;
    }
}
