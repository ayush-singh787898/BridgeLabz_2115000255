import java.util.*;
class Course {
    String courseName;
    int duration;
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    void courseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration of Course: " + duration + " hours");
    }
}
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    @Override
    void courseDetails() {
        super.courseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Courses are " + (isRecorded ? "Recorded" : "Not Recorded"));
    }
}
class PaidCourse extends OnlineCourse {
    double fee;
    double discount;
    PaidCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    @Override
    void courseDetails() {
        super.courseDetails();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}
public class Q07_EducationalCourseHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the course Details");
        System.out.print("Enter the course name: ");
        String courseName = sc.nextLine();
        System.out.print("Enter course duration (in hours): ");
        int courseDuration = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the online platform: ");
        String platform = sc.nextLine();
        System.out.print("Is the course recorded? (true/false): ");
        boolean isRecorded = sc.nextBoolean();
        System.out.print("Enter the fee for the course: ");
        double fee = sc.nextDouble();
        System.out.print("Enter the discount (in %): ");
        double discount = sc.nextDouble();
        PaidCourse course = new PaidCourse(courseName, courseDuration, platform, isRecorded, fee, discount);
        System.out.println("\nCourse Details:");
        course.courseDetails();
        sc.close();
    }
}
