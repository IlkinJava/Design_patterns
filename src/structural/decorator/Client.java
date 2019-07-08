package structural.decorator;

public class Client {

    public static void main(String[] args) {
        Printer printer = new PrinterImpl("VALUE");
        Printer printerWithQuoter = new QuotesPrinterDecorator(printer);
        Printer printerWithQuotersAndBrackets =
                new BracketPrinterDecorator(printerWithQuoter);

        printer.print();
        System.out.println("\n");
        printerWithQuoter.print();
        System.out.println("\n");
        printerWithQuotersAndBrackets.print();
    }
}
