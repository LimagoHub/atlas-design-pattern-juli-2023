package de.client;

import de.math.Calculator;

public class CalcClient {
    private final Calculator calculator;

    public CalcClient(final Calculator calculator) {
        this.calculator = calculator;
    }

    public void doSomethimgWithCalculator() {
        System.out.println(calculator.add(3,4));
    }
}
