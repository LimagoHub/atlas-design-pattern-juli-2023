package statepattern;

public class AbstractState implements State{

    private final Fassade fassade;

    public AbstractState(final Fassade fassade) {
        this.fassade = fassade;
    }

    protected final Fassade getFassade() {
        return fassade;
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Diese Methode macht in diesem State keinen Sinn");
    }

    @Override
    public void changeToB() {
        throw new UnsupportedOperationException("Diese Methode macht in diesem State keinen Sinn");
    }

    @Override
    public void changeToA() {
        throw new UnsupportedOperationException("Diese Methode macht in diesem State keinen Sinn");
    }
}
