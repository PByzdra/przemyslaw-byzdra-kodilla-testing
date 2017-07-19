package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector  {
    private List<Shape> shapes = new ArrayList<>();


    public void  addFigure(Shape shape){
         this.shapes.add(shape);

    }
    public void removeFigure(Shape shape){
        this.shapes.remove(shape);

    }
    public Shape getFigure(int n){
        return this.shapes.get(n);
    }
    public Shape showFigures(){
         for(Shape figure: shapes) {
             System.out.println("Name of figure: " + figure.getFigureName() + " Figure area: " + figure.getField());
         }
        return null;
    }
}

