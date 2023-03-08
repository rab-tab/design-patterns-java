package Decorator.Pizza;

public class ChickenPizzaDecorator extends PizzaDecorator{
    public ChickenPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void preparePizza()
    {
        pizza.preparePizza();
        addChicken();
    }

    private void addChicken() {
        System.out.println("Adding chicken ...");
    }
}
