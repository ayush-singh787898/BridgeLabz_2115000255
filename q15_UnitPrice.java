import java.util.Scanner;;
public class q15_UnitPrice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter unitPrice of item");
        double unitPrice=sc.nextDouble();
        System.out.println("Enter quantity of item");
        double quantity=sc.nextDouble();
        double totalPrice=unitPrice*quantity;
        System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
    }
    
}
