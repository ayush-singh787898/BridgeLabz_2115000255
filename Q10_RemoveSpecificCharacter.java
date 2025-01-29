import java.util.*;
public class Q10_RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=sc.nextLine();
        System.out.println("Enter the Character");
        Character ch=sc.next().charAt(0);
        String res="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                res+=str.charAt(i);
            }
        }
        System.out.println("Original String is "+str+"\nFinal String after removing specific character : "+res);
        sc.close();        
    }   
}
