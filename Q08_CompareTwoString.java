import java.util.*;
public class Q08_CompareTwoString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Strings : ");
        System.out.println("Enter first String ");
        String str1=sc.nextLine();
        System.out.println("Enter Second String ");
        String str2=sc.nextLine();
        int i=0;
        int j=0;
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i)<str2.charAt(j)){
                System.out.println(str1+" comes before "+str2+" in lexicographical order");
                break;
            }
            else if(str1.charAt(i)>str2.charAt(j)){
                System.out.println(str2+" comes before "+str1+" in lexicographical order");
                break;
            }   
            else{
                i++;
                j++;
            }    
        }
        sc.close();
    }   
}
