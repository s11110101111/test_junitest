package org.example.test_junitest.sobes.a01_кор_джава.модификаторы_доступа;

public class Dog {
    static class StaticInnerPuppy {

    }
    class InnerPuppy{

    }
    public InnerPuppy getInnerPuppy(){
        InnerPuppy puppy = new InnerPuppy();
        return puppy;
    }
}
