package com.github.antlrjavaparser;

import com.github.antlrjavaparser.api.CompilationUnit;
import junit.framework.TestCase;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Mike De Haan
 * Date: 12/12/12
 * Time: 10:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestAll extends TestCase {

    @Test
    public void testValidJavaFiles() {
        //URL url = this.getClass().getResource("/testFiles/SimpleTest.java.txt");
        //File file = new File(url.getFile());

        if (true) {
            return;
        }

        File testDirectory = new File("/tmp/java8-src");

        listFiles(testDirectory, new Listener() {

            private boolean skip = true;

            @Override
            public void enterFile(File file) {

                if (file.getPath().endsWith("\\tmp\\java8-src\\java\\lang\\invoke\\MethodHandleInfo.java")) {
                    skip = false;
                }

                if (file.getName().endsWith(".java") && !skip) {

                    try {
                        System.out.println("Parsing file: " + file.getPath());

                        FileInputStream fileInputStream = new FileInputStream(file);
                        CompilationUnit compilationUnit = JavaParser.parse(fileInputStream, new ParserConfigurator() {
                            @Override
                            public void configure(Java7Parser parser) {
                                parser.removeErrorListeners();
                                parser.addErrorListener(new DiagnosticErrorListener());
                                parser.setErrorHandler(new BailErrorStrategy());
                            }
                        });
                    } catch (IOException e) {
                        e.printStackTrace();
                        fail();
                    }
                }
            }
        });

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
}
