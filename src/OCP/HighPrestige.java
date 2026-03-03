package OCP;

public class HighPrestige  implements CustomerStatus{

    @Override
    public double calculate(double amount) {
        return 0.25*amount;
    }


}
