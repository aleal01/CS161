import java.io.File;
import java.io.IOException;
import java.util.*;

public class Recap {
	
	/**
	 * increment input param i
	 * @param i: input int to be incremented
	 * pre: true
	 * post: i incremented
	 * BUT: ....
	 */
	public void incrInt(int i){
		i++;
		System.out.println("Inside incrInt, i = " + i);
	}

	/**
	 * 
	 * @param A: input array
	 * @param i: index in A
	 * pre: 0 <= i <= (A.length-1)
	 * post: A[i] incremented
	 * AND: ....
	 */
	public void incrArrayEl(int[] A, int i){
		A[i]++;
	}

	/**
	 * 
	 * @param A  array
	 * @param i  index in A
	 * @param j  index in A
	 * 
	 * post: elements i and j in A are swapped
	 */
	public void swap(int[]A, int i, int j){
		int t = A[i]; A[i]=A[j]; A[j]=t;
	}

	/**
	 * 
	 * @param A array to be reversed
	 * 
	 * post: A is reversed
	 */
	public void reverse(int[]A){
		// reverse A by swapping
		// WHY DOES IT WORK? WHAT SHOULD YOU THINK ABOUT?
		for(int i=0;i<(A.length/2);i++){
			swap(A,i,(A.length-1)-i);
		}
	}

	
	/**
	 * 
	 * @param A input array
	 *   square A elements
	 */
	public void square1(int[] A){
		for(int i=0;i<A.length;i++)
			A[i]=A[i]*A[i];
	}
	
	/**
	 * 
	 * @param A input array
	 * @return new array with all elements of A squared
	 */
	public int[] square2(int[] A){
		int[] squared = new  int[A.length];
		for(int i=0;i<A.length;i++)
			squared[i]=A[i]*A[i];
		return squared;
	}
		
	/**
	 * 
	 * @param n
	 * @return: true if n is even,  false otherwise
	 */
	public boolean isEven(int n){
		return (n%2 == 0);
	}



	/**
	 * 
	 * @param source: input array
	 * @param evenDest: result array with even indexed elements of source
	 * @param oddDest: result array with odd indexed elements of source
	 * 
	 * evenDest.length = oddDest.length or oddDest.length + 1
	 * 
	 * evenDest.length+oddDest.length = source.length 
	 */
	
	
	
	
	
	
	
	
	
	public void unshuffle(int[] source, int[] evenDest, int[] oddDest){
		int k = source.length;
		int noOdds = oddDest.length;
		// put noOdds pairs in their place
		for(int i=0; i<noOdds; i++){
			evenDest[i] = source[2*i];
			oddDest[i] = source[2*i+1];
		}
		if(!isEven(k)) // if k odd there is one more element
			evenDest[noOdds] = source[k-1];
	}

	/**
	 * 
	 * @param n
	 * pre: n>0
	 * @return: true if n is prime,  false otherwise
	 * How does it work?
	 */
	public boolean isPrime(int n){
		if (n==2 || n==3) 
			return true;
		// How does it work?
		//   Why going only to sqrt(n)?
		
		if (n%2==0 || n%3==0) 
			return false;
		
		
		
		else 
	      // Why start testing at 5?
		  for(int i=5; i<= Math.sqrt(n); i++)
	      	if((n%i)==0) return false;
		  
		

		
		
		  //   Why test only with odd numbers
		  //for(int i=5; i<= Math.sqrt(n); i+=2)
		  //	if((n%i)==0) return false;  
		
		
		
		
		
 	      //   Why test only with (6*i-1) and (6*i+1)?
		  //for(int i=1; (6*i-1) <= Math.sqrt(n); i++)
		  //	if(n%(6*i-1)==0 || n%(6*i+1)==0) return false;
		return true;
	}

