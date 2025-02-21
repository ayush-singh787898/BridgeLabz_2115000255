import java.io.*;

public class Q01_FileHandling {
    public static void main(String[] args) {
        String sourceFile = "text.txt";
        String destinationFile = "newFile.txt";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
                fos.write(i);
            }
            System.out.println("\nFile copied successfully to " + destinationFile);
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found!");
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
