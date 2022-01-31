package org.example.test_junitest.sobes.a01_кор_джава.модификаторы_доступа;



public class MyApp {

    public static void main(String... args){
Dog.StaticInnerPuppy puppy = new Dog.StaticInnerPuppy();
Dog dog = new Dog();
        Dog.InnerPuppy innerPuppy = dog.getInnerPuppy();

    }

    public void getInnerPuppy(){
        Dog.InnerPuppy puppy = new Dog().getInnerPuppy();
    }
}
