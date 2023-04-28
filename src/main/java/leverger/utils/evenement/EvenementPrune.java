package leverger.utils.evenement;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import leverger.modele.fruit.Prune;
import leverger.utils.VariablePlateau;

public class EvenementPrune {
    private Prune prune;

    public EvenementPrune(Prune prune){
        this.prune = prune;
    }

    public void cliqueSurPrune(VariablePlateau variablePlateau){
        for (int i = 0; i < 10; i++) {
            prune.getAffichageFruit().get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    prune.getAffichageFruit().get(variablePlateau.getPositionPrune()).setVisible(false);
                    variablePlateau.ajoutEnPositionPrune();
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
