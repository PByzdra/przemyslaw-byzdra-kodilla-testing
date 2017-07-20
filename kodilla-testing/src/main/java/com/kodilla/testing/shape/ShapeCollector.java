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
    public String showFigures(){
        StringBuilder figures = new StringBuilder();
         for(Shape figure: shapes) {
             figures.append(figure);
         }
        System.out.println(figures.toString());
         return figures.toString();
    }

}

