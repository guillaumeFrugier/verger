package leverger.utils.evenement;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import leverger.modele.fruit.Pomme;
import leverger.utils.VariablePlateau;

public class EvenementPomme {
    private Pomme pomme;

    public EvenementPomme(Pomme pomme){
        this.pomme = pomme;
    }

    public void cliqueSurPomme(VariablePlateau variablePlateau){
        for (int i = 0; i < 10; i++) {
            pomme.getAffichageFruit().get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    pomme.getAffichageFruit().get(variablePlateau.getPositionPomme()).setVisible(false);
                    variablePlateau.ajoutEnPositionPomme();
                }
            });
        }
    }

    public void sourisSurPomme(){
        for (int i = 0; i < 10; i++) {
            pomme.getAffichageFruit().get(i).setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        pomme.getAffichageFruit().get(j).setFitWidth(70);
                        pomme.getAffichageFruit().get(j).setFitHeight(70);
                    }
                }
            });
        }
    }

    public void sourisQuittePomme(){
        for (int i = 0; i < 10; i++) {
            pomme.getAffichageFruit().get(i).setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        pomme.getAffichageFruit().get(j).setFitWidth(64);
                        pomme.getAffichageFruit().get(j).setFitHeight(64);
                    }
                }
            });
        }
    }
}
