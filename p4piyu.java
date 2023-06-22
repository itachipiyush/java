/*
    Name- Piyush kumar jha
    Enroll- 05050402021
    Ques-Create a class employee which have name, age and address of employee,
    include methods getdata() and showdata(), getdata() takes the input from the user,
    showdata() display the data in following format: Name: Age: Address:
 */
import java.util.Scanner;

class p4piyu {
    private String name;
    private int age;
    private String address;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter address: ");
        address = scanner.nextLine();
    }

    public void showData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
    public static void main(String[] args) {
        p4piyu employee = new p4piyu();
        employee.getData();
        System.out.println("\nEmployee Details:");
        employee.showData();
    }
}
