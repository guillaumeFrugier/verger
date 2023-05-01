package leverger.scene;

import java.io.FileNotFoundException;
import java.util.List;

import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import leverger.modele.fruit.Cerise;
import leverger.modele.fruit.Fruit;
import leverger.modele.fruit.Poire;
import leverger.modele.fruit.Pomme;
import leverger.modele.fruit.Prune;
import leverger.utils.ImageJeux;
import leverger.utils.VariablePlateau;
import leverger.utils.evenement.EvenementCerise;
import leverger.utils.evenement.EvenementPoire;
import leverger.utils.evenement.EvenementPomme;
import leverger.utils.evenement.EvenementPrune;

public class Plateau {

    private BackgroundImage arrierPlanImage;
    private Background arrierePlan;
    private Pane fond;

    private Scene scene;

    private ImageJeux imageJeux;


    private VariablePlateau variablePlateau;
    private List<ImageView> panier;
    
    //le Dé
    private De de;

    //les fruits
    private Fruit pomme;
    private Fruit poire;
    private Fruit prune;
    private Fruit cerise;

    //evenement
    private EvenementCerise evenementCerise;
    private EvenementPomme evenementPomme;
    private EvenementPrune evenementPrune;
    private EvenementPoire evenementPoire;


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
        
        this.de = new De(50);
        this.de.setX(550);
        this.de.setY(50);

        this.evenementCerise = new EvenementCerise((Cerise) this.cerise);
        this.evenementPomme = new EvenementPomme((Pomme) this.pomme);
        this.evenementPoire = new EvenementPoire((Poire) this.poire);
        this.evenementPrune = new EvenementPrune((Prune) this.prune);


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
            //evenement
            evenementCerise.cliqueCerise(variablePlateau);
            evenementCerise.sourisSurCerise();
            evenementCerise.sourisQuitteCerise();

            evenementPomme.cliqueSurPomme(variablePlateau);
            evenementPomme.sourisSurPomme();
            evenementPomme.sourisQuittePomme();

            evenementPrune.cliqueSurPrune(variablePlateau);
            evenementPrune.sourisSurPrune();
            evenementPrune.sourisQuittePrune();

            evenementPoire.cliqueSurPoire(variablePlateau);
            evenementPoire.sourisSurPoire();
            evenementPoire.sourisQuittePoire();
            de.setOnMouseClicked(event ->{
            	de.lancer();
            });
            
            
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
        this.fond.getChildren().add(de);
        this.fond.setBackground(this.arrierePlan);
        return scene;
    }


}
