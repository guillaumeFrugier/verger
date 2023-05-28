package leverger.modele.fruit;

import javafx.scene.image.Image;
import leverger.modele.Couleur;
import leverger.modele.fruit.Fruit;

import java.io.FileNotFoundException;

public class Poire extends Fruit {
    public Poire(Image imageFruit) throws FileNotFoundException {
        super(imageFruit, Couleur.JAUNE);
    }
}
