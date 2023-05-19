package Decorator.CarDecorator;


public abstract class Gold implements ICar{

    private ICar car;

    public Gold(ICar car) {
        this.car = car;
    }

    public double getPrice() {
        return car.getPrice();
    }

    public String getModel() {
        return car.getModel();
    }

    public abstract String goldFeature();
}
