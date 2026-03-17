package Builder;

import java.util.List;

public class GameCharacter {

    private String playerName;
    private int healthLevel;
    private int manaLevel;
    private List<String> items;

    private GameCharacter(CharacterBuilder builder){
        this.healthLevel=builder.healthLevel;
        this.items= builder.items;
        this.manaLevel= builder.manaLevel;
        this.playerName=builder.playerName;

    }

    public static class CharacterBuilder{
        private String playerName;
        private int healthLevel;
        private int manaLevel;
        private List<String> items;

        //Define no-args constructor in builder
        public CharacterBuilder(){}

        public CharacterBuilder playerName(String name){
            this.playerName=name;
            return this;
        }
        public CharacterBuilder healthLevel(int health){
            this.healthLevel=health;
            return this;
        }

        public CharacterBuilder manaLevel(int mana){
            this.manaLevel=mana;
            return this;
        }
        public CharacterBuilder items(List<String> items){
            this.items=items;
            return this;
        }
        //This method build an object from GameCharacter class
        public GameCharacter build(){
            if(this.playerName==null || this.playerName.length()==0)
                throw new IllegalArgumentException("Player name cannot be null or empty");
            return new GameCharacter(this);
        }


    }
}
