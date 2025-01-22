import java.util.Scanner;
public class q10_HeightCentimeterTo_FeetAnd_Inches {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the centimeter value");
    double heightCm=sc.nextDouble();
    double heightInches=heightCm/2.54;
    double heightFeet = heightInches / 12;
    System.out.println("Your Height in cm is "+heightCm+" while in feet is "+heightFeet+" and inches is "+heightInches);  
    }    
}
