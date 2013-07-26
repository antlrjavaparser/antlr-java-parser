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
import com.github.antlrjavaparser.api.expr.MethodCallExpr;
import com.github.antlrjavaparser.api.expr.SuperExpr;

public class SuperSuffixContextAdapter implements Adapter<MethodCallExpr, Java7Parser.SuperSuffixContext> {
    public MethodCallExpr adapt(Java7Parser.SuperSuffixContext context, AdapterParameters adapterParameters) {

        /*
        superSuffix
            :   DOT (typeArguments)? Identifier (arguments)?
            ;

         */

        MethodCallExpr methodCallExpr = new MethodCallExpr();
        AdapterUtil.setComments(methodCallExpr, context, adapterParameters);
        AdapterUtil.setPosition(methodCallExpr, context);

        methodCallExpr.setScope(new SuperExpr());

        if (context.typeArguments() != null) {
            methodCallExpr.setTypeArgs(Adapters.getTypeArgumentsContextAdapter().adapt(context.typeArguments(), adapterParameters));
        }

        methodCallExpr.setName(context.Identifier().getText());

        if (context.arguments() != null) {
            methodCallExpr.setArgs(Adapters.getArgumentsContextAdapter().adapt(context.arguments(), adapterParameters));
        }

        return methodCallExpr;
    }
}
