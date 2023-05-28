package leverger.modele;

import javafx.scene.image.ImageView;
import leverger.modele.fruit.Fruit;
import leverger.utils.ImageJeux;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<Fruit> fruits;

    private ImageJeux imageJeux;
    private ImageView image;
    public Panier() throws FileNotFoundException {
        this.imageJeux = new ImageJeux();
        this.fruits = new ArrayList<Fruit>();
        this.image = new ImageView(imageJeux.getPanier());
    }

    public void ajoutFruit(Fruit fruit){
        this.fruits.add(fruit);
    }

    public ImageView getImage() {
        return image;
    }
}
