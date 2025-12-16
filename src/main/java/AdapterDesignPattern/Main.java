package AdapterDesignPattern;

public class Main {
    public static void main(String[] args) {

//        Mobile mobile = new Mobile(new TypeCChargerimpl());
//        mobile.charge();
        // now we do not have charge C , so we will use adapter
        TypeBCharger typeBCharger = new TypeBChargerimpl();
        TypeCCharger typeCCharger = new BtoCAdapter(typeBCharger);
        Mobile mobile = new Mobile(typeCCharger);
        mobile.charge();
    }
}
