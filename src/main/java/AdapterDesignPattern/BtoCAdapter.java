package AdapterDesignPattern;

public class BtoCAdapter implements TypeCCharger{
    private TypeBCharger typeBCharger;

    public BtoCAdapter(TypeBCharger typeBCharger) {
        this.typeBCharger = typeBCharger;
    }

    @Override
    public void chargeWithTypeC() {
        System.out.println("Adapting Type B Charger to Type C Charger");
        typeBCharger.chargeWithTypeB();
    }
}
