package Strategy.VideoPlayer.device;


import Strategy.VideoPlayer.Device;

public class TV implements Device {
    @Override
    public void device() {
        System.out.println("Playing video on TV");
    }
}
