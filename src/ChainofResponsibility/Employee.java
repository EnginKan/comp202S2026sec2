package ChainofResponsibility;

public abstract class Employee {

    protected Employee next;

    public void setNext(Employee next) {
        this.next = next;
    }

    public abstract void processPayment(double amount);
}
