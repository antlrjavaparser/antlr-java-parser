package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.expr.Expression;

import java.util.List;

public class ArgumentsContextAdapter implements Adapter<List<Expression>, Java7Parser.ArgumentsContext> {
    public List<Expression> adapt(Java7Parser.ArgumentsContext context) {
        /*
            arguments
                :   LPAREN (expressionList
                    )? RPAREN
                ;
         */

        if (context.expressionList() != null) {
            return Adapters.getExpressionListContextAdapter().adapt(context.expressionList());
        } else {
            // This is allowed to be empty/null
            return null;
        }

        //throw new UnsupportedOperationException();
    }
}
