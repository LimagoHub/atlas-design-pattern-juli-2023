package main;

import de.client.CalcClient;
import de.math.Calculator;
import de.math.CalculatorFactory;


public class Main {
    public static void main(String[] args) {
        CalculatorFactory.setSecured(false);
        CalculatorFactory.setLogger(true);
        Calculator calculator = CalculatorFactory.createInstance();
        CalcClient client = new CalcClient(calculator);
        client.doSomethimgWithCalculator();
    }
}