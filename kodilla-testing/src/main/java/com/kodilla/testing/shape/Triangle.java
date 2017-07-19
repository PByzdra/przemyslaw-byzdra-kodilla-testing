package com.kodilla.testing.shape;


public class Triangle implements Shape {
    private String name;
    private double a;
    private double h;

    public Triangle(String name, double a, double h) {
        this.name = name;
        this.a = a;
        this.h = h;
    }

    @Override
    public String getFigureName() {
        return this.name;
    }

    @Override
    public double getField() {
        return 0.5*a*h;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", a=" + a +
                ", h=" + h +
                '}';
    }
}

