package org.example.test_junitest.sobes.interface_fi;

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
