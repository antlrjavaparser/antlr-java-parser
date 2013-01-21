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
import com.github.antlrjavaparser.api.expr.Expression;

import java.util.List;

public class ArgumentsContextAdapter implements Adapter<List<Expression>, Java7Parser.ArgumentsContext> {
    public List<Expression> adapt(Java7Parser.ArgumentsContext context, AdapterParameters adapterParameters) {
        /*
            arguments
                :   LPAREN (expressionList
                    )? RPAREN
                ;
         */

        if (context.expressionList() != null) {
            return Adapters.getExpressionListContextAdapter().adapt(context.expressionList(), adapterParameters);
        } else {
            // This is allowed to be empty/null
            return null;
        }

        //throw new UnsupportedOperationException();
    }
}
