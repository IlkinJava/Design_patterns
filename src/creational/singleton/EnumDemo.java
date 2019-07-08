package creational.singleton;

public class EnumDemo {


    public static void main(String[] args) {

        Sing.INSTANCE.setCount(1);
        Sing.INSTANCE.setCount(2);
        Sing.INSTANCE.doProcess();
        Sing.INSTANCE.doProcess();
        Sing.INSTANCE.doProcess();
    }
}
