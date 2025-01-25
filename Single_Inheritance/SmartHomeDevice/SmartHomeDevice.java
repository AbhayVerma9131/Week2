package Single_Inheritance.SmartHomeDevice;

// Main class to test SmartHomeDevice functionality
public class SmartHomeDevice {  
    // Main method to create and test a thermostat device
    public static void main(String[] args) {
        // Create a new thermostat device with ID, status, and temperature setting
        Thermostat thermostat = new Thermostat("Thermostat1", "ON", 25);
        // Display the status of the thermostat device
        thermostat.DisplayStatus();
    }
}