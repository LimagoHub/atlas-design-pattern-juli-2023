package de.math;

public class CalculatorSecure implements Calculator{

    private final Calculator calculator;

    CalculatorSecure(final Calculator calculator) {
        this.calculator = calculator;
    }

    public double add(final double a, final double b) {
        System.out.println("Du kommst rein");
        return calculator.add(a, b);
    }

    public double sub(final double a, final double b) {
        return calculator.sub(a, b);
    }
}
