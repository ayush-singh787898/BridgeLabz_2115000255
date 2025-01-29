import java.util.*;

public class Q04_RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();

        System.out.println("Original String: " + str);

        Map<Character, Boolean> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, true);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : map.keySet()) {
            result.append(ch);
        }

        System.out.println("After removing duplicate characters, the string becomes: " + result);

        sc.close();
    }
}
