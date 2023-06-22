/*
Write a program to demonstrate unchecked exception
 */
public class p14piyu {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int index = 10;

        try {
            int result = numbers[index];
            System.out.println("The result is: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        }
    }
}
