import java.util.Scanner;
public class q06_SalaryIncome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();
        int bonus=sc.nextInt();
        int totalIncome=bonus+salary;
        System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+" . Hence Total Income is INR "+totalIncome);
    }
    
}
