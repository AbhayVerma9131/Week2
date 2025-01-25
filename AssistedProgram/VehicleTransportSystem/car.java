package AssistedProgram.VehicleTransportSystem;


//car extends Vehicle
class car extends Vehicle{
    private int seatCapacity;
    public void displayInfo(int seatCapacity,int maxSpeed, String fuleType){
        super.displayInfo(maxSpeed, fuleType);
        this.seatCapacity = seatCapacity;
        System.out.println("Seat Capacity: "+ seatCapacity);
    }
}