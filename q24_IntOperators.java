    
import java.util.Scanner;
public class q08_IntOperators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.print("Enter starting city: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter  destination city: ");
        String toCity = sc.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Enter the total time taken in hours: ");
        double timeTaken = sc.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;

        double avgSpeed = totalDistance / timeTaken;

        System.out.println("\nTravel Summary for " + name + ":");
        System.out.println("Journey from " + fromCity + " to " + toCity + " via " + viaCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Total Time Taken: " + timeTaken + " hours");
        System.out.println("Average Speed: " + avgSpeed + " miles per hour");

        sc.close();
    }
}
