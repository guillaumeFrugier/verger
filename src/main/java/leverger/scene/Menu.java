package leverger.scene;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import leverger.utils.ImageMenu;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import leverger.utils.VariablePlateau;

import javax.swing.text.Element;

import java.io.FileNotFoundException;

public class Menu {
    //widget
    private BorderPane fond;
    private VBox boutonOrganisation;
    private Scene scene;
    private ImageView boutonDebut;
    private ImageView boutonQuitter;
    //multijoueur
    private TextField joueur1;
    private TextField joueur2;
    private TextField joueur3;
    private VBox containerTextfield;

    private Label erreurJoueur;

    //autres variables
    private VariablePlateau variablePlateau;

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

        this.containerTextfield = new VBox();

        this.boutonDebut = new ImageView(imageMenu.getBoutonDebut());
        boutonDebut.setFitWidth(250);
        boutonDebut.setFitHeight(100);

        //multijoueur
        this.joueur1 = new TextField();
        this.joueur2 = new TextField();
        this.joueur3 = new TextField();
        this.erreurJoueur = new Label("entrez au moins deux nom pour commencez");


        //arriere plan du menu
        this.fondImage = new BackgroundImage(imageMenu.getArrierePlanMenu(), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
        this.arrierePlan = new Background(this.fondImage);
        //arriere plan bouton
        this.fondBoutonDebut = new BackgroundImage(imageMenu.getBoutonDebut(), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
        this.arrierPlanBoutonDebut = new Background(this.fondBoutonDebut);



    }


    public Scene initialisation() {


        this.fond.setBackground(this.arrierePlan);
        this.fond.setCenter(this.boutonDebut);

        this.joueur1.setMaxWidth(150);
        this.joueur2.setMaxWidth(150);
        this.joueur3.setMaxWidth(150);
        this.erreurJoueur.setVisible(false);
        this.erreurJoueur.setTextFill(Color.RED);
        this.erreurJoueur.setFont(new Font("Arial",25));


        this.containerTextfield.getChildren().addAll(this.erreurJoueur,this.joueur1, this.joueur2, this.joueur3);
        this.containerTextfield.setAlignment(Pos.CENTER);
        this.fond.setBottom(this.containerTextfield);

        return scene;
    };




    public void sceneSuivante(Stage stage, Plateau plateau){
        this.boutonDebut.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (joueur1.getText().isEmpty() && joueur2.getText().isEmpty()){
                    erreurJoueur.setVisible(true);
                }else{
                    stage.setScene(plateau.plateauInitialisation(joueur1.getText(), joueur2.getText(), joueur3.getText()));
                }

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
