package factory;

public class IPhone extends Phone {
    @Override
    protected void createPhone() {
        specifications.add(new IPhonePanel());
        specifications.add(new IphoneProcessor());
    }
}
