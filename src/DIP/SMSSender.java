package DIP;

public class SMSSender implements Sender{
    @Override
    public void send(Invoice invoice) {
        System.out.println("SMS"+invoice);
    }
}
