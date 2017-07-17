package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int n = 0; n < numbers.size(); n++) {
            int temporaryValue = numbers.get(n);
            if (temporaryValue % 2 == 0) {
                evenList.add(temporaryValue);
            }
        }
        return evenList;
    }
}