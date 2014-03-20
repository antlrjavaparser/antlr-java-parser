package com.github.antlrjavaparser.test;

import com.github.antlrjavaparser.JavaParser;
import com.github.antlrjavaparser.api.CompilationUnit;
import com.github.antlrjavaparser.api.body.TypeDeclaration;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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

        System.out.println("Something");
        //JavaParser.printLex(in);
    }

}
