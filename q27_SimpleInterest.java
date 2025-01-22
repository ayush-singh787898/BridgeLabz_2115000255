import java.util.Scanner;
public class q11_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Principle=sc.nextInt();
        int rate=sc.nextInt();
        int time=sc.nextInt();
        double SI=(Principle*rate*time)/100;
        System.out.println("The Simple Interest is "+SI+" for Principle "+Principle+", Rate of Intereset "+rate+" and Time "+time);
    }
}
