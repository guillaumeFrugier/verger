package leverger.scene;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import leverger.modele.*;
import leverger.utils.ImageJeux;
import leverger.utils.VariablePlateau;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Plateau {

    private BackgroundImage arrierPlanImage;
    private Background arrierePlan;
    private Pane fond;

    private Scene scene;

    private ImageJeux imageJeux;


    private VariablePlateau variablePlateau;
    private List<ImageView> panier;

    private ImageView des;


    //les fruits
    private Fruit pomme;
    private Fruit poire;
    private Fruit prune;
    private Fruit cerise;

    public Plateau() throws FileNotFoundException {


        this.fond = new Pane();

        this.imageJeux = new ImageJeux();

        this.variablePlateau = new VariablePlateau();

        this.arrierPlanImage = new BackgroundImage(imageJeux.getArrierePlan(), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
        this.arrierePlan = new Background(this.arrierPlanImage);

        this.pomme = new Pomme(imageJeux.getPomme());
        this.poire = new Poire(imageJeux.getPoire());
        this.prune = new Prune(imageJeux.getPrune());
        this.cerise = new Cerise(imageJeux.getCerise());



        this.scene = new Scene(this.fond, 1300,900);
    }



    private void placageDesFruits(){

        for (int i = 0; i < 10; i++) {
            this.poire.getAffichageFruit().get(i).setX(variablePlateau.getCoordonneXPoire());
            this.poire.getAffichageFruit().get(i).setY(variablePlateau.getCoordonneYPoire());
            variablePlateau.setCordonnePoire();

            this.pomme.getAffichageFruit().get(i).setX(variablePlateau.getCoordonneXPomme());
            this.pomme.getAffichageFruit().get(i).setY(variablePlateau.getCoordonneYPomme());
            variablePlateau.setCordonnePomme();

            this.prune.getAffichageFruit().get(i).setX(variablePlateau.getCoordonneXPrune());
            this.prune.getAffichageFruit().get(i).setY(variablePlateau.getCoordonneYPrune());
            variablePlateau.setCordonnePrune();

            this.cerise.getAffichageFruit().get(i).setX(variablePlateau.getCoordonneXCerise());
            this.cerise.getAffichageFruit().get(i).setY(variablePlateau.getCoordonneYCerise());
            variablePlateau.setCoordonneCerise();
        }

    }


    private void evenementPlateau(){
        for (int i = 0; i < 10; i++) {
            //poire
            poire.getAffichageFruit().get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    poire.getAffichageFruit().get(variablePlateau.getPositionPoire()).setVisible(false);
                    variablePlateau.ajoutEnPositionPoire();

                }
            });


            poire.getAffichageFruit().get(i).setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        poire.getAffichageFruit().get(j).setFitWidth(70);
                        poire.getAffichageFruit().get(j).setFitHeight(70);
                    }
                }
            });
            poire.getAffichageFruit().get(i).setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        poire.getAffichageFruit().get(j).setFitWidth(64);
                        poire.getAffichageFruit().get(j).setFitHeight(64);
                    }
                }
            });
            //pomme
            pomme.getAffichageFruit().get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    pomme.getAffichageFruit().get(variablePlateau.getPositionPomme()).setVisible(false);
                    variablePlateau.ajoutEnPositionPomme();
                }
            });
            pomme.getAffichageFruit().get(i).setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        pomme.getAffichageFruit().get(j).setFitWidth(70);
                        pomme.getAffichageFruit().get(j).setFitHeight(70);
                    }
                }
            });
            pomme.getAffichageFruit().get(i).setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        pomme.getAffichageFruit().get(j).setFitWidth(64);
                        pomme.getAffichageFruit().get(j).setFitHeight(64);
                    }
                }
            });

            //prune
            prune.getAffichageFruit().get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    prune.getAffichageFruit().get(variablePlateau.getPositionPrune()).setVisible(false);
                    variablePlateau.ajoutEnPositionPrune();
                }
            });
            prune.getAffichageFruit().get(i).setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        prune.getAffichageFruit().get(j).setFitWidth(70);
                        prune.getAffichageFruit().get(j).setFitHeight(70);
                    }
                }
            });
            prune.getAffichageFruit().get(i).setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        prune.getAffichageFruit().get(j).setFitWidth(64);
                        prune.getAffichageFruit().get(j).setFitHeight(64);
                    }
                }
            });

            //cerise
            cerise.getAffichageFruit().get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    cerise.getAffichageFruit().get(variablePlateau.getPositionCerise()).setVisible(false);
                    variablePlateau.ajoutEnPositionCerise();
                }
            });

            cerise.getAffichageFruit().get(i).setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        cerise.getAffichageFruit().get(j).setFitWidth(70);
                        cerise.getAffichageFruit().get(j).setFitHeight(70);
                    }
                }
            });
            cerise.getAffichageFruit().get(i).setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        cerise.getAffichageFruit().get(j).setFitWidth(64);
                        cerise.getAffichageFruit().get(j).setFitHeight(64);
                    }
                }
            });
        }
    }
    public Scene plateauInitialisation(){
        placageDesFruits();
        evenementPlateau();
        for (int i = 0; i < 10; i++) {
            this.fond.getChildren().add(poire.getAffichageFruit().get(i));
            this.fond.getChildren().add(pomme.getAffichageFruit().get(i));
            this.fond.getChildren().add(prune.getAffichageFruit().get(i));
            this.fond.getChildren().add(cerise.getAffichageFruit().get(i));
        }

        this.fond.setBackground(this.arrierePlan);
        return scene;
    }


}
