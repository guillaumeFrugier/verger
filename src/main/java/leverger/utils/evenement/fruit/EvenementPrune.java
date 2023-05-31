package leverger.utils.evenement.fruit;

import javafx.event.EventHandler;
import javafx.scene.input.*;
import leverger.modele.Couleur;
import leverger.modele.De;

import leverger.modele.fruit.Prune;


public class EvenementPrune {
    private Prune prune;

    public EvenementPrune(Prune prune){
        this.prune = prune;
    }


    public void attraperEtLacher(De de){
        for (int i = 0; i < 10; i++) {
            prune.getAffichageFruit().get(i).setOnDragDetected(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    if (de.getCouleur().equals(Couleur.VIOLET) || de.getCouleur().equals(Couleur.MARRON)){
                        for (int j = 0; j < 10; j++) {
                            Dragboard db = prune.getAffichageFruit().get(j).startDragAndDrop(TransferMode.ANY);
                            ClipboardContent cp = new ClipboardContent();
                            cp.putString("prune");
                            db.setContent(cp);
                        }
                    }

                }
            });
        }

    }


}
