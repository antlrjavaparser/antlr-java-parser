package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.CatchParameter;
import net.java.antlrjavaparser.api.body.Parameter;
import net.java.antlrjavaparser.api.body.VariableDeclaratorId;
import net.java.antlrjavaparser.api.stmt.CatchClause;
import net.java.antlrjavaparser.api.type.ReferenceType;
import net.java.antlrjavaparser.api.type.Type;

import java.util.LinkedList;
import java.util.List;

public class CatchClauseContextAdapter implements Adapter<CatchClause, Java7Parser.CatchClauseContext> {
    public CatchClause adapt(Java7Parser.CatchClauseContext context) {

        /*
        catchClause
            :   CATCH LPAREN catchFormalParameter RPAREN block
            ;

        catchFormalParameter
            :    variableModifiers type (BAR type)* Identifier (LBRACKET RBRACKET)*
            ;

        */

        CatchClause catchClause = new CatchClause();
        CatchParameter parameter = new CatchParameter();
        AdapterUtil.setVariableModifiers(context.catchFormalParameter().variableModifiers(), parameter);

        List<Type> typeList = new LinkedList<Type>();
        for (Java7Parser.TypeContext typeContext : context.catchFormalParameter().type()) {
            typeList.add(Adapters.getTypeContextAdapter().adapt(typeContext));
        }
        parameter.setTypeList(typeList);

        VariableDeclaratorId variableDeclaratorId = new VariableDeclaratorId();
        variableDeclaratorId.setName(context.catchFormalParameter().Identifier().getText());
        parameter.setId(variableDeclaratorId);

        // TODO: Figure out how this is handled with multi-catch
        /*
        if (context.catchFormalParameter().LBRACKET() != null && context.catchFormalParameter().LBRACKET().size() > 0) {
            ReferenceType referenceType = (ReferenceType)parameter.getType();
            referenceType.setArrayCount(referenceType.getArrayCount() + context.catchFormalParameter().LBRACKET().size());
        }
        */

        catchClause.setExcept(parameter);
        catchClause.setCatchBlock(Adapters.getBlockContextAdapter().adapt(context.block()));

        // TODO: Multi Catch

        return catchClause;
    }
}
