/*
    Name- Piyush kumar jha
    Enroll- 05050402021
    Ques-Write a program declaring a class Rectangle with data member’s length
    and breadth and member functions Input, Output and CalcArea.
 */
import java.util.Scanner;

class p2piyu {
    private double length;
    private double breadth;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = scanner.nextDouble();
    }

    public void output() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }

    public double calcArea() {
        return length * breadth;
    }
    public static void main(String[] args) {
        p2piyu rectangle = new p2piyu();
        rectangle.input();
        System.out.println("Rectangle details:");
        rectangle.output();
        System.out.println("Area: " + rectangle.calcArea());
    }
}
