package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.*;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/5/12
 * Time: 10:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class LiteralAdapter implements Adapter<Expression, Java7Parser.LiteralContext> {

    /*
        literal
            :   integerLiteral
            |   FloatingPointLiteral
            |   CharacterLiteral
            |   StringLiteral
            |   booleanLiteral
            |   'null'
            ;
     */
    @Override
    public Expression adapt(Java7Parser.LiteralContext context) {
/*
        if (context.integerLiteral() != null) {
            return new IntegerLiteralExpr(context.integerLiteral().getText());
        } else if (context.FloatingPointLiteral() != null) {
            return new DoubleLiteralExpr(context.CharacterLiteral().getText());
        } else if (context.CharacterLiteral() != null) {
            return new StringLiteralExpr(context.CharacterLiteral().getText());
        } else if (context.StringLiteral() != null) {
            return new StringLiteralExpr(context.StringLiteral().getText());
        } else if (context.booleanLiteral() != null) {
            return new BooleanLiteralExpr(context.booleanLiteral().TRUE() != null);
        } else if (context.NullLiteral() != null) {
            return new NullLiteralExpr();
        }
*/

        double d = 123554e4;

        return null;
    }
}
