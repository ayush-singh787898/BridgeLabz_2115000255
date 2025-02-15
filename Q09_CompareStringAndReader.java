import java.io.*;

public class Q09_CompareStringAndReader {
    public static void main(String[] args) {
        compareStringBuilderAndBuffer();
        compareFileReaderAndInputStreamReader("large_file.txt"); // Ensure you have a large file named large_file.txt
    }

    public static void compareStringBuilderAndBuffer() {
        String text = "hello";
        int iterations = 1_000_000;

        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) / 1_000_000 + " ms");

        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    public static void compareFileReaderAndInputStreamReader(String fileName) {
        long startTime, endTime;
        int wordCount;

        // FileReader
        startTime = System.nanoTime();
        wordCount = countWordsUsingFileReader(fileName);
        endTime = System.nanoTime();
        System.out.println("FileReader word count: " + wordCount);
        System.out.println("FileReader time: " + (endTime - startTime) / 1_000_000 + " ms");

        // InputStreamReader
        startTime = System.nanoTime();
        wordCount = countWordsUsingInputStreamReader(fileName);
        endTime = System.nanoTime();
        System.out.println("InputStreamReader word count: " + wordCount);
        System.out.println("InputStreamReader time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    public static int countWordsUsingFileReader(String fileName) {
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file using FileReader: " + e.getMessage());
        }
        return wordCount;
    }

    public static int countWordsUsingInputStreamReader(String fileName) {
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file using InputStreamReader: " + e.getMessage());
        }
        return wordCount;
    }
}
