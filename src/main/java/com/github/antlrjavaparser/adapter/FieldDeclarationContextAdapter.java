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
import com.github.antlrjavaparser.api.body.FieldDeclaration;
import com.github.antlrjavaparser.api.body.VariableDeclarator;

import java.util.LinkedList;
import java.util.List;

public class FieldDeclarationContextAdapter implements Adapter<FieldDeclaration, Java7Parser.FieldDeclarationContext> {
    public FieldDeclaration adapt(Java7Parser.FieldDeclarationContext context, AdapterParameters adapterParameters) {

        /*
            fieldDeclaration
                :   modifiers
                    type
                    variableDeclarator
                    (COMMA variableDeclarator
                    )*
                    SEMI
                ;
         */

        FieldDeclaration fieldDeclaration = new FieldDeclaration();
        AdapterUtil.setModifiers(context.modifiers(), fieldDeclaration, adapterParameters);
        AdapterUtil.setComments(fieldDeclaration, context, adapterParameters);
        AdapterUtil.setPosition(fieldDeclaration, context);

        fieldDeclaration.setType(Adapters.getTypeContextAdapter().adapt(context.type(), adapterParameters));


        List<VariableDeclarator> variableDeclaratorList = new LinkedList<VariableDeclarator>();
        for (Java7Parser.VariableDeclaratorContext variableDeclaratorContext : context.variableDeclarator()) {
            variableDeclaratorList.add(Adapters.getVariableDeclaratorContextAdapter().adapt(variableDeclaratorContext, adapterParameters));
        }
        fieldDeclaration.setVariables(variableDeclaratorList);

        return fieldDeclaration;
    }
}
