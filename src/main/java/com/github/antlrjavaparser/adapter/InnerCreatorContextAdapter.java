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
import com.github.antlrjavaparser.api.expr.ObjectCreationExpr;
import com.github.antlrjavaparser.api.type.ClassOrInterfaceType;

public class InnerCreatorContextAdapter implements Adapter<ObjectCreationExpr, Java7Parser.InnerCreatorContext> {
    public ObjectCreationExpr adapt(Java7Parser.InnerCreatorContext context, AdapterParameters adapterParameters) {

        /*
            innerCreator
                :   DOT NEW (nonWildcardTypeArguments)? identifierTypeArgument classCreatorRest
                ;
         */

        ObjectCreationExpr objectCreationExpr = new ObjectCreationExpr();
        AdapterUtil.setComments(objectCreationExpr, context, adapterParameters);
        AdapterUtil.setPosition(objectCreationExpr, context);

        if (context.nonWildcardTypeArguments() != null) {
            objectCreationExpr.setTypeArgs(Adapters.getTypeListContextAdapter().adapt(context.nonWildcardTypeArguments().typeList(), adapterParameters));
        }

        ClassOrInterfaceType classOrInterfaceType = new ClassOrInterfaceType();
        classOrInterfaceType.setName(context.identifierTypeArgument().Identifier().getText());

        if (context.identifierTypeArgument().typeArguments() != null) {
            classOrInterfaceType.setTypeArgs(Adapters.getTypeArgumentsContextAdapter().adapt(context.identifierTypeArgument().typeArguments(), adapterParameters));
        }

        objectCreationExpr.setType(classOrInterfaceType);

        // arguments classBody?
        objectCreationExpr.setArgs(Adapters.getArgumentsContextAdapter().adapt(context.classCreatorRest().arguments(), adapterParameters));

        if (context.classCreatorRest().classBody() != null) {
            objectCreationExpr.setAnonymousClassBody(Adapters.getClassBodyContextAdapter().adapt(context.classCreatorRest().classBody(), adapterParameters));
        }

        return objectCreationExpr;
    }
}
