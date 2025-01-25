package HybrideInheritance.VehicleMGMTSystem;

class Vehicle{
    // Maximum speed of the vehicle
    private int maxSpeed;
    // Model of the vehicle
    private String model;

    // Constructor to initialize vehicle properties
    Vehicle(int maxSpeed, String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Method to display vehicle information
    public void displayInfo(){
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Model: "+model);
    }
}