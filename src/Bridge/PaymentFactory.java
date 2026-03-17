package Bridge;

public class PaymentFactory {

    public static  Payment createPayment(String type, PaymentPlatform platform){
        if(type.equalsIgnoreCase("CreditCard"))
           return new CreditCard(platform);
        else
            return null;


    }
}
