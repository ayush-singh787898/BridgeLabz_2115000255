import java.util.Scanner;
public class q03_DoubleOperation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        System.out.println("The sesults of Int Operations are "+(a+b*c)+", "+(a*b+c)+", "+(c+a/b)+" and "+((a%b)+c));
    }
    
}

