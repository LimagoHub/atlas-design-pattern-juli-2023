package mitarbeitende.visitors;

import mitarbeitende.AbstractMitarbeiter;
import mitarbeitende.GehaltsEmpaenger;
import mitarbeitende.LohnEmpfaenger;

public class PrintVisitor extends AbstractMitarbeiterVisitor{
    @Override
    public void visit(final LohnEmpfaenger lohnEmpfaenger) {
        print(lohnEmpfaenger);
    }

    @Override
    public void visit(final GehaltsEmpaenger gehaltsEmpaenger) {
        print(gehaltsEmpaenger);
    }

    private void print(AbstractMitarbeiter m) {
        System.out.println(m);
    }
}
