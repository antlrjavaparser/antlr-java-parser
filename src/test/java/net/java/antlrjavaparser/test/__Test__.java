package net.java.antlrjavaparser.test;

import net.java.antlrjavaparser.Java7Lexer;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.CompilationUnit;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.InputStream;


public class __Test__ {

    private CompilationUnit compilationUnit = new CompilationUnit();

    public static void main(String args[]) throws Exception {
        __Test__ tester = new __Test__();
        tester.test();
    }

    public void test() throws Exception {
        InputStream in = getClass().getClassLoader().getResourceAsStream("SimpleTest.java.txt");

        if (in == null) {
            System.err.println("Unable to find test file.");
            return;
        }

        Java7Lexer lex = new Java7Lexer(new ANTLRInputStream(in));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        Java7Parser parser = new Java7Parser(tokens);

        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();

        // Fills out the compilationUnit object
        CompilationUnitListener listener = new CompilationUnitListener(parser);
        walker.walk(listener, tree);

        compilationUnit = listener.getCompilationUnit();

        System.out.println("==========================================================================");
        //System.out.println(compilationUnit.toString());
    }
}
