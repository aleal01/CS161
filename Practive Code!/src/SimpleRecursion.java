import java.util.Arrays;

public class SimpleRecursion {

	/**
	 * precondition:  n>0
	 * postcondition: print n stars
	 * @param n number of stars to print
	 */
	private void printStars(int n) {
		if (n == 1) {
			System.out.println("*");
		} else {
			System.out.print("*");
			printStars(n - 1);
		}
	}


	/**
	 * method for recursively computing n!
	 * precondition: n>=0
	 * postcondition: returns n!	
	 * @param n
	 */
	public int factorial(int n){
		if (n==0) {
			System.out.println("BASE CASE:   factorial(0) = 1");
			return 1;
		}
		else {
			System.out.println(spaces(n) + "current n: " + n);
			int result = factorial(n-1) * n;
			System.out.println(spaces(n) + "current n: " + n + " current result: " + result);
			return result;
		}
	}
	
	private String spaces(int level) {
		String s = "";
		for(int i=0;i<level;i++)
			s+="  ";
		return s;
	}

	public int max(int [] list){
		return recursiveMax(list, 0);
	}

	/**
	 * recursive method for computing the maximum element in part of an array
	 * that starts at a given index
	 * precondition:   0 <= start < list.length
	 * postcondition:  returns the maximum in list[start],...,list[list.length - 1]
	 * @param list - an array of integers
	 * @param start - the starting index
	 */
	public int recursiveMax(int [] list, int start){
		if (start == list.length - 1) {
			return list[start];
		}
		else {
			return Math.max(list[start], recursiveMax(list, start + 1));
		}
	}


	public int max2(int [] list){
		if (list.length == 1){
			return list[0];
		}
		return Math.max(list[0], max2(Arrays.copyOfRange(list, 1, list.length)));
	}
	
	
	public static void main(String[] args) {

		SimpleRecursion rec = new SimpleRecursion();

		rec.printStars(10);

		System.out.println("computing factorial("+ 5 +")");
		System.out.println("factorial("+5+")=" + rec.factorial(5));

		int [] list = { 1, 5, 2, 6, -1, 3};
		System.out.println("maximum in the list: " + rec.max(list));
		System.out.println("maximum in the list: " + rec.max2(list));

	}
}
