package leverger.modele;

import javafx.scene.image.Image;

import java.io.FileNotFoundException;

public class Poire extends Fruit {
    public Poire(Image imageFruit) throws FileNotFoundException {
        super(imageFruit, Couleur.JAUNE);
    }
}
