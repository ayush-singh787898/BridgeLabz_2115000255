import java.util.*;

public class Q02_RemoveDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!hs.contains(ch)) {
                sb.append(ch);
                hs.add(ch);
            }
        }

        System.out.println("After removing duplicate String becomes: " + sb.toString());
    }

}
