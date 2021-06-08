import java.io.*;
import java.util.*;
public class SudokuGame{
	
/*----------------------------------------------------------------------
 * The scanner can export the input from the file as an integer.
 * ---------------------------------------------------------------------
 * Q How can it print out the value in an array?
 * A.
 * ---------------------------------------------------------------------
 * Q Looking at the array file, I need to convert the text file of numbers 
 * into a 2 dimensional array.
 */	
	public static void main(String[]args)throws FileNotFoundException{
		/*Scanner objects for sudoku puzzle
		 *File consists of 9 by 9 integers.
		*/
		File sudoku1 = new File("sudokuEasy.txt");
		Scanner easy =  new Scanner(sudoku1);
		
		//File sudoku2 = new File("sudokuMedium.txt");
		//Scanner medium =  new Scanner(sudoku1);
		
		//File sudoku3 = new File("sudokuDifficult.txt");
		//Scanner difficult =  new Scanner(sudoku3);

		
		//File students = new File("students.txt");
		//Scanner scan = new Scanner(students);
		
		// Easy scanner scans for input from a file.
		while(easy.hasNext()){
			Scanner parseLine = new Scanner(easy.nextLine());
			
			System.out.println(parseLine.nextLine());
			
			//System.out.println("family: " + parseLine.next());
			//System.out.println("year: \t" + parseLine.next());
			//System.out.println("avg: \t" + avg(parseLine.nextLine())+"\n");
			// given family year grades.....
		}
		
		//int x = Integer.parseInt("100");
		//Scanner console = new Scanner(System.in);
		//int y = 10/ console.nextInt();
		//System.out.println(y);
	}
	
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
 *Files.java I incorporated the scanner object to output a file 2D array of sudoku file.
 */ 
