package Adapter;

public class MobilePhone {
    public static void main(String[] args) {

        new MobilePhone().charge();
    }

    public void charge() {
        ITarget iTarget = new MobilePhoneCharger();
        System.out.println("Mobile phone is charging using " + iTarget.get9Volt().getVolts());

    }
}
