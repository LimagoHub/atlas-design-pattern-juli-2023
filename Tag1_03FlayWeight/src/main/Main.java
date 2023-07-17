package main;

import flyweight.AttributedCharachter;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {


        StringBuilder s = new StringBuilder();

        Instant start = Instant.now();

        for (int i = 0; i < 2_000_000; i++) {
            s.append("a");
        }

        String string = s.toString();
        Instant ende = Instant.now();
        System.out.println(Duration.between(start, ende).toMillis());

    }
}