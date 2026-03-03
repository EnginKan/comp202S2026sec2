package DIP;

public class EmailSender implements Sender{

    public void send(Invoice invoice){
        //TODO
        System.out.println("Email:"+ invoice);
    };
}
