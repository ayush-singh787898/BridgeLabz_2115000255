import java.util.*;

public class Q12_ReplaceWord {
    public static String replace(String str, String target, String replacement) {
        String[] words = str.split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                sb.append(replacement);
            } else {
                sb.append(words[i]);
            }
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str = sc.nextLine();
        System.out.println("Enter the word to be replaced:");
        String target = sc.nextLine();
        System.out.println("Enter the replacement word:");
        String replacement = sc.nextLine();
        
        String res = replace(str, target, replacement);
        System.out.println("Original String: " + str);
        System.out.println("String after replacement: " + res);
        
        sc.close();
    }
}
