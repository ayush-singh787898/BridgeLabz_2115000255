import java.util.Scanner;
public class q12_WeightPoundToKilograms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pound=sc.nextInt();
        double kilo=pound*0.4535;
        System.out.println("The weight of the person in pound is "+pound+" and in kg is "+kilo);
    }   
}
