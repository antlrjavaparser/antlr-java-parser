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
import com.github.antlrjavaparser.api.body.TypeDeclaration;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertNotNull;

/**
 * User: mdehaan
 * Date: 3/19/14
 */
public class Java8Test {
    @Test
    public void testLambda() throws Exception {


        InputStream in = getClass().getClassLoader().getResourceAsStream("testFiles/Java8.java.txt");

        if (in == null) {
            System.err.println("Unable to find test file.");
            return;
        }


        CompilationUnit compilationUnit = JavaParser.parse(in);
        assertNotNull(compilationUnit);

        //JavaParser.printLex(in);


        System.out.println("Something");
        //JavaParser.printLex(in);
    }

}
