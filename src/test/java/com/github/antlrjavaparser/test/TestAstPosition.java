package com.github.antlrjavaparser.test;

import com.github.antlrjavaparser.JavaParser;
import com.github.antlrjavaparser.api.CompilationUnit;
import com.github.antlrjavaparser.api.body.BodyDeclaration;
import com.github.antlrjavaparser.api.body.TypeDeclaration;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;

/**
 * User: mdehaan
 * Date: 7/26/13
 */
public class TestAstPosition {
    @Test
    public void ifStatementTest() throws Exception {


        InputStream in = getClass().getClassLoader().getResourceAsStream("testFiles/TestAstPosition.java.txt");

        if (in == null) {
            System.err.println("Unable to find test file.");
            return;
        }

        CompilationUnit compilationUnit = JavaParser.parse(in);

        TypeDeclaration mainType = compilationUnit.getTypes().get(0);
        BodyDeclaration bodyDeclaration = mainType.getMembers().get(0);

        Assert.assertEquals("Method body line start is incorrect.", 6, bodyDeclaration.getBeginLine());
        Assert.assertEquals("Method body line end is incorrect.", 15, bodyDeclaration.getEndLine());

        Assert.assertEquals("Method body column start is incorrect.", 4, bodyDeclaration.getBeginColumn());
        Assert.assertEquals("Method body column end is incorrect.", 4, bodyDeclaration.getEndColumn());

        Assert.assertEquals("Method body index start is incorrect.", 80, bodyDeclaration.getBeginIndex());
        Assert.assertEquals("Method body index end is incorrect.", 302, bodyDeclaration.getEndIndex());
    }
}
