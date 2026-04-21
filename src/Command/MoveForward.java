package Command;

public class MoveForward extends MovementCommand{
    public MoveForward() {
        super();
    }

    @Override
    public void doMovement() {
        gameCharacter.move(1,0);
    }
}
