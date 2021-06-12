package org.example.test_junitest.sobes.patterns.strategy;

public class SecondStrategy implements Strategy{
    @Override
    public String execute(Integer a, Integer b) {
        System.out.println("Second strategy - !!!!" + a + "&&&&" + b);

        return "Ok second!";

    }
}
