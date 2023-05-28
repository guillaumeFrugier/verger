package leverger.utils.evenement;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.*;
import leverger.modele.Panier;
import leverger.modele.fruit.Pomme;
import leverger.utils.VariablePlateau;

import java.util.List;

public class EvenementPomme {
    private Pomme pomme;

    public EvenementPomme(Pomme pomme){
        this.pomme = pomme;
    }

    /*
    public void cliqueSurPomme(VariablePlateau variablePlateau, Label nombrePommePanier){

        for (int i = 0; i < 10; i++) {
            pomme.getAffichageFruit().get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    System.out.println(variablePlateau.getNombreActions());
                    if ( variablePlateau.getNombreActions() > 0) {
                        pomme.getAffichageFruit().get(variablePlateau.getPositionPomme()).setVisible(false);
                        variablePlateau.ajoutEnPositionPomme();
                        variablePlateau.retraitFruit();
                        variablePlateau.ajoutNombrePommepanier();
                        nombrePommePanier.setText(variablePlateau.getNombrePommeEnPanier().toString());
                        pomme.retirerUnFruit();
                        variablePlateau.moinsUneAction();
                    }
                }
            });
        }
    }*/


    public void attraperEtLacher(List<Panier> paniers, VariablePlateau variablePlateau){
        for (int i = 0; i < 10; i++) {
            pomme.getAffichageFruit().get(i).setOnDragDetected(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (int j = 0; j < 10; j++) {
                        Dragboard db = pomme.getAffichageFruit().get(j).startDragAndDrop(TransferMode.ANY);
                        ClipboardContent cp = new ClipboardContent();
                        cp.putString("pommme");
                        db.setContent(cp);

                    }
                }
            });
        }
        for (int i = 0; i < 4; i++) {
            paniers.get(i).getImage().setOnDragDropped(new EventHandler<DragEvent>() {
                @Override
                public void handle(DragEvent event) {
                    Dragboard db = event.getDragboard();
                    for (int j = 0; j < 4; j++) {
                        paniers.get(j).ajoutFruit(pomme);
                    }
                    event.consume();
                }
            });
            paniers.get(i).getImage().setOnDragOver(new EventHandler<DragEvent>() {
                @Override
                public void handle(DragEvent event) {
                    event.acceptTransferModes(TransferMode.ANY);
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
