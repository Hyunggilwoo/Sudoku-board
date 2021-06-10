/*----------------------------------------------------------------------
 *                              Limitations
 * 1. Assumes that the sudoku will be size of the same index in row and in column.
 * 2. I am not sure how my default constructor will present. 
 * 			Will it contain zeros, probably.
 * 3. Because it is a public sudoku, it is immune to being editted at each index.
 * 4. Currently the main method is only printing the 2D array.
 * 		I need to return the 2 D array, right?
 */ 
import java.awt.Desktop;
import java.awt.Desktop.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javafx.animation.*;
import javafx.application.Application;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.*;
import javafx.scene.input.*;
import javafx.scene.layout.*; //import layout.StackPane
import javafx.scene.media.*;
import javafx.scene.paint.*; // import paint.Color
import javafx.scene.shape.*; // import shape.Rectangle, Circle
import javafx.scene.text.*; // import text.Font, Text
import javafx.stage.*; // Import stage.Stage
import javafx.stage.FileChooser.*;
import javafx.util.*;

// My current sudoku class parameter is int [][].
public class Main extends Application{
	public static FileChooser fileChooser;
	public static String imageFilePath;
	public static Stage stage;
	public static Scene scene;
	public static boolean flag;
	public static ImageView photoView;
	public static Text keyText;
	public static Circle circle;
	public static Rectangle rect;
	public static Button play, stop;
	public static MediaPlayer mediaPlayer;// prevent GC from killing media
	

	
	@Override
	public void start(Stage primaryStage) throws Exception {

		
		// actually show the gui
		primaryStage.setTitle("GUI Demo Code");
		primaryStage.setScene(new Scene(createContent()));
		primaryStage.show();
	}
	
	private static final int NUM_OF_ROWS = 8;
	private static final int NUM_PER_ROW = 4;
	private Tile selected = null;
	
	private Parent createContent(){
			Pane root = new Pane();
			root.setPrefSize(600,600);
			
			// I am trying to set 2 D array indexes match into the each tile.
			// sudoku parameter is int [][]
			Sudoku easy = new Sudoku(GRID_TO_SOLVE);
			// sudoku 
			
			List<Tile> tiles = new ArrayList<>();
			for(int i=0; i < NUM_OF_ROWS; i++) {
				
				tiles.add(new Tile(String.valueOf(n)));
				tiles.add(new Tile(String.valueOf(n)));
				n++;
			
			}
			
			Collections.shuffle(tiles);
			
			for (int i = 0; i <tiles.size(); i++){
				Tile tile = tiles.get(i);
				tile.setTranslateX(50 *(i % NUM_PER_ROW));
				tile.setTranslateY(50 *(i / NUM_PER_ROW));
				root.getChildren().add(tile);
			}
			return root;
	}
	
		private class Tile extends StackPane {
		
		private Text text = new Text();
		
		public Tile(String value) {
			Rectangle border = new Rectangle(50,50);
			border.setFill(null);
			border.setStroke(Color.BLACK);
			
			text.setText(value);
			text.setFont(Font.font(30));
			

			getChildren().addAll(border, text);
			
			setOnMouseClicked(event -> {
				if(isOpen())
					return;
					
				if (selected == null) {
					selected = this;
					open(()-> {}); // this calls on runnable 
				} else {
					open(() -> {
								if (!hasSameValue(selected)) {
									selected.close();
									this.close();
								}
								
								selected = null;
					});
				}
			});
			
			close();
		}
		
		public boolean isOpen() {
			return text.getOpacity() == 1;
		}
		
		public void open(Runnable action){
			FadeTransition ft = new FadeTransition(Duration.seconds(0.5), text);
			ft.setToValue(1);
			ft.setOnFinished(e -> action.run());
			ft.play();
		}
		
		public void close(){
			
			FadeTransition ft = new FadeTransition(Duration.seconds(0.5), text);
			ft.setToValue(0);
			ft.play();
		}
		
		public boolean hasSameValue(Tile other) {
			return text.getText().equals(other.text.getText()); // this returns true if the one selected tile equals the other selected tile
		}

	}

	

	public static int[][] GRID_TO_SOLVE = {
		
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
	
	
	public static void main(String[]args){
	
	Sudoku easy = new Sudoku(GRID_TO_SOLVE);
	launch(args);
	}
	
}
