package org.example.test_junitest.sobes.a01_кор_джава.абстрактные_методы_и_классы.interface_fi;

public interface VehicleNew {

    //void getBand(); не работает с Vehicle
    void getBand(String ss);
    void speedUp(String ss);
    void speedDown(String ss);

    default String turnAlarmOn(){
        System.out.println("New alarm turn on");
        return"New alarm turn on";
    }
    default String turnAlarmOff(){
        System.out.println("New alarm turn off");
        return "New alarm turn off";
    }


}
