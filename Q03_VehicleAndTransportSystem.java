import java.util.*;
class Vehicle{
    double maxSpeed;
    String fuelType;
    Vehicle(double maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    void displayInfo(){
        System.out.println("MaxSpeed: "+maxSpeed+" km/h");
        System.out.println("Fuel Type: "+fuelType);
    }

}
class Car extends Vehicle{
    int seatCapacity;
    Car(double maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;

    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Seat capacity: "+seatCapacity);
    }
}
class Truck extends Vehicle{
    double loadCapacity;
 
    Truck(double maxSpeed,String fuelType,double loadCapacity){
        super(maxSpeed,fuelType);
        this.loadCapacity=loadCapacity;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity: "+loadCapacity+" tons");
    }
}
class Motorcycle extends Vehicle{
    boolean hasSidecar;
    Motorcycle(double maxSpeed,String fuelType,boolean hasSidecar){
        super(maxSpeed,fuelType);
        this.hasSidecar=hasSidecar;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Has Sidecar "+(hasSidecar?"Yes":"No"));
 
    }

}
public class Q03_VehicleAndTransportSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Vehicles: ");
        int n=sc.nextInt();

        Vehicle[]vehicles=new Vehicle[n];

        for(int i=0;i<n;i++){
            System.out.println("\nEnter details for vehicles "+(i+1)+":");
            System.out.println("Enter vehicle type like(Car/Truck/MotorCycle)");

            String type=sc.nextLine();

            System.out.println("Enter max speed: ");
            double maxSpeed=sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter fuel type: ");
            String fuelType=sc.nextLine();

            if(type.equals("car")){
                System.out.println("Enter seat capacity: ");
                int seatCapacity=sc.nextInt();
                sc.nextLine();
                vehicles[i]=new Car(maxSpeed, fuelType, seatCapacity);
            }
            else if(type.equals("truck")){
                System.out.println("Enter load capacity in tons: ");
                double loadCapacity=sc.nextDouble();
                sc.nextLine();
                vehicles[i]=new Truck(maxSpeed, fuelType, loadCapacity);
            }
            else if(type.equals("motorcycle")){
                System.out.println("Does the motorcycle have a sidecar?(true/false): ");
                boolean hasSidecar=sc.nextBoolean();
                sc.nextLine();
                vehicles[i]=new Motorcycle(maxSpeed, fuelType,hasSidecar);
            }
            else{
                System.out.println("Invalid Vehicle type! Skip");
            }
        }
        
        // Display Details of all vehicles

        System.out.println("\nVehicle Information");
        for(Vehicle v:vehicles){
            if(v!=null){
                v.displayInfo();
                System.out.println();
            }
        }
        sc.close();
    }
}
