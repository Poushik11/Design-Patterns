public abstract class RemoteControl{
    protected TV implementor;
    protected RemoteControl(TV tv){
        this.implementor = tv;
    }
    public void on(){
        implementor.ON();
    }
    public void off(){
        implementor.OFF();
    }
    public void setChannel(int channel){
        implementor.tuneChannel(channel);
    }
}