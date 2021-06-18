package org.example.test_junitest.sobes.a41_паттерны_шаблоны.patterns.strategy;

public class MainContext {
    Strategy strategy;

    public String executeStrategy(Integer a, Integer b){
        return strategy.execute(a,b);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
