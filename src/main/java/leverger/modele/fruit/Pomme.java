package leverger.modele.fruit;

import javafx.scene.image.Image;
import leverger.modele.Couleur;
import leverger.modele.fruit.Fruit;

import java.io.FileNotFoundException;

public class Pomme extends Fruit {



    public Pomme(Image image) throws FileNotFoundException {
        super(image, Couleur.VERT);
    }
}
