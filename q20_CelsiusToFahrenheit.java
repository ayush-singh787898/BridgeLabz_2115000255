import java.util.Scanner;
public class q04_CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius");
        double Celsius=sc.nextDouble();
        double FahrenheitResult=(Celsius*9/5)+32;
        System.out.println("The teperature in Celsius is: "+Celsius+" while temperature in Fahrenheit is : "+FahrenheitResult);
    }
}