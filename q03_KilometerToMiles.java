import java.util.*;
public class q03_KilometerToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in Kilometer: ");
        double km = sc.nextDouble();
        double miles=km*1.6;
        System.out.println("The distance "+km+" in miles is "+miles);
    }
    
}
