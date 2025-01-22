import java.util.Scanner;
public class q01_Quotient_Remainder {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number-1");
        int num1=sc.nextInt();
        System.out.println("Enter First Number-2");
        int num2=sc.nextInt();
        int quotient=num1/num2;
        int reminder=num1%num2;
        System.err.println("The Quotient is "+quotient+" and Remainder is "+reminder+" of two number "+num1+" and "+num2);
    }
}