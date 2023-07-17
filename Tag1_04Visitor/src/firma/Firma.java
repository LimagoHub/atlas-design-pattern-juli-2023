package firma;

import mitarbeitende.AbstractMitarbeiter;
import mitarbeitende.LohnEmpfaenger;
import mitarbeitende.visitors.MitarbeiterVisitor;

import java.util.ArrayList;
import java.util.List;

public class Firma {

    private final List<AbstractMitarbeiter> mitarbeiters = new ArrayList<>();

    public boolean add(final AbstractMitarbeiter abstractMitarbeiter) {
        return mitarbeiters.add(abstractMitarbeiter);
    }

    public boolean remove(final AbstractMitarbeiter abstractMitarbeiter) {
        return mitarbeiters.remove(abstractMitarbeiter);
    }

    public void print() {
        for (AbstractMitarbeiter mitarbeiter: mitarbeiters ) {
            System.out.println(mitarbeiter);
        }
    }

    public void iterate(MitarbeiterVisitor visitor) {
        visitor.init();
        for(AbstractMitarbeiter mitarbeiter: mitarbeiters) {
            mitarbeiter.accept(visitor);
        }
        visitor.dispose();
    }

}
