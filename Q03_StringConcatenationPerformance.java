import java.util.Scanner;

public class Q03_StringConcatenationPerformance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of operations (e.g., 1000, 10000, 1000000): ");
        int N = scanner.nextInt();
        
        System.out.println("Operations Count: " + N);
        
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < N; i++) {
            str += "a";
        }
        long endTime = System.nanoTime();
        System.out.println("String concatenation: " + (endTime - startTime) / 1000000 + " ms");

        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder concatenation: " + (endTime - startTime) / 1000000 + " ms");

        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbf.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer concatenation: " + (endTime - startTime) / 1000000 + " ms");
        
        scanner.close();
    }
}
