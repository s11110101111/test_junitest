package org.example.test_junitest.sobes.a01_кор_джава.абстрактные_методы_и_классы;

public class MainClassDefault {
    public static void main(String[] args) {
        //можем не переопредлять методы по умолчанию они будут доступны в классе
        MyInterfaceWithOnlyDefaultMethod oldClass = new MyInterfaceWithOnlyDefaultMethodImpl();
        System.out.println(oldClass.defaulMethod()+"\n"+ oldClass.defaulMethodTwo());
    }
}
