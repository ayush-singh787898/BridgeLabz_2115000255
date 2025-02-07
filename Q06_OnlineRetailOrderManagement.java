import java.util.*;
import java.time.LocalDate;

class Order {
    int orderId;
    LocalDate orderDate;

    Order(int orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    void getOrderStatus() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

class ShippedOrder extends Order {
    int trackingNumber;

    ShippedOrder(int orderId, LocalDate orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    LocalDate deliveryDate;

    DeliveredOrder(int orderId, LocalDate orderDate, int trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class Q06_OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the OrderID:");
        int orderId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Order date (yyyy-MM-dd):");
        LocalDate orderDate = LocalDate.parse(sc.nextLine());

        System.out.println("Enter the tracking Number:");
        int trackingNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Delivery Date (yyyy-MM-dd):");
        LocalDate deliveryDate = LocalDate.parse(sc.nextLine());

        DeliveredOrder deliveredOrder = new DeliveredOrder(orderId, orderDate, trackingNumber, deliveryDate);
        System.out.println("\nOrder Status:");
        deliveredOrder.getOrderStatus();

        sc.close();
    }
}
