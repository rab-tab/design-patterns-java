package Decorator.Pizza.approach1;

public class Mushroom extends ToppingDecorator{

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+200;
    }
}
