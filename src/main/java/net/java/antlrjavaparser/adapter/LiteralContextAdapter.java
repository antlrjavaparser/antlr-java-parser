package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.*;

public class LiteralContextAdapter implements Adapter<LiteralExpr, Java7Parser.LiteralContext> {
    public LiteralExpr adapt(Java7Parser.LiteralContext context) {

        if (context.IntegerLiteral() != null) {
            IntegerLiteralExpr literalExpr = new IntegerLiteralExpr();
            literalExpr.setValue(context.IntegerLiteral().getText());
            return literalExpr;
        } else if (context.FloatingPointLiteral() != null) {
            DoubleLiteralExpr literalExpr = new DoubleLiteralExpr();
            literalExpr.setValue(context.FloatingPointLiteral().getText());
            return literalExpr;
        } else if (context.CharacterLiteral() != null) {
            CharLiteralExpr literalExpr = new CharLiteralExpr();
            literalExpr.setValue(context.CharacterLiteral().getText());
            return literalExpr;
        } else if (context.StringLiteral() != null) {
            StringLiteralExpr literalExpr = new StringLiteralExpr();
            literalExpr.setValue(context.StringLiteral().toString());
            return literalExpr;
        } else if (context.TRUE() != null) {
            BooleanLiteralExpr literalExpr = new BooleanLiteralExpr();
            literalExpr.setValue(true);
            return literalExpr;
        } else if (context.FALSE() != null) {
            BooleanLiteralExpr literalExpr = new BooleanLiteralExpr();
            literalExpr.setValue(false);
            return literalExpr;
        } else if (context.NULL() != null) {
            NullLiteralExpr nullLiteralExpr = new NullLiteralExpr();
            return nullLiteralExpr;
        }

        throw new RuntimeException("Unknown Literal Context");
    }
}
