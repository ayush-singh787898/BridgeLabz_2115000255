import java.util.Arrays;
import java.util.Random;

public class Q01_SearchTarget {

    public static boolean linearSearch(int[] arr, int element) {
        long startTime = System.nanoTime();

        for (int num : arr) {
            if (num == element) {
                long endTime = System.nanoTime();
                double timeTaken = (endTime - startTime) / 1_000_000.0;
                System.out.printf("%-12d %-12.3f ", arr.length, timeTaken);
                return true;
            }
        }

        long endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1_000_000.0;
        System.out.printf("%-12d %-12.3f ", arr.length, timeTaken);
        return false;
    }

    public static boolean binarySearch(int[] arr, int element) {
        long startTime = System.nanoTime();
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == element) {
                long endTime = System.nanoTime();
                double timeTaken = (endTime - startTime) / 1_000_000.0;
                System.out.printf("%-12.3f\n", timeTaken);
                return true;
            } else if (arr[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        long endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1_000_000.0;
        System.out.printf("%-12.3f\n", timeTaken);
        return false;
    }

    public static void main(String[] args) {
        int[] dataSizes = { 1000, 10_000, 1_000_000 };
        Random rand = new Random();

        System.out.printf("%-12s %-12s %-12s\n", "Dataset Size", "Linear Search (ms)", "Binary Search (ms)");

        for (int size : dataSizes) {
            int[] dataset = new int[size];

            for (int i = 0; i < size; i++) {
                dataset[i] = rand.nextInt(size);
            }

            int target = rand.nextInt(size);

            linearSearch(dataset, target);
            Arrays.sort(dataset);
            binarySearch(dataset, target);
        }
    }
}
