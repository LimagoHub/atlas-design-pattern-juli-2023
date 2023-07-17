package statepattern;



public class State_B extends AbstractState{
    public State_B(final Fassade fassade) {
        super(fassade);
    }

    @Override
    public void print() {
        System.out.println("Hier druckt B");
    }

    @Override
    public void changeToA() {
        getFassade().current = getFassade().stateA;
    }
}
