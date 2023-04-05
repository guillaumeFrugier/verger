package leverger.application;

import leverger.scene.Menu;
import leverger.utils.GestionDeScene;
import javafx.stage.Stage;
import leverger.utils.GestionDeScene;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GestionDeScene gestionDeScene = new GestionDeScene(primaryStage);
        gestionDeScene.debut();
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
