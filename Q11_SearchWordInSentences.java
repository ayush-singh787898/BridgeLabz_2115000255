import java.util.Scanner;

public class Q11_SearchWordInSentences {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] sentences = new String[n];

        System.out.println("Enter " + n + " sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        System.out.print("Enter the word to search for: ");
        String word = sc.next();

        String result = findSentenceWithWord(sentences, word);
        System.out.println("Result: " + result);

        sc.close();
    }
}
