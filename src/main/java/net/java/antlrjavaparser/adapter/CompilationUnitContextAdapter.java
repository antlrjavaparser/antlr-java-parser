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
import net.java.antlrjavaparser.api.CompilationUnit;
import net.java.antlrjavaparser.api.ImportDeclaration;
import net.java.antlrjavaparser.api.body.TypeDeclaration;

import java.util.LinkedList;
import java.util.List;

public class CompilationUnitContextAdapter implements Adapter<CompilationUnit, Java7Parser.CompilationUnitContext> {
    public CompilationUnit adapt(Java7Parser.CompilationUnitContext context) {
        CompilationUnit compilationUnit = new CompilationUnit();

        compilationUnit.setPackage(Adapters.getPackageDeclarationContextAdapter().adapt(context.packageDeclaration()));

        List<ImportDeclaration> importDeclarationList = new LinkedList<ImportDeclaration>();

        for (Java7Parser.ImportDeclarationContext importDeclarationContext : context.importDeclaration()) {
            importDeclarationList.add(Adapters.getImportDeclarationContextAdapter().adapt(importDeclarationContext));
        }

        compilationUnit.setImports(importDeclarationList);


        List<TypeDeclaration> typeDeclarationList = new LinkedList<TypeDeclaration>();
        for (Java7Parser.TypeDeclarationContext typeDeclarationContext : context.typeDeclaration()) {
            typeDeclarationList.add(Adapters.getTypeDeclarationContextAdapter().adapt(typeDeclarationContext));
        }

        compilationUnit.setTypes(typeDeclarationList);

        return compilationUnit;
    }
}
