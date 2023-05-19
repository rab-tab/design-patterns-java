package Decorator.CarDecorator;


public class MarutiGold extends Gold{

    public MarutiGold(ICar car) {
        super(car);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+ 7000;
    }

    @Override
    public String getModel() {
        return "maruti gold model";
    }


    @Override
    public String goldFeature() {
         return "Maruti basic + gold feature";
    }
}
