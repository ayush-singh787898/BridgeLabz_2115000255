import java.util.Scanner;
public class q16_MaximumNoOfStudents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int students=sc.nextInt();
        float maxNoHandShake=(students*(students-1))/2;
        System.out.println("Maximum Number of handshakes among "+students+" number of student is :"+maxNoHandShake);
    }
    
}
