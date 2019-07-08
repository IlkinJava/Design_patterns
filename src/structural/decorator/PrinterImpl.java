package structural.decorator;

public class PrinterImpl implements Printer {

    private String value;

    public PrinterImpl(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}
