package org.example.test_junitest.sobes.interface_fi;

public class Car implements Vehicle{
    @Override
    public String getBand() {

        System.out.println("The car is BMW");
        return null;
    }

    @Override
    public String speedUp() {
        System.out.println("The car speed up");
        return null;
    }

    @Override
    public String turnAlarmOff() {
        System.out.println("Alarm is error");
        return "Alarm is error";
    }

    @Override
    public String speedDown() {
        System.out.println("The car speed down");
        return null;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.getBand();
        car.speedUp();
        car.speedDown();
        car.turnAlarmOn();
        car.turnAlarmOff();
    }
}

