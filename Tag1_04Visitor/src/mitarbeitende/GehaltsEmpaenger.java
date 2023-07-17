package mitarbeitende;

import mitarbeitende.visitors.MitarbeiterVisitor;

public class GehaltsEmpaenger extends AbstractMitarbeiter{

    private double gehalt;

    public GehaltsEmpaenger(final String name) {
        this(name, 0);
    }
    public GehaltsEmpaenger(final String name, final double gehalt) {
        super(name);
        this.gehalt = gehalt;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(final double gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public String toString() {

        return super.toString() + ", Gehalt=" + gehalt;
    }

    @Override
    public void accept(final MitarbeiterVisitor visitor) {
        visitor.visit(this);
    }
}
