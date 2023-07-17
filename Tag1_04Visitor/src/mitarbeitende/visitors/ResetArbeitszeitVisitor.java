package mitarbeitende.visitors;


import mitarbeitende.LohnEmpfaenger;

public class ResetArbeitszeitVisitor extends AbstractMitarbeiterVisitor {

    @Override
    public void visit(final LohnEmpfaenger lohnEmpfaenger) {
        lohnEmpfaenger.setArbeitszeit(0);
    }
}
