package org.example.test_junitest.sobes.a41_паттерны_шаблоны.patterns.singletons;

public class Singleton4Volatile {
    private static volatile Singleton4Volatile singleton;
// это добавили тк оптимизация java удаляла 2 If )
    public Singleton4Volatile() {
    }

    public static Singleton4Volatile getInstance(){

        if (singleton==null) {
            synchronized (Singleton4Volatile.class){
                if (singleton==null) {
                    singleton = new Singleton4Volatile();
                }
            }
        }
        return singleton;
    }
}
