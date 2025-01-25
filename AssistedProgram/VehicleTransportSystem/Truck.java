package AssistedProgram.VehicleTransportSystem;


//Truck extends Vehicle
class Truck extends Vehicle{
    private int cargoCapacity;
    public void displayInfo(int cargoCapacity,int maxSpeed, String fuleType){
        super.displayInfo(maxSpeed, fuleType);
        this.cargoCapacity = cargoCapacity;
        System.out.println("Cargo Capacity: "+cargoCapacity);
    }
}