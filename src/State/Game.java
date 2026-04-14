package State;

import java.util.HashMap;
import java.util.Map;

public class Game {

    private GameState state;

    private Map<StateTag,GameState> states;

    public Game(){
        states=new HashMap<StateTag, GameState>();
        states.put(StateTag.MENU,new MenuState());
        states.put(StateTag.PLAY,new PlayState());
        states.put(StateTag.LOST,new LoseState());
        states.put(StateTag.WIN,new WinState());

        state=states.get(StateTag.MENU);
    }

    public void setState(StateTag tag) {
        this.state = states.get(tag);
    }

    public GameState getState() {
        return state;
    }
}
