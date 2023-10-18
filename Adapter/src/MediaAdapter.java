public class MediaAdapter implements MediaPlayer{
    AdvMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){

        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VLCplayer();

        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new MP4player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc("vlc",fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4("mp4",fileName);
        }
    }
}
