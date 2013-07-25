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
import com.github.antlrjavaparser.api.body.ClassOrInterfaceDeclaration;
import com.github.antlrjavaparser.api.type.Type;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class NormalInterfaceDeclarationContextAdapter implements Adapter<ClassOrInterfaceDeclaration, Java7Parser.NormalInterfaceDeclarationContext> {
    public ClassOrInterfaceDeclaration adapt(Java7Parser.NormalInterfaceDeclarationContext context, AdapterParameters adapterParameters) {

        /*
            normalInterfaceDeclaration
                :   modifiers INTERFACE Identifier (typeParameters)? (EXTENDS typeList)? interfaceBody
                ;
         */

        ClassOrInterfaceDeclaration classOrInterfaceDeclaration = new ClassOrInterfaceDeclaration();
        AdapterUtil.setModifiers(context.modifiers(), classOrInterfaceDeclaration, adapterParameters);
        AdapterUtil.setComments(classOrInterfaceDeclaration, context, adapterParameters);
        AdapterUtil.setPosition(classOrInterfaceDeclaration, context);

        classOrInterfaceDeclaration.setInterface(true);

        // All instances should be classOrInterfaceType
        if (context.typeList() != null) {
            List<Type> typeList = Adapters.getTypeListContextAdapter().adapt(context.typeList(), adapterParameters);
            classOrInterfaceDeclaration.setExtends(AdapterUtil.convertTypeList(typeList));
        }


        if (context.typeParameters() != null) {
            classOrInterfaceDeclaration.setTypeParameters(Adapters.getTypeParametersContextAdapter().adapt(context.typeParameters(), adapterParameters));
        }

        classOrInterfaceDeclaration.setName(context.Identifier().getText());

        classOrInterfaceDeclaration.setMembers(Adapters.getInterfaceBodyContextAdapter().adapt(context.interfaceBody(), adapterParameters));

        return classOrInterfaceDeclaration;
    }

    private boolean hasModifier(TerminalNode modifier) {
        return modifier != null;
    }
}
