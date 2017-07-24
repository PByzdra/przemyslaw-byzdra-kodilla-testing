package com.kodilla.stream.beautifier;


public class PoemBeautifier {
    public void beautify(String verse, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(verse);
        System.out.println(result);

    }

}
