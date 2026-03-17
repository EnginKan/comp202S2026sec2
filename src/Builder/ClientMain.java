package Builder;

import java.util.List;

public class ClientMain {

    public static void main(String[] args) {

        GameCharacter gc1=new GameCharacter.CharacterBuilder()
                .healthLevel(100)
                .manaLevel(50)
                .items(List.of(
                        "Knife",
                        "Rifle"
                ))
                .build();
        GameCharacter gc2= new GameCharacter.CharacterBuilder()
                .items(List.of(
                        "Bomb"
                ))
                .healthLevel(80)
                .playerName("Kamikaze")
                .build();

    }
}
