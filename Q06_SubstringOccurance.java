import java.util.*;
public class Q06_SubstringOccurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=sc.nextLine();
        System.out.println("Enter the Substring ");
        String subString=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            int countMatch=0;
            int j=0;
            for(j=0;j<subString.length();j++){
                if(str.charAt(i)!=subString.charAt(j)){
                    break;
                }
                else{
                    countMatch++;
                }
                i++;
            }
            if(countMatch==subString.length()){
                count++;
            }
        }
        System.out.println("Substring Occurance in a given string is "+count);
        sc.close();

    }
}
