package org.example.test_junitest.sobes.a01_кор_джава.абстрактные_методы_и_классы;

public class НаследникОтАбстрактногКлассасИнтерфейсом extends MyInterfaceImplAbstractClass{

    //требует переопределния методов интерфейса абстрактного класса


    @Override
    public void interfaceMethod() throws Exception {
        System.out.println("Вызов переопределнного метора родителя в НаследникОт...");
    }

    @Override
    public void defInterfaceMethod(MyAbstractClass myAbstractClass) throws Exception {
        super.defInterfaceMethod(myAbstractClass);
        System.out.println("Вызов super.метода по умолчанию метода родителя в НаследникОт...");
    }
}
