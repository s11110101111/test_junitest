package org.example.test_junitest.sobes.a01_кор_джава.абстрактные_методы_и_классы;

public interface MyInterface  {
    //они будут public static final
    static String availableStaticInInterface = "дооступна Статическая переменная  в интерфейсе";
    String availableOnlyInInterface = "Переменная интерфейса доступна";

    public void interfaceMethod() throws Exception;

    default void defInterfaceMethod() throws Exception{
        System.out.println("Вызов мектода поумолчанию в интерфейсе MyInterface. " + availableOnlyInInterface);
    }
}
