import java.util.Scanner;
public class q11_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number-1");
        float a=sc.nextFloat();
        System.out.println("Enter number-2");
        float b=sc.nextFloat();
        System.out.println("The addition, subtraction, multilplication and division value of 2 numbers "+a+" and "+b+" is "+(a+b)+", "+(a-b)+", "+(a*b)+", "+(a/b));
    }
    
}
