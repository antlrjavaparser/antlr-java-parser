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
import com.github.antlrjavaparser.api.body.EnumConstantDeclaration;

import java.util.LinkedList;
import java.util.List;

public class EnumConstantsContextAdapter implements Adapter<List<EnumConstantDeclaration>, Java7Parser.EnumConstantsContext> {
    public List<EnumConstantDeclaration> adapt(Java7Parser.EnumConstantsContext context) {

        if (context.enumConstant() == null || context.enumConstant().size() == 0) {
            return null;
        }

        List<EnumConstantDeclaration> enumConstantDeclarationList = new LinkedList<EnumConstantDeclaration>();
        for (Java7Parser.EnumConstantContext enumConstantContext : context.enumConstant()) {
            enumConstantDeclarationList.add(Adapters.getEnumConstantContextAdapter().adapt(enumConstantContext));
        }

        return enumConstantDeclarationList;
    }
}
