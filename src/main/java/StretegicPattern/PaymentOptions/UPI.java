package StretegicPattern.PaymentOptions;

public class UPI implements Payment{

    @Override
    public void pay(int amount) {
        System.out.println("Payment deducted through UPI "+amount);
    }
}
