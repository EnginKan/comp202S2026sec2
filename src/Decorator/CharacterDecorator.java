package Decorator;

public abstract class CharacterDecorator implements Iplayer {

    private Iplayer peer;

    public CharacterDecorator(Iplayer character){
        this.peer=character;
    }



    @Override
    public void attack() {
         peer.attack();
             }

    @Override
    public void defense() {
         peer.defense();
    }

    @Override
    public void run() {
        peer.run();
    }
}
