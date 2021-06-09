/*----------------------------------------------------------------------
 *                              Limitations
 * 1. Assumes that the sudoku will be size of the same index in row and in column.
 * 2. I am not sure how my default constructor will present. 
 * 			Will it contain zeros, probably.
 * 3. Because it is a public sudoku, it is immune to being editted at each index.
 */ 
import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[]args){
		try{
			// count number of rows
			/*Why count the number of students, because it creates an index of array
			 *based on the number of integers it counted from the text.  
			*/
			File sudoku1 = new File("sudokuEasy.txt");
			Scanner scan =  new Scanner(sudoku1);
			PrintStream out = System.out;
			int count = 0;
			while(scan.hasNext()){
				count++;
				scan.nextLine();
			}
			
			
			
			/* Constructing a 2 dimensional array with the size of count.
			 * The array now has a size of the count ( 9 by 9)
			 * June 8, 21:48
			 * I am tweaking on how the scanned value from parseLine can be stored 
			 * at the index of i.
			 * 
			 * 
			 */ 
			int [][] directory = new int [count][count];
			scan = new Scanner(sudoku1); // reset the scanner called scan
			for(int row =0;row < count;row++){ // Outer loop moves the scanner from top row to bottom row.
				
				/*  
				 * 
				 */ 
				
				for(int col= 0;col <count;col++){ // Inner loop moves the scanner from the beginning of index to the end of the index
					Scanner parseLine = new Scanner(scan.next());
					directory[row][col] = parseLine.nextInt();
				System.out.print(directory[row][col]);
				}
				System.out.println();
				
				// Stores the given section of info from the scanner into the array.
				//String given = parseLine.next();
				//String family = parseLine.next();
				//int year = parseLine.nextInt();
				//String[]grades = parseLine.nextLine().trim().split(" "); //trim splices space infront and behind the input of array.
				//Student temp = new Student(given, family, year, grades);
				//directory[i] = temp;
			}
			
			Arrays.sort(directory);
			System.out.println(Arrays.toString(directory));
			
			/* This releases the given number of values stored in private.
			 * Q It would be valuable for my sudoku to not be tampered by outside
			 * enumeration. Do I need to release some values from the sudoku?
			 */ 
			//System.out.println(directory[0].getGiven());
			//System.out.println(directory[0].getFamily());
			//System.out.println(directory[0].getYear());
			
			// try and fail to tamper with grades
			String[] newGrades = directory[0].getGrades();
			newGrades[0] = "100";newGrades[1] = "100";newGrades[2] = "100";newGrades[3] = "100";
			
			System.out.println(Arrays.toString(directory[0].getGrades()));
			
			
		}catch(FileNotFoundException fnfe){
			System.out.println(fnfe.getCause());
			System.out.println(fnfe.getMessage());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
