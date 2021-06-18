package org.example.test_junitest.sobes.a41_паттерны_шаблоны.patterns.strategy;

public class AnyStrategy implements Strategy{
    @Override
    public String execute(Integer a, Integer b) {
        System.out.println("Any strategy - ####" + a + "&&&&" + b);

        return "Ok any!";
    }
}
