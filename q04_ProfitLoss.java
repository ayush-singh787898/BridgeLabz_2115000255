import java.util.Scanner;
public class q04_ProfitLoss{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int cp=129;
    int sp=191;
    int profit=sp-cp;
    double ProfitPercent=(profit/cp)*100;
    System.out.println("The cost price is INR "+cp+" and Selling Price is INR "+sp);
     System.out.println("The Profit is INR "+profit+" and the Profit Percentage is "+ProfitPercent);   
    }
}