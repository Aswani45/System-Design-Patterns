package DecoratorPattern;

public class MargarethaPizza extends BasePizza{

    private int cost;

    public MargarethaPizza(){
        this.cost = 120;
    }

    public int getCost(){
        return this.cost;
    }
}
