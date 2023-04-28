package leverger.scene;

import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Plateau extends Application{
    private Pane fond;
    private Button boutonLancer;
    private Label nombreTour;
    private Circle cercle1;
    private Circle cercle2;
    private Circle cercle3;
    private Circle cercle4;
    
    
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane root = new Pane();
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
		
		cercle1.setFill(Color.RED);
	    cercle2.setFill(Color.YELLOW);
	    cercle3.setFill(Color.VIOLET);
	    cercle4.setFill(Color.GREEN);
	    
	    Circle[] cercles = new Circle[4];
	    cercles.addAll(cercle1,cercle2,cercle3,cercle4);

	    int randomNumber = (int) (Math.random()*4);
	    root.getChildren().add(circles[]);
	    

	public static void main(String[] args) {
        launch(args);
    }


}
