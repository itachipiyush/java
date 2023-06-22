/*
    Name- Piyush kumar jha
    Enroll- 05050402021
    Ques-Write a Java program to perform basic Calculator operations.
    Make a menu driven program to select operation to perform (+ - * / ).
    Take 2 integers and perform operation as chosen by user
 */
import java.util.Scanner;

public class p1piyu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + multiply(num1, num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Result: " + divide(num1, num2));
                        } else {
                            System.out.println("Error: Cannot divide by zero!");
                        }
                        break;
                }
                System.out.println();
            } else if (choice != 0) {
                System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        System.out.println("Exiting calculator...");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }
}
