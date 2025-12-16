package DecoratorPattern;

public class ExtraMushroom extends ToppingDecorator{
    public ExtraMushroom(BasePizza basePizza){
        super(basePizza);

    }
    public int getCost(){
        return basePizza.getCost() + 40;
    }
}
