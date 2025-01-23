import java.util.Scanner;
public class q09_greatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        int greatestFactor=1;
        for(int i=number-1;i>=1;i--){
            if(number%i==0){
                greatestFactor=i;
                break;
            }
        }
        System.out.println("GreatestFactor from numbers is "+greatestFactor);
        sc.close();

    }
    
}
