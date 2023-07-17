package mitarbeitende;

import mitarbeitende.visitors.MitarbeiterVisitor;

public class LohnEmpfaenger extends AbstractMitarbeiter{

    private double stundenlohn;
    private double arbeitszeit;

    public LohnEmpfaenger(final String name) {
        this(name, 0,0);
    }

    public LohnEmpfaenger(final String name, final double stundenlohn, final double arbeitszeit) {
        super(name);
        this.stundenlohn = stundenlohn;
        this.arbeitszeit = arbeitszeit;
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public void setStundenlohn(final double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }

    public double getArbeitszeit() {
        return arbeitszeit;
    }

    public void setArbeitszeit(final double arbeitszeit) {
        this.arbeitszeit = arbeitszeit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString() +"{");
        sb.append("stundenlohn=").append(stundenlohn);
        sb.append(", arbeitszeit=").append(arbeitszeit);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void accept(final MitarbeiterVisitor visitor) {
        visitor.visit(this);
    }
}
