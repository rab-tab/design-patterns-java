package Adapter.electricSocket;

public class MobilePhoneCharger implements ITarget {

    private ElectricSocket electricSocket = new ElectricSocket();


    @Override
    public Volt get9Volt() {
        Volt volt = electricSocket.getVolt();
        System.out.println("From electric socket mobile phone charger got " + volt.getVolts() + "volts");
        Volt convertedVolt = convertVolt(volt, 13);
        System.out.println("Mobile phone charger converted " + volt.getVolts() + " to" + convertedVolt.getVolts());
        return convertedVolt;
    }

    public Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);

    }
}

