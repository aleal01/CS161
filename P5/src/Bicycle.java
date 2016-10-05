
public class Bicycle extends Vehicle {
	
	private int cost;

	public Bicycle(int cost){
		super(2,false);
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
		// TODO Auto-generated method stub
		return cost * miles;
	}

	@Override
	public boolean updateNumWheels(int numWheels) {
		if(numWheels == 1 || numWheels ==2){
			setNumWheels(numWheels);
			return true;
		}
		return false;
	}
	
	
	

}
