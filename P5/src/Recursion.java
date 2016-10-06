import java.util.ArrayList;

public class Recursion {

	public String dupEachChar(ArrayList<Character> str) {
		// finish
		return null;

	}

	public String addStars(ArrayList<Character> str) {
		if(str.size() ==0){
		return null;
		}
		return null;
	}

	public int sumOfSquares(ArrayList<Integer> num) {
		return num.get(0);
		
	}

	public int sumOfCubes(ArrayList<Integer> num) {
		return -1;
	}

	// testing method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ints = new ArrayList<>();
		int a = 1, b = 2, c = 3;
		ints.add(a);
		ints.add(b);
		ints.add(c);
		
		Recursion r1 = new Recursion();
		r1.sumOfSquares(ints);
		System.out.println(r1.sumOfSquares(ints));
	}

}
