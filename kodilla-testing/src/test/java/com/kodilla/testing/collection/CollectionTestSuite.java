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
        int range = 1;                                          // zakres losowanych liczb
        ArrayList<Integer> mainList = new ArrayList<>();
        Random theGenerator = new Random();
            for(int n=0; n < 20; n++){
            mainList.add(theGenerator.nextInt(range)+1);
            }
        OddNumbersExterminator collection = new OddNumbersExterminator();
          ArrayList<Integer> newList = collection.exterminate(mainList);

        //When
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
        int range = 10;                                          // zakres losowanych liczb
        ArrayList<Integer> mainList = new ArrayList<>();
        Random theGenerator = new Random();
        for(int n=0; n < 20; n++){
            mainList.add(theGenerator.nextInt(range)+1);
        }
        OddNumbersExterminator collection = new OddNumbersExterminator();
        collection.exterminate(mainList);

        //When
        Integer result = mainList.size();
        ArrayList<Integer> oddList = new ArrayList<>();
        System.out.println("Collection size = " + result);
        for (Integer n=0; n < result; n++ ) {
            Integer calculate = mainList.get(n);
            System.out.println(n);
            Integer rest =  calculate % 2;
            if(rest != 0) {
                oddList.add(n);
            }
        }
        //Then
        Assert.assertFalse(oddList.size() == 0);
        System.out.println("Your method doesn't work. There are odd numbers in your collection!!!");
     }
}
