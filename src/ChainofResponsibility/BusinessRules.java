package ChainofResponsibility;

public class BusinessRules {

    public static void main(String[] args) {
        Employee employee1=new Director();
        Employee employee2=new Manager();
        Employee employee3=new CEO();
        //create responsibility chain
        employee2.setNext(employee1);
        employee1.setNext(employee3);


        employee2.processPayment(30000);
        employee2.processPayment(15000);
        employee2.processPayment(8000);


    }
}
