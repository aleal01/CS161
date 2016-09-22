import java.text.spi.NumberFormatProvider;
import java.util.Arrays;

public class TestCode1 {
	
	public int convertNum(int[] num){
		// pre: num.length > 0
		// post: return int representation of num, 
		// e.g num:{1,2,3} returns int: 123
		return 1;
	}
		
	public static void main(String[] args){
	// (1) create a java int array
	int[] intArray = new int[3];
	TestCode1 A3 = new TestCode1();
	
	// (2) some time later ... assign elements to the array
	intArray[0] = 3;
	intArray[1] = 4;
	intArray[2] = 5;

	// (3) print our java int array
	for (int i=0; i<intArray.length; i++)
	{
	  System.out.print(intArray[i]);
	}
	
	int[] num123 = {1,2,3};
    System.out.println( Arrays.toString(num123) + ": "+ A3.convertNum(num123));
	
	
}
	}
