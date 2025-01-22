import java.util.Scanner;
public class q02_IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("The sesults of Int Operations are "+(a+b*c)+", "+(a*b+c)+", "+(c+a/b)+" and "+((a%b)+c));
    }
    
}
