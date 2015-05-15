package com.github.antlrjavaparser.test.expr;

import com.github.antlrjavaparser.JavaParser;
import com.github.antlrjavaparser.api.CompilationUnit;
import com.github.antlrjavaparser.api.body.ConstructorDeclaration;
import com.github.antlrjavaparser.api.expr.BinaryExpr;
import com.github.antlrjavaparser.api.stmt.ExpressionStmt;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mike on 5/14/2015.
 */
public class ShiftOperatorTest {
    @Test
    public void testShiftOperator() throws Exception {
        String javaSource =
                "public class Debug{\n" +
                "    public Debug(){\n" +
                "        1 << 6;  //1 <= 6\n" +
                "        1 >> 6;  //1 <  6\n" +
                "        1 >>> 6; //1 >= 6\n" +
                "    }\n" +
                "}";

        CompilationUnit compilationUnit = JavaParser.parse(javaSource);

        ConstructorDeclaration constructorDeclaration = (ConstructorDeclaration)compilationUnit.getTypes().get(0).getMembers().get(0);
        ExpressionStmt expression1 = (ExpressionStmt)constructorDeclaration.getBlock().getStmts().get(0);
        ExpressionStmt expression2 = (ExpressionStmt)constructorDeclaration.getBlock().getStmts().get(1);
        ExpressionStmt expression3 = (ExpressionStmt)constructorDeclaration.getBlock().getStmts().get(2);

        BinaryExpr binaryExpression1 = (BinaryExpr)expression1.getExpression();
        BinaryExpr binaryExpression2 = (BinaryExpr)expression2.getExpression();
        BinaryExpr binaryExpression3 = (BinaryExpr)expression3.getExpression();

        assertEquals("1", binaryExpression1.getLeft().toString());
        assertEquals("6", binaryExpression1.getRight().toString());
        assertEquals("lShift", binaryExpression1.getOperator().toString());

        assertEquals("1", binaryExpression2.getLeft().toString());
        assertEquals("6", binaryExpression2.getRight().toString());
        assertEquals("rSignedShift", binaryExpression2.getOperator().toString());

        assertEquals("1", binaryExpression3.getLeft().toString());
        assertEquals("6", binaryExpression3.getRight().toString());
        assertEquals("rUnsignedShift", binaryExpression3.getOperator().toString());
    }
}
