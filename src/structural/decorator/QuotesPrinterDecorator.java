package structural.decorator;

public class QuotesPrinterDecorator implements Printer {
    private Printer printer;

    public QuotesPrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        System.out.print("\"");
        printer.print();
        System.out.print("\"");
    }
}
