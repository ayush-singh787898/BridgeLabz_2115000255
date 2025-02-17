import java.util.Arrays;
import java.util.Random;

public class Q02_SortingLargeData {

    // Bubble Sort (O(N^2))
    public static void bubbleSort(int[] arr) {
        long startTime = System.nanoTime();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.printf("Bubble Sort Time: %.3f ms\n", (endTime - startTime) / 1e6);
    }

    // Merge Sort (O(N log N))
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // Quick Sort (O(N log N))
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Method to run sorting algorithms and measure execution time
    public static void sortAndMeasure(int[] data, String algorithm) {
        int[] copy = Arrays.copyOf(data, data.length);
        long startTime = System.nanoTime();

        if (algorithm.equals("Bubble")) {
            bubbleSort(copy);
        } else if (algorithm.equals("Merge")) {
            mergeSort(copy, 0, copy.length - 1);
        } else if (algorithm.equals("Quick")) {
            quickSort(copy, 0, copy.length - 1);
        }

        long endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1e6;
        System.out.printf("%-12s: %.3f ms\n", algorithm + " Sort", timeTaken);
    }

    public static void main(String[] args) {
        int[] dataSizes = {1000, 10000, 100000};

        for (int size : dataSizes) {
            int[] dataset = new int[size];
            Random rand = new Random();

            for (int i = 0; i < size; i++) {
                dataset[i] = rand.nextInt(size);
            }

            System.out.println("\nDataset Size: " + size);
            if (size <= 10000) {
                sortAndMeasure(dataset, "Bubble");
            } else {
                System.out.println("Bubble Sort: Unfeasible");
            }
            sortAndMeasure(dataset, "Merge");
            sortAndMeasure(dataset, "Quick");
        }
    }
}
