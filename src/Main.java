// Main class to demonstrate the functionality
public class Main {
    public static void main(String[] args) {
        // Create instances of Student and Employee
        Person student = new Student("S123", "John", "Doe", 20);
        Person employee = new Employee("E456", "Jane", "Smith", 30);

        // Call the printInfo method to display information
        printInfo(student);
        printInfo(employee);
    }

    // Method to print info of a Person
    public static void printInfo(Person person) {
        System.out.println(person.getInfo());
    }
}
