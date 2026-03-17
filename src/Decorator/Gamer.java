package Decorator;

import java.util.Scanner;

public class Gamer {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        Iplayer character=new GameCharacter();

        System.out.println("Game start...");
        //Game loop
        while(true){

            System.out.println("Enter command(Attack, Defense, Run:");
            String command = scanner.nextLine();
            if(command.equalsIgnoreCase("attack"))
                character.attack();
            else if (command.equalsIgnoreCase("defense"))
                character.defense();
            else if (command.equalsIgnoreCase("run"))
                character.run();
            String target=Math.random()<0.5? "horse":"arrow";
            System.out.println("You face with:"+ target);
            System.out.println("Collect?->Yes/No");
            String ans= scanner.nextLine();
            if(ans.equalsIgnoreCase("yes")) {

                character = target.equalsIgnoreCase("horse")
                        ? new HorseRider(character): new Arrower(character);

                            }
                    }

    }
}
