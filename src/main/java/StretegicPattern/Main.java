package StretegicPattern;

import StretegicPattern.PaymentOptions.NetBanking;
import StretegicPattern.context.PaymentContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main() {
        //no if else required , just give payment method ...
        PaymentContext pc= new PaymentContext(new NetBanking());
        pc.payAmount(100);

    }
}
