package Decorator;

public class HorseRider extends CharacterDecorator{
    public HorseRider(Iplayer character) {
        super(character);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("The horse run");
    }
}
