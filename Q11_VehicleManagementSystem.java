
import java.util.Scanner;

// Interface Refuelable with a method refuel
interface Refuelable {
    void refuel();
}

// Superclass Vehicle with common attributes like maxSpeed and model
class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Subclass ElectricVehicle which inherits from Vehicle
class ElectricVehicle extends Vehicle {
    int batteryCapacity;

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println(model + " is charging. Battery Capacity: " + batteryCapacity + " kWh");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass PetrolVehicle which inherits from Vehicle and implements Refuelable interface
class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelCapacity;

    PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling. Fuel Capacity: " + fuelCapacity + " liters");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}

// Main class for testing the Vehicle Management System
public class Q11_VehicleManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for Electric Vehicle
        System.out.print("Enter Electric Vehicle Model: ");
        String evModel = sc.nextLine();
        System.out.print("Enter Electric Vehicle Max Speed: ");
        int evSpeed = sc.nextInt();
        System.out.print("Enter Electric Vehicle Battery Capacity (kWh): ");
        int evBattery = sc.nextInt();
        sc.nextLine(); // consume newline

        // Creating ElectricVehicle object
        ElectricVehicle ev = new ElectricVehicle(evModel, evSpeed, evBattery);

        // Taking input for Petrol Vehicle
        System.out.print("Enter Petrol Vehicle Model: ");
        String pvModel = sc.nextLine();
        System.out.print("Enter Petrol Vehicle Max Speed: ");
        int pvSpeed = sc.nextInt();
        System.out.print("Enter Petrol Vehicle Fuel Capacity (liters): ");
        int pvFuel = sc.nextInt();

        // Creating PetrolVehicle object
        PetrolVehicle pv = new PetrolVehicle(pvModel, pvSpeed, pvFuel);

        System.out.println("\nElectric Vehicle Details:");
        ev.displayDetails();
        ev.charge();

        System.out.println("\nPetrol Vehicle Details:");
        pv.displayDetails();
        pv.refuel();

        sc.close();
    }
}
