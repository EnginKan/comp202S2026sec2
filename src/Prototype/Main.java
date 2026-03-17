package Prototype;

public class Main {

    public static void main(String[] args) {
        Robot robot1 =new Robot("Robot1","Honda","1XXV");
       //Robot robot2= robot1;
        Robot robot2= robot1.clone();

        System.out.println(robot1 == robot2);
    }

}
