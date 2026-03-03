package SingletonDesignPattern;
/**Eager implementation of Singleton Design pattern*/
public class Counter {
    //the only instance field of the class is reachable
    private static Counter c=new Counter();
    private int counter;

    private  Counter(){
        this.counter=0;
    }

    public static Counter getInstance(){
        return c;
    }

    public void increment(){
        counter++;
    }
    public void decrement(){
        counter--;
    }
}
