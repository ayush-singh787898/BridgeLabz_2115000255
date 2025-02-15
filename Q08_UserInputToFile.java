
import java.io.*;

public class Q08_UserInputToFile {
    public static void main(String[] args) {
        String fileName = "Q08_user_input.txt";

        try (
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw)
        ) {
            System.out.println("Enter text (type 'exit' to stop):");

            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Input saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
