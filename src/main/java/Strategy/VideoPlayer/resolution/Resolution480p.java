package Strategy.VideoPlayer.resolution;


import Strategy.VideoPlayer.Resolution;

public class Resolution480p implements Resolution {
    @Override
    public void resolution() {
        System.out.println("Resolution 480p");
    }
}
