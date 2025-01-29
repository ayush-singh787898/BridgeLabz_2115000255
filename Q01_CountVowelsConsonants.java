import java.util.*;
public class Q01_CountVowelsConsonants{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        Set<Character>set=new HashSet<>();
        set.add('a');
        set.add('A');
        set.add('e');
        set.add('E');
        set.add('i');
        set.add('I');
        set.add('o');
        set.add('O');
        set.add('u');
        set.add('U');
        int vowelCount=0;
        int consonantCount=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                if(set.contains(str.charAt(i))){
                    vowelCount++;
                }
                else{
                    consonantCount++;
                }
            }

            
        }
        System.out.println("No. of Vowel in string is "+vowelCount+" and no. of consonant count in given string is "+consonantCount);
        sc.close();
    }
}