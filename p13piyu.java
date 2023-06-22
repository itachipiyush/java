/*
Write a program to demonstrate checked exception during file handling.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class p13piyu {
    public static void main(String[] args) {
        try {
            File file = new File("this_file.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
