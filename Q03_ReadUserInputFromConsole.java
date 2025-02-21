import java.io.*;

public class Q03_ReadUserInputFromConsole  {
    public static void main(String[] args) throws IOException{
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name ");
            String name=reader.readLine();
            System.out.println("Enter age ");
            int age=Integer.parseInt(reader.readLine());
            
            System.out.println("Enter your Favourite Programming Language");
            String proLang=reader.readLine();
            FileWriter fw=new FileWriter("user.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            fw.write(name);
            bw.newLine();
            fw.write(age);
            bw.newLine();
            fw.write(proLang);
            bw.newLine();
            fw.close();
            System.out.println("Data saved successfully");
        }
        catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println("Error: "+e.getMessage());
        }
        

    }
}
