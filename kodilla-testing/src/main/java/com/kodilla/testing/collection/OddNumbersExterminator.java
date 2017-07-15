package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public void exterminate(ArrayList<Integer> numbers){ //czy metoda exterminate ma być void, czy powinna coś zwracać?
        ArrayList<Integer> mainList = new ArrayList<>();
        Random theGenerator = new Random();
            for(int n=0; n < 50; n++){
            mainList.add(theGenerator.nextInt(100));
            }
//        int temporaryValue = 0;                               // tu jest mechanizm, który tworzy nową kolekcję parzystych
//        ArrayList<Integer> evenList = new ArrayList<>();
//        for (int n = 0; n < numbers.size(); n++) {
//            temporaryValue = numbers.get(n);
//            if (temporaryValue % 2 == 0) {
//                evenList.add(temporaryValue);
//            }
    }
  //    }
}