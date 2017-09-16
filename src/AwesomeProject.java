

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class AwesomeProject extends Application {
	Button clickToStart;
	Label text;
	GraphicsContext gc;
	Canvas background;
	
	
	public static void main(String[] args) {
<<<<<<< HEAD
		  launch(args);
		 }
	
	@Override
	public void start(Stage s) throws Exception {
		clickToStart = new Button("Start");
	    background = new Canvas();
	    background.setOnMouseMoved(m -> move(m));
	    gc = background.getGraphicsContext2D();
	    background.setWidth(300);
	    background.setHeight(300);
		text = new Label("Augie");
		clickToStart.setOnMouseClicked(k -> handle(k));
		VBox box = new VBox();
		
		clearScreen("Start");
		gc.setStroke(Color.RED);
		gc.strokeOval(10, 10, 20, 20);
		box.getChildren().addAll(clickToStart, text, background);
		Scene game = new Scene(box);
		s.setScene(game);
			
		
		
		
		s.setTitle("Beer Drop");
		s.show();
		
	}
=======
		// TODO Auto-generated method stub
		
		//Lucky Smells
>>>>>>> 08c02abe3e25d75bb267a1f895f00582a119b493

	private void move(MouseEvent m) {
		clearScreen("Mouse");
		gc.setStroke(Color.RED);
		gc.strokeOval(m.getX(), m.getY(), 20, 20);
		// text.setText(m.getX() + "," + m.getY());	
	}

	private void handle(MouseEvent k) {
		clearScreen("Button");
		gc.setStroke(Color.RED);
		gc.strokeOval(20, 20, 20, 20);
		// text.setText(null);
	}
	
	private void clearScreen(String s) {
		gc.clearRect(0, 0, background.getWidth(), background.getHeight());
		gc.setStroke(Color.BLACK);
		gc.fillRect(0, 0, background.getWidth(), background.getHeight());
		text.setText(s);
		
	}

}

