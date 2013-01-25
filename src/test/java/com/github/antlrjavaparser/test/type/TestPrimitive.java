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
package com.github.antlrjavaparser.test.type;

import com.github.antlrjavaparser.JavaParser;
import com.github.antlrjavaparser.api.CompilationUnit;
import com.github.antlrjavaparser.api.body.FieldDeclaration;
import com.github.antlrjavaparser.api.body.MethodDeclaration;
import com.github.antlrjavaparser.api.body.Parameter;
import com.github.antlrjavaparser.api.expr.IntegerLiteralExpr;
import com.github.antlrjavaparser.api.expr.LongLiteralExpr;
import com.github.antlrjavaparser.api.type.PrimitiveType;
import com.github.antlrjavaparser.api.type.ReferenceType;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/3/13
 * Time: 12:30 PM
 */
public class TestPrimitive {

    @Test
    public void testPrimitive() throws Exception {
        CompilationUnit cu = JavaParser.parse("public class Test { private long l = 0; }");
        assertTrue(cu.getTypes().size() == 1);

        assertTrue(cu.getTypes().get(0).getMembers().size() == 1);
        assertTrue(cu.getTypes().get(0).getMembers().get(0) instanceof FieldDeclaration);

        FieldDeclaration fieldDeclaration = (FieldDeclaration)cu.getTypes().get(0).getMembers().get(0);
        assertTrue(fieldDeclaration.getType() instanceof PrimitiveType);
    }

    @Test
    public void testPrimitiveArray() throws Exception {
        CompilationUnit cu = JavaParser.parse("public class Test { private long a[]; }");
        assertTrue(cu.getTypes().size() == 1);

        assertTrue(cu.getTypes().get(0).getMembers().size() == 1);
        assertTrue(cu.getTypes().get(0).getMembers().get(0) instanceof FieldDeclaration);

        FieldDeclaration fieldDeclaration = (FieldDeclaration)cu.getTypes().get(0).getMembers().get(0);
        assertTrue(fieldDeclaration.getType() instanceof PrimitiveType);
        assertTrue(fieldDeclaration.getVariables().size() == 1);
        assertTrue(fieldDeclaration.getVariables().get(0).getId().getName().equals("a"));
        assertTrue(fieldDeclaration.getVariables().get(0).getId().getArrayCount() == 1);
    }

    @Test
    public void testPrimitiveAftArray() throws Exception {
        CompilationUnit cu = JavaParser.parse("public class Test { private long [] a[]; }");
        assertTrue(cu.getTypes().size() == 1);

        assertTrue(cu.getTypes().get(0).getMembers().size() == 1);
        assertTrue(cu.getTypes().get(0).getMembers().get(0) instanceof FieldDeclaration);

        FieldDeclaration fieldDeclaration = (FieldDeclaration)cu.getTypes().get(0).getMembers().get(0);
        assertTrue(fieldDeclaration.getType() instanceof ReferenceType);

        ReferenceType referenceType = (ReferenceType)fieldDeclaration.getType();
        assertTrue(referenceType.getArrayCount() == 1);

        assertTrue(fieldDeclaration.getVariables().size() == 1);
        assertTrue(fieldDeclaration.getVariables().get(0).getId().getName().equals("a"));
        assertTrue(fieldDeclaration.getVariables().get(0).getId().getArrayCount() == 1);
    }

    @Test
    public void testPrimitiveAftTwoArray() throws Exception {
        CompilationUnit cu = JavaParser.parse("public class Test { private long [] a[], b[]; }");
        assertTrue(cu.getTypes().size() == 1);

        assertTrue(cu.getTypes().get(0).getMembers().size() == 1);
        assertTrue(cu.getTypes().get(0).getMembers().get(0) instanceof FieldDeclaration);

        FieldDeclaration fieldDeclaration = (FieldDeclaration)cu.getTypes().get(0).getMembers().get(0);
        assertTrue(fieldDeclaration.getType() instanceof ReferenceType);

        ReferenceType referenceType = (ReferenceType)fieldDeclaration.getType();
        assertTrue(referenceType.getArrayCount() == 1);

        assertTrue(fieldDeclaration.getVariables().size() == 2);
        assertTrue(fieldDeclaration.getVariables().get(0).getId().getName().equals("a"));
        assertTrue(fieldDeclaration.getVariables().get(0).getId().getArrayCount() == 1);
        assertTrue(fieldDeclaration.getVariables().get(1).getId().getName().equals("b"));
        assertTrue(fieldDeclaration.getVariables().get(1).getId().getArrayCount() == 1);

    }

