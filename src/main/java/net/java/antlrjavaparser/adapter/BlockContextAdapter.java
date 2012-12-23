package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.stmt.BlockStmt;
import net.java.antlrjavaparser.api.stmt.Statement;

import java.util.LinkedList;
import java.util.List;

public class BlockContextAdapter implements Adapter<BlockStmt, Java7Parser.BlockContext> {
    public BlockStmt adapt(Java7Parser.BlockContext context) {
        BlockStmt blockStmt = new BlockStmt();

        List<Statement> blockStmtList = new LinkedList<Statement>();
        for (Java7Parser.BlockStatementContext blockStatementContext : context.blockStatement()) {
            blockStmtList.add(Adapters.getBlockStatementContextAdapter().adapt(blockStatementContext));
        }

        blockStmt.setStmts(blockStmtList);

        return blockStmt;
    }
}
