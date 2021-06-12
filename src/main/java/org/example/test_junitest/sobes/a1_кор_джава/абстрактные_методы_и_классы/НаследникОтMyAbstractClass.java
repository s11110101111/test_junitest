package org.example.test_junitest.sobes.a1_кор_джава.абстрактные_методы_и_классы;

public class НаследникОтMyAbstractClass extends MyAbstractClass{
    @Override
    void myAbstractMethod() {
        super.defaultMethod();
        System.out.println("вызов Реализации абстрактного метода родитея в НаследникОтMyAbstractClass" );
    }
}
