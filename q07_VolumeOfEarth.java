public class q07_VolumeOfEarth{
    public static void main(String[] args) {
        int radius1=6378;
        double radius2=radius1*1.6;
        double volume1=4/3.0*3.14*radius1*radius1*radius1;
        double volume2=4/3.0*3.14*radius2*radius2*radius1;
        System.out.println("The volume of earth in cubic km^3 is "+volume1+" and miles^3 "+volume2);

    }
}