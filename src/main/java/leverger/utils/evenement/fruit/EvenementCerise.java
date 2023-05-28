package leverger.utils.evenement.fruit;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.Pane;
import leverger.modele.Couleur;
import leverger.modele.De;
import leverger.modele.Panier;
import leverger.modele.fruit.Cerise;
import leverger.utils.VariablePlateau;

import java.util.List;

public class EvenementCerise {
    private Cerise cerise;

    public EvenementCerise(Cerise cerise){
        this.cerise = cerise;
    }
/*
    public void cliqueCerise(VariablePlateau variablePlateau, Label nombreCerisePanier){

        for (int i = 0; i < 10; i++) {
            //cerise
            cerise.getAffichageFruit().get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    if ( variablePlateau.getNombreActions() > 0){
                        cerise.getAffichageFruit().get(variablePlateau.getPositionCerise()).setVisible(false);
                        cerise.getAffichageFruit().get(variablePlateau.getPositionCerise()).setVisible(false);
                        variablePlateau.ajoutEnPositionCerise();
                        variablePlateau.retraitFruit();
                        variablePlateau.ajoutNombreCerisepanier();
                        nombreCerisePanier.setText(variablePlateau.getNombreCeriseEnPanier().toString());
                        cerise.retirerUnFruit();
                        variablePlateau.moinsUneAction();
                    }
                }
            });

        }

    }*/
public void attraperEtLacher(De de){
    for (int i = 0; i < 10; i++) {
        final ImageView ceriseSelectionnee = cerise.getAffichageFruit().get(i);
        ceriseSelectionnee.setOnDragDetected(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (de.getCouleur().equals(Couleur.ROUGE) || de.getCouleur().equals(Couleur.MARRON)){
                    Dragboard db = ceriseSelectionnee.startDragAndDrop(TransferMode.ANY);
                    ClipboardContent cp = new ClipboardContent();
                    cp.putString("cerise");
                    db.setContent(cp);
                    event.consume();
                }

            }
        });

    }



}

    public void sourisSurCerise(){
        for (int i = 0; i < 10; i++) {
            cerise.getAffichageFruit().get(i).setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        cerise.getAffichageFruit().get(j).setFitWidth(70);
                        cerise.getAffichageFruit().get(j).setFitHeight(70);
                    }
                }
            });
        }
    }

    public void sourisQuitteCerise(){
        for (int i = 0; i < 10; i++) {
            cerise.getAffichageFruit().get(i).setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        cerise.getAffichageFruit().get(j).setFitWidth(64);
                        cerise.getAffichageFruit().get(j).setFitHeight(64);
                    }
                }
            });
        }
    }
}
