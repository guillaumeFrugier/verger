package leverger.scene;

import java.beans.EventHandler;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class De extends Rectangle{

	public Color[] couleurs;
	
	public De(double taille) {
		super(taille, taille);
		couleurs = new Color[] {Color.VIOLET, Color.RED, Color.GREEN, Color.YELLOW};
		this.setFill(Color.RED);
	}
	
	public void lancer() {
		int i = (int) (Math.random()*4);
		this.setFill(couleurs[i]);
	}

}
