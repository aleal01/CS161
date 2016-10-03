
public abstract class Vehicle {
	
	private int numWheels;
	private boolean licenseRequired;
	
	public Vehicle (int numWheels, boolean licenseRequired) {
		this.numWheels = numWheels;
		this.licenseRequired = licenseRequired;
	}

	protected int getNumWheels () {
		return numWheels;
	}
	protected void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	protected boolean getLicenseRequired() {
		return licenseRequired;
	}
	protected void setLicenseRequired(boolean licenseRequired) {
		//finish method
		this.licenseRequired = licenseRequired;
	}
	
	public abstract int costOfMaint (int miles);
	/*
	 * Precondition: miles > 0
	 * Postcodition: return value set using algorithm appropriate to type of vehicle
	 */
	public abstract boolean updateNumWheels(int numWheels);
	/*
	 * Precondition: none
	 * Postcondition: if return is false, no change to vehicle number of wheels
	 * Postcondition: if return is true, vehicle number of wheels updated
	 * Postcondition: return value set based on algorithm appropriate to type of vehicle
	 */
	}