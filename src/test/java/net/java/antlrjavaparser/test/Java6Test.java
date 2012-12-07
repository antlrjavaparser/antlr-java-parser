package net.java.antlrjavaparser.test;

import net.java.antlrjavaparser.api.CompilationUnit;

import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 11/28/12
 * Time: 4:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Java6Test {


    private CompilationUnit compilationUnit = new CompilationUnit();

    public static void main(String args[]) throws Exception {
        Java6Test tester = new Java6Test();
        tester.test();
    }

    public void test() throws Exception {
        InputStream in = getClass().getClassLoader().getResourceAsStream("SimpleTest.java.txt");

        if (in == null) {
            System.err.println("Unable to find test file.");
            return;
        }
        /*
        JavaLexer lexer = new JavaLexer(new ANTLRInputStream(in));
        JavaParser parser = new JavaParser(new CommonTokenStream(lexer));
        CommonTree tree = (CommonTree)parser.javaSource().getTree();

        System.out.println(tree.toStringTree());
        */
    }

}
