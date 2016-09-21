public class SavingsAccount extends Account {

	public SavingsAccount(String id, double initialBalance) throws Exception {
		super(id, initialBalance);
		if(initialBalance < 10){
				throw new Exception("Insufficient starting balance");
		}
	}
	public double addInterest(double rate){
		double newBal = 0;
		newBal = ((balance*rate)/100);
		balance += newBal;
		return newBal;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
