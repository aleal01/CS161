public class CheckingAccount extends Account{
	int numberOfChecksUsed = 0;
	int checkwithdrawamt = 0;
	
	public CheckingAccount(String id, double initialBalance) throws Exception {
		super(id, initialBalance);
		
		if(getBalance() < 0){
			throw new Exception("Negative balance");
		}	// TODO Auto-generated constructor stub
	}
	
	public int numberOfChecksUsed(){
		return numberOfChecksUsed;
		
	}
	
	public void resetChecksUsed(){
		 numberOfChecksUsed= 0;
	}
	
	
	
	// When you with draw it withdraws one extra dollar from the account
	
	public void withdrawUsingCheck(double amount) throws Exception{
		numberOfChecksUsed++;
		if(numberOfChecksUsed > 3){
			balance -= 3 - amount;
		}
		if(balance - amount < -10){
			throw new Exception("Insufficient funds (-10)");
		}
		balance-= amount;
	}
	@Override
	public void withdraw(double amount) throws Exception{
		
		if(balance - amount < 0){
			throw new Exception("Insufficient balance (0)");
		}
		balance = balance - 1 - amount;
	}
	@Override
	public void deposit(double amount) throws Exception{
		if(balance + amount - 1 < 0){
			throw new Exception("Insufficient balance (0)");
		}
		balance = balance - 1 + amount;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
}
