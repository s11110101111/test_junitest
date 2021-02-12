package org.example.test_junitest.sobes.singletons;

public class Singleton3Synchronize {
    private static  Singleton3Synchronize singleton;
//две проверки  на созданиеи  синхрон по классу
    public Singleton3Synchronize() {
    }
    public static Singleton3Synchronize getInstance(){
        if(singleton==null){
            synchronized (Singleton3Synchronize.class){
                if (singleton==null) {
                    singleton = new Singleton3Synchronize();
                }
            }

        }
        return  singleton;
    }

}
