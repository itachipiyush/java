/*
Write a program to make use of BufferedStream to read lines from the keyboard until 'STOP' is typed
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p19piyu {
    public static void main(String[] args) {
        System.out.println("write starto: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while (true) {
                line = reader.readLine();
                if (line.equalsIgnoreCase("STOP")) {
                    break;
                }
                System.out.println("You entered: " + line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}
