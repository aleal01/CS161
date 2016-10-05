
public class Semi extends Vehicle {

	


	private int cost;
	
	public Semi(int cost){
		super(2, true);
		this.cost = cost;
		
	}
	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public int costOfMaint(int miles) {
		return (cost * miles + 100);
	}


	@Override
	public boolean updateNumWheels(int numWheels) {
		if(numWheels == 10 || numWheels == 18){
			setNumWheels(numWheels);
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
