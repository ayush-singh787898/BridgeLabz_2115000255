import java.util.Scanner;
public class q07_BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weight in kg");
        double weight=sc.nextDouble();
        System.out.println("Enter height in Centimeter");
        double heightCm=sc.nextDouble();
        double heightMetre=weight/100;
        double BMI=weight/(heightMetre*heightMetre);
        if(BMI<=18.4){
            System.out.println("Underweight");
        }
        else if(BMI>=18.5 && BMI<=18.5){
            System.out.println("Normal");
        }
        else if(BMI>=25.0 && BMI<=39.9){
            System.out.println("Overweight");
        }
        else if(BMI>=40.0){
            System.out.println("Obese");
        }
        sc.close();

    }
    
}
