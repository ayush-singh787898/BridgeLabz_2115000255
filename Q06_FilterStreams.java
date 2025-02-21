import java.io.*;

public class Q06_FilterStreams {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            convertUppercaseToLowercase(inputFile, outputFile);
            System.out.println("File converted successfully. Check " + outputFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void convertUppercaseToLowercase(String inputFile, String outputFile) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), "UTF-8"));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8"))
        ) {
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(Character.toLowerCase(ch));
            }
        }
    }
}
