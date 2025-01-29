import java.util.*;
public class Q05_LongestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int maxi=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                maxi=Math.max(maxi,count);
                count=0;

            }
            else{
                count++;
            }
        }
        maxi=Math.max(maxi,count);

        System.out.println("Longest word in a Sentence is "+maxi);
    }
}
