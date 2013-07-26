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
import com.github.antlrjavaparser.api.body.EnumDeclaration;
import com.github.antlrjavaparser.api.type.Type;

import java.util.List;

public class EnumDeclarationContextAdapter implements Adapter<EnumDeclaration, Java7Parser.EnumDeclarationContext> {
    public EnumDeclaration adapt(Java7Parser.EnumDeclarationContext context, AdapterParameters adapterParameters) {

        /*
        enumDeclaration
            :   modifiers ENUM Identifier (IMPLEMENTS typeList)? enumBody
            ;
         */
        EnumDeclaration enumDeclaration = new EnumDeclaration();
        AdapterUtil.setModifiers(context.modifiers(), enumDeclaration, adapterParameters);
        AdapterUtil.setComments(enumDeclaration, context, adapterParameters);
        AdapterUtil.setPosition(enumDeclaration, context);

        enumDeclaration.setName(context.Identifier().getText());
        List<Type> typeList = Adapters.getTypeListContextAdapter().adapt(context.typeList(), adapterParameters);
        enumDeclaration.setImplements(AdapterUtil.convertTypeList(typeList));
        enumDeclaration.setMembers(Adapters.getEnumBodyContextAdapter().adapt(context.enumBody(), adapterParameters));

        // These come from enumBody

        if (context.enumBody().enumConstants() != null) {
            enumDeclaration.setEntries(Adapters.getEnumConstantsContextAdapter().adapt(context.enumBody().enumConstants(), adapterParameters));
        }

        return enumDeclaration;
    }
}
