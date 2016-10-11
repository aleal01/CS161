import java.util.ArrayList;

public class Recursion {

	public String dupEachChar(ArrayList<Character> str) {
		// finish
		return null;

	}

	public String addStars(ArrayList<Character> str) {
		return "";
	}

	public int sumOfSquares(ArrayList<Integer> num) {
		//arraylist 1,2,3
		//return New Arraylist 1,1,2,4,3,9
		int result = 0;
		int index = 0;
		if(num.get(index) == 0 || num.get(index)== null ){
			return 0;
		
		} else{
			result += Math.pow(num.get(index), 2);
			num.add(index + 1, (int) Math.pow(num.get(index), 2));
			index++;
			sumOfSquares(num);
		}
		return result;
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
		System.out.println(ints.toString());
		
		Recursion r1 = new Recursion();
		r1.sumOfSquares(ints);
		System.out.println(r1.sumOfSquares(ints));
	}

}
