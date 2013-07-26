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
import com.github.antlrjavaparser.api.expr.ArrayCreationExpr;
import com.github.antlrjavaparser.api.expr.Expression;

import java.util.LinkedList;
import java.util.List;

public class ArrayCreatorContextAdapter implements Adapter<Expression, Java7Parser.ArrayCreatorContext> {
    public Expression adapt(Java7Parser.ArrayCreatorContext context, AdapterParameters adapterParameters) {

        /*
        arrayCreator
            :   NEW createdName LBRACKET RBRACKET (LBRACKET RBRACKET)* arrayInitializer
            |   NEW createdName LBRACKET expression RBRACKET (LBRACKET expression RBRACKET)* (LBRACKET RBRACKET)*
            ;

        new MyClass[] {};

         */

        ArrayCreationExpr arrayCreationExpr = new ArrayCreationExpr();
        AdapterUtil.setComments(arrayCreationExpr, context, adapterParameters);
        AdapterUtil.setPosition(arrayCreationExpr, context);
        arrayCreationExpr.setType(Adapters.getCreatedNameContextAdapter().adapt(context.createdName(), adapterParameters));

        if (context.arrayInitializer() != null) {
            arrayCreationExpr.setInitializer(Adapters.getArrayInitializerContextAdapter().adapt(context.arrayInitializer(), adapterParameters));
        } else if (context.expression() != null) {
            List<Expression> expressionList = new LinkedList<Expression>();
            for (Java7Parser.ExpressionContext expressionContext : context.expression()) {
                expressionList.add(Adapters.getExpressionContextAdapter().adapt(expressionContext, adapterParameters));
            }
            arrayCreationExpr.setDimensions(expressionList);
        }

        // Subtract the brackets used as dimensions
        if (arrayCreationExpr.getDimensions() != null && arrayCreationExpr.getDimensions().size() > 0) {
            arrayCreationExpr.setArrayCount(context.LBRACKET().size() - arrayCreationExpr.getDimensions().size());
        } else {
            arrayCreationExpr.setArrayCount(context.LBRACKET().size());
        }

        return arrayCreationExpr;
    }
}
