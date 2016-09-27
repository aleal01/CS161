
public class ParkingLot {
	
	   /**
     * 
     * @param n>0 size of the parking lot
     * @return the number of ways we can park:
     *   Explorers: size 2
     *   Civics:  size 1
     *   in a parking lot of size n > 0
     *    
     */
	public long  parkingLot(int n)
	{
		// System.out.println("parkingLot(" + n + ")");
		if (n == 1) return 1;  // a Civic
		else if (n == 2) return 2;  // an Explorer or two Civics
		else return parkingLot(n-2)  // An Explorer in last position
	        	  + parkingLot(n-1); // A Civic in last position
	}

	/**
	 * 
	 * @param n>0: size of parking lot
	 * @param A: array of solved parking lot problems
	 * @return the number of ways we can park:
     *   Explorers: size 2
     *   Civics:  size 1
     *   in a parking lot of size n > 0
	 */
	public long parkingLot (int n, long [] A) {
		//System.out.println("fast Lot(" + n + ")");

		if (A[n] == 0) { // you haven't already solved this subproblem
		  if (n == 1) A[n] = 1;       // C
		  else if (n == 2) A[n] = 2;  // E ;CC
		  else A[n] =    parkingLot(n-2,A)  // Excursion in last position
				       + parkingLot(n-1,A); // Civic in last position
		}
		return A[n];
	}

	public static void main(String[] args){
	ParkingLot P = new ParkingLot();
     for(int i = 1; i < 50; i++){
		long[] lot = new long[i+1];
    	System.out.print("Fast lot "+i+": "); System.out.println(P.parkingLot(i,lot));
    	System.out.print("Slow lot "+i+": "); System.out.println(P.parkingLot(i));    	
     }
	}
	
}
