import java.io.*;

public class Q05_ByteArray {
    public static void main(String[] args) {
        String inputImagePath = "input.jpg";
        String outputImagePath = "output.jpg";

        try {
            byte[] imageBytes = convertImageToByteArray(inputImagePath);
            writeByteArrayToImage(imageBytes, outputImagePath);
            System.out.println("Image successfully converted and saved as " + outputImagePath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static byte[] convertImageToByteArray(String imagePath) throws IOException {
        File file = new File(imagePath);
        FileInputStream fis = new FileInputStream(file);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }

        fis.close();
        return bos.toByteArray();
    }

    public static void writeByteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(imageBytes);
        FileOutputStream fos = new FileOutputStream(outputPath);

        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = bis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        bis.close();
        fos.close();
    }
}
