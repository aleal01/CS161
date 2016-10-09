import java.awt.List;
import java.util.ArrayList;

public class ArrayRecursion {

	public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        //print the sum in here 
        System.out.println(sumListRecursive(numbers));


    }

    public static int sumListRecursive(java.util.List<Integer> list) {
        if (list.isEmpty() == true ) {
            return 0;
        }
        else {
            /* removed the print statement from here as it prints each time the function is called and else is executed. */
            return list.get(0) + sumListRecursive(list.subList(1, list.size()));
        }
    }
	
	
}
