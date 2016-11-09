import java.io.File;
import java.util.Scanner;

public class Maze implements IMaze {
	
	public int rows;
	public int cols;
	public char[][] maze;
	public int RowStart;
	public int ColStart;
/* Precondition - filename set to file containing map of the maze.
		 * Postcondition - two dimensional char array holding a map of the maze
		 * Postcondition - returns null if file not found
		 */
	@Override
	public char[][] readFile(String filename) {
		Scanner scanner = null;
		try{
			scanner = new Scanner(new File(filename));
		} catch(Exception e){
			System.out.println("Not found");
			System.exit(1);
		} 
		rows = scanner.nextInt();
		cols = scanner.nextInt();
		maze = new char[rows][];
		int row = 0;
		while(scanner.hasNext()){
			String lines = scanner.nextLine();
			if(lines.length() > 0){
				maze[row++] = lines.toCharArray();
			}
		}
		scanner.close();
				
		return maze;
		
	}

	@Override
	public int[] findStart(char[][] maze) {
		
		for (int r = 0; r < rows; r++)
		    for (int c = 0; c < cols; c++)
			if (maze[r][c] == 'S') {
			    RowStart = r;
			    ColStart = c;
			} else{
				System.out.println("No S found");
			}
		int [] startA = {RowStart,ColStart} ;
		/* Precondition - maze array initialized to a valid maze
		 * Postcondition - array containing row, column of location of S 
		 * 		returned.  Ex. if S is in maze[1][2]. the return 
		 * 		array is {1, 2}
		 * Postcondition - returns null if no S found
		 */
		return startA;
	}
	
	//The findPath method described in the interface
	//will call a private helper method called recPath. 
	//The signature of recPath is:

	private String recPath(char[][] maze, int r, int c){
		
		if (r < 0 || r >= rows || c < 0 || c >= cols) {
		    return "";
		}

		char waldo = maze[r][c];
		if (waldo == '#' || waldo == '.') {
		    return "";
		}

		if (waldo == 'G') {
		    return "G";
		}
		
		maze[r][c] = '.';
		
		String wheres = recPath(maze, r-1, c);
		
		if (wheres.length() > 0) { 
		    return "U" + wheres;
		}
		
		wheres = recPath(maze,r,c+1);
		
		if (wheres.length() > 0) {
		    return "R" + wheres;
		}
		
		wheres = recPath(maze,r+1,c);
		
		if (wheres.length() > 0) {
		    return "D" + wheres;
		}

		wheres = recPath(maze,r,c-1);
		if (wheres.length() > 0) {
		    return "L" + wheres;
		}
		maze[r][c] = ' ';
		return "";
	    }
		

    /*
     * Precondition - maze array initialized to a valid maze
     * Postcondition - returns the path from the location r,c to the goal
     * Postcondition - '.' set from location r,c in the maze to the goal
     * Requirement - Implemented as a recursive method that finds a path
     *               from position (row,col) to the goal position,
     *               marked by 'G'
     */
	
	public String findPath(char[][] maze, int[] startPosition) {
		String waldofound = recPath(maze, RowStart, ColStart);
		maze[RowStart][ColStart] = 'S';
		return waldofound;
	    }
		/* Precondition - maze array initialize to a valid maze
		 * Precondition - StartPosition contains row, column of location of S 
		 * 		Ex. if S is in maze[1][2], the startPosition 
		 * 		 array is {1, 2}
		 * Postcondition - returns a String composed of the appropriate
		 *     characters from  'U', 'R', 'D', 'L', and the final 'G', 
		 *     indicating the solution path.
		 * Postcondition - successful path marked with '.' characters in maze
		 * 		 array from 'S' to the final 'G', indicating the 
		 * 		 solution path.
		 */

	@Override
	public String printMaze(char[][] maze) {
		
		String result = "";
		for (int r = 0; r < rows; r++) {
		    for (int c = 0; c < cols; c++)
			result += maze[r][c];
		    result += "\n";
		}
		return result;
	    }
		/*
		 * Postcondition - returns a String representation of the map character array
		 * 	(complete with end of line characters).
		 */
	

	public static void main(String[] args) {
		String filename = args[0];
		
		
		Maze maze = new Maze();
		char[][] mazes = maze.readFile(filename);
		int[] start = maze.findStart(mazes);
		maze.readFile(filename);
		maze.printMaze(mazes);
		System.out.println(maze.printMaze(mazes));
		
		System.out.println("Finding Start for you:): ");
		System.out.println(start.toString());
		
		// Solving maze filename now
		System.out.println("Solving Maze for you: ");
	    }

	}
	
