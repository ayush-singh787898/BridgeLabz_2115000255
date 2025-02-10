






import java.util.*;

// Interface for department-related operations
interface Department {
    void assignDepartment(String department);
    String getDepartmentDetails();
}

// Abstract class Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method for salary calculation
    abstract double calculateSalary();

    // Display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Final Salary: " + calculateSalary());
    }
}

// Full-Time Employee class
class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double fixedSalary;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    @Override
    double calculateSalary() {
        return getBaseSalary() + fixedSalary;
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Part-Time Employee class
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return getBaseSalary() + (workHours * hourlyRate);
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Main class for user interaction
public class Q01_Employee_Management_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("Enter Employee ID: ");
            int employeeId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Base Salary: ");
            double baseSalary = scanner.nextDouble();

            System.out.print("Enter Employee Type (1 for Full-Time, 2 for Part-Time): ");
            int type = scanner.nextInt();

            if (type == 1) {
                System.out.print("Enter Fixed Salary: ");
                double fixedSalary = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter Department: ");
                String department = scanner.nextLine();

                FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(employeeId, name, baseSalary, fixedSalary);
                fullTimeEmployee.assignDepartment(department);
                employees.add(fullTimeEmployee);
            } else if (type == 2) {
                System.out.print("Enter Work Hours: ");
                int workHours = scanner.nextInt();
                System.out.print("Enter Hourly Rate: ");
                double hourlyRate = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter Department: ");
                String department = scanner.nextLine();

                PartTimeEmployee partTimeEmployee = new PartTimeEmployee(employeeId, name, baseSalary, workHours, hourlyRate);
                partTimeEmployee.assignDepartment(department);
                employees.add(partTimeEmployee);
            } else {
                System.out.println("Invalid employee type! Skipping this entry.");
            }
        }

        // Display employee details using polymorphism
        System.out.println("\n--- Employee Details ---");
        for (Employee emp : employees) {
            emp.displayDetails();
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
            System.out.println(" ");
        }

        scanner.close();
    }
}
