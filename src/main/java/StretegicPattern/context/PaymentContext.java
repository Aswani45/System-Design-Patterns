package StretegicPattern.context;


import StretegicPattern.PaymentOptions.Payment;

public class PaymentContext {
    Payment method;

    public PaymentContext(Payment method){
        this.method = method;
    }
    public void payAmount(int amount){
        method.pay(amount);
    }
}
