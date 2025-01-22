import java.util.Scanner;
public class q01_FindAge{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your current Year:");
        int currentYear = sc.nextInt();
        int birthYear=2000;
        int age=currentYear-birthYear;
        System.out.println("Harry's age in "+currentYear +" is "+age);;

    }
}