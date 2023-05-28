package leverger.utils.evenement.panier;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import leverger.modele.Panier;
import leverger.modele.fruit.Fruit;
import leverger.utils.VariablePlateau;

public class EvenementPanierQuatre {
    private Panier panierQuatre;

    public EvenementPanierQuatre(Panier panier){
        this.panierQuatre = panier;
    }

    public void lacher(VariablePlateau variablePlateau, Label nombrePanierQuatre,
                       Fruit cerise, Fruit pomme, Fruit poire, Fruit prune){



        panierQuatre.getImage().setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                event.acceptTransferModes(TransferMode.ANY);
            }
        });
        panierQuatre.getImage().setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                Dragboard db = event.getDragboard();
                if (variablePlateau.getNombreActions() > 0) {
                    if (db.hasString()) {
                        switch (db.getString()) {
                            case "cerise":
                                cerise.getAffichageFruit().get(variablePlateau.getPositionCerise()).setVisible(false);
                                variablePlateau.retraitFruit();
                                variablePlateau.ajoutEnPositionCerise();
                                cerise.retirerUnFruit();
                                variablePlateau.ajoutPanierQuatre();
                                nombrePanierQuatre.setText(" " + variablePlateau.getNombreFruitPanierQuatre());
                                break;
                            case "poire":
                                poire.getAffichageFruit().get(variablePlateau.getPositionPoire()).setVisible(false);
                                variablePlateau.retraitFruit();
                                variablePlateau.ajoutEnPositionPoire();
                                poire.retirerUnFruit();
                                variablePlateau.ajoutPanierQuatre();
                                nombrePanierQuatre.setText(variablePlateau.getNombreFruitPanierQuatre().toString());
                                break;
                            case "pomme":
                                pomme.getAffichageFruit().get(variablePlateau.getPositionPomme()).setVisible(false);
                                variablePlateau.retraitFruit();
                                variablePlateau.ajoutEnPositionPomme();
                                pomme.retirerUnFruit();
                                variablePlateau.ajoutPanierQuatre();
                                nombrePanierQuatre.setText(" " + variablePlateau.getNombreFruitPanierQuatre());
                                break;
                            case "prune":
                                prune.getAffichageFruit().get(variablePlateau.getPositionPrune()).setVisible(false);
                                variablePlateau.retraitFruit();
                                variablePlateau.ajoutEnPositionPrune();
                                prune.retirerUnFruit();
                                variablePlateau.ajoutPanierQuatre();
                                nombrePanierQuatre.setText(" " + variablePlateau.getNombreFruitPanierQuatre());
                                break;
                        }
                    }
                    variablePlateau.moinsUneAction();
                }
            }
        });

    }
}
