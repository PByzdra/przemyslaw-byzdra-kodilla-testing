package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;


public class TestingMain {
    public static void main(String[] args) {
//        SimpleUser simpleUser = new SimpleUser("theForumUser");
//
//        String result = simpleUser.getUsername();
//
//       if(result.equals("theForumUser")) {
//           System.out.println("test OK");
//       } else {
//           System.out.println("Error!");
//       }

        Calculator calculator = new Calculator();
        int adding = calculator.add(2,2);
        int substracting = calculator.sub(2,2);
       if((adding == 4) && (substracting == 0)) {
           System.out.println("Calculator test ok");
       } else {
           System.out.println("Calculator test failed");
       }
    }
}