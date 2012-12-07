package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.stmt.Statement;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/5/12
 * Time: 11:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class BlockStatementAdapter implements Adapter<Statement, Java7Parser.BlockStatementContext> {

    /*
        blockStatement
            :   localVariableDeclarationStatement
            |   classDeclaration
            |   interfaceDeclaration
            |   statement
            ;
     */
    @Override
    public Statement adapt(Java7Parser.BlockStatementContext context) {
/*
        if (context.statement() != null) {
            return Adapters.getStatementAdapter().adapt(context.statement());
        } else if (context.localVariableDeclarationStatement() != null) {
            return Adapters.getLocalVariableDeclarationStatementAdapter().adapt(context.localVariableDeclarationStatement());
        } else if (context.classDeclaration() != null) {
            ClassOrInterfaceDeclaration classOrInterfaceDeclaration = Adapters.getClassDeclarationAdapter().adapt(context.classDeclaration());
            TypeDeclarationStmt typeDeclarationStmt = new TypeDeclarationStmt();
            typeDeclarationStmt.setTypeDeclaration(classOrInterfaceDeclaration);
            return typeDeclarationStmt;
        } else if (context.interfaceDeclaration() != null) {
            ClassOrInterfaceDeclaration classOrInterfaceDeclaration = Adapters.getInterfaceDeclarationAdapter().adapt(context.interfaceDeclaration());
            TypeDeclarationStmt typeDeclarationStmt = new TypeDeclarationStmt();
            typeDeclarationStmt.setTypeDeclaration(classOrInterfaceDeclaration);
            return typeDeclarationStmt;
        }
*/
        return null;
    }
}
