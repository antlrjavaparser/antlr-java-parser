package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.stmt.Statement;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/1/12
 * Time: 10:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class StatementAdapter {

    private BlockAdapter blockAdapter = new BlockAdapter();

    public Statement adapt(Java7Parser.StatementContext context) {

        Statement returnStatement = null;
/*
        if (context.block() != null) {
            returnStatement = Adapters.getBlockAdapter().adapt(context.block());
        } else if (context.assertStatement() != null) {
        } else if (context.ifStatement() != null) {
        } else if (context.forStatement() != null) {
        } else if (context.whileStatement() != null) {
        } else if (context.doWhileStatement() != null) {
        } else if (context.tryStatement() != null) {
        } else if (context.switchStatement() != null) {
        } else if (context.synchronizedStatement() != null) {
        } else if (context.returnStatement() != null) {
        } else if (context.throwStatement() != null) {
        } else if (context.breakStatement() != null) {
        } else if (context.continueStatement() != null) {
        } else if (context.statementExpression() != null) {
        } else if (context.identifierStatement() != null) {
        } else if (context.SEMI() != null) {
        }

        return returnStatement;
*/

        return null;

                /*
    :   block
    |   assertStatement
    |   ifStatement
    |   forStatement
    |   whileStatement
    |   doWhileStatement
    |   tryStatement
    |   switchStatement
    |   synchronizedStatement
    |   returnStatement
    |   throwStatement
    |   breakStatement
    |   continueStatement
    |   SEMI
    |   statementExpression ';'
    |   identifierStatement
    ;
                 */
    }
}
