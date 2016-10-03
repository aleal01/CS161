public class Motorcycle extends Vehicle {
	
	private int cost;
	
	public Motorcycle(int numWheels, boolean licenseRequired) {
		super(numWheels, licenseRequired);
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateNumWheels(int numWheels) {
		// TODO Auto-generated method stub
		return false;
	}

}
