package leverger.modele.fruit;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import leverger.modele.Couleur;
import leverger.utils.ImageJeux;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public abstract class Fruit {
    private static Image imageFruit;
    private static Couleur couleur;
    private Integer nombre;

    private List<ImageView> affichageFruit;

    protected Fruit(Image imageFruit, Couleur couleur) throws FileNotFoundException {
        this.imageFruit = imageFruit;
        this.couleur = couleur;
        this.nombre = 10;
        this.affichageFruit = new ArrayList<ImageView>();
        for (int i = 0; i < 10; i++) {
            this.affichageFruit.add(new ImageView());
            this.affichageFruit.get(i).setImage(imageFruit);
        }

    }

    public void retirerUnFruit(){
        this.nombre = this.nombre - 1;
    }
    public Integer getNombre() {
        return nombre;
    }

    public static Couleur getCouleur() {
        return couleur;
    }

    public List<ImageView> getAffichageFruit() {
        return affichageFruit;
    }
}
