package fr.leverger.application;

import fr.leverger.scene.Menu;
import fr.leverger.utils.GestionDeScene;
import javafx.stage.Stage;

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
