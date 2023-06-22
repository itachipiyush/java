/*
    Name- Piyush kumar jha
    Enroll- 05050402021
    Ques-Write a program to demonstrate the use of static variable, static method and static block
 */
class Static {
    static int count = 0;
    static {
        System.out.println("Static block executed");
    }
    static void incrementCount() {
        count++;
    }
    static void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class p5piyu {
    public static void main(String[] args) {
        System.out.println("Initial count: " + Static.count);
        Static.incrementCount();
        System.out.println("Count after increment: " + Static.count);
        Static.displayCount();
    }
}
