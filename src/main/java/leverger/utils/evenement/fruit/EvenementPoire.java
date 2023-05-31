package leverger.utils.evenement.fruit;

import javafx.event.EventHandler;
import javafx.scene.input.*;
import leverger.modele.Couleur;
import leverger.modele.De;
import leverger.modele.fruit.Poire;



public class EvenementPoire {
    private Poire poire;

    public EvenementPoire(Poire poire){
        this.poire = poire;
    }


    public void attraperEtLacher(De de){
        for (int i = 0; i < 10; i++) {
            poire.getAffichageFruit().get(i).setOnDragDetected(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    if (de.getCouleur().equals(Couleur.JAUNE) || de.getCouleur().equals(Couleur.MARRON)){
                        for (int j = 0; j < 10; j++) {
                            Dragboard db = poire.getAffichageFruit().get(j).startDragAndDrop(TransferMode.ANY);
                            ClipboardContent cp = new ClipboardContent();
                            cp.putString("poire");
                            db.setContent(cp);
                        }
                    }

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
