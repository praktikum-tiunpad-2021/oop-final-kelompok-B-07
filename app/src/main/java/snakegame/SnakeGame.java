package snakegame;

// import javafx.application.Application;
// import javafx.geometry.Insets;
// import javafx.scene.image.Image;
// import javafx.scene.input.KeyCode;
// import javafx.stage.Stage;
// import javafx.scene.Scene;
// import javafx.scene.layout.VBox;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
//import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.scene.Scene;
//import javafx.scene.control.Alert;
import javafx.scene.control.Label;
//import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class SnakeGame extends Application{

    private int width = 100;
    private int height = 100;
    private long then = System.nanoTime();
    private int spd = 5;
    private boolean isRunning = false;
    private Field gameField;
    

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        gameField = new Field(width, height);
      
        Text text = new Text();
        text.setText("Tekan SPACEBAR untuk play/pause");
        text.setFont(Font.font("tahoma", 16));
        Label score = new Label("Score: 0");
        score.setFont(Font.font("tahoma", 16));

        gameField.addSnake(new Snake(Snake.initL, gameField));

        AnimationTimer timer = new AnimationTimer() {
            public void handle(long now) {
                if (now - then > 1000000000 / spd) {
                    if (isRunning == true) {
                        gameField.update();
                        then = now;
                        score.setText("Score: " + gameField.getScore());
                    }
                }
            }
        };
        timer.start();
        
        root.getChildren().addAll(gameField, text, score);
        Scene scene = new Scene(root);

        // game logic game event
        scene.setOnKeyPressed(e -> {
            if (e.getCode().equals(KeyCode.UP) && gameField.snake.getDirection() != MyDirection.DOWN) {
                gameField.snake.setDirection(MyDirection.UP);
            }
            if (e.getCode().equals(KeyCode.DOWN) && gameField.snake.getDirection() != MyDirection.UP) {
                gameField.snake.setDirection(MyDirection.DOWN);
            }
            if (e.getCode().equals(KeyCode.LEFT) && gameField.snake.getDirection() != MyDirection.RIGHT) {
                gameField.snake.setDirection(MyDirection.LEFT);
            }
            if (e.getCode().equals(KeyCode.RIGHT) && gameField.snake.getDirection() != MyDirection.LEFT) {
                gameField.snake.setDirection(MyDirection.RIGHT);
            }
            if (e.getCode().equals(KeyCode.SPACE)) {
                if (isRunning == true) {
                    isRunning = false;
                } else {
                    isRunning = true;
                }
            }
            if (e.getCode().equals(KeyCode.SHIFT)){
                spd = 10;
            }
        });

        scene.setOnKeyReleased(e ->{
            if (e.getCode().equals(KeyCode.SHIFT)){
                spd = 5;
            }
        });

        primaryStage.setTitle("Game Ular wuswus");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("icon.png"));
        primaryStage.show();

    }
}
