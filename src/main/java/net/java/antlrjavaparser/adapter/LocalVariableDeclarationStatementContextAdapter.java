package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.stmt.ExpressionStmt;
import net.java.antlrjavaparser.api.stmt.Statement;

public class LocalVariableDeclarationStatementContextAdapter implements Adapter<Statement, Java7Parser.LocalVariableDeclarationStatementContext> {
    public Statement adapt(Java7Parser.LocalVariableDeclarationStatementContext context) {

        ExpressionStmt expressionStmt = new ExpressionStmt();
        expressionStmt.setExpression(Adapters.getLocalVariableDeclarationContextAdapter().adapt(context.localVariableDeclaration()));

        return expressionStmt;
    }
}
