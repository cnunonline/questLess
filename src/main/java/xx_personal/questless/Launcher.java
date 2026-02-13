package xx_personal.questless;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import xx_personal.questless.util.FxmlHandler;

public class Launcher extends Application {
    @Override
    public void start(Stage stage) {
        Scene scene = FxmlHandler.loadScene("main.fxml");
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}