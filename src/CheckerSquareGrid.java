import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;



public class CheckerSquareGrid {
	public CheckerSquare[][]checkerSquareArray = new CheckerSquare[8][8];
	
	public CheckerSquareGrid(GridPane checkerGrid, BorderPane mainPane) 
	{
		for(int i=0; i<8; i++) 
		{
			for(int c=0; c<8; c++) 
			{
				checkerSquareArray[i][c] = new CheckerSquare(i,c);
				checkerSquareArray[i][c].checkerSquare.heightProperty().bind(mainPane.heightProperty().divide(8));
				checkerSquareArray[i][c].checkerSquare.widthProperty().bind(mainPane.widthProperty().divide(8));
				GridPane.setColumnIndex(checkerSquareArray[i][c].checkerSquare, i);
				GridPane.setRowIndex(checkerSquareArray[i][c].checkerSquare, c);
				
			}
		}
	}

}
