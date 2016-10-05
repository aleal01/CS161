
public class LinearSearch implements Searching {
	
	/*for (c = 0; c < n; c++)
    {
        if (array[c] == search)      Searching element is present 
        {
           System.out.println(search + " is present at location " + (c + 1) + ".");
            break;
        }
     }
     if (c == n)   Searching element is absent 
        System.out.println(search + " is not present in array.");
    }*/

	@Override
	public int search(int[] numbersToSearch, int numberToSearchFor) {
		 int size = numbersToSearch.length;
	        for(int i=0;i<size;i++){
	            if(numbersToSearch[i] == numberToSearchFor){
	                return i;
	            }
	        }
	        return -1;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368};
		
		LinearSearch ls = new LinearSearch();
//	Search for a number here and print out the index...
		System.out.println("Linear Search");
		System.out.println(ls.search(array, 0));
		System.out.println(ls.search(array, 233));
		System.out.println(ls.search(array, 2584));
		System.out.println(ls.search(array, 46368));
		System.out.println(ls.search(array, 99999));
		System.out.println();


	}

}
