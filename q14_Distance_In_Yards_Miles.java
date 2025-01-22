import java.util.Scanner;
public class q14_Distance_In_Yards_Miles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in Feets");
        double feet=sc.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;

        double cm=feet*30.48;
        double inches=feet*12;
        System.out.println("Height in cm is "+cm+" while in feet is "+feet+" and inches is "+inches);
    }
    
}
