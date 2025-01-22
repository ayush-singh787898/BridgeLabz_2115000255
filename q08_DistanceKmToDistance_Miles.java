import java.util.Scanner;
public class q08_DistanceKmToDistance_Miles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double km=sc.nextDouble();
        double miles=km*0.62137;
        System.out.println("The total miles is "+miles+" for the given "+km+" km");
    }
    
}
