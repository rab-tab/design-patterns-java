package Decorator.CarDecorator;

public class MarutiClassic extends Classic{

    public MarutiClassic(ICar car) {
        super(car);
    }

    @Override
    public String classicFeature() {
        return "Maruti basic + classic feature";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+ 7000;
    }

    @Override
    public String getModel() {
        return "maruti classic model";
    }
}
