package AssistedProgram.VehicleTransportSystem;

//Main method 
public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        car c = new car();
        c.displayInfo(5, 200, "Petrol");
        
        Truck t = new Truck();
        t.displayInfo(10, 150, "Diesel");
        
        MotorCycle m = new MotorCycle();
        m.displayInfo("Scooter", 100, "Petrol");

    }
    
}
