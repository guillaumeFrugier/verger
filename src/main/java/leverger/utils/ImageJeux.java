package leverger.utils;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ImageJeux {
    private Image arbre;
    //fruit
    private Image pomme;
    private Image cerise;
    private Image prune;
    private Image poire;

    //arriere plan
    private Image arrierePlan;


    public ImageJeux() throws FileNotFoundException {
        this.arbre = new Image(new FileInputStream("src/image/scene jeux/arbre.png"));
        //fruit
        this.pomme = new Image(new FileInputStream("src/image/scene jeux/fruit/pomme.png"));
        this.poire = new Image(new FileInputStream("src/image/scene jeux/fruit/poire.png"));
        this.cerise = new Image(new FileInputStream("src/image/scene jeux/fruit/cerise.png"));
        this.prune = new Image(new FileInputStream("src/image/scene jeux/fruit/prune.png"));
        //arriere plan
        this.arrierePlan = new Image(new FileInputStream("src/image/scene jeux/plateau.png"));
    }

    public Image getArbre() {
        return arbre;
    }

    public Image getCerise() {
        return cerise;
    }

    public Image getPoire() {
        return poire;
    }

    public Image getPomme() {
        return pomme;
    }

    public Image getPrune() {
        return prune;
    }

    public Image getArrierePlan() {
        return arrierePlan;
    }
}
