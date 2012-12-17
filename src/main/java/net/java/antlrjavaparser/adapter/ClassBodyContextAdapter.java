package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.BodyDeclaration;

import java.util.LinkedList;
import java.util.List;

public class ClassBodyContextAdapter implements Adapter<List<BodyDeclaration>, Java7Parser.ClassBodyContext> {
    public List<BodyDeclaration> adapt(Java7Parser.ClassBodyContext context) {

        List<BodyDeclaration> bodyDeclarationList = new LinkedList<BodyDeclaration>();
        for (Java7Parser.ClassBodyDeclarationContext classBodyDeclarationContext : context.classBodyDeclaration()) {
            bodyDeclarationList.add(Adapters.getClassBodyDeclarationContextAdapter().adapt(classBodyDeclarationContext));
        }

        return bodyDeclarationList;
    }
}
