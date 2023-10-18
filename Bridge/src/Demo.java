
public class Demo {
    public static void main(String[] args) {
        RemoteControl remoteControl = new Remote(new PhillipsTv(),1);
        remoteControl.on();
        remoteControl.off();
        remoteControl.setChannel(443);
    }
}
