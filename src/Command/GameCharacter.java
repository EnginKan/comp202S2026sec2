package Command;

public class GameCharacter {

    private int x,y;

    public void move(int dx,int dy){

        x+=dx;
        y+=dy;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
