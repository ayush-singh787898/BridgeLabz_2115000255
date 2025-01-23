import java.util.Scanner;

public class q06_FizzBuzz_WhileLoop {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n>=0){
            int i=0;
                while(i<=n){
                if(i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");
                }
                else if(i%3==0){
                    System.out.println("Fizz");
                }
                else if(i%5==0){
                    System.out.println("Buzz");
                }
                i++;
            }
        }
        sc.close();


    }
}
