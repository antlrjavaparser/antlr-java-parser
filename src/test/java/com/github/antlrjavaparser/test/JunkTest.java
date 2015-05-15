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
package com.github.antlrjavaparser.test;

import com.github.antlrjavaparser.JavaParser;
import com.github.antlrjavaparser.api.CompilationUnit;
import com.github.antlrjavaparser.api.body.BodyDeclaration;
import com.github.antlrjavaparser.api.body.ClassOrInterfaceDeclaration;
import com.github.antlrjavaparser.api.body.TypeDeclaration;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * User: mdehaan
 * Date: 9/9/13
 */
public class JunkTest {

    @Test
    public void testSomething() throws Exception {

        InputStream in = getClass().getClassLoader().getResourceAsStream("testFiles/Junk.java.txt");

        if (in == null) {
            System.err.println("Unable to find test file.");
            return;
        }

        CompilationUnit compilationUnit = JavaParser.parse(in);

        List<TypeDeclaration> types = compilationUnit.getTypes();

        Map<String, String> innerTypes = new TreeMap<String, String>();

        for (TypeDeclaration typeDeclaration : types) {
            getListOfInnerTypes(typeDeclaration, typeDeclaration.getName() + ".", innerTypes);
        }

        for (Map.Entry<String, String> entry : innerTypes.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }


    }

    private void getListOfInnerTypes(BodyDeclaration bodyDeclaration, String parentPrefix, Map<String, String> innerTypes) {
        if (!(bodyDeclaration instanceof TypeDeclaration)) {
            return;
        }

        TypeDeclaration typeDeclaration = (TypeDeclaration)bodyDeclaration;

        for (BodyDeclaration innerBodyDeclaration : typeDeclaration.getMembers()) {
            if (bodyDeclaration instanceof ClassOrInterfaceDeclaration) {
                ClassOrInterfaceDeclaration classOrInterfaceDeclaration = (ClassOrInterfaceDeclaration)innerBodyDeclaration;

                innerTypes.put(classOrInterfaceDeclaration.getName(), parentPrefix + classOrInterfaceDeclaration.getName());

                String newParentPrefix = parentPrefix +
                        classOrInterfaceDeclaration.getName() + ".";

                getListOfInnerTypes(classOrInterfaceDeclaration, newParentPrefix, innerTypes);
            }
        }
    }
}
