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
import com.github.antlrjavaparser.api.CompilationUnit;
import com.github.antlrjavaparser.api.ImportDeclaration;
import com.github.antlrjavaparser.api.body.TypeDeclaration;

import java.util.LinkedList;
import java.util.List;

public class CompilationUnitContextAdapter implements Adapter<CompilationUnit, Java7Parser.CompilationUnitContext> {
    public CompilationUnit adapt(Java7Parser.CompilationUnitContext context, AdapterParameters adapterParameters) {
        CompilationUnit compilationUnit = new CompilationUnit();

        compilationUnit.setPackage(Adapters.getPackageDeclarationContextAdapter().adapt(context.packageDeclaration(), adapterParameters));

        List<ImportDeclaration> importDeclarationList = new LinkedList<ImportDeclaration>();

        for (Java7Parser.ImportDeclarationContext importDeclarationContext : context.importDeclaration()) {
            importDeclarationList.add(Adapters.getImportDeclarationContextAdapter().adapt(importDeclarationContext, adapterParameters));
        }

        compilationUnit.setImports(importDeclarationList);


        List<TypeDeclaration> typeDeclarationList = new LinkedList<TypeDeclaration>();
        for (Java7Parser.TypeDeclarationContext typeDeclarationContext : context.typeDeclaration()) {
            typeDeclarationList.add(Adapters.getTypeDeclarationContextAdapter().adapt(typeDeclarationContext, adapterParameters));
        }

        compilationUnit.setTypes(typeDeclarationList);

        return compilationUnit;
    }
}
