package main;


import de.konten.AbstractKontoNode;
import de.konten.Konto;
import de.konten.KontoGruppe;



public class Main {
    public static void main(String[] args) {

        KontoGruppe root = new KontoGruppe("Root");

        KontoGruppe e1 = new KontoGruppe("e1");
        root.addChild(e1);


        KontoGruppe e2 = new KontoGruppe("e2");
        root.addChild(e2);

        KontoGruppe e1_1 = new KontoGruppe("e1_1");
        e1.addChild(e1_1);


        KontoGruppe e1_2 = new KontoGruppe("e1_2");
        e1.addChild(e1_2);

        Konto l2_1 = new Konto("l2_1");

        e2.addChild(l2_1);

        root.print();

    }


}