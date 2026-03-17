package Bridge;

import java.util.Scanner;

public class Customer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What payment type do ytou prefer?\n CreditCard\n:");
        String ans= scanner.nextLine();

        Payment payment= PaymentFactory.createPayment(ans,new MobilePaymentPlatform());
        payment.process(100);

    }
}