	/**
	 * 
	 * @param n: bound
	 * pre: n>=0
	 * post: all ordered pairs (i,j)
	 *       i in 0..(n-1), j in 0 .. (n-1)
	 *       printed one per line
	 *       in lexicographical order
	 * format: open-parenthesis i comma j close-parenthesis
	 * eg n=2:
	 * (0,0)
	 * (0,1)
	 * (1,0)
	 * (1,1)      
	 */
	public void printOrderedPairs(int n){
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.println("("+i+","+j+")");
			}
		}

	}

	/**
	 * 
	 * @param n: bound
	 * pre: n>=0
	 * post: all subsets size 2 {i,j} printed ONCE
	 *       i in 0..(n-1), j in 0..(n-1)
	 *       notice {i,j} = {j,i}, only one of these is printed
	 *       each subset is printed on one line
	 *       in lexicographical order
	 *       format: open-brace i comma j close-brace
	 * eg n=2:
	 * {0,1}
	 */
	public void printSubsets(int n){
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++)
				System.out.println("{"+i+","+j+"}");
		}
	}


    /**
     * 
     * @param args program inputs
     * exercise cmd line; stdin; file IO
     */
	public void doIO(String[] args ){

		// first: "command line arguments" living in args
		String name, color;
		int age;
		double gpa;
		Scanner StIn = new Scanner(System.in); 


		// IO 1
		
		name = args[0];
		 
		age  = Integer.parseInt(args[1]);
		gpa  = Double.parseDouble(args[2]);
		System.out.println("Hello, my name is " + name);
		System.out.println("my age is " + age);
		System.out.println("my GPA is " + gpa);

		
		
		// IO 2
		// now from Standard Input, eg the Eclipse console
		System.out.println("What is your name? ");
		name = StIn.next();		
		System.out.println("What is your favorite color? ");
		color = StIn.next();
		System.out.println("Your name is " + name + 
				" and your favorite color is " + color);
		System.out.println("What is the answer to the Universe?");
		int answer = StIn.nextInt();
		System.out.println("The answer is " + answer);
        
		
		//  IO3
		System.out.println("What is the input file name? ");

		//file Input
		String fName = StIn.next();
		try {
			Scanner scan = new Scanner(new File(fName));
			int sum = 0;
			int num;
			// echo file name
			System.out.println("reading from file: "  +  fName);
			// loop through numbers in input file and sum them
			while ( scan.hasNextInt()){
				num = scan.nextInt();
				System.out.print(" " + num );
				sum = sum + num;
			}	
			System.out.println("\n sum: " + sum);
		} catch(IOException E){
			System.out.println(fName + " not found, movin' on");
		}
		
	}

    /**
     * exercise Java scope
     */
	public void doScope(){
		// int i;
		final int k = 7;  // constant k for array, problem sizes
        // k=k+1;
		int[] kNumbers = new int[k]; 

		// assign values to array elements
		for(int i=0;i<k;i++){
			kNumbers[i] = i;
			// scope
		    // for (int i=3;i<3;i++){}
		}
  
		// scope; from where to where?
	    // System.out.println("say what?" + i);
		int i = k;
		
		System.out.print("kNumbers (k = " +i+ "): "); 
		// most likely NOT what we want:
		//System.out.println(kNumbers);
		
		// what we want:
	   //System.out.println(Arrays.toString(kNumbers));
		
	}
	
	/**
	 * Exercise primitive and array parameter passing
	 */
	public void doParams(){
		int v=10;
		int[] A = {2,4,6,8,10};
        
		System.out.println("v before call incrInt(v): " + v);
		incrInt(v);
		System.out.println("v after call incrInt(v): " + v);
        
		
		System.out.println(
				"A before incrArrayEl(A,3):");
		System.out.println(Arrays.toString(A));
		incrArrayEl(A,3);
		System.out.println(
				"A after incrArrayEl(A,3): ");
		System.out.println(Arrays.toString(A));
	    
	    /*
		reverse(A);
	    
		System.out.println("A after reverse:");	
		System.out.println(Arrays.toString(A));
		  
		
	    
		System.out.println("A before square1:");
		System.out.println(Arrays.toString(A));
		square1(A);
		System.out.println("A after square1:");
		System.out.println(Arrays.toString(A));
		
		/*
		int[] AA = square2(A);
		System.out.println("A after square2:");
		System.out.println(Arrays.toString(A));
		System.out.println("AA after square2:");
		System.out.println(Arrays.toString(AA));
		*/
	}

	/**
	 * 
	 * @param k  array size
	 * Exercise array indexing
	 * Unshuffle an array into two arrays:
	 *     array of odd indexed values
	 *     array of even indexed values
	 */
	public void doUnshuffle(int k){
		int[] kNumbers = new int[k];

		for(int i=0;i<k;i++){
			// just put some numbers in kNumbers
			kNumbers[i] = (int)(Math.random() * k);
		}

		System.out.println("kNumbers:");
		System.out.println(Arrays.toString(kNumbers));

		
		
		if (isEven(k)) 
			System.out.println("size of kNumbers k: " +k+ " is even");
		else 
			System.out.println("size of kNumbers k: " +k+ " is odd");		
		
		// NOW UNSHUFFLE kNumbers
		// do it, do it
	
		
		final int noOdds = k/2;
		final int noEvens = (isEven(k) ? noOdds : noOdds+1); // cond expression 
		                    // or (k+1)/2 rounding up
		
		
		System.out.println("0.."+ (k-1) + " has " + noOdds 
				+ " odds and " + noEvens + " evens"); 

		int[] Evens = new int[noEvens];
		int[] Odds = new int[noOdds];

		unshuffle(kNumbers, Evens, Odds);

		System.out.print("Even INDEXED kNumbers elements: "); 
		System.out.println(Arrays.toString(Evens));

		System.out.print("Odd INDEXED kNumbers elements: "); 
		System.out.println(Arrays.toString(Odds));
        
	}

    /**
     * 
     * @param k array size
     * 
     * Create a 2D array
     */
	public void do2D(int k){
		// create a two D array
		int[][]twoD = new int[k][];   // What is twoD's shape now?
		for(int i=0;i<k;i++){
			int rowI[] = new int[i+1];
			for(int j=0;j<=i;j++){
				rowI[j]=j;
			}
			twoD[i]=rowI;             // What is twoD's shape now?
			System.out.println("twoD[i] at i = "+i+ ": " + Arrays.toString(twoD[i]));
		}
		// What is twoD's shape now?
	}
	
	/**
	 * 
	 * @param n problem size
	 * 
	 * Compare size 2 tuples to size 2 subsets
	 */
	public void doTuplesVsSubsets(int n){
		System.out.println("\nOrdered Pairs (Cartesian product)");
		printOrderedPairs(n);

		System.out.println("\nSubsets (No equal elements)");
		printSubsets(n);

	}
	
	/**
	 * 
	 * @param k problem size
	 * 
	 * Print first k primes
	 */
	public void doPrimes(int k){
		int pCand = 2; // prime candidate 
		int i=1;       // counts the number of primes so far
		System.out.println("\nFirst " +k+ " primes: ");
 		while(i<=k){  // Why not for (i=0; i<k;i++)  ?
			if(isPrime(pCand)){
				// what does this do?
				if(i%15==0)
					System.out.printf("%5d\n", pCand);
				else
					System.out.printf("%5d", pCand);
				i++;
			}
			pCand++;
		}

	}
	/**
	 * @param args: Program cmd line args: name age GPA 
	 */
	public static void main(String[] args) {
		// recap cs160 java 
		Recap r = new Recap(); 
		
		// IO examples
	   // r.doIO(args);

		// Scope examples
		//r.doScope();

		// Primitive params vs Array params
		r.doParams();

		// Array index manipulation
	    // r.doUnshuffle(15);

		// 2D array
		// r.do2D(7);
		
		// Primes
		// r.doPrimes(45);
		
		// Tuples vs subsets
		//r.doTuplesVsSubsets(3);
		
		System.out.println("That's all folks");
	}

}
