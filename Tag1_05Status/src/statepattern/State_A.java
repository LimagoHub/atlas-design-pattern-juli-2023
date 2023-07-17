package statepattern;

public class State_A extends AbstractState{
    public State_A(final Fassade fassade) {
        super(fassade);
    }

    @Override
    public void print() {
        System.out.println("Hier druckt A");
    }

    @Override
    public void changeToB() {
        getFassade().current = getFassade().stateB;
    }
}
