package Decorator.IceCream;

public class ChocolateDecorator extends IceCreamDecorator {
    public ChocolateDecorator(IceCream iceCream) {
        super(iceCream);
    }

    public String prepareIceCream() {
        return iceCream.prepareIceCream() + addChocolate();
    }

    private String addChocolate() {
        return " with chocolate ";
    }
}
