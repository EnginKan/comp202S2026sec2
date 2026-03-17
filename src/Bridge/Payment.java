package Bridge;

public abstract class Payment {

    private PaymentPlatform platform;

    public Payment(PaymentPlatform platform){
        this.platform=platform;
    }

    public void process(double amount){
        platform.processPayment(amount);
    }

}
