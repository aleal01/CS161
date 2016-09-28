public class Semi extends Vehicle {
	
	private int cost;
	
	
	public Semi(int cost) {
		super(18,true);
		this.cost = cost;
		// TODO Auto-generated constructor stub
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
	public boolean updateNumWheels(int numWheels) {
		if(numWheels == 10){
			setNumWheels(numWheels);
			return true;
		}if(numWheels == 18){
			setNumWheels(numWheels);
			return true;
		}else{
			setNumWheels(18);
			setLicenseRequired(true);
			return false;
		}
	}
	public static void main(String[] args) {
		

	}
}
