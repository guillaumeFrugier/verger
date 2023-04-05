package leverger.utils;

import leverger.scene.Menu;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class GestionDeScene {
    private Menu menu;

    private Stage stage;

    public GestionDeScene(Stage stage) throws FileNotFoundException {
        this.stage = stage;
        this.menu = new Menu();
    }

    public void debut(){
        this.stage.setScene(this.menu.initialisation());
        this.stage.show();
    }
}
