package Bridge;

public class MobilePaymentPlatform implements  PaymentPlatform{
    @Override
    public void processPayment(double amount) {
        System.out.println("Mobile Payment:Payment complepted amount $"+amount);
    }
}
