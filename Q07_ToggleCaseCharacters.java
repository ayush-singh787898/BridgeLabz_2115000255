import java.util.*;
public class Q07_ToggleCaseCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :- ");
        String str=sc.nextLine();
        String toggleString="";
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                if(Character.isLowerCase(str.charAt(i))){
                    toggleString+=Character.toUpperCase(str.charAt(i));
                }
                else{
                    toggleString+=Character.toLowerCase(str.charAt(i));
                }
            }
        }
        System.out.println("Original String : "+str+" \n After toggle String becomes "+toggleString);
        sc.close();
    }
    
}
