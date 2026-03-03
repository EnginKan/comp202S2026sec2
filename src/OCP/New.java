package OCP;

public class New implements CustomerStatus{

    @Override
    public double calculate(double amount) {
        return 0.15*amount;
    }
}
