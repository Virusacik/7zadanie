// Implement the Employee class
public class Employee implements Person {
    private String employeeID;
    private String name;
    private String surname;
    private int age;

    // Constructor
    public Employee(String employeeID, String name, String surname, int age) {
        this.employeeID = employeeID;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Implement the getInfo method
    @Override
    public String getInfo() {
        return "Employee ID: " + employeeID + ", Name: " + name + " " + surname + ", Age: " + age;
    }
}
