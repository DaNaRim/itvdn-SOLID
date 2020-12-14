package LSP.mediaPlayer.bad;

public class WinampMediaPlayer extends MediaPlayer {

    public void playVideo() {
        throw new VideoUnsupportedException();
    }
}
