package Multilevel_Inheritance.OnlineRetailOrderMGMT;

//Super class
class Order{
    private int orderId;
    private String orderDate;
    Order(int orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public void getOrderStatus(){
        System.out.println("Oder ID:"+orderId+" orderDate:"+orderDate);
    }
}