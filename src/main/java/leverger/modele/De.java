package leverger.modele;

import java.beans.EventHandler;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class De extends Rectangle{

    public Color[] couleurs;
    public Couleur couleur;

    public De(double taille) {
        super(taille, taille);
        this.couleur = Couleur.ROUGE;
        couleurs = new Color[] {Color.VIOLET, Color.RED, Color.GREEN, Color.YELLOW,Color.BLACK,Color.BROWN};
        this.setFill(Color.RED);
    }

    public void lancer(Corbeau corbeau) {
        int i = (int) (Math.random()*6);
        this.setFill(couleurs[i]);
        if (couleurs[i].equals(Color.RED)){
            this.couleur = Couleur.ROUGE;
        }
        if (couleurs[i].equals(Color.GREEN)){
            this.couleur = Couleur.VERT;
        }
        if (couleurs[i].equals(Color.YELLOW)){
            this.couleur = Couleur.JAUNE;
        }
        if (couleurs[i].equals(Color.VIOLET)){
            this.couleur = Couleur.VIOLET;
        }
        if (couleurs[i].equals(Color.BLACK)){
            this.couleur = Couleur.NOIR;
        }
        if (couleurs[i].equals(Color.BROWN)){
            this.couleur = Couleur.MARRON;
        }
    }

    public Couleur getCouleur() {
        return couleur;
    }
}