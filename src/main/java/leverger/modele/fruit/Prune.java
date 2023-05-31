package leverger.modele.fruit;

import javafx.scene.image.Image;
import leverger.modele.Couleur;


import java.io.FileNotFoundException;

public class Prune extends Fruit {
    public Prune(Image imageFruit) throws FileNotFoundException {
        super(imageFruit, Couleur.VIOLET);
    }
}
