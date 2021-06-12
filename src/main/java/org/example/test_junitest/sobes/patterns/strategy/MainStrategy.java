package org.example.test_junitest.sobes.patterns.strategy;

public class MainStrategy {



    public static void main(String[] args) {
Integer f16 = 123;
Integer f17 = 321;
       MainContext context = new MainContext();
       context.setStrategy(new AnyStrategy());
        System.out.println(context.executeStrategy(f16,f17));
        context.setStrategy(new FirstStrategy());
        System.out.println(context.executeStrategy(f16,f17));
        context.setStrategy(new AnyStrategy());
        System.out.println(context.executeStrategy(f16,f17));
    }
}
