package Flyweight;

public class Tree {

    //define extrinsic properties
    int x,y;
    private TreeInfo info;//flweight-fine grained object coomon for all tree

    public Tree(int x, int y, TreeInfo info) {
        this.x = x;
        this.y = y;
        this.info = info;
    }

    public void draw(){
        info.draw(this.x,this.y);

    }
}
