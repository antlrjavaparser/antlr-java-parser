package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.SuperExpr;
import net.java.antlrjavaparser.api.expr.ThisExpr;
import net.java.antlrjavaparser.api.stmt.ExplicitConstructorInvocationStmt;
import net.java.antlrjavaparser.api.stmt.Statement;

public class ExplicitConstructorInvocationContextAdapter implements Adapter<Statement, Java7Parser.ExplicitConstructorInvocationContext> {
    public Statement adapt(Java7Parser.ExplicitConstructorInvocationContext context) {
        /*
        explicitConstructorInvocation
            :               (nonWildcardTypeArguments)? (THIS|SUPER) arguments SEMI
            |   primary DOT (nonWildcardTypeArguments)? SUPER arguments SEMI
            ;

            nonWildcardTypeArguments
                :   LT typeList GT
                ;
         */

        ExplicitConstructorInvocationStmt explicitConstructorInvocationStmt = new ExplicitConstructorInvocationStmt();

        explicitConstructorInvocationStmt.setArgs(Adapters.getArgumentsContextAdapter().adapt(context.arguments()));
        explicitConstructorInvocationStmt.setThis(context.THIS() != null);

        if (context.nonWildcardTypeArguments() != null) {
            explicitConstructorInvocationStmt.setTypeArgs(Adapters.getTypeListContextAdapter().adapt(context.nonWildcardTypeArguments().typeList()));
        }

        /*
        if (context.SUPER() != null) {
            SuperExpr superExpr = new SuperExpr();
            explicitConstructorInvocationStmt.setExpr(superExpr);
        } else if (context.THIS() != null) {
            ThisExpr thisExpr = new ThisExpr();
            explicitConstructorInvocationStmt.setExpr(thisExpr);
        }
*/
        if (context.primary() != null) {
            explicitConstructorInvocationStmt.setExpr(Adapters.getPrimaryContextAdapter().adapt(context.primary()));
        }

        return explicitConstructorInvocationStmt;
    }
}
