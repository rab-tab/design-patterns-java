package Decorator.Pizza;

import Decorator.Dosa.PlainDosa;

public class Client {
    public static void main(String[] args) {

        PlainPizza plainPizza=new PlainPizza();
        plainPizza.preparePizza();

        new VegetablePizzaDecorator(plainPizza).preparePizza();
        new ChickenPizzaDecorator(plainPizza).preparePizza();
    }
}
