/*
 * Copyright (C) 2015 Julio Vilmar Gesser and Mike DeHaan
 *
 * This file is part of antlr-java-parser.
 *
 * antlr-java-parser is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * antlr-java-parser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with antlr-java-parser.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.github.antlrjavaparser.adapter;

import com.github.antlrjavaparser.Java7Parser;
import com.github.antlrjavaparser.api.body.BodyDeclaration;

import java.util.LinkedList;
import java.util.List;

public class InterfaceBodyContextAdapter implements Adapter<List<BodyDeclaration>, Java7Parser.InterfaceBodyContext> {
    public List<BodyDeclaration> adapt(Java7Parser.InterfaceBodyContext context, AdapterParameters adapterParameters) {

        List<BodyDeclaration> bodyDeclarationList = new LinkedList<BodyDeclaration>();
        for (Java7Parser.InterfaceBodyDeclarationContext interfaceBodyDeclarationContext : context.interfaceBodyDeclaration()) {
            bodyDeclarationList.add(Adapters.getInterfaceBodyDeclarationContextAdapter().adapt(interfaceBodyDeclarationContext, adapterParameters));
        }

        return bodyDeclarationList;
    }
}
