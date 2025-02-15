import java.util.*;
public class Q01_ReverseStringUsingStringBuilder {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        str=sb.reverse().toString();
        System.out.println("Reverse String is "+str);

    }
}