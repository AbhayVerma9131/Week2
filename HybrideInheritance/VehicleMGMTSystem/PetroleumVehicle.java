package HybrideInheritance.VehicleMGMTSystem;

// Class for petroleum vehicles that extends Vehicle and implements Refulable
class PetroleumVehicle extends Vehicle implements Refulable{
    // Fuel level of the vehicle
    private int fule;

    // Constructor to initialize petroleum vehicle properties
    PetroleumVehicle(int maxSpeed, String name,int fule){
        super(maxSpeed, name);
        this.fule = fule;
    }

    // Method to display petroleum vehicle information
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Fule: "+fule);
    }

    // Method to refuel the petroleum vehicle
    public void refule() {
        if (fule <100){
            System.out.println("Refueling...");
        }
        else{
            System.out.println("Already refueled");
        }
    }
}