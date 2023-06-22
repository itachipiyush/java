/*
Write a program to demonstrate the concept of interface
when two interfaces have unique methods and same data members
 */
interface Shape {
    double PI = 3.14159;

    void draw();
}

interface Area {
    double calculateArea();
}

class Circle implements Shape, Area {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a circle");
    }

    public double calculateArea() {
        return PI * radius * radius;
    }
}

public class p12piyu {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.draw();
        System.out.println("Area of the circle: " + circle.calculateArea());
    }
}
