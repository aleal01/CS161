import java.util.Scanner;
public class Parade {

	long pars (int n){
		if (n==1)
			return 2;   //  Float or Band
		else if (n==2) 
			return 3;  //  Float/Band or Band/Float or Float/Float
		else
			return pars(n-1)+pars(n-2);
	}
	
	long pars (int n, long[] A){
		if (n==1)
			return 2;   //Float or Band
		else if (n==2) 
			return 3;  //  F/B or B/F or F/F
		else {
			if (A[n] == 0)
				A[n] = pars(n-1,A) + pars(n-2,A);
			return A[n];
		}

	}


	public static void main(String[] args) {
		Parade p = new Parade();
		
		for (int n=1; n<48; n++)
			System.out.println("slow Parade(" +n+ ") = " + p.pars(n));
		
		Scanner Input = new Scanner(System.in);
		System.out.print("\nReady for fast Parade? ");
		String s = Input.next();
		 
		for (int n=1; n<70; n++) {
			long[] A = new long[n+1];
			for (int i=0; i<n+1; i++) 
				A[i] = 0;
			System.out.println("fast Parade(" +n+ ") = " + p.pars(n,A));
			}
	}

}
