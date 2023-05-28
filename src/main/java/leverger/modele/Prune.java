package leverger.modele;

import javafx.scene.image.Image;

import java.io.FileNotFoundException;

public class Prune extends Fruit{
    public Prune(Image imageFruit) throws FileNotFoundException {
        super(imageFruit, Couleur.VIOLET);
    }
}
