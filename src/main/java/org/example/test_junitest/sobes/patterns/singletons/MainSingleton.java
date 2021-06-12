package org.example.test_junitest.sobes.patterns.singletons;

public class MainSingleton {


    public static void main(String[] args) {
        System.out.println("0 easy");
        Singleton0Easy single0 = Singleton0Easy.getInstance() ;//только через статисеский метод
        System.out.println(single0);
       //не можем создавать через NEW
      //  Singleton0Easy single00 = new Singleton0Easy();

        System.out.println("+++++++++++++++++++++");
        System.out.println("самый простой");
        MeSingleton singleton = MeSingleton.singleton ; // из статической переменной
        singleton.doSomeThing();
        System.out.println(singleton);
        MeSingleton single = MeSingleton.singleton;
        System.out.println(singleton == single);
        System.out.println("+++++++++++++++++++++");
        Singleton2Enum.INSTANCE.doWork();
        ИзПеречисления.ОБРАЗ.сделайЧтонибудь();
        System.out.println(ИзПеречисления.ОБРАЗ.name());
        System.out.println(ИзПеречисления.values());
        System.out.println(ИзПеречисления.ОБРАЗ.ordinal());
        System.out.println(ИзПеречисления.valueOf("ОБРАЗ") == ИзПеречисления.ОБРАЗ);

    }

}
