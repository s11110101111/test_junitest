package org.example.test_junitest.sobes.a01_кор_джава.абстрактные_методы_и_классы;

public interface MyInterface <T>  {
    //они будут public static final
    static String availableStaticInInterface = "дооступна Статическая переменная  в интерфейсе";
    String availableOnlyInInterface = "Переменная интерфейса доступна";
        MyAbstractClass my = null;
    public void interfaceMethod() throws Exception;

    default void defInterfaceMethod(MyAbstractClass me) throws Exception{
        me.defaultMethod();
        me.myAbstractMethod();
        System.out.println(me.publicName +"||"+ me.defaultName);

        System.out.println("Вызов мектода поумолчанию в интерфейсе MyInterface. " + availableOnlyInInterface);
    }
}
