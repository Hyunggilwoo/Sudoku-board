import java.io.*;
import java.util.*;
public class SudokuGame{
	
/*----------------------------------------------------------------------
 *                           Algorithm process
 * The scanner can export the input from the file as an integer.
 * 
 * 
 * User selects the level of difficulty of the sudoku (easy, medium, difficult)
 * Import a sudoku with the level that the user picked
 * Generate a sudoku puzzle that contains the numbers imported from the file.
 * ---------------------------------------------------------------------
 *                           Limitations
 * I am not sure how the user can check if the entered values are correct.
 * 
 * ---------------------------------------------------------------------
 * Q How can it print out the value in an array?
 * A.
 * ---------------------------------------------------------------------
 * Q Looking at the array file, I need to convert the text file of numbers 
 * into a 2 dimensional array.
 * A.
 * Q How do I make the program interactive so that people can enter the number.
 * 
 */	
	public static void main(String[]args)throws FileNotFoundException{
		/*Scanner objects for sudoku puzzle
		 *File consists of 9 by 9 integers.
		*/
		File sudoku1 = new File("sudokuEasy.txt");
		Scanner easy =  new Scanner(sudoku1);
		
		/* @param counter will measure the length of an array using a for loop
		 * 
		 * Outer for loop counts the array of a column
		 * 	for ( store the integers in each line into 1 dimensional array, or the column.)
		 * col [i] = easy.nextInt();
		 * 		 for ( store the integers in each line into the 2nd dimensional array, the row)
		 */ 
		
		// Easy scanner scans for input from a file.
		while(easy.hasNext()){
			
			int count = 0;
			Scanner parseLine = new Scanner(easy.nextLine());
			for(int i = 0; i<easy.length; i++){
				count++;
				
				System.out.println(parseLine.nextLine());
			}
		
		System.out.println(count);
		
		
		}

/*------------------------------------------------------------------------
 * Example of a method that prints the individual value from array
 */ 
	String [][] mindBlown= {{"hello", "there"},{"my", "name", "is"},{"adrian"}};
		
		for(int i = 0;i<mindBlown.length;i++){
			System.out.println(Arrays.toString(mindBlown[i]));
		}
		
		for(int i = 0;i<mindBlown.length;i++){
			for(int j= 0;j<mindBlown[i].length;j++){
				System.out.println(mindBlown[i][j]);
			}
			System.out.println();
		}
		
		
		
		//This starts the mystery number game.
		// I hope that sudoku game can be written in a similar format.
		mysteryNumber();
	}
	
	public static void mysteryNumber(){
		
		
		Scanner console = new Scanner(System.in);
		String playAgain = "";
		/* Do while loop asks if the user wants to repeat the loop again
		 * when they enter y.
		 */ 
		do{
			//Create a random number that the user guesses
			int mystery = (int)(Math.random()*100+1);
			System.out.println("Enter a guess between 1 to 100");
			int guess = console.nextInt();
			/*It asks if it is higher or lower than the guess.
			 * The while loop repeats until the guess equals the mystery.
			 */ 
			do{
				if(guess < mystery){
					System.out.println("Guess higher");
				}else{
					System.out.println("Guess lower");
				}
				guess = console.nextInt();
			}while(guess != mystery);
			System.out.println("Congrats! you found the mystery number. Would you like to play again? (y/n)");
			playAgain = console.next();
		} while(playAgain.equalsIgnoreCase("y"));
	}
	
	// Returns the average of the grades.
	public static double avg(String grades){
		Scanner parseGrades = new Scanner(grades);
		double sum = 0;
		int num = 0;
		while(parseGrades.hasNext()){
			sum +=parseGrades.nextInt();
			num++;
		}
		return sum / num;
	}
}
/*Citation:
 * 	Inspiration of using an array to scan input.
 * https://www.tutorialspoint.com/How-to-read-data-from-scanner-to-an-array-in-java
 * 
 *Files.java I incorporated the scanner object to output a file 2D array of sudoku file.
 */ 
