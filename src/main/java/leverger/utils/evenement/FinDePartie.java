package leverger.utils.evenement;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import leverger.modele.fruit.Fruit;
import leverger.utils.VariablePlateau;

import java.util.ArrayList;

public class FinDePartie {
    private  VariablePlateau variablePlateau;

    public FinDePartie(VariablePlateau variablePlateau){
        this.variablePlateau = variablePlateau;
    }

    public void initialisation(Pane fond, Label victoire, Fruit pomme, Fruit poire,
                               Fruit prune,
                               Fruit cerise ){
        fond.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (variablePlateau.getNombreFruit() <= 0){
                    victoire.setVisible(true);
                    for (int i = 0; i < 10; i++) {
                        poire.getAffichageFruit().get(i).setVisible(false);
                        pomme.getAffichageFruit().get(i).setVisible(false);
                        prune.getAffichageFruit().get(i).setVisible(false);
                        cerise.getAffichageFruit().get(i).setVisible(false);
                    }
                }
            }
        });

    }
}
