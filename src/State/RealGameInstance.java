package State;

import java.util.Scanner;

public class RealGameInstance {

    public static void main(String[] args) {

        Game game=new Game();
        GameStateEngine engine= new GameStateEngine(game);

        Scanner scanner= new Scanner(System.in);

        while (true){

            String input= scanner.nextLine();
            engine.setGameState(input);
        }


    }
}
