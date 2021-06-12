import java.awt.Desktop;
import java.awt.Desktop.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class Sudoku {
	// initialize a scanner globally.
	static Scanner stdin = new Scanner(System.in);
	
	/* Parameter of the sudoku is called int[][] board
	 * For now, the size is set to 9 by 9.
	 */ 
	private int[][] board;
	public static final int SIZE = 9; // size of the Sudoku grids
	
	// setBoard creates a variable int[][] that is passed into be solved in a method.
	// setSudoku accepts a scanner input of a file that the user selects.

	public Sudoku(int[][] board) {
		setBoard();
	}
	

	public void setBoard (){
		try{
			// Prompts the user to select the difficulty of sudoku puzzle from the command prompt.
				int fileLevel = 0;
			do{
				System.out.println("What level of sudoku do you want to play? Enter 1 for Easy, 2 for medium, and 3 for difficult.");
				fileLevel = stdin.nextInt();
					
				if ( fileLevel == 1){
					stdin = new Scanner(new File("sudokuEasy.txt"));
				} else if (fileLevel == 2){
					stdin = new Scanner(new File("sudokuMedium.txt"));
				} else if (fileLevel == 3){
					stdin = new Scanner(new File("sudokuDifficult.txt"));
				} else {
					System.out.println("You did not enter 1, 2, or 3. Please Enter again to play Sudoku.");
				}
			} while(fileLevel == 1 && fileLevel == 2 && fileLevel == 3);
				
			board = new int [SIZE][SIZE];
			for(int row =0;row < SIZE;row++){ // Outer loop moves the scanner from top row to bottom row.
				for(int col= 0;col <SIZE;col++){ // Inner loop moves the scanner from the beginning of index to the end of the index
					Scanner parseLine = new Scanner(stdin.next()); // Scans the file into a string.
					board[row][col] = parseLine.nextInt();
				}
				System.out.println();                    // When each row printed, cursor moves to the new line and prints.
			}

		}catch(FileNotFoundException fnfe){
				System.out.println(fnfe.getCause());
				System.out.println(fnfe.getMessage());
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
	}
	// toString method is essential to print the array in TextArea in the Main.java.
	public String toString() {
		String s = "";
		
		for(int[] array: board){
			for(int cell: array){
				s = s + (cell + " "); 
			}
			s = s + "\n";
		}
		return s;
	}

}
