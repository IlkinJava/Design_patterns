package creational.singleton;

public enum Sing {
    INSTANCE;

    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public void doProcess() {
        System.out.println("Do high memory or CPU consume operation. count :- " + this.count);
    }
}
