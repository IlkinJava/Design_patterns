package structural.bridge;

public class SamsungTv implements ITV {
    @Override
    public void on() {
        System.out.println("Samsung is turned on.");
    }
    @Override
    public void off() {
        System.out.println("Samsung is turned off.");
    }
    @Override
    public void switchChannel(int channel) {
        System.out.println("Samsung: channel - " + channel);
    }
}
