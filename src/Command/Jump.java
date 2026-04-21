package Command;

public class Jump extends  MovementCommand{
    public Jump() {
        super();
    }

    @Override
    public void doMovement() {
        gameCharacter.move(0,1);
    }
}
