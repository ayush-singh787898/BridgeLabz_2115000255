
import java.util.Scanner;

// Interface Worker with a method performDuties
interface Worker {
    void performDuties();
}

// Superclass Person with common attributes like name and id
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Subclass Chef which inherits from Person and implements Worker interface
class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Chef) is cooking the food.");
    }
}

// Subclass Waiter which inherits from Person and implements Worker interface
class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving food to customers.");
    }
}

// Main class to test the Restaurant Management System
public class Q10_RestaurantManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for Chef
        System.out.print("Enter Chef's Name: ");
        String chefName = sc.nextLine();
        System.out.print("Enter Chef's ID: ");
        int chefId = sc.nextInt();
        sc.nextLine(); // consume the newline

        // Creating Chef object
        Chef chef = new Chef(chefName, chefId);

        // Taking input for Waiter
        System.out.print("Enter Waiter's Name: ");
        String waiterName = sc.nextLine();
        System.out.print("Enter Waiter's ID: ");
        int waiterId = sc.nextInt();

        // Creating Waiter object
        Waiter waiter = new Waiter(waiterName, waiterId);

        // Performing duties by each worker
        chef.performDuties();
        waiter.performDuties();

        sc.close();
    }
}
