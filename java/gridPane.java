import javafx.animation.*;
import javafx.application.Application;
import javafx.event.*;
import javafx.fxml.*;
import javafx.stage.*; // Import Stage
import javafx.scene.*; // import Scene
import javafx.scene.layout.*; //import layout.GridPane
import javafx.scene.control.*;// import Label.
import javafx.geometry.Pos;


public class gridPane extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		try {
			//stage > scene > container > node
			Sudoku sudoku = new Sudoku(GRID_LAYOUT);
			
			grid.add(sudoku, 0, 0, 1, 1);
			
			// stage > scene > container > node
			//Label label1 = new Label("S");
			//Label label2 = new Label("P");
			
			
			//// using addColumn and addRow method to add variable in the column
			//grid.addColumn(0, label1, label2);
			//grid.setVgap(10);
			//grid.addRow(rowIndex, children);
			//grid.add(label1, 0, 0, 1, 1);
			//grid.add(label2, 0, 1, 1, 1);

			grid.setAlignment(Pos.CENTER);

			
		// actually show the gui
		stage.setTitle("GUI Demo Code");
		stage.setScene(scene);
		stage.show();			
			
			//stage.setScene(scene);
			//stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	GridPane grid = new GridPane();
	Scene scene = new Scene(grid, 400, 400);
	
	public static int [][] GRID_LAYOUT = {
		
		
			{9,0,0,1,0,0,0,0,5},
			{0,0,5,0,9,0,2,0,1},
			{8,0,0,0,4,0,0,0,0},
			{0,0,0,0,8,0,0,0,0},
			{0,0,0,7,0,0,0,0,0},
			{0,0,0,0,2,6,0,0,9},
			{2,0,0,3,0,0,0,0,6},
			{0,0,0,2,0,0,9,0,0},
			{0,0,1,9,0,4,5,7,0},
	};
	
	public static void main(String[] args){
		launch(args);
	}
}

