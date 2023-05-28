package leverger.utils.evenement.corbeau;

import javafx.event.EventHandler;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import leverger.modele.Corbeau;
import leverger.modele.Couleur;
import leverger.modele.De;
import leverger.utils.VariablePlateau;

public class EvenementCorbeau {
    private Corbeau corbeau;

    public EvenementCorbeau(Corbeau corbeau){
        this.corbeau = corbeau;
    }

    public void lacher(VariablePlateau variablePlateau, De de){
        corbeau.getCorb().setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                event.acceptTransferModes(TransferMode.ANY);
            }
        });

        corbeau.getCorb().setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                Dragboard db = event.getDragboard();
                if (db.hasString()){
                    if (db.getString().equals("corbeau") && de.getCouleur().equals(Couleur.NOIR) &&
                            variablePlateau.getNombreActions() > 0){
                        variablePlateau.remiseAZeroActions();
                        corbeau.ajoutEnPosition();
                        corbeau.changerImage();
                        variablePlateau.ajoutPieceCorbeau();
                        variablePlateau.moinsUneAction();
                    }
                }
            }
        });
    }
}
