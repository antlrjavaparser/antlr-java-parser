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
import net.java.antlrjavaparser.api.type.ClassOrInterfaceType;
import net.java.antlrjavaparser.api.type.Type;

import java.util.LinkedList;
import java.util.List;

public class TypeBoundContextAdapter implements Adapter<List<ClassOrInterfaceType>, Java7Parser.TypeBoundContext> {
    public List<ClassOrInterfaceType> adapt(Java7Parser.TypeBoundContext context) {

        if (context == null) {
            return null;
        }

        List<Type> typeList = new LinkedList<Type>();
        List<ClassOrInterfaceType> classOrInterfaceTypeList = new LinkedList<ClassOrInterfaceType>();

        for (Java7Parser.TypeContext typeContext : context.type()) {
            typeList.add(Adapters.getTypeContextAdapter().adapt(typeContext));
        }

        // All instances should be classOrInterfaceType
        return AdapterUtil.convertTypeList(typeList);
    }
}
