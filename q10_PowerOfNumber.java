import java.util.Scanner;
public class q10_PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        System.out.println("Enter power");
        int power=sc.nextInt();
        int result=1;
        for(int i=1;i<=power;i++){
            result=result*num;
        }
        System.out.println("Power of number is "+result);
        sc.close();

    }
    
}
