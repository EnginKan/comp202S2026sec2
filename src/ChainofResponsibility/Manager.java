package ChainofResponsibility;

public class Manager extends Employee{

    @Override
    public void processPayment(double amount) {
        if(amount<10000)
            System.out.println("Manager:Payment is approved:"+amount);
        else
            next.processPayment(amount);
    }
}
