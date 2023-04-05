package leverger.scene;

import leverger.utils.ImageMenu;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

import java.io.FileNotFoundException;

public class Menu {
    //widget
    private BorderPane fond;
    private Scene scene;
    private Button boutonDebut;
    //gestion des images
    private ImageMenu imageMenu;
    //arriere plan du menu
    private BackgroundImage fondImage;
    private Background arrierePlan;
    //arriere plan bouton
    private BackgroundImage fondBouton;
    private Background boutonImage;



    public Menu() throws FileNotFoundException {
        //widget
        this.fond = new BorderPane();
        this.scene = new Scene(this.fond,800,800);
        this.boutonDebut = new Button("debut");
        //gestion des images
        this.imageMenu = new ImageMenu();

        //arriere plan du menu
        this.fondImage = new BackgroundImage(imageMenu.getArrierePlanMenu(), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
        this.arrierePlan = new Background(this.fondImage);
        //arriere plan bouton
        this.fondBouton = new BackgroundImage(imageMenu.getBoutonDebut(), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
        this.boutonImage = new Background(this.fondBouton);

    }

    public Scene initialisation(){
        this.boutonDebut.setBackground(this.boutonImage);
        this.boutonDebut.setMinHeight(100);
        this.boutonDebut.setMinWidth(500);
        this.fond.setBackground(this.arrierePlan);
        this.fond.setCenter(this.boutonDebut);
        return scene;
    };
}
