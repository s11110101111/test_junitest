package org.example.test_junitest.sobes.a1_кор_джава.абстрактные_методы_и_классы;

public class НаследникОтАбстрактногКлассасИнтерфейсом extends MyInterfaceImplAbstractClass{

    //требует переопределния методов интерфейса абстрактного класса
    @Override
    public void interfaceMethod() throws Exception {
        System.out.println("Вызов переопределнного метора родителя в НаследникОт...");
    }

    @Override
    public void defInterfaceMethod() throws Exception {
        super.defInterfaceMethod();
        System.out.println("Вызов super.метода по умолчанию метода родителя в НаследникОт...");
    }
}
