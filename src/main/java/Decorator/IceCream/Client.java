package Decorator.IceCream;

public class Client {
    public static void main(String[] args) {
        VanillaIceCream vanillaIceCream=new VanillaIceCream();
        vanillaIceCream.prepareIceCream();

        System.out.println(new NuttyDecorator(vanillaIceCream).prepareIceCream());
    }
}
