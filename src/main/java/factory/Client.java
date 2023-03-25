package factory;

public class Client {
    public static void main(String[] args) {
        Phone android = PhoneFactory.getPhone(PhoneType.ANDROID);
        Phone iphone = PhoneFactory.getPhone(PhoneType.IPHONE);

        System.out.println(android);
        System.out.println(iphone);
    }
}
