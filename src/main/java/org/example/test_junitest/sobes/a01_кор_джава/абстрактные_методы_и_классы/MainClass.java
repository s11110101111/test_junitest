package org.example.test_junitest.sobes.a01_кор_джава.абстрактные_методы_и_классы;

public class MainClass {


    public static void main(String[] args) throws Exception {

        MyInterface myInterface = new НаследникОтАбстрактногКлассасИнтерфейсом();
        MyAbstractClass meA = new НаследникОтMyAbstractClass();
        meA.setPrivateName("Наследник абстракт для передачи в деф метор");

        myInterface.defInterfaceMethod(meA);
        myInterface.interfaceMethod();
        System.out.println("мы можем к ней обратиться - " + MyInterface.availableOnlyInInterface);
        System.out.println("мы можем к ней обратиться - " + MyInterface.availableStaticInInterface );
        //MyInterface.availableStaticInInterface= "нет утырки только не это";
        //MyInterface.availableOnlyInInterface= "нет утырки только не это";
        //больше ничего мы не видем
        НаследникОтАбстрактногКлассасИнтерфейсом myClass = (НаследникОтАбстрактногКлассасИнтерфейсом) myInterface;
        myClass.MethodInAbstractImplClass();
        //Посмотрим что есть в абстрактном классе
        НаследникОтMyAbstractClass myAbstractClass = new НаследникОтMyAbstractClass();
        myAbstractClass.setPrivateName("ЗУЛУ");
        String avialableParameters = "Что нам доступно - \n" + myAbstractClass.defaultName
                + "\n" + myAbstractClass.publicName+ "\n";
        System.out.println(avialableParameters);
        myAbstractClass.myAbstractMethod();

    }

}
