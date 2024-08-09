package java;

public interface Vehicle {

    String getBrand();

    String accelerate();

    String decelerate();

    default String turnOn() {
        return "on";
    }

    default String turnOff() {
        return "off";
    }
}