import java.util.ArrayList;
import java.util.Arrays;


import java.util.ArrayList;
import java.util.Arrays;

public class Assign4 {
	//base case
	//operation
	//return
	public void printPattern(int n){
		//base case: n - line ==  0
		//operation: create a line with * + -
		//return: print string
		// pre: n>0
		// post: print a pattern of n+1 ( 0 to n ) lines
		// line i (i = 0 to n) has i stars ("*")
		//                     followed by (n-i) stripes ("-") 
		//System.out.println("printPattern not implemented yet");
		//2 helpers
		//1)prints output of 2
		//2)creates the lines themselves
		printHelper(0, n);
		return;
	}
	private void printHelper(int n, int lines){
		//prints the output of linecounter
		//effectively counts line while line counter creates the actual output
		System.out.println(linecounter(n,lines));
		if(lines ==0){
			return;
		}else{
			//increments n and decrements lines until lines == 0 meaning that the original n has been met
			printHelper(n+1,lines-1);
		}
	}
	private String linecounter(int n, int lines){
		//increments lines until return
		String ret = "";
		if(n>0){
			return ret+"*"+linecounter(n-1,lines);
		}else if(lines>0){
			return ret+"-"+linecounter(n,lines-1);
		}else{
			return ret;
		}
	}
	
	public int convertNum(int[] num){
		//base case: n.length == 0
		//operation: convert array to int;
		//return: is an int * radix 
		// pre: num.length > 0
		// post: return int representation of num, 
		// e.g num:{1,2,3} returns int: 123
		//System.out.println("convertNum not implemented yet");		
		return convertHelper(num,num.length-1);
	}
	private int convertHelper(int[] num, int index){
		//sum will be the recursive call
		//sum == sum num[n-1]
		//operation = sum*10+num[i]
		if(index == 0){
			//base case
			return num[0];
		}
		//recursive call and operation
		return ((convertHelper(num,index-1)*10)+num[index]);
	}
	
	public ArrayList<String> intersection( ArrayList<String> AL1, ArrayList<String> AL2){
		//base case: both arraylists are empty
		//operation: check if elements are equal
		//return: similar elements
		// pre:  AL1 and AL2 are not empty
		//       and elements in AL1 are unique
		//       and elements in AL2 are unique
		//       (but AL1 and AL2 can contain the same elements)
		// post: return an ArrayList with elements that are in both AL1 and AL2
		//       *** in the order they occur in AL1 ***
		//       and *** leave AL1 and AL2 unchanged ***
		System.out.println("intersection not implemented yet");		
		return intHelper(AL1, AL2, 0, 0);
	}
	private ArrayList<String> intHelper(ArrayList<String> AL1, ArrayList<String> AL2, int index1, int index2){
		ArrayList<String> empty = new ArrayList<String>();
		//increment index1 then index2 and compare al1[i1] to al2[i2]
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