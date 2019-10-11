import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class CheckerPiece {
	
	
	public Circle checkerCircle;
	public boolean isSelected;
	public int xcord;
	public int ycord;
	
	public CheckerPiece(CheckerPieceGrid gridArray,int x, int y)
	{
		checkerCircle = new Circle();
		checkerCircle.setStroke(Color.BLACK);
		checkerCircle.setRadius(15);
		GridPane.setColumnIndex (checkerCircle,x);
		GridPane.setRowIndex(checkerCircle, y);
		checkerCircle.setOnMouseClicked(e -> 
		{
			if (isSelected == false && gridArray.isAnyPieceSelected == false && gridArray.isBlackTurn && x>4) 
			{
				checkerCircle.setStroke(Color.YELLOW); 
				isSelected = true; 
				gridArray.isAnyPieceSelected = true;
			}
			else if(isSelected == false && gridArray.isAnyPieceSelected == false && gridArray.isBlackTurn == false && x<3) 
			{
				checkerCircle.setStroke(Color.YELLOW); 
				isSelected = true; 
				gridArray.isAnyPieceSelected = true;
			}
			else if (isSelected == true) 
			{
				checkerCircle.setStroke(Color.BLACK); 
				isSelected = false; 
				gridArray.isAnyPieceSelected = false;
			}
		});
		if(x<3 && (x+y)%2==0) {checkerCircle.setFill(Color.RED);}
		else {checkerCircle.setFill(Color.BLACK);}
	}

}
