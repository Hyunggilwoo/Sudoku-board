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

import javafx.scene.paint.*; // import paint.Color
import javafx.scene.shape.*; // import shape.Rectangle, Circle
import javafx.scene.text.*; // import text.Font, Text
import javafx.stage.*; // Import stage.Stage



public class Main extends Application{

	
	
	Sudoku easy = new Sudoku(GRID_TO_SOLVE);

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Everyday Sudoku");
						
		// sudoku be scanned in the textArea from fxml file 
		TextArea textArea = new TextArea();
		textArea.setText(easy.toString());
		
		// Creating buttons
		Button buttonE = new Button("Easy");
		Button buttonM = new Button("Medium");
		Button buttonD = new Button("Difficult");
		
		//Creating UserName and PassWord
		TextField userName = new TextField();
		TextField passWord = new TextField();
		// actually show the gui fx
		


		VBox vbox = new VBox(textArea, buttonE, buttonM, buttonD, userName, passWord); // text area from a fx not fxml
		Scene scene = new Scene(vbox, 1200, 800);
		primaryStage.setScene(scene);
		primaryStage.show();
				

		
		
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

		launch(args);
	}
	
}
