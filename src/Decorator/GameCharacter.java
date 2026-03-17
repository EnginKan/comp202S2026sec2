package Decorator;

public class GameCharacter implements Iplayer{
    @Override
    public void attack() {
        System.out.println("Attack on enemy");
    }

    @Override
    public void defense() {
      System.out.println("Defense the gate");
    }

    @Override
    public void run() {
        System.out.println("Hurraaaa");

    }
}
