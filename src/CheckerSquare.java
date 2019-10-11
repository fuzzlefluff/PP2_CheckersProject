import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class CheckerSquare {
	
	Rectangle checkerSquare;
	
	public CheckerSquare(int x,int y) 
	{
		
		checkerSquare = new Rectangle();
		checkerSquare.setStroke(Color.BLACK);
		checkerSquare.setArcHeight(25);
		checkerSquare.setArcWidth(25);
		if((x+y)%2 ==0) {checkerSquare.setFill(Color.TAN);}
		else {checkerSquare.setFill(Color.DIMGRAY);}
		
	}

}
