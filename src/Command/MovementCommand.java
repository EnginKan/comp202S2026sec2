package Command;

public abstract class MovementCommand {
     protected GameCharacter gameCharacter;

    public MovementCommand(GameCharacter gameCharacter) {
        this.gameCharacter = gameCharacter;
    }

    public MovementCommand(){
        gameCharacter=null;
    }

    public void setGameCharacter(GameCharacter gameCharacter) {
        this.gameCharacter = gameCharacter;
    }

    public abstract void doMovement();
}
