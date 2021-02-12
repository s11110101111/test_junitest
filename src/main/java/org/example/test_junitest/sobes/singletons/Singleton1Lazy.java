package org.example.test_junitest.sobes.singletons;

public class Singleton1Lazy {
    private static Singleton1Lazy singleton;
    private Singleton1Lazy(){

    }
private static Singleton1Lazy getInstance(){
        if (singleton==null){
            singleton= new Singleton1Lazy();
        }
        return singleton;
}

}
