[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=4823718&assignment_repo_type=AssignmentRepo)
# FinalCS1 Sudoku Puzzle

This is a sudoku puzzle that generates a puzzle scanned from a file. The user selects the difficulty of the puzzle from "easy", "medium", and "difficult" to play the sudoku puzzle. 

Sudoku puzzle

 
 ## Dependency and Installation Instructions
 This program reguires Java, JavaFX, Geany (IDE).
 
 ## Instructions on configuration and execution of your project

 ## Sample output (images appreciated)

### A description of your repository and overall software design
Algorithm
  1. Select the difficulty of the sudoku puzzle from easy, medium, and difficult.
  2. Scanner imports a sudoku text file into a 2 dimensional array.
  3. Present the 2 D array of text fields.
  4. User enters integer inside the array presented in the GUI.
  5. The user input is stored inside the text box.
  6. If the user enters non integer, the text box changes color.
  7. Game completes when the user enters all of the input inside the grid.
  8. User innitiates whether to play the game again.
 
 ## Citations, Challenges.
 
 * Inspiration of using an array to scan input.
 * https://www.tutorialspoint.com/How-to-read-data-from-scanner-to-an-array-in-java
 *  Learning to use GUI to create a game board.
 * https://www.youtube.com/watch?v=QjuytZhQYo8&t=317s
 * 	Inspiration of a code on creating a grid and checking for validity from Emory University Computer Scicne
 * http://www.mathcs.emory.edu/~lxiong/cs170/share/code/chapter6/Sudoku.java.html
 * Files.java I incorporated the scanner object to output a file 2D array of sudoku file. I gained inspiration from student.java and studentDirectory.java from Professor Adrian Veliz's class. 
 
## Project Requirements 

Please use this repository to submit your Final Project, the requirements for which are listed below. You may assist your fellow students but do NOT share answers/code. Additionally, this repo contains demo code that may help you complete your Final Project.

Please delete the terminal and GUI directories and update the yml file by your last commit.
- A well documented and useful README.md including
  - A description of your project
  -   This is sudoku puzzle generator on a systems console. 
  - Dependency and installation instructions **excluding Geany, Git, Java, JavaFX, and ANSI/Unicode support**
        
  - Instructions on configuration and execution of your project
  -     
  - Sample output (images appreciated)
  - 
  - A description of your repository and overall software design 
  - 
  - Citations, Challenges, and anything else you feel is relevant
      I had challenge in identifying the recursive algorithm to create a sudoku puzzle. 
- A functioning project with a working interface (terminal or graphical) that uses most of the following
  - Methods
  - If/Else 
  - Boolean logic
  - Loops
  - Files
  - Try/Catch
  -   Because sometimes the array runs into an error of running out of bounds, I use try and catch (arrayOutOfBounds)
  - Arrays
  -   Created a 2 dimensional arrays output on the terminal.
  - Custom Objects and Inheritance
  - Switch
  - Enumerated types
- Well documented source code including 
  - classes
  - methods
  - blocks of functionality
  - cryptic individual lines
