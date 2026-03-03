package OCP;

public class DiscountCalculator {
    /*
    public double calculateDiscount(String customerStatus,
                                    double amount) {

        if (customerStatus.equals("NEW")) {
            return amount * 0.15;
        } else if (customerStatus.equals("PRESTIGE")) {
            return amount * 0.2;
        } else if (customerStatus.equals("HIGHPRESTIGE")) {
            return amount * 0.25;
        } else
            return 0.0;
    }
    */

    public static double calculateDiscount(CustomerStatus status,
                                    double amount){
        return status.calculate(amount);
    }
}
