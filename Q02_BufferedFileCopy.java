import java.io.*;

public class Q02_BufferedFileCopy {
    public static void main(String[] args) {
        String sourceFile = "100mb.txt";
        String destBuffered = "copy_buffered.txt";
        String destUnbuffered = "copy_unbuffered.txt";

        long startTimeBuffered = System.nanoTime();
        copyFileBuffered(sourceFile, destBuffered);
        long endTimeBuffered = System.nanoTime();
        System.out.println("Time taken by Buffered Streams: " + (endTimeBuffered - startTimeBuffered) / 1_000_000 + " ms");

        long startTimeUnbuffered = System.nanoTime();
        copyFileUnbuffered(sourceFile, destUnbuffered);
        long endTimeUnbuffered = System.nanoTime();
        System.out.println("Time taken by Unbuffered Streams: " + (endTimeUnbuffered - startTimeUnbuffered) / 1_000_000 + " ms");
    }

    private static void copyFileBuffered(String source, String destination) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("Buffered file copy completed.");
        } catch (IOException e) {
            System.out.println("Error during buffered file copy: " + e.getMessage());
        }
    }

    private static void copyFileUnbuffered(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("Unbuffered file copy completed.");
        } catch (IOException e) {
            System.out.println("Error during unbuffered file copy: " + e.getMessage());
        }
    }
}
