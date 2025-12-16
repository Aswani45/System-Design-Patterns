package ProxyPattern;

public class OrderServiceProxy implements OrderService{
    private OrderService orderService;
    private String Role;

    public OrderServiceProxy(String Role){
        this.Role = Role;
        if(Role.equals("Admin")){
            this.orderService = new OrderServiceImpl();
        }else{
            throw new IllegalArgumentException("Invalid Role");
        }

    }

    @Override
    public void placeOrder() {
        System.out.println("Placing Order by " + Role);
        orderService.placeOrder();
    }
}
