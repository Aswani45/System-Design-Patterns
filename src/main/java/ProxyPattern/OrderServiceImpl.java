package ProxyPattern;

public class OrderServiceImpl implements OrderService{

    @Override
    public void placeOrder() {
        System.out.println("Order Placed");
    }
}
