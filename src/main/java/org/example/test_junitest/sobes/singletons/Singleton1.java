package org.example.test_junitest.sobes.singletons;

public class Singleton1 {
    private static Singleton1 singleton;
    private Singleton1(){

    }
private static Singleton1 getInstance(){
        if (singleton==null){
            singleton= new Singleton1();
        }
        return singleton;
}

}
