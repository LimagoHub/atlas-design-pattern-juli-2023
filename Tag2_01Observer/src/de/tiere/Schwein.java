package de.tiere;

import java.util.ArrayList;
import java.util.List;



public class Schwein {

    private static final int MAX_WEIGHT = 20;
    private final List<PigReadyListener> pigReadyListeners = new ArrayList<>();

    public void addPigReadyListener(PigReadyListener listener){
        pigReadyListeners.add(listener);
    }
    public void removePigReadyListener(PigReadyListener listener){
        pigReadyListeners.remove(listener);
    }

    private void firePigReadyEvent() {
        pigReadyListeners.forEach(listener->listener.pigIsReady(this));
    }

    private String name;
    private int gewicht;

    public Schwein(final String name) {
        this.name = name;
        this.gewicht = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
        if(this.gewicht == gewicht) return;
        this.gewicht = gewicht;
        if(gewicht>MAX_WEIGHT) firePigReadyEvent();
    }

    public void fuettern() {
        setGewicht(getGewicht() + 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }
}
