package snakegame;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class SnakeGame extends Application{

    private int width = 100;
    private int height = 100;
    private int il = 5;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        Field gameField = new Field(width, height);
        gameField.addSnake(new Snake(il, gameField));
        root.getChildren().add(gameField);
        Scene scene = new Scene(root);

        primaryStage.setTitle("Game Ular wuswus");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("icon.png"));
        primaryStage.show();
    }
}
