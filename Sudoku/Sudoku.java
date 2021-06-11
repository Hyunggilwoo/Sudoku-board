import java.awt.Desktop;
import java.awt.Desktop.*;
import java.io.*;
import java.net.*;
import java.util.*;

/* I imported a sudoku class.
 * A sudoku class method that scans a sudoku file.
 * 
 * The result, when the user runs the main method, the user can start playing the grid.
 * 
 */
 
 /* Constructor Sudoku creates a 2 D array.
 *  Add on: Create setSudoku method that scans a file
* Output of getSudoku equals int [][] GRID_TO-Solve
* 		Currently, the main method prints sudoku, but the 
* 		printed array is not initialized.
// 
// int [][] GRId_TO_SOLVE is a variable is called to be solved.
// 
// The current algorithm relies on creating a variable that is
*  pushed into method called display.
* --------------------------------------------------------------
*                      Interesting thoughts
* Can I use enum to switch several types of sudoku?
*  
*--------------------------------------------------------------- 
*                   How do I let user choose difficulty of the game?
*Or I have the JavaFX have the user initiate which difficulty level of sudoku to choose from.
* 
* 
* 
* If the user clicks medium
* 	Somehow, the backend method opens sudokuMedium.txt
* 
* Q How can I call the method to open a specific file?
* A There are specific files associated when the user clicks "easy", "medium", or "difficult"
*  
*I want to create a sudoku object method that opens up the easy sudoku puzzle. 
*
*	So if the user clicks easy
* 	Then, somehow the java method to open the sudokuEasy.txt will be opened. 
* 
* 
* 
*/
public class Sudoku {
	
	private static int[][] GRID_TO_SOLVE = {
	
	
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
			// count number of rows
			/*Why count the number of students, because it creates an index of array
			 *based on the number of integers it counted from the text.  
			*/
			File puzzle = new File("sudokuMedium.txt"); // Scans a file
			Scanner scan =  new Scanner(puzzle); // Creates a scanner object scan that scans each row of index.

			board = new int [SIZE][SIZE];
			for(int row =0;row < SIZE;row++){ // Outer loop moves the scanner from top row to bottom row.
				for(int col= 0;col <SIZE;col++){ // Inner loop moves the scanner from the beginning of index to the end of the index
					Scanner parseLine = new Scanner(scan.next());
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
	/* toString method is essential to print the array in TextArea in the Main.java.
	 * 
	 */ 
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

	
	// getBoard() is not working.
	public int[][] getBoard(){
		return Arrays.copyOf(board,board.length);
	}
	
	public static void main(String[] args) {
		Sudoku sudoku = new Sudoku(GRID_TO_SOLVE); //GRID_TO_SOLVE is the variable that needs to be solved.
	}
}
