public class Motorcycle extends Vehicle {
	
	private int cost;
	
	public Motorcycle(int cost){
		super(2, true);
		this.cost = cost;
		
	}

	public int getCost() {
		return cost;
	}



	public void setCost(int cost) {
		this.cost = cost;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int costOfMaint(int miles) {
		return (cost * miles +10);
	}

	@Override
	public boolean updateNumWheels(int numWheels) {
		if(numWheels == 2 || numWheels == 3){
			setNumWheels(numWheels);
			return true;
		}
		return false;
	}

}
