package State;

public class WinState extends GameState{
    @Override
    public void update(Game game) {
        System.out.println("You win");
    }
}
