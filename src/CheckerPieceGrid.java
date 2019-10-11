import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;



public class CheckerPieceGrid {
	
	CheckerPiece[][] checkerPieceArray = new CheckerPiece[8][8];
	boolean isAnyPieceSelected;
	boolean isBlackTurn;
	Label currentTurn = new Label();
	
	public CheckerPieceGrid(GridPane checkerGrid) 
	{
		isBlackTurn = true;
		currentTurn.setText("Current Turn: Black ");
	for(int i=0; i<8; i++) 
	{
		for(int c=0; c<8; c++) 
		{
			
			if((i+c)%2 == 0 && (i<3 || i>4)) 
			{
			checkerPieceArray[i][c] = new CheckerPiece(this,i,c);
			checkerPieceArray[i][c].checkerCircle.centerXProperty().bind(checkerGrid.widthProperty().divide(8));
			checkerPieceArray[i][c].checkerCircle.centerYProperty().bind(checkerGrid.heightProperty().divide(8));
			checkerPieceArray[i][c].checkerCircle.radiusProperty().bind(checkerGrid.heightProperty().divide(20));
			}
		}
	}
	
	}
}
