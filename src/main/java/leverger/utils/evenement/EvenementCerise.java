package leverger.utils.evenement;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import leverger.modele.fruit.Cerise;
import leverger.utils.VariablePlateau;

public class EvenementCerise {
    private Cerise cerise;

    public EvenementCerise(Cerise cerise){
        this.cerise = cerise;
    }


    public void cliqueCerise(VariablePlateau variablePlateau){
        for (int i = 0; i < 10; i++) {
            //cerise
            cerise.getAffichageFruit().get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    cerise.getAffichageFruit().get(variablePlateau.getPositionCerise()).setVisible(false);
                    variablePlateau.ajoutEnPositionCerise();
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
