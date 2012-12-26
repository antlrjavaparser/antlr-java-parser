package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.BodyDeclaration;

import java.util.LinkedList;
import java.util.List;

public class InterfaceBodyContextAdapter implements Adapter<List<BodyDeclaration>, Java7Parser.InterfaceBodyContext> {
    public List<BodyDeclaration> adapt(Java7Parser.InterfaceBodyContext context) {

        List<BodyDeclaration> bodyDeclarationList = new LinkedList<BodyDeclaration>();
        for (Java7Parser.InterfaceBodyDeclarationContext interfaceBodyDeclarationContext : context.interfaceBodyDeclaration()) {
            bodyDeclarationList.add(Adapters.getInterfaceBodyDeclarationContextAdapter().adapt(interfaceBodyDeclarationContext));
        }

        return bodyDeclarationList;
    }
}
