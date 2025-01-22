import java.util.Scanner;
public class q09_AtheleteRound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        int distance=5;
        int perimeter=side1+side2+side3;
        int rounds=distance/perimeter;
        System.out.println("The total number of rounds the athelete will run is "+rounds+" to complete 5 km");

    }    
    
}
