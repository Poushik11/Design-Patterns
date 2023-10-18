
public class Remote extends RemoteControl{
    private int currentChannel;
    Remote(TV tv, int channel){
        super(tv);
        this.currentChannel=channel;
    }

    public void nextChannel(){
        currentChannel++;
        setChannel(currentChannel);
    }
    public void prevChannel(){
        currentChannel--;
        setChannel(currentChannel);
    }
}
