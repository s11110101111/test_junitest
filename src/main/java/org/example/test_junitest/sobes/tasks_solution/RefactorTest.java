package org.example.test_junitest.sobes.tasks_solution;


import java.util.function.Consumer;


public class RefactorTest {
    public void someMethod() {
        operate(refCreator -> refCreator.printHistoricalRef());


    }

    public void someElseMethod() {
        operate(refCreator -> refCreator.printOperativeRef());
    }

    static class RefCreator {
        static void printOperativeRef() {
            System.out.println("operative ref");
        }

        static void printHistoricalRef() {
            System.out.println("historical ref");
        }
    }
    public  static void operate(Consumer<RefCreator> action) {
        RefCreator t = null;
        System.out.println("do Some usual");
        System.out.println("do Some usual1");
       action.accept(t);
        System.out.println("do Some usual2");
        System.out.println("do Some usual3");

    }
    public static void main(String[] args) {
        RefactorTest refactorTest = new RefactorTest();
        refactorTest.someMethod();
        refactorTest.someElseMethod();
    }
}

