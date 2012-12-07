package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.stmt.BlockStmt;
import net.java.antlrjavaparser.api.stmt.Statement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/1/12
 * Time: 6:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class BlockAdapter implements Adapter<BlockStmt, Java7Parser.BlockContext> {
    public BlockStmt adapt(Java7Parser.BlockContext context) {
        BlockStmt blockStmt = new BlockStmt();
        List<Statement> statementList = new ArrayList<Statement>();
        for (Java7Parser.BlockStatementContext blockStatementContext : context.blockStatement()) {
            Statement statement = Adapters.getBlockStatementAdapter().adapt(blockStatementContext);

            if (statement != null) {
                statementList.add(statement);
            }
        }

        if (statementList.size() >= 0) {
            blockStmt.setStmts(statementList);
        }

        return blockStmt;
    }
}
