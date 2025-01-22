public class q05_PenDistrubution {
    public static void main(String[] args) {
        int pens=14;
        int students=3;
        int pensPerStudent = pens / students;
        int remainingPens=pens%students;
        System.out.println("The Pen Per Student is "+pensPerStudent+" and remaining pens not distributed is "+remainingPens);

    }
    
}
