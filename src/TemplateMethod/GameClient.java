package TemplateMethod;

public class GameClient {

    public static void main(String[] args) {

        GameCharacter gameCharacter= new Knight();

        gameCharacter.comboAction();
    }
}
