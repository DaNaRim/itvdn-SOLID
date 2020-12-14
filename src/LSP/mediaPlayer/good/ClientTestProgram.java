package LSP.mediaPlayer.good;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {

    public static void main(String[] args) {
        List<VideoMediaPlayer> allPlayers = new ArrayList<>();

        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new TorMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);
    }

    public static void playVideoInAllMediaPlayers(List<VideoMediaPlayer> allPlayers) {
        for (var player : allPlayers) {
            player.playVideo();
        }
    }
}
