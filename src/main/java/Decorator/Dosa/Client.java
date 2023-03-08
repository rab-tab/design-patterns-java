package Decorator.Dosa;

public class Client {
    public static void main(String[] args) {
        PlainDosa plainDosa = new PlainDosa();
        System.out.println(plainDosa.prepareDosa());

        String var = new OnionDosaDecorator(plainDosa).prepareDosa();
        System.out.println(var);

        String var1 = new MasalaDosaDecorator(plainDosa).prepareDosa();
        System.out.println(var1);
    }
}
