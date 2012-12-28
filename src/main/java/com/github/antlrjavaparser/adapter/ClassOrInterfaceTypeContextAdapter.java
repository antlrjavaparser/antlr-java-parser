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
import com.github.antlrjavaparser.api.type.ClassOrInterfaceType;

import java.util.LinkedList;
import java.util.List;

public class ClassOrInterfaceTypeContextAdapter implements Adapter<ClassOrInterfaceType, Java7Parser.ClassOrInterfaceTypeContext> {
    public ClassOrInterfaceType adapt(Java7Parser.ClassOrInterfaceTypeContext context) {

        ClassOrInterfaceType classOrInterfaceType = new ClassOrInterfaceType();

        List<ClassOrInterfaceType> scopes = new LinkedList<ClassOrInterfaceType>();

        for (Java7Parser.IdentifierTypeArgumentContext identifierTypeArgumentContext : context.identifierTypeArgument())  {

            ClassOrInterfaceType scope = new ClassOrInterfaceType();
            scope.setTypeArgs(Adapters.getTypeArgumentsContextAdapter().adapt(identifierTypeArgumentContext.typeArguments()));
            scope.setName(identifierTypeArgumentContext.Identifier().getText());

            scopes.add(scope);
        }

        // This is a weird way of handling this, but should take care of the scope hierarchy
        classOrInterfaceType = scopes.get(scopes.size() - 1);
        ClassOrInterfaceType currentScope = classOrInterfaceType;
        for (int i = (scopes.size() - 2); i >= 0; i--) {
            ClassOrInterfaceType scope = scopes.get(i);
            currentScope.setScope(scope);
            currentScope = scope;
        }

        return classOrInterfaceType;
    }
}
