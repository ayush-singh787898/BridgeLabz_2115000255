import java.util.Scanner;;
public class q13_Parameter_Of_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the square");
        double perimeter=sc.nextInt();
        double side=perimeter/4;
        System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);

       
    }
    
}