    @Test
    public void testMethodParameterType() throws Exception {
        String javaSource = "public abstract class CDRInputStream { " +
                "    public final int read(byte b[]) throws IOException { " +
                "        return impl.read(b); " +
                "    } " +
                "} ";

        CompilationUnit compilationUnit = JavaParser.parse(javaSource);
        assertTrue(compilationUnit.getTypes().size() == 1);
        assertTrue(compilationUnit.getTypes().get(0).getMembers().size() == 1);
        assertTrue(compilationUnit.getTypes().get(0).getMembers().get(0) instanceof MethodDeclaration);

        MethodDeclaration methodDeclaration = (MethodDeclaration)compilationUnit.getTypes().get(0).getMembers().get(0);
        assertTrue(methodDeclaration.getParameters().size() == 1);

        Parameter parameter = methodDeclaration.getParameters().get(0);
        assertTrue(parameter.getType() instanceof PrimitiveType);
        assertTrue(parameter.getId().getArrayCount() == 1);

        PrimitiveType primitiveType = (PrimitiveType)parameter.getType();
        assertTrue(primitiveType.getType().name().equals("Byte"));
    }

    @Test
    public void testIntegerSuffix() throws Exception {
        String javaSource = "public abstract class CDRInputStream { " +
                "    private long a = 0L; " +
                "    private long b = 0l; " +
                "    private int c = 0L; " +
                "    private int d = 0l; " +
                "    private int e = 0; " +
                "} ";

        CompilationUnit compilationUnit = JavaParser.parse(javaSource);

        assertTrue(compilationUnit.getTypes().size() == 1);
        assertTrue(compilationUnit.getTypes().get(0).getMembers().size() == 5);

        FieldDeclaration fieldDeclaration;

        fieldDeclaration = (FieldDeclaration)compilationUnit.getTypes().get(0).getMembers().get(0);
        assertTrue(fieldDeclaration.getVariables().get(0).getInit() instanceof LongLiteralExpr);
        assertTrue(((LongLiteralExpr) fieldDeclaration.getVariables().get(0).getInit()).getValue().equals("0L"));

        fieldDeclaration = (FieldDeclaration)compilationUnit.getTypes().get(0).getMembers().get(1);
        assertTrue(fieldDeclaration.getVariables().get(0).getInit() instanceof LongLiteralExpr);
        assertTrue(((LongLiteralExpr) fieldDeclaration.getVariables().get(0).getInit()).getValue().equals("0l"));

        fieldDeclaration = (FieldDeclaration)compilationUnit.getTypes().get(0).getMembers().get(2);
        assertTrue(fieldDeclaration.getVariables().get(0).getInit() instanceof LongLiteralExpr);
        assertTrue(((LongLiteralExpr) fieldDeclaration.getVariables().get(0).getInit()).getValue().equals("0L"));

        fieldDeclaration = (FieldDeclaration)compilationUnit.getTypes().get(0).getMembers().get(3);
        assertTrue(fieldDeclaration.getVariables().get(0).getInit() instanceof LongLiteralExpr);
        assertTrue(((LongLiteralExpr) fieldDeclaration.getVariables().get(0).getInit()).getValue().equals("0l"));

        fieldDeclaration = (FieldDeclaration)compilationUnit.getTypes().get(0).getMembers().get(4);
        assertTrue(fieldDeclaration.getVariables().get(0).getInit() instanceof IntegerLiteralExpr);
        assertTrue(((IntegerLiteralExpr) fieldDeclaration.getVariables().get(0).getInit()).getValue().equals("0"));
    }

}
