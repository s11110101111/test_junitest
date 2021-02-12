package org.example.test_junitest.sobes.singletons;

public class Singleton0Easy {
    private static Singleton0Easy singleton = new Singleton0Easy();

    public  static Singleton0Easy getInstance(){
        return singleton;
    }

    public Singleton0Easy() {
    }
}
