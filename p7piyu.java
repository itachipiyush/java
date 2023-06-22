/*
    Name- Piyush kumar jha
    Enroll- 05050402021
    Ques-Write a program to demonstrate multi-level and hierarchical inheritance.
 */
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Labrador extends Dog {
    void run() {
        System.out.println("Labrador is running");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class p7piyu {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat();
        labrador.bark();
        labrador.run();
        System.out.println();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}
