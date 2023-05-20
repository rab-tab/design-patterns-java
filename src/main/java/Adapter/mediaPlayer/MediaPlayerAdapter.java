package Adapter.mediaPlayer;

public class MediaPlayerAdapter implements MediaPlayer {


    AdvanceMediaPlayer advanceMediaPlayer;
    AdvancedFormat advancedFormat;

    public MediaPlayerAdapter(AdvancedFormat advancedFormat) {
        this.advanceMediaPlayer = new AviPlayer();
        this.advancedFormat = advancedFormat;
    }

    @Override
    public void play(String format, String file) {
        advancedFormat.setFormatToPlay(format);
        advancedFormat.setFileToPlay(file);
        advanceMediaPlayer.playAdvancedFormat(advancedFormat);
    }
}
