package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.ClassOrInterfaceDeclaration;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/2/12
 * Time: 10:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class NormalInterfaceDeclarationAdapter implements Adapter<ClassOrInterfaceDeclaration, Java7Parser.NormalInterfaceDeclarationContext> {
    @Override
    public ClassOrInterfaceDeclaration adapt(Java7Parser.NormalInterfaceDeclarationContext context) {

        ClassOrInterfaceDeclaration classOrInterfaceDeclaration = new ClassOrInterfaceDeclaration();

        classOrInterfaceDeclaration.setInterface(true);
        //classOrInterfaceDeclaration.setName(context.interfaceType().typeDeclSpecifier().Identifier().getText());

        // Generics <K, V>

        //classOrInterfaceDeclaration.setTypeParameters();

        // Other interfaces this one extends from
        //context.typeList()
        //classOrInterfaceDeclaration.setExtends();

        //statement.setTypeDeclaration(classOrInterfaceDeclaration);

        //context.interfaceBody()


        return classOrInterfaceDeclaration;
    }
}
