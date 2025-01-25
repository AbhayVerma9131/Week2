package Single_Inheritance.SmartHomeDevice;



// Thermostat class extending Device class
class Thermostat extends Device{
    // Temperature setting for the thermostat
    private int Tempraturesetting;

    // Constructor to initialize thermostat with ID, status, and temperature setting
    Thermostat(String deviceId,String Status,int Tempraturesetting) {
        super(deviceId,Status);
        this.Tempraturesetting = Tempraturesetting;
    }

    // Method to display thermostat status (including temperature setting)
    public void DisplayStatus(){
        super.DisplayStatus();
        System.out.println("Temperature setting: "+Tempraturesetting);
    }
}
