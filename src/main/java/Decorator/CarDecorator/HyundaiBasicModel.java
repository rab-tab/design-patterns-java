package Decorator.CarDecorator;

//Concrete implementation , not a decorator
public class HyundaiBasicModel implements ICar {
    @Override
    public double getPrice() {
        return 8000;
    }

    @Override
    public String getModel() {
        return "hyundai basic model";
    }
}
