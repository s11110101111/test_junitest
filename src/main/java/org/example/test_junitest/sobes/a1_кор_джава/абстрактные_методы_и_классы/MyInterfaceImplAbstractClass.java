package org.example.test_junitest.sobes.a1_кор_джава.абстрактные_методы_и_классы;

public abstract class MyInterfaceImplAbstractClass implements MyInterface {
  //не требует переопреления методов интерфейса но потом при
    // при наследовании вспомнит

    void MethodInAbstractImplClass(){
        System.out.println("вызов обычного метода  абстактного класса импл мой интерфейс");
    }

}
