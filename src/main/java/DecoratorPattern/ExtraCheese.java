package DecoratorPattern;

public class ExtraCheese extends ToppingDecorator{
    public ExtraCheese(BasePizza basePizza){
        super(basePizza);

    }
    public int getCost(){
        return basePizza.getCost() + 30;
    }
}
