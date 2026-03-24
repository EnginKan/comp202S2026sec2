package Flyweight;

import java.util.Random;

public class Forest {

    public static void main(String[] args) {

        final int TREES=100;
        //generate x,y coordinates
        Random random=new Random();
        //random.setSeed(10000);

        for(int i=0;i<TREES;i++){

            Tree tree = new Tree(random.nextInt(1,200),
                    random.nextInt(1,200),
                    TreeInfoFactory.getInfo("t1","mese"));
            tree.draw();
        }
    }
}
