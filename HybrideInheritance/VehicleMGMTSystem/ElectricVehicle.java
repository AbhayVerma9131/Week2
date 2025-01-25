package HybrideInheritance.VehicleMGMTSystem;


// Class for electric vehicles that extends Vehicle
class ElectricVehicle extends Vehicle{
    // Charge level of the vehicle
    private int charge;

    // Constructor to initialize electric vehicle properties
    ElectricVehicle(int maxSpeed, String model,int charge){
        super(maxSpeed, model);
        this.charge = charge;
    }

    // Method to display electric vehicle information
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Charge: "+charge);
    }


    // Method to charge the electric vehicle
    public void charge(){
        if (charge !=100)
        {
            System.out.println("Charging...");
        }
        else{
            System.out.println("Already charged");
        }
    }
}
