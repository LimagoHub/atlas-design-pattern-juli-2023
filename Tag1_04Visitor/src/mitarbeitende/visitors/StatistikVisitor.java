package mitarbeitende.visitors;

import mitarbeitende.GehaltsEmpaenger;
import mitarbeitende.LohnEmpfaenger;

public class StatistikVisitor extends AbstractMitarbeiterVisitor{

    private int lohnEmpfaengerCounter = 0;
    private int gehaltEmpfaengerCounter = 0;


    public int getLohnEmpfaengerCounter() {
        return lohnEmpfaengerCounter;
    }

    public int getGehaltEmpfaengerCounter() {
        return gehaltEmpfaengerCounter;
    }

    public int getTotalCounter() {
        return gehaltEmpfaengerCounter + lohnEmpfaengerCounter;
    }

    @Override
    public void visit(final LohnEmpfaenger lohnEmpfaenger) {
        lohnEmpfaengerCounter ++;
    }

    @Override
    public void visit(final GehaltsEmpaenger gehaltsEmpaenger) {
        gehaltEmpfaengerCounter ++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatistikVisitor{");
        sb.append("lohnEmpfaengerCounter=").append(lohnEmpfaengerCounter);
        sb.append(", gehaltEmpfaengerCounter=").append(gehaltEmpfaengerCounter);
        sb.append(", totalCounter=").append(lohnEmpfaengerCounter + gehaltEmpfaengerCounter);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void init() {
        lohnEmpfaengerCounter = 0;
        gehaltEmpfaengerCounter = 0;
    }

    @Override
    public void dispose() {
        System.out.println(this);
    }
}
