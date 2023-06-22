/*
    Name- Piyush kumar jha
    Enroll- 05050402021
    Ques-Write a program to use super() to invoke base class constructor.
 */
class reptile {
    private String name;

    public reptile(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class turtle extends reptile {
    private int age;

    public turtle(String name, int age) {
        super(name);
        this.age = age;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Age: " + age);
    }
}

public class p8piyu {
    public static void main(String[] args) {
        turtle t = new turtle("tora", 50);
        t.displayInfo();
    }
}
