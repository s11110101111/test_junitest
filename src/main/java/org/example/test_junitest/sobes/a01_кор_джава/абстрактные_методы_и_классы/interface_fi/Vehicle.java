package org.example.test_junitest.sobes.a01_кор_джава.абстрактные_методы_и_классы.interface_fi;

public interface Vehicle {
    String getBand();
    String speedUp();
    String speedDown();

    default String turnAlarmOn(){
        System.out.println("alarm turn on");
        return"alarm turn on";
    }
    default String turnAlarmOff(){
        System.out.println("alarm turn off");
        return "alarm turn off";
    }


}
