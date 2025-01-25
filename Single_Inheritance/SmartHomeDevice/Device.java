package Single_Inheritance.SmartHomeDevice;

class Device{
    // Unique identifier for the device
    private String deviceId;
    // Current status of the device (e.g., ON/OFF)
    private String Status;

    // Constructor to initialize device with ID and status
    Device(String deviceId, String Status) {
        this.deviceId = deviceId;
        this.Status = Status;
    }

    // Method to display device status
    public void DisplayStatus()
    {
        System.out.println("Device ID: " + deviceId + ", Status: " + Status);
    }
}