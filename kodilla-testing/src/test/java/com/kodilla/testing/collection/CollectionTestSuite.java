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
        OddNumbersExterminator emptyList = new OddNumbersExterminator();
        emptyList.exterminate(null);

        //When
        ArrayList<Integer> mainList = new ArrayList<>();
        Integer result = mainList.size();
        System.out.println("Collection size = " + result);
        //Then
        Integer n = 0;
        Assert.assertEquals(n, result);
        System.out.println("Your collection is empty!");
        }
   /* @Test
     public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
         {

        oddNumbers.exterminate(); // jak przekazać kolekcję evenList z OddNumbersExterminator()  do tej metody?

        //When
        ArrayList<Integer> evenList = new ArrayList<>();
        //;
        //Then
        //Assert.assertEquals();
     } */
}
