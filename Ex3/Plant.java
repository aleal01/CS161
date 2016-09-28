public class Plant {

    protected String name;
    protected double latitude;
    protected double longitude;
    
    public Plant(String name, double latitude, double longitude) {
	setName(name);
	setLatitude(latitude);
	setLongitude(longitude);
    }

    public String getName() {
	return name;
    }

    public void setName(String n) {
	name = n;
    }

    public double getLatitude() {
	return latitude;
    }

    public void setLatitude(double d) {
	latitude = d;
    }

    public double getLongitude() {
	return longitude;
    }

    public void setLongitude(double d) {
	longitude = d;
    }

    @Override
    public boolean equals(Object other) {
	if (this == other)
	    return true;
	if (! (other instanceof Plant))
	    return false;
	Plant otherPlant = (Plant) other;
	return this.getName().equals(otherPlant.getName());
    }

    @Override
    public String toString() {
	return "Plant(\"" + getName() + "\"," + getLatitude() + "," + getLongitude() +")";
    }

    public static void main(String[] args) {
	Plant a = new Plant("Common Name", 10.0, 11.0);
	System.out.println("Should be Plant(\"Common Name\",10.0,11.0):   "+ a);

	a.setLatitude(20);
	a.setLongitude(-20);
	a.setName("Uncommon name");
	System.out.println("Should be Plant(\"Uncommon name\",20.0,-20.0):   "+ a);

	Plant b = new Plant("Uncommon name", 100.0, 200.0);
	System.out.println("equals test. Should be true:   " + b.equals(a));
	
	b.setName("Other name");
	System.out.println("equals test. Should be false:   " + b.equals(a));
	
    }
    
}
