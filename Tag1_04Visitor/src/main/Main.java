package main;

import firma.Firma;
import mitarbeitende.GehaltsEmpaenger;
import mitarbeitende.LohnEmpfaenger;
import mitarbeitende.visitors.PrintVisitor;
import mitarbeitende.visitors.ResetArbeitszeitVisitor;
import mitarbeitende.visitors.StatistikVisitor;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Firma firma = new Firma();

        firma.add(new LohnEmpfaenger("Hinz", 10, 10));
        firma.add(new GehaltsEmpaenger("Schmitt", 3000));
        firma.add(new GehaltsEmpaenger("Mueller", 4000));
        firma.add(new GehaltsEmpaenger("Mayer", 5000));
        firma.add(new LohnEmpfaenger("Kunz", 12, 20));


        // AuszahlungsVisitor

        //firma.print();
        firma.iterate(new PrintVisitor());
        firma.iterate(new ResetArbeitszeitVisitor());
        firma.iterate(new PrintVisitor());


        StatistikVisitor v = new StatistikVisitor();
        firma.iterate(v);
        firma.iterate(v);

        var liste = List.of("Eins", "zwei","drei") ;
        liste.forEach(System.out::println);

    }
}