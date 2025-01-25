package Multilevel_Inheritance.OnlineRetailOrderMGMT;

// Main class to test the Order hierarchy
public class OnlineRetailOrederMGMT{
    public static void main(String[] args) {
        deliveredOrder deliveredOrder1 = new deliveredOrder(1, "2022-01-01", 12345678, "2022-01-05");
        deliveredOrder1.getOrderStatus();
        // other orders can be created similarly
        ShippedOrder shippedOrder1 = new ShippedOrder(1, "2022", 12345678);
        shippedOrder1.getOrderStatus();
    }

}