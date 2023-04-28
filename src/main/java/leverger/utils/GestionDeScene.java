package leverger.utils;

import leverger.scene.Menu;
import javafx.stage.Stage;
import leverger.scene.Plateau;

import java.io.FileNotFoundException;

public class GestionDeScene {
    private Menu menu;
    private Plateau plateau;
    private Stage stage;

    public GestionDeScene(Stage stage) throws FileNotFoundException {
        this.stage = stage;
        this.menu = new Menu();
        this.plateau = new Plateau();
    }

    public void debut(){
        this.stage.setScene(this.menu.initialisation());
        this.menu.sceneSuivante(stage,plateau);
        this.stage.show();
    }
}
