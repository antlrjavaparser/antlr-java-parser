package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.ClassOrInterfaceDeclaration;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/2/12
 * Time: 9:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClassDeclarationAdapter implements Adapter<ClassOrInterfaceDeclaration, Java7Parser.ClassDeclarationContext> {

    @Override
    public ClassOrInterfaceDeclaration adapt(Java7Parser.ClassDeclarationContext context) {

        /*

        ClassOrInterfaceDeclaration classOrInterfaceDeclaration = new ClassOrInterfaceDeclaration();
        classOrInterfaceDeclaration.setName(context.Identifier().getText());

        List<BodyDeclaration> bodyDeclarationList = new LinkedList<BodyDeclaration>();
        for (Java7Parser.ClassBodyDeclarationContext classBodyContext : context.classBody().classBodyDeclaration()) {
            bodyDeclarationList.add(Adapters.getClassBodyDeclarationAdapter().adapt(classBodyContext));
        }
        classOrInterfaceDeclaration.setMembers(bodyDeclarationList);

        return classOrInterfaceDeclaration;

        */

        return null;
    }
}
