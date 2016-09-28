public class Shrub extends Plant {

    protected String genus;
    protected boolean berries;
    
    public Shrub(String name, double latitude, double longitude, String genus, boolean berries) {
	super(name,latitude,longitude);
	setGenus(genus);
	setBerries(berries);
    }

    public void setGenus(String g) {
	genus = g;
    }

    public String getGenus() {
	return genus;
    }

    public void setBerries(boolean b) {
	berries = b;
    }

    public boolean getBerries() {
	return berries;
    }

    @Override
    public boolean equals(Object other) {
	if (this == other)
	    return true;
	if (! (other instanceof Shrub))
	    return false;
	Shrub otherShrub = (Shrub) other;
	return this.getName().equals(otherShrub.getName()) &&
	    this.getGenus().equals(otherShrub.getGenus());
    }

    @Override
    public String toString() {
	return "Shrub(\"" + getGenus() + "\",\"" + getName() + "\"," + getLatitude() + "," + getLongitude() +")";
    }

    public static void main(String[] args) {
	Shrub a = new Shrub("Apple",10.0,-12.0,"Applacia",true);
	System.out.println("Should be Shrub(\"Applacia\",\"Apple\",10.0,-12,0):   " + a);

	a.setGenus("Delicioso");
	System.out.println("Should be Shrub(\"Delicioso\",\"Apple\",10.0,-12,0):   " + a);
	
	Shrub b = new Shrub("Apple",30,33,"Delicioso",false);
	System.out.println("equals test. Should be true:   " + b.equals(a));

	b.setGenus("Yumm");
	System.out.println("equals test. Should be false:   " + b.equals(a));

	System.out.println("berries test. Should be false.  " + b.getBerries());
	
    }

}
