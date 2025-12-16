package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new FarmHousePizza();
        System.out.println(pizza.getCost());
        pizza = new ExtraCheese(pizza);
        System.out.println(pizza.getCost());
        pizza = new ExtraMushroom(pizza);
        System.out.println(pizza.getCost());
    }
}
