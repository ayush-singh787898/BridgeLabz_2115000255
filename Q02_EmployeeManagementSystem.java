
import java.util.*;

class Employee {
    String name;
    int id;
    double salary;

    // Constructor to initialize common attributes
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Name of the Employee: " + name);
        System.out.println("ID of the Employee: " + id);
        System.out.println("Salary of the Employee: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    // Constructor to initialize Manager-specific attributes
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Override the displayDetails method for Manager
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team size of the Manager: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    // Constructor to initialize Developer-specific attributes
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Override the displayDetails method for Developer
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language known by Developer: " + programmingLanguage);
    }
}

class Intern extends Employee {
    // Constructor for Intern (no extra attributes)
    Intern(String name, int id, double salary) {
        super(name, id, salary);
    }

    // Override the displayDetails method for Intern
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Intern has no additional attributes.");
    }
}

public class Q02_EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for Employee
        System.out.println("Enter Employee Details:");
        System.out.print("Name: ");
        String empName = sc.nextLine();
        System.out.print("ID: ");
        int empId = sc.nextInt();
        System.out.print("Salary: ");
        double empSalary = sc.nextDouble();
        sc.nextLine(); // Consume newline

        Employee emp = new Employee(empName, empId, empSalary);
        System.out.println("\nEmployee Details:");
        emp.displayDetails();
        System.out.println();

        // Taking input for Manager
        System.out.println("Enter Manager Details:");
        System.out.print("Name: ");
        String mgrName = sc.nextLine();
        System.out.print("ID: ");
        int mgrId = sc.nextInt();
        System.out.print("Salary: ");
        double mgrSalary = sc.nextDouble();
        System.out.print("Team Size: ");
        int teamSize = sc.nextInt();
        sc.nextLine(); 

        Manager mgr = new Manager(mgrName, mgrId, mgrSalary, teamSize);
        System.out.println("\nManager Details:");
        mgr.displayDetails();
        System.out.println();

        // Taking input for Developer
        System.out.println("Enter Developer Details:");
        System.out.print("Name: ");
        String devName = sc.nextLine();
        System.out.print("ID: ");
        int devId = sc.nextInt();
        System.out.print("Salary: ");
        double devSalary = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Programming Language: ");
        String progLang = sc.nextLine();

        Developer dev = new Developer(devName, devId, devSalary, progLang);
        System.out.println("\nDeveloper Details:");
        dev.displayDetails();
        System.out.println();

        // Taking input for Intern
        System.out.println("Enter Intern Details:");
        System.out.print("Name: ");
        String internName = sc.nextLine();
        System.out.print("ID: ");
        int internId = sc.nextInt();
        System.out.print("Salary: ");
        double internSalary = sc.nextDouble();

        Intern intern = new Intern(internName, internId, internSalary);
        System.out.println("\nIntern Details:");
        intern.displayDetails();

        sc.close(); 
    }
}
