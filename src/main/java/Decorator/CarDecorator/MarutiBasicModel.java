package Decorator.CarDecorator;

//Concrete implementation , not a decorator
public class MarutiBasicModel implements ICar {
    @Override
    public double getPrice() {
        return 9000;
    }

    @Override
    public String getModel() {
          return "maruti basic model";
    }
}
