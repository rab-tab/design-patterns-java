package Decorator.IceCream;

public abstract class IceCreamDecorator implements IceCream {
    IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String prepareIceCream() {
        return iceCream.prepareIceCream();
    }


}
