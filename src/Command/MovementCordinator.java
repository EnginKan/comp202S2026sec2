package Command;

import java.util.HashMap;
import java.util.Map;

public class MovementCordinator {

    private static Map<MovementType, MovementCommand> movementPool=
            new HashMap<MovementType, MovementCommand>();

    public static void getRequest(GameCharacter gameCharacter,
                                  MovementType movementType){

        if(!movementPool.containsKey(movementType)){
            MovementCommand command=null;
            switch ((movementType)){
                case JUMP -> command=new Jump();
                case FORWARD -> command=new MoveForward();
                case BACkWARD -> command = new MoveBackward();

            }
            movementPool.put(movementType,command);

        }
        MovementCommand command=movementPool.get(movementType);
        command.setGameCharacter(gameCharacter);
        command.doMovement();


    }

}
