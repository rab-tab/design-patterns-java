package Decorator.Starbucks;

public class Milk  extends IngredientDecorator{

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    int getBeveragePrice() {
        return beverage.getBeveragePrice() + 2;
    }

    @Override
    public String getBeverageName() {
        return beverage.getBeverageName() + " with milk ";
    }
}
