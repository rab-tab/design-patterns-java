package Strategy.VideoPlayer.resolution;


import Strategy.VideoPlayer.Resolution;

public class Resolution1080p implements Resolution {
    @Override
    public void resolution() {
        System.out.println("Resolution 1080p");
    }
}
