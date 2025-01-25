package Multilevel_Inheritance.OnlineRetailOrderMGMT;


// Subclass 2: Delivered Order
class deliveredOrder extends ShippedOrder{
    private String deliveryDate;
    deliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Delivery Date:"+ deliveryDate);
    }

}
