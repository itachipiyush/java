/*
    Name- Piyush kumar jha
    Enroll- 05050402021
    Ques-Write a program to demonstrate use of method overloading to calculate area of square,
     rectangle and triangle
 */
class p3piyu {
    public double calculateArea(double side) {
        return side * side;
    }

    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    public double calculateArea(int base, int height) {
        return 0.5 * base * height;
    }
    public static void main(String[] args) {
        p3piyu calculator = new p3piyu();

        double squareArea = calculator.calculateArea(5.0);
        System.out.println("Area of square: " + squareArea);

        double rectangleArea = calculator.calculateArea(4.0, 6.0);
        System.out.println("Area of rectangle: " + rectangleArea);

        double triangleArea = calculator.calculateArea(3, 8);
        System.out.println("Area of triangle: " + triangleArea);
    }
}
