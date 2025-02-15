
import java.io.*;

public class Q05_FileReader {
    public static void main(String[] args) {
        String filePath = "Q05_sample.txt"; 
        
        try{
             BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
