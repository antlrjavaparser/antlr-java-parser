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
import com.github.antlrjavaparser.api.body.TypeDeclaration;
import com.github.antlrjavaparser.api.type.ClassOrInterfaceType;
import com.github.antlrjavaparser.api.type.ReferenceType;
import com.github.antlrjavaparser.api.type.Type;

import java.util.LinkedList;
import java.util.List;

public class NormalClassDeclarationContextAdapter implements Adapter<TypeDeclaration, Java7Parser.NormalClassDeclarationContext> {
    public TypeDeclaration adapt(Java7Parser.NormalClassDeclarationContext context, AdapterParameters adapterParameters) {

        ClassOrInterfaceDeclaration classOrInterfaceDeclaration = new ClassOrInterfaceDeclaration();
        AdapterUtil.setModifiers(context.modifiers(), classOrInterfaceDeclaration, adapterParameters);
        AdapterUtil.setComments(classOrInterfaceDeclaration, context, adapterParameters);
        classOrInterfaceDeclaration.setInterface(false);
        classOrInterfaceDeclaration.setName(context.Identifier().getText());

        if (context.type() != null) {
            List<ClassOrInterfaceType> classOrInterfaceTypeList = new LinkedList<ClassOrInterfaceType>();

            // In this case, context.type() has to be a reference type since you cannot extend from a primitive
            // Though the declaration is expecting a ClassOrInterfaceType rather than a ReferenceType
            ReferenceType referenceType = (ReferenceType)Adapters.getTypeContextAdapter().adapt(context.type(), adapterParameters);

            ClassOrInterfaceType extendsClassOrInterfaceType = (ClassOrInterfaceType)referenceType.getType();
            classOrInterfaceTypeList.add(extendsClassOrInterfaceType);
            classOrInterfaceDeclaration.setExtends(classOrInterfaceTypeList);
        }

        List<Type> typeList = Adapters.getTypeListContextAdapter().adapt(context.typeList(), adapterParameters);
        classOrInterfaceDeclaration.setImplements(AdapterUtil.convertTypeList(typeList));
        classOrInterfaceDeclaration.setTypeParameters(Adapters.getTypeParametersContextAdapter().adapt(context.typeParameters(), adapterParameters));

        classOrInterfaceDeclaration.setMembers(Adapters.getClassBodyContextAdapter().adapt(context.classBody(), adapterParameters));

        return classOrInterfaceDeclaration;
    }
}
