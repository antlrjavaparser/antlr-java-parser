package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.stmt.SwitchEntryStmt;

import java.util.LinkedList;
import java.util.List;

public class SwitchBlockStatementGroupsContextAdapter implements Adapter<List<SwitchEntryStmt>, Java7Parser.SwitchBlockStatementGroupsContext> {
    public List<SwitchEntryStmt> adapt(Java7Parser.SwitchBlockStatementGroupsContext context) {

        List<SwitchEntryStmt> switchEntryStmtList = new LinkedList<SwitchEntryStmt>();
        for (Java7Parser.SwitchBlockStatementGroupContext groupContext : context.switchBlockStatementGroup()) {
            switchEntryStmtList.add(Adapters.getSwitchBlockStatementGroupContextAdapter().adapt(groupContext));
        }

        return switchEntryStmtList;
    }
}
