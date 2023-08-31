package de.composite;

import java.util.Collections;
import java.util.List;

public class AbstractNode {

    private AbstractNode parent = null;
    private String label = "undefined";

    public AbstractNode(final String label) {
        this.label = label;
    }

    public AbstractNode getParent() {
        return parent;
    }

    public void setParent(final AbstractNode parent) {
        this.parent = parent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public List<AbstractNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder( this.getClass().getSimpleName() + "{");
        sb.append(", label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
