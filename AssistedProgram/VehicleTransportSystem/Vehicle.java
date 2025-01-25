package AssistedProgram.VehicleTransportSystem;
//Superclass
class Vehicle{
    private int maxSpeed;
    private String fuleType;
    public void displayInfo(int maxSpeed, String fuleType){
        this.maxSpeed = maxSpeed;
        this.fuleType = fuleType;
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Fule Type: "+fuleType);
    }
}