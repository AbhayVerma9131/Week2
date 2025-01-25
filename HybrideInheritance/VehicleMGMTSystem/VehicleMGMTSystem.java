package HybrideInheritance.VehicleMGMTSystem;


// Main class for vehicle management system
public class VehicleMGMTSystem {
    // Main method to test vehicle management system
    public static void main(String[] args) {
        // Create a petroleum vehicle
        PetroleumVehicle petrolVehicle = new PetroleumVehicle(150, "Toyota", 50);
        petrolVehicle.displayInfo();
        petrolVehicle.refule();
        
        // Create an electric vehicle
        ElectricVehicle electricVehicle = new ElectricVehicle(200, "Tesla", 80);
        electricVehicle.displayInfo();
        electricVehicle.charge();
    }
}