package Decorator.CarDecorator;


public abstract class Classic implements ICar{
    private ICar car;

    public Classic(ICar car) {
        this.car = car;
    }

    public double getPrice() {
        return car.getPrice();
    }

    public String getModel() {
        return car.getModel();
    }

    public abstract String classicFeature();
}
