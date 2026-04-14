package State;

public class GameStateEngine {

    private Game game;

    public GameStateEngine(Game game) {
        this.game = game;
    }

    public void setGameState(String input) {
        if (input.equalsIgnoreCase("play") &&
                (game.getState() instanceof MenuState)
        )
            game.setState(StateTag.PLAY);

        else if (input.equalsIgnoreCase("f") &&
                (game.getState() instanceof PlayState))
            game.setState(StateTag.WIN);
        else if (input.equalsIgnoreCase("d") &&
                game.getState() instanceof PlayState)
            game.setState(StateTag.LOST);
        else if (input.equalsIgnoreCase("s")
                && (game.getState() instanceof PlayState
                || game.getState() instanceof LoseState))
            game.setState(StateTag.MENU);

        game.getState().update(game);

    }
}