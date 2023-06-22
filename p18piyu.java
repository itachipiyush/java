/*
Write a program to use Byte stream class to read from a text file and display the content on the output screen.
 */
import java.io.FileInputStream;
import java.io.IOException;

public class p18piyu {
    public static void main(String[] args) {
        String filePath = "C:/Users/HP/Desktop/hehe.txt";

        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
