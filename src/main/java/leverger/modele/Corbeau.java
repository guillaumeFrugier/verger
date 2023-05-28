package leverger.modele;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.swing.text.Element;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Corbeau {
    private ImageView corb;
    private List<Image> corbImage;
    private Integer position;

    public Corbeau() throws FileNotFoundException {
        this.corbImage = new ArrayList<Image>();
        this.position = 0;
        this.corbImage.add(new Image(new FileInputStream("src/image/scene jeux/corbeau/corb.png")));
        this.corbImage.add(new Image(new FileInputStream("src/image/scene jeux/corbeau/corbUn.png")));
        this.corbImage.add(new Image(new FileInputStream("src/image/scene jeux/corbeau/corbDeux.png")));
        this.corbImage.add(new Image(new FileInputStream("src/image/scene jeux/corbeau/corbTrois.png")));
        this.corbImage.add(new Image(new FileInputStream("src/image/scene jeux/corbeau/corbQuatre.png")));
        this.corbImage.add(new Image(new FileInputStream("src/image/scene jeux/corbeau/corbCinq.png")));
        this.corbImage.add(new Image(new FileInputStream("src/image/scene jeux/corbeau/corbSix.png")));
        this.corbImage.add(new Image(new FileInputStream("src/image/scene jeux/corbeau/corbSept.png")));
        this.corbImage.add(new Image(new FileInputStream("src/image/scene jeux/corbeau/corbHuit.png")));
        this.corbImage.add(new Image(new FileInputStream("src/image/scene jeux/corbeau/corbNeuf.png")));
        this.corb = new ImageView(this.corbImage.get(0));
    }

    public void ajoutEnPosition(){
        this.position = this.position+1;
    }
    public void changerImage(){
        this.corb.setImage(this.corbImage.get(this.position));
    }

    public ImageView getCorb() {
        return corb;
    }
}
