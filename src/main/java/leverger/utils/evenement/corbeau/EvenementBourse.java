package leverger.utils.evenement.corbeau;

import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;

public class EvenementBourse {
    private ImageView bourse;

    public EvenementBourse(ImageView bourse){
        this.bourse = bourse;
    }
    public void prendre(){
        bourse.setOnDragDetected(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Dragboard db = bourse.startDragAndDrop(TransferMode.ANY);
                ClipboardContent cp = new ClipboardContent();
                cp.putString("corbeau");
                db.setContent(cp);
            }
        });
    }
}
