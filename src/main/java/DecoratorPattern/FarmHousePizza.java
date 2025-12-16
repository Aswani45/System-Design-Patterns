package DecoratorPattern;

public class FarmHousePizza extends BasePizza{

    private int cost;

    public FarmHousePizza(){
        this.cost = 120;
    }

    public int getCost(){
        return this.cost;
    }
}


