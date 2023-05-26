package Strategy.VideoPlayer;


import Strategy.VideoPlayer.device.Phone;
import Strategy.VideoPlayer.device.TV;
import Strategy.VideoPlayer.resolution.Resolution1080p;
import Strategy.VideoPlayer.resolution.Resolution480p;

public class Driver {
    public static void main(String[] args) {
        Resolution resolution = new Resolution1080p();
        Device device = new TV();
        VideoPlayer player = new TvVideoPlayer(device, resolution);
        player.display();

        Resolution resolution1 = new Resolution480p();
        Device device1 = new Phone();
        VideoPlayer player1 = new TvVideoPlayer(device, resolution);
        player1.display();

    }
}
