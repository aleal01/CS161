import java.util.Random;

public class RandomSearch implements Searching{
	public int search(int[] numbersToSearch, int numberToSearchFor) {
		Random rn = new Random();
		int index = rn.nextInt(numbersToSearch.length - 0) + 0;
		for(int i = 0; i < 5; i++){
			if(numberToSearchFor== numbersToSearch[index]){
				return index;
			}
		}
		return index;
		}
	
	public static void main(String[] args) {
		
		int[] array = {233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368};
		
		// TODO Auto-generated method stub
		
		System.out.println("Random Search");
		RandomSearch rs = new RandomSearch();
//	and one more time.
		System.out.println(rs.search(array, 0));
		System.out.println(rs.search(array, 233));
		System.out.println(rs.search(array, 2584));
		System.out.println(rs.search(array, 46368));
		System.out.println(rs.search(array, 99999));
		
	}

	
	

}
