import java.util.Scanner;;
public class q10_ChocolatesDivision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Chocolates=sc.nextInt();
        int Students=sc.nextInt();
        int ChocolatesDistribute=Chocolates/Students;
        int remainingChocolate=Chocolates%Students;
        System.out.println("The number of chocolates each child gets is "+ChocolatesDistribute+" and the number of remaining chocolates are"+remainingChocolate);
    }
    
}
