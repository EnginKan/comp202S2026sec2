package Flyweight;
//This is flyweight tahat includes information common for specitc type-name trees
public class TreeInfo {
    //intrinsic properties
    private String name,type;

    public TreeInfo(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void draw(int x, int y){
        System.out.println("("+name+"-"+type+")->("+x+","+y+")");
    }
}
