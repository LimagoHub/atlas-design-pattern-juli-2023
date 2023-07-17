package mitarbeitende.visitors;

import mitarbeitende.GehaltsEmpaenger;
import mitarbeitende.LohnEmpfaenger;

public interface MitarbeiterVisitor {

    void init();

    void visit(LohnEmpfaenger lohnEmpfaenger);
    void visit(GehaltsEmpaenger gehaltsEmpaenger);

    void dispose();
}
