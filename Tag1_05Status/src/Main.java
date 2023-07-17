package main;

import statepattern.Fassade;

public class Main {
    public static void main(String[] args) {


        Fassade fassade = new Fassade();
        fassade.print();
        fassade.changeToB();

        fassade.print();
        fassade.changeToB();
    }
}