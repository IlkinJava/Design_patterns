package structural.bridge;

public class Main {
    public static void main(String[] args) {
        ITV tv = new SonyTv();
        LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
        lrc.setChannelKeyboard(100);
    }
}
