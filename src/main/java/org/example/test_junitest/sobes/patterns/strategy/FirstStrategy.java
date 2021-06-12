package org.example.test_junitest.sobes.patterns.strategy;

public class FirstStrategy implements Strategy {

    @Override
    public String execute(Integer a, Integer b) {
        System.out.println("First strategy - " + a + "&&&&" + b);

        return "Ok first!";
    }
}
