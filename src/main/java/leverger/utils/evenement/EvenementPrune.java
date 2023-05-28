package leverger.utils.evenement;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.*;
import leverger.modele.Panier;
import leverger.modele.fruit.Prune;
import leverger.utils.VariablePlateau;

import java.util.List;

public class EvenementPrune {
    private Prune prune;

    public EvenementPrune(Prune prune){
        this.prune = prune;
    }


    public void attraperEtLacher(List<Panier> paniers, VariablePlateau variablePlateau){
        for (int i = 0; i < 10; i++) {
            prune.getAffichageFruit().get(i).setOnDragDetected(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        Dragboard db = prune.getAffichageFruit().get(j).startDragAndDrop(TransferMode.ANY);
                        ClipboardContent cp = new ClipboardContent();
                        cp.putString("prune");
                        db.setContent(cp);

                    }
                }
            });
        }
        for (int i = 0; i < 4; i++) {
            paniers.get(i).getImage().setOnDragDropped(new EventHandler<DragEvent>() {
                @Override
                public void handle(DragEvent event) {
                    Dragboard db = event.getDragboard();
                    for (int j = 0; j < 4; j++) {
                        paniers.get(j).ajoutFruit(prune);
                    }
                    event.consume();
                }
            });
            paniers.get(i).getImage().setOnDragOver(new EventHandler<DragEvent>() {
                @Override
                public void handle(DragEvent event) {
                    event.acceptTransferModes(TransferMode.ANY);
                }
            });
        }
    }
    public void sourisSurPrune(){
        for (int i = 0; i < 10; i++) {
            prune.getAffichageFruit().get(i).setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        prune.getAffichageFruit().get(j).setFitWidth(70);
                        prune.getAffichageFruit().get(j).setFitHeight(70);
                    }
                }
            });
        }
    }

    public void sourisQuittePrune(){
        for (int i = 0; i < 10; i++) {
            prune.getAffichageFruit().get(i).setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        prune.getAffichageFruit().get(j).setFitWidth(64);
                        prune.getAffichageFruit().get(j).setFitHeight(64);
                    }
                }
            });
        }
    }
}
