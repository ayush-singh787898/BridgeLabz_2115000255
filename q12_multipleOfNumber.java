import java.util.Scanner;
public class q12_multipleOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=100;i>=1;i--){
            if(i%number==0){
                System.out.println(i);
                continue;
            }
        }
        sc.close();
    }
    
}