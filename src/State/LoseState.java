package State;

public class LoseState extends GameState{
    @Override
    public void update(Game game) {
        System.out.println("You Lost");
    }
}
