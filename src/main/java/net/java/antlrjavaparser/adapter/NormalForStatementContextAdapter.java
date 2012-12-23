package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;
import net.java.antlrjavaparser.api.stmt.ForStmt;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/20/12
 * Time: 1:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class NormalForStatementContextAdapter implements Adapter<ForStmt, Java7Parser.NormalForStatementContext> {
    @Override
    public ForStmt adapt(Java7Parser.NormalForStatementContext context) {

        /*
            normalForStatement
                :    FOR LPAREN (forInit)? SEMI (expression)? SEMI (expressionList)? RPAREN statement
                ;

            forInit
                :   localVariableDeclaration
                |   expressionList
                ;

         */

        ForStmt forStmt = new ForStmt();
        forStmt.setBody(Adapters.getStatementContextAdapter().adapt(context.statement()));

        if (context.forInit() != null) {
            if (context.forInit().localVariableDeclaration() != null) {
                List<Expression> expressionList = new LinkedList<Expression>();
                expressionList.add(Adapters.getLocalVariableDeclarationContextAdapter().adapt(context.forInit().localVariableDeclaration()));
                forStmt.setInit(expressionList);
            } else if (context.forInit().expressionList() != null) {
                forStmt.setInit(Adapters.getExpressionListContextAdapter().adapt(context.forInit().expressionList()));
            }
        }

        if (context.expression() != null) {
            forStmt.setCompare(Adapters.getExpressionContextAdapter().adapt(context.expression()));
        }

        if (context.expressionList() != null) {
            forStmt.setUpdate(Adapters.getExpressionListContextAdapter().adapt(context.expressionList()));
        }

        return forStmt;
    }
}
