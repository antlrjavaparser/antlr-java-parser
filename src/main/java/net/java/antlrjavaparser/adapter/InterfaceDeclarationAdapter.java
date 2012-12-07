package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.ClassOrInterfaceDeclaration;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/2/12
 * Time: 10:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class InterfaceDeclarationAdapter implements Adapter <ClassOrInterfaceDeclaration, Java7Parser.InterfaceDeclarationContext> {
    @Override
    public ClassOrInterfaceDeclaration adapt(Java7Parser.InterfaceDeclarationContext context) {

        if (context.annotationTypeDeclaration() != null) {
            return Adapters.getAnnotationTypeDeclarationAdapter().adapt(context.annotationTypeDeclaration());
        } else if (context.normalInterfaceDeclaration() != null) {
            return Adapters.getNormalInterfaceDeclarationAdapter().adapt(context.normalInterfaceDeclaration());
        }

        return null;
    }
}
