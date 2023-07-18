package main;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var list = List.of("Eins", "Zwei", "Drei");

        for (var item:list) {
            System.out.println(item);
        }

        list.forEach(System.out::println);

        Iterator<String> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());

    }
}