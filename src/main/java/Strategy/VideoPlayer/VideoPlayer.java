package Strategy.VideoPlayer;

public abstract class VideoPlayer {
    Device device;
    Resolution deviceResolution;

    abstract void display();

    void getDevice() {
        device.device();

    }

    void getResolution() {
        deviceResolution.resolution();
    }
}
