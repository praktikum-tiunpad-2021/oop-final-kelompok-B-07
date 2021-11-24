package snakegame;

import java.util.ArrayList;

public class Snake {
    ArrayList<Block> blocks = new ArrayList<Block>();

    public Block head;

    public Snake(int initLength, Field gameField){
        int ipx = gameField.getW() / 2;
        int ipy = gameField.getH() / 2;

        head = new Block(ipx, ipy, null);

        Block previous = head;

        for(int i = 1; i < initLength; i++){
            Block b = new Block(ipx+i, ipy, previous);
            blocks.add(b);
            previous = b;
        }
    }
}
