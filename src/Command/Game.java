package Command;

public class Game
{

    public static void main(String[] args) {
        GameCharacter gameCharacter= new GameCharacter();
        GameCharacter gameCharacter2= new GameCharacter();

        System.out.println("Before:"+ gameCharacter.toString());
        MovementCordinator.getRequest(gameCharacter,MovementType.FORWARD);
        MovementCordinator.getRequest(gameCharacter,MovementType.JUMP);
        System.out.println("After:"+ gameCharacter.toString());
        MovementCordinator.getRequest(gameCharacter2,MovementType.FORWARD);
        System.out.println("After:"+ gameCharacter.toString());
        System.out.println("After GC2:"+ gameCharacter2.toString());
    }
}
