public class MP4player implements AdvMediaPlayer{
    @Override
    public void playVlc(String audioType, String fileName) {
        System.out.println("I cannot play VLC files "+fileName);
    }

    @Override
    public void playMp4(String audioType, String fileName) {
        System.out.println("I can play MP4 files "+fileName);
    }
}
