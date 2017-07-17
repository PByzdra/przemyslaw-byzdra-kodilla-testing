package com.kodilla.testing.collection;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

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
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> mainList = new ArrayList<>();
            mainList.add(1);
            mainList.add(7);
            // mainList.add(14); wykomentowane w celach testowych
            // mainList.add(6);
            mainList.add(23);
            mainList.add(9);
        OddNumbersExterminator collection = new OddNumbersExterminator();

        //When
        ArrayList<Integer> newList = collection.exterminate(mainList);
        Integer result = newList.size();
        System.out.println("Collection size = " + result);
        for (Integer display : newList) {
            System.out.println(display);
        }
        //Then
        Assert.assertTrue(result == 0);
        System.out.println("Your collection is empty!");
        }

    @Test
     public void testOddNumbersExterminatorNormalList(){
        //Given
          ArrayList<Integer> mainList = new ArrayList<>();
            mainList.add(1);
            mainList.add(7);
            mainList.add(14);
            mainList.add(6);
            mainList.add(23);
            mainList.add(9);
        OddNumbersExterminator collection = new OddNumbersExterminator();

        //When
        ArrayList<Integer> newList = collection.exterminate(mainList);
        newList.add(3); //dodane do kolekcji po metodzie exterminate
        newList.add(5); //dodane do kolekcji po metodzie exterminate
        Integer result = newList.size();
        ArrayList<Integer> oddList = new ArrayList<>();
        for (Integer n=0; n < result; n++ ) {
            Integer calculate = newList.get(n);
            Integer rest =  calculate % 2;
            if(rest != 0) {
            oddList.add(n);
            }
        }
        //Then
        Assert.assertFalse(oddList.size() == 0);
        System.out.println("Your method doesn't work. There are odd numbers in your collection!!!");
        System.out.println("Number of odd numbers in collection = " + oddList.size());
     }
}
