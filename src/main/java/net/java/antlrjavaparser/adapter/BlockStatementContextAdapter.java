package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.stmt.Statement;
import net.java.antlrjavaparser.api.stmt.TypeDeclarationStmt;

public class BlockStatementContextAdapter implements Adapter<Statement, Java7Parser.BlockStatementContext> {
    public Statement adapt(Java7Parser.BlockStatementContext context) {

        if (context.classOrInterfaceDeclaration() != null) {
            TypeDeclarationStmt typeDeclarationStmt = new TypeDeclarationStmt();
            typeDeclarationStmt.setTypeDeclaration(Adapters.getClassOrInterfaceDeclarationContextAdapter().adapt(context.classOrInterfaceDeclaration()));
            return typeDeclarationStmt;
        } else if (context.localVariableDeclarationStatement() != null) {
            return Adapters.getLocalVariableDeclarationStatementContextAdapter().adapt(context.localVariableDeclarationStatement());
        } else if (context.statement() != null) {
            return Adapters.getStatementContextAdapter().adapt(context.statement());
        }

        throw new RuntimeException("Unknown statement type");
    }
}
