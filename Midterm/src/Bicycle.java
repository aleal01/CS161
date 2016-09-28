
public class Bicycle extends Vehicle{
	
	private int cost;
	
	public Bicycle(int cost){
		super(2,false);
		this.cost = cost;
	}
	
	public int getCost(){
		//finish method
		return cost;
	}
	
	public void setCost(int cost) {
		//Finish this method
		this.cost = cost;
	}
	
	
	

	@Override
	public int costOfMaint(int miles) {
		return cost * miles;
	}

	@Override
	/*
	 * Precondition: none
	 * Postcondition: if return is false, no change to vehicle number of wheels
	 * Postcondition: if return is true, vehicle number of wheels updated
	 * Postcondition: return value set based on algorithm appropriate to type of vehicle
	 */
	
	public boolean updateNumWheels(int numWheels) {
		if(numWheels == 1 || numWheels == 2){
			setNumWheels(numWheels);
			return true;
		} else{
			setNumWheels(2);
			setLicenseRequired(false);
			return false;
		}
	}
	public static void main(String[] args) {
		
	}
}
