package Multilevel_Inheritance.OnlineRetailOrderMGMT;

// Subclass 1: Shipped Order
class ShippedOrder extends Order{
    private int Trackingnumber;
    ShippedOrder(int orderId, String orderDate, int trackingNumber){
        super(orderId, orderDate);
        this.Trackingnumber = trackingNumber;
    }
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Tracking Number:"+ Trackingnumber);
    }
}
