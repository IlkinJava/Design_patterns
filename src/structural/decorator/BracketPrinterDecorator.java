package structural.decorator;

public class BracketPrinterDecorator implements Printer {
    private Printer printer;

    public BracketPrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        System.out.print("[");
        printer.print();
        System.out.print("]");
    }
}
