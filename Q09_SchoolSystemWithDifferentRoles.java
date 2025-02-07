
import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayRole() {
        System.out.println("Role: Person");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String position;

    Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
    }
}

public class Q09_SchoolSystemWithDifferentRoles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Teacher Details");
        System.out.print("Name: ");
        String teacherName = sc.nextLine();
        System.out.print("Age: ");
        int teacherAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Subject: ");
        String teacherSubject = sc.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherAge, teacherSubject);
        teacher.displayRole();

        System.out.println("\nEnter Student Details");
        System.out.print("Name: ");
        String studentName = sc.nextLine();
        System.out.print("Age: ");
        int studentAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Grade: ");
        String studentGrade = sc.nextLine();
        Student student = new Student(studentName, studentAge, studentGrade);
        student.displayRole();

        System.out.println("\nEnter Staff Details");
        System.out.print("Name: ");
        String staffName = sc.nextLine();
        System.out.print("Age: ");
        int staffAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Position: ");
        String staffPosition = sc.nextLine();
        Staff staff = new Staff(staffName, staffAge, staffPosition);
        staff.displayRole();

        sc.close();
    }
}

