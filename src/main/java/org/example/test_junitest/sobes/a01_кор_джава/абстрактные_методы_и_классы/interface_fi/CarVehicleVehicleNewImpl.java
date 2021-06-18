package org.example.test_junitest.sobes.a01_кор_джава.абстрактные_методы_и_классы.interface_fi;

public class CarVehicleVehicleNewImpl implements Vehicle,VehicleNew {
    // в интерфейсах не неможет быть одинаковых с сигнатурой метода
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
    public void getBand(String ss) {

    }

    @Override
    public void speedUp(String ss) {

    }

    @Override
    public void speedDown(String ss) {

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

    @Override
    public String turnAlarmOn() {
        System.out.println("только переопревеление дефаулт методы ");
        return "только переопревеление дефаулт методы ";
    }

    public static void main(String[] args) {
        CarVehicleVehicleNewImpl car = new CarVehicleVehicleNewImpl();
        car.getBand();
        car.speedUp();
        car.speedDown();
        car.turnAlarmOn();
        car.turnAlarmOff();
    }
}

