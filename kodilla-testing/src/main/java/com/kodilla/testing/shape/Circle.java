package com.kodilla.testing.shape;


public class Circle implements Shape {

    private String name;
    private double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getFigureName() {
        return this.name;
    }

    @Override
    public double getField() {
        return Math.PI * this.radius*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }
}

