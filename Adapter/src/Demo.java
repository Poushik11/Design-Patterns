
public class Demo {
    public static void main(String[] args) {

        MediaPlayer Player = new AudioPlayer();

        Player.play("mp3", "beyond the horizon.mp3");
        Player.play("mp4", "alone.mp4");
        Player.play("vlc", "far far away.vlc");
        Player.play("avi", "mind me.avi");
    }


}