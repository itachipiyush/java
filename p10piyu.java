/*
    Name- Piyush kumar jha
    Enroll- 05050402021
    Ques-Write a program to demonstrate the concept of aggregation.
 */
class Address {
    private String street;
    private String city;
    private String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}

class Emp {
    private String name;
    private Address address;

    public Emp(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

public class p10piyu {
    public static void main(String[] args) {
        Address address = new Address("123 main", "Delhi", "State");
        Emp employee = new Emp("Piyush", address);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Address: " + employee.getAddress().getStreet() + ", " +
                employee.getAddress().getCity() + ", " + employee.getAddress().getState());
    }
}
