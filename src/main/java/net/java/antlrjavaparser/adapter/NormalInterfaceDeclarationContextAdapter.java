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

package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.ClassOrInterfaceDeclaration;
import net.java.antlrjavaparser.api.type.ClassOrInterfaceType;
import net.java.antlrjavaparser.api.type.ReferenceType;
import net.java.antlrjavaparser.api.type.Type;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;

public class NormalInterfaceDeclarationContextAdapter implements Adapter<ClassOrInterfaceDeclaration, Java7Parser.NormalInterfaceDeclarationContext> {
    public ClassOrInterfaceDeclaration adapt(Java7Parser.NormalInterfaceDeclarationContext context) {

        /*
            normalInterfaceDeclaration
                :   modifiers INTERFACE Identifier (typeParameters)? (EXTENDS typeList)? interfaceBody
                ;
         */

        ClassOrInterfaceDeclaration classOrInterfaceDeclaration = new ClassOrInterfaceDeclaration();
        classOrInterfaceDeclaration.setInterface(true);

        // All instances should be classOrInterfaceType
        if (context.typeList() != null) {
            List<Type> typeList = Adapters.getTypeListContextAdapter().adapt(context.typeList());
            classOrInterfaceDeclaration.setExtends(AdapterUtil.convertTypeList(typeList));
        }

        // Set modifiers and annotations
        AdapterUtil.setModifiers(context.modifiers(), classOrInterfaceDeclaration);

        if (context.typeParameters() != null) {
            classOrInterfaceDeclaration.setTypeParameters(Adapters.getTypeParametersContextAdapter().adapt(context.typeParameters()));
        }

        classOrInterfaceDeclaration.setName(context.Identifier().getText());

        classOrInterfaceDeclaration.setMembers(Adapters.getInterfaceBodyContextAdapter().adapt(context.interfaceBody()));

        return classOrInterfaceDeclaration;
    }

    private boolean hasModifier(TerminalNode modifier) {
        return modifier != null;
    }
}
