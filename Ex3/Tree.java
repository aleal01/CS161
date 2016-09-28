public class Tree extends Plant {

    protected String genus;

    public Tree(String name, double latitude, double longitude, String genus) {
	super(name,latitude,longitude);
	setGenus(genus);
    }

    public void setGenus(String g) {
	genus = g;
    }

    public String getGenus() {
	return genus;
    }

    @Override
    public boolean equals(Object other) {
	if (this == other)
	    return true;
	if (! (other instanceof Tree))
	    return false;
	Tree otherTree = (Tree) other;
	return this.getName().equals(otherTree.getName()) &&
	    this.getGenus().equals(otherTree.getGenus());
    }

    @Override
    public String toString() {
	return "Tree(\"" + getGenus() + "\",\"" + getName() + "\"," + getLatitude() + "," + getLongitude() +")";
    }

    public static void main(String[] args) {
	Tree a = new Tree("Apple",10.0,-12.0,"Applacia");
	System.out.println("Should be Tree(\"Applacia\",\"Apple\",10.0,-12,0):   " + a);

	a.setGenus("Delicioso");
	System.out.println("Should be Tree(\"Delicioso\",\"Apple\",10.0,-12,0):   " + a);
	
	Tree b = new Tree("Apple",30,33,"Delicioso");
	System.out.println("equals test. Should be true:   " + b.equals(a));

	b.setGenus("Yumm");
	System.out.println("equals test. Should be false:   " + b.equals(a));
    }

}
