/*
    Name- Piyush kumar jha
    Enroll- 05050402021
    Ques-Write a program to demonstrate concept of ``this``.
 */
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class p6piyu {
    public static void main(String[] args) {
        Employee employee = new Employee("Piyush", 19);
        employee.displayDetails();
    }
}
