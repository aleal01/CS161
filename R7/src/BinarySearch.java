
public class BinarySearch implements Searching {
	
	
	public int search(int[] numbersToSearch, int numberToSearchFor) {
		return binarySearch(numbersToSearch, numberToSearchFor, 0, numbersToSearch.length - 1);
	}

	private  int binarySearch(int[] a, int target, int first, int last) {
		if (first > last) {
			return -1;   // not found
		} 
		int mid = (first + last) / 2;
		if (a[mid] == target) {
			return mid;   // found it!
		} 
		else{
			if (a[mid] < target) {
				// middle element too small; search right half
				return binarySearch(a, target, mid+1, last);
			}
			else {  // a[mid] < target
				// middle element too large; search left half
				return binarySearch(a, target, first, mid-1);
			}
		}
	}

	

}
