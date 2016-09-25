import java.util.Scanner;



public class Fibo {

	 public long[] memo;	
	
 	 // pre: n>0
	 long fastFibo(int n){
		 if(n<2) return n;
		 if (memo[n]==0)
			 memo[n] = fastFibo(n-1)+fastFibo(n-2);
		 return memo[n];
	 }
	
	
	 
	 
	 
	 
	 
	 /**
	  * 
	  * @param n  >= 0
	  * @return   Fibonacci(n)
	  */
	 long fibo(int n){
		 if (n<2) 
			 return n;
		 else
			 return fibo(n-1)+fibo(n-2);
	 }
	
	 
	 
	 
	 
     long fibIndent(int n, int level){
		// pre: n>=0
		// post: return Fibonacci(n)
    	indent(level);
		System.out.println("Fib(" +n+ ")");
		if(n<2) {
			indent(level);
			System.out.println("return " + n);
			return n;
		}
		else {
			long ret = fibIndent(n-1, level+1) + fibIndent(n-2, level+1);
			indent(level);
			System.out.println("return " + ret);
			return  ret;
		}
	}
	
	
	private void indent(int level) {
		// TODO Auto-generated method stub
		for(int i=0;i<level;i++)
			System.out.print("    ");
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ask user for n, compute Fibonacci 0 to n, 
		// stop when n<=0
		// char c = 'm';
		//if (Character.isLetter(c)) System.out.println("ok");

		
		Scanner Input = new Scanner(System.in);
		Fibo f = new Fibo();  
		int n;
		long fibo5 = f.fibIndent(5,0);
		System.out.println("Fibonacci indented(3) = " + fibo5 );
		
//		do{
//		 System.out.println("Enter n>0  (<=0 to finish)");
//	 	 n = Input.nextInt();
////		  
////		  if(n>0)
////			 for(int  i=1; i<=n; i++){
////			   if(i<5)   
////			      System.out.println("Fibonacci indented(" +i+ ") = " + f.fibIndent(i,0));
////			   
////			   f.memo = new long[n+1];
////			   System.out.println("Fast Fibonacci(" +i+ ") = " + f.fastFibo(i));
////			   System.out.print("Fibonacci(" +i+ ") = "); 
//			   System.out.println(f.fibo(i));
//			 }
//		} while (n>0);
//		
//		System.out.println("bye Fibo");
	}

}

