package de.konten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KontoGruppe extends AbstractKontoNode {

    private final List<AbstractKontoNode> children = new ArrayList<>();
    public KontoGruppe(final String label) {
        super(label);
    }

    @Override
    public List<AbstractKontoNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void addChild(AbstractKontoNode child) {
        if(child == this) throw new IllegalArgumentException("Upps");
        child.setParent(this);
        children.add(child);
    }

    public void removeChild(AbstractKontoNode child) {
        child.setParent(null);
        children.remove(child);
    }

}
