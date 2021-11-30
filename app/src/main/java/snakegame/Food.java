package snakegame;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Food extends Rectangle{
    private int posX;
    private int posY;

    public Food(int x, int y) {
        super(Block.blockSize, Block.blockSize);
        this.posX = x;
        this.posY = y;

        setTranslateX(posX * Block.blockSize);
        setTranslateX(posY * Block.blockSize);

        setFill(Color.GREEN);
        setStroke(Color.BLACK);
    }


}
