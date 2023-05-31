package leverger.utils.evenement;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import leverger.modele.Corbeau;
import leverger.modele.Couleur;
import leverger.modele.De;
import leverger.modele.fruit.Cerise;
import leverger.modele.fruit.Poire;
import leverger.modele.fruit.Pomme;
import leverger.modele.fruit.Prune;
import leverger.utils.VariablePlateau;

public class EvenementDe {
    private De de;

    public EvenementDe(De de){
        this.de = de;
    }
    public void clique(VariablePlateau variablePlateau, Label nombreTour,
                       Corbeau corbeau,
                       Label nomJoueur){
        this.de.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                variablePlateau.ajoutTour();
                de.lancer(corbeau);

                nombreTour.setText(variablePlateau.getTour().toString());
                if (de.getCouleur().equals(Couleur.MARRON)){
                    variablePlateau.deuxActions();
                }else {
                    variablePlateau.uneAction();
                }
                variablePlateau.joueurSuivant();
                switch (variablePlateau.getJoueurActuelle()){
                    case 1:
                        nomJoueur.setText(variablePlateau.getJoueurUn());
                        break;
                    case 2:
                        nomJoueur.setText(variablePlateau.getJoueurDeux());
                        break;
                    case 3:
                        nomJoueur.setText(variablePlateau.getJoueurTrois());
                        break;
                }
            }
        });


    }
    public void sourisSurDe(){
        this.de.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                de.setWidth(55);
                de.setHeight(55);
            }
        });
    }
    public void sourisQuitteDe(){
        this.de.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                de.setWidth(50);
                de.setHeight(50);
            }
        });
    }
}
