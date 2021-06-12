package org.example.test_junitest.sobes.patterns.singletons;

import org.apache.commons.logging.Log;

public class MeSingleton {
    //публичная статическая переменная и приватный конструктор
    public static  final MeSingleton singleton = new MeSingleton();
public  void doSomeThing(){
    System.out.println("Самый простой синглтон - "+ getClass());
}
    private MeSingleton() {
        {
            System.out.println("init simple singlton");

        }
    }
}
