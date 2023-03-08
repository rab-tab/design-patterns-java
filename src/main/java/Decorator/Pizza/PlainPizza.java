package Decorator.Pizza;

public class PlainPizza implements Pizza{
    @Override
    public void preparePizza() {
        System.out.println("Preparing plain pizza");
    }
}
