package mitarbeitende.visitors;

import mitarbeitende.GehaltsEmpaenger;
import mitarbeitende.LohnEmpfaenger;

public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor{
    @Override
    public void visit(final LohnEmpfaenger lohnEmpfaenger) {
        // NOP
    }

    @Override
    public void visit(final GehaltsEmpaenger gehaltsEmpaenger) {
        // NOP
    }

    public void init() {

    }

    public void dispose() {

    }
}
