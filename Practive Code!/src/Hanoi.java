
public class Hanoi {
	private int count = 0;

	public int getCount(){
		return count;
	}

	/*
	 * recursively generate the moves for towers of hanoi
	 * @param n - number of disks
	 * @param from - the source peg
	 * @param to - the target peg
	 */
	public void hanoi(int n, int from, int to){
		if (n>0) {
			int via = 6 - from - to;  // the peg via which the disks will be moved
			hanoi(n-1,from, via);
			System.out.println("move disk " + n + 
					           " from " + from + " to " + to);
			count++;
			hanoi(n-1,via,to);
		}
	}

	public static void main(String[] args) {

		Hanoi h = new Hanoi();
		h.hanoi(3, 1, 3);
		System.out.println("number of moves: " + h.getCount());
	}

}
