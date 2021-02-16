package org.example.test_junitest.sobes.patterns.singletons;

public class Singleton1Lazy {
    private static Singleton1Lazy singleton;
   // ленивый создавался в момет вылзова конструктора загрузки класс ане в момент обращения к методу
    private Singleton1Lazy(){

    }
private static Singleton1Lazy getInstance(){
        if (singleton==null){
            singleton= new Singleton1Lazy();
        }
        return singleton;
}

}
