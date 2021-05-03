package org.example.test_junitest.sobes.inheritance;

public  abstract class NewAbstractClass implements InterfaceGrandA, InterfaceGrandB{

    public  void foo()  throws RuntimeException{
        System.out.println("abstract class here is not implements method but we can't change contract");
    }


}
