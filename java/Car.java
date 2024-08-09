package java;

public class Car implements Vehicle {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String accelerate() {
        return "Speeding up";
    }

    @Override
    public String decelerate() {
        return "Slowing down";
    }

    public static void main(String[] args) {
        Car car = new Car("Ford");
        System.out.println(car.getBrand());
        System.out.println(car.accelerate());
        System.out.println(car.decelerate());
        System.out.println(car.turnOn());
        System.out.println(car.turnOff());
    }
}