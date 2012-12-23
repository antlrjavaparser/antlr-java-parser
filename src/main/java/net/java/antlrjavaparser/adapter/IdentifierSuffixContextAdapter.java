package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.ArrayAccessExpr;
import net.java.antlrjavaparser.api.expr.ClassExpr;
import net.java.antlrjavaparser.api.expr.Expression;
import net.java.antlrjavaparser.api.expr.SuperExpr;
import net.java.antlrjavaparser.api.expr.ThisExpr;

public class IdentifierSuffixContextAdapter {
    public Expression adapt(Java7Parser.IdentifierSuffixContext context, Expression parentExpression) {

        /*
            identifierSuffix
                :   (LBRACKET RBRACKET)+ DOT CLASS                      // ClassExpr
                |   (LBRACKET expression RBRACKET)+                     // Array Access
                |   arguments                                           // Method Call
                |   DOT CLASS                                           // ClassExpr
                |   DOT nonWildcardTypeArguments Identifier arguments   // Method Call (with Type Arguments)
                |   DOT THIS                                            // This Expr
                |   DOT SUPER arguments                                 // Unsupported (handled already by ExplicitConstructorInvocation)
                |   innerCreator
                ;

         */

        if (context.innerCreator() != null) {
            return Adapters.getInnerCreatorContextAdapter().adapt(context.innerCreator());

        // This covers 2 cases from above.  The caller is responsible for setting the arrayCount
        } else if (context.CLASS() != null) {
            ClassExpr classExpr = new ClassExpr();
            //classExpr.se
            return classExpr;

        // Array Access
        } else if (context.expression() != null) {

            //Expression leftExpression = arrayAccessExpr

            ArrayAccessExpr arrayAccessExpr = new ArrayAccessExpr();
            //arrayAccessExpr.
        } else if (context.THIS() != null) {
        } else if (context.THIS() != null) {
        } else if (context.THIS() != null) {
        } else if (context.THIS() != null) {
        } else if (context.THIS() != null) {
        } else if (context.THIS() != null) {
            ThisExpr thisExpr = new ThisExpr();
            return thisExpr;
        //} else if (context.SUPER() != null) {
            // TODO: This scenario might already be handled as an ExplicitConstructorInvocation
            //SuperExpr superExpr = new SuperExpr();
            //superExpr.
            //throw new UnsupportedOperationException("This was expected to be handled by ExplicitConstructorInvocation.  Verify Source file syntax and submit a bug if source file is valid.");
        }

        return null;
    }
}
