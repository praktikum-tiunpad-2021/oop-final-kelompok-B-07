package snakegame;

import javafx.scene.shape.Rectangle;

public class Block extends Rectangle{
    int posX;
    int posY;
    int oldPosX;
    int oldPosY;
    Block previous;

    public Block(int x, int y, Block p){
        super(SnakeGame.block_size, SnakeGame.block_size);
        posX = x;
        posY = y;

        setTranslateX(posX * SnakeGame.block_size);
        setTranslateY(posY * SnakeGame.block_size);
    }
}
