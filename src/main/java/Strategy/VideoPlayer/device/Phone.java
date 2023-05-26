package Strategy.VideoPlayer.device;


import Strategy.VideoPlayer.Device;

public class Phone implements Device {
    @Override
    public void device() {
        System.out.println("Playing video on Phone");
    }
}
