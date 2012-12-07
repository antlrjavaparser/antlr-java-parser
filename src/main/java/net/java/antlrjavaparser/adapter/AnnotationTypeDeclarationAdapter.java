package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.ClassOrInterfaceDeclaration;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/2/12
 * Time: 10:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class AnnotationTypeDeclarationAdapter implements Adapter<ClassOrInterfaceDeclaration, Java7Parser.AnnotationTypeDeclarationContext> {
    @Override
    public ClassOrInterfaceDeclaration adapt(Java7Parser.AnnotationTypeDeclarationContext context) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
