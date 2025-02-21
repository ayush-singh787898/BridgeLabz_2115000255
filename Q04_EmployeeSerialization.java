import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary);
    }
}

public class Q04_EmployeeSerialization {
    private static final String FILE_NAME = "ser.txt";

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ayush", "IT", 75000));
        employees.add(new Employee(2, "Krishna", "HR", 65000));
        employees.add(new Employee(3, "Kanishk", "Finance", 80000));

        serializeEmployees(employees);

        List<Employee> deserializedEmployees = deserializeEmployees();

        if (deserializedEmployees != null) {
            System.out.println("\nDeserialized Employees:");
            for (Employee emp : deserializedEmployees) {
                emp.display();
            }
        }
    }

    private static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(employees);
            System.out.println("Employees have been serialized and saved to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }
    }

    private static List<Employee> deserializeEmployees() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Employee>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
            return null;
        }
    }
}
