package Decorator.CarDecorator;


public class Client {

    public static void main(String[] args) {

        //concrete implementation
        ICar marutiBasic=new MarutiBasicModel();
        System.out.println(marutiBasic.getModel());
        System.out.println(marutiBasic.getPrice());

        //decortaor
        Classic marutiClassic=new MarutiClassic(marutiBasic);
        System.out.println(marutiClassic.getModel());
        System.out.println(marutiClassic.getPrice());
        System.out.println(marutiClassic.classicFeature());


        Gold marutiGold=new MarutiGold(marutiClassic);
        System.out.println(marutiGold.getModel());
        System.out.println(marutiGold.getPrice());
        System.out.println(marutiGold.goldFeature());

        Diamond marutiDiamond=new MarutiDiamond(marutiGold);
        System.out.println(marutiDiamond.getModel());
        System.out.println(marutiDiamond.getPrice());
        System.out.println(marutiDiamond.diamondFeature());

    }

}
