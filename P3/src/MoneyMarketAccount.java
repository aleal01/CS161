public class MoneyMarketAccount extends Account{

	public MoneyMarketAccount(String id, double initialBalance) throws Exception{
		super(id, initialBalance);
		if(initialBalance < 10000){
			throw new Exception("Insufficient starting balance");
		}
	}
	private int numberOfTransactions = 0;
	
	public double addInterest(double rate){
		double newBal = 0;
		newBal = ((balance*rate)/100);
		balance += newBal;
		return newBal;
		
	}
	
	
	public void resetNumberOfTransactions(){
		numberOfTransactions = 0;
	}
	@Override
	public void withdraw(double amount) throws Exception{
		
		if(balance > 10000){
			numberOfTransactions++;
		}
		if(balance < 10000){
			throw new Exception("Insufficients starting balance");
		}
		if((balance > 10000) && (numberOfTransactions > 6)){
			throw new Exception("Exceeding allowed transactions (6)");
		}
		
		
		balance -= amount;
		
		if(balance < 10000){
			balance -= amount - 100;
		}
	}
	@Override
	public void deposit(double amount) throws Exception{
		if(balance > 10000){
			numberOfTransactions++;
		}
		if(balance < 10000){
			throw new Exception("Insufficient starting balance");
		}
		if((balance > 10000) && (numberOfTransactions > 6)){
			throw new Exception("Exceeding allowed transactions (6)");
		}
		
		balance += amount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
