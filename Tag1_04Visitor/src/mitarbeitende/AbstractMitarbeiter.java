package mitarbeitende;

import mitarbeitende.visitors.MitarbeiterVisitor;

public abstract class AbstractMitarbeiter {

    private final String name;

    public AbstractMitarbeiter(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() + ": ");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public abstract void accept(MitarbeiterVisitor visitor);
}
