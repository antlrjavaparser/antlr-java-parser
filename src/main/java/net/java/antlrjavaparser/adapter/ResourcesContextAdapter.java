package net.java.antlrjavaparser.adapter;

import net.java.antlrjavaparser.api.Node;
import net.java.antlrjavaparser.Java7Parser;
import net.java.antlrjavaparser.api.body.Resource;

import java.util.LinkedList;
import java.util.List;

public class ResourcesContextAdapter implements Adapter<List<Resource>, Java7Parser.ResourcesContext> {
    public List<Resource> adapt(Java7Parser.ResourcesContext context) {

        List<Resource> resourceList = new LinkedList<Resource>();
        for (Java7Parser.ResourceContext resourceContext : context.resource()) {
            resourceList.add(Adapters.getResourceContextAdapter().adapt(resourceContext));
        }

        return resourceList;
    }
}
