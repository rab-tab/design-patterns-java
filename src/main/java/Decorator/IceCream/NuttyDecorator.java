package Decorator.IceCream;

public class NuttyDecorator extends IceCreamDecorator {
    public NuttyDecorator(IceCream iceCream) {
        super(iceCream);
    }

    public String prepareIceCream() {
        return iceCream.prepareIceCream() + addNuts();
    }

    private String addNuts() {
        return " + with nuts";
    }
}
