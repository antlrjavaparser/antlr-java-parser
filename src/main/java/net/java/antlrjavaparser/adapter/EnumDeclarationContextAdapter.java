package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.EnumDeclaration;
import net.java.antlrjavaparser.api.type.Type;

import java.util.List;

public class EnumDeclarationContextAdapter implements Adapter<EnumDeclaration, Java7Parser.EnumDeclarationContext> {
    public EnumDeclaration adapt(Java7Parser.EnumDeclarationContext context) {

        /*
        enumDeclaration
            :   modifiers ENUM Identifier (IMPLEMENTS typeList)? enumBody
            ;
         */
        EnumDeclaration enumDeclaration = new EnumDeclaration();
        AdapterUtil.setModifiers(context.modifiers(), enumDeclaration);
        enumDeclaration.setName(context.Identifier().getText());
        List<Type> typeList = Adapters.getTypeListContextAdapter().adapt(context.typeList());
        enumDeclaration.setImplements(AdapterUtil.convertTypeList(typeList));
        enumDeclaration.setMembers(Adapters.getEnumBodyContextAdapter().adapt(context.enumBody()));

        // These come from enumBody

        if (context.enumBody().enumConstants() != null) {
            enumDeclaration.setEntries(Adapters.getEnumConstantsContextAdapter().adapt(context.enumBody().enumConstants()));
        }

        return enumDeclaration;
    }
}
