
public class Account {
	
	protected String id;
	protected double balance;
	
	public Account(String id, double initialBalance){
		this.id = id;
		this.balance = initialBalance;
	}
	
	public void withdraw(double amount) throws Exception{	
		balance -= amount;
	}
	public void deposit(double amount) throws Exception{
		balance += amount;
	}
	
	public String getID(){
		return id;
		
	}
	
	public double getBalance(){
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
