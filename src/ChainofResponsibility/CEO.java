package ChainofResponsibility;

public class CEO extends Employee{


    @Override
    public void processPayment(double amount) {
        if(amount>=20000)
            System.out.println("CEO:Payment is approved:"+ amount);
    }
}
