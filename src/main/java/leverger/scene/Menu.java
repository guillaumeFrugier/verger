package leverger.scene;

import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import leverger.utils.ImageMenu;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

import javax.swing.text.Element;

import java.io.FileNotFoundException;

public class Menu {
    //widget
    private BorderPane fond;
    private VBox boutonOrganisation;
    private Scene scene;
    private ImageView boutonDebut;
    private ImageView boutonQuitter;
    //gestion des images
    private ImageMenu imageMenu;
    //arriere plan du menu
    private BackgroundImage fondImage;
    private Background arrierePlan;
    //arriere plan bouton
    private BackgroundImage fondBoutonDebut;

    private Background arrierPlanBoutonDebut;





    public Menu() throws FileNotFoundException {
        //gestion des images
        this.imageMenu = new ImageMenu();
        //widget
        this.fond = new BorderPane();
        this.boutonOrganisation = new VBox();
        this.scene = new Scene(this.fond,1300,900);
        this.boutonDebut = new ImageView(imageMenu.getBoutonDebut());
        boutonDebut.setFitWidth(250);
        boutonDebut.setFitHeight(100);

        //arriere plan du menu
        this.fondImage = new BackgroundImage(imageMenu.getArrierePlanMenu(), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
        this.arrierePlan = new Background(this.fondImage);
        //arriere plan bouton
        this.fondBoutonDebut = new BackgroundImage(imageMenu.getBoutonDebut(), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
        this.arrierPlanBoutonDebut = new Background(this.fondBoutonDebut);

    }

    public Scene initialisation(){


        this.fond.setBackground(this.arrierePlan);
        this.fond.setCenter(this.boutonDebut);

        return scene;
    };




    public void sceneSuivante(Stage stage, Plateau plateau){
        this.boutonDebut.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage.setScene(plateau.plateauInitialisation());
            }
        });
        this.boutonDebut.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                boutonDebut.setFitWidth(260);
                boutonDebut.setFitHeight(110);
            }
        });
        this.boutonDebut.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                boutonDebut.setFitWidth(250);
                boutonDebut.setFitHeight(100);
            }
        });


    }
}
