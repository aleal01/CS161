import java.util.Scanner;

public class Combi {

	/**
	 * Recursive computation of n choose k
	 * @param n >= 0
	 * @param k <= n
	 * @return the number of possible combinations of
	 * k out of n
	 */
	public long combRec(long n, long k){
		// pre: 0 <= k <= n
		// post:  return the number of possible combinations of
		// k out of n
		if (n==k || k==0) return 1;
		else // n>k and k>0
			return combRec(n-1,k-1) + combRec(n-1,k);
	}

	/*
	 * Fast Spock
	 */
	public long combFast(int n, int k, long[][] A) {
		long r;
		if (n==k || k==0) {
			A[n][k]=1;
			return 1;
		}
		else if (A[n][k] == 0) {
			r = combFast(n-1,k-1,A) + combFast(n-1,k,A);
			A[n][k] = r;
			return r;
		}
		else {
			r = A[n][k];
			return r;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		int n;
		long start, finish, res;
		Combi S = new Combi();
		do{
			System.out.println("Enter set size n>0  (0 to finish)");
			n = Input.nextInt();

			if(n>0) {
				long[][] A = new long[n+1][n+1];
				for(int k = 0; k<=n; k++){ 

					start = System.currentTimeMillis();
					res = S.combFast(n, k, A);
					finish = System.currentTimeMillis();
					System.out.println("Number of combinations (fast): (" +
							n + " choose " +k+ ")  =  " + res + " time = " + (finish-start) + "  milliseconds");

					start = System.currentTimeMillis();
					res = S.combRec(n, k);
					finish = System.currentTimeMillis();
					System.out.println("Number of combinations (slow): (" +
							n + " choose " +k+ ")  =  " + res + ", time = " + (finish-start) + "  milliseconds\n");


				}
			}
		}
		while (n > 0);
	}

}
