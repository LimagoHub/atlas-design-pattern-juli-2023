package de.konten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AbstractKontoNode implements Iterable<AbstractKontoNode>{

    private AbstractKontoNode parent = null;
    private String label = "undefined";

    public AbstractKontoNode(final String label) {
        this.label = label;
    }

    public AbstractKontoNode getParent() {
        return parent;
    }

    public void setParent(final AbstractKontoNode parent) {
        this.parent = parent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public List<AbstractKontoNode> getChildren() {
        return Collections.emptyList();
    }

    public void print() {
        for (AbstractKontoNode node: this) {
            System.out.println(node);
        }
    }

    @Override
    public Iterator<AbstractKontoNode> iterator() {
        final List<AbstractKontoNode> list = new ArrayList<>();
        addSelfAndDescendantsToList(list);
        return list.iterator();
    }

    private void addSelfAndDescendantsToList(final List<AbstractKontoNode> list) {
        list.add(this);
        for(AbstractKontoNode child: getChildren()) {
            child.addSelfAndDescendantsToList(list);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder( this.getClass().getSimpleName() + "{");
        sb.append(", label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
