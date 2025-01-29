import java.util.*;

public class Q11_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " are NOT anagrams.");
            return;
        }

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            if (!charCountMap.containsKey(ch) || charCountMap.get(ch) == 0) {
                System.out.println(str1 + " and " + str2 + " are NOT anagrams.");
                return;
            }
            charCountMap.put(ch, charCountMap.get(ch) - 1);
        }

        System.out.println(str1 + " and " + str2 + " are anagrams.");
        sc.close();
    }
}
