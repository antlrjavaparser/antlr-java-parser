package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.stmt.ExpressionStmt;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/2/12
 * Time: 6:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class LocalVariableDeclarationStatementAdapter implements Adapter<ExpressionStmt, Java7Parser.LocalVariableDeclarationStatementContext> {
    @Override
    public ExpressionStmt adapt(Java7Parser.LocalVariableDeclarationStatementContext context) {

        //VariableDeclarationExpr

        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
