package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.BodyDeclaration;

import java.util.List;

public class EnumBodyContextAdapter implements Adapter<List<BodyDeclaration>, Java7Parser.EnumBodyContext> {
    public List<BodyDeclaration> adapt(Java7Parser.EnumBodyContext context) {

        /*
        enumBody
            :    LBRACE (enumConstants)? COMMA? (enumBodyDeclarations)? RBRACE
            ;
         */

        // Enum Constants are handled in the EnumDeclaration Adapter

        if (context.enumBodyDeclarations() != null) {
            return Adapters.getEnumBodyDeclarationsContextAdapter().adapt(context.enumBodyDeclarations());
        }

        return null;
    }
}
