import java.util.ArrayList;
import java.util.Arrays;


import java.util.ArrayList;
import java.util.Arrays;

public class Assign4 {
	
	public void printPattern(int n){
		// pre: n>0
		// post: print a pattern of n+1 ( 0 to n ) lines
		// line i (i = 0 to n) has i stars ("*")
		//                     followed by (n-i) stripes ("-")
		if(n == 0){
			return;
		} 
		System.out.println("printPattern not implemented yet");
	}
	
	public int convertNum(int[] num){
		// pre: num.length > 0
		// post: return int representation of num, 
		// e.g num:{1,2,3} returns int: 123
		int length = num.length;
		if(num.length == 1){
			return num[0];
		} else {
			return num[length-1] + num[length-1];
			
		}
	}
	
	public ArrayList<String> intersection( ArrayList<String> AL1, ArrayList<String> AL2){
		// pre:  AL1 and AL2 are not empty
		//       and elements in AL1 are unique
		//       and elements in AL2 are unique
		//       (but AL1 and AL2 can contain the same elements)
		// post: return an ArrayList with elements that are in both AL1 and AL2
		//       *** in the order they occur in AL1 ***
		//       and *** leave AL1 and AL2 unchanged ***
		System.out.println("intersection not implemented yet");		
		ArrayList<String> empty = new ArrayList<String>();
		return empty;
	}
	
	public static void main(String[] args){
		// Play with recursion:
		// 1. print pattern
		// 2. convert array of digits to int
		// 3. find intersection of two ArrayLists of Strings
		Assign4 A3 = new Assign4();
		
		System.out.println("testing printPattern");
		System.out.println("pattern 5: ");
		A3.printPattern(5);

		System.out.println("\ntesting convertNum");
		int[] num123 = {1,2,3};
        System.out.println( Arrays.toString(num123) + ": "+ A3.convertNum(num123));
   
		System.out.println("\ntesting intersection");
		ArrayList<String> AL1 = new ArrayList<String>();
		ArrayList<String> AL2 = new ArrayList<String>();
		
		AL1.add("a"); AL1.add("b"); AL1.add("c");
		AL2.add("b"); AL2.add("c"); AL2.add("d"); AL2.add("e");
		ArrayList<String> intersect = A3.intersection(AL1,AL2);
		System.out.println(AL1 + " intersect " + AL2 + " = " + intersect);		
	}
}