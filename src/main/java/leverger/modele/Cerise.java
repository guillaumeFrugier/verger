package leverger.modele;

import javafx.scene.image.Image;

import java.io.FileNotFoundException;

public class Cerise extends Fruit{

    public Cerise(Image image) throws FileNotFoundException {
        super(image,Couleur.ROUGE);
    }
}
