package org.example.test_junitest.sobes.a1_кор_джава.абстрактные_методы_и_классы;

public interface MyInterfaceWithOnlyDefaultMethod {
    default String defaulMethod(){
        return "сделаем чтото подефолту";
    }

    default String defaulMethodTwo(){
        return "сделаем чтото подефолту Two";
    }
}
