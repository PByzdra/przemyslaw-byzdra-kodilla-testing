package com.kodilla.testing.shape;


public class Square implements Shape {
    @Override
    public String getFigureName() {
        return "Square";
    }

    @Override
    public double getField() {
        return 100;
    }
}
