package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.EnumConstantDeclaration;

import java.util.LinkedList;
import java.util.List;

public class EnumConstantsContextAdapter implements Adapter<List<EnumConstantDeclaration>, Java7Parser.EnumConstantsContext> {
    public List<EnumConstantDeclaration> adapt(Java7Parser.EnumConstantsContext context) {

        if (context.enumConstant() == null || context.enumConstant().size() == 0) {
            return null;
        }

        List<EnumConstantDeclaration> enumConstantDeclarationList = new LinkedList<EnumConstantDeclaration>();
        for (Java7Parser.EnumConstantContext enumConstantContext : context.enumConstant()) {
            enumConstantDeclarationList.add(Adapters.getEnumConstantContextAdapter().adapt(enumConstantContext));
        }

        return enumConstantDeclarationList;
    }
}
