package Decorator.Pizza;

public abstract class PizzaDecorator {
    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public void preparePizza() {
        pizza.preparePizza();
    }

}
