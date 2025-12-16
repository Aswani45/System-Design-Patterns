package AdapterDesignPattern;

public class Mobile {
    private TypeCCharger charger;

    public Mobile(TypeCCharger typeCCharger) {
        this.charger = typeCCharger;
    }

    public void charge() {
        charger.chargeWithTypeC();
    }
}
