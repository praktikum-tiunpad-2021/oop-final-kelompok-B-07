package snakegame;

import java.util.ArrayList;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Field extends Pane{
    private int w;
    private int h;

    ArrayList<Block> blocks = new ArrayList<Block>();
    Snake s;

    public Field(int width, int height){
        w = width;
        h = height;

        setMinSize(w * Block.blockSize, h * Block.blockSize);
        setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, null, null)));
        setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
    }

    public void addSnake(Snake s){
        this.s = s;
        for(Block b:s.blocks){
            addBlock(b);
        }
    }

    private void addBlock(Block b){
        getChildren().add(b);
        blocks.add(b);
    }

    public int getW(){
        return w;
    }

    public int getH(){
        return h;
    }
}
