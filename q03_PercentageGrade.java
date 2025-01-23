import java.util.Scanner;
public class q03_PercentageGrade {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of 3 Subjects");
        System.out.println("Enter marks of Physics");
        int Physics=sc.nextInt();
        System.out.println("Enter marks of Chemistry");
        int Chemistry=sc.nextInt();
        System.out.println("Enter marks of Maths");
        int Maths=sc.nextInt();
        int total=Physics+Chemistry+Maths;
        double AverageMrks=total/3;
        double percentage=(double)total/300*100;
        if(percentage>=80){
            System.out.println("Average Marks: "+AverageMrks+" , Grade: "+"A "+" Remarks: Level 4, above agency-normalized standards");
        }
        else if(percentage>=70 && percentage<=79){
            System.out.println("Average Marks: "+AverageMrks+" , Grade: "+"B "+" Remarks: Level 3, at agency-normalized standards");   
        }
        else if(percentage>=60 && percentage<=69){
            System.out.println("Average Marks: "+AverageMrks+" , Grade: "+"C "+" Remarks: Level 2, below, but approaching agency-normalized standards");   
        }
        else if(percentage>=50 && percentage<=59){
            System.out.println("Average Marks: "+AverageMrks+" , Grade: "+"D "+" Remarks: Level 1, well below agency-normalized standards");   
        }
        else if(percentage>=40 && percentage<=49){
            System.out.println("Average Marks: "+AverageMrks+" , Grade: "+"E "+" Remarks: Level 1, too below agency-normalized standards");   
        }
        else if(percentage<=39){
            System.out.println("Average Marks: "+AverageMrks+" , Grade: "+"R "+" Remarks: Level 3, Remedial standards");   
        }
        sc.close();

    }
}