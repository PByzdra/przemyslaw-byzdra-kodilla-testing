package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
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
        ArrayList<ShapeCollector> collection = new ArrayList<>();
        ShapeCollector circle = new ShapeCollector();
        ShapeCollector square = new ShapeCollector();
        ShapeCollector triangle = new ShapeCollector();

       //When

        circle.addFigure(new Circle()) ;
        collection.add(1,circle);

        square.addFigure(new Square()) ;
        collection.add(1,circle);

        triangle.addFigure(new Triangle()) ;
        collection.add(1,circle);

    }


}
