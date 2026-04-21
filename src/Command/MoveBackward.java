package Command;

public class MoveBackward extends MovementCommand{
    public MoveBackward() {
        super();
    }

    @Override
    public void doMovement() {
        gameCharacter.move(-1,0);
            }
}
