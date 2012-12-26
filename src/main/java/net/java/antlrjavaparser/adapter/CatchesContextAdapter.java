package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.stmt.CatchClause;

import java.util.LinkedList;
import java.util.List;

public class CatchesContextAdapter implements Adapter<List<CatchClause>, Java7Parser.CatchesContext> {
    public List<CatchClause> adapt(Java7Parser.CatchesContext context) {

        List<CatchClause> catchClauseList = new LinkedList<CatchClause>();
        for (Java7Parser.CatchClauseContext catchClauseContext : context.catchClause()) {
            catchClauseList.add(Adapters.getCatchClauseContextAdapter().adapt(catchClauseContext));
        }

        return catchClauseList;
    }
}
