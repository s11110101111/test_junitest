package org.example.test_junitest.sobes.singletons;

public class Singleton5SynchronizedMethod_Junior {
    private  static Singleton5SynchronizedMethod_Junior singleton;

    public Singleton5SynchronizedMethod_Junior() {
    }
    public  synchronized Singleton5SynchronizedMethod_Junior getInstance(){
        if (singleton==null) {
            singleton = new Singleton5SynchronizedMethod_Junior();
        }
        return  singleton;
    }
}
