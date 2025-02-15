import java.util.*;

public class Q03_ConcatenateStringsStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        System.out.println("Enter the size of String Array");
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter : " + (i + 1) + " String");
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        // System.out.println(Arrays.toString(arr));
        System.out.println(sb);
    }

}
