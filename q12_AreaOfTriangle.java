import java.util.*;
public class q12_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base in inches: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        double heightInCm = height * 2.54;
        double heightInFeet = height / 12;
        double heightInInches = height;

        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516; 

        System.out.println("Your Height in cm is "+heightInCm+" while in feet is "+heightInFeet+" and inches is"+heightInInches);

    
        
    }
    
}
