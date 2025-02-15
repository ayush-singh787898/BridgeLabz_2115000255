import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Q06_WordCountInFile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String targetWord=sc.next();
        String fileName="Q06_file.txt";
        int wordCount=0;
        try(BufferedReader br=new BufferedReader (new FileReader(fileName))){
            String line;
            while((line=br.readLine())!=null){
                String[]words=line.toLowerCase().split("\\s+");
                for(String word:words){
                    word = word.replaceAll("[^a-zA-Z]", ""); 

                    if(word.equals(targetWord.toLowerCase())){
                        wordCount++;
                    }
                }
            }
            System.out.println("The word ' "+targetWord+" ' appears "+wordCount+" times in a given file");
        }
        catch(IOException e){
            System.out.println("Error while reading file: "+e.getMessage());
        }
    }
    
}
