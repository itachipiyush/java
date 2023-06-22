/*
    Name- Piyush kumar jha
    Enroll- 05050402021
    Ques-Write a program to demonstrate the concept of abstract class with constructor and ``final`` method.
 */
abstract class Vehicle {
     String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public abstract void start();

    public final void stop() {
        System.out.println("Stopping the "+ model + " vehicle");
    }
}

class Car extends Vehicle {
    public Car(String model) {
        super(model);
    }

    public void start() {
        System.out.println("Starting the car: " + getModel());
    }

    public String getModel() {
        return super.model;
    }
}

class Bike extends Vehicle {
    public Bike(String model) {
        super(model);
    }

    public void start() {
        System.out.println("Starting the bike: " + getModel());
    }

    public String getModel() {
        return super.model;
    }
}

public class p11piyu {
    public static void main(String[] args) {
        Car car = new Car("Sedan");
        Bike bike = new Bike("Sports");

        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
}
