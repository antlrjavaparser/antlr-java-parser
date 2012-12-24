package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.BodyDeclaration;

import java.util.LinkedList;
import java.util.List;

public class EnumBodyDeclarationsContextAdapter implements Adapter<List<BodyDeclaration>, Java7Parser.EnumBodyDeclarationsContext> {
    public List<BodyDeclaration> adapt(Java7Parser.EnumBodyDeclarationsContext context) {

/*
        enumBodyDeclarations
        :   SEMI
                (classBodyDeclaration
                )*
        ;
  */

        if (context.classBodyDeclaration() == null || context.classBodyDeclaration().size() == 0) {
            return null;
        }

        List<BodyDeclaration> bodyDeclarationList = new LinkedList<BodyDeclaration>();
        for (Java7Parser.ClassBodyDeclarationContext classBodyDeclarationContext : context.classBodyDeclaration()) {
            bodyDeclarationList.add(Adapters.getClassBodyDeclarationContextAdapter().adapt(classBodyDeclarationContext));
        }

        return bodyDeclarationList;
    }
}
