/*
 * This file is part of antlr-java-parser.
 *
 *     antlr-java-parser is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     antlr-java-parser is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with antlr-java-parser.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.antlrjavaparser.adapter;

import com.github.antlrjavaparser.Java7Parser;
import com.github.antlrjavaparser.api.stmt.ExplicitConstructorInvocationStmt;
import com.github.antlrjavaparser.api.stmt.Statement;

public class ExplicitConstructorInvocationContextAdapter implements Adapter<Statement, Java7Parser.ExplicitConstructorInvocationContext> {
    public Statement adapt(Java7Parser.ExplicitConstructorInvocationContext context, AdapterParameters adapterParameters) {
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
        AdapterUtil.setComments(explicitConstructorInvocationStmt, context, adapterParameters);

        explicitConstructorInvocationStmt.setArgs(Adapters.getArgumentsContextAdapter().adapt(context.arguments(), adapterParameters));
        explicitConstructorInvocationStmt.setThis(context.THIS() != null);

        if (context.nonWildcardTypeArguments() != null) {
            explicitConstructorInvocationStmt.setTypeArgs(Adapters.getTypeListContextAdapter().adapt(context.nonWildcardTypeArguments().typeList(), adapterParameters));
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
            explicitConstructorInvocationStmt.setExpr(Adapters.getPrimaryContextAdapter().adapt(context.primary(), adapterParameters));
        }

        return explicitConstructorInvocationStmt;
    }
}
