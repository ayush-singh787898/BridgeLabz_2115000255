import java.util.Scanner;
public class q08_youngestTalest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Aman Age");
        int AmanAge=sc.nextInt();
        System.out.println("Enter Aman Height");
        int AmanHeight=sc.nextInt();

        System.out.println("Enter Akbar Age");
        int AkbarAge=sc.nextInt();
        System.out.println("Enter Akbar Height");
        int AkbarHeight=sc.nextInt();

        System.out.println("Enter Anthony Age");
        int AnthonyAge=sc.nextInt();
        System.out.println("Enter Anthony Height");
        int AnthonyHeight=sc.nextInt();

        if(AmanAge<AkbarAge && AmanAge<AnthonyAge){
            System.out.println("Aman is youngest");
        }
        else if(AkbarAge<AmanAge && AkbarAge<AnthonyAge){
            System.out.println("Akbar is youngest");
        }
        else{
            System.out.println("Anthony is youngest");
        }
        if(AmanHeight>AkbarHeight && AmanHeight>AnthonyHeight){
            System.out.println("Aman is tallest");
        }
        else if(AkbarHeight>AmanHeight && AkbarHeight>AnthonyHeight){
            System.out.println("Akbar is tallest");
        }
        else{
            System.out.println("Anthony is tallest");
        }
        sc.close();


    }
}
