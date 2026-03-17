package Decorator;

public class Arrower extends CharacterDecorator{
    public Arrower(Iplayer character) {
        super(character);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("10 Arrows are thrown");
    }
}
