package leverger.modele.fruit;

import javafx.scene.image.Image;
import leverger.modele.Couleur;

import java.io.FileNotFoundException;

public class Cerise extends Fruit {

    public Cerise(Image image) throws FileNotFoundException {
        super(image, Couleur.ROUGE);
    }
}
