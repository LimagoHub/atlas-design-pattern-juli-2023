package de.konten;

public class Konto extends AbstractKontoNode {

    private double saldo = 0;
    public Konto(final String label) {
        super(label);
    }

    public Konto(final String label, final double saldo) {
        super(label);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(final double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Konto{");
        sb.append("label=").append(getLabel());
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }
}
