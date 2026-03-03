package DIP;

public class Main {
    public static void main(String[] args) {

        Invoice invoice = new Invoice();

        invoice.sendInvoice(new EmailSender());
        invoice.sendInvoice(new SMSSender());
    }
}
