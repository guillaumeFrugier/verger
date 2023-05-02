package leverger.utils.evenement;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import leverger.modele.fruit.Poire;
import leverger.utils.VariablePlateau;

public class EvenementPoire {
    private Poire poire;

    public EvenementPoire(Poire poire){
        this.poire = poire;
    }

    public void cliqueSurPoire(VariablePlateau variablePlateau){
        for (int i = 0; i < 10; i++) {
            poire.getAffichageFruit().get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    poire.getAffichageFruit().get(variablePlateau.getPositionPoire()).setVisible(false);
                    variablePlateau.ajoutEnPositionPoire();
                    variablePlateau.retraitFruit();

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
