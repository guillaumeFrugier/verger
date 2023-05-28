package leverger.utils.evenement;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import leverger.modele.Corbeau;
import leverger.modele.De;
import leverger.modele.Panier;
import leverger.modele.fruit.Fruit;
import leverger.utils.VariablePlateau;

import java.util.ArrayList;
import java.util.List;

public class FinDePartie {
    private  VariablePlateau variablePlateau;

    public FinDePartie(VariablePlateau variablePlateau){
        this.variablePlateau = variablePlateau;
    }

    public void initialisation(Pane fond, Label victoire, Fruit pomme, Fruit poire,
                               Fruit prune,
                               Fruit cerise,
                               De de,
                               Corbeau corbeau,
                               Panier panierUn,
                               Panier panierDeux,
                               Panier panierTrois,
                               Panier panierQuatre){
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
                        //panier
                        panierUn.getImage().setVisible(false);
                        panierDeux.getImage().setVisible(false);
                        panierTrois.getImage().setVisible(false);
                        panierQuatre.getImage().setVisible(false);
                    }
                    de.setVisible(false);


                    //affichage victoire
                    victoire.setText("vous aves gagné \n cela vous a pris\n "+variablePlateau.getTour()+" tours");
                }
                if (variablePlateau.getCorbeauFini().equals(true)){
                    victoire.setVisible(true);
                    victoire.setText("vous avez  perdu \nle corbeau à tous mangé");
                    victoire.setScaleX(5);
                    victoire.setScaleY(5);
                    for (int i = 0; i < 10; i++) {
                        poire.getAffichageFruit().get(i).setVisible(false);
                        pomme.getAffichageFruit().get(i).setVisible(false);
                        prune.getAffichageFruit().get(i).setVisible(false);
                        cerise.getAffichageFruit().get(i).setVisible(false);
                        //panier
                        panierUn.getImage().setVisible(false);
                        panierDeux.getImage().setVisible(false);
                        panierTrois.getImage().setVisible(false);
                        panierQuatre.getImage().setVisible(false);
                    }

                    de.setVisible(false);
                    corbeau.getCorb().setVisible(false);
                }
            }
        });

    }
}
