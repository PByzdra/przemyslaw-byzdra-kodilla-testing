package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//        System.out.println("Calculating expressions with method references");
//
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

//Exercise 7.1 Poem Beautifier:

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("This is sample text", verse -> verse.toUpperCase());
        poemBeautifier.beautify("This is sample text", verse -> ("*** " + verse + " ***"));
        poemBeautifier.beautify("This is sample text", verse -> verse.replace('s', 'S'));
        poemBeautifier.beautify("This is sample text", verse -> verse.substring(8));//
//Stream iterator
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }

}