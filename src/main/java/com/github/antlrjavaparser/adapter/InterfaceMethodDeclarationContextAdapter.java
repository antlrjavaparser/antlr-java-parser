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
import com.github.antlrjavaparser.api.body.BodyDeclaration;
import com.github.antlrjavaparser.api.body.MethodDeclaration;
import com.github.antlrjavaparser.api.type.Type;
import com.github.antlrjavaparser.api.type.VoidType;

public class InterfaceMethodDeclarationContextAdapter implements Adapter<BodyDeclaration, Java7Parser.InterfaceMethodDeclarationContext> {
    public BodyDeclaration adapt(Java7Parser.InterfaceMethodDeclarationContext context, AdapterParameters adapterParameters) {

        /*
        interfaceMethodDeclaration
            :    modifiers (typeParameters)? (type|VOID) Identifier formalParameters (LBRACKET RBRACKET)* (THROWS qualifiedNameList)? SEMI
            ;
         */

        MethodDeclaration methodDeclaration = new MethodDeclaration();
        AdapterUtil.setModifiers(context.modifiers(), methodDeclaration, adapterParameters);
        methodDeclaration.setName(context.Identifier().getText());

        if (context.typeParameters() != null) {
            methodDeclaration.setTypeParameters(Adapters.getTypeParametersContextAdapter().adapt(context.typeParameters(), adapterParameters));
        }

        if (context.LBRACKET() != null && context.LBRACKET().size() > 0) {
            methodDeclaration.setArrayCount(context.LBRACKET().size());
        }

        Type returnType = null;
        if (context.VOID() != null) {
            returnType = new VoidType();
        } else if (context.type() != null) {
            returnType = Adapters.getTypeContextAdapter().adapt(context.type(), adapterParameters);
        }
        methodDeclaration.setType(returnType);

        methodDeclaration.setParameters(Adapters.getFormalParametersContextAdapter().adapt(context.formalParameters(), adapterParameters));

        if (context.qualifiedNameList() != null) {
            methodDeclaration.setThrows(Adapters.getQualifiedNameListContextAdapter().adapt(context.qualifiedNameList(), adapterParameters));
        }

        return methodDeclaration;
    }
}
