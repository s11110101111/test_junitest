package org.example.test_junitest.sobes.sobec_example;

import java.util.Arrays;

public abstract class AbstractClassText {
    static int numObject;

    void initClass() {
        // Реализация метода
    }

    ;

    abstract String getString(); //абстрактный метод без реализации

    Object o = new Object();
    Class aClass;

    static {
        int numObject = 0;
    }

    {
        Class aClass = o.getClass();
    }

    AbstractClassText(Object o1) {
        numObject++;
        o = o1;
        // конструктор
    }

}

class YoMaYo extends AbstractClassText {
    Class a = super.aClass;

    @Override
    String getString() {
        return "реализазия метода абстрактного класса";
    }

    YoMaYo(Object o1) {
        super(o1);
    }
}
