package leverger.modele;

import javafx.scene.image.Image;
import leverger.utils.ImageJeux;

import java.io.FileNotFoundException;

public class Pomme extends Fruit{



    public Pomme(Image image) throws FileNotFoundException {
        super(image,Couleur.VERT);
    }
}
