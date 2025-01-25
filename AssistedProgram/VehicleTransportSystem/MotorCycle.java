package AssistedProgram.VehicleTransportSystem;


//MotorCycle extends Vehicle
class MotorCycle extends Vehicle{
    private String type;
    public void displayInfo(String type,int maxSpeed, String fuleType){
        super.displayInfo(maxSpeed, fuleType);
        this.type=type;
        System.out.println("Bike Type: "+type);
    }
}