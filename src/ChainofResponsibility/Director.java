package ChainofResponsibility;

public class Director extends Employee{
    @Override
    public void processPayment(double amount) {
        if(amount>=20000)
            next.processPayment(amount);
        else
            System.out.println("dırector: Payment is approved:"+ amount);
    }
}
