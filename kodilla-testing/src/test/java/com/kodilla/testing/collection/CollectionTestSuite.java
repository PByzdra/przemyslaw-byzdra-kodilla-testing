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
        ArrayList<Integer> resultList = collection.exterminate(mainList);
        Integer result = resultList.size();
        System.out.println("Collection size = " + result);
        for (Integer display : resultList) {
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

        List<Integer> comparatorList = new ArrayList<>();
        comparatorList.add(14);
        comparatorList.add(6);
        comparatorList.add(3);
        comparatorList.add(5);

        //When
        ArrayList<Integer> resultList = collection.exterminate(mainList);
        resultList.add(3); //dodane do kolekcji po metodzie exterminate
        resultList.add(5); //dodane do kolekcji po metodzie exterminate

        //Then
        Assert.assertEquals(resultList, comparatorList);
     }
}
