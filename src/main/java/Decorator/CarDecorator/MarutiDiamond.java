package Decorator.CarDecorator;



public class MarutiDiamond  extends Diamond{
    public MarutiDiamond(ICar car) {
        super(car);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+ 71000;
    }

    @Override
    public String getModel() {
        return "maruti diamond model";
    }


    @Override
    public String diamondFeature() {
        return "maruti diamond model";
    }
}
