
public class Maze implements IMaze {
	
	
	//The findPath method described in the interface
	//will call a private helper method called recPath. 
	//The signature of recPath is:

	private String recPath(char[][] maze, int r, int c) {
		   /*
	     * Precondition - maze array initialized to a valid maze
	     * Postcondition - returns the path from the location r,c to the goal
	     * Postcondition - '.' set from location r,c in the maze to the goal
	     * Requirement - Implemented as a recursive method that finds a path
	     *               from position (row,col) to the goal position,
	     *               marked by 'G'
	     */
		return null;
	}

	@Override
	public char[][] readFile(String filename) {
		/* Precondition - filename set to file containing map of the maze.
		 * Postcondition - two dimensional char array holding a map of the maze
		 * Postcondition - returns null if file not found
		 */
		return null;
	}

	@Override
	public int[] findStart(char[][] maze) {
		/* Precondition - maze array initialized to a valid maze
		 * Postcondition - array containing row, column of location of S 
		 * 		returned.  Ex. if S is in maze[1][2]. the return 
		 * 		array is {1, 2}
		 * Postcondition - returns null if no S found
		 */
		return null;
	}

	@Override
	public String findPath(char[][] maze, int[] startPosition) {
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
		return null;
	}

	@Override
	public String printMaze(char[][] maze) {
		/*
		 * Postcondition - returns a String representation of the map character array
		 * 	(complete with end of line characters).
		 */
		return null;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
