package DIP;

public class Invoice {


    public void sendInvoice(Sender sender){
        sender.send(this);
    }

    @Override
    public String toString() {
        return "Invoice";
    }
}
