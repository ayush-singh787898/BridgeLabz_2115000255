import java.util.*;
class Devices{
    int deviceId;
    String status;
    Devices(int deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;

    }
    void displayStatus(){
        System.out.println("DeviceId is "+deviceId);
        System.out.println("Status of the Device is "+status);
    }
}
class Thermostat extends Devices{
    String temperaturSetting;
    Thermostat(String temperatureSetting,int deviceId,String status){
        super(deviceId,status);
        this.temperaturSetting=temperatureSetting;
    }
    @Override
    void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting: "+temperaturSetting);
    }
}
public class Q05_SmartHomeDevices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the DeviceId");
        int deviceId=sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the Status");
        String status=sc.nextLine();

        System.out.println("Enter the Temperature Setting");
        String temperatureSetting=sc.nextLine();
        Devices thermostat=new Thermostat(temperatureSetting,deviceId,status);
        System.out.println("\nDevice Details!");
        thermostat.displayStatus();
        sc.close();

    }
    
}
