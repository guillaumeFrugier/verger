package leverger.utils.evenement.panier;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import leverger.modele.Panier;
import leverger.modele.fruit.Fruit;
import leverger.utils.VariablePlateau;

public class EvenementPanierTrois {
    private Panier panierTrois;

    public EvenementPanierTrois(Panier panier){
        this.panierTrois = panier;
    }

    public void lacher(VariablePlateau variablePlateau, Label nombrePanierTrois,
                       Fruit cerise, Fruit pomme, Fruit poire, Fruit prune){
        panierTrois.getImage().setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                event.acceptTransferModes(TransferMode.ANY);
            }
        });
        panierTrois.getImage().setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                Dragboard db = event.getDragboard();
                if (variablePlateau.getNombreActions() > 0){
                    if (db.hasString()){
                        switch (db.getString()){
                          case "cerise":
                              cerise.getAffichageFruit().get(variablePlateau.getPositionCerise()).setVisible(false);
                              variablePlateau.retraitFruit();
                              variablePlateau.ajoutEnPositionCerise();
                              cerise.retirerUnFruit();
                              variablePlateau.ajoutPanierTrois();
                              nombrePanierTrois.setText(" "+variablePlateau.getNombreFruitPanierTrois());
                              break;
                          case "poire":
                              poire.getAffichageFruit().get(variablePlateau.getPositionPoire()).setVisible(false);
                              variablePlateau.retraitFruit();
                              variablePlateau.ajoutEnPositionPoire();
                              poire.retirerUnFruit();
                              variablePlateau.ajoutPanierTrois();
                              nombrePanierTrois.setText(" "+variablePlateau.getNombreFruitPanierTrois());
                              break;
                          case "pomme":
                              pomme.getAffichageFruit().get(variablePlateau.getPositionPomme()).setVisible(false);
                              variablePlateau.retraitFruit();
                              variablePlateau.ajoutEnPositionPomme();
                              pomme.retirerUnFruit();
                              variablePlateau.ajoutPanierTrois();
                              nombrePanierTrois.setText(" "+variablePlateau.getNombreFruitPanierTrois());
                              break;
                          case "prune":
                              prune.getAffichageFruit().get(variablePlateau.getPositionPrune()).setVisible(false);
                              variablePlateau.retraitFruit();
                              variablePlateau.ajoutEnPositionPrune();
                              prune.retirerUnFruit();
                              variablePlateau.ajoutPanierTrois();
                              nombrePanierTrois.setText(" "+variablePlateau.getNombreFruitPanierTrois());
                              break;
                      }

                    }
                    variablePlateau.moinsUneAction();

                }
            }
        });
    }
}
