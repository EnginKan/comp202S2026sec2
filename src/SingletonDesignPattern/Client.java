package SingletonDesignPattern;

public class Client {

    public static void main(String[] args) {
        Counter counter= Counter.getInstance();
        Counter counter1= Counter.getInstance();

        counter.increment();
        counter1.increment();
        System.out.println(counter);
        System.out.println(counter1);
    }
}
