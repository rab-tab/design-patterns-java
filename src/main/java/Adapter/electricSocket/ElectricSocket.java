package Adapter.electricSocket;

public class ElectricSocket {
    public Volt getVolt()
    {
        return new Volt(120);
    }
}
