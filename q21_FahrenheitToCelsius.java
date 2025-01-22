import java.util.Scanner;
public class q05_FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit");
        double fahrenheit=sc.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5/9;
        System.out.println("Temperature in Fahrenheight is : "+fahrenheit+" while temperature in Celsius is "+celsiusResult);

    }
    
}
