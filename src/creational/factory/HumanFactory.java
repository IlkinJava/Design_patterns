package creational.factory;

public class HumanFactory {
    public static Human createHuman(String m) {
        Human h = null;
        if (m.equals("boy")) {
            h = new Boy();
        } else if (m.equals("girl")) {
            h = new Girl();
        }
        return h;
    }
}

