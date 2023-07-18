package math;

public class Calculator {

    private  static final Calculator instance = new Calculator();
    private double memory = 0.0;

    public double getMemory() {
        return memory;
    }

    public void setMemory(final double memory) {
        this.memory = memory;
    }

    public static Calculator getInstance() {
        return instance;
    }

    private Calculator() {
    }

    public void add(double value) {
        memory += value;
    }

    public void sub(double value) {
        memory -= value;
    }
    public void mult(double value) {
        memory *= value;
    }
    public void div(double value) {
        memory /= value;
    }

    public void print() {
        System.out.println(memory);
    }

    public void clear() {
        memory = 0;
    }
}
