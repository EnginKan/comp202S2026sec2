package TemplateMethod;

public interface GameCharacter {


    public boolean isOnAttack();
    public boolean isOnDefence();

    public void attackOne();
    public void attackTwo();


    public void defenseOne();
    public void defenseTwo();

    //template Method

    public default void comboAction(){
        if(isOnAttack()){
            attackOne();
            attackTwo();
        }
        else if (isOnDefence()){
            defenseOne();
            defenseTwo();
        }
            }


}
