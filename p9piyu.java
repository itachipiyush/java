/*
    Name- Piyush kumar jha
    Enroll- 05050402021
    Ques-Write a program to demonstrate run-time polymorphism.
 */
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class p9piyu{
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Circle();
        Shape shape3 = new Rectangle();

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
