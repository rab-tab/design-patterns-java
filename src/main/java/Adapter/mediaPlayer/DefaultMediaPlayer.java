package Adapter.mediaPlayer;

public class DefaultMediaPlayer implements MediaPlayer {

    @Override
    public void play(String format, String file) {
        System.out.println("PLaying file " + file + " with format " + format);
    }
}
