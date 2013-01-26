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
import com.github.antlrjavaparser.api.body.MethodDeclaration;
import com.github.antlrjavaparser.api.type.ReferenceType;
import com.github.antlrjavaparser.api.type.Type;
import com.github.antlrjavaparser.api.type.VoidType;

public class MethodDeclarationContextAdapter implements Adapter<MethodDeclaration, Java7Parser.MethodDeclarationContext> {
    public MethodDeclaration adapt(Java7Parser.MethodDeclarationContext context, AdapterParameters adapterParameters) {
        /*
            methodDeclaration
                :    modifiers typeParameters? (type | VOID) Identifier formalParameters (LBRACKET RBRACKET)* (THROWS qualifiedNameList)? (block | SEMI)
                ;
         */

        MethodDeclaration methodDeclaration = new MethodDeclaration();
        AdapterUtil.setModifiers(context.modifiers(), methodDeclaration, adapterParameters);
        AdapterUtil.setComments(methodDeclaration, context, adapterParameters);

        if (context.typeParameters() != null) {
            methodDeclaration.setTypeParameters(Adapters.getTypeParametersContextAdapter().adapt(context.typeParameters(), adapterParameters));
        }

        if (context.VOID() != null) {
            Type type = new VoidType();
            methodDeclaration.setType(type);
        } else {
            Type type = Adapters.getTypeContextAdapter().adapt(context.type(), adapterParameters);

            if (context.LBRACKET() != null && context.LBRACKET().size() > 0) {
                ReferenceType referenceType = new ReferenceType();
                if (type instanceof ReferenceType) {
                    referenceType = (ReferenceType)type;
                } else {
                    referenceType = new ReferenceType();
                    referenceType.setType(type);
                }

                int arraySize = referenceType.getArrayCount();
                arraySize += context.LBRACKET().size();
                referenceType.setArrayCount(arraySize);

                methodDeclaration.setType(referenceType);
            } else {
                methodDeclaration.setType(type);
            }
        }

        methodDeclaration.setName(context.Identifier().getText());

        methodDeclaration.setParameters(Adapters.getFormalParametersContextAdapter().adapt(context.formalParameters(), adapterParameters));

        if (context.THROWS() != null) {
            methodDeclaration.setThrows(Adapters.getQualifiedNameListContextAdapter().adapt(context.qualifiedNameList(), adapterParameters));
        }

        if (context.block() != null) {
            methodDeclaration.setBody(Adapters.getBlockContextAdapter().adapt(context.block(), adapterParameters));
        }

        return methodDeclaration;
    }
}
