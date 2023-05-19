package Decorator.CarDecorator;


public abstract class Diamond implements ICar {
    private ICar car;

    public Diamond(ICar car) {
        this.car = car;
    }

    public double getPrice() {
        return car.getPrice();
    }

    public String getModel() {
        return car.getModel();
    }

    public abstract String diamondFeature();
}
