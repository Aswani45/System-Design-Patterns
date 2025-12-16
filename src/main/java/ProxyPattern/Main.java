package ProxyPattern;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceProxy("Admin");
        orderService.placeOrder();
        OrderService orderService1 = new OrderServiceProxy("User");
        orderService1.placeOrder();
    }
}
