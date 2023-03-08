package Decorator.Pizza;

public class VegetablePizzaDecorator extends PizzaDecorator {
    public VegetablePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void preparePizza() {
        pizza.preparePizza();
        addVeggies();
    }

    public void addVeggies() {
        System.out.println("Adding veggies....");
    }
}
