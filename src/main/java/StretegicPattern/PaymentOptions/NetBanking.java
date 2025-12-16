package StretegicPattern.PaymentOptions;

public class NetBanking implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Amount deducted through NetBanking "+amount);
    }
}
