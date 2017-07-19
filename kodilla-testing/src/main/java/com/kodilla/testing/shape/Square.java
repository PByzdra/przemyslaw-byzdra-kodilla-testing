package com.kodilla.testing.shape;


public class Square implements Shape {

    private String name;
    private double a;
    private double b;

    public Square(String name, double a, double b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    @Override

    public String getFigureName() {
        return this.name;
    }

    @Override
    public double getField()
    {
        return a * b;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
