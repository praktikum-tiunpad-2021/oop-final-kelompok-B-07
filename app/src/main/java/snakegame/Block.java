package snakegame;

import javafx.scene.shape.Rectangle;

public class Block extends Rectangle{
    public static int blockSize = 5;
    public int posX;
    public int posY;
    public int oldPosX;
    public int oldPosY;
    public Block previous;

    public Block(int x, int y, Block p){
        super(blockSize, blockSize);
        posX = x;
        posY = y;

        setTranslateX(posX * blockSize);
        setTranslateY(posY * blockSize);
    }
}
