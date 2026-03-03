package OCP;

public class Prestige implements CustomerStatus{
    @Override
    public double calculate(double amount) {
        return amount*0.2;
    }
}
