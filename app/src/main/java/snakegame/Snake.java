package snakegame;

import java.util.ArrayList;
import javafx.scene.paint.*;

public class Snake {
    public static int initL = 5;
    private ArrayList<Block> blocks = new ArrayList<Block>();
    private Block head;
    private Block tail;
    private Field gameField;

    public Snake(int initLength, Field gameField){
        this.gameField = gameField;
        int ipx = gameField.getW() / 2;
        int ipy = gameField.getH() / 2;

        head = new Block(ipx, ipy, null);
        head.setFill(Color.RED);
        blocks.add(head);

        tail = head;

        for(int i = 1; i < initLength; i++){
            Block b = new Block(ipx+i, ipy, tail);
            blocks.add(b);
            tail = b;
        }
        
    }

    public MyDirection getDirection(){
        return head.getDirection();
    }

    public void setDirection(MyDirection d){
        head.setDirection(d);
    }

    public ArrayList<Block> getBlocks() {
        return this.blocks;
    }

}
