package net.java.antlrjavaparser.test;

import junit.framework.TestCase;
import net.java.antlrjavaparser.Java7Lexer;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.CompilationUnit;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/12/12
 * Time: 10:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestAll extends TestCase {

    //@Test
    public void testValidJavaFiles() {
        /*
        URL url = this.getClass().getResource("/testFiles/SimpleTest.java.txt");
        File file = new File(url.getFile());

        File testDirectory = new File("/tmp/java-src");

        listFiles(testDirectory, new Listener() {

            private boolean skip = false;

            @Override
            public void enterFile(File file) {

                //if (file.getPath().endsWith("\\tmp\\java-src\\src\\java\\util\\concurrent\\ScheduledFuture.java")) {
//                    skip = false;
//                }

                if (file.getName().endsWith(".java") && !skip) {

                    try {
                        System.out.println("Parsing file: " + file.getPath());
                        parseFile(file.getPath());
                    } catch (IOException e) {
                        e.printStackTrace();
                        fail();
                    }
                }
            }
        });
        */
    }


    private void listFiles(File directory, Listener listener) {
        for (File file : directory.listFiles()) {
            if (file.isDirectory()) {
                listFiles(file, listener);
            } else {
                listener.enterFile(file);
            }
        }
    }

    private static interface Listener {
        void enterFile(File file);
    }

    private static void parseFile(String file) throws IOException {
        FileInputStream fileIn = new FileInputStream(file);

        Java7Lexer lex = new Java7Lexer(new ANTLRInputStream(fileIn));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        Java7Parser parser = new Java7Parser(tokens);
        long start = System.currentTimeMillis();

        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        parser.removeErrorListeners();
        parser.addErrorListener(new DiagnosticErrorListener());
        parser.setErrorHandler(new BailErrorStrategy());


        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        CompilationUnitListener listener = new CompilationUnitListener(parser);
        walker.walk(listener, tree);
        CompilationUnit compilationUnit = listener.getCompilationUnit();

    }
}
