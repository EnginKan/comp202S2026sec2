package TemplateMethod;

import java.io.PrintStream;

public class Knight implements  GameCharacter{


    private boolean attackMode=true;
    public boolean isOnAttack() {
        return attackMode;
    }

    @Override
    public boolean isOnDefence() {
        return !attackMode;
    }

    @Override
    public void attackOne() {
            System.out.println("Hurraaaa");
    }

    @Override
    public void attackTwo() {
        System.out.println("Attack on enemy!!!");

    }

    @Override
    public void defenseOne() {
     System.out.println("Guard myself");
    }

    @Override
    public void defenseTwo() {
        System.out.println("Wait!!!");
    }
}
