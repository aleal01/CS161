public class Car extends Vehicle {
	private int cost;
	
	public Car(int cost){
		super(4, true);
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
		return (cost * miles + 25);
	}

	@Override
	public boolean updateNumWheels(int numWheels) {
		if((numWheels ==4)|| (numWheels == 6)){
			setNumWheels(numWheels);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		}
		

	}
