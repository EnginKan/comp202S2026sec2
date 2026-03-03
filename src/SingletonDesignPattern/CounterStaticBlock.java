package SingletonDesignPattern;


import java.sql.SQLException;

//Static Block Initilization
public class CounterStaticBlock {

    private static CounterStaticBlock instance;

    static{
        try {
            //You may use some exception handling mechanism
            //where you cannot perform in eager initilazition
            //instantiation of the object also happens in compile time
            instance = new CounterStaticBlock();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    public static CounterStaticBlock getInstance(){
        return instance;
    }

}
