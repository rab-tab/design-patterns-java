package Decorator.Pizza.approach1;

import Decorator.Pizza.Pizza;

public class Client {
    public static void main(String[] args) {
        //extra cheese margherita
        BasePizza pizza = new ExtraCheese(new Margherita());
        System.out.println(pizza.cost());

        //add mushroom topping
        pizza=new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println("Mushroom topping ..");
        System.out.println(pizza.cost());
    }
}
