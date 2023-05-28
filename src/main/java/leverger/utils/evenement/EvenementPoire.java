package leverger.utils.evenement;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.*;
import leverger.modele.De;
import leverger.modele.Panier;
import leverger.modele.fruit.Poire;
import leverger.utils.VariablePlateau;

import java.util.List;

public class EvenementPoire {
    private Poire poire;

    public EvenementPoire(Poire poire){
        this.poire = poire;
    }


    public void attraperEtLacher(List<Panier> paniers, VariablePlateau variablePlateau){
        for (int i = 0; i < 10; i++) {
            poire.getAffichageFruit().get(i).setOnDragDetected(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        Dragboard db = poire.getAffichageFruit().get(j).startDragAndDrop(TransferMode.ANY);
                        ClipboardContent cp = new ClipboardContent();
                        cp.putString("poire");
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
                    if (db.hasString()){
                        for (int j = 0; j < 4; j++) {
                            paniers.get(j).ajoutFruit(poire);
                        }
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

    public void sourisSurPoire(){
        for (int i = 0; i < 10; i++) {
            poire.getAffichageFruit().get(i).setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        poire.getAffichageFruit().get(j).setFitWidth(70);
                        poire.getAffichageFruit().get(j).setFitHeight(70);
                    }
                }
            });
        }
    }

    public void sourisQuittePoire(){
        for (int i = 0; i < 10; i++) {
            poire.getAffichageFruit().get(i).setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        poire.getAffichageFruit().get(j).setFitWidth(64);
                        poire.getAffichageFruit().get(j).setFitHeight(64);
                    }
                }
            });
        }
    }

}
