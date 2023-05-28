package leverger.utils.evenement.panier;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import leverger.modele.Panier;
import leverger.modele.fruit.Fruit;
import leverger.utils.VariablePlateau;

public class EvenementPanierDeux {
    private Panier panierDeux;

    public EvenementPanierDeux(Panier panierDeux){
        this.panierDeux = panierDeux;
    }

    public void lacher(VariablePlateau variablePlateau, Label nombrePanierDeux,
                       Fruit cerise, Fruit pomme, Fruit poire, Fruit prune){

        panierDeux.getImage().setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                event.acceptTransferModes(TransferMode.ANY);
            }
        });
        panierDeux.getImage().setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                Dragboard db = event.getDragboard();
                if (variablePlateau.getNombreActions() > 0){
                    if (db.hasString()) {

                        switch (db.getString()) {
                            case "cerise":
                                cerise.getAffichageFruit().get(variablePlateau.getPositionCerise()).setVisible(false);
                                variablePlateau.retraitFruit();
                                variablePlateau.ajoutEnPositionCerise();
                                cerise.retirerUnFruit();
                                variablePlateau.ajoutPanierDeux();
                                nombrePanierDeux.setText(" " + variablePlateau.getNombreFruitPanierDeux());
                                break;
                            case "poire":
                                poire.getAffichageFruit().get(variablePlateau.getPositionPoire()).setVisible(false);
                                variablePlateau.retraitFruit();
                                variablePlateau.ajoutEnPositionPoire();
                                poire.retirerUnFruit();
                                variablePlateau.ajoutPanierDeux();
                                nombrePanierDeux.setText(" " + variablePlateau.getNombreFruitPanierDeux());
                                break;
                            case "pomme":
                                pomme.getAffichageFruit().get(variablePlateau.getPositionPomme()).setVisible(false);
                                variablePlateau.retraitFruit();
                                variablePlateau.ajoutEnPositionPomme();
                                pomme.retirerUnFruit();
                                variablePlateau.ajoutPanierDeux();
                                nombrePanierDeux.setText(" " + variablePlateau.getNombreFruitPanierDeux());
                                break;
                            case "prune":
                                prune.getAffichageFruit().get(variablePlateau.getPositionPrune()).setVisible(false);
                                variablePlateau.retraitFruit();
                                variablePlateau.ajoutEnPositionPrune();
                                prune.retirerUnFruit();
                                variablePlateau.ajoutPanierDeux();
                                nombrePanierDeux.setText(" " + variablePlateau.getNombreFruitPanierDeux());
                                break;
                        }
                        variablePlateau.moinsUneAction();
                    }
                }
            }
        });

    }
}
