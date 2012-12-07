package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/5/12
 * Time: 10:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class PrimaryAdapter implements Adapter<Expression, Java7Parser.PrimaryContext> {

    /*
        primary
            :   LPAREN expression RPAREN
            |   THIS
            |   SUPER
            |   literal
            |   Identifier
            |   type DOT CLASS
            |   VOID DOT CLASS
            ;
     */
    @Override
    public Expression adapt(Java7Parser.PrimaryContext context) {
/*
        if (context.expression() != null) {
            EnclosedExpr enclosedExpr = new EnclosedExpr();
            enclosedExpr.setInner(Adapters.getExpressionAdapter().adapt(context.expression()));
            return enclosedExpr;
        } else if (context.THIS() != null) {
            ThisExpr thisExpr = new ThisExpr();
            return thisExpr;
        } else if (context.SUPER() != null) {
                // ?
        } else if (context.literal() != null) {

        } else if (context.Identifier() != null) {
        } else if (context.type() != null) {
        } else if (context.VOID() != null) {

        }
*/
        return null;
    }
}
