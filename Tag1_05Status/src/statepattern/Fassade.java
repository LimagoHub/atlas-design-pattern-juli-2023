package statepattern;

public class Fassade {

    protected final State stateA = new State_A(this);
    protected final State stateB = new State_B(this);

    protected State current = stateA;

    public void print() {
        current.print();
    }

    public void changeToB() {
        current.changeToB();
    }

    public void changeToA() {
        current.changeToA();
    }
}
