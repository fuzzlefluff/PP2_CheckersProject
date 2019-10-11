import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class CheckersGUI extends Application{

	
	public static void main(String[] args) { launch();}

	@Override
	public void start(Stage mainStage) throws Exception 
	{
		BorderPane mainBorderPane =  new BorderPane();
		mainBorderPane.setMinSize(0, 0);
		Scene mainScene = new Scene(mainBorderPane, 500,500);
		mainStage.setScene(mainScene);
		
		//Bottom Banner
		HBox bottomBanner = new HBox();
		bottomBanner.setStyle("-fx-background-color: #4D9900;");
		
		//newGame.setStyle("-fx-background-color: #C6E3FF;");
		
		Label currentTurn = new Label();
		currentTurn.setText("Current Turn: Black");
		currentTurn.setStyle("-fx-background-color: #C6E3FF;");
		bottomBanner.getChildren().add(currentTurn);
		
		//GridPane to store the play Area
		GridPane checkerGridPane = new GridPane();
		//CheckerGrid
		CheckerSquareGrid checkerSquareBoard = new CheckerSquareGrid(checkerGridPane,mainBorderPane);
		for(int i=0; i<8; i++) 
		{
			for (int c=0; c<8; c++) { checkerGridPane.add(checkerSquareBoard.checkerSquareArray[i][c].checkerSquare,c,i);}
		}
		//CheckerPieceGrid
		CheckerPieceGrid checkerPieceBoard = new CheckerPieceGrid(checkerGridPane);
		
		for(int i=0; i<8; i++) 
		{
			for (int c=0; c<8; c++) { if((c+i)%2 == 0 && (i<3 || i>4)) {checkerGridPane.add(checkerPieceBoard.checkerPieceArray[i][c].checkerCircle,c,i);}}
		}
		
		//Render to main Window
		Rectangle backRectangle = new Rectangle();
		backRectangle.heightProperty().bind(mainBorderPane.heightProperty());
		backRectangle.widthProperty().bind(mainBorderPane.widthProperty());
		backRectangle.setFill(Color.BROWN);
		
		mainBorderPane.getChildren().add(backRectangle);
		mainBorderPane.setCenter(checkerGridPane);
		
		mainBorderPane.setBottom(bottomBanner);
		mainStage.setTitle("Checkers");
		mainStage.show();
		
	}
}
