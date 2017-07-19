package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testAddFigure() {
        //Given
        //ArrayList<Shape> collection = new ArrayList<>(); //czy tego potrzebujemy??? Czy obiekt shapeCollector nie robi tego samego?

        Shape circle = new Circle("Circle-1", 5);
        Shape square = new Square("Square-1", 5, 10);
        Shape triangle = new Triangle("Triangle-1", 5, 10);
//        collection.add(circle); // to chyba tez nie jest potrzebne? Tak jak wyzej, shapeCollector zrobi to samo??
//        collection.add(square);
//        collection.add(triangle);

        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);


        //Then
        Assert.assertEquals(triangle, shapeCollector.getFigure(2));
    }

    @Test
    public void removeAddFigure() {
        //Given
       // ArrayList<Shape> collection = new ArrayList<>();

        Shape circle = new Circle("Circle-1", 5);
        Shape square = new Square("Square-1", 5, 10);
        Shape triangle = new Triangle("Triangle-1", 5, 10);
//        collection.add(circle);
//        collection.add(square);
//        collection.add(triangle);

        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(circle); //#0 in collection
        shapeCollector.addFigure(square); //#1 in collection
        shapeCollector.addFigure(triangle);

        //When
        shapeCollector.removeFigure(square);
        
        //Then
        Assert.assertNotEquals(square, shapeCollector.getFigure(1));
        
    }

    @Test
    public void getFigure()  {
        //Given

        Shape circle = new Circle("Circle-1", 5);
        Shape square = new Square("Square-1", 5, 10);
        Shape triangle = new Triangle("Triangle-1", 5, 10);
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(circle); //#0 in collection
        shapeCollector.addFigure(square); //#1 in collection
        shapeCollector.addFigure(triangle); //#2 in collection

        //When

        shapeCollector.getFigure(1);

        //Then

        Assert.assertEquals(square, shapeCollector.getFigure(1) );
    }

    @Test
    public void showFigures() {
        //Given

        Shape circle = new Circle("Circle-1", 5);
        Shape square = new Square("Square-1", 5, 10);
        Shape triangle = new Triangle("Triangle-1", 5, 10);
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(circle); //#0 in collection
        shapeCollector.addFigure(square); //#1 in collection
        shapeCollector.addFigure(triangle); //#2 in collection

        //When

        shapeCollector.showFigures();

        //Then

        //Assert??????????

    }
}




