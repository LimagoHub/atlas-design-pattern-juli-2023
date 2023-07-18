package main;

import de.tiere.PigReadyListener;
import de.tiere.Schwein;

public class Main {

    private Metzger metzger = new Metzger();
    private Spediteur spediteur = new Spediteur();

    public static void main(String[] args) {

       new Main().run();
    }

    private void run() {
        Schwein piggy = new Schwein("Miss Piggy");
        piggy.addPigReadyListener(new SchweineMetzgerAdapter());
        piggy.addPigReadyListener(new PigReadyListener() {
            @Override
            public void pigIsReady(final Schwein source) {
                metzger.schlachten(source);
            }
        });
        piggy.addPigReadyListener((Schwein s)->{spediteur.fahren(s);});
        piggy.addPigReadyListener(spediteur::fahren);
        for (int i = 0; i < 11; i++) {
            piggy.fuettern();
        }
    }

    class SchweineMetzgerAdapter implements PigReadyListener {

        @Override
        public void pigIsReady(final Schwein source) {
            metzger.schlachten(source);
        }
    }
}

class Metzger {


    public void schlachten(final Object source) {
        System.out.println("Messer wetz");
    }
}

class Spediteur {


    public void fahren(final Object ware) {
        System.out.println("Wir fahren auf der Autobahn");
    }
}